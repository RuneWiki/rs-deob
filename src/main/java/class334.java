import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class334 {

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    private int field4554 = 65000;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Lsj;")
    private class432 field4550 = null;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lsj;")
    private class432 field4557 = null;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Lcq;")
    public static class72 field4555 = new class72("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Laq;")
    public static class453 field4561 = null;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "Lwk;")
    public static class282 field4565;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field4564;

    static {
        new class72("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field4565 = new class282(0, 0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/awt/Component;ILnh;II)Luc;", line = 3)
    public static final class176 method2138(Component arg0, int arg1, class441 arg2, int arg3, int arg4) {
        field4560++;
        if (class247.field3267 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class176 var5 = (class176) Class.forName("ah").getDeclaredConstructor().newInstance();
                var5.field2068 = arg1;
                var5.field2043 = new int[(class255.field3311 ? 2 : 1) * 256];
                var5.method185(arg0);
                var5.field2063 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field2063 > 16384) {
                    var5.field2063 = 16384;
                }
                var5.method180(var5.field2063);
                if (class370.field5038 > 0 && class367.field5011 == null) {
                    class367.field5011 = new class210();
                    class367.field5011.field2550 = arg2;
                    arg2.method2733(0, class367.field5011, class370.field5038);
                }
                if (class367.field5011 != null) {
                    if (class367.field5011.field2549[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class367.field5011.field2549[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class29 var6 = new class29(arg2, arg3);
                    var6.field2043 = new int[(class255.field3311 ? 2 : 1) * 256];
                    var6.field2068 = arg1;
                    var6.method185(arg0);
                    var6.field2063 = 16384;
                    var6.method180(var6.field2063);
                    if (~class370.field5038 < arg4 && class367.field5011 == null) {
                        class367.field5011 = new class210();
                        class367.field5011.field2550 = arg2;
                        arg2.method2733(~arg4, class367.field5011, class370.field5038);
                    }
                    if (class367.field5011 != null) {
                        if (class367.field5011.field2549[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class367.field5011.field2549[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class176();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 85)
    public static final void method2139(byte arg0) {
        field4553++;
        if (class53.field620 != null || arg0 < 78) {
            return;
        }
        Container var1;
        if (class167.field1942 == null) {
            var1 = class401.field5525.field6077;
        } else {
            var1 = class167.field1942;
        }
        class283.field3693 = var1.getSize().width;
        class450.field6290 = var1.getSize().height;
        if (class167.field1942 == var1) {
            Insets var2 = class167.field1942.getInsets();
            class283.field3693 -= var2.right + var2.left;
            class450.field6290 -= var2.top + var2.bottom;
        }
        if (client.method2697(52) == 1) {
            class39.field457 = 765;
            class236.field3104 = 0;
            class398.field5402 = (class283.field3693 - 765) / 2;
            class28.field315 = 503;
        } else if (class105.field1254 < 96 && class20.field220 == 0) {
            int var3 = class283.field3693 > 1024 ? 1024 : class283.field3693;
            class398.field5402 = (class283.field3693 - var3) / 2;
            class39.field457 = var3;
            int var4 = class450.field6290 <= 768 ? class450.field6290 : 768;
            class236.field3104 = 0;
            class28.field315 = var4;
        } else {
            class39.field457 = class283.field3693;
            class398.field5402 = 0;
            class236.field3104 = 0;
            class28.field315 = class450.field6290;
        }
        if (class94.field1105 != 0) {
            boolean var10000;
            if (class39.field457 < 1024 && class28.field315 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class357.field4845.setSize(class39.field457, class28.field315);
        if (class267.field3454 != null) {
            class267.field3454.method776();
        }
        if (class167.field1942 == var1) {
            Insets var5 = class167.field1942.getInsets();
            class357.field4845.setLocation(class398.field5402 + var5.left, class236.field3104 + var5.top);
        } else {
            class357.field4845.setLocation(class398.field5402, class236.field3104);
        }
        if (class366.field4983 != -1) {
            class18.method106(true, (byte) 67);
        }
        class419.method2571(29);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII)V", line = 183)
    public static final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4551++;
        if (arg1 == arg2) {
            class170.method1080(arg5 ^ 0x78, arg3, arg4, arg0, arg2);
            return;
        }
        if (arg3 - arg2 >= class295.field3937 && arg3 + arg2 <= class427.field5844 && class53.field624 <= (arg4 - arg1) && class118.field1356 >= arg1 + arg4) {
            class228.method1393(arg4, arg1, arg0, (byte) 114, arg3, arg2);
        } else {
            class447.method2775(arg2, arg1, arg0, arg3, arg4, (byte) -24);
        }
        if (arg5 != -1) {
            field4561 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[BI)Z", line = 206)
    public final boolean method2141(int arg0, int arg1, byte[] arg2, int arg3) {
        field4558++;
        class432 var5 = this.field4557;
        synchronized (this.field4557) {
            if (arg0 < 0 || arg0 > this.field4554) {
                throw new IllegalArgumentException();
            }
            if (arg3 != 520) {
                method2145(38, 49);
            }
            boolean var6 = this.method2144(arg1, true, arg2, (byte) 127, arg0);
            if (!var6) {
                var6 = this.method2144(arg1, false, arg2, (byte) 126, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)[B", line = 237)
    public final byte[] method2142(byte arg0, int arg1) {
        field4559++;
        class432 var3 = this.field4557;
        synchronized (this.field4557) {
            try {
                if (this.field4550.method2637((byte) 92) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4550.method2634(-10092, (long) (arg1 * 6));
                this.field4550.method2630(class27.field307, (byte) 77, 0, 6);
                int var5 = (class27.field307[2] & 0xFF) + ((class27.field307[1] & 0xFF) << 8) + (class27.field307[0] & 0xFF << 16);
                int var6 = ((class27.field307[3] & 0xFF) << 16) + (class27.field307[4] & 0xFF << 8) + (class27.field307[5] & 0xFF);
                if (var5 < 0 || var5 > this.field4554) {
                    return null;
                } else if (var6 > 0 && this.field4557.method2637((byte) 91) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 37 / ((75 - arg0) / 49);
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4557.method2634(-10092, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4557.method2630(class27.field307, (byte) 77, 0, var14 + 8);
                        int var15 = ((class27.field307[0] & 0xFF) << 8) + (class27.field307[1] & 0xFF);
                        int var16 = ((class27.field307[2] & 0xFF) << 8) + (class27.field307[3] & 0xFF);
                        int var17 = ((class27.field307[5] & 0xFF) << 8) + (class27.field307[4] & 0xFF << 16) + (class27.field307[6] & 0xFF);
                        int var18 = class27.field307[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field4556 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field4557.method2637((byte) 92) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class27.field307[var21 + 8];
                                }
                                var12++;
                                var6 = var17;
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILsj;Lsj;I)V", line = 551)
    public class334(int arg0, class432 arg1, class432 arg2, int arg3) {
        this.field4556 = arg0;
        this.field4557 = arg1;
        this.field4550 = arg2;
        this.field4554 = arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 324)
    public static void method2143(int arg0) {
        field4561 = null;
        field4555 = null;
        field4565 = null;
        if (arg0 != 8679) {
            field4555 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ[BBI)Z", line = 337)
    private final boolean method2144(int arg0, boolean arg1, byte[] arg2, byte arg3, int arg4) {
        field4552++;
        class432 var6 = this.field4557;
        synchronized (this.field4557) {
            try {
                int var8;
                if (arg1) {
                    if (this.field4550.method2637((byte) 115) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field4550.method2634(-10092, (long) (arg0 * 6));
                    this.field4550.method2630(class27.field307, (byte) 77, 0, 6);
                    var8 = ((class27.field307[3] & 0xFF) << 16) - (-(class27.field307[4] & 0xFF << 8) - (class27.field307[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field4557.method2637((byte) 127) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4557.method2637((byte) 122) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class27.field307[5] = (byte) var8;
                class27.field307[4] = (byte) (var8 >> 8);
                class27.field307[0] = (byte) (arg4 >> 16);
                class27.field307[1] = (byte) (arg4 >> 8);
                class27.field307[3] = (byte) (var8 >> 16);
                if (arg3 < 125) {
                    return true;
                }
                class27.field307[2] = (byte) arg4;
                this.field4550.method2634(-10092, (long) (arg0 * 6));
                this.field4550.method2633(0, class27.field307, false, 6);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg1) {
                        label110: {
                            this.field4557.method2634(-10092, (long) (var8 * 520));
                            try {
                                this.field4557.method2630(class27.field307, (byte) 77, 0, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class27.field307[0] & 0xFF) << 8) + (class27.field307[1] & 0xFF);
                            int var15 = ((class27.field307[2] & 0xFF) << 8) + (class27.field307[3] & 0xFF);
                            var13 = (class27.field307[6] & 0xFF) + ((class27.field307[5] & 0xFF) << 8) + (class27.field307[4] & 0xFF << 16);
                            int var16 = class27.field307[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field4556 == var16) {
                                if (var13 >= 0 && (this.field4557.method2637((byte) 88) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg1 = false;
                        var13 = (int) ((this.field4557.method2637((byte) 124) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class27.field307[1] = (byte) arg0;
                    class27.field307[0] = (byte) (arg0 >> 8);
                    if ((arg4 - var11) <= 512) {
                        var13 = 0;
                    }
                    class27.field307[3] = (byte) var12;
                    class27.field307[2] = (byte) (var12 >> 8);
                    class27.field307[6] = (byte) var13;
                    class27.field307[5] = (byte) (var13 >> 8);
                    class27.field307[4] = (byte) (var13 >> 16);
                    class27.field307[7] = (byte) this.field4556;
                    this.field4557.method2634(-10092, (long) (var8 * 520));
                    this.field4557.method2633(0, class27.field307, false, 8);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4557.method2633(var11, arg2, false, var19);
                    var8 = var13;
                    var11 += var19;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V", line = 461)
    public static final void method2145(int arg0, int arg1) {
        class365 var2 = class121.field1383;
        synchronized (class121.field1383) {
            class121.field1383.method2298(0);
            class121.field1383 = new class365(arg1);
        }
        int var3 = -81 / (arg0 / 43);
        field4564++;
    }

    @OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;", line = 480)
    public final String toString() {
        field4563++;
        return "Cache:" + this.field4556;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 494)
    public static final void method2146(int arg0) {
        class246.method1612((long) class106.field1273, true, class267.field3454);
        field4562++;
        if (class366.field4983 != -1) {
            class320.method1999(class366.field4983, (byte) 94);
        }
        if (arg0 != 4) {
            return;
        }
        for (int var1 = 0; var1 < class319.field4291; var1++) {
            if (class65.field786[var1]) {
                class326.field4346[var1] = true;
            }
            class287.field3778[var1] = class65.field786[var1];
            class65.field786[var1] = false;
        }
        class293.field3859 = class106.field1273;
        if (class267.field3454.method726()) {
            class374.field5061 = true;
        }
        if (class366.field4983 != -1) {
            class319.field4291 = 0;
            class421.method2579(false);
        }
        class267.field3454.method732();
        class396.method2451(class72.field891, -1);
        class439.field6032 = 0;
    }
}
