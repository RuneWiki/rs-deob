import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 extends class136 {

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    private int field127 = 0;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    private int field132 = -32768;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    private int field155 = 0;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Lwb;")
    private class236 field128;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "Lmb;")
    public static class132 field149 = class166.method1092("Ihr Charakter)2Profil wird in:", 120);

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "Lmb;")
    public static class132 field147 = null;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field152 = -1;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "[Lfi;")
    public static class65[] field145 = new class65[32768];

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "D")
    private double field122;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "D")
    public double field125;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "D")
    private double field131;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "D")
    public double field135;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "D")
    public double field137;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "D")
    private double field143;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "D")
    private double field148;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "D")
    private double field154;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class221 var11 = this.method53((byte) -127);
        field139++;
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field132 = var11.method55();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Lug;")
    private final class221 method53(byte arg0) {
        field151++;
        class217 var2 = class108.method689(this.field142, 1);
        class221 var3 = var2.method1353((byte) 104, this.field155);
        if (var3 == null) {
            return null;
        }
        var3.method1389(this.field121);
        if (arg0 > -110) {
            this.field146 = -94;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field140++;
        if (!this.field150) {
            double var6 = (double) (arg1 - this.field124);
            double var8 = (double) (arg4 - this.field136);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field137 = (double) this.field129 * var6 / var10 + (double) this.field124;
            this.field125 = this.field156;
            this.field135 = (double) this.field129 * var8 / var10 + (double) this.field136;
        }
        double var12 = (double) (this.field146 + arg0 - arg2);
        this.field122 = ((double) arg4 - this.field135) / var12;
        this.field143 = ((double) arg1 - this.field137) / var12;
        this.field131 = Math.sqrt(this.field143 * this.field143 + this.field122 * this.field122);
        if (!this.field150) {
            this.field148 = -this.field131 * Math.tan((double) this.field126 * 0.02454369D);
        }
        this.field154 = ((double) arg3 - this.field125 - this.field148 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
    public final int method55() {
        field130++;
        return this.field132;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
    public final void method56(boolean arg0, int arg1) {
        this.field135 += (double) arg1 * this.field122;
        field123++;
        this.field137 += (double) arg1 * this.field143;
        this.field150 = true;
        this.field125 += this.field154 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field148;
        this.field148 += (double) arg1 * this.field154;
        this.field133 = (int) (Math.atan2(this.field143, this.field122) * 325.949D) + 1024 & 0x7FF;
        if (!arg0) {
            return;
        }
        this.field121 = (int) (Math.atan2(this.field148, this.field131) * 325.949D) & 0x7FF;
        if (this.field128 == null) {
            return;
        }
        this.field127 += arg1;
        while (true) {
            do {
                do {
                    if (this.field128.field4253[this.field155] >= this.field127) {
                        return;
                    }
                    this.field127 -= this.field128.field4253[this.field155];
                    this.field155++;
                } while (this.field128.field4274.length > this.field155);
                this.field155 -= this.field128.field4265;
            } while (this.field155 >= 0 && this.field155 < this.field128.field4274.length);
            this.field155 = 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public static void method57(byte arg0) {
        field149 = null;
        field147 = null;
        if (arg0 >= 41) {
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field126 = arg7;
        this.field142 = arg0;
        this.field141 = arg9;
        this.field144 = arg10;
        this.field153 = arg5;
        this.field136 = arg3;
        this.field124 = arg2;
        this.field129 = arg8;
        this.field138 = arg1;
        this.field150 = false;
        this.field156 = arg4;
        this.field146 = arg6;
        int var12 = class108.method689(this.field142, 1).field3979;
        if (var12 == -1) {
            this.field128 = null;
        } else {
            this.field128 = class99.method619(var12, 4);
        }
    }
}
