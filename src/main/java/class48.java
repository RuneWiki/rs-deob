import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class48 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    private int field660 = 65000;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lpe;")
    private class277 field662 = null;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lpe;")
    private class277 field668 = null;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[[S")
    public static short[][] field659 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([BIZII)Z", line = 4)
    private final boolean method362(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field665++;
        class277 var6 = this.field662;
        synchronized (this.field662) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (this.field668.method1917((byte) -85) < (long) (arg1 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field668.method1921((byte) -102, (long) (arg1 * 6));
                    this.field668.method1924(0, class335.field5206, true, 6);
                    var7 = ((class335.field5206[4] & 0xFF) << 8) + (class335.field5206[3] & 0xFF << 16) + (class335.field5206[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field662.method1917((byte) -85) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field662.method1917((byte) -85) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class335.field5206[0] = (byte) (arg4 >> 16);
                class335.field5206[4] = (byte) (var7 >> 8);
                class335.field5206[1] = (byte) (arg4 >> 8);
                class335.field5206[2] = (byte) arg4;
                class335.field5206[3] = (byte) (var7 >> 16);
                class335.field5206[5] = (byte) var7;
                int var8 = 0;
                int var9 = 0;
                this.field668.method1921((byte) -102, (long) (arg1 * 6));
                this.field668.method1923(arg3, class335.field5206, -1, 6);
                while (true) {
                    if (var8 < arg4) {
                        label135: {
                            int var10 = 0;
                            if (arg2) {
                                this.field662.method1921((byte) -102, (long) (var7 * 520));
                                try {
                                    this.field662.method1924(0, class335.field5206, true, 8);
                                } catch (EOFException var18) {
                                    break label135;
                                }
                                var10 = ((class335.field5206[4] & 0xFF) << 16) + ((class335.field5206[5] & 0xFF << 8) + (class335.field5206[6] & 0xFF));
                                int var12 = (class335.field5206[2] & 0xFF << 8) + (class335.field5206[3] & 0xFF);
                                int var13 = (class335.field5206[0] & 0xFF << 8) + (class335.field5206[1] & 0xFF);
                                int var14 = class335.field5206[7] & 0xFF;
                                if (arg1 != var13 || var9 != var12 || this.field667 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field662.method1917((byte) -85) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field662.method1917((byte) -85) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg2 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg4 - var8) <= 512) {
                                var10 = 0;
                            }
                            class335.field5206[6] = (byte) var10;
                            class335.field5206[5] = (byte) (var10 >> 8);
                            class335.field5206[0] = (byte) (arg1 >> 8);
                            class335.field5206[3] = (byte) var9;
                            class335.field5206[2] = (byte) (var9 >> 8);
                            var9++;
                            class335.field5206[1] = (byte) arg1;
                            class335.field5206[7] = (byte) this.field667;
                            class335.field5206[4] = (byte) (var10 >> 16);
                            this.field662.method1921((byte) -102, (long) (var7 * 520));
                            this.field662.method1923(0, class335.field5206, -1, 8);
                            var7 = var10;
                            int var15 = arg4 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field662.method1923(var8, arg0, arg3 - 1, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 123)
    public static final void method363(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field658++;
        if (arg3 != -769538808) {
            method368((long[]) null, -109, (Object[]) null);
        }
        if (arg2 >= arg4) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg2;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        Object var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg2; var9 < arg4; var9++) {
            if (arg0[var9] < (var7 + (var9 & 0x1))) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                Object var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method363(arg0, arg1, arg2, arg3 ^ 0x0, var6 - 1);
        method363(arg0, arg1, var6 + 1, -769538808, arg4);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[B", line = 181)
    public final byte[] method364(int arg0, int arg1) {
        field657++;
        class277 var3 = this.field662;
        synchronized (this.field662) {
            try {
                Object var10000;
                if (this.field668.method1917((byte) -85) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field668.method1921((byte) -102, (long) (arg0 * 6));
                this.field668.method1924(0, class335.field5206, true, 6);
                int var4 = (class335.field5206[5] & 0xFF) + (((class335.field5206[3] & 0xFF) << 16) + (class335.field5206[4] & 0xFF << 8));
                int var5 = ((class335.field5206[0] & 0xFF) << 16) + ((class335.field5206[1] & 0xFF) << 8) + (class335.field5206[2] & 0xFF);
                if (var5 < 0 || var5 > this.field660) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || (long) var4 > this.field662.method1917((byte) -85) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    byte[] var19;
                    if (arg1 < 81) {
                        var19 = (byte[]) null;
                        return var19;
                    }
                    int var7 = 0;
                    int var8 = 0;
                    while (var8 < var5) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var5 - var8;
                        this.field662.method1921((byte) -102, (long) (var4 * 520));
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field662.method1924(0, class335.field5206, true, var9 + 8);
                        int var10 = class335.field5206[7] & 0xFF;
                        int var11 = ((class335.field5206[4] & 0xFF) << 16) + (class335.field5206[5] & 0xFF << 8) + (class335.field5206[6] & 0xFF);
                        int var12 = (class335.field5206[0] & 0xFF << 8) + (class335.field5206[1] & 0xFF);
                        int var13 = ((class335.field5206[2] & 0xFF) << 8) + (class335.field5206[3] & 0xFF);
                        if (arg0 == var12 && var7 == var13 && this.field667 == var10) {
                            if (var11 >= 0 && this.field662.method1917((byte) -85) / 520L >= (long) var11) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var8++] = class335.field5206[var14 + 8];
                                }
                                var4 = var11;
                                var7++;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "toString", descriptor = "()Ljava/lang/String;", line = 265)
    public final String toString() {
        field663++;
        return "Cache:" + this.field667;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILpe;Lpe;I)V", line = 390)
    public class48(int arg0, class277 arg1, class277 arg2, int arg3) {
        this.field662 = arg1;
        this.field667 = arg0;
        this.field660 = arg3;
        this.field668 = arg2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BIB)Z", line = 277)
    public final boolean method365(int arg0, byte[] arg1, int arg2, byte arg3) {
        field666++;
        class277 var5 = this.field662;
        synchronized (this.field662) {
            if (arg2 < 0 || this.field660 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method362(arg1, arg0, true, 0, arg2);
            if (!var6) {
                var6 = this.method362(arg1, arg0, false, 0, arg2);
            }
            return arg3 < 118 ? false : var6;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 306)
    public static final void method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class135 var20 = new class135(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class213.field3262[var21][arg1][arg2] == null) {
                    class213.field3262[var21][arg1][arg2] = new class79(var21, arg1, arg2);
                }
            }
            class213.field3262[arg0][arg1][arg2].field1156 = var20;
        } else if (arg3 == 1) {
            class135 var22 = new class135(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class213.field3262[var23][arg1][arg2] == null) {
                    class213.field3262[var23][arg1][arg2] = new class79(var23, arg1, arg2);
                }
            }
            class213.field3262[arg0][arg1][arg2].field1156 = var22;
        } else {
            class271 var24 = new class271(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class213.field3262[var25][arg1][arg2] == null) {
                    class213.field3262[var25][arg1][arg2] = new class79(var25, arg1, arg2);
                }
            }
            class213.field3262[arg0][arg1][arg2].field1158 = var24;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 366)
    public static void method367(byte arg0) {
        if (arg0 > -7) {
            field659 = (short[][]) ((short[][]) null);
        }
        field659 = (short[][]) null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 376)
    public static final void method368(long[] arg0, int arg1, Object[] arg2) {
        class129.method986(arg2, arg0, arg0.length - 1, -1, 0);
        int var3 = -123 / ((90 - arg1) / 34);
        field664++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)Z", line = 404)
    public static final boolean method369(byte arg0, int arg1) {
        field661++;
        if (class314.field4874 == arg1) {
            return false;
        }
        class112.field1694 = new int[104][104];
        int var2 = 114 / ((arg0 - 22) / 50);
        class262.field4040 = new int[4][13][13];
        for (int var3 = 0; var3 < 4; var3++) {
            class91.field1323[var3] = new class345(104, 104);
        }
        class324.field5005 = new byte[4][104][104];
        class265.field4136 = new class281[4][104][104];
        class2.field25 = new byte[4][104][104];
        if (class73.field1058) {
            class315.method2161(4, 104, 104);
            class125.method932(104, 104);
            class258.field3966 = new class61[13][13];
        }
        class314.field4874 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V", line = 445)
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field669++;
        int var6 = -92 / ((-arg3 - 5) / 53);
        if (class182.field2888 < arg4 || class212.field3261 > arg1) {
            return;
        }
        boolean var7;
        if (arg5 < class234.field3569) {
            var7 = false;
            arg5 = class234.field3569;
        } else if (class322.field4965 >= arg5) {
            var7 = true;
        } else {
            var7 = false;
            arg5 = class322.field4965;
        }
        boolean var8;
        if (class234.field3569 > arg0) {
            arg0 = class234.field3569;
            var8 = false;
        } else if (class322.field4965 < arg0) {
            arg0 = class322.field4965;
            var8 = false;
        } else {
            var8 = true;
        }
        if (arg4 < class212.field3261) {
            arg4 = class212.field3261;
        } else {
            class7.method72(arg0, -7, arg5, class79.field1178[arg4++], arg2);
        }
        if (arg1 <= class182.field2888) {
            class7.method72(arg0, -7, arg5, class79.field1178[arg1--], arg2);
        } else {
            arg1 = class182.field2888;
        }
        if (var7 && var8) {
            for (int var9 = arg4; var9 <= arg1; var9++) {
                int[] var10 = class79.field1178[var9];
                var10[arg5] = var10[arg0] = arg2;
            }
        } else if (var7) {
            for (int var12 = arg4; var12 <= arg1; var12++) {
                class79.field1178[var12][arg5] = arg2;
            }
        } else if (var8) {
            for (int var11 = arg4; var11 <= arg1; var11++) {
                class79.field1178[var11][arg0] = arg2;
            }
        }
    }
}
