import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class61 extends class19 {

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lau;")
    public class692 field889 = new class692();

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Lop;")
    public class524 field897 = new class524();

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lpn;")
    private class295 field893;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Z")
    public static boolean field888 = false;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lvh;")
    public static class125 field895 = new class125(36, 7);

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "Z")
    public static boolean field896 = false;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([IIIILrr;I)V", line = 4)
    private final void method512(int[] arg0, int arg1, int arg2, int arg3, class371 arg4, int arg5) {
        if ((this.field893.field4115[arg4.field5130] & 0x4) != 0 && arg4.field5151 < 0) {
            int var7 = this.field893.field4163[arg4.field5130] / class616.field8814;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field5131) / var7;
                if (arg3 < var8) {
                    arg4.field5131 += arg3 * var7;
                    break;
                }
                arg4.field5154.method203(arg0, arg2, var8);
                arg4.field5131 += var7 * var8 - 1048576;
                arg3 -= var8;
                arg2 += var8;
                int var9 = class616.field8814 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class652 var11 = arg4.field5154;
                if (this.field893.field4136[arg4.field5130] == 0) {
                    arg4.field5154 = class652.method3663(arg4.field5152, var11.method3641(), var11.method3672(), var11.method3668());
                } else {
                    arg4.field5154 = class652.method3663(arg4.field5152, var11.method3641(), 0, var11.method3668());
                    this.field893.method1818(arg4.field5146.field3637[arg4.field5129] < 0, 10946, arg4);
                    arg4.field5154.method3657(var9, var11.method3672());
                }
                if (arg4.field5146.field3637[arg4.field5129] < 0) {
                    arg4.field5154.method3644(-1);
                }
                var11.method3640(var9);
                var11.method203(arg0, arg2, arg1 - arg2);
                if (var11.method3664()) {
                    this.field897.method3088(var11);
                }
            }
        }
        field891++;
        if (arg5 != 0) {
            method514(null, 83, 36);
        }
        arg4.field5154.method203(arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 68)
    public final void method201(int arg0) {
        this.field897.method201(arg0);
        field886++;
        for (class371 var2 = (class371) this.field889.method3905(-124); var2 != null; var2 = (class371) this.field889.method3899(0)) {
            if (!this.field893.method1806(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var2.field5136 >= var3) {
                        this.method515(false, var2, var3);
                        var2.field5136 -= var3;
                        break;
                    }
                    this.method515(false, var2, var2.field5136);
                    var3 -= var2.field5136;
                } while (!this.field893.method1822(64, var3, null, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()Lnr;", line = 101)
    public final class19 method202() {
        field885++;
        class371 var1 = (class371) this.field889.method3905(-112);
        if (var1 == null) {
            return null;
        } else if (var1.field5154 == null) {
            return this.method207();
        } else {
            return var1.field5154;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 119)
    public static void method513(int arg0) {
        field895 = null;
        int var1 = 67 / ((arg0 - 87) / 35);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()I", line = 129)
    public final int method205() {
        field890++;
        return 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lvo;II)Lll;", line = 137)
    public static final class490 method514(class345 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method516(94, -25, 96);
        }
        field894++;
        byte[] var3 = arg0.method2086(1024, arg1);
        return var3 == null ? null : new class490(var3);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLrr;I)V", line = 156)
    private final void method515(boolean arg0, class371 arg1, int arg2) {
        field884++;
        if ((this.field893.field4115[arg1.field5130] & 0x4) != 0 && arg1.field5151 < 0) {
            int var4 = this.field893.field4163[arg1.field5130] / class616.field8814;
            int var5 = (var4 + 1048575 - arg1.field5131) / var4;
            arg1.field5131 = arg2 * var4 + arg1.field5131 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field893.field4136[arg1.field5130] == 0) {
                    arg1.field5154 = class652.method3663(arg1.field5152, arg1.field5154.method3641(), arg1.field5154.method3672(), arg1.field5154.method3668());
                } else {
                    arg1.field5154 = class652.method3663(arg1.field5152, arg1.field5154.method3641(), 0, arg1.field5154.method3668());
                    this.field893.method1818(arg1.field5146.field3637[arg1.field5129] < 0, 10946, arg1);
                }
                if (arg1.field5146.field3637[arg1.field5129] < 0) {
                    arg1.field5154.method3644(-1);
                }
                arg2 = arg1.field5131 / var4;
            }
        }
        arg1.field5154.method201(arg2);
        if (arg0) {
            field895 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lkj;", line = 197)
    public static final class72 method516(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class72 var4 = var3.field4089;
            var3.field4089 = null;
            class443.method2584(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "()Lnr;", line = 215)
    public final class19 method207() {
        field883++;
        class371 var1;
        do {
            var1 = (class371) this.field889.method3899(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5154 == null);
        return var1.field5154;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([III)V", line = 236)
    public final void method203(int[] arg0, int arg1, int arg2) {
        field892++;
        this.field897.method203(arg0, arg1, arg2);
        for (class371 var4 = (class371) this.field889.method3905(-122); var4 != null; var4 = (class371) this.field889.method3899(0)) {
            if (!this.field893.method1806(var4, -1)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field5136 >= var6) {
                        this.method512(arg0, var5 + var6, var5, var6, var4, 0);
                        var4.field5136 -= var6;
                        break;
                    }
                    this.method512(arg0, var5 + var6, var5, var4.field5136, var4, 0);
                    var5 += var4.field5136;
                    var6 -= var4.field5136;
                } while (!this.field893.method1822(64, var6, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lpn;)V", line = 289)
    public class61(class295 arg0) {
        this.field893 = arg0;
    }
}
