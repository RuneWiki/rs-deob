import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class323 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lwo;")
    private class314 field4118 = new class314();

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Ljava/lang/String;")
    public String field4124;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public static int[] field4122 = new int[200];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lga;")
    public static class70 field4115 = new class70("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    private volatile int field4131;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lol;")
    private class413 field4130;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lga;")
    public static class70 field4120;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[[Lgaa;")
    public static class460[][] field4125;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvv;I)I", line = 3)
    public static final int method1904(class442 arg0, int arg1) {
        field4123++;
        if (class409.field5765 == arg0) {
            return 7681;
        } else if (class155.field1901 == arg0) {
            return 8448;
        } else if (class353.field4729 == arg0) {
            return 34165;
        } else if (class235.field3034 == arg0) {
            return 260;
        } else if (class262.field3332 == arg0) {
            return 34023;
        } else {
            if (arg1 != -11) {
                field4127 = -94;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Z", line = 34)
    public final boolean method1905(boolean arg0) {
        if (arg0) {
            this.method1906(null, true);
        }
        field4116++;
        return this.field4131 == 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lmb;Z)V", line = 54)
    public final void method1906(class410 arg0, boolean arg1) {
        field4128++;
        arg0.field5788 = true;
        class314 var3 = this.field4118;
        synchronized (this.field4118) {
            if (arg1) {
                this.field4124 = null;
            }
            this.field4118.method1840(18, arg0);
            this.field4131++;
        }
        if (this.field4130 != null) {
            class413 var4 = this.field4130;
            synchronized (this.field4130) {
                this.field4130.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 78)
    public static void method1907(int arg0) {
        field4120 = null;
        field4115 = null;
        field4125 = null;
        if (arg0 <= 105) {
            field4122 = null;
        }
        field4122 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Lcca;", line = 93)
    public final class696 method1908(byte arg0) {
        int var2 = 76 % ((arg0 + 64) / 45);
        field4121++;
        Object var3 = null;
        class314 var4 = this.field4118;
        synchronized (this.field4118) {
            class696 var5 = this.field4118.method1839(-125);
            var5.method3869(true);
            this.field4131--;
            return var5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBII)V", line = 111)
    public static final void method1909(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -25) {
            field4120 = null;
        }
        int var4 = class223.field2944.field593.method3601((byte) -124) * arg0 >> 8;
        field4126++;
        if (arg3 == -1 && !class537.field7549) {
            class667.method3608(true);
        } else if (arg3 != -1 && (class601.field8357 != arg3 || !class141.method874(-16768)) && var4 != 0 && !class537.field7549) {
            class235.method1476(false, 0, var4, arg2, arg3, class456.field6388, 0);
            class519.method2979((byte) -120);
        }
        if (class601.field8357 != arg3) {
            class374.field5250 = null;
        }
        class601.field8357 = arg3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lol;B)V", line = 143)
    public final void method1910(class413 arg0, byte arg1) {
        this.field4130 = arg0;
        field4119++;
        if (arg1 >= -52) {
            field4115 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLrg;)V", line = 154)
    public final void method1911(byte arg0, class560 arg1) {
        if (arg0 <= 47) {
            method1912(94, -77);
        }
        field4114++;
        class314 var3 = this.field4118;
        synchronized (this.field4118) {
            this.field4118.method1840(18, arg1);
            this.field4131++;
        }
        if (this.field4130 != null) {
            class413 var4 = this.field4130;
            synchronized (this.field4130) {
                this.field4130.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z", line = 185)
    public static final boolean method1912(int arg0, int arg1) {
        field4117++;
        if (arg1 == 4973) {
            return arg0 == 10 || arg0 == 5 || arg0 == 58 || arg0 == 25 || arg0 == 46 || arg0 == 47 || arg0 == 11;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lmb;B)V", line = 199)
    public final void method1913(class410 arg0, byte arg1) {
        arg0.field5788 = false;
        field4129++;
        class314 var3 = this.field4118;
        synchronized (this.field4118) {
            this.field4118.method1840(18, arg0);
            this.field4131++;
            if (arg1 > -98) {
                field4120 = null;
            }
        }
        if (this.field4130 != null) {
            class413 var4 = this.field4130;
            synchronized (this.field4130) {
                this.field4130.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 227)
    public class323(String arg0) {
        this.field4124 = arg0;
    }
}
