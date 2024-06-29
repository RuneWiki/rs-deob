import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class218 extends class398 {

    @OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
    private int field2892 = -1;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "Z")
    public static boolean field2881 = false;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2883 = " is already on your ignore list.";

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2882 = "Loading title screen - ";

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2884 = "Cancel";

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!jo", name = "V", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!jo", name = "X", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!jo", name = "Y", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!jo", name = "Z", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "[I")
    private int[] field2887;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 3)
    public final void method1273(int arg0) {
        if (arg0 >= -31) {
            method1276(126, -26, true);
        }
        super.method1273(-106);
        ++field2890;
        this.field2887 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lnj;II)V", line = 22)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field2888;
        if (arg1 == 0) {
            this.field2892 = arg0.method1343(255);
        }
        if (arg2 != -13132) {
            this.method1273(-123);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V", line = 37)
    public final void method1274(int arg0, int arg1, int arg2) {
        ++field2880;
        super.method1274(arg0, arg1, arg2);
        if (~this.field2892 <= -1) {
            int var4 = !class198.field2638.method186(this.field2892, arg2 ^ 9610).field6509 ? 128 : 64;
            this.field2887 = class198.field2638.method181(var4, (byte) 100, false, var4, this.field2892, 1.0F);
            this.field2895 = var4;
            this.field2894 = var4;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V", line = 58)
    public static void method1275(byte arg0) {
        field2882 = null;
        field2884 = null;
        field2883 = null;
        if (arg0 != 67) {
            method1277(-59, -116, 117, 7, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZ)V", line = 70)
    public static final void method1276(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field2879;
            class263 var3 = class47.method337(1, 0, arg0);
            var3.method1807((byte) -121);
            var3.field3813 = arg1;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 85)
    public class218() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIB)I", line = 91)
    public static final int method1277(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field2891;
        if (arg4 != -36) {
            return 44;
        } else {
            int var5 = 65536 - class117.field1636[arg3 * 8192 / arg2] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)Lwm;", line = 114)
    public static final class298 method1278(int arg0, int arg1, int arg2, int arg3) {
        ++field2885;
        class254 var4 = class213.field2852[arg2][arg0][arg3];
        if (var4 == null) {
            return null;
        } else {
            class298 var5 = null;
            int var6 = arg1;
            for (class328 var7 = var4.field3515; var7 != null; var7 = var7.field4783) {
                class55 var8 = var7.field4785;
                if (var8 instanceof class298) {
                    class298 var9 = (class298) var8;
                    int var10 = var9.method168(-119) * 64 - 64 + 60;
                    int var11 = var9.field740 - var10 >> 7;
                    int var12 = var9.field734 - var10 >> 7;
                    int var13 = var9.field740 + var10 >> 7;
                    int var14 = var9.field734 + var10 >> 7;
                    if (arg0 >= var11 && ~var12 >= ~arg3 && ~var13 <= ~arg0 && arg3 <= var14) {
                        int var15 = (var13 - arg0 + 1) * (var14 - arg3 + 1);
                        if (var6 < var15) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)I", line = 184)
    public final int method1279(boolean arg0) {
        if (arg0) {
            method1277(33, -102, 28, 13, (byte) -38);
        }
        ++field2893;
        return this.field2892;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I", line = 195)
    public final int[][] method99(int arg0, int arg1) {
        ++field2889;
        if (arg1 != 2) {
            this.field2892 = -63;
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int var4 = this.field2894 * (~class329.field4798 != ~this.field2895 ? this.field2895 * arg0 / class329.field4798 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class140.field1922 == ~this.field2894) {
                for (int var8 = 0; ~class140.field1922 < ~var8; ++var8) {
                    int var9 = this.field2887[var4++];
                    var7[var8] = class183.method1117(4080, var9 << 4);
                    var6[var8] = class183.method1117(var9, 65280) >> 4;
                    var5[var8] = class183.method1117(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class140.field1922 > var10; ++var10) {
                    int var11 = this.field2894 * var10 / class140.field1922;
                    int var12 = this.field2887[var4 + var11];
                    var7[var10] = class183.method1117(var12 << 4, 4080);
                    var6[var10] = class183.method1117(4080, var12 >> 4);
                    var5[var10] = class183.method1117(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
