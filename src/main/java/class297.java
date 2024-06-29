import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class297 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    private int[] field5096;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    private int[] field5093;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Loh;")
    public static class258 field5088 = class153.method1046("<img=1>", 112);

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Loh;")
    public static class258 field5089 = class153.method1046("k", 110);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field5100 = 5063219;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    private int field5091;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lme;")
    public static class295 field5086;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2097(int arg0, int arg1) {
        field5085++;
        class153.field2627.method1156(arg1, 0);
        class233.field4038.method1156(arg1, 0);
        class286.field4934.method1156(arg1, 0);
        class245.field4257.method1156(arg1, arg0 - 26490);
        if (arg0 != 26490) {
            field5101 = -16;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLgb;)V", line = 31)
    public static final void method2098(byte arg0, class213 arg1) {
        field5099++;
        class310.field5255 = arg1;
        if (arg0 != 61) {
            method2097(-4, 39);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 55)
    private final void method2099(boolean arg0) {
        if (arg0) {
            return;
        }
        field5095++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var6 + var11;
            int var15 = var5 + var13;
            int var16 = var7 + var14;
            int var17 = var16 ^ var14 << 8;
            int var18 = var14 + var15;
            var6 = var18 ^ var15 >>> 16;
            int var19 = var4 + var17;
            int var20 = var15 + var19;
            int var21 = var3 + var6;
            var5 = var20 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var21 + var22;
            var3 = var24 ^ var22 << 8;
            var8 = var3 + var13;
            int var25 = var4 + var11;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field5096[var27 + 3] + var6;
            int var29 = this.field5096[var27 + 1] + var8;
            int var30 = this.field5096[var27 + 2] + var7;
            int var31 = this.field5096[var27 + 7] + var2;
            int var32 = this.field5096[var27 + 4] + var5;
            int var33 = this.field5096[var27] + var9;
            int var34 = var33 ^ var29 << 11;
            int var35 = var28 + var34;
            int var36 = this.field5096[var27 + 5] + var4;
            int var37 = this.field5096[var27 + 6] + var3;
            int var38 = var29 + var30;
            int var39 = var38 ^ var30 >>> 2;
            int var40 = var30 + var35;
            int var41 = var32 + var39;
            int var42 = var40 ^ var35 << 8;
            int var43 = var36 + var42;
            int var44 = var35 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var41 + var43;
            int var46 = var6 + var37;
            var5 = var45 ^ var43 << 10;
            int var47 = var5 + var31;
            int var48 = var43 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var46 + var47;
            int var50 = var4 + var34;
            var3 = var49 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var50;
            this.field5093[var27] = var9;
            this.field5093[var27 + 1] = var8;
            this.field5093[var27 + 2] = var7;
            this.field5093[var27 + 3] = var6;
            this.field5093[var27 + 4] = var5;
            this.field5093[var27 + 5] = var4;
            this.field5093[var27 + 6] = var3;
            this.field5093[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field5093[var52 + 4] + var5;
            int var54 = this.field5093[var52 + 7] + var2;
            int var55 = this.field5093[var52] + var9;
            int var56 = this.field5093[var52 + 6] + var3;
            int var57 = this.field5093[var52 + 5] + var4;
            int var58 = this.field5093[var52 + 2] + var7;
            int var59 = this.field5093[var52 + 3] + var6;
            int var60 = this.field5093[var52 + 1] + var8;
            int var61 = var55 ^ var60 << 11;
            int var62 = var59 + var61;
            int var63 = var58 + var60;
            int var64 = var63 ^ var58 >>> 2;
            int var65 = var53 + var64;
            int var66 = var58 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var57 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var6 + var56;
            int var72 = var69 + var71;
            int var73 = var5 + var54;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field5093[var52] = var9;
            this.field5093[var52 + 1] = var8;
            this.field5093[var52 + 2] = var7;
            this.field5093[var52 + 3] = var6;
            this.field5093[var52 + 4] = var5;
            this.field5093[var52 + 5] = var4;
            this.field5093[var52 + 6] = var3;
            this.field5093[var52 + 7] = var2;
        }
        this.method2101(2);
        this.field5091 = 256;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 205)
    public static void method2100(int arg0) {
        field5089 = null;
        field5086 = null;
        int var1 = 106 / ((arg0 + 72) / 32);
        field5088 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 217)
    private final void method2101(int arg0) {
        this.field5094 += ++this.field5087;
        field5097++;
        int var2 = 0;
        if (arg0 != 2) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field5093[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5092 ^= this.field5092 << 13;
                } else {
                    this.field5092 ^= this.field5092 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5092 ^= this.field5092 << 2;
            } else {
                this.field5092 ^= this.field5092 >>> 16;
            }
            this.field5092 += this.field5093[var2 + 128 & 0xFF];
            int var4;
            this.field5093[var2] = var4 = this.field5094 + this.field5092 + this.field5093[class2.method15(var3, 1020) >> 2];
            this.field5096[var2] = this.field5094 = this.field5093[class2.method15(261142, var4) >> 8 >> 2] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I", line = 271)
    public final int method2102(byte arg0) {
        field5090++;
        if (this.field5091-- == 0) {
            this.method2101(2);
            this.field5091 = 255;
        }
        int var2 = -25 % ((arg0 + 71) / 54);
        return this.field5096[this.field5091];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Loh;I)V", line = 290)
    public static final void method2103(class258 arg0, int arg1) {
        field5098++;
        for (class125 var2 = (class125) class90.field1578.method83(-60); var2 != null; var2 = (class125) class90.field1578.method87((byte) -80)) {
            if (var2.field2228.method1821(-1, arg0)) {
                class154.field2640 = var2;
                return;
            }
        }
        if (arg1 != -14986) {
            field5088 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 317)
    private class297() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([I)V", line = 319)
    public class297(int[] arg0) {
        this.field5096 = new int[256];
        this.field5093 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5096[var2] = arg0[var2];
        }
        this.method2099(false);
    }
}
