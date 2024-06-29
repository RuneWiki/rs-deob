import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public interface class300 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)V")
    void method1943(byte arg0, int arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[I)V")
    void method1944(int arg0, int[] arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
    void method1945(int arg0, int arg1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V")
    void method1946(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1947(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)I")
    int method1948(byte arg0, int arg1);
}
