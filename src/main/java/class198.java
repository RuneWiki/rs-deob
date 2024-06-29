import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class198 {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ltq;")
    public static class427 field3118 = null;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 17)
    public static void method1226(int arg0) {
        field3118 = null;
        if (arg0 != -19330) {
            field3113 = -60;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[IBLeb;IZLua;[ZIIILua;)V", line = 37)
    private final void method1227(boolean arg0, int[] arg1, byte arg2, class424 arg3, int arg4, boolean arg5, class453 arg6, boolean[] arg7, int arg8, int arg9, int arg10, class453 arg11) {
        field3116++;
        int var13 = -80 / ((-arg2 - 46) / 55);
        if (arg11 == null || arg8 == 0) {
            for (int var39 = 0; var39 < arg6.field6957; var39++) {
                short var40 = arg6.field6961[var39];
                if (arg7 == null || arg7[var40] == arg0 || arg3.field6088[var40] == 0) {
                    short var41 = arg6.field6965[var39];
                    if (var41 != -1) {
                        this.method1231(0, arg3.field6080[var41], 0, 0, 0, -80, arg1, arg10, arg5, arg4 & arg3.field6082[var41]);
                    }
                    this.method1231(arg6.field6973[var39], arg3.field6080[var40], arg6.field6968[var39], arg6.field6959[var39], arg3.field6088[var40], -85, arg1, arg10, arg5, arg3.field6082[var40] & arg4);
                }
            }
            return;
        }
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg3.field6089; var16++) {
            boolean var17 = false;
            if (arg6.field6957 > var14 && arg6.field6961[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var15 < arg11.field6957 && arg11.field6961[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg7 == null || arg0 == arg7[var16] || arg3.field6088[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg3.field6088[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    byte var25;
                    if (var17) {
                        var21 = arg6.field6959[var14];
                        var22 = arg6.field6968[var14];
                        var23 = arg6.field6965[var14];
                        var24 = arg6.field6973[var14];
                        var25 = arg6.field6967[var14];
                        var14++;
                    } else {
                        var23 = -1;
                        var25 = 0;
                        var24 = var19;
                        var22 = var19;
                        var21 = var19;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var26 = arg11.field6965[var15];
                        var27 = arg11.field6967[var15];
                        var28 = arg11.field6968[var15];
                        var29 = arg11.field6973[var15];
                        var30 = arg11.field6959[var15];
                        var15++;
                    } else {
                        var29 = var19;
                        var30 = var19;
                        var26 = -1;
                        var28 = var19;
                        var27 = 0;
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var25 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var35 = var24;
                        var34 = var22;
                        var36 = var21;
                    } else if (var20 == 2) {
                        int var31 = var28 - var22 & 0x3FFF;
                        int var32 = var29 - var24 & 0x3FFF;
                        int var33 = var30 - var21 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg8 * var31 / arg9 + var22 & 0x3FFF;
                        var35 = arg8 * var32 / arg9 + var24 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = arg8 * var33 / arg9 + var21 & 0x3FFF;
                    } else if (var20 == 9) {
                        int var38 = var28 - var22 & 0x3FFF;
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var36 = 0;
                        var35 = 0;
                        var34 = arg8 * var38 / arg9 + var22 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var28 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = (var29 - var24) * arg8 / arg9 + var24;
                        var34 = var22 + (arg8 * var37 / arg9) & 0x3F;
                        var36 = var21 + ((var30 - var21) * arg8 / arg9);
                    } else {
                        var36 = (var30 - var21) * arg8 / arg9 + var21;
                        var34 = (var28 - var22) * arg8 / arg9 + var22;
                        var35 = (var29 - var24) * arg8 / arg9 + var24;
                    }
                    if (var23 != -1) {
                        this.method1231(0, arg3.field6080[var23], 0, 0, 0, -92, arg1, arg10, arg5, arg4 & arg3.field6082[var23]);
                    } else if (var26 != -1) {
                        this.method1231(0, arg3.field6080[var26], 0, 0, 0, -98, arg1, arg10, arg5, arg3.field6082[var26] & arg4);
                    }
                    this.method1231(var35, arg3.field6080[var16], var34, var36, var20, -91, arg1, arg10, arg5, arg3.field6082[var16] & arg4);
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILfo;IIIII)V", line = 246)
    public final void method1228(int arg0, int arg1, int arg2, class343 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3117++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg2 / 2;
        if (arg6 != -27477) {
            field3113 = 12;
        }
        int var14 = -arg8 / 2;
        int var15 = arg3.method314(arg1 + var13, arg4 + var14);
        int var16 = arg2 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg3.method314(arg1 + var16, arg4 - -var17);
        int var19 = -arg2 / 2;
        int var20 = arg8 / 2;
        int var21 = arg3.method314(arg1 + var19, arg4 + var20);
        int var22 = arg2 / 2;
        int var23 = arg8 / 2;
        int var24 = arg3.method314(arg1 + var22, arg4 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
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
                this.method470(var29);
            }
        }
        if (arg2 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg0 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg0;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg0) {
                        var31 = arg0;
                    }
                }
                this.method467(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (var34 != 0) {
            this.method508(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIII)I", line = 366)
    public static final int method1229(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3120++;
        if (var4 == 0) {
            return arg1;
        } else if (~var4 == arg2) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llt;Lqq;ILlt;)V", line = 389)
    public static final void method1230(class458 arg0, class318 arg1, int arg2, class458 arg3) {
        class121.field2015 = class206.method1265(arg0, class12.field145, 0, 82);
        field3114++;
        class266.field4026 = arg1.method1888(class121.field2015, class351.method2137(arg3, class12.field145, 0), true);
        int var4 = -108 % ((-arg2 - 37) / 50);
        class380.field5545 = class206.method1265(arg0, class85.field1432, 0, 40);
        class217.field3343 = arg1.method1888(class380.field5545, class351.method2137(arg3, class85.field1432, 0), true);
        class512.field7764 = class206.method1265(arg0, class53.field804, 0, 124);
        class493.field7514 = arg1.method1888(class512.field7764, class351.method2137(arg3, class53.field804, 0), true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIII[IIZI)V", line = 418)
    private final void method1231(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9) {
        int var11 = 15 % ((arg5 + 5) / 50);
        if (arg7 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var17 = -arg2;
                arg2 = arg3;
                arg3 = var17;
            } else if (arg4 == 3) {
                int var15 = arg2;
                arg2 = arg3;
                arg3 = var15;
            } else if (arg4 == 2) {
                int var16 = arg2;
                arg2 = -arg3 & 0x3FFF;
                arg3 = var16 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg3 = -arg3;
                arg2 = -arg2;
            } else if (arg4 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var14 = arg2;
                arg2 = -arg3;
                arg3 = var14;
            } else if (arg4 == 3) {
                int var13 = arg2;
                arg2 = arg3;
                arg3 = var13;
            } else if (arg4 == 2) {
                int var12 = arg2;
                arg2 = arg3 & 0x3FFF;
                arg3 = -var12 & 0x3FFF;
            }
        }
        field3123++;
        if (arg9 == 65535) {
            this.method482(arg4, arg1, arg2, arg0, arg3, arg7, arg8);
        } else {
            this.method481(arg4, arg1, arg2, arg0, arg3, arg8, arg9, arg6);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBLcq;IIIZLcq;)V", line = 512)
    public final void method1232(int arg0, int arg1, byte arg2, class312 arg3, int arg4, int arg5, int arg6, boolean arg7, class312 arg8) {
        field3122++;
        if (arg4 == -1 || !this.method509() || arg2 > -7) {
            return;
        }
        class453 var10 = arg8.field4693[arg4];
        class424 var11 = var10.field6962;
        class453 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field4693[arg6];
            if (var12.field6962 != var11) {
                var12 = null;
            }
        }
        this.method1227(false, null, (byte) 119, var11, 65535, arg7, var10, null, arg5, arg1, arg0, var12);
        this.method468();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILcq;ILcq;IBI[ZILcq;Lcq;IZ)V", line = 550)
    public final void method1233(int arg0, int arg1, int arg2, class312 arg3, int arg4, class312 arg5, int arg6, byte arg7, int arg8, boolean[] arg9, int arg10, class312 arg11, class312 arg12, int arg13, boolean arg14) {
        field3124++;
        if (arg4 == -1) {
            return;
        }
        if (arg9 == null || arg8 == -1) {
            this.method1232(0, arg0, (byte) -62, arg11, arg4, arg2, arg13, arg14, arg3);
        } else if (this.method509()) {
            class453 var16 = arg3.field4693[arg4];
            if (arg7 != -14) {
                field3118 = null;
            }
            class424 var17 = var16.field6962;
            class453 var18 = null;
            if (arg11 != null) {
                var18 = arg11.field4693[arg13];
                if (var18.field6962 != var17) {
                    var18 = null;
                }
            }
            this.method1227(false, null, (byte) 110, var17, 65535, arg14, var16, arg9, arg2, arg0, 0, var18);
            class453 var19 = arg5.field4693[arg8];
            class453 var20 = null;
            if (arg12 != null) {
                var20 = arg12.field4693[arg10];
                if (var20.field6962 != var17) {
                    var20 = null;
                }
            }
            this.method482(0, new int[0], 0, 0, 0, 0, arg14);
            this.method1227(true, null, (byte) 66, var19.field6962, 65535, arg14, var19, arg9, arg6, arg1, 0, var20);
            this.method468();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcq;II)V", line = 607)
    public final void method1234(class312 arg0, int arg1, int arg2) {
        field3121++;
        if (arg1 == -1 || !this.method509()) {
            return;
        }
        class453 var4 = arg0.field4693[arg1];
        class424 var5 = var4.field6962;
        int var6 = 0;
        if (arg2 != -22224) {
            return;
        }
        while (var6 < var4.field6957) {
            short var7 = var4.field6961[var6];
            if (var5.field6084[var7]) {
                if (var4.field6965[var6] != -1) {
                    this.method493(0, 0, 0, 0);
                }
                this.method493(var5.field6088[var7], var4.field6968[var6], var4.field6973[var6], var4.field6959[var6]);
            }
            var6++;
        }
        this.method468();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[IZIIILcq;IILcq;)V", line = 656)
    public final void method1235(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, class312 arg7, int arg8, int arg9, class312 arg10) {
        field3119++;
        if (arg8 == -1 || !this.method509() || arg0 < 77) {
            return;
        }
        class453 var12 = arg10.field4693[arg8];
        class424 var13 = var12.field6962;
        class453 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field4693[arg5];
            if (var14.field6962 != var13) {
                var14 = null;
            }
        }
        this.method1227(false, arg2, (byte) -122, var13, arg1, arg3, var12, null, arg9, arg6, arg4, var14);
        this.method468();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)I", line = 693)
    public static final int method1236(int arg0, String arg1) {
        field3115++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -1957413083) {
            field3113 = -37;
        }
        while (var4 < var2) {
            var3 = class467.method2825(338, arg1.charAt(var4)) + (var3 << 5) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public abstract void method488(int arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public abstract void method477(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIZ)Lcd;")
    public abstract class198 method511(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lql;Lni;II)V")
    public abstract void method480(class496 arg0, class346 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
    public abstract boolean method469();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lh;)Lh;")
    public abstract class452 method500(class452 arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()I")
    public abstract int method479();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
    public abstract void method486(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public abstract void method487(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILfo;Lfo;III)V")
    public abstract void method463(int arg0, int arg1, class343 arg2, class343 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V")
    public abstract void method493(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
    public abstract void method508(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()I")
    public abstract int method492();

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()I")
    public abstract int method483();

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "()Z")
    public abstract boolean method509();

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "()I")
    public abstract int method464();

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "()V")
    public abstract void method497();

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "()[Lma;")
    public abstract class10[] method471();

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "()V")
    public abstract void method503();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILql;Z)Z")
    public abstract boolean method495(int arg0, int arg1, class496 arg2, boolean arg3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method482(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "()I")
    public abstract int method490();

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "()I")
    public abstract int method466();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcd;IIIZ)V")
    public abstract void method474(class198 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "()V")
    public abstract void method468();

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "()[Loo;")
    public abstract class425[] method502();

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "()I")
    public abstract int method489();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(SS)V")
    public abstract void method505(short arg0, short arg1);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "()I")
    public abstract int method472();

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public abstract void method498(int arg0);

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "()I")
    public abstract int method501();

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public abstract void method476(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method481(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(SS)V")
    public abstract void method485(short arg0, short arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lql;Lni;I)V")
    public abstract void method461(class496 arg0, class346 arg1, int arg2);
}
