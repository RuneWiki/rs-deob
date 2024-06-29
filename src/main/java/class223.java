import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class223 {

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[I")
    public static int[] field3783 = new int[2];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lwa;")
    public static class75 field3776 = class66.method560("Lade Konfiguration )2 ", false);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "J")
    private long field3777;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "J")
    private long field3784;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Lcb;")
    public static class267 field3793;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public boolean field3778;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
    private int[] field3791;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILhj;ILhj;I)Lcc;", line = 7)
    public final class234 method1642(int arg0, class28 arg1, int arg2, class28 arg3, int arg4) {
        field3794++;
        if (this.field3790 != -1) {
            return class182.method1343(this.field3790, (byte) 62).method1670(arg1, arg2, arg0, arg3, (byte) -103);
        }
        if (arg4 != Integer.MIN_VALUE) {
            field3783 = (int[]) null;
        }
        long var6 = this.field3784;
        int[] var8 = this.field3788;
        if (arg1 != null && (arg1.field360 >= 0 || arg1.field382 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3788[var9];
            }
            if (arg1.field360 >= 0) {
                if (arg1.field360 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class102.method799(1073741824, arg1.field360);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field382 >= 0) {
                if (arg1.field382 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class102.method799(1073741824, arg1.field382);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class234 var10 = (class234) class116.field1958.method1193(var6, arg4 - 2147483588);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((var13 & Integer.MIN_VALUE) != 0 && !class236.method1715(var13 & 0x3FFFFFFF, -6834).method897(127)) {
                        var11 = true;
                    }
                } else if (!class199.method1475(var13 & 0x3FFFFFFF, (byte) 113).method1976(this.field3778, arg4 ^ 0x80007EA7)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3777 != -1L) {
                    var10 = (class234) class116.field1958.method1193(this.field3777, -46);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class146[] var14 = new class146[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class146 var19 = class199.method1475(var17 & 0x3FFFFFFF, (byte) 113).method1978((byte) -75, this.field3778);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class146 var18 = class236.method1715(var17 & 0x3FFFFFFF, arg4 + 2147476814).method895(116);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class278 var21 = class199.method1475(var20 & 0x3FFFFFFF, (byte) 106);
                    if (var21.field4784 != null) {
                        for (int var22 = 0; var22 < var21.field4784.length; var22++) {
                            if (var21.field4784[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field4784[var22][0];
                                int var24 = var21.field4784[var22][1];
                                int var25 = var21.field4784[var22][2];
                                int var26 = var21.field4784[var22][3];
                                int var27 = var21.field4784[var22][4];
                                int var28 = var21.field4784[var22][5];
                                var14[var22 + 1].method1118(var23, var24, var25);
                                var14[var22 + 1].method1123(var26, var27, var28);
                            }
                        }
                    }
                }
                class146 var29 = new class146(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field3791[var30] < class69.field1184[var30].length) {
                        var29.method1117(class262.field4513[var30], class69.field1184[var30][this.field3791[var30]]);
                    }
                    if (class240.field4057[var30].length > this.field3791[var30]) {
                        var29.method1117(class82.field1373[var30], class240.field4057[var30][this.field3791[var30]]);
                    }
                }
                var10 = var29.method1114(64, 850, -30, -50, -30);
                ((class57) var10).method423(false, false, true, true, false, false, true);
                class116.field1958.method1194(var10, var6, false);
                this.field3777 = var6;
            }
        }
        if (arg1 == null && arg3 == null) {
            return var10;
        }
        class234 var31;
        if (arg1 != null && arg3 != null) {
            var31 = arg1.method189(arg2, arg3, arg4 ^ 0x8000FFFF, arg0, var10);
        } else if (arg1 == null) {
            var31 = arg3.method185(arg2, (byte) -7, var10);
        } else {
            var31 = arg1.method185(arg0, (byte) -7, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)V", line = 235)
    public final void method1643(int arg0, byte arg1, int arg2) {
        if (arg1 != 21) {
            this.field3778 = true;
        }
        this.field3791[arg2] = arg0;
        field3782++;
        this.method1652(-91);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I", line = 252)
    public final int method1644(int arg0) {
        field3779++;
        if (arg0 != -23641) {
            method1645(false);
        }
        return this.field3790 == -1 ? (this.field3788[8] << 10) + (this.field3788[11] << 5) + (this.field3791[0] << 25) + ((this.field3791[4] << 20) - -(this.field3788[0] << 15)) + this.field3788[1] : 305419896 - -class182.method1343(this.field3790, (byte) 62).field3838;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 268)
    public static void method1645(boolean arg0) {
        field3783 = null;
        field3776 = null;
        field3793 = null;
        if (!arg0) {
            method1648(true, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lhj;IIIB)Lcc;", line = 282)
    public final class234 method1646(class28 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3781++;
        long var6 = (long) arg2 | (long) arg2 << 32 | (long) (arg1 << 16);
        if (arg4 <= 97) {
            this.method1651(-93, (int[]) null, true, 87, (int[]) null);
        }
        class234 var8 = (class234) class282.field4855.method1193(var6, 107);
        if (var8 == null) {
            class146[] var9 = new class146[2];
            int var10 = 0;
            if (!class236.method1715(arg2, -6834).method890(-126) || !class236.method1715(arg1, -6834).method890(-126)) {
                return null;
            }
            class146 var11 = class236.method1715(arg2, -6834).method894((byte) -23);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class146 var12 = class236.method1715(arg1, -6834).method894((byte) -47);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class146 var13 = new class146(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3791[var14] < class69.field1184[var14].length) {
                    var13.method1117(class262.field4513[var14], class69.field1184[var14][this.field3791[var14]]);
                }
                if (class240.field4057[var14].length > this.field3791[var14]) {
                    var13.method1117(class82.field1373[var14], class240.field4057[var14][this.field3791[var14]]);
                }
            }
            var8 = var13.method1114(64, 768, -50, -10, -50);
            class282.field4855.method1194(var8, var6, false);
        }
        if (arg0 != null) {
            var8 = arg0.method192(arg3, var8, (byte) -96);
        }
        return var8;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILhj;)Lcc;", line = 344)
    public final class234 method1647(int arg0, int arg1, class28 arg2) {
        field3792++;
        if (this.field3790 != arg1) {
            return class182.method1343(this.field3790, (byte) 62).method1676(-126, arg2, arg0);
        }
        class234 var4 = (class234) class282.field4855.method1193(this.field3784, 75);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field3788[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class236.method1715(var7 & 0x3FFFFFFF, -6834).method890(-123)) {
                        var5 = true;
                    }
                } else if (!class199.method1475(var7 & 0x3FFFFFFF, (byte) 110).method1981(this.field3778, -128)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class146[] var8 = new class146[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field3788[var10];
                if ((var11 & 0x40000000) != 0) {
                    class146 var12 = class199.method1475(var11 & 0x3FFFFFFF, (byte) 121).method1986(this.field3778, 0);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class146 var13 = class236.method1715(var11 & 0x3FFFFFFF, -6834).method894((byte) -96);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class146 var14 = new class146(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class69.field1184[var15].length > this.field3791[var15]) {
                    var14.method1117(class262.field4513[var15], class69.field1184[var15][this.field3791[var15]]);
                }
                if (this.field3791[var15] < class240.field4057[var15].length) {
                    var14.method1117(class82.field1373[var15], class240.field4057[var15][this.field3791[var15]]);
                }
            }
            var4 = var14.method1114(64, 768, -50, -10, -50);
            class282.field4855.method1194(var4, this.field3784, false);
        }
        if (arg2 != null) {
            var4 = arg2.method192(arg0, var4, (byte) -96);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZB)V", line = 458)
    public static final void method1648(boolean arg0, byte arg1) {
        if (arg1 <= 36) {
            method1648(true, (byte) -59);
        }
        field3780++;
        class151.field2605 = arg0;
        if (!class151.field2605) {
            int var2 = class136.field2328.method481((byte) -7);
            int var3 = (class299.field5105 - class136.field2328.field1012) / 16;
            class197.field3300 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    class197.field3300[var4][var5] = class136.field2328.method476(-82);
                }
            }
            int var6 = class136.field2328.method481((byte) -7);
            int var7 = class136.field2328.method507(-122);
            int var8 = class136.field2328.method491(8);
            int var9 = class136.field2328.method491(8);
            class24.field317 = null;
            class176.field2954 = (byte[][]) null;
            class109.field1876 = new byte[var3][];
            class202.field3410 = new int[var3];
            class37.field543 = new int[var3];
            class294.field5055 = new byte[var3][];
            class226.field3814 = new byte[var3][];
            class90.field1484 = new int[var3];
            class288.field4952 = new int[var3];
            boolean var10 = false;
            class267.field4595 = new byte[var3][];
            class88.field1459 = new int[var3];
            int var11 = 0;
            if (((var8 / 8) == 48 || (var8 / 8) == 49) && (var2 / 8) == 48) {
                var10 = true;
            }
            if ((var8 / 8) == 48 && var2 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var8 - 6) / 8; var12 <= ((var8 + 6) / 8); var12++) {
                for (int var13 = (var2 - 6) / 8; var13 <= ((var2 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class288.field4952[var11] = var14;
                        class88.field1459[var11] = -1;
                        class202.field3410[var11] = -1;
                        class37.field543[var11] = -1;
                        class90.field1484[var11] = -1;
                    } else {
                        class288.field4952[var11] = var14;
                        class88.field1459[var11] = class121.field2039.method1915(-15621, class66.method562((byte) 124, new class75[] { class63.field1105, class67.method565(93, var12), class233.field3940, class67.method565(40, var13) }));
                        class202.field3410[var11] = class121.field2039.method1915(-15621, class66.method562((byte) 119, new class75[] { class106.field1788, class67.method565(31, var12), class233.field3940, class67.method565(126, var13) }));
                        class37.field543[var11] = class121.field2039.method1915(-15621, class66.method562((byte) 126, new class75[] { class31.field455, class67.method565(105, var12), class233.field3940, class67.method565(96, var13) }));
                        class90.field1484[var11] = class121.field2039.method1915(-15621, class66.method562((byte) 127, new class75[] { class198.field3323, class67.method565(90, var12), class233.field3940, class67.method565(103, var13) }));
                    }
                    var11++;
                }
            }
            class210.method1557(-1, var6, var7, var9, false, var8, var2);
            return;
        }
        int var15 = class136.field2328.method501(0);
        class136.field2328.method88(true);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class136.field2328.method92(1, 8);
                    if (var19 == 1) {
                        class259.field4338[var16][var17][var18] = class136.field2328.method92(26, 8);
                    } else {
                        class259.field4338[var16][var17][var18] = -1;
                    }
                }
            }
        }
        class136.field2328.method97((byte) 77);
        int var20 = (class299.field5105 - class136.field2328.field1012) / 16;
        class197.field3300 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class197.field3300[var21][var22] = class136.field2328.method483((byte) 47);
            }
        }
        int var23 = class136.field2328.method485((byte) -2);
        int var24 = class136.field2328.method481((byte) 111);
        int var25 = class136.field2328.method474((byte) 104);
        int var26 = class136.field2328.method491(8);
        class288.field4952 = new int[var20];
        class176.field2954 = (byte[][]) null;
        class24.field317 = null;
        class88.field1459 = new int[var20];
        class267.field4595 = new byte[var20][];
        class109.field1876 = new byte[var20][];
        class37.field543 = new int[var20];
        class226.field3814 = new byte[var20][];
        class90.field1484 = new int[var20];
        class294.field5055 = new byte[var20][];
        class202.field3410 = new int[var20];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class259.field4338[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFF464) >> 14;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class288.field4952[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            int var36 = var34 >> 8 & 0xFF;
                            class288.field4952[var27] = var34;
                            int var37 = var34 & 0xFF;
                            class88.field1459[var27] = class121.field2039.method1915(-15621, class66.method562((byte) 114, new class75[] { class63.field1105, class67.method565(76, var36), class233.field3940, class67.method565(39, var37) }));
                            class202.field3410[var27] = class121.field2039.method1915(-15621, class66.method562((byte) -55, new class75[] { class106.field1788, class67.method565(35, var36), class233.field3940, class67.method565(81, var37) }));
                            class37.field543[var27] = class121.field2039.method1915(-15621, class66.method562((byte) 117, new class75[] { class31.field455, class67.method565(56, var36), class233.field3940, class67.method565(107, var37) }));
                            class90.field1484[var27] = class121.field2039.method1915(-15621, class66.method562((byte) -48, new class75[] { class198.field3323, class67.method565(51, var36), class233.field3940, class67.method565(108, var37) }));
                            var27++;
                        }
                    }
                }
            }
        }
        class210.method1557(-1, var26, var15, var23, false, var25, var24);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)V", line = 724)
    public final void method1649(boolean arg0, int arg1) {
        field3785++;
        this.field3778 = arg0;
        if (arg1 < 81) {
            this.field3778 = false;
        }
        this.method1652(-110);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)V", line = 742)
    public final void method1650(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field3790 = 90;
        }
        field3789++;
        int var4 = class176.field2969[arg2];
        if (this.field3788[var4] != 0 && class236.method1715(arg1, -6834) != null) {
            this.field3788[var4] = class102.method799(arg1, Integer.MIN_VALUE);
            this.method1652(-92);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IZI[I)V", line = 773)
    public final void method1651(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class158.field2718; var7++) {
                    class117 var8 = class236.method1715(var7, -6834);
                    if (var8 != null && !var8.field1979 && var8.field1973 == (arg2 ? 7 : 0) + var6) {
                        arg1[class176.field2969[var6]] = class102.method799(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        field3787++;
        if (arg0 != -31656) {
            this.field3778 = false;
        }
        this.field3791 = arg4;
        this.field3790 = arg3;
        this.field3778 = arg2;
        this.field3788 = arg1;
        this.method1652(-67);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 822)
    private final void method1652(int arg0) {
        field3786++;
        long var2 = this.field3784;
        this.field3784 = -1L;
        long[] var4 = class311.field5298;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3784 = this.field3784 >>> 8 ^ var4[(int) ((this.field3784 ^ (long) (this.field3788[var5] >> 24)) & 0xFFL)];
            this.field3784 = var4[(int) (((long) (this.field3788[var5] >> 16) ^ this.field3784) & 0xFFL)] ^ this.field3784 >>> 8;
            this.field3784 = this.field3784 >>> 8 ^ var4[(int) (((long) (this.field3788[var5] >> 8) ^ this.field3784) & 0xFFL)];
            this.field3784 = this.field3784 >>> 8 ^ var4[(int) ((this.field3784 ^ (long) this.field3788[var5]) & 0xFFL)];
        }
        int var6 = 0;
        if (arg0 > -64) {
            this.field3788 = (int[]) null;
        }
        while (var6 < 5) {
            this.field3784 = this.field3784 >>> 8 ^ var4[(int) ((this.field3784 ^ (long) this.field3791[var6]) & 0xFFL)];
            var6++;
        }
        this.field3784 = var4[(int) ((this.field3784 ^ (long) (this.field3778 ? 1 : 0)) & 0xFFL)] ^ this.field3784 >>> 8;
        if (var2 != 0L && this.field3784 != var2) {
            class116.field1958.method1192(false, var2);
        }
    }
}
