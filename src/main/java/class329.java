import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class329 extends class365 {

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Lsm;")
    public static class156 field4770;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
    public static final void method2163(int arg0) {
        field4768++;
        class381.field5412 = 0;
        class228.field3392.method2755(arg0 ^ arg0);
        class228.field3392.method2756(69, class407.field5764);
        class381.field5412++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public static void method2164(byte arg0) {
        field4770 = null;
        if (arg0 != -11) {
            method2165((byte) -106);
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
    public static final void method2165(byte arg0) {
        class15 var1 = class100.field1271;
        synchronized (class100.field1271) {
            if (arg0 != 115) {
                return;
            }
            class100.field1271.method98(0);
        }
        field4769++;
    }

    static {
        new class349("Select", "Auswählen", "Sélectionner", "Selecionar");
        new class349(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
