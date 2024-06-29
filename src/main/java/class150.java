import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class150 implements Runnable {

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "[Loba;")
    public volatile class218[] field1788 = new class218[2];

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "Z")
    public volatile boolean field1786 = false;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
    public volatile boolean field1785 = false;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Lpt;")
    public static class451 field1787 = new class451(64);

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "Lvj;")
    public static class373 field1790 = new class373(14, 8);

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lcea;")
    public static class180 field1793 = new class180("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Lpq;")
    public class165 field1789;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public static void method820(byte arg0) {
        if (arg0 < 43) {
            field1790 = null;
        }
        field1790 = null;
        field1793 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!aba", name = "run", descriptor = "()V")
    public final void run() {
        field1791++;
        this.field1785 = true;
        try {
            while (!this.field1786) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class218 var2 = this.field1788[var1];
                    if (var2 != null) {
                        var2.method1253(1);
                    }
                }
                class462.method2688(10L, (byte) 110);
                class428.method2485(this.field1789, null, 110);
            }
        } catch (Exception var9) {
            class443.method2597(var9, null, (byte) 106);
        } finally {
            Object var6 = null;
            this.field1785 = false;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)Z")
    public static final boolean method821(int arg0, int arg1, int arg2) {
        field1792++;
        return (class330.field4304[1][arg1][arg0] & 0x2) != arg2;
    }
}
