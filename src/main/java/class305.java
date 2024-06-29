import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class305 extends class336 {

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    private int field4469 = 0;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    private int field4468 = -32768;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    private int field4477 = -1;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "Z")
    private boolean field4487 = false;

    @OriginalMember(owner = "client!or", name = "S", descriptor = "I")
    private int field4483 = 0;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!or", name = "jb", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!or", name = "db", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!or", name = "X", descriptor = "I")
    private int field4488;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public int field4467;

    @OriginalMember(owner = "client!or", name = "bb", descriptor = "Ltp;")
    private class196 field4492;

    @OriginalMember(owner = "client!or", name = "nb", descriptor = "Z")
    public static boolean field4504 = false;

    @OriginalMember(owner = "client!or", name = "lb", descriptor = "Lbn;")
    public static class160 field4502 = new class160(67, 7);

    @OriginalMember(owner = "client!or", name = "B", descriptor = "D")
    private double field4466;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "D")
    private double field4474;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "D")
    private double field4482;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "D")
    private double field4484;

    @OriginalMember(owner = "client!or", name = "V", descriptor = "D")
    private double field4486;

    @OriginalMember(owner = "client!or", name = "ab", descriptor = "D")
    private double field4491;

    @OriginalMember(owner = "client!or", name = "cb", descriptor = "D")
    private double field4493;

    @OriginalMember(owner = "client!or", name = "hb", descriptor = "D")
    private double field4498;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!or", name = "eb", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!or", name = "fb", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!or", name = "gb", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!or", name = "ib", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!or", name = "kb", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!or", name = "mb", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!or", name = "pb", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!or", name = "ob", descriptor = "Lct;")
    public static class104 field4505;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "Ldj;")
    private class314 field4475;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 3)
    public final void method2032(byte arg0) {
        if (this.field4475 != null) {
            this.field4475.method2077();
        }
        if (arg0 == 93) {
            ++field4470;
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V", line = 17)
    public final void method33(int arg0) {
        if (arg0 <= 109) {
            this.method268((byte) -75);
        }
        ++field4473;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(ILfp;)V", line = 29)
    public final void method14(int arg0, class9 arg1) {
        ++field4485;
        class143 var3 = this.method2036(arg1, 0, -32768);
        if (var3 != null) {
            class187 var4 = arg1.method145();
            var4.method826(this.field4480);
            var4.method821(this.field4497);
            var4.method823((int) this.field4466, (int) this.field4491, (int) this.field4484);
            this.field4468 = var3.method950();
            this.method2035(var3, arg0 ^ arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V", line = 49)
    public final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4503;
        if (!this.field4487) {
            double var6 = (double) (-super.field4954 + arg4);
            double var8 = (double) (-super.field4951 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4484 = (double) this.field4488 * var8 / var10 + (double) super.field4951;
            this.field4466 = (double) this.field4488 * var6 / var10 + (double) super.field4954;
            this.field4491 = (double) super.field4952;
        }
        double var12 = (double) (this.field4478 + 1 - arg0);
        this.field4486 = ((double) arg1 - this.field4484) / var12;
        if (arg2 == -24296) {
            this.field4493 = ((double) arg4 + -this.field4466) / var12;
            this.field4474 = Math.sqrt(this.field4493 * this.field4493 + this.field4486 * this.field4486);
            if (this.field4476 == -1) {
                this.field4482 = ((double) arg3 + -this.field4491) / var12;
            } else {
                if (!this.field4487) {
                    this.field4482 = -this.field4474 * Math.tan((double) this.field4476 * 0.02454369D);
                }
                this.field4498 = ((double) arg3 + -this.field4491 - this.field4482 * var12) * 2.0D / (var12 * var12);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 94)
    public final void method2034(int arg0, int arg1) {
        this.field4484 += (double) arg0 * this.field4486;
        this.field4466 += (double) arg0 * this.field4493;
        if (this.field4476 != -1) {
            this.field4491 += this.field4498 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field4482;
            this.field4482 += (double) arg0 * this.field4498;
        } else {
            this.field4491 += (double) arg0 * this.field4482;
        }
        ++field4481;
        this.field4487 = true;
        this.field4497 = (int) (Math.atan2(this.field4493, this.field4486) * 2607.5945876176133D) - -8192 & 16383;
        if (arg1 < 28) {
            this.method14(113, (class9) null);
        }
        this.field4480 = (int) (Math.atan2(this.field4482, this.field4474) * 2607.5945876176133D) & 16383;
        if (this.field4492 != null) {
            this.field4483 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field4492.field2763[this.field4469] >= this.field4483) {
                            return;
                        }
                        this.field4483 -= this.field4492.field2763[this.field4469];
                        ++this.field4469;
                        if (this.field4492.field2784.length <= this.field4469) {
                            this.field4469 -= this.field4492.field2761;
                            if (~this.field4469 > -1 || this.field4469 >= this.field4492.field2784.length) {
                                this.field4469 = 0;
                            }
                        }
                        this.field4477 = this.field4469 + 1;
                    } while (~this.field4492.field2784.length < ~this.field4477);
                    this.field4477 -= this.field4492.field2761;
                } while (this.field4477 >= 0 && this.field4492.field2784.length > this.field4477);
                this.field4477 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 215)
    public class305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field4476 = arg7;
        this.field4500 = arg0;
        this.field4471 = arg9;
        this.field4494 = arg5;
        this.field4478 = arg6;
        this.field4488 = arg8;
        this.field4487 = false;
        this.field4467 = arg10;
        int var12 = class332.method2169(256, this.field4500).field4422;
        if (~var12 == 0) {
            this.field4492 = null;
        } else {
            this.field4492 = class83.method556(var12, 83);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 153)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 <= -31) {
            ++field4479;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lbi;ILfp;)V", line = 174)
    private final void method2035(class143 arg0, int arg1, class9 arg2) {
        ++field4501;
        class133[] var4 = arg0.method945();
        if (arg1 != 0) {
            this.field4482 = 1.9789640836889153D;
        }
        class226[] var5 = arg0.method951();
        if ((this.field4475 == null || this.field4475.field4599) && (var4 != null || var5 != null)) {
            this.field4475 = new class314(class388.field5665);
        }
        if (this.field4475 != null) {
            this.field4475.method2072(arg2, (long) class388.field5665, var4, var5, false);
            this.field4475.method2073(super.field4960, super.field4961, super.field4957, super.field4959, super.field4950);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lfp;II)Lbi;", line = 201)
    private final class143 method2036(class9 arg0, int arg1, int arg2) {
        if (arg2 != -32768) {
            this.method32((class9) null, (class309) null, true, -20, -53, -4, 116);
        }
        ++field4490;
        class302 var4 = class332.method2169(256, this.field4500);
        return var4.method2013(arg1, this.field4477, this.field4483, this.field4469, (byte) -121, arg0);
    }

    @OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V", line = 237)
    protected final void finalize() {
        if (this.field4475 != null) {
            this.field4475.method2077();
        }
        ++field4496;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILfp;)Luq;", line = 250)
    public final class241 method2(int arg0, class9 arg1) {
        ++field4472;
        class143 var3 = this.method2036(arg1, 1024, -32768);
        if (var3 == null) {
            return null;
        } else if (arg0 >= -125) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            var4.method826(this.field4480);
            var4.method821(this.field4497);
            var4.method823((int) this.field4466, (int) this.field4491, (int) this.field4484);
            if (this.field4475 == null) {
                var3.method947(var4, (class396) null, 0);
            } else {
                class400 var5 = this.field4475.method2076();
                arg1.method166(var3, var5, var4, (class396) null, 0);
            }
            this.field4468 = var3.method950();
            this.method2035(var3, 0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(B)V", line = 286)
    public final void method449(byte arg0) {
        if (arg0 != -28) {
            method2037(true);
        }
        ++field4499;
        super.field4959 = super.field4950 = (short) ((int) (this.field4484 / 128.0D));
        super.field4961 = super.field4957 = (short) ((int) (this.field4466 / 128.0D));
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 299)
    public static void method2037(boolean arg0) {
        if (arg0) {
            field4505 = null;
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(B)I", line = 327)
    public final int method268(byte arg0) {
        ++field4495;
        if (arg0 > -101) {
            this.method2032((byte) -106);
        }
        return this.field4468;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lfp;III)Z", line = 348)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field4464;
        return arg2 != -754;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)Z", line = 359)
    public final boolean method34(byte arg0) {
        ++field4489;
        int var2 = -26 / ((arg0 - -19) / 44);
        return false;
    }
}
