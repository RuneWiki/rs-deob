import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class138 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lao;")
    public static class191 field1845 = new class191(46, 3);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lfe;")
    public class404 field1848;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfo;B)V")
    public static final void method857(class361 arg0, byte arg1) {
        class299.field3929 = arg0.method2148("p11_full", 0);
        field1847++;
        class365.field4985 = arg0.method2148("p12_full", 0);
        if (arg1 >= -81) {
            method858((byte) 41);
        }
        class349.field4642 = arg0.method2148("b12_full", 0);
        class114.field1495 = arg0.method2148("hitmarks", 0);
        class330.field4385 = arg0.method2148("hitbar_default", 0);
        class35.field352 = arg0.method2148("timerbar_default", 0);
        class470.field6978 = arg0.method2148("headicons_pk", 0);
        class279.field3699 = arg0.method2148("headicons_prayer", 0);
        class5.field55 = arg0.method2148("hint_headicons", 0);
        class454.field6791 = arg0.method2148("hint_mapmarkers", 0);
        field1849 = arg0.method2148("mapflag", 0);
        class273.field3645 = arg0.method2148("cross", 0);
        class285.field3754 = arg0.method2148("mapdots", 0);
        class125.field1620 = arg0.method2148("scrollbar", 0);
        class90.field1083 = arg0.method2148("name_icons", 0);
        class7.field93 = arg0.method2148("floorshadows", 0);
        class367.field5011 = arg0.method2148("compass", 0);
        class291.field3849 = arg0.method2148("otherlevel", 0);
        class48.field532 = arg0.method2148("hint_mapedge", 0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        if (arg0 == -107) {
            field1845 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZZ)V")
    public static final void method859(boolean arg0, boolean arg1) {
        for (class325 var2 = (class325) class282.field3740.method970(12); var2 != null; var2 = (class325) class282.field3740.method976((byte) 91)) {
            if (var2.field4314 != null) {
                class465.field6928.method1114(var2.field4314);
                var2.field4314 = null;
            }
            if (var2.field4324 != null) {
                class465.field6928.method1114(var2.field4324);
                var2.field4324 = null;
            }
            var2.method2674(arg1);
        }
        field1846++;
        if (!arg1 || !arg0) {
            return;
        }
        for (class325 var3 = (class325) class193.field2491.method970(12); var3 != null; var3 = (class325) class193.field2491.method976((byte) -10)) {
            if (var3.field4314 != null) {
                class465.field6928.method1114(var3.field4314);
                var3.field4314 = null;
            }
            var3.method2674(true);
        }
        for (class325 var4 = (class325) class264.field3548.method300((byte) -92); var4 != null; var4 = (class325) class264.field3548.method301(-113)) {
            if (var4.field4314 != null) {
                class465.field6928.method1114(var4.field4314);
                var4.field4314 = null;
            }
            var4.method2674(true);
        }
    }

    static {
        new class305("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
