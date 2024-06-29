import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class300 {

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field4456 = -1;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Z")
    public boolean field4460 = true;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    private int field4466;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Lcn;")
    private class14 field4446;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "Lvd;")
    private class258 field4461;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    private int field4465;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Lud;")
    private class94 field4458;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Loj;")
    private class416 field4468;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "Lev;")
    private class448 field4454;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4450 = -1;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lfp;")
    public static class437 field4455 = new class437(6, 0, 4, 2);

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "Lkk;")
    public static class116 field4467 = null;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method1861(int arg0) {
        class382 var1 = class169.field2484;
        synchronized (class169.field2484) {
            if (arg0 <= 103) {
                field4455 = null;
            }
            class169.field2484.method2293(false);
        }
        field4452++;
        class382 var2 = class146.field2199;
        synchronized (class146.field2199) {
            class146.field2199.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BIIB)V")
    public final void method1862(byte[] arg0, int arg1, int arg2, byte arg3) {
        field4453++;
        this.field4454.method1201((byte) -84, arg1, arg2 * this.field4461.method1588(arg1, (byte) 102), arg0);
        this.method1868(this.field4454, arg2, -86);
        if (arg3 != -110) {
            this.field4448 = -96;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            field4467 = null;
        }
        field4464++;
        for (int var6 = arg4; var6 <= arg0; var6++) {
            class94.method740(class306.field4574[var6], arg1, arg2, arg3, false);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V")
    public static final void method1864(long arg0, int arg1) {
        field4462++;
        class43.field559.field6830 = 0;
        class43.field559.method2754(class445.field6556.field1866, 5574);
        class43.field559.method2718(arg0, -98);
        class43.field559.method2754(class30.field430, 5574);
        class510.field7495 = 0;
        class151.field2288 = -3;
        class409.field6167 = 1;
        if (arg1 <= 71) {
            method1861(-107);
        }
        class488.field7281 = 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLgo;)Ljava/lang/String;")
    public static final String method1865(boolean arg0, class310 arg1) {
        field4449++;
        if (arg0) {
            field4450 = -9;
        }
        if (client.method3039(arg1).method2402(20992) == 0) {
            return null;
        } else if (arg1.field4689 == null || arg1.field4689.trim().length() == 0) {
            return class418.field6270 ? "Hidden-use" : null;
        } else {
            return arg1.field4689;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method1866(int arg0) {
        field4459++;
        if (arg0 != 0) {
            this.field4460 = false;
        }
        this.method1868(this.field4468, this.field4465, -95);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public static final void method1867(int arg0) {
        field4451++;
        class49.field630.method1880(arg0);
        class45.field591.method46((byte) -77);
        if (class508.field7465 != null) {
            class508.field7465.method2662(-114, class357.field5469);
        }
        class197.field2894.method2797(false);
        class357.field5469.setBackground(Color.black);
        class65.field884 = -1;
        class49.field630 = class83.method670(class357.field5469, arg0 ^ 0x6575);
        class45.field591 = class7.method30((byte) 117, class357.field5469, true);
        if (class508.field7465 != null) {
            class508.field7465.method2665((byte) 11, class357.field5469);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Loj;II)V")
    private final void method1868(class416 arg0, int arg1, int arg2) {
        field4447++;
        if (arg1 != 0 && arg2 < -77) {
            this.method1871(false);
            this.field4461.method1546(-2, this.field4458);
            this.field4461.method1547(23988, 4, arg0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public static final void method1869(byte arg0) {
        int var1 = -20 / ((42 - arg0) / 45);
        field4457++;
        class151.method1090(false, (byte) 83);
        if (class317.field4892 >= 0 && class317.field4892 != 0) {
            class264.method1650(class317.field4892, -69);
            class317.field4892 = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4467 = null;
        field4455 = null;
        int var1 = 110 / ((-arg0 - 54) / 42);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
    private final void method1871(boolean arg0) {
        field4463++;
        if (!this.field4460) {
            return;
        }
        this.field4460 = arg0;
        byte[] var2 = this.field4446.field181;
        byte[] var3 = this.field4461.field3849;
        int var4 = 0;
        int var5 = this.field4446.field186;
        int var6 = this.field4446.field186 * this.field4448 + this.field4466;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4458 != null && this.field4456 == var4) {
            this.field4460 = false;
            return;
        }
        this.field4456 = var4;
        int var8 = 0;
        int var9 = this.field4448 * var5 + this.field4466;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field4446.field186 - 128;
        }
        if (this.field4458 == null) {
            this.field4458 = new class94(this.field4461, 3553, 6406, 128, 128, false, this.field4461.field3849, 6406, false);
            this.field4458.method741(false, false, (byte) -92);
            this.field4458.method1693(true, (byte) -101);
        } else {
            this.field4458.method735(6406, 3317, 0, this.field4461.field3849, 0, 0, 128, 0, false, 128);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lvd;Lcn;Lne;IIIII)V")
    public class300(class258 arg0, class14 arg1, class138 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4448 = arg7;
        this.field4466 = arg6;
        this.field4446 = arg1;
        this.field4461 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field5198 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2088[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4465 = var10;
        if (var10 <= 0) {
            this.field4458 = null;
        } else {
            class468 var14 = new class468(var10 * 2);
            if (this.field4461.field3821) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field5198 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2088[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2777((byte) 74, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field5198 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2088[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2760(true, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4468 = this.field4461.method1565(5123, var14.field6868, false, var14.field6830, -6407);
            this.field4454 = new class448(this.field4461, 5123, null, 1);
        }
    }
}
