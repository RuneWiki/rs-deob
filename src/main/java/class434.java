import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class434 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field6173;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)Lib;", line = 3)
    public static final class162 method2599(int arg0, boolean arg1) {
        field6174++;
        if (class247.field3517 && arg0 >= class132.field1729 && class585.field8280 >= arg0) {
            if (arg1) {
                method2600((byte) 73, 120);
            }
            return class541.field7585[arg0 - class132.field1729];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)Lrl;", line = 24)
    public static final class751 method2600(byte arg0, int arg1) {
        field6175++;
        if (arg1 == 0) {
            return new class503();
        } else if (arg1 == 1) {
            return new class763();
        } else if (arg1 == 2) {
            return new class161();
        } else if (arg1 == 3) {
            return new class210();
        } else if (arg1 == 4) {
            return new class612();
        } else if (arg1 == 5) {
            return new class513();
        } else if (arg1 == 6) {
            return new class374();
        } else if (arg1 == 7) {
            return new class143();
        } else if (arg1 == 8) {
            return new class683();
        } else if (arg1 == 9) {
            return new class244();
        } else if (arg1 == 10) {
            return new class584();
        } else if (arg1 == 11) {
            return new class456();
        } else if (arg1 == 12) {
            return new class439();
        } else if (arg1 == 13) {
            return new class647();
        } else if (arg1 == 14) {
            return new class418();
        } else if (arg1 == 15) {
            return new class369();
        } else if (arg1 == 16) {
            return new class122();
        } else if (arg1 == 17) {
            return new class308();
        } else if (arg1 == 18) {
            return new class17();
        } else if (arg1 == 19) {
            return new class606();
        } else if (arg1 == 20) {
            return new class687();
        } else if (arg1 == 21) {
            return new class535();
        } else if (arg1 == 22) {
            return new class437();
        } else if (arg1 == 23) {
            return new class530();
        } else if (arg1 == 24) {
            return new class270();
        } else if (arg1 == 25) {
            return new class470();
        } else if (arg1 == 26) {
            return new class358();
        } else if (arg1 == 27) {
            return new class339();
        } else if (arg1 == 28) {
            return new class725();
        } else if (arg1 == 29) {
            return new class58();
        } else if (arg1 == 30) {
            return new class203();
        } else if (arg1 == 31) {
            return new class260();
        } else if (arg1 == 32) {
            return new class408();
        } else if (arg1 == 33) {
            return new class348();
        } else if (arg1 == 34) {
            return new class396();
        } else if (arg1 == 35) {
            return new class79();
        } else if (arg1 == 36) {
            return new class48();
        } else if (arg1 == 37) {
            return new class657();
        } else if (arg1 == 38) {
            return new class595();
        } else if (arg1 == 39) {
            return new class567();
        } else {
            if (arg0 >= -19) {
                method2599(13, true);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 342)
    public static void method2601(byte arg0) {
        if (arg0 != 112) {
            field6173 = null;
        }
        field6173 = null;
    }
}
