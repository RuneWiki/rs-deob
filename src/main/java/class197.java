import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class197 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2895 = new Hashtable();

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public static int[] field2899 = new int[5];

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    public static int[] field2898 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
    public static final int method1403(int arg0, int arg1, int arg2, int arg3) {
        field2896++;
        if (class683.field9250 == null) {
            return 0;
        }
        int var4 = arg0 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class376.field5325 - 1 || (class175.field2711 - 1) < var5) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class607.field8331[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        if (arg2 != 11219) {
            field2895 = null;
        }
        return class683.field9250[var6].method1853(arg0, arg3, (byte) -113);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field2899 = null;
        field2898 = null;
        field2895 = null;
        if (arg0 != 31913) {
            field2897 = 52;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
    public static final boolean method1405(byte arg0) {
        field2900++;
        if (class214.field3036 < 1) {
            return false;
        } else {
            if (arg0 < 101) {
                method1404(66);
            }
            return true;
        }
    }
}
