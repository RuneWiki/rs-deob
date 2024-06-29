import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class107 {

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
    public boolean field415 = false;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
    public boolean field419;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[I")
    private int[] field418;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
    private int[] field416;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "[I")
    public int[] field422;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "[I")
    private static int[] field421;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public final void method173() {
        this.field422 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
    public static void method174() {
        field421 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(DILnb;)Z")
    public final boolean method175(double arg0, int arg1, class88 arg2) {
        for (int var5 = 0; var5 < this.field418.length; var5++) {
            if (arg2.method649((byte) -126, this.field418[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field422 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field418.length; var7++) {
            class57 var10 = class2.method16(arg2, this.field418[var7], -103);
            var10.method390();
            byte[] var11 = var10.field1204;
            int[] var12 = var10.field1209;
            int var13 = this.field413[var7];
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
                var12[var19] = class97.method696(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field412[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field1205 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field422[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field1205 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field422[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field1205 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field422[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field422[var8] &= 0xF8F8FF;
            int var9 = this.field422[var8];
            this.field422[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field422[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field422[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method176(int arg0) {
        if (this.field422 == null) {
            return;
        }
        if (this.field414 == 1 || this.field414 == 3) {
            if (field421 == null || field421.length < this.field422.length) {
                field421 = new int[this.field422.length];
            }
            short var2;
            if (this.field422.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field422.length / 4;
            int var4 = arg0 * var2 * this.field420;
            int var5 = var3 - 1;
            if (this.field414 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field421[var6] = this.field422[var17];
                field421[var3 + var6] = this.field422[var3 + var17];
                field421[var3 + var6 + var3] = this.field422[var3 + var17 + var3];
                field421[var3 + var6 + var3 + var3] = this.field422[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field422;
            this.field422 = field421;
            field421 = var7;
        }
        if (this.field414 != 2 && this.field414 != 4) {
            return;
        }
        if (field421 == null || field421.length < this.field422.length) {
            field421 = new int[this.field422.length];
        }
        short var8;
        if (this.field422.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field422.length / 4;
        int var10 = this.field420 * arg0;
        int var11 = var8 - 1;
        if (this.field414 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field421[var15] = this.field422[var16];
                field421[var9 + var15] = this.field422[var9 + var16];
                field421[var9 + var15 + var9] = this.field422[var9 + var16 + var9];
                field421[var9 + var15 + var9 + var9] = this.field422[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field422;
        this.field422 = field421;
        field421 = var13;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lqe;)V")
    public class20(class109 arg0) {
        this.field417 = arg0.method835(2);
        this.field419 = arg0.method838(255) == 1;
        int var2 = arg0.method838(255);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field418 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field418[var3] = arg0.method835(2);
        }
        if (var2 > 1) {
            this.field412 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field412[var4] = arg0.method838(255);
            }
        }
        if (var2 > 1) {
            this.field416 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field416[var5] = arg0.method838(255);
            }
        }
        this.field413 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field413[var6] = arg0.method832(14722);
        }
        this.field414 = arg0.method838(255);
        this.field420 = arg0.method838(255);
        this.field422 = null;
    }
}
