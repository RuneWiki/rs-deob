import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class295 extends class194 {

    @OriginalMember(owner = "client!bl", name = "Mb", descriptor = "Lwa;")
    public static class75 field5071 = class66.method560("event_opbase", false);

    @OriginalMember(owner = "client!bl", name = "Ob", descriptor = "Lwa;")
    public static class75 field5073 = class66.method560(":", false);

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bl", name = "Hb", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!bl", name = "Ib", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!bl", name = "Jb", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!bl", name = "Kb", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bl", name = "Nb", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!bl", name = "Lb", descriptor = "Lfe;")
    public class229 field5070;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIILpj;IJ)Z", line = 5)
    public static final boolean method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class171 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class246.method1776(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)Z", line = 16)
    public final boolean method744(byte arg0) {
        field5066++;
        if (arg0 >= -77) {
            this.field5070 = (class229) null;
        }
        return this.field5070 != null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJ)V", line = 30)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field5067++;
        if (this.field5070 == null) {
            return;
        }
        class28 var11 = this.field3204 != -1 && this.field3268 == 0 ? class302.method2082(this.field3204, 10) : null;
        class28 var12 = this.field3215 == -1 || this.field3228 == this.field3215 && var11 != null ? null : class302.method2082(this.field3215, 118);
        class234 var13 = this.field5070.method1670(var11, this.field3248, this.field3234, var12, (byte) -103);
        if (var13 == null) {
            return;
        }
        this.field3221 = var13.method443();
        class229 var14 = this.field5070;
        if (var14.field3868 != null) {
            var14 = var14.method1673(false);
        }
        if (class75.field1286 && var14.field3844) {
            class234 var15 = class286.method2015(this.field3238, this.field5070.field3864, this.field3218, arg0, this.field3220, -84, var13, this.field5070.field3890, this.field3259, this.field5070.field3854, var12 == null ? var11 : var12, var12 == null ? this.field3234 : this.field3248, this.field5070.field3843, this.field5070.field3851);
            float var16 = class47.method340();
            float var17 = class47.method329();
            class47.method345();
            class47.method332(var16, var17 - 150.0F);
            var15.method409(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class47.method325();
            class47.method332(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field5070.field3888 != 0 || this.field5070.field3858 != 0) {
            int var21 = class21.field288[arg0];
            int var22 = class21.field286[arg0];
            short var23 = this.field5070.field3888;
            int var24 = -var23 / 2;
            short var25 = this.field5070.field3858;
            int var26 = -var25 / 2;
            int var27 = var21 * var26 + var22 * var24 >> 16;
            int var28 = var22 * var26 - (var21 * var24) >> 16;
            int var29 = class32.method217(this.field3259 + var27, this.field3218 - -var28, true, class67.field1174);
            int var30 = var23 / 2;
            int var31 = -var25 / 2;
            int var32 = var22 * var31 - (var21 * var30) >> 16;
            int var33 = var21 * var31 + var22 * var30 >> 16;
            int var34 = -var23 / 2;
            int var35 = var25 / 2;
            int var36 = var22 * var35 - (var21 * var34) >> 16;
            int var37 = class32.method217(this.field3259 + var33, this.field3218 + var32, true, class67.field1174);
            int var38 = var21 * var35 + var22 * var34 >> 16;
            int var39 = class32.method217(this.field3259 + var38, this.field3218 + var36, true, class67.field1174);
            int var40 = var23 / 2;
            int var41 = var25 / 2;
            int var42 = var21 * var41 + var22 * var40 >> 16;
            int var43 = var37 > var29 ? var29 : var37;
            int var44 = var22 * var41 - var21 * var40 >> 16;
            int var45 = class32.method217(this.field3259 + var42, this.field3218 + var44, true, class67.field1174);
            int var46 = var45 > var37 ? var37 : var45;
            int var47 = var29 + var45;
            int var48 = var29 >= var39 ? var39 : var29;
            int var49 = var39 < var45 ? var39 : var45;
            if (var47 > var37 + var39) {
                var47 = var37 + var39;
            }
            if (var25 != 0) {
                var18 = (int) (Math.atan2((double) (var43 - var49), (double) var25) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method407(var18);
                }
            }
            if (var23 != 0) {
                var19 = (int) (Math.atan2((double) (var48 - var46), (double) var23) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method445(var19);
                }
            }
            var20 = (var47 >> 1) - this.field3238;
            if (var20 != 0) {
                var13.method410(0, var20, 0);
            }
        }
        class234 var50 = null;
        if (this.field3261 != -1 && this.field3255 != -1) {
            class263 var51 = class65.method556(this.field3261, 95);
            var50 = var51.method1881(this.field3255, (byte) -56);
            if (var50 != null) {
                var50.method410(0, -this.field3247, 0);
                if (var51.field4563) {
                    if (var18 != 0) {
                        var50.method407(var18);
                    }
                    if (var19 != 0) {
                        var50.method445(var19);
                    }
                    if (var20 != 0) {
                        var50.method410(0, var20, 0);
                    }
                }
            }
        }
        if (this.field5070.field3854 == 1) {
            var13.field3956 = true;
        }
        var13.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field5070.field3854 == 1) {
                var50.field3956 = true;
            }
            var50.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILoj;)V", line = 221)
    public static final void method2050(int arg0, class307 arg1) {
        field5068++;
        if (arg0 >= -58) {
            field5073 = (class75) null;
        }
        arg1.field5241 = false;
        if (arg1.field5239 != null) {
            arg1.field5239.field4317 = 0;
        }
        for (class307 var2 = arg1.method967(); var2 != null; var2 = arg1.method972()) {
            method2050(-84, var2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I", line = 244)
    public final int method443() {
        field5072++;
        return this.field3221;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 254)
    public static final void method2051(byte arg0) {
        field5065++;
        if (arg0 < 24) {
            field5071 = (class75) null;
        }
        for (class85 var1 = (class85) class216.field3701.method1250(true); var1 != null; var1 = (class85) class216.field3701.method1256((byte) -124)) {
            if (var1.field1399 == -1) {
                var1.field1408 = 0;
                class32.method214(var1, true);
            } else {
                var1.method1527(-123);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 286)
    public static void method2052(int arg0) {
        if (arg0 > -110) {
            method2050(-38, (class307) null);
        }
        field5071 = null;
        field5073 = null;
    }
}
