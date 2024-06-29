import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 extends class99 {

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
    public boolean field506 = false;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "Z")
    public boolean field513;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
    private int[] field508;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "[I")
    private int[] field505;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "[I")
    private int[] field514;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "[I")
    private static int[] field512;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public final void method190() {
        this.field515 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
    public static void method191() {
        field512 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (this.field515 == null) {
            return;
        }
        if (this.field507 == 1 || this.field507 == 3) {
            if (field512 == null || field512.length < this.field515.length) {
                field512 = new int[this.field515.length];
            }
            short var2;
            if (this.field515.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field515.length;
            int var4 = arg0 * var2 * this.field510;
            int var5 = var3 - 1;
            if (this.field507 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field512[var6] = this.field515[var17];
            }
            int[] var7 = this.field515;
            this.field515 = field512;
            field512 = var7;
        }
        if (this.field507 != 2 && this.field507 != 4) {
            return;
        }
        if (field512 == null || field512.length < this.field515.length) {
            field512 = new int[this.field515.length];
        }
        short var8;
        if (this.field515.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field515.length;
        int var10 = this.field510 * arg0;
        int var11 = var8 - 1;
        if (this.field507 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field512[var15] = this.field515[var16];
            }
        }
        int[] var13 = this.field515;
        this.field515 = field512;
        field512 = var13;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(DILff;)Z")
    public final boolean method193(double arg0, int arg1, class42 arg2) {
        for (int var5 = 0; var5 < this.field511.length; var5++) {
            if (arg2.method337(this.field511[var5], -81) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field515 = new int[var6];
        for (int var7 = 0; var7 < this.field511.length; var7++) {
            class90 var8 = class92.method737(this.field511[var7], 0, arg2);
            var8.method720();
            byte[] var9 = var8.field2155;
            int[] var10 = var8.field2160;
            int var11 = this.field514[var7];
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
                var10[var17] = class58.method514(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field508[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field2159 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field515[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field2159 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field515[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field2159 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field515[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lpa;)V")
    public class21(class105 arg0) {
        this.field509 = arg0.method838((byte) 5);
        this.field513 = arg0.method831((byte) 76) == 1;
        int var2 = arg0.method831((byte) 76);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field511 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field511[var3] = arg0.method838((byte) 5);
        }
        if (var2 > 1) {
            this.field508 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field508[var4] = arg0.method831((byte) 76);
            }
        }
        if (var2 > 1) {
            this.field505 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field505[var5] = arg0.method831((byte) 76);
            }
        }
        this.field514 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field514[var6] = arg0.method821((byte) 96);
        }
        this.field507 = arg0.method831((byte) 76);
        this.field510 = arg0.method831((byte) 76);
        this.field515 = null;
    }
}
