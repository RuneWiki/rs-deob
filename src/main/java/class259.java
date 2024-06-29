import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class259 extends class182 {

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    private int field4346 = 585;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "Lbb;")
    public static class49 field4351 = new class49();

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[I")
    public static int[] field4354 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "Z")
    public static boolean field4357 = true;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field4359 = 0;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "Z")
    public static boolean field4360 = false;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "Luj;")
    public static class132 field4355 = new class132(16);

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "Laj;")
    public static class151 field4358;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZJZLjava/lang/String;IZILjava/lang/String;II)V")
    public static final void method1850(int arg0, boolean arg1, long arg2, boolean arg3, String arg4, int arg5, boolean arg6, int arg7, String arg8, int arg9, int arg10) {
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        ++field4353;
        class249 var14 = new class249(128);
        var14.method1780(10, arg7 ^ 71);
        var14.method1771((arg1 ? 4 : 0) | (arg6 ? 2 : 0) | (!arg3 ? 0 : 1), (byte) 30);
        var14.method1795(arg2, (byte) -59);
        var14.method1811(var12[0], (byte) 51);
        var14.method1786(-25149, arg8);
        var14.method1811(var12[1], (byte) 51);
        var14.method1771(class105.field1736, (byte) 30);
        var14.method1780(arg0, arg7 + 88);
        var14.method1780(arg10, 62);
        var14.method1811(var12[arg7], (byte) 51);
        var14.method1771(arg5, (byte) 30);
        var14.method1771(arg9, (byte) 30);
        var14.method1811(var12[3], (byte) 51);
        var14.method1775((byte) 35, class100.field1585, class219.field3691);
        class249 var15 = new class249(350);
        var15.method1786(-25149, arg4);
        int var16 = -(class73.method517(-1, arg4) % 8) + 8;
        for (int var17 = 0; ~var16 < ~var17; ++var17) {
            var15.method1780((int) (Math.random() * 255.0D), 92);
        }
        var15.method1799(var12, 6437);
        class236.field3980.field4160 = 0;
        class236.field3980.method1780(22, 73);
        class236.field3980.method1771(var14.field4160 - -var15.field4160 + 2, (byte) 30);
        class236.field3980.method1771(554, (byte) 30);
        class236.field3980.method1784(var14.field4182, false, var14.field4160, 0);
        class236.field3980.method1784(var15.field4182, false, var15.field4160, 0);
        class299.field4879 = 0;
        class70.field1165 = 1;
        class273.field4566 = 0;
        class10.field184 = -3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            this.method155(false, (class249) null, 23);
        }
        ++field4352;
        if (arg2 == 0) {
            this.field4346 = arg1.method1821((byte) 51);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class171.field2773 > -101) {
            class186.method1348(27819);
        }
        ++field4349;
        class211.method1488(arg2, arg1, arg0 + arg2, arg1 + arg4);
        if (class171.field2773 < 100) {
            byte var5 = 20;
            int var6 = arg2 - -(arg0 / 2);
            int var7 = arg1 - (-(arg4 / 2) + 18) - var5;
            class211.method1483(arg2, arg1, arg0, arg4, 0);
            class211.method1477(var6 - 152, var7, 304, 34, 9179409);
            class211.method1483(var6 + -150, var7 - -2, class171.field2773 * 3, 30, 9179409);
            class183.field2930.method1222(class138.field2261, var6, var7 - -var5, 16777215, -1);
        } else {
            class167.field2703 = class219.field3701 - (int) ((float) arg4 / class148.field2442);
            class250.field4233 = (int) ((float) (arg4 * 2) / class148.field2442);
            int var8 = class122.field2044 - (int) ((float) arg0 / class148.field2442);
            class296.field4851 = -((int) ((float) arg0 / class148.field2442)) + class122.field2044;
            class104.field1679 = (int) ((float) (arg0 * 2) / class148.field2442);
            int var9 = (int) ((float) arg0 / class148.field2442) + class122.field2044;
            int var10 = -((int) ((float) arg4 / class148.field2442)) + class219.field3701;
            int var11 = (int) ((float) arg4 / class148.field2442) + class219.field3701;
            class148.method1100(var8, var10, var9, var11, arg2, arg1, arg2 - -arg0, arg1 + 1 - -arg4);
            class148.method1095();
            class49 var12 = class148.method1096();
            class145.method1073((byte) -62, 0, 0, var12);
            if (arg3 < class118.field1984) {
                --class146.field2401;
                if (~class146.field2401 == -1) {
                    class146.field2401 = 20;
                    --class118.field1984;
                }
            }
            if (class121.field2032) {
                int var13 = arg0 + arg2 + -5;
                int var14 = arg4 + -8 + arg1;
                int var15 = 16776960;
                class169.field2732.method1212("Fps:" + class306.field4957, var13, var14, 16776960, -1);
                int var18 = var14 - 15;
                Runtime var16 = Runtime.getRuntime();
                int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
                if (~var17 < -65537) {
                    var15 = 16711680;
                }
                class169.field2732.method1212("Mem:" + var17 + "k", var13, var18, var15, -1);
                var14 = var18 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -52);
        if (arg0) {
            return null;
        } else {
            if (super.field2911.field287) {
                int var4 = class66.field1112[arg1];
                for (int var5 = 0; var5 < class4.field116; ++var5) {
                    int var6 = class207.field3415[var5];
                    if (~var6 < ~this.field4346 && ~(-this.field4346 + 4096) < ~var6 && var4 > 2048 - this.field4346 && ~(this.field4346 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field4346 + 2048);
                        var3[var5] = 4096 - var10;
                    } else if (-this.field4346 + 2048 < var6 && ~(2048 - -this.field4346) < ~var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field4346;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field4346);
                    } else if (var4 >= this.field4346 && var4 <= -this.field4346 + 4096) {
                        if (~this.field4346 >= ~var6 && var6 <= -this.field4346 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 > -1 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field4346 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field4346;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field4346 + 2048);
                    }
                }
            }
            ++field4347;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Laj;I)V")
    public static final void method1852(class151 arg0, int arg1) {
        ++field4350;
        if (arg1 != 2048) {
            method1851(60, -63, -21, 48, 0);
        }
        class109.field1789 = arg0.method1121(arg1 + -2046, "titlebg");
        class260.field4374 = arg0.method1121(2, "logo");
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static void method1853(byte arg0) {
        int var1 = 50 % ((arg0 - -76) / 48);
        field4354 = null;
        field4351 = null;
        field4355 = null;
        field4358 = null;
    }
}
