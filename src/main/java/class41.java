import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public interface class41 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method224(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    void method225(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)I")
    int method226(byte arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[I)V")
    void method227(int arg0, int[] arg1);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
    void method228(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V")
    void method229(int arg0, int arg1, byte arg2) throws Exception;
}
