import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public interface class301 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    void method2069(int arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    void method2070(int arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
    void method2071(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method2072(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[I)V")
    void method2073(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
    int method2074(int arg0, boolean arg1);
}
