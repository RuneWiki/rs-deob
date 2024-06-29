import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class385 extends class525 {

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ltp;")
    public class379 field5497;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lqv;")
    public static class316 field5499 = new class316(0, 5);

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
    public static int[] field5500 = new int[4];

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field5502 = 0;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Z")
    public static boolean field5498;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method2340(int arg0) {
        field5500 = null;
        int var1 = -48 % ((arg0 - 15) / 36);
        field5499 = null;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Z")
    public abstract boolean method2098(int arg0);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2097(byte arg0);

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public static final void method2341(int arg0) {
        field5496++;
        if (!class95.field1505) {
            return;
        }
        if (arg0 != 27579) {
            method2341(82);
        }
        while (true) {
            while (class389.field5526 < class111.field1639.length) {
                class219 var1 = class111.field1639[class389.field5526];
                if (var1 != null && var1.field3345 == -1) {
                    if (class206.field3141 == null) {
                        class206.field3141 = class370.field5337.method987(var1.field3343, 0);
                    }
                    int var2 = class206.field3141.field5985;
                    if (var2 == -1) {
                        return;
                    }
                    class206.field3141 = null;
                    var1.field3345 = var2;
                    class389.field5526++;
                } else {
                    class389.field5526++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ltp;I)V")
    public class385(class379 arg0, int arg1) {
        this.field5497 = arg0;
        this.field5501 = arg1;
    }
}
