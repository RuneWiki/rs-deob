import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class478 {

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lgi;")
    public static class487 field7073 = new class487(128);

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Lni;")
    public static class367 field7077 = new class367(56, 3);

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "Lpa;")
    public static class254 field7078 = new class254(1, -1);

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "[[I")
    public static int[][] field7080 = new int[128][128];

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "[Laa;")
    public static class341[] field7075;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method2843(int arg0, int arg1, int arg2) {
        field7076++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (arg0 > ~var3) {
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

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static void method2844(byte arg0) {
        field7078 = null;
        int var1 = 94 / ((arg0 - 1) / 63);
        field7080 = null;
        field7073 = null;
        field7075 = null;
        field7077 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static final void method2845(int arg0) {
        class429.field6540 = new class480(8);
        field7074++;
        class476.field7066 = 0;
        if (arg0 != -1) {
            method2843(23, -65, -31);
        }
        for (class228 var1 = (class228) class11.field184.method3040(false); var1 != null; var1 = (class228) class11.field184.method3043((byte) -125)) {
            var1.method1525();
        }
    }
}
