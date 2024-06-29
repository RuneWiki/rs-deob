import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface class322 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    void method2035(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)I")
    int method2036(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
    void method2037(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IZ)V")
    void method2038(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method2039(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    void method2040(int arg0, int arg1, int arg2) throws Exception;
}
