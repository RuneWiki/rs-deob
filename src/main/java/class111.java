import java.awt.Graphics;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class111 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    private int[] field2479 = new int[256];

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
    private int[] field2489 = new int[256];

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2486 = 20;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Loa;")
    public static class98 field2478 = class38.method349(255, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Loa;")
    public static class98 field2488 = class38.method349(255, "jolt");

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2491 = new CRC32();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Loa;")
    public static class98 field2495 = class38.method349(255, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    private int field2483;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    private int field2494;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method904(int arg0) {
        class24.method268(class77.field1694, 2047);
        if (class108.field2451 != -1) {
            class24.method268(class108.field2451, arg0 + 2098);
        }
        field2492++;
        class52.field1161 = 0;
        class62.field1328.method714(arg0 ^ 0xFFFFFFC7);
        class66.method534();
        class7.method40();
        class35.method334(0, 765, 0, 10616, class77.field1694, 503, 0);
        if (arg0 != -51) {
            return;
        }
        if (class108.field2451 != -1) {
            class35.method334(0, 765, 0, 10616, class108.field2451, 503, 0);
        }
        if (class145.field3529) {
            class67.method550(-110);
        } else {
            class54.method443(109);
            class53.method434(true);
        }
        try {
            Graphics var1 = class73.field1506.getGraphics();
            class62.field1328.method406(32, 0, 0, var1);
        } catch (Exception var2) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public final int method905(int arg0) {
        if (this.field2490-- == 0) {
            this.method907(20503);
            this.field2490 = 255;
        }
        field2487++;
        int var2 = 69 % ((arg0 - 73) / 39);
        return this.field2489[this.field2490];
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method906(int arg0) {
        field2491 = null;
        field2488 = null;
        field2495 = null;
        field2478 = null;
        if (arg0 >= -81) {
            method904(-80);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    private final void method907(int arg0) {
        this.field2494 += ++this.field2483;
        field2484++;
        int var2 = 0;
        if (arg0 != 20503) {
            method908(-82);
        }
        while (var2 < 256) {
            int var3 = this.field2479[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2493 ^= this.field2493 << 13;
                } else {
                    this.field2493 ^= this.field2493 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2493 ^= this.field2493 << 2;
            } else {
                this.field2493 ^= this.field2493 >>> 16;
            }
            this.field2493 += this.field2479[var2 + 128 & 0xFF];
            int var4;
            this.field2479[var2] = var4 = this.field2493 + this.field2479[class150.method1211(var3, 1020) >> 2] + this.field2494;
            this.field2489[var2] = this.field2494 = this.field2479[class150.method1211(255, var4 >> 8 >> 2)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)I")
    public static final int method908(int arg0) {
        field2485++;
        return arg0 < 55 ? 49 : 19;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    private final void method909(int arg0) {
        field2482++;
        if (arg0 != -5) {
            field2478 = null;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var5 + var63;
            int var66 = var7 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var64 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var3 + var6;
            int var72 = var69 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2489[var11 + 6] + var3;
            int var38 = this.field2489[var11 + 7] + var2;
            int var39 = this.field2489[var11 + 5] + var4;
            int var40 = this.field2489[var11 + 3] + var6;
            int var41 = this.field2489[var11 + 1] + var8;
            int var42 = this.field2489[var11 + 4] + var5;
            int var43 = this.field2489[var11 + 2] + var7;
            int var44 = this.field2489[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var40 + var45;
            int var47 = var41 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var42 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var39 + var51;
            int var54 = var6 + var37;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var38;
            int var59 = var54 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var57;
            this.field2479[var11] = var9;
            this.field2479[var11 + 1] = var8;
            this.field2479[var11 + 2] = var7;
            this.field2479[var11 + 3] = var6;
            this.field2479[var11 + 4] = var5;
            this.field2479[var11 + 5] = var4;
            this.field2479[var11 + 6] = var3;
            this.field2479[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2479[var12 + 7] + var2;
            int var14 = this.field2479[var12 + 1] + var8;
            int var15 = this.field2479[var12 + 5] + var4;
            int var16 = this.field2479[var12 + 2] + var7;
            int var17 = this.field2479[var12 + 4] + var5;
            int var18 = this.field2479[var12 + 6] + var3;
            int var19 = this.field2479[var12 + 3] + var6;
            int var20 = this.field2479[var12] + var9;
            int var21 = var20 ^ var14 << 11;
            int var22 = var14 + var16;
            int var23 = var19 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var17 + var24;
            int var26 = var16 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var6 + var18;
            int var30 = var15 + var27;
            int var31 = var25 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var29 >>> 4;
            int var33 = var5 + var13;
            int var34 = var4 + var21;
            int var35 = var29 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field2479[var12] = var9;
            this.field2479[var12 + 1] = var8;
            this.field2479[var12 + 2] = var7;
            this.field2479[var12 + 3] = var6;
            this.field2479[var12 + 4] = var5;
            this.field2479[var12 + 5] = var4;
            this.field2479[var12 + 6] = var3;
            this.field2479[var12 + 7] = var2;
        }
        this.method907(arg0 ^ 0xFFFFAFEC);
        this.field2490 = 256;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public static final void method910(int arg0) {
        field2480++;
        class36.field887.method714(122);
        class73.field1516.method830(0, 0);
        class66.method534();
        if (arg0 < 62) {
            field2478 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([I)V")
    public class111(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2489[var2] = arg0[var2];
        }
        this.method909(-5);
    }
}
