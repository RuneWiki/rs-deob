import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class320 extends class279 {

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field5054 = 0;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "[[Z")
    public static boolean[][] field5053 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "[S")
    public static short[] field5049;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V", line = 13)
    public static void method2243(int arg0) {
        if (arg0 > -17) {
            field5054 = -42;
        }
        field5053 = (boolean[][]) null;
        field5049 = null;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V", line = 24)
    public static final void method2244(int arg0) {
        field5051++;
        class10.field191.method1355(false);
        class317.field5015.method1355(false);
        if (arg0 != 21844) {
            method2244(-25);
        }
        class231.field3604.method1355(false);
        class258.field4070.method1355(false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BIII)I", line = 39)
    public static final int method2245(byte arg0, int arg1, int arg2, int arg3) {
        field5052++;
        if (class172.field2843 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (arg0 >= -16) {
            field5054 = -8;
        }
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg2;
        int var8 = arg1 & 0x7F;
        if (arg2 < 3 && (class134.field1969[1][var4][var5] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var9 = (128 - var6) * class172.field2843[var7][var4][var5] + class172.field2843[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class172.field2843[var7][var4][var5 + 1] + class172.field2843[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method334(int arg0);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Z")
    public abstract boolean method335(int arg0);
}
