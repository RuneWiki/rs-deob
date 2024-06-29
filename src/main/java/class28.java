import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public interface class28 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method188(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    void method189(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    void method190(int arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
    void method191(byte arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[I)V")
    void method192(int arg0, int[] arg1);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I")
    int method193(int arg0, int arg1);
}
