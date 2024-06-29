import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class185 {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[Z")
    public static boolean[] field2668;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method1283(byte arg0) {
        if (arg0 < 35) {
            return true;
        } else {
            field2670++;
            return (this.field2676 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method1284(int arg0) {
        field2667++;
        if (arg0 != 0) {
            method1289(-80, (byte) -84);
        }
        return (this.field2676 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V", line = 37)
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2666++;
        if (class232.field3393 < 100) {
            class154.method1033(19443);
        }
        if (class250.field3787) {
            class306.method2149(arg4, arg0, arg2 + arg4, arg0 + arg3);
        } else {
            class144.method972(arg4, arg0, arg2 + arg4, arg0 + arg3);
        }
        if (class232.field3393 < 100) {
            byte var14 = 20;
            int var15 = arg4 + (arg2 / 2);
            int var16 = arg3 / 2 + (arg0 - var14) - 18;
            if (class250.field3787) {
                class306.method2154(arg4, arg0, arg2, arg3, 0);
                class306.method2156(var15 - 152, var16, 304, 34, 9179409);
                class306.method2156(var15 - 151, var16 + 1, 302, 32, 0);
                class306.method2154(var15 - 150, var16 - -2, class232.field3393 * 3, 30, 9179409);
                class306.method2154(class232.field3393 * 3 + var15 - 150, var16 + 2, 300 - (class232.field3393 * 3), 30, 0);
            } else {
                class144.method977(arg4, arg0, arg2, arg3, 0);
                class144.method964(var15 - 152, var16, 304, 34, 9179409);
                class144.method964(var15 - 151, var16 - -1, 302, 32, 0);
                class144.method977(var15 - 150, var16 + 2, class232.field3393 * 3, 30, 9179409);
                class144.method977(class232.field3393 * 3 + (var15 - 150), var16 + 2, 300 - class232.field3393 * 3, 30, 0);
            }
            class88.field1097.method64(class137.field1916, var15, var14 + var16, 16777215, -1);
            return;
        }
        class91.field1143 = (int) ((float) (arg3 * 2) / class5.field78);
        if (arg1 != 31629) {
            field2669 = -116;
        }
        class45.field539 = (int) ((float) (arg2 * 2) / class5.field78);
        class165.field2280 = class231.field3373 - (int) ((float) arg2 / class5.field78);
        class9.field128 = class184.field2663 - (int) ((float) arg3 / class5.field78);
        int var5 = class184.field2663 - ((int) ((float) arg3 / class5.field78));
        int var6 = class231.field3373 - ((int) ((float) arg2 / class5.field78));
        int var7 = (int) ((float) arg2 / class5.field78) + class231.field3373;
        int var8 = (int) ((float) arg3 / class5.field78) + class184.field2663;
        if (class250.field3787) {
            if (class292.field4587 == null || class292.field4587.field1136 != arg2 || class292.field4587.field1144 != arg3) {
                class292.field4587 = null;
                class292.field4587 = new class189(arg2, arg3);
            }
            class144.method973(class292.field4587.field2717, arg2, arg3);
            class244.method1755(var6, 0, var5, var8, arg3, var7, (byte) 122, 0, arg2);
            class42.method246(var5, var6, 0, arg3, var8, var7, 0, 0, class141.field1969, arg2);
            class84.method497(0, var5, 0, var8, arg3, var7, var6, arg2, -107);
            class292.field4587.method1318();
            class306.method2139(class292.field4587.field2717, arg4, arg0, arg2, arg3);
            class144.field2005 = null;
        } else {
            class244.method1755(var6, arg0, var5, var8, arg0 + arg3, var7, (byte) 121, arg4, arg2 + arg4);
            class42.method246(var5, var6, 0, arg0 + arg3, var8, var7, arg0, arg4, class141.field1969, arg2 + arg4);
            class84.method497(arg4, var5, arg0, var8, arg0 + arg3, var7, var6, arg2 + arg4, -125);
        }
        if (class313.field4842 > 0) {
            class312.field4830--;
            if (class312.field4830 == 0) {
                class313.field4842--;
                class312.field4830 = 20;
            }
        }
        if (!class132.field1819) {
            return;
        }
        int var9 = arg2 + arg4 - 5;
        int var10 = arg0 + arg3 - 8;
        class179.field2601.method71("Fps:" + class180.field2613, var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        class179.field2601.method71("Mem:" + var12 + "k", var9, var17, var13, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 159)
    public static void method1286(int arg0) {
        if (arg0 == 27169) {
            field2668 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lcc;B)V", line = 169)
    public static final void method1287(class263 arg0, byte arg1) {
        field2665++;
        if (arg1 != -77) {
            field2669 = 120;
        }
        int var2 = arg0.field4113;
        if (var2 == 324) {
            if (class205.field2876 == -1) {
                class205.field2876 = arg0.field4066;
                class94.field1227 = arg0.field4140;
            }
            if (class62.field780.field5190) {
                arg0.field4066 = class205.field2876;
            } else {
                arg0.field4066 = class94.field1227;
            }
        } else if (var2 == 325) {
            if (class205.field2876 == -1) {
                class205.field2876 = arg0.field4066;
                class94.field1227 = arg0.field4140;
            }
            if (class62.field780.field5190) {
                arg0.field4066 = class94.field1227;
            } else {
                arg0.field4066 = class205.field2876;
            }
        } else if (var2 == 327) {
            arg0.field4131 = 150;
            arg0.field4120 = (int) (Math.sin((double) class38.field463 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4034 = -1;
            arg0.field4142 = 5;
        } else if (var2 == 328) {
            if (class118.field1664.field1496 == null) {
                arg0.field4034 = 0;
            } else {
                arg0.field4131 = 150;
                arg0.field4120 = (int) (Math.sin((double) class38.field463 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field4142 = 5;
                arg0.field4034 = ((int) class48.method285((byte) -90, class118.field1664.field1496) << 11) + 2047;
                arg0.field4153 = class118.field1664.field2363;
                arg0.field4042 = class118.field1664.field2413;
                arg0.field4050 = 0;
                arg0.field4134 = class118.field1664.field2376;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z", line = 244)
    public static final boolean method1288(int arg0, int arg1, int arg2, int arg3) {
        if (class99.method600(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class184.method1282(var4 + 1, class167.field2324[arg0][arg1][arg2] + arg3, var5 + 1) && class184.method1282(var4 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class184.method1282(var4 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class184.method1282(var4 + 1, class167.field2324[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Lqm;", line = 259)
    public static final class247 method1289(int arg0, byte arg1) {
        field2672++;
        class247 var2 = (class247) class222.field3146.method1239((byte) -73, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field79.method1199(28815, class256.method1860(-86, arg0), class249.method1788(arg0, 0));
        if (arg1 < 104) {
            return (class247) null;
        }
        class247 var4 = new class247();
        var4.field3739 = arg0;
        if (var3 != null) {
            var4.method1775(30544, new class107(var3));
        }
        var4.method1780(-112);
        class222.field3146.method1243(var4, (long) arg0, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z", line = 286)
    public final boolean method1290(int arg0) {
        field2675++;
        if (arg0 != -27585) {
            this.method1291(36);
        }
        return (this.field2676 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Z", line = 306)
    public final boolean method1291(int arg0) {
        if (arg0 >= -84) {
            field2669 = -23;
        }
        field2674++;
        return (this.field2676 & 0x1) != 0;
    }
}
