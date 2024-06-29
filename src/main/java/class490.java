import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class490 extends InputStream {

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public static int field6592 = 0;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "[I")
    public static int[] field6594 = new int[13];

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "J")
    public static long field6591;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method2861(byte arg0, int arg1) {
        field6589++;
        class538 var2 = class440.field6036;
        synchronized (class440.field6036) {
            class440.field6036.method3204((byte) -73, arg1);
        }
        class538 var3 = class111.field1592;
        synchronized (class111.field1592) {
            class111.field1592.method3204((byte) -89, arg1);
            if (arg0 != -56) {
                field6591 = 48L;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2862(int arg0) {
        field6588++;
        int var1 = -42 % ((arg0 - 74) / 41);
        for (int var2 = 0; var2 < class596.field8577; var2++) {
            class362 var3 = class293.field3830[var2];
            if (var3.field4642 == 3) {
                if (var3.field4635 == null) {
                    var3.field4636 = Integer.MIN_VALUE;
                } else {
                    class237.field3299.method3761(var3.field4635);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "read", descriptor = "()I", line = 52)
    public final int read() {
        class740.method4124(30000L, 58);
        field6587++;
        return -1;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V", line = 64)
    public static void method2863(int arg0) {
        if (arg0 <= -37) {
            field6594 = null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BLwu;)V", line = 85)
    public static final void method2864(byte arg0, class557 arg1) {
        field6593++;
        class602.field8616 = 0;
        class350.field4448 = 0;
        class335.field4303 = new class336();
        class231.field3213 = new class427[1024];
        class67.field918 = new class198[class534.field7482[class438.field6018] + 1];
        class260.field3536 = 0;
        class380.field5355 = 0;
        if (arg0 == 64) {
            class103.method697(0, arg1);
            class459.method2755(arg1, (byte) -112);
        }
    }
}
