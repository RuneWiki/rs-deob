import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface class160 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
    void method1157(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1158(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    void method1159(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    void method1160(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
    int method1161(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)V")
    void method1162(boolean arg0, int arg1, int arg2) throws Exception;
}
