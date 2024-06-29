import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class195 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    private int[] field3425;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
    private int[] field3422;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Lqj;")
    public static class196 field3429 = class80.method502("hint_mapedge", -48);

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[Z")
    public static boolean[] field3431 = new boolean[200];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lqj;")
    public static class196 field3420 = null;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    private int field3428;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[Z")
    public static boolean[][] field3423;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "[[[B")
    public static byte[][][] field3433;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I")
    public final int method1280(int arg0) {
        if (this.field3434-- == 0) {
            this.method1282(-8095);
            this.field3434 = 255;
        }
        int var2 = 123 / ((-arg0 - 4) / 62);
        field3436++;
        return this.field3422[this.field3434];
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        field3424++;
        class215.method1479(121);
        class7.method27(0);
        class65.method413(arg0 + 43088380);
        class78.method487(2);
        class223.method1510((byte) 39);
        class148.method924((byte) -67);
        class142.method876(125);
        class227.method1530(arg0 ^ 0xFD6E861D);
        class210.method1456(0);
        class235.method1576((byte) 125);
        class217.method1486(false);
        class80.method498(true);
        class246.method1681(arg0 ^ 0xFD6EAD37);
        class241.method1641(true);
        ((class185) class15.field171).method1214(86);
        class215.field3853.method577((byte) -76);
        class194.field3414.method828(-114);
        class76.field1088.method828(-103);
        class186.field3271.method828(arg0 ^ 0x29179CD);
        class230.field4091.method828(arg0 ^ 0x29179A8);
        if (arg0 != -43088380) {
            field3432 = -10;
        }
        class144.field2219.method828(-101);
        class62.field847.method828(-76);
        class40.field445.method828(arg0 ^ 0x2917982);
        class196.field3439.method828(-77);
        class54.field673.method828(-67);
        class243.field4334.method828(arg0 + 43088293);
        class149.field2385.method828(-116);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final void method1282(int arg0) {
        field3419++;
        this.field3435 += ++this.field3421;
        if (arg0 != -8095) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3425[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3428 ^= this.field3428 << 13;
                } else {
                    this.field3428 ^= this.field3428 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3428 ^= this.field3428 << 2;
            } else {
                this.field3428 ^= this.field3428 >>> 16;
            }
            this.field3428 += this.field3425[var2 + 128 & 0xFF];
            int var4;
            this.field3425[var2] = var4 = this.field3435 + this.field3425[class65.method409(1020, var3) >> 2] + this.field3428;
            this.field3422[var2] = this.field3435 = this.field3425[class65.method409(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    private final void method1283(int arg0) {
        field3426++;
        if (arg0 != 793504164) {
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3422[var11 + 4] + var5;
            int var38 = this.field3422[var11] + var9;
            int var39 = this.field3422[var11 + 7] + var2;
            int var40 = this.field3422[var11 + 5] + var4;
            int var41 = this.field3422[var11 + 2] + var7;
            int var42 = this.field3422[var11 + 3] + var6;
            int var43 = this.field3422[var11 + 6] + var3;
            int var44 = this.field3422[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var42 + var45;
            int var47 = var41 + var44;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var37 + var48;
            int var50 = var41 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var43;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var39;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field3425[var11] = var9;
            this.field3425[var11 + 1] = var8;
            this.field3425[var11 + 2] = var7;
            this.field3425[var11 + 3] = var6;
            this.field3425[var11 + 4] = var5;
            this.field3425[var11 + 5] = var4;
            this.field3425[var11 + 6] = var3;
            this.field3425[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3425[var12 + 2] + var7;
            int var14 = this.field3425[var12] + var9;
            int var15 = this.field3425[var12 + 3] + var6;
            int var16 = this.field3425[var12 + 6] + var3;
            int var17 = this.field3425[var12 + 7] + var2;
            int var18 = this.field3425[var12 + 1] + var8;
            int var19 = var14 ^ var18 << 11;
            int var20 = this.field3425[var12 + 5] + var4;
            int var21 = var13 + var18;
            int var22 = this.field3425[var12 + 4] + var5;
            int var23 = var15 + var19;
            int var24 = var21 ^ var13 >>> 2;
            int var25 = var22 + var24;
            int var26 = var13 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var20 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var17;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field3425[var12] = var9;
            this.field3425[var12 + 1] = var8;
            this.field3425[var12 + 2] = var7;
            this.field3425[var12 + 3] = var6;
            this.field3425[var12 + 4] = var5;
            this.field3425[var12 + 5] = var4;
            this.field3425[var12 + 6] = var3;
            this.field3425[var12 + 7] = var2;
        }
        this.method1282(-8095);
        this.field3434 = 256;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3429 = null;
        field3433 = null;
        if (arg0 != -26788) {
            method1285(118);
        }
        field3420 = null;
        field3423 = null;
        field3431 = null;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        field3430++;
        if (class151.field2440 > 0) {
            class144.method895(arg0 ^ 0x28);
        } else {
            class180.method1182((byte) -101, arg0);
            class142.field2179 = class194.field3408;
            class194.field3408 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    private class195() {
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([I)V")
    public class195(int[] arg0) {
        this.field3425 = new int[256];
        this.field3422 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3422[var2] = arg0[var2];
        }
        this.method1283(793504164);
    }
}
