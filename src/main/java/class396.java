import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public interface class396 extends class542 {

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lvt;")
    class256 method655(int arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
    boolean method651(int arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method652(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
    void method654(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    void method650(boolean arg0);
}
