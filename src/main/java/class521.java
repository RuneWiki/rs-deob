import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class521 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "F")
    public static float field7250 = 0.0F;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lvt;")
    public static class344 field7255 = new class344("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lqc;")
    public static class324 field7263;

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class88 method1581(class88 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[III[IZIIII)V")
    private final void method2900(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg9;
                arg9 = arg3;
                arg3 = var16;
            } else if (arg8 == 3) {
                int var14 = arg9;
                arg9 = arg3;
                arg3 = var14;
            } else if (arg8 == 2) {
                int var15 = arg9;
                arg9 = -arg3 & 0x3FFF;
                arg3 = var15 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg9 = -arg9;
                arg3 = -arg3;
            } else if (arg8 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg9;
                arg9 = -arg3;
                arg3 = var13;
            } else if (arg8 == 3) {
                int var11 = arg9;
                arg9 = arg3;
                arg3 = var11;
            } else if (arg8 == 2) {
                int var12 = arg9;
                arg9 = arg3 & 0x3FFF;
                arg3 = -var12 & 0x3FFF;
            }
        }
        if (arg2 != 16383) {
            return;
        }
        field7256++;
        if (arg0 == 65535) {
            this.method1559(arg8, arg4, arg9, arg6, arg3, arg7, arg5);
        } else {
            this.method1570(arg8, arg4, arg9, arg6, arg3, arg5, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method1592();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1570(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method1580(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public abstract void method1588();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method1586(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII[I[ZZLh;ILh;Lgea;Z)V")
    private final void method2901(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean[] arg5, boolean arg6, class458 arg7, int arg8, class458 arg9, class82 arg10, boolean arg11) {
        field7259++;
        if (arg7 == null || arg0 == 0) {
            for (int var38 = 0; var38 < arg9.field6538; var38++) {
                short var39 = arg9.field6531[var38];
                if (arg5 == null || arg5[var39] == arg11 || arg10.field1104[var39] == 0) {
                    short var40 = arg9.field6532[var38];
                    if (var40 != -1) {
                        this.method2900(arg10.field1108[var40] & arg2, arg4, arg1 + 16383, 0, arg10.field1111[var40], arg6, 0, arg8, 0, 0);
                    }
                    this.method2900(arg10.field1108[var39] & arg2, arg4, arg1 ^ 0x3FFF, arg9.field6530[var38], arg10.field1111[var39], arg6, arg9.field6533[var38], arg8, arg10.field1104[var39], arg9.field6541[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg10.field1107; var15++) {
            boolean var16 = false;
            if (var13 < arg9.field6538 && arg9.field6531[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field6538 && arg7.field6531[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg5 == null || arg11 == arg5[var15] || arg10.field1104[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field1104[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field6530[var13];
                        var21 = arg9.field6543[var13];
                        var22 = arg9.field6541[var13];
                        var23 = arg9.field6533[var13];
                        var24 = arg9.field6532[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var23 = var18;
                        var21 = 0;
                        var22 = var18;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var27 = arg7.field6541[var14];
                        var25 = arg7.field6533[var14];
                        var28 = arg7.field6543[var14];
                        var26 = arg7.field6532[var14];
                        var29 = arg7.field6530[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = -1;
                        var27 = var18;
                        var28 = 0;
                        var29 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var31 = var22;
                        var32 = var20;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var35 = var27 - var22 & 0x3FFF;
                        int var36 = var25 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var29 - var20 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var33 = arg0 * var36 / arg3 + var23 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg0 * var35 / arg3 + var22 & 0x3FFF;
                        var32 = arg0 * var37 / arg3 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var27 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = var22 + (arg0 * var30 / arg3) & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var27 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = (var29 - var20) * arg0 / arg3 + var20;
                        var33 = (var25 - var23) * arg0 / arg3 + var23;
                        var31 = arg0 * var34 / arg3 + var22 & 0x3F;
                    } else {
                        var31 = (var27 - var22) * arg0 / arg3 + var22;
                        var32 = (var29 - var20) * arg0 / arg3 + var20;
                        var33 = (var25 - var23) * arg0 / arg3 + var23;
                    }
                    if (var24 != -1) {
                        this.method2900(arg2 & arg10.field1108[var24], arg4, arg1 + 16383, 0, arg10.field1111[var24], arg6, 0, arg8, 0, 0);
                    } else if (var26 != -1) {
                        this.method2900(arg2 & arg10.field1108[var26], arg4, 16383, 0, arg10.field1111[var26], arg6, 0, arg8, 0, 0);
                    }
                    this.method2900(arg10.field1108[var15] & arg2, arg4, 16383, var32, arg10.field1111[var15], arg6, var33, arg8, var19, var31);
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

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method1582(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()Z")
    public abstract boolean method1593();

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method1589();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method1560();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method1578(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class521 method1607(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method1569(int arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1594(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZLsa;IIII)V")
    public final void method2902(int arg0, int arg1, int arg2, boolean arg3, class544 arg4, int arg5, int arg6, int arg7, int arg8) {
        field7262++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg4.method1040(arg7 + var13, arg8 + var14);
        int var16 = arg1 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg4.method1040(arg7 + var16, arg8 - -var17);
        int var19 = -arg1 / 2;
        int var20 = arg2 / 2;
        int var21 = arg4.method1040(arg7 + var19, arg8 + var20);
        int var22 = arg1 / 2;
        int var23 = arg2 / 2;
        if (arg3) {
            this.method2910(null, 114, -119, null, -13, 78, -61, -49, false);
        }
        int var24 = arg4.method1040(arg7 + var22, arg8 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg2 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg0 < var28) {
                        var28 = arg0;
                    }
                }
                this.method1580(var28);
            }
        }
        int var30 = var21 > var15 ? var15 : var21;
        int var31 = var15 + var24;
        if (arg1 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (var32 > arg6) {
                        var32 = arg6;
                    }
                }
                this.method1574(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg5;
        if (var34 != 0) {
            this.method1602(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method1557();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method1587(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method1573(class521 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method1590();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2903(int arg0, byte[] arg1) {
        if (arg0 != -3874) {
            method2906(77);
        }
        field7251++;
        class551 var2 = new class551(arg1);
        int var3 = var2.method3045(-127);
        int var4 = var2.method3048(-4);
        if (var4 < 0 || !(class319.field4401 == 0 || var4 <= class319.field4401)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method3086(0, var8, true, var4);
            return var8;
        } else {
            int var5 = var2.method3048(arg0 ^ 0xF22);
            if (var5 < 0 || !(class319.field4401 == 0 || class319.field4401 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class210.method1339(var6, var5, arg1, var4, 9);
            } else {
                class115 var7 = class485.field6774;
                synchronized (class485.field6774) {
                    class485.field6774.method615(var6, var2, (byte) 120);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method1597();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Leca;II)V")
    public abstract void method1562(class105 arg0, class378 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method1567(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()[Lkca;")
    public abstract class601[] method1600();

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method1577(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
    public static final boolean method2904(int arg0, int arg1, int arg2) {
        int var3 = -105 / ((-arg1 - 54) / 45);
        field7253++;
        return class411.method2457(arg0, arg2, true) | (arg2 & 0x60000) != 0 || class105.method578(arg0, true, arg2) || class475.method2699(arg0, arg2, true);
    }

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method1606(int arg0, int arg1, class544 arg2, class544 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhr;IBII[ZIILhr;IIILhr;Lhr;Z)V")
    public final void method2905(class556 arg0, int arg1, byte arg2, int arg3, int arg4, boolean[] arg5, int arg6, int arg7, class556 arg8, int arg9, int arg10, int arg11, class556 arg12, class556 arg13, boolean arg14) {
        field7260++;
        if (arg11 == -1) {
            return;
        }
        if (arg5 == null || arg7 == -1) {
            this.method2910(arg0, arg10, arg6, arg8, arg1, 0, 2, arg11, arg14);
        } else if (this.method1589()) {
            class458 var16 = arg0.field7779[arg11];
            class82 var17 = var16.field6536;
            class458 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field7779[arg1];
                if (var18.field6536 != var17) {
                    var18 = null;
                }
            }
            this.method2901(arg6, 0, 65535, arg10, null, arg5, arg14, var18, 0, var16, var17, false);
            if (arg2 != 106) {
                field7250 = 0.40544805F;
            }
            class458 var19 = arg12.field7779[arg7];
            class458 var20 = null;
            if (arg13 != null) {
                var20 = arg13.field7779[arg4];
                if (var20.field6536 != var17) {
                    var20 = null;
                }
            }
            this.method1559(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2901(arg3, 0, 65535, arg9, null, arg5, arg14, var20, 0, var19, var19.field6536, true);
            this.method1560();
        }
    }

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method1585();

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method1579();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method1566(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method2906(int arg0) {
        field7255 = null;
        if (arg0 != 14810) {
            method2909(88, -1);
        }
        field7263 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FIIFIFII)[F")
    public static final float[] method2907(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7) {
        field7254++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[5] = 0.0F;
        var8[arg6] = -var11;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[2] = var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg2 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var16 = (float) arg7 / var19;
            }
            var13[0] = var14 * var14 * var17 + var15;
            var13[5] = var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[3] = -var16 * var18;
            var13[1] = var16 * var18;
            var13[7] = -var14 * var18;
            var13[6] = var14 * var16 * var17;
            var13[8] = var16 * var16 * var17 + var15;
            var13[4] = var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[3] *= arg5;
        var9[5] *= arg5;
        var9[1] *= arg0;
        var9[7] *= arg3;
        var9[2] *= arg0;
        var9[0] *= arg0;
        var9[6] *= arg3;
        var9[4] *= arg5;
        var9[8] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method1574(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7264++;
        if (arg0 < 512 || arg1 < 512 || class139.field1760 * 512 - 1024 < arg0 || ((class369.field5135 - 2) * 512) < arg1) {
            class155.field2011[0] = class155.field2011[1] = -1;
            return;
        }
        int var10 = class341.method2147(arg2, arg0, 0, arg1) - arg3;
        class643.field9335.method365(arg4, 0, 0);
        class301.field3918.method956(class643.field9335);
        class301.field3918.method991(arg0, var10, arg1, class155.field2011);
        class643.field9335.method365(-arg4, 0, 0);
        class301.field3918.method956(class643.field9335);
        if (arg9 != -2) {
            field7255 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method1598(int arg0, int arg1, class105 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method1556();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lfi;")
    public abstract class55[] method1584();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method2909(int arg0, int arg1) {
        field7252++;
        if (arg1 >= 37) {
            class632 var2 = class641.method3699(-104, 11, arg0);
            var2.method3655(0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Leca;I)V")
    public abstract void method1595(class105 arg0, class378 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method1559(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhr;IILhr;IIIIZ)V")
    public final void method2910(class556 arg0, int arg1, int arg2, class556 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field7257++;
        if (arg7 == -1 || !this.method1589()) {
            return;
        }
        class458 var10 = arg0.field7779[arg7];
        class82 var11 = var10.field6536;
        class458 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field7779[arg4];
            if (var12.field6536 != var11) {
                var12 = null;
            }
        }
        this.method2901(arg2, 0, 65535, arg1, null, null, arg8, var12, arg5, var10, var11, false);
        this.method1560();
        if (arg6 != 2) {
            field7255 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method1561();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method1583(int arg0);

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method1565();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILhr;IIZII[IILhr;)V")
    public final void method2911(int arg0, int arg1, class556 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int[] arg8, int arg9, class556 arg10) {
        field7261++;
        if (~arg0 == arg7 || !this.method1589()) {
            return;
        }
        class458 var12 = arg2.field7779[arg0];
        class82 var13 = var12.field6536;
        class458 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field7779[arg1];
            if (var14.field6536 != var13) {
                var14 = null;
            }
        }
        this.method2901(arg3, 0, arg6, arg9, arg8, null, arg5, var14, arg4, var12, var13, false);
        this.method1560();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILhr;)V")
    public final void method2912(int arg0, int arg1, class556 arg2) {
        field7258++;
        if (arg0 == -1 || !this.method1589()) {
            return;
        }
        class458 var4 = arg2.field7779[arg0];
        if (arg1 > -96) {
            return;
        }
        class82 var5 = var4.field6536;
        for (int var6 = 0; var6 < var4.field6538; var6++) {
            short var7 = var4.field6531[var6];
            if (var5.field1112[var7]) {
                if (var4.field6532[var6] != -1) {
                    this.method1582(0, 0, 0, 0);
                }
                this.method1582(var5.field1104[var7], var4.field6541[var6], var4.field6533[var6], var4.field6530[var6]);
            }
        }
        this.method1560();
    }

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method1563();

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method1601();

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method1602(int arg0, int arg1, int arg2);
}
