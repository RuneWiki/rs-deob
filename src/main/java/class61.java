import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class61 extends class105 {

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "Lvf;")
    private static class265 field1210 = class87.method582(-46, "Allocating memory");

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Lvf;")
    public static class265 field1211 = field1210;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "Lvf;")
    public static class265 field1215 = class87.method582(-46, "brillant2:");

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "S")
    public static short field1217 = 32767;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "Z")
    public static boolean field1219 = true;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "Lvf;")
    public static class265 field1212 = class87.method582(-46, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "[I")
    public static int[] field1216;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    private final void method450(int arg0, int arg1, int arg2) {
        ++field1220;
        int var4 = class277.field4894[arg0];
        int var5 = class219.field3951[arg2];
        float var6 = (float) Math.atan2((double) (arg1 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class238.field4150 = arg0;
            class80.field1512 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class80.field1512 = arg0;
            class238.field4150 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class238.field4150 = -arg2 + class94.field1668;
            class80.field1512 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class238.field4150 = arg0;
            class80.field1512 = class102.field1804 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class238.field4150 = class94.field1668 - arg0;
            class80.field1512 = -arg2 + class102.field1804;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class80.field1512 = class102.field1804 - arg0;
            class238.field4150 = -arg2 + class94.field1668;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class238.field4150 = arg2;
            class80.field1512 = -arg0 + class102.field1804;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class80.field1512 = arg2;
            class238.field4150 = -arg0 + class94.field1668;
        }
        class80.field1512 &= class11.field377;
        class238.field4150 &= class1.field20;
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1215 = null;
        field1211 = null;
        if (arg0 != -173) {
            method453(false);
        }
        field1210 = null;
        field1212 = null;
        field1216 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)V")
    public static final void method452(int arg0, long arg1) {
        ++field1206;
        if (arg1 != 0L) {
            if ((class89.field1603 < 100 || class102.field1820) && class89.field1603 < 200) {
                class265 var3 = class103.method691(arg1, 22723).method1765(true);
                for (int var4 = 0; var4 < class89.field1603; ++var4) {
                    if (class9.field286[var4] == arg1) {
                        class259.method1725(-84, class148.method1022(10, new class265[] { var3, class134.field2412 }), 0, class4.field66);
                        return;
                    }
                }
                for (int var5 = 0; var5 < class262.field4582; ++var5) {
                    if (class4.field55[var5] == arg1) {
                        class259.method1725(-97, class148.method1022(10, new class265[] { class55.field1130, var3, class5.field76 }), 0, class4.field66);
                        return;
                    }
                }
                if (arg0 <= 1) {
                    method451(34);
                }
                if (var3.method1776((byte) -124, class214.field3827.field2163)) {
                    class259.method1725(-106, class10.field348, 0, class4.field66);
                } else {
                    class198.field3530[class89.field1603] = var3;
                    class9.field286[class89.field1603] = arg1;
                    ++class203.field3631;
                    class196.field3508[class89.field1603] = 0;
                    class58.field1183[class89.field1603] = class4.field66;
                    class58.field1182[class89.field1603] = 0;
                    class73.field1392[class89.field1603] = false;
                    class242.field4231 = class135.field2455;
                    ++class89.field1603;
                    class55.field1133.method1863(true, 90);
                    class55.field1133.method911(0, arg1);
                }
            } else {
                class259.method1725(-95, class254.field4370, 0, class4.field66);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)Lvf;")
    public static final class265 method453(boolean arg0) {
        if (arg0) {
            method451(39);
        }
        class265 var1;
        if (~class282.field4969 == -2 && class120.field2129 < 2) {
            var1 = class148.method1022(10, new class265[] { class205.field3694, class210.field3779, class9.field305, class64.field1247 });
        } else if (class25.field695 && class120.field2129 < 2) {
            var1 = class148.method1022(10, new class265[] { class239.field4170, class210.field3779, class130.field2286, class64.field1247 });
        } else if (class4.field61 && class69.field1311[81] && class120.field2129 > 2) {
            var1 = class118.method798(class120.field2129 + -2, 1927674668);
        } else {
            var1 = class118.method798(class120.field2129 + -1, 1927674668);
        }
        ++field1208;
        if (~class120.field2129 < -3) {
            var1 = class148.method1022(10, new class265[] { var1, class126.field2255, class241.method1609(!arg0, class120.field2129 + -2), class53.field1109 });
        }
        return var1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        if (arg1 >= -110) {
            method453(true);
        }
        ++field1213;
        int[][] var3 = super.field1870.method569((byte) -106, arg0);
        if (super.field1870.field1567) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class94.field1668 > var7; ++var7) {
                this.method450(var7, -2048, arg0);
                int[][] var8 = this.method702((byte) 94, class80.field1512, 0);
                var4[var7] = var8[0][class238.field4150];
                var5[var7] = var8[1][class238.field4150];
                var6[var7] = var8[2][class238.field4150];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
    public static final void method454(int arg0) {
        if (arg0 >= -31) {
            method454(63);
        }
        ++field1207;
        class171.field3088.method1893(-120);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            field1217 = 17;
        }
        ++field1209;
        if (arg0 == 0) {
            super.field1853 = arg2.method920((byte) 49) == 1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIILdk;Ldk;IIIIJ)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, class179 arg4, class179 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class200 var12 = new class200();
            var12.field3565 = arg10;
            var12.field3581 = arg1 * 128 + 64;
            var12.field3578 = arg2 * 128 + 64;
            var12.field3576 = arg3;
            var12.field3572 = arg4;
            var12.field3567 = arg5;
            var12.field3580 = arg6;
            var12.field3574 = arg7;
            var12.field3566 = arg8;
            var12.field3575 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class200.field3577[var13][arg1][arg2] == null) {
                    class200.field3577[var13][arg1][arg2] = new class137(var13, arg1, arg2);
                }
            }
            class200.field3577[arg0][arg1][arg2].field2510 = var12;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1214;
        if (arg0 != 8055) {
            return null;
        } else {
            int[] var3 = super.field1862.method458(arg1, false);
            if (super.field1862.field1236) {
                for (int var4 = 0; var4 < class94.field1668; ++var4) {
                    this.method450(var4, -2048, arg1);
                    int[] var5 = this.method705(class80.field1512, (byte) -94, 0);
                    var3[var4] = var5[class238.field4150];
                }
            }
            return var3;
        }
    }
}
