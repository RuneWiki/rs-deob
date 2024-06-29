import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class128 extends class24 {

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Z")
    public boolean field3121 = false;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Z")
    public boolean field3116;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "[I")
    private int[] field3122;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "[I")
    private int[] field3120;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[I")
    private int[] field3115;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "[I")
    private int[] field3118;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "[I")
    public int[] field3123;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "[I")
    private static int[] field3119;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(DILmb;)Z", line = 5)
    public final boolean method1007(double arg0, int arg1, class74 arg2) {
        for (int var5 = 0; var5 < this.field3122.length; var5++) {
            if (arg2.method614(this.field3122[var5], (byte) 116) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field3123 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field3122.length; var7++) {
            class3 var10 = class88.method688((byte) 27, this.field3122[var7], arg2);
            var10.method61();
            byte[] var11 = var10.field98;
            int[] var12 = var10.field96;
            int var13 = this.field3118[var7];
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
                var12[var19] = class77.method649(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field3120[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field99 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field3123[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field99 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field3123[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field99 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field3123[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field3123[var8] &= 0xF8F8FF;
            int var9 = this.field3123[var8];
            this.field3123[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field3123[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field3123[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 185)
    public final void method1008(int arg0) {
        if (this.field3123 == null) {
            return;
        }
        if (this.field3114 == 1 || this.field3114 == 3) {
            if (field3119 == null || field3119.length < this.field3123.length) {
                field3119 = new int[this.field3123.length];
            }
            short var2;
            if (this.field3123.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field3123.length / 4;
            int var4 = arg0 * var2 * this.field3113;
            int var5 = var3 - 1;
            if (this.field3114 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field3119[var6] = this.field3123[var17];
                field3119[var3 + var6] = this.field3123[var3 + var17];
                field3119[var3 + var6 + var3] = this.field3123[var3 + var17 + var3];
                field3119[var3 + var6 + var3 + var3] = this.field3123[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field3123;
            this.field3123 = field3119;
            field3119 = var7;
        }
        if (this.field3114 != 2 && this.field3114 != 4) {
            return;
        }
        if (field3119 == null || field3119.length < this.field3123.length) {
            field3119 = new int[this.field3123.length];
        }
        short var8;
        if (this.field3123.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field3123.length / 4;
        int var10 = this.field3113 * arg0;
        int var11 = var8 - 1;
        if (this.field3114 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field3119[var15] = this.field3123[var16];
                field3119[var9 + var15] = this.field3123[var9 + var16];
                field3119[var9 + var15 + var9] = this.field3123[var9 + var16 + var9];
                field3119[var9 + var15 + var9 + var9] = this.field3123[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field3123;
        this.field3123 = field3119;
        field3119 = var13;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V", line = 282)
    public final void method1009() {
        this.field3123 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V", line = 290)
    public static void method1010() {
        field3119 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lkd;)V", line = 300)
    public class128(class64 arg0) {
        this.field3117 = arg0.method506((byte) -90);
        this.field3116 = arg0.method520(-114) == 1;
        int var2 = arg0.method520(-119);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field3122 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field3122[var3] = arg0.method506((byte) -90);
        }
        if (var2 > 1) {
            this.field3120 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field3120[var4] = arg0.method520(-114);
            }
        }
        if (var2 > 1) {
            this.field3115 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field3115[var5] = arg0.method520(-106);
            }
        }
        this.field3118 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3118[var6] = arg0.method487(128);
        }
        this.field3114 = arg0.method520(-124);
        this.field3113 = arg0.method520(-108);
        this.field3123 = null;
    }
}
