import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class412 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6129 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lwl;")
    public static class452 field6127 = new class452(97, -2);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lnn;")
    public static class151 field6131 = new class151("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[C")
    public static char[] field6132 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
    public static float field6130;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method2578(int arg0) {
        field6132 = null;
        field6131 = null;
        if (arg0 != 1578027969) {
            method2578(-18);
        }
        field6127 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public static final void method2579(int arg0, int arg1, int arg2) {
        field6128++;
        if ((class223.field3385 > class223.field3388)) {
            class223.field3388 = (float) ((double) class223.field3388 / 30.0D + (double) class223.field3388);
            if (class223.field3385 < class223.field3388) {
                class223.field3388 = class223.field3385;
            }
            class353.method2116(false);
            class223.field3387 = (int) class223.field3388 >> 1;
            class223.field3384 = class388.method2396(true, class223.field3387);
        } else if (class223.field3385 < class223.field3388) {
            class223.field3388 = (float) ((double) class223.field3388 - (double) class223.field3388 / 30.0D);
            if (class223.field3388 < class223.field3385) {
                class223.field3388 = class223.field3385;
            }
            class353.method2116(false);
            class223.field3387 = (int) class223.field3388 >> 1;
            class223.field3384 = class388.method2396(true, class223.field3387);
        }
        if (class191.field2843 != arg2 && class318.field4811 != -1) {
            int var3 = class191.field2843 - class295.field4480;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class318.field4811 - class217.field3305;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class295.field4480 += var3;
            class217.field3305 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class318.field4811 = -1;
                class191.field2843 = -1;
            }
            class353.method2116(false);
        }
        if (class354.field5228 <= 0) {
            class327.field4919 = -1;
            class71.field911 = -1;
        } else {
            class426.field6263--;
            if (class426.field6263 == 0) {
                class426.field6263 = 100;
                class354.field5228--;
            }
        }
        if (!class230.field3516 || class298.field4502 == null) {
            return;
        }
        for (class245 var5 = (class245) class298.field4502.method2514((byte) 61); var5 != null; var5 = (class245) class298.field4502.method2511(31)) {
            class228 var6 = class20.method125(var5.field3669.field3437, 36);
            if (class462.field6819 == 0 && var5.method1501(58, arg1, arg0)) {
                if (var6.field3467 != null) {
                    if (var6.field3467[4] != null) {
                        class371.method2234(0, 1001, var6.field3487, false, var6.field3467[4], (byte) -65, var6.field3470, -1, (long) var5.field3669.field3437, true);
                    }
                    if (var6.field3467[3] != null) {
                        class371.method2234(0, 1008, var6.field3487, false, var6.field3467[3], (byte) -65, var6.field3470, -1, (long) var5.field3669.field3437, true);
                    }
                    if (var6.field3467[2] != null) {
                        class371.method2234(0, 1012, var6.field3487, false, var6.field3467[2], (byte) -65, var6.field3470, -1, (long) var5.field3669.field3437, true);
                    }
                    if (var6.field3467[1] != null) {
                        class371.method2234(0, 1011, var6.field3487, false, var6.field3467[1], (byte) -65, var6.field3470, -1, (long) var5.field3669.field3437, true);
                    }
                    if (var6.field3467[0] != null) {
                        class371.method2234(0, 1007, var6.field3487, false, var6.field3467[0], (byte) -65, var6.field3470, -1, (long) var5.field3669.field3437, true);
                    }
                }
                if (!var5.field3669.field3436) {
                    var5.field3669.field3436 = true;
                    class384.method2312(class1.field25, var5.field3669.field3437, var6.field3487);
                }
                if (var5.field3669.field3436) {
                    class384.method2312(class324.field4869, var5.field3669.field3437, var6.field3487);
                }
            } else if (var5.field3669.field3436) {
                var5.field3669.field3436 = false;
                class384.method2312(class245.field3680, var5.field3669.field3437, var6.field3487);
            }
        }
    }
}
