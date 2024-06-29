import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public interface class351 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqa;)V")
    void method11(int arg0, class162 arg1);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
    int method17(int arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    void method15(byte arg0);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
    int method20(int arg0);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
    int method5(byte arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lqa;B)V")
    void method14(class162 arg0, byte arg1);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqa;I)Lc;")
    class121 method9(int arg0, class162 arg1, int arg2);

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Z")
    boolean method7(byte arg0);
}
