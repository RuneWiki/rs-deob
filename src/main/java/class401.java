import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public interface class401 extends class616 {

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    void method323(int arg0);

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    boolean method326(Source arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Z")
    boolean method322(int arg0);

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method325(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Z")
    boolean method324(int arg0, int arg1, int arg2);
}
