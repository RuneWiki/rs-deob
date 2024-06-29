import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public interface class100 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)J")
    long method705(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILc;)Z")
    boolean method706(int arg0, class100 arg1);
}
