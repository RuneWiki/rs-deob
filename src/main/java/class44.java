import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public interface class44 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)I")
    int method320(int arg0, int arg1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
    void method321(byte arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)V")
    void method322(byte arg0, int arg1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[I)V")
    void method323(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIB)V")
    void method324(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
    void method325(int arg0, int arg1);
}
