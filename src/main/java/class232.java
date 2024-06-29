import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class232 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lfn;")
    public static class52 field3269 = new class52(96, 20);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[Z")
    public static boolean[] field3273 = new boolean[8];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
    public static boolean field3276 = false;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
    public static int[] field3275 = new int[4];

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Ltm;")
    public static class112 field3278 = new class112("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public abstract void method22();

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public abstract int method52();

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
    public abstract int method57();

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()I")
    public abstract int method66();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method72(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(SS)V")
    public abstract void method24(short arg0, short arg1);

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()[Lta;")
    public abstract class309[] method25();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public abstract void method54(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldr;Lbm;I)V")
    public abstract void method41(class250 arg0, class219 arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILdr;Z)Z")
    public abstract boolean method75(int arg0, int arg1, class250 arg2, boolean arg3);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lmr;)Lmr;")
    public abstract class173 method42(class173 arg0);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()I")
    public abstract int method37();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILem;[ILih;ILem;I[ZIZZ)V")
    private final void method1454(int arg0, int arg1, class16 arg2, int[] arg3, class55 arg4, int arg5, class16 arg6, int arg7, boolean[] arg8, int arg9, boolean arg10, boolean arg11) {
        if (arg0 != -1) {
            this.method70(-79, -128, (class269) null, (class269) null, -49, 14, -40);
        }
        field3271++;
        if (arg2 == null || arg9 == 0) {
            for (int var37 = 0; var37 < arg6.field272; var37++) {
                short var38 = arg6.field266[var37];
                if (arg8 == null || arg8[var38] == arg11 || arg4.field890[var38] == 0) {
                    short var39 = arg6.field268[var37];
                    if (var39 != -1) {
                        this.method1462(arg1, 0, 0, arg4.field891[var39], 0, 0, 62, arg3, arg7 & arg4.field900[var39], arg10);
                    }
                    this.method1462(arg1, arg6.field267[var37], arg6.field276[var37], arg4.field891[var38], arg6.field275[var37], arg4.field890[var38], 40, arg3, arg7 & arg4.field900[var38], arg10);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg4.field894; var15++) {
            boolean var16 = false;
            if (arg6.field272 > var13 && arg6.field266[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg2.field272 > var14 && arg2.field266[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg8[var15] == arg11 || arg4.field890[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field890[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg6.field278[var13];
                        var21 = arg6.field275[var13];
                        var22 = arg6.field267[var13];
                        var23 = arg6.field276[var13];
                        var24 = arg6.field268[var13];
                        var13++;
                    } else {
                        var24 = -1;
                        var23 = var18;
                        var21 = var18;
                        var20 = 0;
                        var22 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var29 = arg2.field276[var14];
                        var27 = arg2.field275[var14];
                        var25 = arg2.field278[var14];
                        var26 = arg2.field268[var14];
                        var28 = arg2.field267[var14];
                        var14++;
                    } else {
                        var25 = 0;
                        var26 = -1;
                        var27 = var18;
                        var28 = var18;
                        var29 = var18;
                    }
                    if (var24 != -1) {
                        this.method1462(arg1, 0, 0, arg4.field891[var24], 0, 0, arg0 + 90, arg3, arg7 & arg4.field900[var24], arg10);
                    } else if (var26 != -1) {
                        this.method1462(arg1, 0, 0, arg4.field891[var26], 0, 0, arg0 ^ 0xFFFFFF81, arg3, arg4.field900[var26] & arg7, arg10);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var35 = var23;
                        var34 = var22;
                        var33 = var21;
                    } else if (var19 == 2) {
                        int var30 = var27 - var21 & 0x3FFF;
                        int var31 = var28 - var22 & 0x3FFF;
                        int var32 = var29 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = var21 + (arg9 * var30 / arg5) & 0x3FFF;
                        var34 = arg9 * var31 / arg5 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = var23 + (arg9 * var32 / arg5) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var27 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var29 - var23) * arg9 / arg5 + var23;
                        var33 = arg9 * var36 / arg5 + var21 & 0x3F;
                        var34 = (var28 - var22) * arg9 / arg5 + var22;
                    } else {
                        var34 = (var28 - var22) * arg9 / arg5 + var22;
                        var33 = var21 + ((var27 - var21) * arg9 / arg5);
                        var35 = (var29 - var23) * arg9 / arg5 + var23;
                    }
                    this.method1462(arg1, var34, var35, arg4.field891[var15], var33, var19, 93, arg3, arg7 & arg4.field900[var15], arg10);
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V")
    public abstract void method61(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILms;IILvb;Laq;I)V")
    public static final void method1455(int arg0, int arg1, class363 arg2, int arg3, int arg4, class90 arg5, class385 arg6, int arg7) {
        field3266++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class375.field5312 == 4) {
            var8 = (int) class418.field5750 & 0x3FFF;
        } else {
            var8 = (int) class418.field5750 + class361.field5042 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field5101 / 2, arg2.field5200 / 2) + 10;
        int var10 = arg1 * arg1 + arg4 * arg4;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class432.field5955[var8];
        int var12 = class432.field5957[var8];
        if (class375.field5312 != 4) {
            var12 = var12 * 256 / (class351.field4804 + 256);
            var11 = var11 * 256 / (class351.field4804 + 256);
        }
        if (arg0 != -256) {
            field3269 = null;
        }
        int var13 = arg1 * var11 + arg4 * var12 >> 15;
        int var14 = arg1 * var12 - (arg4 * var11) >> 15;
        arg6.method393(var13 + arg3 + (arg2.field5101 / 2 - arg6.method382() / 2), -var14 + arg7 - (-(arg2.field5200 / 2) - -(arg6.method389() / 2)), arg5, arg3, arg7);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1456(int arg0, String arg1, int arg2) {
        field3272++;
        int var3 = class163.field2345;
        int[] var4 = class482.field6800;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; var6++) {
            class23 var7 = class310.field4235[var4[var6]];
            if (var7 != null && class2.field21 != var7 && var7.field407 != null && var7.field407.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class159.field2285++;
                    class131.method793(class128.field1817, -110);
                    class366.field5214.method2453(var4[var6], true);
                    class366.field5214.method2458(0, (byte) 121);
                } else if (arg2 == 4) {
                    class131.method793(class129.field1827, arg0 + 59);
                    class15.field249++;
                    class366.field5214.method2462(var4[var6], (byte) -123);
                    class366.field5214.method2478(0, (byte) -26);
                } else if (arg2 == 5) {
                    class131.method793(class272.field3768, arg0 + 125);
                    class85.field1315++;
                    class366.field5214.method2499(0, arg0 + 14584);
                    class366.field5214.method2475(128, var4[var6]);
                } else if (arg2 == 6) {
                    class32.field523++;
                    class131.method793(class226.field3199, arg0 - 105);
                    class366.field5214.method2475(128, var4[var6]);
                    class366.field5214.method2470((byte) -74, 0);
                } else if (arg2 == 7) {
                    class131.method793(class259.field3612, -119);
                    class15.field260++;
                    class366.field5214.method2453(var4[var6], true);
                    class366.field5214.method2478(0, (byte) -26);
                }
                break;
            }
        }
        if (!var5) {
            class465.method2743(class51.field858.method695(-122, class487.field6867) + arg1, -114);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public abstract void method48(int arg0);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()I")
    public abstract int method67();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILdh;Ldh;III)V")
    public abstract void method70(int arg0, int arg1, class269 arg2, class269 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()V")
    public abstract void method53();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Laa;IIZILaa;IBI)V")
    public final void method1457(class13 arg0, int arg1, int arg2, boolean arg3, int arg4, class13 arg5, int arg6, byte arg7, int arg8) {
        field3267++;
        if (arg1 == -1 || !this.method60()) {
            return;
        }
        class16 var10 = arg0.field214[arg1];
        if (arg7 != -91) {
            field3273 = null;
        }
        class55 var11 = var10.field274;
        class16 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field214[arg2];
            if (var12.field274 != var11) {
                var12 = null;
            }
        }
        this.method1454(-1, arg8, var12, (int[]) null, var11, arg4, var10, 65535, (boolean[]) null, arg6, arg3, false);
        this.method35();
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()Z")
    public abstract boolean method68();

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public abstract void method21(int arg0);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()I")
    public abstract int method64();

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()I")
    public abstract int method55();

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public abstract void method62(int arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public abstract void method73(int arg0);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
    public abstract void method26(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public abstract void method34(int arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILdh;IBIII)V")
    public final void method1458(int arg0, class269 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3264++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg6 / 2;
        int var12 = -arg5 / 2;
        int var13 = arg1.method701(arg0 + var11, arg4 + var12);
        if (arg3 != -77) {
            field3269 = null;
        }
        int var14 = arg6 / 2;
        int var15 = -arg5 / 2;
        int var16 = arg1.method701(arg0 + var14, arg4 + var15);
        int var17 = -arg6 / 2;
        int var18 = arg5 / 2;
        int var19 = arg1.method701(arg0 + var17, arg4 + var18);
        int var20 = arg6 / 2;
        int var21 = arg5 / 2;
        int var22 = arg1.method701(arg0 + var20, arg4 - -var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var22 <= var16 ? var22 : var16;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method62(var26);
            }
        }
        int var27 = var19 > var13 ? var13 : var19;
        int var28 = var13 + var22;
        if (arg6 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method34(var29);
            }
        }
        if (var28 > var16 + var19) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg2;
        if (var30 != 0) {
            this.method54(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldr;Lbm;II)V")
    public abstract void method45(class250 arg0, class219 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method31(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(SS)V")
    public abstract void method69(short arg0, short arg1);

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "()I")
    public abstract int method65();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([ZLaa;IIIBILaa;ILaa;IILaa;ZI)V")
    public final void method1459(boolean[] arg0, class13 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class13 arg7, int arg8, class13 arg9, int arg10, int arg11, class13 arg12, boolean arg13, int arg14) {
        field3268++;
        if (arg10 == -1) {
            return;
        }
        if (arg0 == null || arg14 == -1) {
            this.method1457(arg7, arg10, arg11, arg13, arg8, arg12, arg2, (byte) -91, 0);
        } else if (this.method60()) {
            class16 var16 = arg7.field214[arg10];
            class55 var17 = var16.field274;
            class16 var18 = null;
            if (arg12 != null) {
                var18 = arg12.field214[arg11];
                if (var18.field274 != var17) {
                    var18 = null;
                }
            }
            class16 var19 = arg1.field214[arg14];
            class16 var20 = null;
            if (arg5 == 68) {
                if (arg9 != null) {
                    var20 = arg9.field214[arg6];
                    if (var20.field274 != var17) {
                        var20 = null;
                    }
                }
                this.method1454(-1, 0, var18, (int[]) null, var17, arg8, var16, 65535, arg0, arg2, arg13, false);
                this.method31(0, new int[0], 0, 0, 0, 0, arg13);
                this.method1454(arg5 ^ 0xFFFFFFBB, 0, var20, (int[]) null, var17, arg4, var19, 65535, arg0, arg3, arg13, true);
                this.method35();
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        field3269 = null;
        field3275 = null;
        field3273 = null;
        if (arg0 == 2) {
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "()I")
    public abstract int method27();

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public abstract void method19(int arg0);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public abstract void method56(int arg0);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "()I")
    public abstract int method50();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lab;IIIZ)V")
    public abstract void method59(class232 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "()[Lqm;")
    public abstract class356[] method40();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Laa;IILaa;I[IIIIZI)V")
    public final void method1461(class13 arg0, int arg1, int arg2, class13 arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field3265++;
        if (~arg8 == arg7 || !this.method60()) {
            return;
        }
        class16 var12 = arg0.field214[arg8];
        class55 var13 = var12.field274;
        class16 var14 = null;
        if (arg3 != null) {
            var14 = arg3.field214[arg1];
            if (var14.field274 != var13) {
                var14 = null;
            }
        }
        this.method1454(-1, arg10, var14, arg5, var13, arg6, var12, arg2, (boolean[]) null, arg4, arg9, false);
        this.method35();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[IIII[IIZ)V")
    private final void method1462(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9) {
        if (arg0 == 1) {
            if (arg5 == 0 || arg5 == 1) {
                int var13 = -arg4;
                arg4 = arg2;
                arg2 = var13;
            } else if (arg5 == 3) {
                int var11 = arg4;
                arg4 = arg2;
                arg2 = var11;
            } else if (arg5 == 2) {
                int var12 = arg4;
                arg4 = -arg2 & 0x3FFF;
                arg2 = var12 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg5 == 0 || arg5 == 1) {
                arg4 = -arg4;
                arg2 = -arg2;
            } else if (arg5 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg5 == 0 || arg5 == 1) {
                int var16 = arg4;
                arg4 = -arg2;
                arg2 = var16;
            } else if (arg5 == 3) {
                int var14 = arg4;
                arg4 = arg2;
                arg2 = var14;
            } else if (arg5 == 2) {
                int var15 = arg4;
                arg4 = arg2 & 0x3FFF;
                arg2 = -var15 & 0x3FFF;
            }
        }
        field3277++;
        if (arg8 == 65535) {
            this.method31(arg5, arg3, arg4, arg1, arg2, arg0, arg9);
        } else {
            this.method72(arg5, arg3, arg4, arg1, arg2, arg9, arg8, arg7);
        }
        if (arg6 < 36) {
            this.method1462(2, 123, 89, (int[]) null, 35, 62, -31, (int[]) null, 39, true);
        }
    }

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "()Z")
    public abstract boolean method60();

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "()V")
    public abstract void method35();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIZ)Lab;")
    public abstract class232 method51(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILaa;)V")
    public final void method1463(int arg0, int arg1, class13 arg2) {
        field3270++;
        if (arg0 == -1 || !this.method60()) {
            return;
        }
        class16 var4 = arg2.field214[arg0];
        class55 var5 = var4.field274;
        for (int var6 = 0; var6 < var4.field272; var6++) {
            short var8 = var4.field266[var6];
            if (var5.field896[var8]) {
                if (var4.field268[var6] != -1) {
                    this.method61(0, 0, 0, 0);
                }
                this.method61(var5.field890[var8], var4.field275[var6], var4.field267[var6], var4.field276[var6]);
            }
        }
        int var7 = 68 / ((-arg1 - 69) / 50);
        this.method35();
    }
}
