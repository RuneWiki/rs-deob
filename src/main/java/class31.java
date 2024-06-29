import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public interface class31 extends class367 {

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V")
    void method166(byte arg0);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method167(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    boolean method168(Source arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)Z")
    boolean method169(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
    boolean method170(int arg0);
}
