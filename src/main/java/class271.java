import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class271 extends IOException {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lro;")
    public static class2 field3785 = new class2();

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3787 = new Hashtable();

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class271(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIB)Lol;")
    public static final class287 method1629(boolean arg0, int arg1, byte arg2) {
        if (arg2 == -60) {
            field3786++;
            long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
            return (class287) class78.field953.method2135(var3, (byte) 31);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method1630(int arg0) {
        if (arg0 == 0) {
            field3787 = null;
            field3785 = null;
        }
    }
}
