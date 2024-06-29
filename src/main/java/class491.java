import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class491 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lus;")
    public static class1 field6918 = new class1(82, 6);

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ldk;")
    public static class326 field6926 = new class326("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[Lkn;")
    public static class481[] field6927 = new class481[29];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Loh;")
    public static class256 field6928;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILpl;Lpl;III)V")
    public abstract void method1287(int arg0, int arg1, class426 arg2, class426 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public abstract int method1301();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILvo;IZ[ZIILvo;Lvo;IIILvo;)V")
    public final void method2876(int arg0, int arg1, int arg2, class31 arg3, int arg4, boolean arg5, boolean[] arg6, int arg7, int arg8, class31 arg9, class31 arg10, int arg11, int arg12, int arg13, class31 arg14) {
        field6923++;
        if (arg8 == -1) {
            return;
        }
        if (arg6 == null || arg12 == -1) {
            this.method2885(arg8, arg3, arg13, 0, arg11, (byte) -59, arg5, arg2, arg14);
        } else if (this.method1315()) {
            if (arg7 != 16383) {
                method2881((byte) -12);
            }
            class371 var16 = arg3.field417[arg8];
            class92 var17 = var16.field5342;
            class371 var18 = null;
            if (arg14 != null) {
                var18 = arg14.field417[arg2];
                if (var18.field5342 != var17) {
                    var18 = null;
                }
            }
            class371 var19 = arg9.field417[arg12];
            class371 var20 = null;
            if (arg10 != null) {
                var20 = arg10.field417[arg1];
                if (var20.field5342 != var17) {
                    var20 = null;
                }
            }
            this.method2878(arg13, var17, arg6, arg5, var16, false, (byte) -48, (int[]) null, 0, 65535, arg11, var18);
            this.method1285(0, new int[0], 0, 0, 0, 0, arg5);
            this.method2878(arg0, var17, arg6, arg5, var19, true, (byte) 112, (int[]) null, 0, 65535, arg4, var20);
            this.method1345();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public abstract void method1346(int arg0);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
    public abstract void method1310();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILkm;)I")
    public static final int method2877(int arg0, class216 arg1) {
        field6916++;
        if (arg0 != -1) {
            return -116;
        }
        class466 var2 = arg1.field3232;
        if (var2.field6526 != null) {
            var2 = var2.method2742(arg0 - 74, class140.field1859);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6524;
        class332 var4 = arg1.method924((byte) -32);
        if (arg1.field2121) {
            var3 = var2.field6506;
        } else if (arg1.field2105 == var4.field4815 || arg1.field2105 == var4.field4794 || arg1.field2105 == var4.field4831 || arg1.field2105 == var4.field4788) {
            var3 = var2.field6505;
        } else if (arg1.field2105 == var4.field4819 || arg1.field2105 == var4.field4793 || arg1.field2105 == var4.field4816 || arg1.field2105 == var4.field4833) {
            var3 = var2.field6571;
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILho;[ZZLul;ZB[IIIILul;)V")
    private final void method2878(int arg0, class92 arg1, boolean[] arg2, boolean arg3, class371 arg4, boolean arg5, byte arg6, int[] arg7, int arg8, int arg9, int arg10, class371 arg11) {
        field6921++;
        if (arg11 == null || arg10 == 0) {
            for (int var38 = 0; var38 < arg4.field5355; var38++) {
                short var39 = arg4.field5351[var38];
                if (arg2 == null || arg2[var39] == arg5 || arg1.field1159[var39] == 0) {
                    short var40 = arg4.field5352[var38];
                    if (var40 != -1) {
                        this.method2883(arg8, arg7, arg3, arg1.field1168[var40], 0, 0, 0, arg1.field1170[var40] & arg9, -120, 0);
                    }
                    this.method2883(arg8, arg7, arg3, arg1.field1168[var39], arg4.field5343[var38], arg4.field5353[var38], arg1.field1159[var39], arg9 & arg1.field1170[var39], -98, arg4.field5356[var38]);
                }
            }
            return;
        }
        int var13 = -39 % ((arg6 - 8) / 47);
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg1.field1161; var16++) {
            boolean var17 = false;
            if (var14 < arg4.field5355 && arg4.field5351[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var15 < arg11.field5355 && arg11.field5351[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg2 == null || arg5 == arg2[var16] || arg1.field1159[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg1.field1159[var16];
                    if (var20 == 3) {
                        var19 = 128;
                    }
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var22 = arg4.field5343[var14];
                        var24 = arg4.field5353[var14];
                        var23 = arg4.field5352[var14];
                        var21 = arg4.field5344[var14];
                        var25 = arg4.field5356[var14];
                        var14++;
                    } else {
                        var21 = 0;
                        var22 = var19;
                        var23 = -1;
                        var24 = var19;
                        var25 = var19;
                    }
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var26 = arg11.field5344[var15];
                        var27 = arg11.field5343[var15];
                        var28 = arg11.field5353[var15];
                        var29 = arg11.field5352[var15];
                        var30 = arg11.field5356[var15];
                        var15++;
                    } else {
                        var30 = var19;
                        var26 = 0;
                        var27 = var19;
                        var29 = -1;
                        var28 = var19;
                    }
                    if (var23 != -1) {
                        this.method2883(arg8, arg7, arg3, arg1.field1168[var23], 0, 0, 0, arg9 & arg1.field1170[var23], -120, 0);
                    } else if (var29 != -1) {
                        this.method2883(arg8, arg7, arg3, arg1.field1168[var29], 0, 0, 0, arg1.field1170[var29] & arg9, -116, 0);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var21 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var35 = var25;
                        var34 = var24;
                        var36 = var22;
                    } else if (var20 == 2) {
                        int var31 = var30 - var25 & 0x3FFF;
                        int var32 = var28 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var33 = var27 - var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = var24 + (arg10 * var32 / arg0) & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var35 = arg10 * var31 / arg0 + var25 & 0x3FFF;
                        var36 = arg10 * var33 / arg0 + var22 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var30 - var25 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var36 = var22 + ((var27 - var22) * arg10 / arg0);
                        var34 = (var28 - var24) * arg10 / arg0 + var24;
                        var35 = arg10 * var37 / arg0 + var25 & 0x3F;
                    } else {
                        var36 = (var27 - var22) * arg10 / arg0 + var22;
                        var34 = var24 + ((var28 - var24) * arg10 / arg0);
                        var35 = (var30 - var25) * arg10 / arg0 + var25;
                    }
                    this.method2883(arg8, arg7, arg3, arg1.field1168[var16], var36, var34, var20, arg1.field1170[var16] & arg9, -108, var35);
                } else {
                    if (var18) {
                        var15++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILvo;I)V")
    public final void method2879(int arg0, class31 arg1, int arg2) {
        field6915++;
        if (arg2 == -1 || !this.method1315()) {
            return;
        }
        class371 var4 = arg1.field417[arg2];
        class92 var5 = var4.field5342;
        for (int var6 = arg0; var6 < var4.field5355; var6++) {
            short var7 = var4.field5351[var6];
            if (var5.field1169[var7]) {
                if (var4.field5352[var6] != -1) {
                    this.method1308(0, 0, 0, 0);
                }
                this.method1308(var5.field1159[var7], var4.field5356[var6], var4.field5353[var6], var4.field5343[var6]);
            }
        }
        this.method1345();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Los;Lkt;II)V")
    public abstract void method1314(class282 arg0, class98 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
    public abstract int method1299();

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public abstract void method1313();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(SS)V")
    public abstract void method1317(short arg0, short arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILos;Z)Z")
    public abstract boolean method1339(int arg0, int arg1, class282 arg2, boolean arg3);

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()I")
    public abstract int method1334();

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()I")
    public abstract int method1319();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmj;ILjava/lang/String;I)Lkj;")
    public static final class366 method2880(class430 arg0, int arg1, String arg2, int arg3) {
        field6917++;
        if (arg1 == 0) {
            return arg0.method2548(arg2, (byte) 112);
        } else if (arg1 == 1) {
            try {
                class429.method2521("openjs", (byte) 119, arg0.field6021, new Object[] { (new URL(arg0.field6021.getCodeBase(), arg2)).toString() });
                class366 var4 = new class366();
                var4.field5253 = 1;
                return var4;
            } catch (Throwable var10) {
                class366 var5 = new class366();
                var5.field5253 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg0.field6021.getAppletContext().showDocument(new URL(arg0.field6021.getCodeBase(), arg2), "_blank");
                class366 var6 = new class366();
                var6.field5253 = 1;
                return var6;
            } catch (Exception var11) {
                class366 var7 = new class366();
                var7.field5253 = 2;
                return var7;
            }
        } else if (~arg1 == arg3) {
            try {
                class429.method2520(arg0.field6021, (byte) 100, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg0.field6021.getAppletContext().showDocument(new URL(arg0.field6021.getCodeBase(), arg2), "_top");
                class366 var8 = new class366();
                var8.field5253 = 1;
                return var8;
            } catch (Exception var12) {
                class366 var9 = new class366();
                var9.field5253 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "()I")
    public abstract int method1321();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method2881(byte arg0) {
        field6928 = null;
        field6927 = null;
        field6926 = null;
        field6918 = null;
        if (arg0 > -71) {
            field6918 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public abstract void method1293(int arg0);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "()I")
    public abstract int method1296();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[IILvo;ZLvo;IIII)V")
    public final void method2882(int arg0, int arg1, int[] arg2, int arg3, class31 arg4, boolean arg5, class31 arg6, int arg7, int arg8, int arg9, int arg10) {
        field6925++;
        if (arg9 == arg10 || !this.method1315()) {
            return;
        }
        class371 var12 = arg6.field417[arg9];
        class92 var13 = var12.field5342;
        class371 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field417[arg3];
            if (var14.field5342 != var13) {
                var14 = null;
            }
        }
        this.method2878(arg8, var13, (boolean[]) null, arg5, var12, false, (byte) -74, arg2, arg0, arg1, arg7, var14);
        this.method1345();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Los;Lkt;I)V")
    public abstract void method1323(class282 arg0, class98 arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ltm;)Ltm;")
    public abstract class242 method1298(class242 arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1304(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public abstract void method1320(int arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BIZ)Lf;")
    public abstract class491 method1292(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public abstract void method1325(int arg0);

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public abstract void method1311(int arg0);

    @OriginalMember(owner = "client!f", name = "i", descriptor = "()I")
    public abstract int method1289();

    @OriginalMember(owner = "client!f", name = "j", descriptor = "()I")
    public abstract int method1295();

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public abstract void method1340(int arg0);

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public abstract void method1344(int arg0);

    @OriginalMember(owner = "client!f", name = "k", descriptor = "()[Lvq;")
    public abstract class295[] method1300();

    @OriginalMember(owner = "client!f", name = "l", descriptor = "()I")
    public abstract int method1306();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public abstract void method1343(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IZ[IIIIIII)V")
    private final void method2883(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var16 = -arg9;
                arg9 = arg4;
                arg4 = var16;
            } else if (arg6 == 3) {
                int var15 = arg9;
                arg9 = arg4;
                arg4 = var15;
            } else if (arg6 == 2) {
                int var14 = arg9;
                arg9 = -arg4 & 0x3FFF;
                arg4 = var14 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg9 = -arg9;
                arg4 = -arg4;
            } else if (arg6 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var13 = arg9;
                arg9 = -arg4;
                arg4 = var13;
            } else if (arg6 == 3) {
                int var12 = arg9;
                arg9 = arg4;
                arg4 = var12;
            } else if (arg6 == 2) {
                int var11 = arg9;
                arg9 = arg4 & 0x3FFF;
                arg4 = -var11 & 0x3FFF;
            }
        }
        field6924++;
        if (arg8 > -74) {
            this.method1295();
        }
        if (arg7 == 65535) {
            this.method1285(arg6, arg3, arg9, arg5, arg4, arg0, arg2);
        } else {
            this.method1304(arg6, arg3, arg9, arg5, arg4, arg2, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(SS)V")
    public abstract void method1309(short arg0, short arg1);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
    public abstract void method1336(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIILpl;)V")
    public final void method2884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class426 arg6) {
        field6922++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg0 / 2;
        int var12 = -arg2 / 2;
        int var13 = arg6.method1209(arg4 + var11, arg1 + var12);
        int var14 = arg0 / 2;
        int var15 = -arg2 / 2;
        int var16 = arg6.method1209(arg4 + var14, arg1 + var15);
        int var17 = -arg0 / 2;
        if (arg5 != 27088) {
            return;
        }
        int var18 = arg2 / 2;
        int var19 = arg6.method1209(arg4 + var17, arg1 - -var18);
        int var20 = arg0 / 2;
        int var21 = arg2 / 2;
        int var22 = arg6.method1209(arg4 + var20, arg1 - -var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var22 > var16 ? var16 : var22;
        int var26 = var19 <= var13 ? var19 : var13;
        if (arg2 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method1293(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method1325(var29);
            }
        }
        if ((var16 + var19) < var28) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg3;
        if (var30 != 0) {
            this.method1343(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
    public abstract void method1308(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "m", descriptor = "()[Lmm;")
    public abstract class168[] method1286();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILvo;IIIBZILvo;)V")
    public final void method2885(int arg0, class31 arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, class31 arg8) {
        field6919++;
        if (arg0 == -1) {
            return;
        }
        if (arg5 != -59) {
            field6927 = null;
        }
        if (!this.method1315()) {
            return;
        }
        class371 var10 = arg1.field417[arg0];
        class92 var11 = var10.field5342;
        class371 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field417[arg7];
            if (var12.field5342 != var11) {
                var12 = null;
            }
        }
        this.method2878(arg2, var11, (boolean[]) null, arg6, var10, false, (byte) -110, (int[]) null, arg3, 65535, arg4, var12);
        this.method1345();
    }

    @OriginalMember(owner = "client!f", name = "n", descriptor = "()I")
    public abstract int method1303();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhi;Lb;Lb;Lb;I)Z")
    public static final boolean method2886(class125 arg0, class201 arg1, class201 arg2, class201 arg3, int arg4) {
        class216.field3252 = arg2;
        class75.field916 = arg1;
        class330.field4781 = arg0;
        if (arg4 == 82) {
            field6920++;
            class325.field4692 = arg3;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "o", descriptor = "()Z")
    public abstract boolean method1315();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lf;IIIZ)V")
    public abstract void method1341(class491 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!f", name = "p", descriptor = "()V")
    public abstract void method1345();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1285(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!f", name = "q", descriptor = "()Z")
    public abstract boolean method1307();
}
