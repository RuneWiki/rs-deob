import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class83 extends class68 {

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Z")
    public boolean field2031 = false;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Z")
    public boolean field2026;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "[I")
    private int[] field2023;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    private int[] field2032;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
    private int[] field2030;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "[I")
    private int[] field2022;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "[I")
    public int[] field2028;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
    private static int[] field2025;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(DILbf;)Z", line = 7)
    public final boolean method711(double arg0, int arg1, class14 arg2) {
        for (int var5 = 0; var5 < this.field2023.length; var5++) {
            if (arg2.method161(this.field2023[var5], true) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2028 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2023.length; var7++) {
            class128 var10 = class87.method740(arg2, -84, this.field2023[var7]);
            var10.method1038();
            byte[] var11 = var10.field3109;
            int[] var12 = var10.field3108;
            int var13 = this.field2022[var7];
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
                var12[var19] = class29.method264(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2032[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field3103 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2028[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field3103 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2028[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field3103 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2028[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2028[var8] &= 0xF8F8FF;
            int var9 = this.field2028[var8];
            this.field2028[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2028[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2028[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 183)
    public final void method712() {
        this.field2028 = null;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 187)
    public final void method713(int arg0) {
        if (this.field2028 == null) {
            return;
        }
        if (this.field2027 == 1 || this.field2027 == 3) {
            if (field2025 == null || field2025.length < this.field2028.length) {
                field2025 = new int[this.field2028.length];
            }
            short var2;
            if (this.field2028.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2028.length / 4;
            int var4 = arg0 * var2 * this.field2024;
            int var5 = var3 - 1;
            if (this.field2027 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2025[var6] = this.field2028[var17];
                field2025[var3 + var6] = this.field2028[var3 + var17];
                field2025[var3 + var6 + var3] = this.field2028[var3 + var17 + var3];
                field2025[var3 + var6 + var3 + var3] = this.field2028[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2028;
            this.field2028 = field2025;
            field2025 = var7;
        }
        if (this.field2027 != 2 && this.field2027 != 4) {
            return;
        }
        if (field2025 == null || field2025.length < this.field2028.length) {
            field2025 = new int[this.field2028.length];
        }
        short var8;
        if (this.field2028.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2028.length / 4;
        int var10 = this.field2024 * arg0;
        int var11 = var8 - 1;
        if (this.field2027 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2025[var15] = this.field2028[var16];
                field2025[var9 + var15] = this.field2028[var9 + var16];
                field2025[var9 + var15 + var9] = this.field2028[var9 + var16 + var9];
                field2025[var9 + var15 + var9 + var9] = this.field2028[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2028;
        this.field2028 = field2025;
        field2025 = var13;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 292)
    public static void method714() {
        field2025 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lm;)V", line = 300)
    public class83(class77 arg0) {
        this.field2029 = arg0.method636(-29);
        this.field2026 = arg0.method620((byte) -8) == 1;
        int var2 = arg0.method620((byte) -8);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2023 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2023[var3] = arg0.method636(118);
        }
        if (var2 > 1) {
            this.field2032 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2032[var4] = arg0.method620((byte) -8);
            }
        }
        if (var2 > 1) {
            this.field2030 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2030[var5] = arg0.method620((byte) -8);
            }
        }
        this.field2022 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2022[var6] = arg0.method647((byte) -72);
        }
        this.field2027 = arg0.method620((byte) -8);
        this.field2024 = arg0.method620((byte) -8);
        this.field2028 = null;
    }
}
