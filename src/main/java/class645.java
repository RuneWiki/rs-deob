import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class645 {

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "Lcf;")
    private class562 field9294;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Ltr;")
    private class268 field9278;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public int field9290;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    private int field9289;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "[B")
    public byte[] field9298;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    private int field9285;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    private int field9282;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    private int field9286;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Lsb;")
    public static class266 field9280 = new class266(15, 8);

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "Ltf;")
    public static class269 field9293 = new class269();

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "Lqfa;")
    public static class85 field9296 = new class85(60, 0);

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "[Llb;")
    public static class505[] field9299 = null;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "F")
    public static float field9297;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "[[Ltl;")
    private class576[][] field9283;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
    private final void method3674(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9295++;
        if (this.field9283 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        if (arg0 > -22) {
            return;
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class576[] var11 = this.field9283[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field8368 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
    public final void method3675(byte arg0) {
        field9287++;
        if (arg0 != -75) {
            this.method3675((byte) 78);
        }
        this.field9283 = new class576[this.field9282][this.field9286];
        for (int var2 = 0; var2 < this.field9286; var2++) {
            for (int var3 = 0; var3 < this.field9282; var3++) {
                this.field9283[var3][var2] = new class576(this.field9294, this, this.field9278, var3, var2, this.field9285, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field9283[var3][var2].field8373 == 0) {
                    this.field9283[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILha;II)V")
    public final void method3676(int arg0, class54 arg1, int arg2, int arg3) {
        field9288++;
        class443 var5 = (class443) arg1;
        int var6 = var5.field6375 + arg0 + 1;
        int var7 = var5.field6381 + arg2 + 1;
        int var8 = var6 + (this.field9290 * var7);
        int var9 = 0;
        int var10 = var5.field6379;
        int var11 = var5.field6374;
        int var12 = this.field9290 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field9290 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field9289 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field9289;
            var10 -= var15;
        }
        if (arg3 != 31383) {
            this.method3676(-18, null, 108, 50);
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var12 += var16;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field9290) {
            int var17 = var11 + var6 + 1 - this.field9290;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class590.method3368(this.field9298, var11, var14, var12, var10, var5.field6373, var8, 20481, var9);
            this.method3674(-125, var11, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static final void method3677(int arg0) {
        int var1 = 0;
        if (arg0 >= -124) {
            field9293 = null;
        }
        while (class132.field2373 > var1) {
            label138: {
                class373 var3 = class286.field4264[var1];
                boolean var4 = false;
                if (var3.field5548 == null) {
                    var3.field5552--;
                    if (var3.field5552 < (var3.method2354(false) ? -1500 : -10)) {
                        var4 = true;
                    } else {
                        if (var3.field5549 == 1 && var3.field5554 == null) {
                            var3.field5554 = class60.method682(class35.field1027, var3.field5551, 0);
                            if (var3.field5554 == null) {
                                break label138;
                            }
                            var3.field5552 += var3.field5554.method685();
                        } else if (var3.method2354(false) && (var3.field5553 == null || var3.field5556 == null)) {
                            if (var3.field5553 == null) {
                                var3.field5553 = class429.method2618(class444.field6395, var3.field5551);
                            }
                            if (var3.field5553 == null) {
                                break label138;
                            }
                            if (var3.field5556 == null) {
                                var3.field5556 = var3.field5553.method2607(new int[] { 22050 });
                                if (var3.field5556 == null) {
                                    break label138;
                                }
                            }
                        }
                        if (var3.field5552 < 0) {
                            int var5;
                            if (var3.field5544 == 0) {
                                var5 = var3.field5543 * (var3.field5549 == 3 ? class527.field7429.field2630 : class527.field7429.field2658) >> 8;
                            } else {
                                int var6 = var3.field5544 >> 24 & 0x3;
                                if (class532.field7456.field9814 == var6) {
                                    int var7 = var3.field5544 & 0xFF << 9;
                                    int var8 = (var3.field5544 & 0xFFE535) >> 16;
                                    int var9 = (var8 << 9) + 256 - class532.field7456.field9806;
                                    if (var9 < 0) {
                                        var9 = -var9;
                                    }
                                    int var10 = (var3.field5544 & 0xFFEB) >> 8;
                                    int var11 = (var10 << 9) + 256 - class532.field7456.field9815;
                                    if (var11 < 0) {
                                        var11 = -var11;
                                    }
                                    int var12 = var11 + var9 - 512;
                                    if (var7 < var12) {
                                        var3.field5552 = -99999;
                                        break label138;
                                    }
                                    if (var12 < 0) {
                                        var12 = 0;
                                    }
                                    var5 = (var7 - var12) * var3.field5543 * class527.field7429.field2635 / var7 >> 8;
                                } else {
                                    var5 = 0;
                                }
                            }
                            if (var5 > 0) {
                                class630 var13 = null;
                                if (var3.field5549 == 1) {
                                    var13 = var3.field5554.method683().method3603(class39.field1063);
                                } else if (var3.method2354(false)) {
                                    var13 = var3.field5556;
                                }
                                class245 var14 = var3.field5548 = class245.method1659(var13, 100, var5);
                                var14.method1653(var3.field5545 - 1);
                                class50.field1184.method2067(var14);
                            }
                        }
                    }
                } else if (!var3.field5548.method2589(300)) {
                    var4 = true;
                }
                if (var4) {
                    class132.field2373--;
                    for (int var15 = var1; var15 < class132.field2373; var15++) {
                        class286.field4264[var15] = class286.field4264[var15 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        field9281++;
        if (class552.field7822 && !class273.method1780(0)) {
            if (class527.field7429.field2659 != 0 && class65.field1434 != -1) {
                class444.method2671(class46.field1128, class527.field7429.field2659, false, 6408, class65.field1434, 0);
            }
            class552.field7822 = false;
        } else if (class527.field7429.field2659 != 0 && class65.field1434 != -1 && !class273.method1780(0)) {
            class334.field4955++;
            class275 var2 = class185.method1355(0, class167.field2786, class395.field5772);
            var2.field4103.method715(class65.field1434, 1949991176);
            class140.method1141(var2, 19321);
            class65.field1434 = -1;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIZII)V")
    public static final void method3678(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field9291++;
        int var6 = arg5 - arg2;
        if (!arg3) {
            return;
        }
        int var7 = arg0 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class328.method2110(arg2, arg1, arg4, -1, arg0);
            }
        } else if (var7 == 0) {
            class75.method803(arg2, arg1, arg4, arg5, -76);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class704.field9911) {
                var11 = class704.field9911;
                var10 = (class704.field9911 * var8 >> 12) + var9;
            } else if (arg5 <= class379.field5612) {
                var10 = arg0;
                var11 = arg5;
            } else {
                var10 = var9 + (class379.field5612 * var8 >> 12);
                var11 = class379.field5612;
            }
            int var12;
            int var13;
            if (arg2 < class704.field9911) {
                var12 = class704.field9911;
                var13 = (class704.field9911 * var8 >> 12) + var9;
            } else if (class379.field5612 >= arg2) {
                var12 = arg2;
                var13 = arg4;
            } else {
                var13 = (class379.field5612 * var8 >> 12) + var9;
                var12 = class379.field5612;
            }
            if (var10 < class309.field4556) {
                var11 = (class309.field4556 - var9 << 12) / var8;
                var10 = class309.field4556;
            } else if (client.field4115 < var10) {
                var11 = (client.field4115 - var9 << 12) / var8;
                var10 = client.field4115;
            }
            if (var13 < class309.field4556) {
                var13 = class309.field4556;
                var12 = (class309.field4556 - var9 << 12) / var8;
            } else if (var13 > client.field4115) {
                var12 = (client.field4115 - var9 << 12) / var8;
                var13 = client.field4115;
            }
            class316.method2042(var12, var10, arg1, var13, var11, -1);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method3679(class54 arg0, int arg1, int arg2, int arg3) {
        field9279++;
        class443 var5 = (class443) arg0;
        int var6 = var5.field6375 + arg3 + 1;
        int var7 = var5.field6381 + arg2 + 1;
        int var8 = this.field9290 * var7 + var6;
        int var9 = var5.field6379;
        int var10 = var5.field6374;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field9290 * var11;
            var7 = 1;
            var9 -= var11;
        }
        int var12 = this.field9290 - var10;
        if (var7 + var9 >= this.field9289) {
            int var13 = var9 + var7 + 1 - this.field9289;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
        }
        if (arg1 < 102) {
            this.field9285 = -107;
        }
        if (var6 + var10 >= this.field9290) {
            int var15 = var10 + var6 + 1 - this.field9290;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9290 + var12;
            return class185.method1358(var17, var9, (byte) 118, var8, var10, this.field9298, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V")
    public static void method3680(byte arg0) {
        field9293 = null;
        field9280 = null;
        field9299 = null;
        if (arg0 < 121) {
            field9296 = null;
        }
        field9296 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBIIZ[[Z)V")
    public final void method3681(int arg0, byte arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        this.field9294.method3268(false, (byte) 115);
        field9292++;
        if (arg1 != 12) {
            field9297 = -1.1968396F;
        }
        this.field9294.method3253(-25293, false);
        this.field9294.method3248(-3, 1);
        this.field9294.method3195(arg1 ^ 0xFFFFFFF8, 1);
        this.field9294.method3222(-2, (byte) -106, false, false);
        float var7 = 1.0F / (float) (this.field9294.field8116 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field9286; var8++) {
                int var9 = var8 << this.field9285;
                int var10 = var8 + 1 << this.field9285;
                label145: for (int var11 = 0; var11 < this.field9282; var11++) {
                    if (this.field9283[var11][var8] != null) {
                        int var12 = var11 << this.field9285;
                        int var13 = var11 + 1 << this.field9285;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg3 >= -arg0 && arg0 >= (var14 - arg3)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (-arg0 <= var15 - arg2 && var15 - arg2 <= arg0 && arg5[var14 + arg0 - arg3][var15 + arg0 - arg2]) {
                                        class391 var16 = this.field9294.method3240(true);
                                        var16.method2421((byte) 75, 1.0F, var7, var7);
                                        var16.method891(-var11, -var8, 0);
                                        this.field9294.method3265((byte) -88, class662.field9533);
                                        this.field9283[var11][var8].method3308(256);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field9286; var17++) {
                int var18 = var17 << this.field9285;
                int var19 = var17 + 1 << this.field9285;
                for (int var20 = 0; var20 < this.field9282; var20++) {
                    class576 var21 = this.field9283[var20][var17];
                    if (var21 != null) {
                        class595 var22 = this.field9294.method3256((byte) -33, var21.field8373 * 3);
                        Buffer var23 = var22.method1188(false, true);
                        if (var23 != null) {
                            Stream var24 = this.field9294.method3219(var23, 1009);
                            int var25 = 0;
                            int var26 = var20 << this.field9285;
                            int var27 = var20 + 1 << this.field9285;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg2 >= -arg0 && var28 - arg2 <= arg0) {
                                    int var30 = this.field9278.field1041 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg0) <= (var31 - arg3) && arg0 >= (var31 - arg3) && arg5[var31 + arg0 - arg3][arg0 + var28 - arg2]) {
                                            short[] var32 = this.field9278.field3970[var30];
                                            if (var32 != null) {
                                                if (Stream.method3580()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3575(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3583(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3576();
                            if (var22.method1185(true) && var25 > 0) {
                                class391 var29 = this.field9294.method3240(true);
                                var29.method2421((byte) -92, 1.0F, var7, var7);
                                var29.method891(-var20, -var17, 0);
                                this.field9294.method3265((byte) -88, class662.field9533);
                                var21.method3305(false, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field9294.method3220((byte) -89);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILha;)V")
    public final void method3682(int arg0, int arg1, int arg2, class54 arg3) {
        field9284++;
        class443 var5 = (class443) arg3;
        int var6 = var5.field6375 + arg1 + 1;
        int var7 = var5.field6381 + arg2 + 1;
        int var8 = this.field9290 * var7 + var6;
        int var9 = 0;
        int var10 = -109 % ((72 - arg0) / 37);
        int var11 = var5.field6379;
        int var12 = var5.field6374;
        int var13 = this.field9290 - var12;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += this.field9290 * var14;
            var11 -= var14;
            var9 += var12 * var14;
        }
        int var15 = 0;
        if (this.field9289 <= (var7 + var11)) {
            int var16 = var7 + var11 + 1 - this.field9289;
            var11 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var6 = 1;
            var12 -= var17;
            var9 += var17;
            var15 += var17;
            var8 += var17;
            var13 += var17;
        }
        if (var6 + var12 >= this.field9290) {
            int var18 = var6 + var12 + 1 - this.field9290;
            var13 += var18;
            var15 += var18;
            var12 -= var18;
        }
        if (var12 > 0 && var11 > 0) {
            class198.method1422(var9, var15, var8, var12, var5.field6373, var11, true, var13, this.field9298);
            this.method3674(-47, var12, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lcf;Ltr;)V")
    public class645(class562 arg0, class268 arg1) {
        this.field9294 = arg0;
        this.field9278 = arg1;
        this.field9290 = (this.field9278.field1041 * this.field9278.field1040 >> this.field9294.field8144) + 2;
        this.field9289 = (this.field9278.field1043 * this.field9278.field1040 >> this.field9294.field8144) + 2;
        this.field9298 = new byte[this.field9290 * this.field9289];
        this.field9285 = this.field9294.field8144 + 7 - this.field9278.field1038;
        this.field9282 = this.field9278.field1041 >> this.field9285;
        this.field9286 = this.field9278.field1043 >> this.field9285;
    }
}
