import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class526 extends InputStream {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLap;Z)V")
    public static final void method3115(boolean arg0, class337 arg1, boolean arg2) {
        field7776++;
        class219 var3 = arg1.method2181(0);
        if (arg1.field5343 == 0) {
            class269.field3733 = -1;
            arg1.field5342 = 0;
            class321.field4915 = 0;
            return;
        }
        if (arg1.field5240 != -1 && arg1.field5301 == 0) {
            class270 var4 = class260.field3621.method1934(115, arg1.field5240);
            if (arg1.field5338 > 0 && var4.field3754 == 0) {
                class269.field3733 = -1;
                arg1.field5342++;
                class321.field4915 = 0;
                return;
            }
            if (arg1.field5338 <= 0 && var4.field3739 == 0) {
                class321.field4915 = 0;
                class269.field3733 = -1;
                arg1.field5342++;
                return;
            }
        }
        if (arg1.field5304 != -1 && arg1.field5295 <= class405.field6116) {
            class372 var5 = class275.field3826.method108(arg1.field5304, 0);
            if (var5.field5723 && var5.field5705 != -1) {
                class270 var6 = class260.field3621.method1934(114, var5.field5705);
                if (arg1.field5338 > 0 && var6.field3754 == 0) {
                    arg1.field5342++;
                    class269.field3733 = -1;
                    class321.field4915 = 0;
                    return;
                }
                if (arg1.field5338 <= 0 && var6.field3739 == 0) {
                    class269.field3733 = -1;
                    arg1.field5342++;
                    class321.field4915 = 0;
                    return;
                }
            }
        }
        if (arg1.field5304 != -1 && arg1.field5295 <= class405.field6116) {
            class372 var7 = class275.field3826.method108(arg1.field5304, 0);
            if (var7.field5723 && var7.field5705 != -1) {
                class270 var8 = class260.field3621.method1934(125, var7.field5705);
                if (arg1.field5338 > 0 && var8.field3754 == 0) {
                    arg1.field5342++;
                    class321.field4915 = 0;
                    class269.field3733 = -1;
                    return;
                }
                if (arg1.field5338 <= 0 && var8.field3739 == 0) {
                    class269.field3733 = -1;
                    class321.field4915 = 0;
                    arg1.field5342++;
                    return;
                }
            }
        }
        int var9 = arg1.field2217;
        int var10 = arg1.field2215;
        int var11 = arg1.field5339[arg1.field5343 - 1] * 128 + arg1.method2091(-15245) * 64;
        int var12 = arg1.field5344[arg1.field5343 - 1] * 128 + (arg1.method2091(-15245) * 64);
        if (var11 <= var9) {
            if (var11 < var9) {
                if (var12 > var10) {
                    arg1.method2173((byte) 15, 6144);
                } else if (var10 <= var12) {
                    arg1.method2173((byte) 58, 4096);
                } else {
                    arg1.method2173((byte) 14, 2048);
                }
            } else if (var12 > var10) {
                arg1.method2173((byte) 41, 8192);
            } else if (var12 < var10) {
                arg1.method2173((byte) 37, 0);
            }
        } else if (var10 < var12) {
            arg1.method2173((byte) 61, 10240);
        } else if (var12 >= var10) {
            arg1.method2173((byte) 31, 12288);
        } else {
            arg1.method2173((byte) 112, 14336);
        }
        byte var13 = arg1.field5340[arg1.field5343 - 1];
        if (!arg0 && (var11 - var9 > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256)) {
            arg1.field2215 = var12;
            arg1.field2217 = var11;
            arg1.method2184(arg1.field5273, 14839);
            class321.field4915 = 0;
            class269.field3733 = -1;
            if (arg1.field5338 > 0) {
                arg1.field5338--;
            }
            arg1.field5343--;
            return;
        }
        int var14 = 4;
        boolean var15 = arg2;
        if (arg1 instanceof class194) {
            var15 = ((class194) arg1).field2768.field5106;
        }
        if (var15) {
            int var16 = arg1.field5273 - arg1.field5319.field4989;
            if (var16 != 0 && arg1.field5257 == -1 && arg1.field5245 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg1.field5343 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg1.field5343 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg1.field5343 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg1.field5343 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field5342 > 0 && arg1.field5343 > 1) {
            arg1.field5342--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field3076 != -1) {
            int var17 = var14 << 7;
            if (arg1.field5343 == 1) {
                int var18 = arg1.field5337 * arg1.field5337;
                int var19 = (arg1.field2217 <= var11 ? var11 - arg1.field2217 : -var11 + arg1.field2217) << 7;
                int var20 = (arg1.field2215 <= var12 ? var12 - arg1.field2215 : -var12 + arg1.field2215) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field3076 * 2 * var21;
                if (var18 > var22) {
                    arg1.field5337 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg1.field5337 -= var3.field3076;
                    if (arg1.field5337 < 0) {
                        arg1.field5337 = 0;
                    }
                } else if (arg1.field5337 < var17) {
                    arg1.field5337 += var3.field3076;
                    if (var17 < arg1.field5337) {
                        arg1.field5337 = var17;
                    }
                }
            } else if (arg1.field5337 < var17) {
                arg1.field5337 += var3.field3076;
                if (arg1.field5337 > var17) {
                    arg1.field5337 = var17;
                }
            } else if (arg1.field5337 > 0) {
                arg1.field5337 -= var3.field3076;
                if (arg1.field5337 < 0) {
                    arg1.field5337 = 0;
                }
            }
            var14 = arg1.field5337 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class321.field4915 = 0;
        if (var9 < var11) {
            arg1.field2217 += var14;
            class321.field4915 |= 0x4;
            if (var11 < arg1.field2217) {
                arg1.field2217 = var11;
            }
        } else if (var11 < var9) {
            arg1.field2217 -= var14;
            class321.field4915 |= 0x8;
            if (arg1.field2217 < var11) {
                arg1.field2217 = var11;
            }
        }
        if (var10 < var12) {
            class321.field4915 |= 0x1;
            arg1.field2215 += var14;
            if (var12 < arg1.field2215) {
                arg1.field2215 = var12;
            }
        } else if (var10 > var12) {
            class321.field4915 |= 0x2;
            arg1.field2215 -= var14;
            if (arg1.field2215 < var12) {
                arg1.field2215 = var12;
            }
        }
        if (var14 >= 8) {
            class269.field3733 = 2;
        } else {
            class269.field3733 = var13;
        }
        if (arg1.field2217 == var11 && arg1.field2215 == var12) {
            if (arg1.field5338 > 0) {
                arg1.field5338--;
            }
            arg1.field5343--;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public static final void method3116(int arg0, int arg1) {
        if (arg0 != 8843) {
            field7774 = -58;
        }
        field7778++;
        class356.method2250((byte) 38);
        int var2 = class513.field7614.method102(arg1, 16).field5378;
        if (var2 == 0) {
            return;
        }
        int var3 = class36.field583.field2448[arg1];
        if (var2 == 5) {
            class299.field4423 = var3;
        }
        if (var2 == 6) {
            class77.field1064 = var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "read", descriptor = "()I")
    public final int read() {
        field7775++;
        class106.method710(30000L, (byte) 6);
        return -1;
    }
}
