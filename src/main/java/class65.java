import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class65 extends class88 {

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
    public int[] field1257 = new int[1];

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
    public int[] field1261 = new int[] { -1 };

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
    public static boolean field1254 = false;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lhj;")
    public static class69 field1255 = class181.method1318("leuchten1:", (byte) -117);

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field1259 = -1;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "[[[B")
    public static byte[][][] field1260;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V")
    public static final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -57 % ((20 - arg3) / 35);
        field1256++;
        int var7 = class240.method1700(class166.field3075, arg4, -28, class19.field252);
        int var8 = class240.method1700(class166.field3075, arg5, 126, class19.field252);
        int var9 = class240.method1700(class35.field485, arg1, -96, class201.field3629);
        int var10 = class240.method1700(class35.field485, arg2, 124, class201.field3629);
        for (int var11 = var7; var11 <= var8; var11++) {
            class99.method740(arg0, class186.field3402[var11], -1162793114, var10, var9);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLhj;)Lne;")
    public static final class49 method422(byte arg0, class69 arg1) {
        field1250++;
        if (arg0 > -59) {
            field1255 = null;
        }
        for (class49 var2 = (class49) class258.field4619.method1724(255); var2 != null; var2 = (class49) class258.field4619.method1726(118)) {
            if (var2.field712.method444((byte) -24, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method423(int arg0, int arg1) {
        field1258++;
        return arg1 == -21748 ? (arg0 & 0x3FE28) >> 11 : -85;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method424(int arg0) {
        field1255 = null;
        field1260 = null;
        if (arg0 != 27160) {
            method421(40, 24, -101, -116, 16, -98);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[Lah;IIII[BBZII)V")
    public static final void method425(int arg0, class263[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte arg7, boolean arg8, int arg9, int arg10) {
        field1251++;
        if (arg7 != -104) {
            return;
        }
        class128 var11 = new class128(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method931((byte) 3);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method907(-96);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method937(false);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg10 == var18 && var17 >= arg3 && (arg3 + 8) > var17 && var16 >= arg0 && arg0 + 8 > var16) {
                    class12 var22 = class145.method1102(var12, 0);
                    int var23 = class50.method289(var21, var16 & 0x7, var17 & 0x7, var22.field127, arg2, var22.field153, -81) + arg9;
                    int var24 = arg5 + class134.method1003(var17 & 0x7, arg2, var21, var16 & 0x7, 115, var22.field153, var22.field127);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class263 var25 = null;
                        if (!arg8) {
                            int var26 = arg4;
                            if ((class19.field246[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class45.method258(var24, var20, var12, 8315, !arg8, arg8, arg2 + var21 & 0x3, arg4, arg4, var25, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V")
    public static final void method426(int arg0, byte arg1, int arg2) {
        field1253++;
        class135 var3 = class8.method38((byte) 112, 7, arg2);
        var3.method1011((byte) 122);
        var3.field2539 = arg0;
        int var4 = -120 % ((-arg1 - 58) / 39);
    }
}
