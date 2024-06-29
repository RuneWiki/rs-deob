import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public interface class179 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[I)V")
    void method1248(int arg0, int[] arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
    int method1249(int arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)V")
    void method1250(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
    void method1251(int arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
    void method1252(int arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1253(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;
}
