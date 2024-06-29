import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class84 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    private int[] field1338;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1329 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1342 = "Started 3d Library";

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Ll;")
    public static class10 field1336;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Loc;")
    public static class77 field1330;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
    public final int method623(int arg0) {
        if (arg0 != -1515058839) {
            field1336 = null;
        }
        if (this.field1333-- == 0) {
            this.method627(-15017);
            this.field1333 = 255;
        }
        field1339++;
        return this.field1343[this.field1333];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLmh;)Z")
    public static final boolean method624(byte arg0, class263 arg1) {
        field1344++;
        if (arg1.field4098 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4098.length; var2++) {
            int var3 = class242.method1657((byte) 127, arg1, var2);
            int var4 = arg1.field4151[var2];
            if (arg1.field4098[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4098[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field4098[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -50) {
            field1329 = 79;
        }
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    private final void method625(boolean arg0) {
        field1340++;
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
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var2 + var5;
            int var74 = var69 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var63;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1343[var11 + 4] + var5;
            int var38 = this.field1343[var11 + 2] + var7;
            int var39 = this.field1343[var11] + var9;
            int var40 = this.field1343[var11 + 3] + var6;
            int var41 = this.field1343[var11 + 1] + var8;
            int var42 = this.field1343[var11 + 7] + var2;
            int var43 = var39 ^ var41 << 11;
            int var44 = this.field1343[var11 + 5] + var4;
            int var45 = var40 + var43;
            int var46 = var38 + var41;
            int var47 = var46 ^ var38 >>> 2;
            int var48 = var38 + var45;
            int var49 = var48 ^ var45 << 8;
            int var50 = this.field1343[var11 + 6] + var3;
            int var51 = var37 + var47;
            int var52 = var44 + var49;
            int var53 = var45 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var50;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var42;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var43;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var47;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field1338[var11] = var9;
            this.field1338[var11 + 1] = var8;
            var7 = var2 + var49;
            this.field1338[var11 + 2] = var7;
            this.field1338[var11 + 3] = var6;
            this.field1338[var11 + 4] = var5;
            this.field1338[var11 + 5] = var4;
            this.field1338[var11 + 6] = var3;
            this.field1338[var11 + 7] = var2;
        }
        if (!arg0) {
            field1336 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1338[var12 + 1] + var8;
            int var14 = this.field1338[var12 + 3] + var6;
            int var15 = this.field1338[var12 + 6] + var3;
            int var16 = this.field1338[var12 + 4] + var5;
            int var17 = this.field1338[var12 + 5] + var4;
            int var18 = this.field1338[var12 + 7] + var2;
            int var19 = this.field1338[var12 + 2] + var7;
            int var20 = this.field1338[var12] + var9;
            int var21 = var20 ^ var13 << 11;
            int var22 = var13 + var19;
            int var23 = var22 ^ var19 >>> 2;
            int var24 = var14 + var21;
            int var25 = var16 + var23;
            int var26 = var19 + var24;
            int var27 = var26 ^ var24 << 8;
            int var28 = var17 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var18;
            int var32 = var6 + var15;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            var8 = var3 + var23;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1338[var12] = var9;
            this.field1338[var12 + 1] = var8;
            this.field1338[var12 + 2] = var7;
            this.field1338[var12 + 3] = var6;
            this.field1338[var12 + 4] = var5;
            this.field1338[var12 + 5] = var4;
            this.field1338[var12 + 6] = var3;
            this.field1338[var12 + 7] = var2;
        }
        this.method627(-15017);
        this.field1333 = 256;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        if (arg0 == 125) {
            field1335++;
            class43.field566.method1422((byte) -79);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    private final void method627(int arg0) {
        field1332++;
        this.field1331 += ++this.field1341;
        if (arg0 != -15017) {
            field1342 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1338[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1337 ^= this.field1337 << 13;
                } else {
                    this.field1337 ^= this.field1337 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1337 ^= this.field1337 << 2;
            } else {
                this.field1337 ^= this.field1337 >>> 16;
            }
            this.field1337 += this.field1338[var2 + 128 & 0xFF];
            int var4;
            this.field1338[var2] = var4 = this.field1337 + this.field1331 + this.field1338[class301.method2056(1020, var3) >> 2];
            this.field1343[var2] = this.field1331 = var3 + this.field1338[class301.method2056(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    private class84() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
    public class84(int[] arg0) {
        this.field1338 = new int[256];
        this.field1343 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1343[var2] = arg0[var2];
        }
        this.method625(true);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static void method628(byte arg0) {
        if (arg0 < 2) {
            method628((byte) 38);
        }
        field1342 = null;
        field1336 = null;
        field1330 = null;
    }
}
