import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class97 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "[I")
    private int[] field1604;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
    private int[] field1595;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lgb;")
    public static class158 field1590 = new class158(64);

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lwa;")
    public static class75 field1598 = null;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
    public static int[] field1602 = new int[128];

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lwa;")
    public static class75 field1606 = class66.method560("cross", false);

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lwa;")
    private static class75 field1600 = class66.method560("Loading)3)3)3", false);

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lwa;")
    public static class75 field1597 = field1600;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lcb;")
    public static class267 field1599;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLp;)V", line = 4)
    public static final void method746(int arg0, boolean arg1, class93 arg2) {
        field1593++;
        int var3 = arg2.field1518;
        if (arg0 != 32678) {
            method748((byte) 45, 80);
        }
        int var4 = (int) arg2.field3488;
        arg2.method1527(75);
        if (arg1) {
            class228.method1665((byte) 46, var3);
        }
        class202.method1501(var3, -95);
        class262 var5 = class51.method374(-47, var4);
        if (var5 != null) {
            class291.method2027(var5, 14580);
        }
        int var6 = class126.field2188;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class90.method714(64, class99.field1646[var7])) {
                class302.method2075(1, var7);
            }
        }
        if (class126.field2188 == 1) {
            class153.field2625 = false;
            class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
        } else {
            class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
            int var8 = class3.field28.method779(class69.field1187);
            for (int var9 = 0; var9 < class126.field2188; var9++) {
                int var10 = class3.field28.method779(class147.method1134(var9, (byte) -90));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class269.field4653 = var8 + 8;
            class270.field4677 = class126.field2188 * 15 + 22;
        }
        if (class81.field1361 != -1) {
            class176.method1296(28, 1, class81.field1361);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 75)
    private final void method747(byte arg0) {
        field1603++;
        this.field1589 += ++this.field1592;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1595[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1596 ^= this.field1596 << 13;
                } else {
                    this.field1596 ^= this.field1596 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1596 ^= this.field1596 << 2;
            } else {
                this.field1596 ^= this.field1596 >>> 16;
            }
            this.field1596 += this.field1595[var2 + 128 & 0xFF];
            int var4;
            this.field1595[var2] = var4 = this.field1589 + this.field1596 + this.field1595[class235.method1710(var3, 1020) >> 2];
            this.field1604[var2] = this.field1589 = this.field1595[class235.method1710(var4 >> 8 >> 2, 255)] + var3;
        }
        if (arg0 != -79) {
            this.method747((byte) 96);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)I", line = 117)
    public static final int method748(byte arg0, int arg1) {
        field1591++;
        double var2 = (double) ((arg1 & 0xFF2E3D) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF76) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        double var10 = var2;
        double var12 = 0.0D;
        if (var6 < var8) {
            var8 = var6;
        }
        if (arg0 != -76) {
            return -43;
        }
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var19 = (int) (var12 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        double var20 = var14 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var19 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 217)
    public final int method749(int arg0) {
        field1594++;
        if (arg0 != 64) {
            this.field1592 = 85;
        }
        if ((this.field1607--) == 0) {
            this.method747((byte) -79);
            this.field1607 = 255;
        }
        return this.field1604[this.field1607];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)V", line = 238)
    public static final void method750(byte arg0, boolean arg1) {
        if (arg0 <= 62) {
            field1600 = (class75) null;
        }
        field1605++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var3 = 1;
            var2 = class226.field3814;
        } else {
            var2 = class267.field4595;
            var3 = 4;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class288.field4952[var5] >> 8) * 64 - class275.field4737;
            byte[] var7 = var2[var5];
            int var8 = (class288.field4952[var5] & 0xFF) * 64 - class175.field2939;
            if (var7 != null) {
                class54.method393((byte) 43);
                class188.method1422((class59.field984 - 6) * 8, var8, class104.field1759 * 8 - 48, (byte) -99, arg1, var6, var7, class286.field4931);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class288.field4952[var9] >> 8) * 64 - class275.field4737;
            byte[] var11 = var2[var9];
            int var12 = (class288.field4952[var9] & 0xFF) * 64 - class175.field2939;
            if (var11 == null && class104.field1759 < 800) {
                class54.method393((byte) 43);
                for (int var13 = 0; var13 < var3; var13++) {
                    class273.method1951(var10, 64, var13, 64, var12, 111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 310)
    public static void method751(int arg0) {
        field1598 = null;
        field1597 = null;
        field1606 = null;
        if (arg0 > -64) {
            method751(-124);
        }
        field1599 = null;
        field1602 = null;
        field1590 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 337)
    private final void method752(boolean arg0) {
        field1588++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var6 + var11;
            int var15 = var5 + var13;
            int var16 = var7 + var14;
            int var17 = var16 ^ var14 << 8;
            int var18 = var4 + var17;
            int var19 = var14 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var18 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var20 >>> 4;
            int var24 = var20 + var23;
            int var25 = var4 + var11;
            var3 = var24 ^ var23 << 8;
            int var26 = var23 + var25;
            var8 = var3 + var13;
            var2 = var26 ^ var25 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1604[var27 + 5] + var4;
            int var29 = this.field1604[var27] + var9;
            int var30 = this.field1604[var27 + 3] + var6;
            int var31 = this.field1604[var27 + 6] + var3;
            int var32 = this.field1604[var27 + 1] + var8;
            int var33 = var29 ^ var32 << 11;
            int var34 = this.field1604[var27 + 2] + var7;
            int var35 = this.field1604[var27 + 4] + var5;
            int var36 = this.field1604[var27 + 7] + var2;
            int var37 = var32 + var34;
            int var38 = var37 ^ var34 >>> 2;
            int var39 = var30 + var33;
            int var40 = var34 + var39;
            int var41 = var40 ^ var39 << 8;
            int var42 = var28 + var41;
            int var43 = var35 + var38;
            int var44 = var39 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var42 + var43;
            var5 = var45 ^ var42 << 10;
            int var46 = var6 + var31;
            int var47 = var5 + var36;
            int var48 = var42 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var4 + var33;
            int var50 = var46 + var47;
            var3 = var50 ^ var47 << 8;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var8 = var3 + var38;
            var7 = var2 + var41;
            var9 = var8 + var49;
            this.field1595[var27] = var9;
            this.field1595[var27 + 1] = var8;
            this.field1595[var27 + 2] = var7;
            this.field1595[var27 + 3] = var6;
            this.field1595[var27 + 4] = var5;
            this.field1595[var27 + 5] = var4;
            this.field1595[var27 + 6] = var3;
            this.field1595[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1595[var52 + 2] + var7;
            int var54 = this.field1595[var52] + var9;
            int var55 = this.field1595[var52 + 1] + var8;
            int var56 = this.field1595[var52 + 5] + var4;
            int var57 = this.field1595[var52 + 7] + var2;
            int var58 = var54 ^ var55 << 11;
            int var59 = var53 + var55;
            int var60 = this.field1595[var52 + 3] + var6;
            int var61 = this.field1595[var52 + 4] + var5;
            int var62 = var58 + var60;
            int var63 = this.field1595[var52 + 6] + var3;
            int var64 = var59 ^ var53 >>> 2;
            int var65 = var61 + var64;
            int var66 = var53 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var56 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var63;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var5 + var57;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var58;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field1595[var52] = var9;
            this.field1595[var52 + 1] = var8;
            this.field1595[var52 + 2] = var7;
            this.field1595[var52 + 3] = var6;
            this.field1595[var52 + 4] = var5;
            this.field1595[var52 + 5] = var4;
            this.field1595[var52 + 6] = var3;
            this.field1595[var52 + 7] = var2;
        }
        this.method747((byte) -79);
        this.field1607 = 256;
        if (arg0) {
            field1600 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 518)
    private class97() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([I)V", line = 520)
    public class97(int[] arg0) {
        this.field1604 = new int[256];
        this.field1595 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1604[var2] = arg0[var2];
        }
        this.method752(false);
    }
}
