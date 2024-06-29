import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class171 extends class418 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lm;")
    public class242 field2345 = new class242();

    @OriginalMember(owner = "client!v", name = "k", descriptor = "J")
    public static long field2341 = -1L;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lsj;")
    public static class248 field2342 = null;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V", line = 3)
    public static final void method1145(int arg0, int arg1) {
        if (arg0 != -10924) {
            field2342 = null;
        }
        field2344++;
        class51 var2 = class424.field6173;
        synchronized (class424.field6173) {
            class424.field6173.method379(arg1, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfb;Z)Lcl;", line = 19)
    public static final class39 method1146(class341 arg0, boolean arg1) {
        if (arg1) {
            field2341 = -30L;
        }
        field2343++;
        return new class39(arg0.method2212(-2), arg0.method2212(-2), arg0.method2212(-2), arg0.method2212(-2), arg0.method2249(32767), arg0.method2249(32767), arg0.method2233((byte) 104));
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 30)
    public static void method1147(byte arg0) {
        field2342 = null;
        if (arg0 != 56) {
            field2341 = 76L;
        }
    }
}
