import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class207 {

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "J")
    public long field2457;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lpc;")
    private class700 field2455;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "[[I")
    public static int[][] field2458 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
    public static boolean field2454 = false;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Z")
    public static boolean field2460 = false;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Lhj;")
    public static class596 field2461 = new class596(75, 1);

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "Lmja;")
    public static class441 field2462 = new class441("game3", "Game 3", 2);

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[[[Z")
    public static boolean[][][] field2459;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static void method1311(int arg0) {
        if (arg0 != 0) {
            method1311(44);
        }
        field2462 = null;
        field2459 = null;
        field2458 = null;
        field2461 = null;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lpc;J[Lqba;)V")
    public class207(class700 arg0, long arg1, class426[] arg2) {
        this.field2457 = arg1;
        this.field2455 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2463++;
        this.field2455.method3927((byte) 31, this.field2457);
        super.finalize();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
    public static final boolean method1312(int arg0, int arg1, int arg2) {
        if (arg2 == 4) {
            field2456++;
            return (arg0 & 0x40000) != 0 | class504.method3022(arg1, (byte) -34, arg0) || class388.method2276(arg0, -5845, arg1);
        } else {
            return false;
        }
    }
}
