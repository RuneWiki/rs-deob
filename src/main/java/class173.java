import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class173 extends class479 {

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[S")
    public static short[] field2663 = new short[256];

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2664 = 0;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lpi;")
    public static class342 field2662 = new class342("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method1250(int arg0) {
        class39.method405();
        field2661++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class141.field2244[var1].method1726(arg0 - 69);
        }
        class427.method2563((byte) -64);
        class385.method2384((byte) 33);
        System.gc();
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        if (arg0 < 81) {
            method1251((byte) 86);
        }
        field2662 = null;
        field2663 = null;
    }
}
