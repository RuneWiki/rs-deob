import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class132 extends class416 {

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "Leg;")
    public class109 field2153;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2151 = Calendar.getInstance();

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2152 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "[I")
    public static int[] field2149;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field2151 = null;
        field2149 = null;
        if (arg0 != -28431) {
            field2152 = null;
        }
        field2152 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZIIII)V")
    public static final void method1027(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2150++;
        if (class660.field8718 == null) {
            class341.field4807.method489(arg5, 108, arg4, arg0, arg2, -16777216);
        } else if (class472.field6475.field3505 >= 0 && class472.field6475.field3505 < (class719.field10004 * 512) && class472.field6475.field3502 >= 0 && class472.field6475.field3502 < class107.field1453 * 512) {
            class405.field5645++;
            if (class472.field6475 != null && (class472.field6475.field3505 + 256 - class472.field6475.method2256(-1) * 256 >> 9) == class359.field5044 && (class472.field6475.field3502 + 256 - (class472.field6475.method2256(-1) * 256) >> 9) == class102.field1421) {
                class359.field5044 = -1;
                class102.field1421 = -1;
                class140.method1075(false);
            }
            class409.method2390(false);
            if (!arg1) {
                class56.method375(0);
            }
            class400.method2356(96);
            class710.method3989(arg5, arg0, arg4, arg2, true, (byte) -72);
            int var6 = class274.field3807;
            int var7 = class622.field8289;
            int var8 = class298.field4234;
            int var9 = class420.field5783;
            class100.field1358 = class100.field1299;
            if (class278.field3898 == 1) {
                int var12 = (int) class578.field7586;
                if ((class167.field2585 >> 8) > var12) {
                    var12 = class167.field2585 >> 8;
                }
                if (class555.field7298[4] && var12 < class468.field6425[4] + 128) {
                    var12 = class468.field6425[4] + 128;
                }
                int var13 = (int) class547.field7230 + class262.field3656 & 0x3FFF;
                class584.method3189(true, class116.field1879, var12, class425.field5854, var6, (var12 >> 3) * 3 + 600 << 2, class153.method1118(class472.field6475.field3502, class472.field6475.field3505, -29, class507.field6775) - 200, var13);
            } else if (class278.field3898 == 4) {
                int var10 = (int) class578.field7586;
                if ((class167.field2585 >> 8) > var10) {
                    var10 = class167.field2585 >> 8;
                }
                if (class555.field7298[4] && class468.field6425[4] + 128 > var10) {
                    var10 = class468.field6425[4] + 128;
                }
                int var11 = (int) class547.field7230 & 0x3FFF;
                class584.method3189(true, class116.field1879, var10, class425.field5854, var6, (var10 >> 3) * 3 + 600 << 2, class153.method1118(class248.field3439, class513.field6808, 11, class507.field6775) - 200, var11);
            } else if (class278.field3898 == 5) {
                class303.method1853(var6, -128);
            }
            int var14 = class694.field9662;
            int var15 = class222.field3162;
            int var16 = class314.field4488;
            int var17 = class332.field4729;
            int var18 = class372.field5175;
            if (arg3 > -65) {
                method1027(6, true, 92, 1, 108, -46);
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (class555.field7298[var19]) {
                    int var22 = (int) (Math.random() * (double) (class433.field5964[var19] * 2 + 1) + Math.sin((double) class462.field6359[var19] / 100.0D * (double) class114.field1867[var19]) * (double) class468.field6425[var19] - (double) class433.field5964[var19]);
                    if (var19 == 1) {
                        class222.field3162 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class314.field4488 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class694.field9662 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class372.field5175 = class372.field5175 + var22 & 0x3FFF;
                    }
                    if (var19 == 4) {
                        class332.field4729 += var22;
                        if (class332.field4729 < 1024) {
                            class332.field4729 = 1024;
                        } else if (class332.field4729 > 3072) {
                            class332.field4729 = 3072;
                        }
                    }
                }
            }
            if (class694.field9662 < 0) {
                class694.field9662 = 0;
            }
            if (class314.field4488 < 0) {
                class314.field4488 = 0;
            }
            if (class694.field9662 > ((class735.field10163 << 9) - 1)) {
                class694.field9662 = (class735.field10163 << 9) - 1;
            }
            if (class314.field4488 > ((class143.field2290 << 9) - 1)) {
                class314.field4488 = (class143.field2290 << 9) - 1;
            }
            class327.method1978((byte) 112);
            class464.method2629(-99);
            class341.field4807.method419(var9, var7, var9 + var8, var6 + var7);
            class394.method2328(true, (byte) 103);
            if (class24.field412) {
                class412.method2404(false, class326.field4662);
                if (class328.field4691 != class100.field1358) {
                    class302.field4291 = true;
                }
                class328.field4691 = class100.field1358;
            } else {
                class341.field4807.method454();
                int var20 = class326.field4662;
                if (class749.field10430 == null) {
                    class341.field4807.method392(var20);
                } else {
                    class749.field10430.method3767(var20, var9, class142.field2269 << 3, class341.field4807, class372.field5175, (byte) -121, class332.field4729, var6, var7, var8);
                }
            }
            class651.method3552(-25926);
            class512.field6795.method1715(class694.field9662, class222.field3162, class314.field4488, -class332.field4729 & 0x3FFF, -class372.field5175 & 0x3FFF, -class22.field400 & 0x3FFF);
            class341.field4807.method481(class512.field6795);
            class341.field4807.method445(var9 + (var8 / 2), var7 - -(var6 / 2), class43.field564 << 1, class43.field564 << 1);
            class721.method4058((byte) 41, var6 / 2 + var7, class43.field564 << 1, var9 + (var8 / 2), class43.field564 << 1);
            class609.method3321(-class372.field5175 & 0x3FFF, -class332.field4729 & 0x3FFF, 1, class222.field3162, -class22.field400 & 0x3FFF, class694.field9662, class314.field4488);
            byte var21 = class411.field5711.field3888.method1289(true) == 2 ? (byte) class405.field5645 : 1;
            if (class24.field412) {
                class92.method691(true, -class372.field5175 & 0x3FFF, -class332.field4729 & 0x3FFF, -class22.field400 & 0x3FFF);
                class640.method3506(class472.field6475.field3508 + 1, class419.field5774, class564.field7411, class411.field5711.field3869.method1406(true) == 0, true, var21, class472.field6475.field3505 >> 9, class472.field6475.field3502 >> 9, class727.field10098, class227.field3232, class222.field3162, class29.field474, 0, class314.field4488, class756.field10508, class694.field9662, class100.field1358, class77.field943);
            } else {
                class749.method4189(class29.field474, class694.field9662, class222.field3162, class314.field4488, class77.field943, class419.field5774, class727.field10098, class756.field10508, class564.field7411, class227.field3232, class472.field6475.field3508 + 1, var21, class472.field6475.field3505 >> 9, class472.field6475.field3502 >> 9, class411.field5711.field3869.method1406(true) == 0, true, class540.field7159 ? class100.field1358 : -1, 0, false);
            }
            class651.method3552(-25926);
            if (class15.field215 == 10) {
                class35.method293(256, 768, var6, var8, var9, 256, var7);
                class320.method1943(true, var8, var9, var6, 256, var7, 256);
                class318.method1929(var6, 256, var9, var7, var8, -61, 256);
                class70.method573(-3267, var7, var6, var9, var8);
            }
            class604.method3290();
            class314.field4488 = var16;
            class694.field9662 = var14;
            class372.field5175 = var18;
            class332.field4729 = var17;
            class222.field3162 = var15;
            if (class229.field3264 && class448.field6137.method2091(0) == 0) {
                class229.field3264 = false;
            }
            if (class229.field3264) {
                class341.field4807.method489(var8, 11, var6, var7, var9, -16777216);
                class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, false, class517.field6852.method2877(class713.field9854, (byte) -108));
            }
            class394.method2328(false, (byte) 121);
        } else {
            class341.field4807.method489(arg5, 29, arg4, arg0, arg2, -16777216);
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Leg;)V")
    public class132(class109 arg0) {
        this.field2153 = arg0;
    }
}
