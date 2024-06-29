import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class25 extends class435 {

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Ljava/lang/String;")
    public String field349;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[I")
    public static int[] field345 = new int[4096];

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 6)
    public static final void method242(int arg0) {
        field348++;
        for (int var1 = 0; var1 < 5; var1++) {
            class73.field1162[var1] = false;
        }
        class40.field544 = 1;
        class76.field1181 = -1;
        class294.field4104 = -1;
        class208.field3211 = arg0;
        class260.field3750 = 0;
        class656.field9268 = -1;
        class638.field9054 = -1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lis;Z)V", line = 29)
    public static final void method243(class101 arg0, boolean arg1) {
        field347++;
        if (!class41.field555) {
            return;
        }
        if (arg0.field1586 != null) {
            class101 var2 = class620.method3501(class395.field5705, false, class199.field3091);
            if (var2 != null) {
                class400 var3 = new class400();
                var3.field5776 = var2;
                var3.field5790 = arg0.field1586;
                var3.field5783 = arg0;
                class362.method2171(var3);
            }
        }
        class221.field3299++;
        class699 var4 = class452.method2630(class699.field9897, class177.field2816, (byte) 121);
        var4.field9908.method2733(false, arg0.field1577);
        var4.field9908.method2700(class199.field3091, 0);
        var4.field9908.method2739((byte) -86, arg0.field1565);
        var4.field9908.method2733(false, class395.field5705);
        var4.field9908.method2745(arg0.field1528, -1670631224);
        var4.field9908.method2702((byte) 28, class595.field8622);
        class149.method1134(var4, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILis;I)V", line = 69)
    public static final void method244(int arg0, int arg1, class101 arg2, int arg3) {
        field350++;
        class107.field1758 = arg2;
        class49.field642 = arg1;
        class561.field8200 = arg0;
        if (arg3 >= -75) {
            method242(-6);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 85)
    public class25() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 87)
    public class25(String arg0, int arg1) {
        this.field349 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 97)
    public static void method245(int arg0) {
        if (arg0 != -1) {
            field346 = 19;
        }
        field345 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/awt/Canvas;Lfa;)Lr;", line = 107)
    public static final class98 method246(byte arg0, Canvas arg1, class615 arg2) {
        field351++;
        if (arg0 >= -125) {
            field346 = 42;
        }
        return new class261(arg1, arg2);
    }
}
