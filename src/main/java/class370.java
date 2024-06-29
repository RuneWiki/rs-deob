import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class370 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIZ)I")
    public static final int method2207(int arg0, int arg1, int arg2, boolean arg3) {
        field5289++;
        if (!arg3) {
            return 74;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([Lbc;Lpg;Z)Lie;")
    public static final class88 method2208(class508[] arg0, class333 arg1, boolean arg2) {
        field5287++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field7411 <= 0L) {
                return null;
            }
        }
        if (arg2) {
            return null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field7411);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class122.field1897, 0);
        if (class122.field1897[0] == 0) {
            if (class122.field1897[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class122.field1897, 1);
            if (class122.field1897[1] > 1) {
                byte[] var7 = new byte[class122.field1897[1]];
                OpenGL.glGetInfoLogARB(var4, class122.field1897[1], class122.field1897, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class122.field1897[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field7411);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class88(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILdc;Z)V")
    public static final void method2209(int arg0, class16 arg1, boolean arg2) {
        field5286++;
        class495 var3 = arg1.method108(true);
        if (arg1.field265 == 0) {
            class264.field3548 = 0;
            arg1.field266 = 0;
            class392.field5666 = -1;
            return;
        }
        if (arg1.field166 != -1 && arg1.field226 == 0) {
            class55 var4 = class50.field716.method831(arg1.field166, (byte) 54);
            if (arg1.field264 > 0 && var4.field789 == 0) {
                class264.field3548 = 0;
                class392.field5666 = -1;
                arg1.field266++;
                return;
            }
            if (arg1.field264 <= 0 && var4.field814 == 0) {
                class264.field3548 = 0;
                class392.field5666 = -1;
                arg1.field266++;
                return;
            }
        }
        if (arg1.field237 != -1 && class28.field417 >= arg1.field211) {
            class350 var5 = class316.field4288.method2651((byte) 59, arg1.field237);
            if (var5.field5086 && var5.field5089 != -1) {
                class55 var6 = class50.field716.method831(var5.field5089, (byte) 54);
                if (arg1.field264 > 0 && var6.field789 == 0) {
                    arg1.field266++;
                    class264.field3548 = 0;
                    class392.field5666 = -1;
                    return;
                }
                if (arg1.field264 <= 0 && var6.field814 == 0) {
                    arg1.field266++;
                    class264.field3548 = 0;
                    class392.field5666 = -1;
                    return;
                }
            }
        }
        if (arg1.field237 != -1 && arg1.field211 <= class28.field417) {
            class350 var7 = class316.field4288.method2651((byte) 59, arg1.field237);
            if (var7.field5086 && var7.field5089 != -1) {
                class55 var8 = class50.field716.method831(var7.field5089, (byte) 54);
                if (arg1.field264 > 0 && var8.field789 == 0) {
                    class392.field5666 = -1;
                    class264.field3548 = 0;
                    arg1.field266++;
                    return;
                }
                if (arg1.field264 <= 0 && var8.field814 == 0) {
                    class392.field5666 = -1;
                    class264.field3548 = 0;
                    arg1.field266++;
                    return;
                }
            }
        }
        int var9 = arg1.field6284;
        if (arg0 != -21152) {
            return;
        }
        int var10 = arg1.field6287;
        int var11 = arg1.field263[arg1.field265 - 1] * 128 + (arg1.method116(8569) * 64);
        int var12 = arg1.field257[arg1.field265 - 1] * 128 + (arg1.method116(8569) * 64);
        if (var9 < var11) {
            if (var10 < var12) {
                arg1.method110(10240, (byte) -83);
            } else if (var12 < var10) {
                arg1.method110(14336, (byte) -85);
            } else {
                arg1.method110(12288, (byte) -118);
            }
        } else if (var11 >= var9) {
            if (var10 < var12) {
                arg1.method110(8192, (byte) -126);
            } else if (var12 < var10) {
                arg1.method110(0, (byte) -104);
            }
        } else if (var10 < var12) {
            arg1.method110(6144, (byte) -83);
        } else if (var12 >= var10) {
            arg1.method110(4096, (byte) -79);
        } else {
            arg1.method110(2048, (byte) -121);
        }
        byte var13 = arg1.field258[arg1.field265 - 1];
        if (!arg2 && var11 - var9 > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg1.field6284 = var11;
            arg1.field6287 = var12;
            arg1.method106(1113158831, false, arg1.field169);
            arg1.field265--;
            class392.field5666 = -1;
            if (arg1.field264 > 0) {
                arg1.field264--;
            }
            class264.field3548 = 0;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg1 instanceof class209) {
            var15 = ((class209) arg1).field2976.field1262;
        }
        if (var15) {
            int var16 = arg1.field169 - arg1.field163.field4099;
            if (var16 != 0 && arg1.field202 == -1 && arg1.field220 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg1.field265 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg1.field265 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg1.field265 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg1.field265 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field266 > 0 && arg1.field265 > 1) {
            arg1.field266--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class264.field3548 = 0;
        if (var3.field7193 != -1) {
            int var17 = var14 << 7;
            if (arg1.field265 == 1) {
                int var18 = arg1.field262 * arg1.field262;
                int var19 = (arg1.field6284 <= var11 ? var11 - arg1.field6284 : -var11 + arg1.field6284) << 7;
                int var20 = (var12 < arg1.field6287 ? arg1.field6287 - var12 : var12 - arg1.field6287) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field7193 * 2 * var21;
                if (var22 < var18) {
                    arg1.field262 /= 2;
                } else if (var18 / 2 > var21) {
                    arg1.field262 -= var3.field7193;
                    if (arg1.field262 < 0) {
                        arg1.field262 = 0;
                    }
                } else if (arg1.field262 < var17) {
                    arg1.field262 += var3.field7193;
                    if (arg1.field262 > var17) {
                        arg1.field262 = var17;
                    }
                }
            } else if (arg1.field262 < var17) {
                arg1.field262 += var3.field7193;
                if (arg1.field262 > var17) {
                    arg1.field262 = var17;
                }
            } else if (arg1.field262 > 0) {
                arg1.field262 -= var3.field7193;
                if (arg1.field262 < 0) {
                    arg1.field262 = 0;
                }
            }
            var14 = arg1.field262 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class392.field5666 = -1;
        } else {
            if (var11 > var9) {
                arg1.field6284 += var14;
                class264.field3548 |= 0x4;
                if (arg1.field6284 > var11) {
                    arg1.field6284 = var11;
                }
            } else if (var9 > var11) {
                class264.field3548 |= 0x8;
                arg1.field6284 -= var14;
                if (arg1.field6284 < var11) {
                    arg1.field6284 = var11;
                }
            }
            if (var14 >= 8) {
                class392.field5666 = 2;
            } else {
                class392.field5666 = var13;
            }
            if (var12 > var10) {
                class264.field3548 |= 0x1;
                arg1.field6287 += var14;
                if (arg1.field6287 > var12) {
                    arg1.field6287 = var12;
                }
            } else if (var12 < var10) {
                class264.field3548 |= 0x2;
                arg1.field6287 -= var14;
                if (arg1.field6287 < var12) {
                    arg1.field6287 = var12;
                }
            }
        }
        if (arg1.field6284 == var11 && arg1.field6287 == var12) {
            if (arg1.field264 > 0) {
                arg1.field264--;
            }
            arg1.field265--;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLor;)[Ltv;")
    public static final class293[] method2210(byte arg0, class173 arg1) {
        field5288++;
        if (!arg1.method1202(0)) {
            return new class293[0];
        }
        class464 var2 = arg1.method1180(0);
        while (var2.field6699 == 0) {
            class334.method2047(10L, 0);
        }
        if (var2.field6699 == 2) {
            return new class293[0];
        }
        int[] var3 = (int[]) var2.field6695;
        if (arg0 >= -20) {
            return null;
        }
        class293[] var4 = new class293[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class293 var6 = new class293();
            var4[var5] = var6;
            var6.field3959 = var3[var5 << 2];
            var6.field3958 = var3[(var5 << 2) + 1];
            var6.field3962 = var3[(var5 << 2) + 2];
            var6.field3966 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
