import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface class302 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
    int method1906(boolean arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    int method1905(int arg0);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)J")
    long method1904(int arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BIII)V")
    void method1902(byte[] arg0, int arg1, int arg2, int arg3);
}
