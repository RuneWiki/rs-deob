import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class115 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private int field2148 = -1;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    private int field2149 = 0;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Loa;")
    private class262 field2144 = new class262();

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Z")
    public boolean field2150 = false;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[[I")
    private int[][] field2134;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[Lak;")
    private class128[] field2141;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
    public static boolean field2138 = false;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lff;III)Lka;")
    public static final class174 method903(class3 arg0, int arg1, int arg2, int arg3) {
        field2136++;
        if (class224.method1530(arg1, arg3, (byte) -117, arg0)) {
            return arg2 >= -20 ? null : class196.method1376(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[I")
    public final int[] method904(byte arg0, int arg1) {
        field2132++;
        int var3 = -44 % ((-arg0 - 8) / 53);
        if (this.field2143 == this.field2139) {
            this.field2150 = this.field2141[arg1] == null;
            this.field2141[arg1] = class34.field600;
            return this.field2134[arg1];
        } else if (this.field2139 == 1) {
            this.field2150 = this.field2148 != arg1;
            this.field2148 = arg1;
            return this.field2134[0];
        } else {
            class128 var4 = this.field2141[arg1];
            if (var4 == null) {
                this.field2150 = true;
                if (this.field2149 < this.field2139) {
                    var4 = new class128(arg1, this.field2149);
                    this.field2149++;
                } else {
                    class128 var5 = (class128) this.field2144.method1816((byte) 102);
                    var4 = new class128(arg1, var5.field2340);
                    this.field2141[var5.field2339] = null;
                    var5.method1743((byte) 17);
                }
                this.field2141[arg1] = var4;
            } else {
                this.field2150 = false;
            }
            this.field2144.method1819(-9166, var4);
            return this.field2134[var4.field2340];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILw;IIII)V")
    public static final void method905(int arg0, int arg1, class107 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2145++;
        if (arg4 != -17429) {
            return;
        }
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field1856 / 2, arg2.field1919 / 2);
        if (var7 <= (var8 * var8)) {
            class11.method87(arg2, arg1, 128, arg0, arg6, arg5, class22.field388[arg3]);
            return;
        }
        int var9 = class235.field4033 + class21.field343 & 0x7FF;
        int var10 = class240.field4162[var9];
        var8 -= 10;
        int var11 = var10 * 256 / (class222.field3800 + 256);
        int var12 = class240.field4176[var9];
        int var13 = var12 * 256 / (class222.field3800 + 256);
        int var14 = arg0 * var11 + arg1 * var13 >> 16;
        int var15 = arg0 * var13 - (arg1 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class174) class185.field3225[arg3]).method1059(arg5 + (arg2.field1856 / 2) + var18 - 10, arg2.field1919 / 2 + arg6 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lff;ZLff;Lff;)V")
    public static final void method906(class3 arg0, boolean arg1, class3 arg2, class3 arg3) {
        if (!arg1) {
            field2140 = 1;
        }
        class251.field4344 = arg2;
        class47.field840 = arg3;
        field2146++;
        class244.field4222 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg5 && arg6 == arg7 && arg8 == arg9 && arg1 == arg4) {
            class29.method192(arg1, arg7, arg2, false, arg3, arg9);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg5 * 3;
            int var14 = arg4 * 3;
            int var15 = arg7 * 3;
            int var16 = arg8 * 3;
            int var17 = arg6 * 3;
            int var18 = arg9 + var13 - arg2 - var16;
            int var19 = arg1 + var17 - var14 - arg7;
            int var20 = var14 + var15 - var17 - var17;
            int var21 = var16 + var12 - var13 - var13;
            int var22 = var13 - var12;
            int var23 = var17 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var25;
                int var28 = var21 * var25;
                int var29 = var19 * var26;
                int var30 = var22 * var24;
                int var31 = var18 * var26;
                int var32 = arg2 + (var28 + var30 + var31 >> 12);
                int var33 = var23 * var24;
                int var34 = (var27 + var29 + var33 >> 12) + arg7;
                class29.method192(var34, var11, var10, false, arg3, var32);
                var11 = var34;
                var10 = var32;
            }
        }
        field2133++;
        if (arg0 != -24080) {
            field2142 = -85;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
    public static final int method908(int arg0, int arg1, int arg2) {
        if (arg2 < 16) {
            field2140 = 34;
        }
        class60 var3 = (class60) class132.field2373.method1081(0, (long) arg1);
        field2137++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field1040.length) {
            return var3.field1040[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method909(int arg0) {
        field2135++;
        if (arg0 > -90) {
            this.field2150 = false;
        }
        for (int var2 = 0; var2 < this.field2139; var2++) {
            this.field2134[var2] = null;
        }
        this.field2134 = null;
        this.field2141 = null;
        this.field2144.method1817(1);
        this.field2144 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)[[I")
    public final int[][] method910(int arg0) {
        field2147++;
        if (this.field2143 != this.field2139) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2139; var2++) {
            this.field2141[var2] = class34.field600;
        }
        if (arg0 != -14451) {
            method903((class3) null, -107, -126, 91);
        }
        return this.field2134;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class115(int arg0, int arg1, int arg2) {
        this.field2139 = arg0;
        this.field2143 = arg1;
        this.field2134 = new int[this.field2139][arg2];
        this.field2141 = new class128[this.field2143];
    }
}
