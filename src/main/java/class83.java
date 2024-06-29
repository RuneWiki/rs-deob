import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public interface class83 {

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBI)V")
    void method514(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
    int method515(int arg0, int arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method516(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[I)V")
    void method517(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
    void method518(int arg0, int arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
    void method519(byte arg0, int arg1);
}
