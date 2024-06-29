import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class716 extends class77 {

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public int field9960 = 0;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    private int field9953 = 0;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "Z")
    private boolean field9961 = false;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public int field9967 = -1;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public int field9949 = -1;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "[I")
    public static int[] field9952 = new int[1];

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    public static int field9963 = 1406;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public int field9957;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public int field9958;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public int field9964;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    public int field9966;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "[Loia;")
    public static class88[] field9948;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)Z", line = 6)
    public final boolean method746(int arg0) {
        ++field9956;
        if (arg0 >= -106) {
            this.field9967 = -98;
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIII)V", line = 19)
    public class716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Z", line = 25)
    public final boolean method751(boolean arg0) {
        if (arg0) {
            this.method744(124, (class58) null);
        }
        ++field9946;
        return this.field9961;
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(B)I", line = 36)
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            this.field9953 = 76;
        }
        ++field9947;
        return this.field9953;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(ILha;)Lkj;", line = 49)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method750((byte) 107);
        }
        ++field9955;
        return null;
    }

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "(I)V", line = 62)
    public static void method4033(int arg0) {
        if (arg0 > -35) {
            method4034(8);
        }
        field9948 = null;
        field9952 = null;
    }

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "(I)V", line = 74)
    public static final void method4034(int arg0) {
        class499.field7161.method2208(-1);
        ++field9954;
        class20.method122(0);
        class89.field1072.field9146 = 0;
        class561.field7879 = 0;
        class187.field2519 = null;
        int var1 = -73 / ((arg0 - -35) / 49);
        class48.field565 = 0;
        class383.field5465 = null;
        class496.field7130 = null;
        class105.method748(1);
        class215.field2828 = 0;
        class741.field10299 = 0;
        class726.field10163 = 0;
        class332.field4625 = null;
        class166.field2280 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BLha;)Lml;", line = 119)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field9951;
        class356 var3 = class415.method2549(super.field1266, super.field1264 >> class660.field9038, super.field1250 >> class660.field9038);
        if (var3 != null && var3.field5067.field7414) {
            int var4 = var3.field5067.method749(32767);
            if (~this.field9960 != ~var4) {
                super.field1255 -= this.field9960;
                this.field9960 = var4;
                super.field1255 += var4;
            }
        }
        if (arg0 != -127) {
            this.method750((byte) 75);
        }
        class513 var5 = arg1.method439();
        var5.method351();
        if (var3 == null || !var3.field5067.field7414) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class278 var9 = class459.field6474[super.field1258];
            int var10 = this.field9953 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1815(super.field1250 + var13, super.field1264 + var12, -127);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1815(super.field1250 - -var16, super.field1264 - -var15, arg0 ^ -107);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1815(super.field1250 + var19, super.field1264 + var18, -128);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1815(super.field1250 + var22, super.field1264 + var21, 23);
            int var24 = ~var17 >= ~var14 ? var17 : var14;
            int var25 = ~var20 > ~var23 ? var20 : var23;
            int var26 = var17 < var23 ? var17 : var23;
            if (~var10 != -1) {
                int var27 = (int) (2607.5945876176133D * Math.atan2((double) (var24 - var25), (double) var10)) & 16383;
                if (~var27 != -1) {
                    var5.method350(var27);
                }
            }
            int var28 = ~var20 < ~var14 ? var14 : var20;
            int var29 = var14 + var23;
            if (var10 != 0) {
                int var30 = (int) (Math.atan2((double) (-var26 + var28), (double) var10) * 2607.5945876176133D) & 16383;
                if (var30 != 0) {
                    var5.method356(-var30);
                }
            }
            if (~var29 < ~(var17 + var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field1255;
            if (~var31 != -1) {
                var5.method360(0, var31, 0);
            }
        }
        var5.method360(super.field1264, super.field1255 + -10, super.field1250);
        class387 var32 = class65.method544(true, 3, 24824);
        this.field9961 = false;
        this.field9953 = 0;
        if (this.field9949 != -1) {
            class471 var33 = class682.field9361.method3424(this.field9949, false).method3192(2048, false, arg1, (class621) null, this.field9958, -1, (class709) null, 0, 0);
            if (var33 != null) {
                if (class180.field2409) {
                    var33.method262(var5, var32.field5482[2], class516.field7361, 0);
                } else {
                    var33.method221(var5, var32.field5482[2], 0);
                }
                this.field9961 |= var33.method224();
                this.field9953 = var33.method218();
            }
        }
        if (~this.field9967 != 0) {
            class471 var34 = class682.field9361.method3424(this.field9967, false).method3192(2048, false, arg1, (class621) null, this.field9966, -1, (class709) null, 0, 0);
            if (var34 != null) {
                if (!class180.field2409) {
                    var34.method221(var5, var32.field5482[1], 0);
                } else {
                    var34.method262(var5, var32.field5482[1], class516.field7361, 0);
                }
                this.field9961 |= var34.method224();
                if (var34.method218() > this.field9953) {
                    this.field9953 = var34.method218();
                }
            }
        }
        class471 var35 = class682.field9361.method3424(this.field9964, false).method3192(2048, false, arg1, (class621) null, this.field9957, -1, (class709) null, 0, 0);
        if (var35 != null) {
            if (class180.field2409) {
                var35.method262(var5, var32.field5482[0], class516.field7361, 0);
            } else {
                var35.method221(var5, var32.field5482[0], 0);
            }
            this.field9961 |= var35.method224();
            if (~var35.method218() < ~this.field9953) {
                this.field9953 = var35.method218();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)I", line = 285)
    public final int method747(int arg0) {
        ++field9968;
        if (arg0 <= 72) {
            return -38;
        } else {
            class551 var2 = class682.field9361.method3424(this.field9964, false);
            int var3 = var2.field7727;
            if (~this.field9967 != 0) {
                class551 var4 = class682.field9361.method3424(this.field9967, false);
                if (var4.field7727 > var3) {
                    var3 = var4.field7727;
                }
            }
            if (this.field9949 != -1) {
                class551 var5 = class682.field9361.method3424(this.field9949, false);
                if (~var5.field7727 < ~var3) {
                    var3 = var5.field7727;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "(I)I", line = 323)
    public final int method749(int arg0) {
        if (arg0 != 32767) {
            return -15;
        } else {
            ++field9950;
            return -10;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLha;)V", line = 334)
    public final void method753(byte arg0, class58 arg1) {
        int var3 = -113 % ((18 - arg0) / 40);
        ++field9959;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lha;III)Z", line = 348)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field9965;
        class513 var5 = arg0.method439();
        var5.method339(super.field1264, super.field1255 - 10, super.field1250);
        class551 var6 = class682.field9361.method3424(this.field9964, false);
        class471 var7 = var6.method3192(131072, false, arg0, (class621) null, this.field9957, -1, (class709) null, arg1, 0);
        if (var7 != null && (!class180.field2409 ? var7.method233(arg3, arg2, var5, true, var6.field7727) : var7.method229(arg3, arg2, var5, true, var6.field7727, class516.field7361))) {
            return true;
        } else {
            if (this.field9967 != -1) {
                class551 var8 = class682.field9361.method3424(this.field9967, false);
                class471 var9 = var8.method3192(131072, false, arg0, (class621) null, this.field9966, -1, (class709) null, 0, 0);
                if (var9 != null && (class180.field2409 ? var9.method229(arg3, arg2, var5, true, var8.field7727, class516.field7361) : var9.method233(arg3, arg2, var5, true, var8.field7727))) {
                    return true;
                }
            }
            if (~this.field9949 != 0) {
                class551 var10 = class682.field9361.method3424(this.field9949, false);
                class471 var11 = var10.method3192(131072, false, arg0, (class621) null, this.field9958, -1, (class709) null, 0, 0);
                if (var11 != null && (!class180.field2409 ? var11.method233(arg3, arg2, var5, true, var10.field7727) : var11.method229(arg3, arg2, var5, true, var10.field7727, class516.field7361))) {
                    return true;
                }
            }
            return false;
        }
    }
}
