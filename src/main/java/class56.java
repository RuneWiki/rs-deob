import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class56 {

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[I")
    private int[] field1433 = new int[256];

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    private int[] field1436 = new int[256];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lmc;")
    public static class75 field1418 = class30.method234(true, "Passwort: ");

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lmc;")
    public static class75 field1420 = class30.method234(true, "l");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1423 = -1;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lmc;")
    private static class75 field1424 = class30.method234(true, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lmc;")
    public static class75 field1434 = class30.method234(true, " )2>");

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lmc;")
    public static class75 field1422 = field1424;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lmc;")
    public static class75 field1432 = class30.method234(true, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "J")
    public static long field1430;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[I")
    public static int[] field1429;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    public static int[] field1437;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 34)
    private final void method454(boolean arg0) {
        field1425++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        if (arg0) {
            this.method454(true);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1436[var11 + 5] + var4;
            int var38 = this.field1436[var11 + 2] + var7;
            int var39 = this.field1436[var11 + 1] + var8;
            int var40 = this.field1436[var11 + 7] + var2;
            int var41 = this.field1436[var11 + 4] + var5;
            int var42 = this.field1436[var11] + var9;
            int var43 = var42 ^ var39 << 11;
            int var44 = this.field1436[var11 + 3] + var6;
            int var45 = var38 + var39;
            int var46 = var43 + var44;
            int var47 = var45 ^ var38 >>> 2;
            int var48 = var41 + var47;
            int var49 = var38 + var46;
            int var50 = this.field1436[var11 + 6] + var3;
            int var51 = var49 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var48;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var48 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var6 + var50;
            int var56 = var5 + var40;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var43;
            var8 = var3 + var47;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1433[var11] = var9;
            this.field1433[var11 + 1] = var8;
            this.field1433[var11 + 2] = var7;
            this.field1433[var11 + 3] = var6;
            this.field1433[var11 + 4] = var5;
            this.field1433[var11 + 5] = var4;
            this.field1433[var11 + 6] = var3;
            this.field1433[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1433[var12 + 1] + var8;
            int var14 = this.field1433[var12 + 3] + var6;
            int var15 = this.field1433[var12 + 2] + var7;
            int var16 = this.field1433[var12 + 5] + var4;
            int var17 = this.field1433[var12 + 7] + var2;
            int var18 = this.field1433[var12] + var9;
            int var19 = this.field1433[var12 + 4] + var5;
            int var20 = var18 ^ var13 << 11;
            int var21 = var13 + var15;
            int var22 = var14 + var20;
            int var23 = var21 ^ var15 >>> 2;
            int var24 = this.field1433[var12 + 6] + var3;
            int var25 = var15 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var19 + var23;
            int var28 = var22 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var16 + var26;
            int var30 = var27 + var29;
            int var31 = var6 + var24;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            var4 = var32 ^ var31 >>> 4;
            int var33 = var5 + var17;
            int var34 = var31 + var33;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var23;
            int var35 = var4 + var20;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var35;
            this.field1433[var12] = var9;
            this.field1433[var12 + 1] = var8;
            this.field1433[var12 + 2] = var7;
            this.field1433[var12 + 3] = var6;
            this.field1433[var12 + 4] = var5;
            this.field1433[var12 + 5] = var4;
            this.field1433[var12 + 6] = var3;
            this.field1433[var12 + 7] = var2;
        }
        this.method455(true);
        this.field1438 = 256;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V", line = 185)
    private final void method455(boolean arg0) {
        this.field1419 += ++this.field1421;
        field1426++;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1433[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1428 ^= this.field1428 << 13;
                } else {
                    this.field1428 ^= this.field1428 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1428 ^= this.field1428 << 2;
            } else {
                this.field1428 ^= this.field1428 >>> 16;
            }
            this.field1428 += this.field1433[var2 + 128 & 0xFF];
            int var4;
            this.field1433[var2] = var4 = this.field1419 + this.field1428 + this.field1433[method456(var3, 1020) >> 2];
            this.field1436[var2] = this.field1419 = this.field1433[method456(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 260)
    public static int method456(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I", line = 269)
    public final int method457(int arg0) {
        if (arg0 != 0) {
            return 126;
        }
        field1435++;
        if (this.field1438-- == 0) {
            this.method455(true);
            this.field1438 = 255;
        }
        return this.field1436[this.field1438];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 290)
    public static final void method458(byte arg0) {
        field1417++;
        class23.field455 = true;
        class108.method888(-1);
        if (class36.field868 != -1) {
            boolean var2 = class128.method1008(-1, class36.field868, 0, (byte) -42, 1, 0, 0, 261, 190);
            if (!var2) {
                class108.field2743 = true;
            }
        } else if (class15.field289[class130.field3167] != -1) {
            boolean var1 = class128.method1008(-1, class15.field289[class130.field3167], 0, (byte) -117, 1, 0, 0, 261, 190);
            if (!var1) {
                class108.field2743 = true;
            }
        }
        if (class15.field283 && class90.field2218 == 1) {
            if (class7.field109 == 1) {
                class17.method118(90);
            } else {
                class117.method930(8580);
            }
        }
        class70.method593((byte) -102);
        int var3 = -125 / ((-arg0 - 9) / 63);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 331)
    public static void method459(int arg0) {
        field1429 = null;
        field1422 = null;
        field1434 = null;
        if (arg0 != 1) {
            field1437 = null;
        }
        field1418 = null;
        field1424 = null;
        field1432 = null;
        field1420 = null;
        field1437 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([I)V", line = 352)
    public class56(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1436[var2] = arg0[var2];
        }
        this.method454(false);
    }
}
