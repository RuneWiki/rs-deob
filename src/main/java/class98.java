import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class98 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    private int field1302 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    private int field1304 = 128;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
    public boolean field1311 = false;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Z")
    public boolean field1317 = false;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field1314 = 0;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    private int field1300 = 0;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    private int field1305 = 128;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1298 = " has logged out.";

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1295 = "Loaded wordpack";

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "Z")
    public static boolean field1321 = true;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "[S")
    private short[] field1303;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[S")
    private short[] field1309;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[S")
    private short[] field1316;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "[S")
    private short[] field1319;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lpd;I)V")
    public final void method603(class96 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method611(-11, -114, -116, 21);
                }
                field1307++;
                return;
            }
            this.method606(var3, arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Leh;Leh;I)V")
    public static final void method604(class137 arg0, class137 arg1, int arg2) {
        class5.field84 = class286.method1928(0, class287.field4584, arg0, -102, arg1);
        class11.field129 = (class140) class5.field84;
        class166.field2664 = class286.method1928(0, class76.field951, arg0, -114, arg1);
        field1308++;
        class280.field4439 = class286.method1928(0, class207.field3315, arg0, -75, arg1);
        if (arg2 != 28324) {
            field1315 = -27;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lol;ZI)V")
    public static final void method605(class109 arg0, boolean arg1, int arg2) {
        if (arg1) {
            int var3 = class292.field4640;
            int var4 = var3 * 956 / 503;
            class213.field3428.method320((class283.field4517 - var4) / 2, 0, var4, var3);
            class138.field2211.method915(class283.field4517 / 2 - class138.field2211.field2139 / 2, 18);
        }
        arg0.method685(class143.field2262, class283.field4517 / 2, class292.field4640 / 2 - 26, 16777215, -1);
        field1313++;
        int var5 = class292.field4640 / 2 - 18;
        class217.method1528(class283.field4517 / 2 - 152, var5, 304, 34, 9179409);
        if (arg2 == 956) {
            class217.method1528(class283.field4517 / 2 - 151, var5 + 1, 302, 32, 0);
            class217.method1526(class283.field4517 / 2 - 150, var5 + 2, class185.field2964 * 3, 30, 9179409);
            class217.method1526(class283.field4517 / 2 + (class185.field2964 * 3) - 150, var5 - -2, 300 - class185.field2964 * 3, 30, 0);
            arg0.method685(class230.field3755, class283.field4517 / 2, class292.field4640 / 2 + 4, 16777215, -1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILpd;B)V")
    private final void method606(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1312 = arg1.method549(arg2 + 307);
        } else if (arg0 == 2) {
            this.field1318 = arg1.method549(255);
        } else if (arg0 == 4) {
            this.field1305 = arg1.method549(255);
        } else if (arg0 == 5) {
            this.field1304 = arg1.method549(255);
        } else if (arg0 == 6) {
            this.field1314 = arg1.method549(arg2 + 307);
        } else if (arg0 == 7) {
            this.field1302 = arg1.method584(255);
        } else if (arg0 == 8) {
            this.field1300 = arg1.method584(255);
        } else if (arg0 == 9) {
            this.field1317 = true;
        } else if (arg0 == 10) {
            this.field1311 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method584(arg2 ^ 0xFFFFFF33);
            this.field1319 = new short[var6];
            this.field1303 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1303[var7] = (short) arg1.method549(255);
                this.field1319[var7] = (short) arg1.method549(255);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method584(255);
            this.field1316 = new short[var4];
            this.field1309 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1309[var5] = (short) arg1.method549(255);
                this.field1316[var5] = (short) arg1.method549(255);
            }
        }
        field1301++;
        if (arg2 != -52) {
            method607(96);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1295 = null;
        field1298 = null;
        if (arg0 != 2) {
            field1295 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLlh;)I")
    public static final int method608(byte arg0, class200 arg1) {
        field1296++;
        class188 var2 = arg1.field3166;
        if (var2.field3004 != null) {
            var2 = var2.method1314(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3056;
        class154 var4 = arg1.method1636(0);
        if (arg0 < 57) {
            field1315 = -106;
        }
        if (arg1.field3793 == var4.field2405) {
            var3 = var2.field3018;
        } else if (arg1.field3793 == var4.field2385 || arg1.field3793 == var4.field2382 || arg1.field3793 == var4.field2397 || arg1.field3793 == var4.field2389) {
            var3 = var2.field3001;
        } else if (arg1.field3793 == var4.field2390 || arg1.field3793 == var4.field2416 || arg1.field3793 == var4.field2421 || arg1.field3793 == var4.field2400) {
            var3 = var2.field3022;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method609(byte arg0) {
        if (arg0 <= 32) {
            field1315 = 0;
        }
        field1299++;
        if (class250.field4084 < class281.field4457) {
            class250.field4084 = (float) ((double) class250.field4084 / 30.0D + (double) class250.field4084);
            if (class281.field4457 < class250.field4084) {
                class250.field4084 = class281.field4457;
            }
            class92.method511((byte) 26);
        } else if (class281.field4457 < class250.field4084) {
            class250.field4084 = (float) ((double) class250.field4084 - (double) class250.field4084 / 30.0D);
            if (class250.field4084 < class281.field4457) {
                class250.field4084 = class281.field4457;
            }
            class92.method511((byte) 117);
        }
        if (class236.field3910 == -1 || class166.field2666 == -1) {
            return;
        }
        int var1 = class236.field3910 - class220.field3524;
        int var2 = class166.field2666 - class224.field3606;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class236.field3910 = -1;
            class166.field2666 = -1;
        }
        class224.field3606 += var2;
        class220.field3524 += var1;
        class92.method511((byte) 20);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I")
    public static final int method610(int arg0, int arg1, int arg2) {
        field1320++;
        class54 var3 = (class54) class39.field483.method708((long) arg1, arg2 ^ 0x64);
        if (var3 == null) {
            return -1;
        } else {
            if (arg2 != -18) {
                field1321 = false;
            }
            return arg0 >= 0 && var3.field689.length > arg0 ? var3.field689[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)Lwl;")
    public final class158 method611(int arg0, int arg1, int arg2, int arg3) {
        field1306++;
        if (arg1 != 13294) {
            this.field1317 = false;
        }
        class158 var5 = (class158) class275.field4400.method1693((long) this.field1310, 127);
        if (var5 == null) {
            class205 var6 = class205.method1444(class40.field490, this.field1312, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1303 != null) {
                for (int var7 = 0; var7 < this.field1303.length; var7++) {
                    var6.method1438(this.field1303[var7], this.field1319[var7]);
                }
            }
            if (this.field1309 != null) {
                for (int var8 = 0; var8 < this.field1309.length; var8++) {
                    var6.method1449(this.field1309[var8], this.field1316[var8]);
                }
            }
            var5 = var6.method1421(this.field1302 + 64, 850 - -this.field1300, -30, -50, -30);
            class275.field4400.method1694(true, (long) this.field1310, var5);
        }
        class158 var9;
        if (this.field1318 == -1 || arg3 == -1) {
            var9 = var5.method821(true, true, true);
        } else {
            var9 = class208.method1458((byte) -46, this.field1318).method1145(65535, arg0, arg2, var5, arg3);
        }
        if (this.field1305 != 128 || this.field1304 != 128) {
            var9.method849(this.field1305, this.field1304, this.field1305);
        }
        if (this.field1314 != 0) {
            if (this.field1314 == 90) {
                var9.method824();
            }
            if (this.field1314 == 180) {
                var9.method826();
            }
            if (this.field1314 == 270) {
                var9.method845();
            }
        }
        return var9;
    }
}
