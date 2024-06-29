import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public interface class601 extends class90 {

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    void method32(int arg0);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBI)Z")
    boolean method41(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z")
    boolean method36(int arg0);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z")
    boolean method38(byte arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method39(boolean arg0, int arg1);
}
