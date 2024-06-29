import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 extends class17 {

    @OriginalMember(owner = "client!je", name = "F", descriptor = "Z")
    public boolean field1604 = false;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Z")
    public boolean field1598;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[I")
    private int[] field1601;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
    private int[] field1596;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
    private int[] field1602;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "[I")
    private int[] field1599;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[I")
    public int[] field1600;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[I")
    private static int[] field1605;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 10)
    public final void method499(int arg0) {
        if (this.field1600 == null) {
            return;
        }
        if (this.field1595 == 1 || this.field1595 == 3) {
            if (field1605 == null || field1605.length < this.field1600.length) {
                field1605 = new int[this.field1600.length];
            }
            short var2;
            if (this.field1600.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1600.length / 4;
            int var4 = arg0 * var2 * this.field1597;
            int var5 = var3 - 1;
            if (this.field1595 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1605[var6] = this.field1600[var17];
                field1605[var3 + var6] = this.field1600[var3 + var17];
                field1605[var3 + var6 + var3] = this.field1600[var3 + var17 + var3];
                field1605[var3 + var6 + var3 + var3] = this.field1600[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1600;
            this.field1600 = field1605;
            field1605 = var7;
        }
        if (this.field1595 != 2 && this.field1595 != 4) {
            return;
        }
        if (field1605 == null || field1605.length < this.field1600.length) {
            field1605 = new int[this.field1600.length];
        }
        short var8;
        if (this.field1600.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1600.length / 4;
        int var10 = this.field1597 * arg0;
        int var11 = var8 - 1;
        if (this.field1595 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1605[var15] = this.field1600[var16];
                field1605[var9 + var15] = this.field1600[var9 + var16];
                field1605[var9 + var15 + var9] = this.field1600[var9 + var16 + var9];
                field1605[var9 + var15 + var9 + var9] = this.field1600[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1600;
        this.field1600 = field1605;
        field1605 = var13;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 111)
    public final void method500() {
        this.field1600 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(DILjd;)Z", line = 116)
    public final boolean method501(double arg0, int arg1, class58 arg2) {
        for (int var5 = 0; var5 < this.field1601.length; var5++) {
            if (arg2.method481(this.field1601[var5], true) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1600 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1601.length; var7++) {
            class119 var10 = class91.method795(this.field1601[var7], (byte) -94, arg2);
            var10.method962();
            byte[] var11 = var10.field2947;
            int[] var12 = var10.field2952;
            int var13 = this.field1599[var7];
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
                var12[var19] = class127.method1006(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1596[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2954 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1600[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2954 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1600[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2954 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1600[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1600[var8] &= 0xF8F8FF;
            int var9 = this.field1600[var8];
            this.field1600[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1600[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1600[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 293)
    public static void method502() {
        field1605 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lg;)V", line = 300)
    public class59(class39 arg0) {
        this.field1603 = arg0.method326(255);
        this.field1598 = arg0.method334(115) == 1;
        int var2 = arg0.method334(122);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1601 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1601[var3] = arg0.method326(255);
        }
        if (var2 > 1) {
            this.field1596 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1596[var4] = arg0.method334(102);
            }
        }
        if (var2 > 1) {
            this.field1602 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1602[var5] = arg0.method334(122);
            }
        }
        this.field1599 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1599[var6] = arg0.method329(144752608);
        }
        this.field1595 = arg0.method334(124);
        this.field1597 = arg0.method334(126);
        this.field1600 = null;
    }
}
