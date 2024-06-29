import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class64 {

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    private int field1310 = 128;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    private int field1312 = 0;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "[S")
    private short[] field1317 = new short[6];

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    private int field1318 = 0;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    private int field1315 = 0;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "[S")
    private short[] field1316 = new short[6];

    @OriginalMember(owner = "client!j", name = "xb", descriptor = "I")
    public int field1332 = -1;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    private int field1311 = 128;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Ldd;")
    public static class26 field1308 = new class26(64);

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
    public static int field1323 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!j", name = "ub", descriptor = "Lrd;")
    private static class114 field1329 = class84.method656("Your profile will be transferred in:", (byte) 116);

    @OriginalMember(owner = "client!j", name = "sb", descriptor = "Lrd;")
    public static class114 field1327 = field1329;

    @OriginalMember(owner = "client!j", name = "Bb", descriptor = "Lrd;")
    private static class114 field1336 = class84.method656("Moderator option: Mute player for 48 hours: <ON>", (byte) 121);

    @OriginalMember(owner = "client!j", name = "zb", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!j", name = "Eb", descriptor = "Z")
    public static boolean field1339 = false;

    @OriginalMember(owner = "client!j", name = "yb", descriptor = "Lrd;")
    public static class114 field1333 = field1336;

    @OriginalMember(owner = "client!j", name = "Cb", descriptor = "Lrd;")
    private static class114 field1337 = class84.method656("Account locked as we suspect it has been stolen)3", (byte) 123);

    @OriginalMember(owner = "client!j", name = "Ab", descriptor = "Lrd;")
    public static class114 field1335 = field1337;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!j", name = "tb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!j", name = "vb", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!j", name = "wb", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!j", name = "Db", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
    public static void method502(boolean arg0) {
        field1337 = null;
        field1308 = null;
        if (!arg0) {
            method508((byte) 104);
        }
        field1336 = null;
        field1327 = null;
        field1333 = null;
        field1335 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I")
    public static final int method503(int arg0) {
        field1325++;
        return arg0 == -24556 ? 5 : 113;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILid;)V")
    public final void method504(int arg0, class60 arg1) {
        if (arg0 != 2530) {
            field1334 = -122;
        }
        while (true) {
            int var3 = arg1.method462((byte) 116);
            if (var3 == 0) {
                field1313++;
                return;
            }
            this.method510(-3, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method505(int arg0) {
        class86.field1926.method200(-112);
        class84.field1861.method200(arg0 ^ 0x7559);
        field1330++;
        if (arg0 != -29992) {
            field1320 = 33;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lrd;")
    public static final class114 method506(int arg0, int arg1) {
        field1338++;
        class114 var2 = class14.method113(arg0, -31766);
        int var3 = var2.method854(-29348) - 3;
        if (arg1 != 3056) {
            return null;
        }
        while (var3 > 0) {
            var2 = class101.method786((byte) 127, new class114[] { var2.method860(var3, -23745, 0), class124.field2928, var2.method866(false, var3) });
            var3 -= 3;
        }
        if (var2.method854(-29348) > 8) {
            var2 = class101.method786((byte) 125, new class114[] { class85.field1885, var2.method860(var2.method854(arg1 ^ -31060) - 8, arg1 + -26801, 0), class10.field163, class29.field594, var2, class84.field1873 });
        } else if (var2.method854(-29348) > 4) {
            var2 = class101.method786((byte) 127, new class114[] { class111.field2602, var2.method860(var2.method854(-29348) - 4, -23745, 0), class36.field770, class29.field594, var2, class84.field1873 });
        }
        return class101.method786((byte) 126, new class114[] { class141.field3362, var2 });
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILke;Ld;Z)V")
    public static final void method507(int arg0, class73 arg1, class22 arg2, boolean arg3) {
        if (!arg3) {
            field1335 = null;
        }
        field1326++;
        class125 var4 = new class125();
        var4.field2968 = 1;
        var4.field2966 = arg1;
        var4.field2980 = arg2;
        var4.field1448 = arg0;
        class84 var5 = class118.field2761;
        synchronized (class118.field2761) {
            class118.field2761.method645(var4, (byte) 120);
        }
        class5.method51((byte) 120);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static final void method508(byte arg0) {
        field1331++;
        if (!class14.field308) {
            return;
        }
        class69.field1520 = null;
        class24.field474 = null;
        class79.field1803 = null;
        if (arg0 < 45) {
            field1336 = null;
        }
        class58.field1211 = null;
        class9.field131 = null;
        class50.field1050 = null;
        class79.field1792 = null;
        class55.field1159 = null;
        class29.field580 = null;
        class118.field2773 = null;
        class74.field1676 = null;
        class39.field826 = null;
        class103.field2405 = null;
        class14.field308 = false;
        class89.field1977 = null;
        class10.field167 = null;
        client.field411 = null;
        class111.field2583 = null;
        class101.field2334 = null;
        class11.field187 = null;
        class3.field34 = null;
        class58.field1207 = null;
        class49.field1021 = null;
        class79.field1801 = null;
        class60.field1251 = null;
        class114.field2638 = null;
        class86.field1933 = null;
        class73.field1643 = null;
        class142.field3389 = null;
        class121.field2828 = null;
        class25.field489 = null;
        class56.field1178 = null;
        class20.field351 = null;
        class90.field2115 = null;
        class121.field2834 = null;
        class132.field3199 = null;
        class25.field514 = null;
        class61.field1307 = null;
        class42.field866 = null;
        class50.field1048 = null;
        class109.field2522 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)I")
    public static final int method509(int arg0, int arg1, int arg2, int arg3) {
        field1319++;
        if (arg2 > 179) {
            arg0 /= 2;
        }
        if (arg2 > 192) {
            arg0 /= 2;
        }
        int var4 = 19 / ((arg1 + 15) / 37);
        if (arg2 > 217) {
            arg0 /= 2;
        }
        if (arg2 > 243) {
            arg0 /= 2;
        }
        return (arg3 / 4 << 10) + (arg0 / 32 << 7) + arg2 / 2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILid;)V")
    private final void method510(int arg0, int arg1, class60 arg2) {
        field1321++;
        if (arg1 == 1) {
            this.field1309 = arg2.method467(255);
        } else if (arg1 == 2) {
            this.field1332 = arg2.method467(arg0 ^ 0xFFFFFF02);
        } else if (arg1 == 4) {
            this.field1310 = arg2.method467(255);
        } else if (arg1 == 5) {
            this.field1311 = arg2.method467(255);
        } else if (arg1 == 6) {
            this.field1318 = arg2.method467(255);
        } else if (arg1 == 7) {
            this.field1312 = arg2.method462((byte) 116);
        } else if (arg1 == 8) {
            this.field1315 = arg2.method462((byte) 116);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field1317[arg1 - 40] = (short) arg2.method467(arg0 + 258);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field1316[arg1 - 50] = (short) arg2.method467(255);
        }
        if (arg0 != -3) {
            field1334 = 74;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lue;")
    public final class133 method511(int arg0, int arg1) {
        field1328++;
        class133 var3 = (class133) class135.field3286.method194((byte) -98, (long) this.field1322);
        if (arg0 != -1565796086) {
            this.field1317 = null;
        }
        if (var3 == null) {
            class71 var4 = class71.method577(class140.field3345, this.field1309, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field1317[0] != 0) {
                    var4.method580(this.field1317[var5], this.field1316[var5]);
                }
            }
            var3 = var4.method569(this.field1312 + 64, this.field1315 + 850, -30, -50, -30);
            class135.field3286.method193(-84, var3, (long) this.field1322);
        }
        class133 var6;
        if (this.field1332 == -1 || arg1 == -1) {
            var6 = var3.method1072(true);
        } else {
            var6 = class12.method97(this.field1332, false).method211(arg0 + 1565795978, arg1, var3);
        }
        if (this.field1310 != 128 || this.field1311 != 128) {
            var6.method1065(this.field1310, this.field1311, this.field1310);
        }
        if (this.field1318 != 0) {
            if (this.field1318 == 90) {
                var6.method1067();
            }
            if (this.field1318 == 180) {
                var6.method1067();
                var6.method1067();
            }
            if (this.field1318 == 270) {
                var6.method1067();
                var6.method1067();
                var6.method1067();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
    public static final void method512(int arg0) {
        if (arg0 != -826) {
            field1336 = null;
        }
        client.field415 = 0;
        field1324++;
        int var1 = (class7.field103.field712 >> 7) + class72.field1611;
        int var2 = (class7.field103.field756 >> 7) + class65.field1408;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            client.field415 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            client.field415 = 1;
        }
        if (client.field415 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            client.field415 = 0;
        }
    }
}
