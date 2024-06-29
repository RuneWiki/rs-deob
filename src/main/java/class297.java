import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class297 {

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
    public boolean field4833 = false;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Z")
    public boolean field4834 = false;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field4832 = -1;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public int field4840 = 2;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public int field4843 = 64;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field4839 = 1;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public int field4846 = 64;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4847 = new String[] { method2567(method2566("HDJB")), method2567(method2566("]\u001f\b\u0000F")), method2567(method2566("U\\\bh\u0013")), method2567(method2566("U\\\bm\u0013")), method2567(method2566("U\\\bf\u0013")), method2567(method2566("U\\\bj\u0013")), method2567(method2566("U\\\bo\u0013")), method2567(method2566("U\\\bk\u0013")), method2567(method2566("U\\\bl\u0013")), method2567(method2566("U\\\bi\u0013")) };

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[Lii;")
    public static class580[] field4841 = new class580[4];

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[I")
    public static int[] field4845 = new int[2];

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILnh;Z)Z", line = 3)
    public static final boolean method2558(int arg0, class781 arg1, boolean arg2) {
        try {
            class256.field3897.method2457(arg1.field11403[arg0], arg1.field11409[arg0], arg1.field11400[arg0], class173.field2768);
            field4836++;
            int var3 = class173.field2768[2];
            if (var3 < 50) {
                return false;
            }
            arg1.field11395[arg0] = (short) (class173.field2768[0] * class121.field1738 / var3 + class47.field563);
            if (arg2) {
                field4841 = null;
            }
            arg1.field11407[arg0] = (short) (class173.field2768[1] * class62.field851 / var3 + class516.field7618);
            arg1.field11398[arg0] = (short) var3;
            return true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4847[8] + arg0 + ',' + (arg1 == null ? field4847[0] : field4847[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 25)
    public static final byte[] method2559(boolean arg0, Object arg1, boolean arg2) {
        try {
            field4830++;
            if (arg1 == null) {
                return null;
            } else if (arg1 instanceof byte[]) {
                byte[] var3 = (byte[]) arg1;
                return arg2 ? class758.method5476(var3, (byte) -112) : var3;
            } else if (arg1 instanceof class129) {
                class129 var4 = (class129) arg1;
                return var4.method37((byte) 8);
            } else if (arg0) {
                throw new IllegalArgumentException();
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4847[6] + arg0 + ',' + (arg1 == null ? field4847[0] : field4847[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIII)V", line = 60)
    public static final void method2560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (arg8 != 14091) {
                method2563(115, 11, -30, 87, -68, -42, 43);
            }
            if (arg0 == arg1 && arg3 == arg6 && arg4 == arg9 && arg5 == arg7) {
                class65.method690(0, arg2, arg6, arg1, arg5, arg9);
            } else {
                int var10 = arg1;
                int var11 = arg6;
                int var12 = arg1 * 3;
                int var13 = arg6 * 3;
                int var14 = arg0 * 3;
                int var15 = arg3 * 3;
                int var16 = arg4 * 3;
                int var17 = arg7 * 3;
                int var18 = arg9 + var14 - (arg1 + var16);
                int var19 = var15 + arg5 - var17 - arg6;
                int var20 = var16 + var12 - (var14 + var14);
                int var21 = var17 + var13 - var15 - var15;
                int var22 = var14 - var12;
                int var23 = var15 - var13;
                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = (var27 + var29 + var31 >> 12) + arg1;
                    int var34 = (var28 + var30 + var32 >> 12) + arg6;
                    class65.method690(arg8 - 14091, arg2, var11, var10, var34, var33);
                    var11 = var34;
                    var10 = var33;
                }
            }
            field4842++;
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field4847[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILwq;I)V", line = 138)
    public final void method2561(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 == 4) {
                while (true) {
                    int var4 = arg1.method1645((byte) -123);
                    if (var4 == 0) {
                        field4844++;
                        return;
                    }
                    this.method2562(-126, var4, arg2, arg1);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4847[3] + arg0 + ',' + (arg1 == null ? field4847[0] : field4847[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILwq;)V", line = 167)
    private final void method2562(int arg0, int arg1, int arg2, class176 arg3) {
        try {
            if (arg1 == 1) {
                this.field4832 = arg3.method1687((byte) -111);
                if (this.field4832 == 65535) {
                    this.field4832 = -1;
                }
            } else if (arg1 == 2) {
                this.field4843 = arg3.method1687((byte) -41) + 1;
                this.field4846 = arg3.method1687((byte) -121) + 1;
            } else if (arg1 == 3) {
                arg3.method1672(-47);
            } else if (arg1 == 4) {
                this.field4840 = arg3.method1645((byte) -104);
            } else if (arg1 == 5) {
                this.field4839 = arg3.method1645((byte) -101);
            } else if (arg1 == 6) {
                this.field4834 = true;
            } else if (arg1 == 7) {
                this.field4833 = true;
            }
            field4831++;
            int var5 = -33 % ((2 - arg0) / 41);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4847[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4847[0] : field4847[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII)V", line = 218)
    public static final void method2563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field4837++;
            for (class441 var7 = (class441) class195.field3093.method749(0); var7 != null; var7 = (class441) class195.field3093.method747((byte) 21)) {
                if (class431.field6776 >= var7.field6888) {
                    var7.method1715(-20685);
                } else {
                    class487.method3698((var7.field6880 << 9) + 256, var7.field6881, var7.field6885 * 2, (var7.field6883 << 9) + 256, arg2, arg3 >> 1, arg5, arg6 >> 1, arg1 ^ 0xFFFF0002);
                    class461.field7108.method680(class208.field3248[1] + arg0, (byte) -78, 0, class208.field3248[0] + arg4, var7.field6889 | 0xFF000000, var7.field6886);
                }
            }
            if (arg1 != 2) {
                method2560(-1, -1, 96, 77, -35, 6, 97, 61, 57, 49);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4847[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 254)
    public static final void method2564(Canvas arg0, int arg1) {
        try {
            field4838++;
            if (arg1 != 3) {
                field4841 = null;
            }
            Dimension var2 = arg0.getSize();
            class244.method2105(var2.width, var2.height, arg1 ^ 0x73);
            if (class184.field2931 == 1) {
                class761.field11182.method232(arg0, class82.field1244, class413.field6569);
            } else {
                class761.field11182.method232(arg0, class263.field4279, class705.field10114);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4847[2] + (arg0 == null ? field4847[0] : field4847[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 273)
    public static void method2565(byte arg0) {
        try {
            if (arg0 == -57) {
                field4845 = null;
                field4841 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4847[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2566(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2567(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
