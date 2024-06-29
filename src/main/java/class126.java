import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class126 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lag;")
    private class196 field2204 = null;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    private int field2218 = 65000;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lag;")
    private class196 field2219 = null;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lag;")
    public static class196 field2213;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method858(byte arg0) {
        field2221++;
        int var1 = class290.field4636.method1622(class240.field3949);
        for (int var2 = 0; var2 < class275.field4399; var2++) {
            int var6 = class290.field4636.method1622(class245.method1639((byte) 79, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        if (arg0 != -28) {
            return;
        }
        var1 += 8;
        int var3 = class199.field3266 - (var1 / 2);
        if (var3 + var1 > class267.field4324) {
            var3 = class267.field4324 - var1;
        }
        int var4 = class275.field4399 * 15 + 21;
        int var5 = class147.field2497;
        if (var3 < 0) {
            var3 = 0;
        }
        if (class4.field38 < (var4 + var5)) {
            var5 = class4.field38 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class21.field334 != 1) {
            if (class199.field3266 == class115.field2069 && class160.field2668 == class147.field2497) {
                class127.field2244 = (class60.field1050 ? 26 : 22) + class275.field4399 * 15;
                class248.field4074 = true;
                class21.field334 = 0;
                class95.field1641 = var1;
                class144.field2469 = var3;
                class22.field340 = var5;
                return;
            }
            class21.field334 = 1;
            class295.field4696 = class115.field2069;
            class240.field3940 = class160.field2668;
        } else if (class295.field4696 == class199.field3266 && class240.field3940 == class147.field2497) {
            class248.field4074 = true;
            class127.field2244 = (class60.field1050 ? 26 : 22) + class275.field4399 * 15;
            class95.field1641 = var1;
            class21.field334 = 0;
            class144.field2469 = var3;
            class22.field340 = var5;
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lvh;BLvh;)V")
    public static final void method859(class108 arg0, byte arg1, class108 arg2) {
        field2217++;
        if (arg1 == 50) {
            class68.field1124 = arg0;
            class147.field2506 = arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[B")
    public final byte[] method860(boolean arg0, int arg1) {
        field2212++;
        if (!arg0) {
            return null;
        }
        class196 var3 = this.field2204;
        synchronized (this.field2204) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2219.method1294((byte) 81)) {
                    return null;
                }
                this.field2219.method1285((long) (arg1 * 6), 0);
                this.field2219.method1297(class225.field3779, 6, 0, -128);
                int var5 = (class225.field3779[5] & 0xFF) + ((class225.field3779[3] & 0xFF) << 16) + (class225.field3779[4] & 0xFF << 8);
                int var6 = ((class225.field3779[1] & 0xFF) << 8) + ((class225.field3779[0] & 0xFF) << 16) + (class225.field3779[2] & 0xFF);
                if (var6 < 0 || this.field2218 < var6) {
                    return null;
                } else if (var5 > 0 && (this.field2204.method1294((byte) 84) / 520L) >= ((long) var5)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2204.method1285((long) (var5 * 520), 0);
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2204.method1297(class225.field3779, var13 + 8, 0, -120);
                        int var14 = ((class225.field3779[0] & 0xFF) << 8) + (class225.field3779[1] & 0xFF);
                        int var15 = class225.field3779[7] & 0xFF;
                        int var16 = (class225.field3779[6] & 0xFF) + ((class225.field3779[4] & 0xFF) << 16) + (class225.field3779[5] & 0xFF << 8);
                        int var17 = (class225.field3779[2] & 0xFF << 8) + (class225.field3779[3] & 0xFF);
                        if (arg1 == var14 && var11 == var17 && this.field2215 == var15) {
                            if (var16 >= 0 && (long) var16 <= this.field2204.method1294((byte) 102) / 520L) {
                                var5 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class225.field3779[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        if (arg0 <= 37) {
            method858((byte) 108);
        }
        field2213 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[BI)Z")
    public final boolean method862(int arg0, int arg1, byte[] arg2, int arg3) {
        field2223++;
        class196 var5 = this.field2204;
        synchronized (this.field2204) {
            if (arg0 > arg3 || arg3 > this.field2218) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method866(arg3, arg1, true, arg2, (byte) 126);
            if (!var6) {
                var6 = this.method866(arg3, arg1, false, arg2, (byte) -80);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public static final void method863(int arg0, int arg1) {
        field2209++;
        class55 var2 = class62.method395(arg0, arg1, (byte) -66);
        var2.method341((byte) 62);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static final void method864(boolean arg0) {
        field2216++;
        class96.field1651.method53(true);
        if (arg0) {
            method863(92, -95);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BLjava/lang/String;IIII)I")
    public static final int method865(byte[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg2;
        field2214++;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg5 + var7] = -97;
            } else {
                arg0[arg5 + var7] = 63;
            }
        }
        if (arg3 != 8217) {
            field2211 = -79;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ac", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2207++;
        return "Cache:" + this.field2215;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ[BB)Z")
    private final boolean method866(int arg0, int arg1, boolean arg2, byte[] arg3, byte arg4) {
        field2220++;
        class196 var6 = this.field2204;
        synchronized (this.field2204) {
            try {
                int var7;
                if (arg2) {
                    if (this.field2219.method1294((byte) 109) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field2219.method1285((long) (arg1 * 6), 0);
                    this.field2219.method1297(class225.field3779, 6, 0, -123);
                    var7 = (class225.field3779[3] & 0xFF << 16) + ((class225.field3779[4] & 0xFF) << 8) + (class225.field3779[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field2204.method1294((byte) 77) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2204.method1294((byte) 65) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class225.field3779[4] = (byte) (var7 >> 8);
                int var10 = -85 / ((9 - arg4) / 35);
                class225.field3779[0] = (byte) (arg0 >> 16);
                class225.field3779[2] = (byte) arg0;
                class225.field3779[1] = (byte) (arg0 >> 8);
                class225.field3779[5] = (byte) var7;
                int var11 = 0;
                class225.field3779[3] = (byte) (var7 >> 16);
                int var12 = 0;
                this.field2219.method1285((long) (arg1 * 6), 0);
                this.field2219.method1288(6, class225.field3779, 0, 0);
                while (var12 < arg0) {
                    int var13 = 0;
                    if (arg2) {
                        label105: {
                            this.field2204.method1285((long) (var7 * 520), 0);
                            try {
                                this.field2204.method1297(class225.field3779, 8, 0, -116);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = (class225.field3779[4] & 0xFF << 16) + (class225.field3779[5] & 0xFF << 8) + (class225.field3779[6] & 0xFF);
                            int var14 = (class225.field3779[0] & 0xFF << 8) + (class225.field3779[1] & 0xFF);
                            int var15 = ((class225.field3779[2] & 0xFF) << 8) + (class225.field3779[3] & 0xFF);
                            int var16 = class225.field3779[7] & 0xFF;
                            if (arg1 == var14 && var11 == var15 && this.field2215 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field2204.method1294((byte) 71) / 520L) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg0 - var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field2204.method1294((byte) 85) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class225.field3779[7] = (byte) this.field2215;
                    class225.field3779[1] = (byte) arg1;
                    class225.field3779[2] = (byte) (var11 >> 8);
                    class225.field3779[3] = (byte) var11;
                    if ((arg0 - var12) <= 512) {
                        var13 = 0;
                    }
                    class225.field3779[5] = (byte) (var13 >> 8);
                    class225.field3779[4] = (byte) (var13 >> 16);
                    class225.field3779[6] = (byte) var13;
                    var11++;
                    class225.field3779[0] = (byte) (arg1 >> 8);
                    this.field2204.method1285((long) (var7 * 520), 0);
                    var7 = var13;
                    this.field2204.method1288(8, class225.field3779, 0, 0);
                    this.field2204.method1288(var19, arg3, 0, var12);
                    var12 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public static final void method867(boolean arg0) {
        while (class106.field1900 >= 2048.0F) {
            class106.field1900 -= 2048.0F;
        }
        if (class195.field3151 < 128.0F) {
            class195.field3151 = 128.0F;
        }
        if (arg0) {
            field2208 = 55;
        }
        while (class106.field1900 < 0.0F) {
            class106.field1900 += 2048.0F;
        }
        field2205++;
        if (class195.field3151 > 383.0F) {
            class195.field3151 = 383.0F;
        }
        int var1 = class216.field3637 >> 7;
        int var2 = class77.field1251 >> 7;
        int var3 = 0;
        int var4 = class10.method68(true, class176.field2886, class77.field1251, class216.field3637);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class176.field2886;
                    if (var7 < 3 && (class229.field3862[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class99.field1700[var7][var5][var6] & 0xFF) * 8 + var4 - class95.field1642[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class216.field3644 < var9) {
            class216.field3644 += (var9 - class216.field3644) / 24;
        } else if (var9 < class216.field3644) {
            class216.field3644 += (var9 - class216.field3644) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(ILag;Lag;I)V")
    public class126(int arg0, class196 arg1, class196 arg2, int arg3) {
        this.field2218 = arg3;
        this.field2215 = arg0;
        this.field2204 = arg1;
        this.field2219 = arg2;
    }
}
