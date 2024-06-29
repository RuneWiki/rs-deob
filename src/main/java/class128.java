import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class128 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lhu;")
    private class76 field1875 = new class76(64);

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lhu;")
    public class76 field1889 = new class76(50);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lhu;")
    public class76 field1891 = new class76(5);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lr;")
    private class110 field1877;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lr;")
    public class110 field1886;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
    public boolean field1887;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lad;")
    public static class268 field1876 = new class268(512);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lmc;")
    public static class78 field1890 = new class78(77, -1);

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lfk;")
    public final class429 method782(int arg0, int arg1) {
        field1882++;
        class76 var3 = this.field1875;
        class429 var4;
        synchronized (this.field1875) {
            var4 = (class429) this.field1875.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1877.method702((byte) 96, class26.method149(arg0, (byte) -98), class453.method2656(-1633151289, arg0));
        class429 var6 = new class429();
        var6.field5854 = this;
        var6.field5867 = arg0;
        if (arg1 != 1) {
            return null;
        }
        if (var5 != null) {
            var6.method2535((byte) 75, new class32(var5));
        }
        var6.method2527(true);
        class76 var7 = this.field1875;
        synchronized (this.field1875) {
            this.field1875.method505((long) arg0, var6, 38);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public final void method783(boolean arg0) {
        class76 var2 = this.field1875;
        synchronized (this.field1875) {
            this.field1875.method495(-77);
            if (arg0) {
                this.field1877 = null;
            }
        }
        field1881++;
        class76 var3 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method495(-106);
        }
        class76 var4 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method495(-75);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public final void method784(byte arg0) {
        field1888++;
        class76 var2 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method495(-126);
        }
        class76 var3 = this.field1891;
        synchronized (this.field1891) {
            if (arg0 > 54) {
                this.field1891.method495(-99);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
    public final void method785(boolean arg0, byte arg1) {
        field1880++;
        if (arg0 == this.field1887) {
            return;
        }
        this.field1887 = arg0;
        this.method783(false);
        if (arg1 < 107) {
            this.field1877 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwm;III)V")
    public static final void method786(class364 arg0, int arg1, int arg2, int arg3) {
        field1879++;
        if (arg3 < 0 || arg1 < 0 || class311.field4107 == 0 || class460.field6229 == 0) {
            return;
        }
        arg0.method1975(class154.field2155, class444.field6033, class311.field4107, class460.field6229);
        arg0.method1981(class433.field5892, class329.field4370, class311.field4107, class460.field6229);
        if (arg2 != 64) {
            return;
        }
        class203 var4 = arg0.method2012();
        var4.method1030(class316.field4177, class291.field3907, class257.field3429, class369.field5057, class111.field1684, class429.field5871);
        arg0.method1956(var4);
        if (class289.field3896 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method1998();
            int var8 = (arg3 - class154.field2155) * var7 / class311.field4107;
            int var9 = (arg1 - class444.field6033) * var7 / class460.field6229;
            int var10 = arg0.method1950();
            int var11 = (arg3 - class154.field2155) * var10 / class311.field4107;
            int var12 = (arg1 - class444.field6033) * var10 / class460.field6229;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1019(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1019(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class295.field3947 > var20 && var22 < class39.field567) {
                    int var23 = class233.field3103.field6502;
                    if (var23 < 3 && (class1.field26[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class289.field3896[var23].method368(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class233.field3103.method545(false) - 1) * 64 >> 7;
                        var6 = var21 + (class233.field3103.method545(false) - 1) * 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class289.field3899 && (class456.field6187 & 0x40) != 0) {
                    class464 var24 = class78.method519(class210.field2841, class38.field559, (byte) -72);
                    if (var24 == null) {
                        class78.method513(-1);
                    } else {
                        class402.method2436(-1, true, var6, false, (byte) 109, class491.field6867, var5, 51, " ->", class297.field3974, 0L);
                    }
                } else {
                    if (class343.field4601 == class243.field3233) {
                        class402.method2436(-1, true, var6, false, (byte) 114, class257.field3423.method1176(class110.field1676, (byte) -119), var5, 59, "", -1, 0L);
                    }
                    class158.field2177++;
                    class402.method2436(-1, true, var6, false, (byte) 106, class289.field3900, var5, 22, "", -1, 0L);
                }
            }
        }
        class472 var25 = class32.field488;
        for (class374 var26 = (class374) var25.method2764((byte) -112); var26 != null; var26 = (class374) var25.method2769(true)) {
            if (class233.field3103.field6502 == var26.field5155 && var26.method2300(arg1, (byte) -43, arg3, arg0)) {
                if (var26.field5159 instanceof class487) {
                    class487 var27 = (class487) var26.field5159;
                    int var28 = var27.method545(false);
                    if ((var28 & 0x1) == 0 && (var27.field6501 & 0x7F) == 0 && (var27.field6507 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6501 & 0x7F) == 64 && (var27.field6507 & 0x7F) == 64) {
                        int var29 = var27.field6501 + 64 - (var27.method545(false) * 64);
                        int var30 = var27.field6507 - (var27.method545(false) * 64 - 64);
                        for (int var31 = 0; var31 < class202.field2734; var31++) {
                            class121 var38 = class221.field2941[class412.field5638[var31]];
                            if (var38 != null && class70.field968 != var38.field1181 && var38.field1170) {
                                int var39 = var38.field6501 - (var38.field1780.field5857 - 1) * 64;
                                int var40 = var38.field6507 - ((var38.field1780.field5857 - 1) * 64);
                                if (var29 <= var39 && var38.field1780.field5857 <= (var27.method545(false) - (var39 - var29 >> 7)) && var40 >= var30 && var38.field1780.field5857 <= (var27.method545(false) - (var40 - var30 >> 7))) {
                                    class294.method1650(var38, class233.field3103.field6502 != var26.field5155, true);
                                    var38.field1181 = class70.field968;
                                }
                            }
                        }
                        int var32 = class239.field3187;
                        int[] var33 = class265.field3502;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class487 var35 = class413.field5644[var33[var34]];
                            if (var35 != null && class70.field968 != var35.field1181 && var27 != var35 && var35.field1170) {
                                int var36 = var35.field6501 + 64 - (var35.method545(false) * 64);
                                int var37 = var35.field6507 - ((var35.method545(false) - 1) * 64);
                                if (var36 >= var29 && var35.method545(false) <= var27.method545(false) - (var36 - var29 >> 7) && var37 >= var30 && var35.method545(false) <= var27.method545(false) - (var37 - var30 >> 7)) {
                                    class216.method1229(class233.field3103.field6502 != var26.field5155, var35, -1);
                                    var35.field1181 = class70.field968;
                                }
                            }
                        }
                    }
                    if (class70.field968 == var27.field1181) {
                        continue;
                    }
                    class216.method1229(class233.field3103.field6502 != var26.field5155, var27, -1);
                    var27.field1181 = class70.field968;
                }
                if (var26.field5159 instanceof class121) {
                    class121 var41 = (class121) var26.field5159;
                    if (var41.field1780 != null) {
                        if ((var41.field1780.field5857 & 0x1) == 0 && (var41.field6501 & 0x7F) == 0 && (var41.field6507 & 0x7F) == 0 || (var41.field1780.field5857 & 0x1) == 1 && (var41.field6501 & 0x7F) == 64 && (var41.field6507 & 0x7F) == 64) {
                            int var42 = var41.field6501 - ((var41.field1780.field5857 - 1) * 64);
                            int var43 = var41.field6507 - (var41.field1780.field5857 - 1) * 64;
                            for (int var44 = 0; var44 < class202.field2734; var44++) {
                                class121 var51 = class221.field2941[class412.field5638[var44]];
                                if (var51 != null && class70.field968 != var51.field1181 && var41 != var51 && var51.field1170) {
                                    int var52 = var51.field6501 - ((var51.field1780.field5857 - 1) * 64);
                                    int var53 = var51.field6507 - (var51.field1780.field5857 * 64 - 64);
                                    if (var42 <= var52 && var41.field1780.field5857 - (var52 - var42 >> 7) >= var51.field1780.field5857 && var43 <= var53 && var51.field1780.field5857 <= (var41.field1780.field5857 - (var53 - var43 >> 7))) {
                                        class294.method1650(var51, class233.field3103.field6502 != var26.field5155, true);
                                        var51.field1181 = class70.field968;
                                    }
                                }
                            }
                            int var45 = class239.field3187;
                            int[] var46 = class265.field3502;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class487 var48 = class413.field5644[var46[var47]];
                                if (var48 != null && class70.field968 != var48.field1181 && var48.field1170) {
                                    int var49 = var48.field6501 - ((var48.method545(false) - 1) * 64);
                                    int var50 = var48.field6507 - (var48.method545(false) - 1) * 64;
                                    if (var49 >= var42 && var48.method545(false) <= (var41.field1780.field5857 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method545(false) <= var41.field1780.field5857 - (var50 - var43 >> 7)) {
                                        class216.method1229(class233.field3103.field6502 != var26.field5155, var48, arg2 - 65);
                                        var48.field1181 = class70.field968;
                                    }
                                }
                            }
                        }
                        if (class70.field968 == var41.field1181) {
                            continue;
                        }
                        class294.method1650(var41, class233.field3103.field6502 != var26.field5155, true);
                        var41.field1181 = class70.field968;
                    }
                }
                if (var26.field5159 instanceof class15) {
                    class223 var54 = (class223) class33.field505.method1528((long) (var26.field5161 | var26.field5155 << 28 | var26.field5158 << 14), 62);
                    if (var54 != null) {
                        for (class459 var55 = (class459) var54.field2963.method649(18947); var55 != null; var55 = (class459) var54.field2963.method648(33)) {
                            class443 var56 = class175.field2385.method1557(var55.field6222, 21992);
                            if (!class289.field3899) {
                                if (class233.field3103.field6502 == var26.field5155) {
                                    String[] var58 = var56.field5970;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 15;
                                            }
                                            int var61 = class491.field6868;
                                            if (var59 == 1) {
                                                var60 = 46;
                                            }
                                            if (var59 == 2) {
                                                var60 = 58;
                                            }
                                            if (var59 == 3) {
                                                var60 = 6;
                                            }
                                            if (var59 == 4) {
                                                var60 = 21;
                                            }
                                            if (var56.field5977 == var59) {
                                                var61 = var56.field6006;
                                            }
                                            if (var56.field5979 == var59) {
                                                var61 = var56.field5987;
                                            }
                                            class402.method2436(-1, true, var26.field5158, false, (byte) 119, var58[var59], var26.field5161, var60, "<col=ff9040>" + var56.field5996, var61, (long) var55.field6222);
                                            class171.field2343++;
                                        }
                                    }
                                }
                                class402.method2436(-1, true, var26.field5158, class233.field3103.field6502 != var26.field5155, (byte) 93, class11.field145.method1176(class110.field1676, (byte) -103), var26.field5161, 1009, "<col=ff9040>" + var56.field5996, class92.field1356, (long) var55.field6222);
                                class1.field4++;
                            } else if (class233.field3103.field6502 == var26.field5155) {
                                class112 var57 = class72.field984 == -1 ? null : class94.field1387.method164(27, class72.field984);
                                if ((class456.field6187 & 0x1) != 0 && (var57 == null || var56.method2589(102, var57.field1702, class72.field984) != var57.field1702)) {
                                    class402.method2436(-1, true, var26.field5158, false, (byte) 121, class491.field6867, var26.field5161, 13, class31.field407 + " -> <col=ff9040>" + var56.field5996, class297.field3974, (long) var55.field6222);
                                    class326.field4346++;
                                }
                            }
                        }
                    }
                }
                if (var26.field5159 instanceof class381) {
                    class381 var62 = (class381) var26.field5159;
                    class88 var63 = class1.field23.method935(var62.method13(arg2 - 8), (byte) -109);
                    if (var63.field1269 != null) {
                        var63 = var63.method574(67, class38.field562);
                    }
                    if (var63 != null) {
                        if (!class289.field3899) {
                            if (class233.field3103.field6502 == var26.field5155) {
                                String[] var65 = var63.field1304;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            if (var66 == 0) {
                                                var67 = 50;
                                            }
                                            int var68 = class491.field6868;
                                            if (var66 == 1) {
                                                var67 = 20;
                                            }
                                            if (var66 == 2) {
                                                var67 = 12;
                                            }
                                            if (var66 == 3) {
                                                var67 = 17;
                                            }
                                            if (var63.field1282 == var66) {
                                                var68 = var63.field1231;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1004;
                                            }
                                            if (var63.field1278 == var66) {
                                                var68 = var63.field1232;
                                            }
                                            class402.method2436(-1, true, var26.field5158, false, (byte) 107, var65[var66], var26.field5161, var67, "<col=00ffff>" + var63.field1254, var68, class137.method828(-3, var26.field5158, var26.field5161, var62));
                                            class469.field6477++;
                                        }
                                    }
                                }
                            }
                            class326.field4357++;
                            class402.method2436(-1, true, var26.field5158, class233.field3103.field6502 != var26.field5155, (byte) 90, class11.field145.method1176(class110.field1676, (byte) -121), var26.field5161, 1010, "<col=00ffff>" + var63.field1254, class92.field1356, (long) var63.field1298);
                        } else if (class233.field3103.field6502 == var26.field5155) {
                            class112 var64 = class72.field984 == -1 ? null : class94.field1387.method164(27, class72.field984);
                            if ((class456.field6187 & 0x4) != 0 && (var64 == null || var63.method573(var64.field1702, arg2 + 48, class72.field984) != var64.field1702)) {
                                class402.method2436(-1, true, var26.field5158, false, (byte) 104, class491.field6867, var26.field5161, 57, class31.field407 + " -> <col=00ffff>" + var63.field1254, class297.field3974, class137.method828(122, var26.field5158, var26.field5161, var62));
                                class324.field4313++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public final void method787(int arg0, int arg1) {
        class76 var3 = this.field1875;
        synchronized (this.field1875) {
            this.field1875.method496(arg0, -91);
        }
        field1878++;
        class76 var4 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method496(arg0, arg1 - 116);
        }
        class76 var5 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method496(arg0, arg1 ^ 0xFFFFFFD6);
        }
        if (arg1 != 1) {
            method789(-82);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V")
    public static final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1884++;
        int var6 = arg3 - arg4;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class94.method593(arg3, arg4, 1891003047, arg5, arg1);
            }
        } else if (var6 == 0) {
            class313.method1715(arg4, arg5, arg0, arg1, 5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg1 = arg4;
                arg4 = var9;
                arg0 = arg3;
                arg3 = var10;
            }
            if (arg1 > arg0) {
                int var11 = arg1;
                arg1 = arg0;
                int var12 = arg4;
                arg0 = var11;
                arg4 = arg3;
                arg3 = var12;
            }
            int var13 = arg4;
            int var14 = arg0 - arg1;
            int var15 = arg3 - arg4;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = 50 % ((-arg2 - 7) / 52);
            int var18 = arg3 <= arg4 ? -1 : 1;
            if (var8) {
                for (int var20 = arg1; var20 <= arg0; var20++) {
                    var16 += var15;
                    class102.field1472[var20][var13] = arg5;
                    if (var16 > 0) {
                        var13 += var18;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    var16 += var15;
                    class102.field1472[var13][var19] = arg5;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method789(int arg0) {
        field1890 = null;
        field1876 = null;
        if (arg0 != 479) {
            field1893 = -100;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
    public final void method790(boolean arg0, int arg1) {
        field1883++;
        this.field1892 = arg1;
        class76 var3 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method495(-110);
        }
        if (!arg0) {
            method789(-79);
        }
        class76 var4 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method495(-122);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public final void method791(byte arg0) {
        class76 var2 = this.field1875;
        synchronized (this.field1875) {
            this.field1875.method502(0);
            if (arg0 != 16) {
                this.method785(true, (byte) -41);
            }
        }
        field1885++;
        class76 var3 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method502(0);
        }
        class76 var4 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method502(0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ldn;IZLr;Lr;)V")
    public class128(class329 arg0, int arg1, boolean arg2, class110 arg3, class110 arg4) {
        this.field1877 = arg3;
        this.field1886 = arg4;
        this.field1887 = arg2;
        if (this.field1877 != null) {
            int var6 = this.field1877.method705((byte) -120) - 1;
            this.field1877.method694(var6, (byte) 119);
        }
    }
}
