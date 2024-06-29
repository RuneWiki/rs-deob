import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public interface class295 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    void method2017(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[I)V")
    void method2018(int arg0, int[] arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
    int method2019(boolean arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(ZI)V")
    void method2020(boolean arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    void method2021(int arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
    void method2022(Component arg0, int arg1, boolean arg2, byte arg3) throws Exception;
}
