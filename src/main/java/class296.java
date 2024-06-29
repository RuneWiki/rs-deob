import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class296 {

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lqh;")
    public class287 field5060 = new class287();

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lmh;")
    public static class128 field5051 = class22.method156(126, "runes");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lmh;")
    public static class128 field5057 = class22.method156(125, "::wm0");

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lqh;")
    private class287 field5062;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lqh;", line = 6)
    public final class287 method2020(byte arg0) {
        if (arg0 > -40) {
            this.method2029((byte) -58, (class287) null);
        }
        field5052++;
        class287 var2 = this.field5060.field4902;
        if (this.field5060 == var2) {
            return null;
        } else {
            var2.method1978((byte) 113);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 30)
    public static final void method2021(Component arg0, int arg1) {
        field5055++;
        if (arg1 != 1211754408) {
            method2021((Component) null, 109);
        }
        Method var2 = class270.field4688;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class210.field3715);
        arg0.addFocusListener(class210.field3715);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILqh;)V", line = 54)
    public final void method2022(int arg0, class287 arg1) {
        if (arg1.field4914 != null) {
            arg1.method1978((byte) 106);
        }
        arg1.field4902 = this.field5060.field4902;
        int var3 = -39 / ((arg0 + 44) / 48);
        field5053++;
        arg1.field4914 = this.field5060;
        arg1.field4914.field4902 = arg1;
        arg1.field4902.field4914 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lqh;", line = 70)
    public final class287 method2023(byte arg0) {
        if (arg0 >= -34) {
            return (class287) null;
        }
        field5058++;
        class287 var2 = this.field5062;
        if (this.field5060 == var2) {
            this.field5062 = null;
            return null;
        } else {
            this.field5062 = var2.field4914;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Lqh;", line = 90)
    public final class287 method2024(int arg0) {
        field5047++;
        if (arg0 != 0) {
            field5051 = (class128) null;
        }
        class287 var2 = this.field5060.field4902;
        if (this.field5060 == var2) {
            this.field5062 = null;
            return null;
        } else {
            this.field5062 = var2.field4902;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V", line = 127)
    public final void method2025(byte arg0) {
        if (arg0 != -97) {
            this.method2024(122);
        }
        while (true) {
            class287 var2 = this.field5060.field4902;
            if (this.field5060 == var2) {
                field5056++;
                this.field5062 = null;
                return;
            }
            var2.method1978((byte) 80);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I", line = 171)
    public static final int method2026(int arg0, byte arg1) {
        field5048++;
        if (arg1 <= 108) {
            method2028(true);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lqh;", line = 182)
    public final class287 method2027(int arg0) {
        field5046++;
        class287 var2 = this.field5062;
        if (this.field5060 == var2) {
            this.field5062 = null;
            return null;
        }
        this.field5062 = var2.field4902;
        if (arg0 != 1211754408) {
            field5051 = (class128) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 205)
    public static final void method2028(boolean arg0) {
        field5061++;
        if (arg0) {
            method2021((Component) null, -73);
        }
        for (class236 var1 = (class236) class214.field3777.method2024(0); var1 != null; var1 = (class236) class214.field3777.method2027(1211754408)) {
            if (var1.field4064 == -1) {
                var1.field4048 = 0;
                class50.method344(var1, -119);
            } else {
                var1.method1978((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLqh;)V", line = 233)
    public final void method2029(byte arg0, class287 arg1) {
        if (arg0 != -34) {
            method2032(-108);
        }
        field5049++;
        if (arg1.field4914 != null) {
            arg1.method1978((byte) -106);
        }
        arg1.field4902 = this.field5060;
        arg1.field4914 = this.field5060.field4914;
        arg1.field4914.field4902 = arg1;
        arg1.field4902.field4914 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILdj;)Lfb;", line = 256)
    public static final class55 method2030(int arg0, int arg1, class314 arg2) {
        if (arg1 != 0) {
            method2028(true);
        }
        field5054++;
        return class285.method1972(arg0, arg2, -128) ? class3.method18(true) : null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 279)
    public class296() {
        this.field5060.field4902 = this.field5060;
        this.field5060.field4914 = this.field5060;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Lqh;", line = 290)
    public final class287 method2031(int arg0) {
        class287 var2 = this.field5060.field4914;
        field5050++;
        if (arg0 != 1211754408) {
            method2028(true);
        }
        if (this.field5060 == var2) {
            this.field5062 = null;
            return null;
        } else {
            this.field5062 = var2.field4914;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 310)
    public static void method2032(int arg0) {
        if (arg0 >= -71) {
            method2026(78, (byte) 55);
        }
        field5051 = null;
        field5057 = null;
    }
}
