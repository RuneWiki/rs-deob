import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field916 = new Hashtable();

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "J")
    public static long field917;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method488(byte arg0) {
        if (arg0 < -119) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static final void method489(int arg0) {
        field915++;
        class523.field7396.method1913(true);
        int var1 = -9 % ((arg0 - 24) / 54);
    }
}
