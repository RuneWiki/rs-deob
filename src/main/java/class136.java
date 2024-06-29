import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class136 extends class476 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "J")
    public long field2059;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lkc;")
    public static class157 field2062 = new class157("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "F")
    public static float field2060;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method974(boolean arg0) {
        if (arg0) {
            field2062 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class136() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(J)V")
    public class136(long arg0) {
        this.field2059 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public static final void method975(boolean arg0) {
        field2061++;
        class167.method1160(-10560);
        class44.field635 = null;
        class280.field3811 = null;
        class119.field1860 = null;
        class228.field3204 = null;
        if (arg0) {
            field2060 = 1.5564233F;
        }
        class419.field6072 = null;
    }
}
