import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class60 extends class301 {

    @OriginalMember(owner = "client!lb", name = "Eb", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!lb", name = "Ib", descriptor = "Lbd;")
    public static class162 field929 = class17.method142(0, "Hierhin gehen");

    @OriginalMember(owner = "client!lb", name = "Hb", descriptor = "Lbd;")
    public static class162 field928 = class17.method142(0, "::wm2");

    @OriginalMember(owner = "client!lb", name = "Kb", descriptor = "Lbd;")
    public static class162 field931 = class17.method142(0, "::noclip");

    @OriginalMember(owner = "client!lb", name = "Gb", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!lb", name = "Jb", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!lb", name = "Lb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!lb", name = "Mb", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!lb", name = "Nb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!lb", name = "Fb", descriptor = "Luh;")
    public class83 field926;

    @OriginalMember(owner = "client!lb", name = "Ob", descriptor = "[Lpm;")
    public static class99[] field935;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 4)
    public static void method412(int arg0) {
        field931 = null;
        field928 = null;
        field929 = null;
        if (arg0 == 0) {
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I", line = 18)
    public final int method46() {
        field933++;
        return this.field5014;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILrk;JLrk;Lrk;)V", line = 26)
    public static final void method413(int arg0, int arg1, int arg2, int arg3, class255 arg4, long arg5, class255 arg6, class255 arg7) {
        class184 var9 = new class184();
        var9.field3176 = arg4;
        var9.field3175 = arg1 * 128 + 64;
        var9.field3178 = arg2 * 128 + 64;
        var9.field3174 = arg3;
        var9.field3172 = arg5;
        var9.field3173 = arg6;
        var9.field3170 = arg7;
        int var10 = 0;
        class225 var11 = class288.field4856[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3756; var12++) {
                class43 var13 = var11.field3765[var12];
                if ((var13.field697 & 0x400000L) == 4194304L) {
                    int var14 = var13.field712.method46();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3171 = -var10;
        if (class288.field4856[arg0][arg1][arg2] == null) {
            class288.field4856[arg0][arg1][arg2] = new class225(arg0, arg1, arg2);
        }
        class288.field4856[arg0][arg1][arg2].field3755 = var9;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIJ)V", line = 73)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field932++;
        if (this.field926 == null) {
            return;
        }
        class142 var11 = this.field5057 != -1 && this.field5040 == 0 ? class139.method1084(-55, this.field5057) : null;
        class142 var12 = this.field5064 == -1 || this.field5068 == this.field5064 && var11 != null ? null : class139.method1084(-55, this.field5064);
        class176 var13 = this.field926.method647(0, var12, this.field5041, this.field5023, var11);
        if (var13 == null) {
            return;
        }
        this.field5014 = var13.method46();
        class83 var14 = this.field926;
        if (var14.field1502 != null) {
            var14 = var14.method643(true);
        }
        if (class92.field1621 && var14.field1475) {
            class176 var15 = class206.method1523(this.field926.field1467, var13, this.field926.field1462, this.field5013, this.field5069, false, this.field926.field1498, var12 == null ? this.field5023 : this.field5041, this.field5058, this.field926.field1496, var12 == null ? var11 : var12, this.field926.field1485, arg0, this.field5047);
            if (class117.field2159) {
                float var16 = class117.method937();
                float var17 = class117.method934();
                class117.method963();
                class117.method960(var16, var17 - 150.0F);
                var15.method49(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class117.method968();
                class117.method960(var16, var17);
            } else {
                var15.method49(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field926.field1491 != 0 || this.field926.field1472 != 0) {
            int var21 = class312.field5269[arg0];
            short var22 = this.field926.field1491;
            int var23 = class312.field5262[arg0];
            int var24 = -var22 / 2;
            short var25 = this.field926.field1472;
            int var26 = -var25 / 2;
            int var27 = var21 * var26 - var23 * var24 >> 16;
            int var28 = var21 * var24 + var23 * var26 >> 16;
            int var29 = -var25 / 2;
            int var30 = var22 / 2;
            int var31 = var21 * var29 - (var23 * var30) >> 16;
            int var32 = var21 * var30 + var23 * var29 >> 16;
            int var33 = class3.method15(this.field5013 + var28, class157.field2765, this.field5047 + var27, false);
            int var34 = class3.method15(this.field5013 + var32, class157.field2765, this.field5047 + var31, false);
            int var35 = -var22 / 2;
            int var36 = var25 / 2;
            int var37 = var21 * var35 + var23 * var36 >> 16;
            int var38 = var21 * var36 - var23 * var35 >> 16;
            int var39 = var22 / 2;
            int var40 = class3.method15(this.field5013 + var37, class157.field2765, this.field5047 + var38, false);
            int var41 = var25 / 2;
            int var42 = var21 * var41 - (var23 * var39) >> 16;
            int var43 = var21 * var39 + var23 * var41 >> 16;
            int var44 = var34 > var33 ? var33 : var34;
            int var45 = class3.method15(this.field5013 + var43, class157.field2765, this.field5047 + var42, false);
            int var46 = var45 > var40 ? var40 : var45;
            int var47 = var33 + var45;
            int var48 = var40 > var33 ? var33 : var40;
            if (var25 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var46), (double) var25) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method64(var18);
                }
            }
            if ((var34 + var40) < var47) {
                var47 = var34 + var40;
            }
            int var49 = var45 > var34 ? var34 : var45;
            if (var22 != 0) {
                var19 = (int) (Math.atan2((double) (var48 - var49), (double) var22) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method86(var19);
                }
            }
            var20 = (var47 >> 1) - this.field5058;
            if (var20 != 0) {
                var13.method71(0, var20, 0);
            }
        }
        class176 var50 = null;
        if (this.field5029 != -1 && this.field5015 != -1) {
            class42 var51 = class297.method2038(-97, this.field5029);
            var50 = var51.method316(this.field5015, true);
            if (var50 != null) {
                var50.method71(0, -this.field5033, 0);
                if (var51.field678) {
                    if (var18 != 0) {
                        var50.method64(var18);
                    }
                    if (var19 != 0) {
                        var50.method86(var19);
                    }
                    if (var20 != 0) {
                        var50.method71(0, var20, 0);
                    }
                }
            }
        }
        if (!class117.field2159) {
            if (var50 != null) {
                var13 = ((class11) var13).method84(var50);
            }
            if (this.field926.field1485 == 1) {
                var13.field3024 = true;
            }
            var13.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field926.field1485 == 1) {
            var13.field3024 = true;
        }
        var13.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field926.field1485 == 1) {
                var50.field3024 = true;
            }
            var50.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z", line = 303)
    public final boolean method289(int arg0) {
        field934++;
        if (this.field926 == null) {
            return false;
        } else if (arg0 == -10662) {
            return true;
        } else {
            return true;
        }
    }
}
