import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class177 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    private int[] field2685;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    private int[] field2695;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lrn;")
    public static class174 field2696 = new class174(14, -1);

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lju;")
    public static class81 field2698 = new class81(0, 0);

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
    public static volatile boolean field2700 = false;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Lpi;")
    public static class342 field2701 = new class342("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Lop;")
    public static class124 field2702 = new class124("LOCAL", 4);

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lrn;")
    public static class174 field2704 = new class174(54, -1);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field2699;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lqj;")
    public static class351 field2703;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
    public final int method1259(int arg0) {
        field2689++;
        if (this.field2691 == 0) {
            this.method1263(-126);
            this.field2691 = 256;
        }
        int var2 = 54 / ((arg0 + 74) / 48);
        return this.field2685[--this.field2691];
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static final void method1260(int arg0) {
        field2692++;
        if (arg0 != 6) {
            field2703 = null;
        }
        class244.method1590(25, (byte) 41);
        class203.method1399((byte) -65);
        System.gc();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1261(byte arg0) {
        if (arg0 != -44) {
            return;
        }
        field2702 = null;
        field2696 = null;
        field2703 = null;
        field2701 = null;
        field2698 = null;
        field2704 = null;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    private final void method1262(int arg0) {
        field2694++;
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
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2685[var11 + 2] + var7;
            int var38 = this.field2685[var11 + 7] + var2;
            int var39 = this.field2685[var11] + var9;
            int var40 = this.field2685[var11 + 6] + var3;
            int var41 = this.field2685[var11 + 4] + var5;
            int var42 = this.field2685[var11 + 5] + var4;
            int var43 = this.field2685[var11 + 1] + var8;
            int var44 = this.field2685[var11 + 3] + var6;
            int var45 = var39 ^ var43 << 11;
            int var46 = var37 + var43;
            int var47 = var44 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var41 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var42 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var40;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2695[var11] = var9;
            this.field2695[var11 + 1] = var8;
            this.field2695[var11 + 2] = var7;
            this.field2695[var11 + 3] = var6;
            this.field2695[var11 + 4] = var5;
            this.field2695[var11 + 5] = var4;
            this.field2695[var11 + 6] = var3;
            this.field2695[var11 + 7] = var2;
        }
        if (arg0 != 1207637730) {
            field2702 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2695[var12 + 3] + var6;
            int var14 = this.field2695[var12 + 5] + var4;
            int var15 = this.field2695[var12 + 2] + var7;
            int var16 = this.field2695[var12 + 4] + var5;
            int var17 = this.field2695[var12 + 7] + var2;
            int var18 = this.field2695[var12] + var9;
            int var19 = this.field2695[var12 + 6] + var3;
            int var20 = this.field2695[var12 + 1] + var8;
            int var21 = var18 ^ var20 << 11;
            int var22 = var13 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var16 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var14 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var19;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2695[var12] = var9;
            this.field2695[var12 + 1] = var8;
            this.field2695[var12 + 2] = var7;
            this.field2695[var12 + 3] = var6;
            this.field2695[var12 + 4] = var5;
            this.field2695[var12 + 5] = var4;
            this.field2695[var12 + 6] = var3;
            this.field2695[var12 + 7] = var2;
        }
        this.method1263(-119);
        this.field2691 = 256;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    private final void method1263(int arg0) {
        field2686++;
        this.field2690 += ++this.field2693;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2695[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2699 ^= this.field2699 << 13;
                } else {
                    this.field2699 ^= this.field2699 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2699 ^= this.field2699 << 2;
            } else {
                this.field2699 ^= this.field2699 >>> 16;
            }
            this.field2699 += this.field2695[var2 + 128 & 0xFF];
            int var4;
            this.field2695[var2] = var4 = this.field2690 + this.field2695[class207.method1405(255, var3 >> 2)] + this.field2699;
            this.field2685[var2] = this.field2690 = this.field2695[class207.method1405(261281, var4) >> 8 >> 2] + var3;
        }
        if (arg0 >= -117) {
            this.field2691 = 113;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)I")
    public final int method1264(int arg0) {
        if (arg0 != 6) {
            method1261((byte) -15);
        }
        if (this.field2691 == 0) {
            this.method1263(-118);
            this.field2691 = 256;
        }
        field2688++;
        return this.field2685[this.field2691 - 1];
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)Z")
    public static final boolean method1265(int arg0) {
        if (arg0 != -10924) {
            field2700 = false;
        }
        field2687++;
        return class446.field6661 != class423.field6322 || class75.field1260 >= 2;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    private class177() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([I)V")
    public class177(int[] arg0) {
        this.field2685 = new int[256];
        this.field2695 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2685[var2] = arg0[var2];
        }
        this.method1262(1207637730);
    }
}
