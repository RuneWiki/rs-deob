import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class18 extends RuntimeException {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Ljava/lang/String;")
    public String field315;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field311;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public static int[] field312 = new int[32];

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field310 = 100;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lue;")
    public static class222 field309 = new class222(512);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[[[B")
    public static byte[][][] field313;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method124(String arg0, boolean arg1) {
        field307++;
        return arg1 ? class184.method1172((byte) 34, 10, arg0, true) : 34;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method125(int arg0, int arg1) {
        field314++;
        class39 var2 = class149.method935(-90, arg0, arg1);
        var2.method268((byte) -19);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method126(byte arg0) {
        field312 = null;
        if (arg0 > -35) {
            method125(-87, -59);
        }
        field313 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static final void method127(byte arg0) {
        if (arg0 != 45) {
            field309 = null;
        }
        class151.field2094.method944(-118);
        class9.field101.method944(108);
        field316++;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class18(Throwable arg0, String arg1) {
        this.field315 = arg1;
        this.field311 = arg0;
    }
}
