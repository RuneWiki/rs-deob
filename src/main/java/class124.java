import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class124 extends class313 {

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Z")
    private boolean field2142 = true;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Z")
    private boolean field2143 = true;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field2150 = 0;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Lcg;")
    public static class49 field2148;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "[Z")
    public static boolean[] field2140;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "[[Lbl;")
    public static class337[][] field2147;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZ)V", line = 3)
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class123.field2134 = arg1;
        class185.field3144 = arg2;
        class259.field4197 = arg3;
        class266.field4287 = new class257[arg0][class123.field2134][class185.field3144];
        class255.field4110 = new int[arg0][class123.field2134 + 1][class185.field3144 + 1];
        if (class43.field680) {
            field2147 = new class337[4][];
        }
        if (arg4) {
            class78.field1258 = new class257[1][class123.field2134][class185.field3144];
            class352.field5574 = new int[class123.field2134][class185.field3144];
            class249.field4042 = new int[1][class123.field2134 + 1][class185.field3144 + 1];
            if (class43.field680) {
                class298.field4749 = new class337[1][];
            }
        } else {
            class78.field1258 = (class257[][][]) null;
            class352.field5574 = (int[][]) null;
            class249.field4042 = (int[][][]) null;
            class298.field4749 = (class337[][]) null;
        }
        class304.method2094(false);
        class31.field447 = new class38[500];
        class334.field5299 = 0;
        class159.field2809 = new class38[500];
        class139.field2558 = 0;
        class295.field4717 = new int[arg0][class123.field2134 + 1][class185.field3144 + 1];
        class128.field2222 = new class241[5000];
        class13.field210 = 0;
        class221.field3695 = new class241[100];
        class112.field1878 = new boolean[class259.field4197 + class259.field4197 + 1][class259.field4197 + class259.field4197 + 1];
        class200.field3423 = new boolean[class259.field4197 + class259.field4197 + 2][class259.field4197 + class259.field4197 + 2];
        class41.field615 = new byte[arg0][class123.field2134][class185.field3144];
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 47)
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILpi;)V", line = 55)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field2139++;
        if (arg1 != -17848) {
            return;
        }
        if (arg0 == 0) {
            this.field2142 = arg2.method2364(-9069) == 1;
        } else if (arg0 == 1) {
            this.field2143 = arg2.method2364(-9069) == 1;
        } else if (arg0 == 2) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 100)
    public static void method1038(byte arg0) {
        field2147 = (class337[][]) null;
        field2148 = null;
        field2140 = null;
        if (arg0 < 38) {
            field2147 = (class337[][]) ((class337[][]) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V", line = 112)
    public static final void method1039(int arg0) {
        field2144++;
        for (class261 var1 = (class261) class262.field4251.method2297(14204); var1 != null; var1 = (class261) class262.field4251.method2291(-109)) {
            if (var1.field4216) {
                var1.method1802(128);
            }
        }
        int var2 = -82 / ((arg0 - 22) / 63);
        for (class261 var3 = (class261) class184.field3119.method2297(14204); var3 != null; var3 = (class261) class184.field3119.method2291(-82)) {
            if (var3.field4216) {
                var3.method1802(128);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIIIIIII)V", line = 146)
    public static final void method1040(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != 15106) {
            field2147 = (class337[][]) ((class337[][]) null);
        }
        field2141++;
        int var10 = arg1 - arg8;
        int var11 = arg5 - arg9;
        int var12 = (arg3 - arg4 << 16) / var10;
        int var13 = (arg0 - arg7 << 16) / var11;
        class352.method2451(var12, var13, arg5, arg7, 0, 0, arg2, 10, arg4, arg1, arg8, arg9);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I", line = 176)
    public final int[] method111(int arg0, int arg1) {
        field2145++;
        if (arg0 != 4) {
            field2140 = (boolean[]) null;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, this.field2143 ? class132.field2262 - arg1 : arg1);
            if (this.field2142) {
                for (int var5 = 0; var5 < class133.field2269; var5++) {
                    var3[var5] = var4[class297.field4731 - var5];
                }
            } else {
                class345.method2415(var4, 0, var3, 0, class133.field2269);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[[I", line = 216)
    public final int[][] method299(int arg0, int arg1) {
        field2146++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 124);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, this.field2143 ? class132.field2262 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2142) {
                for (int var11 = 0; var11 < class133.field2269; var11++) {
                    var8[var11] = var5[class297.field4731 - var11];
                    var9[var11] = var7[class297.field4731 - var11];
                    var10[var11] = var6[class297.field4731 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class133.field2269; var12++) {
                    var8[var12] = var5[var12];
                    var9[var12] = var7[var12];
                    var10[var12] = var6[var12];
                }
            }
        }
        if (arg1 != 2) {
            field2150 = -6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lu;III)V", line = 282)
    public static final void method1041(class278 arg0, int arg1, int arg2, int arg3) {
        field2149++;
        if (arg1 != 1) {
            field2148 = (class49) null;
        }
        if (arg0.field1998 == arg3 && arg3 != -1) {
            class285 var4 = class346.method2428(arg3, (byte) -24);
            int var5 = var4.field4532;
            if (var5 == 1) {
                arg0.field1934 = arg2;
                arg0.field2002 = 0;
                arg0.field2035 = 0;
                arg0.field1929 = 1;
                arg0.field1932 = 0;
                class20.method199(false, arg0.field1985, var4, arg0.field2036, arg0.field1932, true);
            }
            if (var5 == 2) {
                arg0.field2002 = 0;
            }
        } else if (arg3 == -1 || arg0.field1998 == -1 || class346.method2428(arg3, (byte) -24).field4517 >= class346.method2428(arg0.field1998, (byte) -24).field4517) {
            arg0.field1932 = 0;
            arg0.field1998 = arg3;
            arg0.field2002 = 0;
            arg0.field1934 = arg2;
            arg0.field1929 = 1;
            arg0.field2035 = 0;
            arg0.field2013 = arg0.field1957;
            if (arg0.field1998 != -1) {
                class20.method199(false, arg0.field1985, class346.method2428(arg0.field1998, (byte) -24), arg0.field2036, arg0.field1932, true);
            }
        }
    }
}
