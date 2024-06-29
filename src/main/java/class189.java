import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class189 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "B")
    private byte field2438;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lao;")
    public static class191 field2444 = new class191(37, -1);

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[Lcc;")
    public static class516[] field2445 = new class516[14];

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[[Z")
    public static boolean[][] field2450 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "F")
    public static float field2447;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I", line = 3)
    public final int method1084(byte arg0) {
        field2440++;
        int var2 = 110 / ((-arg0 - 69) / 46);
        return (this.field2438 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 15)
    public static void method1085(int arg0) {
        if (arg0 <= 57) {
            method1086(-101);
        }
        field2445 = null;
        field2444 = null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 30)
    public static final void method1086(int arg0) {
        class509 var1 = class374.field5067;
        synchronized (class374.field5067) {
            class374.field5067.method3045(48);
        }
        field2439++;
        if (arg0 < 18) {
            method1085(-80);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I", line = 57)
    public final int method1087(int arg0) {
        if (arg0 != -21877) {
            method1085(6);
        }
        field2441++;
        return this.field2438 & 0x7;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 70)
    public class189() {
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lug;)V", line = 76)
    public class189(class396 arg0) {
        this.field2438 = arg0.method2418(-117);
        this.field2443 = arg0.method2386(-23648);
        this.field2446 = arg0.method2406((byte) -93);
        this.field2448 = arg0.method2406((byte) -78);
        this.field2449 = arg0.method2406((byte) -78);
        this.field2442 = arg0.method2406((byte) -99);
    }
}
