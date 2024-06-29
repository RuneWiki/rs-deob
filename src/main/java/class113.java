import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class113 extends class67 {

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    private int field1924 = 0;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    private int field1921 = -32768;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    private int field1927 = 0;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Z")
    private boolean field1933 = false;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Z")
    public boolean field1939 = false;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Lie;")
    private class2 field1938;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Leg;")
    public static class37 field1940 = class174.method1167("runes", 77);

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lbf;")
    public static class202 field1923 = new class202(20);

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Ldk;")
    private class193 field1922;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static void method805(byte arg0) {
        field1923 = null;
        if (arg0 > -99) {
            field1940 = null;
        }
        field1940 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILbl;)V")
    private final void method806(int arg0, class253 arg1) {
        field1934++;
        class209 var3 = (class209) arg1;
        if ((this.field1922 == null || this.field1922.field3289) && (var3.field3545 != null || var3.field3536 != null)) {
            this.field1922 = new class193(class72.field1146, 1, 1);
        }
        if (this.field1922 != null) {
            this.field1922.method1331(var3.field3545, var3.field3536, false, var3.field3558, var3.field3540, var3.field3534);
        }
        if (arg0 != -2575) {
            this.method312(25, 71, -119, -26, 13);
        }
        this.field1933 = true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lbl;")
    private final class253 method807(int arg0) {
        field1930++;
        if (arg0 != -1) {
            this.field1931 = 78;
        }
        class231 var2 = class79.method536(98, this.field1931);
        class253 var3;
        if (this.field1939) {
            var3 = var2.method1593(-1, -28023);
        } else {
            var3 = var2.method1593(this.field1924, -28023);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)Z")
    public static final boolean method808(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class59.field969; var3++) {
            class256 var4 = class187.field3195[var3];
            if (var4.field4543 == 1) {
                int var5 = var4.field4539 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4551 * var5 >> 8) + var4.field4550;
                    int var7 = (var4.field4532 * var5 >> 8) + var4.field4542;
                    int var8 = (var4.field4554 * var5 >> 8) + var4.field4553;
                    int var9 = (var4.field4535 * var5 >> 8) + var4.field4538;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4543 == 2) {
                int var10 = arg0 - var4.field4539;
                if (var10 > 0) {
                    int var11 = (var4.field4551 * var10 >> 8) + var4.field4550;
                    int var12 = (var4.field4532 * var10 >> 8) + var4.field4542;
                    int var13 = (var4.field4554 * var10 >> 8) + var4.field4553;
                    int var14 = (var4.field4535 * var10 >> 8) + var4.field4538;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4543 == 3) {
                int var15 = var4.field4550 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4545 * var15 >> 8) + var4.field4539;
                    int var17 = (var4.field4536 * var15 >> 8) + var4.field4540;
                    int var18 = (var4.field4554 * var15 >> 8) + var4.field4553;
                    int var19 = (var4.field4535 * var15 >> 8) + var4.field4538;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4543 == 4) {
                int var20 = arg2 - var4.field4550;
                if (var20 > 0) {
                    int var21 = (var4.field4545 * var20 >> 8) + var4.field4539;
                    int var22 = (var4.field4536 * var20 >> 8) + var4.field4540;
                    int var23 = (var4.field4554 * var20 >> 8) + var4.field4553;
                    int var24 = (var4.field4535 * var20 >> 8) + var4.field4538;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4543 == 5) {
                int var25 = arg1 - var4.field4553;
                if (var25 > 0) {
                    int var26 = (var4.field4545 * var25 >> 8) + var4.field4539;
                    int var27 = (var4.field4536 * var25 >> 8) + var4.field4540;
                    int var28 = (var4.field4551 * var25 >> 8) + var4.field4550;
                    int var29 = (var4.field4532 * var25 >> 8) + var4.field4542;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        field1928++;
        class253 var13 = this.method807(-1);
        if (var13 != null) {
            this.method806(-2575, var13);
            var13.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1922);
            this.field1921 = var13.method308();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public final void method809(int arg0, byte arg1) {
        field1925++;
        if (this.field1939) {
            return;
        }
        this.field1927 += arg0;
        while (this.field1938.field46[this.field1924] < this.field1927) {
            this.field1927 -= this.field1938.field46[this.field1924];
            this.field1924++;
            if (this.field1924 >= this.field1938.field24.length) {
                this.field1939 = true;
                break;
            }
        }
        if (arg1 != -64) {
            this.field1938 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLpe;)Lpe;")
    public static final class237 method810(boolean arg0, class237 arg1) {
        field1936++;
        if (arg0) {
            field1918 = -4;
        }
        if (arg1.field4171 != -1) {
            return class156.method1066(-80, arg1.field4171);
        }
        int var2 = arg1.field4211 >>> 16;
        class168 var3 = new class168(class120.field2022);
        for (class190 var4 = (class190) var3.method1128((byte) -12); var4 != null; var4 = (class190) var3.method1127(-91)) {
            if (var4.field3259 == var2) {
                return class156.method1066(-114, (int) var4.field1027);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIILme;Lme;IIIIJ)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, class67 arg4, class67 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class273 var12 = new class273();
        var12.field4781 = arg10;
        var12.field4783 = arg1 * 128 + 64;
        var12.field4775 = arg2 * 128 + 64;
        var12.field4785 = arg3;
        var12.field4780 = arg4;
        var12.field4791 = arg5;
        var12.field4795 = arg6;
        var12.field4777 = arg7;
        var12.field4786 = arg8;
        var12.field4784 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class286.field5048[var13][arg1][arg2] == null) {
                class286.field5048[var13][arg1][arg2] = new class111(var13, arg1, arg2);
            }
        }
        class286.field5048[arg0][arg1][arg2].field1875 = var12;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1919++;
        if (arg8 >= -9) {
            return;
        }
        if (arg5 == arg7 && arg0 == arg4 && arg6 == arg9 && arg2 == arg3) {
            class174.method1168(arg2, arg9, -535405712, arg7, arg1, arg0);
            return;
        }
        int var10 = arg7 * 3;
        int var11 = arg7;
        int var12 = arg0;
        int var13 = arg4 * 3;
        int var14 = arg0 * 3;
        int var15 = arg3 * 3;
        int var16 = arg6 * 3;
        int var17 = arg5 * 3;
        int var18 = arg9 + var17 - (var16 - -arg7);
        int var19 = arg2 + var13 - var15 - arg0;
        int var20 = var14 + var15 - var13 - var13;
        int var21 = var10 + var16 - var17 - var17;
        int var22 = var17 - var10;
        int var23 = var13 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var21 * var25;
            int var29 = var19 * var26;
            int var30 = var23 * var24;
            int var31 = var20 * var25;
            int var32 = var22 * var24;
            int var33 = (var27 + var28 + var32 >> 12) + arg7;
            int var34 = (var29 + var31 + var30 >> 12) + arg0;
            class174.method1168(var34, var33, -535405712, var11, arg1, var12);
            var12 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
    public final int method308() {
        field1926++;
        return this.field1921;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1935++;
        if (!this.field1933) {
            class253 var6 = this.method807(-1);
            if (var6 == null) {
                return;
            }
            this.method806(-2575, var6);
        }
        if (this.field1922 != null) {
            this.field1922.method1332(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIII)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1929 = arg3;
        this.field1920 = arg5 + arg6;
        this.field1932 = arg4;
        this.field1917 = arg1;
        this.field1931 = arg0;
        this.field1937 = arg2;
        int var8 = class79.method536(-51, this.field1931).field3947;
        if (var8 == -1) {
            this.field1939 = true;
        } else {
            this.field1939 = false;
            this.field1938 = class186.method1242(0, var8);
        }
    }
}
