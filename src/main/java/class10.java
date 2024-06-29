import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 extends class23 {

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    private int field157 = 16;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
    private int field156 = 4096;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "I")
    private int field162 = 0;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    private int field153 = 2000;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "Z")
    public static boolean field161 = false;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "Lqd;")
    public static class40 field154 = class147.method1106("Stufe: ", (byte) -85);

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!em", name = "jb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!em", name = "kb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!em", name = "lb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!em", name = "nb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!em", name = "ob", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!em", name = "mb", descriptor = "Lce;")
    public static class239 field166;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 4)
    public static final void method59(int arg0) {
        field163++;
        if (class54.field1062 == 0 || class54.field1062 == 5) {
            return;
        }
        int var1 = 7 / ((37 - arg0) / 35);
        try {
            if ((++class264.field4410) > 2000) {
                if (class140.field2369 != null) {
                    class140.field2369.method784(67);
                    class140.field2369 = null;
                }
                if (class186.field3009 >= 1) {
                    class271.field4501 = -5;
                    class54.field1062 = 0;
                    return;
                }
                class264.field4410 = 0;
                class54.field1062 = 1;
                if (class23.field398 == class20.field340) {
                    class23.field398 = class233.field3843;
                } else {
                    class23.field398 = class20.field340;
                }
                class186.field3009++;
            }
            if (class54.field1062 == 1) {
                class315.field5321 = class275.field4573.method812(class195.field3145, class23.field398, 14038);
                class54.field1062 = 2;
            }
            if (class54.field1062 == 2) {
                if (class315.field5321.field1258 == 2) {
                    throw new IOException();
                }
                if (class315.field5321.field1258 != 1) {
                    return;
                }
                class140.field2369 = new class104((Socket) class315.field5321.field1260, class275.field4573);
                class315.field5321 = null;
                long var2 = class205.field3271 = class264.field4434.method362(-25194);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class19.field295.field478 = 0;
                class19.field295.method218(14, -19914);
                class19.field295.method218(var4, -19914);
                class140.field2369.method779(2, 16333, 0, class19.field295.field472);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                int var5 = class140.field2369.method789((byte) 22);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                if (var5 != 0) {
                    class54.field1062 = 0;
                    class271.field4501 = var5;
                    class140.field2369.method784(107);
                    class140.field2369 = null;
                    return;
                }
                class54.field1062 = 3;
            }
            if (class54.field1062 == 3) {
                if (class140.field2369.method790((byte) 66) < 8) {
                    return;
                }
                class140.field2369.method785(8, class95.field1715.field472, 0, 28016);
                class95.field1715.field478 = 0;
                int[] var6 = new int[4];
                class109.field1917 = class95.field1715.method212((byte) -128);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                class19.field295.field478 = 0;
                var6[2] = (int) (class109.field1917 >> 32);
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class109.field1917;
                class19.field295.method218(10, -19914);
                class19.field295.method239((byte) 111, var6[0]);
                class19.field295.method239((byte) -119, var6[1]);
                class19.field295.method239((byte) -116, var6[2]);
                class19.field295.method239((byte) -90, var6[3]);
                class19.field295.method241(class264.field4434.method362(-25194), 101);
                class19.field295.method206(class264.field4433, (byte) -107);
                class19.field295.method240(class91.field1653, class253.field4192, (byte) 69);
                class197.field3157.field478 = 0;
                if (class6.field87 == 40) {
                    class197.field3157.method218(18, -19914);
                } else {
                    class197.field3157.method218(16, -19914);
                }
                class197.field3157.method209(16711680, 155 - (-class19.field295.field478 - class34.method294(class46.field895, (byte) 27)));
                class197.field3157.method239((byte) 108, 521);
                class197.field3157.method218(class233.field3832, -19914);
                class197.field3157.method218(field161 ? 1 : 0, -19914);
                class197.field3157.method218(1, -19914);
                class197.field3157.method218(class304.method2073((byte) 70), -19914);
                class197.field3157.method209(16711680, class112.field1945);
                class197.field3157.method209(16711680, class73.field1287);
                class197.field3157.method218(class104.field1848, -19914);
                method62((byte) -37, class197.field3157);
                class197.field3157.method206(class46.field895, (byte) -88);
                class197.field3157.method239((byte) -21, class162.field2691);
                class197.field3157.method239((byte) 97, class228.method1596(1));
                client.field4051 = true;
                class197.field3157.method209(16711680, class236.field3871);
                class197.field3157.method239((byte) 97, class140.field2368.method1649(74));
                class197.field3157.method239((byte) -73, class5.field61.method1649(52));
                class197.field3157.method239((byte) -51, class233.field3818.method1649(92));
                class197.field3157.method239((byte) 120, client.field4057.method1649(66));
                class197.field3157.method239((byte) 123, class156.field2612.method1649(94));
                class197.field3157.method239((byte) -50, class172.field2807.method1649(107));
                class197.field3157.method239((byte) -51, class199.field3189.method1649(77));
                class197.field3157.method239((byte) 107, class85.field1472.method1649(115));
                class197.field3157.method239((byte) -40, class120.field2030.method1649(-104));
                class197.field3157.method239((byte) 111, class23.field408.method1649(60));
                class197.field3157.method239((byte) -67, class212.field3400.method1649(-91));
                class197.field3157.method239((byte) -23, class274.field4562.method1649(56));
                class197.field3157.method239((byte) 117, class186.field3005.method1649(91));
                class197.field3157.method239((byte) -92, class41.field791.method1649(127));
                class197.field3157.method239((byte) -56, class301.field5058.method1649(-85));
                class197.field3157.method239((byte) 126, class169.field2790.method1649(-108));
                class197.field3157.method239((byte) 102, class92.field1672.method1649(-59));
                class197.field3157.method239((byte) -71, class256.field4275.method1649(122));
                class197.field3157.method239((byte) -88, class151.field2530.method1649(108));
                class197.field3157.method239((byte) -43, class17.field258.method1649(113));
                class197.field3157.method239((byte) 96, class28.field602.method1649(71));
                class197.field3157.method239((byte) 106, class293.field4909.method1649(97));
                class197.field3157.method239((byte) -120, class313.field5287.method1649(-54));
                class197.field3157.method239((byte) -119, class280.field4739.method1649(88));
                class197.field3157.method239((byte) 94, class153.field2594.method1649(80));
                class197.field3157.method239((byte) -99, class256.field4274.method1649(60));
                class197.field3157.method239((byte) 103, class103.field1812.method1649(-24));
                class197.field3157.method189(0, class19.field295.field478, class19.field295.field472, 114);
                class140.field2369.method779(class197.field3157.field478, 16333, 0, class197.field3157.field472);
                class19.field295.method1462(var6, (byte) 33);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class95.field1715.method1462(var6, (byte) 111);
                class54.field1062 = 4;
            }
            if (class54.field1062 == 4) {
                if (class140.field2369.method790((byte) 66) < 1) {
                    return;
                }
                int var8 = class140.field2369.method789((byte) 22);
                if (var8 == 21) {
                    class54.field1062 = 7;
                } else if (var8 == 29) {
                    class54.field1062 = 10;
                } else if (var8 == 1) {
                    class54.field1062 = 5;
                    class271.field4501 = var8;
                    return;
                } else if (var8 == 2) {
                    class54.field1062 = 8;
                } else if (var8 == 15) {
                    class271.field4501 = var8;
                    class54.field1062 = 0;
                    return;
                } else if (var8 == 23 && class186.field3009 < 1) {
                    class54.field1062 = 1;
                    class186.field3009++;
                    class264.field4410 = 0;
                    class140.field2369.method784(68);
                    class140.field2369 = null;
                    return;
                } else {
                    class271.field4501 = var8;
                    class54.field1062 = 0;
                    class140.field2369.method784(87);
                    class140.field2369 = null;
                    return;
                }
            }
            if (class54.field1062 == 6) {
                class19.field295.field478 = 0;
                class19.field295.method1464(17, 0);
                class140.field2369.method779(class19.field295.field478, 16333, 0, class19.field295.field472);
                class54.field1062 = 4;
                return;
            }
            if (class54.field1062 == 7) {
                if (class140.field2369.method790((byte) 66) >= 1) {
                    class242.field4003 = (class140.field2369.method789((byte) 22) + 3) * 60;
                    class54.field1062 = 0;
                    class271.field4501 = 21;
                    class140.field2369.method784(67);
                    class140.field2369 = null;
                    return;
                }
                return;
            }
            if (class54.field1062 == 10) {
                if (class140.field2369.method790((byte) 66) < 1) {
                    return;
                }
                class249.field4111 = class140.field2369.method789((byte) 22);
                class54.field1062 = 0;
                class271.field4501 = 29;
                class140.field2369.method784(52);
                class140.field2369 = null;
                return;
            }
            if (class54.field1062 == 8) {
                if (class140.field2369.method790((byte) 66) < 14) {
                    return;
                }
                class140.field2369.method785(14, class95.field1715.field472, 0, 28016);
                class95.field1715.field478 = 0;
                class162.field2689 = class95.field1715.method226(255);
                class271.field4490 = class95.field1715.method226(255);
                class208.field3333 = class95.field1715.method226(255) == 1;
                class11.field180 = class95.field1715.method226(255) == 1;
                client.field4064 = class95.field1715.method226(255) == 1;
                class300.field5038 = class95.field1715.method226(255) == 1;
                class299.field4998 = class95.field1715.method226(255) == 1;
                class289.field4842 = class95.field1715.method197(-1);
                class267.field4457 = class95.field1715.method226(255) == 1;
                class308.field5164 = class95.field1715.method226(255) == 1;
                class11.method68(-17752, class308.field5164);
                class89.method689(class308.field5164, (byte) -7);
                if (!field161) {
                    if ((!class208.field3333 || client.field4064) && !class267.field4457) {
                        try {
                            class298.field4968.method368(class275.field4573.field1876, (byte) -88);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class163.field2712.method368(class275.field4573.field1876, (byte) -76);
                        } catch (Throwable var13) {
                        }
                    }
                }
                class27.field523 = class95.field1715.method1457(255);
                class202.field3201 = class95.field1715.method197(-1);
                class54.field1062 = 9;
            }
            if (class54.field1062 == 9) {
                if (class140.field2369.method790((byte) 66) < class202.field3201) {
                    return;
                }
                class95.field1715.field478 = 0;
                class140.field2369.method785(class202.field3201, class95.field1715.field472, 0, 28016);
                class271.field4501 = 2;
                class54.field1062 = 0;
                class293.method2014((byte) 15);
                class78.field1319 = -1;
                class26.method225(false, 5052);
                class27.field523 = -1;
                return;
            }
        } catch (IOException var14) {
            if (class140.field2369 != null) {
                class140.field2369.method784(113);
                class140.field2369 = null;
            }
            if (class186.field3009 < 1) {
                if (class23.field398 == class20.field340) {
                    class23.field398 = class233.field3843;
                } else {
                    class23.field398 = class20.field340;
                }
                class54.field1062 = 1;
                class186.field3009++;
                class264.field4410 = 0;
            } else {
                class54.field1062 = 0;
                class271.field4501 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)[I", line = 380)
    public final int[] method32(byte arg0, int arg1) {
        field152++;
        if (arg0 != -94) {
            field168 = 113;
        }
        int[] var3 = this.field403.method724((byte) -73, arg1);
        if (this.field403.field1760) {
            int var4 = this.field156 >> 1;
            int[][] var5 = this.field403.method727(false);
            Random var6 = new Random((long) this.field160);
            for (int var7 = 0; var7 < this.field153; var7++) {
                int var8 = this.field156 > 0 ? this.field162 + class110.method830((byte) -89, var6, this.field156) - var4 : this.field162;
                int var9 = (var8 & 0xFF1) >> 4;
                int var10 = class110.method830((byte) -78, var6, class52.field1007);
                int var11 = class110.method830((byte) -38, var6, class271.field4497);
                int var12 = (class163.field2705[var9] * this.field157 >> 12) + var10;
                int var13 = (class29.field618[var9] * this.field157 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var10 = var11;
                        var12 = var13;
                        var11 = var18;
                        var13 = var17;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var22 / 2;
                    int var24 = 2048 / var22;
                    int var25 = 1024 - (class110.method830((byte) -101, var6, 4096) >> 2);
                    int var26 = var13 - var11;
                    int var27 = var11 < var13 ? 1 : -1;
                    if (var26 < 0) {
                        var26 = -var26;
                    }
                    for (int var28 = var10; var28 < var12; var28++) {
                        var23 += var26;
                        int var29 = (var28 - var10) * var24 + var25 + 1024;
                        int var30 = var28 & class6.field92;
                        int var31 = var21 & class212.field3384;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var23 > 0) {
                            var21 -= -var27;
                            var23 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIZI)Lcm;", line = 515)
    public static final class185 method60(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field167++;
        int var6 = -79 / ((-arg5 - 23) / 62);
        int var8 = (arg3 << 19) + (arg2 << 17) + arg1 + (arg4 ? 65536 : 0);
        long var9 = (long) arg0 * 3147483667L + (long) var8 * 3849834839L;
        class185 var11 = (class185) class158.field2642.method1345(var9, 28150);
        if (var11 != null) {
            return var11;
        }
        class203.field3219 = false;
        class185 var12 = class130.method967(0, arg2, false, false, arg0, arg4, arg3, arg1);
        if (var12 != null && !class203.field3219) {
            class158.field2642.method1350(var12, var9, 110);
        }
        return var12;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 543)
    public final void method61(byte arg0) {
        if (arg0 != 4) {
            this.method61((byte) 58);
        }
        class50.method440((byte) 81);
        field165++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLsd;)V", line = 555)
    private static final void method62(byte arg0, class26 arg1) {
        field164++;
        byte[] var2 = new byte[24];
        if (class310.field5206 != null) {
            try {
                class310.field5206.method495(0L, 0);
                int var3 = 0;
                class310.field5206.method491(var2, arg0 ^ 0x4C);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method189(0, 24, var2, -93);
        if (arg0 != -37) {
            field166 = (class239) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([BB)V", line = 601)
    public static final void method63(byte[] arg0, byte arg1) {
        field155++;
        class26 var2 = new class26(arg0);
        var2.field478 = arg0.length - 2;
        class121.field2108 = var2.method197(-1);
        class12.field208 = new int[class121.field2108];
        class22.field387 = new byte[class121.field2108][];
        class51.field979 = new boolean[class121.field2108];
        class50.field964 = new byte[class121.field2108][];
        class256.field4265 = new int[class121.field2108];
        class102.field1802 = new int[class121.field2108];
        class210.field3356 = new int[class121.field2108];
        var2.field478 = arg0.length - (class121.field2108 * 8) - 7;
        class102.field1799 = var2.method197(-1);
        class169.field2787 = var2.method197(-1);
        if (arg1 >= -87) {
            field154 = (class40) null;
        }
        int var3 = (var2.method226(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class121.field2108; var4++) {
            class12.field208[var4] = var2.method197(-1);
        }
        for (int var5 = 0; var5 < class121.field2108; var5++) {
            class256.field4265[var5] = var2.method197(-1);
        }
        for (int var6 = 0; var6 < class121.field2108; var6++) {
            class102.field1802[var6] = var2.method197(-1);
        }
        for (int var7 = 0; var7 < class121.field2108; var7++) {
            class210.field3356[var7] = var2.method197(-1);
        }
        var2.field478 = arg0.length - class121.field2108 * 8 - (var3 - 1) * 3 - 7;
        class171.field2797 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class171.field2797[var8] = var2.method244(-26711);
            if (class171.field2797[var8] == 0) {
                class171.field2797[var8] = 1;
            }
        }
        var2.field478 = 0;
        for (int var9 = 0; var9 < class121.field2108; var9++) {
            int var10 = class102.field1802[var9];
            int var11 = class210.field3356[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class22.field387[var9] = var14;
            class50.field964[var9] = var13;
            int var16 = var2.method226(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method234(2193);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method234(2193);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label101;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var13[var10 * var23 + var22] = var2.method234(2193);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var20] = var2.method234(2193);
                    }
                    var20++;
                }
            }
            class51.field979[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 899)
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)Z", line = 773)
    public static final boolean method64(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class125.field2168; var3++) {
            class236 var4 = class163.field2710[var3];
            if (var4.field3874 == 1) {
                int var5 = var4.field3878 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3890 * var5 >> 8) + var4.field3891;
                    int var7 = (var4.field3885 * var5 >> 8) + var4.field3892;
                    int var8 = (var4.field3882 * var5 >> 8) + var4.field3860;
                    int var9 = (var4.field3876 * var5 >> 8) + var4.field3865;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3874 == 2) {
                int var10 = arg0 - var4.field3878;
                if (var10 > 0) {
                    int var11 = (var4.field3890 * var10 >> 8) + var4.field3891;
                    int var12 = (var4.field3885 * var10 >> 8) + var4.field3892;
                    int var13 = (var4.field3882 * var10 >> 8) + var4.field3860;
                    int var14 = (var4.field3876 * var10 >> 8) + var4.field3865;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3874 == 3) {
                int var15 = var4.field3891 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3867 * var15 >> 8) + var4.field3878;
                    int var17 = (var4.field3866 * var15 >> 8) + var4.field3869;
                    int var18 = (var4.field3882 * var15 >> 8) + var4.field3860;
                    int var19 = (var4.field3876 * var15 >> 8) + var4.field3865;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3874 == 4) {
                int var20 = arg2 - var4.field3891;
                if (var20 > 0) {
                    int var21 = (var4.field3867 * var20 >> 8) + var4.field3878;
                    int var22 = (var4.field3866 * var20 >> 8) + var4.field3869;
                    int var23 = (var4.field3882 * var20 >> 8) + var4.field3860;
                    int var24 = (var4.field3876 * var20 >> 8) + var4.field3865;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3874 == 5) {
                int var25 = arg1 - var4.field3860;
                if (var25 > 0) {
                    int var26 = (var4.field3867 * var25 >> 8) + var4.field3878;
                    int var27 = (var4.field3866 * var25 >> 8) + var4.field3869;
                    int var28 = (var4.field3890 * var25 >> 8) + var4.field3891;
                    int var29 = (var4.field3885 * var25 >> 8) + var4.field3892;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILsd;)V", line = 904)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field159++;
        if (arg1 != 0) {
            method65();
        }
        if (arg0 == 0) {
            this.field160 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field153 = arg2.method197(~arg1);
        } else if (arg0 == 2) {
            this.field157 = arg2.method226(255);
        } else if (arg0 == 3) {
            this.field162 = arg2.method197(-1);
        } else if (arg0 == 4) {
            this.field156 = arg2.method197(-1);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 974)
    private static final void method65() {
        class125.field2168 = 0;
        label194: for (int var0 = 0; var0 < class120.field2033; var0++) {
            class236 var1 = class39.field709[var0];
            if (class12.field209 != null) {
                for (int var2 = 0; var2 < class12.field209.length; var2++) {
                    if (class12.field209[var2] != -1000000 && (var1.field3860 <= class12.field209[var2] || var1.field3865 <= class12.field209[var2]) && (var1.field3878 <= class148.field2484[var2] || var1.field3869 <= class148.field2484[var2]) && (var1.field3878 >= class247.field4100[var2] || var1.field3869 >= class247.field4100[var2]) && (var1.field3891 <= class43.field807[var2] || var1.field3892 <= class43.field807[var2]) && (var1.field3891 >= class263.field4401[var2] || var1.field3892 >= class263.field4401[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3879 == 1) {
                int var3 = var1.field3873 + class173.field2820 - class213.field3431;
                if (var3 >= 0 && var3 <= class173.field2820 + class173.field2820) {
                    int var4 = var1.field3889 + class173.field2820 - class189.field3075;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3883 + class173.field2820 - class189.field3075;
                    if (var5 > class173.field2820 + class173.field2820) {
                        var5 = class173.field2820 + class173.field2820;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class30.field634[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class208.field3331 - var1.field3878;
                        if (var7 > 32) {
                            var1.field3874 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3874 = 2;
                            var7 = -var7;
                        }
                        var1.field3890 = (var1.field3891 - class180.field2939 << 8) / var7;
                        var1.field3885 = (var1.field3892 - class180.field2939 << 8) / var7;
                        var1.field3882 = (var1.field3860 - class48.field940 << 8) / var7;
                        var1.field3876 = (var1.field3865 - class48.field940 << 8) / var7;
                        class163.field2710[class125.field2168++] = var1;
                    }
                }
            } else if (var1.field3879 == 2) {
                int var8 = var1.field3889 + class173.field2820 - class189.field3075;
                if (var8 >= 0 && var8 <= class173.field2820 + class173.field2820) {
                    int var9 = var1.field3873 + class173.field2820 - class213.field3431;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3864 + class173.field2820 - class213.field3431;
                    if (var10 > class173.field2820 + class173.field2820) {
                        var10 = class173.field2820 + class173.field2820;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class30.field634[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class180.field2939 - var1.field3891;
                        if (var12 > 32) {
                            var1.field3874 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3874 = 4;
                            var12 = -var12;
                        }
                        var1.field3867 = (var1.field3878 - class208.field3331 << 8) / var12;
                        var1.field3866 = (var1.field3869 - class208.field3331 << 8) / var12;
                        var1.field3882 = (var1.field3860 - class48.field940 << 8) / var12;
                        var1.field3876 = (var1.field3865 - class48.field940 << 8) / var12;
                        class163.field2710[class125.field2168++] = var1;
                    }
                }
            } else if (var1.field3879 == 4) {
                int var13 = var1.field3860 - class48.field940;
                if (var13 > 128) {
                    int var14 = var1.field3889 + class173.field2820 - class189.field3075;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3883 + class173.field2820 - class189.field3075;
                    if (var15 > class173.field2820 + class173.field2820) {
                        var15 = class173.field2820 + class173.field2820;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3873 + class173.field2820 - class213.field3431;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3864 + class173.field2820 - class213.field3431;
                        if (var17 > class173.field2820 + class173.field2820) {
                            var17 = class173.field2820 + class173.field2820;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class30.field634[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3874 = 5;
                            var1.field3867 = (var1.field3878 - class208.field3331 << 8) / var13;
                            var1.field3866 = (var1.field3869 - class208.field3331 << 8) / var13;
                            var1.field3890 = (var1.field3891 - class180.field2939 << 8) / var13;
                            var1.field3885 = (var1.field3892 - class180.field2939 << 8) / var13;
                            class163.field2710[class125.field2168++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 1204)
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class90.field1632 * 128) {
            arg0 = class90.field1632 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class285.field4807 * 128) {
            arg2 = class285.field4807 * 128 - 1;
        }
        class52.field1002 = class203.field3208[arg3];
        class221.field3680 = class203.field3216[arg3];
        class298.field4980 = class203.field3208[arg4];
        class257.field4276 = class203.field3216[arg4];
        class208.field3331 = arg0;
        class48.field940 = arg1;
        class180.field2939 = arg2;
        class213.field3431 = arg0 / 128;
        class189.field3075 = arg2 / 128;
        class42.field797 = class213.field3431 - class173.field2820;
        if (class42.field797 < 0) {
            class42.field797 = 0;
        }
        class313.field5294 = class189.field3075 - class173.field2820;
        if (class313.field5294 < 0) {
            class313.field5294 = 0;
        }
        class116.field1992 = class213.field3431 + class173.field2820;
        if (class116.field1992 > class90.field1632) {
            class116.field1992 = class90.field1632;
        }
        class301.field5051 = class189.field3075 + class173.field2820;
        if (class301.field5051 > class285.field4807) {
            class301.field5051 = class285.field4807;
        }
        short var15;
        if (class21.field350) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class173.field2820 + class173.field2820 + 2; var16++) {
            for (int var17 = 0; var17 < class173.field2820 + class173.field2820 + 2; var17++) {
                int var18 = (var16 - class173.field2820 << 7) - (class208.field3331 & 0x7F);
                int var19 = (var17 - class173.field2820 << 7) - (class180.field2939 & 0x7F);
                int var20 = class213.field3431 + var16 - class173.field2820;
                int var21 = class189.field3075 + var17 - class173.field2820;
                if (var20 >= 0 && var21 >= 0 && var20 < class90.field1632 && var21 < class285.field4807) {
                    int var22;
                    if (class160.field2687 == null) {
                        var22 = class244.field4020[0][var20][var21] + 128 - class48.field940;
                    } else {
                        var22 = class160.field2687[0][var20][var21] + 128 - class48.field940;
                    }
                    int var23 = class244.field4020[3][var20][var21] - class48.field940 - 1000;
                    class271.field4502[var16][var17] = class256.method1801(var18, var23, var22, var19, var15);
                } else {
                    class271.field4502[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class173.field2820 + class173.field2820 + 1; var24++) {
            for (int var25 = 0; var25 < class173.field2820 + class173.field2820 + 1; var25++) {
                class30.field634[var24][var25] = class271.field4502[var24][var25] || class271.field4502[var24 + 1][var25] || class271.field4502[var24][var25 + 1] || class271.field4502[var24 + 1][var25 + 1];
            }
        }
        class12.field209 = arg6;
        class247.field4100 = arg7;
        class148.field2484 = arg8;
        class43.field807 = arg9;
        class263.field4401 = arg10;
        method65();
        if (class27.field591 != null) {
            class193.method1381(true);
            class298.method2033(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class21.field350) {
                class292.field4887 = false;
                class60.method504(0, 0, 20789);
                class273.method1892((float[]) null);
                class84.method637();
            }
            class193.method1381(false);
        }
        class298.method2033(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V", line = 1332)
    public static void method67(int arg0) {
        field166 = null;
        if (arg0 != 1013) {
            method67(-93);
        }
        field154 = null;
    }
}
