import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public interface class321 extends class499 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z")
    boolean method616(byte arg0);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lge;")
    class608 method1478(int arg0);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method613(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    void method1477(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    void method618(byte arg0);
}
