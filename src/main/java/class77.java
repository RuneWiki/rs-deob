import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
    private int[] field1729 = new int[256];

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
    private int[] field1734 = new int[256];

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lec;")
    public static class28 field1730 = class28.method210(-46, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field1735 = 255;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lec;")
    public static class28 field1732 = class28.method210(-46, "Please try again)3");

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lec;")
    public static class28 field1726 = class28.method210(-46, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lec;")
    public static class28 field1721 = class28.method210(-46, "Friends");

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lec;")
    public static class28 field1739 = class28.method210(-46, "wishes to trade with you)3");

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public static int[] field1727;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1739 = null;
        field1732 = null;
        if (arg0 != -1991516592) {
            field1730 = null;
        }
        field1727 = null;
        field1726 = null;
        field1730 = null;
        field1721 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIZ)V")
    public static final void method587(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (class5.field82 >= 0) {
            class14.field251.method178((byte) 81);
            class18.field360 = 0;
            class5.field82 = -1;
            class37.field830 = null;
            class32.field689 = 20;
        }
        if (arg1 <= 106) {
            return;
        }
        field1740++;
        if (arg0 == null) {
            return;
        }
        if (class32.field689 > 0) {
            class14.field251.method174((byte) -50);
            class32.field689 = 0;
        }
        class5.field82 = arg2;
        class14.field251.method180(arg2, false, arg0, arg3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    private final void method588(boolean arg0) {
        field1731++;
        if (!arg0) {
            method587(null, -113, -85, false);
        }
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
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1729[var11 + 2] + var7;
            int var38 = this.field1729[var11 + 6] + var3;
            int var39 = this.field1729[var11 + 1] + var8;
            int var40 = this.field1729[var11 + 4] + var5;
            int var41 = this.field1729[var11 + 5] + var4;
            int var42 = this.field1729[var11 + 7] + var2;
            int var43 = this.field1729[var11] + var9;
            int var44 = this.field1729[var11 + 3] + var6;
            int var45 = var43 ^ var39 << 11;
            int var46 = var37 + var39;
            int var47 = var44 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var40 + var48;
            int var50 = var37 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var41 + var51;
            int var54 = var6 + var38;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var42;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1734[var11] = var9;
            this.field1734[var11 + 1] = var8;
            this.field1734[var11 + 2] = var7;
            this.field1734[var11 + 3] = var6;
            this.field1734[var11 + 4] = var5;
            this.field1734[var11 + 5] = var4;
            this.field1734[var11 + 6] = var3;
            this.field1734[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1734[var12 + 6] + var3;
            int var14 = this.field1734[var12 + 3] + var6;
            int var15 = this.field1734[var12] + var9;
            int var16 = this.field1734[var12 + 1] + var8;
            int var17 = this.field1734[var12 + 5] + var4;
            int var18 = this.field1734[var12 + 7] + var2;
            int var19 = this.field1734[var12 + 2] + var7;
            int var20 = this.field1734[var12 + 4] + var5;
            int var21 = var15 ^ var16 << 11;
            int var22 = var14 + var21;
            int var23 = var16 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var20 + var24;
            int var26 = var19 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var17 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1734[var12] = var9;
            this.field1734[var12 + 1] = var8;
            this.field1734[var12 + 2] = var7;
            this.field1734[var12 + 3] = var6;
            this.field1734[var12 + 4] = var5;
            this.field1734[var12 + 5] = var4;
            this.field1734[var12 + 6] = var3;
            this.field1734[var12 + 7] = var2;
        }
        this.method591(6946);
        this.field1724 = 256;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
    public final int method589(byte arg0) {
        field1722++;
        int var2 = -51 % ((31 - arg0) / 43);
        if (this.field1724-- == 0) {
            this.method591(6946);
            this.field1724 = 255;
        }
        return this.field1729[this.field1724];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lie;")
    public static final class53 method590(int arg0, int arg1) {
        field1736++;
        class53 var2 = (class53) class88.field1963.method660(-2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 8) {
            field1726 = null;
        }
        byte[] var3 = class25.field542.method932(-14, arg0, 4);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method427(new class119(var3), arg0, (byte) 74);
        }
        var4.method432(arg1 ^ 0xFFFFFFF7);
        class88.field1963.method666(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([I)V")
    public class77(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1729[var2] = arg0[var2];
        }
        this.method588(true);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    private final void method591(int arg0) {
        if (arg0 != 6946) {
            method587(null, -39, 56, false);
        }
        this.field1733 += ++this.field1737;
        field1723++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1734[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1725 ^= this.field1725 << 13;
                } else {
                    this.field1725 ^= this.field1725 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1725 ^= this.field1725 << 2;
            } else {
                this.field1725 ^= this.field1725 >>> 16;
            }
            this.field1725 += this.field1734[var2 + 128 & 0xFF];
            int var4;
            this.field1734[var2] = var4 = this.field1734[class106.method732(var3 >> 2, 255)] + this.field1725 + this.field1733;
            this.field1729[var2] = this.field1733 = this.field1734[class106.method732(var4, 261158) >> 8 >> 2] + var3;
        }
    }
}
