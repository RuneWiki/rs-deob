import java.awt.Container;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class165 extends class68 {

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    private int field2282 = 4096;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    private int field2286 = 4096;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    private int field2289 = 4096;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field2281;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
    public static final void method1089(int arg0, int arg1) {
        ++field2287;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (~arg1 < -11) {
            arg1 = 10;
        }
        class195.field2696 += arg1 * 128;
        if (class283.field4384.length < class195.field2696) {
            class195.field2696 -= class283.field4384.length;
            int var3 = (int) (12.0D * Math.random());
            class92.method597(class238.field3606[var3], (byte) 127);
        }
        int var4 = 0;
        int var5 = (-arg1 + var2) * arg0;
        int var6 = arg1 * 128;
        for (int var7 = 0; ~var7 > ~var5; ++var7) {
            int var26 = class208.field2965[var4 - -var6] - class283.field4384[var4 - -class195.field2696 & class283.field4384.length + -1] * arg1 / 6;
            if (~var26 > -1) {
                var26 = 0;
            }
            class208.field2965[var4++] = var26;
        }
        for (int var8 = -arg1 + var2; var8 < var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && var24 > 10 && ~var24 > -119) {
                    class208.field2965[var23 + var24] = 255;
                } else {
                    class208.field2965[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; ~(var2 - arg1) < ~var9; ++var9) {
            class47.field687[var9] = class47.field687[arg1 + var9];
        }
        for (int var10 = -arg1 + var2; var2 > var10; ++var10) {
            class47.field687[var10] = (int) (Math.sin((double) class56.field809 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class56.field809 / 15.0D) + Math.sin((double) class56.field809 / 16.0D) * 12.0D);
            ++class56.field809;
        }
        class32.field449 += arg1;
        int var11 = ((1 & class52.field740) + arg1) / 2;
        if (var11 > 0) {
            for (int var12 = 0; var12 < class32.field449; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = (int) (128.0D * Math.random()) + 128;
                class208.field2965[(var22 << 7) + var21] = 192;
            }
            class32.field449 = 0;
            for (int var13 = 0; ~var13 > ~var2; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (var20 - -var11 < 128) {
                        var18 += class208.field2965[var20 - (-var11 + -var19)];
                    }
                    if (-var11 + var20 + -1 >= 0) {
                        var18 -= class208.field2965[var20 - (-var19 - (-var11 - 1))];
                    }
                    if (var20 >= 0) {
                        class129.field1828[var20 - -var19] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var16 < var2; ++var16) {
                    int var17 = var16 * 128;
                    if (~(var11 + var16) > ~var2) {
                        var15 += class129.field1828[var11 * 128 + (var14 - -var17)];
                    }
                    if (~(var16 + -1 + -var11) <= -1) {
                        var15 -= class129.field1828[var14 + var17 + -((var11 - -1) * 128)];
                    }
                    if (var16 >= 0) {
                        class208.field2965[var14 - -var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
    public static void method1090(int arg0) {
        if (arg0 != 24688) {
            method1089(-91, 78);
        }
        field2281 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = -44 / ((arg1 - 63) / 61);
        ++field2288;
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var3[0];
            int[] var9 = var5[1];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; ~var12 > ~class89.field1248; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var9[var12];
                if (~var13 == ~var14 && ~var14 == ~var15) {
                    var8[var12] = this.field2286 * var13 >> 12;
                    var11[var12] = this.field2289 * var14 >> 12;
                    var10[var12] = this.field2282 * var15 >> 12;
                } else {
                    var8[var12] = this.field2286;
                    var11[var12] = this.field2289;
                    var10[var12] = this.field2282;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V")
    public static final void method1091(byte arg0) {
        ++field2285;
        Container var1;
        if (class11.field110 != null) {
            var1 = class11.field110;
        } else if (class17.field179 != null) {
            var1 = class17.field179;
        } else {
            var1 = class200.field2784.field3715;
        }
        class33.field501 = var1.getSize().width;
        client.field2194 = var1.getSize().height;
        if (class17.field179 == var1) {
            Insets var2 = class17.field179.getInsets();
            client.field2194 -= var2.top + var2.bottom;
            class33.field501 -= var2.right + var2.left;
        }
        if (class89.method568(-20891) < 2) {
            class275.field4263 = 765;
            class233.field3521 = (class33.field501 + -765) / 2;
            class110.field1531 = 0;
            class197.field2739 = 503;
        } else {
            class233.field3521 = 0;
            class275.field4263 = class33.field501;
            class110.field1531 = 0;
            class197.field2739 = client.field2194;
        }
        class156.field2177.setSize(class275.field4263, class197.field2739);
        if (class17.field179 != var1) {
            class156.field2177.setLocation(class233.field3521, class110.field1531);
        } else {
            Insets var3 = class17.field179.getInsets();
            class156.field2177.setLocation(class233.field3521 + var3.left, var3.top - -class110.field1531);
        }
        int var4 = -90 / ((arg0 - 8) / 59);
        if (~class212.field3193 != 0) {
            class75.method484(true, 2295);
        }
        class84.method524(-1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field2284;
        if (!arg2) {
            this.method91(-77, (byte) 13);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2282 = arg0.method1445(false);
                }
            } else {
                this.field2289 = arg0.method1445(false);
            }
        } else {
            this.field2286 = arg0.method1445(!arg2);
        }
    }
}
