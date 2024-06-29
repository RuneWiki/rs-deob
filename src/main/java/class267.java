import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class267 {

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "[I")
    private int[] field4762;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    private int[] field4743;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lcf;")
    public static class93 field4752 = class147.method1066("scrollbar", -48);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4756 = 127;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[Z")
    public static boolean[] field4745 = new boolean[200];

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lcf;")
    public static class93 field4758 = class147.method1066("Number of player models in cache:", -48);

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lcf;")
    public static class93 field4742 = class147.method1066("niveau ", -48);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4746 = 0;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Z")
    public static boolean field4764 = false;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4759 = -1;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field4767 = 0;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lcf;")
    public static class93 field4755 = class147.method1066("; version=1; path=)4; domain=", -48);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field4750;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    private int field4754;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lnf;")
    public static class158 field4761;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lal;")
    public static class230 field4748;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    private final void method1782(byte arg0) {
        field4766++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var63;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4762[var11 + 7] + var2;
            int var38 = this.field4762[var11 + 5] + var4;
            int var39 = this.field4762[var11 + 6] + var3;
            int var40 = this.field4762[var11 + 3] + var6;
            int var41 = this.field4762[var11] + var9;
            int var42 = this.field4762[var11 + 2] + var7;
            int var43 = this.field4762[var11 + 1] + var8;
            int var44 = var41 ^ var43 << 11;
            int var45 = var42 + var43;
            int var46 = var40 + var44;
            int var47 = var45 ^ var42 >>> 2;
            int var48 = this.field4762[var11 + 4] + var5;
            int var49 = var42 + var46;
            int var50 = var47 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var38 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var39;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var37;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var47;
            int var59 = var4 + var44;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field4743[var11] = var9;
            this.field4743[var11 + 1] = var8;
            this.field4743[var11 + 2] = var7;
            this.field4743[var11 + 3] = var6;
            this.field4743[var11 + 4] = var5;
            this.field4743[var11 + 5] = var4;
            this.field4743[var11 + 6] = var3;
            this.field4743[var11 + 7] = var2;
        }
        if (arg0 != -90) {
            method1783((class177) null, 78, 113, 40);
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4743[var12 + 2] + var7;
            int var14 = this.field4743[var12 + 1] + var8;
            int var15 = this.field4743[var12] + var9;
            int var16 = var15 ^ var14 << 11;
            int var17 = this.field4743[var12 + 3] + var6;
            int var18 = this.field4743[var12 + 7] + var2;
            int var19 = this.field4743[var12 + 5] + var4;
            int var20 = var13 + var14;
            int var21 = var20 ^ var13 >>> 2;
            int var22 = this.field4743[var12 + 4] + var5;
            int var23 = var16 + var17;
            int var24 = var13 + var23;
            int var25 = this.field4743[var12 + 6] + var3;
            int var26 = var21 + var22;
            int var27 = var24 ^ var23 << 8;
            int var28 = var19 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var18;
            int var32 = var6 + var25;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            int var35 = var4 + var16;
            var8 = var3 + var21;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field4743[var12] = var9;
            this.field4743[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field4743[var12 + 2] = var7;
            this.field4743[var12 + 3] = var6;
            this.field4743[var12 + 4] = var5;
            this.field4743[var12 + 5] = var4;
            this.field4743[var12 + 6] = var3;
            this.field4743[var12 + 7] = var2;
        }
        this.method1784(-1);
        this.field4747 = 256;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lhg;III)[Lwh;")
    public static final class193[] method1783(class177 arg0, int arg1, int arg2, int arg3) {
        field4763++;
        if (class149.method1074(arg2, arg0, 16597, arg3)) {
            if (arg1 != 22640) {
                method1785((byte) -56);
            }
            return class161.method1165(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    private final void method1784(int arg0) {
        this.field4744 += ++this.field4750;
        if (arg0 != -1) {
            return;
        }
        field4757++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4743[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4754 ^= this.field4754 << 13;
                } else {
                    this.field4754 ^= this.field4754 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4754 ^= this.field4754 << 2;
            } else {
                this.field4754 ^= this.field4754 >>> 16;
            }
            this.field4754 += this.field4743[var2 + 128 & 0xFF];
            int var4;
            this.field4743[var2] = var4 = this.field4754 + this.field4744 + this.field4743[class58.method333(255, var3 >> 2)];
            this.field4762[var2] = this.field4744 = this.field4743[class58.method333(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static void method1785(byte arg0) {
        field4755 = null;
        field4745 = null;
        field4752 = null;
        field4748 = null;
        field4758 = null;
        if (arg0 < 8) {
            field4745 = null;
        }
        field4742 = null;
        field4761 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILui;)I")
    public static final int method1786(int arg0, class227 arg1) {
        field4765++;
        class145 var2 = arg1.field4062;
        if (var2.field2523 != null) {
            var2 = var2.method1058(249);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2540;
        class50 var4 = arg1.method1483(0);
        int var5 = 28 % ((arg0 + 9) / 57);
        if (arg1.field3797 == var4.field800) {
            var3 = var2.field2526;
        } else if (arg1.field3797 == var4.field824 || arg1.field3797 == var4.field807 || arg1.field3797 == var4.field795 || arg1.field3797 == var4.field826) {
            var3 = var2.field2565;
        } else if (arg1.field3797 == var4.field820 || arg1.field3797 == var4.field806 || arg1.field3797 == var4.field818 || arg1.field3797 == var4.field799) {
            var3 = var2.field2537;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method1787(int arg0, byte arg1) {
        field4753++;
        if (arg0 == 37) {
            class178.field3134 = 3.0F;
        } else if (arg0 == 50) {
            class178.field3134 = 4.0F;
        } else if (arg0 == 75) {
            class178.field3134 = 6.0F;
        } else if (arg0 == 100) {
            class178.field3134 = 8.0F;
        } else if (arg0 == 200) {
            class178.field3134 = 16.0F;
        }
        class14.field168 = -1;
        class14.field168 = -1;
        if (arg1 != 36) {
            field4761 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
    public static final void method1788() {
        if (class164.field2897 != null) {
            for (int var0 = 0; var0 < class164.field2897.length; var0++) {
                for (int var1 = 0; var1 < class210.field3821; var1++) {
                    for (int var2 = 0; var2 < class256.field4623; var2++) {
                        class164.field2897[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class193.field3543 != null) {
            for (int var3 = 0; var3 < class193.field3543.length; var3++) {
                for (int var4 = 0; var4 < class210.field3821; var4++) {
                    for (int var5 = 0; var5 < class256.field4623; var5++) {
                        class193.field3543[var3][var4][var5] = null;
                    }
                }
            }
        }
        class280.field5029 = 0;
        if (class108.field1855 != null) {
            for (int var6 = 0; var6 < class280.field5029; var6++) {
                class108.field1855[var6] = null;
            }
        }
        if (class251.field4509 != null) {
            for (int var7 = 0; var7 < class24.field306; var7++) {
                class251.field4509[var7] = null;
            }
            class24.field306 = 0;
        }
        if (class264.field4701 != null) {
            for (int var8 = 0; var8 < class264.field4701.length; var8++) {
                class264.field4701[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I")
    public final int method1789(int arg0) {
        if ((this.field4747--) == 0) {
            this.method1784(arg0 ^ 0xFFFFFFFB);
            this.field4747 = 255;
        }
        field4749++;
        if (arg0 != 4) {
            field4761 = null;
        }
        return this.field4762[this.field4747];
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    private class267() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([I)V")
    public class267(int[] arg0) {
        this.field4762 = new int[256];
        this.field4743 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4762[var2] = arg0[var2];
        }
        this.method1782((byte) -90);
    }
}
