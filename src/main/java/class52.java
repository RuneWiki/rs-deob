import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class121 {

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    private int field1239 = 128;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
    public int field1250 = -1;

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
    private int field1253 = 0;

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
    private int field1254 = 0;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field1242 = 128;

    @OriginalMember(owner = "client!hc", name = "Cb", descriptor = "I")
    private int field1267 = 0;

    @OriginalMember(owner = "client!hc", name = "Bb", descriptor = "[S")
    private short[] field1266 = new short[6];

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "[S")
    private short[] field1251 = new short[6];

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lhe;")
    public static class54 field1237 = class6.method58("Lade Titelbild )2 ", false);

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lhe;")
    public static class54 field1245 = class6.method58("p11_full", false);

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Z")
    public static boolean field1236 = false;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!hc", name = "wb", descriptor = "Lhe;")
    private static class54 field1261 = class6.method58("You can(Wt add yourself to your own ignore list", false);

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "[I")
    public static int[] field1243 = new int[32];

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "Lhe;")
    private static class54 field1264 = class6.method58("Please reload this page)3", false);

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "Lhe;")
    private static class54 field1257 = class6.method58("Click to switch", false);

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lhe;")
    public static class54 field1246 = class6.method58("Fehler beim Laden Ihres Spielcharakters)3", false);

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lhe;")
    public static class54 field1238 = field1261;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!hc", name = "Fb", descriptor = "Lhe;")
    private static class54 field1270 = class6.method58("Loaded input handler", false);

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lhe;")
    public static class54 field1260 = field1270;

    @OriginalMember(owner = "client!hc", name = "Hb", descriptor = "Lhe;")
    public static class54 field1272 = field1264;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lhe;")
    public static class54 field1240 = field1257;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!hc", name = "yb", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!hc", name = "Ab", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hc", name = "Db", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!hc", name = "Eb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!hc", name = "Gb", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "Leb;")
    public static class31 field1252;

    @OriginalMember(owner = "client!hc", name = "xb", descriptor = "Leb;")
    public static class31 field1262;

    @OriginalMember(owner = "client!hc", name = "Ib", descriptor = "Lld;")
    public static class80 field1273;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field1241;

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "Z")
    public static boolean field1255;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lef;IIB)[Lce;")
    public static final class20[] method364(class35 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 111) {
            method368(-22, 105, -105, (byte) 56, -82, -111, -39, -73);
        }
        field1256++;
        return class107.method814(-30384, arg1, arg2, arg0) ? class89.method707(-31783) : null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILm;I)V")
    private final void method365(int arg0, class83 arg1, int arg2) {
        field1265++;
        if (arg2 == 1) {
            this.field1271 = arg1.method631((byte) -104);
        } else if (arg2 == 2) {
            this.field1250 = arg1.method631((byte) -128);
        } else if (arg2 == 4) {
            this.field1242 = arg1.method631((byte) -104);
        } else if (arg2 == 5) {
            this.field1239 = arg1.method631((byte) -105);
        } else if (arg2 == 6) {
            this.field1254 = arg1.method631((byte) -117);
        } else if (arg2 == 7) {
            this.field1253 = arg1.method638(0);
        } else if (arg2 == 8) {
            this.field1267 = arg1.method638(0);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field1251[arg2 - 40] = (short) arg1.method631((byte) -125);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field1266[arg2 - 50] = (short) arg1.method631((byte) -122);
        }
        if (arg0 != 32767) {
            this.field1254 = -23;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
    public static void method366(boolean arg0) {
        field1260 = null;
        field1264 = null;
        field1245 = null;
        field1241 = null;
        field1240 = null;
        field1257 = null;
        field1237 = null;
        field1246 = null;
        field1238 = null;
        if (arg0) {
            method370(125);
        }
        field1273 = null;
        field1272 = null;
        field1243 = null;
        field1262 = null;
        field1261 = null;
        field1270 = null;
        field1252 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method367(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        field1248++;
        if (arg1 == 0) {
            return class67.field1651 != null && class67.field1651.field154 == var3 ? class77.field1874.field2076 * 99 / (class77.field1874.field2055.length - class67.field1651.field2083) + 1 : 0;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method368(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1249++;
        if (arg3 > -20) {
            method368(-111, 22, 94, (byte) -61, -47, 42, 71, -20);
        }
        if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
            return;
        }
        if (class118.field2768 && class157.field3573 != arg1) {
            return;
        }
        int var8 = 0;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg7 == 0) {
            var8 = class74.field1831.method1043(arg1, arg2, arg6);
        }
        if (arg7 == 1) {
            var8 = class74.field1831.method1048(arg1, arg2, arg6);
        }
        if (arg7 == 2) {
            var8 = class74.field1831.method1020(arg1, arg2, arg6);
        }
        if (arg7 == 3) {
            var8 = class74.field1831.method1018(arg1, arg2, arg6);
        }
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class74.field1831.method1063(arg1, arg2, arg6, var8);
            int var14 = var13 >> 6 & 0x3;
            int var15 = var13 & 0x1F;
            if (arg7 == 0) {
                class74.field1831.method1045(arg1, arg2, arg6);
                class3 var16 = class4.method34(true, var12);
                if (var16.field83 != 0) {
                    class111.field2652[arg1].method37(arg2, 1, arg6, var16.field40, var14, var15);
                }
            }
            if (arg7 == 1) {
                class74.field1831.method1024(arg1, arg2, arg6);
            }
            if (arg7 == 2) {
                class74.field1831.method1029(arg1, arg2, arg6);
                class3 var17 = class4.method34(true, var12);
                if (arg2 + var17.field67 > 103 || arg6 + var17.field67 > 103 || arg2 + var17.field86 > 103 || var17.field86 + arg6 > 103) {
                    return;
                }
                if (var17.field83 != 0) {
                    class111.field2652[arg1].method42(arg6, arg2, var17.field67, (byte) 56, var17.field86, var14, var17.field40);
                }
            }
            if (arg7 == 3) {
                class74.field1831.method1015(arg1, arg2, arg6);
                class3 var18 = class4.method34(true, var12);
                if (var18.field83 == 1) {
                    class111.field2652[arg1].method39(arg2, arg6, -1);
                }
            }
        }
        if (arg0 < 0) {
            return;
        }
        int var19 = arg1;
        if (arg1 < 3 && (class87.field2152[1][arg2][arg6] & 0x2) == 2) {
            var19 = arg1 + 1;
        }
        class83.method679(arg4, class111.field2652[arg1], arg6, arg1, arg0, var19, arg5, 531, arg2, class74.field1831);
        return;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILm;)V")
    public final void method369(int arg0, class83 arg1) {
        field1259++;
        if (arg0 != -40) {
            return;
        }
        while (true) {
            int var3 = arg1.method638(0);
            if (var3 == 0) {
                return;
            }
            this.method365(32767, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method370(int arg0) {
        field1268++;
        class28.field753.method992(0);
        class50.field1216.method992(0);
        class15.field457.method992(0);
        if (arg0 >= -35) {
            method366(false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Loa;")
    public final class98 method371(int arg0, int arg1) {
        field1269++;
        class98 var3 = (class98) class134.field3040.method991((long) this.field1263, true);
        int var4 = 67 / ((14 - arg0) / 50);
        if (var3 == null) {
            class41 var5 = class41.method305(class130.field2932, this.field1271, 0);
            if (var5 == null) {
                return null;
            }
            for (int var6 = 0; var6 < 6; var6++) {
                if (this.field1251[0] != 0) {
                    var5.method322(this.field1251[var6], this.field1266[var6]);
                }
            }
            var3 = var5.method317(this.field1253 + 64, this.field1267 + 850, -30, -50, -30);
            class134.field3040.method990(true, (long) this.field1263, var3);
        }
        class98 var7;
        if (this.field1250 == -1 || arg1 == -1) {
            var7 = var3.method774(true);
        } else {
            var7 = class135.method1010(this.field1250, (byte) -122).method1099((byte) -77, arg1, var3);
        }
        if (this.field1242 != 128 || this.field1239 != 128) {
            var7.method778(this.field1242, this.field1239, this.field1242);
        }
        if (this.field1254 != 0) {
            if (this.field1254 == 90) {
                var7.method775();
            }
            if (this.field1254 == 180) {
                var7.method775();
                var7.method775();
            }
            if (this.field1254 == 270) {
                var7.method775();
                var7.method775();
                var7.method775();
            }
        }
        return var7;
    }
}
