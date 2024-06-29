import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class198 extends class456 {

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    private int field3179 = 0;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "Lke;")
    private class427 field3183 = new class427();

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "Z")
    public static boolean field3186 = false;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "Lbj;")
    public static class162 field3194 = new class162(53, -1);

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "Lo;")
    public static class24 field3195;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "[I")
    public static int[] field3177;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILak;)V")
    public final void method1339(int arg0, class234 arg1) {
        ++field3188;
        super.field6769[super.field6767] = 20;
        super.field6772[super.field6767] = arg1;
        if (arg0 != -7763) {
            method1340(-113, true, -48, 47, 66, -49);
        }
        ++super.field6767;
        if (~super.field6767 <= -5001) {
            super.field6767 = 0;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZIIII)V")
    public static final void method1340(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class387.field5662 != null && (~arg3 != -4 || ~class186.field2990.field2565 != ~arg4 || class186.field2990.field2528 != arg2)) {
            class308.method1969(class497.field7305, class387.field5662, 1603251406);
            class387.field5662 = null;
        }
        ++field3185;
        if (arg3 == 3 && class387.field5662 == null) {
            class387.field5662 = class129.method1010(arg2, class497.field7305, 0, true, arg4, 0);
            if (class387.field5662 != null) {
                class186.field2990.field2565 = arg4;
                class186.field2990.field2528 = arg2;
                class186.field2990.method1787((byte) 124, class497.field7305);
            }
        }
        if (~arg3 == -4 && class387.field5662 == null) {
            method1340(14333, true, -1, class186.field2990.field2536, -1, arg5);
        } else {
            Container var6;
            if (class387.field5662 == null) {
                if (class97.field1889 == null) {
                    var6 = class497.field7305.field7072;
                    class322.field4917 = var6.getSize().width;
                    class456.field6771 = var6.getSize().height;
                } else {
                    Insets var7 = class97.field1889.getInsets();
                    class322.field4917 = class97.field1889.getSize().width - var7.right - var7.left;
                    int var10001 = var7.top + var7.bottom;
                    class456.field6771 = class97.field1889.getSize().height - var10001;
                    var6 = class97.field1889;
                }
            } else {
                class322.field4917 = arg4;
                class456.field6771 = arg2;
                var6 = class387.field5662;
            }
            if (arg3 != 1) {
                if (class370.field5418 < 96 && ~class133.field2236 == -1) {
                    int var8 = ~class322.field4917 >= -1025 ? class322.field4917 : 1024;
                    int var9 = class456.field6771 > 768 ? 768 : class456.field6771;
                    class376.field5503 = (class322.field4917 - var8) / 2;
                    class71.field1415 = var8;
                    class75.field1536 = 0;
                    class65.field1330 = var9;
                } else {
                    class75.field1536 = 0;
                    class376.field5503 = 0;
                    class71.field1415 = class322.field4917;
                    class65.field1330 = class456.field6771;
                }
            } else {
                class376.field5503 = (-class327.field4958 + class322.field4917) / 2;
                class65.field1330 = class458.field6802;
                class75.field1536 = 0;
                class71.field1415 = class327.field4958;
            }
            if (class9.field137 != class522.field7582) {
                boolean var10000;
                if (~class71.field1415 > -1025 && ~class65.field1330 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg1) {
                class486.method2914((byte) 104);
            } else {
                class262.field4007.setSize(class71.field1415, class65.field1330);
                class262.field4006.method318(class262.field4007);
                if (class97.field1889 == var6) {
                    Insets var10 = class97.field1889.getInsets();
                    class262.field4007.setLocation(class376.field5503 + var10.left, var10.top - -class75.field1536);
                } else {
                    class262.field4007.setLocation(class376.field5503, class75.field1536);
                }
            }
            if (~arg3 > -3) {
                class259.field3963 = false;
            } else {
                class259.field3963 = true;
            }
            if (~class155.field2523 != 0) {
                class505.method3033((byte) 126, true);
            }
            if (arg0 != 14333) {
                field3195 = null;
            }
            if (class216.field3417 != null && class263.method1682(true, class466.field6932)) {
                class387.method2369(0);
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class486.field7167[var11] = true;
            }
            class370.field5436 = true;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V")
    public final void method1341(byte arg0, int arg1) {
        ++field3181;
        if (arg0 == -27) {
            super.field6769[super.field6767] = (byte) arg1;
            ++super.field6767;
            if (~super.field6767 <= -5001) {
                super.field6767 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1342(String arg0, int arg1) throws ClassNotFoundException {
        ++field3184;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = -3 / ((-12 - arg1) / 57);
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lak;I)V")
    public final void method1343(class234 arg0, int arg1) {
        --super.field6763;
        ++field3190;
        if (super.field6763 < 0) {
            super.field6763 = 4999;
        }
        super.field6769[super.field6763] = 21;
        super.field6772[super.field6763] = arg0;
        if (arg1 != 1) {
            this.method1341((byte) -42, -30);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLak;)V")
    public final void method1344(byte arg0, class234 arg1) {
        super.field6769[super.field6767] = 21;
        ++field3178;
        super.field6772[super.field6767] = arg1;
        ++super.field6767;
        if (arg0 >= -32) {
            field3192 = 114;
        }
        if (~super.field6767 <= -5001) {
            super.field6767 = 0;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method1345(int arg0) {
        while (super.field6767 != super.field6763) {
            this.method1348((byte) 90);
        }
        ++field3191;
        if (arg0 != -696) {
            field3192 = 7;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(FIZLya;I)V")
    public final void method1346(float arg0, int arg1, boolean arg2, class38 arg3, int arg4) {
        ++field3193;
        super.field6769[super.field6767] = (byte) (arg2 ? arg4 + 40 : arg4 + 30);
        if (arg1 != 5000) {
            this.method1349(-62);
        }
        super.field6772[super.field6767] = arg3;
        super.field6765[super.field6767] = arg0;
        ++super.field6767;
        if (~super.field6767 <= -5001) {
            super.field6767 = 0;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
    public final void method1347(int arg0, int arg1) {
        if (arg0 <= 86) {
            this.field3183 = null;
        }
        ++field3182;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    private final void method1348(byte arg0) {
        int var2 = 38 / ((arg0 - -68) / 36);
        ++field3189;
        int var3 = super.field6763++;
        if (super.field6763 >= 5000) {
            super.field6763 = 0;
        }
        this.field3179 = super.field6769[var3];
        Object var4 = super.field6772[var3];
        super.field6772[var3] = null;
        if (this.field3179 == 21) {
            class222.method1482(this.field3183, (class234) var4);
        } else if (this.field3179 != 20) {
            if (~this.field3179 <= -31 && ~this.field3179 >= -34) {
                class34.field522.method385(3000.0F, super.field6765[var3] * 1.5F);
                ((class38) var4).method176(class107.field1974, class199.field3222, class97.field1894, class38.field559, ~(this.field3179 - 30) == -1);
            } else if (this.field3179 >= 40 && this.field3179 <= 43) {
                class34.field522.method385(3000.0F, super.field6765[var3] * 1.5F);
                ((class38) var4).method176(class107.field1974, class199.field3222, class97.field1894, class486.field7158, this.field3179 + -40 == 0);
            } else if (this.field3179 != 22) {
                if (this.field3179 != 23) {
                    if (~this.field3179 == -25) {
                        class34.field522.method372(0, (class256[]) null);
                        return;
                    }
                } else {
                    class34.field522.method367();
                }
            } else {
                class34.field522.method428(-1, 1583160, 40, 127);
            }
        } else {
            class234 var5 = (class234) var4;
            if (var5.field3610 != null) {
                var5.field3610.method9((byte) -106, class34.field522);
            }
            if (var5.field3613 != null) {
                var5.field3613.method9((byte) -113, class34.field522);
            }
            if (var5.field3605 != null) {
                var5.field3605.method9((byte) -102, class34.field522);
            }
            if (var5.field3602 != null) {
                var5.field3602.method9((byte) -126, class34.field522);
            }
            if (var5.field3619 != null) {
                var5.field3619.method9((byte) -108, class34.field522);
            }
            for (class440 var6 = var5.field3607; var6 != null; var6 = var6.field6528) {
                var6.field6530.method9((byte) -104, class34.field522);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public final void method1349(int arg0) {
        ++field3180;
        if (arg0 != 1) {
            field3194 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLda;)V")
    public static final void method1350(byte arg0, class44 arg1) {
        ++field3187;
        int var2 = -11 / ((30 - arg0) / 52);
        if (class281.field4247 == null) {
            class430 var3 = new class430();
            byte[] var4 = var3.method2589(128, 128, 16, (byte) 4);
            class281.field4247 = class424.method2582(false, var4, 2);
        }
        if (class93.field1851 == null) {
            class276 var5 = new class276();
            byte[] var6 = var5.method1747(16, 128, 128, (byte) -118);
            class93.field1851 = class424.method2582(false, var6, 2);
        }
        class194 var7 = arg1.field808;
        if (var7.method1310((byte) 102) && class390.field5861 == null) {
            byte[] var8 = class15.method104(new class379(419684), -15722, 0.6F, 16.0F, 128, 8, 16, 4.0F, 0.5F, 4.0F, 128);
            class390.field5861 = class424.method2582(false, var8, 2);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1351(boolean arg0) {
        field3194 = null;
        if (arg0) {
            field3194 = null;
        }
        field3177 = null;
        field3195 = null;
    }
}
