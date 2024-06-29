import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class55 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Z")
    public boolean field625 = false;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "J")
    public static long field624 = 0L;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public static int[] field620 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lsea;")
    public static class648 field627;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class54 method414(class54 arg0);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method415();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method416(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static final void method417(boolean arg0) {
        field617++;
        class353.field4698.method46((byte) 124);
        class214.field2991.method1489(2);
        class647.field8937.method1518(0);
        class611.field8473.setBackground(Color.black);
        class338.field4538 = -1;
        class353.field4698 = class11.method51((byte) 31, class611.field8473);
        class214.field2991 = class465.method2625((byte) -95, arg0, class611.field8473);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method418(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method419(int arg0, int arg1, class392 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method420();

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method421(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method422();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method423(int arg0);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method424();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method425(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method427();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLut;ZIIILut;II)V")
    public final void method428(byte arg0, class109 arg1, boolean arg2, int arg3, int arg4, int arg5, class109 arg6, int arg7, int arg8) {
        if (arg0 > -34) {
            return;
        }
        field628++;
        if (arg5 == -1) {
            return;
        }
        this.method427();
        if (!this.method434()) {
            this.method436();
            return;
        }
        class179 var10 = arg6.field1510[arg5];
        class44 var11 = var10.field2590;
        class179 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field1510[arg4];
            if (var12.field2590 != var11) {
                var12 = null;
            }
        }
        this.method433(false, var11, arg7, 90, arg3, arg2, arg8, var12, null, var10, null, 65535);
        this.method437();
        this.method436();
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Llp;")
    public abstract class357[] method429();

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method430();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([II[IIIIIZII)V")
    private final void method431(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg6 >= -6) {
            field624 = 127L;
        }
        if (arg5 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg8;
                arg8 = arg3;
                arg3 = var16;
            } else if (arg1 == 3) {
                int var14 = arg8;
                arg8 = arg3;
                arg3 = var14;
            } else if (arg1 == 2) {
                int var15 = arg8;
                arg8 = -arg3 & 0x3FFF;
                arg3 = var15 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg3 = -arg3;
                arg8 = -arg8;
            } else if (arg1 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg8;
                arg8 = -arg3;
                arg3 = var13;
            } else if (arg1 == 3) {
                int var11 = arg8;
                arg8 = arg3;
                arg3 = var11;
            } else if (arg1 == 2) {
                int var12 = arg8;
                arg8 = arg3 & 0x3FFF;
                arg3 = -var12 & 0x3FFF;
            }
        }
        field618++;
        if (arg9 == 65535) {
            this.method418(arg1, arg0, arg8, arg4, arg3, arg5, arg7);
        } else {
            this.method421(arg1, arg0, arg8, arg4, arg3, arg7, arg9, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public abstract void method432();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLkaa;IIIZILvb;[ILvb;[ZI)V")
    private final void method433(boolean arg0, class44 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class179 arg7, int[] arg8, class179 arg9, boolean[] arg10, int arg11) {
        if (arg3 <= 60) {
            field620 = null;
        }
        field619++;
        if (arg7 == null || arg4 == 0) {
            for (int var38 = 0; var38 < arg9.field2594; var38++) {
                short var39 = arg9.field2588[var38];
                if (arg10 == null || arg10[var39] == arg0 || arg1.field530[var39] == 0) {
                    short var40 = arg9.field2587[var38];
                    if (var40 != -1) {
                        this.method431(arg1.field533[var40], 0, arg8, 0, 0, arg2, -108, arg5, 0, arg11 & arg1.field528[var40]);
                    }
                    this.method431(arg1.field533[var39], arg1.field530[var39], arg8, arg9.field2592[var38], arg9.field2595[var38], arg2, -23, arg5, arg9.field2593[var38], arg11 & arg1.field528[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg1.field531; var15++) {
            boolean var16 = false;
            if (var13 < arg9.field2594 && arg9.field2588[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field2594 && arg7.field2588[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg0 == arg10[var15] || arg1.field530[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field530[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg9.field2587[var13];
                        var21 = arg9.field2593[var13];
                        var22 = arg9.field2592[var13];
                        var23 = arg9.field2595[var13];
                        var24 = arg9.field2597[var13];
                        var13++;
                    } else {
                        var24 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = var18;
                        var20 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var26 = arg7.field2593[var14];
                        var25 = arg7.field2587[var14];
                        var27 = arg7.field2597[var14];
                        var28 = arg7.field2592[var14];
                        var29 = arg7.field2595[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = var18;
                        var27 = 0;
                        var28 = var18;
                        var29 = var18;
                    }
                    if (var20 != -1) {
                        this.method431(arg1.field533[var20], 0, arg8, 0, 0, arg2, -44, arg5, 0, arg11 & arg1.field528[var20]);
                    } else if (var25 != -1) {
                        this.method431(arg1.field533[var25], 0, arg8, 0, 0, arg2, -107, arg5, 0, arg11 & arg1.field528[var25]);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var23;
                        var31 = var21;
                        var32 = var22;
                    } else if (var19 == 2) {
                        int var35 = var26 - var21 & 0x3FFF;
                        int var36 = var29 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var28 - var22 & 0x3FFF;
                        var31 = arg4 * var35 / arg6 + var21 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = var23 + (arg4 * var36 / arg6) & 0x3FFF;
                        var32 = arg4 * var37 / arg6 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var26 - var21 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var32 = 0;
                        var33 = 0;
                        var31 = arg4 * var34 / arg6 + var21 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var30 = var26 - var21 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = arg4 * var30 / arg6 + var21 & 0x3F;
                        var32 = var22 + ((var28 - var22) * arg4 / arg6);
                        var33 = (var29 - var23) * arg4 / arg6 + var23;
                    } else {
                        var33 = var23 + ((var29 - var23) * arg4 / arg6);
                        var31 = (var26 - var21) * arg4 / arg6 + var21;
                        var32 = (var28 - var22) * arg4 / arg6 + var22;
                    }
                    this.method431(arg1.field533[var15], var19, arg8, var32, var33, arg2, -77, arg5, var31, arg11 & arg1.field528[var15]);
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

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method434();

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method435(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public abstract void method436();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method437();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method438();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method439(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIBIILut;[IILut;)V")
    public final void method440(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class109 arg7, int[] arg8, int arg9, class109 arg10) {
        field622++;
        if (arg9 == -1) {
            return;
        }
        this.method427();
        if (!this.method434()) {
            this.method436();
            return;
        }
        class179 var12 = arg10.field1510[arg9];
        class44 var13 = var12.field2590;
        if (arg4 != -61) {
            this.method451();
        }
        class179 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field1510[arg1];
            if (var14.field2590 != var13) {
                var14 = null;
            }
        }
        this.method433(false, var13, arg2, 87, arg5, arg0, arg6, var14, arg8, var12, null, arg3);
        this.method437();
        this.method436();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIBLi;)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, class37 arg8) {
        field626++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg1 / 2;
        if (arg7 != -79) {
            this.method437();
        }
        int var15 = arg8.method331(arg3 + var14, (byte) 50, arg0 + var13);
        int var16 = arg5 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg8.method331(arg3 + var17, (byte) 50, arg0 + var16);
        int var19 = -arg5 / 2;
        int var20 = arg1 / 2;
        int var21 = arg8.method331(arg3 + var20, (byte) 50, arg0 + var19);
        int var22 = arg5 / 2;
        int var23 = arg1 / 2;
        int var24 = arg8.method331(arg3 + var23, (byte) 50, arg0 + var22);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg2 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg2;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg2 < var29) {
                        var29 = arg2;
                    }
                }
                this.method416(var29);
            }
        }
        if (arg5 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg6 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg6;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (arg6 < var31) {
                        var31 = arg6;
                    }
                }
                this.method445(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg4;
        if (var34 != 0) {
            this.method446(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method442();

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method443(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method444(int arg0);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method445(int arg0);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method446(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method448(int arg0, int arg1, class392 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;IZ)V")
    public abstract void method449(class392 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method450();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lns;")
    public abstract class369[] method451();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method452(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Let;II)V")
    public abstract void method453(class392 arg0, class551 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method454();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method455(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLut;[ZILut;Lut;ILut;IIIIBI)V")
    public final void method456(int arg0, boolean arg1, class109 arg2, boolean[] arg3, int arg4, class109 arg5, class109 arg6, int arg7, class109 arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, int arg14) {
        field623++;
        if (arg12 == -1) {
            return;
        }
        if (arg3 == null || arg10 == -1) {
            this.method428((byte) -52, arg2, arg1, arg7, arg9, arg12, arg5, 0, arg11);
            return;
        }
        this.method427();
        if (!this.method434()) {
            this.method436();
            return;
        }
        class179 var16 = arg5.field1510[arg12];
        class44 var17 = var16.field2590;
        class179 var18 = null;
        if (arg2 != null) {
            var18 = arg2.field1510[arg9];
            if (var18.field2590 != var17) {
                var18 = null;
            }
        }
        this.method433(false, var17, 0, 117, arg7, arg1, arg11, var18, null, var16, arg3, 65535);
        class179 var19 = arg6.field1510[arg10];
        class179 var20 = null;
        if (arg13 >= -69) {
            return;
        }
        if (arg8 != null) {
            var20 = arg8.field1510[arg14];
            if (var20.field2590 != var17) {
                var20 = null;
            }
        }
        this.method418(0, new int[0], 0, 0, 0, 0, arg1);
        this.method433(true, var19.field2590, 0, 116, arg4, arg1, arg0, var20, null, var19, arg3, 65535);
        this.method437();
        this.method436();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public static final int method457(int arg0, int arg1) {
        field629++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 != 24266) {
            field624 = -11L;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method458(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
    public abstract boolean method459();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method460(class392 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLut;I)V")
    public final void method461(boolean arg0, class109 arg1, int arg2) {
        field621++;
        if (arg2 == -1) {
            return;
        }
        this.method427();
        if (!this.method434()) {
            this.method436();
            return;
        }
        class179 var4 = arg1.field1510[arg2];
        class44 var5 = var4.field2590;
        for (int var6 = 0; var6 < var4.field2594; var6++) {
            short var7 = var4.field2588[var6];
            if (var5.field535[var7]) {
                if (var4.field2587[var6] != -1) {
                    this.method447(0, 0, 0, 0);
                }
                this.method447(var5.field530[var7], var4.field2593[var6], var4.field2595[var6], var4.field2592[var6]);
            }
        }
        if (!arg0) {
            this.method437();
            this.method436();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class55 method462(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method463();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method464();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Let;I)V")
    public abstract void method465(class392 arg0, class551 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method466();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method467(class55 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        field620 = null;
        field627 = null;
        if (arg0 != -9108) {
            method417(true);
        }
    }
}
