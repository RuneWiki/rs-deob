import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public interface class61 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)I")
    int method407(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)I")
    int method408(int arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)J")
    long method409(byte arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III[B)V")
    void method410(int arg0, int arg1, int arg2, byte[] arg3);
}
