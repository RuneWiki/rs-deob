import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class231 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public boolean field3480 = false;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "F")
    public static float field3483 = 0.25F;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ljn;")
    public static class134 field3474 = new class134(72, 1);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lvk;")
    public static class446 field3485;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3479;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIZLam;I[ZI[IILam;Ljo;I)V", line = 8)
    private final void method1536(boolean arg0, int arg1, boolean arg2, class321 arg3, int arg4, boolean[] arg5, int arg6, int[] arg7, int arg8, class321 arg9, class373 arg10, int arg11) {
        field3481++;
        if (arg3 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg9.field4534; var38++) {
                short var39 = arg9.field4544[var38];
                if (arg5 == null || arg2 == arg5[var39] || arg10.field5364[var39] == 0) {
                    short var40 = arg9.field4547[var38];
                    if (var40 != -1) {
                        this.method1590(arg6, arg10.field5361[var40], 0, 3723, 0, arg1 & arg10.field5360[var40], 0, arg7, 0, arg0);
                    }
                    this.method1590(arg6, arg10.field5361[var39], arg9.field4549[var38], 3723, arg9.field4541[var38], arg1 & arg10.field5360[var39], arg10.field5364[var39], arg7, arg9.field4545[var38], arg0);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg10.field5365; var15++) {
            boolean var16 = false;
            if (arg9.field4534 > var13 && arg9.field4544[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg3.field4534 > var14 && arg3.field4544[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg5 == null || arg5[var15] == arg2 || arg10.field5364[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field5364[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field4541[var13];
                        var21 = arg9.field4546[var13];
                        var22 = arg9.field4549[var13];
                        var23 = arg9.field4545[var13];
                        var24 = arg9.field4547[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var23 = var18;
                        var22 = var18;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg3.field4545[var14];
                        var26 = arg3.field4547[var14];
                        var27 = arg3.field4546[var14];
                        var28 = arg3.field4541[var14];
                        var29 = arg3.field4549[var14];
                        var14++;
                    } else {
                        var27 = 0;
                        var26 = -1;
                        var25 = var18;
                        var29 = var18;
                        var28 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var22;
                        var31 = var20;
                        var32 = var23;
                    } else if (var19 == 2) {
                        int var35 = var28 - var20 & 0x3FFF;
                        int var36 = var29 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var25 - var23 & 0x3FFF;
                        var31 = var20 + (arg11 * var35 / arg4) & 0x3FFF;
                        var33 = var22 + (arg11 * var36 / arg4) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg11 * var37 / arg4 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var28 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg11 * var30 / arg4 + var20 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var28 - var20 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = (var25 - var23) * arg11 / arg4 + var23;
                        var33 = (var29 - var22) * arg11 / arg4 + var22;
                        var31 = arg11 * var34 / arg4 + var20 & 0x3F;
                    } else {
                        var31 = (var28 - var20) * arg11 / arg4 + var20;
                        var33 = var22 + ((var29 - var22) * arg11 / arg4);
                        var32 = (var25 - var23) * arg11 / arg4 + var23;
                    }
                    if (var24 != -1) {
                        this.method1590(arg6, arg10.field5361[var24], 0, 3723, 0, arg10.field5360[var24] & arg1, 0, arg7, 0, arg0);
                    } else if (var26 != -1) {
                        this.method1590(arg6, arg10.field5361[var26], 0, 3723, 0, arg10.field5360[var26] & arg1, 0, arg7, 0, arg0);
                    }
                    this.method1590(arg6, arg10.field5361[var15], var33, 3723, var31, arg1 & arg10.field5360[var15], var19, arg7, var32, arg0);
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
        if (arg8 < 20) {
            this.method1557((short) 16, (short) 106);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILg;ILg;Z)V", line = 218)
    public final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, class146 arg5, int arg6, class146 arg7, boolean arg8) {
        field3484++;
        if (arg1 == -1) {
            return;
        }
        this.method1591();
        if (!this.method1549()) {
            this.method1553();
            return;
        }
        if (arg4 >= -98) {
            this.method1542(59);
        }
        class321 var10 = arg5.field1877[arg1];
        class373 var11 = var10.field4536;
        class321 var12 = null;
        if (arg7 != null) {
            var12 = arg7.field1877[arg3];
            if (var12.field4536 != var11) {
                var12 = null;
            }
        }
        this.method1536(arg8, 65535, false, var12, arg2, null, arg0, null, 124, var10, var11, arg6);
        this.method1556();
        this.method1553();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IZILg;IIIILg;)V", line = 270)
    public final void method1546(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, class146 arg5, int arg6, int arg7, int arg8, int arg9, class146 arg10) {
        field3477++;
        if (arg0 == -1) {
            return;
        }
        this.method1591();
        if (arg7 != 13674) {
            this.method1589();
        }
        if (!this.method1549()) {
            this.method1553();
            return;
        }
        class321 var12 = arg10.field1877[arg0];
        class373 var13 = var12.field4536;
        class321 var14 = null;
        if (arg5 != null) {
            var14 = arg5.field1877[arg4];
            if (var14.field4536 != var13) {
                var14 = null;
            }
        }
        this.method1536(arg3, arg6, false, var14, arg9, null, arg1, arg2, arg7 ^ 0x353B, var12, var13, arg8);
        this.method1556();
        this.method1553();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI)V", line = 313)
    public static final void method1551(int arg0, boolean arg1, int arg2) {
        field3486++;
        class459 var3 = arg1 ? class314.field4511 : class499.field6843;
        if (var3 == null || arg2 < 0 || var3.field6419 <= arg2) {
            return;
        }
        class74 var4 = var3.field6422[arg2];
        if (var4.field831 != -1) {
            return;
        }
        String var5 = var4.field828;
        class116 var6 = class248.method1672(class84.field1023, class135.field1726, -20647);
        var6.field1575.method3005(arg0 - 16128, class395.method2435(var5, arg0 + -16382) + 3);
        var6.field1575.method3005(255, arg1 ? 1 : 0);
        var6.field1575.method2986(arg2, -30);
        if (arg0 != 16383) {
            field3479 = null;
        }
        var6.field1575.method3037(0, var5);
        class443.method2655(0, var6);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILg;)V", line = 350)
    public final void method1555(int arg0, int arg1, class146 arg2) {
        field3476++;
        if (arg1 == -1) {
            return;
        }
        int var4 = 31 % ((arg0 - 63) / 54);
        this.method1591();
        if (!this.method1549()) {
            this.method1553();
            return;
        }
        class321 var5 = arg2.field1877[arg1];
        class373 var6 = var5.field4536;
        for (int var7 = 0; var7 < var5.field4534; var7++) {
            short var8 = var5.field4544[var7];
            if (var6.field5363[var8]) {
                if (var5.field4547[var7] != -1) {
                    this.method1535(0, 0, 0, 0);
                }
                this.method1535(var6.field5364[var8], var5.field4541[var7], var5.field4549[var7], var5.field4545[var7]);
            }
        }
        this.method1556();
        this.method1553();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lg;IIZILg;ILg;I[ZIIILg;I)V", line = 397)
    public final void method1558(class146 arg0, int arg1, int arg2, boolean arg3, int arg4, class146 arg5, int arg6, class146 arg7, int arg8, boolean[] arg9, int arg10, int arg11, int arg12, class146 arg13, int arg14) {
        field3475++;
        if (arg2 == -1) {
            return;
        }
        if (arg9 == null || arg1 == -1) {
            this.method1538(0, arg2, arg8, arg10, -126, arg13, arg4, arg0, arg3);
            return;
        }
        this.method1591();
        if (!this.method1549()) {
            this.method1553();
            return;
        }
        class321 var16 = arg13.field1877[arg2];
        if (arg6 != -22742) {
            field3479 = null;
        }
        class373 var17 = var16.field4536;
        class321 var18 = null;
        if (arg0 != null) {
            var18 = arg0.field1877[arg10];
            if (var18.field4536 != var17) {
                var18 = null;
            }
        }
        this.method1536(arg3, 65535, false, var18, arg8, arg9, 0, null, arg6 + 22851, var16, var17, arg4);
        class321 var19 = arg7.field1877[arg1];
        class321 var20 = null;
        if (arg5 != null) {
            var20 = arg5.field1877[arg14];
            if (var20.field4536 != var17) {
                var20 = null;
            }
        }
        this.method1562(0, new int[0], 0, 0, 0, 0, arg3);
        this.method1536(arg3, 65535, true, var20, arg11, arg9, 0, null, 38, var19, var19.field4536, arg12);
        this.method1556();
        this.method1553();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 475)
    public static void method1568(byte arg0) {
        field3479 = null;
        if (arg0 == 84) {
            field3474 = null;
            field3485 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 490)
    public static final boolean method1572(int arg0, int arg1, int arg2) {
        field3482++;
        int var3 = -96 / ((arg1 + 88) / 33);
        return class346.method2189(0, arg0, arg2) | (arg0 & 0x70000) != 0 || class43.method345(arg2, arg0, 1024);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBILs;IIIII)V", line = 519)
    public final void method1585(int arg0, byte arg1, int arg2, class418 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3478++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg3.method2529(arg6 + var14, arg0 + var13, (byte) -128);
        int var16 = arg7 / 2;
        int var17 = -arg8 / 2;
        if (arg1 != 17) {
            this.method1585(91, (byte) -93, 44, null, 31, -72, 84, -96, 16);
        }
        int var18 = arg3.method2529(arg6 + var17, arg0 + var16, (byte) -128);
        int var19 = -arg7 / 2;
        int var20 = arg8 / 2;
        int var21 = arg3.method2529(arg6 + var20, arg0 - -var19, (byte) -128);
        int var22 = arg7 / 2;
        int var23 = arg8 / 2;
        int var24 = arg3.method2529(arg6 + var23, arg0 + var22, (byte) -128);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg8 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg5 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg5;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg5) {
                        var28 = arg5;
                    }
                }
                this.method1569(var28);
            }
        }
        int var30 = var15 >= var21 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg7 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg4 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg4;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg4) {
                        var32 = arg4;
                    }
                }
                this.method1559(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method1565(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIII[IIZ)V", line = 649)
    private final void method1590(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9) {
        if (arg3 != 3723) {
            this.method1536(true, 0, true, null, 113, null, -88, null, 82, null, null, -19);
        }
        field3487++;
        if (arg0 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var13 = -arg4;
                arg4 = arg8;
                arg8 = var13;
            } else if (arg6 == 3) {
                int var11 = arg4;
                arg4 = arg8;
                arg8 = var11;
            } else if (arg6 == 2) {
                int var12 = arg4;
                arg4 = -arg8 & 0x3FFF;
                arg8 = var12 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg8 = -arg8;
                arg4 = -arg4;
            } else if (arg6 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var16 = arg4;
                arg4 = -arg8;
                arg8 = var16;
            } else if (arg6 == 3) {
                int var15 = arg4;
                arg4 = arg8;
                arg8 = var15;
            } else if (arg6 == 2) {
                int var14 = arg4;
                arg4 = arg8 & 0x3FFF;
                arg8 = -var14 & 0x3FFF;
            }
        }
        if (arg5 == 65535) {
            this.method1562(arg6, arg1, arg4, arg2, arg8, arg0, arg9);
        } else {
            this.method1560(arg6, arg1, arg4, arg2, arg8, arg9, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1535(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1537();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1539();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1540();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loo;IZ)V")
    public abstract void method1541(class12 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1542(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lmb;")
    public abstract class426[] method1543();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1544();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1545(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method1547();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1548(int arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1549();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method1550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1552(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method1553();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1554();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1556();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1557(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1559(int arg0);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1560(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1561(int arg0, int arg1, class418 arg2, class418 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1562(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1563();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1564(class231 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1565(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method1566();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1567();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1569(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILoo;ZII)Z")
    public abstract boolean method1570(int arg0, int arg1, class12 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1573(int arg0);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class113 method1574(class113 arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1575();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1576();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method1577();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILoo;ZI)Z")
    public abstract boolean method1578(int arg0, int arg1, class12 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lfba;")
    public abstract class626[] method1579();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loo;Lea;II)V")
    public abstract void method1580(class12 arg0, class21 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loo;)V")
    public abstract void method1581(class12 arg0);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1582();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1583();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class231 method1584(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Loo;Lea;I)V")
    public abstract void method1586(class12 arg0, class21 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1587();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1588(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method1589();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method1591();
}
