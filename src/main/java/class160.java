import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public interface class160 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)I")
    int method869(int arg0, int arg1);

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(II)V")
    void method870(int arg0, int arg1);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method871(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
    void method872(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[I)V")
    void method873(int arg0, int[] arg1);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BI)V")
    void method874(byte arg0, int arg1);
}
