import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public interface class76 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
    void method497(int arg0, boolean arg1, Component arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
    void method498(byte arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
    void method499(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V")
    void method500(byte arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(BI)I")
    int method501(byte arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[I)V")
    void method502(int arg0, int[] arg1);
}
