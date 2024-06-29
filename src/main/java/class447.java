import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class447 {

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "Lgj;")
    private class662 field6139;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Lgj;")
    private class662 field6135;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "Lvl;")
    public static class15 field6142 = new class15(2, 8);

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "Lnt;")
    private class236 field6136;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILev;)Lef;", line = 4)
    public final class515 method2597(int arg0, class721 arg1) {
        field6137++;
        if (arg1 == null) {
            return null;
        }
        class758 var3 = arg1.method228(1);
        if (class325.field4443 == var3) {
            return new class279((class603) arg1);
        } else if (class768.field10593 == var3) {
            return new class336(this.method2599(14646), (class414) arg1);
        } else {
            int var4 = -118 % ((56 - arg0) / 51);
            if (class518.field7041 == var3) {
                return new class457(this.field6139, (class338) arg1);
            } else if (class673.field9342 == var3) {
                return new class130(this.field6139, (class478) arg1);
            } else if (class538.field7311 == var3) {
                return new class441(this.field6139, this.field6135, (class713) arg1);
            } else if (class492.field6767 == var3) {
                return new class284(this.field6139, this.field6135, (class37) arg1);
            } else if (class571.field8132 == var3) {
                return new class476(this.field6139, this.field6135, (class429) arg1);
            } else if (class502.field6861 == var3) {
                return new class424(this.field6139, this.field6135, (class765) arg1);
            } else if (class500.field6845 == var3) {
                return new class594(this.field6139, (class408) arg1);
            } else if (class564.field7991 == var3) {
                return new class541(this.field6139, this.field6135, (class454) arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 59)
    public static void method2598(int arg0) {
        if (arg0 < -9) {
            field6142 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lgj;Lgj;)V", line = 68)
    public class447(class662 arg0, class662 arg1) {
        this.field6139 = arg0;
        this.field6135 = arg1;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)Lnt;", line = 79)
    private final class236 method2599(int arg0) {
        field6141++;
        if (this.field6136 == null) {
            this.field6136 = new class236();
        }
        return arg0 == 14646 ? this.field6136 : null;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)I", line = 94)
    public static final int method2600(int arg0) {
        field6140++;
        if (arg0 != 16563) {
            field6142 = null;
        }
        return class534.field7224;
    }
}
