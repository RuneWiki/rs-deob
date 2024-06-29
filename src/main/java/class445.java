import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class445 extends class159 {

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public int field6408;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "[I")
    public static int[] field6405 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6407 = new CRC32();

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
    public static int field6412 = 0;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "J")
    public static long field6406;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V", line = 6)
    public static void method2654(byte arg0) {
        field6407 = null;
        field6405 = null;
        int var1 = -42 % ((-arg0 - 13) / 37);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IB)Lofa;", line = 21)
    public static final class347 method2655(int arg0, byte arg1) {
        field6409++;
        int var2 = arg0 >> 16;
        if (arg1 < 107) {
            return null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class419.field6032[var2] == null || class419.field6032[var2][var3] == null) {
            boolean var4 = class422.method2542(-86, var2);
            if (!var4) {
                return null;
            }
        }
        return class419.field6032[var2][var3];
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V", line = 46)
    public static final void method2656(int arg0, int arg1) {
        field6411++;
        if (arg0 != arg1 && class408.field5782[arg0]) {
            class82.field1139.method1192((byte) -33, arg0);
            class419.field6032[arg0] = null;
            class230.field2956[arg0] = null;
            class408.field5782[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IF)F", line = 65)
    public static final float method2657(int arg0, float arg1) {
        field6410++;
        return arg0 == 10 ? arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F) : -1.0484523F;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V", line = 77)
    public class445() {
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(I)V", line = 82)
    public class445(int arg0) {
        this.field6408 = arg0;
    }
}
