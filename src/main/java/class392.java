import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public interface class392 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILjava/awt/Component;Z)V")
    void method2255(boolean arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
    void method2256(byte arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
    void method2257(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    void method2258(int arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[I)V")
    void method2259(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    int method2260(int arg0, int arg1);
}
