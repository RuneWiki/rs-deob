import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class73 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    private int[] field1445;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
    private int[] field1451;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lvd;")
    public static class222 field1448 = class212.method1357("Unerwartete Antwort vom Anmelde)2Server", 10731);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lvd;")
    public static class222 field1450 = class212.method1357("Starte 3D)2Softwarebibliothek", 10731);

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field1454 = -1;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
    public static int[] field1455 = new int[256];

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lig;")
    public static class93 field1453 = new class93(20);

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "[Lw;")
    public static class228[] field1459 = new class228[24];

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lvd;")
    private static class222 field1458 = class212.method1357("Loaded fonts", 10731);

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[[I")
    public static int[][] field1457 = new int[104][104];

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lvd;")
    public static class222 field1456 = field1458;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lve;")
    public static class223 field1449;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    public static int[] field1444;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BBII)Lvd;")
    public static final class222 method496(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1447++;
        if (arg1 != 112) {
            method499(null, (byte) 11);
        }
        class222 var4 = new class222();
        var4.field4121 = 0;
        var4.field4163 = new byte[arg2];
        for (int var5 = arg3; var5 < arg3 + arg2; var5++) {
            if (arg0[var5] != 0) {
                var4.field4163[var4.field4121++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
    public final int method497(int arg0) {
        int var2 = -10 % ((arg0 + 7) / 51);
        if (this.field1439-- == 0) {
            this.method500(false);
            this.field1439 = 255;
        }
        field1441++;
        return this.field1451[this.field1439];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
    public static final boolean method498(int arg0, int arg1) {
        if (arg1 != -1) {
            method498(-113, 73);
        }
        field1446++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lvd;B)V")
    public static final void method499(class222 arg0, byte arg1) {
        field1460++;
        if (class9.field165 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1428(15109);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class9.field165.length && class9.field165[var2].field2555 != var3) {
            var2++;
        }
        if (arg1 >= -91) {
            method498(33, 101);
        }
        if (class9.field165.length > var2 && class9.field165[var2] != null) {
            class42.field895.method1347((byte) -55, 24);
            class84.field1603++;
            class42.field895.method668(class9.field165[var2].field2555, 8);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    private final void method500(boolean arg0) {
        if (arg0) {
            return;
        }
        field1443++;
        this.field1438 += ++this.field1452;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1445[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1442 ^= this.field1442 << 13;
                } else {
                    this.field1442 ^= this.field1442 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1442 ^= this.field1442 << 2;
            } else {
                this.field1442 ^= this.field1442 >>> 16;
            }
            this.field1442 += this.field1445[var2 + 128 & 0xFF];
            int var4;
            this.field1445[var2] = var4 = this.field1438 + this.field1445[class139.method876(1020, var3) >> 2] + this.field1442;
            this.field1451[var2] = this.field1438 = var3 + this.field1445[class139.method876(var4, 261250) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    private final void method501(byte arg0) {
        field1440++;
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
            int var66 = var65 ^ var62 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var62 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1451[var11 + 3] + var6;
            int var38 = this.field1451[var11 + 2] + var7;
            int var39 = this.field1451[var11 + 6] + var3;
            int var40 = this.field1451[var11 + 4] + var5;
            int var41 = this.field1451[var11 + 1] + var8;
            int var42 = this.field1451[var11 + 5] + var4;
            int var43 = this.field1451[var11 + 7] + var2;
            int var44 = this.field1451[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var38 + var41;
            int var47 = var37 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var40 + var48;
            int var50 = var38 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var42 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var39;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var43;
            int var59 = var54 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var57;
            this.field1445[var11] = var9;
            this.field1445[var11 + 1] = var8;
            this.field1445[var11 + 2] = var7;
            this.field1445[var11 + 3] = var6;
            this.field1445[var11 + 4] = var5;
            this.field1445[var11 + 5] = var4;
            this.field1445[var11 + 6] = var3;
            this.field1445[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1445[var12 + 7] + var2;
            int var14 = this.field1445[var12] + var9;
            int var15 = this.field1445[var12 + 2] + var7;
            int var16 = this.field1445[var12 + 6] + var3;
            int var17 = this.field1445[var12 + 4] + var5;
            int var18 = this.field1445[var12 + 3] + var6;
            int var19 = this.field1445[var12 + 1] + var8;
            int var20 = var14 ^ var19 << 11;
            int var21 = this.field1445[var12 + 5] + var4;
            int var22 = var15 + var19;
            int var23 = var18 + var20;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var17 + var24;
            int var26 = var15 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var21 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1445[var12] = var9;
            this.field1445[var12 + 1] = var8;
            this.field1445[var12 + 2] = var7;
            this.field1445[var12 + 3] = var6;
            this.field1445[var12 + 4] = var5;
            this.field1445[var12 + 5] = var4;
            this.field1445[var12 + 6] = var3;
            this.field1445[var12 + 7] = var2;
        }
        if (arg0 != 81) {
            field1453 = null;
        }
        this.method500(false);
        this.field1439 = 256;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
    public static void method502(boolean arg0) {
        field1449 = null;
        if (arg0) {
            field1456 = null;
        }
        field1450 = null;
        field1453 = null;
        field1459 = null;
        field1455 = null;
        field1458 = null;
        field1456 = null;
        field1457 = null;
        field1448 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    private class73() {
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([I)V")
    public class73(int[] arg0) {
        this.field1445 = new int[256];
        this.field1451 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1451[var2] = arg0[var2];
        }
        this.method501((byte) 81);
    }
}
