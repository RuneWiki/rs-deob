import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class505 {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7065++;
        throw new IllegalStateException();
    }
}
