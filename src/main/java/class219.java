import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class219 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Luc;")
    public static class51 field3053 = new class51(64);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lrj;")
    public static class436 field3055 = new class436();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltj;I)V", line = 5)
    public static final void method1434(class298 arg0, int arg1) {
        field3052++;
        if (arg1 != 17269) {
            method1434((class298) null, -93);
        }
        if (class441.field6392.method1571(7955) == 0) {
            return;
        }
        if (class397.field5796 == 0 || class397.field5796 == 2) {
            for (class228 var4 = (class228) class441.field6392.method1575(0); var4 != null; var4 = (class228) class441.field6392.method1573((byte) -128)) {
                class373.method2449(var4.field3139 ? class383.field5609.field4644 : null, false, var4.field3135, arg0, var4.field3141, false, var4.field3138, class237.field3304, var4.field3136, arg0, var4.field3142, 15380);
                var4.method2632(true);
            }
            class274.method1812(-1695);
            return;
        }
        if (class277.field4058 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class277.field4058 = class107.method813(0, class63.field948, 0, var2, class74.field1035, 8);
            class421.field6121 = class277.field4058.method446(class290.method1970(class340.field5019, 0, -1, class341.field5043), class10.method75(class118.field1532, class340.field5019, 0), true);
        }
        for (class228 var3 = (class228) class441.field6392.method1575(0); var3 != null; var3 = (class228) class441.field6392.method1573((byte) -128)) {
            class373.method2449(var3.field3139 ? class383.field5609.field4644 : null, false, var3.field3135, arg0, var3.field3141, false, var3.field3138, class421.field6121, var3.field3136, class277.field4058, var3.field3142, arg1 - 1889);
            var3.method2632(true);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 66)
    public static void method1439(int arg0) {
        if (arg0 != 0) {
            method1439(-37);
        }
        field3053 = null;
        field3055 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lvm;")
    public abstract class124 method1435(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method1436(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1437(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)V")
    public abstract void method1438(int arg0, int arg1);
}
