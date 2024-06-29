import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class247 extends class14 {

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    private int field3289 = -1;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "[I")
    public static int[] field3278 = new int[3];

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "[[I")
    public static int[][] field3286 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    private int field3279;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "[I")
    private int[] field3284;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
    public final void method138(int arg0, int arg1, byte arg2) {
        super.method138(arg0, arg1, arg2);
        ++field3290;
        if (~this.field3289 <= -1 && class422.field5779 != null) {
            int var4 = !class422.field5779.method677(2459, this.field3289).field3632 ? 128 : 64;
            this.field3284 = class422.field5779.method678(1.0F, this.field3289, 24201, false, var4, var4);
            this.field3288 = var4;
            this.field3279 = var4;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        ++field3287;
        if (arg0 >= -119) {
            field3278 = null;
        }
        int var1 = (int) ((double) class12.field251 * 34.46D);
        int var2 = var1 << 0;
        if (class370.field4984.method569()) {
            var2 += 128;
        }
        class370.field4984.method577(50, var2);
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)Lbk;")
    public static final class253 method1499(int arg0) {
        ++field3285;
        if (arg0 != 26973) {
            field3278 = null;
        }
        class253 var1 = (class253) class283.field3713.method786(1);
        if (var1 != null) {
            var1.method300(false);
            var1.method2856(0);
            return var1;
        } else {
            class253 var2;
            do {
                var2 = (class253) class320.field4189.method786(1);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method1524(90) < ~class498.method2854(-120)) {
                    return null;
                }
                var2.method300(false);
                var2.method2856(0);
            } while (~(Long.MIN_VALUE & var2.field6896) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 == -1) {
            this.field3289 = arg2.method2212((byte) 83);
        }
        ++field3282;
        int var4 = 91 / ((arg1 - -51) / 37);
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field3278 = null;
        field3286 = null;
        if (arg0 != -125) {
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        if (arg0 != -30909) {
            field3278 = null;
        }
        ++field3283;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int var4 = this.field3288 * (class494.field6866 == this.field3279 ? arg1 : this.field3279 * arg1 / class494.field6866);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class115.field1637 == ~this.field3288) {
                for (int var8 = 0; ~var8 > ~class115.field1637; ++var8) {
                    int var9 = this.field3284[var4++];
                    var7[var8] = class494.method2839(4080, var9 << 4);
                    var6[var8] = class494.method2839(4080, var9 >> 4);
                    var5[var8] = class494.method2839(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class115.field1637; ++var10) {
                    int var11 = this.field3288 * var10 / class115.field1637;
                    int var12 = this.field3284[var4 - -var11];
                    var7[var10] = class494.method2839(255, var12) << 4;
                    var6[var10] = class494.method2839(65280, var12) >> 4;
                    var5[var10] = class494.method2839(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        ++field3280;
        super.method146((byte) -115);
        if (arg0 <= -36) {
            this.field3284 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I")
    public final int method137(int arg0) {
        ++field3281;
        if (arg0 != -1) {
            method1498(100);
        }
        return this.field3289;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class247() {
        super(0, false);
    }
}
