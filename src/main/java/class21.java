import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class21 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I")
    int method110(byte arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILza;)V")
    void method111(int arg0, class290 arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    int method112(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Z")
    boolean method113(int arg0);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
    int method114(int arg0);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    void method115(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILza;I)Le;")
    class377 method116(int arg0, class290 arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lza;B)V")
    void method117(class290 arg0, byte arg1);
}
