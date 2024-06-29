import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class105 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1588 = "Connection lost.";

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1591 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
    public static boolean field1586 = false;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1590;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[B")
    public byte[] field1601;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[B")
    public byte[] field1602;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[[B")
    public static byte[][] field1596;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ltd;Ltd;ZII)I", line = 10)
    public static final int method732(class255 arg0, class255 arg1, boolean arg2, int arg3, int arg4) {
        field1600++;
        if (arg3 == 1) {
            int var5 = arg0.field3041;
            int var6 = arg1.field3041;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg3 == 2) {
            return class181.method1248(arg1.method1798(-77).field3895, (byte) 24, class136.field2054, arg0.method1798(-109).field3895);
        } else if (arg3 != 3) {
            int var7 = 126 / ((-arg4 - 29) / 61);
            if (arg3 == 4) {
                return arg1.method1320(107) ? (arg0.method1320(112) ? 0 : 1) : (arg0.method1320(121) ? -1 : 0);
            } else if (arg3 == 5) {
                return arg1.method1322((byte) 108) ? (arg0.method1322((byte) 127) ? 0 : 1) : (arg0.method1322((byte) 126) ? -1 : 0);
            } else if (arg3 == 6) {
                return arg1.method1321(102) ? (arg0.method1321(77) ? 0 : 1) : (arg0.method1321(59) ? -1 : 0);
            } else if (arg3 == 7) {
                return arg1.method1318((byte) 89) ? (arg0.method1318((byte) 75) ? 0 : 1) : (arg0.method1318((byte) -98) ? -1 : 0);
            } else {
                return arg1.field4049 - arg0.field4049;
            }
        } else if (arg1.field4053.equals("-")) {
            if (arg0.field4053.equals("-")) {
                return 0;
            } else if (arg2) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg0.field4053.equals("-")) {
            return arg2 ? 1 : -1;
        } else {
            return class181.method1248(arg1.field4053, (byte) 59, class136.field2054, arg0.field4053);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 99)
    public static void method733(byte arg0) {
        field1596 = (byte[][]) null;
        field1590 = null;
        if (arg0 != -15) {
            field1585 = -102;
        }
        field1591 = null;
        field1588 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILh;IJIIII)Z", line = 113)
    public static final boolean method734(int arg0, int arg1, int arg2, int arg3, class232 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class161.method1121(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
