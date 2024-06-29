import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class116 {

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    public boolean field3175 = false;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Z")
    public boolean field3182;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
    private int[] field3177;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "[I")
    private int[] field3179;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[I")
    private int[] field3178;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "[I")
    public int[] field3181;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "[I")
    private static int[] field3180;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method1086(int arg0) {
        if (this.field3181 == null) {
            return;
        }
        if (this.field3172 == 1 || this.field3172 == 3) {
            if (field3180 == null || field3180.length < this.field3181.length) {
                field3180 = new int[this.field3181.length];
            }
            short var2;
            if (this.field3181.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field3181.length;
            int var4 = arg0 * var2 * this.field3176;
            int var5 = var3 - 1;
            if (this.field3172 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field3180[var6] = this.field3181[var17];
            }
            int[] var7 = this.field3181;
            this.field3181 = field3180;
            field3180 = var7;
        }
        if (this.field3172 != 2 && this.field3172 != 4) {
            return;
        }
        if (field3180 == null || field3180.length < this.field3181.length) {
            field3180 = new int[this.field3181.length];
        }
        short var8;
        if (this.field3181.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field3181.length;
        int var10 = this.field3176 * arg0;
        int var11 = var8 - 1;
        if (this.field3172 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field3180[var15] = this.field3181[var16];
            }
        }
        int[] var13 = this.field3181;
        this.field3181 = field3180;
        field3180 = var13;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method1087() {
        this.field3181 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(DILdd;)Z")
    public final boolean method1088(double arg0, int arg1, class26 arg2) {
        for (int var5 = 0; var5 < this.field3173.length; var5++) {
            if (arg2.method202(this.field3173[var5], 92) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field3181 = new int[var6];
        for (int var7 = 0; var7 < this.field3173.length; var7++) {
            class20 var8 = class159.method1224(this.field3173[var7], arg2, -112);
            var8.method114();
            byte[] var9 = var8.field437;
            int[] var10 = var8.field441;
            int var11 = this.field3178[var7];
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class11.method52(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field3177[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field440 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field3181[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field440 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field3181[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field440 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field3181[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public static void method1089() {
        field3180 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lwd;)V")
    public class146(class157 arg0) {
        this.field3174 = arg0.method1161((byte) 60);
        this.field3182 = arg0.method1194(false) == 1;
        int var2 = arg0.method1194(false);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field3173 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field3173[var3] = arg0.method1161((byte) 60);
        }
        if (var2 > 1) {
            this.field3177 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field3177[var4] = arg0.method1194(false);
            }
        }
        if (var2 > 1) {
            this.field3179 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field3179[var5] = arg0.method1194(false);
            }
        }
        this.field3178 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3178[var6] = arg0.method1175((byte) -109);
        }
        this.field3172 = arg0.method1194(false);
        this.field3176 = arg0.method1194(false);
        this.field3181 = null;
    }
}
