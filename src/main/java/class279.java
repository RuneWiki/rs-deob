import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class279 extends class76 {

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    private int field4231;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[I")
    public static int[] field4239 = new int[2];

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field4238 = 100;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4243 = "glow2:";

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1829(int arg0, int arg1, int arg2, int arg3) {
        if (!class152.method996(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class241.method1570(var4 + 1, class290.field4536[arg0][arg1][arg2] + arg3, var5 + 1) && class241.method1570(var4 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class241.method1570(var4 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class241.method1570(var4 + 1, class290.field4536[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public static final void method1830(byte arg0) {
        ++field4233;
        if (arg0 > 92) {
            class39.field466.method67((byte) 109);
            class158.field2276.method67((byte) -119);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)V")
    public final void method167(int arg0, int arg1, byte arg2) {
        ++field4230;
        int var4 = this.field4234 * arg0 >> 12;
        int var5 = this.field4240 * arg0 >> 12;
        if (arg2 < -37) {
            int var6 = this.field4231 * arg1 >> 12;
            int var7 = this.field4237 * arg1 >> 12;
            class206.method1321(var5, var4, var6, super.field906, -24074, var7);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method1831(boolean arg0) {
        field4243 = null;
        if (!arg0) {
            field4239 = null;
        }
        field4239 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)V")
    public static final void method1832(int arg0, int arg1, int arg2) {
        ++field4236;
        if (arg2 == -12654) {
            class66 var3 = class6.method34(13, true, arg1);
            var3.method408(arg2 + 12654);
            var3.field784 = arg0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
    public static final void method1833(byte arg0, int arg1) {
        short var2 = 256;
        ++field4232;
        if (~arg1 < ~var2) {
            arg1 = var2;
        }
        if (~arg1 < -11) {
            arg1 = 10;
        }
        class1.field17 += arg1 * 128;
        if (class1.field17 > class7.field96.length) {
            class1.field17 -= class7.field96.length;
            int var3 = (int) (12.0D * Math.random());
            class44.method280(class61.field734[var3], true);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (-arg1 + var2) * 128;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            int var26 = class58.field685[var4 + var5] + -(class7.field96[class7.field96.length + -1 & class1.field17 + var4] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class58.field685[var4++] = var26;
        }
        for (int var8 = -arg1 + var2; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && var24 > 10 && ~var24 > -119) {
                    class58.field685[var23 + var24] = 255;
                } else {
                    class58.field685[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg1; ++var9) {
            class203.field2875[var9] = class203.field2875[var9 - -arg1];
        }
        if (arg0 <= 43) {
            field4238 = -4;
        }
        for (int var10 = -arg1 + var2; var10 < var2; ++var10) {
            class203.field2875[var10] = (int) (16.0D * Math.sin((double) class294.field4641 / 14.0D) + Math.sin((double) class294.field4641 / 15.0D) * 14.0D + Math.sin((double) class294.field4641 / 16.0D) * 12.0D);
            ++class294.field4641;
        }
        class181.field2573 += arg1;
        int var11 = (arg1 - -(1 & class198.field2819)) / 2;
        if (var11 > 0) {
            for (int var12 = 0; class181.field2573 > var12; ++var12) {
                int var21 = 128 + (int) (Math.random() * 128.0D);
                int var22 = 2 + (int) (124.0D * Math.random());
                class58.field685[var22 - -(var21 << 7)] = 192;
            }
            class181.field2573 = 0;
            for (int var13 = 0; var13 < var2; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (var11 + var20 < 128) {
                        var18 += class58.field685[var19 - -var11 + var20];
                    }
                    if (~(-var11 + var20 - 1) <= -1) {
                        var18 -= class58.field685[var19 + var20 - (var11 + 1)];
                    }
                    if (~var20 <= -1) {
                        class97.field1301[var19 + var20] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var2 < ~var16; ++var16) {
                    int var17 = var16 * 128;
                    if (var2 > var11 + var16) {
                        var15 += class97.field1301[var14 - (-(var11 * 128) + -var17)];
                    }
                    if (-1 - (var11 - var16) >= 0) {
                        var15 -= class97.field1301[-((var11 - -1) * 128) + var14 + var17];
                    }
                    if (var16 >= 0) {
                        class58.field685[var14 + var17] = var15 / (var11 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
    public final void method168(int arg0, int arg1, int arg2) {
        if (arg0 != -31341) {
            this.method167(-56, -111, (byte) -2);
        }
        ++field4244;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIIIIII)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4240 = arg0;
        this.field4231 = arg3;
        this.field4237 = arg1;
        this.field4234 = arg2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        ++field4242;
        int var4 = this.field4240 * arg0 >> 12;
        int var5 = 92 / ((-14 - arg1) / 55);
        int var6 = this.field4237 * arg2 >> 12;
        int var7 = this.field4234 * arg0 >> 12;
        int var8 = this.field4231 * arg2 >> 12;
        class9.method60(super.field910, var6, super.field907, super.field906, var7, 119, var4, var8);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZ)V")
    public static final void method1834(boolean arg0, boolean arg1) {
        ++field4235;
        if (!arg0) {
            if (!arg1 == class270.field3940) {
                class270.field3940 = arg1;
                class283.method1880((byte) 127);
            }
        }
    }
}
