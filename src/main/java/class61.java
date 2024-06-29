import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class61 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lsg;")
    public static class169 field1124 = class165.method1060("M", 1536);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lsg;")
    private static class169 field1133 = class165.method1060("Connecting to server)3)3)3", 1536);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lsg;")
    public static class169 field1131 = field1133;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lsg;")
    private static class169 field1134 = class165.method1060("Click to switch", 1536);

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lsg;")
    public static class169 field1128 = field1134;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lsg;")
    private static class169 field1135 = class165.method1060("Take", 1536);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lsg;")
    public static class169 field1125 = field1135;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lsg;")
    public static class169 field1139 = class165.method1060("oder benutzen Sie eine andere Welt)3", 1536);

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field1133 = null;
        field1131 = null;
        field1139 = null;
        field1128 = null;
        field1135 = null;
        field1134 = null;
        field1125 = null;
        if (arg0 != 110272750) {
            field1135 = null;
        }
        field1124 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILoa;)Lh;")
    public static final class64 method379(int arg0, class127 arg1) {
        field1138++;
        int var2 = arg1.method819((byte) 22);
        int var3 = arg1.method819((byte) 22);
        Class var4 = class91.method535(33, var3);
        try {
            if (arg0 != 0) {
                return null;
            }
            class64 var5 = (class64) var4.getDeclaredConstructor().newInstance();
            if (var5 != null) {
                var5.field1178 = var2;
                var5.field1186 = arg1.method819((byte) 22);
                int var6 = arg1.method819((byte) 22);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg1.method819((byte) 22);
                    var5.method14((byte) -101, arg1, var8);
                }
            }
            var5.method17(false);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method380(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1126++;
        if (arg0 >= 1 && arg7 >= 1 && arg0 <= 102 && arg7 <= 102) {
            if (class105.field1925 && field1132 != arg1) {
                return;
            }
            int var8 = 0;
            if (arg5 == 0) {
                var8 = class196.field3840.method896(arg1, arg0, arg7);
            }
            boolean var9 = false;
            boolean var10 = true;
            if (arg5 == 1) {
                var8 = class196.field3840.method901(arg1, arg0, arg7);
            }
            if (arg5 == 2) {
                var8 = class196.field3840.method882(arg1, arg0, arg7);
            }
            if (arg5 == 3) {
                var8 = class196.field3840.method891(arg1, arg0, arg7);
            }
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = class196.field3840.method878(arg1, arg0, arg7, var8);
                int var13 = var8 >> 14 & 0x7FFF;
                int var14 = var12 >> 6 & 0x3;
                int var15 = var12 & 0x1F;
                if (arg5 == 0) {
                    class196.field3840.method908(arg1, arg0, arg7);
                    class17 var16 = class138.method925(6, var13);
                    if (var16.field360 != 0) {
                        client.field575[arg1].method1261(arg0, false, var15, var16.field399, var14, arg7);
                    }
                }
                if (arg5 == 1) {
                    class196.field3840.method899(arg1, arg0, arg7);
                }
                if (arg5 == 2) {
                    class196.field3840.method904(arg1, arg0, arg7);
                    class17 var17 = class138.method925(6, var13);
                    if (arg0 + var17.field369 > 103 || var17.field369 + arg7 > 103 || var17.field400 + arg0 > 103 || var17.field400 + arg7 > 103) {
                        return;
                    }
                    if (var17.field360 != 0) {
                        client.field575[arg1].method1270(-96, arg0, var17.field399, arg7, var17.field369, var14, var17.field400);
                    }
                }
                if (arg5 == 3) {
                    class196.field3840.method887(arg1, arg0, arg7);
                    class17 var18 = class138.method925(6, var13);
                    if (var18.field360 == 1) {
                        client.field575[arg1].method1262(-262145, arg7, arg0);
                    }
                }
            }
            if (arg4 >= 0) {
                int var19 = arg1;
                if (arg1 < 3 && (class159.field3040[1][arg0][arg7] & 0x2) == 2) {
                    var19 = arg1 + 1;
                }
                class56.method353(1, arg0, arg3, arg1, var19, arg6, arg7, client.field575[arg1], class196.field3840, arg4);
            }
        }
        if (arg2) {
            method378(-80);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method381(int arg0) {
        class154.field2971.method1080(-111);
        field1129++;
        class201.field3927 = 1;
        class3.field71 = null;
        if (arg0 != -104) {
            method378(83);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIZ)I")
    public static final int method382(byte[] arg0, int arg1, boolean arg2) {
        field1136++;
        return arg2 ? 125 : class56.method354((byte) -80, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method383(int arg0, int arg1) {
        for (class6 var2 = (class6) class204.field4003.method1042((byte) 104); var2 != null; var2 = (class6) class204.field4003.method1047((byte) 64)) {
            if ((var2.field3543 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1213(9104);
            }
        }
        if (arg1 != 0) {
            method380(22, 31, true, -127, -4, 44, 43, 100);
        }
        field1137++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method384(byte arg0) {
        class125.field2293 = null;
        class125.field2284 = null;
        class193.field3808 = null;
        field1130++;
        if (arg0 < 13) {
            method381(-47);
        }
    }
}
