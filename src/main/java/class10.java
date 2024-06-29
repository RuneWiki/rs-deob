import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public interface class10 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
    void method44(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[I)V")
    void method45(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
    void method46(int arg0, int arg1);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
    void method47(byte arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)I")
    int method48(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
    void method49(int arg0, int arg1);
}
