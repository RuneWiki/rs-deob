import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class14 extends class60 {

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    private int field191 = -1;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    private int field189 = 0;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    private int field218 = 0;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    private int field205 = -32768;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "Z")
    private boolean field224 = false;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Lel;")
    private class77 field222;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field198 = 0;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "D")
    private double field194;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "D")
    private double field201;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "D")
    private double field202;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "D")
    public double field204;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "D")
    private double field207;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "D")
    public double field208;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "D")
    private double field210;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "D")
    public double field219;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Lpj;")
    private class98 field215;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "[[I")
    public static int[][] field209;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIZ)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!this.field224) {
            double var6 = (double) (arg0 - this.field203);
            double var8 = (double) (arg3 - this.field221);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field204 = (double) this.field223 * var6 / var10 + (double) this.field203;
            this.field208 = (double) this.field217;
            this.field219 = (double) this.field223 * var8 / var10 + (double) this.field221;
        }
        field199++;
        if (arg4) {
            this.field202 = -1.3985365800261167D;
        }
        double var12 = (double) (this.field190 + 1 - arg2);
        this.field210 = ((double) arg0 - this.field204) / var12;
        this.field194 = ((double) arg3 - this.field219) / var12;
        this.field201 = Math.sqrt(this.field210 * this.field210 + this.field194 * this.field194);
        if (this.field193 == -1) {
            this.field207 = ((double) arg1 - this.field208) / var12;
        } else {
            if (!this.field224) {
                this.field207 = -this.field201 * Math.tan((double) this.field193 * 0.02454369D);
            }
            this.field202 = ((double) arg1 - this.field208 - this.field207 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public final void method94(byte arg0, int arg1) {
        field216++;
        this.field204 += (double) arg1 * this.field210;
        this.field224 = true;
        if (this.field193 == -1) {
            this.field208 += (double) arg1 * this.field207;
        } else {
            this.field208 += this.field202 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field207;
            this.field207 += (double) arg1 * this.field202;
        }
        this.field219 += (double) arg1 * this.field194;
        this.field225 = (int) (Math.atan2(this.field194, this.field210) * 325.949D) + 1024 & 0x7FF;
        this.field192 = (int) (Math.atan2(this.field207, this.field201) * 325.949D) & 0x7FF;
        if (arg0 <= 26 || this.field222 == null) {
            return;
        }
        this.field189 += arg1;
        while (true) {
            do {
                do {
                    if (this.field189 <= this.field222.field1282[this.field218]) {
                        return;
                    }
                    this.field189 -= this.field222.field1282[this.field218];
                    this.field218++;
                    if (this.field218 >= this.field222.field1256.length) {
                        this.field218 -= this.field222.field1260;
                        if (this.field218 < 0 || this.field222.field1256.length <= this.field218) {
                            this.field218 = 0;
                        }
                    }
                    this.field191 = this.field218 + 1;
                } while (this.field222.field1256.length > this.field191);
                this.field191 -= this.field222.field1260;
            } while (this.field191 >= 0 && this.field222.field1256.length > this.field191);
            this.field191 = -1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Lpb;")
    private final class168 method95(int arg0) {
        class281 var2 = class35.method298(this.field213, false);
        class168 var3 = var2.method1888((byte) 36, this.field189, this.field218, this.field191);
        field195++;
        if (arg0 != 1) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            var3.method350(this.field192);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method96(byte arg0) {
        if (arg0 != -109) {
            field220 = -77;
        }
        field209 = null;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)I")
    public static final int method97(int arg0) {
        field197++;
        if (arg0 != 3085) {
            field220 = -34;
        }
        return class6.field73;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        field214++;
        class168 var13 = this.method95(1);
        if (var13 != null) {
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field215);
            this.field205 = var13.method99();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public final int method99() {
        field188++;
        return this.field205;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field211++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public static final int method101(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        field187++;
        if (arg1 != -18851) {
            return -62;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field203 = arg3;
        this.field217 = arg4;
        this.field196 = arg9;
        this.field190 = arg6;
        this.field221 = arg2;
        this.field213 = arg0;
        this.field223 = arg8;
        this.field224 = false;
        this.field212 = arg1;
        this.field206 = arg10;
        this.field193 = arg7;
        this.field200 = arg5;
        int var12 = class35.method298(this.field213, false).field4455;
        if (var12 == -1) {
            this.field222 = null;
        } else {
            this.field222 = class28.method246(-18, var12);
        }
    }
}
