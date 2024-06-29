import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class84 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1092 = null;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[[I")
    public static int[][] field1101 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lnk;")
    public static class16 field1090;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
    public static int[] field1093;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
    public static int[] field1098;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 22)
    public static void method537(int arg0) {
        field1101 = (int[][]) null;
        field1098 = null;
        field1090 = null;
        field1093 = null;
        field1092 = null;
        if (arg0 != 1) {
            method537(19);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V", line = 45)
    public static final void method538(long arg0, int arg1) {
        if (class120.field1667 == 1 || class120.field1667 == 5) {
            class163.method1174(arg0, false);
        } else if (class120.field1667 == 2) {
            class85.method542((byte) -106);
        } else {
            class143.method1034((byte) 107);
        }
        field1094++;
        if (!class38.field437) {
            class29.field342[0] = class99.field1341;
            class304.field4734[0] = class161.field2479;
            class105.field1442[0] = 1009;
            if (class302.field4708 != 0) {
                class190.field2851 = class327.field5237;
                class344.field5450 = class78.field1026;
            } else if (class251.field3982 == 0) {
                class344.field5450 = class197.field3009;
                class190.field2851 = class128.field1873;
            } else {
                class190.field2851 = class19.field223;
                class344.field5450 = class301.field4694;
            }
            class222.field3357[0] = "";
            class74.field924 = 1;
        }
        class141.method979((long) class102.field1381);
        if (class345.field5482 != -1) {
            class273.method1966(class345.field5482, (byte) 119);
        }
        if (arg1 < 2) {
            return;
        }
        for (int var3 = 0; var3 < class63.field765; var3++) {
            if (class302.field4702[var3]) {
                class135.field2012[var3] = true;
            }
            class93.field1212[var3] = class302.field4702[var3];
            class302.field4702[var3] = false;
        }
        class60.field703 = -1;
        class222.field3358 = null;
        if (class272.field4317) {
            class19.field232 = true;
        }
        class54.field623 = null;
        class242.field3759 = class102.field1381;
        class149.field2367 = -1;
        if (class345.field5482 != -1) {
            class63.field765 = 0;
            class281.method2035((byte) 116);
        }
        if (class272.field4317) {
            class239.method1656();
        } else {
            class343.method2379();
        }
        class128.method877((byte) 120);
        if (class38.field437) {
            if (class161.field2481) {
                class262.method1860(true);
            } else {
                class105.method685(-128);
            }
        } else if (class222.field3358 != null) {
            class16.method117(class222.field3358, 75, class349.field5571, class291.field4581);
        } else if (class60.field703 != -1) {
            class16.method117((class323) null, 89, class149.field2367, class60.field703);
        }
        int var4 = class38.field437 ? -1 : class29.method211(32);
        if (var4 == -1) {
            var4 = class101.field1375;
        }
        class267.method1878(var4, -16140);
        if (class162.field2495 == 1) {
            class162.field2495 = 2;
        }
        if (class292.field4605 == 1) {
            class292.field4605 = 2;
        }
        if (class92.field1208 == 3) {
            for (int var5 = 0; var5 < class63.field765; var5++) {
                if (class93.field1212[var5]) {
                    if (class272.field4317) {
                        class239.method1652(class213.field3239[var5], class116.field1612[var5], class280.field4417[var5], class71.field891[var5], 16711935, 128);
                    } else {
                        class343.method2364(class213.field3239[var5], class116.field1612[var5], class280.field4417[var5], class71.field891[var5], 16711935, 128);
                    }
                } else if (class135.field2012[var5]) {
                    if (class272.field4317) {
                        class239.method1652(class213.field3239[var5], class116.field1612[var5], class280.field4417[var5], class71.field891[var5], 16711680, 128);
                    } else {
                        class343.method2364(class213.field3239[var5], class116.field1612[var5], class280.field4417[var5], class71.field891[var5], 16711680, 128);
                    }
                }
            }
        }
        class255.method1802(11889, class11.field113.field3767, class266.field4193, class219.field3290, class11.field113.field3763);
        class266.field4193 = 0;
    }
}
