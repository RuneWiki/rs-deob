import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public interface class101 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
    void method680(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
    int method681(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[I)V")
    void method682(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method683(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
    void method684(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    void method685(int arg0, int arg1, int arg2) throws Exception;
}
