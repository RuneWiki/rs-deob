import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 extends class110 {

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "[Lrf;")
    public class92[] field147;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field148 = -1;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "J")
    public static long field149 = -1L;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Ldt;")
    public static class254 field150 = new class254(1350);

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field152 = 1;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
    public static void method87(byte arg0) {
        field150 = null;
        if (arg0 <= 81) {
            field150 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([Lrf;)V")
    public class15(class92[] arg0) {
        this.field147 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method88(int arg0, int arg1) {
        class765.field10514 = null;
        field151++;
        if (arg1 != 3684) {
            field148 = -55;
        }
        class786.field10798 = -1;
        class289.field4115 = 1;
        class100.field1451 = false;
        class122.field1694 = -1;
        class348.field5049 = null;
        class709.field9701 = arg0;
        class460.field6563 = 0;
    }
}
