import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class417 extends class306 {

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public int field6160 = -1;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    private int field6166 = 0;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public int field6165 = -1;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "Z")
    private boolean field6175 = false;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public int field6176 = 0;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
    public static int[] field6159 = new int[500];

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field6162 = 0;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public int field6168;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public int field6173;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        if (arg0 != -1) {
            return -84;
        } else {
            ++field6164;
            return this.field6166;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        ++field6161;
        if (arg1 != 11771) {
            this.method270(-93);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field6169;
        class361 var3 = class545.method3192(super.field7905, super.field7895 >> class125.field1831, super.field7896 >> class125.field1831);
        if (var3 != null && var3.field5301.field4295) {
            int var4 = var3.field5301.method271(false);
            if (~this.field6176 != ~var4) {
                super.field7894 -= this.field6176;
                super.field7894 += var4;
                this.field6176 = var4;
            }
        }
        class151 var5 = arg0.method682();
        var5.method890();
        if (var3 == null || !var3.field5301.field4295) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class682 var9 = class178.field2480[super.field7900];
            int var10 = this.field6166 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method3824(super.field7895 + var12, 115, super.field7896 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method3824(super.field7895 + var15, 124, super.field7896 + var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method3824(super.field7895 - -var18, 127, super.field7896 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method3824(super.field7895 - -var21, 115, super.field7896 + var22);
            int var24 = ~var17 < ~var14 ? var14 : var17;
            int var25 = ~var23 < ~var20 ? var20 : var23;
            int var26 = var23 > var17 ? var17 : var23;
            if (~var10 != -1) {
                int var27 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10)) & 16383;
                if (~var27 != -1) {
                    var5.method884(var27);
                }
            }
            int var28 = var14 >= var20 ? var20 : var14;
            if (var10 != 0) {
                int var29 = 16383 & (int) (Math.atan2((double) (-var26 + var28), (double) var10) * 2607.5945876176133D);
                if (var29 != 0) {
                    var5.method879(-var29);
                }
            }
            int var30 = var14 + var23;
            if (~(var17 + var20) > ~var30) {
                var30 = var17 - -var20;
            }
            int var31 = (var30 >> 1) - super.field7894;
            if (var31 != 0) {
                var5.method893(0, var31, 0);
            }
        }
        var5.method893(super.field7895, super.field7894 + -10, super.field7896);
        class218 var32 = class187.method1237(3, (byte) 107);
        this.field6175 = false;
        this.field6166 = 0;
        if (this.field6165 != arg1) {
            class395 var33 = class259.field3355.method2382(this.field6165, (byte) 28).method2421(2048, this.field6168, 0, 0, -1, arg1 + -1, (class47) null, arg0, (class242) null);
            if (var33 != null) {
                if (!class384.field5767) {
                    var33.method1054(var5, var32.field2902[2], 0);
                } else {
                    var33.method1030(var5, var32.field2902[2], class515.field7222, 0);
                }
                this.field6175 |= var33.method1024();
                this.field6166 = var33.method1018();
            }
        }
        if (~this.field6160 != 0) {
            class395 var34 = class259.field3355.method2382(this.field6160, (byte) 28).method2421(2048, this.field6155, 0, 0, -1, -2, (class47) null, arg0, (class242) null);
            if (var34 != null) {
                if (class384.field5767) {
                    var34.method1030(var5, var32.field2902[1], class515.field7222, 0);
                } else {
                    var34.method1054(var5, var32.field2902[1], 0);
                }
                this.field6175 |= var34.method1024();
                if (~var34.method1018() < ~this.field6166) {
                    this.field6166 = var34.method1018();
                }
            }
        }
        class395 var35 = class259.field3355.method2382(this.field6156, (byte) 28).method2421(2048, this.field6173, 0, 0, -1, arg1 + -1, (class47) null, arg0, (class242) null);
        if (var35 != null) {
            if (!class384.field5767) {
                var35.method1054(var5, var32.field2902[0], 0);
            } else {
                var35.method1030(var5, var32.field2902[0], class515.field7222, 0);
            }
            this.field6175 |= var35.method1024();
            if (~var35.method1018() < ~this.field6166) {
                this.field6166 = var35.method1018();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
    public static final void method2533(int arg0, int arg1) {
        ++field6163;
        if (class233.method1442(false, arg0)) {
            class5[] var2 = class220.field2917[arg0];
            for (int var3 = arg1; ~var2.length < ~var3; ++var3) {
                class5 var4 = var2[var3];
                if (var4 != null) {
                    var4.field69 = 0;
                    var4.field56 = 0;
                    var4.field115 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I")
    public static final int method2534(int arg0, int arg1, int arg2, int arg3) {
        ++field6174;
        int var4 = arg2 & 3;
        if (arg1 == var4) {
            return arg3;
        } else if (~var4 == -2) {
            return -arg0 + 7;
        } else {
            return var4 == 2 ? 7 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)V")
    public static void method2535(boolean arg0) {
        field6159 = null;
        if (!arg0) {
            field6159 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        ++field6172;
        return arg0 != -1510217528 ? true : this.field6175;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        ++field6158;
        return arg1 != 0 ? null : null;
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field6170;
        return arg0 > -42 ? false : false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method2536(byte arg0) {
        ++field6167;
        class383[] var1 = class343.field5072;
        synchronized (class343.field5072) {
            int var2 = 0;
            while (true) {
                if (var2 >= class343.field5072.length) {
                    break;
                }
                class343.field5072[var2] = new class383();
                class270.field3537[var2] = 0;
                ++var2;
            }
        }
        if (arg0 < 46) {
            method2536((byte) -102);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIII)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field6171;
        class151 var5 = arg3.method682();
        if (arg2) {
            return false;
        } else {
            var5.method883(super.field7895, super.field7894 + -10, super.field7896);
            class395 var6 = class259.field3355.method2382(this.field6156, (byte) 28).method2421(131072, this.field6173, 0, 0, -1, -2, (class47) null, arg3, (class242) null);
            if (var6 != null && (!class384.field5767 ? var6.method1026(arg0, arg1, var5, true) : var6.method1022(arg0, arg1, var5, true, class515.field7222))) {
                return true;
            } else {
                if (~this.field6160 != 0) {
                    class395 var7 = class259.field3355.method2382(this.field6160, (byte) 28).method2421(131072, this.field6155, 0, 0, -1, -2, (class47) null, arg3, (class242) null);
                    if (var7 != null && (class384.field5767 ? var7.method1022(arg0, arg1, var5, true, class515.field7222) : var7.method1026(arg0, arg1, var5, true))) {
                        return true;
                    }
                }
                if (~this.field6165 != 0) {
                    class395 var8 = class259.field3355.method2382(this.field6165, (byte) 28).method2421(131072, this.field6168, 0, 0, -1, -2, (class47) null, arg3, (class242) null);
                    if (var8 != null && (class384.field5767 ? var8.method1022(arg0, arg1, var5, true, class515.field7222) : var8.method1026(arg0, arg1, var5, true))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        ++field6157;
        return arg0 ? -19 : -10;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static final void method2537(int arg0) {
        class373.field5520 = 0;
        ++field6154;
        class152.field2150.method1905(0);
        class683.field9638 = false;
        int var1 = 107 % ((arg0 - 27) / 49);
    }
}
