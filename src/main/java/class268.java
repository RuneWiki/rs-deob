import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class268 extends class300 {

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    private int field4344 = -1;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field4345 = 0;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "[S")
    public static short[] field4348 = new short[256];

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "[J")
    public static long[] field4354 = new long[1000];

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    private int field4356;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[I")
    public static int[] field4351;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "[I")
    public static int[] field4353;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "[I")
    private int[] field4357;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "[[[B")
    public static byte[][][] field4358;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
    public final int method1864(int arg0) {
        int var2 = 98 / ((arg0 - -68) / 39);
        ++field4349;
        return this.field4344;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public final void method405(byte arg0) {
        super.method405(arg0);
        ++field4360;
        this.field4357 = null;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)I")
    public static final int method1865(int arg0) {
        if (arg0 >= -83) {
            field4354 = null;
        }
        ++field4350;
        return 14;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Z")
    private final boolean method1866(int arg0) {
        ++field4346;
        if (this.field4357 != null) {
            return true;
        } else if (this.field4344 >= arg0) {
            int var2 = class180.field2826;
            int var3 = class4.field61;
            int var4 = !class230.field3560.method135(1714, this.field4344).field156 ? 128 : 64;
            this.field4357 = class230.field3560.method136(1.0F, this.field4344, (byte) 23, false, var4, var4);
            this.field4356 = var4;
            this.field4347 = var4;
            class139.method876(var3, true, var2);
            return this.field4357 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field4359;
        if (arg1 > -43) {
            field4348 = null;
        }
        if (~arg2 == -1) {
            this.field4344 = arg0.method1186((byte) -97);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class268() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field4355;
        int var3 = -60 / (arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) -39);
        if (super.field4786.field1200 && this.method1866(0)) {
            int var5 = this.field4356 * (class4.field61 == this.field4347 ? arg1 : this.field4347 * arg1 / class4.field61);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class180.field2826 != ~this.field4356) {
                for (int var9 = 0; class180.field2826 > var9; ++var9) {
                    int var10 = this.field4356 * var9 / class180.field2826;
                    int var11 = this.field4357[var5 - -var10];
                    var8[var9] = class205.method1411(4080, var11 << 4);
                    var7[var9] = class205.method1411(var11, 65280) >> 4;
                    var6[var9] = class205.method1411(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; ~var12 > ~class180.field2826; ++var12) {
                    int var13 = this.field4357[var5++];
                    var8[var12] = class205.method1411(var13 << 4, 4080);
                    var7[var12] = class205.method1411(65280, var13) >> 4;
                    var6[var12] = class205.method1411(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static void method1867(byte arg0) {
        field4351 = null;
        field4358 = null;
        field4353 = null;
        field4348 = null;
        field4354 = null;
        int var1 = -115 % ((-76 - arg0) / 34);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public static final void method1868(int arg0, int arg1, int arg2) {
        ++field4352;
        class181 var3 = class95.method652(5, (byte) 34, arg0);
        var3.method1285((byte) 64);
        if (arg2 < 44) {
            field4345 = 61;
        }
        var3.field2847 = arg1;
    }
}
