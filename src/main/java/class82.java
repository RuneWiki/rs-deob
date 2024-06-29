import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class82 extends class73 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[J")
    public static long[] field1154 = new long[256];

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lkc;")
    public static class147 field1161;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Las;")
    public static class15 field1159;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((var1 & 1L) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field1154[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 5)
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg0 != -16) {
            this.method632(39, -120, -96);
        }
        ++field1151;
        int var4 = this.field1152 * arg1 >> 12;
        int var5 = this.field1147 * arg1 >> 12;
        int var6 = this.field1150 * arg2 >> 12;
        int var7 = this.field1145 * arg2 >> 12;
        class230.method1508(var6, super.field988, super.field980, 64, var5, var4, var7);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 25)
    public static void method671(boolean arg0) {
        if (!arg0) {
            field1159 = null;
        }
        field1159 = null;
        field1161 = null;
        field1154 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)I", line = 44)
    public static final int method672(int arg0, int arg1, byte arg2) {
        ++field1156;
        if (arg2 > -44) {
            method674((byte) 109);
        }
        int var3 = (arg1 & 127) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 65408) + var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)V", line = 69)
    public final void method630(byte arg0, int arg1, int arg2) {
        ++field1155;
        int var4 = this.field1152 * arg2 >> 12;
        int var5 = this.field1147 * arg2 >> 12;
        if (arg0 < 39) {
            field1148 = -46;
        }
        int var6 = this.field1150 * arg1 >> 12;
        int var7 = this.field1145 * arg1 >> 12;
        class330.method2019(-1, super.field985, var4, var6, var5, var7);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V", line = 88)
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1145 = arg3;
        this.field1150 = arg1;
        this.field1147 = arg2;
        this.field1152 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V", line = 126)
    public final void method632(int arg0, int arg1, int arg2) {
        ++field1149;
        if (arg0 == 5263) {
            int var4 = this.field1152 * arg1 >> 12;
            int var5 = this.field1147 * arg1 >> 12;
            int var6 = this.field1150 * arg2 >> 12;
            int var7 = this.field1145 * arg2 >> 12;
            class485.method2835(super.field980, var4, super.field985, super.field988, (byte) 21, var7, var6, var5);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 146)
    public static final void method673(int arg0) {
        if (arg0 != 2) {
            field1148 = 18;
        }
        ++field1153;
        if (!class138.field1976.method515()) {
            class267.method1745(class170.field2424, -128);
        } else {
            class3.method21(65);
            class138.field1976.method509(class378.field5618);
            class456.method2706((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 167)
    public static final void method674(byte arg0) {
        int var1 = -68 / ((-69 - arg0) / 53);
        ++field1157;
        int var2 = class299.field4466;
        int[] var3 = class161.field2218;
        for (int var4 = 0; var4 < var2; ++var4) {
            class257 var5 = class40.field565[var3[var4]];
            if (var5 != null) {
                class317.method1955(var5.method1705((byte) 65), var5, true);
            }
        }
    }
}
