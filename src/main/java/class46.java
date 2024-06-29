import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public interface class46 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
    void method316(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method317(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    int method318(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
    void method319(byte arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[I)V")
    void method320(int arg0, int[] arg1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    void method321(int arg0, int arg1);
}
