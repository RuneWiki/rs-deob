import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class8 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lvr;")
    private class306 field122;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lpg;")
    public static class492 field118 = new class492(104, -2);

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lpg;")
    public static class492 field120 = new class492(25, 8);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field123 = -1;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lpg;")
    public static class492 field121 = new class492(93, 0);

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
    public static int[] field124 = new int[500];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lvg;")
    private class467 field114;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I", line = 6)
    public static final int method71(byte arg0, int arg1) {
        if (arg0 >= -26) {
            return 23;
        } else {
            field116++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lvg;", line = 18)
    public final class467 method72(byte arg0) {
        field119++;
        if (arg0 != -33) {
            method71((byte) -28, 4);
        }
        class467 var2 = this.field122.field4498.field6797;
        if (this.field122.field4498 == var2) {
            this.field114 = null;
            return null;
        } else {
            this.field114 = var2.field6797;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLvr;)V", line = 39)
    public final void method73(byte arg0, class306 arg1) {
        if (arg0 != 48) {
            field118 = null;
        }
        this.field122 = arg1;
        field117++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lvg;", line = 53)
    public final class467 method74(int arg0) {
        field113++;
        class467 var2 = this.field114;
        int var3 = -79 / ((arg0 - 30) / 60);
        if (this.field122.field4498 == var2) {
            this.field114 = null;
            return null;
        } else {
            this.field114 = var2.field6797;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 81)
    public static void method75(boolean arg0) {
        field120 = null;
        field124 = null;
        field118 = null;
        if (arg0) {
            method76((byte) 81, -94, 24, -111);
        }
        field121 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIII)I", line = 98)
    public static final int method76(byte arg0, int arg1, int arg2, int arg3) {
        field115++;
        if ((class129.field1816[arg3][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 >= -11) {
            return 47;
        } else if (arg3 <= 0 || (class129.field1816[1][arg2][arg1] & 0x2) == 0) {
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 118)
    public class8() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lvr;)V", line = 120)
    public class8(class306 arg0) {
        this.field122 = arg0;
    }
}
