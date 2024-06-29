import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public interface class103 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[I)V")
    void method697(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    void method698(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    void method699(byte arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method700(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
    int method701(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
    void method702(int arg0, int arg1, boolean arg2) throws Exception;
}
