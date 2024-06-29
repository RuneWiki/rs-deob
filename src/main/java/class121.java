import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class121 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lff;")
    public static class9 field1770 = new class9(3, 3);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public static boolean field1774 = true;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "F")
    public static float field1763;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Luh;")
    public static class112 field1775;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public abstract void method837();

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method839(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lau;")
    public abstract class516[] method840();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZBLdr;ILdr;III)V")
    public final void method841(int arg0, boolean arg1, byte arg2, class504 arg3, int arg4, class504 arg5, int arg6, int arg7, int arg8) {
        int var10 = -12 / ((arg2 - 33) / 38);
        field1767++;
        if (arg4 == -1 || !this.method877()) {
            return;
        }
        class410 var11 = arg3.field6942[arg4];
        class426 var12 = var11.field5642;
        class410 var13 = null;
        if (arg5 != null) {
            var13 = arg5.field6942[arg6];
            if (var13.field5642 != var12) {
                var13 = null;
            }
        }
        this.method866(arg8, arg7, null, false, null, arg0, 8192, 65535, var11, var13, var12, arg1);
        this.method844();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILdr;I)V")
    public final void method842(int arg0, class504 arg1, int arg2) {
        field1772++;
        if (arg0 == -1 || !this.method877()) {
            return;
        }
        class410 var4 = arg1.field6942[arg0];
        class426 var5 = var4.field5642;
        if (arg2 > -40) {
            return;
        }
        for (int var6 = 0; var6 < var4.field5646; var6++) {
            short var7 = var4.field5643[var6];
            if (var5.field5821[var7]) {
                if (var4.field5647[var6] != -1) {
                    this.method846(0, 0, 0, 0);
                }
                this.method846(var5.field5825[var7], var4.field5640[var6], var4.field5645[var6], var4.field5635[var6]);
            }
        }
        this.method844();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLdr;Ldr;ILdr;[ZIILdr;IIII)V")
    public final void method843(int arg0, int arg1, boolean arg2, class504 arg3, class504 arg4, int arg5, class504 arg6, boolean[] arg7, int arg8, int arg9, class504 arg10, int arg11, int arg12, int arg13, int arg14) {
        field1773++;
        if (arg8 == -1) {
            return;
        }
        if (arg7 == null || arg13 == -1) {
            this.method841(0, arg2, (byte) -91, arg10, arg8, arg4, arg1, arg5, arg11);
        } else if (this.method877()) {
            class410 var16 = arg10.field6942[arg8];
            class426 var17 = var16.field5642;
            class410 var18 = null;
            if (arg4 != null) {
                var18 = arg4.field6942[arg1];
                if (var18.field5642 != var17) {
                    var18 = null;
                }
            }
            if (arg14 < 37) {
                field1774 = true;
            }
            this.method866(arg11, arg5, arg7, false, null, 0, 8192, 65535, var16, var18, var17, arg2);
            class410 var19 = arg6.field6942[arg13];
            class410 var20 = null;
            if (arg3 != null) {
                var20 = arg3.field6942[arg12];
                if (var20.field5642 != var17) {
                    var20 = null;
                }
            }
            this.method871(0, new int[0], 0, 0, 0, 0, arg2);
            this.method866(arg0, arg9, arg7, true, null, 0, 8192, 65535, var19, var20, var19.field5642, arg2);
            this.method844();
        }
    }

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method844();

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method845();

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method846(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method847(int arg0, int arg1, class414 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method848(class121 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method849();

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method850();

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lqm;")
    public abstract class96[] method851();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method852(int arg0, int arg1) {
        if (arg0 == -11) {
            field1769++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lfo;I)V")
    public abstract void method853(class414 arg0, class357 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method854();

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method855();

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
    public abstract boolean method856();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lfo;II)V")
    public abstract void method857(class414 arg0, class357 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class377 method858(class377 arg0);

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method859(int arg0);

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method860(int arg0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method861();

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method862();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class121 method863(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public static final boolean method864(int arg0, int arg1, int arg2) {
        if (arg0 != -32316) {
            method867(39);
        }
        field1765++;
        return class23.method210(arg1, arg2, true) | (arg2 & 0x70000) != 0 || class494.method2841(arg2, arg1, (byte) -124);
    }

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method865(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[ZZ[IIIILpf;Lpf;Lqs;Z)V")
    private final void method866(int arg0, int arg1, boolean[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7, class410 arg8, class410 arg9, class426 arg10, boolean arg11) {
        field1771++;
        if (arg9 == null || arg0 == 0) {
            for (int var38 = 0; var38 < arg8.field5646; var38++) {
                short var39 = arg8.field5643[var38];
                if (arg2 == null || arg3 == arg2[var39] || arg10.field5825[var39] == 0) {
                    short var40 = arg8.field5647[var38];
                    if (var40 != -1) {
                        this.method870(0, 0, arg10.field5829[var40], 0, arg5, arg4, 0, 0, arg11, arg7 & arg10.field5826[var40]);
                    }
                    this.method870(arg8.field5645[var38], arg8.field5635[var38], arg10.field5829[var39], arg8.field5640[var38], arg5, arg4, 0, arg10.field5825[var39], arg11, arg7 & arg10.field5826[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg6 != 8192) {
            this.method849();
        }
        for (int var15 = 0; var15 < arg10.field5827; var15++) {
            boolean var16 = false;
            if (arg8.field5646 > var13 && arg8.field5643[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg9.field5646 > var14 && arg9.field5643[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg2 == null || arg2[var15] == arg3 || arg10.field5825[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field5825[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg8.field5640[var13];
                        var21 = arg8.field5635[var13];
                        var22 = arg8.field5637[var13];
                        var23 = arg8.field5647[var13];
                        var24 = arg8.field5645[var13];
                        var13++;
                    } else {
                        var23 = -1;
                        var20 = var18;
                        var22 = 0;
                        var24 = var18;
                        var21 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var26 = arg9.field5645[var14];
                        var27 = arg9.field5635[var14];
                        var25 = arg9.field5647[var14];
                        var28 = arg9.field5640[var14];
                        var29 = arg9.field5637[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = var18;
                        var27 = var18;
                        var28 = var18;
                        var29 = 0;
                    }
                    if (var23 != -1) {
                        this.method870(0, 0, arg10.field5829[var23], 0, arg5, arg4, 0, 0, arg11, arg10.field5826[var23] & arg7);
                    } else if (var25 != -1) {
                        this.method870(0, 0, arg10.field5829[var25], 0, arg5, arg4, 0, 0, arg11, arg10.field5826[var25] & arg7);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var34 = var24;
                        var35 = var21;
                        var33 = var20;
                    } else if (var19 == 2) {
                        int var30 = var28 - var20 & 0x3FFF;
                        int var31 = var26 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var27 - var21 & 0x3FFF;
                        var33 = arg0 * var30 / arg1 + var20 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg0 * var31 / arg1 + var24 & 0x3FFF;
                        var35 = var21 + (arg0 * var32 / arg1) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var28 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var34 = 0;
                        var33 = arg0 * var36 / arg1 + var20 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var28 - var20 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = (var26 - var24) * arg0 / arg1 + var24;
                        var33 = arg0 * var37 / arg1 + var20 & 0x3F;
                        var35 = (var27 - var21) * arg0 / arg1 + var21;
                    } else {
                        var33 = (var28 - var20) * arg0 / arg1 + var20;
                        var35 = (var27 - var21) * arg0 / arg1 + var21;
                        var34 = var24 + ((var26 - var24) * arg0 / arg1);
                    }
                    this.method870(var34, var35, arg10.field5829[var15], var33, arg5, arg4, 0, var19, arg11, arg10.field5826[var15] & arg7);
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method867(int arg0) {
        field1775 = null;
        if (arg0 != 0) {
            method864(-92, -73, 112);
        }
        field1770 = null;
    }

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method868(int arg0);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method869(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[III[IIIZI)V")
    private final void method870(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field1764++;
        if (arg6 != 0) {
            this.method851();
        }
        if (arg4 == 1) {
            if (arg7 == 0 || arg7 == 1) {
                int var13 = -arg3;
                arg3 = arg1;
                arg1 = var13;
            } else if (arg7 == 3) {
                int var12 = arg3;
                arg3 = arg1;
                arg1 = var12;
            } else if (arg7 == 2) {
                int var11 = arg3;
                arg3 = -arg1 & 0x3FFF;
                arg1 = var11 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg7 == 0 || arg7 == 1) {
                arg3 = -arg3;
                arg1 = -arg1;
            } else if (arg7 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg7 == 0 || arg7 == 1) {
                int var16 = arg3;
                arg3 = -arg1;
                arg1 = var16;
            } else if (arg7 == 3) {
                int var15 = arg3;
                arg3 = arg1;
                arg1 = var15;
            } else if (arg7 == 2) {
                int var14 = arg3;
                arg3 = arg1 & 0x3FFF;
                arg1 = -var14 & 0x3FFF;
            }
        }
        if (arg9 == 65535) {
            this.method871(arg7, arg2, arg3, arg0, arg1, arg4, arg8);
        } else {
            this.method875(arg7, arg2, arg3, arg0, arg1, arg8, arg9, arg5);
        }
    }

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method871(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method872(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method873();

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method874();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method875(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method876();

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method877();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIIZLdr;Ldr;IIII)V")
    public final void method878(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, class504 arg5, class504 arg6, int arg7, int arg8, int arg9, int arg10) {
        field1766++;
        if (arg2 == -1 || !this.method877()) {
            return;
        }
        class410 var12 = arg5.field6942[arg2];
        class426 var13 = var12.field5642;
        class410 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field6942[arg9];
            if (var14.field5642 != var13) {
                var14 = null;
            }
        }
        if (arg0 >= 17) {
            this.method866(arg3, arg10, null, false, arg1, arg7, 8192, arg8, var12, var14, var13, arg4);
            this.method844();
        }
    }

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method879(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method880(int arg0);

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method881(int arg0);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method883(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILna;IIII)V")
    public final void method884(int arg0, int arg1, int arg2, int arg3, class35 arg4, int arg5, int arg6, int arg7, int arg8) {
        field1768++;
        boolean var10 = false;
        boolean var11 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg4.method276(arg5 + var13, arg1 + var14);
        int var16 = arg0 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg4.method276(arg5 + var16, arg1 + var17);
        int var19 = -arg0 / 2;
        int var20 = arg8 / 2;
        int var21 = arg4.method276(arg5 + var19, arg1 - -var20);
        int var22 = arg0 / 2;
        int var23 = arg8 / 2;
        int var24 = arg4.method276(arg5 + var22, arg1 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg3 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg3;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg3 < var29) {
                        var29 = arg3;
                    }
                }
                this.method868(var29);
            }
        }
        if (arg0 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg2 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg2;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg2 < var31) {
                        var31 = arg2;
                    }
                }
                this.method869(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (var34 != 0) {
            this.method879(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method885();
}
