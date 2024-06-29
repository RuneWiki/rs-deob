import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class259 extends class238 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
    public static int[] field3704 = new int[32];

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Z")
    public static boolean field3703 = false;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
    public static boolean field3705 = false;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Llc;")
    public static class435 field3701 = new class435(42, 6);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1720(int arg0) {
        field3704 = null;
        if (arg0 < -56) {
            field3701 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIZII)V")
    public static final void method1721(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3702++;
        if (class565.field8185 == null) {
            class211.field3164.method3263((byte) -109, arg0, arg5, arg4, arg2, -16777216);
        } else if (class108.field1536.field3923 >= 0 && class108.field1536.field3923 < class184.field2546 * 512 && class108.field1536.field3916 >= 0 && class240.field3555 * 512 > class108.field1536.field3916) {
            class444.field6347++;
            if (class108.field1536 != null && class108.field1536.field3923 - ((class108.field1536.method2053(true) - 1) * 256) >> 9 == class545.field7931 && class108.field1536.field3916 - ((class108.field1536.method2053(true) - 1) * 256) >> 9 == class455.field6488) {
                class545.field7931 = -1;
                class455.field6488 = -1;
                class499.method3034(-3561);
            }
            class410.method2486((byte) -113);
            if (!arg3) {
                class479.method2891(arg1 ^ 0xFFFFBADF);
            }
            class699.method3928((byte) -13);
            class377.method2340(arg2, arg4, arg0, arg5, true, 91);
            int var6 = class91.field1290;
            int var7 = class438.field6258;
            int var8 = class17.field170;
            int var9 = class647.field9331;
            class680.field9660 = class680.field9669;
            if (class165.field2351 == 1) {
                int var10 = (int) class112.field1584;
                if (var10 < (class328.field4449 >> 8)) {
                    var10 = class328.field4449 >> 8;
                }
                if (class157.field2258[4] && class690.field9785[4] + 128 > var10) {
                    var10 = class690.field9785[4] + 128;
                }
                int var11 = (int) class680.field9668 + class157.field2255 & 0x3FFF;
                class89.method693(class537.field7811, var11, (var10 >> 3) * 3 + 600 << 2, (byte) -39, class530.method3211(class108.field1536.field3916, 2, class108.field1536.field3923, class687.field9758) - 200, var7, var10, class646.field9302);
            } else if (class165.field2351 == 4) {
                int var12 = (int) class112.field1584;
                if (var12 < (class328.field4449 >> 8)) {
                    var12 = class328.field4449 >> 8;
                }
                if (class157.field2258[4] && var12 < class690.field9785[4] + 128) {
                    var12 = class690.field9785[4] + 128;
                }
                int var13 = (int) class680.field9668 & 0x3FFF;
                class89.method693(class537.field7811, var13, (var12 >> 3) * 3 + 600 << 2, (byte) -39, class530.method3211(class658.field9426, arg1 + 17750, class472.field6697, class687.field9758) - 200, var7, var12, class646.field9302);
            } else if (class165.field2351 == 5) {
                class98.method739(112, var7);
            }
            int var14 = class518.field7473;
            int var15 = class564.field8174;
            int var16 = class123.field1698;
            int var17 = class279.field3904;
            int var18 = class179.field2487;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class157.field2258[var19]) {
                    int var22 = (int) (Math.random() * (double) (class372.field5404[var19] * 2 + 1) + Math.sin((double) class669.field9542[var19] / 100.0D * (double) class408.field5805[var19]) * (double) class690.field9785[var19] - (double) class372.field5404[var19]);
                    if (var19 == 4) {
                        class279.field3904 += var22;
                        if (class279.field3904 < 1024) {
                            class279.field3904 = 1024;
                        } else if (class279.field3904 > 3072) {
                            class279.field3904 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class518.field7473 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class564.field8174 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class123.field1698 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class179.field2487 = class179.field2487 + var22 & 0x3FFF;
                    }
                }
            }
            if (class518.field7473 < 0) {
                class518.field7473 = 0;
            }
            if (((class439.field6264 << 9) - 1) < class518.field7473) {
                class518.field7473 = (class439.field6264 << 9) - 1;
            }
            if (class123.field1698 < 0) {
                class123.field1698 = 0;
            }
            if (class123.field1698 > (class408.field5806 << 9) - 1) {
                class123.field1698 = (class408.field5806 << 9) - 1;
            }
            class142.method1001(35633);
            class32.method168(-4897);
            class211.field3164.method297(var6, var8, var6 + var9, var7 + var8);
            class451.method2763(arg1 ^ 0x4526, true);
            if (class416.field5919) {
                class661.method3770(9, class311.field4224);
                if (class680.field9660 != class219.field3266) {
                    class235.field3518 = true;
                }
                class219.field3266 = class680.field9660;
            } else {
                class211.field3164.method1235();
                int var20 = class311.field4224;
                if (class728.field10226 == null) {
                    class211.field3164.method1240(var20);
                } else {
                    class728.field10226.method3377(class279.field3904, var6, class740.field10335 << 3, var7, -3, var9, class179.field2487, var20, class211.field3164, var8);
                }
            }
            class569.method3387(arg1 ^ arg1);
            class182.field2510.method854(class518.field7473, class564.field8174, class123.field1698, -class279.field3904 & 0x3FFF, -class179.field2487 & 0x3FFF, -class487.field7021 & 0x3FFF);
            class211.field3164.method364(class182.field2510);
            class211.field3164.method398(var9 / 2 + var6, var8 - -(var7 / 2), class375.field5423 << 1, class375.field5423 << 1);
            class181.method1282(class375.field5423 << 1, 35, class375.field5423 << 1, var6 + (var9 / 2), var7 / 2 + var8);
            class630.method3622(-class179.field2487 & 0x3FFF, class564.field8174, class518.field7473, -class487.field7021 & 0x3FFF, -class279.field3904 & 0x3FFF, (byte) -76, class123.field1698);
            byte var21 = class243.field3580.field7986.method185(false) == 2 ? (byte) class444.field6347 : 1;
            if (class416.field5919) {
                class423.method2599(10833, -class179.field2487 & 0x3FFF, -class487.field7021 & 0x3FFF, -class279.field3904 & 0x3FFF);
                class644.method3715(class108.field1536.field3923 >> 9, class192.field2820, class703.field9918, class243.field3580.field8006.method2850(false) == 0, arg1 + 17636, class726.field10208, class403.field5757, true, class651.field9345, var21, class108.field1536.field3920 + 1, class564.field8174, class680.field9660, class738.field10308, class123.field1698, class721.field10155, class108.field1536.field3916 >> 9, class518.field7473);
            } else {
                class115.method818(class703.field9918, class518.field7473, class564.field8174, class123.field1698, class651.field9345, class192.field2820, class403.field5757, class721.field10155, class726.field10208, class738.field10308, class108.field1536.field3920 + 1, var21, class108.field1536.field3923 >> 9, class108.field1536.field3916 >> 9, class243.field3580.field8006.method2850(false) == 0, true, class100.field1447 ? class680.field9660 : -1, 0, false);
            }
            class569.method3387(0);
            if (class369.field5392 == 10) {
                class503.method3081(256, var9, var7, var6, 256, -16068, var8);
                class544.method3271(arg1 ^ 0xFFFFBAE3, 256, var8, var7, var6, 256, var9);
                class537.method3241(256, 256, var8, var7, (byte) -33, var6, var9);
                class212.method1498(var6, var9, 2, var8, var7);
            }
            class156.method1116();
            class564.field8174 = var15;
            class279.field3904 = var17;
            class123.field1698 = var16;
            class518.field7473 = var14;
            class179.field2487 = var18;
            if (class655.field9386 && class488.field7032.method3872((byte) -92) == 0) {
                class655.field9386 = false;
            }
            if (class655.field9386) {
                class211.field3164.method3263((byte) -115, var6, var7, var9, var8, -16777216);
                class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, false, class608.field8632.method3543(-24350, class45.field748));
            }
            class451.method2763(-100, false);
        } else {
            class211.field3164.method3263((byte) -98, arg0, arg5, arg4, arg2, -16777216);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        class411.field5865++;
        field3706++;
        if (arg0 == 19581) {
            class88 var1 = class448.method2741((byte) 85, class215.field3223, class583.field8319);
            var1.field1260.method2862(class732.field10259, -1166933656);
            class523.method3183(var1, (byte) 31);
        }
    }
}
