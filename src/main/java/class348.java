import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class348 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    public static int[] field5350 = new int[32];

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field5355 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public static boolean field5345;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5350[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 7)
    public static void method2264(int arg0) {
        field5350 = null;
        if (arg0 != -1) {
            method2266(10, 120);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ldr;IILhi;[ZB[IIZIZLhi;)V", line = 17)
    private final void method2265(class426 arg0, int arg1, int arg2, class113 arg3, boolean[] arg4, byte arg5, int[] arg6, int arg7, boolean arg8, int arg9, boolean arg10, class113 arg11) {
        field5351++;
        if (arg11 == null || arg9 == 0) {
            for (int var37 = 0; var37 < arg3.field1562; var37++) {
                short var38 = arg3.field1565[var37];
                if (arg4 == null || arg8 == arg4[var38] || arg0.field6278[var38] == 0) {
                    short var39 = arg3.field1569[var37];
                    if (var39 != -1) {
                        this.method2269(0, arg6, arg0.field6285[var39], -2, 0, arg7 & arg0.field6277[var39], arg1, 0, 0, arg10);
                    }
                    this.method2269(arg0.field6278[var38], arg6, arg0.field6285[var38], -2, arg3.field1570[var37], arg0.field6277[var38] & arg7, arg1, arg3.field1567[var37], arg3.field1561[var37], arg10);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg5 != -82) {
            return;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field6280; var15++) {
            boolean var16 = false;
            if (arg3.field1562 > var13 && arg3.field1565[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field1562 && arg11.field1565[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg4[var15] == arg8 || arg0.field6278[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field6278[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var21 = arg3.field1570[var13];
                        var22 = arg3.field1569[var13];
                        var20 = arg3.field1561[var13];
                        var23 = arg3.field1567[var13];
                        var24 = arg3.field1558[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = -1;
                        var23 = var18;
                        var24 = 0;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg11.field1570[var14];
                        var29 = arg11.field1567[var14];
                        var26 = arg11.field1569[var14];
                        var27 = arg11.field1561[var14];
                        var28 = arg11.field1558[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = -1;
                        var27 = var18;
                        var28 = 0;
                        var29 = var18;
                    }
                    if (var22 != -1) {
                        this.method2269(0, arg6, arg0.field6285[var22], -2, 0, arg0.field6277[var22] & arg7, arg1, 0, 0, arg10);
                    } else if (var26 != -1) {
                        this.method2269(0, arg6, arg0.field6285[var26], arg5 + 80, 0, arg0.field6277[var26] & arg7, arg1, 0, 0, arg10);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var33 = var21;
                        var35 = var23;
                        var34 = var20;
                    } else if (var19 == 2) {
                        int var30 = var27 - var20 & 0x3FFF;
                        int var31 = var25 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var29 - var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg9 * var31 / arg2 + var21 & 0x3FFF;
                        var34 = arg9 * var30 / arg2 + var20 & 0x3FFF;
                        var35 = var23 + (arg9 * var32 / arg2) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var27 - var20 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = (var25 - var21) * arg9 / arg2 + var21;
                        var35 = (var29 - var23) * arg9 / arg2 + var23;
                        var34 = arg9 * var36 / arg2 + var20 & 0x3F;
                    } else {
                        var34 = (var27 - var20) * arg9 / arg2 + var20;
                        var33 = var21 + ((var25 - var21) * arg9 / arg2);
                        var35 = (var29 - var23) * arg9 / arg2 + var23;
                    }
                    this.method2269(var19, arg6, arg0.field6285[var15], arg5 + 80, var33, arg7 & arg0.field6277[var15], arg1, var35, var34, arg10);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 218)
    public static final void method2266(int arg0, int arg1) {
        field5349++;
        class52 var2 = class329.field5155;
        synchronized (class329.field5155) {
            class329.field5155.method337(arg0, (byte) -114);
            if (arg1 < 76) {
                field5350 = null;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILom;I)V", line = 233)
    public final void method2267(int arg0, class209 arg1, int arg2) {
        field5353++;
        if (arg2 == -1 || arg0 > -91 || !this.method60()) {
            return;
        }
        class113 var4 = arg1.field3355[arg2];
        class426 var5 = var4.field1572;
        for (int var6 = 0; var6 < var4.field1562; var6++) {
            short var7 = var4.field1565[var6];
            if (var5.field6287[var7]) {
                if (var4.field1569[var6] != -1) {
                    this.method34(0, 0, 0, 0);
                }
                this.method34(var5.field6278[var7], var4.field1561[var6], var4.field1570[var6], var4.field1567[var6]);
            }
        }
        this.method53();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;", line = 281)
    public static final String method2268(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field5359++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = arg0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[I[IIIIIIIZ)V", line = 361)
    private final void method2269(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg6 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg8;
                arg8 = arg7;
                arg7 = var16;
            } else if (arg0 == 3) {
                int var15 = arg8;
                arg8 = arg7;
                arg7 = var15;
            } else if (arg0 == 2) {
                int var14 = arg8;
                arg8 = -arg7 & 0x3FFF;
                arg7 = var14 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg7 = -arg7;
                arg8 = -arg8;
            } else if (arg0 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg8;
                arg8 = -arg7;
                arg7 = var13;
            } else if (arg0 == 3) {
                int var11 = arg8;
                arg8 = arg7;
                arg7 = var11;
            } else if (arg0 == 2) {
                int var12 = arg8;
                arg8 = arg7 & 0x3FFF;
                arg7 = -var12 & 0x3FFF;
            }
        }
        field5344++;
        if (arg5 == 65535) {
            this.method25(arg0, arg2, arg8, arg4, arg7, arg6, arg9);
        } else {
            this.method62(arg0, arg2, arg8, arg4, arg7, arg9, arg5, arg1);
        }
        if (arg3 != -2) {
            field5345 = false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Z", line = 470)
    public static final boolean method2270(boolean arg0, int arg1) {
        field5347++;
        if (arg1 != -61) {
            method2264(40);
        }
        boolean var2 = class284.field4547.method657();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class284.field4547.method590();
        } else if (!class284.field4547.method648()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class99.field1381 = arg0;
            class306.method2062((byte) 107, class63.field822);
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III[IIILom;ZLom;II)V", line = 520)
    public final void method2271(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, class209 arg6, boolean arg7, class209 arg8, int arg9, int arg10) {
        field5357++;
        if (~arg2 == arg1 || !this.method60()) {
            return;
        }
        class113 var12 = arg8.field3355[arg2];
        class426 var13 = var12.field1572;
        class113 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field3355[arg9];
            if (var14.field1572 != var13) {
                var14 = null;
            }
        }
        this.method2265(var13, arg5, arg0, var12, (boolean[]) null, (byte) -82, arg3, arg4, false, arg10, arg7, var14);
        this.method53();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 554)
    public static final String method2272(String arg0, boolean arg1) {
        field5356++;
        int var2 = arg0.length();
        int var3 = 0;
        if (!arg1) {
            field5345 = false;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Llf;IIIIII)V", line = 609)
    public final void method2273(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5352++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        if (arg3 != -2) {
            return;
        }
        int var11 = -arg6 / 2;
        int var12 = -arg5 / 2;
        int var13 = arg0.method771(arg2 + var11, arg4 + var12);
        int var14 = arg6 / 2;
        int var15 = -arg5 / 2;
        int var16 = arg0.method771(arg2 + var14, arg4 - -var15);
        int var17 = -arg6 / 2;
        int var18 = arg5 / 2;
        int var19 = arg0.method771(arg2 + var17, arg4 + var18);
        int var20 = arg6 / 2;
        int var21 = arg5 / 2;
        int var22 = arg0.method771(arg2 + var20, arg4 + var21);
        int var23 = var16 <= var13 ? var16 : var13;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var16 < var22 ? var16 : var22;
        int var26 = var19 <= var13 ? var19 : var13;
        if (arg5 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method42(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg6 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method18(var29);
            }
        }
        if (var28 > (var16 + var19)) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg1;
        if (var30 != 0) {
            this.method51(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILom;IZLom;BIII)V", line = 696)
    public final void method2274(int arg0, class209 arg1, int arg2, boolean arg3, class209 arg4, byte arg5, int arg6, int arg7, int arg8) {
        field5346++;
        if (arg6 == -1 || !this.method60()) {
            return;
        }
        class113 var10 = arg1.field3355[arg6];
        class426 var11 = var10.field1572;
        class113 var12 = null;
        if (arg5 >= -85) {
            return;
        }
        if (arg4 != null) {
            var12 = arg4.field3355[arg7];
            if (var12.field1572 != var11) {
                var12 = null;
            }
        }
        this.method2265(var11, arg0, arg2, var10, (boolean[]) null, (byte) -82, (int[]) null, 65535, false, arg8, arg3, var12);
        this.method53();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIILom;Lom;Lom;Lom;[ZIIIII)V", line = 734)
    public final void method2275(boolean arg0, int arg1, int arg2, int arg3, int arg4, class209 arg5, class209 arg6, class209 arg7, class209 arg8, boolean[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field5348++;
        if (arg10 == -1) {
            return;
        }
        if (arg9 == null || arg2 == -1) {
            this.method2274(0, arg7, arg12, arg0, arg5, (byte) -105, arg10, arg1, arg11);
        } else if (this.method60()) {
            class113 var16 = arg7.field3355[arg10];
            class426 var17 = var16.field1572;
            class113 var18 = null;
            int var19 = 98 / ((-arg4 - 23) / 42);
            if (arg5 != null) {
                var18 = arg5.field3355[arg1];
                if (var18.field1572 != var17) {
                    var18 = null;
                }
            }
            class113 var20 = arg6.field3355[arg2];
            class113 var21 = null;
            if (arg8 != null) {
                var21 = arg8.field3355[arg3];
                if (var21.field1572 != var17) {
                    var21 = null;
                }
            }
            this.method2265(var17, 0, arg12, var16, arg9, (byte) -82, (int[]) null, 65535, false, arg11, arg0, var18);
            this.method25(0, new int[0], 0, 0, 0, 0, arg0);
            this.method2265(var17, 0, arg13, var20, arg9, (byte) -82, (int[]) null, 65535, true, arg14, arg0, var21);
            this.method53();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()[Ljc;")
    public abstract class252[] method43();

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()I")
    public abstract int method56();

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
    public abstract int method57();

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public abstract void method9(int arg0);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()Z")
    public abstract boolean method60();

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()[Lkh;")
    public abstract class11[] method7();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public abstract void method51(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public abstract void method14(int arg0);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "()I")
    public abstract int method28();

    @OriginalMember(owner = "client!id", name = "g", descriptor = "()I")
    public abstract int method54();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BIZ)Lid;")
    public abstract class348 method15(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpg;Lcd;I)V")
    public abstract void method26(class435 arg0, class170 arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "()I")
    public abstract int method29();

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpg;Lcd;II)V")
    public abstract void method49(class435 arg0, class170 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method62(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
    public abstract void method12(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Las;)Las;")
    public abstract class84 method27(class84 arg0);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "()V")
    public abstract void method40();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
    public abstract void method34(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!id", name = "k", descriptor = "()I")
    public abstract int method13();

    @OriginalMember(owner = "client!id", name = "l", descriptor = "()V")
    public abstract void method17();

    @OriginalMember(owner = "client!id", name = "m", descriptor = "()I")
    public abstract int method44();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method25(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!id", name = "n", descriptor = "()I")
    public abstract int method11();

    @OriginalMember(owner = "client!id", name = "o", descriptor = "()V")
    public abstract void method53();

    @OriginalMember(owner = "client!id", name = "p", descriptor = "()I")
    public abstract int method46();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;IIIZ)V")
    public abstract void method20(class348 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public abstract void method42(int arg0);

    @OriginalMember(owner = "client!id", name = "q", descriptor = "()Z")
    public abstract boolean method59();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(SS)V")
    public abstract void method38(short arg0, short arg1);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
    public abstract void method23(int arg0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILpg;Z)Z")
    public abstract boolean method39(int arg0, int arg1, class435 arg2, boolean arg3);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(SS)V")
    public abstract void method35(short arg0, short arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILlf;Llf;III)V")
    public abstract void method47(int arg0, int arg1, class129 arg2, class129 arg3, int arg4, int arg5, int arg6);
}
