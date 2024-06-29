import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class51 extends class381 {

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public int field789 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public int field795 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public int field792 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public int field793 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public int field799 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public int field794 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public int field800 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public int field786 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "Lhi;")
    public class415 field798;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Z")
    public static boolean field790 = false;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Lmv;")
    public static class295 field797;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "[[B")
    public static byte[][] field801;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 7)
    public static void method302(int arg0) {
        field801 = null;
        field797 = null;
        if (arg0 != -9218) {
            field801 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lhi;)V", line = 107)
    public class51(class415 arg0) {
        this.field798 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 21)
    public static final void method303(byte arg0) {
        if (arg0 != 69) {
            method302(-4);
        }
        class222.field2941.method3890(-1);
        field788++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method304(boolean arg0) {
        if (!arg0) {
            method303((byte) 20);
        }
        field791++;
        class14.field324 = null;
        class504.method2871(class425.field6218, -1, class454.field6538, 0, class567.field8270, 0, (byte) -35, 0, 0);
        if (class14.field324 != null) {
            class148.method1061(0, class425.field6218, class272.field3554.field79, 0, class252.field3303, class454.field6538, -1412584499, 127, class14.field324, class661.field9417);
            class14.field324 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Z", line = 71)
    public final boolean method305(int arg0, int arg1, int arg2) {
        field787++;
        int var4 = -35 % ((arg2 - 2) / 57);
        if (this.field794 <= arg0 && arg0 <= this.field786 && arg1 >= this.field789 && this.field793 >= arg1) {
            return true;
        } else {
            return arg0 >= this.field800 && this.field792 >= arg0 && arg1 >= this.field795 && this.field799 >= arg1;
        }
    }
}
