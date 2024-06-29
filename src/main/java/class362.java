import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class362 extends class539 {

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "Lld;")
    private class154 field5167;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "Lgj;")
    private class580 field5168;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Lkb;")
    private class634 field5157;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    private int field5172;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    private int field5160;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    private int field5170;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    private int field5158;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "[[F")
    private float[][] field5155;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "[[F")
    private float[][] field5151;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "[[F")
    private float[][] field5159;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    private int field5152;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "Loj;")
    private class346 field5161;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Ljn;")
    private class659 field5154;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5150;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5169;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "Liq;")
    private class555 field5162;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    private int field5156;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Lfc;")
    public static class235 field5148 = new class235(60, 6);

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "Lof;")
    public static class568 field5166 = new class568(6, 7);

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IS)V", line = 4)
    private final void method2120(int arg0, short arg1) {
        if (arg0 != 1) {
            this.field5162 = null;
        }
        field5164++;
        if (Stream.method3418()) {
            this.field5169.method3425(arg1);
        } else {
            this.field5169.method3416(arg1);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 24)
    public static final void method2121(boolean arg0, String arg1, boolean arg2) {
        field5163++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class609.field8469.field228 : class609.field8469.field236) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class672 var11 = class609.field8469.method77(var8, 13529);
            if (var11.field9470 && var11.method3719((byte) -87).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class264.field3738 = null;
                    class233.field3311 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class233.field3311 = var5;
        class264.field3738 = var4;
        field5171 = 0;
        String[] var9 = new String[class233.field3311];
        for (int var10 = 0; var10 < class233.field3311; var10++) {
            var9[var10] = class609.field8469.method77(var4[var10], 13529).method3719((byte) -64);
        }
        class250.method1544(class264.field3738, arg2, var9);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB[[ZII)V", line = 92)
    public final void method2122(int arg0, byte arg1, boolean[][] arg2, int arg3, int arg4) {
        field5149++;
        if (this.field5154 == null || this.field5172 > arg3 + arg4 || arg3 - arg4 > this.field5160 || this.field5170 > arg0 + arg4) {
            return;
        }
        if (arg1 <= 50) {
            this.method2125(96, -5, 85, 97, -94, -127, -83);
        }
        if (this.field5158 < (arg0 - arg4)) {
            return;
        }
        for (int var6 = this.field5170; var6 <= this.field5158; var6++) {
            for (int var7 = this.field5172; var7 <= this.field5160; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg0;
                if (var8 > -arg4 && arg4 > var8 && var9 > (-arg4) && var9 < arg4 && arg2[arg4 + var8][arg4 + var9]) {
                    this.field5168.method3189((byte) ((int) (this.field5167.method1081(-21) * 255.0F)), (byte) 127);
                    this.field5168.method313(this.field5162, 15, 0);
                    this.field5168.method348((byte) -62, this.field5168.field8074);
                    this.field5168.method318(this.field5156, 4025, this.field5152 / 3, 0, this.field5154, class47.field697, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 150)
    public static void method2123(int arg0) {
        field5148 = null;
        if (arg0 <= 6) {
            method2121(false, null, false);
        }
        field5166 = null;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(III)V", line = 165)
    public static final void method2124(int arg0, int arg1, int arg2) {
        if ((class148.field2194 > class148.field2195)) {
            class148.field2195 = (float) ((double) class148.field2195 / 30.0D + (double) class148.field2195);
            if (class148.field2195 > class148.field2194) {
                class148.field2195 = class148.field2194;
            }
            class299.method1863((byte) -102);
            class148.field2187 = (int) class148.field2195 >> 1;
            class148.field2190 = class442.method2536(class148.field2187, (byte) -105);
        } else if (class148.field2195 > class148.field2194) {
            class148.field2195 = (float) ((double) class148.field2195 - (double) class148.field2195 / 30.0D);
            if (class148.field2194 > class148.field2195) {
                class148.field2195 = class148.field2194;
            }
            class299.method1863((byte) -102);
            class148.field2187 = (int) class148.field2195 >> 1;
            class148.field2190 = class442.method2536(class148.field2187, (byte) -105);
        }
        field5153++;
        if (class623.field8692 != -1 && class675.field9543 != -1) {
            int var3 = class623.field8692 - class306.field4504;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class675.field9543 - class480.field6695;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class306.field4504 -= -var3;
            class480.field6695 += var4;
            if (var3 == 0 && var4 == 0) {
                class675.field9543 = -1;
                class623.field8692 = -1;
            }
            class299.method1863((byte) -102);
        }
        if (class669.field9441 <= 0) {
            class351.field5051 = -1;
            class648.field9186 = -1;
        } else {
            class126.field1759--;
            if (class126.field1759 == 0) {
                class669.field9441--;
                class126.field1759 = 100;
            }
        }
        if (arg2 < 39) {
            method2124(54, -123, 122);
        }
        if (!class427.field6008 || class154.field2325 == null) {
            return;
        }
        for (class534 var5 = (class534) class154.field2325.method1270((byte) -25); var5 != null; var5 = (class534) class154.field2325.method1282(0)) {
            class307 var6 = class148.field2180.method2872((byte) 120, var5.field7272.field3086);
            if (var5.method2951(arg1, 51, arg0)) {
                if (var6.field4538 != null) {
                    if (var6.field4538[4] != null) {
                        class92.method678(var6.field4534, var6.field4527, 1011, -1, 0, (long) var5.field7272.field3086, -1, true, var6.field4538[4], (byte) -74, false);
                    }
                    if (var6.field4538[3] != null) {
                        class92.method678(var6.field4534, var6.field4527, 1006, -1, 0, (long) var5.field7272.field3086, -1, true, var6.field4538[3], (byte) -74, false);
                    }
                    if (var6.field4538[2] != null) {
                        class92.method678(var6.field4534, var6.field4527, 1010, -1, 0, (long) var5.field7272.field3086, -1, true, var6.field4538[2], (byte) -74, false);
                    }
                    if (var6.field4538[1] != null) {
                        class92.method678(var6.field4534, var6.field4527, 1001, -1, 0, (long) var5.field7272.field3086, -1, true, var6.field4538[1], (byte) -74, false);
                    }
                    if (var6.field4538[0] != null) {
                        class92.method678(var6.field4534, var6.field4527, 1003, -1, 0, (long) var5.field7272.field3086, -1, true, var6.field4538[0], (byte) -74, false);
                    }
                }
                if (!var5.field7272.field3080) {
                    var5.field7272.field3080 = true;
                    class523.method2892(class226.field3253, var5.field7272.field3086, var6.field4527);
                }
                if (var5.field7272.field3080) {
                    class523.method2892(class509.field6972, var5.field7272.field3086, var6.field4527);
                }
            } else if (var5.field7272.field3080) {
                var5.field7272.field3080 = false;
                class523.method2892(class605.field8429, var5.field7272.field3086, var6.field4527);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII)V", line = 324)
    private final void method2125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5165++;
        long var8 = -1L;
        int var10 = (arg5 << this.field5157.field1921) + arg3;
        int var11 = (arg0 << this.field5157.field1921) + arg4;
        int var12 = this.field5157.method267(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class539 var13 = this.field5161.method2061(-17305, var8);
            if (var13 != null) {
                this.method2120(1, ((class379) var13).field5339);
                return;
            }
        }
        short var14 = (short) (this.field5156++);
        if (var8 != -1L) {
            this.field5161.method2063(var8, 1, new class379(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg4 == 0) {
            var15 = this.field5151[arg6][arg1];
            var16 = this.field5155[arg6][arg1];
            var17 = this.field5159[arg6][arg1];
        } else if (this.field5157.field1919 == arg3 && arg4 == 0) {
            var15 = this.field5151[arg6 + 1][arg1];
            var16 = this.field5155[arg6 + 1][arg1];
            var17 = this.field5159[arg6 + 1][arg1];
        } else if (this.field5157.field1919 == arg3 && this.field5157.field1919 == arg4) {
            var15 = this.field5151[arg6 + 1][arg1 + 1];
            var17 = this.field5159[arg6 + 1][arg1 + 1];
            var16 = this.field5155[arg6 + 1][arg1 + 1];
        } else if (arg3 == 0 && this.field5157.field1919 == arg4) {
            var16 = this.field5155[arg6][arg1 + 1];
            var15 = this.field5151[arg6][arg1 + 1];
            var17 = this.field5159[arg6][arg1 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field5157.field1919;
            float var19 = (float) arg4 / (float) this.field5157.field1919;
            float var20 = this.field5151[arg6][arg1];
            float var21 = this.field5159[arg6][arg1];
            float var22 = this.field5155[arg6][arg1];
            float var23 = this.field5151[arg6 + 1][arg1];
            float var24 = this.field5159[arg6 + 1][arg1];
            float var25 = (this.field5155[arg6][arg1 + 1] - var22) * var18 + var22;
            float var26 = (this.field5159[arg6 + 1][arg1 + 1] - var24) * var18 + var24;
            float var27 = (this.field5151[arg6 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = (this.field5151[arg6][arg1 + 1] - var20) * var18 + var20;
            float var29 = this.field5155[arg6 + 1][arg1];
            float var30 = (this.field5159[arg6][arg1 + 1] - var21) * var18 + var21;
            float var31 = (this.field5155[arg6 + 1][arg1 + 1] - var29) * var18 + var29;
            var17 = (var26 - var30) * var19 + var30;
            var15 = (var27 - var28) * var19 + var28;
            var16 = (var31 - var25) * var19 + var25;
        }
        if (arg2 != -30825) {
            return;
        }
        float var32 = (float) (this.field5167.method1079(-868177151) - var10);
        float var33 = (float) (this.field5167.method1076(false) - var12);
        float var34 = (float) (this.field5167.method1074(arg2 + 30825) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field5167.method1072(2);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5167.method1083(true);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3418()) {
            this.field5150.method3421((float) var10);
            this.field5150.method3421((float) var12);
            this.field5150.method3421((float) var11);
        } else {
            this.field5150.method3428((float) var10);
            this.field5150.method3428((float) var12);
            this.field5150.method3428((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field5168.field7999 == 0) {
            this.field5150.method3419(var47);
            this.field5150.method3419(var46);
            this.field5150.method3419(var45);
        } else {
            this.field5150.method3419(var45);
            this.field5150.method3419(var46);
            this.field5150.method3419(var47);
        }
        this.field5150.method3419(255);
        this.method2120(arg2 ^ 0xFFFF8796, var14);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lgj;Lkb;Lld;[I)V", line = 503)
    public class362(class580 arg0, class634 arg1, class154 arg2, int[] arg3) {
        this.field5167 = arg2;
        this.field5168 = arg0;
        this.field5157 = arg1;
        int var5 = this.field5167.method1072(2) - (arg1.field1919 >> 1);
        this.field5172 = this.field5167.method1079(-868177151) - var5 >> arg1.field1921;
        this.field5160 = this.field5167.method1079(-868177151) + var5 >> arg1.field1921;
        this.field5170 = this.field5167.method1074(0) - var5 >> arg1.field1921;
        this.field5158 = var5 + this.field5167.method1074(0) >> arg1.field1921;
        int var6 = this.field5160 + 1 - this.field5172;
        int var7 = this.field5158 + 1 - this.field5170;
        this.field5155 = new float[var6 + 1][var7 + 1];
        this.field5151 = new float[var6 + 1][var7 + 1];
        this.field5159 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field5170;
            if (var27 > 0 && this.field5157.field1916 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field5172 + var28;
                    if (var29 > 0 && var29 < this.field5157.field1918 - 1) {
                        int var30 = arg1.method273(var29 + 1, var27) - arg1.method273(var29 - 1, var27);
                        int var31 = arg1.method273(var29, var27 + 1) - arg1.method273(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field5151[var28][var8] = (float) var30 * var32;
                        this.field5159[var28][var8] = var32 * -256.0F;
                        this.field5155[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field5170; var10 <= this.field5158; var10++) {
            if (var10 >= 0 && var10 < arg1.field1916) {
                for (int var23 = this.field5172; var23 <= this.field5160; var23++) {
                    if (var23 >= 0 && arg1.field1918 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field8900[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field5152 += 3;
                                    }
                                }
                            } else {
                                this.field5152 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field5160 - this.field5172;
            }
        }
        if (this.field5152 > 0) {
            this.field5161 = new class346(class350.method2082(18, this.field5152));
            this.field5154 = this.field5168.method290(false, 0);
            this.field5154.method777(this.field5152, (byte) 73);
            NativeHeapBuffer var11 = this.field5168.method3249(this.field5152 * 16, (byte) 85, false);
            this.field5150 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field5154.method779((byte) -20, true);
                } while (var12 == null);
                this.field5169 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field5170; var15 <= this.field5158; var15++) {
                    if (var15 >= 0 && var15 < arg1.field1916) {
                        int var16 = 0;
                        for (int var17 = this.field5172; var17 <= this.field5160; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1918) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field8900[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field8890[var17][var15];
                                        int[] var21 = arg1.field8887[var17][var15];
                                        int var22 = 0;
                                        label121: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label121;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2125(var15, var13, -30825, var20[var22], var21[var22], var17, var16);
                                                    var22++;
                                                    this.method2125(var15, var13, -30825, var20[var22], var21[var22], var17, var16);
                                                    var22++;
                                                    this.method2125(var15, var13, -30825, var20[var22], var21[var22], var17, var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2125(var15, var13, -30825, 0, 0, var17, var16);
                                        this.method2125(var15, var13, -30825, arg1.field1919, 0, var17, var16);
                                        this.method2125(var15, var13, -30825, 0, arg1.field1919, var17, var16);
                                    } else if (var18 == 2) {
                                        this.method2125(var15, var13, -30825, arg1.field1919, 0, var17, var16);
                                        this.method2125(var15, var13, -30825, arg1.field1919, arg1.field1919, var17, var16);
                                        this.method2125(var15, var13, -30825, 0, 0, var17, var16);
                                    } else if (var18 == 5) {
                                        this.method2125(var15, var13, -30825, arg1.field1919, arg1.field1919, var17, var16);
                                        this.method2125(var15, var13, -30825, 0, arg1.field1919, var17, var16);
                                        this.method2125(var15, var13, -30825, arg1.field1919, 0, var17, var16);
                                    } else if (var18 == 4) {
                                        this.method2125(var15, var13, -30825, 0, arg1.field1919, var17, var16);
                                        this.method2125(var15, var13, -30825, 0, 0, var17, var16);
                                        this.method2125(var15, var13, -30825, arg1.field1919, arg1.field1919, var17, var16);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field5160 - this.field5172;
                    }
                    var13++;
                }
                this.field5169.method3426();
                if (this.field5154.method774(-22324)) {
                    this.field5150.method3426();
                    this.field5162 = this.field5168.method337((byte) -61, false);
                    this.field5162.method1247(this.field5156 * 16, (byte) -64, 16, var11);
                    break;
                }
                this.field5150.method3417(0);
                this.field5161.method2060(0);
            }
        } else {
            this.field5162 = null;
            this.field5154 = null;
        }
        this.field5151 = this.field5159 = this.field5155 = null;
        this.field5150 = null;
        this.field5169 = null;
        this.field5161 = null;
    }
}
