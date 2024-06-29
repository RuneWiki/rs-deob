import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class150 {

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lqj;")
    private static class196 field2406 = class80.method502(" ", -48);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lqj;")
    public static class196 field2407 = class80.method502(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -48);

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lqj;")
    public static class196 field2408 = field2406;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lqj;")
    public static class196 field2410 = class80.method502("<br>(X100(U(Y", -48);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[I")
    public static int[] field2414 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lej;")
    public static class252 field2402;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lcd;")
    public static class3 field2398;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "[[[B")
    public static byte[][][] field2415;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
    public static final void method943(int arg0, byte arg1) {
        class86.field1275 = 1;
        class8.field75 = -1;
        class22.field280 = -1;
        class164.field2656 = 0;
        int var2 = -34 / ((4 - arg1) / 47);
        class131.field1863 = arg0;
        field2404++;
        class44.field521 = false;
        class23.field298 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZII)V")
    public static final void method944(boolean arg0, int arg1, int arg2) {
        field2405++;
        class214.field3823[arg1] = arg2;
        if (!arg0) {
            method945(22);
        }
        class39 var3 = (class39) class132.field1887.method1551(32768, (long) arg1);
        if (var3 == null) {
            class39 var4 = new class39(4611686018427387905L);
            class132.field1887.method1552(var4, (long) arg1, 0);
        } else if (var3.field437 != 4611686018427387905L) {
            var3.field437 = class183.method1195((byte) 127) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method945(int arg0) {
        field2407 = null;
        field2402 = null;
        field2398 = null;
        field2410 = null;
        field2414 = null;
        field2406 = null;
        field2415 = null;
        field2408 = null;
        if (arg0 != -22061) {
            method943(-71, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class150() {
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lr;)V")
    public class150(class150 arg0) {
        this.field2409 = arg0.field2409;
        this.field2401 = arg0.field2401;
        this.field2412 = arg0.field2412;
        this.field2411 = arg0.field2411;
    }
}
