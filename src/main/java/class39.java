import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public interface class39 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
    int method236(int arg0, int arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V")
    void method237(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    void method238(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
    void method239(int arg0, int arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method240(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[I)V")
    void method241(int arg0, int[] arg1);
}
