import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public interface class622 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method2346(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    void method2345(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    void method2350(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[I)V")
    void method2348(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
    int method2349(byte arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    void method2347(int arg0, int arg1);
}
