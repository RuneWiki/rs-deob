import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class665 implements class549 {

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public int field9135;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "Lsv;")
    public static class688 field9134 = new class688();

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lqq;")
    public static class502 field9130;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)V")
    public static final void method3732(int arg0, int arg1, int arg2) {
        class683.field9348 = arg0 - class9.field178;
        if (arg1 == -4) {
            field9132++;
            class461.field6482 = arg2 - class9.field176;
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public static void method3733(int arg0) {
        field9134 = null;
        field9130 = null;
        if (arg0 <= 109) {
            method3732(-83, -35, 117);
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(I)V")
    public class665(int arg0) {
        this.field9135 = arg0;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method3734(int arg0, byte arg1, int arg2) {
        if (arg1 != 45) {
            return null;
        }
        field9131++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)Llf;")
    public final class251 method94(int arg0) {
        field9133++;
        if (arg0 != 1024) {
            field9130 = null;
        }
        return class215.field2537;
    }
}
