import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    private int[] field1562 = new int[256];

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
    private int[] field1572 = new int[256];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
    public static boolean field1564 = false;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1567 = -1;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1568 = 2;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static volatile int field1574 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lod;")
    public static class101 field1570;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method503(int arg0) {
        if (this.field1566-- == 0) {
            this.method506(true);
            this.field1566 = 255;
        }
        field1559++;
        return arg0 == 6 ? this.field1572[this.field1566] : 83;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    private final void method504(boolean arg0) {
        field1560++;
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
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1572[var11 + 4] + var5;
            int var38 = this.field1572[var11 + 6] + var3;
            int var39 = this.field1572[var11 + 7] + var2;
            int var40 = this.field1572[var11 + 5] + var4;
            int var41 = this.field1572[var11 + 1] + var8;
            int var42 = this.field1572[var11 + 3] + var6;
            int var43 = this.field1572[var11] + var9;
            int var44 = var43 ^ var41 << 11;
            int var45 = this.field1572[var11 + 2] + var7;
            int var46 = var42 + var44;
            int var47 = var41 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var37 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var38;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var44;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field1562[var11] = var9;
            this.field1562[var11 + 1] = var8;
            this.field1562[var11 + 2] = var7;
            this.field1562[var11 + 3] = var6;
            this.field1562[var11 + 4] = var5;
            this.field1562[var11 + 5] = var4;
            this.field1562[var11 + 6] = var3;
            this.field1562[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1562[var12 + 2] + var7;
            int var14 = this.field1562[var12 + 4] + var5;
            int var15 = this.field1562[var12 + 5] + var4;
            int var16 = this.field1562[var12 + 3] + var6;
            int var17 = this.field1562[var12] + var9;
            int var18 = this.field1562[var12 + 1] + var8;
            int var19 = var17 ^ var18 << 11;
            int var20 = var13 + var18;
            int var21 = var20 ^ var13 >>> 2;
            int var22 = this.field1562[var12 + 7] + var2;
            int var23 = var14 + var21;
            int var24 = this.field1562[var12 + 6] + var3;
            int var25 = var16 + var19;
            int var26 = var13 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var23 + var25;
            var6 = var28 ^ var23 >>> 16;
            int var29 = var15 + var27;
            int var30 = var6 + var24;
            int var31 = var23 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var22;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var19;
            var8 = var3 + var21;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1562[var12] = var9;
            this.field1562[var12 + 1] = var8;
            this.field1562[var12 + 2] = var7;
            this.field1562[var12 + 3] = var6;
            this.field1562[var12 + 4] = var5;
            this.field1562[var12 + 5] = var4;
            this.field1562[var12 + 6] = var3;
            this.field1562[var12 + 7] = var2;
        }
        this.method506(arg0);
        this.field1566 = 256;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method505(int arg0) {
        class34 var1 = class100.field2527;
        synchronized (class100.field2527) {
            class84.field2088 = class84.field2091;
            if (class85.field2124 >= 0) {
                while (class95.field2398 != class85.field2124) {
                    int var3 = class155.field3507[class95.field2398];
                    class95.field2398 = class95.field2398 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class114.field2707[var3] = true;
                    } else {
                        class114.field2707[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class114.field2707[var2] = false;
                }
                class85.field2124 = class95.field2398;
            }
            class84.field2091 = class132.field2995;
        }
        field1563++;
        if (arg0 != -490212280) {
            field1564 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    private final void method506(boolean arg0) {
        this.field1575 += ++this.field1569;
        field1565++;
        if (!arg0) {
            field1574 = 58;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1562[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1571 ^= this.field1571 << 13;
                } else {
                    this.field1571 ^= this.field1571 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1571 ^= this.field1571 << 2;
            } else {
                this.field1571 ^= this.field1571 >>> 16;
            }
            this.field1571 += this.field1562[var2 + 128 & 0xFF];
            int var4;
            this.field1562[var2] = var4 = this.field1562[class118.method887(255, var3 >> 2)] + this.field1571 + this.field1575;
            this.field1572[var2] = this.field1575 = var3 + this.field1562[class118.method887(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method507(byte arg0) {
        field1570 = null;
        if (arg0 <= 47) {
            method508((byte) -77, 101);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
    public class65(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1572[var2] = arg0[var2];
        }
        this.method504(true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lne;")
    public static final class95 method508(byte arg0, int arg1) {
        int var2 = -16 % ((arg0 - 7) / 52);
        class95 var3 = (class95) class56.field1400.method991((long) arg1, true);
        field1573++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class123.field2845.method266(3, (byte) 102, arg1);
        class95 var5 = new class95();
        if (var4 != null) {
            var5.method762(new class83(var4), 0);
        }
        class56.field1400.method990(true, (long) arg1, var5);
        return var5;
    }
}
