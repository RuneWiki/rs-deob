import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class519 {

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lvl;")
    public static class15 field7044 = new class15(81, -1);

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lbl;")
    public static class677 field7045 = new class677();

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Lfja;")
    public static class783 field7047 = new class783(0, -2);

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "F")
    public static float field7046;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public static void method2955(int arg0) {
        int var1 = 34 % ((arg0 - 1) / 40);
        field7044 = null;
        field7047 = null;
        field7045 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lha;I)V")
    public static final void method2956(class66 arg0, int arg1) {
        int var2 = 60 / ((arg1 - 17) / 59);
        field7043++;
        if (class179.field2819.method3595((byte) -120) == 0) {
            return;
        }
        if (class111.field1911.field6725.method3784((byte) 99) == 0) {
            for (class776 var5 = (class776) class179.field2819.method3589((byte) -128); var5 != null; var5 = (class776) class179.field2819.method3591(0)) {
                class143.field2427.method1418(false, false, var5.field10714, var5.field10709, class555.field7842, arg0, var5.field10717 ? class235.field3379.field10630 : null, var5.field10713, arg0, (byte) -72, var5.field10718, var5.field10715);
                var5.method1207(99);
            }
            class622.method3506(76);
            return;
        }
        if (class178.field2810 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class178.field2810 = class407.method2427(0, class365.field4958, class583.field8256, 0, 0, var3);
            class435.field5928 = class178.field2810.method476(class177.method1340(class181.field2834, 0, true, class564.field7989), class49.method373(class346.field4664, class181.field2834, 0), true);
        }
        for (class776 var4 = (class776) class179.field2819.method3589((byte) -128); var4 != null; var4 = (class776) class179.field2819.method3591(0)) {
            class143.field2427.method1418(false, false, var4.field10714, var4.field10709, class435.field5928, arg0, var4.field10717 ? class235.field3379.field10630 : null, var4.field10713, class178.field2810, (byte) -93, var4.field10718, var4.field10715);
            var4.method1207(97);
        }
    }
}
