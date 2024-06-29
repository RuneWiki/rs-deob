import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class381 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5677 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lao;")
    public static class188 field5672 = new class188(94, 6);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lgf;")
    public static class180 field5678 = new class180("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lvp;")
    public static class123 field5679 = new class123(45, 6);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lhu;")
    public static class85 field5680;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[Ltp;")
    public static class370[] field5681;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;Lhh;Lhh;I)V", line = 5)
    public static final void method2413(class162 arg0, class84 arg1, class84 arg2, int arg3) {
        class469.field6896 = class114.method842(arg3 - 92, arg2, 0, class101.field1615);
        field5675++;
        class125.field1923 = arg0.method453(class469.field6896, class158.method1137(arg1, class101.field1615, 0), true);
        class42.field639 = class114.method842(-82, arg2, 0, class490.field7147);
        if (arg3 != 6) {
            method2417((byte) -117);
        }
        class55.field808 = arg0.method453(class42.field639, class158.method1137(arg1, class490.field7147, 0), true);
        class476.field6998 = class114.method842(-75, arg2, 0, class147.field2169);
        class526.field7731 = arg0.method453(class476.field6998, class158.method1137(arg1, class147.field2169, 0), true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ltn;I)V", line = 26)
    public static final void method2414(class58 arg0, int arg1) {
        if (arg1 != -7017) {
            field5679 = null;
        }
        field5673++;
        class58 var2 = class290.method1805(arg0, (byte) 71);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class477.field7003;
            var4 = class112.field1780;
        } else {
            var4 = var2.field925;
            var3 = var2.field896;
        }
        class155.method1121(var3, false, arg1 + 7057, var4, arg0);
        class413.method2546(61, var4, arg0, var3);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V", line = 54)
    public static final void method2415(int arg0, boolean arg1) {
        field5674++;
        class434 var2 = class483.method2888(arg0, -96, 6);
        var2.method2628(101);
        if (!arg1) {
            field5678 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V", line = 68)
    public static final void method2416(int arg0, int arg1, int arg2) {
        field5676++;
        class434 var3 = class483.method2888(arg0, 66, arg2);
        var3.method2632((byte) 81);
        var3.field6310 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 86)
    public static void method2417(byte arg0) {
        field5672 = null;
        field5680 = null;
        field5679 = null;
        field5678 = null;
        if (arg0 == 115) {
            field5681 = null;
        }
    }
}
