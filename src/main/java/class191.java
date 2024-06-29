import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public interface class191 {

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)I")
    int method1383(int arg0, byte arg1);

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1384(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
    void method1385(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
    void method1386(int arg0, int arg1);

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[I)V")
    void method1387(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(II)V")
    void method1388(int arg0, int arg1);
}
