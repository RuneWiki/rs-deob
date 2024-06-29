import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class37 extends class29 {

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lhl;")
    public class154 field605;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[Lka;")
    public static class293[] field602;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[[Lqj;")
    public static class264[][] field600;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "[[Lri;")
    public static class301[][] field604;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 9)
    public static void method292(int arg0) {
        int var1 = 115 % ((-arg0 - 78) / 45);
        field600 = (class264[][]) null;
        field604 = (class301[][]) null;
        field602 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lhl;)V", line = 41)
    public class37(class154 arg0) {
        this.field605 = arg0;
    }
}
