import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class109 {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field1809 = -1;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "S")
    public static short field1804 = 256;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "J")
    public static long field1808 = 0L;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lmh;")
    public class136 field1810;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ltd;")
    public static class241 field1803;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[B")
    public static byte[] field1811;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
    public int[] field1807;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field1802;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lpe;II)V", line = 8)
    public static final void method829(class101 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        if (class92.field1520 != null) {
            try {
                class92.field1520.method1603((byte) 66, 0L);
                class92.field1520.method1606(arg2, arg0.field1661, 24, 60);
            } catch (Exception var4) {
            }
        }
        field1801++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)Leh;", line = 32)
    public static final class169 method830(String arg0, int arg1) {
        field1805++;
        for (class169 var2 = (class169) class54.field852.method1490(200); var2 != null; var2 = (class169) class54.field852.method1487((byte) 117)) {
            if (var2.field2624.equals(arg0)) {
                return var2;
            }
        }
        if (arg1 != 256) {
            field1806 = 2;
        }
        return null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 70)
    public static void method831(int arg0) {
        field1803 = null;
        field1811 = null;
        if (arg0 != 0) {
            method829((class101) null, -58, -89);
        }
    }
}
