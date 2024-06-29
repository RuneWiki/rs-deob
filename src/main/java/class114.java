import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class114 extends class4 {

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field2563 = 0;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "Loa;")
    public static class98 field2571 = class38.method349(255, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Ln;")
    public static class90 field2566 = new class90(30);

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "Loa;")
    private static class98 field2573 = class38.method349(255, "From");

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "Loa;")
    public static class98 field2574 = field2573;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "[Lb;")
    public static class8[] field2578 = new class8[2048];

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "Z")
    public static boolean field2580 = false;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
    public static int field2577 = 0;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "I")
    public static int field2579 = -1;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
    public static volatile int field2582 = 0;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "Loa;")
    public static class98 field2584 = class38.method349(255, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "Loa;")
    public static class98 field2575 = class38.method349(255, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILb;)V")
    public final void method919(int arg0, class8 arg1) {
        if (arg0 != -1) {
            method923((byte) -33);
        }
        field2568++;
        while (true) {
            int var3 = arg1.method62((byte) 76);
            if (var3 == 0) {
                return;
            }
            this.method921(arg1, var3, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final void method920(boolean arg0) {
        if (arg0) {
            field2581 = -25;
        }
        field2564++;
        class148.field3619.method734(-224779128);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lb;IB)V")
    private final void method921(class8 arg0, int arg1, byte arg2) {
        if (arg2 != 62) {
            return;
        }
        if (arg1 == 1) {
            this.field2562 = arg0.method68(-2);
            this.field2569 = arg0.method62((byte) 113);
            this.field2567 = arg0.method62((byte) 77);
        }
        field2561++;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        field2565++;
        int var1 = 65 % ((arg0 + 55) / 51);
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)V")
    public static void method923(byte arg0) {
        field2571 = null;
        field2575 = null;
        field2584 = null;
        field2578 = null;
        if (arg0 <= -123) {
            field2573 = null;
            field2566 = null;
            field2574 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2570++;
        if (arg2 != -20556) {
            method920(false);
        }
        if (client.method202(arg0, -642990672)) {
            class118.method941(0, arg1, arg5, 1, arg3, class36.field901[arg0], arg6, arg4, 0, arg7, -1);
        }
    }
}
