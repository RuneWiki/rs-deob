import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 extends class127 {

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Z")
    public boolean field1723 = false;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Z")
    public boolean field1724;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[I")
    private int[] field1726;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "[I")
    private int[] field1733;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[I")
    private int[] field1727;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "[I")
    private int[] field1729;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
    public int[] field1725;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "[I")
    private static int[] field1728;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V", line = 3)
    public final void method598() {
        this.field1725 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()V", line = 7)
    public static void method599() {
        field1728 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(DILtd;)Z", line = 16)
    public final boolean method600(double arg0, int arg1, class116 arg2) {
        for (int var5 = 0; var5 < this.field1726.length; var5++) {
            if (arg2.method880(true, this.field1726[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1725 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1726.length; var7++) {
            class83 var10 = class104.method822(this.field1726[var7], arg2, -74);
            var10.method681();
            byte[] var11 = var10.field2122;
            int[] var12 = var10.field2129;
            int var13 = this.field1729[var7];
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
                var12[var19] = class58.method554(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1733[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2127 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1725[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2127 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1725[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2127 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1725[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1725[var8] &= 0xF8F8FF;
            int var9 = this.field1725[var8];
            this.field1725[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1725[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1725[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lwd;)V", line = 300)
    public class70(class131 arg0) {
        this.field1732 = arg0.method1001(65280);
        this.field1724 = arg0.method971(true) == 1;
        int var2 = arg0.method971(true);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1726 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1726[var3] = arg0.method1001(65280);
        }
        if (var2 > 1) {
            this.field1733 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1733[var4] = arg0.method971(true);
            }
        }
        if (var2 > 1) {
            this.field1727 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1727[var5] = arg0.method971(true);
            }
        }
        this.field1729 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1729[var6] = arg0.method994((byte) 36);
        }
        this.field1730 = arg0.method971(true);
        this.field1731 = arg0.method971(true);
        this.field1725 = null;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 195)
    public final void method601(int arg0) {
        if (this.field1725 == null) {
            return;
        }
        if (this.field1730 == 1 || this.field1730 == 3) {
            if (field1728 == null || field1728.length < this.field1725.length) {
                field1728 = new int[this.field1725.length];
            }
            short var2;
            if (this.field1725.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1725.length / 4;
            int var4 = arg0 * var2 * this.field1731;
            int var5 = var3 - 1;
            if (this.field1730 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1728[var6] = this.field1725[var17];
                field1728[var3 + var6] = this.field1725[var3 + var17];
                field1728[var3 + var6 + var3] = this.field1725[var3 + var17 + var3];
                field1728[var3 + var6 + var3 + var3] = this.field1725[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1725;
            this.field1725 = field1728;
            field1728 = var7;
        }
        if (this.field1730 != 2 && this.field1730 != 4) {
            return;
        }
        if (field1728 == null || field1728.length < this.field1725.length) {
            field1728 = new int[this.field1725.length];
        }
        short var8;
        if (this.field1725.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1725.length / 4;
        int var10 = this.field1731 * arg0;
        int var11 = var8 - 1;
        if (this.field1730 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1728[var15] = this.field1725[var16];
                field1728[var9 + var15] = this.field1725[var9 + var16];
                field1728[var9 + var15 + var9] = this.field1725[var9 + var16 + var9];
                field1728[var9 + var15 + var9 + var9] = this.field1725[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1725;
        this.field1725 = field1728;
        field1728 = var13;
    }
}
