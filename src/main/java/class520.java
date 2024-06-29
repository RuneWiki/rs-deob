import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class520 extends class56 {

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    private int field7340 = 1;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field7334 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field7341 = 0;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "Ltja;")
    public static class288 field7342 = new class288(10);

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field7344 = -1;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "D")
    public static double field7345;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Lqd;")
    public static class473 field7343;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 >= -44) {
            method3117((byte) -23);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field7340 = arg2.method2396((byte) 51);
                }
            } else {
                this.field7341 = arg2.method2396((byte) 25);
            }
        } else {
            this.field7334 = arg2.method2396((byte) 48);
        }
        ++field7337;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class520() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field7335;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field752.method1308(false, arg1);
            if (super.field752.field2441) {
                int var4 = class349.field4354[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class642.field8759 > var6; ++var6) {
                    int var7 = class648.field8837[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field7334 != 0) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field7340 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field7340;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field7341 != 0) {
                        if (~this.field7341 == -3) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class737.field10282[255 & var12 >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(Z)V")
    public static final void method3115(boolean arg0) {
        if (class289.field3493 == 3) {
            class48.method454(4, -1);
        } else if (class289.field3493 != 7) {
            if (class289.field3493 == 10) {
                class48.method454(11, -1);
            }
        } else {
            class48.method454(8, -1);
        }
        ++field7346;
        if (!arg0) {
            field7343 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method3116(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7338;
        if (arg0 >= 2 && ~arg0 >= -37) {
            if (arg1 && arg2 >= 0) {
                if (arg3 <= 79) {
                    field7345 = -2.6952685160585226D;
                }
                int var4 = 2;
                int var5 = arg2 / arg0;
                while (~var5 != -1) {
                    var5 /= arg0;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg2;
                    arg2 /= arg0;
                    int var9 = -(arg0 * arg2) + var8;
                    if (~var9 > -11) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg0);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method3117(byte arg0) {
        int var1 = 114 / ((-54 - arg0) / 48);
        field7342 = null;
        field7343 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        class120.method940((byte) -61);
        int var2 = 4 / ((arg0 - 37) / 62);
        ++field7339;
    }
}
