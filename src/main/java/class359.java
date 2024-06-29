import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class359 extends class371 implements class223 {

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Z")
    private boolean field4956;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "B")
    private byte field4960;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "B")
    private byte field4973;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "S")
    private short field4974;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Z")
    private boolean field4958;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "B")
    private byte field4965;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Z")
    private boolean field4955;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Lts;")
    private class116 field4951;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Llb;")
    private class210 field4954;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field4957 = 3;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lhc;")
    public static class368 field4953 = new class368("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!md", name = "db", descriptor = "F")
    public static float field4972 = 0.0F;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "Lof;")
    public static class423 field4970;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "[I")
    public static int[] field4975;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(Z)V")
    public static void method2214(boolean arg0) {
        field4953 = null;
        if (arg0) {
            field4970 = null;
            field4975 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lea;Lp;IIIIZIIIII)V")
    public class359(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class435.method2676(arg10, arg11, 10853));
        super.field5135 = (short) arg3;
        this.field4956 = arg1.field6297 != 0 && !arg6;
        this.field4960 = (byte) arg11;
        this.field4973 = (byte) arg10;
        this.field4974 = (short) arg1.field6323;
        this.field4958 = arg6;
        this.field4965 = (byte) arg2;
        super.field5137 = (short) arg5;
        this.field4955 = arg0.method218() && arg1.field6332 && !this.field4958 && ~class228.field3188 != -1;
        class274 var13 = this.method2215(this.field4955, arg0, 9901, 1024);
        if (var13 != null) {
            this.field4951 = var13.field3748;
            this.field4954 = var13.field3745;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLea;II)Lto;")
    private final class274 method2215(boolean arg0, class58 arg1, int arg2, int arg3) {
        ++field4949;
        class447 var5 = class133.method996((byte) -19, 65535 & this.field4974);
        if (arg2 != 9901) {
            this.field4955 = false;
        }
        class323 var6;
        class323 var7;
        if (this.field4958) {
            var6 = class82.field1130[0];
            var7 = class125.field1879[this.field4965];
        } else {
            if (this.field4965 >= 3) {
                var6 = null;
            } else {
                var6 = class82.field1130[this.field4965 + 1];
            }
            var7 = class82.field1130[this.field4965];
        }
        return var5.method2761(var7, arg1, this.field4960, -783202211, arg0, this.field4973, super.field5144, arg3, super.field5137, super.field5135, var6);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILal;Lal;)V")
    public static final void method2216(int arg0, int arg1, int arg2, class371 arg3, class371 arg4) {
        if (class341.field4617[arg0][arg1][arg2] == null) {
            class72.method567(arg0, arg1, arg2);
        }
        class341.field4617[arg0][arg1][arg2].field861 = arg3;
        class341.field4617[arg0][arg1][arg2].field859 = arg4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILrg;)V")
    public static final void method2217(int arg0, class366 arg1) {
        ++field4968;
        byte[] var2 = new byte[24];
        if (class244.field3441 != null) {
            try {
                class244.field3441.method802(-124, 0L);
                class244.field3441.method803(arg0 ^ 127, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2301(24, var2, (byte) 69, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lea;BI)Lts;")
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        ++field4966;
        if (arg1 != -63) {
            this.method698((byte) 11, (class58) null);
        }
        return this.method2219((byte) -22, arg2, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILea;)V")
    public final void method704(int arg0, class58 arg1) {
        if (arg0 != -29096) {
            this.field4956 = false;
        }
        ++field4963;
        Object var3 = null;
        class210 var5;
        if (this.field4954 == null && this.field4955) {
            class274 var4 = this.method2215(true, arg1, 9901, 131072);
            var5 = var4 != null ? var4.field3745 : null;
        } else {
            var5 = this.field4954;
            this.field4954 = null;
        }
        if (var5 != null) {
            class383.method2369(var5, this.field4965, super.field5135, super.field5137, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            field4975 = null;
        }
        ++field4947;
        class116 var5 = this.method2219((byte) -22, 65536, arg2);
        if (var5 != null) {
            class309 var6 = arg2.method210();
            var6.method1866(super.field5135, super.field5144, super.field5137);
            return var5.method898(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)I")
    public final int method695(int arg0) {
        ++field4964;
        if (arg0 != 898) {
            field4957 = 50;
        }
        return this.field4973;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field4952;
        if (this.field4951 == null) {
            return null;
        } else {
            class309 var3 = arg1.method210();
            var3.method1866(super.field5139 + super.field5135, super.field5144, super.field5143 + super.field5137);
            class450 var4 = null;
            if (this.field4956) {
                var4 = class61.method494(-128, 1);
            }
            this.field4951.method896(var3, var4 != null ? var4.field6451[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method708(int arg0) {
        ++field4948;
        if (arg0 != 26389) {
            this.field4956 = true;
        }
        if (this.field4951 != null) {
            this.field4951.method901();
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
    public static final void method2218(byte arg0) {
        ++field4959;
        if (class21.field273 == null) {
            class21.field273 = new int[65536];
            double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
            if (arg0 <= 126) {
                field4975 = null;
            }
            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = (double) (var3 >> 10 & 63) / 64.0D + 0.0078125D;
                double var6 = (double) (7 & var3 >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 - 0.3333333333333333D;
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (!(var4 * 3.0D < 2.0D)) {
                        var12 = var18;
                    } else {
                        var12 = (var16 - var18) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (-var18 + var16) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = (-var18 + var16) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                    } else {
                        var10 = var18;
                    }
                    if (var24 * 6.0D < 1.0D) {
                        var14 = (var16 - var18) * 6.0D * var24 + var18;
                    } else if (var24 * 2.0D < 1.0D) {
                        var14 = var16;
                    } else if (var24 * 3.0D < 2.0D) {
                        var14 = (0.6666666666666666D - var24) * (-var18 + var16) * 6.0D + var18;
                    } else {
                        var14 = var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + var34 - -(var33 << 8);
                class21.field273[var3] = var35;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)I")
    public final int method711(boolean arg0) {
        ++field4946;
        if (!arg0) {
            this.method709(31);
        }
        return 65535 & this.field4974;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLea;)V")
    public final void method698(byte arg0, class58 arg1) {
        ++field4945;
        int var3 = -75 % ((24 - arg0) / 49);
        Object var4 = null;
        class210 var6;
        if (this.field4954 == null && this.field4955) {
            class274 var5 = this.method2215(true, arg1, 9901, 131072);
            var6 = var5 == null ? null : var5.field3745;
        } else {
            var6 = this.field4954;
            this.field4954 = null;
        }
        if (var6 != null) {
            class259.method1669(var6, this.field4965, super.field5135, super.field5137, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
    public final int method709(int arg0) {
        ++field4969;
        return arg0 != 30030 ? -65 : this.field4960;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILea;)Lts;")
    private final class116 method2219(byte arg0, int arg1, class58 arg2) {
        if (arg0 != -22) {
            this.field4956 = false;
        }
        ++field4962;
        if (this.field4951 != null && ~arg2.method187(this.field4951.method866(), arg1) == -1) {
            return this.field4951;
        } else {
            class274 var4 = this.method2215(false, arg2, arg0 + 9923, arg1);
            return var4 != null ? var4.field3748 : null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
    public static final void method2220(int arg0, byte arg1) {
        int var2 = -65 / ((arg1 - -53) / 33);
        class217.field3053 = arg0;
        ++field4967;
        class447.field6315.method2530((byte) -116);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        if (arg1 < -99) {
            ++field4961;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
    public final boolean method706(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field4971;
            return this.field4955;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
    public final int method807(byte arg0) {
        ++field4950;
        if (arg0 > -99) {
            this.method705((class58) null, (byte) 113, 109);
        }
        return this.field4951 == null ? 0 : this.field4951.method889();
    }
}
