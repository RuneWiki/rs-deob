import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class310 extends class174 {

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ljg;")
    public static class241 field4664 = new class241(64);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4675 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!da", name = "C", descriptor = "C")
    public char field4676;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "J")
    public long field4660;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Lda;")
    public class310 field4674;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public boolean field4657;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[[[I")
    public static int[][][] field4666;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Z")
    public final boolean method1074(int arg0) {
        field4669++;
        int var2 = -24 % ((arg0 - 71) / 52);
        return this.field4657;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public static final void method1888(int arg0) {
        field4658++;
        if (arg0 != 1179648) {
            return;
        }
        if (class360.method2172(arg0 - 1179625) || class88.field1263 == class143.field1911) {
            class430.method2647(arg0 ^ 0x125322, class196.field2965);
            if (class160.field2211 != class143.field1911) {
                class184.method1124((byte) 43);
            }
        } else {
            class207.method1212(-5, class137.field1860, false, false, class53.field718);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)C")
    public final char method1070(byte arg0) {
        field4672++;
        if (arg0 != -100) {
            this.field4674 = null;
        }
        return this.field4676;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILiq;ZIIII)V")
    public static final void method1889(int arg0, class134 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4659++;
        class360.field5320 = 1;
        class314.field4765 = arg3;
        if (arg4 != 18667) {
            method1892(true);
        }
        class303.field4585 = arg2;
        class36.field437 = arg5;
        class463.field6832 = arg6;
        class162.field2247 = arg1;
        class135.field1794 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfh;B)Z")
    public static final boolean method1890(class170 arg0, byte arg1) {
        field4661++;
        if (arg1 != 0) {
            method1888(-23);
        }
        if (class27.field357 == arg0.field2473) {
            class188.field2815 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([[[Ldc;IZIII)Z")
    public static final boolean method1891(class13[][][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4668++;
        byte var6 = arg2 ? 1 : (byte) (class267.field4078 & 0xFF);
        if (class75.field1016[class143.field1911][arg3][arg4] == var6) {
            return false;
        } else if ((class341.field5085[class143.field1911][arg3][arg4] & 0x4) == 0) {
            return false;
        } else if (arg5 == 50) {
            byte var7 = 0;
            int var8 = 0;
            class289.field4392[var7] = arg3;
            int var35 = var7 + 1;
            class25.field326[var7] = arg4;
            class75.field1016[class143.field1911][arg3][arg4] = var6;
            while (var35 != var8) {
                int var9 = class289.field4392[var8] & 0xFFFF;
                int var10 = class289.field4392[var8] >> 16 & 0xFF;
                int var11 = class289.field4392[var8] >> 24 & 0xFF;
                int var12 = class25.field326[var8] & 0xFFFF;
                int var13 = class25.field326[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class341.field5085[class143.field1911][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class143.field1911 + 1; var16 <= 3; var16++) {
                    if ((class341.field5085[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field167 != null) {
                                int var20 = class261.method1614(arg5 + 19759, var10);
                                if (arg0[var16][var9][var12].field167.field3526 == var20 || arg0[var16][var9][var12].field163 != null && arg0[var16][var9][var12].field163.field3526 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class261.method1614(19809, var11);
                                    if (arg0[var16][var9][var12].field167.field3526 == var21 || arg0[var16][var9][var12].field163 != null && arg0[var16][var9][var12].field163.field3526 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class261.method1614(19809, var13);
                                    if (arg0[var16][var9][var12].field167.field3526 == var22 || arg0[var16][var9][var12].field163 != null && arg0[var16][var9][var12].field163.field3526 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class13 var23 = arg0[var16][var9][var12];
                            if (var23.field151 != null) {
                                for (class466 var24 = var23.field151; var24 != null; var24 = var24.field6853) {
                                    class141 var25 = var24.field6862;
                                    if (var25 instanceof class18) {
                                        class18 var26 = (class18) var25;
                                        int var27 = var26.method9(arg5 + 50);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method3((byte) -73);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class13 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field151 != null) {
                            for (class466 var31 = var30.field151; var31 != null; var31 = var31.field6853) {
                                class141 var32 = var31.field6862;
                                if (var32.field1895 != var32.field1890 || var32.field1901 != var32.field1889) {
                                    for (int var33 = var32.field1895; var33 <= var32.field1890; var33++) {
                                        for (int var34 = var32.field1901; var34 <= var32.field1889; var34++) {
                                            class75.field1016[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class75.field1016[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class307.field4638[class143.field1911 + 1].method92(var9, var12);
                    if (var17 > class170.field2630[arg1]) {
                        class170.field2630[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class301.field4545[arg1]) {
                        class301.field4545[arg1] = var18;
                    } else if (var18 > class383.field5589[arg1]) {
                        class383.field5589[arg1] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class150.field2078[arg1] > var19) {
                        class150.field2078[arg1] = var19;
                    } else if (var19 > class282.field4314[arg1]) {
                        class282.field4314[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class75.field1016[class143.field1911][var9 - 1][var12] != var6) {
                        class289.field4392[var35] = class276.method1712(-754974720, class276.method1712(1179648, var9 - 1));
                        class25.field326[var35] = class276.method1712(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class75.field1016[class143.field1911][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class198.field3004;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class75.field1016[class143.field1911][var9 - 1][var12] != var6 && (class341.field5085[class143.field1911][var9][var12] & 0x4) == 0 && (class341.field5085[class143.field1911][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class289.field4392[var35] = class276.method1712(class276.method1712(var9 - 1, 1179648), 1375731712);
                            class25.field326[var35] = class276.method1712(var12, 1245184);
                            class75.field1016[class143.field1911][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class75.field1016[class143.field1911][var9][var12] != var6) {
                            class289.field4392[var35] = class276.method1712(318767104, class276.method1712(var9, 5373952));
                            class25.field326[var35] = class276.method1712(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class75.field1016[class143.field1911][var9][var12] = var6;
                        }
                        if (class115.field1522 > (var9 + 1) && class75.field1016[class143.field1911][var9 + 1][var12] != var6 && (class341.field5085[class143.field1911][var9][var12] & 0x4) == 0 && (class341.field5085[class143.field1911][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class289.field4392[var35] = class276.method1712(-1845493760, class276.method1712(5373952, var9 + 1));
                            class25.field326[var35] = class276.method1712(5439488, var12);
                            class75.field1016[class143.field1911][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class115.field1522 > (var9 + 1) && class75.field1016[class143.field1911][var9 + 1][var12] != var6) {
                        class289.field4392[var35] = class276.method1712(class276.method1712(var9 + 1, 9568256), 1392508928);
                        class25.field326[var35] = class276.method1712(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class75.field1016[class143.field1911][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class75.field1016[class143.field1911][var9 - 1][var12] != var6 && (class341.field5085[class143.field1911][var9][var12] & 0x4) == 0 && (class341.field5085[class143.field1911][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class289.field4392[var35] = class276.method1712(301989888, class276.method1712(13762560, var9 - 1));
                            class25.field326[var35] = class276.method1712(var12, 13828096);
                            class75.field1016[class143.field1911][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class75.field1016[class143.field1911][var9][var12] != var6) {
                            class289.field4392[var35] = class276.method1712(-1828716544, class276.method1712(var9, 13762560));
                            class25.field326[var35] = class276.method1712(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class75.field1016[class143.field1911][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class115.field1522 && class75.field1016[class143.field1911][var9 + 1][var12] != var6 && (class341.field5085[class143.field1911][var9][var12] & 0x4) == 0 && (class341.field5085[class143.field1911][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class289.field4392[var35] = class276.method1712(-771751936, class276.method1712(var9 + 1, 9568256));
                            class25.field326[var35] = class276.method1712(var12, 9633792);
                            class75.field1016[class143.field1911][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class170.field2630[arg1] != -1000000) {
                class170.field2630[arg1] += 10;
                class301.field4545[arg1] -= 50;
                class383.field5589[arg1] += 50;
                class282.field4314[arg1] += 50;
                class150.field2078[arg1] -= 50;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static final void method1892(boolean arg0) {
        field4673++;
        if (arg0) {
            method1888(-80);
        }
        for (int var1 = 0; var1 < class247.field3702.length; var1++) {
            for (int var2 = 0; var2 < class247.field3702[var1].length; var2++) {
                class247.field3702[var1][var2] = class446.field6560;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
    public final long method1066(int arg0) {
        field4665++;
        if (arg0 > -23) {
            this.field4676 = (char) 65432;
        }
        return this.field4660;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLdr;)V")
    public static final void method1893(byte arg0, class261 arg1) {
        field4677++;
        if (class338.field5046) {
            class269.method1673(arg1, 16);
        } else {
            class416.method2596(arg1, false);
        }
        if (arg0 != -32) {
            method1891((class13[][][]) null, -117, false, 111, -14, 62);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        field4663++;
        if (arg0 != -14977) {
            this.field4660 = 42L;
        }
        return this.field4667;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static void method1894(int arg0) {
        field4666 = null;
        field4664 = null;
        field4675 = null;
        int var1 = 123 / ((arg0 + 34) / 61);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
    public final int method1067(int arg0) {
        field4671++;
        int var2 = 64 / ((arg0 + 29) / 47);
        return this.field4662;
    }
}
