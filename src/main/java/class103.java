import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class103 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
    public boolean field1317 = true;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
    public boolean field1324 = true;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
    public boolean field1319 = false;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field1328 = 16;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field1331 = 8;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field1329 = -1;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field1326 = -1;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field1327 = 128;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field1338 = 0;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field1339 = 1190717;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field1333 = -1;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lei;")
    public static class289 field1323 = new class289(64);

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    public static boolean field1332 = false;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[I")
    public static int[] field1334 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lei;")
    public static class289 field1340 = new class289(64);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lat;I)Lwr;")
    public static final class381 method690(class256 arg0, int arg1) {
        if (arg1 < 2) {
            method693(-109, -13L, (class9) null);
        }
        field1315++;
        return new class381(arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1725((byte) 0), arg0.method1738((byte) -25));
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
    public final void method691(byte arg0, int arg1) {
        if (arg0 >= -83) {
            return;
        }
        if (this.field1333 == -1) {
            this.field1333 = this.field1329;
        }
        this.field1331 = arg1 | this.field1331 << 8;
        field1316++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        if (arg0 < 51) {
            method690((class256) null, -58);
        }
        field1334 = null;
        field1340 = null;
        field1323 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJLfp;)V")
    public static final void method693(int arg0, long arg1, class9 arg2) {
        class177.field2453 = arg0;
        field1337++;
        class248.field3652 = class115.field1567;
        class115.field1567 = 0;
        long var4 = class43.method364(-16756);
        for (class314 var6 = (class314) class343.field5049.method2026(100); var6 != null; var6 = (class314) class343.field5049.method2022(10)) {
            if (var6.method2081(arg2, arg1)) {
                class177.field2453++;
            }
        }
        if (class397.field5769 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class343.field5049.method2027(88) + ", running: " + class177.field2453 + ". Particles: " + class115.field1567 + ". Time taken: " + (class43.method364(-16756) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILat;I)V")
    public final void method694(int arg0, class256 arg1, int arg2) {
        int var4 = 37 % ((40 - arg2) / 36);
        while (true) {
            int var5 = arg1.method1738((byte) 71);
            if (var5 == 0) {
                field1325++;
                return;
            }
            this.method696(var5, -13, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public static final boolean method695(int arg0, int arg1) {
        field1322++;
        if (class22.field318[arg0]) {
            return true;
        } else if (class199.field2820.method706(arg0, (byte) -95)) {
            int var2 = class199.field2820.method734(95, arg0);
            if (var2 == 0) {
                class22.field318[arg0] = true;
                return true;
            }
            if (class444.field6470[arg0] == null) {
                class444.field6470[arg0] = new class223[var2];
            }
            int var3 = 0;
            if (arg1 >= -101) {
                return false;
            }
            while (var3 < var2) {
                if (class444.field6470[arg0][var3] == null) {
                    byte[] var4 = class199.field2820.method715(var3, (byte) 70, arg0);
                    if (var4 != null) {
                        class223 var5 = class444.field6470[arg0][var3] = new class223();
                        var5.field3223 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1533((byte) 82, new class256(var4));
                    }
                }
                var3++;
            }
            class22.field318[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILat;I)V")
    private final void method696(int arg0, int arg1, class256 arg2, int arg3) {
        if (arg1 > -12) {
            this.field1319 = true;
        }
        field1336++;
        if (arg0 == 1) {
            this.field1338 = class1.method13((byte) 126, arg2.method1725((byte) 0));
        } else if (arg0 == 2) {
            this.field1329 = arg2.method1738((byte) 65);
        } else if (arg0 == 3) {
            this.field1329 = arg2.method1767(1930493576);
            if (this.field1329 == 65535) {
                this.field1329 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field1317 = false;
            return;
        } else if (arg0 == 7) {
            this.field1326 = class1.method13((byte) 116, arg2.method1725((byte) 0));
            return;
        } else if (arg0 == 8) {
            class28.field393 = arg3;
            return;
        } else if (arg0 == 9) {
            this.field1327 = arg2.method1767(1930493576);
            return;
        } else if (arg0 == 10) {
            this.field1324 = false;
            return;
        } else {
            if (arg0 == 11) {
                this.field1331 = arg2.method1738((byte) -59);
            } else if (arg0 == 12) {
                this.field1319 = true;
                return;
            } else if (arg0 == 13) {
                this.field1339 = arg2.method1725((byte) 0);
                return;
            } else if (arg0 == 14) {
                this.field1328 = arg2.method1738((byte) 126);
                return;
            } else if (arg0 == 15) {
                this.field1333 = arg2.method1767(1930493576);
                if (this.field1333 == 65535) {
                    this.field1333 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([II[III)V")
    public static final void method697(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field1318++;
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var7) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method697(arg0, arg1, arg2, -1, var6 - 1);
            method697(arg0, var6 + 1, arg2, -1, arg4);
        }
        if (arg3 != -1) {
            method697((int[]) null, -88, (int[]) null, -37, 101);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
    public static final void method698(int arg0, boolean arg1) {
        class388.field5663 = arg1;
        if (arg0 != -2) {
            method690((class256) null, 24);
        }
        field1320++;
        if (!class388.field5663) {
            int var2 = class22.field306.method1767(1930493576);
            boolean var3 = class22.field306.method1741((byte) 24) == 1;
            int var4 = class22.field306.method1767(1930493576);
            int var5 = class22.field306.method1741((byte) 24);
            class212.method1451(var5, (byte) 86);
            int var6 = (class35.field496 - class22.field306.field3762) / 16;
            class124.field1652 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var11 = 0; var11 < 4; var11++) {
                    class124.field1652[var7][var11] = class22.field306.method1746(class134.method895(arg0, -20974));
                }
            }
            class189.field2648 = null;
            class356.field5174 = new int[var6];
            class330.field4905 = new int[var6];
            class222.field3200 = null;
            class38.field532 = new byte[var6][];
            class215.field3066 = new byte[var6][];
            class22.field314 = new int[var6];
            class24.field336 = new byte[var6][];
            class440.field6387 = new int[var6];
            class161.field2148 = new int[var6];
            class322.field4762 = new byte[var6][];
            int var8 = 0;
            for (int var9 = (var2 - (class195.field2745 >> 4)) / 8; var9 <= (var2 + (class195.field2745 >> 4)) / 8; var9++) {
                for (int var10 = (var4 - (class78.field984 >> 4)) / 8; var10 <= (((class78.field984 >> 4) + var4) / 8); var10++) {
                    class356.field5174[var8] = (var9 << 8) + var10;
                    class161.field2148[var8] = class243.field3602.method707(class134.method895(arg0, 1), "m" + var9 + "_" + var10);
                    class330.field4905[var8] = class243.field3602.method707(-1, "l" + var9 + "_" + var10);
                    class22.field314[var8] = class243.field3602.method707(-1, "um" + var9 + "_" + var10);
                    class440.field6387[var8] = class243.field3602.method707(-1, "ul" + var9 + "_" + var10);
                    var8++;
                }
            }
            class364.method2318(var3, 10, false, var2, var4);
            return;
        }
        int var12 = class22.field306.method1767(1930493576);
        int var13 = class22.field306.method1729(false);
        int var14 = class22.field306.method1738((byte) -23);
        boolean var15 = class22.field306.method1738((byte) 62) == 1;
        class212.method1451(var14, (byte) 86);
        class22.field306.method770(arg0 + 10);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var31 = 0; var31 < class195.field2745 >> 3; var31++) {
                for (int var32 = 0; var32 < (class78.field984 >> 3); var32++) {
                    int var33 = class22.field306.method773(1, (byte) 116);
                    if (var33 == 1) {
                        class75.field960[var16][var31][var32] = class22.field306.method773(26, (byte) 71);
                    } else {
                        class75.field960[var16][var31][var32] = -1;
                    }
                }
            }
        }
        class22.field306.method771((byte) 114);
        int var17 = (class35.field496 - class22.field306.field3762) / 16;
        class124.field1652 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var30 = 0; var30 < 4; var30++) {
                class124.field1652[var18][var30] = class22.field306.method1746(20972);
            }
        }
        class161.field2148 = new int[var17];
        class215.field3066 = new byte[var17][];
        class22.field314 = new int[var17];
        class322.field4762 = new byte[var17][];
        class440.field6387 = new int[var17];
        class38.field532 = new byte[var17][];
        class189.field2648 = null;
        class330.field4905 = new int[var17];
        class222.field3200 = null;
        class24.field336 = new byte[var17][];
        class356.field5174 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var21 = 0; var21 < (class195.field2745 >> 3); var21++) {
                for (int var22 = 0; var22 < (class78.field984 >> 3); var22++) {
                    int var23 = class75.field960[var20][var21][var22];
                    if (var23 != -1) {
                        int var24 = (var23 & 0xFFD050) >> 14;
                        int var25 = var23 >> 3 & 0x7FF;
                        int var26 = (var24 / 8 << 8) + var25 / 8;
                        for (int var27 = 0; var27 < var19; var27++) {
                            if (class356.field5174[var27] == var26) {
                                var26 = -1;
                                break;
                            }
                        }
                        if (var26 != -1) {
                            class356.field5174[var19] = var26;
                            int var28 = var26 >> 8 & 0xFF;
                            int var29 = var26 & 0xFF;
                            class161.field2148[var19] = class243.field3602.method707(-1, "m" + var28 + "_" + var29);
                            class330.field4905[var19] = class243.field3602.method707(-1, "l" + var28 + "_" + var29);
                            class22.field314[var19] = class243.field3602.method707(-1, "um" + var28 + "_" + var29);
                            class440.field6387[var19] = class243.field3602.method707(-1, "ul" + var28 + "_" + var29);
                            var19++;
                        }
                    }
                }
            }
        }
        class364.method2318(var15, 10, false, var12, var13);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method699(int arg0) {
        if (arg0 != 20276) {
            return;
        }
        class22.field306.method770(arg0 ^ 0x4F3C);
        field1330++;
        int var1 = class22.field306.method773(8, (byte) 51);
        if (var1 < class14.field231) {
            for (int var2 = var1; var2 < class14.field231; var2++) {
                class169.field2212[class13.field223++] = class301.field4380[var2];
            }
        }
        if (class14.field231 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class14.field231 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class301.field4380[var3];
            class26 var5 = class364.field5260[var4];
            int var6 = class22.field306.method773(1, (byte) 19);
            if (var6 == 0) {
                class301.field4380[class14.field231++] = var4;
                var5.field720 = class388.field5665;
            } else {
                int var7 = class22.field306.method773(2, (byte) -108);
                if (var7 == 0) {
                    class301.field4380[class14.field231++] = var4;
                    var5.field720 = class388.field5665;
                    class189.field2649[class319.field4713++] = var4;
                } else if (var7 == 1) {
                    class301.field4380[class14.field231++] = var4;
                    var5.field720 = class388.field5665;
                    int var8 = class22.field306.method773(3, (byte) 30);
                    var5.method265(var8, 1, arg0 - 20021);
                    int var9 = class22.field306.method773(1, (byte) -115);
                    if (var9 == 1) {
                        class189.field2649[class319.field4713++] = var4;
                    }
                } else if (var7 == 2) {
                    class301.field4380[class14.field231++] = var4;
                    var5.field720 = class388.field5665;
                    if (class22.field306.method773(1, (byte) 120) == 1) {
                        int var10 = class22.field306.method773(3, (byte) -110);
                        var5.method265(var10, 2, 255);
                        int var11 = class22.field306.method773(3, (byte) 115);
                        var5.method265(var11, 2, 255);
                    } else {
                        int var12 = class22.field306.method773(3, (byte) 42);
                        var5.method265(var12, 0, 255);
                    }
                    int var13 = class22.field306.method773(1, (byte) -124);
                    if (var13 == 1) {
                        class189.field2649[class319.field4713++] = var4;
                    }
                } else if (var7 == 3) {
                    class169.field2212[class13.field223++] = var4;
                }
            }
        }
    }
}
