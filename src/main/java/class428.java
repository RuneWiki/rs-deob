import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class428 {

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "J")
    public long field6142;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "Lbga;")
    private class358 field6144;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lkn;")
    public static class737 field6140 = new class737(7, 7);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lcs;")
    public static class342 field6146;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "Laca;")
    public static class724 field6145;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lin;")
    public static class91 field6143;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([Ljava/lang/Object;B[I)V")
    public static final void method2611(Object[] arg0, byte arg1, int[] arg2) {
        class550.method3172(arg2.length - 1, 0, arg2, -119, arg0);
        field6139++;
        if (arg1 > -97) {
            method2612(-67);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6144.method2251(this.field6142, 34192);
        field6141++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
    public static void method2612(int arg0) {
        field6143 = null;
        field6140 = null;
        field6146 = null;
        if (arg0 == -15833) {
            field6145 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lbga;JI)V")
    public class428(class358 arg0, long arg1, int arg2) {
        this.field6142 = arg1;
        this.field6144 = arg0;
    }
}
