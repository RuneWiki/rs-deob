import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class12 {

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Z")
    public boolean field2057 = false;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Z")
    public boolean field2053;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
    private int[] field2054;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[I")
    private int[] field2052;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
    private int[] field2058;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "[I")
    private int[] field2060;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "[I")
    public int[] field2061;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[I")
    private static int[] field2055;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public final void method787() {
        this.field2061 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method788(int arg0) {
        if (this.field2061 == null) {
            return;
        }
        if (this.field2051 == 1 || this.field2051 == 3) {
            if (field2055 == null || field2055.length < this.field2061.length) {
                field2055 = new int[this.field2061.length];
            }
            short var2;
            if (this.field2061.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2061.length;
            int var4 = arg0 * var2 * this.field2056;
            int var5 = var3 - 1;
            if (this.field2051 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2055[var6] = this.field2061[var17];
            }
            int[] var7 = this.field2061;
            this.field2061 = field2055;
            field2055 = var7;
        }
        if (this.field2051 != 2 && this.field2051 != 4) {
            return;
        }
        if (field2055 == null || field2055.length < this.field2061.length) {
            field2055 = new int[this.field2061.length];
        }
        short var8;
        if (this.field2061.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2061.length;
        int var10 = this.field2056 * arg0;
        int var11 = var8 - 1;
        if (this.field2051 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2055[var15] = this.field2061[var16];
            }
        }
        int[] var13 = this.field2061;
        this.field2061 = field2055;
        field2055 = var13;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(DILna;)Z")
    public final boolean method789(double arg0, int arg1, class91 arg2) {
        for (int var5 = 0; var5 < this.field2054.length; var5++) {
            if (arg2.method762(this.field2054[var5], false) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2061 = new int[var6];
        for (int var7 = 0; var7 < this.field2054.length; var7++) {
            class69 var8 = class42.method388(arg2, (byte) -80, this.field2054[var7]);
            var8.method540();
            byte[] var9 = var8.field1384;
            int[] var10 = var8.field1388;
            int var11 = this.field2060[var7];
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
                var10[var17] = class105.method845(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2052[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field1386 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2061[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1386 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2061[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1386 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2061[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
    public static void method790() {
        field2055 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lbe;)V")
    public class96(class13 arg0) {
        this.field2059 = arg0.method105(1375221240);
        this.field2053 = arg0.method142(27467) == 1;
        int var2 = arg0.method142(27467);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2054 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2054[var3] = arg0.method105(1375221240);
        }
        if (var2 > 1) {
            this.field2052 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2052[var4] = arg0.method142(27467);
            }
        }
        if (var2 > 1) {
            this.field2058 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2058[var5] = arg0.method142(27467);
            }
        }
        this.field2060 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2060[var6] = arg0.method112(false);
        }
        this.field2051 = arg0.method142(27467);
        this.field2056 = arg0.method142(27467);
        this.field2061 = null;
    }
}
