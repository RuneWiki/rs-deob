import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class472 {

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lan;")
    private class22 field6591;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    private int field6580;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "Lwaa;")
    private class652 field6594;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
    public static int[] field6579 = new int[1000];

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Lwo;")
    public static class690 field6577 = new class690(22, 0);

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "F")
    public static float field6587;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2766(int arg0, long arg1) {
        if (arg0 > -120) {
            return null;
        }
        field6582++;
        class155 var4 = (class155) this.field6594.method3678(arg1, -120);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method987(-97);
        if (var5 == null) {
            var4.method3045(true);
            var4.method1037(-113);
            this.field6588 += var4.field1898;
            return null;
        }
        if (var4.method985(false)) {
            class196 var6 = new class196(var5, var4.field1898);
            this.field6594.method3670(var4.field7519, var6, (byte) 127);
            this.field6591.method345(var6, -1);
            var6.field2006 = 0L;
            var4.method3045(true);
            var4.method1037(-118);
        } else {
            this.field6591.method345(var4, -1);
            var4.field2006 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Object;BIJ)V")
    public final void method2767(Object arg0, byte arg1, int arg2, long arg3) {
        field6592++;
        if (arg2 > this.field6580) {
            throw new IllegalStateException("s>cs");
        }
        this.method2775(arg3, true);
        this.field6588 -= arg2;
        while (this.field6588 < 0) {
            class155 var7 = (class155) this.field6591.method352((byte) 115);
            this.method2771(11273, var7);
        }
        if (arg1 != -101) {
            this.method2766(106, -26L);
        }
        class196 var6 = new class196(arg0, arg2);
        this.field6594.method3670(arg3, var6, (byte) 127);
        this.field6591.method345(var6, -1);
        var6.field2006 = 0L;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2768(int arg0) {
        field6583++;
        class155 var2 = (class155) this.field6594.method3669((byte) 28);
        while (var2 != null) {
            Object var3 = var2.method987(-108);
            if (var3 != null) {
                return var3;
            }
            class155 var4 = var2;
            var2 = (class155) this.field6594.method3676((byte) -12);
            var4.method3045(true);
            var4.method1037(-119);
            this.field6588 += var4.field1898;
        }
        if (arg0 != 30860) {
            this.field6588 = -93;
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
    public final int method2769(byte arg0) {
        field6578++;
        if (arg0 < 11) {
            this.method2777(90, 68);
        }
        return this.field6588;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
    public final int method2770(int arg0) {
        field6584++;
        int var2 = arg0;
        for (class155 var3 = (class155) this.field6591.method347(arg0); var3 != null; var3 = (class155) this.field6591.method344((byte) 24)) {
            if (!var3.method985(false)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILtca;)V")
    private final void method2771(int arg0, class155 arg1) {
        if (arg1 != null) {
            arg1.method3045(true);
            arg1.method1037(-88);
            this.field6588 += arg1.field1898;
        }
        if (arg0 == 11273) {
            field6595++;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
    public class472(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V")
    public final void method2772(Object arg0, boolean arg1, long arg2) {
        field6581++;
        if (!arg1) {
            this.method2766(-40, -11L);
        }
        this.method2767(arg0, (byte) -101, 1, arg2);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
    public final int method2773(byte arg0) {
        if (arg0 == 96) {
            field6593++;
            return this.field6580;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    public static void method2774(int arg0) {
        if (arg0 < 45) {
            method2774(-123);
        }
        field6577 = null;
        field6579 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZ)V")
    private final void method2775(long arg0, boolean arg1) {
        field6585++;
        if (arg1) {
            class155 var4 = (class155) this.field6594.method3678(arg0, -127);
            this.method2771(11273, var4);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public final void method2776(boolean arg0) {
        field6589++;
        if (arg0) {
            this.method2769((byte) 73);
        }
        this.field6591.method353(0);
        this.field6594.method3674((byte) -125);
        this.field6588 = this.field6580;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
    public final void method2777(int arg0, int arg1) {
        if (class566.field8280 != null) {
            for (class155 var3 = (class155) this.field6591.method347(0); var3 != null; var3 = (class155) this.field6591.method344((byte) 24)) {
                if (var3.method985(false)) {
                    if (var3.method987(-84) == null) {
                        var3.method3045(true);
                        var3.method1037(-96);
                        this.field6588++;
                    }
                } else if ((long) arg0 < ++var3.field2006) {
                    class155 var4 = class566.field8280.method380(var3, 127);
                    this.field6594.method3670(var3.field7519, var4, (byte) 127);
                    class297.method1764(var4, (byte) -8, var3);
                    var3.method3045(true);
                    var3.method1037(-118);
                }
            }
        }
        if (arg1 >= 22) {
            field6590++;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(II)V")
    public class472(int arg0, int arg1) {
        this.field6591 = new class22();
        this.field6588 = arg0;
        this.field6580 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field6594 = new class652(var3);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public final void method2778(byte arg0) {
        if (arg0 <= 103) {
            return;
        }
        for (class155 var2 = (class155) this.field6591.method347(0); var2 != null; var2 = (class155) this.field6591.method344((byte) 24)) {
            if (var2.method985(false)) {
                var2.method3045(true);
                var2.method1037(-104);
                this.field6588 += var2.field1898;
            }
        }
        field6576++;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2779(int arg0) {
        field6586++;
        class155 var2 = (class155) this.field6594.method3676((byte) -12);
        if (arg0 > -80) {
            this.method2768(-113);
        }
        while (var2 != null) {
            Object var3 = var2.method987(-74);
            if (var3 != null) {
                return var3;
            }
            class155 var4 = var2;
            var2 = (class155) this.field6594.method3676((byte) -12);
            var4.method3045(true);
            var4.method1037(-119);
            this.field6588 += var4.field1898;
        }
        return null;
    }
}
