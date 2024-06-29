import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class642 extends class360 {

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
    private boolean field9300 = false;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    private int field9305 = 0;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private int field9313 = -32768;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    private int field9312 = 0;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    private int field9315 = -1;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public int field9319;

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "I")
    private int field9335;

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "Z")
    private boolean field9332;

    @OriginalMember(owner = "client!ik", name = "lb", descriptor = "I")
    private int field9341;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public int field9303;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public int field9327;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public int field9298;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    private int field9297;

    @OriginalMember(owner = "client!ik", name = "mb", descriptor = "I")
    private int field9342;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Lbj;")
    private class439 field9308;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lpp;")
    public static class464 field9301 = new class464(54, -1);

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "Liu;")
    public static class517 field9331 = new class517(27, -1);

    @OriginalMember(owner = "client!ik", name = "ib", descriptor = "I")
    public static int field9338 = 0;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field9334 = -1;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "D")
    private double field9314;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "D")
    private double field9316;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "D")
    private double field9320;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "D")
    private double field9322;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "D")
    private double field9323;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "D")
    private double field9326;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "D")
    private double field9330;

    @OriginalMember(owner = "client!ik", name = "jb", descriptor = "D")
    private double field9339;

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "F")
    public static float field9337;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field9296;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    private int field9321;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!ik", name = "kb", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!ik", name = "nb", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "Lqp;")
    private class585 field9311;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqa;B)V", line = 8)
    public final void method266(class167 arg0, byte arg1) {
        ++field9302;
        if (arg1 != -40) {
            field9338 = -35;
        }
        class519 var3 = this.method3700(0, (byte) -94, arg0);
        if (var3 != null) {
            class105 var4 = arg0.method637();
            var4.method881(this.field9296);
            var4.method882(this.field9321);
            var4.method877((int) this.field9316, (int) this.field9323, (int) this.field9339);
            this.field9313 = var3.method1390();
            this.method3697(arg0, var3, 118);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 238)
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class355.method2160(arg2, arg3, arg1, (byte) 103) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field9319 = arg10;
        this.field9335 = arg4;
        this.field9332 = arg11;
        this.field9341 = arg7;
        this.field9303 = arg6;
        this.field9300 = false;
        this.field9327 = arg9;
        this.field9298 = arg5;
        this.field9297 = arg0;
        this.field9342 = arg8;
        int var13 = class522.field7247.method2489(30, this.field9297).field4961;
        if (var13 != -1) {
            this.field9308 = class49.field739.method2297((byte) 113, var13);
        } else {
            this.field9308 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 43)
    public final void method3696(int arg0, int arg1) {
        if (arg1 != 0) {
            field9331 = null;
        }
        ++field9307;
        this.field9316 += (double) arg0 * this.field9326;
        this.field9339 += (double) arg0 * this.field9314;
        this.field9300 = true;
        if (!this.field9332) {
            if (~this.field9341 == 0) {
                this.field9323 += (double) arg0 * this.field9320;
            } else {
                this.field9323 += this.field9330 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field9320;
                this.field9320 += (double) arg0 * this.field9330;
            }
        } else {
            this.field9323 = (double) (class355.method2160((int) this.field9316, (int) this.field9339, super.field5116, (byte) 103) + -this.field9335);
        }
        this.field9321 = 16383 & (int) (Math.atan2(this.field9326, this.field9314) * 2607.5945876176133D) + 8192;
        this.field9296 = 16383 & (int) (Math.atan2(this.field9320, this.field9322) * 2607.5945876176133D);
        if (this.field9308 != null) {
            this.field9312 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field9308.field6413[this.field9305] <= ~this.field9312) {
                            return;
                        }
                        this.field9312 -= this.field9308.field6413[this.field9305];
                        ++this.field9305;
                        if (~this.field9308.field6416.length >= ~this.field9305) {
                            this.field9305 -= this.field9308.field6402;
                            if (~this.field9305 > -1 || ~this.field9305 <= ~this.field9308.field6416.length) {
                                this.field9305 = 0;
                            }
                        }
                        this.field9315 = this.field9305 - -1;
                    } while (this.field9315 < this.field9308.field6416.length);
                    this.field9315 -= this.field9308.field6402;
                } while (this.field9315 >= 0 && this.field9308.field6416.length > this.field9315);
                this.field9315 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)V", line = 104)
    public final void method788(byte arg0) {
        super.field5117 = super.field5119 = (short) ((int) (this.field9316 / 128.0D));
        if (arg0 > 77) {
            ++field9299;
            super.field5113 = super.field5107 = (short) ((int) (this.field9339 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqa;Lr;I)V", line = 119)
    private final void method3697(class167 arg0, class519 arg1, int arg2) {
        if (arg2 <= 34) {
            this.field9342 = 120;
        }
        ++field9340;
        class595[] var4 = arg1.method1375();
        class643[] var5 = arg1.method1372();
        if ((this.field9311 == null || this.field9311.field8333) && (var4 != null || var5 != null)) {
            this.field9311 = class585.method3353(class310.field4553);
        }
        if (this.field9311 != null) {
            this.field9311.method3345(arg0, (long) class310.field4553, var4, var5, false);
            this.field9311.method3346(super.field5116, super.field5117, super.field5119, super.field5113, super.field5107);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqa;I)Lbi;", line = 149)
    public final class465 method267(class167 arg0, int arg1) {
        ++field9310;
        if (arg1 != 2) {
            this.field9314 = 0.6780179114037107D;
        }
        class519 var3 = this.method3700(2048, (byte) 60, arg0);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg0.method637();
            var4.method881(this.field9296);
            var4.method882(this.field9321);
            var4.method877((int) this.field9316, (int) this.field9323, (int) this.field9339);
            if (this.field9311 == null) {
                var3.method1379(var4, (class315) null, 0);
            } else {
                class616 var5 = this.field9311.method3350();
                arg0.method553(var3, var5, var4, (class315) null, 0);
            }
            this.field9313 = var3.method1390();
            this.method3697(arg0, var3, 106);
            return null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V", line = 184)
    public static final void method3698(boolean arg0, int arg1) {
        ++field9309;
        if (arg0) {
            field9331 = null;
        }
        class232.field3419 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V", line = 197)
    public final void method867(int arg0) {
        ++field9318;
        if (arg0 <= 12) {
            this.field9298 = 5;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V", line = 216)
    protected final void finalize() {
        if (this.field9311 != null) {
            this.field9311.method3347();
        }
        ++field9329;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)I", line = 226)
    public final int method1175(boolean arg0) {
        if (arg0) {
            this.method788((byte) 51);
        }
        ++field9325;
        return this.field9313;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILqa;)Lkm;", line = 265)
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 >= -50) {
            return null;
        } else {
            ++field9336;
            return null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIZ)V", line = 276)
    public final void method3699(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9343;
        if (arg4) {
            method3698(true, 49);
        }
        if (!this.field9300) {
            double var6 = (double) (-super.field5108 + arg2);
            double var8 = (double) (arg1 - super.field5109);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field9339 = (double) this.field9342 * var8 / var10 + (double) super.field5109;
            this.field9316 = (double) this.field9342 * var6 / var10 + (double) super.field5108;
            if (!this.field9332) {
                this.field9323 = (double) super.field5111;
            } else {
                this.field9323 = (double) (class355.method2160((int) this.field9316, (int) this.field9339, super.field5116, (byte) 103) - this.field9335);
            }
        }
        double var12 = (double) (this.field9303 + 1 + -arg3);
        this.field9326 = ((double) arg2 - this.field9316) / var12;
        this.field9314 = ((double) arg1 - this.field9339) / var12;
        this.field9322 = Math.sqrt(this.field9326 * this.field9326 + this.field9314 * this.field9314);
        if (~this.field9341 == 0) {
            this.field9320 = ((double) arg0 + -this.field9323) / var12;
        } else {
            if (!this.field9300) {
                this.field9320 = -this.field9322 * Math.tan((double) this.field9341 * 0.02454369D);
            }
            this.field9330 = ((double) arg0 + -this.field9323 - this.field9320 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLqa;II)Z", line = 320)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        if (arg0 != 29) {
            this.method866((byte) -42, true, -81, (class167) null, -65, 122, (class103) null);
        }
        ++field9324;
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLqa;)Lr;", line = 331)
    private final class519 method3700(int arg0, byte arg1, class167 arg2) {
        ++field9306;
        int var4 = 114 / ((-34 - arg1) / 45);
        class347 var5 = class522.field7247.method2489(30, this.field9297);
        return var5.method2099(arg0, this.field9315, this.field9305, this.field9312, arg2, 0, class49.field739);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBILgca;II)V", line = 345)
    public static final void method3701(int arg0, byte arg1, int arg2, class154 arg3, int arg4, int arg5) {
        ++field9333;
        if (arg3.field2315 != -1 || arg3.field2316 != null) {
            int var6 = 0;
            int var7 = class202.field2854.field7886 * arg3.field2321 >> 8;
            if (arg1 != 59) {
                method3698(true, 59);
            }
            if (~arg2 < ~arg3.field2308) {
                var6 += -arg3.field2308 + arg2;
            } else if (~arg2 > ~arg3.field2307) {
                var6 += -arg2 + arg3.field2307;
            }
            if (~arg0 >= ~arg3.field2319) {
                if (arg3.field2314 > arg0) {
                    var6 += arg3.field2314 - arg0;
                }
            } else {
                var6 += -arg3.field2319 + arg0;
            }
            if (~arg3.field2324 != -1 && ~arg3.field2324 <= ~(var6 + -64) && ~class202.field2854.field7886 != -1 && ~arg3.field2328 == ~arg5) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg3.field2324) * var7 / arg3.field2324;
                if (arg3.field2312 == null) {
                    if (~arg3.field2315 <= -1) {
                        class60 var9 = class60.method483(class366.field5196, arg3.field2315, 0);
                        if (var9 != null) {
                            class4 var10 = var9.method481().method10(class304.field4387);
                            class320 var11 = class320.method1979(var10, 100, var8);
                            var11.method1975(-1);
                            class35.field485.method37(var11);
                            arg3.field2312 = var11;
                        }
                    }
                } else {
                    arg3.field2312.method1999(var8);
                }
                if (arg3.field2310 != null) {
                    arg3.field2310.method1999(var8);
                    if (!arg3.field2310.method912(false)) {
                        arg3.field2310 = null;
                    }
                } else {
                    if (arg3.field2316 != null && ~(arg3.field2326 -= arg4) >= -1) {
                        int var12 = (int) (Math.random() * (double) arg3.field2316.length);
                        class60 var13 = class60.method483(class366.field5196, arg3.field2316[var12], 0);
                        if (var13 != null) {
                            class4 var14 = var13.method481().method10(class304.field4387);
                            class320 var15 = class320.method1979(var14, 100, var8);
                            var15.method1975(0);
                            class35.field485.method37(var15);
                            arg3.field2326 = (int) ((double) (arg3.field2320 - arg3.field2313) * Math.random()) + arg3.field2313;
                            arg3.field2310 = var15;
                            return;
                        }
                    }
                }
            } else {
                if (arg3.field2312 != null) {
                    class35.field485.method44(arg3.field2312);
                    arg3.field2312 = null;
                }
                if (arg3.field2310 != null) {
                    class35.field485.method44(arg3.field2310);
                    arg3.field2310 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Z", line = 486)
    public final boolean method868(boolean arg0) {
        ++field9328;
        if (arg0) {
            this.field9311 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 500)
    public final void method3702(int arg0) {
        if (arg0 != -19422) {
            this.method867(66);
        }
        ++field9304;
        if (this.field9311 != null) {
            this.field9311.method3347();
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 513)
    public static void method3703(int arg0) {
        field9301 = null;
        field9331 = null;
        if (arg0 != -1) {
            method3698(false, -124);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 529)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field9317;
        if (arg0 == -84) {
            throw new IllegalStateException();
        }
    }
}
