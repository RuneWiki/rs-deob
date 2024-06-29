import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class422 extends class152 implements Runnable {

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "Z")
    private boolean field5981 = true;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
    public int field5982 = -1;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Lbw;")
    private class494 field5980;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "Lqv;")
    public static class316 field5983 = new class316(57, 8);

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 5)
    public static void method2504(int arg0) {
        field5983 = null;
        if (arg0 > -29) {
            field5983 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lbw;)V", line = 38)
    public class422(class494 arg0) {
        this.field5980 = arg0;
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V", line = 28)
    public final void method2505(int arg0) {
        int var2 = -7 % ((arg0 - 49) / 56);
        field5978++;
        this.field5981 = false;
    }

    @OriginalMember(owner = "client!nw", name = "run", descriptor = "()V", line = 50)
    public final void run() {
        field5979++;
        while (this.field5981) {
            this.field5980.method2902(73, this);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V", line = 62)
    public final void method2506(boolean arg0) {
        if (!arg0) {
            field5983 = null;
        }
        field5977++;
        (new Thread(this, "a")).start();
    }
}
