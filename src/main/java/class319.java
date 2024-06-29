import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class319 extends class577 {

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    private int field4377 = -32768;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    private int field4393 = 0;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "Z")
    private boolean field4380 = false;

    @OriginalMember(owner = "client!ln", name = "lb", descriptor = "I")
    private int field4411 = -1;

    @OriginalMember(owner = "client!ln", name = "rb", descriptor = "I")
    private int field4417 = 0;

    @OriginalMember(owner = "client!ln", name = "nb", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
    private int field4403;

    @OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!ln", name = "pb", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!ln", name = "ib", descriptor = "Z")
    private boolean field4408;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "Ltt;")
    private class78 field4392;

    @OriginalMember(owner = "client!ln", name = "fb", descriptor = "Lbn;")
    public static class378 field4405 = new class378(1, 3);

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "D")
    private double field4376;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "D")
    private double field4383;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "D")
    private double field4389;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "D")
    private double field4398;

    @OriginalMember(owner = "client!ln", name = "eb", descriptor = "D")
    private double field4404;

    @OriginalMember(owner = "client!ln", name = "hb", descriptor = "D")
    private double field4407;

    @OriginalMember(owner = "client!ln", name = "kb", descriptor = "D")
    private double field4410;

    @OriginalMember(owner = "client!ln", name = "ob", descriptor = "D")
    private double field4414;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ln", name = "mb", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ln", name = "qb", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "Ldea;")
    private class206 field4382;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 6)
    public class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class132.method919(arg1, arg3, arg2, (byte) -82) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field4413 = arg8;
        this.field4403 = arg0;
        this.field4406 = arg6;
        this.field4388 = arg9;
        this.field4415 = arg10;
        this.field4408 = arg11;
        this.field4394 = arg4;
        this.field4380 = false;
        this.field4384 = arg7;
        this.field4400 = arg5;
        int var13 = class59.field742.method863(this.field4403, (byte) -118).field5357;
        if (var13 != -1) {
            this.field4392 = class463.field6521.method2983(var13, -115);
        } else {
            this.field4392 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(ILqa;)Lin;", line = 31)
    public final class77 method181(int arg0, class208 arg1) {
        ++field4386;
        class159 var3 = this.method1928(-70, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method428();
            var4.method355(this.field4418);
            var4.method352(this.field4390);
            var4.method338((int) this.field4414, (int) this.field4407, (int) this.field4383);
            if (this.field4382 != null) {
                class283 var5 = this.field4382.method1356();
                arg1.method511(var3, var5, var4, (class381) null, 0);
            } else {
                var3.method93(var4, (class381) null, 0);
            }
            if (arg0 <= 0) {
                field4405 = null;
            }
            this.field4377 = var3.method86();
            this.method1926(arg1, 107, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lqa;ILr;)V", line = 67)
    private final void method1926(class208 arg0, int arg1, class159 arg2) {
        ++field4416;
        class450[] var4 = arg2.method60();
        class506[] var5 = arg2.method57();
        if (arg1 >= 82) {
            if ((this.field4382 == null || this.field4382.field3059) && (var4 != null || var5 != null)) {
                this.field4382 = class206.method1358(class617.field9123);
            }
            if (this.field4382 != null) {
                this.field4382.method1366(arg0, (long) class617.field9123, var4, var5, false);
                this.field4382.method1360(super.field8501, super.field8504, super.field8508, super.field8509, super.field8499);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILqa;IB)Z", line = 97)
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field4402;
        if (arg3 < 44) {
            this.field4383 = 0.7473916507163904D;
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V", line = 108)
    public final void method1927(int arg0, byte arg1) {
        ++field4385;
        if (arg1 < 15) {
            this.method179(110);
        }
        this.field4383 += (double) arg0 * this.field4398;
        this.field4380 = true;
        this.field4414 += (double) arg0 * this.field4376;
        if (this.field4408) {
            this.field4407 = (double) (class132.method919(super.field8501, (int) this.field4383, (int) this.field4414, (byte) -82) - this.field4394);
        } else if (~this.field4384 == 0) {
            this.field4407 += (double) arg0 * this.field4410;
        } else {
            this.field4407 += this.field4389 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field4410;
            this.field4410 += (double) arg0 * this.field4389;
        }
        this.field4390 = 16383 & 8192 + (int) (Math.atan2(this.field4376, this.field4398) * 2607.5945876176133D);
        this.field4418 = 16383 & (int) (Math.atan2(this.field4410, this.field4404) * 2607.5945876176133D);
        if (this.field4392 != null) {
            this.field4393 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field4393 <= this.field4392.field1049[this.field4417]) {
                            return;
                        }
                        this.field4393 -= this.field4392.field1049[this.field4417];
                        ++this.field4417;
                        if (~this.field4392.field1035.length >= ~this.field4417) {
                            this.field4417 -= this.field4392.field1046;
                            if (~this.field4417 > -1 || this.field4417 >= this.field4392.field1035.length) {
                                this.field4417 = 0;
                            }
                        }
                        this.field4411 = this.field4417 + 1;
                    } while (~this.field4411 > ~this.field4392.field1035.length);
                    this.field4411 -= this.field4392.field1046;
                } while (this.field4411 >= 0 && this.field4392.field1035.length > this.field4411);
                this.field4411 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V", line = 167)
    protected final void finalize() {
        if (this.field4382 != null) {
            this.field4382.method1368();
        }
        ++field4401;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILqa;)V", line = 178)
    public final void method194(int arg0, class208 arg1) {
        ++field4399;
        class159 var3 = this.method1928(118, arg0, arg1);
        if (var3 != null) {
            class165 var4 = arg1.method428();
            var4.method355(this.field4418);
            var4.method352(this.field4390);
            var4.method338((int) this.field4414, (int) this.field4407, (int) this.field4383);
            this.field4377 = var3.method86();
            this.method1926(arg1, 109, var3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILqa;)Lr;", line = 198)
    private final class159 method1928(int arg0, int arg1, class208 arg2) {
        ++field4381;
        int var4 = -19 % ((arg0 - 63) / 45);
        class389 var5 = class59.field742.method863(this.field4403, (byte) -126);
        return var5.method2320(this.field4393, class463.field6521, this.field4417, this.field4411, arg1, (byte) 0, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lqa;I)Lpl;", line = 212)
    public final class558 method189(class208 arg0, int arg1) {
        ++field4395;
        if (arg1 != 31733) {
            this.method1932(121);
        }
        return null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 227)
    public static void method1929(int arg0) {
        field4405 = null;
        if (arg0 != -15825) {
            field4405 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z", line = 241)
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            this.field4390 = -45;
        }
        ++field4379;
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 255)
    public final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field4380) {
            double var6 = (double) (-super.field8496 + arg1);
            double var8 = (double) (arg4 - super.field8500);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4414 = (double) this.field4413 * var6 / var10 + (double) super.field8496;
            this.field4383 = (double) this.field4413 * var8 / var10 + (double) super.field8500;
            if (this.field4408) {
                this.field4407 = (double) (class132.method919(super.field8501, (int) this.field4383, (int) this.field4414, (byte) -82) - this.field4394);
            } else {
                this.field4407 = (double) super.field8502;
            }
        }
        ++field4378;
        if (arg0 != 0) {
            this.method177((byte) 63);
        }
        double var12 = (double) (this.field4406 - arg3 + 1);
        this.field4398 = ((double) arg4 - this.field4383) / var12;
        this.field4376 = ((double) arg1 + -this.field4414) / var12;
        this.field4404 = Math.sqrt(this.field4398 * this.field4398 + this.field4376 * this.field4376);
        if (this.field4384 == -1) {
            this.field4410 = ((double) arg2 + -this.field4407) / var12;
        } else {
            if (!this.field4380) {
                this.field4410 = -this.field4404 * Math.tan((double) this.field4384 * 0.02454369D);
            }
            this.field4389 = ((double) arg2 - this.field4407 + -(this.field4410 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V", line = 299)
    public final void method943(int arg0) {
        super.field8509 = super.field8499 = (short) ((int) (this.field4383 / 128.0D));
        super.field8504 = super.field8508 = (short) ((int) (this.field4414 / 128.0D));
        ++field4409;
        if (arg0 <= 30) {
            this.field4418 = 35;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)I", line = 311)
    public final int method177(byte arg0) {
        ++field4391;
        return arg0 != 40 ? 81 : this.field4377;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpl;IIILr;I)V", line = 322)
    public static final void method1931(class558 arg0, int arg1, int arg2, int arg3, class159 arg4, int arg5) {
        ++field4397;
        if (arg4 != null) {
            if (arg3 < -122) {
                arg0.method3364(-1030, arg4.method81(), arg1, arg5, arg4.method68(), arg4.method85(), arg4.method62(), arg4.method88(), arg2, arg4.method58(), arg4.method86());
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 338)
    public final void method1932(int arg0) {
        if (this.field4382 != null) {
            this.field4382.method1368();
        }
        int var2 = 23 / ((arg0 - 63) / 38);
        ++field4387;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 355)
    public final void method179(int arg0) {
        if (arg0 != 1) {
            this.method182((class208) null, 85, false, -27, 51, (class102) null, 42);
        }
        ++field4412;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lqa;IZIILco;I)V", line = 390)
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field4396;
        if (arg6 != 21130) {
            this.field4388 = 76;
        }
        throw new IllegalStateException();
    }
}
