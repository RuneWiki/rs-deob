import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class392 extends class445 {

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public int field5436 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public int field5440 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public int field5435 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public int field5443 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public int field5447 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public int field5446 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public int field5438 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public int field5442 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "Ljg;")
    public class205 field5444;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[S")
    public static short[] field5445 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Lh;")
    public static class434 field5434 = new class434(51, -1);

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Lvi;")
    public static class347 field5448;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[[Lnk;")
    public static class464[][] field5437;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljg;)V", line = 75)
    public class392(class205 arg0) {
        this.field5444 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z", line = 16)
    public final boolean method2398(int arg0, byte arg1, int arg2) {
        field5441++;
        if (arg0 >= this.field5440 && arg0 <= this.field5442 && this.field5443 <= arg2 && arg2 <= this.field5438) {
            return true;
        } else {
            if (arg1 != -20) {
                method2399(50);
            }
            return this.field5436 <= arg0 && arg0 <= this.field5446 && this.field5435 <= arg2 && arg2 <= this.field5447;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 59)
    public static void method2399(int arg0) {
        field5437 = null;
        if (arg0 == -8256) {
            field5434 = null;
            field5445 = null;
            field5448 = null;
        }
    }
}
