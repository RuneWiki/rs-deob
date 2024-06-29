import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 extends class128 {

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
    public boolean field2886 = false;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Z")
    public boolean field2889;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "[I")
    private int[] field2896;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[I")
    private int[] field2888;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "[I")
    private int[] field2887;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "[I")
    private int[] field2893;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
    public int[] field2890;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "[I")
    private static int[] field2892;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(DILie;)Z")
    public final boolean method986(double arg0, int arg1, class61 arg2) {
        for (int var5 = 0; var5 < this.field2896.length; var5++) {
            if (arg2.method463(-16977, this.field2896[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2890 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2896.length; var7++) {
            class29 var10 = class67.method511(-3514, arg2, this.field2896[var7]);
            var10.method225();
            byte[] var11 = var10.field693;
            int[] var12 = var10.field691;
            int var13 = this.field2893[var7];
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
                var12[var19] = class127.method1004(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2888[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field698 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2890[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field698 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2890[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field698 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2890[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2890[var8] &= 0xF8F8FF;
            int var9 = this.field2890[var8];
            this.field2890[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2890[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2890[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method987(int arg0) {
        if (this.field2890 == null) {
            return;
        }
        if (this.field2891 == 1 || this.field2891 == 3) {
            if (field2892 == null || field2892.length < this.field2890.length) {
                field2892 = new int[this.field2890.length];
            }
            short var2;
            if (this.field2890.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2890.length / 4;
            int var4 = arg0 * var2 * this.field2895;
            int var5 = var3 - 1;
            if (this.field2891 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2892[var6] = this.field2890[var17];
                field2892[var3 + var6] = this.field2890[var3 + var17];
                field2892[var3 + var6 + var3] = this.field2890[var3 + var17 + var3];
                field2892[var3 + var6 + var3 + var3] = this.field2890[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2890;
            this.field2890 = field2892;
            field2892 = var7;
        }
        if (this.field2891 != 2 && this.field2891 != 4) {
            return;
        }
        if (field2892 == null || field2892.length < this.field2890.length) {
            field2892 = new int[this.field2890.length];
        }
        short var8;
        if (this.field2890.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2890.length / 4;
        int var10 = this.field2895 * arg0;
        int var11 = var8 - 1;
        if (this.field2891 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2892[var15] = this.field2890[var16];
                field2892[var9 + var15] = this.field2890[var9 + var16];
                field2892[var9 + var15 + var9] = this.field2890[var9 + var16 + var9];
                field2892[var9 + var15 + var9 + var9] = this.field2890[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2890;
        this.field2890 = field2892;
        field2892 = var13;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public static void method988() {
        field2892 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
    public final void method989() {
        this.field2890 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lof;)V")
    public class126(class103 arg0) {
        this.field2894 = arg0.method808(-20054);
        this.field2889 = arg0.method829((byte) 65) == 1;
        int var2 = arg0.method829((byte) 61);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2896 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2896[var3] = arg0.method808(-20054);
        }
        if (var2 > 1) {
            this.field2888 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2888[var4] = arg0.method829((byte) -122);
            }
        }
        if (var2 > 1) {
            this.field2887 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2887[var5] = arg0.method829((byte) -114);
            }
        }
        this.field2893 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2893[var6] = arg0.method803(false);
        }
        this.field2891 = arg0.method829((byte) 46);
        this.field2895 = arg0.method829((byte) -108);
        this.field2890 = null;
    }
}
