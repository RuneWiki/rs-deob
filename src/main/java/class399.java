import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class399 extends class325 {

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "B")
    public byte field5694 = 5;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
    public static boolean field5700 = false;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public int field5701;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Lnq;")
    public static class268 field5693;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field5695;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method2513(int arg0, boolean arg1) {
        if (arg0 != 127) {
            method2513(31, true);
        }
        field5690++;
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (arg1) {
            var4 = class446.field6257;
            var3 = 1;
        } else {
            var3 = 4;
            var4 = class247.field3495;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class285.method1860(arg0 ^ 0x73);
            for (int var6 = 0; var6 < class211.field2954 >> 3; var6++) {
                for (int var7 = 0; var7 < (class290.field4061 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class210.field2941[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x30CB70D) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFA) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class155.field2191.length; var15++) {
                                if (class155.field2191[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class207.method1345(class426.field5999, var7 * 8, var6 * 8, class64.field949, var12, var10, arg1, var5, var11, var13, var4[var15], (byte) 29);
                                    var8 = true;
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class66.method510(var7 * 8, 8, 11091, var5, var6 * 8, 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class338.field4650 = null;
        } else {
            class338.field4650 = class345.method2185(var2[0], var2[2], 0, var2[3], var2[1]);
            class403.field5719 = var2[4];
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 112)
    public static void method2514(boolean arg0) {
        field5695 = null;
        field5693 = null;
        if (!arg0) {
            field5693 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)I", line = 126)
    public static final int method2515(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5699++;
        if (class375.field5354 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg5 >> 7;
            if (arg3 < 0 || arg0 < 0 || (class211.field2954 - 1) < arg3 || (class290.field4061 - 1) < arg0) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class211.field2954 - 1 < var6 || class290.field4061 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class368.field5193[1][arg1 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class368.field5193[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var10 = (class368.field5193[1][var6][arg5 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class368.field5193[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var11 = (class368.field5193[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class368.field5193[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class368.field5193[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        if (!arg4) {
            method2513(87, true);
        }
        return class375.field5354[arg2].method725(arg1, arg5);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V", line = 187)
    public static final void method2516(boolean arg0) {
        field5692++;
        class131 var1 = class99.field1373;
        synchronized (class99.field1373) {
            class99.field1373.method900(0);
        }
        if (arg0) {
            field5695 = null;
        }
    }
}
