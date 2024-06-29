import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface class35 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[I)V")
    void method216(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method217(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    void method218(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    void method219(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)I")
    int method220(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
    void method221(byte arg0, int arg1);
}
