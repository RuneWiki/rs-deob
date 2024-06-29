import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class105 extends class71 {

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    private int field1973 = 2048;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    private int field1974 = 12288;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    private int field1980 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    private int field1967 = 0;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    private int field1987 = 4096;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    private int field1988 = 8192;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    private int field1989 = 2048;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Lud;")
    public static class279 field1971 = class130.method1024("Prendre", 255);

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "Lud;")
    public static class279 field1969 = class130.method1024("Clientscript error )2 check log for details", 255);

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "Lud;")
    public static class279 field1976 = class130.method1024("Texturen geladen)3", 255);

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lud;")
    private static class279 field1978 = class130.method1024("Loading sprites )2 ", 255);

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Lud;")
    public static class279 field1979 = field1978;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "[I")
    public static int[] field1986 = new int[4096];

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "S")
    public static short field1982 = 256;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[B")
    public static byte[] field1972;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 3)
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 7)
    public static void method884(int arg0) {
        field1986 = null;
        field1972 = null;
        field1979 = null;
        field1976 = null;
        field1971 = null;
        field1969 = null;
        if (arg0 == -3) {
            field1978 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)[I", line = 30)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 > -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        field1975++;
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0] - 2048;
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                int var6 = class133.field2424[var5] - 2048;
                int var7 = this.field1973 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = this.field1989 + var4;
                int var11 = this.field1980 + var6;
                int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                int var13 = this.field1967 + var4;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var12 > 2048 ? var12 - 4096 : var12;
                int var16 = var14 <= 2048 ? var14 : var14 - 4096;
                int var17 = var10 < -2048 ? var10 + 4096 : var10;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method886(var9, (byte) -103, var16) || this.method885(4096, var15, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(III)Z", line = 79)
    private final boolean method885(int arg0, int arg1, int arg2) {
        field1984++;
        int var4 = (arg2 + arg1) * this.field1974 >> 12;
        int var5 = class87.field1668[(var4 * 255 & 0xFF7E6) >> 12];
        int var6 = (var5 << 12) / this.field1974;
        int var7 = (var6 << 12) / this.field1988;
        if (arg0 != 4096) {
            this.method886(-73, (byte) -46, 48);
        }
        int var8 = this.field1987 * var7 >> 12;
        return var8 > arg2 - arg1 && (-var8) < (arg2 - arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLvh;)V", line = 110)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field1970++;
        if (arg0 == 0) {
            this.field1973 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field1967 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1980 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field1989 = arg2.method468(28214);
        } else if (arg0 == 4) {
            this.field1974 = arg2.method468(28214);
        } else if (arg0 == 5) {
            this.field1987 = arg2.method468(28214);
        } else if (arg0 == 6) {
            this.field1988 = arg2.method468(28214);
        }
        if (!arg1) {
            this.field1973 = 37;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 187)
    public final void method627(int arg0) {
        class75.method644(111);
        field1983++;
        if (arg0 != 7) {
            method887((byte) 73);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)Z", line = 198)
    private final boolean method886(int arg0, byte arg1, int arg2) {
        field1981++;
        if (arg1 >= -84) {
            this.method886(-97, (byte) -74, -85);
        }
        int var4 = (arg2 - arg0) * this.field1974 >> 12;
        int var5 = class87.field1668[(var4 * 255 & 0xFF63A) >> 12];
        int var6 = (var5 << 12) / this.field1974;
        int var7 = (var6 << 12) / this.field1988;
        int var8 = this.field1987 * var7 >> 12;
        return arg0 + arg2 < var8 && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)I", line = 236)
    public static final int method887(byte arg0) {
        field1990++;
        int var1 = -60 / ((49 - arg0) / 32);
        return ((class3.field105 == 0 ? 0 : 1) << 22) + ((class113.field2073 == 0 ? 0 : 1) << 21) + ((class41.field875 == 0 ? 0 : 1) << 20) + ((class80.field1525 ? 1 : 0) << 19) + ((class162.field2929 ? 1 : 0) << 15) + ((class126.field2340 ? 1 : 0) << 13) + (((class220.field3883 ? 1 : 0) << 10) + ((class198.field3536 ? 1 : 0) << 9) + ((class221.field3901 ? 1 : 0) << 8) + ((class29.field685 ? 1 : 0) << 6) + ((class202.field3608 ? 1 : 0) << 5) + (class253.field4519 & 0x7) + ((class145.field2624 ? 1 : 0) << 3) + ((class289.field5158 ? 1 : 0) << 4) + ((class86.field1614 ? 1 : 0) << 7) - (-(class171.field3086 & 0x3 << 11) + -((class68.field1335 ? 1 : 0) << 16) + -(class208.method1533() << 23)));
    }
}
