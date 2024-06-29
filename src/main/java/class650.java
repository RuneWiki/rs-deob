import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class650 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8978 = -1;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Z")
    public static boolean field8980 = false;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lfo;")
    public static class545 field8982;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZLuv;)V", line = 12)
    public static final void method3641(byte arg0, boolean arg1, class385 arg2) {
        field8983++;
        class540 var3 = arg2.method2347(16383);
        if (arg2.field5307 == 0) {
            arg2.field5309 = 0;
            class93.field1431 = 0;
            client.field4357 = -1;
            return;
        }
        if (arg2.field5230 != -1 && arg2.field5296 == 0) {
            class200 var4 = class108.field1696.method1279((byte) 92, arg2.field5230);
            if (arg2.field5305 > 0 && var4.field3047 == 0) {
                class93.field1431 = 0;
                client.field4357 = -1;
                arg2.field5309++;
                return;
            }
            if (arg2.field5305 <= 0 && var4.field3022 == 0) {
                class93.field1431 = 0;
                arg2.field5309++;
                client.field4357 = -1;
                return;
            }
        }
        for (int var5 = 0; var5 < arg2.field5234.length; var5++) {
            if (arg2.field5234[var5].field6324 != -1 && class440.field5977 >= arg2.field5234[var5].field6323) {
                class491 var20 = class707.field9727.method2143(-2, arg2.field5234[var5].field6324);
                if (var20.field6690 && var20.field6695 != -1) {
                    class200 var21 = class108.field1696.method1279((byte) 92, var20.field6695);
                    if (arg2.field5305 > 0 && var21.field3047 == 0) {
                        client.field4357 = -1;
                        class93.field1431 = 0;
                        arg2.field5309++;
                        return;
                    }
                    if (arg2.field5305 <= 0 && var21.field3022 == 0) {
                        arg2.field5309++;
                        class93.field1431 = 0;
                        client.field4357 = -1;
                        return;
                    }
                }
            }
        }
        int var6 = arg2.field7396;
        int var7 = arg2.field7398;
        int var8 = arg2.field5304[arg2.field5307 - 1] * 512 + arg2.method2342((byte) -26) * 256;
        int var9 = arg2.field5308[arg2.field5307 - 1] * 512 + (arg2.method2342((byte) -118) * 256);
        if (var6 < var8) {
            if (var7 < var9) {
                arg2.method2332(10240, 7416);
            } else if (var7 <= var9) {
                arg2.method2332(12288, 7416);
            } else {
                arg2.method2332(14336, 7416);
            }
        } else if (var6 > var8) {
            if (var7 < var9) {
                arg2.method2332(6144, 7416);
            } else if (var9 >= var7) {
                arg2.method2332(4096, 7416);
            } else {
                arg2.method2332(2048, 7416);
            }
        } else if (var9 > var7) {
            arg2.method2332(8192, 7416);
        } else if (var7 > var9) {
            arg2.method2332(0, 7416);
        }
        byte var10 = arg2.field5306[arg2.field5307 - 1];
        if (!arg1 && (var8 - var6 > 1024 || (var8 - var6) < -1024 || (var9 - var7) > 1024 || (var9 - var7) < -1024)) {
            arg2.field7396 = var8;
            arg2.field7398 = var9;
            arg2.method2340(127, arg2.field5289, false);
            class93.field1431 = 0;
            client.field4357 = -1;
            arg2.field5307--;
            if (arg2.field5305 > 0) {
                arg2.field5305--;
            }
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg2 instanceof class666) {
            var12 = ((class666) arg2).field9253.field8063;
        }
        if (var12) {
            int var13 = arg2.field5289 - arg2.field5246.field2191;
            if (var13 != 0 && arg2.field5286 == -1 && arg2.field5225 != 0) {
                var11 = 8;
            }
            if (!arg1 && arg2.field5307 > 2) {
                var11 = 24;
            }
            if (!arg1 && arg2.field5307 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg1 && arg2.field5307 > 1) {
                var11 = 24;
            }
            if (!arg1 && arg2.field5307 > 2) {
                var11 = 32;
            }
        }
        if (arg2.field5309 > 0 && arg2.field5307 > 1) {
            arg2.field5309--;
            var11 = 32;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field7367 != -1) {
            int var14 = var11 << 9;
            if (arg2.field5307 == 1) {
                int var15 = arg2.field5300 * arg2.field5300;
                int var16 = (arg2.field7396 <= var8 ? var8 - arg2.field7396 : -var8 + arg2.field7396) << 9;
                int var17 = (var9 >= arg2.field7398 ? var9 - arg2.field7398 : -var9 + arg2.field7398) << 9;
                int var18 = var17 >= var16 ? var17 : var16;
                int var19 = var18 * 2 * var3.field7367;
                if (var15 > var19) {
                    arg2.field5300 /= 2;
                } else if (var15 / 2 > var18) {
                    arg2.field5300 -= var3.field7367;
                    if (arg2.field5300 < 0) {
                        arg2.field5300 = 0;
                    }
                } else if (arg2.field5300 < var14) {
                    arg2.field5300 += var3.field7367;
                    if (arg2.field5300 > var14) {
                        arg2.field5300 = var14;
                    }
                }
            } else if (var14 > arg2.field5300) {
                arg2.field5300 += var3.field7367;
                if (arg2.field5300 > var14) {
                    arg2.field5300 = var14;
                }
            } else if (arg2.field5300 > 0) {
                arg2.field5300 -= var3.field7367;
                if (arg2.field5300 < 0) {
                    arg2.field5300 = 0;
                }
            }
            var11 = arg2.field5300 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class93.field1431 = 0;
        if (var6 == var8 && var7 == var9) {
            client.field4357 = -1;
        } else {
            if (var6 < var8) {
                class93.field1431 |= 0x4;
                arg2.field7396 += var11;
                if (var8 < arg2.field7396) {
                    arg2.field7396 = var8;
                }
            } else if (var8 < var6) {
                arg2.field7396 -= var11;
                class93.field1431 |= 0x8;
                if (var8 > arg2.field7396) {
                    arg2.field7396 = var8;
                }
            }
            if (var11 >= 32) {
                client.field4357 = 2;
            } else {
                client.field4357 = var10;
            }
            if (var9 > var7) {
                class93.field1431 |= 0x1;
                arg2.field7398 += var11;
                if (var9 < arg2.field7398) {
                    arg2.field7398 = var9;
                }
            } else if (var7 > var9) {
                class93.field1431 |= 0x2;
                arg2.field7398 -= var11;
                if (var9 > arg2.field7398) {
                    arg2.field7398 = var9;
                }
            }
        }
        if (arg0 >= -22) {
            field8978 = 50;
        }
        if (arg2.field7396 != var8 || arg2.field7398 != var9) {
            return;
        }
        arg2.field5307--;
        if (arg2.field5305 > 0) {
            arg2.field5305--;
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V", line = 353)
    public static final void method3642(boolean arg0, int arg1) {
        field8981++;
        class447.field6138++;
        class537 var2 = class476.method2729(class773.field10693, (byte) -46, class551.field7498);
        class173.method1314(false, var2);
        for (class637 var3 = (class637) class186.field2881.method335(-29067); var3 != null; var3 = (class637) class186.field2881.method336(78)) {
            if (!var3.method1208(arg1 - 27479)) {
                var3 = (class637) class186.field2881.method335(-29067);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field8790 == 0) {
                class305.method1954(true, var3, arg0, (byte) -24);
            }
        }
        if (arg1 != 27373) {
            field8980 = true;
        }
        if (class652.field9033 != null) {
            class410.method2433(class652.field9033, 14049);
            class652.field9033 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V", line = 397)
    public static void method3643(int arg0) {
        int var1 = 79 / ((-arg0 - 1) / 60);
        field8982 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[Ljava/lang/Object;[IZ)V", line = 410)
    public static final void method3644(int arg0, int arg1, Object[] arg2, int[] arg3, boolean arg4) {
        field8979++;
        if (arg4 || arg1 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if (arg3[var10] < ((var10 & var9) + var7)) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg3[arg0] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method3644(var6 - 1, arg1, arg2, arg3, false);
        method3644(arg0, var6 + 1, arg2, arg3, false);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public abstract void method1877(int arg0);

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public abstract void method1884(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III[I)V")
    public abstract void method1878(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III[I)V")
    public abstract void method1870(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public abstract void method1875(int arg0);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public abstract void method1879(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
    public abstract void method1862();

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()Lsk;")
    public abstract class650 method1867();

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public abstract void method1869(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III[I)V")
    public abstract void method1876(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lsk;)V")
    public abstract void method1874(class650 arg0);

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V")
    public abstract void method1890(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([I)V")
    public abstract void method1885(int[] arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public abstract void method1860(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V")
    public abstract void method1868(int arg0, int arg1, int arg2);
}
