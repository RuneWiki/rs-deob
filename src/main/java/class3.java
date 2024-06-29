import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class3 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        field25++;
        if (!arg0) {
            field22 = -80;
        }
        return this.field21;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static final void method8(int arg0) {
        field23++;
        class453.field6425.method993(((float) class501.field6954.field7860 * 0.1F + 0.7F) * class9.field80);
        class453.field6425.method981(class21.field302, class435.field5911, class100.field1336, (float) (class29.field468 << 2), (float) (class190.field2456 << 2), (float) (class483.field6754 << 2));
        class453.field6425.method927(class510.field7108);
        if (arg0 != -13544) {
            method8(-49);
        }
    }

    @OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field24++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(II)V")
    public class3(int arg0, int arg1) {
        this.field21 = arg0;
    }
}
