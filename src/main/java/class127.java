import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class127 {

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lke;")
    private class101 field2299 = new class101();

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lq;")
    private class150 field2301 = new class150();

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    private int field2303;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lah;")
    private class9 field2300;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ltg;")
    private static class184 field2276 = class135.method812("Starting game engine)3)3)3", 3);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ltg;")
    public static class184 field2278 = field2276;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Ltg;")
    public static class184 field2288 = class135.method812("Benutzen", 3);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Ltg;")
    private static class184 field2291 = class135.method812("Please enter your password)3", 3);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ltg;")
    private static class184 field2280 = class135.method812("Ok", 3);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Ltg;")
    public static class184 field2283 = class135.method812("Weiter", 3);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ltg;")
    public static class184 field2296 = field2280;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Ltg;")
    public static class184 field2292 = null;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Ltg;")
    public static class184 field2285 = field2291;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Ltg;")
    private static class184 field2297 = class135.method812("Error loading your profile)3", 3);

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Ltg;")
    public static class184 field2304 = field2297;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method763(int arg0, int arg1) {
        field2295++;
        class36 var2 = (class36) class179.field3417.method51((long) arg1, -104);
        if (var2 == null) {
            return;
        }
        int var3 = -32 % ((-arg0 - 20) / 32);
        for (int var4 = 0; var4 < var2.field681.length; var4++) {
            var2.field681[var4] = -1;
            var2.field680[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method764(Throwable arg0, boolean arg1) throws IOException {
        String var3;
        if (arg0 instanceof class196) {
            class196 var2 = (class196) arg0;
            arg0 = var2.field3807;
            var3 = var2.field3804 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        field2289++;
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (arg1) {
                        return null;
                    }
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
    public static final int method765(int arg0) {
        if (arg0 != 6) {
            field2296 = null;
        }
        field2286++;
        return 6;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public static final boolean method766(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class135.field2464; var3++) {
            class194 var4 = class177.field3382[var3];
            if (var4.field3755 == 1) {
                int var5 = var4.field3772 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3759 * var5 >> 8) + var4.field3771;
                    int var7 = (var4.field3753 * var5 >> 8) + var4.field3749;
                    int var8 = (var4.field3751 * var5 >> 8) + var4.field3752;
                    int var9 = (var4.field3748 * var5 >> 8) + var4.field3768;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3755 == 2) {
                int var10 = arg0 - var4.field3772;
                if (var10 > 0) {
                    int var11 = (var4.field3759 * var10 >> 8) + var4.field3771;
                    int var12 = (var4.field3753 * var10 >> 8) + var4.field3749;
                    int var13 = (var4.field3751 * var10 >> 8) + var4.field3752;
                    int var14 = (var4.field3748 * var10 >> 8) + var4.field3768;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3755 == 3) {
                int var15 = var4.field3771 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3761 * var15 >> 8) + var4.field3772;
                    int var17 = (var4.field3750 * var15 >> 8) + var4.field3762;
                    int var18 = (var4.field3751 * var15 >> 8) + var4.field3752;
                    int var19 = (var4.field3748 * var15 >> 8) + var4.field3768;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3755 == 4) {
                int var20 = arg2 - var4.field3771;
                if (var20 > 0) {
                    int var21 = (var4.field3761 * var20 >> 8) + var4.field3772;
                    int var22 = (var4.field3750 * var20 >> 8) + var4.field3762;
                    int var23 = (var4.field3751 * var20 >> 8) + var4.field3752;
                    int var24 = (var4.field3748 * var20 >> 8) + var4.field3768;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3755 == 5) {
                int var25 = arg1 - var4.field3752;
                if (var25 > 0) {
                    int var26 = (var4.field3761 * var25 >> 8) + var4.field3772;
                    int var27 = (var4.field3750 * var25 >> 8) + var4.field3762;
                    int var28 = (var4.field3759 * var25 >> 8) + var4.field3771;
                    int var29 = (var4.field3753 * var25 >> 8) + var4.field3749;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method767(int arg0) {
        field2297 = null;
        field2296 = null;
        if (arg0 < 66) {
            field2296 = null;
        }
        field2291 = null;
        field2276 = null;
        field2288 = null;
        field2280 = null;
        field2285 = null;
        field2283 = null;
        field2292 = null;
        field2304 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Lwa;II[I[I)V")
    public static final void method768(int arg0, class205[] arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        field2298++;
        if (arg0 > arg2) {
            int var6 = arg0 + 1;
            int var7 = arg2 - 1;
            int var8 = (arg0 + arg2) / 2;
            class205 var9 = arg1[var8];
            arg1[var8] = arg1[arg2];
            arg1[arg2] = var9;
            while (var7 < var6) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg5[var11] == 2) {
                            var13 = arg1[var6].field3942;
                            var12 = var9.field3942;
                        } else if (arg5[var11] == 1) {
                            var13 = arg1[var6].field3946;
                            var12 = var9.field3946;
                            if (var12 == -1 && arg4[var11] == 1) {
                                var12 = 2001;
                            }
                            if (var13 == -1 && arg4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg5[var11] == 3) {
                            var12 = var9.field3947 ? 1 : 0;
                            var13 = arg1[var6].field3947 ? 1 : 0;
                        } else {
                            var12 = var9.field3941;
                            var13 = arg1[var6].field3941;
                        }
                        if (var12 != var13) {
                            if ((arg4[var11] != 1 || var13 <= var12) && (arg4[var11] != 0 || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var7++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg5[var15] == 2) {
                            var16 = arg1[var7].field3942;
                            var17 = var9.field3942;
                        } else if (arg5[var15] == 1) {
                            var16 = arg1[var7].field3946;
                            var17 = var9.field3946;
                            if (var16 == -1 && arg4[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg4[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg5[var15] == 3) {
                            var17 = var9.field3947 ? 1 : 0;
                            var16 = arg1[var7].field3947 ? 1 : 0;
                        } else {
                            var16 = arg1[var7].field3941;
                            var17 = var9.field3941;
                        }
                        if (var16 != var17) {
                            if ((arg4[var15] != 1 || var17 <= var16) && (arg4[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 < var6) {
                    class205 var18 = arg1[var7];
                    arg1[var7] = arg1[var6];
                    arg1[var6] = var18;
                }
            }
            method768(var6, arg1, arg2, 0, arg4, arg5);
            method768(arg0, arg1, var6 + 1, 0, arg4, arg5);
        }
        if (arg3 != 0) {
            method771((byte) 74, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lo;")
    public final class132 method769(int arg0) {
        if (arg0 != -21217) {
            method767(-69);
        }
        field2282++;
        return this.field2300.method57(arg0 + 1563);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public final void method770(boolean arg0) {
        while (true) {
            class101 var2 = this.field2301.method920((byte) -126);
            if (var2 == null) {
                if (arg0) {
                    field2278 = null;
                }
                this.field2303 = this.field2305;
                field2284++;
                return;
            }
            var2.method797((byte) -118);
            var2.method628((byte) 101);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLof;)V")
    public static final void method771(byte arg0, class138 arg1) {
        if (arg0 == 4) {
            field2302++;
            class118.field2131 = arg1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ltg;II)V")
    public static final void method772(class184 arg0, int arg1, int arg2) {
        field2294++;
        class184 var3 = arg0.method1138(40).method1147(true);
        boolean var4 = false;
        if (arg1 != -2) {
            return;
        }
        for (int var5 = 0; var5 < class26.field466; var5++) {
            class67 var6 = class57.field1024[class200.field3880[var5]];
            if (var6 != null && var6.field1299 != null && var6.field1299.method1150(var3, arg1 - 114)) {
                var4 = true;
                class157.method952(arg1 + 19661186, false, 1, 0, 2, 1, class46.field872.field644[0], var6.field644[0], class46.field872.field615[0], var6.field615[0], 0, 0);
                if (arg2 == 1) {
                    class117.field2109++;
                    class117.field2122.method106(34, -117);
                    class117.field2122.method597(class200.field3880[var5], arg1 + 2);
                } else if (arg2 == 4) {
                    class153.field2743++;
                    class117.field2122.method106(218, 87);
                    class117.field2122.method589((byte) -122, class200.field3880[var5]);
                } else if (arg2 == 6) {
                    class212.field4112++;
                    class117.field2122.method106(68, arg1 + 39);
                    class117.field2122.method589((byte) -121, class200.field3880[var5]);
                } else if (arg2 == 7) {
                    class83.field1482++;
                    class117.field2122.method106(81, -118);
                    class117.field2122.method573(-120, class200.field3880[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class149.method914(0, class144.method884(0, new class184[] { class34.field593, var3 }), class170.field3242, arg1 + 124);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)Lke;")
    public final class101 method773(long arg0, int arg1) {
        if (arg1 != 1) {
            this.method769(-49);
        }
        field2293++;
        class101 var4 = (class101) this.field2300.method51(arg0, arg1 ^ 0x44);
        if (var4 != null) {
            this.field2301.method921(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V")
    public final void method774(int arg0, long arg1) {
        class101 var4 = (class101) this.field2300.method51(arg1, arg0 ^ 0xFFFFFFA2);
        if (arg0 != 2) {
            field2278 = null;
        }
        field2287++;
        if (var4 != null) {
            var4.method797((byte) -112);
            var4.method628((byte) 66);
            this.field2303++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lo;")
    public final class132 method775(byte arg0) {
        field2279++;
        if (arg0 >= -78) {
            field2297 = null;
        }
        return this.field2300.method49(1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lke;JB)V")
    public final void method776(class101 arg0, long arg1, byte arg2) {
        if (this.field2303 == 0) {
            class101 var5 = this.field2301.method920((byte) -126);
            var5.method797((byte) -123);
            var5.method628((byte) 85);
            if (this.field2299 == var5) {
                class101 var6 = this.field2301.method920((byte) -126);
                var6.method797((byte) -104);
                var6.method628((byte) -121);
            }
        } else {
            this.field2303--;
        }
        this.field2300.method55((byte) -74, arg0, arg1);
        this.field2301.method921(0, arg0);
        field2290++;
        int var7 = -69 % ((arg2 - 31) / 41);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)Z")
    public static final boolean method777(int arg0, int arg1, int arg2) {
        int var3 = class19.field372[arg0][arg1][arg2];
        if (-class103.field1884 == var3) {
            return false;
        } else if (class103.field1884 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (method766(var4 + 1, class131.field2380[arg0][arg1][arg2], var5 + 1) && method766(var4 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg2], var5 + 1) && method766(var4 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && method766(var4 + 1, class131.field2380[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class19.field372[arg0][arg1][arg2] = class103.field1884;
                return true;
            } else {
                class19.field372[arg0][arg1][arg2] = -class103.field1884;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field2303 = arg0;
        this.field2305 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2300 = new class9(var2);
    }
}
