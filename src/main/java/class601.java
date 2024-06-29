import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class601 extends class29 {

    @OriginalMember(owner = "client!sl", name = "lb", descriptor = "I")
    private int field8376 = 0;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    private int field8364 = 0;

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "I")
    private int field8372 = 0;

    @OriginalMember(owner = "client!sl", name = "xb", descriptor = "I")
    private int field8388 = 0;

    @OriginalMember(owner = "client!sl", name = "vb", descriptor = "Z")
    private boolean field8386 = false;

    @OriginalMember(owner = "client!sl", name = "yb", descriptor = "I")
    private int field8389 = -1;

    @OriginalMember(owner = "client!sl", name = "Db", descriptor = "Z")
    private boolean field8394 = false;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    private int field8361;

    @OriginalMember(owner = "client!sl", name = "Ab", descriptor = "I")
    public int field8391;

    @OriginalMember(owner = "client!sl", name = "mb", descriptor = "I")
    private int field8377;

    @OriginalMember(owner = "client!sl", name = "nb", descriptor = "I")
    private int field8378;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Z")
    private boolean field8354;

    @OriginalMember(owner = "client!sl", name = "wb", descriptor = "I")
    public int field8387;

    @OriginalMember(owner = "client!sl", name = "Lb", descriptor = "I")
    public int field8402;

    @OriginalMember(owner = "client!sl", name = "Ob", descriptor = "I")
    public int field8405;

    @OriginalMember(owner = "client!sl", name = "kb", descriptor = "I")
    private int field8375;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "Lhca;")
    private class186 field8371;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "I")
    public static int field8367 = -1;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "[I")
    public static int[] field8355 = new int[256];

    @OriginalMember(owner = "client!sl", name = "Cb", descriptor = "I")
    public static int field8393 = 0;

    @OriginalMember(owner = "client!sl", name = "Jb", descriptor = "[Ljava/lang/String;")
    public static String[] field8400 = new String[100];

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "D")
    private double field8357;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "D")
    private double field8358;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "D")
    private double field8362;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "D")
    private double field8366;

    @OriginalMember(owner = "client!sl", name = "qb", descriptor = "D")
    private double field8381;

    @OriginalMember(owner = "client!sl", name = "ub", descriptor = "D")
    private double field8385;

    @OriginalMember(owner = "client!sl", name = "Gb", descriptor = "D")
    private double field8397;

    @OriginalMember(owner = "client!sl", name = "Mb", descriptor = "D")
    private double field8403;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    private int field8356;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!sl", name = "ib", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!sl", name = "jb", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!sl", name = "ob", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!sl", name = "pb", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!sl", name = "rb", descriptor = "I")
    private int field8382;

    @OriginalMember(owner = "client!sl", name = "sb", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!sl", name = "tb", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!sl", name = "zb", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!sl", name = "Eb", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!sl", name = "Fb", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!sl", name = "Hb", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!sl", name = "Ib", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!sl", name = "Kb", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!sl", name = "Nb", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!sl", name = "Bb", descriptor = "Lii;")
    private class514 field8392;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    public final void method3342(int arg0, int arg1) {
        this.field8381 += (double) arg0 * this.field8366;
        ++field8370;
        this.field8357 += (double) arg0 * this.field8397;
        this.field8394 = true;
        if (this.field8354) {
            this.field8362 = (double) (class180.method1211(super.field385, true, (int) this.field8357, (int) this.field8381) - this.field8377);
        } else if (this.field8361 == -1) {
            this.field8362 += (double) arg0 * this.field8403;
        } else {
            this.field8362 += this.field8385 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field8403;
            this.field8403 += (double) arg0 * this.field8385;
        }
        this.field8356 = arg1 & (int) (2607.5945876176133D * Math.atan2(this.field8397, this.field8366)) - -8192;
        this.field8382 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field8403, this.field8358));
        if (this.field8371 != null) {
            this.field8372 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field8371.field2595[this.field8364] >= this.field8372) {
                            return;
                        }
                        this.field8372 -= this.field8371.field2595[this.field8364];
                        ++this.field8364;
                        if (this.field8364 >= this.field8371.field2570.length) {
                            this.field8364 -= this.field8371.field2587;
                            if (~this.field8364 > -1 || this.field8364 >= this.field8371.field2570.length) {
                                this.field8364 = 0;
                            }
                        }
                        this.field8389 = this.field8364 + 1;
                    } while (this.field8371.field2570.length > this.field8389);
                    this.field8389 -= this.field8371.field2587;
                } while (this.field8389 >= 0 && ~this.field8371.field2570.length < ~this.field8389);
                this.field8389 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        if (arg0) {
            field8400 = null;
        }
        ++field8368;
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static final void method3343(int arg0) {
        ++field8398;
        class551.method3082((byte) 113, false);
        if (arg0 >= ~class100.field1207 && class100.field1207 != 0) {
            class174.method1190(0, class100.field1207);
            class100.field1207 = -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lq;Lda;ILr;)V")
    private final void method3344(class487 arg0, class470 arg1, int arg2, class562 arg3) {
        arg1.method610(arg0);
        ++field8380;
        class140[] var5 = arg1.method652();
        class118[] var6 = arg1.method628();
        if ((this.field8392 == null || this.field8392.field7146) && (var5 != null || var6 != null)) {
            this.field8392 = class514.method2909(class327.field4404, true);
        }
        if (arg2 != -21449) {
            this.field8371 = null;
        }
        if (this.field8392 != null) {
            this.field8392.method2907(arg3, (long) class327.field4404, var5, var6, false);
            this.field8392.method2906(super.field385, super.field423, super.field420, super.field419, super.field421);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            this.field8357 = 1.2553816311532227D;
        }
        ++field8369;
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "(I)V")
    public final void method186(int arg0) {
        super.field419 = super.field421 = (short) ((int) (this.field8381 / 512.0D));
        super.field423 = super.field420 = (short) ((int) (this.field8357 / 512.0D));
        if (arg0 != 13035) {
            method3345(-104);
        }
        ++field8396;
    }

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field8384;
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            return false;
        } else {
            ++field8359;
            return this.field8386;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
    public final void method175(byte arg0) {
        ++field8360;
        if (arg0 <= 24) {
            this.method169(55, (class27) null, false, -116, (class562) null, -112, (byte) 126);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static void method3345(int arg0) {
        field8400 = null;
        if (arg0 >= -88) {
            field8400 = null;
        }
        field8355 = null;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)I")
    public final int method176(byte arg0) {
        ++field8383;
        if (arg0 >= -114) {
            this.method3344((class487) null, (class470) null, -91, (class562) null);
        }
        return this.field8388;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field8404;
        class470 var3 = this.method3347(arg1, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class487 var4 = arg1.method1153();
            var4.method361(this.field8382);
            var4.method349(this.field8356);
            var4.method356((int) this.field8357, (int) this.field8362, (int) this.field8381);
            this.method3344(var4, var3, -21449, arg1);
            if (class347.field4632) {
                var3.method648(var4, (class667) null, class414.field5430, 0);
            } else {
                var3.method625(var4, (class667) null, 0);
            }
            if (this.field8392 != null) {
                class144 var5 = this.field8392.method2915();
                if (!class347.field4632) {
                    arg1.method1096(var5);
                } else {
                    arg1.method1120(var5, class414.field5430);
                }
            }
            this.field8386 = var3.method657();
            this.field8388 = var3.method613();
            if (arg0 <= 109) {
                this.field8378 = 92;
            }
            this.field8376 = var3.method621();
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public final void method3346(int arg0) {
        if (this.field8392 != null) {
            this.field8392.method2912();
        }
        ++field8373;
        if (arg0 != 1886454569) {
            this.field8388 = 8;
        }
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        if (arg0 != 28602) {
            return true;
        } else {
            ++field8390;
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lr;ZI)Lda;")
    private final class470 method3347(class562 arg0, boolean arg1, int arg2) {
        ++field8401;
        if (arg1) {
            this.method176((byte) -78);
        }
        class521 var4 = class24.field291.method2940(this.field8378, 17);
        return var4.method2958((byte) 45, this.field8364, this.field8372, class423.field5620, this.field8389, arg2, arg0);
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field8374;
        if (this.field8392 != null) {
            this.field8392.method2912();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        if (arg6 >= -117) {
            this.field8394 = false;
        }
        ++field8363;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 0) {
            this.method3347((class562) null, false, -19);
        }
        ++field8365;
        return this.field8376;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
    public class601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        super(arg1, arg2, arg3, -arg5 + class180.method1211(arg1, true, arg3, arg4), arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field8394 = false;
        this.field8361 = arg8;
        this.field8391 = arg6;
        this.field8377 = arg5;
        this.field8378 = arg0;
        this.field8354 = arg12;
        this.field8387 = arg7;
        this.field8402 = arg10;
        this.field8405 = arg11;
        this.field8375 = arg9;
        int var14 = class24.field291.method2940(this.field8378, 17).field7228;
        if (~var14 != 0) {
            this.field8371 = class423.field5620.method1707(var14, -82);
        } else {
            this.field8371 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        if (!arg1) {
            this.field8358 = 0.7410912875123705D;
        }
        ++field8399;
        class470 var3 = this.method3347(arg0, false, 0);
        if (var3 != null) {
            class487 var4 = arg0.method1153();
            var4.method361(this.field8382);
            var4.method349(this.field8356);
            var4.method356((int) this.field8357, (int) this.field8362, (int) this.field8381);
            this.field8388 = var3.method613();
            this.field8376 = var3.method621();
            this.method3344(var4, var3, -21449, arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIB)V")
    public final void method3348(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 108 / ((arg4 - 72) / 33);
        if (!this.field8394) {
            double var7 = (double) (-super.field398 + arg1);
            double var9 = (double) (-super.field397 + arg0);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field8357 = (double) this.field8375 * var7 / var11 + (double) super.field398;
            this.field8381 = (double) this.field8375 * var9 / var11 + (double) super.field397;
            if (!this.field8354) {
                this.field8362 = (double) super.field388;
            } else {
                this.field8362 = (double) (class180.method1211(super.field385, true, (int) this.field8357, (int) this.field8381) - this.field8377);
            }
        }
        ++field8379;
        double var13 = (double) (this.field8387 - -1 + -arg3);
        this.field8397 = ((double) arg1 - this.field8357) / var13;
        this.field8366 = ((double) arg0 + -this.field8381) / var13;
        this.field8358 = Math.sqrt(this.field8397 * this.field8397 + this.field8366 * this.field8366);
        if (this.field8361 == -1) {
            this.field8403 = ((double) arg2 - this.field8362) / var13;
        } else {
            if (!this.field8394) {
                this.field8403 = -this.field8358 * Math.tan((double) this.field8361 * 0.02454369D);
            }
            this.field8385 = ((double) arg2 + -this.field8362 + -(this.field8403 * var13)) * 2.0D / (var13 * var13);
        }
    }
}
