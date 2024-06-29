import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class56 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lfg;")
    public static class203 field872 = new class203();

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lve;")
    public static class255 field879 = class87.method607(69, "0");

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lve;")
    public static class255 field877 = class87.method607(29, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lve;")
    public static class255 field878 = class87.method607(40, "floorshadows");

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Ltl;")
    public static class197 field874;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J", line = 6)
    public static final long method347(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        return var3 == null || var3.field4184 == null ? 0L : var3.field4184.field5200;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 28)
    public static void method348(int arg0) {
        field877 = null;
        field879 = null;
        field874 = null;
        field872 = null;
        if (arg0 != 25460) {
            field874 = (class197) null;
        }
        field878 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 43)
    public static final void method349(byte arg0) {
        if (arg0 <= -112) {
            field873++;
            class301.field5142.method553(-23);
            class300.field5108.method553(120);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lta;I)V", line = 62)
    public static final void method350(class186 arg0, int arg1) {
        field871++;
        class152 var2 = (class152) class166.field2792.method1471((byte) 102);
        if (arg1 != -31844) {
            field874 = (class197) null;
        }
        while (var2 != null) {
            if (var2.field2576 == arg0) {
                if (var2.field2567 != null) {
                    class230.field3813.method1481(var2.field2567);
                    var2.field2567 = null;
                }
                var2.method1502((byte) -82);
                return;
            }
            var2 = (class152) class166.field2792.method1475((byte) 83);
        }
    }
}
