import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public interface class642 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)I")
    int method832(int arg0, int arg1);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I[I)V")
    void method834(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBI)V")
    void method836(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V")
    void method831(int arg0, byte arg1);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method833(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
    void method835(int arg0, int arg1);
}
