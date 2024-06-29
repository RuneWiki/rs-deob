import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public interface class82 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    void method743(int arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
    int method744(int arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[I)V")
    void method745(int arg0, int[] arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
    void method746(byte arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;IZZ)V")
    void method747(Component arg0, int arg1, boolean arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    void method748(int arg0, int arg1, int arg2) throws Exception;
}
