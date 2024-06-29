import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class44 extends class136 {

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Z")
    public boolean field1100 = false;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Z")
    public boolean field1098;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "[I")
    private int[] field1095;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "[I")
    private int[] field1092;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[I")
    private int[] field1094;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "[I")
    private int[] field1096;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[I")
    public int[] field1093;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "[I")
    private static int[] field1097;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 8)
    public final void method328(int arg0) {
        if (this.field1093 == null) {
            return;
        }
        if (this.field1101 == 1 || this.field1101 == 3) {
            if (field1097 == null || field1097.length < this.field1093.length) {
                field1097 = new int[this.field1093.length];
            }
            short var2;
            if (this.field1093.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1093.length / 4;
            int var4 = arg0 * var2 * this.field1099;
            int var5 = var3 - 1;
            if (this.field1101 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1097[var6] = this.field1093[var17];
                field1097[var3 + var6] = this.field1093[var3 + var17];
                field1097[var3 + var6 + var3] = this.field1093[var3 + var17 + var3];
                field1097[var3 + var6 + var3 + var3] = this.field1093[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1093;
            this.field1093 = field1097;
            field1097 = var7;
        }
        if (this.field1101 != 2 && this.field1101 != 4) {
            return;
        }
        if (field1097 == null || field1097.length < this.field1093.length) {
            field1097 = new int[this.field1093.length];
        }
        short var8;
        if (this.field1093.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1093.length / 4;
        int var10 = this.field1099 * arg0;
        int var11 = var8 - 1;
        if (this.field1101 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1097[var15] = this.field1093[var16];
                field1097[var9 + var15] = this.field1093[var9 + var16];
                field1097[var9 + var15 + var9] = this.field1093[var9 + var16 + var9];
                field1097[var9 + var15 + var9 + var9] = this.field1093[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1093;
        this.field1093 = field1097;
        field1097 = var13;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(DILs;)Z", line = 110)
    public final boolean method329(double arg0, int arg1, class111 arg2) {
        for (int var5 = 0; var5 < this.field1095.length; var5++) {
            if (arg2.method823(false, this.field1095[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1093 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1095.length; var7++) {
            class5 var10 = class12.method75(16036, this.field1095[var7], arg2);
            var10.method29();
            byte[] var11 = var10.field105;
            int[] var12 = var10.field106;
            int var13 = this.field1096[var7];
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
                var12[var19] = class124.method994(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1092[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field102 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1093[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field102 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1093[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field102 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1093[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1093[var8] &= 0xF8F8FF;
            int var9 = this.field1093[var8];
            this.field1093[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1093[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1093[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Luc;)V", line = 300)
    public class44(class122 arg0) {
        this.field1102 = arg0.method938((byte) -101);
        this.field1098 = arg0.method943(-1025) == 1;
        int var2 = arg0.method943(-1025);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1095 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1095[var3] = arg0.method938((byte) -102);
        }
        if (var2 > 1) {
            this.field1092 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1092[var4] = arg0.method943(-1025);
            }
        }
        if (var2 > 1) {
            this.field1094 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1094[var5] = arg0.method943(-1025);
            }
        }
        this.field1096 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1096[var6] = arg0.method952(false);
        }
        this.field1101 = arg0.method943(-1025);
        this.field1099 = arg0.method943(-1025);
        this.field1093 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 294)
    public final void method330() {
        this.field1093 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 298)
    public static void method331() {
        field1097 = null;
    }
}
