import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface class110 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    int method797(int arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method798(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[I)V")
    void method799(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    void method800(int arg0, byte arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    void method801(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)V")
    void method802(int arg0, byte arg1);
}
