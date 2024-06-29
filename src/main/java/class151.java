import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class151 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)V")
    void method918(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
    void method919(int arg0, boolean arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
    void method920(byte arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)I")
    int method921(int arg0, boolean arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    void method922(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[I)V")
    void method923(int arg0, int[] arg1);
}
