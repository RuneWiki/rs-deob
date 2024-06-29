import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public interface class140 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    void method961(int arg0, int arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)I")
    int method962(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[I)V")
    void method963(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
    void method964(byte arg0, int arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
    void method965(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method966(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;
}
