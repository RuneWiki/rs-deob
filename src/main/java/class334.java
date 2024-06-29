import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class334 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lla;")
    public static class319 field5190 = new class319(39, 12);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class334 method47(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ln;Lst;I)V")
    public abstract void method53(class14 arg0, class302 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "(I)V")
    public abstract void method62(int arg0);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method46();

    @OriginalMember(owner = "client!ka", name = "IA", descriptor = "(I)V")
    public abstract void method89(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILvs;)V")
    public final void method2155(int arg0, int arg1, class425 arg2) {
        field5192++;
        if (arg0 == -1 || !this.method74()) {
            return;
        }
        class161 var4 = arg2.field6472[arg0];
        class393 var5 = var4.field2096;
        for (int var6 = arg1; var6 < var4.field2090; var6++) {
            short var7 = var4.field2092[var6];
            if (var5.field6008[var7]) {
                if (var4.field2101[var6] != -1) {
                    this.method28(0, 0, 0, 0);
                }
                this.method28(var5.field6011[var7], var4.field2098[var6], var4.field2104[var6], var4.field2100[var6]);
            }
        }
        this.method43();
    }

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "(I)V")
    public abstract void method36(int arg0);

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(Lia;)Lia;")
    public abstract class423 method73(class423 arg0);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)V")
    public abstract void method44(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ln;Lst;II)V")
    public abstract void method55(class14 arg0, class302 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I[IIIIIZ)V")
    public abstract void method60(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "ja", descriptor = "()I")
    public abstract int method77();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[ILvs;IIILvs;IZB)V")
    public final void method2156(int arg0, int arg1, int[] arg2, class425 arg3, int arg4, int arg5, int arg6, class425 arg7, int arg8, boolean arg9, byte arg10) {
        field5198++;
        if (arg5 == -1 || !this.method74()) {
            return;
        }
        class161 var12 = arg3.field6472[arg5];
        if (arg10 <= 53) {
            method2162(-108);
        }
        class393 var13 = var12.field2096;
        class161 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field6472[arg0];
            if (var14.field2096 != var13) {
                var14 = null;
            }
        }
        this.method2158(var13, arg9, arg4, 16383, var12, false, null, var14, arg2, arg6, arg8, arg1);
        this.method43();
    }

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "()I")
    public abstract int method38();

    @OriginalMember(owner = "client!ka", name = "AA", descriptor = "()Z")
    public abstract boolean method74();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIZ[IIII)V")
    private final void method2157(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, int arg9) {
        field5191++;
        if (arg7 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg3;
                arg3 = arg2;
                arg2 = var13;
            } else if (arg8 == 3) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
            } else if (arg8 == 2) {
                int var12 = arg3;
                arg3 = -arg2 & 0x3FFF;
                arg2 = var12 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg2 = -arg2;
                arg3 = -arg3;
            } else if (arg8 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg3;
                arg3 = -arg2;
                arg2 = var16;
            } else if (arg8 == 3) {
                int var14 = arg3;
                arg3 = arg2;
                arg2 = var14;
            } else if (arg8 == 2) {
                int var15 = arg3;
                arg3 = arg2 & 0x3FFF;
                arg2 = -var15 & 0x3FFF;
            }
        }
        int var17 = 30 % ((-arg4 - 70) / 50);
        if (arg9 == 65535) {
            this.method60(arg8, arg1, arg3, arg0, arg2, arg7, arg5);
        } else {
            this.method27(arg8, arg1, arg3, arg0, arg2, arg5, arg9, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method76();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILn;Z)Z")
    public abstract boolean method68(int arg0, int arg1, class14 arg2, boolean arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method78(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lii;ZIILdt;Z[ZLdt;[IIII)V")
    private final void method2158(class393 arg0, boolean arg1, int arg2, int arg3, class161 arg4, boolean arg5, boolean[] arg6, class161 arg7, int[] arg8, int arg9, int arg10, int arg11) {
        field5195++;
        if (arg7 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg4.field2090; var38++) {
                short var39 = arg4.field2092[var38];
                if (arg6 == null || arg5 == arg6[var39] || arg0.field6011[var39] == 0) {
                    short var40 = arg4.field2101[var38];
                    if (var40 != -1) {
                        this.method2157(0, arg0.field6009[var40], 0, 0, 120, arg1, arg8, arg9, 0, arg10 & arg0.field6014[var40]);
                    }
                    this.method2157(arg4.field2104[var38], arg0.field6009[var39], arg4.field2100[var38], arg4.field2098[var38], -123, arg1, arg8, arg9, arg0.field6011[var39], arg10 & arg0.field6014[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg3 != 16383) {
            field5197 = 108;
        }
        for (int var15 = 0; var15 < arg0.field6006; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field2090 && arg4.field2092[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field2090 && arg7.field2092[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg5 == arg6[var15] || arg0.field6011[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field6011[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg4.field2104[var13];
                        var21 = arg4.field2095[var13];
                        var22 = arg4.field2101[var13];
                        var23 = arg4.field2100[var13];
                        var24 = arg4.field2098[var13];
                        var13++;
                    } else {
                        var23 = var18;
                        var21 = 0;
                        var20 = var18;
                        var24 = var18;
                        var22 = -1;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg7.field2104[var14];
                        var26 = arg7.field2100[var14];
                        var27 = arg7.field2101[var14];
                        var28 = arg7.field2095[var14];
                        var29 = arg7.field2098[var14];
                        var14++;
                    } else {
                        var27 = -1;
                        var26 = var18;
                        var29 = var18;
                        var25 = var18;
                        var28 = 0;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var34 = var20;
                        var35 = var23;
                        var33 = var24;
                    } else if (var19 == 2) {
                        int var30 = var29 - var24 & 0x3FFF;
                        int var31 = var25 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var26 - var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = var24 + (arg11 * var30 / arg2) & 0x3FFF;
                        var34 = arg11 * var31 / arg2 + var20 & 0x3FFF;
                        var35 = arg11 * var32 / arg2 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var29 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var34 = 0;
                        var33 = var24 + (arg11 * var36 / arg2) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var29 - var24 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = (var26 - var23) * arg11 / arg2 + var23;
                        var34 = (var25 - var20) * arg11 / arg2 + var20;
                        var33 = arg11 * var37 / arg2 + var24 & 0x3F;
                    } else {
                        var33 = (var29 - var24) * arg11 / arg2 + var24;
                        var35 = (var26 - var23) * arg11 / arg2 + var23;
                        var34 = (var25 - var20) * arg11 / arg2 + var20;
                    }
                    if (var22 != -1) {
                        this.method2157(0, arg0.field6009[var22], 0, 0, arg3 - 16503, arg1, arg8, arg9, 0, arg10 & arg0.field6014[var22]);
                    } else if (var27 != -1) {
                        this.method2157(0, arg0.field6009[var27], 0, 0, arg3 ^ 0x3FE6, arg1, arg8, arg9, 0, arg0.field6014[var27] & arg10);
                    }
                    this.method2157(var34, arg0.field6009[var15], var35, var33, -7, arg1, arg8, arg9, var19, arg10 & arg0.field6014[var15]);
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

    @OriginalMember(owner = "client!ka", name = "YA", descriptor = "()V")
    public abstract void method84();

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "(I[IIIIZI[I)V")
    public abstract void method27(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "la", descriptor = "(IIII)V")
    public abstract void method28(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "(I)V")
    public abstract void method63(int arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()I")
    public abstract int method65();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lhd;")
    public abstract class531[] method87();

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "()I")
    public abstract int method81();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()I")
    public abstract int method37();

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "()I")
    public abstract int method70();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILo;IZIIIII)V")
    public final void method2159(int arg0, class23 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5196++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg1.method218(arg5 + var13, arg7 - -var14);
        int var16 = arg0 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg1.method218(arg5 + var16, arg7 - -var17);
        int var19 = -arg0 / 2;
        int var20 = arg2 / 2;
        int var21 = arg1.method218(arg5 + var19, arg7 + var20);
        int var22 = arg0 / 2;
        int var23 = arg2 / 2;
        int var24 = arg1.method218(arg5 + var22, arg7 - -var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        if (!arg3) {
            field5190 = null;
        }
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg4) {
                        var29 = arg4;
                    }
                }
                this.method63(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg0 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg6 < var32) {
                        var32 = arg6;
                    }
                }
                this.method36(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method66(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method58();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lvs;IILvs;IBI[ZLvs;ILvs;IIZI)V")
    public final void method2160(class425 arg0, int arg1, int arg2, class425 arg3, int arg4, byte arg5, int arg6, boolean[] arg7, class425 arg8, int arg9, class425 arg10, int arg11, int arg12, boolean arg13, int arg14) {
        field5194++;
        if (arg2 == -1) {
            return;
        }
        if (arg7 == null || arg6 == -1) {
            this.method2161(arg13, arg0, arg1, arg10, arg14, arg2, arg11, 0, (byte) -79);
        } else if (this.method74()) {
            class161 var16 = arg10.field6472[arg2];
            class393 var17 = var16.field2096;
            class161 var18 = null;
            if (arg5 != 96) {
                field5197 = -115;
            }
            if (arg0 != null) {
                var18 = arg0.field6472[arg1];
                if (var18.field2096 != var17) {
                    var18 = null;
                }
            }
            this.method2158(var17, arg13, arg14, arg5 + 16287, var16, false, arg7, var18, null, 0, 65535, arg11);
            class161 var19 = arg3.field6472[arg6];
            class161 var20 = null;
            if (arg8 != null) {
                var20 = arg8.field6472[arg12];
                if (var20.field2096 != var17) {
                    var20 = null;
                }
            }
            this.method60(0, new int[0], 0, 0, 0, 0, arg13);
            this.method2158(var19.field2096, arg13, arg4, 16383, var19, true, arg7, var20, null, 0, 65535, arg9);
            this.method43();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLvs;ILvs;IIIIB)V")
    public final void method2161(boolean arg0, class425 arg1, int arg2, class425 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field5189++;
        if (arg8 != -79 || arg5 == -1 || !this.method74()) {
            return;
        }
        class161 var10 = arg3.field6472[arg5];
        class393 var11 = var10.field2096;
        class161 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field6472[arg2];
            if (var12.field2096 != var11) {
                var12 = null;
            }
        }
        this.method2158(var11, arg0, arg4, 16383, var10, false, null, var12, null, arg7, 65535, arg6);
        this.method43();
    }

    @OriginalMember(owner = "client!ka", name = "ha", descriptor = "()V")
    public abstract void method43();

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "(III)V")
    public abstract void method90(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(SS)V")
    public abstract void method29(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Llq;")
    public abstract class392[] method72();

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)V")
    public abstract void method61(int arg0);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "()I")
    public abstract int method88();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method83();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "(SS)V")
    public abstract void method57(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method2162(int arg0) {
        field5190 = null;
        if (arg0 != 28755) {
            method2162(-76);
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(IILo;Lo;III)V")
    public abstract void method80(int arg0, int arg1, class23 arg2, class23 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "(III)V")
    public abstract void method66(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "()I")
    public abstract int method45();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method50(class334 arg0, int arg1, int arg2, int arg3, boolean arg4);
}
