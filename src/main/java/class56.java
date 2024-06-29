import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class56 extends class632 {

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "Leu;")
    public static class201 field876;

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "[Lpda;")
    public static class157[] field878;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field877;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field877 = null;
        if (arg0 >= 93) {
            field878 = null;
            field876 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(JI)V")
    public static final void method611(long arg0, int arg1) {
        if (class514.field7096 != null) {
            if (class783.field10725 == 1 || class783.field10725 == 5) {
                class114.method951(arg0, 4604);
            } else if (class783.field10725 == 4) {
                class616.method3543(arg0, (byte) 125);
            }
        }
        field879++;
        class314.method1914((long) class594.field8494, 0, class686.field9702);
        if (class379.field5314 != -1) {
            class538.method3124(true, class379.field5314);
        }
        for (int var3 = 0; var3 < class538.field7479; var3++) {
            if (class438.field6082[var3]) {
                class780.field10685[var3] = true;
            }
            class713.field9957[var3] = class438.field6082[var3];
            class438.field6082[var3] = false;
        }
        class267.field3779 = class594.field8494;
        class246.method1633(false, -1, null, -1);
        class623.method3565(-1, null, -1, (byte) 69);
        if (class379.field5314 != -1) {
            class538.field7479 = 0;
            class285.method1809((byte) -56);
        }
        class686.field9702.method512();
        class217.method1492(class686.field9702, false);
        if (arg1 > -44) {
            field878 = null;
        }
        int var4 = class599.method3491((byte) 109);
        if (var4 == -1) {
            var4 = class578.field8338;
        }
        if (var4 == -1) {
            var4 = class25.field274;
        }
        class760.method4196(var4, true);
        int var5 = class719.field10041.method209(true) << 8;
        class518.method3034((byte) -22, class719.field10041.field10350 + var5, class719.field10041.field10361, class719.field10041.field10347 + var5, class662.field9326);
        class662.field9326 = 0;
    }
}
