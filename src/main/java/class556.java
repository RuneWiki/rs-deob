import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public interface class556 extends class341 {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method2143(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)Lvea;")
    class404 method2144(byte arg0);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
    void method1765(int arg0, int arg1);

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
    void method1758(byte arg0);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z")
    boolean method2145(boolean arg0);
}
