import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class641 {

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "Lrp;")
    private class369 field9245 = new class369();

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    private int field9248;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    private int field9250;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "Lpt;")
    private class451 field9249;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field9243 = 0;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field9242 = 0;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public static int field9247 = -1;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lbea;Z)V", line = 5)
    private final void method3680(class188 arg0, boolean arg1) {
        field9255++;
        if (!arg1 && arg0 != null) {
            arg0.method3187(true);
            arg0.method48(-1);
            this.field9250 += arg0.field2259;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method3681(int arg0) {
        field9257++;
        class188 var2 = (class188) this.field9249.method2638(false);
        if (arg0 != 0) {
            field9243 = 53;
        }
        while (var2 != null) {
            Object var3 = var2.method121((byte) -52);
            if (var3 != null) {
                return var3;
            }
            class188 var4 = var2;
            var2 = (class188) this.field9249.method2641(12089);
            var4.method3187(true);
            var4.method48(-1);
            this.field9250 += var2.field2259;
        }
        return null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 54)
    public final Object method3682(int arg0, long arg1) {
        field9258++;
        class188 var4 = (class188) this.field9249.method2645(arg1, (byte) -87);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method121((byte) 118);
        if (arg0 != 0) {
            return null;
        } else if (var5 == null) {
            var4.method3187(true);
            var4.method48(~arg0);
            this.field9250 += var4.field2259;
            return null;
        } else {
            if (var4.method122((byte) 108)) {
                class549 var6 = new class549(var5, var4.field2259);
                this.field9249.method2640(1, var4.field7967, var6);
                this.field9245.method2070(var6, -80);
                var6.field67 = 0L;
                var4.method3187(true);
                var4.method48(-1);
            } else {
                this.field9245.method2070(var4, -125);
                var4.field67 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(JB)V", line = 98)
    private final void method3683(long arg0, byte arg1) {
        field9244++;
        class188 var4 = (class188) this.field9249.method2645(arg0, (byte) -123);
        this.method3680(var4, false);
        if (arg1 > -34) {
            this.method3684(null, 57, -63L);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 111)
    public final void method3684(Object arg0, int arg1, long arg2) {
        field9259++;
        if (arg1 != 0) {
            this.method3684(null, 38, -104L);
        }
        this.method3688(arg0, 1, arg2, 15266);
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I", line = 125)
    public final int method3685(int arg0) {
        field9239++;
        int var2 = arg0;
        for (class188 var3 = (class188) this.field9245.method2066((byte) -82); var3 != null; var3 = (class188) this.field9245.method2068(true)) {
            if (!var3.method122((byte) 90)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BI)V", line = 148)
    public final void method3686(byte arg0, int arg1) {
        if (arg0 != 53) {
            return;
        }
        field9253++;
        if (class78.field916 == null) {
            return;
        }
        for (class188 var3 = (class188) this.field9245.method2066((byte) -82); var3 != null; var3 = (class188) this.field9245.method2068(true)) {
            if (var3.method122((byte) 113)) {
                if (var3.method121((byte) 124) == null) {
                    var3.method3187(true);
                    var3.method48(-1);
                    this.field9250++;
                }
            } else if ((++var3.field67) > ((long) arg1)) {
                class188 var4 = class78.field916.method1900(10, var3);
                this.field9249.method2640(1, var3.field7967, var4);
                class124.method710(0, var3, var4);
                var3.method3187(true);
                var3.method48(-1);
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V", line = 202)
    public final void method3687(int arg0) {
        this.field9245.method2067(-10);
        if (arg0 != 1402) {
            field9242 = -105;
        }
        field9260++;
        this.field9249.method2642(true);
        this.field9250 = this.field9248;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/Object;IJI)V", line = 215)
    private final void method3688(Object arg0, int arg1, long arg2, int arg3) {
        if (arg3 != 15266) {
            this.method3685(-38);
        }
        field9254++;
        if (this.field9248 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method3683(arg2, (byte) -106);
        this.field9250 -= arg1;
        while (this.field9250 < 0) {
            class188 var7 = (class188) this.field9245.method2072(false);
            this.method3680(var7, false);
        }
        class549 var6 = new class549(arg0, arg1);
        this.field9249.method2640(1, arg2, var6);
        this.field9245.method2070(var6, arg3 - 15164);
        var6.field67 = 0L;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(CI)Z", line = 244)
    public static final boolean method3689(char arg0, int arg1) {
        field9261++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class474.method2761((byte) -17, arg0)) {
            return true;
        } else {
            char[] var2 = class290.field3770;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class380.field5044;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 290)
    public final Object method3690(boolean arg0) {
        field9256++;
        if (!arg0) {
            this.method3690(true);
        }
        class188 var2 = (class188) this.field9249.method2641(12089);
        while (var2 != null) {
            Object var3 = var2.method121((byte) -23);
            if (var3 != null) {
                return var3;
            }
            class188 var4 = var2;
            var2 = (class188) this.field9249.method2641(12089);
            var4.method3187(true);
            var4.method48(-1);
            this.field9250 += var2.field2259;
        }
        return null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)I", line = 325)
    public final int method3691(byte arg0) {
        field9240++;
        return arg0 == -54 ? this.field9250 : 127;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)I", line = 338)
    public final int method3692(byte arg0) {
        if (arg0 < 72) {
            field9238 = 31;
        }
        field9252++;
        return this.field9248;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIII)V", line = 352)
    public static final void method3693(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -83 % ((arg0 + 49) / 38);
        field9251++;
        int var5 = class565.field8299.field2192 * arg1 >> 8;
        if (arg3 == -1 && !class157.field1921) {
            class185.method1012((byte) 73);
        } else if (arg3 != -1 && (class225.field2766 != arg3 || !class528.method3007(-1)) && var5 != 0 && !class157.field1921) {
            class395.method2275(class282.field3709, 0, arg2, -54, false, var5, arg3);
        }
        class225.field2766 = arg3;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V", line = 390)
    public class641(int arg0) {
        this.field9248 = arg0;
        this.field9250 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9249 = new class451(var2);
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V", line = 405)
    public final void method3694(int arg0) {
        for (class188 var2 = (class188) this.field9245.method2066((byte) -82); var2 != null; var2 = (class188) this.field9245.method2068(true)) {
            if (var2.method122((byte) 57)) {
                var2.method3187(true);
                var2.method48(-1);
                this.field9250 += var2.field2259;
            }
        }
        if (arg0 != 0) {
            this.method3691((byte) 59);
        }
        field9241++;
    }
}
