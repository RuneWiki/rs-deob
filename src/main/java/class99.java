import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class99 implements class124 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
    private boolean field2384 = true;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Loc;")
    private static class99 field2373 = class48.method402((byte) -104, "Username: ");

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "[I")
    public static int[] field2369 = new int[25];

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "Loc;")
    public static class99 field2399 = field2373;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Loc;")
    private static class99 field2389 = class48.method402((byte) -104, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Loc;")
    private static class99 field2407 = class48.method402((byte) -104, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "Loc;")
    private static class99 field2409 = class48.method402((byte) -104, "To create a new account you need to");

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Loc;")
    public static class99 field2400 = field2389;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Loc;")
    public static class99 field2387 = field2407;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Loc;")
    public static class99 field2402 = class48.method402((byte) -104, "invback");

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    public static int field2411 = -1;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "Loc;")
    public static class99 field2414 = field2409;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lef;")
    public static class35 field2372;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field2417;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "[B")
    public byte[] field2394;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Loc;")
    public final class99 method809(byte arg0) {
        field2412++;
        if (!this.field2384) {
            throw new IllegalArgumentException();
        }
        this.field2361 = 0;
        if (this.field2394.length != this.field2391) {
            byte[] var2 = new byte[this.field2391];
            class116.method990(this.field2394, 0, var2, 0, this.field2391);
            this.field2394 = var2;
        }
        return arg0 < 120 ? null : this;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public final int method810(int arg0) {
        field2380++;
        return arg0 == -58 ? this.field2391 : -2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Loc;")
    public final class99 method811(int arg0, int arg1) {
        field2367++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field2384) {
            this.field2361 = arg0;
            if (this.field2394.length == this.field2391) {
                int var3;
                for (var3 = 1; var3 <= this.field2391; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class116.method990(this.field2394, 0, var4, 0, this.field2391);
                this.field2394 = var4;
            }
            this.field2394[this.field2391++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)J")
    private final long method812(int arg0) {
        field2382++;
        if (arg0 != -1748) {
            field2409 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2391; var4++) {
            var2 = (var2 << 5) + (long) (this.field2394[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Loc;")
    public final class99 method813(int arg0, byte arg1) {
        int var3 = 11 / ((arg1 - 32) / 51);
        field2352++;
        return this.method840(arg0, 92, this.field2391);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method814(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field2394, 0, this.field2391, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2394, 0, this.field2391);
        }
        if (arg0 > -105) {
            return 77;
        } else {
            field2374++;
            return arg1.stringWidth(var3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2378++;
        if (!(arg0 instanceof class99)) {
            throw new IllegalArgumentException();
        }
        return this.method829((class99) arg0, 4);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)I")
    public final int method815(int arg0, boolean arg1) {
        field2403++;
        return arg1 ? this.method821(-32184, 0, arg0) : 100;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILee;ILae;III)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, class34 arg4, int arg5, class6 arg6, int arg7, int arg8, int arg9) {
        int var10 = class121.field2964[arg3][arg1][arg2];
        field2359++;
        int var11 = class121.field2964[arg3][arg1 + 1][arg2 + 1];
        int var12 = 90 / ((78 - arg8) / 48);
        int var13 = class121.field2964[arg3][arg1 + 1][arg2];
        int var14 = class121.field2964[arg3][arg1][arg2 + 1];
        class16 var15 = class83.method717(6, arg5);
        int var16 = (arg9 << 6) + arg7;
        if (var15.field389 == 1) {
            var16 += 256;
        }
        int var17 = var10 + var13 + var11 + var14 >> 2;
        int var18 = (arg2 << 7) + arg1 + (arg5 << 14) + 1073741824;
        if (var15.field395 == 0) {
            var18 += Integer.MIN_VALUE;
        }
        if (arg7 == 22) {
            class88 var19;
            if (var15.field405 == -1 && var15.field404 == null) {
                var19 = var15.method163(var10, 22, var14, var11, (byte) -127, arg9, var13);
            } else {
                var19 = new class32(arg5, 22, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method67(arg0, arg1, arg2, var17, var19, var18, var16);
            if (var15.field403 && var15.field395 == 1) {
                arg4.method287(arg2, arg1, 2097152);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class88 var39;
            if (var15.field405 == -1 && var15.field404 == null) {
                var39 = var15.method163(var10, 10, var14, var11, (byte) -128, arg9, var13);
            } else {
                var39 = new class32(arg5, 10, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            if (var39 != null) {
                int var40;
                int var41;
                if (arg9 == 1 || arg9 == 3) {
                    var40 = var15.field425;
                    var41 = var15.field376;
                } else {
                    var40 = var15.field376;
                    var41 = var15.field425;
                }
                int var42 = 0;
                if (arg7 == 11) {
                    var42 += 256;
                }
                arg6.method35(arg0, arg1, arg2, var17, var41, var40, var39, var42, var18, var16);
            }
            if (var15.field403) {
                arg4.method298(var15.field376, var15.field425, var15.field441, (byte) 36, arg1, arg2, arg9);
            }
        } else if (arg7 >= 12) {
            class88 var20;
            if (var15.field405 == -1 && var15.field404 == null) {
                var20 = var15.method163(var10, arg7, var14, var11, (byte) -128, arg9, var13);
            } else {
                var20 = new class32(arg5, arg7, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method35(arg0, arg1, arg2, var17, 1, 1, var20, 0, var18, var16);
            if (var15.field403) {
                arg4.method298(var15.field376, var15.field425, var15.field441, (byte) 36, arg1, arg2, arg9);
            }
        } else if (arg7 == 0) {
            class88 var21;
            if (var15.field405 == -1 && var15.field404 == null) {
                var21 = var15.method163(var10, 0, var14, var11, (byte) -127, arg9, var13);
            } else {
                var21 = new class32(arg5, 0, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method83(arg0, arg1, arg2, var17, var21, null, class87.field2173[arg9], 0, var18, var16);
            if (var15.field403) {
                arg4.method291(arg1, (byte) 12, arg2, arg9, var15.field441, arg7);
            }
        } else if (arg7 == 1) {
            class88 var22;
            if (var15.field405 == -1 && var15.field404 == null) {
                var22 = var15.method163(var10, 1, var14, var11, (byte) -126, arg9, var13);
            } else {
                var22 = new class32(arg5, 1, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method83(arg0, arg1, arg2, var17, var22, null, class95.field2324[arg9], 0, var18, var16);
            if (var15.field403) {
                arg4.method291(arg1, (byte) 12, arg2, arg9, var15.field441, arg7);
            }
        } else if (arg7 == 2) {
            int var23 = arg9 + 1 & 0x3;
            class88 var24;
            class88 var25;
            if (var15.field405 == -1 && var15.field404 == null) {
                var24 = var15.method163(var10, 2, var14, var11, (byte) -125, arg9 + 4, var13);
                var25 = var15.method163(var10, 2, var14, var11, (byte) -125, var23, var13);
            } else {
                var24 = new class32(arg5, 2, arg9 + 4, var10, var13, var11, var14, var15.field405, true, null);
                var25 = new class32(arg5, 2, var23, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method83(arg0, arg1, arg2, var17, var24, var25, class87.field2173[arg9], class87.field2173[var23], var18, var16);
            if (var15.field403) {
                arg4.method291(arg1, (byte) 12, arg2, arg9, var15.field441, arg7);
            }
        } else if (arg7 == 3) {
            class88 var26;
            if (var15.field405 == -1 && var15.field404 == null) {
                var26 = var15.method163(var10, 3, var14, var11, (byte) -125, arg9, var13);
            } else {
                var26 = new class32(arg5, 3, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method83(arg0, arg1, arg2, var17, var26, null, class95.field2324[arg9], 0, var18, var16);
            if (var15.field403) {
                arg4.method291(arg1, (byte) 12, arg2, arg9, var15.field441, arg7);
            }
        } else if (arg7 == 9) {
            class88 var27;
            if (var15.field405 == -1 && var15.field404 == null) {
                var27 = var15.method163(var10, arg7, var14, var11, (byte) -127, arg9, var13);
            } else {
                var27 = new class32(arg5, arg7, arg9, var10, var13, var11, var14, var15.field405, true, null);
            }
            arg6.method35(arg0, arg1, arg2, var17, 1, 1, var27, 0, var18, var16);
            if (var15.field403) {
                arg4.method298(var15.field376, var15.field425, var15.field441, (byte) 36, arg1, arg2, arg9);
            }
        } else {
            if (var15.field423) {
                if (arg9 == 1) {
                    int var28 = var14;
                    var14 = var11;
                    var11 = var13;
                    var13 = var10;
                    var10 = var28;
                } else if (arg9 == 2) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var29;
                    int var30 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg9 == 3) {
                    int var31 = var14;
                    var14 = var10;
                    var10 = var13;
                    var13 = var11;
                    var11 = var31;
                }
            }
            if (arg7 == 4) {
                class88 var32;
                if (var15.field405 == -1 && var15.field404 == null) {
                    var32 = var15.method163(var10, 4, var14, var11, (byte) -128, 0, var13);
                } else {
                    var32 = new class32(arg5, 4, 0, var10, var13, var11, var14, var15.field405, true, null);
                }
                arg6.method57(arg0, arg1, arg2, var17, var32, class87.field2173[arg9], arg9 * 512, 0, 0, var18, var16);
            } else if (arg7 == 5) {
                int var33 = arg6.method85(arg0, arg1, arg2);
                int var34 = 16;
                if (var33 != 0) {
                    var34 = class83.method717(6, var33 >> 14 & 0x7FFF).field430;
                }
                class88 var35;
                if (var15.field405 == -1 && var15.field404 == null) {
                    var35 = var15.method163(var10, 4, var14, var11, (byte) -127, 0, var13);
                } else {
                    var35 = new class32(arg5, 4, 0, var10, var13, var11, var14, var15.field405, true, null);
                }
                arg6.method57(arg0, arg1, arg2, var17, var35, class87.field2173[arg9], arg9 * 512, class58.field1522[arg9] * var34, class142.field3513[arg9] * var34, var18, var16);
            } else if (arg7 == 6) {
                class88 var36;
                if (var15.field405 == -1 && var15.field404 == null) {
                    var36 = var15.method163(var10, 4, var14, var11, (byte) -126, 0, var13);
                } else {
                    var36 = new class32(arg5, 4, 0, var10, var13, var11, var14, var15.field405, true, null);
                }
                arg6.method57(arg0, arg1, arg2, var17, var36, 256, arg9, 0, 0, var18, var16);
            } else if (arg7 == 7) {
                class88 var37;
                if (var15.field405 == -1 && var15.field404 == null) {
                    var37 = var15.method163(var10, 4, var14, var11, (byte) -126, 0, var13);
                } else {
                    var37 = new class32(arg5, 4, 0, var10, var13, var11, var14, var15.field405, true, null);
                }
                arg6.method57(arg0, arg1, arg2, var17, var37, 512, arg9, 0, 0, var18, var16);
            } else if (arg7 == 8) {
                class88 var38;
                if (var15.field405 == -1 && var15.field404 == null) {
                    var38 = var15.method163(var10, 4, var14, var11, (byte) -125, 0, var13);
                } else {
                    var38 = new class32(arg5, 4, 0, var10, var13, var11, var14, var15.field405, true, null);
                }
                arg6.method57(arg0, arg1, arg2, var17, var38, 768, arg9, 0, 0, var18, var16);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)[B")
    public final byte[] method817(int arg0) {
        if (arg0 != 65) {
            this.field2391 = -115;
        }
        byte[] var2 = new byte[this.field2391];
        class116.method990(this.field2394, 0, var2, 0, this.field2391);
        field2383++;
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)Z")
    private final boolean method818(int arg0, byte arg1) {
        field2388++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2391; var6++) {
            int var7 = this.field2394[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        if (arg1 == -80) {
            return var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Loc;")
    public final class99 method819(int arg0) {
        field2351++;
        class99 var2 = new class99();
        int var3 = 0;
        int var4 = -95 / ((arg0 - 17) / 56);
        var2.field2394 = new byte[12];
        var2.field2391 = 0;
        for (int var5 = 0; var5 < this.field2391; var5++) {
            if (this.field2394[var5] >= 65 && this.field2394[var5] <= 90) {
                var2.field2394[var3++] = (byte) (this.field2394[var5] + 97 - 65);
                var2.field2391 = var3;
            } else if (this.field2394[var5] >= 97 && this.field2394[var5] <= 122 || this.field2394[var5] >= 48 && this.field2394[var5] <= 57) {
                var2.field2394[var3++] = this.field2394[var5];
                var2.field2391 = var3;
            } else if (var3 > 0) {
                var2.field2394[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Loc;")
    public final class99 method820(boolean arg0) {
        field2356++;
        class99 var2 = new class99();
        byte var3 = 2;
        var2.field2391 = this.field2391;
        var2.field2394 = new byte[this.field2391];
        if (arg0) {
            this.method830(null, -24);
        }
        for (int var4 = 0; var4 < this.field2391; var4++) {
            byte var5 = this.field2394[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field2394[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)I")
    private final int method821(int arg0, int arg1, int arg2) {
        field2354++;
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field2391; var5++) {
            if (this.field2394[var5] == var4) {
                return var5;
            }
        }
        if (arg0 != -32184) {
            method816(105, 44, -83, 75, null, -110, null, 26, 111, -28);
        }
        return -1;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Ljava/net/URL;")
    public final URL method822(int arg0) throws MalformedURLException {
        field2415++;
        return arg0 == -22688 ? new URL(new String(this.field2394, 0, this.field2391)) : null;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Loc;")
    public final class99 method823(int arg0) {
        field2393++;
        class99 var2 = new class99();
        var2.field2391 = this.field2391;
        var2.field2394 = new byte[this.field2391];
        for (int var3 = arg0; var3 < this.field2391; var3++) {
            byte var4 = this.field2394[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2394[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loc;B)I")
    public final int method824(class99 arg0, byte arg1) {
        int var3;
        if (arg0.field2391 < this.field2391) {
            var3 = arg0.field2391;
        } else {
            var3 = this.field2391;
        }
        field2357++;
        for (int var4 = 0; var4 < var3; var4++) {
            if (class101.field2473[this.field2394[var4] & 0xFF] < class101.field2473[arg0.field2394[var4] & 0xFF]) {
                return -1;
            }
            if (class101.field2473[this.field2394[var4] & 0xFF] > class101.field2473[arg0.field2394[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1 > -29) {
            field2373 = null;
        }
        if (arg0.field2391 > this.field2391) {
            return -1;
        } else if (this.field2391 > arg0.field2391) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(IB)I")
    public final int method825(int arg0, byte arg1) {
        field2398++;
        int var3 = 56 % (-arg1 / 59);
        return this.field2394[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I")
    private final int method826(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field2391 = -98;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field2408++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2391; var6++) {
            int var7 = this.field2394[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static final void method827(int arg0) {
        field2353++;
        try {
            if (class122.field2981 == null) {
                class122.field2981 = new class43(class43.field1058, class20.method189(new class99[] { class11.field256, class137.field3423, class80.field1988 }, 14).method822(-22688));
            } else {
                byte[] var1 = class122.field2981.method368((byte) 25);
                if (var1 != null) {
                    class57 var2 = new class57(var1);
                    class113.field2829 = var2.method506(-1);
                    class5.field104 = new class80[class113.field2829];
                    for (int var3 = 0; var3 < class113.field2829; var3++) {
                        class80 var4 = class5.field104[var3] = new class80();
                        int var5 = var2.method506(-1);
                        var4.field1985 = (var5 & 0x8000) != 0;
                        var4.field1983 = var5 & 0x7FFF;
                        var4.field1979 = var2.method518(261);
                        var4.field1970 = var2.method501(56);
                        var4.field1991 = var3;
                        var4.field1984 = class31.method267(var4.field1979, 2);
                    }
                    class1.method1(class5.field104, (byte) -12, class5.field104.length - 1, class127.field3061, 0, class86.field2141);
                    class4.field72 = true;
                    class122.field2981 = null;
                }
            }
            if (arg0 != 1) {
                method844((byte) 71);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class122.field2981 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field2414 = null;
        field2400 = null;
        field2387 = null;
        field2372 = null;
        field2389 = null;
        field2407 = null;
        field2369 = null;
        if (arg0 < -55) {
            field2402 = null;
            field2373 = null;
            field2409 = null;
            field2399 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loc;I)Z")
    public final boolean method829(class99 arg0, int arg1) {
        if (arg1 != 4) {
            return false;
        }
        field2376++;
        if (arg0 == null) {
            return false;
        } else if (this.field2391 == arg0.field2391) {
            if (!this.field2384 || !arg0.field2384) {
                if (this.field2361 == 0) {
                    this.field2361 = this.method836(-46);
                    if (this.field2361 == 0) {
                        this.field2361 = 1;
                    }
                }
                if (arg0.field2361 == 0) {
                    arg0.field2361 = arg0.method836(-46);
                    if (arg0.field2361 == 0) {
                        arg0.field2361 = 1;
                    }
                }
                if (this.field2361 != arg0.field2361) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2391; var3++) {
                if (this.field2394[var3] != arg0.field2394[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Loc;I)I")
    public final int method830(class99 arg0, int arg1) {
        field2368++;
        if (arg1 != 63) {
            field2407 = null;
        }
        return this.method847(0, arg0, 119);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Loc;")
    public final class99 method831(int arg0, int arg1) {
        field2366++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class99 var3 = new class99();
        var3.field2394 = new byte[this.field2391 + 1];
        var3.field2391 = this.field2391 + 1;
        if (arg0 < 99) {
            this.method850(109);
        }
        class116.method990(this.field2394, 0, var3.field2394, 0, this.field2391);
        var3.field2394[this.field2391] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method832(Graphics arg0, int arg1, int arg2, int arg3) {
        field2375++;
        String var5;
        try {
            var5 = new String(this.field2394, 0, this.field2391, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field2394, 0, this.field2391);
        }
        int var6 = 115 % ((36 - arg3) / 46);
        arg0.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILoc;)Loc;")
    public final class99 method833(int arg0, int arg1, class99 arg2) {
        int var4 = 80 / ((53 - arg1) / 49);
        field2401++;
        if (!this.field2384) {
            throw new IllegalArgumentException();
        } else if (this.field2391 < arg0) {
            throw new IllegalArgumentException();
        } else {
            this.field2361 = 0;
            if (arg2.field2391 + arg0 > this.field2394.length) {
                int var5;
                for (var5 = 1; var5 < arg2.field2391 + arg0; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class116.method990(this.field2394, 0, var6, 0, this.field2391);
                this.field2394 = var6;
            }
            class116.method990(arg2.field2394, 0, this.field2394, arg0, arg2.field2391);
            if (this.field2391 < arg2.field2391 + arg0) {
                this.field2391 = arg2.field2391 + arg0;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)J")
    public final long method834(int arg0) {
        field2385++;
        long var2 = 0L;
        for (int var4 = 0; this.field2391 > var4 && var4 < 12; var4++) {
            byte var5 = this.field2394[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        if (arg0 != -97) {
            this.method826(32, -31);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Loc;B)Loc;")
    public final class99 method835(class99 arg0, byte arg1) {
        field2377++;
        if (!this.field2384) {
            throw new IllegalArgumentException();
        }
        this.field2361 = 0;
        if (this.field2394.length < this.field2391 + arg0.field2391) {
            int var3;
            for (var3 = 1; var3 < this.field2391 + arg0.field2391; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class116.method990(this.field2394, 0, var4, 0, this.field2391);
            this.field2394 = var4;
        }
        class116.method990(arg0.field2394, 0, this.field2394, this.field2391, arg0.field2391);
        if (arg1 == 38) {
            this.field2391 += arg0.field2391;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2360++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)I")
    public final int method836(int arg0) {
        field2405++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2391; var3++) {
            var2 = (this.field2394[var3] & 0xFF) + (var2 << 5) - var2;
        }
        if (arg0 != -46) {
            this.field2384 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)I")
    public final int method837(byte arg0) {
        if (arg0 < 40) {
            field2372 = null;
        }
        field2362++;
        return this.method826(10, 255);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loc;Z)Z")
    public final boolean method838(class99 arg0, boolean arg1) {
        field2370++;
        if (arg0.field2391 > this.field2391) {
            return false;
        }
        int var3 = this.field2391 - arg0.field2391;
        if (!arg1) {
            return false;
        }
        for (int var4 = 0; var4 < arg0.field2391; var4++) {
            if (this.field2394[var3 + var4] != arg0.field2394[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)V")
    public static final void method839(int arg0) {
        field2371++;
        try {
            Graphics var1 = class5.field99.getGraphics();
            class102.field2484.method109(arg0, 4, 0, var1);
            class81.field2019.method109(0, 357, 0, var1);
            class77.field1918.method109(722, 4, arg0, var1);
            class61.field1647.method109(743, 205, 0, var1);
            class87.field2170.method109(0, 0, 0, var1);
            class128.field3139.method109(516, 4, 0, var1);
            class104.field2534.method109(516, 205, 0, var1);
            class36.field926.method109(496, 357, 0, var1);
            class130.field3200.method109(0, 338, 0, var1);
        } catch (Exception var2) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)Loc;")
    public final class99 method840(int arg0, int arg1, int arg2) {
        int var4 = -34 / ((-arg1 - 16) / 56);
        field2381++;
        class99 var5 = new class99();
        var5.field2391 = arg2 - arg0;
        var5.field2394 = new byte[arg2 - arg0];
        class116.method990(this.field2394, arg0, var5.field2394, 0, var5.field2391);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)Loc;")
    public final class99 method841(int arg0) {
        field2363++;
        if (arg0 <= 64) {
            this.field2391 = -5;
        }
        long var2 = this.method812(-1748);
        synchronized (field2417 == null ? (field2417 = method855("oc")) : field2417) {
            if (class138.field3450 == null) {
                class138.field3450 = new class119(4096);
            } else {
                for (class97 var5 = (class97) class138.field3450.method1001(var2, (byte) 118); var5 != null; var5 = (class97) class138.field3450.method1004(122)) {
                    if (this.method829(var5.field2343, 4)) {
                        return var5.field2343;
                    }
                }
            }
            class97 var7 = new class97();
            var7.field2343 = this;
            this.field2384 = false;
            class138.field3450.method1006(var2, var7, -126);
            return this;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIII)I")
    public final int method842(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            class116.method990(this.field2394, arg3, arg0, arg4, arg2 - arg3);
            field2390++;
            return arg2 - arg3;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lhe;Z)V")
    public static final void method843(class54 arg0, boolean arg1) {
        field2416++;
        if (arg1) {
            method848(-111, -84);
        }
        int var2 = arg0.field1293 >> 16;
        if (class87.field2162 == var2 || class127.field3110 == var2) {
            class113.field2832 = true;
        }
        if (class27.field679 == var2 || class134.field3301[class57.field1473] == var2) {
            class52.field1243 = true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2364++;
        return this.method836(-46);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
    public static final void method844(byte arg0) {
        class43.field1054.method998(true);
        field2392++;
        class122.field2977.method998(true);
        class133.field3249.method998(true);
        class70.field1791.method998(true);
        if (arg0 != -118) {
            method844((byte) -128);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Loc;I)Z")
    public final boolean method845(class99 arg0, int arg1) {
        field2406++;
        if (arg0 == null) {
            return false;
        } else if (this.field2391 == arg0.field2391) {
            if (arg1 != 63) {
                this.method812(-117);
            }
            for (int var3 = 0; var3 < this.field2391; var3++) {
                byte var4 = this.field2394[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field2394[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "(I)Loc;")
    public final class99 method846(int arg0) {
        field2386++;
        int var2 = 0;
        int var3 = this.field2391;
        while (var2 < this.field2391 && (this.field2394[var2] >= 0 && this.field2394[var2] <= 32 || (this.field2394[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field2394[var3 - 1] >= 0 && this.field2394[var3 - 1] <= 32 || (this.field2394[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field2391 == var3) {
            return this;
        }
        class99 var4 = new class99();
        var4.field2391 = var3 - var2;
        var4.field2394 = new byte[var4.field2391];
        int var5 = 0;
        if (arg0 != -1) {
            field2372 = null;
        }
        while (var5 < var4.field2391) {
            var4.field2394[var5] = this.field2394[var2 + var5];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILoc;I)I")
    private final int method847(int arg0, class99 arg1, int arg2) {
        int[] var4 = new int[arg1.field2391];
        int[] var5 = new int[arg1.field2391];
        field2410++;
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg1.field2391;
        }
        for (int var8 = 1; var8 <= arg1.field2391; var8++) {
            var5[var8 - 1] = (arg1.field2391 << 1) - var8;
            var6[class17.method171(255, arg1.field2394[var8 - 1])] = arg1.field2391 - var8;
        }
        int var9 = arg1.field2391 + 1;
        int var10 = -99 / ((61 - arg2) / 42);
        int var11 = arg1.field2391;
        while (var11 > 0) {
            var4[var11 - 1] = var9;
            while (var9 <= arg1.field2391 && arg1.field2394[var9 - 1] != arg1.field2394[var11 - 1]) {
                if (arg1.field2391 - var11 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg1.field2391 - var11;
                }
                var9 = var4[var9 - 1];
            }
            var11--;
            var9--;
        }
        int var12 = 0;
        int var13 = 1;
        int var14 = var9;
        int var15 = arg1.field2391 + 1 - var9;
        for (int var16 = 1; var16 <= var15; var16++) {
            var4[var16 - 1] = var12;
            while (var12 >= 1 && arg1.field2394[var12 - 1] != arg1.field2394[var16 - 1]) {
                var12 = var4[var12 - 1];
            }
            var12++;
        }
        while (var14 < arg1.field2391) {
            for (int var19 = var13; var19 <= var14; var19++) {
                if (arg1.field2391 + var14 - var19 <= var5[var19 + -1]) {
                    var5[var19 - 1] = arg1.field2391 + var14 - var19;
                }
            }
            var13 = var14 + 1;
            var14 = var14 + var15 - var4[var15 + -1];
            var15 = var4[var15 - 1];
        }
        int var18;
        for (int var17 = arg0 + arg1.field2391 - 1; var17 < this.field2391; var17 += Math.max(var6[this.field2394[var17] & 0xFF], var5[var18])) {
            for (var18 = arg1.field2391 - 1; var18 >= 0 && this.field2394[var17] == arg1.field2394[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)V")
    public static final void method848(int arg0, int arg1) {
        field2355++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class37.field942[arg1];
        int var3 = class73.field1854[arg1];
        int var4 = class67.field1710[arg1];
        int var5 = class141.field3486[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (class3.field56 != 0 && var5 != 1004) {
            class3.field56 = 0;
            class113.field2832 = true;
        }
        if (var5 == 1005) {
            class54 var6 = class63.method552(var2, (byte) 126);
            if (var6 == null || var6.field1304[var3] < 100000) {
                class54.field1349++;
                class134.field3276.method869((byte) 11, 237);
                class134.field3276.method471((byte) 100, var4);
            } else {
                class48.method400(0, class20.method189(new class99[] { class5.method31(var6.field1304[var3], 10), class112.field2789, class1.method2((byte) 118, var4).field3551 }, 116), 121, class137.field3407);
            }
            class63.field1675 = var2;
            class45.field1078 = var3;
            class89.field2201 = 2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
            class86.field2157 = 0;
        }
        if (var5 == 49) {
            class14.field340++;
            class134.field3276.method869((byte) 11, 154);
            class134.field3276.method507(arg0 + 25135, var2);
            class54 var7 = class63.method552(var2, (byte) 127);
            if (var7.field1362 != null && var7.field1362[0][0] == 5) {
                int var8 = var7.field1362[0][1];
                if (class94.field2283[var8] != var7.field1331[0]) {
                    class94.field2283[var8] = var7.field1331[0];
                    class81.method700(var8, arg0 + 2);
                    class52.field1243 = true;
                }
            }
        }
        if (var5 == 28) {
            class15.field368++;
            boolean var9 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) -83, 0, 2);
            if (!var9) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 119, 0, 2);
            }
            class52.field1240 = 2;
            class97.field2334 = class4.field75;
            class119.field2920 = class23.field540;
            class47.field1137 = 0;
            class134.field3276.method869((byte) 11, 71);
            class134.field3276.method476(arg0 + 120, var4);
            class134.field3276.method476(123, class5.field120 + var2);
            class134.field3276.method468(-1907964752, class67.field1712 + var3);
        }
        if (var5 == 34) {
            class99 var11 = class145.field3619[arg1];
            int var12 = var11.method830(class144.field3598, 63);
            if (var12 != -1) {
                long var13 = var11.method813(var12 + 5, (byte) 106).method846(arg0 - 1).method834(-97);
                int var15 = -1;
                for (int var16 = 0; var16 < class9.field230; var16++) {
                    if (class88.field2185[var16] == var13) {
                        var15 = var16;
                        break;
                    }
                }
                if (var15 != -1 && class59.field1589[var15] > 0) {
                    class3.field56 = 0;
                    class113.field2832 = true;
                    class126.field3052 = 3;
                    class137.field3412 = class137.field3407;
                    class30.field712 = true;
                    class114.field2851 = class88.field2185[var15];
                    class137.field3424 = class20.method189(new class99[] { class94.field2294, class17.field463[var15] }, 53);
                }
            }
        }
        if (var5 == 17) {
            class23.field559++;
            class134.field3276.method869((byte) 11, 112);
            class134.field3276.method468(-1907964752, var3);
            class134.field3276.method468(arg0 ^ 0x8E46C4B0, var4);
            class134.field3276.method508(1, var2);
            class45.field1078 = var3;
            class63.field1675 = var2;
            class89.field2201 = 2;
            class86.field2157 = 0;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 6) {
            class149 var17 = class149.field3691[var4];
            if (var17 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var17.field3096[0], 1, 1, var17.field3100[0], class69.field1770.field3100[0], (byte) 114, 0, 2);
                class97.field2334 = class4.field75;
                class112.field2791++;
                class52.field1240 = 2;
                class47.field1137 = 0;
                class119.field2920 = class23.field540;
                class134.field3276.method869((byte) 11, 235);
                class134.field3276.method467(var4, true);
            }
        }
        if (var5 == 5) {
            class83.method719(class127.field3110, 65);
            class113.field2832 = true;
            class127.field3110 = -1;
        }
        if (var5 == 36) {
            class126 var18 = class59.field1571[var4];
            if (var18 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var18.field3096[0], 1, 1, var18.field3100[0], class69.field1770.field3100[0], (byte) 96, 0, 2);
                class119.field2920 = class23.field540;
                class97.field2334 = class4.field75;
                class52.field1240 = 2;
                class80.field1980++;
                class47.field1137 = 0;
                class134.field3276.method869((byte) 11, 24);
                class134.field3276.method476(arg0 ^ 0x7D, var4);
            }
        }
        if (var5 == 41) {
            boolean var19 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) 89, 0, 2);
            if (!var19) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 112, 0, 2);
            }
            class52.field1240 = 2;
            class140.field3470++;
            class97.field2334 = class4.field75;
            class47.field1137 = 0;
            class119.field2920 = class23.field540;
            class134.field3276.method869((byte) 11, 78);
            class134.field3276.method467(var4, true);
            class134.field3276.method471((byte) -82, class5.field120 + var2);
            class134.field3276.method476(arg0 ^ 0x56, var3 + class67.field1712);
        }
        if (var5 == 1) {
            if (class55.field1432) {
                class68.field1757.method70(class84.field2116, var3 - 4, var2 + -4);
            } else {
                class68.field1757.method70(class84.field2116, class23.field540 - 4, class4.field75 + -4);
            }
        }
        if (var5 == 51 || var5 == 54) {
            class99 var21 = class145.field3619[arg1];
            int var22 = var21.method830(class144.field3598, 63);
            if (var22 != -1) {
                class99 var23 = var21.method813(var22 + 5, (byte) 125).method846(-1);
                class99 var24 = var23.method819(arg0 + 100).method849(-112);
                boolean var25 = false;
                for (int var26 = 0; var26 < class101.field2446; var26++) {
                    class126 var27 = class59.field1571[class67.field1729[var26]];
                    if (var27 != null && var27.field3034 != null && var27.field3034.method845(var24, 63)) {
                        var25 = true;
                        class52.method432(false, 0, class69.field1770.field3096[0], 0, var27.field3096[0], 1, 1, var27.field3100[0], class69.field1770.field3100[0], (byte) -86, 0, 2);
                        if (var5 == 51) {
                            class134.field3276.method869((byte) 11, 188);
                            class134.field3276.method471((byte) 100, class67.field1729[var26]);
                            class102.field2477++;
                        }
                        if (var5 == 54) {
                            class134.field3276.method869((byte) 11, 2);
                            class2.field37++;
                            class134.field3276.method471((byte) 116, class67.field1729[var26]);
                        }
                        break;
                    }
                }
                if (!var25) {
                    class48.method400(0, class20.method189(new class99[] { class25.field581, var24 }, 115), arg0 - 71, class137.field3407);
                }
            }
        }
        if (var5 == 13) {
            class149 var28 = class149.field3691[var4];
            if (var28 != null) {
                class145.field3618++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var28.field3096[0], 1, 1, var28.field3100[0], class69.field1770.field3100[0], (byte) 97, 0, 2);
                class97.field2334 = class4.field75;
                class47.field1137 = 0;
                class52.field1240 = 2;
                class119.field2920 = class23.field540;
                class134.field3276.method869((byte) 11, 89);
                class134.field3276.method507(arg0 + 25135, class37.field943);
                class134.field3276.method468(-1907964752, client.field520);
                class134.field3276.method467(var4, true);
            }
        }
        if (var5 == 40) {
            class91.field2228++;
            class134.field3276.method869((byte) 11, 21);
            class134.field3276.method508(arg0 + 1, var2);
            class134.field3276.method467(var4, true);
            class134.field3276.method468(-1907964752, var3);
            class45.field1078 = var3;
            class63.field1675 = var2;
            class89.field2201 = 2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            class86.field2157 = 0;
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 48) {
            class134.field3276.method869((byte) 11, 126);
            class81.field2009++;
            class134.field3276.method471((byte) 121, var4);
            class134.field3276.method508(1, var2);
            class134.field3276.method467(var3, true);
            class86.field2157 = 0;
            class45.field1078 = var3;
            class89.field2201 = 2;
            class63.field1675 = var2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 31) {
            class149 var29 = class149.field3691[var4];
            if (var29 != null) {
                class142.field3505++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var29.field3096[0], 1, 1, var29.field3100[0], class69.field1770.field3100[0], (byte) 107, 0, 2);
                class47.field1137 = 0;
                class97.field2334 = class4.field75;
                class52.field1240 = 2;
                class119.field2920 = class23.field540;
                class134.field3276.method869((byte) 11, 47);
                class134.field3276.method508(1, class118.field2895);
                class134.field3276.method467(class5.field101, true);
                class134.field3276.method468(arg0 ^ 0x8E46C4B0, class58.field1526);
                class134.field3276.method468(-1907964752, var4);
            }
        }
        if (var5 == 12) {
            class113.field2825++;
            class134.field3276.method869((byte) 11, 209);
            class134.field3276.method468(-1907964752, var3);
            class134.field3276.method476(100, var4);
            class134.field3276.method508(1, var2);
            class63.field1675 = var2;
            class86.field2157 = 0;
            class89.field2201 = 2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
            class45.field1078 = var3;
        }
        if (var5 == 25) {
            class134.field3276.method869((byte) 11, 117);
            class134.field3276.method507(25135, var2);
            class20.field497++;
            class134.field3276.method476(109, var4);
            class134.field3276.method468(arg0 ^ 0x8E46C4B0, var3);
            class86.field2157 = 0;
            class89.field2201 = 2;
            class63.field1675 = var2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
            class45.field1078 = var3;
        }
        if (var5 == 30) {
            class132.method1069(arg0 ^ 0xFFFFFF80);
        }
        if (var5 == 18) {
            class122.field2972++;
            boolean var30 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) -39, 0, 2);
            if (!var30) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 117, 0, 2);
            }
            class52.field1240 = 2;
            class119.field2920 = class23.field540;
            class47.field1137 = 0;
            class97.field2334 = class4.field75;
            class134.field3276.method869((byte) 11, 118);
            class134.field3276.method467(var2 + class5.field120, true);
            class134.field3276.method491(-2645, class37.field943);
            class134.field3276.method468(-1907964752, var4);
            class134.field3276.method468(-1907964752, client.field520);
            class134.field3276.method471((byte) -102, var3 + class67.field1712);
        }
        if (var5 == 4) {
            class126 var32 = class59.field1571[var4];
            if (var32 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var32.field3096[0], 1, 1, var32.field3100[0], class69.field1770.field3100[0], (byte) 90, 0, 2);
                class97.field2334 = class4.field75;
                class47.field1137 = 0;
                class110.field2731++;
                class119.field2920 = class23.field540;
                class52.field1240 = 2;
                class134.field3276.method869((byte) 11, 191);
                class134.field3276.method471((byte) 106, var4);
            }
        }
        if (var5 == 1002) {
            class52.field1240 = 2;
            class119.field2920 = class23.field540;
            class110.field2714++;
            class97.field2334 = class4.field75;
            class47.field1137 = 0;
            class134.field3276.method869((byte) 11, 153);
            class134.field3276.method468(-1907964752, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 27) {
            boolean var33 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) -10, 0, 2);
            class52.field1244++;
            if (!var33) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 99, 0, 2);
            }
            class119.field2920 = class23.field540;
            class97.field2334 = class4.field75;
            class52.field1240 = 2;
            class47.field1137 = 0;
            class134.field3276.method869((byte) 11, 58);
            class134.field3276.method471((byte) 114, class58.field1526);
            class134.field3276.method471((byte) 96, class5.field101);
            class134.field3276.method467(var2 + class5.field120, true);
            class134.field3276.method508(1, class118.field2895);
            class134.field3276.method471((byte) -107, var4);
            class134.field3276.method468(-1907964752, var3 + class67.field1712);
        }
        if (var5 == 55) {
            class149 var35 = class149.field3691[var4];
            if (var35 != null) {
                class37.field931++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var35.field3096[0], 1, 1, var35.field3100[0], class69.field1770.field3100[0], (byte) -115, 0, 2);
                class119.field2920 = class23.field540;
                class47.field1137 = 0;
                class97.field2334 = class4.field75;
                class52.field1240 = 2;
                class134.field3276.method869((byte) 11, 23);
                class134.field3276.method471((byte) -113, var4);
            }
        }
        if (var5 == 29) {
            class134.field3276.method869((byte) 11, 226);
            class84.field2109++;
            class134.field3276.method508(1, var2);
            class134.field3276.method471((byte) -126, var3);
            class134.field3276.method467(var4, true);
            class63.field1675 = var2;
            class89.field2201 = 2;
            class45.field1078 = var3;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            class86.field2157 = 0;
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 35) {
            class37.field934++;
            class134.field3276.method869((byte) 11, 4);
            class134.field3276.method507(25135, class37.field943);
            class134.field3276.method468(-1907964752, client.field520);
            class134.field3276.method491(-2645, var2);
            class134.field3276.method476(96, var3);
            class134.field3276.method467(var4, true);
            class89.field2201 = 2;
            class45.field1078 = var3;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            class86.field2157 = 0;
            class63.field1675 = var2;
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 1006) {
            class119.field2920 = class23.field540;
            class54.field1349++;
            class97.field2334 = class4.field75;
            class52.field1240 = 2;
            class47.field1137 = 0;
            class134.field3276.method869((byte) 11, 237);
            class134.field3276.method471((byte) 112, var4);
        }
        if (var5 == 58) {
            class149 var36 = class149.field3691[var4];
            if (var36 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var36.field3096[0], 1, 1, var36.field3100[0], class69.field1770.field3100[0], (byte) 116, 0, 2);
                class52.field1240 = 2;
                class47.field1137 = 0;
                class136.field3404++;
                class97.field2334 = class4.field75;
                class119.field2920 = class23.field540;
                class134.field3276.method869((byte) 11, 245);
                class134.field3276.method467(var4, true);
            }
        }
        if (var5 == 14) {
            class134.field3276.method869((byte) 11, 229);
            class134.field3276.method467(var3, true);
            class148.field3667++;
            class134.field3276.method468(-1907964752, var4);
            class134.field3276.method508(1, var2);
            class86.field2157 = 0;
            class89.field2201 = 2;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
            class63.field1675 = var2;
            class45.field1078 = var3;
        }
        if (var5 == 3) {
            class126 var37 = class59.field1571[var4];
            if (var37 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var37.field3096[0], 1, 1, var37.field3100[0], class69.field1770.field3100[0], (byte) -8, 0, 2);
                class97.field2334 = class4.field75;
                class52.field1240 = 2;
                class119.field2920 = class23.field540;
                class2.field37++;
                class47.field1137 = 0;
                class134.field3276.method869((byte) 11, 2);
                class134.field3276.method471((byte) -61, var4);
            }
        }
        if (var5 == 8) {
            class14.field340++;
            class134.field3276.method869((byte) 11, 154);
            class134.field3276.method507(25135, var2);
            class54 var38 = class63.method552(var2, (byte) 127);
            if (var38.field1362 != null && var38.field1362[0][0] == 5) {
                int var39 = var38.field1362[0][1];
                class94.field2283[var39] = 1 - class94.field2283[var39];
                class81.method700(var39, arg0 ^ 0x2);
                class52.field1243 = true;
            }
        }
        if (var5 == 32) {
            class54 var40 = class63.method552(var2, (byte) 125);
            boolean var41 = true;
            if (var40.field1327 > 0) {
                var41 = class48.method404((byte) 111, var40);
            }
            if (var41) {
                class14.field340++;
                class134.field3276.method869((byte) 11, 154);
                class134.field3276.method507(arg0 ^ 0x622F, var2);
            }
        }
        if (var5 == 19) {
            class134.field3276.method869((byte) 11, 199);
            class134.field3276.method471((byte) -40, var3);
            class134.field3276.method491(arg0 ^ 0xFFFFF5AB, var2);
            class134.field3276.method468(-1907964752, var4);
            class63.field1675 = var2;
            class89.field2201 = 2;
            class54.field1342++;
            class45.field1078 = var3;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            class86.field2157 = 0;
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 15 && class39.method323(var4, var3, var2, arg0)) {
            class145.field3610++;
            class134.field3276.method869((byte) 11, 102);
            class134.field3276.method471((byte) 99, class67.field1712 + var3);
            class134.field3276.method468(arg0 ^ 0x8E46C4B0, var4 >> 14 & 0x7FFF);
            class134.field3276.method468(-1907964752, var2 + class5.field120);
            class134.field3276.method476(124, client.field520);
            class134.field3276.method507(arg0 + 25135, class37.field943);
        }
        if (var5 == 10) {
            class126 var42 = class59.field1571[var4];
            if (var42 != null) {
                class3.field49++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var42.field3096[0], 1, 1, var42.field3100[0], class69.field1770.field3100[0], (byte) 110, 0, 2);
                class119.field2920 = class23.field540;
                class97.field2334 = class4.field75;
                class52.field1240 = 2;
                class47.field1137 = 0;
                class134.field3276.method869((byte) 11, 73);
                class134.field3276.method471((byte) -20, class5.field101);
                class134.field3276.method471((byte) 119, class58.field1526);
                class134.field3276.method491(-2645, class118.field2895);
                class134.field3276.method467(var4, true);
            }
        }
        if (var5 == 50) {
            class126 var43 = class59.field1571[var4];
            if (var43 != null) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var43.field3096[0], 1, 1, var43.field3100[0], class69.field1770.field3100[0], (byte) 96, 0, 2);
                class97.field2334 = class4.field75;
                class119.field2920 = class23.field540;
                class52.field1240 = 2;
                class102.field2477++;
                class47.field1137 = 0;
                class134.field3276.method869((byte) 11, 188);
                class134.field3276.method471((byte) 86, var4);
            }
        }
        if (var5 == 39) {
            class149 var44 = class149.field3691[var4];
            if (var44 != null) {
                class12.field270++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var44.field3096[0], 1, 1, var44.field3100[0], class69.field1770.field3100[0], (byte) 111, 0, 2);
                class52.field1240 = 2;
                class119.field2920 = class23.field540;
                class47.field1137 = 0;
                class97.field2334 = class4.field75;
                class134.field3276.method869((byte) 11, 200);
                class134.field3276.method468(arg0 - 1907964752, var4);
            }
        }
        if (var5 == 52) {
            class113.field2822++;
            class39.method323(var4, var3, var2, arg0);
            class134.field3276.method869((byte) 11, 31);
            class134.field3276.method468(-1907964752, class67.field1712 + var3);
            class134.field3276.method467(var2 + class5.field120, true);
            class134.field3276.method467(var4 >> 14 & 0x7FFF, true);
        }
        if (var5 == 22) {
            class39.method323(var4, var3, var2, 0);
            class112.field2797++;
            class134.field3276.method869((byte) 11, 145);
            class134.field3276.method467(var4 >> 14 & 0x7FFF, true);
            class134.field3276.method468(-1907964752, class5.field120 + var2);
            class134.field3276.method471((byte) -71, class67.field1712 + var3);
        }
        if (var5 == 33) {
            class39.method323(var4, var3, var2, 0);
            class134.field3276.method869((byte) 11, 227);
            class134.field3276.method471((byte) 98, class67.field1712 + var3);
            class107.field2619++;
            class134.field3276.method467(var2 + class5.field120, true);
            class134.field3276.method467(var4 >> 14 & 0x7FFF, true);
        }
        if (var5 == 44) {
            class134.field3276.method869((byte) 11, 252);
            class12.field271++;
            class134.field3276.method508(1, class37.field943);
            class134.field3276.method476(115, client.field520);
            class134.field3276.method491(-2645, var2);
            class134.field3276.method467(var3, true);
        }
        if (var5 == 9) {
            class134.field3276.method869((byte) 11, 0);
            class16.field434++;
            class134.field3276.method471((byte) 106, var3);
            class134.field3276.method491(-2645, var2);
            class134.field3276.method471((byte) -88, var4);
            class63.field1675 = var2;
            class45.field1078 = var3;
            class89.field2201 = 2;
            class86.field2157 = 0;
            if (var2 >> 16 == class23.field555) {
                class89.field2201 = 1;
            }
            if (var2 >> 16 == class87.field2162) {
                class89.field2201 = 3;
            }
        }
        if (var5 == 1001) {
            class39.method323(var4, var3, var2, 0);
            class134.field3276.method869((byte) 11, 197);
            class134.field3276.method471((byte) 86, class67.field1712 + var3);
            class37.field932++;
            class134.field3276.method467(class5.field120 + var2, true);
            class134.field3276.method471((byte) 126, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 53) {
            class126 var45 = class59.field1571[var4];
            if (var45 != null) {
                class53.field1267++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var45.field3096[0], 1, 1, var45.field3100[0], class69.field1770.field3100[0], (byte) 126, 0, 2);
                class52.field1240 = 2;
                class47.field1137 = 0;
                class119.field2920 = class23.field540;
                class97.field2334 = class4.field75;
                class134.field3276.method869((byte) 11, 187);
                class134.field3276.method471((byte) -102, var4);
            }
        }
        if (var5 == 11) {
            class110.field2719++;
            class39.method323(var4, var3, var2, 0);
            class134.field3276.method869((byte) 11, 133);
            class134.field3276.method467(class5.field120 + var2, true);
            class134.field3276.method476(125, var4 >> 14 & 0x7FFF);
            class134.field3276.method471((byte) 113, class67.field1712 + var3);
        }
        if (var5 == 21) {
            class126 var46 = class59.field1571[var4];
            if (var46 != null) {
                class94.field2281++;
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var46.field3096[0], 1, 1, var46.field3100[0], class69.field1770.field3100[0], (byte) -64, 0, 2);
                class47.field1137 = 0;
                class97.field2334 = class4.field75;
                class119.field2920 = class23.field540;
                class52.field1240 = 2;
                class134.field3276.method869((byte) 11, 82);
                class134.field3276.method476(101, client.field520);
                class134.field3276.method467(var4, true);
                class134.field3276.method472((byte) -112, class37.field943);
            }
        }
        if (var5 == 43) {
            class36.field925++;
            boolean var47 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) 93, 0, 2);
            if (!var47) {
                class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 94, 0, 2);
            }
            class47.field1137 = 0;
            class119.field2920 = class23.field540;
            class97.field2334 = class4.field75;
            class52.field1240 = 2;
            class134.field3276.method869((byte) 11, 236);
            class134.field3276.method471((byte) -114, class67.field1712 + var3);
            class134.field3276.method468(-1907964752, class5.field120 + var2);
            class134.field3276.method468(-1907964752, var4);
        }
        if (var5 == 20 && class31.field731 == -1) {
            class17.method172(var2, (byte) 21, var3);
            class25.field574 = var3;
            class31.field731 = var2;
        }
        if (var5 == 23) {
            class30.method264(102, var3, var2, var4);
        }
        if (var5 == 45 && class39.method323(var4, var3, var2, arg0)) {
            class134.field3276.method869((byte) 11, 136);
            class134.field3276.method468(-1907964752, var4 >> 14 & 0x7FFF);
            class134.field3276.method467(class67.field1712 + var3, true);
            class134.field3276.method468(-1907964752, var2 + class5.field120);
            class134.field3276.method471((byte) -44, class5.field101);
            class134.field3276.method471((byte) -26, class58.field1526);
            class134.field3276.method491(-2645, class118.field2895);
            class66.field1705++;
        }
        if (var5 == 2) {
            class46.method391(105);
            class52.field1243 = true;
            class46.field1130 = 1;
            class118.field2895 = var2;
            class5.field101 = var3;
            class58.field1526 = var4;
            class89.field2206 = class20.method189(new class99[] { class15.field371, class1.method2((byte) 118, var4).field3551, class144.field3598 }, arg0 + 114);
            if (class89.field2206 == null) {
                class89.field2206 = class143.field3556;
            }
        } else if (arg0 == 0) {
            if (var5 == 46) {
                class17.field462++;
                boolean var49 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) -75, 0, 2);
                if (!var49) {
                    class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) 110, 0, 2);
                }
                class52.field1240 = 2;
                class97.field2334 = class4.field75;
                class119.field2920 = class23.field540;
                class47.field1137 = 0;
                class134.field3276.method869((byte) 11, 88);
                class134.field3276.method468(arg0 - 1907964752, var4);
                class134.field3276.method476(94, class67.field1712 + var3);
                class134.field3276.method468(-1907964752, class5.field120 + var2);
            }
            if (var5 == 37) {
                class99 var51 = class145.field3619[arg1];
                int var52 = var51.method830(class144.field3598, 63);
                if (var52 != -1) {
                    if (class23.field555 == -1) {
                        class132.method1069(arg0 - 120);
                        if (class108.field2657 != -1) {
                            class137.field3434 = var51.method813(var52 + 5, (byte) -64).method846(-1);
                            class100.field2433 = false;
                            class55.field1419 = class23.field555 = class108.field2657;
                        }
                    } else {
                        class48.method400(0, class2.field29, -83, class137.field3407);
                        if (class35.field901 != null) {
                            class48.method400(0, class35.field901, -75, class137.field3407);
                        }
                    }
                }
            }
            if (var5 == 24) {
                boolean var53 = class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 0, 0, var3, class69.field1770.field3100[0], (byte) -33, 0, 2);
                if (!var53) {
                    class52.method432(false, 0, class69.field1770.field3096[0], 0, var2, 1, 1, var3, class69.field1770.field3100[0], (byte) -104, 0, 2);
                }
                class97.field2334 = class4.field75;
                class47.field1137 = 0;
                class109.field2680++;
                class119.field2920 = class23.field540;
                class52.field1240 = 2;
                class134.field3276.method869((byte) 11, 243);
                class134.field3276.method468(-1907964752, class67.field1712 + var3);
                class134.field3276.method468(-1907964752, var2 + class5.field120);
                class134.field3276.method467(var4, true);
            }
            if (var5 == 57) {
                class136.field3397++;
                class134.field3276.method869((byte) 11, 90);
                class134.field3276.method476(118, var3);
                class134.field3276.method508(1, var2);
                class134.field3276.method468(arg0 - 1907964752, var4);
                class89.field2201 = 2;
                if (var2 >> 16 == class23.field555) {
                    class89.field2201 = 1;
                }
                class45.field1078 = var3;
                class63.field1675 = var2;
                class86.field2157 = 0;
                if (var2 >> 16 == class87.field2162) {
                    class89.field2201 = 3;
                }
            }
            if (var5 == 42) {
                class69.field1775++;
                class134.field3276.method869((byte) 11, 201);
                class134.field3276.method467(class5.field101, true);
                class134.field3276.method467(class58.field1526, true);
                class134.field3276.method472((byte) -112, var2);
                class134.field3276.method508(1, class118.field2895);
                class134.field3276.method467(var3, true);
                class134.field3276.method476(arg0 ^ 0x75, var4);
                class86.field2157 = 0;
                class89.field2201 = 2;
                class63.field1675 = var2;
                class45.field1078 = var3;
                if (var2 >> 16 == class23.field555) {
                    class89.field2201 = 1;
                }
                if (var2 >> 16 == class87.field2162) {
                    class89.field2201 = 3;
                }
            }
            if (var5 == 47) {
                class149 var55 = class149.field3691[var4];
                if (var55 != null) {
                    class136.field3384++;
                    class52.method432(false, 0, class69.field1770.field3096[0], 0, var55.field3096[0], 1, 1, var55.field3100[0], class69.field1770.field3100[0], (byte) -93, 0, 2);
                    class119.field2920 = class23.field540;
                    class97.field2334 = class4.field75;
                    class47.field1137 = 0;
                    class52.field1240 = 2;
                    class134.field3276.method869((byte) 11, 96);
                    class134.field3276.method476(90, var4);
                }
            }
            if (var5 == 16 || var5 == 26 || var5 == 56 || var5 == 7) {
                class99 var56 = class145.field3619[arg1];
                int var57 = var56.method830(class144.field3598, 63);
                if (var57 != -1) {
                    long var58 = var56.method813(var57 + 5, (byte) 118).method846(-1).method834(-97);
                    if (var5 == 16) {
                        class143.method1172(84, var58);
                    }
                    if (var5 == 26) {
                        class82.method711(90, var58);
                    }
                    if (var5 == 56) {
                        class104.method882(98, var58);
                    }
                    if (var5 == 7) {
                        class66.method590(var58, (byte) 122);
                    }
                }
            }
            if (var5 == 38) {
                class54 var60 = class108.method927(var2, var3, 16777215);
                if (var60 != null) {
                    class46.method391(-106);
                    class3.method14(var2, (byte) -29, class11.method121(class20.method188(var60, -604452832), arg0 ^ 0x1278), var3);
                    class46.field1130 = 0;
                    class52.field1243 = true;
                    class32.field766 = class33.method278(var60, arg0 - 1966086522);
                    if (class32.field766 == null) {
                        class32.field766 = class121.field2961;
                    }
                    if (var60.field1374) {
                        class63.field1678 = class20.method189(new class99[] { var60.field1325, class144.field3598 }, arg0 + 86);
                    } else {
                        class63.field1678 = class20.method189(new class99[] { class145.field3622, var60.field1333, class144.field3598 }, 38);
                    }
                    if (class111.field2774 == 16 && !var60.field1374) {
                        class130.field3190 = true;
                        class52.field1243 = true;
                        class57.field1473 = 3;
                    }
                }
            } else {
                if (var5 == 1003) {
                    class52.field1240 = 2;
                    class47.field1137 = 0;
                    class119.field2920 = class23.field540;
                    class97.field2334 = class4.field75;
                    class149 var61 = class149.field3691[var4];
                    if (var61 != null) {
                        class46 var62 = var61.field3689;
                        if (var62.field1104 != null) {
                            var62 = var62.method383((byte) -123);
                        }
                        if (var62 != null) {
                            class134.field3276.method869((byte) 11, 79);
                            class134.field3276.method467(var62.field1088, true);
                            class49.field1196++;
                        }
                    }
                }
                if (class46.field1130 != 0) {
                    class46.field1130 = 0;
                    class52.field1243 = true;
                }
                if (class121.field2957) {
                    class46.method391(-39);
                    class52.field1243 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "(I)Loc;")
    public final class99 method849(int arg0) {
        field2379++;
        if (arg0 >= -105) {
            this.method818(86, (byte) -11);
        }
        class99 var2 = new class99();
        boolean var3 = true;
        var2.field2391 = this.field2391;
        var2.field2394 = new byte[this.field2391];
        for (int var4 = 0; var4 < this.field2391; var4++) {
            byte var5 = this.field2394[var4];
            if (var5 == 95) {
                var2.field2394[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2394[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field2394[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "(I)Loc;")
    public final class99 method850(int arg0) {
        field2413++;
        class99 var2 = new class99();
        var2.field2391 = this.field2391;
        var2.field2394 = new byte[this.field2391];
        if (arg0 == -31828) {
            for (int var3 = 0; var3 < this.field2391; var3++) {
                var2.field2394[var3] = 42;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILoc;)Z")
    public final boolean method851(int arg0, class99 arg1) {
        field2358++;
        if (arg1.field2391 > this.field2391) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field2391; var3++) {
            if (this.field2394[var3] != arg1.field2394[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "(I)V")
    public static final void method852(int arg0) {
        field2396++;
        class125 var1 = class39.field978;
        synchronized (class39.field978) {
            if (arg0 == 65) {
                class14.field351 = class121.field2956;
                if (class104.field2533 < 0) {
                    for (int var2 = 0; var2 < 112; var2++) {
                        class136.field3389[var2] = false;
                    }
                    class104.field2533 = class36.field909;
                } else {
                    while (class36.field909 != class104.field2533) {
                        int var3 = client.field523[class36.field909];
                        class36.field909 = class36.field909 + 1 & 0x7F;
                        if (var3 >= 0) {
                            class136.field3389[var3] = true;
                        } else {
                            class136.field3389[~var3] = false;
                        }
                    }
                }
                class121.field2956 = class55.field1407;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lpc;Lpc;BLpc;)V")
    public static final void method853(class105 arg0, class105 arg1, byte arg2, class105 arg3) {
        class70.field1796 = arg0;
        class137.field3430 = arg1;
        if (arg2 >= -114) {
            field2411 = -59;
        }
        field2395++;
        class142.field3521 = arg3;
        class132.field3230 = new class54[class70.field1796.method889((byte) -118)][];
        class83.field2053 = new boolean[class70.field1796.method889((byte) -117)];
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)Z")
    public final boolean method854(byte arg0) {
        int var2 = 85 % ((-arg0 - 38) / 46);
        field2397++;
        return this.method818(10, (byte) -80);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method855(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
