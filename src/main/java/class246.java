import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class246 extends class40 {

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    private int field3670 = 1;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    private int field3672 = 204;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    private int field3667 = 1;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Lbr;")
    public static class223 field3664 = null;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3674 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!q", name = "X", descriptor = "J")
    public static long field3677 = -1L;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
    public static int[] field3676 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "[[[B")
    public static byte[][][] field3678;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIII)V")
    public static final void method1715(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= -98) {
            ++field3675;
            int var5 = 0;
            int var6 = arg3;
            int var7 = -arg3;
            class5.method17(class440.field6288[arg1], arg2 + arg3, arg4, (byte) 91, arg2 - arg3);
            int var8 = -1;
            while (var5 < var6) {
                var8 += 2;
                ++var5;
                var7 += var8;
                if (~var7 <= -1) {
                    --var6;
                    var7 -= var6 << 1;
                    int[] var9 = class440.field6288[arg1 - -var6];
                    int[] var10 = class440.field6288[-var6 + arg1];
                    int var11 = arg2 + var5;
                    int var12 = -var5 + arg2;
                    class5.method17(var9, var11, arg4, (byte) 67, var12);
                    class5.method17(var10, var11, arg4, (byte) 121, var12);
                }
                int var13 = arg2 + var6;
                int var14 = -var6 + arg2;
                int[] var15 = class440.field6288[arg1 + var5];
                int[] var16 = class440.field6288[-var5 + arg1];
                class5.method17(var15, var13, arg4, (byte) 82, var14);
                class5.method17(var16, var13, arg4, (byte) 85, var14);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3672 = arg2.method798(false);
                }
            } else {
                this.field3670 = arg2.method837(true);
            }
        } else {
            this.field3667 = arg2.method837(true);
        }
        ++field3665;
        if (arg1 <= 79) {
            this.method44((byte) -53, -1);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)V")
    public static final void method1716(byte arg0, int arg1) {
        ++field3669;
        if (arg0 > -41) {
            method1717(-44, -49, 16, -67, -126, 118, 66, 64);
        }
        class1.field2.method91(4, arg1);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3668;
        if (~arg2 <= ~class408.field5789 && ~class231.field3415 <= ~arg4 && ~class245.field3659 >= ~arg1 && ~arg3 >= ~class240.field3547) {
            class408.method2574(arg4, arg6, arg5, arg3, -128, arg7, arg2, arg1);
        } else {
            class80.method477(arg7, arg2, arg5, arg4, arg1, arg3, 0, arg6);
        }
        if (arg0 != 1) {
            method1715((byte) -115, 56, -100, 112, -93);
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(B)V")
    public static void method1718(byte arg0) {
        field3678 = null;
        field3674 = null;
        field3664 = null;
        field3676 = null;
        if (arg0 != 110) {
            field3664 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field3666;
        if (arg0 > -20) {
            field3678 = null;
        }
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            for (int var4 = 0; class410.field5886 > var4; ++var4) {
                int var5 = class9.field124[var4];
                int var6 = class86.field1123[arg1];
                int var7 = this.field3667 * var5 >> 12;
                int var8 = this.field3670 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3667) * this.field3667;
                int var10 = var6 % (4096 / this.field3670) * this.field3670;
                if (this.field3672 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field3672 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3672 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1719(int arg0, String arg1) {
        ++field3673;
        if (arg1 != null) {
            if ((class206.field2897 < 100 || class282.field4061) && ~class206.field2897 > -201) {
                String var2 = class134.method1029(arg1, (byte) 43);
                if (var2 != null) {
                    for (int var3 = 0; class206.field2897 > var3; ++var3) {
                        String var8 = class134.method1029(class56.field743[var3], (byte) 60);
                        if (var8 != null && var8.equals(var2)) {
                            class154.method1135(arg1 + class46.field613.method2284((byte) -73, class309.field4497), (byte) -123);
                            return;
                        }
                        if (class366.field5231[var3] != null) {
                            String var9 = class134.method1029(class366.field5231[var3], (byte) 59);
                            if (var9 != null && var9.equals(var2)) {
                                class154.method1135(arg1 + class46.field613.method2284((byte) -47, class309.field4497), (byte) -110);
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class417.field5994 < ~var4; ++var4) {
                        String var6 = class134.method1029(class137.field2109[var4], (byte) 100);
                        if (var6 != null && var6.equals(var2)) {
                            class154.method1135(class231.field3421.method2284((byte) 109, class309.field4497) + arg1 + class430.field6116.method2284((byte) -98, class309.field4497), (byte) -123);
                            return;
                        }
                        if (class434.field6200[var4] != null) {
                            String var7 = class134.method1029(class434.field6200[var4], (byte) 99);
                            if (var7 != null && var7.equals(var2)) {
                                class154.method1135(class231.field3421.method2284((byte) -122, class309.field4497) + arg1 + class430.field6116.method2284((byte) -127, class309.field4497), (byte) -120);
                                return;
                            }
                        }
                    }
                    int var5 = 51 / ((50 - arg0) / 36);
                    if (class134.method1029(class181.field2555.field1790, (byte) 92).equals(var2)) {
                        class154.method1135(class194.field2800.method2284((byte) 94, class309.field4497), (byte) -110);
                    } else {
                        ++class415.field5921;
                        class407.field5761.method2048(2040, 174);
                        class407.field5761.method831(class276.method1873(true, arg1), (byte) 123);
                        class407.field5761.method807((byte) 124, arg1);
                    }
                }
            } else {
                class154.method1135(class145.field2181.method2284((byte) -84, class309.field4497), (byte) -121);
            }
        }
    }
}
