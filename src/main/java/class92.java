import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class92 {

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lse;")
    public static class91[] field1419 = new class91[5000];

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public static int[] field1420 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Luf;")
    public static class168 field1422 = class148.method1019(-1720, " ");

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lbd;")
    public static class82 field1414;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[[[Lsb;")
    public static class127[][][] field1424;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V", line = 13)
    public static final void method649(int arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        if (arg0 <= 22) {
            method652(42);
        }
        field1413++;
        if (arg1 <= arg3) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg3 + arg1) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg1];
        arg2[arg1] = var7;
        Object var8 = arg4[var6];
        arg4[var6] = arg4[arg1];
        arg4[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (((var9 & 0x1) + var7) > arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                Object var11 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5++] = var11;
            }
        }
        arg2[arg1] = arg2[var5];
        arg2[var5] = var7;
        arg4[arg1] = arg4[var5];
        arg4[var5] = var8;
        method649(123, var5 - 1, arg2, arg3, arg4);
        method649(80, arg1, arg2, var5 + 1, arg4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILrd;)V", line = 67)
    public static final void method650(int arg0, int arg1, int arg2, int arg3, class196 arg4) {
        field1423++;
        if (arg2 != 1864 || class22.field275 >= 400) {
            return;
        }
        if (arg4.field3188 != null) {
            arg4 = arg4.method1387((byte) -1);
        }
        if (arg4 == null || !arg4.field3178) {
            return;
        }
        class168 var5 = arg4.field3226;
        if (arg4.field3232 != 0) {
            var5 = class134.method938((byte) -126, new class168[] { var5, class179.method1287(6, arg4.field3232, class266.field4489.field696), class27.field339, class178.field2877, class169.method1228(arg4.field3232, 0), class144.field2222 });
        }
        if (class211.field3461 == 1) {
            class225.field3636++;
            class45.method247(arg1, class134.method938((byte) -125, new class168[] { class213.field3486, class205.field3378, var5 }), class127.field1957, (short) 44, (byte) 66, (long) arg0, arg3);
        } else if (!class111.field1740) {
            class291.field4900++;
            class168[] var6 = arg4.field3191;
            if (class140.field2173) {
                var6 = class157.method1113((byte) 80, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class58.field765 != 0 || !var6[var7].method1194(class127.field1955, -26023))) {
                        class162.field2626++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 45;
                        }
                        if (var7 == 1) {
                            var8 = 20;
                        }
                        if (var7 == 2) {
                            var8 = 31;
                        }
                        if (var7 == 3) {
                            var8 = 46;
                        }
                        if (var7 == 4) {
                            var8 = 10;
                        }
                        class45.method247(arg1, class134.method938((byte) -123, new class168[] { class94.field1497, var5 }), var6[var7], var8, (byte) 66, (long) arg0, arg3);
                    }
                }
            }
            if (class58.field765 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1194(class127.field1955, arg2 - 27887)) {
                        class204.field3356++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 45;
                        }
                        if (arg4.field3232 > class266.field4489.field696) {
                            var10 = 2000;
                        }
                        if (var9 == 1) {
                            var11 = 20;
                        }
                        if (var9 == 2) {
                            var11 = 31;
                        }
                        if (var9 == 3) {
                            var11 = 46;
                        }
                        if (var9 == 4) {
                            var11 = 10;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class45.method247(arg1, class134.method938((byte) -125, new class168[] { class94.field1497, var5 }), var6[var9], var11, (byte) 66, (long) arg0, arg3);
                    }
                }
            }
            class45.method247(arg1, class134.method938((byte) -127, new class168[] { class94.field1497, var5 }), class126.field1948, (short) 1007, (byte) 66, (long) arg0, arg3);
        } else if ((class298.field5055 & 0x2) == 2) {
            class101.field1579++;
            class45.method247(arg1, class134.method938((byte) -127, new class168[] { class233.field3754, class205.field3378, var5 }), class120.field1872, (short) 41, (byte) 66, (long) arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 214)
    public static void method651(int arg0) {
        field1420 = null;
        field1414 = null;
        field1419 = null;
        field1422 = null;
        if (arg0 < 24) {
            field1419 = (class91[]) null;
        }
        field1424 = (class127[][][]) null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 240)
    public static final void method652(int arg0) {
        field1421++;
        if (class207.field3401 == null) {
            return;
        }
        if (class127.field1978 < 10) {
            if (!class156.field2460.method1649(arg0 ^ 0xE71309A8, class207.field3401.field2826) || !class156.field2460.method1649(-1630, class134.method938((byte) -123, new class168[] { class207.field3401.field2826, class14.field143 }))) {
                class127.field1978 = class91.field1401.method1639(class207.field3401.field2826, (byte) 47) / 10;
                return;
            }
            class94.method712((byte) 96);
            class127.field1978 = 10;
        }
        if (class127.field1978 == 10) {
            class15.field149 = 8.0F;
            class175.field2836 = 8.0F;
            class261.field4420 = class207.field3401.field2834 >> 6 << 6;
            class172.field2801 = (class207.field3401.field2840 >> 6 << 6) + 64 - class261.field4420;
            class40.field506 = class207.field3401.field2838 >> 6 << 6;
            int var1 = class261.field4420 - class276.field4641 - ((class266.field4489.field3021 >> 7) - (class172.field2801 - 1));
            int var2 = (class266.field4489.field3027 >> 7) + class182.field2916 - class40.field506;
            class140.field2161 = (class207.field3401.field2849 >> 6 << 6) - (class40.field506 - 64);
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var1 + ((int) (Math.random() * 10.0D) - 5);
            if (var3 >= 0 && class140.field2161 > var3 && var4 >= 0 && class172.field2801 > var4) {
                class274.field4602 = var4;
                class291.field4895 = var3;
            } else {
                class291.field4895 = class207.field3401.field2845 * 64 - class40.field506;
                class274.field4602 = class261.field4420 + class172.field2801 - class207.field3401.field2828 * 64 - 1;
            }
            class162.method1145((byte) -96);
            class115.field1790 = new int[class133.field2070 + 1];
            int var5 = class138.field2134 >> 1;
            int var6 = class140.field2161 >> 6;
            int var7 = class172.field2801 >> 6;
            class5.field66 = new byte[var6][var7][];
            int var8 = class71.field957 >> 2 << 10;
            class177.field2867 = new int[var6][var7][];
            class209.field3459 = new byte[var6][var7][];
            class207.field3400 = new short[var6][var7][];
            class63.field832 = new int[var6][var7][];
            class249.field4254 = new byte[var6][var7][];
            class125.field1931 = new byte[var6][var7][];
            class200.field3299 = new byte[var6][var7][];
            class298.method2042(-127, var8, var5);
            class127.field1978 = 20;
        } else if (class127.field1978 == 20) {
            class78.method464(new class153(class156.field2460.method1626((byte) 70, class272.field4577, class207.field3401.field2826)), 127);
            class127.field1978 = 30;
            class123.method874(true, (byte) -83);
            class289.method1987(127);
        } else if (class127.field1978 == 30) {
            class215.method1491((byte) 62, new class153(class156.field2460.method1626((byte) 70, class299.field5072, class207.field3401.field2826)));
            class127.field1978 = 40;
            class289.method1987(105);
        } else if (class127.field1978 == 40) {
            class270.method1872(new class153(class156.field2460.method1626((byte) 70, class96.field1538, class207.field3401.field2826)), 55);
            class127.field1978 = 50;
            class289.method1987(arg0 - 418181021);
        } else if (class127.field1978 == 50) {
            class140.method965(-111, new class153(class156.field2460.method1626((byte) 70, class189.field2995, class207.field3401.field2826)));
            class127.field1978 = 60;
            class123.method874(true, (byte) -123);
            class289.method1987(96);
        } else if (class127.field1978 == 60) {
            class201.field3315 = class118.method848(class156.field2460, 112, class134.method938((byte) -126, new class168[] { class207.field3401.field2826, class14.field143 }));
            class127.field1978 = 70;
            class289.method1987(106);
        } else if (class127.field1978 == 70) {
            class157.field2476 = new class35(11, true, class189.field3023);
            class127.field1978 = 73;
            class123.method874(true, (byte) -124);
            class289.method1987(111);
        } else if (class127.field1978 == 73) {
            class214.field3492 = new class35(12, true, class189.field3023);
            class127.field1978 = 76;
            class123.method874(true, (byte) -85);
            class289.method1987(78);
        } else if (class127.field1978 == 76) {
            class213.field3477 = new class35(14, true, class189.field3023);
            class127.field1978 = 79;
            class123.method874(true, (byte) -120);
            class289.method1987(arg0 ^ 0x18ECF05F);
        } else if (class127.field1978 == 79) {
            class211.field3474 = new class35(17, true, class189.field3023);
            class127.field1978 = 82;
            class123.method874(true, (byte) -116);
            class289.method1987(83);
        } else if (class127.field1978 == 82) {
            class247.field4237 = new class35(19, true, class189.field3023);
            class127.field1978 = 85;
            class123.method874(true, (byte) -120);
            class289.method1987(66);
        } else {
            if (arg0 != 418181130) {
                method649(-26, -45, (int[]) null, 54, (Object[]) null);
            }
            if (class127.field1978 == 85) {
                class136.field2115 = new class35(22, true, class189.field3023);
                class127.field1978 = 88;
                class123.method874(true, (byte) -87);
                class289.method1987(117);
            } else if (class127.field1978 == 88) {
                class187.field2963 = new class35(26, true, class189.field3023);
                class127.field1978 = 91;
                class123.method874(true, (byte) -127);
                class289.method1987(78);
            } else {
                class118.field1842 = new class35(30, true, class189.field3023);
                class127.field1978 = 100;
                class123.method874(true, (byte) -126);
                class289.method1987(121);
                class238.field3846 = -1;
                class148.field2293 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JZ)V", line = 435)
    public static final void method653(long arg0, boolean arg1) {
        field1417++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class149.field2302; var3++) {
            if (class201.field3311[var3] == arg0) {
                class149.field2302--;
                for (int var4 = var3; var4 < class149.field2302; var4++) {
                    class201.field3311[var4] = class201.field3311[var4 + 1];
                    class87.field1341[var4] = class87.field1341[var4 + 1];
                }
                class285.field4828 = class9.field116;
                class249.field4262.method726(162, 2138389379);
                class136.field2121++;
                class249.field4262.method1053(arg0, 11247);
                break;
            }
        }
        if (arg1) {
            field1420 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZBIZ)Lfj;", line = 478)
    public static final class283 method654(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        field1416++;
        class110 var5 = null;
        if (arg2 == 42) {
            if (class283.field4779 != null) {
                var5 = new class110(arg3, class283.field4779, class294.field4990[arg3], 1000000);
            }
            return new class283(var5, class133.field2084, arg3, arg1, arg0, arg4);
        } else {
            return (class283) null;
        }
    }
}
