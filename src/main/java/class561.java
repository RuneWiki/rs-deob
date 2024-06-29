import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class561 {

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "Lfba;")
    private class348 field8132 = new class348(256);

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "Lla;")
    private class423 field8139;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "[I")
    public static int[] field8137 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Lsk;")
    public static class121 field8130;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Lla;")
    public static class423 field8133;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V", line = 7)
    public static void method3358(byte arg0) {
        field8130 = null;
        field8133 = null;
        if (arg0 < 16) {
            method3362(63, -64);
        }
        field8137 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 20)
    public final void method3359(int arg0) {
        field8136++;
        class348 var2 = this.field8132;
        synchronized (this.field8132) {
            int var3 = -125 % ((arg0 + 67) / 58);
            this.field8132.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Lk;", line = 40)
    public final class61 method3360(int arg0, int arg1) {
        int var3 = 71 / ((-arg0 - 37) / 54);
        field8131++;
        class348 var4 = this.field8132;
        class61 var5;
        synchronized (this.field8132) {
            var5 = (class61) this.field8132.method2216(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class423 var6 = this.field8139;
        byte[] var7;
        synchronized (this.field8139) {
            var7 = this.field8139.method2600(0, 26, arg1);
        }
        class61 var8 = new class61();
        if (var7 != null) {
            var8.method570(new class479(var7), 13371);
        }
        class348 var9 = this.field8132;
        synchronized (this.field8132) {
            this.field8132.method2213((byte) -16, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V", line = 74)
    public static final void method3361(byte arg0) {
        field8134++;
        int var1 = 109 / ((-arg0 - 46) / 55);
        try {
            if (class249.field3628 == 1) {
                int var2 = class36.field325.method1954(-28004);
                if (var2 > 0 && class36.field325.method1950(false)) {
                    int var3 = var2 - class590.field8395;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class36.field325.method1946(14569, var3);
                    return;
                }
                class36.field325.method1966(true);
                class36.field325.method1953(21967);
                class597.field8491 = null;
                class474.field6745 = null;
                if (class445.field6358 == null) {
                    class249.field3628 = 0;
                } else {
                    class249.field3628 = 2;
                }
            }
            if (class249.field3628 == 3) {
                int var4 = class36.field325.method1954(-28004);
                if (class683.field9697 > var4 && class36.field325.method1950(false)) {
                    int var5 = class264.field3789 + var4;
                    if (var5 > class683.field9697) {
                        var5 = class683.field9697;
                    }
                    class36.field325.method1946(14569, var5);
                } else {
                    class249.field3628 = 0;
                    class264.field3789 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class36.field325.method1966(true);
            class474.field6745 = null;
            class11.field98 = null;
            class445.field6358 = null;
            class249.field3628 = 0;
            class597.field8491 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(II)V", line = 140)
    public static final void method3362(int arg0, int arg1) {
        field8140++;
        class503 var2 = class512.method3112(14, arg1, 0);
        var2.method3074(-92);
        if (arg0 != 2628) {
            method3362(127, 21);
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 155)
    public class561(class315 arg0, int arg1, class423 arg2) {
        this.field8139 = arg2;
        this.field8139.method2616(26, 0);
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V", line = 170)
    public final void method3363(int arg0) {
        field8138++;
        class348 var2 = this.field8132;
        synchronized (this.field8132) {
            this.field8132.method2220(false);
        }
        if (arg0 != 0) {
            method3362(-22, 68);
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(II)V", line = 183)
    public final void method3364(int arg0, int arg1) {
        class348 var3 = this.field8132;
        synchronized (this.field8132) {
            this.field8132.method2207(arg1, 1);
        }
        int var4 = -48 / ((-arg0 - 76) / 41);
        field8135++;
    }
}
