import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 extends class176 {

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    private int field1193 = -32768;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Z")
    private boolean field1198 = false;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    private int field1195 = 0;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    private int field1194 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "Lqg;")
    private class129 field1208;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[I")
    public static int[] field1192 = new int[128];

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "[I")
    public static int[] field1185 = new int[100];

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Ltl;")
    public static class59 field1181 = class85.method639("zap", 9588);

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Ltl;")
    public static class59 field1209 = class85.method639("Suche nach Updates )2 ", 9588);

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Ltl;")
    public static class59 field1186 = class85.method639("Opened titlescreen)3", 9588);

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field1215 = 5063219;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "D")
    private double field1182;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "D")
    public double field1183;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "D")
    public double field1189;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "D")
    private double field1190;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "D")
    public double field1199;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "D")
    private double field1213;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "D")
    private double field1214;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "D")
    private double field1216;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lca;", line = 7)
    private final class57 method594(int arg0) {
        int var2 = -30 % ((arg0 + 25) / 35);
        field1210++;
        class310 var3 = class221.method1533(this.field1212, (byte) -44);
        class57 var4 = var3.method2141(0, this.field1195);
        if (var4 == null) {
            return null;
        } else {
            var4.method428(this.field1211);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V", line = 34)
    public final void method595(byte arg0, int arg1) {
        this.field1189 += this.field1190 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1182;
        this.field1199 += (double) arg1 * this.field1214;
        this.field1182 += (double) arg1 * this.field1190;
        this.field1183 += (double) arg1 * this.field1213;
        field1180++;
        if (arg0 <= 33) {
            this.field1199 = 0.8370981785804577D;
        }
        this.field1198 = true;
        this.field1188 = (int) (Math.atan2(this.field1214, this.field1213) * 325.949D) + 1024 & 0x7FF;
        this.field1211 = (int) (Math.atan2(this.field1182, this.field1216) * 325.949D) & 0x7FF;
        if (this.field1208 == null) {
            return;
        }
        this.field1194 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1208.field2132[this.field1195] >= this.field1194) {
                        return;
                    }
                    this.field1194 -= this.field1208.field2132[this.field1195];
                    this.field1195++;
                } while (this.field1195 < this.field1208.field2118.length);
                this.field1195 -= this.field1208.field2114;
            } while (this.field1195 >= 0 && this.field1195 < this.field1208.field2118.length);
            this.field1195 = 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 81)
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1197++;
        if (!this.field1198) {
            double var6 = (double) (arg3 - this.field1207);
            double var8 = (double) (arg4 - this.field1202);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1183 = (double) this.field1191 * var8 / var10 + (double) this.field1202;
            this.field1189 = (double) this.field1203;
            this.field1199 = (double) this.field1191 * var6 / var10 + (double) this.field1207;
        }
        double var12 = (double) (this.field1204 + 1 - arg1);
        this.field1213 = ((double) arg4 - this.field1183) / var12;
        this.field1214 = ((double) arg3 - this.field1199) / var12;
        if (arg0 != -17427) {
            this.field1190 = 0.06763297677522118D;
        }
        this.field1216 = Math.sqrt(this.field1214 * this.field1214 + this.field1213 * this.field1213);
        if (!this.field1198) {
            this.field1182 = -this.field1216 * Math.tan((double) this.field1184 * 0.02454369D);
        }
        this.field1190 = ((double) arg2 - this.field1189 - this.field1182 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 225)
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1191 = arg8;
        this.field1212 = arg0;
        this.field1206 = arg10;
        this.field1207 = arg2;
        this.field1198 = false;
        this.field1184 = arg7;
        this.field1200 = arg5;
        this.field1201 = arg9;
        this.field1196 = arg1;
        this.field1203 = arg4;
        this.field1204 = arg6;
        this.field1202 = arg3;
        int var12 = class221.method1533(this.field1212, (byte) -44).field5250;
        if (var12 == -1) {
            this.field1208 = null;
        } else {
            this.field1208 = class265.method1834((byte) -39, var12);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 138)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1205++;
        class57 var11 = this.method594(80);
        if (var11 != null) {
            var11.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1193 = var11.method152();
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 189)
    public static void method597(int arg0) {
        field1209 = null;
        field1186 = null;
        field1185 = null;
        field1181 = null;
        if (arg0 >= -4) {
            field1209 = (class59) null;
        }
        field1192 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I", line = 206)
    public final int method152() {
        field1187++;
        return this.field1193;
    }
}
