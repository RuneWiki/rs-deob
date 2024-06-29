import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class135 extends class260 {

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Lar;")
    public class479 field1950 = new class479();

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lla;")
    public static class315 field1949;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILga;Ljava/awt/Canvas;I)Lya;", line = 5)
    public static final class38 method917(int arg0, class277 arg1, Canvas arg2, int arg3) {
        if (arg3 != -15541) {
            method919(-76);
        }
        field1948++;
        return new class399(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V", line = 17)
    public static final void method918(int arg0) {
        if (arg0 != 8170) {
            return;
        }
        field1951++;
        class162 var1 = class442.field6544;
        synchronized (class442.field6544) {
            class442.field6544.method1066(arg0 - 4090);
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V", line = 31)
    public static void method919(int arg0) {
        field1949 = null;
        if (arg0 < 71) {
            field1949 = null;
        }
    }
}
