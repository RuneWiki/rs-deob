import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class113 extends class157 {

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    private int field2267 = -1;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lcc;")
    public static class209 field2271 = class95.method669(98, " loggt sich ein)3");

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "[I")
    public static int[] field2264;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[I")
    private int[] field2266;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
    public static void method804(int arg0) {
        field2264 = null;
        if (arg0 != 64) {
            field2264 = null;
        }
        field2271 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method805(int arg0, int arg1) {
        class68.field1300.method662(32768, arg1);
        ++field2274;
        class27.field488.method662(arg0 + 3344, arg1);
        if (arg0 != 29424) {
            method804(2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
    public static final void method806(int arg0) {
        ++field2268;
        class68.field1300.method665(1);
        if (arg0 != -531128796) {
            method805(-92, -101);
        }
        class27.field488.method665(arg0 + 531128797);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public final void method807(byte arg0) {
        ++field2270;
        super.method807(arg0);
        this.field2266 = null;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I")
    public final int method808(int arg0) {
        ++field2273;
        int var2 = 19 / ((-91 - arg0) / 32);
        return this.field2267;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 >= -29) {
            this.field2267 = -121;
        }
        ++field2262;
        if (arg0 == 0) {
            this.field2267 = arg2.method736(124);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Z")
    private final boolean method809(byte arg0) {
        ++field2269;
        if (this.field2266 != null) {
            return true;
        } else if (~this.field2267 <= -1) {
            int var2 = class226.field4124;
            int var3 = class79.field1469;
            int var4 = !class243.field4397.method1619(101, this.field2267) ? 128 : 64;
            this.field2266 = class243.field4397.method1615(5350, this.field2267);
            this.field2265 = var4;
            this.field2263 = var4;
            class47.method342(var3, var2, 0);
            return this.field2266 != null;
        } else {
            if (arg0 != -115) {
                field2264 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method250(-77, 88);
        }
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434 && this.method809((byte) -115)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class79.field1469 != this.field2265 ? this.field2265 * arg1 / class79.field1469 : arg1) * this.field2263;
            int[] var7 = var3[2];
            if (~class226.field4124 == ~this.field2263) {
                for (int var8 = 0; ~class226.field4124 < ~var8; ++var8) {
                    int var9 = this.field2266[var6++];
                    var7[var8] = class27.method220(255, var9) << 4;
                    var5[var8] = class27.method220(var9 >> 4, 4080);
                    var4[var8] = class27.method220(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class226.field4124; ++var10) {
                    int var11 = this.field2263 * var10 / class226.field4124;
                    int var12 = this.field2266[var6 + var11];
                    var7[var10] = class27.method220(var12, 255) << 4;
                    var5[var10] = class27.method220(var12, 65280) >> 4;
                    var4[var10] = class27.method220(var12, 16711680) >> 12;
                }
            }
        }
        ++field2272;
        return var3;
    }
}
