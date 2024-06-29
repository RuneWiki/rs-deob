import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class186 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lea;")
    public static class38 field3701 = class9.method46((byte) 121, "blinken1:");

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[I")
    public static int[] field3703 = new int[2000];

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[J")
    public static long[] field3704 = new long[100];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "J")
    public static long field3705;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lod;")
    public static class129 field3708;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ldd;")
    public static class32 field3707;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
    public static final void method1254(int arg0, long arg1) {
        field3702++;
        if (arg1 == 0L) {
            return;
        }
        if (class43.field951 >= 100) {
            class102.method839(class70.field1731, 0, class62.field1491, (byte) 87);
            return;
        }
        class38 var3 = class143.method1034(37, arg1).method268(70);
        for (int var4 = arg0; var4 < class43.field951; var4++) {
            if (field3704[var4] == arg1) {
                class102.method839(class70.field1731, 0, class163.method1168(-7, new class38[] { var3, class101.field2267 }), (byte) 71);
                return;
            }
        }
        for (int var5 = 0; var5 < class22.field468; var5++) {
            if (class166.field3430[var5] == arg1) {
                class102.method839(class70.field1731, 0, class163.method1168(arg0 ^ 0xFFFFFF96, new class38[] { class178.field3607, var3, class146.field3043 }), (byte) 100);
                return;
            }
        }
        if (var3.method252(-94, class195.field3842.field3022)) {
            class102.method839(class70.field1731, 0, class195.field3847, (byte) 71);
            return;
        }
        class25.field510++;
        field3704[class43.field951] = arg1;
        class43.field943[class43.field951++] = class143.method1034(class102.method836(arg0, 37), arg1);
        class181.field3653 = class192.field3796;
        class111.field2483.method169(-1494101117, 152);
        class111.field2483.method480(arg1, (byte) -103);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1255(KeyEvent arg0, int arg1) {
        field3706++;
        if (arg1 != -15009) {
            return -71;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1256(int arg0) {
        if (arg0 < 32) {
            return;
        }
        field3708 = null;
        field3704 = null;
        field3701 = null;
        field3707 = null;
        field3703 = null;
    }
}
