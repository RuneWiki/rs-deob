import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public interface class676 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
    void method3111(int arg0, byte arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I")
    int method3113(byte arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[I)V")
    void method3112(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V")
    void method3110(byte arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method3114(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    void method3115(int arg0, int arg1, byte arg2) throws Exception;
}
