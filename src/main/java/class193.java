import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public interface class193 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    void method1331(byte arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
    void method1332(Component arg0, boolean arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)V")
    void method1333(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    int method1334(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)V")
    void method1335(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    void method1336(int arg0, int arg1);
}
