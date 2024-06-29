import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class117 extends class170 {

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    private int field1973 = 1;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field1978 = 1;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "[I")
    public static int[] field1981 = new int[2];

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "[S")
    public static short[] field1979 = new short[500];

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "Lmh;")
    public static class128 field1985 = class22.method156(127, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "Lmh;")
    public static class128 field1987 = class22.method156(123, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "[I")
    public static int[] field1988 = new int[5];

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[B")
    public static byte[] field1983 = new byte[32896];

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "[Lfb;")
    public static class55[] field1986;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILbg;B)V", line = 5)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            field1983 = (byte[]) null;
        }
        field1974++;
        if (arg0 == 0) {
            this.field1973 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field1978 = arg1.method1325(arg2 ^ 0x1DC6);
        } else if (arg0 == 2) {
            this.field2970 = arg1.method1325(arg2 + 7614) == 1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 55)
    public static void method700(int arg0) {
        field1979 = null;
        field1983 = null;
        field1988 = null;
        field1981 = null;
        field1985 = null;
        field1987 = null;
        field1986 = null;
        if (arg0 < 18) {
            field1987 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 360)
    public class117() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 78)
    public static final void method701(int arg0, byte arg1) {
        class3.field53 = 1000 / arg0;
        int var2 = -100 % ((-arg1 - 3) / 41);
        field1977++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I", line = 94)
    public final int[] method69(byte arg0, int arg1) {
        field1976++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (arg0 != 85) {
            this.field1978 = 93;
        }
        if (this.field2977.field4552) {
            int var4 = this.field1978 + this.field1978 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1973 - (-this.field1973 - 1);
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field1978; var9 <= this.field1978 + arg1; var9++) {
                int[] var10 = this.method1142((byte) 44, 0, class297.field5073 & var9);
                int[] var11 = new int[class185.field3225];
                int var12 = 0;
                for (int var13 = -this.field1973; var13 <= this.field1973; var13++) {
                    var12 += var10[var13 & class5.field94];
                }
                int var14 = 0;
                while (var14 < class185.field3225) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field1973 & class5.field94];
                    var14++;
                    var12 = var10[class5.field94 & var14 + this.field1973] + var15;
                }
                var8[var9 - (arg1 - this.field1978)] = var11;
            }
            for (int var16 = 0; var16 < class185.field3225; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1983[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Z", line = 202)
    public static final boolean method702(boolean arg0) {
        field1982++;
        if (class247.field4247) {
            return true;
        } else {
            if (!arg0) {
                method702(false);
            }
            return class17.field496;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I", line = 230)
    public final int[][] method62(int arg0, int arg1) {
        int var3 = -101 / ((arg1 + 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int var5 = this.field1978 + this.field1978 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field1973 + this.field1973 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = arg0 - this.field1978; var10 <= this.field1978 + arg0; var10++) {
                int[][] var11 = this.method1139(0, var10 & class297.field5073, 0);
                int[][] var12 = new int[3][class185.field3225];
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int[] var16 = var11[2];
                int[] var17 = var11[1];
                int[] var18 = var11[0];
                for (int var19 = -this.field1973; var19 <= this.field1973; var19++) {
                    int var20 = class5.field94 & var19;
                    var13 += var18[var20];
                    var14 += var17[var20];
                    var15 += var16[var20];
                }
                int[] var21 = var12[0];
                int[] var22 = var12[1];
                int[] var23 = var12[2];
                int var24 = 0;
                while (class185.field3225 > var24) {
                    var21[var24] = var8 * var13 >> 16;
                    var22[var24] = var8 * var14 >> 16;
                    var23[var24] = var8 * var15 >> 16;
                    int var25 = var24 - this.field1973 & class5.field94;
                    int var26 = var14 - var17[var25];
                    int var27 = var13 - var18[var25];
                    int var28 = var15 - var16[var25];
                    var24++;
                    int var29 = var24 + this.field1973 & class5.field94;
                    var13 = var18[var29] + var27;
                    var15 = var16[var29] + var28;
                    var14 = var17[var29] + var26;
                }
                var9[var10 + this.field1978 - arg0] = var12;
            }
            int[] var30 = var4[1];
            int[] var31 = var4[2];
            int[] var32 = var4[0];
            for (int var33 = 0; var33 < class185.field3225; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var5; var37++) {
                    int[][] var38 = var9[var37];
                    var35 += var38[1][var33];
                    var36 += var38[2][var33];
                    var34 += var38[0][var33];
                }
                var32[var33] = var6 * var34 >> 16;
                var30[var33] = var6 * var35 >> 16;
                var31[var33] = var6 * var36 >> 16;
            }
        }
        field1980++;
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILql;)V", line = 364)
    public static final void method703(int arg0, class16 arg1) {
        field1975++;
        arg1.field474 = arg1.field482;
        if (arg1.field414 == 0) {
            arg1.field459 = 0;
            return;
        }
        if (arg1.field451 != -1 && arg1.field463 == 0) {
            class1 var2 = class167.method1091(55, arg1.field451);
            if (arg1.field442 > 0 && var2.field23 == 0) {
                arg1.field459++;
                return;
            }
            if (arg1.field442 <= 0 && var2.field36 == 0) {
                arg1.field459++;
                return;
            }
        }
        int var3 = arg1.field478;
        int var4 = arg1.field418;
        int var5 = arg1.field450[arg1.field414 - 1] * 128 + (arg1.method118(-1) * 64);
        int var6 = arg1.field422[arg1.field414 - 1] * 128 + (arg1.method118(-1) * 64);
        if (var5 - var3 > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg1.field478 = var5;
            arg1.field418 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var5 < var3) {
                if (var6 > var4) {
                    arg1.field476 = 768;
                } else if (var6 >= var4) {
                    arg1.field476 = 512;
                } else {
                    arg1.field476 = 256;
                }
            } else if (var6 > var4) {
                arg1.field476 = 1024;
            } else if (var4 > var6) {
                arg1.field476 = 0;
            }
        } else if (var6 > var4) {
            arg1.field476 = 1280;
        } else if (var4 <= var6) {
            arg1.field476 = 1536;
        } else {
            arg1.field476 = 1792;
        }
        int var7 = arg1.field476 - arg1.field460 & 0x7FF;
        int var8 = arg1.field467;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = 4;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field425;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field443;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field455;
        }
        if (~var8 == arg0) {
            var8 = arg1.field425;
        }
        arg1.field474 = var8;
        if (arg1 instanceof class115) {
            var10 = ((class115) arg1).field1934.field3690;
        }
        if (var10) {
            if (arg1.field476 != arg1.field460 && arg1.field458 == -1 && arg1.field446 != 0) {
                var9 = 2;
            }
            if (arg1.field414 > 2) {
                var9 = 6;
            }
            if (arg1.field414 > 3) {
                var9 = 8;
            }
            if (arg1.field459 > 0 && arg1.field414 > 1) {
                arg1.field459--;
                var9 = 8;
            }
        } else {
            if (arg1.field414 > 1) {
                var9 = 6;
            }
            if (arg1.field414 > 2) {
                var9 = 8;
            }
            if (arg1.field459 > 0 && arg1.field414 > 1) {
                var9 = 8;
                arg1.field459--;
            }
        }
        if (arg1.field469[arg1.field414 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field474 == arg1.field425 && arg1.field449 != -1) {
            arg1.field474 = arg1.field449;
        }
        if (var6 > var4) {
            arg1.field418 += var9;
            if (arg1.field418 > var6) {
                arg1.field418 = var6;
            }
        } else if (var6 < var4) {
            arg1.field418 -= var9;
            if (arg1.field418 < var6) {
                arg1.field418 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field478 += var9;
            if (arg1.field478 > var5) {
                arg1.field478 = var5;
            }
        } else if (var3 > var5) {
            arg1.field478 -= var9;
            if (var5 > arg1.field478) {
                arg1.field478 = var5;
            }
        }
        if (arg1.field478 == var5 && arg1.field418 == var6) {
            arg1.field414--;
            if (arg1.field442 > 0) {
                arg1.field442--;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 578)
    public static final void method704(int arg0) {
        class189 var1 = class210.field3715;
        synchronized (class210.field3715) {
            class130.field2270 = class211.field3737;
            class222.field3901++;
            if (class189.field3286 >= arg0) {
                while (class189.field3286 != class139.field2373) {
                    int var3 = class303.field5133[class139.field2373];
                    class139.field2373 = class139.field2373 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class257.field4426[var3] = true;
                    } else {
                        class257.field4426[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class257.field4426[var2] = false;
                }
                class189.field3286 = class139.field2373;
            }
            class211.field3737 = class66.field1274;
        }
        field1984++;
    }
}
