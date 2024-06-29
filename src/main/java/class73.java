import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class17 {

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
    public boolean field1779 = false;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Z")
    public boolean field1789;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "[I")
    private int[] field1788;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
    private int[] field1780;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[I")
    private int[] field1786;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "[I")
    private int[] field1785;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    private int field1783;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
    public int[] field1787;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[I")
    private static int[] field1781;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
    public static void method633() {
        field1781 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V")
    public final void method634() {
        this.field1787 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(DILsd;)Z")
    public final boolean method635(double arg0, int arg1, class122 arg2) {
        for (int var5 = 0; var5 < this.field1788.length; var5++) {
            if (arg2.method1008(this.field1788[var5], (byte) -124) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1787 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1788.length; var7++) {
            class121 var10 = class133.method1070(arg2, this.field1788[var7], 104);
            var10.method982();
            byte[] var11 = var10.field2903;
            int[] var12 = var10.field2902;
            int var13 = this.field1785[var7];
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
                var12[var19] = class104.method861(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1780[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2904 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1787[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2904 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1787[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2904 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1787[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1787[var8] &= 0xF8F8FF;
            int var9 = this.field1787[var8];
            this.field1787[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1787[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1787[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public final void method636(int arg0) {
        if (this.field1787 == null) {
            return;
        }
        if (this.field1782 == 1 || this.field1782 == 3) {
            if (field1781 == null || field1781.length < this.field1787.length) {
                field1781 = new int[this.field1787.length];
            }
            short var2;
            if (this.field1787.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1787.length / 4;
            int var4 = arg0 * var2 * this.field1783;
            int var5 = var3 - 1;
            if (this.field1782 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1781[var6] = this.field1787[var17];
                field1781[var3 + var6] = this.field1787[var3 + var17];
                field1781[var3 + var6 + var3] = this.field1787[var3 + var17 + var3];
                field1781[var3 + var6 + var3 + var3] = this.field1787[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1787;
            this.field1787 = field1781;
            field1781 = var7;
        }
        if (this.field1782 != 2 && this.field1782 != 4) {
            return;
        }
        if (field1781 == null || field1781.length < this.field1787.length) {
            field1781 = new int[this.field1787.length];
        }
        short var8;
        if (this.field1787.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1787.length / 4;
        int var10 = this.field1783 * arg0;
        int var11 = var8 - 1;
        if (this.field1782 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1781[var15] = this.field1787[var16];
                field1781[var9 + var15] = this.field1787[var9 + var16];
                field1781[var9 + var15 + var9] = this.field1787[var9 + var16 + var9];
                field1781[var9 + var15 + var9 + var9] = this.field1787[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1787;
        this.field1787 = field1781;
        field1781 = var13;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lhb;)V")
    public class73(class51 arg0) {
        this.field1784 = arg0.method383(-2056200760);
        this.field1789 = arg0.method373(25094) == 1;
        int var2 = arg0.method373(25094);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1788 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1788[var3] = arg0.method383(-2056200760);
        }
        if (var2 > 1) {
            this.field1780 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1780[var4] = arg0.method373(25094);
            }
        }
        if (var2 > 1) {
            this.field1786 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1786[var5] = arg0.method373(25094);
            }
        }
        this.field1785 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1785[var6] = arg0.method399(-539722392);
        }
        this.field1782 = arg0.method373(25094);
        this.field1783 = arg0.method373(25094);
        this.field1787 = null;
    }
}
