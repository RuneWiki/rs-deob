import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class657 extends class751 {

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    private int field9257 = 0;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    private int field9260 = 4096;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    private int field9255 = 12288;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    private int field9259 = 2048;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    private int field9263 = 8192;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    private int field9264 = 0;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    private int field9267 = 2048;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "[C")
    private static char[] field9258 = new char[64];

    @OriginalMember(owner = "client!am", name = "O", descriptor = "Laba;")
    public static class185 field9269;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "Z")
    public static boolean field9271;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "Lcb;")
    public static class544 field9270;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class657() {
        super(0, true);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        class55.method355((byte) -69);
        ++field9265;
        if (arg0 <= 123) {
            field9270 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)Z")
    private final boolean method3760(int arg0, int arg1, byte arg2) {
        ++field9261;
        if (arg2 < 45) {
            this.field9257 = 54;
        }
        int var4 = (arg0 - arg1) * this.field9255 >> 12;
        int var5 = class300.field4511[(1047297 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field9255;
        int var7 = (var6 << 12) / this.field9263;
        int var8 = this.field9260 * var7 >> 12;
        return ~(arg0 + arg1) > ~var8 && arg1 - -arg0 > -var8;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field9262;
        if (arg1 != 4095) {
            this.field9267 = -41;
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int var4 = class619.field8728[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class673.field9452; ++var5) {
                int var6 = class179.field2708[var5] + -2048;
                int var7 = this.field9267 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field9264 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field9257 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field9259 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method3760(var12, var9, (byte) 110) && !this.method3761(var18, -385199156, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field9266;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field9263 = arg1.method898((byte) -88);
                                }
                            } else {
                                this.field9260 = arg1.method898((byte) -86);
                            }
                        } else {
                            this.field9255 = arg1.method898((byte) -99);
                        }
                    } else {
                        this.field9259 = arg1.method898((byte) -97);
                    }
                } else {
                    this.field9257 = arg1.method898((byte) -77);
                }
            } else {
                this.field9264 = arg1.method898((byte) -99);
            }
        } else {
            this.field9267 = arg1.method898((byte) -95);
        }
        int var5 = 31 / ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(III)Z")
    private final boolean method3761(int arg0, int arg1, int arg2) {
        ++field9256;
        if (arg1 != -385199156) {
            method3762(11, 39, -30, 99, -52, 27);
        }
        int var4 = (arg0 + arg2) * this.field9255 >> 12;
        int var5 = class300.field4511[(1046376 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field9255;
        int var7 = (var6 << 12) / this.field9263;
        int var8 = this.field9260 * var7 >> 12;
        return -arg2 + arg0 < var8 && arg0 - arg2 > -var8;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
    public static final void method3762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9268;
        int var6 = class387.method2374(1, arg1, class738.field10297, class414.field5846);
        int var7 = class387.method2374(1, arg4, class738.field10297, class414.field5846);
        int var8 = class387.method2374(1, arg0, class450.field6463, class285.field4372);
        int var9 = class387.method2374(1, arg5, class450.field6463, class285.field4372);
        int var10 = var6;
        int var11 = -93 / ((71 - arg2) / 53);
        while (var7 >= var10) {
            class382.method2347(var8, class347.field5087[var10], arg3, 7, var9);
            ++var10;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method3763(int arg0) {
        if (arg0 != 0) {
            method3763(115);
        }
        field9270 = null;
        field9269 = null;
        field9258 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field9258[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field9258[var1] = (char) (var1 + -26 + 97);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field9258[var2] = (char) (var2 + -4);
        }
        field9258[62] = '*';
        field9258[63] = '-';
        field9269 = new class185();
        field9271 = true;
    }
}
