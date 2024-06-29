import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class191 extends IOException {

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3162 = new Hashtable();

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "B")
    public static byte field3164;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(JB)V")
    public static final void method1525(long arg0, byte arg1) {
        field3163++;
        try {
            if (arg1 < -84) {
                Thread.sleep(arg0);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class191(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
    public static void method1526(byte arg0) {
        if (arg0 >= -4) {
            field3164 = 25;
        }
        field3162 = null;
    }
}
