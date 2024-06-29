import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public interface class102 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I")
    int method630(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    void method631(int arg0, int arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V")
    void method632(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[I)V")
    void method633(int arg0, int[] arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method634(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
    void method635(byte arg0, int arg1);
}
