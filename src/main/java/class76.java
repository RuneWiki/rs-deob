import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class76 extends RuntimeException {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Ljava/lang/String;")
    public String field939;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field937;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient;")
    public static client field936;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lbd;")
    public static final class42 method442(int arg0, int arg1) {
        field941++;
        if (arg1 != 0) {
            method443((class306) null, 109);
        }
        return class470.field6623 && class31.field414 <= arg0 && class257.field3763 >= arg0 ? class125.field1641[arg0 - class31.field414] : null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lqq;I)V")
    public static final void method443(class306 arg0, int arg1) {
        class431.field6044 = arg0;
        field940++;
        if (arg1 != 0) {
            field936 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field936 = null;
        int var1 = 15 / ((arg0 - 40) / 32);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILpl;)V")
    public static final void method445(int arg0, class426 arg1) {
        class53.field725[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class76(Throwable arg0, String arg1) {
        this.field939 = arg1;
        this.field937 = arg0;
    }
}
