import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public interface class723 extends class175 {

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method169(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z")
    boolean method166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
    void method20(boolean arg0);

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
    boolean method167(int arg0);

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method170(boolean arg0, boolean arg1);
}
