import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class293 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "S")
    public static short field4239;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lub;")
    public static class15 field4238;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lub;")
    public static class15 field4241;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lcc;")
    public static class436 field4240;

    static {
        new class349("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field4239 = 1;
        field4238 = new class15(64);
        field4241 = new class15(50);
        field4242 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Lgn;", line = 3)
    public static final class419 method1981(byte arg0, int arg1) {
        field4237++;
        if (arg0 >= -12) {
            field4241 = null;
        }
        class15 var2 = class100.field1271;
        class419 var3;
        synchronized (class100.field1271) {
            var3 = (class419) class100.field1271.method99(true, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class331.field4779.method643(16, arg1, true);
        class419 var5 = new class419();
        if (var4 != null) {
            var5.method2639(new class130(var4), 0);
        }
        class15 var6 = class100.field1271;
        synchronized (class100.field1271) {
            class100.field1271.method90(var5, (long) arg1, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 53)
    public static void method1982(int arg0) {
        field4238 = null;
        if (arg0 == 16) {
            field4240 = null;
            field4241 = null;
        }
    }
}
