import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public interface class749 {

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
    int method1408(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)J")
    long method1405(boolean arg0);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I")
    int method1410(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([BIIZ)V")
    void method1409(byte[] arg0, int arg1, int arg2, boolean arg3);
}
