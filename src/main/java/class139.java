import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class139 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[S")
    public static short[] field2277 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[Z")
    public static boolean[] field2276;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lbl;IIB)V")
    public static final void method965(class33 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -58) {
            field2278 = -96;
        }
        if (arg0.field3378 == arg2 && arg2 != -1) {
            class181 var4 = class49.method384(arg2, -94);
            int var5 = var4.field2847;
            if (var5 == 1) {
                arg0.field3312 = 0;
                arg0.field3386 = 0;
                arg0.field3334 = 1;
                arg0.field3406 = arg1;
                arg0.field3354 = 0;
                class132.method934((byte) 112, var4, arg0.field3389, arg0.field3341, arg0.field3386, class167.field2655 == arg0);
            }
            if (var5 == 2) {
                arg0.field3312 = 0;
            }
        } else if (arg2 == -1 || arg0.field3378 == -1 || class49.method384(arg2, 13).field2855 >= class49.method384(arg0.field3378, 72).field2855) {
            arg0.field3312 = 0;
            arg0.field3378 = arg2;
            arg0.field3386 = 0;
            arg0.field3354 = 0;
            arg0.field3334 = 1;
            arg0.field3346 = arg0.field3399;
            arg0.field3406 = arg1;
            if (arg0.field3378 != -1) {
                class132.method934((byte) 112, class49.method384(arg0.field3378, 10), arg0.field3389, arg0.field3341, arg0.field3386, class167.field2655 == arg0);
            }
        }
        field2275++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method966(byte arg0) {
        field2276 = null;
        if (arg0 < 17) {
            field2277 = null;
        }
        field2277 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIIB)V")
    public static final void method967(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2279++;
        class209.field3423++;
        class286.method1922((byte) 56);
        if (arg1) {
            class164.method1127(false, (byte) 85, false, 0);
        } else {
            class263.method1788(0, (byte) 72);
            class164.method1127(true, (byte) 113, false, 0);
            if (class22.field374 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class164.method1127(false, (byte) 76, false, var7);
                    class164.method1127(false, (byte) 42, true, var7);
                    class263.method1788(var7, (byte) 74);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class263.method1788(var6, (byte) 99);
                    class164.method1127(false, (byte) 23, false, var6);
                    class164.method1127(false, (byte) 38, true, var6);
                }
            }
        }
        if (!arg1) {
            class55.method413(3209);
        }
        class176.method1205(60);
        if (class229.field3786 == 1) {
            int var8 = class199.field3186;
            int var9 = class155.field2503 + class122.field1985 & 0x7FF;
            if (var8 < class97.field1594 / 256) {
                var8 = class97.field1594 / 256;
            }
            if (class285.field4514[4] && (class256.field4075[4] + 128) > var8) {
                var8 = class256.field4075[4] + 128;
            }
            class210.method1449(class101.field1667, 0, class225.method1583(class167.field2655.field3341, class167.field2655.field3389, class250.field3980, 0) - 50, var9, var8, arg2, class282.field4472, var8 * 3 + 600);
        }
        int var10 = class54.field925;
        int var11 = class200.field3187;
        int var12 = class17.field301;
        int var13 = class99.field1625;
        int var14 = class202.field3242;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class285.field4514[var15]) {
                int var22 = (int) ((double) (class121.field1967[var15] * 2 + 1) * Math.random() + Math.sin((double) class260.field4137[var15] / 100.0D * (double) class245.field3921[var15]) * (double) class256.field4075[var15] - (double) class121.field1967[var15]);
                if (var15 == 4) {
                    class200.field3187 += var22;
                    if (class200.field3187 < 128) {
                        class200.field3187 = 128;
                    }
                    if (class200.field3187 > 383) {
                        class200.field3187 = 383;
                    }
                }
                if (var15 == 2) {
                    class99.field1625 += var22;
                }
                if (var15 == 0) {
                    class54.field925 += var22;
                }
                if (var15 == 1) {
                    class17.field301 += var22;
                }
                if (var15 == 3) {
                    class202.field3242 = class202.field3242 + var22 & 0x7FF;
                }
            }
        }
        class155.method1077(99);
        class2.method28(arg3, arg0, arg3 + arg4, arg0 + arg2);
        class69.method485();
        if (class199.field3181 || class90.field1487 < arg3 || (arg3 + arg4) <= class90.field1487 || class146.field2339 < arg0 || (arg0 + arg2) <= class146.field2339) {
            class183.field2873 = false;
            class118.field1937 = 0;
        } else {
            class118.field1937 = 0;
            class183.field2873 = true;
            int var16 = class96.field1572;
            int var17 = class199.field3169;
            int var18 = class287.field4543;
            int var19 = class63.field1032;
            class49.field875 = (var16 - var19) * (class146.field2339 - arg0) / arg2 + var19;
            class240.field3886 = (class90.field1487 - arg3) * (var18 - var17) / arg4 + var17;
        }
        int var20 = -114 / ((arg5 + 62) / 63);
        class254.method1730(-117);
        byte var21 = class52.method399(-35) == 2 ? (byte) class209.field3423 : 1;
        class2.method25(arg3, arg0, arg4, arg2, 0);
        class132.method930(class54.field925, class17.field301, class99.field1625, class200.field3187, class202.field3242, class227.field3766, class39.field741, class129.field2083, class5.field67, class29.field471, class32.field501, class250.field3980 + 1, var21, class167.field2655.field3389 >> 7, class167.field2655.field3341 >> 7);
        class254.method1730(-100);
        class274.method1852();
        class113.method828(arg3, arg0, 256, arg4, 0, arg2, 256);
        class6.method49(256, arg3, 256, arg2, arg4, true, arg0);
        ((class273) class69.field1140).method1847(class287.field4533, 124);
        class92.method694(100, arg4, arg2, arg3, arg0);
        class202.field3242 = var14;
        class17.field301 = var12;
        class200.field3187 = var11;
        class99.field1625 = var13;
        class54.field925 = var10;
        if (class179.field2822 && class284.field4486.method1752(0) == 0) {
            class179.field2822 = false;
        }
        if (class179.field2822) {
            class2.method25(arg3, arg0, arg4, arg2, 0);
            class148.method1016(-31620, class1.field30, false);
        }
        if (!arg1 && !class179.field2822 && !class199.field3181 && class90.field1487 >= arg3 && class90.field1487 < (arg3 + arg4) && arg0 <= class146.field2339 && class146.field2339 < (arg0 + arg2)) {
            class177.method1208(false, arg3, arg4, class90.field1487, arg2, class146.field2339, arg0);
        }
    }
}
