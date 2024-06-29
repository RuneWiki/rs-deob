import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class169 extends class87 {

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "[I")
    public static int[] field2560 = new int[2];

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2567 = null;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Lpi;")
    public static class201 field2559 = new class201(64);

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Lpi;")
    public static class201 field2570 = new class201(260);

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Llm;")
    public static class202 field2569;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BZLfi;Lfi;I)I")
    public static final int method1203(byte arg0, boolean arg1, class229 arg2, class229 arg3, int arg4) {
        ++field2568;
        if (arg4 == 1) {
            int var5 = arg2.field1679;
            int var6 = arg3.field1679;
            if (!arg1) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg4 == -3) {
            return class230.method1600(class87.field1385, arg2.method1593(115).field4481, 0, arg3.method1593(arg0 ^ -73).field4481);
        } else if (arg4 == 3) {
            if (!arg2.field3367.equals("-")) {
                if (arg3.field3367.equals("-")) {
                    return !arg1 ? -1 : 1;
                } else {
                    return class230.method1600(class87.field1385, arg2.field3367, 0, arg3.field3367);
                }
            } else if (arg3.field3367.equals("-")) {
                return 0;
            } else {
                return arg1 ? -1 : 1;
            }
        } else {
            if (arg0 != -63) {
                field2571 = -127;
            }
            if (~arg4 == -5) {
                if (!arg2.method774((byte) 86)) {
                    return !arg3.method774((byte) 86) ? 0 : -1;
                } else {
                    return !arg3.method774((byte) 86) ? 1 : 0;
                }
            } else if (arg4 == 5) {
                if (arg2.method773(4)) {
                    return arg3.method773(4) ? 0 : 1;
                } else {
                    return arg3.method773(4) ? -1 : 0;
                }
            } else if (~arg4 == -7) {
                if (arg2.method778((byte) -96)) {
                    return arg3.method778((byte) 116) ? 0 : 1;
                } else {
                    return arg3.method778((byte) 111) ? -1 : 0;
                }
            } else if (arg4 == 7) {
                if (!arg2.method776((byte) -115)) {
                    return arg3.method776((byte) -128) ? -1 : 0;
                } else {
                    return arg3.method776((byte) -115) ? 0 : 1;
                }
            } else {
                return -arg3.field3365 + arg2.field3365;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLnc;)I")
    public static final int method1204(byte arg0, class12 arg1) {
        class102 var2 = arg1.field137;
        ++field2562;
        if (var2.field1752 != null) {
            var2 = var2.method795(65535);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 > -56) {
            return 20;
        } else {
            int var3 = var2.field1768;
            class294 var4 = arg1.method1708(0);
            if (arg1.field3752 == var4.field4703) {
                var3 = var2.field1732;
            } else if (~arg1.field3752 != ~var4.field4713 && arg1.field3752 != var4.field4680 && arg1.field3752 != var4.field4689 && arg1.field3752 != var4.field4681) {
                if (~arg1.field3752 == ~var4.field4710 || ~arg1.field3752 == ~var4.field4674 || arg1.field3752 == var4.field4706 || ~arg1.field3752 == ~var4.field4679) {
                    var3 = var2.field1737;
                }
            } else {
                var3 = var2.field1765;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
    public static final void method1205(int arg0, int arg1) {
        if (arg0 != 1) {
            method1206(false);
        }
        class40.field531.method1416(arg1, 0);
        class134.field2196.method1416(arg1, 0);
        ++field2566;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        int[][] var3 = super.field1390.method1902(arg1 + -120, arg0);
        if (arg1 != 6) {
            this.method1207(60, -69, 63);
        }
        ++field2565;
        if (super.field1390.field4428) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class206.field3032; ++var7) {
                this.method1207(-2048, arg0, var7);
                int[][] var8 = this.method648(class119.field1932, arg1 ^ 73, 0);
                var4[var7] = var8[0][class133.field2185];
                var5[var7] = var8[1][class133.field2185];
                var6[var7] = var8[2][class133.field2185];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method1206(boolean arg0) {
        field2567 = null;
        field2560 = null;
        field2569 = null;
        field2570 = null;
        if (arg0) {
            field2559 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(III)V")
    private final void method1207(int arg0, int arg1, int arg2) {
        int var4 = class138.field2254[arg2];
        ++field2563;
        int var5 = class140.field2272[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (arg0 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class133.field2185 = arg2;
            class119.field1932 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class133.field2185 = arg1;
            class119.field1932 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class119.field1932 = arg2;
            class133.field2185 = -arg1 + class206.field3032;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class133.field2185 = arg2;
            class119.field1932 = -arg1 + class123.field2045;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class133.field2185 = class206.field3032 - arg2;
            class119.field1932 = -arg1 + class123.field2045;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class119.field1932 = -arg2 + class123.field2045;
            class133.field2185 = class206.field3032 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class133.field2185 = arg1;
            class119.field1932 = class123.field2045 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class133.field2185 = -arg2 + class206.field3032;
            class119.field1932 = arg1;
        }
        class133.field2185 &= class181.field2722;
        class119.field1932 &= class32.field406;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2564;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            for (int var4 = 0; var4 < class206.field3032; ++var4) {
                this.method1207(-2048, arg0, var4);
                int[] var5 = this.method642(0, class119.field1932, true);
                var3[var4] = var5[class133.field2185];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method1203((byte) 21, false, (class229) null, (class229) null, -80);
        }
        ++field2561;
        if (~arg1 == -1) {
            super.field1381 = arg0.method366(-16505) == 1;
        }
    }
}
