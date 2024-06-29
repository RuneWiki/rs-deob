import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class115 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lub;")
    public static class92 field1764;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lub;")
    public static class92 field1765;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfh;I)V")
    public static final void method847(class136 arg0, int arg1) {
        field1763++;
        int var2 = -64 / ((arg1 - 58) / 40);
        class80 var3 = (class80) class193.field3023.method2043(class170.method1223(true, arg0.field2064), -1);
        if (var3 == null) {
            return;
        }
        if (var3.field1220 != null) {
            class83.field1251.method243(var3.field1220);
            var3.field1220 = null;
        }
        var3.method995((byte) 78);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method848(byte arg0) {
        if (arg0 != -20) {
            field1764 = null;
        }
        field1765 = null;
        field1764 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    public static final void method849(int arg0, boolean arg1) {
        field1762++;
        byte var2 = 4;
        if (arg0 != -1553281597) {
            method847((class136) null, -78);
        }
        byte[][] var3 = class268.field4248;
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class102.method778(arg0 + 1553272051);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class203.field3133[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = (var8 & 0x32AEBBC) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var8 & 0xFFFAE8) >> 14;
                            int var12 = var8 >> 1 & 0x3;
                            int var13 = var8 >> 3 & 0x7FF;
                            int var14 = (var11 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class174.field2691.length; var15++) {
                                if (class174.field2691[var15] == var14 && var3[var15] != null) {
                                    var9 = true;
                                    int[] var16 = class108.method813(var6 * 8, arg1, class80.field1236, var12, var13, var10, var7 * 8, var3[var15], var5, var11, true);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class78.method616(var5, 8, true, var7 * 8, 8, var6 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class307.field4928 = -1;
            return;
        }
        class37.field637 = var4[3];
        class37.field636 = var4[4];
        class50.field814 = var4[1];
        class307.field4928 = var4[0];
        class297.field4793 = var4[2];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBIII)I")
    public static final int method850(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 115) {
            field1766 = 56;
        }
        int var7 = arg5 & 0x3;
        field1761++;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 - (arg0 + arg1 - 7);
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return arg1;
        }
    }
}
