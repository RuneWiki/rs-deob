import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public interface class296 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
    void method1832(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    int method1833(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
    void method1834(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
    void method1835(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
    void method1836(byte arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[I)V")
    void method1837(int arg0, int[] arg1);
}
