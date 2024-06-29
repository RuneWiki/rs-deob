import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class523 {

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Luj;")
    private class259 field7766 = new class259();

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    private int field7754;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Lan;")
    private class20 field7758;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field7751 = 0;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "[[I")
    public static int[][] field7756 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Z")
    public static final boolean method3113(int arg0, int arg1) {
        if (arg0 > -44) {
            method3120((byte) 3);
        }
        field7767++;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILue;Ljava/lang/Object;)V")
    private final void method3114(byte arg0, int arg1, class154 arg2, Object arg3) {
        field7764++;
        if (this.field7754 < arg1) {
            throw new IllegalStateException("s>cs");
        } else if (arg0 == -29) {
            this.method3121(arg2, 26536);
            this.field7762 -= arg1;
            while (this.field7762 < 0) {
                class394 var6 = (class394) this.field7766.method1674((byte) -104);
                this.method3119((byte) -10, var6);
            }
            class210 var5 = new class210(arg2, arg3, arg1);
            this.field7758.method166(var5, arg2.method354(arg0 ^ 0xFFFFFFD5), 125);
            this.field7766.method1673(var5, arg0 + 4333);
            var5.field2927 = 0L;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)I")
    public final int method3115(boolean arg0) {
        field7757++;
        if (!arg0) {
            this.method3117(null, -106);
        }
        return this.field7762;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFBF)F")
    public static final float method3116(float arg0, float arg1, byte arg2, float arg3) {
        field7768++;
        if (arg2 != -11) {
            method3116(-0.956762F, -1.5661895F, (byte) -114, -1.225608F);
        }
        return (arg0 - arg1) * arg3 + arg1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lue;I)Ljava/lang/Object;")
    public final Object method3117(class154 arg0, int arg1) {
        field7755++;
        long var3 = arg0.method354(arg1 ^ 0xFFFFA0D1);
        for (class394 var5 = (class394) this.field7758.method171((byte) -121, var3); var5 != null; var5 = (class394) this.field7758.method165((byte) -125)) {
            if (var5.field5951.method352(24847, arg0)) {
                Object var6 = var5.method1267((byte) -94);
                if (var6 != null) {
                    if (var5.method1266((byte) 121)) {
                        class210 var7 = new class210(arg0, var6, var5.field5952);
                        this.field7758.method166(var7, var5.field4904, -78);
                        this.field7766.method1673(var7, arg1 - 20114);
                        var7.field2927 = 0L;
                        var5.method2090(arg1 ^ 0xFFFFA09D);
                        var5.method1382(7218);
                    } else {
                        this.field7766.method1673(var5, arg1 ^ 0x4FB2);
                        var5.field2927 = 0L;
                    }
                    return var6;
                }
                var5.method2090(-1);
                var5.method1382(7218);
                this.field7762 += var5.field5952;
            }
        }
        if (arg1 == 24418) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
    public final void method3118(int arg0, byte arg1) {
        field7753++;
        if (arg1 > -103) {
            this.method3117(null, -67);
        }
        if (class161.field2487 == null) {
            return;
        }
        for (class394 var3 = (class394) this.field7766.method1679(255); var3 != null; var3 = (class394) this.field7766.method1671(-10033)) {
            if (var3.method1266((byte) 115)) {
                if (var3.method1267((byte) -94) == null) {
                    var3.method2090(-1);
                    var3.method1382(7218);
                    this.field7762 += var3.field5952;
                }
            } else if (((long) arg0) < (++var3.field2927)) {
                class394 var4 = class161.field2487.method320(var3, (byte) -110);
                this.field7758.method166(var4, var3.field4904, -82);
                class377.method2347(var3, var4, 70);
                var3.method2090(-1);
                var3.method1382(7218);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLwm;)V")
    private final void method3119(byte arg0, class394 arg1) {
        field7759++;
        int var3 = 95 / ((66 - arg0) / 54);
        if (arg1 != null) {
            arg1.method2090(-1);
            arg1.method1382(7218);
            this.field7762 += arg1.field5952;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method3120(byte arg0) {
        field7756 = null;
        if (arg0 >= -121) {
            field7751 = -24;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Lue;I)V")
    private final void method3121(class154 arg0, int arg1) {
        if (arg1 != 26536) {
            return;
        }
        field7765++;
        long var3 = arg0.method354(-107);
        for (class394 var5 = (class394) this.field7758.method171((byte) 99, var3); var5 != null; var5 = (class394) this.field7758.method165((byte) -126)) {
            if (var5.field5951.method352(24847, arg0)) {
                this.method3119((byte) -110, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)I")
    public final int method3122(boolean arg0) {
        field7752++;
        return arg0 ? this.field7754 : 79;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lue;BLjava/lang/Object;)V")
    public final void method3123(class154 arg0, byte arg1, Object arg2) {
        field7760++;
        this.method3114((byte) -29, 1, arg0, arg2);
        int var4 = 90 / ((57 - arg1) / 47);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
    public final void method3124(byte arg0) {
        field7761++;
        if (arg0 > -46) {
            method3116(-2.1169004F, 0.50956637F, (byte) 28, 0.83239317F);
        }
        for (class394 var2 = (class394) this.field7766.method1679(255); var2 != null; var2 = (class394) this.field7766.method1671(-10033)) {
            if (var2.method1266((byte) 122)) {
                var2.method2090(-1);
                var2.method1382(7218);
                this.field7762 += var2.field5952;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(Z)V")
    public final void method3125(boolean arg0) {
        field7763++;
        this.field7766.method1677(489772293);
        this.field7758.method159(0);
        if (!arg0) {
            this.method3114((byte) -13, -16, null, null);
        }
        this.field7762 = this.field7754;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(I)V")
    public class523(int arg0) {
        this.field7754 = arg0;
        this.field7762 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field7758 = new class20(var2);
    }
}
