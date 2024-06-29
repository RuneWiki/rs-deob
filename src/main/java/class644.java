import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class644 extends class595 {

    @OriginalMember(owner = "client!f", name = "x", descriptor = "F")
    private float field9358 = 0.0F;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lpaa;")
    private class534 field9348;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field9352 = 0;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Lcba;")
    public static class471 field9359 = new class471(80, -1);

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field9360 = -1;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILbe;IIIII)V")
    public static final void method3711(int arg0, class33 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -9275) {
            method3711(81, (class33) null, 22, 91, -60, 11, 1);
        }
        class375.method2220(arg6, arg0, arg1.field6037, 22976, arg3, 0, arg1.field6029, arg1.field6035, arg2, arg4);
        ++field9353;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3712(int arg0, byte arg1, int arg2) {
        if (arg1 != 7) {
            method3712(41, (byte) 57, -105);
        }
        ++field9345;
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        if (arg0 > -119) {
            field9359 = null;
        }
        ++field9351;
        return this.field9348.method3067(88);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 <= -114) {
            ++field9354;
            super.field8612.method2296(0, 1);
            if (~(128 & arg1) == -1) {
                if (~(arg0 & 1) == -2) {
                    if (this.field9348.field7467) {
                        this.field9358 = (float) (super.field8612.field5401 % 4000) / 4000.0F;
                        super.field8612.method2267(2, this.field9348.field7469);
                    } else {
                        int var4 = super.field8612.field5401 % 4000 * 16 / 4000;
                        super.field8612.method2267(2, this.field9348.field7468[var4]);
                    }
                } else if (!this.field9348.field7467) {
                    super.field8612.method2267(2, this.field9348.field7468[0]);
                } else {
                    super.field8612.method2267(2, this.field9348.field7469);
                }
            } else {
                super.field8612.method2267(2, (class445) null);
            }
            super.field8612.method2296(0, 0);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method3713(int arg0) {
        field9359 = null;
        if (arg0 != 1) {
            method3711(39, (class33) null, -62, 10, -17, 119, 68);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lgn;[[BI)V")
    public static final void method3714(class600 arg0, byte[][] arg1, int arg2) {
        ++field9347;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        if (arg2 < -118) {
            for (int var5 = 0; ~var4 < ~var5; ++var5) {
                byte[] var10 = arg1[var5];
                if (var10 != null) {
                    class11 var11 = new class11(var10);
                    int var12 = class183.field2585[var5] >> 8;
                    int var13 = 255 & class183.field2585[var5];
                    int var14 = var12 * 64 + -class519.field7304;
                    int var15 = var13 * 64 + -class6.field80;
                    class184.method1146(125);
                    arg0.method550(class6.field80, var14, var11, var15, class428.field6075, class519.field7304, false);
                    arg0.method3532((byte) 76, var15, var14, class69.field1165, var11, var3);
                    if (!arg0.field1124 && class88.field1390 / 8 == var12 && class193.field2733 / 8 == var13 && ~var3[0] != 0) {
                        class538.field7520 = class303.field4141.method2357(class358.field4823, var3[3], var3[1], var3[2], 4, var3[0]);
                        class615.field8827 = var3[4];
                    }
                }
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = (class183.field2585[var6] >> 8) * 64 - class519.field7304;
                int var8 = (255 & class183.field2585[var6]) * 64 + -class6.field80;
                byte[] var9 = arg1[var6];
                if (var9 == null && class193.field2733 < 800) {
                    class184.method1146(125);
                    arg0.method557(64, 68, var7, var8, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V")
    public static final void method3715(byte arg0) {
        ++field9346;
        for (class391 var1 = (class391) class456.field6423.method456((byte) -65); var1 != null; var1 = (class391) class456.field6423.method460((byte) 108)) {
            class77 var2 = var1.field5529;
            if (class405.field5763 > var2.field1249) {
                var1.method1117(0);
                var2.method593((byte) -9);
            } else if (~class405.field5763 <= ~var2.field1214) {
                if (~var2.field1232 < -1) {
                    class576 var3 = (class576) class278.field3837.method1242(0, (long) (var2.field1232 + -1));
                    if (var3 != null) {
                        class109 var4 = var3.field7929;
                        if (~var4.field6037 <= -1 && ~(class32.field513 * 128) < ~var4.field6037 && var4.field6029 >= 0 && ~(class611.field8786 * 128) < ~var4.field6029) {
                            var2.method590(class405.field5763, var4.field6037, class183.method1144(96, var4.field6037, var4.field6029, var2.field6035) + -var2.field1241, var4.field6029, 32355);
                        }
                    }
                }
                if (~var2.field1232 > -1) {
                    int var5 = -var2.field1232 + -1;
                    class188 var6;
                    if (class97.field1472 == var5) {
                        var6 = class645.field9372;
                    } else {
                        var6 = class349.field4696[var5];
                    }
                    if (var6 != null && ~var6.field6037 <= -1 && var6.field6037 < class32.field513 * 128 && ~var6.field6029 <= -1 && ~(class611.field8786 * 128) < ~var6.field6029) {
                        var2.method590(class405.field5763, var6.field6037, class183.method1144(102, var6.field6037, var6.field6029, var2.field6035) - var2.field1241, var6.field6029, 32355);
                    }
                }
                var2.method592(2, class64.field1097);
                class108.method761(var2, true);
            }
        }
        if (arg0 >= -35) {
            field9352 = 96;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            super.field8612.method2267(2, arg0);
            ++field9355;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final void method1486(int arg0) {
        ++field9357;
        if (arg0 < 113) {
            this.method298((byte) -84);
        }
        if (~super.field8612.method2302((byte) 51) == -1) {
            class557 var2 = super.field8612.method2331((byte) -31);
            super.field8612.method2296(0, 1);
            class557 var3 = super.field8612.method2289(-128);
            var3.method1049(var2);
            var3.method3161(0.125F, 1.0F, -84, 0.125F);
            var3.method3180(0.0F, this.field9358, 0.0F, 10);
            super.field8612.method2299(92, class561.field7774);
            super.field8612.method2296(0, 0);
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        super.field8612.method2296(arg0 ^ -60, 1);
        ++field9356;
        super.field8612.method2313(class167.field2417, -64, class167.field2417);
        super.field8612.method2315(class583.field8185, 0, 8);
        if (arg0 == -60) {
            super.field8612.method2326(arg0 + 160, 0, class583.field8185);
            super.field8612.method1594(-22276, 1);
            super.field8612.method2267(2, (class445) null);
            super.field8612.method2296(0, 0);
            super.field8612.method2326(84, 0, class583.field8185);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lwr;Lpaa;)V")
    public class644(class388 arg0, class534 arg1) {
        super(arg0);
        this.field9348 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        super.field8612.method2296(0, 1);
        ++field9350;
        super.field8612.method2313(class137.field2155, 101, class205.field2890);
        super.field8612.method1641(arg1, false, 0, class583.field8185, 0);
        super.field8612.method2326(100, 0, class459.field6466);
        super.field8612.method1594(-22276, 0);
        super.field8612.method2296(0, 0);
        super.field8612.method2309(-16777216, -9683);
        super.field8612.method2326(88, 0, class610.field8770);
        this.method1486(120);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        ++field9349;
        super.field8612.method2313(class137.field2155, 90, class167.field2417);
        if (arg0 != -1) {
            field9352 = 115;
        }
    }
}
