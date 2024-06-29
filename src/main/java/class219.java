import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class219 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field2780 = false;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2784 = -2;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field2791 = 2;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Ldh;")
    public static class286 field2785 = new class286("game4", 3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lim;")
    public static class417 field2786;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIZIIZ[III)V", line = 7)
    private final void method1322(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int[] arg7, int arg8, int arg9) {
        if (arg5 == 1) {
            if (arg2 == 0 || arg2 == 1) {
                int var16 = -arg8;
                arg8 = arg9;
                arg9 = var16;
            } else if (arg2 == 3) {
                int var14 = arg8;
                arg8 = arg9;
                arg9 = var14;
            } else if (arg2 == 2) {
                int var15 = arg8;
                arg8 = -arg9 & 0x3FFF;
                arg9 = var15 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg2 == 0 || arg2 == 1) {
                arg8 = -arg8;
                arg9 = -arg9;
            } else if (arg2 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg2 == 0 || arg2 == 1) {
                int var13 = arg8;
                arg8 = -arg9;
                arg9 = var13;
            } else if (arg2 == 3) {
                int var11 = arg8;
                arg8 = arg9;
                arg9 = var11;
            } else if (arg2 == 2) {
                int var12 = arg8;
                arg8 = arg9 & 0x3FFF;
                arg9 = -var12 & 0x3FFF;
            }
        }
        if (!arg6) {
            return;
        }
        field2789++;
        if (arg0 == 65535) {
            this.method1324(arg2, arg7, arg8, arg4, arg9, arg5, arg3);
        } else {
            this.method1356(arg2, arg7, arg8, arg4, arg9, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZ[Z[ILhl;ILss;ILhl;Z)V", line = 110)
    private final void method1326(int arg0, int arg1, int arg2, boolean arg3, boolean[] arg4, int[] arg5, class338 arg6, int arg7, class294 arg8, int arg9, class338 arg10, boolean arg11) {
        field2790++;
        if (arg10 == null || arg7 == 0) {
            for (int var38 = 0; var38 < arg6.field4361; var38++) {
                short var39 = arg6.field4372[var38];
                if (arg4 == null || arg3 == arg4[var39] || arg8.field3833[var39] == 0) {
                    short var40 = arg6.field4367[var38];
                    if (var40 != -1) {
                        this.method1322(arg1 & arg8.field3838[var40], arg5, 0, arg11, 0, arg0, true, arg8.field3832[var40], 0, 0);
                    }
                    this.method1322(arg1 & arg8.field3838[var39], arg5, arg8.field3833[var39], arg11, arg6.field4370[var38], arg0, true, arg8.field3832[var39], arg6.field4365[var38], arg6.field4363[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field3829; var15++) {
            boolean var16 = false;
            if (arg6.field4361 > var13 && arg6.field4372[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg10.field4361 && arg10.field4372[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg4[var15] == arg3 || arg8.field3833[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field3833[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg6.field4370[var13];
                        var21 = arg6.field4365[var13];
                        var22 = arg6.field4367[var13];
                        var23 = arg6.field4363[var13];
                        var24 = arg6.field4362[var13];
                        var13++;
                    } else {
                        var22 = -1;
                        var21 = var18;
                        var24 = 0;
                        var20 = var18;
                        var23 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg10.field4365[var14];
                        var26 = arg10.field4370[var14];
                        var27 = arg10.field4367[var14];
                        var28 = arg10.field4363[var14];
                        var29 = arg10.field4362[var14];
                        var14++;
                    } else {
                        var27 = -1;
                        var25 = var18;
                        var29 = 0;
                        var26 = var18;
                        var28 = var18;
                    }
                    if (var22 != -1) {
                        this.method1322(arg1 & arg8.field3838[var22], arg5, 0, arg11, 0, arg0, true, arg8.field3832[var22], 0, 0);
                    } else if (var27 != -1) {
                        this.method1322(arg8.field3838[var27] & arg1, arg5, 0, arg11, 0, arg0, true, arg8.field3832[var27], 0, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var24 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var32 = var20;
                        var31 = var23;
                        var33 = var21;
                    } else if (var19 == 2) {
                        int var35 = var25 - var21 & 0x3FFF;
                        int var36 = var26 - var20 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var28 - var23 & 0x3FFF;
                        var32 = arg7 * var36 / arg9 + var20 & 0x3FFF;
                        var33 = var21 + (arg7 * var35 / arg9) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg7 * var37 / arg9 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var25 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg7 * var30 / arg9 + var21 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var25 - var21 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = (var28 - var23) * arg7 / arg9 + var23;
                        var33 = var21 + (arg7 * var34 / arg9) & 0x3F;
                        var32 = (var26 - var20) * arg7 / arg9 + var20;
                    } else {
                        var33 = (var25 - var21) * arg7 / arg9 + var21;
                        var31 = var23 + ((var28 - var23) * arg7 / arg9);
                        var32 = (var26 - var20) * arg7 / arg9 + var20;
                    }
                    this.method1322(arg1 & arg8.field3838[var15], arg5, var19, arg11, var32, arg0, true, arg8.field3832[var15], var33, var31);
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
        if (arg2 != -19228) {
            this.method1344();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 323)
    public static void method1330(boolean arg0) {
        field2785 = null;
        if (arg0) {
            field2786 = null;
        }
        field2786 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ls;IIIIIIII)V", line = 334)
    public final void method1331(class402 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2787++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg0.method2382((byte) 19, arg5 + var14, arg1 - -var13);
        int var16 = arg6 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg0.method2382((byte) 19, arg5 + var17, arg1 + var16);
        int var19 = -arg6 / 2;
        if (arg7 < 28) {
            return;
        }
        int var20 = arg8 / 2;
        int var21 = arg0.method2382((byte) 19, arg5 + var20, arg1 - -var19);
        int var22 = arg6 / 2;
        int var23 = arg8 / 2;
        int var24 = arg0.method2382((byte) 19, arg5 + var23, arg1 + var22);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg4 < var29) {
                        var29 = arg4;
                    }
                }
                this.method1343(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg3 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg3;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg3 < var32) {
                        var32 = arg3;
                    }
                }
                this.method1373(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method1348(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIBIILkga;IILkga;IZILkga;Lkga;)V", line = 468)
    public final void method1346(int arg0, boolean[] arg1, int arg2, byte arg3, int arg4, int arg5, class555 arg6, int arg7, int arg8, class555 arg9, int arg10, boolean arg11, int arg12, class555 arg13, class555 arg14) {
        field2781++;
        if (arg5 == -1) {
            return;
        }
        if (arg1 == null || arg4 == -1) {
            this.method1360(0, (byte) 52, arg8, arg6, arg11, arg5, arg7, arg14, arg2);
            return;
        }
        this.method1371();
        if (!this.method1328()) {
            this.method1367();
            return;
        }
        class338 var16 = arg14.field7791[arg5];
        class294 var17 = var16.field4356;
        class338 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field7791[arg7];
            if (var18.field4356 != var17) {
                var18 = null;
            }
        }
        this.method1326(0, 65535, -19228, false, arg1, null, var16, arg2, var17, arg8, var18, arg11);
        class338 var19 = arg13.field7791[arg4];
        if (arg3 < 64) {
            field2791 = 76;
        }
        class338 var20 = null;
        if (arg9 != null) {
            var20 = arg9.field7791[arg12];
            if (var20.field4356 != var17) {
                var20 = null;
            }
        }
        this.method1324(0, new int[0], 0, 0, 0, 0, arg11);
        this.method1326(0, 65535, -19228, true, arg1, null, var19, arg10, var19.field4356, arg0, var20, arg11);
        this.method1352();
        this.method1367();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IIZIIZLkga;ILkga;)V", line = 538)
    public final void method1354(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, class555 arg8, int arg9, class555 arg10) {
        field2788++;
        if (arg1 == -1) {
            return;
        }
        this.method1371();
        if (!this.method1328()) {
            this.method1367();
            return;
        }
        class338 var12 = arg10.field7791[arg1];
        class294 var13 = var12.field4356;
        if (!arg4) {
            this.method1335();
        }
        class338 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field7791[arg6];
            if (var14.field4356 != var13) {
                var14 = null;
            }
        }
        this.method1326(arg9, arg3, -19228, false, null, arg2, var12, arg5, var13, arg0, var14, arg7);
        this.method1352();
        this.method1367();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBILkga;ZIILkga;I)V", line = 583)
    public final void method1360(int arg0, byte arg1, int arg2, class555 arg3, boolean arg4, int arg5, int arg6, class555 arg7, int arg8) {
        int var10 = 16 % ((arg1 + 18) / 44);
        field2777++;
        if (arg5 == -1) {
            return;
        }
        this.method1371();
        if (!this.method1328()) {
            this.method1367();
            return;
        }
        class338 var11 = arg7.field7791[arg5];
        class294 var12 = var11.field4356;
        class338 var13 = null;
        if (arg3 != null) {
            var13 = arg3.field7791[arg6];
            if (var13.field4356 != var12) {
                var13 = null;
            }
        }
        this.method1326(arg0, 65535, -19228, false, null, null, var11, arg8, var12, arg2, var13, arg4);
        this.method1352();
        this.method1367();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)Z", line = 628)
    public static final boolean method1364(boolean arg0, int arg1) {
        if (arg1 != -1150) {
            method1330(false);
        }
        field2779++;
        boolean var2 = class458.field6407.method57();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class458.field6407.method175();
        } else if (!class458.field6407.method86()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class223.field2944.method346(class223.field2944.field594, arg0 ? 1 : 0, false);
            class252.method1530((byte) 104);
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 666)
    public static final void method1365(byte arg0) {
        if (arg0 < 99) {
            method1365((byte) -61);
        }
        class111.field1370 = 0;
        class552.field7756 = new class310[50];
        field2783++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)C", line = 686)
    public static final char method1370(byte arg0, int arg1) {
        field2782++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class244.field3144[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        int var4 = 2 / ((arg1 + 71) / 39);
        return (char) var2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)I", line = 715)
    public static final int method1372(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field2776++;
        if (var4 == 0) {
            return arg0;
        } else if (arg3 == var4) {
            return 4095 - arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILkga;I)V", line = 737)
    public final void method1374(int arg0, class555 arg1, int arg2) {
        field2778++;
        if (arg0 == -1) {
            return;
        }
        this.method1371();
        if (!this.method1328()) {
            this.method1367();
            return;
        }
        class338 var4 = arg1.field7791[arg0];
        class294 var5 = var4.field4356;
        int var6 = 0;
        if (arg2 <= 13) {
            return;
        }
        while (var6 < var4.field4361) {
            short var7 = var4.field4372[var6];
            if (var5.field3835[var7]) {
                if (var4.field4367[var6] != -1) {
                    this.method1350(0, 0, 0, 0);
                }
                this.method1350(var5.field3833[var7], var4.field4365[var6], var4.field4370[var6], var4.field4363[var6]);
            }
            var6++;
        }
        this.method1352();
        this.method1367();
    }

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1320(int arg0, int arg1, class402 arg2, class402 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1321();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method1323();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1324(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwc;IZ)V")
    public abstract void method1325(class376 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1327(int arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1328();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1329(class219 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lal;")
    public abstract class183[] method1332();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1333();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class108 method1334(class108 arg0);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lmi;")
    public abstract class27[] method1335();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1336(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class219 method1337(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1338();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1339();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1340();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1341();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1342();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1343(int arg0);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method1344();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1345();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method1347();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1348(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1349(int arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwc;Lfda;I)V")
    public abstract void method1351(class376 arg0, class678 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1352();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1353();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1355();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILwc;ZII)Z")
    public abstract boolean method1357(int arg0, int arg1, class376 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1358(int arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1359();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1361();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1362(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1363(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwc;)V")
    public abstract void method1366(class376 arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method1367();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1368(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1369(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method1371();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1373(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwc;Lfda;II)V")
    public abstract void method1375(class376 arg0, class678 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method1376();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method1377(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILwc;ZI)Z")
    public abstract boolean method1378(int arg0, int arg1, class376 arg2, boolean arg3, int arg4);
}
