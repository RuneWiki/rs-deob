import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public abstract class class580 extends class356 {

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "Z")
    public volatile boolean field8252 = true;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field8249 = -1;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Ljava/lang/String;")
    public static String field8248;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "Z")
    public boolean field8250;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "Z")
    public boolean field8253;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method3266(byte arg0) {
        field8248 = null;
        if (arg0 >= -54) {
            field8247 = 114;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)[B")
    public abstract byte[] method750(int arg0);

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)I")
    public abstract int method749(int arg0);
}
