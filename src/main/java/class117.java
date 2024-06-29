import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class117 extends class252 {

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    private int field2088 = 4096;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    private int field2097 = 4096;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
    private int field2103 = 4096;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
    public static int[] field2091 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "Ljd;")
    public static class85 field2094 = class221.method1499("mapfunction", (byte) -52);

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "J")
    public static volatile long field2089 = 0L;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "S")
    public static short field2090 = 32767;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "[I")
    public static int[] field2098 = new int[1000];

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "Ljd;")
    public static class85 field2095 = class221.method1499("Speicher wird zugewiesen)3", (byte) -113);

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "Ljd;")
    private static class85 field2101 = class221.method1499(" is already on your ignore list)3", (byte) 91);

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "[I")
    public static int[] field2100 = new int[128];

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Ljd;")
    public static class85 field2092 = field2101;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "Ljb;")
    public static class255 field2096;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field2102;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (arg1 != -123) {
            this.field2088 = -51;
        }
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class5.field63; ++var11) {
                int var12 = var5[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var7[var11] = this.field2097 * var12 >> 12;
                    var9[var11] = this.field2103 * var13 >> 12;
                    var10[var11] = this.field2088 * var14 >> 12;
                } else {
                    var7[var11] = this.field2097;
                    var9[var11] = this.field2103;
                    var10[var11] = this.field2088;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class117() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V")
    public static void method822(int arg0) {
        if (arg0 != 1000) {
            field2099 = -50;
        }
        field2094 = null;
        field2100 = null;
        field2091 = null;
        field2096 = null;
        field2095 = null;
        field2101 = null;
        field2092 = null;
        field2098 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field2093;
        if (arg2 == -99) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field2088 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field2103 = arg0.method1694((byte) -100);
                }
            } else {
                this.field2097 = arg0.method1694((byte) -100);
            }
        }
    }
}
