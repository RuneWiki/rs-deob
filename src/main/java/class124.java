import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public interface class124 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([I)V")
    void method1016(int[] arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    void method1017(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    void method1018(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1019(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    int method1020(byte arg0);
}
