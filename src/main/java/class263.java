import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class263 {

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lij;")
    private class421 field3785 = null;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "Lij;")
    private class421 field3794 = null;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    private int field3795 = 65000;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    private int field3793;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "Lbd;")
    public static class60 field3792 = new class60(4, 3);

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "Lha;")
    public static class58 field3799;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI[BII)Z", line = 3)
    private final boolean method1719(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field3787++;
        class421 var6 = this.field3785;
        synchronized (this.field3785) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg3 * 6 + 6) > this.field3794.method2579(-74)) {
                        return false;
                    }
                    this.field3794.method2581((long) (arg3 * 6), true);
                    this.field3794.method2584(0, class733.field10222, 6, (byte) -78);
                    var8 = (class733.field10222[5] & 0xFF) + (class733.field10222[4] & 0xFF << 8) + (class733.field10222[3] & 0xFF << 16);
                    if (var8 <= 0 || this.field3785.method2579(-38) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3785.method2579(-66) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class733.field10222[4] = (byte) (var8 >> 8);
                class733.field10222[5] = (byte) var8;
                class733.field10222[0] = (byte) (arg4 >> 16);
                class733.field10222[2] = (byte) arg4;
                class733.field10222[3] = (byte) (var8 >> 16);
                class733.field10222[1] = (byte) (arg4 >> 8);
                this.field3794.method2581((long) (arg3 * 6), true);
                this.field3794.method2578(6, (byte) 125, class733.field10222, 0);
                int var10 = 0;
                int var11 = -121 % ((arg1 - 65) / 56);
                int var12 = 0;
                while (arg4 > var10) {
                    int var13 = 0;
                    if (arg0) {
                        label104: {
                            this.field3785.method2581((long) (var8 * 520), true);
                            try {
                                this.field3785.method2584(0, class733.field10222, 8, (byte) -78);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = (class733.field10222[0] & 0xFF << 8) + (class733.field10222[1] & 0xFF);
                            int var15 = (class733.field10222[2] & 0xFF << 8) + (class733.field10222[3] & 0xFF);
                            var13 = ((class733.field10222[4] & 0xFF) << 16) + ((class733.field10222[5] & 0xFF) << 8) + (class733.field10222[6] & 0xFF);
                            int var16 = class733.field10222[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field3793 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field3785.method2579(-18) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field3785.method2579(-103) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class733.field10222[3] = (byte) var12;
                    class733.field10222[1] = (byte) arg3;
                    class733.field10222[2] = (byte) (var12 >> 8);
                    class733.field10222[0] = (byte) (arg3 >> 8);
                    if (arg4 - var10 <= 512) {
                        var13 = 0;
                    }
                    class733.field10222[5] = (byte) (var13 >> 8);
                    class733.field10222[6] = (byte) var13;
                    class733.field10222[7] = (byte) this.field3793;
                    class733.field10222[4] = (byte) (var13 >> 16);
                    this.field3785.method2581((long) (var8 * 520), true);
                    this.field3785.method2578(8, (byte) 119, class733.field10222, 0);
                    int var19 = arg4 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3785.method2578(var19, (byte) 97, arg2, var10);
                    var8 = var13;
                    var10 += var19;
                    var12++;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III[B)Z", line = 129)
    public final boolean method1720(int arg0, int arg1, int arg2, byte[] arg3) {
        field3796++;
        class421 var5 = this.field3785;
        synchronized (this.field3785) {
            if (arg1 < arg2 || arg1 > this.field3795) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1719(true, -47, arg3, arg0, arg1);
            if (!var6) {
                var6 = this.method1719(false, 122, arg3, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)[B", line = 157)
    public final byte[] method1721(int arg0, int arg1) {
        field3790++;
        class421 var3 = this.field3785;
        synchronized (this.field3785) {
            try {
                if (this.field3794.method2579(-77) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field3794.method2581((long) (arg1 * 6), true);
                this.field3794.method2584(0, class733.field10222, 6, (byte) -78);
                int var5 = (class733.field10222[1] & 0xFF << 8) + ((class733.field10222[0] & 0xFF) << 16) + (class733.field10222[2] & arg0);
                int var6 = (class733.field10222[5] & 0xFF) + ((class733.field10222[4] & 0xFF) << 8) + (class733.field10222[3] & 0xFF << 16);
                if (var5 < 0 || this.field3795 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3785.method2579(-57) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3785.method2581((long) (var6 * 520), true);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3785.method2584(0, class733.field10222, var13 + 8, (byte) -78);
                        int var14 = (class733.field10222[0] & 0xFF << 8) + (class733.field10222[1] & 0xFF);
                        int var15 = (class733.field10222[2] & 0xFF << 8) + (class733.field10222[3] & 0xFF);
                        int var16 = (class733.field10222[6] & 0xFF) + ((class733.field10222[4] & 0xFF << 16) + (class733.field10222[5] & 0xFF << 8));
                        int var17 = class733.field10222[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3793 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field3785.method2579(-45) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class733.field10222[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V", line = 235)
    public static void method1722(int arg0) {
        field3799 = null;
        field3792 = null;
        if (arg0 != -28916) {
            field3799 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIBII)Z", line = 247)
    public static final boolean method1723(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3797++;
        int var7 = arg2 + arg6;
        int var8 = arg0 + arg5;
        int var9 = arg1 + arg3;
        if (!class553.method3203(arg6, var8, var9, 0, arg6, var8, var7, arg3, var8, var9)) {
            return false;
        } else if (class553.method3203(arg6, var8, var9, 0, var7, var8, var7, arg3, var8, arg3)) {
            if (class373.field5241 <= arg6) {
                if (!class553.method3203(var7, var8, var9, 0, var7, arg5, var7, var9, var8, arg3)) {
                    return false;
                }
                if (!class553.method3203(var7, arg5, arg3, 0, var7, arg5, var7, var9, var8, arg3)) {
                    return false;
                }
            } else if (!class553.method3203(arg6, var8, var9, 0, arg6, arg5, arg6, var9, var8, arg3)) {
                return false;
            } else if (!class553.method3203(arg6, arg5, arg3, 0, arg6, arg5, arg6, var9, var8, arg3)) {
                return false;
            }
            if (arg4 < 64) {
                method1722(-62);
            }
            if (arg3 < class644.field8823) {
                if (!class553.method3203(arg6, var8, arg3, 0, arg6, arg5, var7, arg3, var8, arg3)) {
                    return false;
                }
                if (!class553.method3203(arg6, arg5, arg3, 0, var7, arg5, var7, arg3, var8, arg3)) {
                    return false;
                }
            } else if (!class553.method3203(arg6, var8, var9, 0, arg6, arg5, var7, var9, var8, var9)) {
                return false;
            } else if (!class553.method3203(arg6, arg5, var9, 0, var7, arg5, var7, var9, var8, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(ILij;Lij;I)V", line = 716)
    public class263(int arg0, class421 arg1, class421 arg2, int arg3) {
        this.field3795 = arg3;
        this.field3785 = arg1;
        this.field3794 = arg2;
        this.field3793 = arg0;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIILuu;IIIII)Z", line = 318)
    public static final boolean method1724(int arg0, int arg1, int arg2, int arg3, int arg4, class285 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3789++;
        if (arg6 >= -76) {
            method1724(11, -97, -84, 60, 66, null, -46, 29, -65, -74, -67);
        }
        int var11 = arg0;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        int var16 = arg3 - var14;
        class584.field8220[var13][var14] = 99;
        class207.field2722[var13][var14] = 0;
        byte var17 = 0;
        class584.field8223[var17] = arg0;
        int var18 = 0;
        int var26 = var17 + 1;
        class538.field7549[var17] = arg3;
        int[][] var19 = arg5.field4035;
        while (var26 != var18) {
            var12 = class538.field7549[var18];
            var11 = class584.field8223[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field4046;
            int var23 = var12 - arg5.field4041;
            if (arg7 == -4) {
                if (arg1 == var11 && arg2 == var12) {
                    class102.field1217 = var12;
                    class721.field10007 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class427.method2601(arg10, arg1, 2, var12, arg8, true, 2, var11, arg2)) {
                    class721.field10007 = var11;
                    class102.field1217 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg5.method1866(arg8, arg10, 2, var12, arg1, -1, 2, arg2, arg9, var11)) {
                    class102.field1217 = var12;
                    class721.field10007 = var11;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg5.method1865(var11, arg8, arg10, var12, arg2, 2, arg1, arg9, false)) {
                    class721.field10007 = var11;
                    class102.field1217 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg5.method1872(var11, var12, arg1, 2, arg7, arg2, arg4, -1)) {
                    class102.field1217 = var12;
                    class721.field10007 = var11;
                    return true;
                }
            } else if (arg5.method1869(arg2, arg1, arg4, var11, var12, (byte) 99, arg7, 2)) {
                class102.field1217 = var12;
                class721.field10007 = var11;
                return true;
            }
            int var25 = class207.field2722[var21][var20] + 1;
            if (var21 > 0 && class584.field8220[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class584.field8223[var26] = var11 - 1;
                class538.field7549[var26] = var12;
                class584.field8220[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class207.field2722[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class584.field8220[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class584.field8220[var21 + 1][var20] = 8;
                class207.field2722[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class584.field8220[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class584.field8223[var26] = var11;
                class538.field7549[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class584.field8220[var21][var20 - 1] = 1;
                class207.field2722[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class584.field8220[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class584.field8223[var26] = var11;
                class538.field7549[var26] = var12 + 1;
                class584.field8220[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class207.field2722[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class584.field8220[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class584.field8223[var26] = var11 - 1;
                class538.field7549[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class584.field8220[var21 - 1][var20 - 1] = 3;
                class207.field2722[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class584.field8220[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class584.field8220[var21 + 1][var20 - 1] = 9;
                class207.field2722[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class584.field8220[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class584.field8223[var26] = var11 - 1;
                class538.field7549[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class584.field8220[var21 - 1][var20 + 1] = 6;
                class207.field2722[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class584.field8220[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12 + 1;
                class584.field8220[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class207.field2722[var21 + 1][var20 + 1] = var25;
            }
        }
        class102.field1217 = var12;
        class721.field10007 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z", line = 672)
    public static final boolean method1725(int arg0, int arg1, int arg2) {
        field3798++;
        if (arg2 != -6947) {
            field3792 = null;
        }
        return (arg0 & 0x40000) != 0 | class19.method118((byte) 9, arg1, arg0) || class748.method4157(arg1, arg0, 55);
    }

    @OriginalMember(owner = "client!mda", name = "toString", descriptor = "()Ljava/lang/String;", line = 690)
    public final String toString() {
        field3786++;
        return "Cache:" + this.field3793;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)I", line = 705)
    public static final int method1726(int arg0, int arg1) {
        field3791++;
        if (arg1 != 6) {
            method1725(-57, -95, -41);
        }
        return arg0 & 0x7F;
    }
}
