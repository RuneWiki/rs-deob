import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface class183 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
    void method1186(byte arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
    void method1187(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V")
    void method1188(byte arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I)V")
    void method1189(int arg0, int[] arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    int method1190(int arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method1191(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;
}
