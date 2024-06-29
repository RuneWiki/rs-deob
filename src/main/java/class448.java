import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public interface class448 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    void method2753(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[I)V")
    void method2754(int arg0, int[] arg1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)V")
    void method2755(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
    void method2756(int arg0, byte arg1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)I")
    int method2757(byte arg0, int arg1);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)V")
    void method2758(byte arg0, int arg1);
}
