import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class183 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
    private int[] field2925;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    private int[] field2923;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2929 = "shake:";

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[J")
    public static long[] field2931 = new long[1000];

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field2932 = 5063219;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[[[I")
    public static int[][][] field2927;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I", line = 5)
    public final int method1142(int arg0) {
        field2921++;
        if (arg0 < 64) {
            return 37;
        }
        if ((this.field2937--) == 0) {
            this.method1144((byte) -92);
            this.field2937 = 255;
        }
        return this.field2923[this.field2937];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIILte;II)Ljava/awt/Frame;", line = 28)
    public static final Frame method1143(byte arg0, int arg1, int arg2, class124 arg3, int arg4, int arg5) {
        field2922++;
        if (arg0 >= -45) {
            method1145((byte) -105);
        }
        if (!arg3.method810(-18246)) {
            return null;
        }
        if (arg1 == 0) {
            class197[] var6 = class8.method69(arg3, 28);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3173 == arg4 && var6[var8].field3172 == arg2 && (arg5 == 0 || var6[var8].field3164 == arg5) && (!var7 || arg1 < var6[var8].field3174)) {
                    arg1 = var6[var8].field3174;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class107 var9 = arg3.method803(arg1, arg2, arg4, arg5, 105);
        while (var9.field1852 == 0) {
            class127.method843(-39, 10L);
        }
        Frame var10 = (Frame) var9.field1853;
        if (var10 == null) {
            return null;
        } else if (var9.field1852 == 2) {
            class266.method1771(arg3, var10, true);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 98)
    private final void method1144(byte arg0) {
        field2933++;
        this.field2930 += ++this.field2926;
        if (arg0 != -92) {
            field2931 = (long[]) null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2925[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2928 ^= this.field2928 << 13;
                } else {
                    this.field2928 ^= this.field2928 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2928 ^= this.field2928 << 2;
            } else {
                this.field2928 ^= this.field2928 >>> 16;
            }
            this.field2928 += this.field2925[var2 + 128 & 0xFF];
            int var4;
            this.field2925[var2] = var4 = this.field2930 + this.field2928 + this.field2925[class61.method475(var3, 1020) >> 2];
            this.field2923[var2] = this.field2930 = var3 + this.field2925[class61.method475(var4, 261254) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 169)
    public static void method1145(byte arg0) {
        field2929 = null;
        if (arg0 != 85) {
            method1147((byte) -65, (class164) null);
        }
        field2931 = null;
        field2927 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 183)
    private final void method1146(byte arg0) {
        field2924++;
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
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            var6 = var18 ^ var15 >>> 16;
            int var19 = var3 + var6;
            int var20 = var4 + var17;
            int var21 = var15 + var20;
            var5 = var21 ^ var20 << 10;
            int var22 = var19 + var20;
            var4 = var22 ^ var19 >>> 4;
            int var23 = var2 + var5;
            int var24 = var19 + var23;
            int var25 = var4 + var11;
            var3 = var24 ^ var23 << 8;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var8 = var3 + var14;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2923[var27 + 6] + var3;
            int var29 = this.field2923[var27 + 2] + var7;
            int var30 = this.field2923[var27 + 3] + var6;
            int var31 = this.field2923[var27 + 1] + var8;
            int var32 = this.field2923[var27 + 5] + var4;
            int var33 = this.field2923[var27 + 4] + var5;
            int var34 = this.field2923[var27] + var9;
            int var35 = this.field2923[var27 + 7] + var2;
            int var36 = var34 ^ var31 << 11;
            int var37 = var29 + var31;
            int var38 = var37 ^ var29 >>> 2;
            int var39 = var30 + var36;
            int var40 = var29 + var39;
            int var41 = var33 + var38;
            int var42 = var40 ^ var39 << 8;
            int var43 = var32 + var42;
            int var44 = var39 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var6 + var28;
            int var46 = var41 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var35;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var45 + var47;
            var3 = var49 ^ var47 << 8;
            var8 = var3 + var38;
            int var50 = var4 + var36;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var50;
            this.field2925[var27] = var9;
            this.field2925[var27 + 1] = var8;
            this.field2925[var27 + 2] = var7;
            this.field2925[var27 + 3] = var6;
            this.field2925[var27 + 4] = var5;
            this.field2925[var27 + 5] = var4;
            this.field2925[var27 + 6] = var3;
            this.field2925[var27 + 7] = var2;
        }
        int var52 = 0;
        int var53 = 105 / ((-arg0) / 56);
        while (var52 < 256) {
            int var54 = this.field2925[var52 + 7] + var2;
            int var55 = this.field2925[var52] + var9;
            int var56 = this.field2925[var52 + 3] + var6;
            int var57 = this.field2925[var52 + 2] + var7;
            int var58 = this.field2925[var52 + 6] + var3;
            int var59 = this.field2925[var52 + 1] + var8;
            int var60 = this.field2925[var52 + 4] + var5;
            int var61 = this.field2925[var52 + 5] + var4;
            int var62 = var55 ^ var59 << 11;
            int var63 = var57 + var59;
            int var64 = var63 ^ var57 >>> 2;
            int var65 = var56 + var62;
            int var66 = var57 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var61 + var67;
            int var69 = var60 + var64;
            int var70 = var65 + var69;
            var6 = var70 ^ var69 >>> 16;
            int var71 = var6 + var58;
            int var72 = var68 + var69;
            var5 = var72 ^ var68 << 10;
            int var73 = var5 + var54;
            int var74 = var68 + var71;
            var4 = var74 ^ var71 >>> 4;
            int var75 = var71 + var73;
            int var76 = var4 + var62;
            var3 = var75 ^ var73 << 8;
            int var77 = var73 + var76;
            var2 = var77 ^ var76 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var76;
            this.field2925[var52] = var9;
            var7 = var2 + var67;
            this.field2925[var52 + 1] = var8;
            this.field2925[var52 + 2] = var7;
            this.field2925[var52 + 3] = var6;
            this.field2925[var52 + 4] = var5;
            this.field2925[var52 + 5] = var4;
            this.field2925[var52 + 6] = var3;
            this.field2925[var52 + 7] = var2;
            var52 += 8;
        }
        this.method1144((byte) -92);
        this.field2937 = 256;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 330)
    private class183() {
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([I)V", line = 332)
    public class183(int[] arg0) {
        this.field2925 = new int[256];
        this.field2923 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2923[var2] = arg0[var2];
        }
        this.method1146((byte) -78);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLdf;)V", line = 354)
    public static final void method1147(byte arg0, class164 arg1) {
        field2936++;
        int var2 = -1;
        long var3 = 0L;
        int var5 = 0;
        if (arg0 != 35) {
            method1145((byte) -106);
        }
        int var6 = 0;
        if (arg1.field2655 == 0) {
            var3 = class14.method104(arg1.field2643, arg1.field2642, arg1.field2648);
        }
        if (arg1.field2655 == 1) {
            var3 = class342.method2371(arg1.field2643, arg1.field2642, arg1.field2648);
        }
        if (arg1.field2655 == 2) {
            var3 = class194.method1239(arg1.field2643, arg1.field2642, arg1.field2648);
        }
        if (arg1.field2655 == 3) {
            var3 = class131.method864(arg1.field2643, arg1.field2642, arg1.field2648);
        }
        if (var3 != 0L) {
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
            var6 = ((int) var3 & 0x3C6298) >> 20;
            var5 = ((int) var3 & 0x7EA60) >> 14;
        }
        arg1.field2647 = var5;
        arg1.field2639 = var2;
        arg1.field2646 = var6;
    }
}
