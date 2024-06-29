import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class417 {

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    private int field6043;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
    public byte field6032;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public int field6049;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public int field6034;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "[I")
    public static int[] field6042 = new int[32];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public int field6031;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public int field6041;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public int field6048;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "Lnn;")
    public class417 field6045;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lin;")
    public static class91 field6035;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "[[B")
    public static byte[][] field6044;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)Lnn;")
    public final class417 method2572(int arg0, int arg1, int arg2, int arg3) {
        field6050++;
        return arg1 == -1 ? new class417(this.field6043, arg3, arg0, arg2, this.field6032) : null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lqb;")
    public final class226 method2573(byte arg0) {
        field6030++;
        if (arg0 != 59) {
            this.field6037 = -51;
        }
        return class157.method1201(this.field6043, arg0 ^ 0x3B);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method2574(int arg0) {
        if (arg0 == 32) {
            field6035 = null;
            field6044 = null;
            field6042 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIB)V")
    public class417(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6043 = arg0;
        this.field6032 = arg4;
        this.field6038 = arg1;
        this.field6049 = arg3;
        this.field6034 = arg2;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6042[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
