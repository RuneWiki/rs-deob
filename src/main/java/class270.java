import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class270 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lpn;")
    public static class49 field4275 = new class49(9, -1);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4277 = 0;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Z")
    public static boolean field4278 = false;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public static int[] field4270;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 3)
    public static void method1864(byte arg0) {
        if (arg0 > -36) {
            field4270 = null;
        }
        field4275 = null;
        field4270 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIII)V", line = 23)
    public class270(int arg0, int arg1, int arg2, int arg3) {
        this.field4274 = arg0;
        this.field4271 = arg3;
        this.field4273 = arg2;
        this.field4272 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field4276++;
        throw new IllegalStateException();
    }
}
