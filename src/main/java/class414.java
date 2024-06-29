import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class414 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILr;)V")
    public static final void method2205(int arg0, class566 arg1) {
        field5181++;
        if (class84.field1188) {
            class235.method1413(256, arg1);
        } else {
            class629.method3459(16777215, arg1);
        }
        if (arg0 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ct", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5179++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)I")
    public final int method2206(int arg0, int arg1, int arg2) {
        field5180++;
        int var4 = arg0 < class523.field7111 ? class523.field7111 : arg0;
        if (class36.field494 == this) {
            return 0;
        } else if (class686.field9628 == this) {
            return var4 - arg1;
        } else if (class314.field4048 == this) {
            return (var4 - arg1) / 2;
        } else if (arg2 == 2) {
            return 0;
        } else {
            return 34;
        }
    }
}
