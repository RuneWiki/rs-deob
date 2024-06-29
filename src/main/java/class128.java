import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class128 extends InputStream {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field1535 = new int[1];

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Z")
    public static boolean field1537 = true;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 4)
    public static void method858(boolean arg0) {
        field1535 = null;
        if (arg0) {
            method859(88, 100, -13);
        }
    }

    @OriginalMember(owner = "client!hh", name = "read", descriptor = "()I", line = 15)
    public final int read() {
        class756.method4205(30000L, 0);
        field1538++;
        return -1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I", line = 35)
    public static final int method859(int arg0, int arg1, int arg2) {
        field1536++;
        int var3 = arg0 * 57 + arg2;
        if (arg1 != 2013416941) {
            method859(35, -66, 70);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FA9CB3) >> 19;
    }
}
