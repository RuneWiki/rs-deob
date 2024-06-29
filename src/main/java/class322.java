import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public interface class322 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
    void method2165(int arg0, byte arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method2166(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V")
    void method2167(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    void method2168(int arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    void method2169(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
    int method2170(int arg0, int arg1);
}
