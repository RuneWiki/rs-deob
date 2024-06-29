import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class269 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lbi;")
    public static class104 field4301 = new class104(30, -1);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[[I")
    public static int[][] field4305 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
    public static final int method1822(int arg0, int arg1, int arg2) {
        field4303++;
        int var3 = arg1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field4301 = null;
        field4305 = null;
        if (arg0 < 39) {
            field4305 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        class36.field376.method924(-10183);
        field4302++;
        class472.field7240.method2048(6);
        class528.field7769.method1099(-24899);
        int var1 = 91 % ((arg0 - 53) / 62);
        class320.field4980.setBackground(Color.black);
        class96.field1396 = -1;
        class36.field376 = class426.method2697(18541, class320.field4980);
        class472.field7240 = class45.method334(class320.field4980, true, (byte) 38);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIZ)V")
    public static final void method1825(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            class148.field2000--;
            if (class148.field2000 == 0) {
                class301.field4730 = null;
            }
        }
        field4300++;
        if (arg2) {
            class50.field686--;
            if (class50.field686 == 0) {
                class329.field5177 = null;
            }
        }
        if (arg1 != 1) {
            field4305 = null;
        }
    }
}
