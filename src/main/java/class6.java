import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class141 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Z")
    public boolean field196 = false;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
    public boolean field198;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
    private int[] field204;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
    public int[] field197;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
    private static int[] field202;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public final void method26() {
        this.field197 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
    public static void method27() {
        field202 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(DILq;)Z")
    public final boolean method28(double arg0, int arg1, class111 arg2) {
        for (int var5 = 0; var5 < this.field195.length; var5++) {
            if (arg2.method884(this.field195[var5], -6) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field197 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field195.length; var7++) {
            class27 var10 = class140.method1141(this.field195[var7], arg2, (byte) -27);
            var10.method213();
            byte[] var11 = var10.field771;
            int[] var12 = var10.field773;
            int var13 = this.field199[var7];
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
                var12[var19] = class29.method236(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field204[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field772 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field197[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field772 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field197[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field772 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field197[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field197[var8] &= 0xF8F8FF;
            int var9 = this.field197[var8];
            this.field197[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field197[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field197[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method29(int arg0) {
        if (this.field197 == null) {
            return;
        }
        if (this.field203 == 1 || this.field203 == 3) {
            if (field202 == null || field202.length < this.field197.length) {
                field202 = new int[this.field197.length];
            }
            short var2;
            if (this.field197.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field197.length / 4;
            int var4 = arg0 * var2 * this.field194;
            int var5 = var3 - 1;
            if (this.field203 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field202[var6] = this.field197[var17];
                field202[var3 + var6] = this.field197[var3 + var17];
                field202[var3 + var6 + var3] = this.field197[var3 + var17 + var3];
                field202[var3 + var6 + var3 + var3] = this.field197[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field197;
            this.field197 = field202;
            field202 = var7;
        }
        if (this.field203 != 2 && this.field203 != 4) {
            return;
        }
        if (field202 == null || field202.length < this.field197.length) {
            field202 = new int[this.field197.length];
        }
        short var8;
        if (this.field197.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field197.length / 4;
        int var10 = this.field194 * arg0;
        int var11 = var8 - 1;
        if (this.field203 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field202[var15] = this.field197[var16];
                field202[var9 + var15] = this.field197[var9 + var16];
                field202[var9 + var15 + var9] = this.field197[var9 + var16 + var9];
                field202[var9 + var15 + var9 + var9] = this.field197[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field197;
        this.field197 = field202;
        field202 = var13;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lqc;)V")
    public class6(class114 arg0) {
        this.field200 = arg0.method944((byte) 120);
        this.field198 = arg0.method957((byte) 95) == 1;
        int var2 = arg0.method957((byte) 20);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field195 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field195[var3] = arg0.method944((byte) 119);
        }
        if (var2 > 1) {
            this.field204 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field204[var4] = arg0.method957((byte) 88);
            }
        }
        if (var2 > 1) {
            this.field201 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field201[var5] = arg0.method957((byte) 66);
            }
        }
        this.field199 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field199[var6] = arg0.method973(-120);
        }
        this.field203 = arg0.method957((byte) 41);
        this.field194 = arg0.method957((byte) 110);
        this.field197 = null;
    }
}
