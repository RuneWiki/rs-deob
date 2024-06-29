import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class11 extends class36 {

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Z")
    public volatile boolean field115 = true;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Z")
    public boolean field118;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
    public boolean field120;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
    public static int[] field119;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 11)
    public static final void method65(byte arg0) {
        field114++;
        if (class24.field308 > 0) {
            class37.method209(-100);
            return;
        }
        class146.field2007 = class39.field442;
        class39.field442 = null;
        if (arg0 == -21) {
            class189.method1325(1, 40);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 43)
    public static void method67(boolean arg0) {
        if (arg0) {
            field119 = (int[]) null;
        }
        field119 = null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)I")
    public abstract int method64(byte arg0);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)[B")
    public abstract byte[] method66(byte arg0);
}
