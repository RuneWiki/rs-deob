import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class188 {

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field2851 = 0;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2847 = "Loaded config";

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "[S")
    public static short[] field2853 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
    public static int[] field2846 = new int[200];

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2844 = "wave2:";

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
    public static int[] field2852 = new int[200];

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lbf;")
    public static class108 field2849;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lnh;")
    public static class305 field2855;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lom;IIIIIIIZ)V")
    public static final void method1187(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class272.field4343;
        int var11;
        int var12 = var11 = (arg7 << 7) - class107.field1525;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class185.field2812[arg1][arg6][arg7] - class191.field2892;
        int var18 = class185.field2812[arg1][arg6 + 1][arg7] - class191.field2892;
        int var19 = class185.field2812[arg1][arg6 + 1][arg7 + 1] - class191.field2892;
        int var20 = class185.field2812[arg1][arg6][arg7 + 1] - class191.field2892;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class118.field1702;
        int var46 = (var24 << 9) / var25 + class118.field1705;
        int var47 = (var27 << 9) / var31 + class118.field1702;
        int var48 = (var30 << 9) / var31 + class118.field1705;
        int var49 = (var33 << 9) / var37 + class118.field1702;
        int var50 = (var36 << 9) / var37 + class118.field1705;
        int var51 = (var39 << 9) / var43 + class118.field1702;
        int var52 = (var42 << 9) / var43 + class118.field1705;
        class118.field1704 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class108.field1545 && class178.method1130(class295.field4705 + class118.field1702, class89.field1287 + class118.field1705, var50, var52, var48, var49, var51, var47)) {
                class275.field4360 = arg6;
                class249.field3889 = arg7;
            }
            if (!arg8) {
                class118.field1694 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class118.field1703 || var51 > class118.field1703 || var47 > class118.field1703) {
                    class118.field1694 = true;
                }
                if (arg0.field2347 == -1) {
                    if (arg0.field2349 != 12345678) {
                        class118.method753(var50, var52, var48, var49, var51, var47, arg0.field2349, arg0.field2350, arg0.field2346);
                    }
                } else if (!class78.field1087) {
                    int var53 = class118.field1696.method560(arg0.field2347, 65535);
                    class118.method753(var50, var52, var48, var49, var51, var47, class30.method189(var53, arg0.field2349), class30.method189(var53, arg0.field2350), class30.method189(var53, arg0.field2346));
                } else if (arg0.field2348) {
                    class118.method755(var50, var52, var48, var49, var51, var47, arg0.field2349, arg0.field2350, arg0.field2346, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2347);
                } else {
                    class118.method755(var50, var52, var48, var49, var51, var47, arg0.field2349, arg0.field2350, arg0.field2346, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2347);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class108.field1545 && class178.method1130(class295.field4705 + class118.field1702, class89.field1287 + class118.field1705, var46, var48, var52, var45, var47, var51)) {
            class275.field4360 = arg6;
            class249.field3889 = arg7;
        }
        if (arg8) {
            return;
        }
        class118.field1694 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class118.field1703 || var47 > class118.field1703 || var51 > class118.field1703) {
            class118.field1694 = true;
        }
        if (arg0.field2347 != -1) {
            if (class78.field1087) {
                class118.method755(var46, var48, var52, var45, var47, var51, arg0.field2343, arg0.field2346, arg0.field2350, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2347);
                return;
            }
            int var54 = class118.field1696.method560(arg0.field2347, 65535);
            class118.method753(var46, var48, var52, var45, var47, var51, class30.method189(var54, arg0.field2343), class30.method189(var54, arg0.field2346), class30.method189(var54, arg0.field2350));
        } else if (arg0.field2343 != 12345678) {
            class118.method753(var46, var48, var52, var45, var47, var51, arg0.field2343, arg0.field2346, arg0.field2350);
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method1188(boolean arg0, byte arg1, String arg2) {
        byte var3 = 4;
        if (arg1 != -14) {
            method1192(-115, -122, -70, -86);
        }
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        field2854++;
        int var6 = class17.field293.method224(arg2, 250);
        int var7 = class17.field293.method215(arg2, 250) * 13;
        class266.method1730(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
        class266.method1743(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 + var3, 16777215);
        class17.field293.method210(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class166.method1055(var6 + var3 + var3, var3 + var7 + var3, var5 - var3, -var3 + var4, true);
        if (!arg0) {
            class137.method860(var7, var6, var5, (byte) 75, var4);
            return;
        }
        try {
            Graphics var8 = class291.field4645.getGraphics();
            class24.field382.method180(var8, 0, false, 0);
        } catch (Exception var9) {
            class291.field4645.repaint();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILbj;I)V")
    private final void method1189(int arg0, class215 arg1, int arg2) {
        if (arg2 == 5) {
            this.field2851 = arg1.method1379(-99);
        }
        if (arg0 != -26288) {
            field2849 = null;
        }
        field2850++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method1190(byte arg0) {
        field2855 = null;
        field2849 = null;
        field2853 = null;
        field2844 = null;
        field2847 = null;
        field2852 = null;
        if (arg0 >= -74) {
            method1190((byte) -41);
        }
        field2846 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLbj;)V")
    public final void method1191(byte arg0, class215 arg1) {
        field2845++;
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                if (arg0 >= -98) {
                    field2853 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1189(-26288, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)V")
    public static final void method1192(int arg0, int arg1, int arg2, int arg3) {
        class91 var4 = class246.field3856[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class75 var5 = var4.field1329;
        if (var5 != null) {
            var5.field1052 = var5.field1052 * arg3 / 16;
            var5.field1049 = var5.field1049 * arg3 / 16;
        }
    }
}
