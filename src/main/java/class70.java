import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class70 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lae;")
    public static class6 field1554 = class64.method474(118, "Freunde");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lae;")
    public static class6 field1552 = class64.method474(120, "Konfig geladen)3");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lae;")
    public static class6 field1549 = class64.method474(124, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lae;")
    public static class6 field1557 = class64.method474(112, "Null");

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lae;")
    public static class6 field1568 = class64.method474(112, "compass");

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lae;")
    private static class6 field1551 = class64.method474(118, "Enter message to send to ");

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lae;")
    public static class6 field1553 = class64.method474(103, "backright2");

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lae;")
    public static class6 field1575 = class64.method474(113, "@gre@");

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Lae;")
    public static class6 field1571 = field1551;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static volatile int field1576 = 0;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "J")
    public static volatile long field1572 = 0L;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1564;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Z")
    public static boolean field1563;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZLbf;II)V", line = 7)
    public static final synchronized void method510(int arg0, int arg1, int arg2, boolean arg3, class14 arg4, int arg5, int arg6) {
        field1565++;
        if (!class88.method745((byte) -62)) {
            return;
        }
        class130.field3150 = -1;
        class111.field2672 = arg3;
        class42.field962 = arg6;
        class102.field2417 = arg2;
        int var7 = 103 % ((arg0 + 18) / 43);
        class96.field2300 = arg4;
        class50.field1128 = true;
        class37.field840 = arg1;
        class6.field132 = -1;
        class130.field3162 = arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 43)
    public static final synchronized void method511(byte arg0) {
        field1558++;
        if (arg0 != 94) {
            method510(122, 126, 44, false, null, -101, -15);
        }
        if (class88.method745((byte) -62)) {
            class89.method755((byte) -77);
            class50.field1128 = false;
            class96.field2300 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 71)
    public static final void method512(int arg0) {
        class138.field3361.method436(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class78.field1878[var1] = 0L;
        }
        field1573++;
        if (arg0 != 31603) {
            method510(-18, -19, 53, false, null, -28, 96);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class137.field3327[var2] = 0L;
        }
        class5.field64 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lbf;IIZIIII)V", line = 98)
    public static final synchronized void method513(class14 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1574++;
        if (!class88.method745((byte) -62)) {
            return;
        }
        class6.field132 = -1;
        class102.field2417 = arg5;
        class42.field962 = arg1;
        class130.field3150 = arg4;
        class96.field2300 = arg0;
        class50.field1128 = true;
        class37.field840 = arg2;
        if (arg6 >= -5) {
            method519((byte) -42, 113);
        }
        class130.field3162 = arg7;
        class111.field2672 = arg3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 130)
    public static final synchronized void method514(byte arg0) {
        field1567++;
        if (!class88.method745((byte) -62)) {
            return;
        }
        if (class50.field1128) {
            byte[] var1 = class14.method155(class37.field840, 2, class42.field962, class96.field2300, class102.field2417);
            if (var1 != null) {
                if (class130.field3150 >= 0) {
                    class63.method461(class130.field3162, 1, class111.field2672, var1, class130.field3150);
                } else if (class6.field132 >= 0) {
                    class43.method357(class111.field2672, false, class6.field132, class130.field3162, var1);
                } else {
                    class87.method737(class130.field3162, class111.field2672, var1, false);
                }
                class50.field1128 = false;
                class96.field2300 = null;
            }
        }
        class81.method691(-19093);
        if (arg0 > -89) {
            field1576 = 33;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 171)
    public static final synchronized void method515(int arg0) {
        field1569++;
        class105.method883(-30574);
        if (arg0 > -27) {
            method516(17);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 192)
    public static void method516(int arg0) {
        field1553 = null;
        field1571 = null;
        field1564 = null;
        field1554 = null;
        field1575 = null;
        field1549 = null;
        field1551 = null;
        field1568 = null;
        if (arg0 > 98) {
            field1552 = null;
            field1557 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 213)
    public static final void method517(int arg0) {
        if (class27.field681 != null) {
            class27.field681.method180();
            class27.field681 = null;
        }
        field1566++;
        class24.field603 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZILae;ZLae;Lbf;I)V", line = 261)
    public static final synchronized void method518(int arg0, boolean arg1, int arg2, class6 arg3, boolean arg4, class6 arg5, class14 arg6, int arg7) {
        field1559++;
        if (class88.method745((byte) -62) && arg1) {
            int var8 = arg6.method158(arg3, (byte) 30);
            int var9 = arg6.method138(100, var8, arg5);
            method513(arg6, var8, var9, arg4, arg7, arg0, -30, arg2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V", line = 283)
    public static final synchronized void method519(byte arg0, int arg1) {
        if (arg0 >= -32) {
            method518(-5, true, -66, null, true, null, null, -14);
        }
        field1556++;
        if (class88.method745((byte) -62)) {
            class123.method1012(-26, arg1);
            class96.field2300 = null;
            class50.field1128 = false;
        }
    }
}
