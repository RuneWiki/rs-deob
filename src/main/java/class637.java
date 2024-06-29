import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class637 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field8869 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lwq;")
    public static class492 field8874 = new class492();

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "J")
    public static long field8875;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lpe;")
    public static class615 field8870;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZI)V")
    public static final void method3518(int arg0, String arg1, String arg2, boolean arg3, int arg4) {
        field8872++;
        class426.method2451(-1, arg2, arg4, true, 63, arg3, arg1);
        if (arg0 >= -30) {
            method3521((byte) 24);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I")
    public static final int method3519(byte arg0, int arg1) {
        field8871++;
        if (arg0 >= -17) {
            method3521((byte) 100);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method3520(byte arg0) {
        field8874 = null;
        field8869 = null;
        if (arg0 >= -43) {
            method3518(-96, null, null, true, -89);
        }
        field8870 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
    public static final void method3521(byte arg0) {
        field8873++;
        class141.method1064(-113, class520.field6799, (long) class424.field5503);
        if (class196.field2562 != -1) {
            class112.method857(class196.field2562, (byte) -116);
        }
        for (int var1 = 0; var1 < class57.field758; var1++) {
            if (class53.field719[var1]) {
                class541.field7022[var1] = true;
            }
            class513.field6724[var1] = class53.field719[var1];
            class53.field719[var1] = false;
        }
        class689.field9423 = class424.field5503;
        if (class520.field6799.method340()) {
            class560.field7315 = true;
        }
        if (class196.field2562 != -1) {
            class57.field758 = 0;
            class244.method1525(0);
        }
        class520.field6799.method396();
        class294.method1744(class520.field6799, 0);
        int var2 = class515.method2776(0);
        if (arg0 > -108) {
            return;
        }
        if (var2 == -1) {
            var2 = client.field1223;
        }
        if (var2 == -1) {
            var2 = class252.field3441;
        }
        class46.method423(var2, 0);
        class57.field767 = 0;
    }

    @OriginalMember(owner = "client!bm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8868++;
        throw new IllegalStateException();
    }
}
