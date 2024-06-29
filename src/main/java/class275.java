import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class275 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    private int[] field4730;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
    private int[] field4740;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Ltl;")
    private static class59 field4743 = class85.method639("Choose Option", 9588);

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Ltl;")
    public static class59 field4741 = field4743;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Ltl;")
    public static class59 field4742 = class85.method639("", 9588);

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Ltl;")
    public static class59 field4734 = field4742;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Ltl;")
    public static class59 field4744 = field4742;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    private int field4735;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field4736;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lme;")
    public static class295 field4745;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "[I")
    public static int[] field4746;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[Ltb;")
    public static class203[] field4729;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 8)
    private final void method1920(int arg0) {
        field4726++;
        int var2 = 23 % ((arg0 + 54) / 48);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var12 = var10 ^ var9 << 11;
            int var13 = var8 + var9;
            int var14 = var7 + var12;
            int var15 = var13 ^ var8 >>> 2;
            int var16 = var6 + var15;
            int var17 = var8 + var14;
            int var18 = var17 ^ var14 << 8;
            int var19 = var5 + var18;
            int var20 = var14 + var16;
            var7 = var20 ^ var16 >>> 16;
            int var21 = var4 + var7;
            int var22 = var16 + var19;
            var6 = var22 ^ var19 << 10;
            int var23 = var19 + var21;
            int var24 = var3 + var6;
            var5 = var23 ^ var21 >>> 4;
            int var25 = var5 + var12;
            int var26 = var21 + var24;
            var4 = var26 ^ var24 << 8;
            var9 = var4 + var15;
            int var27 = var24 + var25;
            var3 = var27 ^ var25 >>> 9;
            var8 = var3 + var18;
            var10 = var9 + var25;
        }
        for (int var28 = 0; var28 < 256; var28 += 8) {
            int var29 = this.field4730[var28 + 5] + var5;
            int var30 = this.field4730[var28 + 6] + var4;
            int var31 = this.field4730[var28 + 3] + var7;
            int var32 = this.field4730[var28 + 7] + var3;
            int var33 = this.field4730[var28 + 1] + var9;
            int var34 = this.field4730[var28] + var10;
            int var35 = var34 ^ var33 << 11;
            int var36 = var31 + var35;
            int var37 = this.field4730[var28 + 2] + var8;
            int var38 = var33 + var37;
            int var39 = var38 ^ var37 >>> 2;
            int var40 = var36 + var37;
            int var41 = var40 ^ var36 << 8;
            int var42 = this.field4730[var28 + 4] + var6;
            int var43 = var29 + var41;
            int var44 = var39 + var42;
            int var45 = var36 + var44;
            var7 = var45 ^ var44 >>> 16;
            int var46 = var43 + var44;
            int var47 = var7 + var30;
            var6 = var46 ^ var43 << 10;
            int var48 = var6 + var32;
            int var49 = var43 + var47;
            var5 = var49 ^ var47 >>> 4;
            int var50 = var47 + var48;
            int var51 = var5 + var35;
            var4 = var50 ^ var48 << 8;
            var9 = var4 + var39;
            int var52 = var48 + var51;
            var3 = var52 ^ var51 >>> 9;
            var8 = var3 + var41;
            var10 = var9 + var51;
            this.field4740[var28] = var10;
            this.field4740[var28 + 1] = var9;
            this.field4740[var28 + 2] = var8;
            this.field4740[var28 + 3] = var7;
            this.field4740[var28 + 4] = var6;
            this.field4740[var28 + 5] = var5;
            this.field4740[var28 + 6] = var4;
            this.field4740[var28 + 7] = var3;
        }
        for (int var53 = 0; var53 < 256; var53 += 8) {
            int var54 = this.field4740[var53 + 5] + var5;
            int var55 = this.field4740[var53 + 1] + var9;
            int var56 = this.field4740[var53 + 4] + var6;
            int var57 = this.field4740[var53 + 2] + var8;
            int var58 = this.field4740[var53 + 7] + var3;
            int var59 = this.field4740[var53] + var10;
            int var60 = this.field4740[var53 + 3] + var7;
            int var61 = var59 ^ var55 << 11;
            int var62 = var60 + var61;
            int var63 = this.field4740[var53 + 6] + var4;
            int var64 = var55 + var57;
            int var65 = var64 ^ var57 >>> 2;
            int var66 = var56 + var65;
            int var67 = var57 + var62;
            int var68 = var67 ^ var62 << 8;
            int var69 = var54 + var68;
            int var70 = var62 + var66;
            var7 = var70 ^ var66 >>> 16;
            int var71 = var66 + var69;
            int var72 = var7 + var63;
            var6 = var71 ^ var69 << 10;
            int var73 = var6 + var58;
            int var74 = var69 + var72;
            var5 = var74 ^ var72 >>> 4;
            int var75 = var72 + var73;
            int var76 = var5 + var61;
            var4 = var75 ^ var73 << 8;
            var9 = var4 + var65;
            int var77 = var73 + var76;
            var3 = var77 ^ var76 >>> 9;
            var10 = var9 + var76;
            var8 = var3 + var68;
            this.field4740[var53] = var10;
            this.field4740[var53 + 1] = var9;
            this.field4740[var53 + 2] = var8;
            this.field4740[var53 + 3] = var7;
            this.field4740[var53 + 4] = var6;
            this.field4740[var53 + 5] = var5;
            this.field4740[var53 + 6] = var4;
            this.field4740[var53 + 7] = var3;
        }
        this.method1926(968282576);
        this.field4735 = 256;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 155)
    public static final void method1921(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4748++;
        class206.field3362.method1484(false);
        class46.field755.method1484(false);
        class171.field2798.method1484(!arg0);
        class12.field159.method1484(false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 169)
    public static void method1922(byte arg0) {
        field4741 = null;
        field4746 = null;
        field4743 = null;
        field4744 = null;
        field4745 = null;
        field4729 = null;
        field4742 = null;
        field4734 = null;
        if (arg0 < 92) {
            method1922((byte) 12);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V", line = 190)
    public static final void method1923(int arg0, int arg1) {
        if (arg1 == 29522) {
            class224.field3629.method1486(false, arg0);
            field4739++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V", line = 211)
    public static final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class69.field1061 && class153.field2504 >= arg3 && arg1 >= class69.field1061 && class153.field2504 >= arg1 && class69.field1061 <= arg8 && arg8 <= class153.field2504 && arg6 >= class69.field1061 && arg6 <= class153.field2504 && arg4 >= class28.field369 && arg4 <= class62.field957 && arg9 >= class28.field369 && arg9 <= class62.field957 && class28.field369 <= arg5 && arg5 <= class62.field957 && class28.field369 <= arg2 && class62.field957 >= arg2) {
            class234.method1644(arg0, arg2, arg1, arg3, arg6, arg9, arg4, -78, arg8, arg5);
        } else {
            class4.method29(arg3, arg2, arg8, arg0, arg1, arg5, arg4, arg6, arg9, 128);
        }
        if (arg7 >= -22) {
            field4742 = (class59) null;
        }
        field4747++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Z", line = 230)
    public static final boolean method1925(int arg0, int arg1) {
        field4733++;
        class101.field1653 = arg0 + arg1 & 0xFFFF;
        class3.field26 = true;
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 272)
    private final void method1926(int arg0) {
        field4728++;
        this.field4736 += ++this.field4731;
        if (arg0 != 968282576) {
            this.field4740 = (int[]) null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4740[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4737 ^= this.field4737 << 13;
                } else {
                    this.field4737 ^= this.field4737 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4737 ^= this.field4737 << 2;
            } else {
                this.field4737 ^= this.field4737 >>> 16;
            }
            this.field4737 += this.field4740[var2 + 128 & 0xFF];
            int var4;
            this.field4740[var2] = var4 = this.field4737 + this.field4736 + this.field4740[class93.method680(var3, 1020) >> 2];
            this.field4730[var2] = this.field4736 = var3 + this.field4740[class93.method680(var4, 261228) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 319)
    private class275() {
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)I", line = 324)
    public final int method1927(int arg0) {
        field4738++;
        if (this.field4735-- == 0) {
            this.method1926(968282576);
            this.field4735 = 255;
        }
        return arg0 == 8 ? this.field4730[this.field4735] : 96;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)Z", line = 341)
    public static final boolean method1928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class209.field3406 * arg3 + class113.field1831 * arg0 >> 16;
        int var6 = class113.field1831 * arg3 - class209.field3406 * arg0 >> 16;
        int var7 = class312.field5292 * arg1 + class202.field3344 * var6 >> 16;
        int var8 = class202.field3344 * arg1 - class312.field5292 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class312.field5292 * arg2 + class202.field3344 * var6 >> 16;
        int var12 = class202.field3344 * arg2 - class312.field5292 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class268.field4662 && var13 < class268.field4662) {
            return false;
        } else if (var9 > class233.field3837 && var13 > class233.field3837) {
            return false;
        } else if (var10 < class72.field1130 && var14 < class72.field1130) {
            return false;
        } else {
            return var10 <= class286.field4916 || var14 <= class286.field4916;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([I)V", line = 392)
    public class275(int[] arg0) {
        this.field4730 = new int[256];
        this.field4740 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4730[var2] = arg0[var2];
        }
        this.method1920(-115);
    }
}
