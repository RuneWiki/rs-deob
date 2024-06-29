import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class324 extends class30 {

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    private int field4406 = 0;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    private int field4412 = 0;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    private int field4416 = 0;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "Lem;")
    public static class206 field4415 = new class206(110, 8);

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "Lem;")
    public static class206 field4420 = new class206(81, 8);

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!jp", name = "S", descriptor = "[I")
    public static int[] field4421;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V", line = 6)
    public static void method1941(int arg0) {
        field4420 = null;
        if (arg0 != 4096) {
            field4421 = null;
        }
        field4421 = null;
        field4415 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)[[I", line = 18)
    public final int[][] method30(int arg0, byte arg1) {
        ++field4405;
        if (arg1 != 7) {
            this.method27((byte) 54, 9, (class501) null);
        }
        int[][] var3 = super.field377.method3683(arg0, (byte) -104);
        if (super.field377.field9085) {
            int[][] var4 = this.method292(118, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class31.field399 > var11; ++var11) {
                this.method1945(var5[var11], var7[var11], var6[var11], 123);
                this.field4417 += this.field4412;
                this.field4407 += this.field4416;
                this.field4414 += this.field4406;
                while (this.field4407 < 0) {
                    this.field4407 += 4096;
                }
                while (this.field4407 > 4096) {
                    this.field4407 -= 4096;
                }
                if (~this.field4417 > -1) {
                    this.field4417 = 0;
                }
                if (this.field4417 > 4096) {
                    this.field4417 = 4096;
                }
                if (this.field4414 < 0) {
                    this.field4414 = 0;
                }
                if (this.field4414 > 4096) {
                    this.field4414 = 4096;
                }
                this.method1942(-21387, this.field4407, this.field4417, this.field4414);
                var8[var11] = this.field4413;
                var9[var11] = this.field4418;
                var10[var11] = this.field4408;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V", line = 91)
    private final void method1942(int arg0, int arg1, int arg2, int arg3) {
        ++field4404;
        if (arg0 != -21387) {
            field4421 = null;
        }
        int var5 = ~arg3 < -2049 ? arg2 + arg3 - (arg2 * arg3 >> 12) : (4096 - -arg2) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg3 - -arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field4408 = var7;
                this.field4413 = var5;
                this.field4418 = var14;
                return;
            }
            if (var9 == 1) {
                this.field4418 = var5;
                this.field4413 = var15;
                this.field4408 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field4418 = var5;
                this.field4408 = var14;
                this.field4413 = var7;
                return;
            }
            if (var9 == 3) {
                this.field4418 = var15;
                this.field4408 = var5;
                this.field4413 = var7;
                return;
            }
            if (var9 == 4) {
                this.field4413 = var14;
                this.field4418 = var7;
                this.field4408 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field4408 = var15;
                this.field4413 = var5;
                this.field4418 = var7;
                return;
            }
        } else {
            this.field4413 = this.field4418 = this.field4408 = arg3;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BILac;)V", line = 201)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field4410;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4406 = (arg2.method2863(118) << 12) / 100;
                }
            } else {
                this.field4412 = (arg2.method2863(111) << 12) / 100;
            }
        } else {
            this.field4416 = arg2.method2875(false);
        }
        if (arg0 <= 100) {
            this.method1942(-4, 108, -55, 57);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 342)
    public class324() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/io/File;)[B", line = 247)
    public static final byte[] method1943(int arg0, File arg1) {
        if (arg0 != 26610) {
            method1946(41);
        }
        ++field4409;
        return class210.method1359((byte) 1, arg1, (int) arg1.length());
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)I", line = 261)
    public static int method1944(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(IIII)V", line = 270)
    private final void method1945(int arg0, int arg1, int arg2, int arg3) {
        ++field4419;
        int var5 = arg0 <= arg2 ? arg2 : arg0;
        int var6 = var5 >= arg1 ? var5 : arg1;
        int var7 = arg0 < arg2 ? arg0 : arg2;
        int var8 = ~var7 < ~arg1 ? arg1 : var7;
        if (arg3 < 61) {
            this.field4417 = 70;
        }
        int var9 = var6 - var8;
        this.field4414 = (var6 + var8) / 2;
        if (~var9 >= -1) {
            this.field4407 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (~arg0 == ~var6) {
                this.field4407 = arg2 == var8 ? var12 + 20480 : 4096 - var11;
            } else if (arg2 != var6) {
                this.field4407 = ~arg0 == ~var8 ? 12288 - -var11 : 20480 - var10;
            } else {
                this.field4407 = arg1 == var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field4407 /= 6;
        }
        if (~this.field4414 < -1 && this.field4414 < 4096) {
            this.field4417 = (var9 << 12) / (this.field4414 > 2048 ? -(this.field4414 * 2) + 8192 : this.field4414 * 2);
        } else {
            this.field4417 = 0;
        }
    }

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)V", line = 331)
    public static final void method1946(int arg0) {
        if (arg0 > 112) {
            class383.field5424.method3547((byte) -53);
            ++field4411;
        }
    }
}
