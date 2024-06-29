import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[Z")
    public boolean[] field384 = new boolean[256];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field365 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field364 = 0;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[I")
    public int[] field368 = new int[6];

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[B")
    public byte[] field378 = new byte[256];

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[[B")
    public byte[][] field387 = new byte[6][258];

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[Z")
    public boolean[] field391 = new boolean[16];

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "[B")
    public byte[] field382 = new byte[18002];

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[B")
    public byte[] field392 = new byte[18002];

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[[I")
    public int[][] field379 = new int[6][258];

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[[I")
    public int[][] field372 = new int[6][258];

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "[[I")
    public int[][] field400 = new int[6][258];

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[I")
    public int[] field396 = new int[16];

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "[I")
    public int[] field401 = new int[257];

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[B")
    public byte[] field403 = new byte[4096];

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    public int[] field377 = new int[256];

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lqd;")
    public static class115 field380 = new class115(30);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lid;")
    private static class60 field393 = class11.method72("Sorry invited players only)3", (byte) -88);

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lid;")
    public static class60 field389 = field393;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
    public static int[] field398 = new int[1000];

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field405 = 0;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "Lid;")
    public static class60 field406 = class11.method72("sl_arrows", (byte) 93);

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Lmc;")
    public static class86 field404 = new class86(32);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "B")
    public byte field373;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[B")
    public byte[] field362;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[B")
    public byte[] field383;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLid;Lid;Lid;)V")
    public static final void method126(byte arg0, class60 arg1, class60 arg2, class60 arg3) {
        int var4 = 123 % ((arg0 + 79) / 38);
        class141.field3210 = arg2;
        field367++;
        class141.field3220 = arg1;
        class141.field3205 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIII)I")
    public static final int method127(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field385++;
        int var7 = arg4 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg2;
        } else {
            if (arg0 != -29) {
                field405 = -95;
            }
            return var7 == 2 ? 7 + 1 - arg3 - arg5 : 7 - (arg1 + -1) + -arg2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
    public static final void method128(boolean arg0, int arg1) {
        field363++;
        if (class101.field2470 == null || arg1 < 0 || arg1 >= class101.field2470.length || class101.field2470[arg1] == null) {
            return;
        }
        class22.field519.method1214(32, 0);
        class22.field519.method830(class101.field2470[arg1].field2929, 111);
        class11.field182++;
        if (arg0) {
            field406 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public static final void method129(int arg0, int arg1, int arg2) {
        field374++;
        if (arg0 == -29873 && class28.method209(arg1, -1)) {
            client.method169(-10897, arg2, class45.field1177[arg1]);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLa;II)V")
    public static final void method130(int arg0, byte arg1, class1 arg2, int arg3, int arg4) {
        field366++;
        if (class107.field2640 == arg2 || class80.field1956 >= 400) {
            return;
        }
        class60 var5;
        if (arg2.field31 == 0) {
            var5 = class104.method853(-120, new class60[] { arg2.field21, class18.method149(class107.field2640.field13, -17976, arg2.field13), class128.field2936, class121.field2771, class98.method774((byte) -121, arg2.field13), class13.field238 });
        } else {
            var5 = class104.method853(-108, new class60[] { arg2.field21, class128.field2936, class151.field3391, class98.method774((byte) -121, arg2.field31), class13.field238 });
        }
        if (class155.field3546 == 1) {
            class109.field2651++;
            class82.method689(arg0, 25, (byte) 114, class104.method853(-85, new class60[] { class85.field2121, class113.field2701, var5 }), arg4, arg3, class81.field2014);
        } else if (!class1.field17) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class73.field1763[var6] != null) {
                    short var8 = 0;
                    if (class73.field1763[var6].method426(class9.field149, (byte) 37)) {
                        if (arg2.field13 > class107.field2640.field13) {
                            var8 = 2000;
                        }
                        if (class107.field2640.field4 != 0 && arg2.field4 != 0) {
                            if (class107.field2640.field4 == arg2.field4) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class44.field1164[var6]) {
                        var8 = 2000;
                    }
                    class148.field3367++;
                    boolean var9 = false;
                    int var10 = class45.field1183[var6] + var8;
                    class82.method689(arg0, var10, (byte) 110, class104.method853(-96, new class60[] { class90.field2261, var5 }), arg4, arg3, class73.field1763[var6]);
                }
            }
        } else if ((class7.field100 & 0x8) == 8) {
            class120.field2759++;
            class82.method689(arg0, 40, (byte) 114, class104.method853(-87, new class60[] { class56.field1389, class113.field2701, var5 }), arg4, arg3, class35.field857);
        }
        if (arg1 <= 91) {
            field380 = null;
        }
        for (int var7 = 0; var7 < class80.field1956; var7++) {
            if (class90.field2249[var7] == 21) {
                class80.field1995[var7] = class104.method853(-89, new class60[] { class90.field2261, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lef;Z)V")
    public static final void method131(class35 arg0, boolean arg1) {
        field402++;
        arg0.field875 = arg0.field832;
        if (arg0.field843 == 0) {
            arg0.field836 = 0;
            return;
        }
        if (arg0.field806 != -1 && arg0.field842 == 0) {
            class46 var2 = class44.method344(arg0.field806, (byte) -67);
            if (arg0.field844 > 0 && var2.field1202 == 0) {
                arg0.field836++;
                return;
            }
            if (arg0.field844 <= 0 && var2.field1217 == 0) {
                arg0.field836++;
                return;
            }
        }
        int var3 = arg0.field854;
        int var4 = arg0.field828;
        int var5 = arg0.field841[arg0.field843 - 1] * 128 + arg0.field872 * 64;
        int var6 = arg0.field827[arg0.field843 - 1] * 128 + arg0.field872 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field854 = var5;
            arg0.field828 = var6;
            return;
        }
        int var7 = arg0.field825;
        if (var3 >= var5) {
            if (var5 >= var3) {
                if (var4 < var6) {
                    arg0.field822 = 1024;
                } else if (var4 > var6) {
                    arg0.field822 = 0;
                }
            } else if (var6 > var4) {
                arg0.field822 = 768;
            } else if (var6 < var4) {
                arg0.field822 = 256;
            } else {
                arg0.field822 = 512;
            }
        } else if (var6 > var4) {
            arg0.field822 = 1280;
        } else if (var6 < var4) {
            arg0.field822 = 1792;
        } else {
            arg0.field822 = 1536;
        }
        int var8 = arg0.field822 - arg0.field864 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field871;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field876;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field813;
        }
        int var9 = 4;
        boolean var10 = arg1;
        if (var7 == -1) {
            var7 = arg0.field871;
        }
        arg0.field875 = var7;
        if (arg0 instanceof class53) {
            var10 = ((class53) arg0).field1337.field3471;
        }
        if (var10) {
            if (arg0.field864 != arg0.field822 && arg0.field807 == -1 && arg0.field859 != 0) {
                var9 = 2;
            }
            if (arg0.field843 > 2) {
                var9 = 6;
            }
            if (arg0.field843 > 3) {
                var9 = 8;
            }
            if (arg0.field836 > 0 && arg0.field843 > 1) {
                arg0.field836--;
                var9 = 8;
            }
        } else {
            if (arg0.field843 > 1) {
                var9 = 6;
            }
            if (arg0.field843 > 2) {
                var9 = 8;
            }
            if (arg0.field836 > 0 && arg0.field843 > 1) {
                arg0.field836--;
                var9 = 8;
            }
        }
        if (arg0.field817[arg0.field843 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg0.field828 += var9;
            if (arg0.field828 > var6) {
                arg0.field828 = var6;
            }
        } else if (var4 > var6) {
            arg0.field828 -= var9;
            if (var6 > arg0.field828) {
                arg0.field828 = var6;
            }
        }
        if (var3 < var5) {
            arg0.field854 += var9;
            if (var5 < arg0.field854) {
                arg0.field854 = var5;
            }
        } else if (var5 < var3) {
            arg0.field854 -= var9;
            if (var5 > arg0.field854) {
                arg0.field854 = var5;
            }
        }
        if (var9 >= 8 && arg0.field875 == arg0.field871 && arg0.field867 != -1) {
            arg0.field875 = arg0.field867;
        }
        if (arg0.field854 != var5 || arg0.field828 != var6) {
            return;
        }
        arg0.field843--;
        if (arg0.field844 > 0) {
            arg0.field844--;
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method132(int arg0) {
        field380 = null;
        if (arg0 >= -4) {
            field389 = null;
        }
        field406 = null;
        field393 = null;
        field398 = null;
        field389 = null;
        field404 = null;
    }
}
