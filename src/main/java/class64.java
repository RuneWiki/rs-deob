import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    private int[] field1559 = new int[256];

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
    private int[] field1563 = new int[256];

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lgd;")
    private static class40 field1557 = class14.method90(false, "Prepared visibility map");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lgd;")
    private static class40 field1552 = class14.method90(false, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1551 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lgd;")
    public static class40 field1564 = field1552;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Z")
    public static volatile boolean field1571 = true;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lgd;")
    public static class40 field1572 = class14.method90(false, "Texturen geladen)3");

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lgd;")
    public static class40 field1569 = class14.method90(false, "Icons redrawn");

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lgd;")
    public static class40 field1573 = field1557;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    public static int[] field1553;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 6)
    public final int method459(byte arg0) {
        if (this.field1558-- == 0) {
            this.method462((byte) -40);
            this.field1558 = 255;
        }
        field1570++;
        return arg0 == -37 ? this.field1563[this.field1558] : 113;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 32)
    private final void method460(int arg0) {
        field1560++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 >= -108) {
            return;
        }
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
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1563[var11 + 1] + var8;
            int var38 = this.field1563[var11 + 6] + var3;
            int var39 = this.field1563[var11 + 3] + var6;
            int var40 = this.field1563[var11 + 7] + var2;
            int var41 = this.field1563[var11 + 4] + var5;
            int var42 = this.field1563[var11 + 5] + var4;
            int var43 = this.field1563[var11] + var9;
            int var44 = var43 ^ var37 << 11;
            int var45 = this.field1563[var11 + 2] + var7;
            int var46 = var37 + var45;
            int var47 = var39 + var44;
            int var48 = var46 ^ var45 >>> 2;
            int var49 = var45 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var42 + var50;
            int var52 = var41 + var48;
            int var53 = var47 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var38;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var5 + var40;
            int var57 = var51 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var44;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field1559[var11] = var9;
            this.field1559[var11 + 1] = var8;
            this.field1559[var11 + 2] = var7;
            this.field1559[var11 + 3] = var6;
            this.field1559[var11 + 4] = var5;
            this.field1559[var11 + 5] = var4;
            this.field1559[var11 + 6] = var3;
            this.field1559[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1559[var12 + 3] + var6;
            int var14 = this.field1559[var12 + 4] + var5;
            int var15 = this.field1559[var12 + 6] + var3;
            int var16 = this.field1559[var12] + var9;
            int var17 = this.field1559[var12 + 1] + var8;
            int var18 = this.field1559[var12 + 7] + var2;
            int var19 = this.field1559[var12 + 2] + var7;
            int var20 = this.field1559[var12 + 5] + var4;
            int var21 = var16 ^ var17 << 11;
            int var22 = var17 + var19;
            int var23 = var13 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var19 + var23;
            int var26 = var25 ^ var23 << 8;
            int var27 = var14 + var24;
            int var28 = var23 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var6 + var15;
            int var30 = var20 + var26;
            int var31 = var27 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var29 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var26;
            this.field1559[var12] = var9;
            this.field1559[var12 + 1] = var8;
            this.field1559[var12 + 2] = var7;
            this.field1559[var12 + 3] = var6;
            this.field1559[var12 + 4] = var5;
            this.field1559[var12 + 5] = var4;
            this.field1559[var12 + 6] = var3;
            this.field1559[var12 + 7] = var2;
        }
        this.method462((byte) 117);
        this.field1558 = 256;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 204)
    public static void method461(int arg0) {
        if (arg0 != 5) {
            method461(-69);
        }
        field1564 = null;
        field1557 = null;
        field1553 = null;
        field1573 = null;
        field1552 = null;
        field1572 = null;
        field1569 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 222)
    private final void method462(byte arg0) {
        field1556++;
        this.field1555 += ++this.field1566;
        int var2 = 0;
        int var3 = 83 % ((arg0 - 49) / 55);
        while (var2 < 256) {
            int var4 = this.field1559[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1562 ^= this.field1562 << 13;
                } else {
                    this.field1562 ^= this.field1562 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1562 ^= this.field1562 << 2;
            } else {
                this.field1562 ^= this.field1562 >>> 16;
            }
            this.field1562 += this.field1559[var2 + 128 & 0xFF];
            int var5;
            this.field1559[var2] = var5 = this.field1562 + this.field1559[class101.method709(var4 >> 2, 255)] + this.field1555;
            this.field1563[var2] = this.field1555 = this.field1559[class101.method709(255, var5 >> 8 >> 2)] + var4;
            var2++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)Lgd;", line = 269)
    public static final class40 method463(long arg0, byte arg1) {
        field1565++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 > -66) {
                method461(93);
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class83.field1870[(int) (var8 - arg0 * 37L)];
            }
            class40 var7 = new class40();
            var7.field948 = var6;
            var7.field950 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILee;)Z", line = 315)
    public static final boolean method464(int arg0, class30 arg1) {
        int var2 = arg1.field734;
        field1568++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class133.field3253++;
            class29.field627++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, class7.field178[var2] }), class136.field3325, 14, 0, -1);
            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, class7.field178[var2] }), class9.field227, 29, 0, -1);
            return true;
        }
        if (arg0 != 0) {
            method463(63L, (byte) 80);
        }
        if (var2 >= 401 && var2 <= 500) {
            class8.field206++;
            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, arg1.field726 }), class136.field3325, 10, 0, ~arg0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V", line = 367)
    public class64(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1563[var2] = arg0[var2];
        }
        this.method460(-109);
    }
}
