import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class25 extends class185 {

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    private int field308 = -1;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Ljava/lang/String;")
    public static String field309 = "Prepared sound engine";

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "J")
    public static volatile long field303 = 0L;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Lpf;")
    public static class294 field302;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILpf;B)[Lsb;")
    public static final class230[] method156(int arg0, int arg1, class294 arg2, byte arg3) {
        if (arg3 >= -76) {
            field302 = null;
        }
        ++field310;
        return !class66.method451(arg2, arg0, 2048, arg1) ? null : class146.method889((byte) -115);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field302 = null;
        field309 = null;
        if (arg0 != 94) {
            method156(37, 67, (class294) null, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)Z")
    private final boolean method158(int arg0) {
        ++field306;
        if (this.field312 != null) {
            return true;
        } else {
            if (arg0 < 62) {
                method161(false);
            }
            if (this.field308 >= 0) {
                int var2 = class174.field2648;
                int var3 = class130.field1933;
                int var4 = class110.field1711.method661(36, this.field308).field4099 ? 64 : 128;
                this.field312 = class110.field1711.method662(var4, 1.0F, false, var4, this.field308, 121);
                this.field301 = var4;
                this.field313 = var4;
                class163.method1009(var2, (byte) -120, var3);
                return this.field312 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(ZI)Lhb;")
    public static final class221 method159(boolean arg0, int arg1) {
        ++field307;
        class221 var2 = (class221) class268.field4045.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class242.field3630.method1973(1, 29, arg1);
            class221 var4 = new class221();
            if (var3 != null) {
                var4.method1412(arg1, new class248(var3), -1);
            }
            if (arg0) {
                method156(-106, 33, (class294) null, (byte) -28);
            }
            class268.field4045.method1784((long) arg1, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 == 0) {
            this.field308 = arg1.method1575(false);
        }
        ++field311;
        if (arg2 != -6357) {
            method161(false);
        }
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)I")
    public final int method160(int arg0) {
        ++field304;
        return arg0 <= 118 ? 67 : this.field308;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)V")
    public static final void method161(boolean arg0) {
        ++field314;
        class253.field3850.method1782(0);
        class235.field3546.method1782(0);
        class50.field792.method1782(0);
        if (!arg0) {
            field305 = 86;
        }
        class62.field980.method1782(0);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class25() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        ++field299;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            this.method39(false, -119);
        }
        if (super.field2802.field1807 && this.method158(94)) {
            int var4 = (class130.field1933 == this.field313 ? arg1 : this.field313 * arg1 / class130.field1933) * this.field301;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class174.field2648 == this.field301) {
                for (int var8 = 0; var8 < class174.field2648; ++var8) {
                    int var9 = this.field312[var4++];
                    var6[var8] = class94.method598(var9 << 4, 4080);
                    var7[var8] = class94.method598(65280, var9) >> 4;
                    var5[var8] = class94.method598(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class174.field2648; ++var10) {
                    int var11 = this.field301 * var10 / class174.field2648;
                    int var12 = this.field312[var4 + var11];
                    var6[var10] = class94.method598(var12, 255) << 4;
                    var7[var10] = class94.method598(var12, 65280) >> 4;
                    var5[var10] = class94.method598(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public final void method162(byte arg0) {
        ++field300;
        super.method162(arg0);
        this.field312 = null;
    }
}
