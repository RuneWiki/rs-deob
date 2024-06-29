import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class51 {

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Ltr;")
    private class173 field808 = new class173();

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lbo;")
    private class453 field790;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[I")
    public static int[] field791;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    public static int[] field797;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "[I")
    public static int[] field807;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIZI[Lsj;)V", line = 4)
    public static final void method365(int arg0, int arg1, int arg2, boolean arg3, int arg4, class248[] arg5) {
        field804++;
        if (arg4 != -162) {
            field797 = null;
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class248 var7 = arg5[var6];
            if (var7 != null && var7.field3584 == arg0) {
                class347.method2298(arg3, arg1, -11402, var7, arg2);
                class176.method1166(var7, arg2, arg4 + 163, arg1);
                if (var7.field3559 > (var7.field3591 - var7.field3531)) {
                    var7.field3559 = var7.field3591 - var7.field3531;
                }
                if (var7.field3559 < 0) {
                    var7.field3559 = 0;
                }
                if (var7.field3499 > (var7.field3568 - var7.field3564)) {
                    var7.field3499 = var7.field3568 - var7.field3564;
                }
                if (var7.field3499 < 0) {
                    var7.field3499 = 0;
                }
                if (var7.field3555 == 0) {
                    class185.method1215(-1, arg3, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 49)
    public final void method366(int arg0) {
        for (class43 var2 = (class43) this.field808.method1157(11); var2 != null; var2 = (class43) this.field808.method1151((byte) 72)) {
            if (var2.method307((byte) 115)) {
                var2.method2632(true);
                var2.method2764((byte) 119);
                this.field796++;
            }
        }
        int var3 = 29 % ((arg0 + 25) / 32);
        field803++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JLjava/lang/Object;Z)V", line = 73)
    public final void method367(long arg0, Object arg1, boolean arg2) {
        if (!arg2) {
            this.field808 = null;
        }
        field794++;
        this.method375(arg0, -12473);
        if (this.field796 == 0) {
            class43 var5 = (class43) this.field808.method1149(0);
            var5.method2632(arg2);
            var5.method2764((byte) 119);
        } else {
            this.field796--;
        }
        class393 var6 = new class393(arg1);
        this.field790.method2815(-1, arg0, var6);
        this.field808.method1154(var6, 0);
        var6.field6404 = 0L;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 111)
    public static final void method368(int arg0) {
        if (arg0 != -26132) {
            return;
        }
        class51 var1 = class185.field2526;
        synchronized (class185.field2526) {
            class185.field2526.method372(122);
        }
        field799++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIII)V", line = 127)
    public static final void method369(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class400.field5854; var5++) {
            Rectangle var6 = class418.field6092[var5];
            if ((var6.x + var6.width) > arg3 && (arg0 + arg3) > var6.x && arg2 < var6.y + var6.height && var6.y < (arg2 + arg4)) {
                class101.field1335[var5] = true;
            }
        }
        field800++;
        if (arg1 != -108) {
            method365(86, -17, 77, true, -14, (class248[]) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 151)
    public final int method370(int arg0) {
        if (arg0 > -83) {
            field797 = null;
        }
        field798++;
        return this.field796;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I", line = 164)
    public final int method371(int arg0) {
        field809++;
        int var2 = arg0;
        for (class43 var3 = (class43) this.field808.method1157(77); var3 != null; var3 = (class43) this.field808.method1151((byte) 72)) {
            if (!var3.method307((byte) 68)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 188)
    public final void method372(int arg0) {
        this.field808.method1156(-7585);
        field806++;
        this.field790.method2825(95);
        this.field796 = this.field811;
        if (arg0 < 113) {
            this.method375(-93L, 26);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 202)
    public final Object method373(int arg0) {
        field805++;
        int var2 = -63 % ((89 - arg0) / 35);
        class43 var3 = (class43) this.field790.method2812(15710);
        while (var3 != null) {
            Object var4 = var3.method303((byte) -105);
            if (var4 != null) {
                return var4;
            }
            class43 var5 = var3;
            var3 = (class43) this.field790.method2819((byte) 111);
            var5.method2632(true);
            var5.method2764((byte) 119);
            this.field796++;
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 233)
    public final Object method374(byte arg0) {
        field792++;
        class43 var2 = (class43) this.field790.method2819((byte) 125);
        if (arg0 < 86) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method303((byte) -110);
            if (var3 != null) {
                return var3;
            }
            class43 var4 = var2;
            var2 = (class43) this.field790.method2819((byte) 116);
            var4.method2632(true);
            var4.method2764((byte) 119);
            this.field796++;
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)V", line = 265)
    private final void method375(long arg0, int arg1) {
        if (arg1 != -12473) {
            field807 = null;
        }
        field810++;
        class43 var4 = (class43) this.field790.method2826(false, arg0);
        if (var4 != null) {
            var4.method2632(true);
            var4.method2764((byte) 119);
            this.field796++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V", line = 285)
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -2) {
            method369(56, (byte) 81, 55, 10, -54);
        }
        if (arg1 >= class240.field3368 && class136.field1769 >= arg2 && class157.field1981 <= arg3 && class312.field4602 >= arg4) {
            if (arg5 == 1) {
                class370.method2434(arg1, arg6, arg2, arg4, arg3, true);
            } else {
                class210.method1371((byte) 43, arg5, arg1, arg2, arg3, arg4, arg6);
            }
        } else if (arg5 == 1) {
            class312.method2056(arg6, arg4, arg3, arg1, arg2, -98);
        } else {
            class346.method2287(arg6, arg5, arg4, arg2, arg3, arg0 ^ 0xFE, arg1);
        }
        field801++;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I", line = 316)
    public final int method377(int arg0) {
        field802++;
        if (arg0 < 26) {
            this.field808 = null;
        }
        return this.field811;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 327)
    public final Object method378(byte arg0, long arg1) {
        field795++;
        class43 var4 = (class43) this.field790.method2826(false, arg1);
        if (var4 == null) {
            return null;
        } else if (arg0 == 28) {
            Object var5 = var4.method303((byte) -118);
            if (var5 == null) {
                var4.method2632(true);
                var4.method2764((byte) 119);
                this.field796++;
                return null;
            }
            if (var4.method307((byte) 82)) {
                class393 var6 = new class393(var5);
                this.field790.method2815(-1, var4.field6091, var6);
                this.field808.method1154(var6, 0);
                var6.field6404 = 0L;
                var4.method2632(true);
                var4.method2764((byte) 119);
            } else {
                this.field808.method1154(var4, 0);
                var4.field6404 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V", line = 374)
    public final void method379(int arg0, boolean arg1) {
        if (class357.field5287 != null) {
            for (class43 var3 = (class43) this.field808.method1157(55); var3 != null; var3 = (class43) this.field808.method1151((byte) 72)) {
                if (var3.method307((byte) 100)) {
                    if (var3.method303((byte) -124) == null) {
                        var3.method2632(true);
                        var3.method2764((byte) 119);
                        this.field796++;
                    }
                } else if (++var3.field6404 > (long) arg0) {
                    class43 var4 = class357.field5287.method780(83, var3);
                    this.field790.method2815(-1, var3.field6091, var4);
                    class57.method419(var3, 0, var4);
                    var3.method2632(true);
                    var3.method2764((byte) 119);
                }
            }
        }
        field789++;
        if (arg1) {
            this.method379(-39, false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V", line = 432)
    public static void method380(int arg0) {
        field807 = null;
        field791 = null;
        field797 = null;
        int var1 = 69 / ((arg0 - 20) / 39);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([Ljava/lang/String;[SI)V", line = 443)
    public static final void method381(String[] arg0, short[] arg1, int arg2) {
        class129.method919(110, arg2, arg0.length - 1, arg1, arg0);
        field793++;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V", line = 454)
    public class51(int arg0) {
        this.field811 = arg0;
        this.field796 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field790 = new class453(var2);
    }
}
