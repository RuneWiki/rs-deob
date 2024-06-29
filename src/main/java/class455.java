import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class455 {

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field6362 = 0;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "Lfc;")
    public static class235 field6350 = new class235(52, 8);

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "[Lrs;")
    public static class597[] field6370 = new class597[14];

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public int field6352;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
    public static int field6369;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field6371;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "[[I")
    public int[][] field6346;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2627(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 3)
    public static final String method2607(boolean arg0, long arg1) {
        class16.field227.setTime(new Date(arg1));
        field6367++;
        int var3 = class16.field227.get(7);
        int var4 = class16.field227.get(5);
        if (!arg0) {
            field6362 = -12;
        }
        int var5 = class16.field227.get(2);
        int var6 = class16.field227.get(1);
        int var7 = class16.field227.get(11);
        int var8 = class16.field227.get(12);
        int var9 = class16.field227.get(13);
        return class583.field8124[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class235.field3389[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIZZZ)V", line = 31)
    public final void method2608(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        field6360++;
        if (!arg6) {
            this.method2615(11, -62, -9, -59, 1, 29, 72, -41);
        }
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field6355;
        int var10 = arg0 - this.field6344;
        for (int var11 = var9; var11 < (arg1 + var9); var11++) {
            if (var11 >= 0 && this.field6352 > var11) {
                for (int var12 = var10; var12 < (var10 + arg2); var12++) {
                    if (var12 >= 0 && this.field6356 > var12) {
                        this.method2620(var12, var8, (byte) -45, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZII)V", line = 82)
    private final void method2609(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field6344 = 6;
        }
        this.field6346[arg3][arg0] = class249.method1537(this.field6346[arg3][arg0], ~arg2);
        field6361++;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V", line = 94)
    public static final void method2610(int arg0) {
        field6353++;
        if (class24.field326 == -1 || class292.field4398 == -1) {
            return;
        }
        int var1 = ((class136.field1926 - class677.field9550) * class670.field9446 >> 16) + class677.field9550;
        if (arg0 > -36) {
            return;
        }
        class670.field9446 += var1;
        if (class670.field9446 < 65535) {
            class495.field6815 = false;
            class548.field7427 = false;
        } else {
            class670.field9446 = 65535;
            if (class548.field7427) {
                class495.field6815 = false;
            } else {
                class495.field6815 = true;
            }
            class548.field7427 = true;
        }
        float var2 = (float) class670.field9446 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class673.field9480 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class645.field9155[class24.field326][var4][var5] * 3;
            int var22 = class645.field9155[class24.field326][var4 + 1][var5] * 3;
            int var23 = (class645.field9155[class24.field326][var4 + 2][var5] + class645.field9155[class24.field326][var4 + 2][var5] - class645.field9155[class24.field326][var4 + 3][var5]) * 3;
            int var24 = class645.field9155[class24.field326][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class645.field9155[class24.field326][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class172.field2572 = (int) var3[0] - (class511.field6989 * 512);
        class117.field1563 = (int) var3[2] - (class124.field1726 * 512);
        class628.field8762 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class17.field244 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class645.field9155[class292.field4398][var7][var8] * 3;
            int var15 = class645.field9155[class292.field4398][var7 + 1][var8] * 3;
            int var16 = (class645.field9155[class292.field4398][var7 + 2][var8] + class645.field9155[class292.field4398][var7 + 2][var8] - class645.field9155[class292.field4398][var7 + 3][var8]) * 3;
            int var17 = class645.field9155[class292.field4398][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class645.field9155[class292.field4398][var7 + 2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class492.field6794 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class591.field8245 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class263.field3732 = class645.field9155[class24.field326][var4][3] + ((class645.field9155[class24.field326][var4 + 2][3] - class645.field9155[class24.field326][var4][3]) * class670.field9446 >> 16);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIBIII)Z", line = 197)
    public final boolean method2611(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field6345++;
        if (arg8 > 1) {
            return class460.method2652(arg2, arg0, arg4, arg8, arg8, arg6, arg7, 124, arg1) ? true : this.method2613(arg6, arg2, arg7, arg8, 8, arg1, arg0, arg8, arg3, arg4);
        }
        int var10 = arg0 + arg7 - 1;
        int var11 = arg4 + arg2 - 1;
        if (arg6 >= arg7 && arg6 <= var10 && arg1 >= arg4 && var11 >= arg1) {
            return true;
        } else if ((arg7 - 1) == arg6 && arg1 >= arg4 && arg1 <= var11 && (this.field6346[arg6 - this.field6355][arg1 - this.field6344] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else {
            int var12 = -62 / ((-arg5 - 11) / 60);
            if (var10 + 1 == arg6 && arg1 >= arg4 && var11 >= arg1 && (this.field6346[arg6 - this.field6355][arg1 - this.field6344] & 0x80) == 0 && (arg3 & 0x2) == 0) {
                return true;
            } else if ((arg4 - 1) == arg1 && arg7 <= arg6 && arg6 <= var10 && (this.field6346[arg6 - this.field6355][arg1 - this.field6344] & 0x2) == 0 && (arg3 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg1 && arg6 >= arg7 && arg6 <= var10 && (this.field6346[arg6 - this.field6355][arg1 - this.field6344] & 0x20) == 0 && (arg3 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V", line = 238)
    public final void method2612(byte arg0) {
        field6357++;
        int var2 = -62 % ((arg0 + 69) / 37);
        for (int var3 = 0; var3 < this.field6352; var3++) {
            for (int var4 = 0; var4 < this.field6356; var4++) {
                if (var3 == 0 || var4 == 0 || this.field6352 - 5 <= var3 || var4 >= this.field6356 - 5) {
                    this.field6346[var3][var4] = -1;
                } else {
                    this.field6346[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIIII)Z", line = 270)
    public final boolean method2613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6354++;
        int var11 = arg0 + arg7;
        int var12 = arg3 + arg5;
        int var13 = arg2 + arg6;
        int var14 = arg1 + arg9;
        if (arg4 != 8) {
            return false;
        }
        if (arg0 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg9 >= arg5 ? arg9 : arg5;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field6346[var13 - this.field6355 - 1][var15 - this.field6344] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg5 <= arg9 ? arg9 : arg5;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field6346[arg2 - this.field6355][var17 - this.field6344] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg2 < arg0 ? arg0 : arg2;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field6346[var19 - this.field6355][var14 - (this.field6344 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg2 < arg0 ? arg0 : arg2;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field6346[var21 - this.field6355][arg9 - this.field6344] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V", line = 365)
    public final void method2614(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6344;
        int var5 = arg2 - this.field6355;
        field6348++;
        this.field6346[var5][var4] = class266.method1624(this.field6346[var5][var4], 262144);
        if (arg0 > -83) {
            this.method2614(104, 6, -114);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIII)Z", line = 378)
    public final boolean method2615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6347++;
        if (arg0 != -26725) {
            return false;
        }
        if (arg6 == 1) {
            if (arg4 == arg7 && arg3 == arg5) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= arg4 + arg6 - 1 && arg5 >= arg5 && (arg5 + arg6 - 1) >= arg5) {
            return true;
        }
        int var9 = arg4 - this.field6355;
        int var10 = arg7 - this.field6355;
        int var11 = arg3 - this.field6344;
        int var12 = arg5 - this.field6344;
        if (arg6 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field6346[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field6346[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field6346[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field6346[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field6346[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field6346[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field6346[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field6346[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field6346[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field6346[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field6346[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if (var10 - arg6 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field6346[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg6) == var11 && (this.field6346[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 - arg6 == var9 && var11 <= var12 && var14 >= var12 && (this.field6346[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field6346[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field6346[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg6) == var11 && (this.field6346[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 >= var9 && var13 >= var10 && var12 - arg6 == var11) {
                        return true;
                    }
                    if ((var10 - arg6) == var9 && var11 <= var12 && var12 <= var14 && (this.field6346[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field6346[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var10 - arg6 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field6346[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg6) == var11 && (this.field6346[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - arg6) == var9 && var11 <= var12 && var14 >= var12 && (this.field6346[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg6 == var11 && (this.field6346[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - arg6) == var9 && var12 >= var11 && var14 >= var12 && (this.field6346[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field6346[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg6) == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg6) == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11 && (this.field6346[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12 && (this.field6346[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11 && (this.field6346[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var9 && var10 <= var13 && var12 - arg6 == var11 && (this.field6346[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var9 && var12 >= var11 && var12 <= var14 && (this.field6346[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field6346[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZII)V", line = 744)
    public final void method2616(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6344;
        if (arg0) {
            this.field6346 = null;
        }
        field6363++;
        int var5 = arg1 - this.field6355;
        this.field6346[var5][var4] = class249.method1537(this.field6346[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III)V", line = 760)
    public final void method2617(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6344;
        field6366++;
        int var5 = arg1 - this.field6355;
        this.field6346[var5][var4] = class266.method1624(this.field6346[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V", line = 779)
    public static final void method2618(class638 arg0, int arg1, int arg2, class391 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class449.field6276 = arg0;
        class548.field7414 = arg1;
        class161.field2478 = arg3;
        class507.field6949 = class449.field6276.method473() > 0;
        class532.field7247 = arg4 >> class627.field8753;
        class159.field2386 = arg6 >> class627.field8753;
        class7.field76 = arg4;
        class247.field3511 = arg6;
        class7.field59 = arg5;
        class380.field5354 = class532.field7247 - class614.field8507;
        if (class380.field5354 < 0) {
            class678.field9560 = -class380.field5354;
            class380.field5354 = 0;
        } else {
            class678.field9560 = 0;
        }
        class661.field9284 = class159.field2386 - class614.field8507;
        if (class661.field9284 < 0) {
            class106.field1424 = -class661.field9284;
            class661.field9284 = 0;
        } else {
            class106.field1424 = 0;
        }
        class426.field5996 = class614.field8507 + class532.field7247;
        if (class426.field5996 > class137.field1931) {
            class426.field5996 = class137.field1931;
        }
        class116.field1549 = class614.field8507 + class159.field2386;
        if (class116.field1549 > class22.field308) {
            class116.field1549 = class22.field308;
        }
        for (int var18 = 0; var18 < class614.field8507 + class614.field8507 + 2; var18++) {
            for (int var23 = 0; var23 < class614.field8507 + class614.field8507 + 2; var23++) {
                int var24 = class532.field7247 + var18 - class614.field8507;
                int var25 = class159.field2386 + var23 - class614.field8507;
                if (var24 >= 0 && var25 >= 0 && var24 < class137.field1931 && var25 < class22.field308) {
                    int var26 = var24 << class627.field8753;
                    int var27 = var25 << class627.field8753;
                    int var28 = class31.field369[class31.field369.length - 1].method273(var24, var25) - (0x3E8 << class627.field8753 - 7);
                    int var29 = class581.field8114 == null ? class31.field369[0].method273(var24, var25) + class658.field9268 : class581.field8114[0].method273(var24, var25) + class658.field9268;
                    class81.field1138[var18][var23] = class449.field6276.method456(var26, var28, var27, var26, var29, var27);
                } else {
                    class81.field1138[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class614.field8507 + class614.field8507 + 1; var19++) {
            for (int var22 = 0; var22 < class614.field8507 + class614.field8507 + 1; var22++) {
                class525.field7157[var19][var22] = class81.field1138[var19][var22] || class81.field1138[var19 + 1][var22] || class81.field1138[var19][var22 + 1] || class81.field1138[var19 + 1][var22 + 1];
            }
        }
        class210.field3091 = arg8;
        class245.field3497 = arg9;
        class516.field7043 = arg10;
        class25.field332 = arg11;
        class638.field9066 = arg12;
        class158.method1096();
        class387.method2229((byte) 117, class449.field6276);
        for (class60 var20 = (class60) class91.field1210.method3676((byte) -127); var20 != null; var20 = (class60) class91.field1210.method3682(-18176)) {
            var20.method118(-30545);
            class399.method2266((byte) -63, var20);
        }
        if (class507.field6949) {
            for (int var21 = 0; var21 < class68.field935; var21++) {
                class324.field4793[var21].method2875(arg17, (byte) 110, arg1);
            }
        }
        if (arg2 > 1) {
            class449.field6276.method394(0);
            if (class220.field3196 == null || class220.field3196 instanceof class464) {
                class220.field3196 = new class683();
            }
        } else if (class220.field3196 == null || class220.field3196 instanceof class683) {
            class220.field3196 = new class464();
        }
        class220.field3196.method2430(-124, arg2);
        class220.field3196.method2421((byte) 74);
        if (class690.field9701 != null) {
            class19.method100(true);
            class220.field3196.method2426(22, -4136);
            class158.method1094(arg2, null, 0, (byte) 0, arg15, arg16);
            class220.field3196.method2421((byte) 45);
            class220.field3196.method2426(23, -4136);
            class19.method100(false);
        }
        class158.method1094(arg2, arg7, arg13, arg14, arg15, arg16);
        class220.field3196.method2421((byte) 52);
        class220.field3196.method2427(-30496);
        class220.field3196.method2421((byte) 93);
        if (arg2 > 1) {
            class449.field6276.method382(0);
        }
        class449.field6276.method398(0, null);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V", line = 937)
    public static void method2619(int arg0) {
        field6350 = null;
        field6370 = null;
        if (arg0 != -680) {
            method2607(false, 7L);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBI)V", line = 954)
    private final void method2620(int arg0, int arg1, byte arg2, int arg3) {
        field6365++;
        if (arg2 <= -11) {
            this.field6346[arg3][arg0] = class266.method1624(this.field6346[arg3][arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZZIIBI)V", line = 975)
    public final void method2621(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 != 25) {
            this.method2621(-45, 90, false, true, -92, -56, (byte) 49, 71);
        }
        field6349++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg1;
            arg1 = arg5;
            arg5 = var10;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var11 = arg7 - this.field6355;
        int var12 = arg0 - this.field6344;
        for (int var13 = var11; var13 < (arg1 + var11); var13++) {
            if (var13 >= 0 && this.field6352 > var13) {
                for (int var14 = var12; var14 < arg5 + var12; var14++) {
                    if (var14 >= 0 && this.field6356 > var14) {
                        this.method2609(var14, false, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIIIZII)V", line = 1029)
    public final void method2622(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field6344;
        int var9 = arg5 - this.field6355;
        field6369++;
        if (arg3 != 10534) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method2620(var8, 128, (byte) -31, var9);
                this.method2620(var8, 8, (byte) -114, var9 - 1);
            }
            if (arg6 == 1) {
                this.method2620(var8, 2, (byte) -109, var9);
                this.method2620(var8 + 1, 32, (byte) -125, var9);
            }
            if (arg6 == 2) {
                this.method2620(var8, 8, (byte) -37, var9);
                this.method2620(var8, 128, (byte) -83, var9 + 1);
            }
            if (arg6 == 3) {
                this.method2620(var8, 32, (byte) -94, var9);
                this.method2620(var8 - 1, 2, (byte) -32, var9);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method2620(var8, 1, (byte) -78, var9);
                this.method2620(var8 + 1, 16, (byte) -110, var9 - 1);
            }
            if (arg6 == 1) {
                this.method2620(var8, 4, (byte) -52, var9);
                this.method2620(var8 + 1, 64, (byte) -123, var9 + 1);
            }
            if (arg6 == 2) {
                this.method2620(var8, 16, (byte) -117, var9);
                this.method2620(var8 - 1, 1, (byte) -65, var9 + 1);
            }
            if (arg6 == 3) {
                this.method2620(var8, 64, (byte) -127, var9);
                this.method2620(var8 - 1, 4, (byte) -85, var9 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                this.method2620(var8, 130, (byte) -86, var9);
                this.method2620(var8, 8, (byte) -127, var9 - 1);
                this.method2620(var8 + 1, 32, (byte) -65, var9);
            }
            if (arg6 == 1) {
                this.method2620(var8, 10, (byte) -40, var9);
                this.method2620(var8 + 1, 32, (byte) -94, var9);
                this.method2620(var8, 128, (byte) -93, var9 + 1);
            }
            if (arg6 == 2) {
                this.method2620(var8, 40, (byte) -28, var9);
                this.method2620(var8, 128, (byte) -19, var9 + 1);
                this.method2620(var8 - 1, 2, (byte) -108, var9);
            }
            if (arg6 == 3) {
                this.method2620(var8, 160, (byte) -35, var9);
                this.method2620(var8 - 1, 2, (byte) -19, var9);
                this.method2620(var8, 8, (byte) -40, var9 - 1);
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg6 == 0) {
                    this.method2620(var8, 65536, (byte) -29, var9);
                    this.method2620(var8, 4096, (byte) -70, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method2620(var8, 1024, (byte) -126, var9);
                    this.method2620(var8 + 1, 16384, (byte) -15, var9);
                }
                if (arg6 == 2) {
                    this.method2620(var8, 4096, (byte) -62, var9);
                    this.method2620(var8, 65536, (byte) -117, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method2620(var8, 16384, (byte) -14, var9);
                    this.method2620(var8 - 1, 1024, (byte) -16, var9);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg6 == 0) {
                    this.method2620(var8, 512, (byte) -128, var9);
                    this.method2620(var8 + 1, 8192, (byte) -109, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method2620(var8, 2048, (byte) -27, var9);
                    this.method2620(var8 + 1, 32768, (byte) -107, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method2620(var8, 8192, (byte) -98, var9);
                    this.method2620(var8 - 1, 512, (byte) -20, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method2620(var8, 32768, (byte) -90, var9);
                    this.method2620(var8 - 1, 2048, (byte) -92, var9 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg6 == 0) {
                    this.method2620(var8, 66560, (byte) -101, var9);
                    this.method2620(var8, 4096, (byte) -12, var9 - 1);
                    this.method2620(var8 + 1, 16384, (byte) -56, var9);
                }
                if (arg6 == 1) {
                    this.method2620(var8, 5120, (byte) -114, var9);
                    this.method2620(var8 + 1, 16384, (byte) -13, var9);
                    this.method2620(var8, 65536, (byte) -46, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method2620(var8, 20480, (byte) -26, var9);
                    this.method2620(var8, 65536, (byte) -58, var9 + 1);
                    this.method2620(var8 - 1, 1024, (byte) -102, var9);
                }
                if (arg6 == 3) {
                    this.method2620(var8, 81920, (byte) -38, var9);
                    this.method2620(var8 - 1, 1024, (byte) -126, var9);
                    this.method2620(var8, 4096, (byte) -19, var9 - 1);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method2620(var8, 536870912, (byte) -22, var9);
                this.method2620(var8, 33554432, (byte) -73, var9 - 1);
            }
            if (arg6 == 1) {
                this.method2620(var8, 8388608, (byte) -83, var9);
                this.method2620(var8 + 1, 134217728, (byte) -93, var9);
            }
            if (arg6 == 2) {
                this.method2620(var8, 33554432, (byte) -43, var9);
                this.method2620(var8, 536870912, (byte) -20, var9 + 1);
            }
            if (arg6 == 3) {
                this.method2620(var8, 134217728, (byte) -41, var9);
                this.method2620(var8 - 1, 8388608, (byte) -106, var9);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method2620(var8, 4194304, (byte) -67, var9);
                this.method2620(var8 + 1, 67108864, (byte) -75, var9 - 1);
            }
            if (arg6 == 1) {
                this.method2620(var8, 16777216, (byte) -89, var9);
                this.method2620(var8 + 1, 268435456, (byte) -48, var9 + 1);
            }
            if (arg6 == 2) {
                this.method2620(var8, 67108864, (byte) -87, var9);
                this.method2620(var8 - 1, 4194304, (byte) -126, var9 + 1);
            }
            if (arg6 == 3) {
                this.method2620(var8, 268435456, (byte) -88, var9);
                this.method2620(var8 - 1, 16777216, (byte) -64, var9 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method2620(var8, 545259520, (byte) -97, var9);
            this.method2620(var8, 33554432, (byte) -49, var9 - 1);
            this.method2620(var8 + 1, 134217728, (byte) -41, var9);
        }
        if (arg6 == 1) {
            this.method2620(var8, 41943040, (byte) -123, var9);
            this.method2620(var8 + 1, 134217728, (byte) -123, var9);
            this.method2620(var8, 536870912, (byte) -30, var9 + 1);
        }
        if (arg6 == 2) {
            this.method2620(var8, 167772160, (byte) -128, var9);
            this.method2620(var8, 536870912, (byte) -63, var9 + 1);
            this.method2620(var8 - 1, 8388608, (byte) -17, var9);
        }
        if (arg6 == 3) {
            this.method2620(var8, 671088640, (byte) -12, var9);
            this.method2620(var8 - 1, 8388608, (byte) -14, var9);
            this.method2620(var8, 33554432, (byte) -18, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZBLjava/awt/Component;)Lds;", line = 1350)
    public static final class14 method2623(boolean arg0, byte arg1, Component arg2) {
        field6368++;
        try {
            Constructor var3 = Class.forName("gk").getDeclaredConstructor(field6371 == null ? (field6371 = method2627("java.awt.Component")) : field6371, Boolean.TYPE);
            return (class14) var3.newInstance(arg2, Boolean.valueOf(arg0));
        } catch (Throwable var4) {
            if (arg1 >= -106) {
                field6350 = null;
            }
            return new class35(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBZIIZI)V", line = 1367)
    public final void method2624(int arg0, byte arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field6355;
        field6364++;
        int var9 = arg3 - this.field6344;
        if (arg4 == 0) {
            if (arg6 == 0) {
                this.method2609(var9, false, 128, var8);
                this.method2609(var9, false, 8, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2609(var9, false, 2, var8);
                this.method2609(var9 + 1, false, 32, var8);
            }
            if (arg6 == 2) {
                this.method2609(var9, false, 8, var8);
                this.method2609(var9, false, 128, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2609(var9, false, 32, var8);
                this.method2609(var9 - 1, false, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg6 == 0) {
                this.method2609(var9, false, 1, var8);
                this.method2609(var9 + 1, false, 16, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2609(var9, false, 4, var8);
                this.method2609(var9 + 1, false, 64, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2609(var9, false, 16, var8);
                this.method2609(var9 - 1, false, 1, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2609(var9, false, 64, var8);
                this.method2609(var9 - 1, false, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg6 == 0) {
                this.method2609(var9, false, 130, var8);
                this.method2609(var9, false, 8, var8 - 1);
                this.method2609(var9 + 1, false, 32, var8);
            }
            if (arg6 == 1) {
                this.method2609(var9, false, 10, var8);
                this.method2609(var9 + 1, false, 32, var8);
                this.method2609(var9, false, 128, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2609(var9, false, 40, var8);
                this.method2609(var9, false, 128, var8 + 1);
                this.method2609(var9 - 1, false, 2, var8);
            }
            if (arg6 == 3) {
                this.method2609(var9, false, 160, var8);
                this.method2609(var9 - 1, false, 2, var8);
                this.method2609(var9, false, 8, var8 - 1);
            }
        }
        if (arg1 != -32) {
            return;
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    this.method2609(var9, false, 65536, var8);
                    this.method2609(var9, false, 4096, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method2609(var9, false, 1024, var8);
                    this.method2609(var9 + 1, false, 16384, var8);
                }
                if (arg6 == 2) {
                    this.method2609(var9, false, 4096, var8);
                    this.method2609(var9, false, 65536, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method2609(var9, false, 16384, var8);
                    this.method2609(var9 - 1, false, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg6 == 0) {
                    this.method2609(var9, false, 512, var8);
                    this.method2609(var9 + 1, false, 8192, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method2609(var9, false, 2048, var8);
                    this.method2609(var9 + 1, false, 32768, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2609(var9, false, 8192, var8);
                    this.method2609(var9 - 1, false, 512, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method2609(var9, false, 32768, var8);
                    this.method2609(var9 - 1, false, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    this.method2609(var9, false, 66560, var8);
                    this.method2609(var9, false, 4096, var8 - 1);
                    this.method2609(var9 + 1, false, 16384, var8);
                }
                if (arg6 == 1) {
                    this.method2609(var9, false, 5120, var8);
                    this.method2609(var9 + 1, false, 16384, var8);
                    this.method2609(var9, false, 65536, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2609(var9, false, 20480, var8);
                    this.method2609(var9, false, 65536, var8 + 1);
                    this.method2609(var9 - 1, false, 1024, var8);
                }
                if (arg6 == 3) {
                    this.method2609(var9, false, 81920, var8);
                    this.method2609(var9 - 1, false, 1024, var8);
                    this.method2609(var9, false, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg6 == 0) {
                this.method2609(var9, false, 536870912, var8);
                this.method2609(var9, false, 33554432, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2609(var9, false, 8388608, var8);
                this.method2609(var9 + 1, false, 134217728, var8);
            }
            if (arg6 == 2) {
                this.method2609(var9, false, 33554432, var8);
                this.method2609(var9, false, 536870912, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2609(var9, false, 134217728, var8);
                this.method2609(var9 - 1, false, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg6 == 0) {
                this.method2609(var9, false, 4194304, var8);
                this.method2609(var9 + 1, false, 67108864, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2609(var9, false, 16777216, var8);
                this.method2609(var9 + 1, false, 268435456, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2609(var9, false, 67108864, var8);
                this.method2609(var9 - 1, false, 4194304, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2609(var9, false, 268435456, var8);
                this.method2609(var9 - 1, false, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method2609(var9, false, 545259520, var8);
            this.method2609(var9, false, 33554432, var8 - 1);
            this.method2609(var9 + 1, false, 134217728, var8);
        }
        if (arg6 == 1) {
            this.method2609(var9, false, 41943040, var8);
            this.method2609(var9 + 1, false, 134217728, var8);
            this.method2609(var9, false, 536870912, var8 + 1);
        }
        if (arg6 == 2) {
            this.method2609(var9, false, 167772160, var8);
            this.method2609(var9, false, 536870912, var8 + 1);
            this.method2609(var9 - 1, false, 8388608, var8);
        }
        if (arg6 == 3) {
            this.method2609(var9, false, 671088640, var8);
            this.method2609(var9 - 1, false, 8388608, var8);
            this.method2609(var9, false, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIIIIIII)Z", line = 1671)
    public final boolean method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6359++;
        if (arg3 == 1) {
            if (arg0 == arg6 && arg2 == arg5) {
                return true;
            }
        } else if (arg6 <= arg0 && arg0 <= arg3 + arg6 - 1 && arg5 <= arg5 && (arg5 + arg3 - 1) >= arg5) {
            return true;
        }
        int var9 = arg2 - this.field6344;
        int var10 = arg5 - this.field6344;
        int var11 = arg0 - this.field6355;
        int var12 = arg6 - this.field6355;
        if (arg3 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6346[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field6346[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field6346[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field6346[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field6346[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field6346[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field6346[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var12 - 1;
            int var14 = arg3 + var9 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field6346[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 - arg3 == var9 && (this.field6346[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg3) == var12 && var9 <= var10 && var14 >= var10 && (this.field6346[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 - arg3 == var9 && (this.field6346[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - arg3 == var12 && var10 >= var9 && var10 <= var14 && (this.field6346[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9 && (this.field6346[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14 && (this.field6346[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field6346[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9 && (this.field6346[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && (var10 - arg3) == var9 && (this.field6346[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg3 == var12 && var10 >= var9 && var14 >= var10 && (this.field6346[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 <= var10 && var14 >= var10 && (this.field6346[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg4 <= 67) {
            field6350 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(III)V", line = 1868)
    public final void method2626(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6355;
        if (arg0 != 2883842) {
            field6351 = -107;
        }
        field6358++;
        int var5 = arg1 - this.field6344;
        this.field6346[var4][var5] = class249.method1537(this.field6346[var4][var5], -262145);
    }
}
