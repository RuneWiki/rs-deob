import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class193 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lug;")
    public class395 field2498;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lcq;")
    public static class328 field2496 = new class328("", 12);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public abstract void method92(byte arg0);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lsq;II)V")
    public abstract void method97(class119 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1191(int arg0) {
        field2496 = null;
        if (arg0 != 0) {
            field2500 = 30;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lya;I)V")
    public static final void method1192(class38 arg0, int arg1) {
        field2497++;
        if (arg1 > -104) {
            method1192(null, 107);
        }
        if (class439.field6293.method156(-20) == 0) {
            return;
        }
        if (class377.field4959 == 0) {
            for (class389 var4 = (class389) class439.field6293.method153(0); var4 != null; var4 = (class389) class439.field6293.method161(-101)) {
                class376.field4949.method626(var4.field5223 ? class23.field336.field2823 : null, class143.field1843, false, arg0, var4.field5221, var4.field5222, var4.field5224, var4.field5218, 32, false, arg0, var4.field5217);
                var4.method2165(16225);
            }
            class68.method604(-9192);
            return;
        }
        if (class446.field6394 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class446.field6394 = class38.method283((byte) -19, 0, class219.field2794, var2, 0, class79.field1024);
            class183.field2401 = class446.field6394.method300(class21.method177(0, (byte) 100, class511.field7421, class76.field986), class311.method1819(class448.field6413, class76.field986, 0), true);
        }
        for (class389 var3 = (class389) class439.field6293.method153(0); var3 != null; var3 = (class389) class439.field6293.method161(-61)) {
            class376.field4949.method626(var3.field5223 ? class23.field336.field2823 : null, class183.field2401, false, arg0, var3.field5221, var3.field5222, var3.field5224, var3.field5218, 32, false, class446.field6394, var3.field5217);
            var3.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Z")
    public abstract boolean method93(boolean arg0);

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lug;)V")
    public class193(class395 arg0) {
        this.field2498 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZ)V")
    public abstract void method99(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)V")
    public abstract void method94(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(ZZ)V")
    public abstract void method95(boolean arg0, boolean arg1);
}
