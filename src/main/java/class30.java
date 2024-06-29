import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class30 {

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
    private int[] field477;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    public static int[] field467 = new int[2048];

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Llc;")
    private static class143 field473 = class66.method374("Created gameworld", -1);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Llc;")
    public static class143 field475 = field473;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    private final void method199(int arg0) {
        field469++;
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
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var5 + var63;
            int var67 = var65 ^ var64 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var63;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field471[var11 + 2] + var7;
            int var38 = this.field471[var11 + 3] + var6;
            int var39 = this.field471[var11 + 5] + var4;
            int var40 = this.field471[var11 + 1] + var8;
            int var41 = this.field471[var11 + 4] + var5;
            int var42 = this.field471[var11 + 6] + var3;
            int var43 = this.field471[var11] + var9;
            int var44 = var43 ^ var40 << 11;
            int var45 = var37 + var40;
            int var46 = this.field471[var11 + 7] + var2;
            int var47 = var45 ^ var37 >>> 2;
            int var48 = var41 + var47;
            int var49 = var38 + var44;
            int var50 = var37 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var39 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var48 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var46;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var44;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var47;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field477[var11] = var9;
            this.field477[var11 + 1] = var8;
            this.field477[var11 + 2] = var7;
            this.field477[var11 + 3] = var6;
            this.field477[var11 + 4] = var5;
            this.field477[var11 + 5] = var4;
            this.field477[var11 + 6] = var3;
            this.field477[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field477[var12 + 3] + var6;
            int var14 = this.field477[var12 + 4] + var5;
            int var15 = this.field477[var12 + 6] + var3;
            int var16 = this.field477[var12 + 7] + var2;
            int var17 = this.field477[var12 + 5] + var4;
            int var18 = this.field477[var12] + var9;
            int var19 = this.field477[var12 + 2] + var7;
            int var20 = this.field477[var12 + 1] + var8;
            int var21 = var18 ^ var20 << 11;
            int var22 = var19 + var20;
            int var23 = var22 ^ var19 >>> 2;
            int var24 = var13 + var21;
            int var25 = var14 + var23;
            int var26 = var19 + var24;
            int var27 = var26 ^ var24 << 8;
            int var28 = var17 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var15;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var16;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var23;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field477[var12] = var9;
            this.field477[var12 + 1] = var8;
            this.field477[var12 + 2] = var7;
            this.field477[var12 + 3] = var6;
            this.field477[var12 + 4] = var5;
            this.field477[var12 + 5] = var4;
            this.field477[var12 + 6] = var3;
            this.field477[var12 + 7] = var2;
        }
        if (arg0 != 1283625034) {
            method202(-84);
        }
        this.method201((byte) 120);
        this.field480 = 256;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method200(byte arg0) {
        field475 = null;
        if (arg0 != -48) {
            field479 = 127;
        }
        field473 = null;
        field467 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    private final void method201(byte arg0) {
        this.field465 += ++this.field468;
        field476++;
        int var2 = 0;
        if (arg0 <= 119) {
            field479 = -11;
        }
        while (var2 < 256) {
            int var3 = this.field477[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field466 ^= this.field466 << 13;
                } else {
                    this.field466 ^= this.field466 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field466 ^= this.field466 << 2;
            } else {
                this.field466 ^= this.field466 >>> 16;
            }
            this.field466 += this.field477[var2 + 128 & 0xFF];
            int var4;
            this.field477[var2] = var4 = this.field466 + (this.field477[class129.method777(255, var3 >> 2)] + this.field465);
            this.field471[var2] = this.field465 = var3 + this.field477[class129.method777(var4, 261229) >> 8 >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static final void method202(int arg0) {
        class237.method1596(arg0 ^ 0x1C8);
        field478++;
        class266.method1771(arg0 - 256);
        class240.method1610(83);
        class39.method254(127);
        class273.method1804(arg0 ^ 0x697F);
        class188.method1222(-127);
        class90.method516(120);
        class228.method1558(99);
        class51.method313(20092);
        class224.method1540(20391);
        class287.method1878(16711680);
        class80.method452(0);
        class165.method1087((byte) -75);
        class65.method369(27647);
        class127.method771(true);
        class226.method1548(32);
        ((class66) class196.field3636).method375(true);
        class235.field4281.method1166(118);
        class143.field2566.method31((byte) -41);
        class31.field488.method31((byte) -41);
        if (arg0 != 256) {
            method202(-28);
        }
        class132.field2321.method31((byte) -41);
        class89.field1614.method31((byte) -41);
        class57.field1110.method31((byte) -41);
        class278.field4911.method31((byte) -41);
        class109.field1915.method31((byte) -41);
        class140.field2439.method31((byte) -41);
        class109.field1911.method31((byte) -41);
        class14.field254.method31((byte) -41);
        class66.field1244.method31((byte) -41);
        class5.field74.method823(true);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I")
    public final int method203(int arg0) {
        field474++;
        if (~(this.field480--) == arg0) {
            this.method201((byte) 125);
            this.field480 = 255;
        }
        return this.field471[this.field480];
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    private class30() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([I)V")
    public class30(int[] arg0) {
        this.field477 = new int[256];
        this.field471 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field471[var2] = arg0[var2];
        }
        this.method199(1283625034);
    }
}
