import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class278 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[S")
    private short[] field4790 = new short[512];

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    private int field4803 = 4;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field4799 = 4;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field4804 = 4;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field4805 = 4;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field4807 = 0;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lcd;")
    public static class64 field4802 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lcd;")
    public static class64 field4791 = class44.method335((byte) 71, ":trade:");

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[[I")
    public static int[][] field4788 = new int[5][5000];

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lcd;")
    public static class64 field4801 = class44.method335((byte) 71, "Cabbage");

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lka;")
    public static class179 field4796;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lqm;")
    public static class222 field4810;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
    public static int[] field4808;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[S")
    private short[] field4800;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class110 var7 = new class110();
        var7.field2028 = arg1 / 128;
        var7.field2022 = arg2 / 128;
        var7.field2023 = arg3 / 128;
        var7.field2031 = arg4 / 128;
        var7.field2027 = arg0;
        var7.field2039 = arg1;
        var7.field2029 = arg2;
        var7.field2030 = arg3;
        var7.field2043 = arg4;
        var7.field2024 = arg5;
        var7.field2035 = arg6;
        class81.field1496[class201.field3447++] = var7;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)I", line = 20)
    public static final int method1928(byte arg0, int arg1) {
        field4806++;
        class105 var2 = class298.method2077(arg1, -256);
        if (arg0 >= -86) {
            method1930(-12, false);
        }
        int var3 = var2.field1941;
        int var4 = var2.field1938;
        int var5 = var2.field1934;
        int var6 = class261.field4496[var4 - var5];
        return var6 & class289.field4941[var3] >> var5;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 53)
    private final void method1929(int arg0) {
        field4809++;
        Random var2 = new Random((long) this.field4807);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field4790[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class206.method1439(var2, (byte) 125, var5);
            short var7 = this.field4790[var6];
            this.field4790[var6] = this.field4790[var5];
            this.field4790[var5] = this.field4790[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method1930(int arg0, boolean arg1) {
        field4793++;
        class138.field2455 = new int[arg0];
        class211.field3568 = new int[arg0];
        if (arg1) {
            method1928((byte) -2, -11);
        }
        class103.field1869 = new int[arg0];
        class159.field2809 = new int[arg0];
        class114.field2104 = new int[arg0];
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIII)V", line = 383)
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4803 = arg2;
        this.field4799 = arg1;
        this.field4805 = arg4;
        this.field4804 = arg3;
        this.field4807 = arg0;
        this.method1934(0);
        this.method1929(0);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 119)
    public static void method1931(int arg0) {
        field4796 = null;
        field4808 = null;
        if (arg0 != 1941548524) {
            return;
        }
        field4788 = (int[][]) null;
        field4801 = null;
        field4802 = null;
        field4810 = null;
        field4791 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V", line = 143)
    public static final void method1932(int arg0, byte arg1) {
        field4798++;
        class299 var2 = class158.method1135(arg0, 83, 7);
        var2.method2093((byte) -53);
        if (arg1 != 83) {
            method1927(-9, 0, 67, 56, -25, -42, -4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V", line = 157)
    public final void method1933(int arg0, int arg1, int arg2, int arg3) {
        field4794++;
        if (arg0 != -32247) {
            field4797 = 77;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method344((byte) -86);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4799; var14++) {
                        int var15 = this.field4800[var14] << 12;
                        int var16 = this.field4803 * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field4804 * var15 >> 12;
                        int var19 = this.field4804 * var17;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field4803 * var20;
                        int var23 = var22 >> 12;
                        int var24 = var22 & 0xFFF;
                        int var25 = this.field4805 * var21;
                        int var26 = var19 >> 12;
                        int var27 = var23 + 1;
                        int var28 = class162.field2844[var24];
                        int var29 = var26 + 1;
                        int var30 = var24 - 4096;
                        int var31 = var26 & 0xFF;
                        int var32 = var23 & 0xFF;
                        int var33;
                        if (var29 >= var18) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        int var34 = this.field4805 * var15 >> 12;
                        int var35;
                        if (var27 >= var16) {
                            var35 = 0;
                        } else {
                            var35 = var27 & 0xFF;
                        }
                        int var36 = var19 & 0xFFF;
                        int var37 = class162.field2844[var36];
                        int var38 = var36 - 4096;
                        int var39 = var25 >> 12;
                        int var40 = var25 & 0xFFF;
                        int var41 = var39 + 1;
                        int var42 = class162.field2844[var40];
                        int var43;
                        if (var34 <= var41) {
                            var43 = 0;
                        } else {
                            var43 = var41 & 0xFF;
                        }
                        short var44 = this.field4790[var43];
                        short var45 = this.field4790[var31 + var44];
                        int var46 = var39 & 0xFF;
                        int var47 = var40 - 4096;
                        short var48 = this.field4790[var33 + var44];
                        short var49 = this.field4790[var46];
                        short var50 = this.field4790[var33 + var49];
                        short var51 = this.field4790[var31 + var49];
                        int var52 = class216.method1518(var40, var24, 15094688, var36, this.field4790[var32 + var51]);
                        int var53 = class216.method1518(var40, var30, arg0 ^ 0xFF19D1A9, var36, this.field4790[var35 + var51]);
                        int var54 = var52 + ((var53 - var52) * var28 >> 12);
                        int var55 = class216.method1518(var40, var24, 15094688, var38, this.field4790[var32 + var50]);
                        int var56 = class216.method1518(var40, var30, arg0 + 15126935, var38, this.field4790[var35 + var50]);
                        int var57 = ((var56 - var55) * var28 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var37 >> 12);
                        int var59 = class216.method1518(var47, var24, arg0 ^ 0xFF19D1A9, var36, this.field4790[var32 + var45]);
                        int var60 = class216.method1518(var47, var30, 15094688, var36, this.field4790[var35 + var45]);
                        int var61 = ((var60 - var59) * var28 >> 12) + var59;
                        int var62 = class216.method1518(var47, var24, 15094688, var38, this.field4790[var32 + var48]);
                        int var63 = class216.method1518(var47, var30, 15094688, var38, this.field4790[var35 + var48]);
                        int var64 = ((var63 - var62) * var28 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var37 >> 12);
                        this.method348(124, ((var65 - var58) * var42 >> 12) + var58, var14);
                    }
                    this.method342((byte) 55);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 336)
    private final void method1934(int arg0) {
        this.field4800 = new short[this.field4799];
        field4787++;
        for (int var2 = arg0; var2 < this.field4799; var2++) {
            this.field4800[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public abstract void method342(byte arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public abstract void method348(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public abstract void method344(byte arg0);
}
