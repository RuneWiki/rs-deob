import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public interface class123 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
    int method722(int arg0, int arg1);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I[I)V")
    void method724(int arg0, int[] arg1);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BI)V")
    void method720(byte arg0, int arg1);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V")
    void method723(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)V")
    void method719(int arg0, int arg1);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method721(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;
}
