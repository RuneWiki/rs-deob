import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class234 extends class646 {

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    private int field3464 = 2048;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    private int field3460 = 8192;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    private int field3463 = 0;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    private int field3472 = 4096;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    private int field3475 = 0;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    private int field3467 = 2048;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    private int field3473 = 12288;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Lmf;")
    public static class409 field3469 = new class409();

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "[Lfo;")
    public static class606[] field3474 = new class606[14];

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)[Lkd;", line = 3)
    public static final class700[] method1533(int arg0) {
        if (arg0 != 4096) {
            field3459 = -122;
        }
        ++field3461;
        return new class700[] { class343.field4813, class84.field1270, class687.field9750 };
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)Z", line = 14)
    private final boolean method1534(int arg0, int arg1, int arg2) {
        ++field3466;
        int var4 = (arg1 + arg2) * this.field3473 >> 12;
        int var5 = class43.field587[(1045065 & var4 * 255) >> 12];
        if (arg0 != 32593) {
            return true;
        } else {
            int var6 = (var5 << 12) / this.field3473;
            int var7 = (var6 << 12) / this.field3460;
            int var8 = this.field3472 * var7 >> 12;
            return ~(-arg2 + arg1) > ~var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lek;IB)V", line = 34)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 >= 7) {
            ++field3471;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field3460 = arg0.method2755((byte) -47);
                                    }
                                } else {
                                    this.field3472 = arg0.method2755((byte) -76);
                                }
                            } else {
                                this.field3473 = arg0.method2755((byte) -84);
                            }
                        } else {
                            this.field3464 = arg0.method2755((byte) -96);
                        }
                    } else {
                        this.field3463 = arg0.method2755((byte) -43);
                    }
                } else {
                    this.field3475 = arg0.method2755((byte) -79);
                }
            } else {
                this.field3467 = arg0.method2755((byte) -82);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 114)
    public static void method1535(int arg0) {
        field3474 = null;
        field3469 = null;
        int var1 = 68 / ((arg0 - -49) / 61);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(III)Z", line = 124)
    private final boolean method1536(int arg0, int arg1, int arg2) {
        ++field3468;
        int var4 = (-arg0 + arg1) * this.field3473 >> 12;
        int var5 = class43.field587[(var4 * 255 & 1048412) >> 12];
        int var6 = (var5 << 12) / this.field3473;
        if (arg2 != -20241) {
            return false;
        } else {
            int var7 = (var6 << 12) / this.field3460;
            int var8 = this.field3472 * var7 >> 12;
            return var8 > arg0 + arg1 && -var8 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)[I", line = 142)
    public final int[] method424(int arg0, byte arg1) {
        ++field3465;
        if (arg1 != -120) {
            this.field3463 = -81;
        }
        int[] var3 = super.field9156.method2193(arg1 ^ -1155, arg0);
        if (super.field9156.field5075) {
            int var4 = class78.field1195[arg0] - 2048;
            for (int var5 = 0; ~class89.field1330 < ~var5; ++var5) {
                int var6 = class518.field7652[var5] + -2048;
                int var7 = this.field3467 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field3475 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field3463 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = var4 - -this.field3464;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1536(var9, var12, -20241) && !this.method1534(32593, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 193)
    public class234() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZII)Ljava/lang/String;", line = 200)
    public static final String method1537(boolean arg0, int arg1, int arg2) {
        if (arg2 != 18698) {
            method1535(-16);
        }
        ++field3470;
        return arg0 && arg1 >= 0 ? class454.method2639(arg2 ^ -18699, 10, arg0, arg1) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 221)
    public final void method422(int arg0) {
        ++field3462;
        class549.method3223(111);
        if (arg0 != -1) {
            this.method422(24);
        }
    }
}
