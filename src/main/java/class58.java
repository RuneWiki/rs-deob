import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fg")
public interface class58 {

    @OriginalMember(owner = "fg", name = "a", descriptor = "(IB)V")
    void method381(int arg0, byte arg1);

    @OriginalMember(owner = "fg", name = "a", descriptor = "(II)V")
    void method382(int arg0, int arg1);

    @OriginalMember(owner = "fg", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method383(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "fg", name = "a", descriptor = "(III)V")
    void method384(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "fg", name = "a", descriptor = "(I[I)V")
    void method385(int arg0, int[] arg1);

    @OriginalMember(owner = "fg", name = "b", descriptor = "(II)I")
    int method386(int arg0, int arg1);
}
