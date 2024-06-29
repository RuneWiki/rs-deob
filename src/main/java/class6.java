import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class108 {

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "Z")
    public boolean field167 = false;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Z")
    public boolean field159;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
    private int[] field164;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[I")
    private int[] field163;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
    private int[] field166;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
    private int[] field158;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
    private static int[] field160;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 8)
    public static void method32() {
        field160 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 15)
    public final void method33(int arg0) {
        if (this.field161 == null) {
            return;
        }
        if (this.field165 == 1 || this.field165 == 3) {
            if (field160 == null || field160.length < this.field161.length) {
                field160 = new int[this.field161.length];
            }
            short var2;
            if (this.field161.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field161.length / 4;
            int var4 = arg0 * var2 * this.field162;
            int var5 = var3 - 1;
            if (this.field165 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field160[var6] = this.field161[var17];
                field160[var3 + var6] = this.field161[var3 + var17];
                field160[var3 + var6 + var3] = this.field161[var3 + var17 + var3];
                field160[var3 + var6 + var3 + var3] = this.field161[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field161;
            this.field161 = field160;
            field160 = var7;
        }
        if (this.field165 != 2 && this.field165 != 4) {
            return;
        }
        if (field160 == null || field160.length < this.field161.length) {
            field160 = new int[this.field161.length];
        }
        short var8;
        if (this.field161.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field161.length / 4;
        int var10 = this.field162 * arg0;
        int var11 = var8 - 1;
        if (this.field165 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field160[var15] = this.field161[var16];
                field160[var9 + var15] = this.field161[var9 + var16];
                field160[var9 + var15 + var9] = this.field161[var9 + var16 + var9];
                field160[var9 + var15 + var9 + var9] = this.field161[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field161;
        this.field161 = field160;
        field160 = var13;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(DILrb;)Z", line = 118)
    public final boolean method34(double arg0, int arg1, class103 arg2) {
        for (int var5 = 0; var5 < this.field164.length; var5++) {
            if (arg2.method728(this.field164[var5], (byte) -108) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field161 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field164.length; var7++) {
            class73 var10 = class41.method279(this.field164[var7], arg2, -8839);
            var10.method499();
            byte[] var11 = var10.field1711;
            int[] var12 = var10.field1705;
            int var13 = this.field158[var7];
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
                var12[var19] = class109.method847(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field163[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field1706 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field161[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field1706 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field161[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field1706 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field161[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field161[var8] &= 0xF8F8FF;
            int var9 = this.field161[var8];
            this.field161[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field161[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field161[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 294)
    public final void method35() {
        this.field161 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lrc;)V", line = 299)
    public class6(class104 arg0) {
        this.field157 = arg0.method797(-7916);
        this.field159 = arg0.method798((byte) -87) == 1;
        int var2 = arg0.method798((byte) -111);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field164 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field164[var3] = arg0.method797(-7916);
        }
        if (var2 > 1) {
            this.field163 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field163[var4] = arg0.method798((byte) -122);
            }
        }
        if (var2 > 1) {
            this.field166 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field166[var5] = arg0.method798((byte) -99);
            }
        }
        this.field158 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field158[var6] = arg0.method774(-29404);
        }
        this.field165 = arg0.method798((byte) -45);
        this.field162 = arg0.method798((byte) -78);
        this.field161 = null;
    }
}
