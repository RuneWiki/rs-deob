import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 extends class82 {

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "Z")
    public boolean field2204 = false;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "Z")
    public boolean field2201;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "[I")
    private int[] field2202;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "[I")
    private int[] field2198;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "[I")
    private int[] field2196;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "[I")
    private int[] field2203;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    private int field2200;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "[I")
    public int[] field2197;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "[I")
    private static int[] field2199;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 4)
    public final void method765(int arg0) {
        if (this.field2197 == null) {
            return;
        }
        if (this.field2194 == 1 || this.field2194 == 3) {
            if (field2199 == null || field2199.length < this.field2197.length) {
                field2199 = new int[this.field2197.length];
            }
            short var2;
            if (this.field2197.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2197.length / 4;
            int var4 = arg0 * var2 * this.field2200;
            int var5 = var3 - 1;
            if (this.field2194 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2199[var6] = this.field2197[var17];
                field2199[var3 + var6] = this.field2197[var3 + var17];
                field2199[var3 + var6 + var3] = this.field2197[var3 + var17 + var3];
                field2199[var3 + var6 + var3 + var3] = this.field2197[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2197;
            this.field2197 = field2199;
            field2199 = var7;
        }
        if (this.field2194 != 2 && this.field2194 != 4) {
            return;
        }
        if (field2199 == null || field2199.length < this.field2197.length) {
            field2199 = new int[this.field2197.length];
        }
        short var8;
        if (this.field2197.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2197.length / 4;
        int var10 = this.field2200 * arg0;
        int var11 = var8 - 1;
        if (this.field2194 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2199[var15] = this.field2197[var16];
                field2199[var9 + var15] = this.field2197[var9 + var16];
                field2199[var9 + var15 + var9] = this.field2197[var9 + var16 + var9];
                field2199[var9 + var15 + var9 + var9] = this.field2197[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2197;
        this.field2197 = field2199;
        field2199 = var13;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(DILbd;)Z", line = 106)
    public final boolean method766(double arg0, int arg1, class11 arg2) {
        for (int var5 = 0; var5 < this.field2202.length; var5++) {
            if (arg2.method239((byte) 93, this.field2202[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2197 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2202.length; var7++) {
            class25 var10 = class54.method536(2, arg2, this.field2202[var7]);
            var10.method332();
            byte[] var11 = var10.field749;
            int[] var12 = var10.field746;
            int var13 = this.field2203[var7];
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class27.method362(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2198[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field745 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2197[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field745 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2197[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field745 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2197[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2197[var8] &= 0xF8F8FF;
            int var9 = this.field2197[var8];
            this.field2197[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2197[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2197[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 288)
    public final void method767() {
        this.field2197 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V", line = 293)
    public static void method768() {
        field2199 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lba;)V", line = 300)
    public class90(class8 arg0) {
        this.field2195 = arg0.method146(65280);
        this.field2201 = arg0.method145(false) == 1;
        int var2 = arg0.method145(false);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2202 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2202[var3] = arg0.method146(65280);
        }
        if (var2 > 1) {
            this.field2198 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2198[var4] = arg0.method145(false);
            }
        }
        if (var2 > 1) {
            this.field2196 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2196[var5] = arg0.method145(false);
            }
        }
        this.field2203 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2203[var6] = arg0.method168(-4750);
        }
        this.field2194 = arg0.method145(false);
        this.field2200 = arg0.method145(false);
        this.field2197 = null;
    }
}
