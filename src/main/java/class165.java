import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface class165 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
    void method1024(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    int method1025(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    void method1026(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1027(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    void method1028(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
    void method1029(int arg0, int arg1);
}
