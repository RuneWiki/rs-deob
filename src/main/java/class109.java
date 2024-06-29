import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public interface class109 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V")
    void method831(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[I)V")
    void method832(int arg0, int[] arg1);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)I")
    int method833(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V")
    void method834(int arg0, byte arg1);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)V")
    void method835(int arg0, byte arg1);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
    void method836(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception;
}
