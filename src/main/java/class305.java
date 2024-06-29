import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class305 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lwt;")
    public static class279 field4531;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[Lf;")
    public static class702[] field4534;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILpu;)V")
    public static final void method1945(int arg0, class522 arg1) {
        field4533++;
        if (arg0 != -11900) {
            method1947(51);
        }
        class254.field3904 = arg1.method2980(-9104, "p11_full");
        class132.field1956 = arg1.method2980(arg0 + 2796, "p12_full");
        class77.field1335 = arg1.method2980(arg0 + 2796, "b12_full");
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1946(int arg0, int arg1) {
        field4535++;
        class671.field9490 = arg1;
        class382 var2 = class513.field7222;
        synchronized (class513.field7222) {
            if (arg0 != -26080) {
                method1946(0, 61);
            }
            class513.field7222.method2285((byte) -126);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field4534 = null;
        if (arg0 == -22344) {
            field4531 = null;
        }
    }
}
