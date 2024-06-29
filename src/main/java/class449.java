import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class449 extends class590 {

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
    public int field5859 = -1;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Z")
    private boolean field5855 = false;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "I")
    private int field5860 = 0;

    @OriginalMember(owner = "client!aw", name = "cb", descriptor = "I")
    public int field5869 = -1;

    @OriginalMember(owner = "client!aw", name = "Z", descriptor = "I")
    public int field5866 = 0;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Z")
    public static boolean field5850 = false;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
    public int field5862;

    @OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!aw", name = "X", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!aw", name = "Y", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!aw", name = "ab", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!aw", name = "bb", descriptor = "I")
    public int field5868;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)I", line = 3)
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            return -5;
        } else {
            ++field5852;
            return -10;
        }
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(B)I", line = 19)
    public final int method745(byte arg0) {
        ++field5857;
        if (arg0 > -85) {
            this.method743((byte) -119);
        }
        return this.field5860;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(ILha;)Lpi;", line = 32)
    public final class266 method187(int arg0, class570 arg1) {
        ++field5858;
        class569 var3 = class299.method1790(super.field2895, super.field2896 >> class88.field1221, super.field2900 >> class88.field1221);
        class417 var4 = class740.method4019(super.field2895, super.field2896 >> class88.field1221, super.field2900 >> class88.field1221);
        int var5 = 0;
        if (var3 != null && var3.field7193.field7856) {
            var5 = var3.field7193.method747(15258);
        }
        if (var4 != null && ~var4.field5504 < ~(-var5)) {
            var5 = -var4.field5504;
        }
        if (arg0 != -29562) {
            return null;
        } else {
            if (this.field5866 != var5) {
                super.field2892 -= this.field5866;
                super.field2892 += var5;
                this.field5866 = var5;
            }
            class465 var6 = arg1.method948();
            var6.method462();
            if (~this.field5866 == -1) {
                boolean var7 = false;
                boolean var8 = false;
                boolean var9 = false;
                class358 var10 = class116.field1542[super.field2889];
                int var11 = this.field5860 << 1;
                int var13 = -var11 / 2;
                int var14 = -var11 / 2;
                int var15 = var10.method2072((byte) -82, super.field2896 - -var13, super.field2900 + var14);
                int var16 = var11 / 2;
                int var17 = -var11 / 2;
                int var18 = var10.method2072((byte) 92, super.field2896 + var16, super.field2900 + var17);
                int var19 = -var11 / 2;
                int var20 = var11 / 2;
                int var21 = var10.method2072((byte) -45, super.field2896 + var19, super.field2900 - -var20);
                int var22 = var11 / 2;
                int var23 = var11 / 2;
                int var24 = var10.method2072((byte) 81, super.field2896 - -var22, super.field2900 - -var23);
                int var25 = ~var15 <= ~var18 ? var18 : var15;
                int var26 = var21 < var24 ? var21 : var24;
                int var27 = var18 >= var24 ? var24 : var18;
                if (var11 != 0) {
                    int var28 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 16383;
                    if (~var28 != -1) {
                        var6.method467(var28);
                    }
                }
                int var29 = var15 < var21 ? var15 : var21;
                if (var11 != 0) {
                    int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var29), (double) var11));
                    if (~var30 != -1) {
                        var6.method456(-var30);
                    }
                }
                int var31 = var15 + var24;
                if (var31 > var18 + var21) {
                    var31 = var18 + var21;
                }
                int var32 = (var31 >> 1) - super.field2892;
                if (~var32 != -1) {
                    var6.method450(0, var32, 0);
                }
            }
            var6.method450(super.field2896, super.field2892 + -10, super.field2900);
            class266 var33 = class689.method3680((byte) -15, true, 3);
            this.field5855 = false;
            this.field5860 = 0;
            if (this.field5869 != -1) {
                class299 var34 = class640.field8189.method705(this.field5869, arg0 + 18095).method308(arg1, -1, this.field5851, 0, 0, arg0 + 29817, 2048, (class756) null, (class11) null);
                if (var34 != null) {
                    if (!class653.field8360) {
                        var34.method1297(var6, var33.field3533[2], 0);
                    } else {
                        var34.method1292(var6, var33.field3533[2], class628.field7974, 0);
                    }
                    this.field5855 |= var34.method1272();
                    this.field5860 = var34.method1296();
                }
            }
            if (~this.field5859 != 0) {
                class299 var35 = class640.field8189.method705(this.field5859, -11467).method308(arg1, -1, this.field5862, 0, 0, 255, 2048, (class756) null, (class11) null);
                if (var35 != null) {
                    if (class653.field8360) {
                        var35.method1292(var6, var33.field3533[1], class628.field7974, 0);
                    } else {
                        var35.method1297(var6, var33.field3533[1], 0);
                    }
                    this.field5855 |= var35.method1272();
                    if (var35.method1296() > this.field5860) {
                        this.field5860 = var35.method1296();
                    }
                }
            }
            class299 var36 = class640.field8189.method705(this.field5863, arg0 ^ 24499).method308(arg1, -1, this.field5868, 0, 0, arg0 ^ -29575, 2048, (class756) null, (class11) null);
            if (var36 != null) {
                if (!class653.field8360) {
                    var36.method1297(var6, var33.field3533[0], 0);
                } else {
                    var36.method1292(var6, var33.field3533[0], class628.field7974, 0);
                }
                this.field5855 |= var36.method1272();
                if (var36.method1296() > this.field5860) {
                    this.field5860 = var36.method1296();
                }
            }
            return var33;
        }
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)Z", line = 201)
    public final boolean method738(boolean arg0) {
        ++field5865;
        if (!arg0) {
            this.method1405((byte) 28);
        }
        return this.field5855;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(IIIII)V", line = 212)
    public class449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(ILha;)Lid;", line = 220)
    public final class486 method170(int arg0, class570 arg1) {
        ++field5853;
        int var3 = -74 / ((-9 - arg0) / 63);
        return null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lha;I)V", line = 230)
    public final void method182(class570 arg0, int arg1) {
        ++field5864;
        if (arg1 >= -87) {
            this.method170(-48, (class570) null);
        }
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(B)I", line = 241)
    public final int method1405(byte arg0) {
        ++field5861;
        class48 var2 = class640.field8189.method705(this.field5863, -11467);
        int var3 = var2.field629;
        if (this.field5859 != -1) {
            class48 var4 = class640.field8189.method705(this.field5859, -11467);
            if (var3 < var4.field629) {
                var3 = var4.field629;
            }
        }
        if (this.field5869 != -1) {
            class48 var5 = class640.field8189.method705(this.field5869, -11467);
            if (var3 < var5.field629) {
                var3 = var5.field629;
            }
        }
        return arg0 <= 17 ? -8 : var3;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)Z", line = 298)
    public final boolean method743(byte arg0) {
        if (arg0 > -76) {
            this.field5862 = -11;
        }
        ++field5849;
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILha;I)Z", line = 310)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field5856;
        class465 var5 = arg2.method948();
        var5.method449(super.field2896, super.field2892 - 10, super.field2900);
        class48 var6 = class640.field8189.method705(this.field5863, -11467);
        class299 var7 = var6.method308(arg2, -1, this.field5868, 0, 0, 255, 131072, (class756) null, (class11) null);
        int var8 = -83 % ((-23 - arg3) / 37);
        if (var7 != null && (!class653.field8360 ? var7.method1264(arg0, arg1, var5, true, var6.field629) : var7.method1233(arg0, arg1, var5, true, var6.field629, class628.field7974))) {
            return true;
        } else {
            if (~this.field5859 != 0) {
                class48 var9 = class640.field8189.method705(this.field5859, -11467);
                class299 var10 = var9.method308(arg2, -1, this.field5862, 0, 0, 255, 131072, (class756) null, (class11) null);
                if (var10 != null && (class653.field8360 ? var10.method1233(arg0, arg1, var5, true, var9.field629, class628.field7974) : var10.method1264(arg0, arg1, var5, true, var9.field629))) {
                    return true;
                }
            }
            if (~this.field5869 != 0) {
                class48 var11 = class640.field8189.method705(this.field5869, -11467);
                class299 var12 = var11.method308(arg2, -1, this.field5851, 0, 0, 255, 131072, (class756) null, (class11) null);
                if (var12 != null && (!class653.field8360 ? var12.method1264(arg0, arg1, var5, true, var11.field629) : var12.method1233(arg0, arg1, var5, true, var11.field629, class628.field7974))) {
                    return true;
                }
            }
            return false;
        }
    }
}
