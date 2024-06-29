import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class392 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5446 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lij;")
    public static class316 field5443;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lij;")
    public static class316 field5444;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lij;")
    public static class316 field5445;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method2433(int arg0) {
        class42.field559.method2530((byte) -72);
        field5448++;
        if (arg0 != 27135) {
            method2434(-51, 29);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method2434(int arg0, int arg1) {
        class408 var2 = class146.field2124;
        synchronized (class146.field2124) {
            class146.field2124.method2531(arg1, 112);
        }
        field5447++;
        class408 var3 = class43.field571;
        synchronized (class43.field571) {
            class43.field571.method2531(arg1, 112);
            if (arg0 != 29472) {
                field5446 = 110;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method2435(int arg0) {
        field5443 = null;
        field5444 = null;
        field5445 = null;
        if (arg0 != 0) {
            method2433(-1);
        }
    }
}
