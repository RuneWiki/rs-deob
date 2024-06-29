import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public interface class154 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    int method1194(int arg0, int arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLjava/awt/Component;IB)V")
    void method1195(boolean arg0, Component arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[I)V")
    void method1196(int arg0, int[] arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    void method1197(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
    void method1198(int arg0, byte arg1);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
    void method1199(int arg0, int arg1);
}
