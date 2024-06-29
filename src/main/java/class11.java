import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface class11 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    void method84(int arg0, boolean arg1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    void method85(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
    void method86(boolean arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    void method87(byte arg0, int arg1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
    int method88(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[I)V")
    void method89(int arg0, int[] arg1);
}
