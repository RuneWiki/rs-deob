import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class553 extends class426 {

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
    public static boolean field8029 = true;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lwo;")
    public static class690 field8030 = new class690(117, 6);

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Lwo;")
    public static class690 field8034 = new class690(21, 2);

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field8026;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field8028;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field8031;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public int field8032;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lec;")
    public class213 field8027;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "[I")
    public static int[] field8035;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmt;B)Lmt;")
    public static final class364 method3243(class364 arg0, byte arg1) {
        field8033++;
        if (arg1 == 6) {
            class364 var2 = arg0 == null ? new class364() : new class364(arg0);
            var2.method2106(9, 31592, 128);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method3244(boolean arg0) {
        field8030 = null;
        field8034 = null;
        field8035 = null;
        if (!arg0) {
            field8029 = true;
        }
    }
}
