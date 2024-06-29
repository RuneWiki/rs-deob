import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class298 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field4191++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILbi;Lbi;I)V", line = 21)
    public static final void method1820(int arg0, class449 arg1, class449 arg2, int arg3) {
        class522.field6971 = arg2;
        field4186++;
        class268.field3739 = arg1;
        if (arg3 == -27447) {
            ;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z", line = 39)
    public static final boolean method1821(int arg0, int arg1) {
        class654.field8864 = arg0 + 1 & 0xFFFF;
        class527.field7028 = true;
        field4188++;
        if (arg1 >= -58) {
            method1821(5, -79);
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 55)
    public final int method1822(int arg0) {
        int var2 = -105 % ((arg0 + 60) / 57);
        field4187++;
        return this.field4190;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V", line = 64)
    public class298(int arg0, int arg1) {
        this.field4190 = arg0;
        this.field4189 = arg1;
    }
}
