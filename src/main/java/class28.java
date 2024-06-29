import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 extends class70 {

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    public boolean field593 = false;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
    public boolean field591;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "[I")
    private int[] field597;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "[I")
    private int[] field594;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
    private int[] field589;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
    private int[] field590;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
    public int[] field588;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "[I")
    private static int[] field595;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method183(int arg0) {
        if (this.field588 == null) {
            return;
        }
        if (this.field596 == 1 || this.field596 == 3) {
            if (field595 == null || field595.length < this.field588.length) {
                field595 = new int[this.field588.length];
            }
            short var2;
            if (this.field588.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field588.length / 4;
            int var4 = arg0 * var2 * this.field598;
            int var5 = var3 - 1;
            if (this.field596 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field595[var6] = this.field588[var17];
                field595[var3 + var6] = this.field588[var3 + var17];
                field595[var3 + var6 + var3] = this.field588[var3 + var17 + var3];
                field595[var3 + var6 + var3 + var3] = this.field588[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field588;
            this.field588 = field595;
            field595 = var7;
        }
        if (this.field596 != 2 && this.field596 != 4) {
            return;
        }
        if (field595 == null || field595.length < this.field588.length) {
            field595 = new int[this.field588.length];
        }
        short var8;
        if (this.field588.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field588.length / 4;
        int var10 = this.field598 * arg0;
        int var11 = var8 - 1;
        if (this.field596 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field595[var15] = this.field588[var16];
                field595[var9 + var15] = this.field588[var9 + var16];
                field595[var9 + var15 + var9] = this.field588[var9 + var16 + var9];
                field595[var9 + var15 + var9 + var9] = this.field588[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field588;
        this.field588 = field595;
        field595 = var13;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public final void method184() {
        this.field588 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
    public static void method185() {
        field595 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(DILkc;)Z")
    public final boolean method186(double arg0, int arg1, class63 arg2) {
        for (int var5 = 0; var5 < this.field597.length; var5++) {
            if (arg2.method388(-20290, this.field597[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field588 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field597.length; var7++) {
            class15 var10 = class19.method124(arg2, false, this.field597[var7]);
            var10.method79();
            byte[] var11 = var10.field273;
            int[] var12 = var10.field279;
            int var13 = this.field590[var7];
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
                var12[var19] = class117.method852(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field594[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field275 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field588[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field275 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field588[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field275 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field588[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field588[var8] &= 0xF8F8FF;
            int var9 = this.field588[var8];
            this.field588[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field588[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field588[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lpd;)V")
    public class28(class94 arg0) {
        this.field592 = arg0.method665(8666);
        this.field591 = arg0.method703((byte) 122) == 1;
        int var2 = arg0.method703((byte) -96);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field597 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field597[var3] = arg0.method665(8666);
        }
        if (var2 > 1) {
            this.field594 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field594[var4] = arg0.method703((byte) -125);
            }
        }
        if (var2 > 1) {
            this.field589 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field589[var5] = arg0.method703((byte) 103);
            }
        }
        this.field590 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field590[var6] = arg0.method667(5811);
        }
        this.field596 = arg0.method703((byte) 125);
        this.field598 = arg0.method703((byte) 99);
        this.field588 = null;
    }
}
