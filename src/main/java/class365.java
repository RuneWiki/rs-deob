import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class365 extends class45 {

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field5273 = 0;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "[[I")
    public static int[][] field5280 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[S")
    public static short[] field5276 = new short[] { 29, 7, 38, 9, 8, 37, 41, 35 };

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Z")
    public static boolean field5285 = false;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "[I")
    public static int[] field5291 = new int[5];

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field5288 = 0;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[Lba;")
    public static class270[] field5294 = new class270[4];

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field5265;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field5271;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Lge;")
    public class104 field5281;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lod;")
    public class137 field5266;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lod;")
    public class137 field5275;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Ln;")
    public class25 field5269;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lcd;")
    public class43 field5277;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Z")
    public boolean field5282;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[I")
    public int[] field5290;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "[[Lps;")
    public static class394[][] field5292;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 7)
    public final void method2382(byte arg0) {
        field5278++;
        int var2 = -128 / ((arg0 - 72) / 42);
        int var3 = this.field5271;
        if (this.field5281 != null) {
            class104 var6 = this.field5281.method708((byte) 56);
            if (var6 == null) {
                this.field5283 = 0;
                this.field5287 = 0;
                this.field5271 = -1;
                this.field5268 = 0;
                this.field5265 = 0;
                this.field5290 = null;
            } else {
                this.field5290 = var6.field1463;
                this.field5268 = var6.field1480;
                this.field5287 = var6.field1443;
                this.field5265 = var6.field1505;
                this.field5271 = var6.field1471;
                this.field5283 = var6.field1472 * 128;
            }
        } else if (this.field5277 != null) {
            int var4 = class181.method1105(this.field5277, 3);
            if (var3 != var4) {
                this.field5271 = var4;
                class249 var5 = this.field5277.field606;
                if (var5.field3375 != null) {
                    var5 = var5.method1510(30);
                }
                if (var5 == null) {
                    this.field5268 = this.field5283 = 0;
                } else {
                    this.field5268 = var5.field3358;
                    this.field5283 = var5.field3379 * 128;
                }
            }
        } else if (this.field5269 != null) {
            this.field5271 = class349.method2291(true, this.field5269);
            this.field5283 = this.field5269.field351 * 128;
            this.field5268 = this.field5269.field346;
        }
        if (this.field5271 != var3 && this.field5275 != null) {
            class156.field2122.method2502(this.field5275);
            this.field5275 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 99)
    public static void method2383(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5280 = null;
        field5291 = null;
        field5276 = null;
        field5292 = null;
        field5294 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBZIII)V", line = 113)
    public static final void method2384(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field5286++;
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg1 > -67) {
            field5285 = false;
        }
        int var7 = (class354.field5125 - class103.field1420) * var6 / 100 + class103.field1420;
        if (var7 < class397.field5907) {
            var7 = class397.field5907;
        } else if (var7 > class140.field1919) {
            var7 = class140.field1919;
        }
        int var8 = arg4 * var7 * 512 / (arg0 * 334);
        if (class242.field3232 > var8) {
            short var12 = class242.field3232;
            var7 = var12 * 334 * arg0 / (arg4 * 512);
            if (var7 > class140.field1919) {
                var7 = class140.field1919;
                int var13 = arg4 * 512 * var7 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class61.field807.method1652();
                    class61.field807.method2610(arg4, -16777216, true, var14, arg5, arg3);
                    class61.field807.method2610(arg4, -16777216, true, var14, arg5 + arg0 - var14, arg3);
                }
                arg5 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class226.field2971) {
            short var9 = class226.field2971;
            var7 = arg0 * 334 * var9 / (arg4 * 512);
            if (var7 < class397.field5907) {
                var7 = class397.field5907;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg2) {
                    class61.field807.method1652();
                    class61.field807.method2610(var11, -16777216, true, arg0, arg5, arg3);
                    class61.field807.method2610(var11, -16777216, true, arg0, arg5, arg3 + arg4 - var11);
                }
                arg4 -= var11 * 2;
                arg3 += var11;
            }
        }
        class270.field3932 = arg4 * var7 / 334;
        class102.field1417 = arg5;
        class199.field2653 = arg3;
        class72.field1037 = (short) arg0;
        class281.field4098 = (short) arg4;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 209)
    public static final void method2385(int arg0, int arg1) {
        class183.field2481 = arg1;
        if (arg0 != 12) {
            method2386(116, 63, 22);
        }
        field5289++;
        class110.field1548.method1141(arg0 + 244);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 238)
    public static final void method2386(int arg0, int arg1, int arg2) {
        boolean var3 = class213.field2852[0][arg1][arg2] != null && class213.field2852[0][arg1][arg2].field3503 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class213.field2852[var4][arg1][arg2] == null) {
                class254 var5 = class213.field2852[var4][arg1][arg2] = new class254(var4, arg1, arg2);
                if (var3) {
                    var5.field3507++;
                }
            }
        }
    }
}
