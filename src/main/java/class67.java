import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public interface class67 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[I)V")
    void method525(int arg0, int[] arg1);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
    void method526(byte arg0, int arg1);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
    int method527(int arg0, int arg1);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
    void method528(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V")
    void method529(int arg0, int arg1);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method530(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;
}
