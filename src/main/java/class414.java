import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public interface class414 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    int method2554(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V")
    void method2555(int arg0, int[] arg1);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
    void method2556(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V")
    void method2557(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method2558(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZII)V")
    void method2559(boolean arg0, int arg1, int arg2) throws Exception;
}
