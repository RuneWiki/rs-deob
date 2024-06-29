import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class185 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[I")
    public static int[] field2761 = new int[25];

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "J")
    public static long field2765 = 0L;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
    public static int[] field2766 = new int[99];

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[I")
    public static int[] field2762;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)Lvk;")
    public static final class149 method1327(byte arg0, int arg1) {
        class149 var2 = (class149) class260.field4018.method2099((byte) 125, (long) arg1);
        field2763++;
        if (arg0 >= -51) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class165.field2541.method1868(arg1 & 0x7FFF, 0, 1);
            } else {
                var3 = class72.field1138.method1868(arg1, 0, 1);
            }
            class149 var4 = new class149();
            if (var3 != null) {
                var4.method1113((byte) -28, new class53(var3));
            }
            if (arg1 >= 32768) {
                var4.method1108(-18);
            }
            class260.field4018.method2103(var4, -1, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field2766 = null;
        field2762 = null;
        if (arg0 < -56) {
            field2761 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2766[var1] = var0 / 4;
        }
    }
}
