import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class30 extends class89 {

    @OriginalMember(owner = "client!nl", name = "rc", descriptor = "I")
    public int field481 = 0;

    @OriginalMember(owner = "client!nl", name = "yc", descriptor = "I")
    public int field488 = -1;

    @OriginalMember(owner = "client!nl", name = "tc", descriptor = "I")
    public int field483 = 0;

    @OriginalMember(owner = "client!nl", name = "Jc", descriptor = "I")
    public int field499 = -1;

    @OriginalMember(owner = "client!nl", name = "Nc", descriptor = "I")
    public int field503 = 0;

    @OriginalMember(owner = "client!nl", name = "xc", descriptor = "I")
    private int field487 = 0;

    @OriginalMember(owner = "client!nl", name = "oc", descriptor = "I")
    public int field478 = -1;

    @OriginalMember(owner = "client!nl", name = "wc", descriptor = "Z")
    public boolean field486 = false;

    @OriginalMember(owner = "client!nl", name = "Bc", descriptor = "I")
    public int field491 = -1;

    @OriginalMember(owner = "client!nl", name = "Lc", descriptor = "I")
    public int field501 = 0;

    @OriginalMember(owner = "client!nl", name = "Kc", descriptor = "I")
    public int field500 = -1;

    @OriginalMember(owner = "client!nl", name = "Qc", descriptor = "I")
    public int field506 = -1;

    @OriginalMember(owner = "client!nl", name = "Oc", descriptor = "I")
    public int field504 = -1;

    @OriginalMember(owner = "client!nl", name = "Cc", descriptor = "I")
    public int field492 = 0;

    @OriginalMember(owner = "client!nl", name = "Dc", descriptor = "I")
    public static int field493 = -1;

    @OriginalMember(owner = "client!nl", name = "Ic", descriptor = "[Lrb;")
    public static class221[] field498 = new class221[28];

    @OriginalMember(owner = "client!nl", name = "Mc", descriptor = "[Z")
    public static boolean[] field502 = new boolean[100];

    @OriginalMember(owner = "client!nl", name = "pc", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!nl", name = "qc", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!nl", name = "sc", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!nl", name = "uc", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!nl", name = "vc", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!nl", name = "Ac", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!nl", name = "Fc", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!nl", name = "Gc", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!nl", name = "Hc", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!nl", name = "Pc", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!nl", name = "Tc", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!nl", name = "Uc", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!nl", name = "Vc", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!nl", name = "Wc", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!nl", name = "zc", descriptor = "Lrm;")
    public class246 field489;

    @OriginalMember(owner = "client!nl", name = "Rc", descriptor = "Lja;")
    public static class64 field507;

    @OriginalMember(owner = "client!nl", name = "Ec", descriptor = "Ljava/lang/String;")
    public String field494;

    @OriginalMember(owner = "client!nl", name = "Sc", descriptor = "[[B")
    public static byte[][] field508;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "(I)V", line = 5)
    public static final void method197(int arg0) {
        field490++;
        if (!class34.method248(-115) && class41.field734 != class273.field4247) {
            class260.method1841(class111.field1847, class19.field356.field1388[0], false, class19.field356.field1386[0], class41.field734, 89, class76.field1166);
            return;
        }
        if (class41.field734 != class217.field3481 && class12.method112(-8656, class41.field734)) {
            class217.field3481 = class41.field734;
            class19.method155(-119);
        }
        if (arg0 < 57) {
            field502 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)I", line = 35)
    public final int method198(int arg0) {
        field484++;
        return arg0 == 499 ? this.field1405 : -88;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)Z", line = 53)
    public final boolean method199(int arg0) {
        field482++;
        if (this.field489 == null) {
            return false;
        } else {
            if (arg0 != 58) {
                this.field483 = 116;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)I", line = 69)
    public final int method200(int arg0) {
        field511++;
        if (arg0 == -1) {
            return this.field489 == null || this.field489.field3809 == -1 ? super.method200(-1) : class17.method145((byte) -123, this.field489.field3809).field3292;
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIILfa;Lmf;IIIIIIIII)V", line = 86)
    private final void method201(int arg0, int arg1, int arg2, int arg3, class199 arg4, class47 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int var16 = arg1 * arg1 + arg9 * arg9;
        if (arg11 != 0) {
            return;
        }
        field479++;
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg1, (double) arg9) * 325.949D) & 0x7FF;
        class199 var18 = class91.method655(var17, -10, arg4, this.field1369, arg8, this.field1442, this.field1425);
        if (var18 == null) {
            return;
        }
        if (!class265.field4126) {
            var18.method203(0, arg2, arg3, arg10, arg12, arg6, arg7, arg0, -1L, arg13, arg5);
            return;
        }
        float var19 = class265.method1911();
        float var20 = class265.method1902();
        class265.method1908();
        class265.method1881(var19, var20 - 150.0F);
        var18.method203(0, arg2, arg3, arg10, arg12, arg6, arg7, arg0, -1L, arg13, arg5);
        class265.method1897();
        class265.method1881(var19, var20);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 124)
    public static final void method202(byte arg0) {
        field495++;
        if (class277.field4293 == 5) {
            class277.field4293 = 6;
            if (arg0 != 7) {
                field507 = (class64) null;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 139)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field485++;
        if (this.field489 == null) {
            return;
        }
        class269 var13 = this.field1458 != -1 && this.field1398 == 0 ? class6.method28(this.field1458, 2) : null;
        class269 var14 = this.field1453 == -1 || this.field486 || this.field1453 == this.method640(124).field970 && var13 != null ? null : class6.method28(this.field1453, 2);
        class199 var15 = this.field489.method1751(17499, this.field1414, this.field1438, this.field1385, this.field1401, this.field1373, var14, true, this.field1430, var13, this.field1422);
        int var16 = class93.method668((byte) -74);
        if (class265.field4126 && class95.field1567 < 96 && var16 > 50) {
            class279.method1992(32130);
        }
        if (class77.field1172 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (class34.field571 < var17) {
                class215.field3422[class34.field571] = new byte[102400];
                class34.field571++;
            }
            while (var17 < class34.field571) {
                class34.field571--;
                class215.field3422[class34.field571] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1392 = var15.method207();
        if (class11.field219 && (this.field489.field3809 == -1 || class17.method145((byte) 38, this.field489.field3809).field3335)) {
            class199 var18 = class169.method1234(0, -43, var14 == null ? this.field1414 : this.field1438, var14 == null ? var13 : var14, 160, 1, arg0, this.field1425, this.field1369, var15, 0, this.field1442, 240, this.field1450);
            if (class265.field4126) {
                float var19 = class265.method1911();
                float var20 = class265.method1902();
                class265.method1908();
                class265.method1881(var19, var20 - 150.0F);
                var18.method203(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class47) null);
                class265.method1897();
                class265.method1881(var19, var20);
            } else {
                var18.method203(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class47) null);
            }
        }
        if (class19.field356 == this) {
            for (int var21 = class88.field1341.length - 1; var21 >= 0; var21--) {
                class210 var22 = class88.field1341[var21];
                if (var22 != null && var22.field3359 != -1) {
                    if (var22.field3358 == 1 && var22.field3364 >= 0 && var22.field3364 < class138.field2196.length) {
                        class305 var23 = class138.field2196[var22.field3364];
                        if (var23 != null) {
                            int var24 = var23.field1442 / 32 - (class19.field356.field1442 / 32);
                            int var25 = var23.field1369 / 32 - (class19.field356.field1369 / 32);
                            this.method201(arg7, var24, arg1, arg2, var15, (class47) null, arg5, arg6, var22.field3359, var25, arg3, 0, arg4, arg9, arg0);
                        }
                    }
                    if (var22.field3358 == 2) {
                        int var26 = (var22.field3352 - class177.field2780) * 4 + 2 - (class19.field356.field1442 / 32);
                        int var27 = (var22.field3361 - class91.field1485) * 4 + 2 - class19.field356.field1369 / 32;
                        this.method201(arg7, var26, arg1, arg2, var15, (class47) null, arg5, arg6, var22.field3359, var27, arg3, 0, arg4, arg9, arg0);
                    }
                    if (var22.field3358 == 10 && var22.field3364 >= 0 && var22.field3364 < class82.field1228.length) {
                        class30 var28 = class82.field1228[var22.field3364];
                        if (var28 != null) {
                            int var29 = var28.field1442 / 32 - (class19.field356.field1442 / 32);
                            int var30 = var28.field1369 / 32 - (class19.field356.field1369 / 32);
                            this.method201(arg7, var29, arg1, arg2, var15, (class47) null, arg5, arg6, var22.field3359, var30, arg3, 0, arg4, arg9, arg0);
                        }
                    }
                }
            }
        }
        this.method631(-25822, var15);
        this.method641(arg0, (byte) -100, var15);
        class199 var31 = null;
        if (!this.field486 && this.field1417 != -1 && this.field1449 != -1) {
            class90 var32 = class136.method1042((byte) 110, this.field1417);
            var31 = var32.method652(2026, this.field1449, this.field1440, this.field1370);
            if (var31 != null) {
                var31.method1119(0, -this.field1446, 0);
                if (var32.field1483) {
                    if (class74.field1139 != 0) {
                        var31.method1132(class74.field1139);
                    }
                    if (class249.field3845 != 0) {
                        var31.method1129(class249.field3845);
                    }
                    if (class267.field4141 != 0) {
                        var31.method1119(0, class267.field4141, 0);
                    }
                }
            }
        }
        class199 var33 = null;
        if (!this.field486 && this.field1381 != null) {
            if (this.field1367 <= class205.field3252) {
                this.field1381 = null;
            }
            if (this.field1358 <= class205.field3252 && class205.field3252 < this.field1367) {
                if (this.field1381 instanceof class258) {
                    var33 = (class199) ((class258) this.field1381).method1827((byte) -48);
                } else {
                    var33 = (class199) this.field1381;
                }
                var33.method1119(this.field1387 - this.field1442, -this.field1425 + this.field1378, this.field1396 - this.field1369);
                if (this.field1395 == 512) {
                    var33.method1115();
                } else if (this.field1395 == 1024) {
                    var33.method1112();
                } else if (this.field1395 == 1536) {
                    var33.method1105();
                }
            }
        }
        if (class265.field4126) {
            var15.field3145 = true;
            var15.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
            if (var31 != null) {
                var31.field3145 = true;
                var31.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
            }
        } else {
            if (var31 != null) {
                var15 = ((class146) var15).method1138(var31);
            }
            if (var33 != null) {
                var15 = ((class146) var15).method1138(var33);
            }
            var15.field3145 = true;
            var15.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
        }
        if (var33 == null) {
            return;
        }
        if (this.field1395 == 512) {
            var33.method1105();
        } else if (this.field1395 == 1024) {
            var33.method1112();
        } else if (this.field1395 == 1536) {
            var33.method1115();
        }
        var33.method1119(this.field1442 - this.field1387, -this.field1378 + this.field1425, this.field1369 - this.field1396);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BLpe;)V", line = 383)
    public final void method204(byte arg0, class101 arg1) {
        field480++;
        arg1.field1667 = 0;
        int var3 = arg1.method741(44);
        boolean var4 = (var3 & 0x4) != 0;
        int var5 = super.method200(-1);
        this.method643((var3 >> 3 & 0x7) + 1, (byte) -68);
        int var6 = var3 & 0x1;
        this.field487 = var3 >> 6 & 0x3;
        int[] var7 = new int[12];
        this.field1442 += (this.method200(-1) - var5) * 64;
        this.field1369 += (this.method200(-1) - var5) * 64;
        int var8 = -1;
        this.field488 = arg1.method727((byte) 125);
        this.field499 = arg1.method727((byte) 116);
        if (arg0 < 119) {
            return;
        }
        this.field492 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method741(61);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method741(34);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var8 = arg1.method731(false);
                    this.field492 = arg1.method741(67);
                    break;
                }
                if (var12 < 32768) {
                    var7[var9] = class94.method673(Integer.MIN_VALUE, var12 - 256);
                } else {
                    int var13 = class114.field1869[var12 - 32768];
                    var7[var9] = class94.method673(1073741824, var13);
                    int var14 = class208.method1521(-1361, var13).field2808;
                    if (var14 != 0) {
                        this.field492 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method741(83);
            if (var17 < 0 || var17 >= class107.field1781[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1405 = arg1.method731(false);
        long var18 = arg1.method723(21649);
        this.field494 = class259.method1835((byte) 126, var18);
        this.field481 = arg1.method741(57);
        if (var4) {
            this.field503 = arg1.method731(false);
            this.field491 = -1;
            this.field501 = this.field481;
        } else {
            this.field503 = 0;
            this.field501 = arg1.method741(52);
            this.field491 = arg1.method741(12);
            if (this.field491 == 255) {
                this.field491 = -1;
            }
        }
        int var20 = this.field483;
        this.field483 = arg1.method741(98);
        if (this.field483 == 0) {
            class41.method331((byte) -96, this);
        } else {
            int var21 = this.field506;
            int var22 = this.field500;
            int var23 = this.field478;
            int var24 = this.field504;
            this.field500 = arg1.method731(false);
            this.field506 = arg1.method731(false);
            this.field504 = arg1.method731(false);
            this.field478 = arg1.method731(false);
            if (this.field483 != var20 || this.field500 != var22 || this.field506 != var21 || this.field504 != var24 || this.field478 != var23) {
                class46.method365(this, Integer.MAX_VALUE);
            }
        }
        if (this.field489 == null) {
            this.field489 = new class246();
        }
        int var25 = this.field489.field3809;
        this.field489.method1748(var7, var15, this.field1405, var8, -757782704, ~var6 == -2);
        if (var8 != var25) {
            this.field1442 = this.field1386[0] * 128 + (this.method200(-1) * 64);
            this.field1369 = this.field1388[0] * 128 + this.method200(-1) * 64;
        }
        if (this.field1454 != null) {
            this.field1454.method369();
        }
    }

    @OriginalMember(owner = "client!nl", name = "finalize", descriptor = "()V", line = 542)
    protected final void finalize() {
        field496++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V", line = 556)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field505++;
    }

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "(I)V", line = 589)
    public static void method206(int arg0) {
        field502 = null;
        field507 = null;
        if (arg0 != 6) {
            field507 = (class64) null;
        }
        field498 = null;
        field508 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I", line = 617)
    public final int method207() {
        field509++;
        return this.field1392;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Ljava/lang/String;", line = 634)
    public final String method208(byte arg0) {
        if (arg0 <= 49) {
            method197(125);
        }
        field510++;
        String var2 = this.field494;
        if (class236.field3712 != null) {
            var2 = class236.field3712[this.field487] + var2;
        }
        if (class267.field4139 != null) {
            var2 = var2 + class267.field4139[this.field487];
        }
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZI)V", line = 656)
    public final void method209(int arg0, int arg1, boolean arg2, int arg3) {
        super.method639(21696, arg3, this.method200(-1), arg0, arg2);
        field512++;
        if (arg1 != 128) {
            this.method209(87, 105, false, 39);
        }
    }
}
