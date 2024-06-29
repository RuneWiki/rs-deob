import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public interface class682 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II[BI)V")
    void method2001(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)J")
    long method2003(boolean arg0);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
    int method2004(byte arg0);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
    int method2002(byte arg0);
}
