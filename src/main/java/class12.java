import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class12 extends class114 {

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Llh;")
    public static class58 field199 = new class58();

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Ljava/lang/String;")
    public static String field200 = "Connected to update server";

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "Ljava/lang/String;")
    public static String field202 = "Loading config - ";

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Lnh;")
    public static class305 field201;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)I")
    public static final int method72(byte arg0) {
        ++field198;
        if (arg0 != 34) {
            field200 = null;
        }
        return class182.field2768;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field192;
        if (arg0 != -112) {
            field200 = null;
        }
        int[][] var3 = super.field1627.method104(arg1, (byte) 119);
        if (super.field1627.field280) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class145.field2009 < ~var7; ++var7) {
                this.method76((byte) -78, arg1, var7);
                int[][] var8 = this.method727(0, class208.field3095, arg0 + 954);
                var4[var7] = var8[0][class291.field4634];
                var5[var7] = var8[1][class291.field4634];
                var6[var7] = var8[2][class291.field4634];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field194;
        if (arg4 > -93) {
            field202 = null;
        }
        if (-arg0 + arg3 >= class261.field4204 && arg0 + arg3 <= class18.field310 && ~(-arg0 + arg1) <= ~class271.field4322 && class311.field5001 >= arg0 + arg1) {
            class308.method2097(0, arg2, arg0, arg1, arg3);
        } else {
            class68.method449(arg3, arg1, arg2, (byte) 124, arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V")
    public static final void method75(int arg0) {
        ++field191;
        class47.field683.method944(-119);
        if (arg0 != 0) {
            method77(-123, (byte) -24, 65);
        }
        class246.field3859.method944(arg0 ^ 117);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII)V")
    private final void method76(byte arg0, int arg1, int arg2) {
        int var4 = class99.field1434[arg2];
        ++field193;
        int var5 = class159.field2209[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class208.field3095 = arg1;
            class291.field4634 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class291.field4634 = arg1;
            class208.field3095 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class291.field4634 = -arg1 + class145.field2009;
            class208.field3095 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class208.field3095 = -arg1 + class263.field4216;
            class291.field4634 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class291.field4634 = -arg2 + class145.field2009;
            class208.field3095 = class263.field4216 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class291.field4634 = -arg1 + class145.field2009;
            class208.field3095 = -arg2 + class263.field4216;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class208.field3095 = -arg2 + class263.field4216;
            class291.field4634 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class291.field4634 = class145.field2009 - arg2;
            class208.field3095 = arg1;
        }
        class208.field3095 &= class134.field1840;
        if (arg0 > -33) {
            method74(67, 87, 60, 10, 2);
        }
        class291.field4634 &= class309.field4977;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            super.field1648 = ~arg0.method1374((byte) -60) == -2;
        }
        ++field197;
        if (arg2 != 12953) {
            field202 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)I")
    public static final int method77(int arg0, byte arg1, int arg2) {
        ++field196;
        class205 var3 = (class205) class278.field4412.method1453(true, (long) arg2);
        if (arg1 <= 53) {
            field200 = null;
        }
        if (var3 == null) {
            return -1;
        } else {
            return arg0 >= 0 && ~arg0 > ~var3.field3069.length ? var3.field3069[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field195;
        int[] var3 = super.field1630.method302(arg0, -117);
        if (arg1) {
            return null;
        } else {
            if (super.field1630.field710) {
                for (int var4 = 0; var4 < class145.field2009; ++var4) {
                    this.method76((byte) -83, arg0, var4);
                    int[] var5 = this.method729(class208.field3095, 0, 0);
                    var3[var4] = var5[class291.field4634];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "(I)V")
    public static void method78(int arg0) {
        if (arg0 >= -17) {
            method74(97, 24, -48, 1, 73);
        }
        field200 = null;
        field201 = null;
        field199 = null;
        field202 = null;
    }
}
