import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class21 extends class180 {

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field358 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field359 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field365 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field360 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field362 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field363 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field361 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public int field369 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lji;")
    public class163 field366;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Ltm;")
    public static class112 field364 = new class112("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lmq;")
    public static class104 field367 = new class104(5);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z", line = 3)
    public final boolean method181(int arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            this.field365 = 124;
        }
        field368++;
        if (this.field363 <= arg0 && arg0 <= this.field361 && arg2 >= this.field365 && arg2 <= this.field362) {
            return true;
        } else {
            return arg0 >= this.field358 && this.field359 >= arg0 && arg2 >= this.field360 && this.field369 >= arg2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 21)
    public static void method182(int arg0) {
        if (arg0 != 9773) {
            method182(-84);
        }
        field364 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lji;)V", line = 76)
    public class21(class163 arg0) {
        this.field366 = arg0;
    }
}
