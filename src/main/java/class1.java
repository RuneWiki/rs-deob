import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public interface class1 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III[B)V")
    void method1(int arg0, int arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)I")
    int method2(boolean arg0);

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)J")
    long method3(boolean arg0);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
    int method4(int arg0);
}
