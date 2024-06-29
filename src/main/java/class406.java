import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class406 {

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5857 = 0;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    public static volatile boolean field5859 = false;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Llg;")
    public static class237 field5860 = new class237(64);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[[I")
    public static int[][] field5868 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "J")
    public long field5855;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Ltq;")
    public static class376 field5866;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lgj;")
    public static class381 field5864;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lqf;")
    public class406 field5854;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lqf;")
    public class406 field5862;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2593(boolean arg0) {
        field5856++;
        if (arg0) {
            field5857 = -36;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class394.field5556[var1] = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 21)
    public final void method2594(byte arg0) {
        field5858++;
        if (this.field5854 == null) {
            return;
        }
        this.field5854.field5862 = this.field5862;
        this.field5862.field5854 = this.field5854;
        if (arg0 != -22) {
            this.field5855 = 82L;
        }
        this.field5854 = null;
        this.field5862 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ldg;I)Lmd;", line = 42)
    public static final class323 method2595(class236 arg0, int arg1) {
        field5861++;
        if (arg1 != -27179) {
            field5857 = -34;
        }
        return new class323(arg0.method1613(61), arg0.method1613(122), arg0.method1613(82), arg0.method1613(77), arg0.method1616(false), arg0.method1616(false), arg0.method1574(arg1 + 27149));
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lj;B)V", line = 57)
    public static final void method2596(class321 arg0, byte arg1) {
        field5867++;
        if (arg0.field4572 != null) {
            arg0.field4572.field361 = 0;
        }
        arg0.field4575 = false;
        if (arg1 <= -66) {
            for (class321 var2 = arg0.method1078(); var2 != null; var2 = arg0.method1060()) {
                method2596(var2, (byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 90)
    public static void method2597(int arg0) {
        if (arg0 != 3) {
            field5865 = 68;
        }
        field5864 = null;
        field5868 = null;
        field5866 = null;
        field5860 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Z", line = 112)
    public final boolean method2598(byte arg0) {
        if (arg0 == 35) {
            field5863++;
            return this.field5854 != null;
        } else {
            return false;
        }
    }
}
