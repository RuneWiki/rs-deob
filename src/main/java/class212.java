import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class212 extends class215 {

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    private int field3409 = 2048;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    private int field3410 = 1024;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    private int field3412 = 3072;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Z")
    public static boolean field3405 = true;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field3403;
        int[] var3 = super.field3445.method1755(arg0, (byte) 116);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(-1, 0, arg0);
            for (int var5 = 0; ~var5 > ~class244.field4015; ++var5) {
                var3[var5] = (var4[var5] * this.field3409 >> 12) + this.field3410;
            }
        }
        if (arg1 != 255) {
            field3405 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 != 1521146348) {
            method1489(-41, 113, 126, -102, 0);
        }
        ++field3407;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field3453 = ~arg2.method584(arg0 + -1521146093) == -2;
                }
            } else {
                this.field3412 = arg2.method549(255);
            }
        } else {
            this.field3410 = arg2.method549(255);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method46(46, -98);
        }
        ++field3411;
        int[][] var3 = super.field3461.method1126(arg0 ^ -2, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(arg0 ^ 90, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class244.field4015 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3409 >> 12) + this.field3410;
                var9[var11] = (var7[var11] * this.field3409 >> 12) + this.field3410;
                var10[var11] = (var6[var11] * this.field3409 >> 12) + this.field3410;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
    public static final void method1489(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg4 < ~arg0) {
            for (int var5 = arg0; arg4 > var5; ++var5) {
                class14.field186[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; ~var6 > ~arg0; ++var6) {
                class14.field186[var6][arg3] = arg1;
            }
        }
        ++field3404;
        if (arg2 != -17020) {
            field3405 = false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)I")
    public static final int method1490(byte arg0, int arg1) {
        if (arg0 != -73) {
            field3405 = false;
        }
        ++field3402;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method1491(boolean arg0) {
        ++field3408;
        if (arg0) {
            field3405 = true;
        }
        class136.field2155.method1699(0);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        ++field3406;
        if (arg0 != -49) {
            this.method331((byte) 69);
        }
        this.field3409 = -this.field3410 + this.field3412;
    }
}
