import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class636 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field8937;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
    public final int method3601(int arg0) {
        field8939++;
        if (arg0 != 11523) {
            method3602(0, 108);
        }
        return this.field8937;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class636(String arg0, int arg1) {
        this.field8937 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8938++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method3602(int arg0, int arg1) {
        class173.field2956 = arg1;
        field8940++;
        class14 var2 = class638.field8958;
        synchronized (class638.field8958) {
            class638.field8958.method76(-124);
        }
        class14 var3 = class364.field5565;
        synchronized (class364.field5565) {
            class364.field5565.method76(-103);
            if (arg0 > -117) {
                method3602(55, -47);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
    public static int method3603(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
