import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
    private int[] field1551 = new int[256];

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
    private int[] field1541 = new int[256];

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lfc;")
    public static class39 field1546 = class90.method774("und die Schaltfl-=che (WSpielkonto erstellen(W am", -116);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lfc;")
    public static class39 field1542 = class90.method774("Benutzername: ", -103);

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lfc;")
    public static class39 field1544 = class90.method774("RuneScape wurde aktualisiert(Q", -99);

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lfc;")
    public static class39 field1557 = class90.method774(" )2> ", -83);

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lfc;")
    public static class39 field1553 = class90.method774("overlay_multiway", -113);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1556 = 1;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
    public static boolean field1548 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lnd;")
    public static class94 field1550;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Ltb;", line = 6)
    public static final class132 method617(int arg0, byte arg1) {
        field1539++;
        class132 var2 = (class132) class116.field3034.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class16.field471.method839(5, 3, arg0);
        class132 var4 = new class132();
        if (var3 != null) {
            var4.method1076(new class25(var3), -99);
        }
        if (arg1 >= -65) {
            return null;
        } else {
            class116.field3034.method934(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)I", line = 57)
    public final int method618(byte arg0) {
        if (this.field1552-- == 0) {
            this.method620(-31106);
            this.field1552 = 255;
        }
        if (arg0 < 11) {
            method623(46);
        }
        field1537++;
        return this.field1541[this.field1552];
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I", line = 85)
    public static final int method619(int arg0, int arg1, int arg2) {
        field1536++;
        if (arg2 >= 2) {
            int var3 = method619(-113, arg1 * arg1, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            return var3;
        } else if (arg2 == 1) {
            return arg1;
        } else {
            int var4 = -126 % ((-arg0 - 42) / 42);
            return 1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 108)
    private final void method620(int arg0) {
        this.field1549 += ++this.field1555;
        field1540++;
        int var2 = 0;
        if (arg0 != -31106) {
            field1553 = null;
        }
        while (var2 < 256) {
            int var3 = this.field1551[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1554 ^= this.field1554 << 13;
                } else {
                    this.field1554 ^= this.field1554 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1554 ^= this.field1554 << 2;
            } else {
                this.field1554 ^= this.field1554 >>> 16;
            }
            this.field1554 += this.field1551[var2 + 128 & 0xFF];
            int var4;
            this.field1551[var2] = var4 = this.field1554 + this.field1551[class87.method747(1020, var3) >> 2] + this.field1549;
            this.field1541[var2] = this.field1549 = this.field1551[class87.method747(255, var4 >> 8 >> 2)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 150)
    private final void method621(int arg0) {
        field1545++;
        if (arg0 != -2) {
            return;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1541[var11 + 6] + var3;
            int var38 = this.field1541[var11 + 3] + var6;
            int var39 = this.field1541[var11 + 4] + var5;
            int var40 = this.field1541[var11 + 5] + var4;
            int var41 = this.field1541[var11 + 7] + var2;
            int var42 = this.field1541[var11] + var9;
            int var43 = this.field1541[var11 + 1] + var8;
            int var44 = this.field1541[var11 + 2] + var7;
            int var45 = var42 ^ var43 << 11;
            int var46 = var43 + var44;
            int var47 = var38 + var45;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var39 + var48;
            int var50 = var44 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var40 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var37;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var5 + var41;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field1551[var11] = var9;
            this.field1551[var11 + 1] = var8;
            this.field1551[var11 + 2] = var7;
            this.field1551[var11 + 3] = var6;
            this.field1551[var11 + 4] = var5;
            this.field1551[var11 + 5] = var4;
            this.field1551[var11 + 6] = var3;
            this.field1551[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1551[var12 + 7] + var2;
            int var14 = this.field1551[var12 + 5] + var4;
            int var15 = this.field1551[var12 + 6] + var3;
            int var16 = this.field1551[var12 + 4] + var5;
            int var17 = this.field1551[var12] + var9;
            int var18 = this.field1551[var12 + 3] + var6;
            int var19 = this.field1551[var12 + 1] + var8;
            int var20 = this.field1551[var12 + 2] + var7;
            int var21 = var17 ^ var19 << 11;
            int var22 = var19 + var20;
            int var23 = var22 ^ var20 >>> 2;
            int var24 = var18 + var21;
            int var25 = var20 + var24;
            int var26 = var25 ^ var24 << 8;
            int var27 = var16 + var23;
            int var28 = var14 + var26;
            int var29 = var24 + var27;
            var6 = var29 ^ var27 >>> 16;
            int var30 = var6 + var15;
            int var31 = var27 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var26;
            var8 = var3 + var23;
            var9 = var8 + var34;
            this.field1551[var12] = var9;
            this.field1551[var12 + 1] = var8;
            this.field1551[var12 + 2] = var7;
            this.field1551[var12 + 3] = var6;
            this.field1551[var12 + 4] = var5;
            this.field1551[var12 + 5] = var4;
            this.field1551[var12 + 6] = var3;
            this.field1551[var12 + 7] = var2;
        }
        this.method620(arg0 - 31104);
        this.field1552 = 256;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLob;I)Lfc;", line = 304)
    public static final class39 method622(boolean arg0, class99 arg1, int arg2) {
        field1538++;
        if (arg0) {
            return null;
        } else if (!class5.method81((byte) 22, class89.method768(arg1, 111), arg2)) {
            return null;
        } else if (arg1.field2445 == null || arg2 >= arg1.field2445.length || arg1.field2445[arg2] == null || arg1.field2445[arg2].method448((byte) -127).method437(-106) == 0) {
            return class38.field1026 ? class137.method1111(new class39[] { class5.field171, class86.method734(arg2, 2218) }, (byte) -21) : null;
        } else {
            return arg1.field2445[arg2];
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 327)
    public static void method623(int arg0) {
        if (arg0 != -30206) {
            return;
        }
        field1544 = null;
        field1557 = null;
        field1542 = null;
        field1553 = null;
        field1550 = null;
        field1546 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V", line = 344)
    public class63(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1541[var2] = arg0[var2];
        }
        this.method621(-2);
    }
}
