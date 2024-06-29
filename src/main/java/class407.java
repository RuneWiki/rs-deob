import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class407 extends class435 {

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field5977;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field5970 = 1407;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field5976 = 0;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Liu;")
    public static class390 field5973 = new class390(27, 6);

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lmo;")
    public static class507 field5974;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(Z)Z")
    public final boolean method1225(boolean arg0) {
        if (arg0) {
            field5970 = 97;
        }
        field5975++;
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2437(String arg0, boolean arg1) {
        field5972++;
        if (class216.field3033 != null) {
            class86.field1181++;
            class386.method2321(true, class304.field4411);
            class79.field1108.method947(-70, class100.method604((byte) 127, arg0));
            class79.field1108.method956(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    public static void method2438(int arg0) {
        field5973 = null;
        field5974 = null;
        if (arg0 != 27) {
            method2438(96);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class407(Object arg0, int arg1) {
        super(arg1);
        this.field5977 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1226(int arg0) {
        field5978++;
        return arg0 == -1 ? this.field5977 : null;
    }
}
