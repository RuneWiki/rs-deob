import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class147 extends class348 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field2274 = -1;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Z")
    private boolean field2277 = true;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lok;")
    private class61 field2273;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[[I")
    public static int[][] field2275 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2278 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2279 = 0;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method1152(int arg0) {
        this.field2277 = false;
        field2280++;
        if (arg0 != 12) {
            method1153(33);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field2278 = null;
        if (arg0 == 12) {
            field2275 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method1154(int arg0) {
        (new Thread(this, "a")).start();
        if (arg0 != 12) {
            method1153(104);
        }
        field2276++;
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
    public final void run() {
        field2272++;
        while (this.field2277) {
            this.field2273.method469(-5001, this);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lok;)V")
    public class147(class61 arg0) {
        this.field2273 = arg0;
    }
}
