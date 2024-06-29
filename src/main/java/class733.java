import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class733 extends class753 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[Ltg;")
    public class231[] field10262;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lpia;")
    public static class94 field10263 = new class94(82, 2);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
    public static int[] field10264 = new int[13];

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([Ltg;)V", line = 3)
    public class733(class231[] arg0) {
        this.field10262 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 17)
    public static void method4087(int arg0) {
        field10263 = null;
        int var1 = 37 % ((-arg0 - 56) / 45);
        field10264 = null;
    }
}
