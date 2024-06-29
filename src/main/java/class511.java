import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class511 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field7590 = 0;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
    public static boolean field7594 = false;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static final void method3043(int arg0) {
        field7593++;
        for (int var1 = 0; var1 < class209.field2966; var1++) {
            int var2 = class35.field578[var1];
            class194 var3 = class151.field2174[var2];
            int var4 = class486.field7134.method618((byte) 100);
            if ((var4 & 0x4) != 0) {
                var4 += class486.field7134.method618((byte) 100) << 8;
            }
            if ((var4 & 0x800) != 0) {
                var3.field5241 = class486.field7134.method633(87);
                var3.field5267 = class486.field7134.method620(arg0 ^ 0xFFFFFB97);
                var3.field5299 = class486.field7134.method633(101);
                var3.field5252 = (byte) class486.field7134.method618((byte) 100);
                var3.field5250 = class405.field6116 + class486.field7134.method631(10494);
                var3.field5297 = class405.field6116 + class486.field7134.method610(1312572200);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field2768.method2129(arg0 ^ 0xFFFF95BF)) {
                    class394.method2423(var3, -44);
                }
                var3.method1364(class410.field6175.method1216(class486.field7134.method631(10494), false), 107);
                var3.method2180(var3.field2768.field5083, (byte) 0);
                var3.field5245 = var3.field2768.field5099 << 3;
                if (var3.field2768.method2129(5035)) {
                    class242.method1617(var3, var3.field5339[0], (byte) -101, var3.field5344[0], null, 0, null, var3.field2210);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class486.field7134.method598(false);
                int var6 = class486.field7134.method636(-2);
                var3.method2182(var5, 0, var6, class405.field6116);
                var3.field5303 = class405.field6116 + 300;
                var3.field5268 = class486.field7134.method618((byte) 100);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field2747 = class486.field7134.method606((byte) -55);
                var3.field2752 = class486.field7134.method634(115);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field5315 = class486.field7134.method620(32131);
                var3.field5331 = class486.field7134.method630(30814);
                var3.field5262 = class486.field7134.method620(32131);
                var3.field5270 = class486.field7134.method619((byte) -23);
                var3.field5285 = class486.field7134.method610(1312572200) + class405.field6116;
                var3.field5264 = class486.field7134.method634(arg0 + 31334) + class405.field6116;
                var3.field5298 = class486.field7134.method608(false);
                var3.field5338 = 0;
                var3.field5331 += var3.field5344[0];
                var3.field5315 += var3.field5339[0];
                var3.field5262 += var3.field5339[0];
                var3.field5343 = 1;
                var3.field5270 += var3.field5344[0];
            }
            if ((var4 & 0x40) != 0) {
                var3.field5327 = class486.field7134.method621(arg0 ^ 0x870D2D73);
                var3.field5318 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var7 = class486.field7134.method610(1312572200);
                int var8 = class486.field7134.method640(-96);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var9 = class486.field7134.method608(false);
                var3.method2176(var8, var9, var7, false, 0);
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class486.field7134.method598(false);
                int var11 = class486.field7134.method618((byte) 100);
                var3.method2182(var10, arg0 ^ 0xFFFF8614, var11, class405.field6116);
            }
            if ((var4 & 0x1) != 0) {
                int var12 = class486.field7134.method610(arg0 + 1312603412);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class486.field7134.method583(false);
                class138.method919(var13, -105, var3, var12);
            }
            if ((var4 & 0x200) != 0) {
                int var14 = class486.field7134.method634(arg0 ^ 0xFFFF8662);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class486.field7134.method591((byte) 94);
                int var16 = class486.field7134.method636(arg0 + 31210);
                var3.method2176(var15, var16, var14, true, 0);
            }
            if ((var4 & 0x400) != 0) {
                int var17 = class486.field7134.method634(86);
                var3.field5271 = class486.field7134.method636(arg0 ^ 0x79EA);
                var3.field5324 = class486.field7134.method636(-2);
                var3.field5275 = var17 & 0x7FFF;
                var3.field5274 = (var17 & 0x8000) != 0;
                var3.field5283 = class405.field6116 + var3.field5271 + var3.field5275;
            }
            if ((var4 & 0x100) != 0) {
                int var18 = class486.field7134.method618((byte) 100);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class486.field7134.method610(arg0 + 1312603412);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class486.field7134.method583(false);
                    var21[var22] = class486.field7134.method610(1312572200);
                }
                class197.method1379(var20, (byte) -49, var21, var3, var19);
            }
            if ((var4 & 0x8) != 0) {
                var3.field5257 = class486.field7134.method610(1312572200);
                if (var3.field5257 == 65535) {
                    var3.field5257 = -1;
                }
            }
        }
        if (arg0 != -31212) {
            method3043(71);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static final void method3044(byte arg0) {
        field7592++;
        if (class469.field6854 != 3) {
            class12.field195 = -1;
        }
        if (arg0 <= 30) {
            method3046(-114);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3045(int arg0, byte arg1, int arg2) {
        field7591++;
        if (arg1 != 42) {
            method3046(-35);
        }
        return false;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public static final void method3046(int arg0) {
        field7595++;
        class396.field6016.method937(arg0);
        class169.field2459.method937(arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)V")
    public static final void method3047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7596++;
        if (arg5 != -2510) {
            method3045(-127, (byte) -103, 41);
        }
        int var6 = class278.method1758(class158.field2302, class410.field6176, arg4, 90);
        int var7 = class278.method1758(class158.field2302, class410.field6176, arg2, 56);
        int var8 = class278.method1758(class443.field6591, class396.field6021, arg1, -118);
        int var9 = class278.method1758(class443.field6591, class396.field6021, arg3, 75);
        for (int var10 = var6; var10 <= var7; var10++) {
            class271.method1736(var9, arg0, var8, arg5 ^ 0x9C7, class23.field356[var10]);
        }
    }
}
