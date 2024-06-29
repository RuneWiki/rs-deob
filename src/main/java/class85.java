import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class97 {

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
    public boolean field2017 = false;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Z")
    public boolean field2024;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
    private int[] field2019;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
    private int[] field2020;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
    private int[] field2026;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
    private int[] field2018;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "[I")
    public int[] field2025;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
    private static int[] field2023;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public static void method612() {
        field2023 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method613(int arg0) {
        if (this.field2025 == null) {
            return;
        }
        if (this.field2016 == 1 || this.field2016 == 3) {
            if (field2023 == null || field2023.length < this.field2025.length) {
                field2023 = new int[this.field2025.length];
            }
            short var2;
            if (this.field2025.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2025.length / 4;
            int var4 = arg0 * var2 * this.field2022;
            int var5 = var3 - 1;
            if (this.field2016 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2023[var6] = this.field2025[var17];
                field2023[var3 + var6] = this.field2025[var3 + var17];
                field2023[var3 + var6 + var3] = this.field2025[var3 + var17 + var3];
                field2023[var3 + var6 + var3 + var3] = this.field2025[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2025;
            this.field2025 = field2023;
            field2023 = var7;
        }
        if (this.field2016 != 2 && this.field2016 != 4) {
            return;
        }
        if (field2023 == null || field2023.length < this.field2025.length) {
            field2023 = new int[this.field2025.length];
        }
        short var8;
        if (this.field2025.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2025.length / 4;
        int var10 = this.field2022 * arg0;
        int var11 = var8 - 1;
        if (this.field2016 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2023[var15] = this.field2025[var16];
                field2023[var9 + var15] = this.field2025[var9 + var16];
                field2023[var9 + var15 + var9] = this.field2025[var9 + var16 + var9];
                field2023[var9 + var15 + var9 + var9] = this.field2025[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2025;
        this.field2025 = field2023;
        field2023 = var13;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(DILff;)Z")
    public final boolean method614(double arg0, int arg1, class42 arg2) {
        for (int var5 = 0; var5 < this.field2019.length; var5++) {
            if (arg2.method309(true, this.field2019[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2025 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2019.length; var7++) {
            class114 var10 = class146.method1091(81, this.field2019[var7], arg2);
            var10.method804();
            byte[] var11 = var10.field2649;
            int[] var12 = var10.field2654;
            int var13 = this.field2018[var7];
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
                var12[var19] = class60.method453(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2020[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2653 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2025[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2653 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2025[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2653 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2025[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2025[var8] &= 0xF8F8FF;
            int var9 = this.field2025[var8];
            this.field2025[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2025[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2025[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
    public final void method615() {
        this.field2025 = null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lwb;)V")
    public class85(class148 arg0) {
        this.field2021 = arg0.method1140(-1);
        this.field2024 = arg0.method1137(255) == 1;
        int var2 = arg0.method1137(255);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2019 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2019[var3] = arg0.method1140(-1);
        }
        if (var2 > 1) {
            this.field2020 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2020[var4] = arg0.method1137(255);
            }
        }
        if (var2 > 1) {
            this.field2026 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2026[var5] = arg0.method1137(255);
            }
        }
        this.field2018 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2018[var6] = arg0.method1104(true);
        }
        this.field2016 = arg0.method1137(255);
        this.field2022 = arg0.method1137(255);
        this.field2025 = null;
    }
}
