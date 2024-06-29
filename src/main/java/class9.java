import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field101 = new CRC32();

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[I")
    public static int[] field103 = new int[2500];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lde;")
    public static final class214 method53(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class214 var4 = var3.field5027;
            var3.field5027 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lh;")
    public static final class279 method54(int arg0) {
        field99++;
        class279 var1 = (class279) class86.field1360.method1450(false);
        if (var1 != null) {
            var1.method1781(5250);
            var1.method1135(false);
            return var1;
        }
        if (arg0 != 0) {
            field101 = null;
        }
        class279 var2;
        do {
            var2 = (class279) class142.field2293.method1450(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1929((byte) 26) > class3.method14(29853)) {
                return null;
            }
            var2.method1781(5250);
            var2.method1135(false);
        } while ((var2.field2422 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field103 = null;
        field101 = null;
        int var1 = -88 % ((arg0 + 32) / 39);
    }
}
