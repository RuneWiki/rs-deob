import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class94 extends class248 {

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    private int field1240 = -32768;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    private int field1250 = -1;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    private int field1254 = 0;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    private int field1236 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Z")
    public boolean field1255 = false;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "La;")
    private class281 field1238;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[S")
    public static short[] field1241 = new short[256];

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[J")
    public static long[] field1245 = new long[32];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Ltk;")
    private class151 field1253;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 4)
    public final void method672(int arg0, int arg1) {
        field1243++;
        if (this.field1255) {
            return;
        }
        this.field1236 += arg1;
        while (this.field1238.field4328[this.field1254] < this.field1236) {
            this.field1236 -= this.field1238.field4328[this.field1254];
            this.field1254++;
            if (this.field1238.field4319.length <= this.field1254) {
                this.field1255 = true;
                break;
            }
        }
        if (arg0 != 1) {
            this.field1237 = 48;
        }
        if (!this.field1255) {
            class91.method658(this.field1238, true, false, this.field1247, this.field1254, this.field1235);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 39)
    public static final void method673(int arg0) {
        if (arg0 == 16156) {
            field1248++;
            class198.field3165.method1355(false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 52)
    public static final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class153 var20 = new class153(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class83.field1138[var21][arg1][arg2] == null) {
                    class83.field1138[var21][arg1][arg2] = new class124(var21, arg1, arg2);
                }
            }
            class83.field1138[arg0][arg1][arg2].field1774 = var20;
        } else if (arg3 == 1) {
            class153 var22 = new class153(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class83.field1138[var23][arg1][arg2] == null) {
                    class83.field1138[var23][arg1][arg2] = new class124(var23, arg1, arg2);
                }
            }
            class83.field1138[arg0][arg1][arg2].field1774 = var22;
        } else {
            class289 var24 = new class289(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class83.field1138[var25][arg1][arg2] == null) {
                    class83.field1138[var25][arg1][arg2] = new class124(var25, arg1, arg2);
                }
            }
            class83.field1138[arg0][arg1][arg2].field1787 = var24;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 108)
    public static void method675(int arg0) {
        if (arg0 != 20365) {
            method676(-7, -20, -32, -65, -118, -23, -91);
        }
        field1241 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V", line = 123)
    public static final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class290 var7 = new class290();
        var7.field4484 = arg1 / 128;
        var7.field4465 = arg2 / 128;
        var7.field4481 = arg3 / 128;
        var7.field4482 = arg4 / 128;
        var7.field4469 = arg0;
        var7.field4475 = arg1;
        var7.field4472 = arg2;
        var7.field4479 = arg3;
        var7.field4471 = arg4;
        var7.field4468 = arg5;
        var7.field4474 = arg6;
        class5.field60[class163.field2641++] = var7;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIII)V", line = 228)
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1249 = arg1;
        this.field1247 = arg2;
        this.field1242 = arg6 + arg5;
        this.field1237 = arg0;
        this.field1235 = arg3;
        this.field1239 = arg4;
        int var8 = class9.method124(this.field1237, 1431655765).field3647;
        if (var8 == -1) {
            this.field1255 = true;
        } else {
            this.field1255 = false;
            this.field1238 = class295.method2064(0, var8);
        }
        if (this.field1242 == arg6) {
            class91.method658(this.field1238, true, false, this.field1247, this.field1254, this.field1235);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()I", line = 149)
    public final int method397() {
        field1246++;
        return this.field1240;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 160)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        field1244++;
        class89 var13 = this.method677(-125);
        if (var13 != null) {
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1253);
            this.field1240 = var13.method397();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V", line = 182)
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1234++;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Ljf;", line = 198)
    private final class89 method677(int arg0) {
        field1252++;
        class234 var2 = class9.method124(this.field1237, 1431655765);
        class89 var3;
        if (this.field1255) {
            var3 = var2.method1683(19687, 0, -1, -1);
        } else {
            var3 = var2.method1683(19687, this.field1236, this.field1250, this.field1254);
        }
        int var4 = -90 / ((-arg0 - 62) / 52);
        return var3 == null ? null : var3;
    }
}
