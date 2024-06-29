import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface class89 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    void method783(int arg0, int arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[I)V")
    void method784(int arg0, int[] arg1);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
    void method785(int arg0, int arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
    void method786(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I")
    int method787(int arg0, byte arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method788(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;
}
