import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class12 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lqj;")
    private static class196 field131 = class80.method502("Type", -48);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lqj;")
    public static class196 field136 = field131;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lqj;")
    public static class196 field139 = class80.method502("(U0a )2 via: ", -48);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lqj;")
    public static class196 field142 = class80.method502(")2", -48);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lec;")
    public static class178 field135;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lej;")
    public static class252 field134;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[Lqj;")
    public static class196[] field141;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        if (arg0 != 0) {
            field142 = null;
        }
        field140++;
        if (class168.field2815) {
            class168.field2815 = false;
            class147.field2329 = null;
            class163.field2638 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLp;I)Lqj;")
    public static final class196 method54(byte arg0, class56 arg1, int arg2) {
        field132++;
        if (arg0 != 32) {
            method57(true);
        }
        try {
            class196 var3 = new class196();
            var3.field3459 = arg1.method307((byte) 73);
            if (arg2 < var3.field3459) {
                var3.field3459 = arg2;
            }
            var3.field3448 = new byte[var3.field3459];
            arg1.field699 += class245.field4363.method7(var3.field3459, var3.field3448, arg1.field699, 0, (byte) -101, arg1.field693);
            return var3;
        } catch (Exception var4) {
            return class123.field1755;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLec;)Lqj;")
    public static final class196 method55(boolean arg0, class178 arg1) {
        field138++;
        if (arg0) {
            field133 = 127;
        }
        if (class189.method1234(client.method614(arg1), -202379903) == 0) {
            return null;
        } else if (arg1.field3127 == null || arg1.field3127.method1304(119).method1299(37) == 0) {
            return class236.field4195 ? class67.field955 : null;
        } else {
            return arg1.field3127;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static final void method56(boolean arg0) {
        Object var1 = class20.field230;
        synchronized (class20.field230) {
            if (class127.field1800 != 0) {
                class127.field1800 = 1;
                try {
                    class20.field230.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field137++;
        if (arg0) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public static void method57(boolean arg0) {
        field136 = null;
        field141 = null;
        field135 = null;
        if (!arg0) {
            field142 = null;
            field134 = null;
            field139 = null;
            field131 = null;
        }
    }
}
