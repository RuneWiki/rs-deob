import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class130 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field2364 = -1;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "[I")
    public static int[] field2384 = new int[5];

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2363 = 0;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lud;")
    public static class279 field2362 = method1024("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", 255);

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Lud;")
    public static class279 field2386 = method1024("loginscreen", 255);

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "[I")
    public static int[] field2378 = new int[1000];

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field2366 = 0;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Lok;")
    public static class149 field2387;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "[I")
    public static int[] field2376;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)Lud;", line = 15)
    public static final class279 method1024(String arg0, int arg1) {
        if (arg1 != 255) {
            method1025(-68, 101, -120, 62);
        }
        byte[] var2 = arg0.getBytes();
        field2367++;
        int var3 = var2.length;
        int var4 = 0;
        class279 var5 = new class279();
        var5.field4935 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field4935[var5.field4967++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field4935[var5.field4967++] = (byte) var6;
            }
        }
        var5.method1992(arg1 ^ 0xFFFFFF64);
        return var5.method1994(-127);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I", line = 57)
    public static final int method1025(int arg0, int arg1, int arg2, int arg3) {
        field2385++;
        if (class165.field2970 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg0 & 0x7F;
        if (arg2 < 3 && (class257.field4573[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var8 = (128 - var7) * class165.field2970[var6][var4][var5 + 1] + class165.field2970[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var9 = arg3 & 0x7F;
        int var10 = (128 - var7) * class165.field2970[var6][var4][var5] + class165.field2970[var6][var4 + 1][var5] * var7 >> 7;
        return arg1 == 1008652135 ? (128 - var9) * var10 + var8 * var9 >> 7 : -91;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 95)
    public static void method1026(int arg0) {
        field2387 = null;
        if (arg0 < 98) {
            field2366 = -60;
        }
        field2386 = null;
        field2376 = null;
        field2362 = null;
        field2384 = null;
        field2378 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lqb;B)I", line = 112)
    public static final int method1027(class102 arg0, byte arg1) {
        if (arg1 > -57) {
            return 63;
        }
        class125 var2 = arg0.field1921;
        field2373++;
        if (var2.field2321 != null) {
            var2 = var2.method999(13102);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2330;
        class34 var4 = arg0.method15(51);
        if (arg0.field25 == var4.field765) {
            var3 = var2.field2290;
        } else if (arg0.field25 == var4.field751 || arg0.field25 == var4.field759 || arg0.field25 == var4.field782 || arg0.field25 == var4.field758) {
            var3 = var2.field2279;
        } else if (arg0.field25 == var4.field785 || arg0.field25 == var4.field761 || arg0.field25 == var4.field779 || arg0.field25 == var4.field757) {
            var3 = var2.field2288;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB[B)Z", line = 174)
    public static final boolean method1028(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var4 = -11 / ((arg2 - 47) / 50);
        field2369++;
        boolean var5 = true;
        class53 var6 = new class53(arg3);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method499(1);
            if (var8 == 0) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method472((byte) 87);
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method483(-114) >> 2;
                    int var16 = arg1 + var14;
                    int var17 = arg0 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class264 var18 = class252.method1808(var7, (byte) 4);
                        if (var15 != 22 || class202.field3608 || var18.field4744 != 0 || var18.field4704 == 1 || var18.field4696) {
                            var10 = true;
                            if (!var18.method1890((byte) 112)) {
                                var5 = false;
                                class12.field394++;
                            }
                        }
                    }
                }
                int var11 = var6.method472((byte) 111);
                if (var11 == 0) {
                    break;
                }
                var6.method483(-117);
            }
        }
    }
}
