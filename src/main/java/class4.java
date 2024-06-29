import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public interface class4 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    void method34(int arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[I)V")
    void method35(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method36(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    void method37(int arg0, byte arg1);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
    int method38(int arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)V")
    void method39(int arg0, byte arg1, int arg2) throws Exception;
}
