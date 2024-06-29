import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class701 {

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lbj;")
    private class430 field9892 = new class430();

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    private int field9888;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    private int field9896;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Lsga;")
    private class583 field9882;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lac;")
    public static class712 field9883;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIBZ)I", line = 4)
    public static final int method3880(int arg0, int arg1, byte arg2, boolean arg3) {
        field9894++;
        class464 var4 = class175.method1082(arg3, arg1, (byte) 20);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg2 > -14) {
                method3885((byte) 94, null);
            }
            for (int var6 = 0; var6 < var4.field6712.length; var6++) {
                if (var4.field6715[var6] == arg0) {
                    var5 += var4.field6712[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 42)
    public final void method3881(byte arg0) {
        field9897++;
        for (class113 var2 = (class113) this.field9892.method2565((byte) 114); var2 != null; var2 = (class113) this.field9892.method2568(-31355)) {
            if (var2.method767(true)) {
                var2.method3426((byte) -21);
                var2.method3409(54);
                this.field9896 += var2.field1390;
            }
        }
        int var3 = 105 / ((-arg0 - 16) / 52);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V", line = 66)
    public final void method3882(int arg0, byte arg1) {
        if (class407.field5739 != null) {
            for (class113 var3 = (class113) this.field9892.method2565((byte) 105); var3 != null; var3 = (class113) this.field9892.method2568(-31355)) {
                if (var3.method767(true)) {
                    if (var3.method764(123) == null) {
                        var3.method3426((byte) -20);
                        var3.method3409(29);
                        this.field9896 += var3.field1390;
                    }
                } else if ((long) arg0 < ++var3.field8700) {
                    class113 var4 = class407.field5739.method836((byte) 1, var3);
                    this.field9882.method3249(var3.field8746, var4, (byte) 49);
                    class716.method3975(120, var4, var3);
                    var3.method3426((byte) -79);
                    var3.method3409(-128);
                }
            }
        }
        if (arg1 > -5) {
            this.field9888 = 26;
        }
        field9893++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILrba;)V", line = 116)
    private final void method3883(int arg0, class113 arg1) {
        if (arg0 != 1000) {
            return;
        }
        if (arg1 != null) {
            arg1.method3426((byte) -86);
            arg1.method3409(25);
            this.field9896 += arg1.field1390;
        }
        field9885++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZLqq;)V", line = 134)
    private final void method3884(boolean arg0, class75 arg1) {
        field9895++;
        long var3 = arg1.method556(-96);
        if (!arg0) {
            this.method3892(null, null, (byte) -32);
        }
        for (class113 var5 = (class113) this.field9882.method3248(var3, 0); var5 != null; var5 = (class113) this.field9882.method3246((byte) 60)) {
            if (var5.field1395.method555(arg1, -105)) {
                this.method3883(1000, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B[Ljava/lang/String;)V", line = 163)
    public static final void method3885(byte arg0, String[] arg1) {
        if (arg0 != -74) {
            field9883 = null;
        }
        field9886++;
        if (arg1.length <= 1) {
            class534.field7501 = class534.field7501 + arg1[0];
            class607.field8420 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class192.method1210(-110, "Pausing for " + var3 + " seconds...");
                class278.field3529 = arg1;
                class91.field1147 = var2 + 1;
                class327.field4178 = (long) (var3 * 1000) + class97.method654((byte) 103);
                return;
            }
            class534.field7501 = arg1[var2];
            class389.method2325((byte) -75, false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLqq;Ljava/lang/Object;)V", line = 210)
    private final void method3886(int arg0, byte arg1, class75 arg2, Object arg3) {
        field9890++;
        if (arg0 > this.field9888) {
            throw new IllegalStateException("s>cs");
        }
        this.method3884(true, arg2);
        this.field9896 -= arg0;
        while (this.field9896 < 0) {
            class113 var6 = (class113) this.field9892.method2566(0);
            this.method3883(arg1 + 884, var6);
        }
        if (arg1 != 116) {
            method3885((byte) -103, null);
        }
        class641 var5 = new class641(arg2, arg3, arg0);
        this.field9882.method3249(arg2.method556(-93), var5, (byte) 51);
        this.field9892.method2564(var5, (byte) -123);
        var5.field8700 = 0L;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)I", line = 241)
    public final int method3887(byte arg0) {
        if (arg0 == 43) {
            field9891++;
            return this.field9888;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I", line = 253)
    public final int method3888(int arg0) {
        if (arg0 > -5) {
            this.method3890((byte) -79, null);
        }
        field9889++;
        return this.field9896;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V", line = 264)
    public final void method3889(boolean arg0) {
        if (arg0) {
            field9884++;
            this.field9892.method2563(false);
            this.field9882.method3251(false);
            this.field9896 = this.field9888;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLqq;)Ljava/lang/Object;", line = 278)
    public final Object method3890(byte arg0, class75 arg1) {
        field9881++;
        if (arg0 > -26) {
            field9883 = null;
        }
        long var3 = arg1.method556(35);
        for (class113 var5 = (class113) this.field9882.method3248(var3, 0); var5 != null; var5 = (class113) this.field9882.method3246((byte) 60)) {
            if (var5.field1395.method555(arg1, -83)) {
                Object var6 = var5.method764(115);
                if (var6 != null) {
                    if (var5.method767(true)) {
                        class641 var7 = new class641(arg1, var6, var5.field1390);
                        this.field9882.method3249(var5.field8746, var7, (byte) 83);
                        this.field9892.method2564(var7, (byte) -123);
                        var7.field8700 = 0L;
                        var5.method3426((byte) -76);
                        var5.method3409(-117);
                    } else {
                        this.field9892.method2564(var5, (byte) -123);
                        var5.field8700 = 0L;
                    }
                    return var6;
                }
                var5.method3426((byte) -125);
                var5.method3409(-115);
                this.field9896 += var5.field1390;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 330)
    public static void method3891(int arg0) {
        field9883 = null;
        if (arg0 != 24392) {
            method3891(66);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/Object;Lqq;B)V", line = 341)
    public final void method3892(Object arg0, class75 arg1, byte arg2) {
        field9887++;
        if (arg2 > -27) {
            this.field9892 = null;
        }
        this.method3886(1, (byte) 116, arg1, arg0);
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V", line = 362)
    public class701(int arg0) {
        this.field9888 = arg0;
        this.field9896 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9882 = new class583(var2);
    }
}
