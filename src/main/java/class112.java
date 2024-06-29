import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public interface class112 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[I)V")
    void method967(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
    void method968(boolean arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method969(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    int method970(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    void method971(byte arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    void method972(int arg0, int arg1, int arg2) throws Exception;
}
