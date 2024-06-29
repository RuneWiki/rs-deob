import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class class8 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Liv;")
    public static class64 field139 = new class64(28, 8);

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Leu;")
    public static class332 field140;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "[Lf;")
    public static class529[] field144;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I", line = 6)
    public static final int method43(boolean arg0) {
        if (arg0) {
            field140 = null;
        }
        field142++;
        if (class197.field2913 == null) {
            return class260.field3774 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V", line = 26)
    public static final void method44(int arg0, String arg1, int arg2, String arg3) {
        class290.field4136 = arg0;
        field137++;
        class40.field731 = arg1;
        class334.field5049 = arg3;
        if (class334.field5049.equals("") || class40.field731.equals("")) {
            class68.field1169 = 3;
        } else if (class487.field7219 == arg2) {
            class68.field1169 = -3;
            class513.field7549 = 0;
            class446.field6658 = 1;
            class83.field1447 = 0;
            class145 var4 = new class145(128);
            var4.method1109(false, 10);
            var4.method1117((int) (Math.random() * 9.9999999E7D), (byte) 12);
            var4.method1084(2, class20.method168(class334.field5049, false));
            var4.method1117((int) (Math.random() * 9.9999999E7D), (byte) 12);
            var4.method1089((byte) -89, class40.field731);
            var4.method1117((int) (Math.random() * 9.9999999E7D), (byte) 12);
            var4.method1062(3, class472.field7075, class79.field1377);
            class410.field6141.field2289 = 0;
            class410.field6141.method1109(false, class339.field5137.field6139);
            class410.field6141.method1109(false, var4.field2289 + 2);
            class410.field6141.method1094(1618659784, 590);
            class410.field6141.method1076(var4.field2289, arg2, 0, var4.field2270);
        } else {
            class148.method1141((byte) 121);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILm;Lli;Ljava/awt/Canvas;I)Lqa;", line = 67)
    public static final class162 method45(int arg0, class126 arg1, class293 arg2, Canvas arg3, int arg4) {
        field141++;
        return arg0 > -97 ? null : new class469(arg4, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V", line = 90)
    public static void method46(byte arg0) {
        field140 = null;
        field139 = null;
        field144 = null;
        if (arg0 != 111) {
            field139 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLqa;)V")
    public abstract void method25(byte arg0, class162 arg1);

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
    public abstract void method22(byte arg0);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILqa;II)Z")
    public abstract boolean method14(int arg0, class162 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public abstract void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLqa;)Lae;")
    public abstract class163 method13(boolean arg0, class162 arg1);

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)Z")
    public abstract boolean method24(boolean arg0);
}
