import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class403 extends class194 {

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    private int field5594 = 0;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    private int field5596 = 4096;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    private int field5597 = 2048;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    private int field5595 = 8192;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    private int field5592 = 12288;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    private int field5593 = 2048;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    private int field5605 = 0;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field5601 = 1;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII)Z", line = 3)
    private final boolean method2517(boolean arg0, int arg1, int arg2) {
        ++field5598;
        if (arg0) {
            field5601 = 38;
        }
        int var4 = (arg1 + arg2) * this.field5592 >> 12;
        int var5 = class296.field3949[(1046663 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5592;
        int var7 = (var6 << 12) / this.field5595;
        int var8 = this.field5596 * var7 >> 12;
        return -arg2 + arg1 < var8 && -arg2 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 220)
    public class403() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 37)
    public final void method280(int arg0) {
        class141.method911(-7448);
        int var2 = 22 % ((arg0 - 28) / 63);
        ++field5602;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILbg;)V", line = 49)
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field5595 = arg2.method1587((byte) -102);
                                }
                            } else {
                                this.field5596 = arg2.method1587((byte) -102);
                            }
                        } else {
                            this.field5592 = arg2.method1587((byte) -102);
                        }
                    } else {
                        this.field5593 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field5594 = arg2.method1587((byte) -102);
                }
            } else {
                this.field5605 = arg2.method1587((byte) -102);
            }
        } else {
            this.field5597 = arg2.method1587((byte) -102);
        }
        ++field5591;
        int var5 = -26 / ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I", line = 128)
    public final int[] method55(int arg0, int arg1) {
        ++field5599;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 31 / ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int var5 = class249.field3283[arg0] + -2048;
            for (int var6 = 0; ~var6 > ~class138.field1579; ++var6) {
                int var7 = class277.field3585[var6] - 2048;
                int var8 = this.field5597 + var7;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = var5 - -this.field5605;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var14 = this.field5594 + var7;
                int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                int var16 = var15 > 2048 ? var15 + -4096 : var15;
                int var17 = this.field5593 + var5;
                int var18 = var17 < -2048 ? var17 + 4096 : var17;
                int var19 = var18 <= 2048 ? var18 : var18 - 4096;
                var3[var6] = !this.method2520(var10, var13, false) && !this.method2517(false, var19, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 186)
    public static final void method2518(byte arg0) {
        ++field5603;
        if (arg0 <= 7) {
            method2518((byte) 123);
        }
        for (class237 var1 = (class237) class314.field4232.method1690((byte) -114); var1 != null; var1 = (class237) class314.field4232.method1699((byte) 114)) {
            if (var1.field3111) {
                var1.method1521(-18541);
            }
        }
        for (class237 var2 = (class237) class59.field748.method1690((byte) -107); var2 != null; var2 = (class237) class59.field748.method1699((byte) 107)) {
            if (var2.field3111) {
                var2.method1521(-18541);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIZZ)V", line = 223)
    public static final void method2519(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class43.field512 = arg1;
        class262.field3367 = arg2;
        class347.field4720 = arg3;
        class299.field4000 = new class316[arg0][class43.field512][class262.field3367];
        class219.field2709 = new class279[arg0];
        if (arg4) {
            class104.field1216 = new class316[1][class43.field512][class262.field3367];
            class134.field1536 = new int[class43.field512][class262.field3367];
            class75.field915 = new class279[1];
        } else {
            class104.field1216 = null;
            class134.field1536 = null;
            class75.field915 = null;
        }
        if (arg5) {
            class59.field747 = new int[arg0][arg1][arg2];
            class349.field4761 = new class6[255];
            class174.field2007 = new boolean[255];
            class208.field2534 = 0;
        } else {
            class59.field747 = null;
            class349.field4761 = null;
            class174.field2007 = null;
            class208.field2534 = 0;
        }
        class318.method1992(false);
        class127.field1426 = new class264[500];
        class264.field3402 = 0;
        class104.field1223 = new class264[500];
        class325.field4336 = 0;
        class354.field4820 = new int[arg0][class43.field512 + 1][class262.field3367 + 1];
        class46.field526 = new class133[5000];
        class125.field1398 = 0;
        class140.field1628 = new boolean[class347.field4720 + class347.field4720 + 1][class347.field4720 + class347.field4720 + 1];
        class446.field6218 = new boolean[class347.field4720 + class347.field4720 + 2][class347.field4720 + class347.field4720 + 2];
        class419.field5721 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZ)Z", line = 275)
    private final boolean method2520(int arg0, int arg1, boolean arg2) {
        ++field5604;
        int var4 = (-arg0 + arg1) * this.field5592 >> 12;
        if (arg2) {
            return false;
        } else {
            int var5 = class296.field3949[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field5592;
            int var7 = (var6 << 12) / this.field5595;
            int var8 = this.field5596 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 - -arg1);
        }
    }
}
