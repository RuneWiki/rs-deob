import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class150 extends class513 {

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
    public volatile boolean field2489 = true;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[I")
    public static int[] field2491 = new int[2];

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Z")
    public boolean field2487;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "Z")
    public boolean field2490;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)V", line = 8)
    public static void method1193(boolean arg0) {
        field2491 = null;
        if (arg0) {
            method1193(false);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
    public abstract int method1192(int arg0);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1194(byte arg0);
}
