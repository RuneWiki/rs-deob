import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public interface class98 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    int method712(int arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    void method713(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[I)V")
    void method714(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
    void method715(int arg0, byte arg1);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
    void method716(int arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/awt/Component;ZI)V")
    void method717(byte arg0, Component arg1, boolean arg2, int arg3) throws Exception;
}
