import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
    public boolean field1027 = true;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
    public static int[] field1035 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lr;")
    private static class118 field1025 = class153.method1136(79, "World");

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lr;")
    public static class118 field1030 = class153.method1136(81, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lr;")
    private static class118 field1023 = class153.method1136(119, "Please use a different world)3");

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lr;")
    public static class118 field1021 = field1025;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lr;")
    public static class118 field1028 = field1023;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lr;")
    public static class118 field1026 = field1023;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lr;")
    public static class118 field1033 = field1025;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lr;")
    public static class118 field1039 = class153.method1136(125, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "[I")
    public static int[] field1041;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[Lec;")
    public static class32[] field1024;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lr;")
    public static final class118 method359(int arg0, byte arg1) {
        if (arg1 == -122) {
            field1020++;
            return class139.method1039(10, arg0, -75, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILff;Lr;Lr;IIZ)V")
    public static final void method360(int arg0, class42 arg1, class118 arg2, class118 arg3, int arg4, int arg5, boolean arg6) {
        field1029++;
        int var7 = arg1.method356(arg3, arg0);
        int var8 = arg1.method351(5, arg2, var7);
        class69.method588(arg4, arg1, arg6, arg5, var8, 1, var7);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field1039 = null;
        field1024 = null;
        field1035 = null;
        int var1 = 13 % ((58 - arg0) / 38);
        field1025 = null;
        field1021 = null;
        field1028 = null;
        field1041 = null;
        field1030 = null;
        field1033 = null;
        field1023 = null;
        field1026 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
    public static final Object method362(byte[] arg0, boolean arg1, boolean arg2) {
        field1034++;
        if (arg2) {
            field1021 = null;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class70.field1627) {
            try {
                class4 var3 = (class4) Class.forName("qe").getDeclaredConstructor().newInstance();
                var3.method12((byte) -23, arg0);
                return var3;
            } catch (Throwable var4) {
                class70.field1627 = true;
            }
        }
        return arg1 ? class153.method1133(-7, arg0) : arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    public static final void method363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1032++;
        class52.method461(arg3, arg1, arg0 + arg3, arg1 + arg2);
        class58.method515();
        class159.field3660++;
        class11.method81(0, true);
        class25.method222(false, true);
        class11.method81(arg4 ^ arg4, false);
        class25.method222(false, false);
        class121.method951(-1);
        class56.method500((byte) -119);
        if (!class24.field575) {
            int var5 = class94.field2235 + class103.field2375 & 0x7FF;
            int var6 = class64.field1472;
            if (var6 < class67.field1561 / 256) {
                var6 = class67.field1561 / 256;
            }
            if (class110.field2577[4] && class83.field1998[4] + 128 > var6) {
                var6 = class83.field1998[4] + 128;
            }
            class54.method489(var6, var5, class115.field2675, (byte) -96, var6 * 3 + 600, class46.method386(arg4 ^ -15185, class106.field2468, class89.field2150.field760, class89.field2150.field712) + -50, class158.field3645);
        }
        int var7;
        if (class24.field575) {
            var7 = class15.method137(arg4 + 124);
        } else {
            var7 = class71.method604((byte) 88);
        }
        int var8 = class44.field1051;
        int var9 = class1.field25;
        int var10 = class85.field2093;
        int var11 = class24.field580;
        int var12 = class85.field2092;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class110.field2577[var13]) {
                int var16 = (int) ((double) -class45.field1071[var13] + (double) (class45.field1071[var13] * 2 + 1) * Math.random() + Math.sin((double) class74.field1835[var13] / 100.0D * (double) class35.field873[var13]) * (double) class83.field1998[var13]);
                if (var13 == 2) {
                    class44.field1051 += var16;
                }
                if (var13 == 1) {
                    class85.field2093 += var16;
                }
                if (var13 == 0) {
                    class24.field580 += var16;
                }
                if (var13 == 3) {
                    class1.field25 = class1.field25 + var16 & 0x7FF;
                }
                if (var13 == 4) {
                    class85.field2092 += var16;
                    if (class85.field2092 < 128) {
                        class85.field2092 = 128;
                    }
                    if (class85.field2092 > 383) {
                        class85.field2092 = 383;
                    }
                }
            }
        }
        int var14 = class33.field827;
        int var15 = class44.field1049;
        if (var14 >= arg3 && arg0 + arg3 > var14 && arg1 <= var15 && var15 < arg1 + arg2) {
            class155.field3594 = 0;
            class155.field3596 = class33.field827 - arg3;
            class155.field3602 = class44.field1049 - arg1;
            class155.field3579 = true;
        } else {
            class155.field3579 = false;
            class155.field3594 = 0;
        }
        class54.method490(arg4 ^ 0x40001);
        class52.method473(arg3, arg1, arg0, arg2, 0);
        class54.method490(262144);
        class68.field1583.method1168(class24.field580, class85.field2093, class44.field1051, class85.field2092, class1.field25, var7);
        class54.method490(arg4 ^ 0x40001);
        class68.field1583.method1192();
        class63.method559(arg1, arg3, -8, arg0, arg2);
        class61.method546(arg3, 512, arg1);
        ((class77) class58.field1351).method655(-16890, class9.field212);
        class81.method675(arg3, arg0, arg2, true, arg1);
        class85.field2092 = var12;
        class44.field1051 = var8;
        class85.field2093 = var10;
        class1.field25 = var9;
        class24.field580 = var11;
        if (class44.field1050 && class55.method495(false, true, 0) == 0) {
            class44.field1050 = false;
        }
        if (class44.field1050) {
            class52.method473(arg3, arg1, arg0, arg2, 0);
            class35.method292(class20.field481, false, (byte) -92);
        }
        if (!class44.field1050 && !class138.field3144 && arg3 <= var14 && var14 < arg3 + arg0 && arg1 <= var15 && arg1 + arg2 > var15) {
            class128.method1005(var14, arg1, arg3, false, var15);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BZI)Lr;")
    public static final class118 method364(byte arg0, boolean arg1, int arg2) {
        if (arg0 != -112) {
            field1025 = null;
        }
        field1038++;
        return class139.method1039(10, arg2, -91, arg1);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1022 = arg1;
        this.field1037 = arg2;
        this.field1040 = arg5;
        this.field1036 = arg3;
        this.field1042 = arg0;
        this.field1031 = arg4;
        this.field1027 = arg6;
    }
}
