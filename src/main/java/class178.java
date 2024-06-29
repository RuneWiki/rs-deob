import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class178 extends class512 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field2516;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "F")
    public static float field2513;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Let;I)[Lic;")
    public static final class491[] method1248(class419 arg0, int arg1) {
        ++field2509;
        if (!arg0.method2577((byte) -113)) {
            return new class491[0];
        } else {
            class449 var2 = arg0.method2568((byte) -80);
            while (~var2.field6617 == -1) {
                class213.method1462(10L, arg1 + -1034652610);
            }
            if (var2.field6617 == 2) {
                return new class491[0];
            } else {
                int[] var3 = (int[]) var2.field6613;
                class491[] var4 = new class491[var3.length >> 2];
                for (int var5 = 0; var4.length > var5; ++var5) {
                    class491 var6 = new class491();
                    var4[var5] = var6;
                    var6.field7197 = var3[var5 << 2];
                    var6.field7198 = var3[(var5 << 2) - -1];
                    var6.field7201 = var3[(var5 << 2) - -2];
                    var6.field7200 = var3[(var5 << 2) + 3];
                }
                if (arg1 != 1034647426) {
                    field2512 = 108;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public final void method1249(int arg0, int arg1, int arg2) {
        ++field2519;
        int var4 = this.field2516 * arg2 >> 12;
        if (arg0 != 24245) {
            field2513 = -0.5029784F;
        }
        int var5 = this.field2510 * arg2 >> 12;
        int var6 = this.field2518 * arg1 >> 12;
        int var7 = this.field2515 * arg1 >> 12;
        class139.method1045(var5, super.field7550, super.field7552, var7, (byte) -126, var4, var6);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZIIB)I")
    public static final int method1250(boolean arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        ++field2514;
        class110 var5 = class455.method2749(99, arg0, arg2);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            if (arg4 < 54) {
                return 112;
            } else {
                for (int var7 = 0; ~var5.field1558.length < ~var7; ++var7) {
                    if (var5.field1558[var7] >= 0 && ~var5.field1558[var7] > ~class270.field3995.field13) {
                        class72 var8 = class270.field3995.method6(22883, var5.field1558[var7]);
                        int var9 = var8.method679(arg3, -114, class215.field3100.method2740((byte) 124, arg3).field4127);
                        if (!arg1) {
                            var6 += var9;
                        } else {
                            var6 += var5.field1555[var7] * var9;
                        }
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
    public final void method1251(int arg0, int arg1, int arg2) {
        ++field2520;
        int var4 = this.field2516 * arg2 >> 12;
        int var5 = this.field2510 * arg2 >> 12;
        if (arg1 != 4) {
            method1250(false, false, -86, -81, (byte) 85);
        }
        int var6 = this.field2518 * arg0 >> 12;
        int var7 = this.field2515 * arg0 >> 12;
        class2.method12(var7, var4, super.field7554, var5, var6, (byte) 110);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2510 = arg2;
        this.field2518 = arg1;
        this.field2516 = arg0;
        this.field2515 = arg3;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V")
    public final void method1252(int arg0, int arg1, int arg2) {
        ++field2511;
        int var4 = this.field2516 * arg2 >> 12;
        int var5 = this.field2510 * arg2 >> 12;
        int var6 = this.field2518 * arg1 >> 12;
        int var7 = this.field2515 * arg1 >> 12;
        class501.method3001(var6, super.field7550, var5, -32, var4, super.field7552, var7, super.field7554);
        if (arg0 > -78) {
            this.field2516 = -11;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)Ltb;")
    public static final class274 method1253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2517;
        if (arg6 != -1101853054) {
            return null;
        } else {
            long var7 = (long) arg2 * 76724863L ^ (long) arg0 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg3 * 67481L ^ (long) arg5 * 97549L ^ (long) arg1 * 475427L;
            class274 var9 = (class274) class402.field5970.method1115(var7, (byte) 58);
            if (var9 != null) {
                return var9;
            } else {
                class274 var10 = class326.field4576.method334(arg3, arg5, arg1, arg4, arg0, arg2);
                class402.field5970.method1107(1, var7, var10);
                return var10;
            }
        }
    }
}
