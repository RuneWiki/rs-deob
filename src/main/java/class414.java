import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class414 {

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "Lok;")
    private class228 field6017;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field6013 = 4;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Ldg;")
    public static class376 field6015 = new class376(56, 12);

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "Ldg;")
    public static class376 field6018 = new class376(25, 8);

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public static void method2487(byte arg0) {
        field6015 = null;
        field6018 = null;
        if (arg0 >= -49) {
            field6018 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6016++;
        this.field6017.method1515(this.field6014, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lok;II)V")
    public class414(class228 arg0, int arg1, int arg2) {
        this.field6014 = arg2;
        this.field6017 = arg0;
    }
}
