import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lwc;")
    public static class213 field3 = null;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lca;")
    public static class243 field4 = new class243();

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6 = 0;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        if (arg0 != 80) {
            method2(-62);
        }
        field3 = null;
        field4 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method2(int arg0) {
        field2++;
        if (arg0 != -18384) {
            method2(66);
        }
        for (class36 var1 = (class36) class66.field1085.method1720(true); var1 != null; var1 = (class36) class66.field1085.method1712((byte) 112)) {
            if (var1.field557 == -1) {
                var1.field549 = 0;
                class172.method1208((byte) -19, var1);
            } else {
                var1.method764((byte) -43);
            }
        }
    }
}
