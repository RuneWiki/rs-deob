import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class205 extends class372 {

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public int field3083 = -1;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public int field3091 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    private int field3088 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Z")
    private boolean field3098 = false;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public int field3101 = -1;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field3089 = -1;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Lgj;")
    public static class662 field3093;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "Lha;")
    public static class66 field3095;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILuv;IIIILuv;II)V")
    public static final void method1459(int arg0, int arg1, class385 arg2, int arg3, int arg4, int arg5, int arg6, class385 arg7, int arg8, int arg9) {
        ++field3104;
        int var10 = arg7.method2331((byte) 69);
        if (~var10 != 0) {
            Object var11 = null;
            class604 var12 = (class604) class30.field545.method266((byte) -112, (long) var10);
            if (var12 == null) {
                class49[] var13 = class49.method373(class346.field4664, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class95.field1472.method498(var13[0], true);
                class30.field545.method270(var12, (long) var10, arg3 + -144);
            }
            class549.method3084(arg0 >> 1, 0, arg5 >> 1, arg2.field7398, arg3 ^ 58, arg2.field7391, 256 * arg2.method2342((byte) 120), arg6, arg2.field7396, arg8);
            int var14 = class538.field7307[0] + arg4 + -18;
            int var15 = arg9 / 4 * arg3 + var14;
            int var16 = arg1 - 16 + class538.field7307[1] - 54;
            int var17 = arg9 % 4 * 18 + var16;
            var12.method3430(var15, var17);
            if (arg2 == arg7) {
                class95.field1472.method568(-256, var15 + -1, 18, -115, 18, var17 + -1);
            }
            class686.method3861(var15 + -1, var15 + 18, 22738, var17 + -1, var17 - -18);
            class704 var18 = class269.method1748((byte) 124);
            var18.field9682 = var17;
            var18.field9677 = var17 - -16;
            var18.field9681 = arg7;
            var18.field9679 = var15;
            var18.field9676 = var15 + 16;
            class307.field4212.method1600(var18, arg3 + -21);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        if (arg0) {
            field3089 = 102;
        }
        ++field3097;
        return this.field3098;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1460(int arg0) {
        if (arg0 == -2753) {
            field3095 = null;
            field3093 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
    public final int method1461(byte arg0) {
        ++field3100;
        class730 var2 = class143.field2427.method1410((byte) 14, this.field3087);
        int var3 = 77 % ((arg0 - -58) / 47);
        int var4 = var2.field10058;
        if (~this.field3083 != 0) {
            class730 var5 = class143.field2427.method1410((byte) 44, this.field3083);
            if (~var5.field10058 < ~var4) {
                var4 = var5.field10058;
            }
        }
        if (this.field3101 != -1) {
            class730 var6 = class143.field2427.method1410((byte) 32, this.field3101);
            if (~var6.field10058 < ~var4) {
                var4 = var6.field10058;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)I")
    public final int method900(int arg0) {
        if (arg0 != 0) {
            this.field3102 = 74;
        }
        ++field3099;
        return this.field3088;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)I")
    public final int method907(int arg0) {
        if (arg0 != -20425) {
            field3093 = null;
        }
        ++field3103;
        return -10;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(BLha;)Lhga;")
    public final class186 method898(byte arg0, class66 arg1) {
        ++field3086;
        class58 var3 = class471.method2713(super.field7391, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
        class436 var4 = class572.method3313(super.field7391, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
        int var5 = 0;
        if (var3 != null && var3.field815.field8366) {
            var5 = var3.field815.method907(-20425);
        }
        if (var4 != null && ~var4.field5931 < ~(-var5)) {
            var5 = -var4.field5931;
        }
        if (this.field3091 != var5) {
            super.field7405 -= this.field3091;
            this.field3091 = var5;
            super.field7405 += var5;
        }
        class650 var6 = arg1.method533();
        var6.method1862();
        if (this.field3091 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class296 var10 = class745.field10286[super.field7404];
            int var11 = this.field3088 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1907(super.field7396 + var13, (byte) 101, super.field7398 - -var14);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1907(super.field7396 + var16, (byte) -85, super.field7398 + var17);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1907(super.field7396 + var19, (byte) -97, super.field7398 - -var20);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1907(super.field7396 - -var22, (byte) -83, super.field7398 + var23);
            int var25 = var15 >= var18 ? var18 : var15;
            int var26 = var24 > var21 ? var21 : var24;
            int var27 = var24 > var18 ? var18 : var24;
            int var28 = var21 > var15 ? var15 : var21;
            if (~var11 != -1) {
                int var29 = 16383 & (int) (Math.atan2((double) (-var26 + var25), (double) var11) * 2607.5945876176133D);
                if (~var29 != -1) {
                    var6.method1877(var29);
                }
            }
            if (~var11 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (-var27 + var28), (double) var11) * 2607.5945876176133D);
                if (var30 != 0) {
                    var6.method1869(-var30);
                }
            }
            int var31 = var15 + var24;
            if (~(var18 + var21) > ~var31) {
                var31 = var18 - -var21;
            }
            int var32 = (var31 >> 1) + -super.field7405;
            if (~var32 != -1) {
                var6.method1860(0, var32, 0);
            }
        }
        var6.method1860(super.field7396, super.field7405 + -10, super.field7398);
        class186 var33 = class174.method1320(3, true, 17832);
        this.field3088 = 0;
        this.field3098 = false;
        if (arg0 < 123) {
            return null;
        } else {
            if (~this.field3101 != 0) {
                class499 var34 = class143.field2427.method1410((byte) 78, this.field3101).method4052(arg1, 2048, -68, 0, (class112) null, this.field3102, (class200) null, 0, -1);
                if (var34 != null) {
                    if (!class507.field6967) {
                        var34.method301(var6, var33.field2877[2], 0);
                    } else {
                        var34.method310(var6, var33.field2877[2], class90.field1369, 0);
                    }
                    this.field3098 |= var34.method327();
                    this.field3088 = var34.method298();
                }
            }
            if (this.field3083 != -1) {
                class499 var35 = class143.field2427.method1410((byte) 106, this.field3083).method4052(arg1, 2048, -113, 0, (class112) null, this.field3096, (class200) null, 0, -1);
                if (var35 != null) {
                    if (!class507.field6967) {
                        var35.method301(var6, var33.field2877[1], 0);
                    } else {
                        var35.method310(var6, var33.field2877[1], class90.field1369, 0);
                    }
                    this.field3098 |= var35.method327();
                    if (var35.method298() > this.field3088) {
                        this.field3088 = var35.method298();
                    }
                }
            }
            class499 var36 = class143.field2427.method1410((byte) 108, this.field3087).method4052(arg1, 2048, -107, 0, (class112) null, this.field3094, (class200) null, 0, -1);
            if (var36 != null) {
                if (class507.field6967) {
                    var36.method310(var6, var33.field2877[0], class90.field1369, 0);
                } else {
                    var36.method301(var6, var33.field2877[0], 0);
                }
                this.field3098 |= var36.method327();
                if (~var36.method298() < ~this.field3088) {
                    this.field3088 = var36.method298();
                }
            }
            return var33;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIII)V")
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Lha;B)Ldg;")
    public final class435 method894(class66 arg0, byte arg1) {
        ++field3084;
        return arg1 >= -38 ? null : null;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(I)Z")
    public final boolean method902(int arg0) {
        ++field3085;
        if (arg0 != 0) {
            field3093 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field3090;
        class650 var5 = arg0.method533();
        var5.method1868(super.field7396, super.field7405 + -10, super.field7398);
        class730 var6 = class143.field2427.method1410((byte) 39, this.field3087);
        class499 var7 = var6.method4052(arg0, arg2, -112, 0, (class112) null, this.field3094, (class200) null, 0, -1);
        if (var7 != null && (class507.field6967 ? var7.method286(arg1, arg3, var5, true, var6.field10058, class90.field1369) : var7.method290(arg1, arg3, var5, true, var6.field10058))) {
            return true;
        } else {
            if (~this.field3083 != 0) {
                class730 var8 = class143.field2427.method1410((byte) 55, this.field3083);
                class499 var9 = var8.method4052(arg0, 131072, -70, 0, (class112) null, this.field3096, (class200) null, 0, -1);
                if (var9 != null && (!class507.field6967 ? var9.method290(arg1, arg3, var5, true, var8.field10058) : var9.method286(arg1, arg3, var5, true, var8.field10058, class90.field1369))) {
                    return true;
                }
            }
            if (this.field3101 != -1) {
                class730 var10 = class143.field2427.method1410((byte) 15, this.field3101);
                class499 var11 = var10.method4052(arg0, 131072, arg2 ^ -131154, 0, (class112) null, this.field3102, (class200) null, 0, -1);
                if (var11 != null && (class507.field6967 ? var11.method286(arg1, arg3, var5, true, var10.field10058, class90.field1369) : var11.method290(arg1, arg3, var5, true, var10.field10058))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLha;)V")
    public final void method901(byte arg0, class66 arg1) {
        if (arg0 > 114) {
            ++field3092;
        }
    }
}
