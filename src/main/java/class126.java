import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class126 extends class313 {

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    private int field2165 = 1024;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    private int field2176 = 409;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field2171 = 819;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    private int field2166 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    private int field2181 = 1024;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    private int field2183 = 0;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field2173 = 2048;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    private int field2187 = 1024;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    private int field2190 = 1024;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field2178;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Lab;", line = 6)
    public static final class162 method1047(int arg0, int arg1) {
        field2170++;
        class162 var2 = (class162) class92.field1445.method467(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field1214.method441(false, arg0, arg1);
        class162 var4 = new class162();
        if (var3 != null) {
            var4.method1293(5, new class336(var3), arg1);
        }
        class92.field1445.method465(var4, (long) arg1, (byte) 57);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 194)
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V", line = 44)
    public static final void method1048(int arg0, int arg1, int arg2) {
        if (class113.field1884 > 0) {
            class89.method778(class113.field1884, -84);
            class113.field1884 = 0;
        }
        field2182++;
        int var3 = arg1;
        short var4 = 256;
        int var5 = class47.field729 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var8 = (var4 - var7) * class296.field4728[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class47.field725[arg0 + (var5++)];
                int var11 = class70.field1156[var3++];
                if (var11 == 0) {
                    class25.field353.field4907[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    int var13 = 238 - var11;
                    int var14 = class318.field5048[var11];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class25.field353.field4907[var6++] = class36.method319(var13 * class36.method319(16711935, var10) + var12 * class36.method319(var14, 16711935), -16711936) + class36.method319(class36.method319(var14, 65280) * var12 + var13 * class36.method319(var10, 65280), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class25.field353.field4907[var6++] = class47.field725[arg0 + (var5++)];
            }
            var5 += class47.field729 - 128;
        }
        if (class43.field680) {
            class169.method1327(class25.field353.field4907, arg0, arg2, class25.field353.field2967, class25.field353.field2965);
        } else {
            class25.field353.method1249(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V", line = 131)
    public static final void method1049(int arg0) {
        field2180++;
        int var1 = class316.method2180((byte) 79);
        if (arg0 != 4892) {
            return;
        }
        if (var1 == 0) {
            class35.field498 = (byte[][][]) null;
            class168.method1317((byte) -83, 0);
        } else if (var1 == 1) {
            class121.method1026((byte) 0, (byte) -113);
            class168.method1317((byte) -83, 512);
            if (class152.field2683 != null) {
                class300.method2074((byte) -66);
            }
        } else {
            class121.method1026((byte) (class178.field3022 - 4 & 0xFF), (byte) -113);
            class168.method1317((byte) -83, 2);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)Ldg;", line = 166)
    public static final class346 method1050(int arg0, int arg1) {
        field2169++;
        if (arg1 >= -105) {
            return (class346) null;
        }
        class346 var2 = (class346) class36.field529.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class257.field4164.method441(false, 32, arg0);
        class346 var4 = new class346();
        if (var3 != null) {
            var4.method2424((byte) -85, new class336(var3));
        }
        var4.method2429(31);
        class36.field529.method465(var4, (long) arg0, (byte) 38);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I", line = 208)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(arg0 ^ 0x8E377EC6, arg1);
        field2174++;
        if (this.field4961.field3451) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = this.field4961.method1522(arg0 - 4);
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class133.field2269 * this.field2173 >> 12;
            int var15 = class133.field2269 * this.field2165 >> 12;
            int var16 = class77.field1247 * this.field2176 >> 12;
            int var17 = class77.field1247 * this.field2171 >> 12;
            if (var17 <= 1) {
                return var8[arg1];
            }
            this.field2184 = class133.field2269 / 8 * this.field2181 >> 12;
            int var18 = class133.field2269 / var15 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2183);
            label132: while (true) {
                while (true) {
                    int var22 = class129.method1075(var14 - var15, 19192, var21) + var15;
                    int var23 = var16 + class129.method1075(var17 - var16, 19192, var21);
                    int var24 = var5 + var22;
                    if (class133.field2269 < var24) {
                        var22 = class133.field2269 - var5;
                        var24 = class133.field2269;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var10;
                        int var27 = 0;
                        int[] var28 = var19[var10];
                        var25 = var28[2];
                        int var29 = var4 + var24;
                        if (var29 < 0) {
                            var29 += class133.field2269;
                        }
                        if (class133.field2269 < var29) {
                            var29 -= class133.field2269;
                        }
                        while (true) {
                            int[] var30 = var19[var26];
                            if (var30[0] <= var29 && var29 <= var30[1]) {
                                if (var10 != var26) {
                                    int var31 = var4 + var5;
                                    if (var31 < 0) {
                                        var31 += class133.field2269;
                                    }
                                    if (class133.field2269 < var31) {
                                        var31 -= class133.field2269;
                                    }
                                    for (int var32 = 1; var32 <= var27; var32++) {
                                        int[] var33 = var19[(var10 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var27; var34++) {
                                        int[] var35 = var19[(var10 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var29, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class133.field2269;
                                            }
                                            this.method1055(var36, var6 + var39, (byte) 94, var8, var25 - var36, -var39 + var40, var21);
                                        }
                                    }
                                }
                                var10 = var26;
                                break;
                            }
                            var27++;
                            var26++;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var23 + var25 <= class77.field1247) {
                        var9 = false;
                    } else {
                        var23 = class77.field1247 - var25;
                    }
                    if (class133.field2269 == var24) {
                        this.method1055(var25, var5 + var7, (byte) 37, var8, var23, var22, var21);
                        if (var9) {
                            break label132;
                        }
                        var6 = var7;
                        var11 = false;
                        var10 = 0;
                        int[] var41 = var20[var13++];
                        var9 = true;
                        var12 = var13;
                        var13 = 0;
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var5;
                        var5 = 0;
                        var7 = class129.method1075(class133.field2269, 19192, var21);
                        int[][] var42 = var19;
                        var19 = var20;
                        var20 = var42;
                        var4 = var7 - var6;
                        int var43 = var4;
                        if (var4 < 0) {
                            var43 = class133.field2269 + var4;
                        }
                        if (var43 > class133.field2269) {
                            var43 -= class133.field2269;
                        }
                        while (true) {
                            int[] var44 = var19[var10];
                            if (var43 >= var44[0] && var44[1] >= var43) {
                                break;
                            }
                            int var10000 = ~var12;
                            var10++;
                            if (var10000 >= ~var10) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var20[var13++];
                        var45[0] = var5;
                        var45[1] = var24;
                        var45[2] = var25 + var23;
                        this.method1055(var25, var5 + var7, (byte) 77, var8, var23, var22, var21);
                        var5 = var24;
                    }
                }
            }
        }
        if (arg0 != 4) {
            method1054('\u0003', 114, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V", line = 457)
    public static final void method1051(int arg0, int arg1) {
        field2179++;
        class66 var2 = (class66) class70.field1146.method732((long) arg0, true);
        if (var2 == null) {
            return;
        }
        if (arg1 != -5946) {
            method1049(-69);
        }
        for (int var3 = 0; var3 < var2.field1067.length; var3++) {
            var2.field1067[var3] = -1;
            var2.field1071[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)V", line = 482)
    public static final void method1052(int arg0, int arg1) {
        if (arg0 <= -114) {
            field2185++;
            class160.field2823.method469(-11815, arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILpi;)V", line = 517)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field2183 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field2165 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field2173 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field2176 = arg2.method2339((byte) -46);
        } else if (arg0 == 4) {
            this.field2171 = arg2.method2339((byte) -46);
        } else if (arg0 == 5) {
            this.field2181 = arg2.method2339((byte) -46);
        } else if (arg0 == 6) {
            this.field2166 = arg2.method2364(arg1 ^ 0x66DB);
        } else if (arg0 == 7) {
            this.field2187 = arg2.method2339((byte) -46);
        } else if (arg0 == 8) {
            this.field2190 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            method1050(22, 90);
        }
        field2189++;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 602)
    public static void method1053(int arg0) {
        field2178 = null;
        if (arg0 != 20956) {
            field2178 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 626)
    public final void method182(int arg0) {
        if (arg0 != 25833) {
            method1056(-10);
        }
        field2177++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(CILjava/lang/String;)I", line = 637)
    public static final int method1054(char arg0, int arg1, String arg2) {
        field2172++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg1 != 22129) {
            return 127;
        }
        while (var4 > var5) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB[[IIILjava/util/Random;)V", line = 668)
    private final void method1055(int arg0, int arg1, byte arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        field2175++;
        int var8 = this.field2190 > 0 ? 4096 - class129.method1075(this.field2190, 19192, arg6) : 4096;
        int var9 = this.field2187 * this.field2184 >> 12;
        int var10 = this.field2184 - (var9 <= 0 ? 0 : class129.method1075(var9, 19192, arg6));
        if (arg2 <= 11) {
            this.field2187 = -7;
        }
        if (class133.field2269 <= arg1) {
            arg1 -= class133.field2269;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg5 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = arg4 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg1 + var17;
            int var20 = arg5 - (var17 * 2);
            for (int var21 = 0; var21 < arg4; var21++) {
                int[] var22 = arg3[arg0 + var21];
                if (var18 <= var21) {
                    int var23 = arg4 - var21 - 1;
                    if (var23 >= var18) {
                        for (int var24 = 0; var24 < var17; var24++) {
                            var22[class36.method319(class297.field4731, arg1 + var24)] = var22[class36.method319(arg1 + arg5 - var24 - 1, class297.field4731)] = var8 * var24 / var17;
                        }
                        if (class133.field2269 >= var19 + var20) {
                            class345.method2422(var22, var19, var20, var8);
                        } else {
                            int var25 = class133.field2269 - var19;
                            class345.method2422(var22, var19, var25, var8);
                            class345.method2422(var22, 0, var20 - var25, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var18;
                        if (this.field2166 == 0) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class36.method319(class297.field4731, arg1 + var27)] = var22[class36.method319(class297.field4731, arg1 - var27 - (-arg5 - -1))] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var17; var29++) {
                                int var30 = var8 * var29 / var17;
                                var22[class36.method319(class297.field4731, arg1 + var29)] = var22[class36.method319(class297.field4731, arg5 + arg1 - var29 - 1)] = var26 <= var30 ? var26 : var30;
                            }
                        }
                        if ((var19 + var20) <= class133.field2269) {
                            class345.method2422(var22, var19, var20, var26);
                        } else {
                            int var31 = class133.field2269 - var19;
                            class345.method2422(var22, var19, var31, var26);
                            class345.method2422(var22, 0, var20 - var31, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field2166 == 0) {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class36.method319(arg1 + var35, class297.field4731)] = var22[class36.method319(arg5 + arg1 - var35 - 1, class297.field4731)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class36.method319(class297.field4731, arg1 + var33)] = var22[class36.method319(arg5 + arg1 - var33 - 1, class297.field4731)] = var34 >= var32 ? var32 : var34;
                        }
                    }
                    if (class133.field2269 < var19 + var20) {
                        int var37 = class133.field2269 - var19;
                        class345.method2422(var22, var19, var37, var32);
                        class345.method2422(var22, 0, var20 - var37, var32);
                    } else {
                        class345.method2422(var22, var19, var20, var32);
                    }
                }
            }
        } else if (arg1 + arg5 > class133.field2269) {
            int var11 = class133.field2269 - arg1;
            for (int var12 = 0; var12 < arg4; var12++) {
                int[] var13 = arg3[arg0 + var12];
                class345.method2422(var13, arg1, var11, var8);
                class345.method2422(var13, 0, arg5 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg4; var14++) {
                class345.method2422(arg3[arg0 + var14], arg1, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V", line = 864)
    public static final void method1056(int arg0) {
        if (arg0 != 16322) {
            field2167 = 78;
        }
        class85.field1359.method470(arg0 - 16310);
        field2186++;
    }
}
