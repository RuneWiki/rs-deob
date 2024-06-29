import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class398 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lc;")
    public static class511 field5943;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method2386(int arg0, int arg1, int arg2, int arg3) {
        if (class98.method760(arg0, arg1, arg2)) {
            int var4 = arg1 << class9.field75;
            int var5 = arg2 << class9.field75;
            return class486.method2891(var4 + 1, class249.field3405[arg0].method707(arg1, arg2) + arg3, var5 + 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1 + 1, arg2) + arg3, var5 + 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1 + 1, arg2 + 1) + arg3, class324.field5060 + var5 - 1) && class486.method2891(var4 + 1, class249.field3405[arg0].method707(arg1, arg2 + 1) + arg3, class324.field5060 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lwg;II)V", line = 34)
    public final void method2387(class41 arg0, int arg1, int arg2) {
        field5945++;
        if (~arg1 == arg2 || !this.method641()) {
            return;
        }
        class57 var4 = arg0.field538[arg1];
        class20 var5 = var4.field785;
        for (int var6 = 0; var6 < var4.field791; var6++) {
            short var7 = var4.field790[var6];
            if (var5.field302[var7]) {
                if (var4.field786[var6] != -1) {
                    this.method638(0, 0, 0, 0);
                }
                this.method638(var5.field299[var7], var4.field787[var6], var4.field782[var6], var4.field788[var6]);
            }
        }
        this.method607();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 76)
    public static final void method2388(byte arg0) {
        if (arg0 < 22) {
            field5943 = null;
        }
        class174.field2551 = true;
        field5946++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 92)
    public static final void method2389(int arg0, int arg1, int arg2) {
        field5940++;
        if (arg2 != 0) {
            field5943 = null;
        }
        if (class250.method1495(true, arg1)) {
            class133.method979(arg0, 34037, class174.field2549[arg1]);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLwg;IILwg;[IIIIII)V", line = 116)
    public final void method2390(boolean arg0, class41 arg1, int arg2, int arg3, class41 arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5937++;
        if (~arg10 == arg2 || !this.method641()) {
            return;
        }
        class57 var12 = arg4.field538[arg10];
        class20 var13 = var12.field785;
        class57 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field538[arg8];
            if (var14.field785 != var13) {
                var14 = null;
            }
        }
        this.method2392(arg5, arg0, arg6, arg2 ^ 0x31, var13, null, var14, arg3, arg7, arg9, false, var12);
        this.method607();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLwg;ILwg;IIII)V", line = 145)
    public final void method2391(int arg0, boolean arg1, class41 arg2, int arg3, class41 arg4, int arg5, int arg6, int arg7, int arg8) {
        field5935++;
        if (arg0 == arg6 || !this.method641()) {
            return;
        }
        class57 var10 = arg2.field538[arg6];
        class20 var11 = var10.field785;
        class57 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field538[arg7];
            if (var12.field785 != var11) {
                var12 = null;
            }
        }
        this.method2392(null, arg1, 65535, 41, var11, null, var12, arg5, arg3, arg8, false, var10);
        this.method607();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IZIILir;[ZLgh;IIIZLgh;)V", line = 179)
    private final void method2392(int[] arg0, boolean arg1, int arg2, int arg3, class20 arg4, boolean[] arg5, class57 arg6, int arg7, int arg8, int arg9, boolean arg10, class57 arg11) {
        field5941++;
        if (arg6 == null || arg7 == 0) {
            for (int var38 = 0; var38 < arg11.field791; var38++) {
                short var39 = arg11.field790[var38];
                if (arg5 == null || arg5[var39] == arg10 || arg4.field299[var39] == 0) {
                    short var40 = arg11.field786[var38];
                    if (var40 != -1) {
                        this.method2397(arg8, arg0, arg4.field294[var40] & arg2, arg1, 0, 0, 0, arg4.field300[var40], 0, (byte) 59);
                    }
                    this.method2397(arg8, arg0, arg2 & arg4.field294[var39], arg1, arg4.field299[var39], arg11.field787[var38], arg11.field782[var38], arg4.field300[var39], arg11.field788[var38], (byte) 59);
                }
            }
            return;
        }
        if (arg3 <= 18) {
            field5943 = null;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg4.field295; var15++) {
            boolean var16 = false;
            if (arg11.field791 > var13 && arg11.field790[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg6.field791 > var14 && arg6.field790[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg5 == null || arg5[var15] == arg10 || arg4.field299[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field299[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg11.field776[var13];
                        var24 = arg11.field786[var13];
                        var23 = arg11.field787[var13];
                        var20 = arg11.field788[var13];
                        var21 = arg11.field782[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = 0;
                        var23 = var18;
                        var24 = -1;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var27 = arg6.field782[var14];
                        var26 = arg6.field776[var14];
                        var28 = arg6.field788[var14];
                        var29 = arg6.field787[var14];
                        var25 = arg6.field786[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = var18;
                    }
                    if (var24 != -1) {
                        this.method2397(arg8, arg0, arg2 & arg4.field294[var24], arg1, 0, 0, 0, arg4.field300[var24], 0, (byte) 59);
                    } else if (var25 != -1) {
                        this.method2397(arg8, arg0, arg4.field294[var25] & arg2, arg1, 0, 0, 0, arg4.field300[var25], 0, (byte) 59);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var23;
                        var35 = var20;
                    } else if (var19 == 2) {
                        int var30 = var29 - var23 & 0x3FFF;
                        int var31 = var27 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var28 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg7 * var30 / arg9 + var23 & 0x3FFF;
                        var34 = arg7 * var31 / arg9 + var21 & 0x3FFF;
                        var35 = arg7 * var32 / arg9 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var29 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = var23 + (arg7 * var36 / arg9) & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var37 = var29 - var23 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = (var28 - var20) * arg7 / arg9 + var20;
                        var34 = var21 + ((var27 - var21) * arg7 / arg9);
                        var33 = var23 + (arg7 * var37 / arg9) & 0x3F;
                    } else {
                        var34 = (var27 - var21) * arg7 / arg9 + var21;
                        var33 = (var29 - var23) * arg7 / arg9 + var23;
                        var35 = var20 + ((var28 - var20) * arg7 / arg9);
                    }
                    this.method2397(arg8, arg0, arg2 & arg4.field294[var15], arg1, var19, var33, var34, arg4.field300[var15], var35, (byte) 59);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lwg;IIZIILwg;ZLwg;Lwg;I[ZIII)V", line = 407)
    public final void method2393(class41 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class41 arg6, boolean arg7, class41 arg8, class41 arg9, int arg10, boolean[] arg11, int arg12, int arg13, int arg14) {
        field5942++;
        if (arg14 == -1) {
            return;
        }
        if (arg11 == null || arg12 == -1) {
            this.method2391(-1, arg7, arg0, 0, arg6, arg4, arg14, arg1, arg13);
        } else if (this.method641()) {
            class57 var16 = arg0.field538[arg14];
            class20 var17 = var16.field785;
            class57 var18 = null;
            if (arg6 != null) {
                var18 = arg6.field538[arg1];
                if (var18.field785 != var17) {
                    var18 = null;
                }
            }
            this.method2392(null, arg7, 65535, 28, var17, arg11, var18, arg4, 0, arg13, false, var16);
            class57 var19 = arg9.field538[arg12];
            class57 var20 = null;
            if (arg8 != null) {
                var20 = arg8.field538[arg5];
                if (var20.field785 != var17) {
                    var20 = null;
                }
            }
            this.method600(0, new int[0], 0, 0, 0, 0, arg7);
            this.method2392(null, arg7, 65535, 82, var19.field785, arg11, var20, arg10, 0, arg2, arg3, var19);
            this.method607();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 461)
    public static final void method2394(String arg0, byte arg1, int arg2) {
        field5939++;
        int var3 = class146.field2203;
        int[] var4 = class457.field6694;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class480 var7 = class83.field1327[var4[var6]];
            if (var7 != null && class410.field6198 != var7 && var7.field7063 != null && var7.field7063.equalsIgnoreCase(arg0)) {
                if (arg2 == 1) {
                    class29.field422++;
                    class97.method758(class84.field1334, false);
                    class43.field559.method2753(77, 0);
                    class43.field559.method2773((byte) 95, var4[var6]);
                } else if (arg2 == 4) {
                    class490.field7299++;
                    class97.method758(class72.field998, false);
                    class43.field559.method2777((byte) 74, var4[var6]);
                    class43.field559.method2726((byte) -21, 0);
                } else if (arg2 == 5) {
                    class265.field3951++;
                    class97.method758(class446.field6576, false);
                    class43.field559.method2773((byte) 120, var4[var6]);
                    class43.field559.method2775((byte) 106, 0);
                } else if (arg2 == 6) {
                    class100.field1524++;
                    class97.method758(class76.field1077, false);
                    class43.field559.method2726((byte) -21, 0);
                    class43.field559.method2777((byte) 74, var4[var6]);
                } else if (arg2 == 7) {
                    class20.field304++;
                    class97.method758(class402.field6081, false);
                    class43.field559.method2754(0, 5574);
                    class43.field559.method2739(var4[var6], (byte) -41);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class264.method1653((byte) 121, class152.field2315.method2103(class30.field430, (byte) 34) + arg0);
        }
        int var8 = 110 % ((46 - arg1) / 36);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 543)
    public static void method2395(int arg0) {
        field5943 = null;
        if (arg0 != -14976) {
            method2389(101, 98, -47);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIILta;I)V", line = 558)
    public final void method2396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class337 arg7, int arg8) {
        field5938++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg7.method718(arg5 + var13, arg1 + var14);
        int var16 = arg8 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg7.method718(arg5 + var16, arg1 + var17);
        int var19 = -arg8 / 2;
        int var20 = arg6 / 2;
        int var21 = arg7.method718(arg5 + var19, arg1 + var20);
        int var22 = arg8 / 2;
        int var23 = arg6 / 2;
        int var24 = arg7.method718(arg5 + var22, arg1 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg2 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg2;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (arg2 < var28) {
                        var28 = arg2;
                    }
                }
                this.method657(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg8 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg3 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg3;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg3) {
                        var31 = arg3;
                    }
                }
                this.method595(var31);
            }
        }
        if (arg0 != -8193) {
            field5943 = null;
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg4;
        if (var34 != 0) {
            this.method601(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIZIII[IIB)V", line = 672)
    private final void method2397(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, byte arg9) {
        if (arg0 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg5;
                arg5 = arg8;
                arg8 = var13;
            } else if (arg4 == 3) {
                int var11 = arg5;
                arg5 = arg8;
                arg8 = var11;
            } else if (arg4 == 2) {
                int var12 = arg5;
                arg5 = -arg8 & 0x3FFF;
                arg8 = var12 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg8 = -arg8;
                arg5 = -arg5;
            } else if (arg4 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg5;
                arg5 = -arg8;
                arg8 = var16;
            } else if (arg4 == 3) {
                int var15 = arg5;
                arg5 = arg8;
                arg8 = var15;
            } else if (arg4 == 2) {
                int var14 = arg5;
                arg5 = arg8 & 0x3FFF;
                arg8 = -var14 & 0x3FFF;
            }
        }
        if (arg9 != 59) {
            this.method2387(null, -113, 108);
        }
        field5944++;
        if (arg2 == 65535) {
            this.method600(arg4, arg7, arg5, arg6, arg8, arg0, arg3);
        } else {
            this.method615(arg4, arg7, arg5, arg6, arg8, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Lgv;", line = 768)
    public static final class237 method2398(int arg0) {
        field5936++;
        if (arg0 < 90) {
            field5943 = null;
        }
        try {
            return new class323();
        } catch (Throwable var2) {
            try {
                return (class237) Class.forName("is").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class321();
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
    public abstract void method615(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lqb;II)V")
    public abstract void method598(class511 arg0, class518 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method605(int arg0);

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
    public abstract int method625();

    @OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
    public abstract int method647();

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
    public abstract int method612();

    @OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
    public abstract void method595(int arg0);

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
    public abstract void method601(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
    public abstract void method600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
    public abstract void method654(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()Z")
    public abstract boolean method644();

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(IILta;Lta;III)V")
    public abstract void method630(int arg0, int arg1, class337 arg2, class337 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method655(int arg0, int arg1, class511 arg2, boolean arg3);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lt;")
    public abstract class398 method610(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
    public abstract void method650(int arg0);

    @OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
    public abstract void method649(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
    public abstract void method603();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
    public abstract void method608(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
    public abstract void method620(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
    public abstract int method621();

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
    public abstract void method638(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
    public abstract int method639();

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
    public abstract void method602(int arg0);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
    public abstract int method613();

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
    public abstract void method607();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lt;IIIZ)V")
    public abstract void method604(class398 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
    public abstract int method626();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lng;")
    public abstract class165[] method606();

    @OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
    public abstract int method635();

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()[Ldh;")
    public abstract class254[] method616();

    @OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
    public abstract void method632(int arg0);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
    public abstract int method611();

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
    public abstract int method651();

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lba;)Lba;")
    public abstract class502 method623(class502 arg0);

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
    public abstract void method636(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lqb;I)V")
    public abstract void method640(class511 arg0, class518 arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
    public abstract boolean method641();

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
    public abstract void method657(int arg0);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
    public abstract void method624();
}
