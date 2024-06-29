import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class156 extends class46 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[B")
    public byte[] field2331;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[S")
    public short[] field2332;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "[B")
    public byte[] field2347;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "[Ljf;")
    public class340[] field2343;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "[Lcm;")
    public class291[] field2344;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[B")
    public byte[] field2330;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2334 = "Loading - please wait.";

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "Z")
    public static boolean field2337;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "[I")
    public static int[] field2338;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 7)
    public static final void method1064(int arg0) {
        if (arg0 >= 117) {
            field2346++;
            class213.field3248.method2176((byte) -51);
            class257.field4031.method2176((byte) 122);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lme;[B[IB)Z", line = 19)
    public final boolean method1065(class323 arg0, byte[] arg1, int[] arg2, byte arg3) {
        field2341++;
        boolean var5 = true;
        int var6 = -52 % ((53 - arg3) / 54);
        int var7 = 0;
        class340 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg1 == null || arg1[var9] != 0) {
                int var10 = this.field2342[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg0.method2196(var10 >> 2, arg2, 65530);
                        } else {
                            var8 = arg0.method2197(arg2, -118, var10 >> 2);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field2343[var9] = var8;
                        this.field2342[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 81)
    public static final void method1066(int arg0) {
        field2345++;
        if (class34.field509 == 0 || class34.field509 == 5) {
            return;
        }
        try {
            if ((++class224.field3568) > 2000) {
                if (class295.field4568 != null) {
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                }
                if (class235.field3755 >= 1) {
                    class34.field509 = 0;
                    class239.field3798 = -5;
                    return;
                }
                class235.field3755++;
                class34.field509 = 1;
                class224.field3568 = 0;
                if (class25.field393 == class103.field1596) {
                    class103.field1596 = class258.field4044;
                } else {
                    class103.field1596 = class25.field393;
                }
            }
            if (class34.field509 == 1) {
                class341.field5324 = class32.field471.method1286(class103.field1596, class227.field3602, 31);
                class34.field509 = 2;
            }
            if (arg0 != -28421) {
                field2338 = (int[]) null;
            }
            if (class34.field509 == 2) {
                if (class341.field5324.field2956 == 2) {
                    throw new IOException();
                }
                if (class341.field5324.field2956 != 1) {
                    return;
                }
                class295.field4568 = new class43((Socket) class341.field5324.field2959, class32.field471);
                class341.field5324 = null;
                long var1 = class224.field3561 = class128.method926(class298.field4602, (byte) -74);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class106.field1642.field2532 = 0;
                class106.field1642.method1132((byte) 29, 14);
                class106.field1642.method1132((byte) 29, var3);
                class295.field4568.method370(1, class106.field1642.field2500, 0, 2);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                int var4 = class295.field4568.method373(arg0 ^ 0x6F5A);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                if (var4 != 0) {
                    class239.field3798 = var4;
                    class34.field509 = 0;
                    class295.field4568.method365(arg0 + 28422);
                    class295.field4568 = null;
                    return;
                }
                class34.field509 = 3;
            }
            if (class34.field509 == 3) {
                if (class295.field4568.method366(45) < 8) {
                    return;
                }
                class295.field4568.method367((byte) 101, 8, 0, class10.field132.field2500);
                class10.field132.field2532 = 0;
                class181.field2736 = class10.field132.method1165(0);
                class106.field1642.field2532 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class181.field2736 >> 32), (int) class181.field2736 };
                class106.field1642.method1132((byte) 29, 10);
                class106.field1642.method1174((byte) -32, var5[0]);
                class106.field1642.method1174((byte) -32, var5[1]);
                class106.field1642.method1174((byte) -32, var5[2]);
                class106.field1642.method1174((byte) -32, var5[3]);
                class106.field1642.method1125(8473, class128.method926(class298.field4602, (byte) -70));
                class106.field1642.method1121(-1, class89.field1425);
                class106.field1642.method1158((byte) 26, class71.field1167, class294.field4554);
                class335.field5236.field2532 = 0;
                if (class131.field2052 == 40) {
                    class335.field5236.method1132((byte) 29, 18);
                } else {
                    class335.field5236.method1132((byte) 29, 16);
                }
                class335.field5236.method1150((class106.field1642.field2532 + class179.method1273(106, class120.field1827)) + 163, -628562744);
                class335.field5236.method1174((byte) -32, 539);
                class335.field5236.method1132((byte) 29, class115.field1768);
                class335.field5236.method1132((byte) 29, class19.field259 ? 1 : 0);
                class335.field5236.method1132((byte) 29, 1);
                class335.field5236.method1132((byte) 29, class256.method1759(78));
                class335.field5236.method1150(class188.field2816, -628562744);
                class335.field5236.method1150(class322.field5024, arg0 ^ 0x25777433);
                class335.field5236.method1132((byte) 29, class181.field2734);
                class91.method655(class335.field5236, 34);
                class335.field5236.method1121(-1, class120.field1827);
                class335.field5236.method1174((byte) -32, class233.field3708);
                class335.field5236.method1174((byte) -32, class111.method825((byte) 118));
                class107.field1663 = true;
                class335.field5236.method1150(class304.field4753, -628562744);
                class335.field5236.method1174((byte) -32, class91.field1446.method963(arg0 + 59257));
                class335.field5236.method1174((byte) -32, class227.field3603.method963(30836));
                class335.field5236.method1174((byte) -32, class227.field3601.method963(30836));
                class335.field5236.method1174((byte) -32, class101.field1585.method963(30836));
                class335.field5236.method1174((byte) -32, class104.field1615.method963(30836));
                class335.field5236.method1174((byte) -32, class225.field3575.method963(arg0 + 59257));
                class335.field5236.method1174((byte) -32, class192.field2872.method963(arg0 + 59257));
                class335.field5236.method1174((byte) -32, class298.field4597.method963(30836));
                class335.field5236.method1174((byte) -32, class186.field2788.method963(30836));
                class335.field5236.method1174((byte) -32, class291.field4527.method963(30836));
                class335.field5236.method1174((byte) -32, class295.field4561.method963(30836));
                class335.field5236.method1174((byte) -32, class60.field974.method963(arg0 ^ 0xFFFFE88F));
                class335.field5236.method1174((byte) -32, class62.field996.method963(30836));
                class335.field5236.method1174((byte) -32, class142.field2190.method963(30836));
                class335.field5236.method1174((byte) -32, class200.field3006.method963(arg0 ^ 0xFFFFE88F));
                class335.field5236.method1174((byte) -32, class317.field4954.method963(30836));
                class335.field5236.method1174((byte) -32, class60.field972.method963(30836));
                class335.field5236.method1174((byte) -32, class141.field2188.method963(30836));
                class335.field5236.method1174((byte) -32, class223.field3543.method963(30836));
                class335.field5236.method1174((byte) -32, class181.field2727.method963(30836));
                class335.field5236.method1174((byte) -32, class11.field171.method963(30836));
                class335.field5236.method1174((byte) -32, class332.field5166.method963(30836));
                class335.field5236.method1174((byte) -32, class105.field1625.method963(30836));
                class335.field5236.method1174((byte) -32, class162.field2432.method963(30836));
                class335.field5236.method1174((byte) -32, class284.field4408.method963(30836));
                class335.field5236.method1174((byte) -32, class48.field787.method963(30836));
                class335.field5236.method1174((byte) -32, class285.field4467.method963(30836));
                class335.field5236.method1174((byte) -32, class152.field2286.method963(30836));
                class335.field5236.method1174((byte) -32, class120.field1841.method963(30836));
                class335.field5236.method1170(false, class106.field1642.field2532, 0, class106.field1642.field2500);
                class295.field4568.method370(1, class335.field5236.field2500, 0, class335.field5236.field2532);
                class106.field1642.method760(var5, 8);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class10.field132.method760(var5, 8);
                class34.field509 = 4;
            }
            if (class34.field509 == 4) {
                if (class295.field4568.method366(arg0 + 28451) < 1) {
                    return;
                }
                int var7 = class295.field4568.method373(-98);
                if (var7 == 21) {
                    class34.field509 = 7;
                } else if (var7 == 29) {
                    class34.field509 = 10;
                } else if (var7 == 1) {
                    class34.field509 = 5;
                    class239.field3798 = var7;
                    return;
                } else if (var7 == 2) {
                    class34.field509 = 8;
                } else if (var7 == 15) {
                    class239.field3798 = var7;
                    class34.field509 = 0;
                    return;
                } else if (var7 == 23 && class235.field3755 < 1) {
                    class34.field509 = 1;
                    class224.field3568 = 0;
                    class235.field3755++;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    return;
                } else {
                    class34.field509 = 0;
                    class239.field3798 = var7;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    return;
                }
            }
            if (class34.field509 == 6) {
                class106.field1642.field2532 = 0;
                class106.field1642.method753(127, 17);
                class295.field4568.method370(arg0 ^ 0xFFFF90FA, class106.field1642.field2500, 0, class106.field1642.field2532);
                class34.field509 = 4;
                return;
            }
            if (class34.field509 == 7) {
                if (class295.field4568.method366(36) >= 1) {
                    class108.field1692 = (class295.field4568.method373(-111) + 3) * 60;
                    class34.field509 = 0;
                    class239.field3798 = 21;
                    class295.field4568.method365(arg0 ^ 0xFFFF90FA);
                    class295.field4568 = null;
                    return;
                }
                return;
            }
            if (class34.field509 == 10) {
                if (class295.field4568.method366(arg0 ^ 0xFFFF90AE) >= 1) {
                    class117.field1789 = class295.field4568.method373(-69);
                    class239.field3798 = 29;
                    class34.field509 = 0;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    return;
                }
                return;
            }
            if (class34.field509 == 8) {
                if (class295.field4568.method366(86) < 14) {
                    return;
                }
                class295.field4568.method367((byte) 116, 14, 0, class10.field132.field2500);
                class10.field132.field2532 = 0;
                class52.field853 = class10.field132.method1178(0);
                class187.field2805 = class10.field132.method1178(0);
                class73.field1203 = class10.field132.method1178(0) == 1;
                class148.field2250 = class10.field132.method1178(0) == 1;
                class345.field5355 = class10.field132.method1178(0) == 1;
                class33.field504 = class10.field132.method1178(0) == 1;
                class315.field4922 = class10.field132.method1178(0) == 1;
                class120.field1837 = class10.field132.method1151(arg0 + 28300);
                class123.field1882 = class10.field132.method1178(0) == 1;
                class166.field2527 = class10.field132.method1178(0) == 1;
                class173.method1243((byte) -75, class166.field2527);
                class312.method2118(arg0 ^ 0xFFFFF837, class166.field2527);
                if (!class19.field259) {
                    if ((!class73.field1203 || class345.field5355) && !class123.field1882) {
                        try {
                            class3.method16("unzap", class32.field471.field2721, arg0 ^ 0x6F73);
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class3.method16("zap", class32.field471.field2721, -107);
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class3.method16("loggedin", class32.field471.field2721, -103);
                } catch (Throwable var12) {
                }
                class342.field5333 = class10.field132.method754(-20368);
                class186.field2778 = class10.field132.method1151(-124);
                class34.field509 = 9;
            }
            if (class34.field509 == 9) {
                if (class295.field4568.method366(72) >= class186.field2778) {
                    class10.field132.field2532 = 0;
                    class295.field4568.method367((byte) 123, class186.field2778, 0, class10.field132.field2500);
                    class34.field509 = 0;
                    class239.field3798 = 2;
                    class205.method1451((byte) -13);
                    class81.field1272 = -1;
                    class235.method1652(false, -124);
                    class342.field5333 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class295.field4568 != null) {
                class295.field4568.method365(1);
                class295.field4568 = null;
            }
            if (class235.field3755 >= 1) {
                class34.field509 = 0;
                class239.field3798 = -4;
            } else {
                class235.field3755++;
                class34.field509 = 1;
                if (class25.field393 == class103.field1596) {
                    class103.field1596 = class258.field4044;
                } else {
                    class103.field1596 = class25.field393;
                }
                class224.field3568 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 465)
    public final void method1067(byte arg0) {
        this.field2342 = null;
        field2329++;
        if (arg0 != 103) {
            this.field2331 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 486)
    public static void method1068(byte arg0) {
        field2338 = null;
        if (arg0 > -87) {
            method1070((byte) 105);
        }
        field2334 = null;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 499)
    public static final void method1069(byte arg0) {
        class130.field2042 = 0;
        class278.field4290 = 0;
        class106.field1642.field2532 = 0;
        class339.field5305 = false;
        class186.field2778 = 0;
        class254.field3994 = -1;
        class342.field5333 = -1;
        class336.field5264 = -1;
        class154.field2313 = 0;
        class224.field3557 = -1;
        field2336++;
        class301.field4706 = 0;
        class10.field132.field2532 = 0;
        class202.field3035 = 0;
        int var1 = 0;
        int var2 = -58 % ((arg0 - 11) / 53);
        while (var1 < class254.field3992.length) {
            if (class254.field3992[var1] != null) {
                class254.field3992[var1].field1853 = -1;
            }
            var1++;
        }
        for (int var3 = 0; var3 < class254.field3989.length; var3++) {
            if (class254.field3989[var3] != null) {
                class254.field3989[var3].field1853 = -1;
            }
        }
        class154.method1061((byte) 36);
        class178.field2692 = 1;
        class88.method640(30, (byte) 49);
        for (int var4 = 0; var4 < 100; var4++) {
            class34.field510[var4] = true;
        }
        class171.method1237((byte) 62);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V", line = 566)
    public static final void method1070(byte arg0) {
        class30.field438.method2174(-10385);
        if (arg0 > -13) {
            method1070((byte) -113);
        }
        field2339++;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 581)
    public class156() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([B)V", line = 583)
    public class156(byte[] arg0) {
        this.field2331 = new byte[128];
        this.field2332 = new short[128];
        int var2 = 0;
        this.field2347 = new byte[128];
        this.field2342 = new int[128];
        this.field2343 = new class340[128];
        this.field2344 = new class291[128];
        this.field2330 = new byte[128];
        class166 var3 = new class166(arg0);
        while (var3.field2500[var3.field2532 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1143(-73);
        }
        var3.field2532++;
        var2++;
        int var6 = 0;
        int var7 = var3.field2532;
        var3.field2532 += var2;
        while (var3.field2500[var3.field2532 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1143(62);
        }
        var6++;
        var3.field2532++;
        int var10 = var3.field2532;
        int var11 = 0;
        var3.field2532 += var6;
        while (var3.field2500[var3.field2532 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1143(-101);
        }
        var3.field2532++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1178(0);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class291[] var19 = new class291[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class291 var21 = var19[var20] = new class291();
            int var22 = var3.method1178(0);
            if (var22 > 0) {
                var21.field4534 = new byte[var22 * 2];
            }
            int var23 = var3.method1178(0);
            if (var23 > 0) {
                var21.field4530 = new byte[var23 * 2 + 2];
                var21.field4530[1] = 64;
            }
        }
        int var24 = var3.method1178(0);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1178(0);
        int var27;
        for (var27 = 0; var3.field2500[var3.field2532 + var27] != 0; var27++) {
        }
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method1143(-94);
        }
        var3.field2532++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1178(0);
            this.field2332[var32] = (short) var31;
        }
        int var33 = 0;
        var27++;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1178(0);
            this.field2332[var34] = (short) (this.field2332[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var37 < var29.length) {
                    var35 = var29[var37++];
                } else {
                    var35 = -1;
                }
                var36 = var3.method1127(127);
            }
            this.field2332[var38] = (short) (this.field2332[var38] + (class270.method1860(var36 - 1, 2) << 14));
            var35--;
            this.field2342[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2342[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field2500[var7++] - 1;
                    if (var4.length > var39) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field2331[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2342[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field2500[var10++] + 16 << 2;
                    if (var8.length > var44) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field2330[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class291 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2342[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field2344[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var51 < var29.length) {
                    var52 = var29[var51++];
                } else {
                    var52 = -1;
                }
                if (this.field2342[var54] > 0) {
                    var53 = var3.method1178(0) + 1;
                }
            }
            this.field2347[var54] = (byte) var53;
            var52--;
        }
        this.field2340 = var3.method1178(0) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class291 var56 = var19[var55];
            if (var56.field4534 != null) {
                for (int var57 = 1; var57 < var56.field4534.length; var57 += 2) {
                    var56.field4534[var57] = var3.method1143(95);
                }
            }
            if (var56.field4530 != null) {
                for (int var58 = 3; var58 < var56.field4530.length - 2; var58 += 2) {
                    var56.field4530[var58] = var3.method1143(-88);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1143(-79);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1143(117);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class291 var62 = var19[var61];
            if (var62.field4530 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4530.length; var64 += 2) {
                    var63 = var3.method1178(0) + (var63 + 1);
                    var62.field4530[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class291 var66 = var19[var65];
            if (var66.field4534 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4534.length; var68 += 2) {
                    var67 = var67 + var3.method1178(0) + 1;
                    var66.field4534[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1178(0);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1178(0) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field2347[var73] = (byte) (this.field2347[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                int var76 = (var75 - var72) * var71 + ((var75 - var72) / 2);
                byte var77 = var25[var74 + 1];
                var74 += 2;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class76.method552(var75 - var72, var76, -123);
                    this.field2347[var78] = (byte) (this.field2347[var78] * var79 + 32 >> 6);
                    var76 += var77 - var71;
                }
                var72 = var75;
                var71 = var77;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field2347[var81] = (byte) (this.field2347[var81] * var71 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method1178(0);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var3.method1178(0) + var82 + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2330[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2330[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class76.method552(var89 - var84, var91, -116);
                    var91 += var90 - var85;
                    int var94 = (this.field2330[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2330[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field2330[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field2330[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field4526 = var3.method1178(0);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class291 var100 = var19[var99];
            if (var100.field4534 != null) {
                var100.field4532 = var3.method1178(0);
            }
            if (var100.field4530 != null) {
                var100.field4529 = var3.method1178(0);
            }
            if (var100.field4526 > 0) {
                var100.field4521 = var3.method1178(0);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field4533 = var3.method1178(0);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class291 var103 = var19[var102];
            if (var103.field4533 > 0) {
                var103.field4523 = var3.method1178(0);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class291 var105 = var19[var104];
            if (var105.field4523 > 0) {
                var105.field4525 = var3.method1178(0);
            }
        }
    }
}
