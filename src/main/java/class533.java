import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class533 extends class423 {

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public int field7480 = -1;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public int field7474 = -1;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    private int field7483 = 0;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "Z")
    private boolean field7489 = false;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public int field7486;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "Lmn;")
    public static class333 field7487;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "[I")
    public static int[] field7477;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)I", line = 5)
    public final int method1182(int arg0) {
        ++field7482;
        return arg0 != -32768 ? 8 : -10;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)I", line = 21)
    public final int method1171(byte arg0) {
        ++field7475;
        return arg0 < 39 ? -70 : this.field7483;
    }

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)Z", line = 33)
    public final boolean method1184(int arg0) {
        ++field7488;
        int var2 = -119 % ((arg0 - -1) / 59);
        return this.field7489;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Lr;Z)Lkq;", line = 44)
    public final class549 method1173(class166 arg0, boolean arg1) {
        if (!arg1) {
            this.method1185(-21, 50, (class166) null, 5);
        }
        ++field7490;
        class106 var3 = class48.method491(super.field3019, super.field3024 >> class310.field4593, super.field3029 >> class310.field4593);
        class391 var4 = arg0.method130();
        var4.method271();
        if (var3 == null || !var3.field1638.field6519) {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            class37 var8 = class296.field4340[super.field3023];
            int var9 = this.field7483 << 1;
            int var11 = -var9 / 2;
            int var12 = -var9 / 2;
            int var13 = var8.method442(super.field3024 - -var11, true, super.field3029 + var12);
            int var14 = var9 / 2;
            int var15 = -var9 / 2;
            int var16 = var8.method442(super.field3024 + var14, true, super.field3029 + var15);
            int var17 = -var9 / 2;
            int var18 = var9 / 2;
            int var19 = var8.method442(super.field3024 - -var17, arg1, super.field3029 + var18);
            int var20 = var9 / 2;
            int var21 = var9 / 2;
            int var22 = var8.method442(super.field3024 + var20, arg1, super.field3029 - -var21);
            int var23 = ~var13 <= ~var16 ? var16 : var13;
            int var24 = var19 >= var22 ? var22 : var19;
            int var25 = var16 >= var22 ? var22 : var16;
            int var26 = ~var19 >= ~var13 ? var19 : var13;
            if (var9 != 0) {
                int var27 = 16383 & (int) (Math.atan2((double) (-var24 + var23), (double) var9) * 2607.5945876176133D);
                if (var27 != 0) {
                    var4.method248(var27);
                }
            }
            int var28 = var13 + var22;
            if (~var9 != -1) {
                int var29 = 16383 & (int) (Math.atan2((double) (-var25 + var26), (double) var9) * 2607.5945876176133D);
                if (~var29 != -1) {
                    var4.method258(-var29);
                }
            }
            if (~var28 < ~(var16 + var19)) {
                var28 = var16 + var19;
            }
            int var30 = (var28 >> 1) + -super.field3018;
            if (var30 != 0) {
                var4.method270(0, var30, 0);
            }
        }
        var4.method270(super.field3024, super.field3018 + -10, super.field3029);
        if (var3 != null && var3.field1638.field6519) {
            var4.method270(0, var3.field1638.method1182(-32768), 0);
        }
        class549 var31 = class26.method321(3, 0);
        this.field7483 = 0;
        this.field7489 = false;
        if (~this.field7480 != 0) {
            class55 var32 = class41.field682.method2228(this.field7480, 0).method1251(255, 0, 2048, -1, this.field7478, (class505) null, 0, arg0, (class30) null);
            if (var32 != null) {
                if (!class676.field9574) {
                    var32.method513(var4, var31.field7711[2], 0);
                } else {
                    var32.method495(var4, var31.field7711[2], class341.field5008, 0);
                }
                this.field7489 |= var32.method545();
                this.field7483 = var32.method525();
            }
        }
        if (~this.field7474 != 0) {
            class55 var33 = class41.field682.method2228(this.field7474, 0).method1251(255, 0, 2048, -1, this.field7492, (class505) null, 0, arg0, (class30) null);
            if (var33 != null) {
                if (!class676.field9574) {
                    var33.method513(var4, var31.field7711[1], 0);
                } else {
                    var33.method495(var4, var31.field7711[1], class341.field5008, 0);
                }
                this.field7489 |= var33.method545();
                if (var33.method525() > this.field7483) {
                    this.field7483 = var33.method525();
                }
            }
        }
        class55 var34 = class41.field682.method2228(this.field7486, 0).method1251(255, 0, 2048, -1, this.field7484, (class505) null, 0, arg0, (class30) null);
        if (var34 != null) {
            if (!class676.field9574) {
                var34.method513(var4, var31.field7711[0], 0);
            } else {
                var34.method495(var4, var31.field7711[0], class341.field5008, 0);
            }
            this.field7489 |= var34.method545();
            if (~var34.method525() < ~this.field7483) {
                this.field7483 = var34.method525();
            }
        }
        return var31;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lmo;B)Ltfa;", line = 203)
    public static final class31 method3036(class695 arg0, byte arg1) {
        ++field7479;
        class109 var2 = class192.method1294(-11879)[arg0.method3826(false)];
        class630 var3 = class257.method1709(-93)[arg0.method3826(false)];
        int var4 = arg0.method3814(false);
        int var5 = arg0.method3814(false);
        int var6 = 13 % ((arg1 - 20) / 55);
        int var7 = arg0.method3847((byte) 118);
        int var8 = arg0.method3847((byte) 118);
        int var9 = arg0.method3814(false);
        int var10 = arg0.method3880(8);
        int var11 = arg0.method3880(8);
        return new class31(var2, var3, var4, var5, var7, var8, var9, var10, var11);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIII)V", line = 337)
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILr;)V", line = 236)
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 != 0) {
            this.field7483 = -89;
        }
        ++field7491;
    }

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)Z", line = 251)
    public final boolean method1181(int arg0) {
        ++field7481;
        if (arg0 != -1) {
            this.method1183(121, (class166) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILr;)Lnu;", line = 263)
    public final class548 method1183(int arg0, class166 arg1) {
        ++field7485;
        if (arg0 != 6433) {
            this.field7474 = 107;
        }
        return null;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V", line = 274)
    public static void method3037(byte arg0) {
        if (arg0 == 127) {
            field7477 = null;
            field7487 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILr;I)Z", line = 290)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field7476;
        class391 var5 = arg2.method130();
        var5.method252(super.field3024, super.field3018 + -10, super.field3029);
        class106 var6 = class48.method491(super.field3019, super.field3024 >> class310.field4593, super.field3029 >> class310.field4593);
        if (var6 != null && var6.field1638.field6519) {
            var5.method270(0, var6.field1638.method1182(-32768), 0);
        }
        class55 var7 = class41.field682.method2228(this.field7486, arg0 ^ arg0).method1251(255, 0, 131072, -1, this.field7484, (class505) null, 0, arg2, (class30) null);
        if (var7 != null && class676.field9574 ? var7.method492(arg3, arg1, var5, true, class341.field5008) : var7.method529(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (this.field7474 != -1) {
                class55 var8 = class41.field682.method2228(this.field7474, 0).method1251(255, 0, 131072, -1, this.field7492, (class505) null, 0, arg2, (class30) null);
                if (var8 != null && class676.field9574 ? var8.method492(arg3, arg1, var5, true, class341.field5008) : var8.method529(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (~this.field7480 != 0) {
                class55 var9 = class41.field682.method2228(this.field7480, 0).method1251(255, 0, 131072, -1, this.field7478, (class505) null, 0, arg2, (class30) null);
                if (var9 != null && class676.field9574 ? var9.method492(arg3, arg1, var5, true, class341.field5008) : var9.method529(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
