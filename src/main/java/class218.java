import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class218 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Z")
    public static volatile boolean field3852 = true;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lid;")
    private static class149 field3853 = class60.method382(" has logged out)3", (byte) 87);

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lid;")
    public static class149 field3849 = field3853;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lid;")
    public static class149 field3856 = class60.method382("cyan:", (byte) 67);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI[Lke;[BIZ)V")
    public static final void method1473(byte arg0, int arg1, class108[] arg2, byte[] arg3, int arg4, boolean arg5) {
        field3848++;
        class74 var6 = new class74(arg3);
        int var7 = -1;
        if (arg0 > -101) {
            return;
        }
        while (true) {
            int var8 = var6.method524((byte) -57);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method512(-98);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFF9) >> 6;
                int var13 = var6.method489((byte) -114);
                int var14 = var9 >> 12;
                int var15 = var13 & 0x3;
                int var16 = var13 >> 2;
                int var17 = arg4 + var11;
                int var18 = arg1 + var12;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class108 var19 = null;
                    if (!arg5) {
                        int var20 = var14;
                        if ((class69.field1215[1][var18][var17] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class85.method634(arg5, var14, var7, var14, var15, var16, var18, var17, !arg5, var19, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1474(int arg0) {
        field3854++;
        if (class197.field3570 == 0) {
            return;
        }
        try {
            if (++class70.field1228 > 2000) {
                if (class164.field3047 != null) {
                    class164.field3047.method1398((byte) 118);
                    class164.field3047 = null;
                }
                if (class210.field3742 >= 1) {
                    class197.field3570 = 0;
                    class207.field3716 = -5;
                    return;
                }
                if (class32.field469 == class184.field3321) {
                    class32.field469 = class169.field3130;
                } else {
                    class32.field469 = class184.field3321;
                }
                class210.field3742++;
                class70.field1228 = 0;
                class197.field3570 = 1;
            }
            if (class197.field3570 == 1) {
                class36.field542 = class272.field4900.method174(class32.field469, false, class44.field673);
                class197.field3570 = 2;
            }
            if (class197.field3570 == 2) {
                if (class36.field542.field3358 == 2) {
                    throw new IOException();
                }
                if (class36.field542.field3358 != 1) {
                    return;
                }
                class164.field3047 = new class205((Socket) class36.field542.field3357, class272.field4900);
                class36.field542 = null;
                class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 103);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                int var1 = class164.field3047.method1397(arg0 + 18945);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                if (var1 != 21) {
                    class207.field3716 = var1;
                    class197.field3570 = 0;
                    class164.field3047.method1398((byte) -31);
                    class164.field3047 = null;
                    return;
                }
                class197.field3570 = 3;
            }
            if (class197.field3570 == 3) {
                if (class164.field3047.method1392(arg0 + 1380) < 1) {
                    return;
                }
                class233.field4105 = new class149[class164.field3047.method1397(17506)];
                class197.field3570 = 4;
            }
            if (arg0 != -1439) {
                field3852 = true;
            }
            if (class197.field3570 == 4 && class164.field3047.method1392(arg0 + 1538) >= (class233.field4105.length * 8)) {
                class11.field150.field1340 = 0;
                class164.field3047.method1395((byte) -115, class11.field150.field1321, 0, class233.field4105.length * 8);
                for (int var2 = 0; var2 < class233.field4105.length; var2++) {
                    class233.field4105[var2] = class258.method1780((byte) -72, class11.field150.method478(-9426));
                }
                class197.field3570 = 0;
                class207.field3716 = 21;
                class164.field3047.method1398((byte) -94);
                class164.field3047 = null;
            }
        } catch (IOException var3) {
            if (class164.field3047 != null) {
                class164.field3047.method1398((byte) -127);
                class164.field3047 = null;
            }
            if (class210.field3742 < 1) {
                class197.field3570 = 1;
                class70.field1228 = 0;
                class210.field3742++;
                if (class32.field469 == class184.field3321) {
                    class32.field469 = class169.field3130;
                } else {
                    class32.field469 = class184.field3321;
                }
            } else {
                class197.field3570 = 0;
                class207.field3716 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3) {
        field3847++;
        class216 var4 = class139.method972(arg2, false, 11);
        if (arg0 != 0) {
            field3856 = null;
        }
        var4.method1459(true);
        var4.field3809 = arg1;
        var4.field3818 = arg3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3856 = null;
        field3849 = null;
        if (arg0 != -71) {
            field3855 = 34;
        }
        field3853 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        field3850++;
        if (!class123.method869(true) && class277.field4948 != class223.field3932) {
            class155.method1100(class277.field4948, class277.field4953, class77.field1449.field2333[0], 0, class141.field2600, class77.field1449.field2400[0], false);
        } else if (arg0 == 0 && class277.field4948 != class157.field2888 && class78.method593(class277.field4948, true)) {
            class157.field2888 = class277.field4948;
            class224.method1505(512);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3846++;
        int var8 = 113 % ((-arg3 - 23) / 57);
        if (arg1 == arg7) {
            class196.method1339(1, arg0, arg5, arg4, arg7, arg2, arg6);
        } else if (class257.field4496 <= (arg0 - arg7) && arg0 + arg7 <= class192.field3449 && arg2 - arg1 >= class224.field3940 && class94.field1655 >= (arg1 + arg2)) {
            class83.method615(arg0, arg7, arg5, arg4, arg6, arg1, arg2, false);
        } else {
            class83.method619(arg2, arg5, arg4, arg0, -23880, arg1, arg6, arg7);
        }
    }
}
