import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class23 extends class361 {

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
    private int field393 = -1;

    @OriginalMember(owner = "client!fk", name = "kb", descriptor = "I")
    private int field398 = 0;

    @OriginalMember(owner = "client!fk", name = "mb", descriptor = "I")
    private int field400 = -32768;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "Z")
    private boolean field389 = false;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    private int field373 = 0;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!fk", name = "jb", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Lqr;")
    private class15 field380;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "[I")
    public static int[] field387 = new int[13];

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "Lwe;")
    public static class24 field395 = new class24(64);

    @OriginalMember(owner = "client!fk", name = "vb", descriptor = "I")
    public static int field409 = 127;

    @OriginalMember(owner = "client!fk", name = "ub", descriptor = "[Lai;")
    public static class129[] field408 = new class129[32768];

    @OriginalMember(owner = "client!fk", name = "wb", descriptor = "[I")
    public static int[] field410 = new int[3];

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "D")
    private double field367;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "D")
    private double field371;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "D")
    private double field374;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "D")
    private double field377;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "D")
    private double field388;

    @OriginalMember(owner = "client!fk", name = "pb", descriptor = "D")
    private double field403;

    @OriginalMember(owner = "client!fk", name = "rb", descriptor = "D")
    private double field405;

    @OriginalMember(owner = "client!fk", name = "sb", descriptor = "D")
    private double field406;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!fk", name = "nb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!fk", name = "ob", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!fk", name = "qb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!fk", name = "tb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Lqp;")
    private class279 field366;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        ++field368;
        class95 var3 = this.method198(arg0, arg1, arg1 + 1365770695);
        if (var3 != null) {
            class116 var4 = arg0.method2026();
            var4.method806(this.field391);
            var4.method820(this.field399);
            var4.method802((int) this.field403, (int) this.field367, (int) this.field371);
            this.field400 = var3.method597();
            this.method192(var3, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (arg0 != 0) {
            this.method194(25);
        }
        ++field372;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method191(int arg0) {
        int var1 = -17 / ((arg0 - -64) / 56);
        field410 = null;
        field387 = null;
        field395 = null;
        field408 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 >= -116) {
            method195((byte) -78, 37);
        }
        ++field382;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lqc;Lnr;I)V")
    private final void method192(class95 arg0, class437 arg1, int arg2) {
        ++field375;
        class322[] var4 = arg0.method595();
        if (arg2 == -1) {
            class145[] var5 = arg0.method607();
            if ((this.field366 == null || this.field366.field4091) && (var4 != null || var5 != null)) {
                this.field366 = new class279(class50.field698);
            }
            if (this.field366 != null) {
                this.field366.method1790(arg1, (long) class50.field698, var4, var5, false);
                this.field366.method1793(super.field5291, super.field5296, super.field5293, super.field5288, super.field5286);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        if (arg0 != -115) {
            this.method163(-49);
        }
        ++field401;
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method193(byte arg0) {
        if (arg0 <= -38) {
            class318.field4543 = null;
            class228.field3228 = null;
            class87.field1213 = null;
            ++field369;
            class32.field533 = null;
            class170.field2248 = null;
            class213.field3016 = null;
            class101.field1360 = null;
            class24.field432 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
    public final int method194(int arg0) {
        if (arg0 > -7) {
            this.method196(false);
        }
        ++field378;
        return this.field400;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field365 = arg9;
        this.field386 = arg6;
        this.field370 = arg8;
        this.field389 = false;
        this.field397 = arg10;
        this.field383 = arg5;
        this.field392 = arg7;
        this.field396 = arg0;
        int var12 = class395.method2586(this.field396, -6861).field4924;
        if (var12 == -1) {
            this.field380 = null;
        } else {
            this.field380 = class391.method2551(var12, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V")
    public final void method134(byte arg0) {
        ++field390;
        if (arg0 >= -15) {
            method195((byte) -2, 104);
        }
        super.field5288 = super.field5286 = (short) ((int) (this.field371 / 128.0D));
        super.field5296 = super.field5293 = (short) ((int) (this.field403 / 128.0D));
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I")
    public static final int method195(byte arg0, int arg1) {
        if (arg0 <= 58) {
            return -25;
        } else {
            ++field384;
            return arg1 & 127;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public final void method196(boolean arg0) {
        if (arg0) {
            method200(94, (class265) null);
        }
        if (this.field366 != null) {
            this.field366.method1789();
        }
        ++field376;
    }

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field366 != null) {
            this.field366.method1789();
        }
        ++field404;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method197(int arg0, int arg1) {
        this.field371 += (double) arg1 * this.field406;
        if (arg0 != -1) {
            this.field403 = 1.5511744917982413D;
        }
        ++field407;
        this.field389 = true;
        if (~this.field392 == 0) {
            this.field367 += (double) arg1 * this.field405;
        } else {
            this.field367 += this.field388 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field405;
            this.field405 += (double) arg1 * this.field388;
        }
        this.field403 += (double) arg1 * this.field374;
        this.field399 = 16383 & (int) (Math.atan2(this.field374, this.field406) * 2607.5945876176133D) - -8192;
        this.field391 = (int) (2607.5945876176133D * Math.atan2(this.field405, this.field377)) & 16383;
        if (this.field380 != null) {
            this.field373 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field380.field164[this.field398] >= this.field373) {
                            return;
                        }
                        this.field373 -= this.field380.field164[this.field398];
                        ++this.field398;
                        if (~this.field380.field150.length >= ~this.field398) {
                            this.field398 -= this.field380.field174;
                            if (~this.field398 > -1 || this.field380.field150.length <= this.field398) {
                                this.field398 = 0;
                            }
                        }
                        this.field393 = this.field398 + 1;
                    } while (this.field393 < this.field380.field150.length);
                    this.field393 -= this.field380.field174;
                } while (~this.field393 <= -1 && this.field380.field150.length > this.field393);
                this.field393 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        if (arg3 <= 12) {
            this.method151((byte) 38);
        }
        ++field394;
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lnr;II)Lqc;")
    private final class95 method198(class437 arg0, int arg1, int arg2) {
        ++field385;
        if (arg2 != 1365770695) {
            method193((byte) 54);
        }
        class333 var4 = class395.method2586(this.field396, -6861);
        return var4.method2210(arg2 ^ -1365770696, this.field398, this.field373, this.field393, arg1, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field389) {
            double var6 = (double) (arg3 - super.field5284);
            double var8 = (double) (-super.field5298 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field367 = (double) super.field5297;
            this.field403 = (double) this.field370 * var6 / var10 + (double) super.field5284;
            this.field371 = (double) this.field370 * var8 / var10 + (double) super.field5298;
        }
        ++field379;
        double var12 = (double) (-arg0 + 1 + this.field386);
        this.field374 = ((double) arg3 + -this.field403) / var12;
        this.field406 = ((double) arg4 + -this.field371) / var12;
        if (arg1 == 7403) {
            this.field377 = Math.sqrt(this.field406 * this.field406 + this.field374 * this.field374);
            if (this.field392 != -1) {
                if (!this.field389) {
                    this.field405 = -this.field377 * Math.tan((double) this.field392 * 0.02454369D);
                }
                this.field388 = ((double) arg2 - this.field367 + -(this.field405 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field405 = ((double) arg2 + -this.field367) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field402;
        class95 var3 = this.method198(arg0, 1024, 1365770695);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method806(this.field391);
            var4.method820(this.field399);
            var4.method802((int) this.field403, (int) this.field367, (int) this.field371);
            if (this.field366 != null) {
                class125 var5 = this.field366.method1783();
                arg0.method2162(var3, var5, var4, (class206) null, 0);
            } else {
                var3.method602(var4, (class206) null, 0);
            }
            this.field400 = var3.method597();
            this.method192(var3, arg0, -1);
            if (arg1) {
                this.method159(-2, (class437) null, 26, -62);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILil;)Luq;")
    public static final class234 method200(int arg0, class265 arg1) {
        ++field381;
        if (arg0 != 0) {
            field387 = null;
        }
        return new class234(arg1.method1698(arg0 + 1625554944), arg1.method1698(1625554944), arg1.method1698(1625554944), arg1.method1698(1625554944), arg1.method1691(false), arg1.method1691(false), arg1.method1697(54));
    }
}
