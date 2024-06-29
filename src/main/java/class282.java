import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class282 extends class148 {

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
    public static int field4039 = 1;

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
    public static int field4034 = 1;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!fr", name = "P", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!fr", name = "R", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!fr", name = "S", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!fr", name = "Q", descriptor = "Lqa;")
    public static class162 field4041;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "[I")
    public static int[] field4035;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 46 / ((-88 - arg2) / 33);
        if (arg0 == 0) {
            super.field2183 = ~arg1.method1428(32122) == -2;
        }
        ++field4040;
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
    public static void method1821(int arg0) {
        field4041 = null;
        if (arg0 <= 73) {
            field4035 = null;
        }
        field4035 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    private final void method1822(int arg0, int arg1, int arg2) {
        ++field4042;
        int var4 = class517.field7539[arg0];
        if (arg1 != 100) {
            method1823(39);
        }
        int var5 = class456.field6752[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class37.field397 = arg0;
            class83.field1288 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class83.field1288 = arg0;
            class37.field397 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class37.field397 = -arg2 + class320.field4579;
            class83.field1288 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class83.field1288 = -arg2 + class238.field3506;
            class37.field397 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class83.field1288 = -arg2 + class238.field3506;
            class37.field397 = -arg0 + class320.field4579;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class83.field1288 = class238.field3506 - arg0;
            class37.field397 = -arg2 + class320.field4579;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class83.field1288 = -arg0 + class238.field3506;
            class37.field397 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class83.field1288 = arg2;
            class37.field397 = -arg0 + class320.field4579;
        }
        class83.field1288 &= class39.field569;
        class37.field397 &= class304.field4339;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        ++field4038;
        if (arg0 == 28460) {
            class338 var1 = class230.method1580(15, -1332166328, 0);
            var1.method2052(arg0 ^ 28488);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field4044;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            for (int var4 = 0; ~var4 > ~class320.field4579; ++var4) {
                this.method1822(var4, 100, arg1);
                int[] var5 = this.method971(false, class83.field1288, 0);
                var3[var4] = var5[class37.field397];
            }
        }
        if (arg0 > -65) {
            method1825((class209) null, -76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
    public static final void method1824(byte arg0, int arg1) {
        class116.field1759 = 100;
        class101.field1467 = arg1;
        class497.field7333 = -1;
        if (arg0 < -48) {
            ++field4037;
            class259.field3816 = 3;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        if (!arg0) {
            this.method23(127, (class209) null, 106);
        }
        ++field4036;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class320.field4579; ++var7) {
                this.method1822(var7, 100, arg1);
                int[][] var8 = this.method974(true, 0, class83.field1288);
                var4[var7] = var8[0][class37.field397];
                var5[var7] = var8[1][class37.field397];
                var6[var7] = var8[2][class37.field397];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ldh;I)Ljava/lang/String;")
    public static final String method1825(class209 arg0, int arg1) {
        ++field4043;
        if (arg1 != -2) {
            method1821(-101);
        }
        return class470.method2819(arg0, 32767, (byte) 123);
    }
}
