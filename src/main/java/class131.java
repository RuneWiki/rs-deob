import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class131 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    private int field2282 = 0;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    private int field2293 = 0;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[[I")
    public int[][] field2272;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Loa;")
    private static class99 field2275 = class221.method1463(2844, "Drop");

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[[I")
    public static int[][] field2295 = new int[5][5000];

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Loa;")
    public static class99 field2294 = class221.method1463(2844, " ");

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Loa;")
    public static class99 field2281 = field2275;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Loa;")
    public static class99 field2291 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Loe;")
    public static class143 field2277 = new class143(5000);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2273++;
        if (arg0 == arg5) {
            if (arg1 == arg6 && arg4 == arg7) {
                return true;
            }
        } else if (arg6 >= arg1 && arg6 <= (arg1 - (1 - arg0)) && arg4 <= arg4 && arg4 + arg0 - 1 >= arg4) {
            return true;
        }
        int var9 = arg6 - this.field2293;
        int var10 = arg1 - this.field2293;
        int var11 = arg4 - this.field2282;
        int var12 = arg7 - this.field2282;
        if (arg0 == 1) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field2272[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2272[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field2272[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field2272[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2272[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2272[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field2272[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field2272[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field2272[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field2272[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 == var12 && (this.field2272[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg0 - 1;
            int var14 = var10 + arg0 - 1;
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if (var9 - arg0 == var10 && var11 >= var12 && var13 >= var11) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var11 + 1) == var12 && (this.field2272[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var11 - arg0 == var12 && (this.field2272[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 >= var10 && var9 <= var14 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var10 && var12 <= var11 && var13 >= var11 && (this.field2272[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var13 && (this.field2272[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var10 && var12 <= var11 && var11 <= var13) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var11 + 1) == var12 && (this.field2272[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var11 - arg0) == var12 && (this.field2272[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 <= var9 && var9 <= var14 && var11 - arg0 == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var10 && var12 <= var11 && var13 >= var11 && (this.field2272[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 <= var11 && var13 >= var11 && (this.field2272[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if ((var9 - arg0) == var10 && var11 >= var12 && var13 >= var11) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 >= var12 && var11 <= var13 && (this.field2272[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var11 - arg0 == var12 && (this.field2272[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg0) == var10 && var11 >= var12 && var11 <= var13 && (this.field2272[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var13) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var11 - arg0 == var12 && (this.field2272[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg0) == var10 && var12 <= var11 && var11 <= var13 && (this.field2272[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var14 >= var9 && (var11 + 1) == var12 && (this.field2272[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var11 - arg0) == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - arg0) == var10 && var12 <= var11 && var11 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && (var11 + 1) == var12 && (this.field2272[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 <= var11 && var11 <= var13 && (this.field2272[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var11 - arg0) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 >= var10 && var14 >= var9 && var11 + 1 == var12 && (this.field2272[var9][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var14 && (var11 - arg0) == var12 && (this.field2272[var9][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg0) == var10 && var11 >= var12 && var13 >= var11 && (this.field2272[var14][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 <= var11 && var13 >= var11 && (this.field2272[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljd;IILik;)V")
    public static final void method863(class87 arg0, int arg1, int arg2, class261 arg3) {
        class251 var4 = new class251();
        var4.field4331 = arg3.method1693((byte) -120);
        var4.field4336 = arg3.method1712(-4);
        field2274++;
        var4.field4346 = new class275[var4.field4331];
        var4.field4327 = new class275[var4.field4331];
        var4.field4334 = new int[var4.field4331];
        var4.field4335 = new int[var4.field4331];
        var4.field4333 = new byte[var4.field4331][][];
        var4.field4326 = new int[var4.field4331];
        if (arg1 > -66) {
            return;
        }
        for (int var5 = 0; var5 < var4.field4331; var5++) {
            try {
                int var6 = arg3.method1693((byte) 70);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method1705(118).method703((byte) 115));
                    int var8 = 0;
                    String var9 = new String(arg3.method1705(-38).method703((byte) 127));
                    if (var6 == 1) {
                        var8 = arg3.method1712(-4);
                    }
                    var4.field4326[var5] = var6;
                    var4.field4334[var5] = var8;
                    var4.field4327[var5] = arg0.method596(var9, class3.method14(-74, var7), 83);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method1705(120).method703((byte) 127));
                    String var11 = new String(arg3.method1705(27).method703((byte) 125));
                    int var12 = arg3.method1693((byte) -95);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method1705(115).method703((byte) 118));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1712(-4);
                            var15[var16] = new byte[var17];
                            arg3.method1698(var15[var16], var17, -6215, 0);
                        }
                    }
                    var4.field4326[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class3.method14(65, var13[var19]);
                    }
                    var4.field4346[var5] = arg0.method597(var11, class3.method14(30, var10), var18, 0);
                    var4.field4333[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4335[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4335[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4335[var5] = -3;
            } catch (Exception var23) {
                var4.field4335[var5] = -4;
            } catch (Throwable var24) {
                var4.field4335[var5] = -5;
            }
        }
        class185.field3280.method536(var4, (byte) -113);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public final void method864(byte arg0) {
        field2278++;
        int var2 = 0;
        if (arg0 > -47) {
            this.method875(-91, true, -95, 100, 23, 92);
        }
        while (var2 < this.field2285) {
            for (int var3 = 0; var3 < this.field2300; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2285 - 5 <= var2 || this.field2300 - 5 <= var3) {
                    this.field2272[var2][var3] = 16777215;
                } else {
                    this.field2272[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIB)Z")
    private final boolean method865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 != -115) {
            this.method864((byte) 117);
        }
        field2276++;
        if (arg4 < (arg0 + arg6) && (arg4 + arg7) > arg6) {
            return arg1 + arg3 > arg5 && arg2 + arg5 > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public final void method866(int arg0, int arg1, int arg2) {
        field2280++;
        int var4 = arg2 - this.field2282;
        int var5 = arg1 - this.field2293;
        this.field2272[var5][var4] = class179.method1194(this.field2272[var5][var4], 2097152);
        if (arg0 != -12585) {
            this.method867(47, (byte) 127, 38, -26, 29, 54, 122, -120, -121);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIIIIII)Z")
    public final boolean method867(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2297++;
        if (arg1 != -12) {
            return true;
        } else if (arg5 > 1) {
            return this.method865(arg3, arg2, arg5, arg4, arg6, arg8, arg7, arg5, (byte) -115) ? true : this.method874(arg8, arg3, arg7, true, arg5, arg6, arg4, arg0, arg5, arg2);
        } else {
            int var10 = arg4 + arg2 - 1;
            int var11 = arg7 + arg3 - 1;
            if (arg6 >= arg7 && var11 >= arg6 && arg2 <= arg8 && var10 >= arg8) {
                return true;
            } else if ((arg7 - 1) == arg6 && arg8 >= arg2 && arg8 <= var10 && (this.field2272[arg6 - this.field2293][arg8 - this.field2282] & 0x8) == 0 && (arg0 & 0x8) == 0) {
                return true;
            } else if (var11 + 1 == arg6 && arg8 >= arg2 && var10 >= arg8 && (this.field2272[arg6 - this.field2293][arg8 - this.field2282] & 0x80) == 0 && (arg0 & 0x2) == 0) {
                return true;
            } else if (arg2 - 1 == arg8 && arg7 <= arg6 && var11 >= arg6 && (this.field2272[arg6 - this.field2293][arg8 - this.field2282] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return (var10 + 1) == arg8 && arg7 <= arg6 && arg6 <= var11 && (this.field2272[arg6 - this.field2293][arg8 - this.field2282] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
    public final void method868(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2293;
        field2289++;
        if (arg0 == 15300) {
            int var5 = arg1 - this.field2282;
            this.field2272[var4][var5] = class179.method1194(this.field2272[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[B")
    public static final byte[] method869(int arg0, int arg1) {
        class81 var2 = (class81) class174.field3069.method512((byte) 122, (long) arg1);
        if (arg0 != 255) {
            method863((class87) null, -86, 115, (class261) null);
        }
        field2284++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class88.method606(var4, var7, false);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class81(var3);
            class174.field3069.method511(96, var2, (long) arg1);
        }
        return var2.field1430;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
    private final void method870(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -121) {
            this.method875(-126, false, 111, 6, 119, 93);
        }
        field2287++;
        this.field2272[arg0][arg3] = class179.method1194(this.field2272[arg0][arg3], arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZIBI)V")
    public final void method871(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field2301++;
        int var7 = arg0 - this.field2282;
        int var8 = arg3 - this.field2293;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method870(var8, 128, arg4 ^ 0xFFFFFFC7, var7);
                this.method870(var8 - 1, 8, -122, var7);
            }
            if (arg1 == 1) {
                this.method870(var8, 2, -123, var7);
                this.method870(var8, 32, -128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method870(var8, 8, arg4 ^ 0xFFFFFFC2, var7);
                this.method870(var8 + 1, 128, -128, var7);
            }
            if (arg1 == 3) {
                this.method870(var8, 32, -127, var7);
                this.method870(var8, 2, -124, var7 - 1);
            }
        }
        if (arg4 != 68) {
            this.method864((byte) -72);
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method870(var8, 1, -124, var7);
                this.method870(var8 - 1, 16, -123, var7 + 1);
            }
            if (arg1 == 1) {
                this.method870(var8, 4, -126, var7);
                this.method870(var8 + 1, 64, -123, var7 + 1);
            }
            if (arg1 == 2) {
                this.method870(var8, 16, arg4 - 195, var7);
                this.method870(var8 + 1, 1, -128, var7 - 1);
            }
            if (arg1 == 3) {
                this.method870(var8, 64, -125, var7);
                this.method870(var8 - 1, 4, -124, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method870(var8, 130, -126, var7);
                this.method870(var8 - 1, 8, -128, var7);
                this.method870(var8, 32, arg4 ^ 0xFFFFFFC6, var7 + 1);
            }
            if (arg1 == 1) {
                this.method870(var8, 10, arg4 - 194, var7);
                this.method870(var8, 32, -122, var7 + 1);
                this.method870(var8 + 1, 128, -122, var7);
            }
            if (arg1 == 2) {
                this.method870(var8, 40, arg4 - 191, var7);
                this.method870(var8 + 1, 128, arg4 ^ 0xFFFFFFC6, var7);
                this.method870(var8, 2, -128, var7 - 1);
            }
            if (arg1 == 3) {
                this.method870(var8, 160, -122, var7);
                this.method870(var8, 2, -125, var7 - 1);
                this.method870(var8 - 1, 8, -127, var7);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method870(var8, 65536, -123, var7);
                this.method870(var8 - 1, 4096, -124, var7);
            }
            if (arg1 == 1) {
                this.method870(var8, 1024, -124, var7);
                this.method870(var8, 16384, -126, var7 + 1);
            }
            if (arg1 == 2) {
                this.method870(var8, 4096, -123, var7);
                this.method870(var8 + 1, 65536, -122, var7);
            }
            if (arg1 == 3) {
                this.method870(var8, 16384, -128, var7);
                this.method870(var8, 1024, -125, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method870(var8, 512, arg4 - 195, var7);
                this.method870(var8 - 1, 8192, -125, var7 + 1);
            }
            if (arg1 == 1) {
                this.method870(var8, 2048, -125, var7);
                this.method870(var8 + 1, 32768, -128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method870(var8, 8192, -126, var7);
                this.method870(var8 + 1, 512, -124, var7 - 1);
            }
            if (arg1 == 3) {
                this.method870(var8, 32768, -127, var7);
                this.method870(var8 - 1, 2048, arg4 - 193, var7 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method870(var8, 66560, -128, var7);
            this.method870(var8 - 1, 4096, -126, var7);
            this.method870(var8, 16384, arg4 ^ 0xFFFFFFC4, var7 + 1);
        }
        if (arg1 == 1) {
            this.method870(var8, 5120, -128, var7);
            this.method870(var8, 16384, -124, var7 + 1);
            this.method870(var8 + 1, 65536, -127, var7);
        }
        if (arg1 == 2) {
            this.method870(var8, 20480, -126, var7);
            this.method870(var8 + 1, 65536, -124, var7);
            this.method870(var8, 1024, arg4 ^ 0xFFFFFFC7, var7 - 1);
        }
        if (arg1 == 3) {
            this.method870(var8, 81920, -124, var7);
            this.method870(var8, 1024, arg4 - 191, var7 - 1);
            this.method870(var8 - 1, 4096, arg4 ^ 0xFFFFFFC5, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V")
    private final void method872(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8291) {
            field2283 = -126;
        }
        field2288++;
        this.field2272[arg2][arg0] = class71.method502(this.field2272[arg2][arg0], ~arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)V")
    public final void method873(int arg0, int arg1, byte arg2) {
        field2290++;
        if (arg2 != 15) {
            this.method866(-53, 104, -67);
        }
        int var4 = arg0 - this.field2282;
        int var5 = arg1 - this.field2293;
        this.field2272[var5][var4] = class71.method502(this.field2272[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZIIIIII)Z")
    private final boolean method874(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg4;
        field2296++;
        int var12 = arg5 + arg8;
        int var13 = arg2 + arg1;
        if (!arg3) {
            return false;
        }
        int var14 = arg6 + arg9;
        if (arg5 >= arg2 && arg5 < var13) {
            if (arg9 == var11 && (arg7 & 0x4) == 0) {
                int var15 = var12 <= var13 ? var12 : var13;
                for (int var16 = arg5; var16 < var15; var16++) {
                    if ((this.field2272[var16 - this.field2293][var11 - (this.field2282 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var12 > var13 ? var13 : var12;
                while (var17 < var18) {
                    if ((this.field2272[var17 - this.field2293][arg0 - this.field2282] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg2 < var12 && var13 >= var12) {
            if (arg9 == var11 && (arg7 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var12; var19++) {
                    if ((this.field2272[var19 - this.field2293][var11 - this.field2282 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var12; var20++) {
                    if ((this.field2272[var20 - this.field2293][arg0 - this.field2282] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 <= arg0 && arg0 < var14) {
            if (arg2 == var12 && (arg7 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var14 >= var11 ? var11 : var14;
                while (var22 > var21) {
                    if ((this.field2272[var12 - this.field2293 - 1][var21 - this.field2282] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var13 && (arg7 & 0x2) == 0) {
                int var23 = arg0;
                int var24 = var14 >= var11 ? var11 : var14;
                while (var23 < var24) {
                    if ((this.field2272[arg5 - this.field2293][var23 - this.field2282] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg9 && var14 >= var11) {
            if (arg2 == var12 && (arg7 & 0x8) == 0) {
                for (int var25 = arg9; var25 < var11; var25++) {
                    if ((this.field2272[var12 - this.field2293 - 1][var25 - this.field2282] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var13 && (arg7 & 0x2) == 0) {
                for (int var26 = arg9; var26 < var11; var26++) {
                    if ((this.field2272[arg5 - this.field2293][var26 - this.field2282] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZIIII)V")
    public final void method875(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2299++;
        int var7 = arg2 - this.field2293;
        int var8 = 256;
        if (arg4 != -31002) {
            this.method864((byte) 90);
        }
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field2282;
        for (int var10 = var7; var10 < arg0 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field2285) {
                for (int var11 = var9; var11 < (arg5 + var9); var11++) {
                    if (var11 >= 0 && this.field2300 > var11) {
                        this.method870(var10, var8, -128, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZIII)V")
    public final void method876(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field2293;
        int var9 = arg4 - this.field2282;
        if (arg5 != 17271) {
            field2294 = null;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg0;
            arg0 = arg1;
            arg1 = var10;
        }
        int var11 = 256;
        field2292++;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg0 + var8; var12++) {
            if (var12 >= 0 && this.field2285 > var12) {
                for (int var13 = var9; var13 < (arg1 + var9); var13++) {
                    if (var13 >= 0 && this.field2300 > var13) {
                        this.method872(var13, var11, var12, arg5 - 8980);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2298++;
        if (arg5 == 1) {
            if (arg3 == arg7 && arg2 == arg6) {
                return true;
            }
        } else if (arg3 >= arg7 && arg3 <= arg7 + arg5 - 1 && arg6 <= arg6 && arg5 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg3 - this.field2293;
        if (arg4 != 0) {
            return true;
        }
        int var10 = arg6 - this.field2282;
        int var11 = arg2 - this.field2282;
        int var12 = arg7 - this.field2293;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field2272[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field2272[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field2272[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field2272[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field2272[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field2272[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field2272[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var12 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field2272[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg5) == var11 && (this.field2272[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg5 == var12 && var11 <= var10 && var10 <= var14 && (this.field2272[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 - arg5) == var11 && (this.field2272[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - arg5) == var12 && var10 >= var11 && var14 >= var10 && (this.field2272[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field2272[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field2272[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field2272[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field2272[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && (var10 - arg5) == var11 && (this.field2272[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg5) == var12 && var11 <= var10 && var10 <= var14 && (this.field2272[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field2272[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(II)V")
    public class131(int arg0, int arg1) {
        this.field2300 = arg1;
        this.field2285 = arg0;
        this.field2272 = new int[this.field2285][this.field2300];
        this.method864((byte) -86);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method878(boolean arg0) {
        field2275 = null;
        if (!arg0) {
            method863((class87) null, 80, 118, (class261) null);
        }
        field2295 = null;
        field2281 = null;
        field2277 = null;
        field2291 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILed;)V")
    public static final void method879(int arg0, class183 arg1) {
        if (arg0 != -1) {
            field2294 = null;
        }
        class80 var2 = (class80) class220.field3831.method1550(true, arg1.field3224.method697(-23666));
        field2279++;
        if (var2 == null) {
            return;
        }
        if (var2.field1425 != null) {
            class165.field2899.method1076(var2.field1425);
            var2.field1425 = null;
        }
        var2.method828((byte) 123);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZIBII)V")
    public final void method880(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2286++;
        if (arg3 <= 70) {
            return;
        }
        int var7 = arg4 - this.field2293;
        int var8 = arg5 - this.field2282;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method872(var8, 128, var7, 8291);
                this.method872(var8, 8, var7 - 1, 8291);
            }
            if (arg2 == 1) {
                this.method872(var8, 2, var7, 8291);
                this.method872(var8 + 1, 32, var7, 8291);
            }
            if (arg2 == 2) {
                this.method872(var8, 8, var7, 8291);
                this.method872(var8, 128, var7 + 1, 8291);
            }
            if (arg2 == 3) {
                this.method872(var8, 32, var7, 8291);
                this.method872(var8 - 1, 2, var7, 8291);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method872(var8, 1, var7, 8291);
                this.method872(var8 + 1, 16, var7 - 1, 8291);
            }
            if (arg2 == 1) {
                this.method872(var8, 4, var7, 8291);
                this.method872(var8 + 1, 64, var7 + 1, 8291);
            }
            if (arg2 == 2) {
                this.method872(var8, 16, var7, 8291);
                this.method872(var8 - 1, 1, var7 + 1, 8291);
            }
            if (arg2 == 3) {
                this.method872(var8, 64, var7, 8291);
                this.method872(var8 - 1, 4, var7 - 1, 8291);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method872(var8, 130, var7, 8291);
                this.method872(var8, 8, var7 - 1, 8291);
                this.method872(var8 + 1, 32, var7, 8291);
            }
            if (arg2 == 1) {
                this.method872(var8, 10, var7, 8291);
                this.method872(var8 + 1, 32, var7, 8291);
                this.method872(var8, 128, var7 + 1, 8291);
            }
            if (arg2 == 2) {
                this.method872(var8, 40, var7, 8291);
                this.method872(var8, 128, var7 + 1, 8291);
                this.method872(var8 - 1, 2, var7, 8291);
            }
            if (arg2 == 3) {
                this.method872(var8, 160, var7, 8291);
                this.method872(var8 - 1, 2, var7, 8291);
                this.method872(var8, 8, var7 - 1, 8291);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method872(var8, 65536, var7, 8291);
                this.method872(var8, 4096, var7 - 1, 8291);
            }
            if (arg2 == 1) {
                this.method872(var8, 1024, var7, 8291);
                this.method872(var8 + 1, 16384, var7, 8291);
            }
            if (arg2 == 2) {
                this.method872(var8, 4096, var7, 8291);
                this.method872(var8, 65536, var7 + 1, 8291);
            }
            if (arg2 == 3) {
                this.method872(var8, 16384, var7, 8291);
                this.method872(var8 - 1, 1024, var7, 8291);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method872(var8, 512, var7, 8291);
                this.method872(var8 + 1, 8192, var7 - 1, 8291);
            }
            if (arg2 == 1) {
                this.method872(var8, 2048, var7, 8291);
                this.method872(var8 + 1, 32768, var7 + 1, 8291);
            }
            if (arg2 == 2) {
                this.method872(var8, 8192, var7, 8291);
                this.method872(var8 - 1, 512, var7 + 1, 8291);
            }
            if (arg2 == 3) {
                this.method872(var8, 32768, var7, 8291);
                this.method872(var8 - 1, 2048, var7 - 1, 8291);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method872(var8, 66560, var7, 8291);
            this.method872(var8, 4096, var7 - 1, 8291);
            this.method872(var8 + 1, 16384, var7, 8291);
        }
        if (arg2 == 1) {
            this.method872(var8, 5120, var7, 8291);
            this.method872(var8 + 1, 16384, var7, 8291);
            this.method872(var8, 65536, var7 + 1, 8291);
        }
        if (arg2 == 2) {
            this.method872(var8, 20480, var7, 8291);
            this.method872(var8, 65536, var7 + 1, 8291);
            this.method872(var8 - 1, 1024, var7, 8291);
        }
        if (arg2 == 3) {
            this.method872(var8, 81920, var7, 8291);
            this.method872(var8 - 1, 1024, var7, 8291);
            this.method872(var8, 4096, var7 - 1, 8291);
            return;
        }
    }
}
