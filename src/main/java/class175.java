import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class175 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Z")
    public static boolean field2553;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)I")
    public static final int method1176(int arg0, int arg1, int arg2) {
        field2554++;
        int var3 = arg1 >> 31 & arg0 + arg2;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    static {
        new class304("Use", "Benutzen", "Utiliser", "Usar");
        field2553 = false;
    }
}
