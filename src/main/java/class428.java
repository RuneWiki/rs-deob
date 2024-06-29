import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class428 extends class279 {

    @OriginalMember(owner = "client!qba", name = "U", descriptor = "I")
    public int field6080 = -1;

    @OriginalMember(owner = "client!qba", name = "db", descriptor = "I")
    public int field6089 = -1;

    @OriginalMember(owner = "client!qba", name = "X", descriptor = "I")
    private int field6083 = 0;

    @OriginalMember(owner = "client!qba", name = "hb", descriptor = "I")
    public int field6093 = 0;

    @OriginalMember(owner = "client!qba", name = "gb", descriptor = "Z")
    private boolean field6092 = false;

    @OriginalMember(owner = "client!qba", name = "eb", descriptor = "Ljw;")
    public static class581 field6090 = new class581(111, 7);

    @OriginalMember(owner = "client!qba", name = "S", descriptor = "I")
    public int field6078;

    @OriginalMember(owner = "client!qba", name = "T", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!qba", name = "V", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!qba", name = "W", descriptor = "I")
    public int field6082;

    @OriginalMember(owner = "client!qba", name = "Y", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!qba", name = "Z", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!qba", name = "ab", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!qba", name = "bb", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!qba", name = "cb", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!qba", name = "fb", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!qba", name = "ib", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!qba", name = "jb", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!qba", name = "kb", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        ++field6081;
        class48 var3 = class618.method3395(super.field2250, super.field2257 >> class26.field388, super.field2259 >> class26.field388);
        class6 var4 = class119.method988(super.field2250, super.field2257 >> class26.field388, super.field2259 >> class26.field388);
        int var5 = 0;
        if (var3 != null && var3.field725.field4591) {
            var5 = var3.field725.method24(748449288);
        }
        if (var4 != null && -var5 < var4.field63) {
            var5 = -var4.field63;
        }
        if (~this.field6093 != ~var5) {
            super.field2246 -= this.field6093;
            super.field2246 += var5;
            this.field6093 = var5;
        }
        class303 var6 = arg1.method450();
        var6.method967();
        if (this.field6093 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class296 var10 = class528.field7227[super.field2244];
            int var11 = this.field6083 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1882(super.field2259 + var14, 0, super.field2257 - -var13);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1882(super.field2259 + var17, 0, super.field2257 - -var16);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1882(super.field2259 + var20, 0, super.field2257 + var19);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1882(super.field2259 + var23, 0, super.field2257 + var22);
            int var25 = ~var15 <= ~var18 ? var18 : var15;
            int var26 = ~var24 < ~var21 ? var21 : var24;
            int var27 = ~var24 < ~var18 ? var18 : var24;
            if (var11 != 0) {
                int var28 = (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var25), (double) var11)) & 16383;
                if (var28 != 0) {
                    var6.method978(var28);
                }
            }
            int var29 = ~var21 < ~var15 ? var15 : var21;
            int var30 = var15 + var24;
            if (var11 != 0) {
                int var31 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var29), (double) var11));
                if (var31 != 0) {
                    var6.method968(-var31);
                }
            }
            if (~var30 < ~(var18 + var21)) {
                var30 = var18 + var21;
            }
            int var32 = (var30 >> 1) - super.field2246;
            if (var32 != 0) {
                var6.method970(0, var32, 0);
            }
        }
        var6.method970(super.field2257, super.field2246 + arg0, super.field2259);
        class176 var33 = class567.method3167(true, 0, 3);
        this.field6083 = 0;
        this.field6092 = false;
        if (~this.field6089 != 0) {
            class500 var34 = class770.field10602.method2467(123, this.field6089).method2049(2048, -1, 5, (class489) null, 0, 0, arg1, (class691) null, this.field6086);
            if (var34 != null) {
                if (class200.field2658) {
                    var34.method300(var6, var33.field2345[2], class330.field4773, 0);
                } else {
                    var34.method292(var6, var33.field2345[2], 0);
                }
                this.field6092 |= var34.method326();
                this.field6083 = var34.method339();
            }
        }
        if (~this.field6080 != 0) {
            class500 var35 = class770.field10602.method2467(121, this.field6080).method2049(2048, -1, 5, (class489) null, 0, 0, arg1, (class691) null, this.field6084);
            if (var35 != null) {
                if (!class200.field2658) {
                    var35.method292(var6, var33.field2345[1], 0);
                } else {
                    var35.method300(var6, var33.field2345[1], class330.field4773, 0);
                }
                this.field6092 |= var35.method326();
                if (var35.method339() > this.field6083) {
                    this.field6083 = var35.method339();
                }
            }
        }
        class500 var36 = class770.field10602.method2467(125, this.field6082).method2049(2048, -1, arg0 ^ -13, (class489) null, 0, 0, arg1, (class691) null, this.field6078);
        if (var36 != null) {
            if (class200.field2658) {
                var36.method300(var6, var33.field2345[0], class330.field4773, 0);
            } else {
                var36.method292(var6, var33.field2345[0], 0);
            }
            this.field6092 |= var36.method326();
            if (~var36.method339() < ~this.field6083) {
                this.field6083 = var36.method339();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field6078 = -32;
        }
        ++field6096;
        return this.field6083;
    }

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        ++field6085;
        return arg0 >= -87;
    }

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        ++field6087;
        return arg0 != 0 ? true : this.field6092;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IIIII)V")
    public class428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field6079;
        class303 var5 = arg3.method450();
        if (arg0 != 4161) {
            this.method19(11);
        }
        var5.method981(super.field2257, super.field2246 + -10, super.field2259);
        class322 var6 = class770.field10602.method2467(123, this.field6082);
        class500 var7 = var6.method2049(131072, -1, 5, (class489) null, 0, 0, arg3, (class691) null, this.field6078);
        if (var7 != null && (class200.field2658 ? var7.method311(arg2, arg1, var5, true, var6.field4626, class330.field4773) : var7.method291(arg2, arg1, var5, true, var6.field4626))) {
            return true;
        } else {
            if (this.field6080 != -1) {
                class322 var8 = class770.field10602.method2467(-108, this.field6080);
                class500 var9 = var8.method2049(131072, -1, 5, (class489) null, 0, 0, arg3, (class691) null, this.field6084);
                if (var9 != null && (class200.field2658 ? var9.method311(arg2, arg1, var5, true, var8.field4626, class330.field4773) : var9.method291(arg2, arg1, var5, true, var8.field4626))) {
                    return true;
                }
            }
            if (~this.field6089 != 0) {
                class322 var10 = class770.field10602.method2467(arg0 + -4229, this.field6089);
                class500 var11 = var10.method2049(131072, -1, arg0 + -4156, (class489) null, 0, 0, arg3, (class691) null, this.field6086);
                if (var11 != null && (!class200.field2658 ? var11.method291(arg2, arg1, var5, true, var10.field4626) : var11.method311(arg2, arg1, var5, true, var10.field4626, class330.field4773))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        if (arg0 > 69) {
            ++field6094;
        }
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
    public static void method2616(byte arg0) {
        field6090 = null;
        if (arg0 < 12) {
            field6090 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        ++field6091;
        if (arg0 != 748449288) {
            method2616((byte) -76);
        }
        return -10;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.method33(-93, 52, 82, (class65) null);
        }
        ++field6095;
        return null;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(Z)I")
    public final int method1205(boolean arg0) {
        ++field6088;
        class322 var2 = class770.field10602.method2467(-26, this.field6082);
        int var3 = var2.field4626;
        if (~this.field6080 != 0) {
            class322 var4 = class770.field10602.method2467(5, this.field6080);
            if (~var4.field4626 < ~var3) {
                var3 = var4.field4626;
            }
        }
        if (this.field6089 != -1) {
            class322 var5 = class770.field10602.method2467(-24, this.field6089);
            if (~var5.field4626 < ~var3) {
                var3 = var5.field4626;
            }
        }
        if (!arg0) {
            field6090 = null;
        }
        return var3;
    }
}
