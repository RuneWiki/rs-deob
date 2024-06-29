import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class146 {

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[B")
    public byte[] field1721;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[Lkc;")
    public class72[] field1735;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    private int[] field1733;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "[Lib;")
    public class58[] field1712;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "[B")
    public byte[] field1731;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[B")
    public byte[] field1722;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[S")
    public short[] field1723;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lec;")
    public static class32 field1713 = method594("scape main", true);

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "[I")
    public static int[] field1734 = new int[128];

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1728 = 5063219;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lec;")
    private static class32 field1717 = method594("Loading fonts )2 ", true);

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Lec;")
    public static class32 field1730 = field1717;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lea;")
    public static class30 field1716;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method592(int arg0, byte[] arg1, boolean arg2) {
        field1718++;
        int var3 = 114 / ((arg0 + 84) / 39);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class115.field2767) {
            try {
                class131 var4 = (class131) Class.forName("bb").getDeclaredConstructor().newInstance();
                var4.method60(arg1, (byte) -125);
                return var4;
            } catch (Throwable var5) {
                class115.field2767 = true;
            }
        }
        return arg2 ? class86.method669(49, arg1) : arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method593(boolean arg0) {
        this.field1733 = null;
        if (!arg0) {
            field1727++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;Z)Lec;")
    public static final class32 method594(String arg0, boolean arg1) {
        field1736++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class32 var4 = new class32();
        var4.field618 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field618[var4.field674++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field618[var4.field674++] = (byte) var6;
            }
        }
        var4.method269(-8087);
        if (!arg1) {
            method595(-126);
        }
        return var4.method254((byte) 10);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1717 = null;
        field1716 = null;
        field1730 = null;
        field1734 = null;
        field1713 = null;
        int var1 = 126 / ((arg0 + 47) / 57);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjf;[B[I)Z")
    public final boolean method596(int arg0, class68 arg1, byte[] arg2, int[] arg3) {
        field1732++;
        boolean var5 = true;
        class58 var6 = null;
        int var7 = 0;
        if (arg0 != 1) {
            method592(101, null, true);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1733[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method567(var9 >> 2, (byte) 111, arg3);
                        } else {
                            var6 = arg1.method568(arg3, (byte) -33, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1712[var8] = var6;
                        this.field1733[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IJ)V")
    public static final void method597(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        int var3 = -7 % ((-arg0 - 44) / 43);
        field1729++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method598(int arg0, int arg1, int arg2) {
        class107 var3 = (class107) class34.field710.method1198((long) arg2, (byte) -106);
        field1724++;
        if (var3 == null) {
            return -1;
        } else if (arg0 == 0) {
            return arg1 >= 0 && arg1 < var3.field2539.length ? var3.field2539[arg1] : -1;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class73() {
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
    public class73(byte[] arg0) {
        this.field1721 = new byte[128];
        this.field1735 = new class72[128];
        this.field1733 = new int[128];
        this.field1712 = new class58[128];
        int var2 = 0;
        this.field1731 = new byte[128];
        this.field1722 = new byte[128];
        this.field1723 = new short[128];
        class66 var3 = new class66(arg0);
        while (var3.field1587[var3.field1569 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method545((byte) 100);
        }
        var3.field1569++;
        var2++;
        int var6 = var3.field1569;
        int var7 = 0;
        var3.field1569 += var2;
        while (var3.field1587[var3.field1569 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method545((byte) 95);
        }
        var7++;
        int var10 = 0;
        var3.field1569++;
        int var11 = var3.field1569;
        var3.field1569 += var7;
        while (var3.field1587[var3.field1569 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method545((byte) 107);
        }
        var3.field1569++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method533(255);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class72[] var18 = new class72[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class72 var102 = var18[var19] = new class72();
            int var103 = var3.method533(255);
            if (var103 > 0) {
                var102.field1690 = new byte[var103 * 2];
            }
            int var104 = var3.method533(255);
            if (var104 > 0) {
                var102.field1704 = new byte[var104 * 2 + 2];
                var102.field1704[1] = 64;
            }
        }
        int var20 = var3.method533(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var3.method533(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field1587[var3.field1569 + var22] != 0) {
            var22++;
        }
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method545((byte) 99);
        }
        var22++;
        var3.field1569++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method533(255);
            this.field1723[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method533(255);
            this.field1723[var30] = (short) (this.field1723[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 < var25.length) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var3.method511(-1592222329);
            }
            var31--;
            this.field1723[var34] = (short) (this.field1723[var34] + (class41.method326(2, var32 - 1) << 14));
            this.field1733[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1733[var38] != 0) {
                if (var37 == 0) {
                    if (var4.length > var35) {
                        var37 = var4[var35++];
                    } else {
                        var37 = -1;
                    }
                    var36 = var3.field1587[var6++] - 1;
                }
                var37--;
                this.field1731[var38] = (byte) var36;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1733[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field1587[var11++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field1721[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        class72 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1733[var46] != 0) {
                if (var45 == 0) {
                    var44 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var45 = -1;
                    } else {
                        var45 = var12[var43++];
                    }
                }
                this.field1735[var46] = var44;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field1733[var50] > 0) {
                    var49 = var3.method533(255) + 1;
                }
            }
            var48--;
            this.field1722[var50] = (byte) var49;
        }
        this.field1715 = var3.method533(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class72 var99 = var18[var51];
            if (var99.field1690 != null) {
                for (int var100 = 1; var100 < var99.field1690.length; var100 += 2) {
                    var99.field1690[var100] = var3.method545((byte) 95);
                }
            }
            if (var99.field1704 != null) {
                for (int var101 = 3; var101 < var99.field1704.length - 2; var101 += 2) {
                    var99.field1704[var101] = var3.method545((byte) 123);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method545((byte) 118);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method545((byte) 106);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class72 var96 = var18[var54];
            if (var96.field1704 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1704.length; var98 += 2) {
                    var97 -= -var3.method533(255) - 1;
                    var96.field1704[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class72 var93 = var18[var55];
            if (var93.field1690 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1690.length; var95 += 2) {
                    var94 = var3.method533(255) + var94 + 1;
                    var93.field1690[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method533(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method533(255) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1722[var60] = (byte) (this.field1722[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class115.method903(var66, var64 - var58, (byte) -127);
                    this.field1722[var67] = (byte) (this.field1722[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1722[var63] = (byte) (this.field1722[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method533(255);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var3.method533(255) + var69 + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1721[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1721[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) * var72 + (var78 - var71) / 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class115.method903(var80, var78 - var71, (byte) -127);
                    var80 += var79 - var72;
                    int var83 = (this.field1721[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1721[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1721[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1721[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1703 = var3.method533(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class72 var92 = var18[var86];
            if (var92.field1690 != null) {
                var92.field1692 = var3.method533(255);
            }
            if (var92.field1704 != null) {
                var92.field1708 = var3.method533(255);
            }
            if (var92.field1703 > 0) {
                var92.field1699 = var3.method533(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1698 = var3.method533(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class72 var91 = var18[var88];
            if (var91.field1698 > 0) {
                var91.field1711 = var3.method533(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class72 var90 = var18[var89];
            if (var90.field1711 > 0) {
                var90.field1691 = var3.method533(255);
            }
        }
    }
}
