import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public interface class107 {

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[I)V")
    void method720(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
    void method721(int arg0, boolean arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)I")
    int method722(int arg0, byte arg1);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)V")
    void method723(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
    void method724(int arg0, int arg1);

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)V")
    void method725(int arg0, int arg1);
}
