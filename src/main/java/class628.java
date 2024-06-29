import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class628 extends class333 {

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "[I")
    public int[] field8850 = new int[1];

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[I")
    public int[] field8858 = new int[] { -1 };

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field8857 = -1;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Ltaa;")
    public static class296 field8859;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sm", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field8861;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3532(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 4)
    public static void method3525(byte arg0) {
        if (arg0 == -33) {
            field8859 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Llb;IIIIZLea;IILr;)Lda;", line = 21)
    public final class473 method3526(class257 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class158 arg6, int arg7, int arg8, class564 arg9) {
        field8852++;
        class473 var11 = null;
        int var12 = arg1;
        class543 var13 = null;
        if (arg4 != -1) {
            var13 = class400.field5381.method2168(arg4, 24449);
        }
        int[] var14 = this.field8858;
        if (var13 != null && var13.field7648 != null) {
            var14 = new int[var13.field7648.length];
            for (int var15 = 0; var15 < var13.field7648.length; var15++) {
                int var16 = var13.field7648[var15];
                if (var16 >= 0 && this.field8858.length > var16) {
                    var14[var15] = this.field8858[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class479 var24 = null;
        class479 var25 = null;
        if (arg0 != null) {
            var12 = arg1 | 0x20;
            int var26 = arg0.field3218[arg3];
            int var27 = var26 >>> 16;
            var24 = class265.field3301.method3042(var27, (byte) -21);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2756(var21, (byte) -117);
                var17 |= var24.method2758(var21, 7527);
                var20 |= var24.method2755(-108, var21);
                var19 |= arg0.field3219;
            }
            if ((arg0.field3221 || class510.field7317) && arg2 != -1 && arg0.field3218.length > arg2) {
                var23 = arg0.field3235[arg3];
                int var28 = arg0.field3218[arg2];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class265.field3301.method3042(var22 >>> 16, (byte) -21);
                }
                if (var25 != null) {
                    var18 |= var25.method2756(var22, (byte) -58);
                    var17 |= var25.method2758(var22, 7527);
                    var20 |= var25.method2755(-104, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method3528(var14, arg5, 255, arg4, arg6 == null ? null : arg6.field1781);
        if (class680.field9579 != null) {
            var11 = (class473) class680.field9579.method78(0, var30);
        }
        if (arg8 > -59) {
            return null;
        }
        if (var11 == null || arg9.method973(var11.method1861(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method1004(var12, var11.method1861());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class19.field153.method272(var14[var34], -11824).method2825(arg5, (byte) 17)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class581[] var35 = new class581[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class19.field153.method272(var14[var36], -11824).method2814(arg5, (byte) -123);
                }
            }
            if (var13 != null && var13.field7667 != null) {
                for (int var37 = 0; var37 < var13.field7667.length; var37++) {
                    if (var13.field7667[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7667[var37][0];
                        int var39 = var13.field7667[var37][1];
                        int var40 = var13.field7667[var37][2];
                        int var41 = var13.field7667[var37][3];
                        int var42 = var13.field7667[var37][4];
                        int var43 = var13.field7667[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3290(var43, 2, var41, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3287(var39, var38, -20, var40);
                        }
                    }
                }
            }
            class581 var44 = new class581(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg9.method1051(var44, var32, class677.field9496, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class557.field7952.length; var46++) {
                        if (class557.field7952[var46][var45].length > arg6.field1781[var45]) {
                            var11.method1882(class90.field899[var46][var45], class557.field7952[var46][var45][arg6.field1781[var45]]);
                        }
                    }
                }
            }
            if (class680.field9579 != null) {
                var11.method1907(var12);
                class680.field9579.method92(1, var30, var11);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class473 var47 = var11.method1877((byte) 1, var12, true);
            var47.method2725(var21, arg0.field3219, var25, -3646, var24, 0, var22, arg7 - 1, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V", line = 265)
    public static final void method3527(boolean arg0, int arg1) {
        if (arg1 != 1182293784) {
            return;
        }
        for (class273 var2 = (class273) class139.field1529.method3434((byte) 2); var2 != null; var2 = (class273) class139.field1529.method3430(true)) {
            if (var2.field3406 != null) {
                class209.field2471.method3885(var2.field3406);
                var2.field3406 = null;
            }
            if (var2.field3405 != null) {
                class209.field2471.method3885(var2.field3405);
                var2.field3405 = null;
            }
            var2.method1922(81);
        }
        field8851++;
        if (!arg0) {
            return;
        }
        for (class273 var3 = (class273) class689.field9697.method3434((byte) 2); var3 != null; var3 = (class273) class689.field9697.method3430(true)) {
            if (var3.field3406 != null) {
                class209.field2471.method3885(var3.field3406);
                var3.field3406 = null;
            }
            var3.method1922(103);
        }
        for (class273 var4 = (class273) class79.field800.method3674(1); var4 != null; var4 = (class273) class79.field800.method3672(-1)) {
            if (var4.field3406 != null) {
                class209.field2471.method3885(var4.field3406);
                var4.field3406 = null;
            }
            var4.method1922(81);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([IZII[I)J", line = 339)
    private final long method3528(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field8856++;
        long[] var6 = class85.field861;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((long) arg2 & (var11 ^ (long) (arg1 ? 1 : 0)))] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IC)Z", line = 380)
    public static final boolean method3529(int arg0, char arg1) {
        if (arg0 >= -107) {
            field8859 = null;
        }
        field8860++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class103.method563(120, arg1)) {
            return true;
        } else {
            char[] var2 = class36.field375;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class113.field1199;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIILr;I)V", line = 423)
    public static final void method3530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class564 arg7, int arg8) {
        field8855++;
        class49 var9 = (class49) class578.method3272(arg1, arg2, arg3);
        if (var9 != null) {
            class638 var10 = class364.field4891.method2134(var9.method238(arg6 + 6390), true);
            int var11 = var9.method237(false) & 0x3;
            int var12 = var9.method241((byte) 29);
            if (var10.field9039 == -1) {
                int var13 = arg0;
                if (var10.field9035 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3202(1, arg8, var13, arg5, 4);
                    } else if (var11 == 1) {
                        arg7.method3207(arg5, arg8, 4, var13, false);
                    } else if (var11 == 2) {
                        arg7.method3202(arg6 - 127, arg8, var13, arg5 + 3, 4);
                    } else if (var11 == 3) {
                        arg7.method3207(arg5, arg8 + 3, 4, var13, false);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method3206(1, (byte) 84, arg5, arg8, var13, 1);
                    } else if (var11 == 1) {
                        arg7.method3206(1, (byte) 83, arg5 + 3, arg8, var13, 1);
                    } else if (var11 == 2) {
                        arg7.method3206(1, (byte) 81, arg5 + 3, arg8 + 3, var13, 1);
                    } else if (var11 == 3) {
                        arg7.method3206(1, (byte) 125, arg5, arg8 + 3, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3207(arg5, arg8, 4, var13, false);
                    } else if (var11 == 1) {
                        arg7.method3202(1, arg8, var13, arg5 + 3, 4);
                    } else if (var11 == 2) {
                        arg7.method3207(arg5, arg8 + 3, 4, var13, false);
                    } else if (var11 == 3) {
                        arg7.method3202(1, arg8, var13, arg5, 4);
                    }
                }
            } else {
                class699.method3844(arg7, var11, var10, arg5, arg8, 0);
            }
        }
        if (arg6 != 128) {
            method3525((byte) 36);
        }
        class49 var14 = (class49) class362.method2121(arg1, arg2, arg3, field8861 == null ? (field8861 = method3532("gda")) : field8861);
        if (var14 != null) {
            class638 var15 = class364.field4891.method2134(var14.method238(6518), true);
            int var16 = var14.method237(false) & 0x3;
            int var17 = var14.method241((byte) 29);
            if (var15.field9039 != -1) {
                class699.method3844(arg7, var16, var15, arg5, arg8, arg6 ^ 0x80);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field9035 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method3204((byte) -55, arg5 + 3, arg8 - -3, var18, arg5, arg8);
                } else {
                    arg7.method3204((byte) -55, arg5 + 3, arg8, var18, arg5, arg8 + 3);
                }
            }
        }
        class49 var19 = (class49) class328.method1845(arg1, arg2, arg3);
        if (var19 == null) {
            return;
        }
        class638 var20 = class364.field4891.method2134(var19.method238(6518), true);
        int var21 = var19.method237(false) & 0x3;
        if (var20.field9039 != -1) {
            class699.method3844(arg7, var21, var20, arg5, arg8, arg6 - 128);
            return;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lfa;ILjava/awt/Canvas;)Lr;", line = 560)
    public static final class564 method3531(class524 arg0, int arg1, Canvas arg2) {
        field8854++;
        return arg1 == 1 ? new class468(arg2, arg0) : null;
    }
}
