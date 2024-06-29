import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public interface class109 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
    void method895(int arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    void method896(int arg0, Component arg1) throws Exception;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    void method897(int arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
    int method898(byte arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)V")
    void method899(int[] arg0);
}
