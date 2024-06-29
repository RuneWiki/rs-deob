import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class120 extends class121 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[[[I")
    public static int[][][] field1757;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZC)Z")
    public static final boolean method820(boolean arg0, char arg1) {
        if (arg0) {
            field1757 = null;
        }
        field1758++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1754++;
        int var9 = arg2 - arg5;
        int var10 = (arg3 - arg1 << 16) / var9;
        int var11 = 106 % ((arg7 - 34) / 59);
        int var12 = arg0 - arg8;
        int var13 = (arg6 - arg4 << 16) / var12;
        class210.method1342(arg2, arg1, var13, 1268787088, arg0, arg5, 0, arg4, arg8, 0, var10);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V")
    public static final void method822(byte[] arg0, int arg1) {
        field1759++;
        class114 var2 = new class114(arg0);
        var2.field1673 = arg0.length - 2;
        class160.field2321 = var2.method756(-29901);
        class141.field2039 = new boolean[class160.field2321];
        class246.field3682 = new int[class160.field2321];
        class152.field2199 = new byte[class160.field2321][];
        class91.field1386 = new int[class160.field2321];
        class282.field4500 = new int[class160.field2321];
        class263.field3965 = new byte[class160.field2321][];
        class211.field3035 = new int[class160.field2321];
        var2.field1673 = arg0.length - (class160.field2321 * 8) - 7;
        class68.field1056 = var2.method756(-29901);
        class141.field2041 = var2.method756(arg1 - 10639);
        int var3 = (var2.method760(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class160.field2321; var4++) {
            class91.field1386[var4] = var2.method756(-29901);
        }
        for (int var5 = 0; var5 < class160.field2321; var5++) {
            class211.field3035[var5] = var2.method756(-29901);
        }
        if (arg1 != -19262) {
            field1757 = null;
        }
        for (int var6 = 0; var6 < class160.field2321; var6++) {
            class246.field3682[var6] = var2.method756(-29901);
        }
        for (int var7 = 0; var7 < class160.field2321; var7++) {
            class282.field4500[var7] = var2.method756(arg1 - 10639);
        }
        var2.field1673 = arg0.length - (class160.field2321 * 8) - (var3 * 3 - 3) - 7;
        class128.field1883 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class128.field1883[var8] = var2.method779(16711680);
            if (class128.field1883[var8] == 0) {
                class128.field1883[var8] = 1;
            }
        }
        var2.field1673 = 0;
        for (int var9 = 0; var9 < class160.field2321; var9++) {
            int var10 = class246.field3682[var9];
            boolean var11 = false;
            int var12 = class282.field4500[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            class263.field3965[var9] = var14;
            byte[] var15 = new byte[var13];
            class152.field2199[var9] = var15;
            int var16 = var2.method760(false);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var13; var17++) {
                    var14[var17] = var2.method741(3083);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        byte var19 = var15[var18] = var2.method741(3083);
                        var11 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var12; var22++) {
                                byte var23 = var15[var10 * var22 + var21] = var2.method741(3083);
                                var11 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var12; var24++) {
                        var14[var20 + (var10 * var24)] = var2.method741(3083);
                    }
                    var20++;
                }
            }
            class141.field2039[var9] = var11;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lha;B)Lha;")
    public static final class267 method823(class267 arg0, byte arg1) {
        field1756++;
        class267 var2 = client.method1430(arg0);
        if (var2 == null) {
            var2 = arg0.field4028;
        }
        if (arg1 != 13) {
            method825(8, -94, 73);
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static void method824(byte arg0) {
        if (arg0 < 72) {
            field1757 = null;
        }
        field1757 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    public static final void method825(int arg0, int arg1, int arg2) {
        field1755++;
        if (arg1 >= -6) {
            method824((byte) -17);
        }
        class43.field616[arg0] = arg2;
        class71 var3 = (class71) class51.field749.method1218((long) arg0, 127);
        if (var3 == null) {
            class71 var4 = new class71(4611686018427387905L);
            class51.field749.method1215(var4, -119, (long) arg0);
        } else if (var3.field1103 != 4611686018427387905L) {
            var3.field1103 = class287.method1928(27332) + 500L | 0x4000000000000000L;
        }
    }
}
