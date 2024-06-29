import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public interface class62 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    int method414(int arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    void method415(int arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
    void method416(byte arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
    void method417(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    void method418(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[I)V")
    void method419(int arg0, int[] arg1);
}
