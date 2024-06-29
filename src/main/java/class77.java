import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1871 = -1;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[[[Lse;")
    public static class130[][][] field1878 = new class130[4][104][104];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lhe;")
    private static class54 field1883 = class6.method58("We suspect someone knows your password)3", false);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field1880 = new int[500];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lhe;")
    public static class54 field1882 = class6.method58(" )2>", false);

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lhe;")
    public static class54 field1879 = field1883;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lm;")
    public static class83 field1874;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILvb;Ljava/awt/Component;I)Lld;")
    public static final class80 method588(int arg0, int arg1, class148 arg2, Component arg3, int arg4) {
        field1875++;
        if (class134.field3037 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class80 var5 = (class80) Class.forName("sb").getDeclaredConstructor().newInstance();
                var5.field1987 = arg1;
                var5.field1968 = new int[(class38.field922 ? 2 : 1) * 256];
                var5.method613(arg3);
                var5.field1993 = (arg1 & 0xFFFFFC00) + 1024;
                if (arg0 >= -56) {
                    method589(97);
                }
                if (var5.field1993 > 16384) {
                    var5.field1993 = 16384;
                }
                var5.method620(var5.field1993);
                if (class86.field2136 > 0 && class88.field2174 == null) {
                    class88.field2174 = new class94();
                    class88.field2174.field2377 = arg2;
                    arg2.method1121(class88.field2174, class86.field2136, 83);
                }
                if (class88.field2174 != null) {
                    if (class88.field2174.field2376[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class88.field2174.field2376[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class97 var6 = new class97(arg2, arg4);
                    var6.field1968 = new int[(class38.field922 ? 2 : 1) * 256];
                    var6.field1987 = arg1;
                    var6.method613(arg3);
                    var6.field1993 = 16384;
                    var6.method620(var6.field1993);
                    if (class86.field2136 > 0 && class88.field2174 == null) {
                        class88.field2174 = new class94();
                        class88.field2174.field2377 = arg2;
                        arg2.method1121(class88.field2174, class86.field2136, 10);
                    }
                    if (class88.field2174 != null) {
                        if (class88.field2174.field2376[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class88.field2174.field2376[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class80();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1880 = null;
        field1883 = null;
        if (arg0 != 14778) {
            field1872 = -93;
        }
        field1878 = null;
        field1879 = null;
        field1882 = null;
        field1874 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIII)I")
    public static final int method590(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        if (!arg1) {
            method591(-25, -35, -32);
        }
        int var8 = arg2 & 0x3;
        field1877++;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    public static final void method591(int arg0, int arg1, int arg2) {
        field1881++;
        if (class75.field1866 != 0 && class75.field1866 != 3) {
            return;
        }
        if (arg2 != 0) {
            field1878 = null;
        }
        if (class124.field2854 != 1) {
            return;
        }
        int var3 = class71.field1763 - arg1 - 25;
        int var4 = class21.field582 - arg0 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class91.field2220 + class63.field1533 & 0x7FF;
        int var6 = class152.field3416[var5];
        int var7 = (class40.field1050 + 256) * var6 >> 8;
        int var8 = class152.field3420[var5];
        int var9 = (class40.field1050 + 256) * var8 >> 8;
        int var10 = var4 * var9 - var3 * var7 >> 11;
        int var11 = var4 * var7 + var3 * var9 >> 11;
        int var12 = class108.field2639.field974 + var11 >> 7;
        int var13 = class108.field2639.field971 - var10 >> 7;
        boolean var14 = class121.method935(0, class108.field2639.field951[0], var13, var12, 0, 0, true, 1, 0, 0, 0, class108.field2639.field952[0]);
        if (!var14) {
            return;
        }
        class131.field2969.method649((byte) -27, var3);
        class131.field2969.method649((byte) -27, var4);
        class131.field2969.method629(class91.field2220, 2018779304);
        class131.field2969.method649((byte) -27, 57);
        class131.field2969.method649((byte) -27, class63.field1533);
        class131.field2969.method649((byte) -27, class40.field1050);
        class131.field2969.method649((byte) -27, 89);
        class131.field2969.method629(class108.field2639.field974, 2018779304);
        class131.field2969.method629(class108.field2639.field971, 2018779304);
        class131.field2969.method649((byte) -27, class9.field277);
        class131.field2969.method649((byte) -27, 63);
        return;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method592(int arg0) {
        field1876++;
        if (class142.field3236 != null) {
            class142.field3236.method1130(-31709);
            class142.field3236 = null;
        }
        class124.method952(true);
        class74.field1831.method1053();
        for (int var1 = arg0; var1 < 4; var1++) {
            class111.field2652[var1].method46(true);
        }
        System.gc();
        class64.method501(2, arg0 + 69);
        class52.field1236 = false;
        class4.field140 = -1;
        class91.method733((byte) 93);
        class4.method28(10, 1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILhe;)V")
    public static final void method593(byte arg0, int arg1, class54 arg2) {
        class131.field2969.method454(66, -83);
        int var3 = -28 / ((-arg0 - 47) / 43);
        class131.field2969.method632(arg1, 128);
        class79.field1942++;
        field1873++;
        class131.field2969.method678(1918583904, arg2.method385((byte) -111));
    }
}
