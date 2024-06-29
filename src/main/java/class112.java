import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class112 extends class128 {

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Lkg;")
    public class23 field1608;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "[I")
    public static int[] field1611 = new int[100];

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Llh;")
    public static class58 field1604 = new class58();

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[I")
    public static int[] field1605;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "[I")
    public static int[] field1613;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method713(byte arg0) {
        field1613 = null;
        field1605 = null;
        field1611 = null;
        int var1 = -32 % ((-arg0 - 64) / 44);
        field1604 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public static final void method714(byte arg0) {
        class190.field2880.method948((byte) 58);
        field1603++;
        if (arg0 != -31) {
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILcm;)V")
    public static final void method715(int arg0, class256 arg1) {
        field1612++;
        int var2 = 42 % ((arg0 + 29) / 59);
        int var3 = arg1.field4037 - class35.field533;
        int var4 = arg1.field4071 * 128 + (arg1.method1683(-65) * 64);
        int var5 = arg1.field4036 * 128 + (arg1.method1683(-95) * 64);
        arg1.field4081 += (var4 - arg1.field4081) / var3;
        arg1.field4068 = 0;
        if (arg1.field4101 == 0) {
            arg1.field4142 = 1024;
        }
        if (arg1.field4101 == 1) {
            arg1.field4142 = 1536;
        }
        if (arg1.field4101 == 2) {
            arg1.field4142 = 0;
        }
        arg1.field4140 += (var5 - arg1.field4140) / var3;
        if (arg1.field4101 == 3) {
            arg1.field4142 = 512;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;III)Lf;")
    public static final class241 method716(Component arg0, int arg1, int arg2, int arg3) {
        field1607++;
        try {
            if (arg1 <= 103) {
                return null;
            } else {
                Class var4 = Class.forName("le");
                class241 var5 = (class241) var4.getDeclaredConstructor().newInstance();
                var5.method176((byte) 17, arg0, arg2, arg3);
                return var5;
            }
        } catch (Throwable var7) {
            class27 var6 = new class27();
            var6.method176((byte) 66, arg0, arg2, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lkg;)V")
    public class112(class23 arg0) {
        this.field1608 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lcm;I)V")
    public static final void method717(class256 arg0, int arg1) {
        if (arg1 != 6901) {
            return;
        }
        class85 var2 = arg0.method1685(0);
        field1609++;
        arg0.field4102 = var2.field1201;
        if (arg0.field4064 == 0) {
            arg0.field4068 = 0;
            return;
        }
        if (arg0.field4133 != -1 && arg0.field4107 == 0) {
            class195 var3 = class280.method1815(arg0.field4133, -76);
            if (arg0.field4046 > 0 && var3.field2980 == 0) {
                arg0.field4068++;
                return;
            }
            if (arg0.field4046 <= 0 && var3.field2968 == 0) {
                arg0.field4068++;
                return;
            }
        }
        if (arg0.field4073 != -1 && arg0.field4100 <= class35.field533) {
            class167 var4 = class291.method1952(0, arg0.field4073);
            if (var4.field2384 && var4.field2375 != -1) {
                class195 var5 = class280.method1815(var4.field2375, 86);
                if (arg0.field4046 > 0 && var5.field2980 == 0) {
                    arg0.field4068++;
                    return;
                }
                if (arg0.field4046 <= 0 && var5.field2968 == 0) {
                    arg0.field4068++;
                    return;
                }
            }
        }
        int var6 = arg0.field4140;
        int var7 = arg0.field4081;
        int var8 = arg0.field4143[arg0.field4064 - 1] * 128 + (arg0.method1683(-68) * 64);
        int var9 = arg0.field4053[arg0.field4064 - 1] * 128 + arg0.method1683(-80) * 64;
        if ((var8 - var7) > 256 || (var8 - var7) < -256 || var9 - var6 > 256 || (var9 - var6) < -256) {
            arg0.field4081 = var8;
            arg0.field4140 = var9;
            return;
        }
        int var10 = var2.field1203;
        int var11 = 4;
        if (var8 <= var7) {
            if (var7 <= var8) {
                if (var6 < var9) {
                    arg0.field4142 = 1024;
                } else if (var9 < var6) {
                    arg0.field4142 = 0;
                }
            } else if (var6 < var9) {
                arg0.field4142 = 768;
            } else if (var9 < var6) {
                arg0.field4142 = 256;
            } else {
                arg0.field4142 = 512;
            }
        } else if (var6 < var9) {
            arg0.field4142 = 1280;
        } else if (var9 >= var6) {
            arg0.field4142 = 1536;
        } else {
            arg0.field4142 = 1792;
        }
        byte var12 = 1;
        boolean var13 = true;
        int var14 = arg0.field4142 - arg0.field4093 & 0x7FF;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 >= -256 && var14 <= 256) {
            var10 = var2.field1234;
        } else if (var14 >= 256 && var14 < 768) {
            var10 = var2.field1202;
        } else if (var14 >= -768 && var14 <= -256) {
            var10 = var2.field1219;
        }
        if (var10 == -1) {
            var10 = var2.field1234;
        }
        arg0.field4102 = var10;
        if (arg0 instanceof class310) {
            var13 = ((class310) arg0).field4993.field3129;
        }
        if (var13) {
            if (arg0.field4142 != arg0.field4093 && arg0.field4047 == -1 && arg0.field4045 != 0) {
                var11 = 2;
            }
            if (arg0.field4064 > 2) {
                var11 = 6;
            }
            if (arg0.field4064 > 3) {
                var11 = 8;
            }
            if (arg0.field4068 > 0 && arg0.field4064 > 1) {
                var11 = 8;
                arg0.field4068--;
            }
        } else {
            if (arg0.field4064 > 1) {
                var11 = 6;
            }
            if (arg0.field4064 > 2) {
                var11 = 8;
            }
            if (arg0.field4068 > 0 && arg0.field4064 > 1) {
                arg0.field4068--;
                var11 = 8;
            }
        }
        if (arg0.field4077[arg0.field4064 - 1] == 2) {
            var12 = 2;
            var11 <<= 0x1;
        } else if (arg0.field4077[arg0.field4064 - 1] == 0) {
            var11 >>= 0x1;
            var12 = 0;
        }
        if (var11 < 8 || var2.field1199 == -1) {
            if (var2.field1192 != -1 && var12 == 0) {
                if (arg0.field4102 == var2.field1203 && var2.field1229 != -1) {
                    arg0.field4102 = var2.field1229;
                } else if (arg0.field4102 == var2.field1219 && var2.field1231 != -1) {
                    arg0.field4102 = var2.field1231;
                } else if (arg0.field4102 == var2.field1202 && var2.field1217 != -1) {
                    arg0.field4102 = var2.field1217;
                } else {
                    arg0.field4102 = var2.field1192;
                }
            }
        } else if (arg0.field4102 == var2.field1203 && var2.field1223 != -1) {
            arg0.field4102 = var2.field1223;
        } else if (arg0.field4102 == var2.field1219 && var2.field1214 != -1) {
            arg0.field4102 = var2.field1214;
        } else if (arg0.field4102 == var2.field1202 && var2.field1220 != -1) {
            arg0.field4102 = var2.field1220;
        } else {
            arg0.field4102 = var2.field1199;
        }
        if (var2.field1200 != -1) {
            int var15 = var11 << 7;
            if (arg0.field4064 == 1) {
                int var16 = (var8 < arg0.field4081 ? arg0.field4081 - var8 : -arg0.field4081 + var8) << 7;
                int var17 = arg0.field4088 * arg0.field4088;
                int var18 = (var9 < arg0.field4140 ? arg0.field4140 - var9 : -arg0.field4140 + var9) << 7;
                int var19 = var16 > var18 ? var16 : var18;
                int var20 = var2.field1200 * var19 * 2;
                if (var20 < var17) {
                    arg0.field4088 /= 2;
                } else if (var19 < var17 / 2) {
                    arg0.field4088 -= var2.field1200;
                    if (arg0.field4088 < 0) {
                        arg0.field4088 = 0;
                    }
                } else if (var15 > arg0.field4088) {
                    arg0.field4088 += var2.field1200;
                    if (arg0.field4088 > var15) {
                        arg0.field4088 = var15;
                    }
                }
            } else if (arg0.field4088 < var15) {
                arg0.field4088 += var2.field1200;
                if (arg0.field4088 > var15) {
                    arg0.field4088 = var15;
                }
            } else if (arg0.field4088 > 0) {
                arg0.field4088 -= var2.field1200;
                if (arg0.field4088 < 0) {
                    arg0.field4088 = 0;
                }
            }
            var11 = arg0.field4088 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var9 > var6) {
            arg0.field4140 += var11;
            if (arg0.field4140 > var9) {
                arg0.field4140 = var9;
            }
        } else if (var6 > var9) {
            arg0.field4140 -= var11;
            if (var9 > arg0.field4140) {
                arg0.field4140 = var9;
            }
        }
        if (var8 > var7) {
            arg0.field4081 += var11;
            if (var8 < arg0.field4081) {
                arg0.field4081 = var8;
            }
        } else if (var7 > var8) {
            arg0.field4081 -= var11;
            if (arg0.field4081 < var8) {
                arg0.field4081 = var8;
            }
        }
        if (arg0.field4081 != var8 || arg0.field4140 != var9) {
            return;
        }
        if (arg0.field4046 > 0) {
            arg0.field4046--;
        }
        arg0.field4064--;
        return;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1610++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg6 * arg6;
        int var12 = arg6 - arg1;
        int var13 = arg4 * arg4;
        int var14 = arg4 - arg1;
        int var15 = var12 * var12;
        int var16 = var14 * var14;
        int var17 = var13 << 1;
        int var18 = var11 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var14 << 1;
        int var23 = var13 - ((var21 - 1) * var18);
        int var24 = (1 - var21) * var11 + var17;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        if (arg5 != 288683169) {
            return;
        }
        int var27 = var11 << 2;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = var19 * 3;
        int var33 = (var22 - 3) * var20;
        int var34 = (var21 - 3) * var18;
        int var35 = (arg4 - 1) * var27;
        int var36 = var29;
        int var37 = (var14 - 1) * var30;
        int var38 = var28;
        int[] var39 = class247.field3876[arg3];
        class129.method822(var39, arg2 - arg6, arg5 + -288685595, arg7, arg2 - var12);
        class129.method822(var39, arg2 - var12, -2426, arg0, arg2 + var12);
        class129.method822(var39, arg2 + var12, -2426, arg7, arg2 + arg6);
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var23 += var36;
                    var24 += var31;
                    var31 += var29;
                    var8++;
                    var36 += var29;
                }
            }
            if (var23 < 0) {
                var8++;
                var23 += var36;
                var36 += var29;
                var24 += var31;
                var31 += var29;
            }
            var24 += -var35;
            var35 -= var27;
            var23 += -var34;
            int var40 = arg2 + var8;
            var34 -= var27;
            int var41 = arg2 - var8;
            boolean var42 = var14 >= var9;
            if (var42) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var38;
                        var38 += var28;
                        var25 += var32;
                        var32 += var28;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var38;
                    var38 += var28;
                    var25 += var32;
                    var32 += var28;
                }
                var25 += -var37;
                var26 += -var33;
                var37 -= var30;
                var33 -= var30;
            }
            var9--;
            int var43 = arg3 - var9;
            int var44 = arg3 + var9;
            if (var42) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class129.method822(class247.field3876[var43], var41, -2426, arg7, var46);
                class129.method822(class247.field3876[var43], var46, -2426, arg0, var45);
                class129.method822(class247.field3876[var43], var45, -2426, arg7, var40);
                class129.method822(class247.field3876[var44], var41, arg5 - 288685595, arg7, var46);
                class129.method822(class247.field3876[var44], var46, -2426, arg0, var45);
                class129.method822(class247.field3876[var44], var45, -2426, arg7, var40);
            } else {
                class129.method822(class247.field3876[var43], var41, -2426, arg7, var40);
                class129.method822(class247.field3876[var44], var41, -2426, arg7, var40);
            }
        }
    }
}
