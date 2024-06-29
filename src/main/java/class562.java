import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class562 extends class644 {

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "D")
    public double field7916;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "[[S")
    public short[][] field7913;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "[F")
    public static float[] field7911 = new float[4];

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "[I")
    public static int[] field7914 = new int[4096];

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field7915;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7914[var0] = class635.method3560(var0, -1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3243(int arg0) {
        if (arg0 <= 15) {
            field7911 = null;
        }
        if (class654.method3674((byte) 107, class27.field484) || class575.method3299(class27.field484, true)) {
            class712.method3978(0, class318.field4121 >> 12, 5000, class450.field5953 >> 12);
        } else {
            int var1 = class380.field4847.field264[0] >> 3;
            int var2 = class380.field4847.field260[0] >> 3;
            if (var1 >= 0 && (class409.field5183 >> 3) > var1 && var2 >= 0 && (class543.field7597 >> 3) > var2) {
                class712.method3978(0, var2, 5000, var1);
            } else {
                class712.method3978(0, class543.field7597 >> 4, 0, class409.field5183 >> 4);
            }
        }
        field7915++;
        class730.method4073(118);
        class726.method4052((byte) -113);
        class220.method1431(1023);
        class106.method858(-1);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)J", line = 34)
    public final long method3244(boolean arg0) {
        if (arg0) {
            return 74L;
        } else {
            field7912++;
            return (long) (this.field7913.length << 0 | this.field7913[0].length);
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V", line = 45)
    public static void method3245(int arg0) {
        field7914 = null;
        if (arg0 != -677250676) {
            method3243(46);
        }
        field7911 = null;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "([[SD)V", line = 76)
    public class562(short[][] arg0, double arg1) {
        this.field7916 = arg1;
        this.field7913 = arg0;
    }
}
