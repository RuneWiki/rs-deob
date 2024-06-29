import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class525 extends class293 {

    @OriginalMember(owner = "client!baa", name = "Q", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!baa", name = "S", descriptor = "I")
    public int field7336;

    @OriginalMember(owner = "client!baa", name = "R", descriptor = "F")
    public float field7335;

    @OriginalMember(owner = "client!baa", name = "V", descriptor = "Z")
    public boolean field7339;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "F")
    public float field7330;

    @OriginalMember(owner = "client!baa", name = "N", descriptor = "Lkg;")
    public static class275 field7331 = new class275(55, 4);

    @OriginalMember(owner = "client!baa", name = "W", descriptor = "Z")
    public static boolean field7340 = false;

    @OriginalMember(owner = "client!baa", name = "U", descriptor = "F")
    public static float field7338;

    @OriginalMember(owner = "client!baa", name = "O", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!baa", name = "P", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!baa", name = "T", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIII[I)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7334 = arg1;
        this.field7336 = arg2;
        this.method1757(0, true, arg2, 0, 0, arg1, arg5, 0, (byte) 38);
        this.field7335 = (float) arg1 / (float) arg3;
        this.field7339 = false;
        this.field7330 = (float) arg2 / (float) arg4;
        this.method1756(false, false, 13);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Z")
    public static final boolean method3039(int arg0, int arg1) {
        ++field7337;
        if (class214.field2818[arg1]) {
            return true;
        } else if (!class659.field9178.method3151(-11423, arg1)) {
            return false;
        } else {
            int var2 = class659.field9178.method3178((byte) 27, arg1);
            if (~var2 == -1) {
                class214.field2818[arg1] = true;
                return true;
            } else {
                if (class218.field2938[arg1] == null) {
                    class218.field2938[arg1] = new class288[var2];
                }
                if (arg0 != 4) {
                    method3039(-38, 50);
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class218.field2938[arg1][var3] == null) {
                        byte[] var4 = class659.field9178.method3153(var3, 0, arg1);
                        if (var4 != null) {
                            class288 var5 = class218.field2938[arg1][var3] = new class288();
                            var5.field3696 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method1727(127, new class461(var4));
                        }
                    }
                }
                class214.field2818[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(JJ)J")
    public static long method3040(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIIIIZ)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7334 = arg3;
        this.field7330 = (float) arg4 / (float) arg6;
        this.field7336 = arg4;
        this.field7335 = (float) arg3 / (float) arg5;
        this.field7339 = false;
        this.method1756(false, false, 82);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIII)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7336 = arg3;
        this.field7330 = (float) arg3 / (float) arg5;
        this.field7335 = (float) arg2 / (float) arg4;
        this.field7334 = arg2;
        this.field7339 = false;
        this.method1756(false, false, 80);
    }

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "(I)V")
    public static void method3041(int arg0) {
        field7331 = null;
        if (arg0 != 3553) {
            field7338 = -0.1193636F;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIII)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field9659 != -34038) {
            this.field7339 = true;
            this.field7335 = this.field7330 = 1.0F;
        } else {
            this.field7339 = false;
            this.field7335 = (float) arg3;
            this.field7330 = (float) arg4;
        }
        this.field7334 = arg3;
        this.field7336 = arg4;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIIZ[BI)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field7334 = arg3;
        if (super.field9659 == 34037) {
            this.field7339 = false;
            this.field7330 = (float) arg4;
            this.field7335 = (float) arg3;
        } else {
            this.field7335 = this.field7330 = 1.0F;
            this.field7339 = true;
        }
        this.field7336 = arg4;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIZ[III)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field7334 = arg2;
        this.field7336 = arg3;
        if (super.field9659 == 34037) {
            this.field7335 = (float) arg2;
            this.field7330 = (float) arg3;
            this.field7339 = false;
        } else {
            this.field7339 = true;
            this.field7335 = this.field7330 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIII[BI)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7336 = arg3;
        this.field7334 = arg2;
        this.method1763(0, true, arg6, 0, 0, 0, arg3, (byte) 30, arg2, arg7);
        this.field7335 = (float) arg2 / (float) arg4;
        this.field7339 = false;
        this.field7330 = (float) arg3 / (float) arg5;
        this.method1756(false, false, 71);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbi;IIIIIZ)V")
    public class525(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field9659 != -34038) {
            this.field7335 = this.field7330 = 1.0F;
            this.field7339 = true;
        } else {
            this.field7335 = (float) arg4;
            this.field7330 = (float) arg5;
            this.field7339 = false;
        }
        this.field7334 = arg4;
        this.field7336 = arg5;
    }
}
