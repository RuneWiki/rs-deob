import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 extends class53 {

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Leh;")
    public class81 field968;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Lp;")
    private static class280 field963 = class18.method140((byte) -126, " from your ignore list first)3");

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lp;")
    private static class280 field960 = class18.method140((byte) -124, "shake:");

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Lp;")
    public static class280 field966 = field960;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lp;")
    public static class280 field967 = class18.method140((byte) -125, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "Lp;")
    public static class280 field972 = class18.method140((byte) -128, "tbrefresh");

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Lp;")
    public static class280 field965 = field963;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "Lp;")
    public static class280 field973 = class18.method140((byte) -123, "compass");

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Lp;")
    public static class280 field971 = class18.method140((byte) -120, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lp;")
    public static class280 field977 = field960;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "[I")
    public static int[] field962 = new int[100];

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "Ltg;")
    public static class180 field975;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method423(byte arg0) {
        field973 = null;
        field965 = null;
        field960 = null;
        field972 = null;
        field966 = null;
        field975 = null;
        field962 = null;
        field971 = null;
        field963 = null;
        field977 = null;
        int var1 = 33 / ((1 - arg0) / 36);
        field967 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Leh;)V")
    public class60(class81 arg0) {
        this.field968 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static final void method424(int arg0) {
        field974++;
        class4.field115++;
        class34.field627.method551(arg0, true);
        class34.field627.method219(0L, arg0 - 210);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLtg;)V")
    public static final void method425(boolean arg0, class180 arg1) {
        if (!arg0) {
            field969 = -23;
        }
        field961++;
        class225.field3886 = arg1.method1234((byte) -88, class203.field3529);
        class160.field2799 = arg1.method1234((byte) -88, class168.field2943);
    }
}
