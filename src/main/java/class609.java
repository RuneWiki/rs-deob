import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class609 {

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "Lpq;")
    private class159 field8311;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "Lcb;")
    public static class318 field8306 = new class318(12, 6);

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "Lnl;")
    public static class50 field8310 = new class50(1);

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public static int field8313 = 0;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Lct;")
    private class374 field8303;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIILjava/lang/Class;)Lhc;", line = 4)
    public static final class293 method3354(int arg0, int arg1, int arg2, Class arg3) {
        class651 var4 = class145.field1841[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class82 var5 = var4.field9228; var5 != null; var5 = var5.field1024) {
            class293 var6 = var5.field1027;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3921 == arg1 && var6.field3920 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lct;", line = 28)
    private final class374 method3355(int arg0) {
        if (this.field8303 == null) {
            this.field8303 = new class374();
        }
        field8305++;
        if (arg0 != 0) {
            this.field8311 = null;
        }
        return this.field8303;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIIIII)Z", line = 42)
    public static final boolean method3356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8304++;
        if ((arg1 + arg2) <= arg5 || arg1 >= (arg0 + arg5)) {
            return false;
        } else if (arg3 < arg4 + arg7 && arg3 + arg8 > arg4) {
            int var9 = 68 / ((73 - arg6) / 32);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZI)V", line = 58)
    public static final void method3357(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (field8313 <= arg4 && arg4 <= class19.field169) {
            int var5 = class191.method1226(arg2, class398.field5676, class298.field3995, 16);
            int var6 = class191.method1226(arg1, class398.field5676, class298.field3995, 16);
            class457.method2585(arg0, (byte) 125, var6, arg4, var5);
        }
        if (arg3) {
            method3357(67, 123, 75, true, 104);
        }
        field8309++;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V", line = 76)
    public static void method3358(boolean arg0) {
        field8306 = null;
        if (arg0) {
            method3359(null, -18);
        }
        field8310 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 88)
    public static final int method3359(String arg0, int arg1) {
        field8312++;
        for (int var2 = 0; var2 < class154.field1913.length; var2++) {
            if (class154.field1913[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return arg1 == 2 ? -1 : 19;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lgca;I)Lmv;", line = 113)
    public final class415 method3360(class126 arg0, int arg1) {
        field8307++;
        if (arg0 == null) {
            return null;
        }
        class606 var3 = arg0.method472((byte) -110);
        if (class45.field601 == var3) {
            return new class485((class314) arg0);
        } else if (class210.field2753 == var3) {
            return new class355(this.method3355(arg1 + 407384121), (class667) arg0);
        } else if (class167.field2085 == var3) {
            return new class45(this.field8311, (class422) arg0);
        } else if (class226.field2935 == var3) {
            return new class48(this.field8311, (class316) arg0);
        } else if (class225.field2928 == var3) {
            return new class32((class194) arg0);
        } else if (class56.field787 == var3) {
            return new class144(this.field8311, (class84) arg0);
        } else if (class428.field5943 == var3) {
            return new class35(this.field8311, (class118) arg0);
        } else if (arg1 != -407384121) {
            return null;
        } else if (class689.field9732 == var3) {
            return new class447((class404) arg0);
        } else if (class106.field1273 == var3) {
            return new class230(this.field8311, (class448) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBII)I", line = 178)
    public static final int method3361(int arg0, byte arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1 == 38) {
            field8308++;
            return (arg2 >> 5 << 7) + (((arg0 & 0xFF) >> 2 << 10) + (arg3 >> 1));
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lpq;)V", line = 204)
    public class609(class159 arg0) {
        this.field8311 = arg0;
    }
}
