import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class137 {

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Z")
    public static boolean field2351 = false;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "Z")
    public static boolean field2352;

    @OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2348++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
    public class137(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILkka;I)V")
    public static final void method1132(int arg0, class329 arg1, int arg2) {
        class180.field2827 = false;
        class35.field582 = arg2;
        field2350++;
        class47.method347(2, arg1);
        class728.method4040(false, arg1);
        if (class180.field2827) {
            System.out.println("---endgpp---");
        }
        if (arg1.field1442 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field1442 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
    public static final boolean method1133(int arg0, int arg1, int arg2) {
        int var3 = -34 / ((29 - arg2) / 39);
        field2349++;
        return (class787.method4289(arg0, arg1, (byte) 103) | (arg0 & 0x2000) != 0 | class752.method4170(64964, arg1, arg0)) & class281.method1813(arg0, (byte) 89, arg1);
    }
}
