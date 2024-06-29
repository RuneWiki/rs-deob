import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public interface class371 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
    void method1334(int arg0, int arg1);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I[I)V")
    void method1331(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)V")
    void method1332(int arg0, int arg1);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1333(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBI)V")
    void method1330(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(II)I")
    int method1329(int arg0, int arg1);
}
