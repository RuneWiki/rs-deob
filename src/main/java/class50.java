import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public interface class50 {

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
    void method377(int arg0, boolean arg1, Component arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)I")
    int method378(byte arg0, int arg1);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
    void method379(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[I)V")
    void method380(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V")
    void method381(int arg0, int arg1);

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)V")
    void method382(int arg0, int arg1);
}
