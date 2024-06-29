import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 extends class65 {

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
    public boolean field1051 = false;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Z")
    public boolean field1050;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "[I")
    private int[] field1052;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
    private int[] field1046;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
    private int[] field1044;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[I")
    private int[] field1053;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "[I")
    public int[] field1054;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "[I")
    private static int[] field1048;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(DILpb;)Z", line = 12)
    public final boolean method393(double arg0, int arg1, class92 arg2) {
        for (int var5 = 0; var5 < this.field1052.length; var5++) {
            if (arg2.method759(this.field1052[var5], 4) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1054 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1052.length; var7++) {
            class11 var10 = class39.method363(arg2, this.field1052[var7], -3498);
            var10.method136();
            byte[] var11 = var10.field218;
            int[] var12 = var10.field220;
            int var13 = this.field1053[var7];
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
                var12[var19] = class38.method349(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1046[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field221 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1054[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field221 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1054[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field221 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1054[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1054[var8] &= 0xF8F8FF;
            int var9 = this.field1054[var8];
            this.field1054[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1054[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1054[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 188)
    public static void method394() {
        field1048 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V", line = 192)
    public final void method395() {
        this.field1054 = null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 198)
    public final void method396(int arg0) {
        if (this.field1054 == null) {
            return;
        }
        if (this.field1045 == 1 || this.field1045 == 3) {
            if (field1048 == null || field1048.length < this.field1054.length) {
                field1048 = new int[this.field1054.length];
            }
            short var2;
            if (this.field1054.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1054.length / 4;
            int var4 = arg0 * var2 * this.field1049;
            int var5 = var3 - 1;
            if (this.field1045 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1048[var6] = this.field1054[var17];
                field1048[var3 + var6] = this.field1054[var3 + var17];
                field1048[var3 + var6 + var3] = this.field1054[var3 + var17 + var3];
                field1048[var3 + var6 + var3 + var3] = this.field1054[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1054;
            this.field1054 = field1048;
            field1048 = var7;
        }
        if (this.field1045 != 2 && this.field1045 != 4) {
            return;
        }
        if (field1048 == null || field1048.length < this.field1054.length) {
            field1048 = new int[this.field1054.length];
        }
        short var8;
        if (this.field1054.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1054.length / 4;
        int var10 = this.field1049 * arg0;
        int var11 = var8 - 1;
        if (this.field1045 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1048[var15] = this.field1054[var16];
                field1048[var9 + var15] = this.field1054[var9 + var16];
                field1048[var9 + var15 + var9] = this.field1054[var9 + var16 + var9];
                field1048[var9 + var15 + var9 + var9] = this.field1054[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1054;
        this.field1054 = field1048;
        field1048 = var13;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lb;)V", line = 300)
    public class49(class7 arg0) {
        this.field1047 = arg0.method101(2);
        this.field1050 = arg0.method96(27023) == 1;
        int var2 = arg0.method96(27023);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1052 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1052[var3] = arg0.method101(2);
        }
        if (var2 > 1) {
            this.field1046 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1046[var4] = arg0.method96(27023);
            }
        }
        if (var2 > 1) {
            this.field1044 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1044[var5] = arg0.method96(27023);
            }
        }
        this.field1053 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1053[var6] = arg0.method104(-1699);
        }
        this.field1045 = arg0.method96(27023);
        this.field1049 = arg0.method96(27023);
        this.field1054 = null;
    }
}
