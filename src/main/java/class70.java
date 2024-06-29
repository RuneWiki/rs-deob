import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 extends class137 {

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Z")
    public boolean field1528 = false;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Z")
    public boolean field1537;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "[I")
    private int[] field1531;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
    private int[] field1530;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "[I")
    private int[] field1535;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "[I")
    public int[] field1533;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "[I")
    private static int[] field1534;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public final void method556() {
        this.field1533 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(DILkb;)Z")
    public final boolean method557(double arg0, int arg1, class71 arg2) {
        for (int var5 = 0; var5 < this.field1531.length; var5++) {
            if (arg2.method567(this.field1531[var5], 16936) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1533 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1531.length; var7++) {
            class114 var10 = class130.method1066(arg2, false, this.field1531[var7]);
            var10.method893();
            byte[] var11 = var10.field2724;
            int[] var12 = var10.field2729;
            int var13 = this.field1535[var7];
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
                var12[var19] = class134.method1085(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1529[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2723 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1533[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2723 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1533[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2723 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1533[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1533[var8] &= 0xF8F8FF;
            int var9 = this.field1533[var8];
            this.field1533[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1533[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1533[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (this.field1533 == null) {
            return;
        }
        if (this.field1532 == 1 || this.field1532 == 3) {
            if (field1534 == null || field1534.length < this.field1533.length) {
                field1534 = new int[this.field1533.length];
            }
            short var2;
            if (this.field1533.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1533.length / 4;
            int var4 = arg0 * var2 * this.field1536;
            int var5 = var3 - 1;
            if (this.field1532 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1534[var6] = this.field1533[var17];
                field1534[var3 + var6] = this.field1533[var3 + var17];
                field1534[var3 + var6 + var3] = this.field1533[var3 + var17 + var3];
                field1534[var3 + var6 + var3 + var3] = this.field1533[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1533;
            this.field1533 = field1534;
            field1534 = var7;
        }
        if (this.field1532 != 2 && this.field1532 != 4) {
            return;
        }
        if (field1534 == null || field1534.length < this.field1533.length) {
            field1534 = new int[this.field1533.length];
        }
        short var8;
        if (this.field1533.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1533.length / 4;
        int var10 = this.field1536 * arg0;
        int var11 = var8 - 1;
        if (this.field1532 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1534[var15] = this.field1533[var16];
                field1534[var9 + var15] = this.field1533[var9 + var16];
                field1534[var9 + var15 + var9] = this.field1533[var9 + var16 + var9];
                field1534[var9 + var15 + var9 + var9] = this.field1533[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1533;
        this.field1533 = field1534;
        field1534 = var13;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public static void method559() {
        field1534 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lrd;)V")
    public class70(class122 arg0) {
        this.field1527 = arg0.method965(false);
        this.field1537 = arg0.method931((byte) 124) == 1;
        int var2 = arg0.method931((byte) 124);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1531 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1531[var3] = arg0.method965(false);
        }
        if (var2 > 1) {
            this.field1529 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1529[var4] = arg0.method931((byte) 124);
            }
        }
        if (var2 > 1) {
            this.field1530 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1530[var5] = arg0.method931((byte) 124);
            }
        }
        this.field1535 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1535[var6] = arg0.method972(48);
        }
        this.field1532 = arg0.method931((byte) 124);
        this.field1536 = arg0.method931((byte) 124);
        this.field1533 = null;
    }
}
