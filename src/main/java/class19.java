import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class19 extends class335 {

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "[I")
    public static int[] field256 = new int[50];

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field258 = 0;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Z")
    public static boolean field259 = false;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[[Lfm;")
    public static class127[][] field254;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "[[[B")
    public static byte[][][] field260;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V", line = 5)
    public static void method144(byte arg0) {
        field254 = (class127[][]) null;
        field256 = null;
        field260 = (byte[][][]) null;
        if (arg0 > -20) {
            method144((byte) 4);
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V", line = 18)
    public static final void method145(int arg0) {
        if (arg0 <= 29) {
            method150(82);
        }
        field251++;
        class149.field2261.method2176((byte) 100);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JZ)V", line = 30)
    public static final void method146(long arg0, boolean arg1) {
        field255++;
        int var3 = class297.field4577 + class98.field1566.field1905;
        if (!class139.field2170) {
            class259.field4063 += (float) arg0 * class193.field2888 / 40.0F;
            class30.field443 += (float) arg0 * class121.field1846 / 40.0F;
        }
        if (arg1) {
            field259 = false;
        }
        int var4 = class83.field1290 + class98.field1566.field1868;
        if ((class239.field3807 - var3) < -500 || (class239.field3807 - var3) > 500 || class106.field1647 - var4 < -500 || class106.field1647 - var4 > 500) {
            class239.field3807 = var3;
            class106.field1647 = var4;
        }
        if (class239.field3807 != var3) {
            int var5 = var3 - class239.field3807;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class239.field3807 += var6;
        }
        if (class106.field1647 != var4) {
            int var7 = var4 - class106.field1647;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class106.field1647 += var8;
        }
        class108.method795((byte) -92);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V", line = 119)
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field250++;
        if (arg2 != 2) {
            method150(-105);
        }
        if (arg3 == arg7) {
            class133.method979(arg0, arg6, arg5, arg7, true, arg1, arg4);
        } else if (class206.field3170 <= arg0 - arg7 && arg0 + arg7 <= class12.field184 && (arg4 - arg3) >= class119.field1817 && (arg3 + arg4) <= class141.field2187) {
            class47.method412(arg3, arg0, arg1, arg5, arg6, arg7, arg4, (byte) -82);
        } else {
            class50.method418(arg0, arg1, (byte) -11, arg6, arg7, arg4, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lkh;ZIIIIIIIZ)V", line = 148)
    public static final void method148(class166 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        byte var10 = 0;
        int var11 = arg7;
        field257++;
        if (arg5 == 1) {
            var10 = 1;
        } else if (arg5 == 2) {
            var11 = 1;
            var10 = 1;
        } else if (arg5 == 3) {
            var11 = 1;
        }
        if (arg8 < 0 || arg8 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var14 = arg0.method1178(arg7 ^ 0x0);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method1178(0);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method1178(0);
                }
            }
            return;
        }
        if (!arg9 && !arg1) {
            class92.field1468[arg6][arg8][arg4] = 0;
        }
        while (true) {
            int var12 = arg0.method1178(0);
            if (var12 == 0) {
                if (arg9) {
                    class218.field3321[0][arg8 + var11][arg4 + var10] = class216.field3293[0][arg8 + var11][arg4 + var10];
                } else if (arg6 == 0) {
                    class218.field3321[0][arg8 + var11][arg4 + var10] = -class117.method863(arg3 + 556238, -148803615, arg2 + 932731) * 8;
                } else {
                    class218.field3321[arg6][arg8 + var11][arg4 + var10] = class218.field3321[arg6 - 1][arg8 + var11][arg4 + var10] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg0.method1178(0);
                if (arg9) {
                    class218.field3321[0][arg8 + var11][arg4 + var10] = class216.field3293[0][arg8 + var11][arg4 + var10] + (var13 * 8);
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 == 0) {
                        class218.field3321[0][arg8 + var11][arg4 + var10] = -var13 * 8;
                    } else {
                        class218.field3321[arg6][arg8 + var11][arg4 + var10] = class218.field3321[arg6 - 1][arg8 + var11][arg4 + var10] - (var13 * 8);
                    }
                }
                break;
            }
            if (var12 > 49) {
                if (var12 > 81) {
                    if (!arg1) {
                        class239.field3816[arg6][arg8][arg4] = (byte) (var12 - 81);
                    }
                } else if (!arg9 && !arg1) {
                    class92.field1468[arg6][arg8][arg4] = (byte) (var12 - 49);
                }
            } else if (arg1) {
                arg0.method1178(0);
            } else {
                class264.field4104[arg6][arg8][arg4] = arg0.method1143(-110);
                class339.field5307[arg6][arg8][arg4] = (byte) ((var12 - 2) / 4);
                class1.field8[arg6][arg8][arg4] = (byte) class270.method1860(3, arg5 + var12 - 2);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 273)
    public class19() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I", line = 281)
    public final int[] method149(int arg0, int arg1) {
        field253++;
        if (arg1 != 621) {
            return (int[]) null;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class105.field1630; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)Z", line = 323)
    public static final boolean method150(int arg0) {
        field252++;
        int var1 = 13 % ((-arg0 - 48) / 36);
        return class94.field1516 ? true : class242.field3876;
    }
}
