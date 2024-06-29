import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class259 extends class84 {

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    private int field4247 = 585;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
    public static int[] field4246 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field4249 = 0;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "B")
    public static byte field4243;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 < 87) {
            this.method91((byte) 87, -87);
        }
        if (arg2 == 0) {
            this.field4247 = arg0.method1126(false);
        }
        ++field4245;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZBIII)V")
    public static final void method1822(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        class98.field1447 = arg4;
        class77.field1105 = arg6;
        ++field4240;
        class84.field1223 = arg0;
        class196.field3181 = arg1;
        class146.field2384 = arg5;
        if (arg2 && class84.field1223 >= 100) {
            class50.field736 = class146.field2384 * 128 + 64;
            class196.field3177 = class77.field1105 * 128 + 64;
            class185.field2986 = class129.method930(class196.field3177, class50.field736, 117, class58.field826) + -class98.field1447;
        }
        class176.field2853 = 2;
        if (arg3 >= -82) {
            method1824((byte) -45);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field4244;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = class26.field301[arg1];
            for (int var5 = 0; ~var5 > ~class20.field221; ++var5) {
                int var6 = class184.field2967[var5];
                if (~var6 < ~this.field4247 && ~var6 > ~(-this.field4247 + 4096) && ~var4 < ~(-this.field4247 + 2048) && var4 < 2048 - -this.field4247) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4247 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field4247 + 2048) > ~var6 && ~var6 > ~(this.field4247 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field4247;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4247 + 2048);
                } else if (var4 >= this.field4247 && ~(4096 - this.field4247) <= ~var4) {
                    if (var6 >= this.field4247 && var6 <= -this.field4247 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field4247);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4247;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4247 + 2048);
                }
            }
        }
        return arg0 > -125 ? null : var3;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lqi;I)V")
    public static final void method1823(class131 arg0, int arg1) {
        ++field4242;
        class131 var2 = class84.method608(arg0, arg1 + 10165);
        if (arg1 == 12) {
            int var3;
            int var4;
            if (var2 == null) {
                var3 = class154.field2543;
                var4 = class23.field265;
            } else {
                var3 = var2.field2167;
                var4 = var2.field2102;
            }
            class178.method1334(var3, arg0, var4, false, (byte) 105);
            class187.method1383(var3, arg0, -13075, var4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static void method1824(byte arg0) {
        field4246 = null;
        int var1 = 122 / ((-27 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method1825(int arg0, String arg1, char arg2) {
        ++field4241;
        int var3 = class171.method1273(arg2, arg1, -500);
        int var4 = 0;
        if (arg0 != -23348) {
            return null;
        } else {
            int var5 = 0;
            String[] var6 = new String[var3 + 1];
            for (int var7 = 0; ~var3 < ~var7; ++var7) {
                int var8;
                for (var8 = var5; ~arg2 != ~arg1.charAt(var8); ++var8) {
                }
                var6[var4++] = arg1.substring(var5, var8);
                var5 = var8 + 1;
            }
            var6[var3] = arg1.substring(var5);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        ++field4248;
        if (!class194.field3128) {
            if (arg0 == -17) {
                class211.field3380 = true;
                if (!class113.field1640) {
                    class151.field2448 += (-class151.field2448 + -12.0F) / 2.0F;
                } else {
                    class123.field1799 = (float) (-16 & (int) class123.field1799 + -17);
                }
                class194.field3128 = true;
            }
        }
    }
}
