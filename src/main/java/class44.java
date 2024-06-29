import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class44 extends class290 {

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    private int field710 = -1;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Z")
    private boolean field724 = false;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    private int field695 = -32768;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    private int field723 = 0;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
    private int field728 = 0;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "Z")
    private boolean field713;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Lsq;")
    private class145 field708;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Ljl;")
    public static class489 field720 = new class489();

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "J")
    public static long field730 = 0L;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "D")
    private double field690;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "D")
    private double field700;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "D")
    private double field707;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "D")
    private double field711;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "D")
    private double field715;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "D")
    private double field716;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "D")
    private double field719;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "D")
    private double field727;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "Lcc;")
    private class122 field696;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method42(boolean arg0) {
        if (arg0) {
            this.field719 = 1.2996320241373387D;
        }
        ++field718;
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V", line = 15)
    public final void method36(boolean arg0) {
        if (!arg0) {
            ++field694;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V", line = 26)
    public final void method317(byte arg0) {
        super.field4718 = super.field4722 = (short) ((int) (this.field690 / 128.0D));
        super.field4717 = super.field4713 = (short) ((int) (this.field719 / 128.0D));
        int var2 = 60 / ((arg0 - -57) / 54);
        ++field706;
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.field696 != null) {
            this.field696.method962();
        }
        ++field725;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 55)
    public final void method318(int arg0) {
        ++field699;
        if (arg0 == 0) {
            if (this.field696 != null) {
                this.field696.method962();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 73)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 == 0) {
            ++field717;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lza;III)Z", line = 86)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field726;
        if (arg1 <= 121) {
            this.method42(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lza;II)Le;", line = 100)
    private final class530 method319(class491 arg0, int arg1, int arg2) {
        ++field709;
        class526 var4 = class30.field482.method2630((byte) 127, this.field705);
        int var5 = -8 / ((-80 - arg2) / 41);
        return var4.method3115(arg1, this.field723, class130.field2232, arg0, this.field728, -6415, this.field710);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)I", line = 116)
    public static final int method320(boolean arg0, int arg1) {
        if (arg0) {
            return 73;
        } else {
            ++field692;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 128)
    public final void method321(int arg0, int arg1) {
        ++field722;
        int var3 = 89 / ((-3 - arg1) / 58);
        this.field724 = true;
        this.field690 += (double) arg0 * this.field700;
        this.field719 += (double) arg0 * this.field727;
        if (!this.field713) {
            if (this.field712 == -1) {
                this.field711 += (double) arg0 * this.field707;
            } else {
                this.field711 += this.field716 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field707;
                this.field707 += (double) arg0 * this.field716;
            }
        } else {
            this.field711 = (double) (class81.method592((int) this.field690, (int) this.field719, 9251, super.field4720) + -this.field691);
        }
        this.field689 = (int) (Math.atan2(this.field700, this.field727) * 2607.5945876176133D) + 8192 & 16383;
        this.field697 = 16383 & (int) (Math.atan2(this.field707, this.field715) * 2607.5945876176133D);
        if (this.field708 != null) {
            this.field728 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field708.field2375[this.field723] <= ~this.field728) {
                            return;
                        }
                        this.field728 -= this.field708.field2375[this.field723];
                        ++this.field723;
                        if (~this.field723 <= ~this.field708.field2377.length) {
                            this.field723 -= this.field708.field2372;
                            if (~this.field723 > -1 || ~this.field708.field2377.length >= ~this.field723) {
                                this.field723 = 0;
                            }
                        }
                        this.field710 = this.field723 + 1;
                    } while (~this.field708.field2377.length < ~this.field710);
                    this.field710 -= this.field708.field2372;
                } while (~this.field710 <= -1 && ~this.field710 > ~this.field708.field2377.length);
                this.field710 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLe;Lza;)V", line = 191)
    private final void method322(byte arg0, class530 arg1, class491 arg2) {
        if (arg0 != 26) {
            this.method321(-47, 102);
        }
        ++field698;
        class345[] var4 = arg1.method777();
        class150[] var5 = arg1.method727();
        if ((this.field696 == null || this.field696.field2134) && (var4 != null || var5 != null)) {
            this.field696 = new class122(class504.field7348);
        }
        if (this.field696 != null) {
            this.field696.method960(arg2, (long) class504.field7348, var4, var5, false);
            this.field696.method971(super.field4720, super.field4718, super.field4722, super.field4717, super.field4713);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 317)
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class81.method592(arg2, arg3, 9251, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field729 = arg5;
        this.field712 = arg7;
        this.field724 = false;
        this.field688 = arg8;
        this.field713 = arg11;
        this.field721 = arg10;
        this.field714 = arg9;
        this.field702 = arg6;
        this.field705 = arg0;
        this.field691 = arg4;
        int var13 = class30.field482.method2630((byte) 99, this.field705).field7752;
        if (~var13 != 0) {
            this.field708 = class130.field2232.method634(-1271654143, var13);
        } else {
            this.field708 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 219)
    public static void method323(byte arg0) {
        field720 = null;
        if (arg0 != -3) {
            method323((byte) -15);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V", line = 232)
    public final void method324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field703;
        if (!this.field724) {
            double var6 = (double) (-super.field4716 + arg4);
            double var8 = (double) (arg2 - super.field4714);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field719 = (double) this.field688 * var8 / var10 + (double) super.field4714;
            this.field690 = (double) this.field688 * var6 / var10 + (double) super.field4716;
            if (!this.field713) {
                this.field711 = (double) super.field4728;
            } else {
                this.field711 = (double) (class81.method592((int) this.field690, (int) this.field719, 9251, super.field4720) + -this.field691);
            }
        }
        double var12 = (double) (-arg1 + this.field702 + arg3);
        this.field727 = ((double) arg2 + -this.field719) / var12;
        this.field700 = ((double) arg4 + -this.field690) / var12;
        this.field715 = Math.sqrt(this.field727 * this.field727 + this.field700 * this.field700);
        if (~this.field712 != 0) {
            if (!this.field724) {
                this.field707 = -this.field715 * Math.tan((double) this.field712 * 0.02454369D);
            }
            this.field716 = ((double) arg0 - this.field711 - this.field707 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field707 = ((double) arg0 - this.field711) / var12;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I", line = 272)
    public final int method325(int arg0) {
        ++field701;
        if (arg0 != 5) {
            this.field728 = -88;
        }
        return this.field695;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BLza;)V", line = 289)
    public final void method43(byte arg0, class491 arg1) {
        ++field704;
        if (arg0 != 35) {
            this.field727 = 0.615333938149769D;
        }
        class530 var3 = this.method319(arg1, 0, arg0 + -162);
        if (var3 != null) {
            class202 var4 = arg1.method820();
            var4.method1239(this.field697);
            var4.method1245(this.field689);
            var4.method1237((int) this.field690, (int) this.field711, (int) this.field719);
            this.field695 = var3.method726();
            this.method322((byte) 26, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(ILza;)Lsr;", line = 347)
    public final class430 method40(int arg0, class491 arg1) {
        if (arg0 >= -24) {
            return null;
        } else {
            ++field693;
            class530 var3 = this.method319(arg1, 2048, -123);
            if (var3 == null) {
                return null;
            } else {
                class202 var4 = arg1.method820();
                var4.method1239(this.field697);
                var4.method1245(this.field689);
                var4.method1237((int) this.field690, (int) this.field711, (int) this.field719);
                if (this.field696 != null) {
                    class66 var5 = this.field696.method964();
                    arg1.method853(var3, var5, var4, (class273) null, 0);
                } else {
                    var3.method736(var4, (class273) null, 0);
                }
                this.field695 = var3.method726();
                this.method322((byte) 26, var3, arg1);
                return null;
            }
        }
    }
}
