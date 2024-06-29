import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class571 extends class329 implements Runnable {

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Z")
    private boolean field8374 = true;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public int field8375 = -1;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Lwr;")
    private class386 field8378;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "Ljava/lang/String;")
    public static String field8376 = "";

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field8381 = 0;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V", line = 5)
    public static final void method3324(int arg0, int arg1) {
        field8373++;
        class557 var2 = class93.method564(arg1, arg1 ^ 0xFFFFC905, arg0);
        var2.method3264(-1037624096);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V", line = 16)
    public final void method3325(byte arg0) {
        (new Thread(this, "a")).start();
        if (arg0 <= 104) {
            field8381 = 121;
        }
        field8377++;
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(B)V", line = 31)
    public static void method3326(byte arg0) {
        field8376 = null;
        if (arg0 != -18) {
            method3324(-83, 33);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lwr;)V", line = 75)
    public class571(class386 arg0) {
        this.field8378 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V", line = 44)
    public final void method3327(boolean arg0) {
        field8379++;
        this.field8374 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "run", descriptor = "()V", line = 53)
    public final void run() {
        field8380++;
        while (this.field8374) {
            this.field8378.method2224(82, this);
        }
    }
}
