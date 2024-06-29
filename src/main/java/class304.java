import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class304 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field5272 = 4;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[S")
    private short[] field5280 = new short[512];

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field5276 = 0;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    private int field5285 = 4;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    private int field5289 = 4;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    private int field5275 = 4;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[Lpm;")
    public static class103[] field5279 = new class103[6];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    public static boolean field5277 = false;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field5291 = -1;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Z")
    public static boolean field5290 = false;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "F")
    public static float field5283;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[S")
    private short[] field5281;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[[[B")
    public static byte[][][] field5273;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method2133(int arg0, byte arg1) {
        class202.field3652 = arg0;
        if (arg1 >= 87) {
            field5282++;
            class25.field382 = -1;
            class301.field5243 = -1;
            class137.method943(-1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 34)
    private final void method2134(int arg0) {
        field5274++;
        Random var2 = new Random((long) this.field5276);
        if (arg0 > -71) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5280[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class109.method792(-11163, var2, var5);
            short var7 = this.field5280[var6];
            this.field5280[var6] = this.field5280[var5];
            this.field5280[var5] = this.field5280[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIII)V", line = 369)
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5276 = arg0;
        this.field5285 = arg2;
        this.field5275 = arg3;
        this.field5272 = arg1;
        this.field5289 = arg4;
        this.method2139((byte) 94);
        this.method2134(-127);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I", line = 85)
    public static final int method2135(int arg0, int arg1) {
        class206 var2 = client.method1819(-20727, arg0);
        field5288++;
        int var3 = var2.field3704;
        int var4 = var2.field3698;
        if (arg1 != 427495308) {
            method2133(-22, (byte) -54);
        }
        int var5 = var2.field3699;
        int var6 = class152.field2759[var5 - var3];
        return class261.field4594[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V", line = 106)
    public final void method2136(int arg0, int arg1, int arg2, int arg3) {
        field5287++;
        if (arg0 > -53) {
            method2138(104);
        }
        int[] var5 = new int[arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            var5[var6] = (var6 << 12) / arg2;
        }
        int[] var7 = new int[arg3];
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg3; var9++) {
            var7[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method603(6841);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field5272; var14++) {
                        int var15 = this.field5281[var14] << 12;
                        int var16 = var7[var12] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field5285 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field5275 * var16;
                        int var21 = this.field5289 * var15 >> 12;
                        int var22 = this.field5275 * var15 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var20 & 0xFFF;
                        int var25 = var24 - 4096;
                        int var26 = var23 + 1;
                        int var27 = this.field5285 * var19;
                        int var28 = var27 >> 12;
                        int var29 = var23 & 0xFF;
                        int var30 = this.field5289 * var17;
                        int var31 = var27 & 0xFFF;
                        int var32;
                        if (var22 <= var26) {
                            var32 = 0;
                        } else {
                            var32 = var26 & 0xFF;
                        }
                        int var33 = var30 >> 12;
                        int var34 = class140.field2462[var24];
                        int var35 = var31 - 4096;
                        int var36 = var33 + 1;
                        int var37 = var28 + 1;
                        int var38;
                        if (var21 > var36) {
                            var38 = var36 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = class140.field2462[var31];
                        int var40 = var33 & 0xFF;
                        short var41 = this.field5280[var38];
                        short var42 = this.field5280[var29 + var41];
                        short var43 = this.field5280[var40];
                        short var44 = this.field5280[var32 + var41];
                        int var45 = var28 & 0xFF;
                        int var46;
                        if (var18 > var37) {
                            var46 = var37 & 0xFF;
                        } else {
                            var46 = 0;
                        }
                        int var47 = var30 & 0xFFF;
                        int var48 = class140.field2462[var47];
                        short var49 = this.field5280[var29 + var43];
                        int var50 = var47 - 4096;
                        short var51 = this.field5280[var32 + var43];
                        int var52 = class274.method1976(this.field5280[var45 + var49], var47, var24, var31, 31552);
                        int var53 = class274.method1976(this.field5280[var46 + var49], var47, var24, var35, 31552);
                        int var54 = var52 + ((var53 - var52) * var39 >> 12);
                        int var55 = class274.method1976(this.field5280[var45 + var51], var47, var25, var31, 31552);
                        int var56 = class274.method1976(this.field5280[var46 + var51], var47, var25, var35, 31552);
                        int var57 = ((var56 - var55) * var39 >> 12) + var55;
                        int var58 = class274.method1976(this.field5280[var42 + var45], var50, var24, var31, 31552);
                        int var59 = ((var57 - var54) * var34 >> 12) + var54;
                        int var60 = class274.method1976(this.field5280[var42 + var46], var50, var24, var35, 31552);
                        int var61 = ((var60 - var58) * var39 >> 12) + var58;
                        int var62 = class274.method1976(this.field5280[var45 + var44], var50, var25, var31, 31552);
                        int var63 = class274.method1976(this.field5280[var44 + var46], var50, var25, var35, 31552);
                        int var64 = ((var63 - var62) * var39 >> 12) + var62;
                        int var65 = ((var64 - var61) * var34 >> 12) + var61;
                        this.method607(((var65 - var59) * var48 >> 12) + var59, var14, (byte) 105);
                    }
                    this.method604(6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI[BI)Lsf;", line = 274)
    public static final class108 method2137(byte arg0, int arg1, byte[] arg2, int arg3) {
        class108 var4 = new class108();
        var4.field1870 = 0;
        field5286++;
        var4.field1884 = new byte[arg3];
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field1884[var4.field1870++] = arg2[var5];
            }
        }
        if (arg0 < 83) {
            field5283 = 0.84494233F;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V", line = 322)
    public static void method2138(int arg0) {
        field5273 = (byte[][][]) null;
        field5279 = null;
        if (arg0 <= 114) {
            method2135(-31, 1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 348)
    private final void method2139(byte arg0) {
        field5278++;
        this.field5281 = new short[this.field5272];
        for (int var2 = 0; var2 < this.field5272; var2++) {
            this.field5281[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 94) {
            this.method604(-52);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public abstract void method603(int arg0);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
    public abstract void method607(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public abstract void method604(int arg0);
}
