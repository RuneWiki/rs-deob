import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public interface class283 {

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V")
    void method1077(int arg0, int arg1);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
    void method1079(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method1081(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I[I)V")
    void method1078(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)I")
    int method1080(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(IZ)V")
    void method1076(int arg0, boolean arg1);
}
