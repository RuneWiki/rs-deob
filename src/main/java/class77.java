import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class77 extends class286 {

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field1339 = 1;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    private int field1335 = 204;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field1351 = 1;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Lbe;")
    public static class283 field1336 = class153.method941(126, "");

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "[Llf;")
    public static class116[] field1350 = new class116[500];

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "Lbe;")
    public static class283 field1349 = class153.method941(125, "cross");

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1346;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 5)
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Z", line = 11)
    public static final boolean method501(byte arg0, int arg1) {
        int var2 = -77 / ((-arg0 - 73) / 46);
        field1347++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Z", line = 22)
    public static final boolean method502(int arg0, boolean arg1) {
        field1343++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class110.field1868[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1005) {
            return true;
        } else {
            return !arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)I", line = 47)
    public static final int method503(int arg0, int arg1, byte arg2) {
        field1341++;
        int var3 = 41 / ((-arg2 - 30) / 43);
        int var4 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var4;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V", line = 62)
    public static final void method504(int arg0, int arg1) {
        class123.field2047 = 1000 / arg1;
        field1337++;
        int var2 = 114 / ((arg0 - 85) / 41);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V", line = 78)
    public static void method505(byte arg0) {
        field1346 = (byte[][][]) null;
        field1336 = null;
        field1350 = null;
        field1349 = null;
        if (arg0 != 28) {
            field1350 = (class116[]) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfe;ZI)V", line = 94)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field1340++;
        if (arg1) {
            method508(100);
        }
        if (arg2 == 0) {
            this.field1351 = arg0.method1535((byte) 113);
        } else if (arg2 == 1) {
            this.field1339 = arg0.method1535((byte) 108);
        } else if (arg2 == 2) {
            this.field1335 = arg0.method1496(true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V", line = 144)
    public static final void method506(int arg0, int arg1) {
        field1338++;
        if (class175.field3019 == arg0) {
            return;
        }
        if (class175.field3019 == 0) {
            class135.method836(arg1 + 6215);
        }
        if (arg0 == 40) {
            class6.method37(class213.field3620, 25670, class213.field3626, class27.field403);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class67.field933 != null) {
            class67.field933.method1282(true);
            class67.field933 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class303.field5124 = 0;
            class104.field1770 = 1;
            class104.field1775 = 0;
            class144.field2382 = 1;
            class111.field1879 = 0;
            class79.method522(0);
        }
        if (arg0 == 5) {
            class104.method683((byte) 13, class69.field1067);
        } else {
            class112.method733(-115);
        }
        if (arg1 != -30354) {
            field1349 = (class283) null;
        }
        boolean var3 = class175.field3019 == 5 || class175.field3019 == 10 || class175.field3019 == 28;
        if (var3 != var2) {
            if (var2) {
                class232.field3936 = class200.field3428;
                if (class118.field1990 == 0) {
                    class267.method1802(2, 57);
                } else {
                    class281.method1886(0, class109.field1843, 2, arg1 ^ 0x76F4, false, 255, class200.field3428);
                }
                class129.field2196.method467(4, false);
            } else {
                class267.method1802(2, 75);
                class129.field2196.method467(4, true);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class167.method1049();
        }
        class175.field3019 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V", line = 219)
    public static final void method507(int arg0) {
        class150.field2445.method1631(-27875);
        if (arg0 <= 70) {
            method501((byte) 55, 82);
        }
        field1344++;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V", line = 232)
    public static final void method508(int arg0) {
        field1342++;
        int var1 = 0;
        if (arg0 != -12451) {
            return;
        }
        while (var1 < class127.field2103) {
            int var10002 = class225.field3788[var1]--;
            if (class225.field3788[var1] >= -10) {
                label91: {
                    class147 var3 = class168.field2815[var1];
                    if (var3 == null) {
                        var3 = class147.method915(class103.field1741, class30.field460[var1], 0);
                        if (var3 == null) {
                            break label91;
                        }
                        class225.field3788[var1] += var3.method913();
                        class168.field2815[var1] = var3;
                    }
                    if (class225.field3788[var1] < 0) {
                        label94: {
                            int var4;
                            if (class187.field3200[var1] == 0) {
                                var4 = class255.field4301;
                            } else {
                                int var5 = (class187.field3200[var1] & 0xFF) * 128;
                                int var6 = class187.field3200[var1] >> 8 & 0xFF;
                                int var7 = (class187.field3200[var1] & 0xFF3CCD) >> 16;
                                int var8 = var7 * 128 + 64 - class213.field3624.field1193;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var6 * 128 + 64 - class213.field3624.field1210;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var8 + var9 - 128;
                                if (var10 > var5) {
                                    class225.field3788[var1] = -100;
                                    break label94;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class33.field500 / var5;
                            }
                            if (var4 > 0) {
                                class32 var11 = var3.method916().method217(class281.field4739);
                                class51 var12 = class51.method306(var11, 100, var4);
                                var12.method309(class280.field4679[var1] - 1);
                                class301.field5089.method1274(var12);
                            }
                            class225.field3788[var1] = -100;
                        }
                    }
                }
            } else {
                class127.field2103--;
                for (int var2 = var1; var2 < class127.field2103; var2++) {
                    class30.field460[var2] = class30.field460[var2 + 1];
                    class168.field2815[var2] = class168.field2815[var2 + 1];
                    class280.field4679[var2] = class280.field4679[var2 + 1];
                    class225.field3788[var2] = class225.field3788[var2 + 1];
                    class187.field3200[var2] = class187.field3200[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class306.field5263 && !class50.method291(2)) {
            if (class118.field1990 != 0 && class232.field3936 != -1) {
                class228.method1492(class232.field3936, false, class118.field1990, class109.field1843, (byte) 113, 0);
            }
            class306.field5263 = false;
        } else if (class118.field1990 != 0 && class232.field3936 != -1 && !class50.method291(arg0 ^ 0xFFFFCF5F)) {
            class72.field1274++;
            class228.field3831.method621(150, 8);
            class228.field3831.method1515(class232.field3936, 91);
            class232.field3936 = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I", line = 358)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            field1345 = -55;
        }
        field1348++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            for (int var4 = 0; var4 < class27.field410; var4++) {
                int var5 = class174.field2978[var4];
                int var6 = class153.field2509[arg1];
                int var7 = this.field1339 * var6 >> 12;
                int var8 = this.field1351 * var5 >> 12;
                int var9 = var5 % (4096 / this.field1351) * this.field1351;
                int var10 = var6 % (4096 / this.field1339) * this.field1339;
                if (var10 < this.field1335) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field1335) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1335 > var9) {
                    int var11;
                    for (var11 = var8 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
