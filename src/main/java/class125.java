import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface class125 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    void method853(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[I)V")
    void method854(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V")
    void method855(byte arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    void method856(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    void method857(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)I")
    int method858(byte arg0, int arg1);
}
