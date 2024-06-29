import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public interface class138 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    void method998(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[I)V")
    void method999(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1000(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I")
    int method1001(byte arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI)V")
    void method1002(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V")
    void method1003(int arg0, int arg1);
}
