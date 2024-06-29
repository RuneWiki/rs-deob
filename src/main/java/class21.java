import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Loc;")
    public static class99 field503 = class48.method402((byte) -104, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Loc;")
    public static class99 field504 = class48.method402((byte) -104, "titlebox");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lr;")
    public static class118 field502 = new class118(64);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Loc;")
    public static class99 field509 = class48.method402((byte) -104, "welle:");

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lma;")
    public static class83 field510 = new class83();

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Laf;")
    public static class7 field500;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[Ljc;")
    public static class64[] field505;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLoc;Loc;Lpc;)Lra;")
    public static final class115 method191(byte arg0, class99 arg1, class99 arg2, class105 arg3) {
        field507++;
        int var4 = arg3.method883(arg2, 114);
        if (arg0 != 60) {
            field511 = -25;
        }
        int var5 = arg3.method898(arg1, 60, var4);
        return class74.method673(var4, arg3, true, var5);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Lwa;")
    public static final class145 method192(byte arg0, int arg1) {
        field506++;
        if (arg0 < 47) {
            method191((byte) -78, null, null, null);
        }
        class145 var2 = (class145) class3.field51.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field2640.method903(1, (byte) -128, arg1);
        class145 var4 = new class145();
        if (var3 != null) {
            var4.method1191(arg1, true, new class57(var3));
        }
        var4.method1194(-28127);
        class3.field51.method993((byte) 100, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lue;")
    public static final class138 method193(int arg0, int arg1) {
        field501++;
        class138 var2 = (class138) class1.field9.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 26995) {
            method194(-22);
        }
        byte[] var3 = class148.field3659.method903(5, (byte) -128, arg1);
        class138 var4 = new class138();
        if (var3 != null) {
            var4.method1149(-1, new class57(var3));
        }
        class1.field9.method993((byte) 100, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        field504 = null;
        field508 = null;
        field503 = null;
        field509 = null;
        field505 = null;
        field500 = null;
        field502 = null;
        if (arg0 == 5) {
            field510 = null;
        }
    }
}
