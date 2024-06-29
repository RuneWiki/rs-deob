import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public interface class120 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)I")
    int method833(byte arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    void method834(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[I)V")
    void method835(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
    void method836(boolean arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(BI)V")
    void method837(byte arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    void method838(int arg0, int arg1);
}
