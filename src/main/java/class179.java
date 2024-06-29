import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class179 {

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lwl;")
    private class13 field2445 = null;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Lwl;")
    private class13 field2457 = null;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    private int field2460 = 65000;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    private int field2461;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[I")
    public static int[] field2443 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "Z")
    public static boolean field2455 = false;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[Leg;")
    public static class314[] field2449 = new class314[14];

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lll;")
    public static class54 field2447 = new class54();

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "F")
    public static float field2453;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1316(int arg0, int arg1, int arg2, int arg3) {
        field2442++;
        if (arg2 != 13080) {
            return 64;
        }
        int var4 = class350.field5463[class332.method2314(arg3, arg0)];
        if (arg1 > 0) {
            int var5 = class350.field5467.method911(arg1 & 0xFFFF, false);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg0 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) >> 8;
                }
            }
            int var9 = class350.field5467.method908((byte) -119, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var10 << 8 & 0xFF0066) - (-(var12 >> 8) - (var11 & 0xFF00));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZZI[B)Z", line = 95)
    private final boolean method1317(int arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        field2459++;
        class13 var6 = this.field2445;
        synchronized (this.field2445) {
            if (arg2) {
                method1322((byte) -74);
            }
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field2457.method96((byte) -110)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2457.method97(true, (long) (arg0 * 6));
                    this.field2457.method100(0, class149.field2103, 0, 6);
                    var7 = (class149.field2103[3] & 0xFF << 16) + ((class149.field2103[4] & 0xFF) << 8) + (class149.field2103[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field2445.method96((byte) -47) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2445.method96((byte) -96) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class149.field2103[5] = (byte) var7;
                class149.field2103[0] = (byte) (arg3 >> 16);
                class149.field2103[1] = (byte) (arg3 >> 8);
                int var8 = 0;
                class149.field2103[4] = (byte) (var7 >> 8);
                int var9 = 0;
                class149.field2103[2] = (byte) arg3;
                class149.field2103[3] = (byte) (var7 >> 16);
                this.field2457.method97(true, (long) (arg0 * 6));
                this.field2457.method94(0, class149.field2103, 6, (byte) 42);
                while (true) {
                    if (var9 < arg3) {
                        label150: {
                            int var10 = 0;
                            if (arg1) {
                                this.field2445.method97(!arg2, (long) (var7 * 520));
                                try {
                                    this.field2445.method100(0, class149.field2103, 0, 8);
                                } catch (EOFException var18) {
                                    break label150;
                                }
                                var10 = ((class149.field2103[5] & 0xFF) << 8) + ((class149.field2103[4] & 0xFF) << 16) + (class149.field2103[6] & 0xFF);
                                int var12 = ((class149.field2103[2] & 0xFF) << 8) + (class149.field2103[3] & 0xFF);
                                int var13 = class149.field2103[7] & 0xFF;
                                int var14 = ((class149.field2103[0] & 0xFF) << 8) + (class149.field2103[1] & 0xFF);
                                if (arg0 != var14 || var8 != var12 || this.field2461 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field2445.method96((byte) -74) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg1 = false;
                                var10 = (int) ((this.field2445.method96((byte) -91) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class149.field2103[1] = (byte) arg0;
                            if ((arg3 - var9) <= 512) {
                                var10 = 0;
                            }
                            class149.field2103[5] = (byte) (var10 >> 8);
                            class149.field2103[4] = (byte) (var10 >> 16);
                            class149.field2103[6] = (byte) var10;
                            class149.field2103[0] = (byte) (arg0 >> 8);
                            class149.field2103[2] = (byte) (var8 >> 8);
                            class149.field2103[7] = (byte) this.field2461;
                            class149.field2103[3] = (byte) var8;
                            var8++;
                            int var15 = arg3 - var9;
                            this.field2445.method97(true, (long) (var7 * 520));
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var7 = var10;
                            this.field2445.method94(0, class149.field2103, 8, (byte) 42);
                            this.field2445.method94(var9, arg4, var15, (byte) 42);
                            var9 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 219)
    public static void method1318(int arg0) {
        field2443 = null;
        field2447 = null;
        if (arg0 != 255) {
            method1320(false, (char) 65435);
        }
        field2449 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V", line = 233)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == 0) {
            for (int var6 = arg0; var6 <= arg3; var6++) {
                class96.method697((byte) 115, class331.field4902[var6], arg4, arg1, arg5);
            }
            field2462++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZC)Z", line = 255)
    public static final boolean method1320(boolean arg0, char arg1) {
        if (arg0) {
            method1316(1, -6, -58, 66);
        }
        field2454++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!fm", name = "toString", descriptor = "()Ljava/lang/String;", line = 268)
    public final String toString() {
        field2458++;
        return "Cache:" + this.field2461;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILwl;Lwl;I)V", line = 484)
    public class179(int arg0, class13 arg1, class13 arg2, int arg3) {
        this.field2461 = arg0;
        this.field2460 = arg3;
        this.field2445 = arg1;
        this.field2457 = arg2;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 290)
    public static final void method1321(boolean arg0) {
        int var1 = class209.field2967;
        field2456++;
        int var2 = class65.field815;
        int var3 = class146.field2038;
        int var4 = 6116423;
        if (!arg0) {
            return;
        }
        int var5 = class117.field1534;
        if (class47.field623) {
            class129.method997(var1, var2, var3, var5, var4);
            class129.method997(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class129.method986(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        } else {
            class37.method231(var1, var2, var3, var5, var4);
            class37.method231(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class37.method248(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        }
        class186.field2554.method1900(class75.field986, var1 + 3, var2 + 14, var4, -1);
        int var6 = class105.field1361;
        int var7 = class80.field1028;
        for (int var8 = 0; var8 < class66.field853; var8++) {
            int var9 = var2 + ((-var8 + -1 + class66.field853) * 15) + 31;
            int var10 = 16777215;
            if (var6 > var1 && (var1 + var3) > var6 && var7 > (var9 - 13) && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class186.field2554.method1900(class28.method184((byte) 84, var8), var1 + 3, var9, var10, 0);
        }
        class221.method1610(class209.field2967, class65.field815, class117.field1534, 128, class146.field2038);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 350)
    public static final void method1322(byte arg0) {
        class93.field1204 = 0;
        field2452++;
        int var1 = (class359.field5616.field4855 >> 7) + class331.field4867;
        int var2 = (class359.field5616.field4893 >> 7) + class355.field5556;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class93.field1204 = 1;
        }
        if (arg0 != -117) {
            field2451 = 57;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class93.field1204 = 1;
        }
        if (class93.field1204 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class93.field1204 = 0;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[B", line = 376)
    public final byte[] method1323(int arg0, int arg1) {
        field2450++;
        class13 var3 = this.field2445;
        synchronized (this.field2445) {
            try {
                Object var10000;
                if (((long) (arg0 * 6 + 6)) > this.field2457.method96((byte) -31)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2457.method97(true, (long) (arg0 * 6));
                this.field2457.method100(0, class149.field2103, 0, 6);
                int var4 = (class149.field2103[0] & 0xFF << 16) + (class149.field2103[1] & 0xFF << 8) + (class149.field2103[2] & 0xFF);
                int var5 = (class149.field2103[5] & 0xFF) + ((class149.field2103[4] & arg1) << 8) + (class149.field2103[3] & 0xFF << 16);
                if (var4 < 0 || var4 > this.field2460) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field2445.method96((byte) -54) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var4 > var8) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2445.method97(true, (long) (var5 * 520));
                        int var9 = var4 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2445.method100(0, class149.field2103, 0, var9 + 8);
                        int var10 = ((class149.field2103[2] & 0xFF) << 8) + (class149.field2103[3] & 0xFF);
                        int var11 = (class149.field2103[4] & 0xFF << 16) + ((class149.field2103[5] & 0xFF) << 8) + (class149.field2103[6] & 0xFF);
                        int var12 = (class149.field2103[0] & 0xFF << 8) + (class149.field2103[1] & 0xFF);
                        int var13 = class149.field2103[7] & 0xFF;
                        if (arg0 != var12 || var7 != var10 || this.field2461 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2445.method96((byte) -115) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class149.field2103[var14 + 8];
                        }
                        var7++;
                        var5 = var11;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[BII)Z", line = 456)
    public final boolean method1324(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 1672431208) {
            this.field2457 = (class13) null;
        }
        field2444++;
        class13 var5 = this.field2445;
        synchronized (this.field2445) {
            if (arg0 < 0 || this.field2460 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1317(arg2, true, false, arg0, arg1);
            if (!var6) {
                var6 = this.method1317(arg2, false, false, arg0, arg1);
            }
            return var6;
        }
    }
}
