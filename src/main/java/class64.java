import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class12 {

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Z")
    public boolean field1547 = false;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Z")
    public boolean field1549;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
    private int[] field1545;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
    private int[] field1553;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "[I")
    private int[] field1544;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[I")
    public int[] field1552;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
    private static int[] field1548;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 12)
    public static void method507() {
        field1548 = null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 17)
    public final void method508(int arg0) {
        if (this.field1552 == null) {
            return;
        }
        if (this.field1550 == 1 || this.field1550 == 3) {
            if (field1548 == null || field1548.length < this.field1552.length) {
                field1548 = new int[this.field1552.length];
            }
            short var2;
            if (this.field1552.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1552.length / 4;
            int var4 = arg0 * var2 * this.field1551;
            int var5 = var3 - 1;
            if (this.field1550 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1548[var6] = this.field1552[var17];
                field1548[var3 + var6] = this.field1552[var3 + var17];
                field1548[var3 + var6 + var3] = this.field1552[var3 + var17 + var3];
                field1548[var3 + var6 + var3 + var3] = this.field1552[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1552;
            this.field1552 = field1548;
            field1548 = var7;
        }
        if (this.field1550 != 2 && this.field1550 != 4) {
            return;
        }
        if (field1548 == null || field1548.length < this.field1552.length) {
            field1548 = new int[this.field1552.length];
        }
        short var8;
        if (this.field1552.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1552.length / 4;
        int var10 = this.field1551 * arg0;
        int var11 = var8 - 1;
        if (this.field1550 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1548[var15] = this.field1552[var16];
                field1548[var9 + var15] = this.field1552[var9 + var16];
                field1548[var9 + var15 + var9] = this.field1552[var9 + var16 + var9];
                field1548[var9 + var15 + var9 + var9] = this.field1552[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1552;
        this.field1552 = field1548;
        field1548 = var13;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 113)
    public final void method509() {
        this.field1552 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(DILrd;)Z", line = 118)
    public final boolean method510(double arg0, int arg1, class106 arg2) {
        for (int var5 = 0; var5 < this.field1545.length; var5++) {
            if (arg2.method851((byte) -109, this.field1545[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1552 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1545.length; var7++) {
            class123 var10 = class20.method166((byte) -49, this.field1545[var7], arg2);
            var10.method978();
            byte[] var11 = var10.field3028;
            int[] var12 = var10.field3024;
            int var13 = this.field1544[var7];
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
                var12[var19] = class114.method915(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1553[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field3023 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1552[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field3023 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1552[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field3023 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1552[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1552[var8] &= 0xF8F8FF;
            int var9 = this.field1552[var8];
            this.field1552[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1552[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1552[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lgb;)V", line = 300)
    public class64(class39 arg0) {
        this.field1546 = arg0.method343((byte) -6);
        this.field1549 = arg0.method330(-30864) == 1;
        int var2 = arg0.method330(-30864);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1545 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1545[var3] = arg0.method343((byte) -6);
        }
        if (var2 > 1) {
            this.field1553 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1553[var4] = arg0.method330(-30864);
            }
        }
        if (var2 > 1) {
            this.field1554 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1554[var5] = arg0.method330(-30864);
            }
        }
        this.field1544 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1544[var6] = arg0.method322((byte) -118);
        }
        this.field1550 = arg0.method330(-30864);
        this.field1551 = arg0.method330(-30864);
        this.field1552 = null;
    }
}
