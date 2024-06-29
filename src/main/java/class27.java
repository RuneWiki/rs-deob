import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class27 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[B")
    private byte[] field462 = new byte[32];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[J")
    private long[] field473 = new long[8];

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[J")
    private long[] field469 = new long[8];

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    private int field472 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[J")
    private long[] field463 = new long[8];

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[B")
    private byte[] field478 = new byte[64];

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[J")
    private long[] field479 = new long[8];

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "[J")
    private long[] field481 = new long[8];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    private int field471 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    public static int[] field464 = new int[8];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "J")
    public static long field465 = 0L;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[Z")
    public static boolean[] field475 = new boolean[100];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Liba;")
    public static class211 field480 = new class211(4, 8);

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "F")
    public static float field476;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "F")
    public static float field477;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method172(byte arg0) {
        field466++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field462[var2] = 0;
        }
        this.field472 = this.field471 = 0;
        this.field478[0] = 0;
        int var3 = 0;
        if (arg0 <= -94) {
            while (var3 < 8) {
                this.field469[var3] = 0L;
                var3++;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    private final void method173(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field481[var2] = class393.method2444(class393.method2444(class393.method2444(class95.method596(0xFFL << 16, (long) this.field478[var3 + 5] << 16), class393.method2444(class393.method2444(class393.method2444(class95.method596((long) this.field478[var3 + 2] << 40, 0xFFL << 40), class393.method2444((long) this.field478[var3] << 56, class95.method596(0xFFL << 48, (long) this.field478[var3 + 1] << 48))), class95.method596(255L, (long) this.field478[var3 + 3]) << 32), class95.method596((long) this.field478[var3 + 4], 255L) << 24)), class95.method596(0xFFL << 8, (long) this.field478[var3 + 6] << 8)), class95.method596((long) this.field478[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        if (arg0 != -4) {
            this.method177(-7, false, null);
        }
        field482++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field473[var4] = class393.method2444(this.field481[var4], this.field463[var4] = this.field469[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field479[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field479[var7] = class393.method2444(this.field479[var7], class473.field6793[var13][class425.method2563((int) (this.field463[class425.method2563(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field463[var8] = this.field479[var8];
            }
            this.field463[0] = class393.method2444(this.field463[0], class473.field6795[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field479[var9] = this.field463[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field479[var9] = class393.method2444(this.field479[var9], class473.field6793[var11][class425.method2563(255, (int) (this.field473[class425.method2563(7, var9 - var11)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field473[var10] = this.field479[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field469[var6] = class393.method2444(this.field469[var6], class393.method2444(this.field473[var6], this.field481[var6]));
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BJZ)V")
    public final void method174(byte[] arg0, long arg1, boolean arg2) {
        field468++;
        int var5 = 0;
        if (arg2) {
            this.method174(null, 69L, true);
        }
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field472 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field462[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field462[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field478[this.field471] = (byte) class151.method1076(this.field478[this.field471], var15 >>> var7);
            this.field472 += 8 - var7;
            this.field471++;
            if (this.field472 == 512) {
                this.method173((byte) -4);
                this.field472 = this.field471 = 0;
            }
            this.field478[this.field471] = (byte) class425.method2563(var15 << 8 - var7, 255);
            arg1 -= 8L;
            var5++;
            this.field472 += var7;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field478[this.field471] = (byte) class151.method1076(this.field478[this.field471], var12 >>> var7);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field472 = (int) ((long) this.field472 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field471++;
        this.field472 += 8 - var7;
        if (this.field472 == 512) {
            this.method173((byte) -4);
            this.field472 = this.field471 = 0;
        }
        this.field478[this.field471] = (byte) class425.method2563(var12 << 8 - var7, 255);
        this.field472 += (int) var13;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method175(byte arg0) {
        field464 = null;
        field480 = null;
        field475 = null;
        if (arg0 != -71) {
            field474 = 126;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmv;Lr;B)V")
    public static final void method176(class295 arg0, class98 arg1, byte arg2) {
        field467++;
        class616[] var3 = class616.method3513(arg0, class111.field1638, 0);
        class489.field6946 = new class256[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class489.field6946[var4] = arg1.method660(var3[var4], true);
        }
        class616[] var5 = class616.method3513(arg0, class702.field9975, 0);
        class580.field8447 = new class256[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class580.field8447[var6] = arg1.method660(var5[var6], true);
        }
        class616[] var7 = class616.method3513(arg0, class205.field2789, 0);
        class302.field4493 = new class256[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class302.field4493[var8] = arg1.method660(var7[var8], true);
        }
        class616[] var9 = class616.method3513(arg0, class465.field6713, 0);
        class353.field5244 = new class256[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class353.field5244[var10] = arg1.method660(var9[var10], true);
        }
        class616[] var11 = class616.method3513(arg0, class57.field937, 0);
        class479.field6860 = new class256[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class479.field6860[var12] = arg1.method660(var11[var12], true);
        }
        class616[] var13 = class616.method3513(arg0, class150.field2129, 0);
        class519.field7280 = new class256[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class519.field7280[var14] = arg1.method660(var13[var14], true);
        }
        int var15 = 65 / ((arg2 + 27) / 54);
        class616[] var16 = class616.method3513(arg0, class527.field7485, 0);
        class656.field9372 = new class256[var16.length];
        for (int var17 = 0; var17 < var16.length; var17++) {
            class656.field9372[var17] = arg1.method660(var16[var17], true);
        }
        class616[] var18 = class616.method3513(arg0, class489.field6941, 0);
        class62.field980 = new class256[var18.length];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class62.field980[var19] = arg1.method660(var18[var19], true);
        }
        class616[] var20 = class616.method3513(arg0, class297.field4375, 0);
        class306.field4531 = new class256[var20.length];
        for (int var21 = 0; var21 < var20.length; var21++) {
            class306.field4531[var21] = arg1.method660(var20[var21], true);
        }
        class616[] var22 = class616.method3513(arg0, class105.field1563, 0);
        class47.field740 = new class256[var22.length];
        for (int var23 = 0; var23 < var22.length; var23++) {
            class47.field740[var23] = arg1.method660(var22[var23], true);
        }
        class616[] var24 = class616.method3513(arg0, class684.field9640, 0);
        class640.field9189 = new class256[var24.length];
        for (int var25 = 0; var25 < var24.length; var25++) {
            class640.field9189[var25] = arg1.method660(var24[var25], true);
        }
        class616[] var26 = class616.method3513(arg0, class430.field6263, 0);
        class97.field1481 = new class256[var26.length];
        for (int var27 = 0; var27 < var26.length; var27++) {
            class97.field1481[var27] = arg1.method660(var26[var27], true);
        }
        class416.field6153 = arg1.method660(class616.method3509(arg0, class147.field2093, 0), true);
        class547.field8065 = arg1.method660(class616.method3509(arg0, class574.field8339, 0), true);
        class616[] var28 = class616.method3513(arg0, class324.field4710, 0);
        class23.field433 = new class256[var28.length];
        for (int var29 = 0; var29 < var28.length; var29++) {
            class23.field433[var29] = arg1.method660(var28[var29], true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ[B)V")
    public final void method177(int arg0, boolean arg1, byte[] arg2) {
        this.field478[this.field471] = (byte) class151.method1076(this.field478[this.field471], 0x80 >>> class425.method2563(7, this.field472));
        field470++;
        this.field471++;
        if (this.field471 > 32) {
            while (true) {
                if (this.field471 >= 64) {
                    this.method173((byte) -4);
                    this.field471 = 0;
                    break;
                }
                this.field478[this.field471++] = 0;
            }
        }
        while (this.field471 < 32) {
            this.field478[this.field471++] = 0;
        }
        class667.method3739(this.field462, 0, this.field478, 32, 32);
        this.method173((byte) -4);
        if (arg1) {
            field476 = 0.18708666F;
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field469[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }
}
