import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class117 extends class228 {

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    private int field2067 = 204;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    private int field2071 = 1;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    private int field2074 = 1;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Loa;")
    public static class99 field2075 = class221.method1463(2844, "(U1");

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public static int field2076 = 0;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "[I")
    public static int[] field2070 = new int[2000];

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2069 = 3353893;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "Loa;")
    public static class99 field2080 = class221.method1463(2844, "brillant3:");

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "Loa;")
    private static class99 field2081 = class221.method1463(2844, "Allocating memory");

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "Loa;")
    public static class99 field2072 = field2081;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "[[B")
    public static byte[][] field2077;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(B)V")
    public static void method787(byte arg0) {
        field2070 = null;
        field2080 = null;
        if (arg0 <= 21) {
            method790((byte) -109, false);
        }
        field2081 = null;
        field2075 = null;
        field2072 = null;
        field2077 = null;
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(B)V")
    public static final void method788(byte arg0) {
        if (arg0 != 12) {
            method788((byte) -48);
        }
        class143.field2514.method1813(-1);
        ++field2079;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(III)J")
    public static final long method789(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 != null && var3.field3758 != null ? var3.field3758.field1034 : 0L;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            ++field2068;
            int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
            if (super.field3952.field3276) {
                for (int var4 = 0; var4 < class234.field4046; ++var4) {
                    int var5 = class54.field879[arg0];
                    int var6 = class281.field4923[var4];
                    int var7 = this.field2071 * var6 >> 12;
                    int var8 = this.field2074 * var5 >> 12;
                    int var9 = var6 % (4096 / this.field2071) * this.field2071;
                    int var10 = var5 % (4096 / this.field2074) * this.field2074;
                    if (var10 < this.field2067) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field2067) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field2067 > var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            this.method18(4, (class261) null, -36);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2067 = arg1.method1740((byte) 66);
                }
            } else {
                this.field2074 = arg1.method1693((byte) -106);
            }
        } else {
            this.field2071 = arg1.method1693((byte) -117);
        }
        ++field2073;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V")
    public static final void method790(byte arg0, boolean arg1) {
        if (arg1) {
            field2076 = 113;
        }
        if (class228.field3951 == null) {
            class228.field3951 = new byte[4][104][104];
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class228.field3951[var2][var3][var4] = arg0;
                }
            }
        }
        ++field2078;
    }
}
