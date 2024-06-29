import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Z")
    public static boolean field300 = false;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lgd;")
    private static class40 field302 = class14.method90(false, "Loading ignore list");

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lgd;")
    private static class40 field306 = class14.method90(false, "Close");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lgd;")
    public static class40 field298 = field306;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lgd;")
    public static class40 field313 = class14.method90(false, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lgd;")
    public static class40 field301 = field302;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static volatile int field316 = -1;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lrb;")
    public static class103 field311;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lrb;")
    public static class103 field317;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
    public static int[] field307;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[Lmb;")
    public static class73[] field309;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V", line = 3)
    public class12(int arg0) {
        class131.field3171 = arg0;
        class5.field155 = class98.method683(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 12)
    public static final synchronized void method64(int arg0, int arg1) {
        if (arg1 != -64) {
            method70(116, -84, 53);
        }
        field312++;
        if (class59.field1491 != null) {
            class59.field1491.method176(arg0);
        }
        class29.method185((byte) 54, arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 32)
    public static void method65(int arg0) {
        field306 = null;
        field302 = null;
        field313 = null;
        field317 = null;
        field307 = null;
        if (arg0 != 7) {
            field306 = null;
        }
        field301 = null;
        field298 = null;
        field311 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lfc;B)V", line = 52)
    public static final synchronized void method66(class33 arg0, byte arg1) {
        int var2 = 85 % ((-arg1 - 50) / 42);
        class59.field1491 = arg0;
        field305++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method67(boolean arg0, int arg1) {
        field315++;
        if (arg1 < 74) {
            field306 = null;
        }
        for (int var2 = 0; var2 < class23.field548; var2++) {
            class23 var3 = class130.field3142[class115.field2763[var2]];
            int var4 = (class115.field2763[var2] << 14) + 536870912;
            if (var3 != null && var3.method135(25) && arg0 == var3.field531.field3037 && var3.field531.method1016(-1)) {
                int var5 = var3.field838 >> 7;
                int var6 = var3.field792 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field794 == 1 && (var3.field792 & 0x7F) == 64 && (var3.field838 & 0x7F) == 64) {
                        if (class108.field2633[var6][var5] == class2.field40) {
                            continue;
                        }
                        class108.field2633[var6][var5] = class2.field40;
                    }
                    if (!var3.field531.field3032) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class21.field490.method986(class99.field2361, var3.field792, var3.field838, class58.method439((var3.field794 - 1) * 64 + var3.field838, var3.field794 * 64 + var3.field792 + -64, false, class99.field2361), var3.field794 * 64 + 60 - 64, var3, var3.field828, var4, var3.field805);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([II)V", line = 136)
    public static final synchronized void method68(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class59.field1491 != null) {
            class59.field1491.method180(arg0, 0, var3);
        }
        class29.method185((byte) 54, var3);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZILee;)I", line = 183)
    public static final int method69(boolean arg0, int arg1, class30 arg2) {
        field310++;
        if (arg2.field689 == null || arg2.field689.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field689[arg1];
            int var4 = 0;
            if (arg0) {
                method70(10, 89, 90);
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class131.field3188[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class77.field1783[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class23.field546[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class30 var12 = class14.method86(var11, false);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class132.method1041(var13, 124).field101 || class44.field1104)) {
                        for (int var14 = 0; var14 < var12.field710.length; var14++) {
                            if (var13 + 1 == var12.field710[var14]) {
                                var8 += var12.field708[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class48.field1209[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = client.field465[class77.field1783[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class48.field1209[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class13.field332.field2214;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class58.field1484[var15]) {
                            var8 += class77.field1783[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class30 var18 = class14.method86(var17, arg0);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class132.method1041(var19, 24).field101 || class44.field1104)) {
                        for (int var20 = 0; var20 < var18.field710.length; var20++) {
                            if (var19 + 1 == var18.field710[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class22.field511;
                }
                if (var7 == 12) {
                    var8 = class42.field1068;
                }
                if (var7 == 13) {
                    int var21 = class48.field1209[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class4.method29((byte) -77, var23);
                }
                if (var7 == 18) {
                    var8 = (class13.field332.field792 >> 7) + class125.field2961;
                }
                if (var7 == 19) {
                    var8 = (class13.field332.field838 >> 7) + class128.field3022;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z", line = 395)
    public static final boolean method70(int arg0, int arg1, int arg2) {
        field303++;
        if (arg2 == 0 && class23.field547 == arg1) {
            return true;
        } else if (arg0 == arg2 && class51.field1304 == arg1) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class35.field900 == arg1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 425)
    public void method71() {
        field304++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(J)V", line = 439)
    public void method72(long arg0) {
        field314++;
    }
}
