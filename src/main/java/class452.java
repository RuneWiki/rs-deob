import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class452 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6641 = -1;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field6646;

    static {
        new class375(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqa;III)V", line = 10)
    public static final void method2721(class496 arg0, int arg1, int arg2, int arg3) {
        class98.field1415 = new class20[arg3][arg1];
        class109.field1536 = arg0;
        field6642++;
        if (arg2 != 1) {
            return;
        }
        if (class6.field96 != null) {
            class392.field5950 = class179.method1286(class6.field96[0], class6.field96[2], class6.field96[3], class6.field96[4], class6.field96[5], -38, class6.field96[1]);
        }
        class202.field2840 = new class20();
        class187.method1316((byte) -125);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)Lwq;", line = 42)
    public static final class370 method2722(int arg0, int arg1, int arg2) {
        field6644++;
        class370 var3 = new class370();
        var3.field5681 = arg1 + 1 + 5;
        var3.field5686 = arg2 + 1 + 5;
        var3.field5692 = -1;
        var3.field5669 = -1;
        var3.field5678 = new int[var3.field5681][var3.field5686];
        var3.method2322(-29126);
        if (arg0 != 0) {
            method2723(-124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 61)
    public static void method2723(int arg0) {
        field6646 = null;
        if (arg0 != -1485) {
            field6641 = -90;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 72)
    public static final void method2724(int arg0) {
        field6643++;
        int var1 = 0;
        if (arg0 > -54) {
            method2721(null, 80, -15, 77);
        }
        while (class129.field1816.length > var1) {
            for (int var2 = 0; var2 < class129.field1816[0].length; var2++) {
                for (int var3 = 0; var3 < class129.field1816[0][0].length; var3++) {
                    class129.field1816[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
    }
}
