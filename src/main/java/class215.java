import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public interface class215 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[I)V")
    void method1329(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I")
    int method1330(int arg0, int arg1);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)V")
    void method1331(int arg0, int arg1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
    void method1332(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method1333(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)V")
    void method1334(byte arg0, int arg1, int arg2) throws Exception;
}
