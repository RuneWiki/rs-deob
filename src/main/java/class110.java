import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class110 {

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[S")
    public static short[] field1526 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lmj;")
    public static class392 field1528 = new class392(100);

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
    public static int[] field1531 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Lmo;")
    public static class447 field1525;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lmo;")
    public static class447 field1527;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lmo;ILe;)V")
    public static final void method815(class447 arg0, int arg1, class312 arg2) {
        field1532++;
        if (class305.field4842) {
            return;
        }
        arg2.method635(0);
        class247.field4053 = arg2.method641(class100.method755(arg0, class270.field4341), true);
        class247.field4053.method2327((class369.field5615 - class247.field4053.method2318()) / 2, (class430.field6324 - class247.field4053.method2315()) / 2);
        class344.field5298 = arg2.method641(class100.method755(arg0, class11.field160), true);
        if (arg1 == 17272) {
            class344.field5298.method2327((class369.field5615 - class344.field5298.method2318()) / 2, 18);
            class305.field4842 = true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method816(int arg0) {
        field1530++;
        class52 var1 = class329.field5155;
        synchronized (class329.field5155) {
            class329.field5155.method336(69);
        }
        if (arg0 > -34) {
            field1527 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public static final void method817(boolean arg0) {
        class52 var1 = class235.field3940;
        synchronized (class235.field3940) {
            class235.field3940.method335((byte) 94);
            if (arg0) {
                method816(61);
            }
        }
        field1529++;
        class52 var2 = class121.field1695;
        synchronized (class121.field1695) {
            class121.field1695.method335((byte) 78);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public static void method818(int arg0) {
        field1531 = null;
        field1527 = null;
        field1525 = null;
        field1526 = null;
        if (arg0 == 9790) {
            field1528 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public static final void method819(int arg0, int arg1, int arg2) {
        field1524++;
        class211 var3 = class281.method1921(7, arg0, (byte) -95);
        var3.method1490((byte) 117);
        var3.field3379 = arg2;
        if (arg1 >= -115) {
            method815((class447) null, 96, (class312) null);
        }
    }
}
