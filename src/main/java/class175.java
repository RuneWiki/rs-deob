import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class175 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    private int[] field3035;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    private int[] field3033;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3030 = -2;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lda;")
    public static class275 field3027 = class255.method1672(110, "gleiten:");

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    public static volatile boolean field3034 = true;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lda;")
    public static class275 field3039 = class255.method1672(126, "leuchten2:");

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lda;")
    public static class275 field3037 = class255.method1672(99, "Schlie-8en");

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
    public static boolean field3025 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    private int field3032;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)I")
    public final int method1182(boolean arg0) {
        if (!arg0) {
            return 7;
        }
        field3029++;
        if ((this.field3028--) == 0) {
            this.method1185((byte) -77);
            this.field3028 = 255;
        }
        return this.field3033[this.field3028];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BI)V")
    public static final void method1183(byte[] arg0, int arg1) {
        class85 var2 = new class85(arg0);
        field3038++;
        int var3 = var2.method564((byte) 96);
        if (~var3 != arg1) {
            return;
        }
        boolean var4 = var2.method564((byte) 78) == 1;
        if (var4) {
            class23.method143(var2, -1);
        }
        class244.method1590(var2, 20041);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    private final void method1184(int arg0) {
        field3023++;
        if (arg0 != 2) {
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
            int var37 = this.field3033[var11 + 4] + var5;
            int var38 = this.field3033[var11 + 7] + var2;
            int var39 = this.field3033[var11 + 2] + var7;
            int var40 = this.field3033[var11] + var9;
            int var41 = this.field3033[var11 + 6] + var3;
            int var42 = this.field3033[var11 + 5] + var4;
            int var43 = this.field3033[var11 + 3] + var6;
            int var44 = this.field3033[var11 + 1] + var8;
            int var45 = var40 ^ var44 << 11;
            int var46 = var39 + var44;
            int var47 = var46 ^ var39 >>> 2;
            int var48 = var43 + var45;
            int var49 = var37 + var47;
            int var50 = var39 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var42 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var41;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var47;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3035[var11] = var9;
            this.field3035[var11 + 1] = var8;
            this.field3035[var11 + 2] = var7;
            this.field3035[var11 + 3] = var6;
            this.field3035[var11 + 4] = var5;
            this.field3035[var11 + 5] = var4;
            this.field3035[var11 + 6] = var3;
            this.field3035[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3035[var12 + 5] + var4;
            int var14 = this.field3035[var12 + 6] + var3;
            int var15 = this.field3035[var12 + 7] + var2;
            int var16 = this.field3035[var12 + 2] + var7;
            int var17 = this.field3035[var12 + 4] + var5;
            int var18 = this.field3035[var12 + 1] + var8;
            int var19 = this.field3035[var12 + 3] + var6;
            int var20 = this.field3035[var12] + var9;
            int var21 = var20 ^ var18 << 11;
            int var22 = var16 + var18;
            int var23 = var22 ^ var16 >>> 2;
            int var24 = var19 + var21;
            int var25 = var16 + var24;
            int var26 = var17 + var23;
            int var27 = var25 ^ var24 << 8;
            int var28 = var24 + var26;
            int var29 = var13 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var14;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var23;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field3035[var12] = var9;
            this.field3035[var12 + 1] = var8;
            this.field3035[var12 + 2] = var7;
            this.field3035[var12 + 3] = var6;
            this.field3035[var12 + 4] = var5;
            this.field3035[var12 + 5] = var4;
            this.field3035[var12 + 6] = var3;
            this.field3035[var12 + 7] = var2;
        }
        this.method1185((byte) -77);
        this.field3028 = 256;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    private final void method1185(byte arg0) {
        field3026++;
        this.field3040 += ++this.field3031;
        if (arg0 != -77) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3035[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3032 ^= this.field3032 << 13;
                } else {
                    this.field3032 ^= this.field3032 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3032 ^= this.field3032 << 2;
            } else {
                this.field3032 ^= this.field3032 >>> 16;
            }
            this.field3032 += this.field3035[var2 + 128 & 0xFF];
            int var4;
            this.field3035[var2] = var4 = this.field3035[class19.method98(1020, var3) >> 2] + (this.field3032 + this.field3040);
            this.field3033[var2] = this.field3040 = var3 + this.field3035[class19.method98(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        for (int var1 = 0; var1 < class184.field3154; var1++) {
            int var3 = class181.field3117[var1];
            class109 var4 = class16.field238[var3];
            int var5 = class196.field3351.method564((byte) 56);
            if ((var5 & 0x4) != 0) {
                var5 += class196.field3351.method564((byte) 74) << 8;
            }
            class243.method1586((byte) 127, var4, var3, var5);
        }
        int var2 = 15 / ((arg0 - 14) / 52);
        field3024++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3039 = null;
        field3037 = null;
        field3027 = null;
        if (arg0 != 143909640) {
            method1183((byte[]) null, -31);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    private class175() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
    public class175(int[] arg0) {
        this.field3035 = new int[256];
        this.field3033 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3033[var2] = arg0[var2];
        }
        this.method1184(2);
    }
}
