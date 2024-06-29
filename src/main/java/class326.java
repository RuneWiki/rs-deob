import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class326 {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field4586 = -1;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
    public static volatile boolean field4590 = false;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lku;")
    public static class217 field4583;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Ljava/lang/String;")
    public String field4584;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lri;Lri;B)V")
    public static final void method2060(class461 arg0, class461 arg1, byte arg2) {
        if (arg0.field6446 != null) {
            arg0.method2773(123);
        }
        if (arg2 != 123) {
            return;
        }
        field4587++;
        arg0.field6448 = arg1;
        arg0.field6446 = arg1.field6446;
        arg0.field6446.field6448 = arg0;
        arg0.field6448.field6446 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method2061(byte arg0) throws IOException {
        if (arg0 != -67) {
            field4590 = true;
        }
        field4588++;
        return new Socket(this.field4584, this.field4585);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static final void method2062(int arg0) {
        int var1 = 8 % ((40 - arg0) / 52);
        class447.field6257 = new class171(class712.field9857.method3999(class553.field7667, (byte) -126), "", class213.field2954, 1010, -1, 0L, 0, 0, true, false, 0L, true);
        field4582++;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method31(byte arg0) throws IOException;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
    public static void method2063(boolean arg0) {
        if (!arg0) {
            field4583 = null;
        }
        field4583 = null;
    }
}
