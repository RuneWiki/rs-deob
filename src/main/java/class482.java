import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class482 extends class148 {

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field7062 = 0;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "Lne;")
    public static class207 field7063 = new class207("LOCAL", 4);

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "Lri;")
    public static class73 field7071 = new class73(9, -2);

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "Lng;")
    public static class226 field7072 = new class226(64);

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "[Ljc;")
    private class302[] field7073;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public static void method2857(int arg0) {
        field7063 = null;
        field7072 = null;
        field7071 = null;
        if (arg0 != 65280) {
            field7071 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
    public static final void method2858(int arg0, int arg1) {
        if (arg0 >= -10) {
            method2857(-40);
        }
        ++field7069;
        class338 var2 = class230.method1580(14, -1332166328, arg1);
        var2.method2052(100);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z")
    public static final boolean method2859(int arg0, byte arg1) {
        ++field7064;
        if (arg1 >= -54) {
            field7072 = null;
        }
        return ~arg0 == -3 || ~arg0 == -4;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class482() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        if (!arg0) {
            method2859(-119, (byte) 56);
        }
        ++field7067;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int var4 = class320.field4579;
            int var5 = class238.field3506;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2189.method2421(-122);
            this.method2862(var6, 9177);
            for (int var8 = 0; ~class238.field3506 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class320.field4579 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class286.method1847(4080, var15 << 4);
                    var12[var14] = class286.method1847(65280, var15) >> 4;
                    var11[var14] = class286.method1847(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(DI)V")
    public static final void method2860(double arg0, int arg1) {
        if (class467.field6894 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class70.field1058[var3] = ~var4 < -256 ? 255 : var4;
            }
            class467.field6894 = arg0;
        }
        if (arg1 >= -12) {
            method2857(126);
        }
        ++field7068;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIBLod;II)Lwe;")
    public static final class279 method2861(int arg0, int arg1, byte arg2, class349 arg3, int arg4, int arg5) {
        if (arg2 != 90) {
            return null;
        } else {
            ++field7066;
            if (!arg3.field5316 && (!class415.method2495(1, arg0) || !class415.method2495(1, arg1))) {
                return !arg3.field5358 ? new class279(arg3, arg4, arg5, arg0, arg1, class476.method2841(arg0, true), class476.method2841(arg1, true), true) : new class279(arg3, 34037, arg4, arg5, arg0, arg1, true);
            } else {
                return new class279(arg3, 3553, arg4, arg5, arg0, arg1, true);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 111 / ((-88 - arg2) / 33);
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2183 = ~arg1.method1428(32122) == -2;
            }
        } else {
            this.field7073 = new class302[arg1.method1428(32122)];
            for (int var5 = 0; ~var5 > ~this.field7073.length; ++var5) {
                int var6 = arg1.method1428(32122);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (~var6 == -4) {
                                this.field7073[var5] = class357.method2226(13795, arg1);
                            }
                        } else {
                            this.field7073[var5] = class461.method2778(arg1, (byte) -42);
                        }
                    } else {
                        this.field7073[var5] = class31.method183(arg1, (byte) 39);
                    }
                } else {
                    this.field7073[var5] = class163.method1130((byte) -95, arg1);
                }
            }
        }
        ++field7061;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7065;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 > -65) {
            return null;
        } else {
            if (super.field2193.field1312) {
                this.method2862(super.field2193.method500(-103), 9177);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([[II)V")
    private final void method2862(int[][] arg0, int arg1) {
        ++field7070;
        int var3 = class320.field4579;
        int var4 = class238.field3506;
        class252.method1684(-123, arg0);
        class350.method2202(0, 0, class304.field4339, class39.field569, 0);
        if (arg1 != 9177) {
            field7072 = null;
        }
        if (this.field7073 != null) {
            for (int var5 = 0; ~this.field7073.length < ~var5; ++var5) {
                class302 var6 = this.field7073[var5];
                int var7 = var6.field4267;
                int var8 = var6.field4273;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method404(var3, var4, true);
                    }
                } else if (~var8 > -1) {
                    var6.method403(var3, 4802, var4);
                } else {
                    var6.method405(2, var3, var4);
                }
            }
        }
    }
}
