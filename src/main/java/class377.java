import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class377 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lvl;")
    public static class11 field5337;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ll;")
    public static class16 field5348;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lok;")
    public static class171 field5340;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Luf;")
    public static class316 field5338;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Lmt;")
    public static final class276 method2196(boolean arg0, int arg1) {
        field5351++;
        if (!arg0) {
            return null;
        }
        class276[] var2 = class270.method1696((byte) -99);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field4104 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILmh;I)V")
    public final void method2197(int arg0, class454 arg1, int arg2) {
        field5343++;
        if (arg2 == -1 || !this.method1607()) {
            return;
        }
        class201 var4 = arg1.field6364[arg2];
        class119 var5 = var4.field2885;
        if (arg0 != 17752) {
            this.method1599(-26);
        }
        for (int var6 = 0; var6 < var4.field2886; var6++) {
            short var7 = var4.field2873[var6];
            if (var5.field1646[var7]) {
                if (var4.field2882[var6] != -1) {
                    this.method1591(0, 0, 0, 0);
                }
                this.method1591(var5.field1649[var7], var4.field2880[var6], var4.field2879[var6], var4.field2876[var6]);
            }
        }
        this.method1604();
    }

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method1612(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method1578(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method1607();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method1618(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class377 method1590(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)Z")
    public static final boolean method2198(int arg0, int arg1, int arg2) {
        field5350++;
        int var3 = -47 / ((arg1 + 8) / 34);
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method1586(int arg0, int arg1, class125 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method1583();

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method1600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method1610(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method1580(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method1592(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class31 method1614(class31 arg0);

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method1604();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method2199(byte arg0) {
        field5340 = null;
        int var1 = -63 / ((arg0 + 17) / 50);
        field5337 = null;
        field5338 = null;
        field5348 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lwp;I)V")
    public abstract void method1566(class125 arg0, class122 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method1597();

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method1605();

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method1617();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lsd;")
    public abstract class63[] method1579();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILmh;IIIZI[IIILmh;)V")
    public final void method2200(int arg0, class454 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7, int arg8, int arg9, class454 arg10) {
        if (arg6 != -23720) {
            this.method2200(121, null, -114, 24, 117, false, -8, null, 25, 125, null);
        }
        field5342++;
        if (arg8 == -1 || !this.method1607()) {
            return;
        }
        class201 var12 = arg10.field6364[arg8];
        class119 var13 = var12.field2885;
        class201 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field6364[arg2];
            if (var14.field2885 != var13) {
                var14 = null;
            }
        }
        this.method2201(arg7, arg4, var13, var12, false, arg0, arg3, arg5, null, var14, -92, arg9);
        this.method1604();
    }

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method1613();

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method1581(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IILgg;Lnb;ZIIZ[ZLnb;II)V")
    private final void method2201(int[] arg0, int arg1, class119 arg2, class201 arg3, boolean arg4, int arg5, int arg6, boolean arg7, boolean[] arg8, class201 arg9, int arg10, int arg11) {
        field5344++;
        if (arg9 == null || arg6 == 0) {
            for (int var39 = 0; var39 < arg3.field2886; var39++) {
                short var40 = arg3.field2873[var39];
                if (arg8 == null || arg4 == arg8[var40] || arg2.field1649[var40] == 0) {
                    short var41 = arg3.field2882[var39];
                    if (var41 != -1) {
                        this.method2206(0, arg7, arg0, 0, 0, 0, arg1, -11, arg2.field1647[var41], arg2.field1642[var41] & arg11);
                    }
                    this.method2206(arg3.field2879[var39], arg7, arg0, arg2.field1649[var40], arg3.field2880[var39], arg3.field2876[var39], arg1, 126, arg2.field1647[var40], arg2.field1642[var40] & arg11);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 97 % ((-arg10 - 48) / 37);
        for (int var16 = 0; var16 < arg2.field1641; var16++) {
            boolean var17 = false;
            if (arg3.field2886 > var13 && arg3.field2873[var13] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var14 < arg9.field2886 && arg9.field2873[var14] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg8 == null || arg4 == arg8[var16] || arg2.field1649[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg2.field1649[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var21 = arg3.field2880[var13];
                        var22 = arg3.field2887[var13];
                        var23 = arg3.field2879[var13];
                        var24 = arg3.field2882[var13];
                        var25 = arg3.field2876[var13];
                        var13++;
                    } else {
                        var22 = 0;
                        var21 = var19;
                        var23 = var19;
                        var24 = -1;
                        var25 = var19;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var28 = arg9.field2880[var14];
                        var29 = arg9.field2882[var14];
                        var30 = arg9.field2876[var14];
                        var27 = arg9.field2887[var14];
                        var26 = arg9.field2879[var14];
                        var14++;
                    } else {
                        var26 = var19;
                        var27 = 0;
                        var28 = var19;
                        var29 = -1;
                        var30 = var19;
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var35 = var21;
                        var34 = var23;
                        var36 = var25;
                    } else if (var20 == 2) {
                        int var31 = var28 - var21 & 0x3FFF;
                        int var32 = var26 - var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var33 = var30 - var25 & 0x3FFF;
                        var34 = arg6 * var32 / arg5 + var23 & 0x3FFF;
                        var35 = arg6 * var31 / arg5 + var21 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = var25 + (arg6 * var33 / arg5) & 0x3FFF;
                    } else if (var20 == 9) {
                        int var38 = var28 - var21 & 0x3FFF;
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var36 = 0;
                        var34 = 0;
                        var35 = arg6 * var38 / arg5 + var21 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var28 - var21 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = var21 + (arg6 * var37 / arg5) & 0x3F;
                        var34 = (var26 - var23) * arg6 / arg5 + var23;
                        var36 = (var30 - var25) * arg6 / arg5 + var25;
                    } else {
                        var34 = (var26 - var23) * arg6 / arg5 + var23;
                        var35 = (var28 - var21) * arg6 / arg5 + var21;
                        var36 = var25 + ((var30 - var25) * arg6 / arg5);
                    }
                    if (var24 != -1) {
                        this.method2206(0, arg7, arg0, 0, 0, 0, arg1, -76, arg2.field1647[var24], arg11 & arg2.field1642[var24]);
                    } else if (var29 != -1) {
                        this.method2206(0, arg7, arg0, 0, 0, 0, arg1, 3, arg2.field1647[var29], arg2.field1642[var29] & arg11);
                    }
                    this.method2206(var34, arg7, arg0, var20, var35, var36, arg1, 126, arg2.field1647[var16], arg2.field1642[var16] & arg11);
                } else {
                    if (var17) {
                        var13++;
                    }
                    if (var18) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
    public abstract void method1587();

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method1596();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILmh;II[ZLmh;ILmh;IIIIILmh;)V")
    public final void method2202(boolean arg0, int arg1, class454 arg2, int arg3, int arg4, boolean[] arg5, class454 arg6, int arg7, class454 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class454 arg14) {
        field5339++;
        if (arg1 == -1) {
            return;
        }
        if (arg5 == null || arg10 == -1) {
            this.method2205((byte) -84, arg1, arg11, arg6, 0, arg4, arg3, arg0, arg14);
        } else if (this.method1607()) {
            class201 var16 = arg14.field6364[arg1];
            class119 var17 = var16.field2885;
            class201 var18 = null;
            if (arg6 != null) {
                var18 = arg6.field6364[arg11];
                if (var18.field2885 != var17) {
                    var18 = null;
                }
            }
            if (arg7 != -1) {
                this.method1562(null, 9, -7, 103, false);
            }
            this.method2201(null, 0, var17, var16, false, arg3, arg4, arg0, arg5, var18, -128, 65535);
            class201 var19 = arg2.field6364[arg10];
            class201 var20 = null;
            if (arg8 != null) {
                var20 = arg8.field6364[arg13];
                if (var20.field2885 != var17) {
                    var20 = null;
                }
            }
            this.method1600(0, new int[0], 0, 0, 0, 0, arg0);
            this.method2201(null, 0, var19.field2885, var19, true, arg12, arg9, arg0, arg5, var20, -89, 65535);
            this.method1604();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILya;II)V")
    public final void method2203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7, int arg8) {
        field5349++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg6.method11(arg7 + var13, arg4 - -var14);
        int var16 = arg0 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg6.method11(arg7 + var16, arg4 + var17);
        if (arg2 > -63) {
            field5340 = null;
        }
        int var19 = -arg0 / 2;
        int var20 = arg1 / 2;
        int var21 = arg6.method11(arg7 + var19, arg4 - -var20);
        int var22 = arg0 / 2;
        int var23 = arg1 / 2;
        int var24 = arg6.method11(arg7 + var22, arg4 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg5 < var29) {
                        var29 = arg5;
                    }
                }
                this.method1599(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg0 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg3 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg3;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (var32 > arg3) {
                        var32 = arg3;
                    }
                }
                this.method1594(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method1580(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
    public abstract boolean method1619();

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method1568();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lck;")
    public abstract class462[] method1593();

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1616(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method1562(class377 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjg;)V")
    public static final void method2204(boolean arg0, class228 arg1) {
        if (arg0) {
            return;
        }
        if ((arg1 instanceof class429)) {
            class429 var3 = (class429) arg1;
            if (var3.field6055 != null) {
                class189.method1208(false, class246.field3587.field1904 != var3.field1904, var3);
            }
        } else if (arg1 instanceof class22) {
            class22 var2 = (class22) arg1;
            class535.method3149(var2, class246.field3587.field1904 != var2.field1904, (byte) -41);
        }
        field5346++;
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method1584();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method1582(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method1576();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method1594(int arg0);

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method1573();

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method1595(int arg0);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method1570(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method1585();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIILmh;IIIZLmh;)V")
    public final void method2205(byte arg0, int arg1, int arg2, class454 arg3, int arg4, int arg5, int arg6, boolean arg7, class454 arg8) {
        if (arg0 > -65) {
            return;
        }
        field5345++;
        if (arg1 == -1 || !this.method1607()) {
            return;
        }
        class201 var10 = arg8.field6364[arg1];
        class119 var11 = var10.field2885;
        class201 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field6364[arg2];
            if (var12.field2885 != var11) {
                var12 = null;
            }
        }
        this.method2201(null, arg4, var11, var10, false, arg6, arg5, arg7, null, var12, -87, 65535);
        this.method1604();
    }

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method1591(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lwp;II)V")
    public abstract void method1598(class125 arg0, class122 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method1599(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ[IIIIII[II)V")
    private final void method2206(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg6 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = -arg4;
                arg4 = arg5;
                arg5 = var16;
            } else if (arg3 == 3) {
                int var15 = arg4;
                arg4 = arg5;
                arg5 = var15;
            } else if (arg3 == 2) {
                int var14 = arg4;
                arg4 = -arg5 & 0x3FFF;
                arg5 = var14 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg5 = -arg5;
                arg4 = -arg4;
            } else if (arg3 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = arg4;
                arg4 = -arg5;
                arg5 = var13;
            } else if (arg3 == 3) {
                int var11 = arg4;
                arg4 = arg5;
                arg5 = var11;
            } else if (arg3 == 2) {
                int var12 = arg4;
                arg4 = arg5 & 0x3FFF;
                arg5 = -var12 & 0x3FFF;
            }
        }
        field5341++;
        if (arg9 == 65535) {
            this.method1600(arg3, arg8, arg4, arg0, arg5, arg6, arg1);
        } else {
            this.method1616(arg3, arg8, arg4, arg0, arg5, arg1, arg9, arg2);
        }
        int var17 = -38 % ((64 - arg7) / 60);
    }

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method1606(int arg0);

    static {
        new class530("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }
}
