import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class116 {

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    private int[] field2760 = new int[256];

    @OriginalMember(owner = "client!s", name = "r", descriptor = "[I")
    private int[] field2763 = new int[256];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lvc;")
    public static class137 field2755 = class45.method325("@gr3@", -46);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
    public static boolean field2762 = false;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lvc;")
    public static class137 field2764 = class45.method325("Ung-Ultiges Anmelde)2Paket)3", -46);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lrb;")
    public static class112 field2752 = new class112(4096);

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2765 = -1;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Lvc;")
    public static class137 field2769 = class45.method325("scape main", -46);

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Lvc;")
    private static class137 field2768 = class45.method325("RuneScape is loading )2 please wait)3)3)3", -46);

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lvc;")
    public static class137 field2770 = field2768;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lnb;")
    public static class88 field2749;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Loa;")
    public static class93 field2766;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    public static int[] field2751;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
    public final int method895(byte arg0) {
        field2750++;
        if (this.field2759-- == 0) {
            this.method896((byte) 117);
            this.field2759 = 255;
        }
        if (arg0 != -32) {
            this.method895((byte) -42);
        }
        return this.field2760[this.field2759];
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    private final void method896(byte arg0) {
        this.field2746 += ++this.field2748;
        field2758++;
        int var2 = 0;
        if (arg0 < 63) {
            this.method900((byte) -98);
        }
        while (var2 < 256) {
            int var3 = this.field2763[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2756 ^= this.field2756 << 13;
                } else {
                    this.field2756 ^= this.field2756 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2756 ^= this.field2756 << 2;
            } else {
                this.field2756 ^= this.field2756 >>> 16;
            }
            this.field2756 += this.field2763[var2 + 128 & 0xFF];
            int var4;
            this.field2763[var2] = var4 = this.field2756 + this.field2763[class45.method323(var3, 1020) >> 2] + this.field2746;
            this.field2760[var2] = this.field2746 = this.field2763[class45.method323(261242, var4) >> 8 >> 2] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2755 = null;
        field2769 = null;
        field2768 = null;
        field2749 = null;
        field2751 = null;
        field2770 = null;
        field2766 = null;
        field2764 = null;
        field2752 = null;
        if (arg0 != -16142) {
            method897(117);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BILvd;I)V")
    public static final void method898(byte arg0, int arg1, class138 arg2, int arg3) {
        if (arg0 != 5) {
            field2765 = -34;
        }
        int var4 = arg1 * arg1 + arg3 * arg3;
        field2747++;
        if (var4 <= 4225 || var4 >= 90000) {
            class142.method1092(arg2, arg1, arg3, 83);
            return;
        }
        int var5 = class105.field2436 + class120.field2794 & 0x7FF;
        int var6 = class97.field2257[var5];
        int var7 = var6 * 256 / (class78.field1744 + 256);
        int var8 = class97.field2258[var5];
        int var9 = var8 * 256 / (class78.field1744 + 256);
        int var10 = arg1 * var9 + arg3 * var7 >> 16;
        int var11 = arg1 * var7 - arg3 * var9 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class102.field2366.method1039(var14 + 88, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltc;III)V")
    public static final void method899(class125 arg0, int arg1, int arg2, int arg3) {
        if ((arg3 & 0x8) != 0) {
            int var4 = class103.field2391.method821(-1);
            int var5 = class103.field2391.method825(21934);
            int var6 = class103.field2391.method794((byte) -106);
            int var7 = class103.field2391.field2583;
            if (arg0.field2909 != null && arg0.field2891 != null) {
                long var8 = arg0.field2909.method1030(65);
                boolean var10 = false;
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class39.field868; var11++) {
                        if (class93.field2212[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class77.field1712 == 0) {
                    class7.field156.field2583 = 0;
                    class103.field2391.method807(0, class7.field156.field2547, var6, 3);
                    class7.field156.field2583 = 0;
                    class137 var12 = class78.method575(class7.field156, (byte) 127).method1010(104);
                    arg0.field1686 = var12.method1034(37);
                    arg0.field1694 = var4 & 0xFF;
                    arg0.field1658 = 150;
                    arg0.field1651 = var4 >> 8;
                    if (var5 == 2 || var5 == 3) {
                        class109.method792(1, var12, -4, class88.method666(111, new class137[] { class84.field1907, arg0.field2909 }));
                    } else if (var5 == 1) {
                        class109.method792(1, var12, -4, class88.method666(-63, new class137[] { class59.field1266, arg0.field2909 }));
                    } else {
                        class109.method792(2, var12, -4, arg0.field2909);
                    }
                }
            }
            class103.field2391.field2583 = var6 + var7;
        }
        if ((arg3 & 0x10) != 0) {
            int var13 = class103.field2391.method825(21934);
            byte[] var14 = new byte[var13];
            class109 var15 = new class109(var14);
            class103.field2391.method807(0, var14, var13, 3);
            class78.field1737[arg2] = var15;
            arg0.method938(var15, (byte) 62);
        }
        field2757++;
        if ((arg3 & 0x200) != 0) {
            arg0.field1627 = class103.field2391.method808(-58);
            arg0.field1670 = class103.field2391.method838(255);
            arg0.field1635 = class103.field2391.method825(21934);
            arg0.field1681 = class103.field2391.method825(21934);
            arg0.field1638 = class103.field2391.method831((byte) 105) + class112.field2667;
            arg0.field1656 = class103.field2391.method831((byte) 105) + class112.field2667;
            arg0.field1633 = class103.field2391.method808(-66);
            arg0.method558(true);
        }
        if ((arg3 & 0x100) != 0) {
            int var16 = class103.field2391.method808(-127);
            int var17 = class103.field2391.method794((byte) -106);
            arg0.method562(var17, var16, (byte) -3, class112.field2667);
            arg0.field1636 = class112.field2667 + 300;
            arg0.field1671 = class103.field2391.method794((byte) -106);
            arg0.field1666 = class103.field2391.method808(-77);
        }
        if ((arg3 & 0x2) != 0) {
            arg0.field1678 = class103.field2391.method841(-19184);
            arg0.field1663 = class103.field2391.method841(-19184);
        }
        if ((arg3 & 0x40) != 0) {
            int var18 = class103.field2391.method808(-58);
            int var19 = class103.field2391.method794((byte) -106);
            arg0.method562(var19, var18, (byte) -3, class112.field2667);
            arg0.field1636 = class112.field2667 + 300;
            arg0.field1671 = class103.field2391.method808(-88);
            arg0.field1666 = class103.field2391.method794((byte) -106);
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field1625 = class103.field2391.method831((byte) 105);
            if (arg0.field1625 == 65535) {
                arg0.field1625 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg0.field1686 = class103.field2391.method833(-1);
            if (arg0.field1686.method1017(0, 96) == 126) {
                arg0.field1686 = arg0.field1686.method1035(1, 1);
                class109.method792(2, arg0.field1686, -4, arg0.field2909);
            } else if (class104.field2412 == arg0) {
                class109.method792(2, arg0.field1686, -4, arg0.field2909);
            }
            arg0.field1658 = 150;
            arg0.field1694 = 0;
            arg0.field1651 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field1655 = class103.field2391.method835(2);
            int var20 = class103.field2391.method832(14722);
            if (arg0.field1655 == 65535) {
                arg0.field1655 = -1;
            }
            arg0.field1621 = 0;
            arg0.field1660 = 0;
            arg0.field1620 = var20 >> 16;
            arg0.field1674 = (var20 & 0xFFFF) + class112.field2667;
            if (class112.field2667 < arg0.field1674) {
                arg0.field1660 = -1;
            }
        }
        if (arg1 <= 91) {
            method897(70);
        }
        if ((arg3 & 0x4) == 0) {
            return;
        }
        int var21 = class103.field2391.method835(2);
        if (var21 == 65535) {
            var21 = -1;
        }
        int var22 = class103.field2391.method794((byte) -106);
        class93.method678((byte) -47, var21, var22, arg0);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    private final void method900(byte arg0) {
        field2761++;
        int var2 = 15 / ((arg0 - 5) / 58);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var8 + var9;
            int var64 = var7 + var62;
            int var65 = var63 ^ var8 >>> 2;
            int var66 = var6 + var65;
            int var67 = var8 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var64 + var66;
            int var70 = var5 + var68;
            var7 = var69 ^ var66 >>> 16;
            int var71 = var4 + var7;
            int var72 = var66 + var70;
            var6 = var72 ^ var70 << 10;
            int var73 = var70 + var71;
            var5 = var73 ^ var71 >>> 4;
            int var74 = var3 + var6;
            int var75 = var71 + var74;
            int var76 = var5 + var62;
            var4 = var75 ^ var74 << 8;
            var9 = var4 + var65;
            int var77 = var74 + var76;
            var3 = var77 ^ var76 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field2760[var12 + 6] + var4;
            int var39 = this.field2760[var12 + 2] + var8;
            int var40 = this.field2760[var12 + 7] + var3;
            int var41 = this.field2760[var12 + 4] + var6;
            int var42 = this.field2760[var12] + var10;
            int var43 = this.field2760[var12 + 1] + var9;
            int var44 = this.field2760[var12 + 3] + var7;
            int var45 = this.field2760[var12 + 5] + var5;
            int var46 = var42 ^ var43 << 11;
            int var47 = var44 + var46;
            int var48 = var39 + var43;
            int var49 = var48 ^ var39 >>> 2;
            int var50 = var41 + var49;
            int var51 = var39 + var47;
            int var52 = var51 ^ var47 << 8;
            int var53 = var47 + var50;
            int var54 = var45 + var52;
            var7 = var53 ^ var50 >>> 16;
            int var55 = var50 + var54;
            int var56 = var7 + var38;
            var6 = var55 ^ var54 << 10;
            int var57 = var6 + var40;
            int var58 = var54 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            var9 = var4 + var49;
            int var61 = var57 + var60;
            var3 = var61 ^ var60 >>> 9;
            var10 = var9 + var60;
            var8 = var3 + var52;
            this.field2763[var12] = var10;
            this.field2763[var12 + 1] = var9;
            this.field2763[var12 + 2] = var8;
            this.field2763[var12 + 3] = var7;
            this.field2763[var12 + 4] = var6;
            this.field2763[var12 + 5] = var5;
            this.field2763[var12 + 6] = var4;
            this.field2763[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field2763[var13 + 2] + var8;
            int var15 = this.field2763[var13 + 7] + var3;
            int var16 = this.field2763[var13 + 5] + var5;
            int var17 = this.field2763[var13 + 6] + var4;
            int var18 = this.field2763[var13 + 1] + var9;
            int var19 = this.field2763[var13 + 4] + var6;
            int var20 = this.field2763[var13 + 3] + var7;
            int var21 = this.field2763[var13] + var10;
            int var22 = var21 ^ var18 << 11;
            int var23 = var20 + var22;
            int var24 = var14 + var18;
            int var25 = var24 ^ var14 >>> 2;
            int var26 = var19 + var25;
            int var27 = var14 + var23;
            int var28 = var27 ^ var23 << 8;
            int var29 = var23 + var26;
            int var30 = var16 + var28;
            var7 = var29 ^ var26 >>> 16;
            int var31 = var26 + var30;
            var6 = var31 ^ var30 << 10;
            int var32 = var7 + var17;
            int var33 = var6 + var15;
            int var34 = var30 + var32;
            var5 = var34 ^ var32 >>> 4;
            int var35 = var5 + var22;
            int var36 = var32 + var33;
            var4 = var36 ^ var33 << 8;
            int var37 = var33 + var35;
            var9 = var4 + var25;
            var3 = var37 ^ var35 >>> 9;
            var8 = var3 + var28;
            var10 = var9 + var35;
            this.field2763[var13] = var10;
            this.field2763[var13 + 1] = var9;
            this.field2763[var13 + 2] = var8;
            this.field2763[var13 + 3] = var7;
            this.field2763[var13 + 4] = var6;
            this.field2763[var13 + 5] = var5;
            this.field2763[var13 + 6] = var4;
            this.field2763[var13 + 7] = var3;
        }
        this.method896((byte) 87);
        this.field2759 = 256;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
    public class116(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2760[var2] = arg0[var2];
        }
        this.method900((byte) -92);
    }
}
