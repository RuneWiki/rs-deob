import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class388 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Lvl;")
    public static class15 field5328 = new class15(51, 8);

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field5335 = 2;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field5336 = 0;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lqe;")
    public static class495 field5334 = new class495(0, 0);

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lfja;")
    public static class783 field5338 = new class783(25, 3);

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "[[I")
    public static int[][] field5339 = new int[128][128];

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field5333;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 7)
    public static void method2358(byte arg0) {
        field5328 = null;
        if (arg0 > -33) {
            field5334 = null;
        }
        field5338 = null;
        field5339 = null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 27)
    public static final void method2359(int arg0) {
        if (arg0 != 128) {
            method2360(false);
        }
        class558.field7906 = 0;
        class527.field7162 = 0;
        class124.field2207 = 0;
        class271.field3791 = 0;
        field5332++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method2360(boolean arg0) {
        field5337++;
        class597.method3398((byte) -101);
        if (arg0) {
            class611.field8532 = false;
            class735.method4081(class480.field6479, class207.field3113, class326.field4452, class776.field10712, (byte) 87);
        }
    }
}
