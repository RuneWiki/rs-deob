import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface class29 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
    void method210(byte arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    void method211(int arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method212(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    void method213(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[I)V")
    void method214(int arg0, int[] arg1);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)I")
    int method215(byte arg0, int arg1);
}
