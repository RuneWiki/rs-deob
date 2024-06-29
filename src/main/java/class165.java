import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class165 extends class166 {

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    private int field3040 = -1;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lhj;")
    public static class69 field3047 = class181.method1318(" )2> <col=ffffff>", (byte) -112);

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field3039 = 0;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "Lhj;")
    public static class69 field3048 = class181.method1318("Stufe)2", (byte) -114);

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "[I")
    private int[] field3041;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Z")
    private final boolean method1220(int arg0) {
        ++field3054;
        if (this.field3041 != null) {
            return true;
        } else if (arg0 <= this.field3040) {
            int var2 = class253.field4565;
            int var3 = class146.field2691;
            int var4 = class162.field2999.method781(arg0 + 896171494, this.field3040) ? 64 : 128;
            this.field3041 = class162.field2999.method784(-127, this.field3040);
            this.field3038 = var4;
            this.field3036 = var4;
            class182.method1327(var2, var3, (byte) 89);
            return this.field3041 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3047 = null;
        if (arg0 != 128) {
            method1223(-17);
        }
        field3048 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
    public final int method1222(byte arg0) {
        ++field3053;
        return arg0 != 43 ? -67 : this.field3040;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field3046;
        int[][] var3 = super.field3064.method320(arg1, (byte) -83);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field3064.field979 && this.method1220(0)) {
                int var4 = (~class146.field2691 != ~this.field3038 ? this.field3038 * arg1 / class146.field2691 : arg1) * this.field3036;
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                int[] var7 = var3[1];
                if (class253.field4565 != this.field3036) {
                    for (int var8 = 0; ~var8 > ~class253.field4565; ++var8) {
                        int var9 = this.field3036 * var8 / class253.field4565;
                        int var10 = this.field3041[var4 - -var9];
                        var6[var8] = class69.method443(255, var10) << 4;
                        var7[var8] = class69.method443(var10, 65280) >> 4;
                        var5[var8] = class69.method443(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; var11 < class253.field4565; ++var11) {
                        int var12 = this.field3041[var4++];
                        var6[var11] = class69.method443(4080, var12 << 4);
                        var7[var11] = class69.method443(var12, 65280) >> 4;
                        var5[var11] = class69.method443(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class165() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
    public static final void method1223(int arg0) {
        if (arg0 != -236904444) {
            field3047 = null;
        }
        ++field3033;
        class72.field1397.method1713(69);
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(II)Lhj;")
    public static final class69 method1224(int arg0, int arg1) {
        ++field3052;
        if (~arg0 < -1 && ~arg0 >= -256) {
            class69 var2 = new class69();
            var2.field1351 = new byte[arg1];
            var2.field1351[0] = (byte) arg0;
            var2.field1331 = 1;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method1225(int arg0) {
        ++field3044;
        super.method1225(arg0);
        this.field3041 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field3050;
        if (~arg2 == -1) {
            this.field3040 = arg1.method912(-111);
        }
        if (arg0 != 96) {
            this.method1225(85);
        }
    }
}
