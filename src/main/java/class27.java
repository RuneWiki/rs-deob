import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[Ljd;")
    public static class92[] field603 = new class92[200];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljd;")
    public static class92 field605 = class202.method1325((byte) 90, "(Udns");

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljd;")
    public static class92 field612 = class202.method1325((byte) 90, "<br>");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljd;")
    public static class92 field609 = class202.method1325((byte) 90, "(U5");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljd;")
    public static class92 field607 = class202.method1325((byte) 90, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lnh;")
    public static class133 field611;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lsc;")
    public static class173 field610;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lud;")
    public static class192 field608;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljd;IIII)V")
    public static final void method172(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        field606++;
        class1 var5 = class148.method961(arg1, arg4, (byte) -121);
        if (var5 == null) {
            return;
        }
        if (var5.field35 != null) {
            class156 var6 = new class156();
            var6.field3103 = var5;
            var6.field3108 = var5.field35;
            var6.field3105 = arg2;
            var6.field3104 = arg0;
            class2.method18(var6, 6645);
        }
        boolean var7 = true;
        if (var5.field120 > 0) {
            var7 = class209.method1364(var5, (byte) -102);
        }
        if (!var7 || !class21.method131(-119, arg2 - 1, class114.method766(121, var5))) {
            return;
        }
        if (arg2 == 1) {
            class101.field2078++;
            class99.field2000.method405(244, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 2) {
            class140.field2807++;
            class99.field2000.method405(169, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 3) {
            class99.field2000.method405(47, 7);
            class99.field2000.method446(arg4, -26751);
            class64.field1311++;
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 4) {
            class99.field2000.method405(249, 7);
            class103.field2123++;
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 5) {
            class41.field917++;
            class99.field2000.method405(136, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg3 < 50) {
            return;
        }
        if (arg2 == 6) {
            class205.field3959++;
            class99.field2000.method405(181, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 7) {
            class87.field1724++;
            class99.field2000.method405(241, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 8) {
            class99.field2000.method405(225, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
            class89.field1757++;
        }
        if (arg2 == 9) {
            class146.field2901++;
            class99.field2000.method405(164, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
        if (arg2 == 10) {
            class105.field2154++;
            class99.field2000.method405(8, 7);
            class99.field2000.method446(arg4, -26751);
            class99.field2000.method458(arg1, 9345);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static void method173(boolean arg0) {
        field612 = null;
        field611 = null;
        field607 = null;
        field608 = null;
        field603 = null;
        field609 = null;
        if (arg0) {
            field612 = null;
        }
        field605 = null;
        field610 = null;
    }
}
