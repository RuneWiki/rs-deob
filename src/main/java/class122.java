import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class122 extends class66 {

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Lk;")
    public static class244 field2041 = new class244(0, 0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2043 = new String[100];

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Z")
    public static boolean field2042 = false;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field2045 = new String[100];

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "B")
    public byte field2039;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Lab;")
    public class249 field2038;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)I")
    public final int method82(int arg0) {
        if (arg0 != 12027) {
            return -43;
        } else {
            ++field2037;
            return this.field2038 == null ? 0 : this.field2038.field4160 * 100 / (this.field2038.field4182.length + -this.field2039);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field2043 = null;
        int var1 = 37 % ((-31 - arg0) / 36);
        field2041 = null;
        field2045 = null;
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)[B")
    public final byte[] method83(int arg0) {
        if (arg0 != 255) {
            this.field2035 = 36;
        }
        ++field2034;
        if (!super.field1114 && ~(this.field2038.field4182.length - this.field2039) >= ~this.field2038.field4160) {
            return this.field2038.field4182;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
    public static final void method915(int arg0, int arg1) {
        ++field2033;
        if (~arg1 <= -1) {
            int var2 = class197.field3204[arg1];
            int var3 = class67.field1125[arg1];
            int var4 = class195.field3154[arg1];
            int var5 = (int) class68.field1149[arg1];
            long var6 = class68.field1149[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            if (var4 == 9) {
                class81.field1352 = 0;
                class268.field4455 = 2;
                class5.field132 = class298.field4870;
                ++class120.field2013;
                class216.field3650 = class32.field526;
                class236.field3980.method640((byte) 97, 200);
                class236.field3980.method1801(-126, class157.field2581[82] ? 1 : 0);
                class236.field3980.method1817(105, class173.field2785);
                class236.field3980.method1778((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 ^ -2147469660);
                class236.field3980.method1778(class42.field646, arg0 ^ -2147469660);
                class236.field3980.method1771(class78.field1313 + var3, (byte) 30);
                class236.field3980.method1822(class26.field462 + var2, 554582280);
                class79.method554(false, var6, var3, var2);
            }
            if (~var4 == -5) {
                class123 var8 = class15.field300[var5];
                if (var8 != null) {
                    ++class55.field979;
                    class5.field132 = class298.field4870;
                    class81.field1352 = 0;
                    class216.field3650 = class32.field526;
                    class268.field4455 = 2;
                    class236.field3980.method640((byte) 97, 180);
                    class236.field3980.method1822(var5, 554582280);
                    class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, -1);
                    class190.method1373(0, var8.method294((byte) -106), var8.method294((byte) -104), true, arg0 + -2147457443, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (~var4 == -6) {
                class123 var9 = class15.field300[var5];
                if (var9 != null) {
                    class216.field3650 = class32.field526;
                    class5.field132 = class298.field4870;
                    class81.field1352 = 0;
                    class268.field4455 = 2;
                    ++class226.field3828;
                    class236.field3980.method640((byte) 97, 175);
                    class236.field3980.method1813(-1694, !class157.field2581[82] ? 0 : 1);
                    class236.field3980.method1771(var5, (byte) 30);
                    class190.method1373(0, var9.method294((byte) -115), var9.method294((byte) -103), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (var4 == 59) {
                class268.field4455 = 2;
                class5.field132 = class298.field4870;
                ++class133.field2200;
                class81.field1352 = 0;
                class216.field3650 = class32.field526;
                class236.field3980.method640((byte) 97, 174);
                class236.field3980.method1817(125, class170.field2751);
                class236.field3980.method1790(class100.field1591, -125);
                class236.field3980.method1771(class78.field1313 + var3, (byte) 30);
                class236.field3980.method1790(class26.field462 + var2, arg0 ^ 2147483620);
                class236.field3980.method1771(var5, (byte) 30);
                class236.field3980.method1780(class157.field2581[82] ? 1 : 0, 73);
                class236.field3980.method1822(class10.field189, arg0 ^ 1592901367);
                class190.method1373(0, 0, 0, true, arg0 + -2147457443, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
            }
            if (~var4 == -33) {
                ++class130.field2159;
                class236.field3980.method640((byte) 97, 33);
                class236.field3980.method1771(var2, (byte) 30);
                class236.field3980.method1790(var5, 126);
                class236.field3980.method1798(var3, -118);
                class134.field2211 = 0;
                class104.field1692 = class222.method1574(110, var3);
                class273.field4576 = var2;
            }
            if (~var4 == -8) {
                class307 var10 = class57.field1002[var5];
                if (var10 != null) {
                    class216.field3650 = class32.field526;
                    ++class245.field4113;
                    class268.field4455 = 2;
                    class5.field132 = class298.field4870;
                    class81.field1352 = 0;
                    class236.field3980.method640((byte) 97, 84);
                    class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, arg0 + Integer.MIN_VALUE);
                    class236.field3980.method1822(var5, 554582280);
                    class190.method1373(0, var10.method294((byte) -111), var10.method294((byte) -128), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (~var4 == -23) {
                class307 var11 = class57.field1002[var5];
                if (var11 != null) {
                    class268.field4455 = 2;
                    class216.field3650 = class32.field526;
                    ++class96.field1553;
                    class5.field132 = class298.field4870;
                    class81.field1352 = 0;
                    class236.field3980.method640((byte) 97, 239);
                    class236.field3980.method1817(115, class170.field2751);
                    class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
                    class236.field3980.method1778(class100.field1591, -13989);
                    class236.field3980.method1790(class10.field189, 19);
                    class236.field3980.method1771(var5, (byte) 30);
                    class190.method1373(0, var11.method294((byte) -121), var11.method294((byte) -110), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (~var4 == -1007) {
                class268.field4455 = 2;
                class81.field1352 = 0;
                class5.field132 = class298.field4870;
                class216.field3650 = class32.field526;
                class236.field3980.method640((byte) 97, 211);
                ++class121.field2023;
                class236.field3980.method1790(var5, arg0 + -2147483577);
            }
            if (~var4 == -3) {
                ++class160.field2612;
                class236.field3980.method640((byte) 97, 108);
                class236.field3980.method1817(118, var3);
                class236.field3980.method1790(var2, arg0 + -2147483645);
                class236.field3980.method1790(var5, 107);
                class134.field2211 = 0;
                class104.field1692 = class222.method1574(104, var3);
                class273.field4576 = var2;
            }
            if (~var4 == -49) {
                if (~var5 == -1) {
                    class175.method1292(class182.field2898, var2, var3);
                } else if (var5 == 1) {
                    if (class233.field3942 > 0 && class157.field2581[82] && class157.field2581[81]) {
                        class306.method2073(class182.field2898, class26.field462 + var2, (byte) 9, class78.field1313 + var3);
                    } else {
                        class303.method2061(var3, var2, 1, arg0 + 2147483524);
                        class236.field3980.method1780(class79.field1327, 77);
                        class236.field3980.method1780(class119.field2003, 68);
                        class236.field3980.method1771((int) class265.field4432, (byte) 30);
                        class236.field3980.method1780(57, 117);
                        if (class169.field2739 != 4) {
                            class236.field3980.method1780(class314.field5060, arg0 ^ 2147483595);
                            class236.field3980.method1780(class286.field4738, 104);
                        } else {
                            class236.field3980.method1780(0, 52);
                            class236.field3980.method1780(0, 71);
                        }
                        class236.field3980.method1780(89, 85);
                        class236.field3980.method1771(class16.field314.field715, (byte) 30);
                        class236.field3980.method1771(class16.field314.field771, (byte) 30);
                        class236.field3980.method1780(class116.field1970, 68);
                        class236.field3980.method1780(63, 62);
                        class190.method1373(0, 0, 0, true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                }
            }
            if (var4 == 17) {
                class123 var12 = class15.field300[var5];
                if (var12 != null) {
                    class268.field4455 = 2;
                    class81.field1352 = 0;
                    ++class314.field5070;
                    class216.field3650 = class32.field526;
                    class5.field132 = class298.field4870;
                    class236.field3980.method640((byte) 97, 140);
                    class236.field3980.method1778(var5, -13989);
                    class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, arg0 + Integer.MIN_VALUE);
                    class190.method1373(0, var12.method294((byte) -112), var12.method294((byte) -106), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (var4 == 58) {
                class209.method1470((byte) -127);
            }
            if (var4 == 6) {
                class307 var13 = class57.field1002[var5];
                if (var13 != null) {
                    class81.field1352 = 0;
                    class5.field132 = class298.field4870;
                    class268.field4455 = 2;
                    ++class126.field2104;
                    class216.field3650 = class32.field526;
                    class236.field3980.method640((byte) 97, 231);
                    class236.field3980.method1780(class157.field2581[82] ? 1 : 0, 119);
                    class236.field3980.method1778(var5, arg0 ^ -2147469660);
                    class190.method1373(0, var13.method294((byte) -109), var13.method294((byte) -118), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (var4 == 20) {
                ++class184.field2940;
                class236.field3980.method640((byte) 97, 252);
                class236.field3980.method1785((byte) -109, class173.field2785);
                class236.field3980.method1817(100, var3);
                class236.field3980.method1822(var2, arg0 ^ 1592901367);
                class236.field3980.method1822(class42.field646, 554582280);
            }
            if (var4 == 33) {
                class123 var14 = class15.field300[var5];
                if (var14 != null) {
                    class81.field1352 = 0;
                    class5.field132 = class298.field4870;
                    ++class232.field3927;
                    class216.field3650 = class32.field526;
                    class268.field4455 = 2;
                    class236.field3980.method640((byte) 97, 32);
                    class236.field3980.method1790(var5, arg0 ^ 2147483644);
                    class236.field3980.method1782(class157.field2581[82] ? 1 : 0, arg0 + Integer.MIN_VALUE);
                    class190.method1373(0, var14.method294((byte) -113), var14.method294((byte) -112), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
            }
            if (arg0 == Integer.MAX_VALUE) {
                if (var4 == 39) {
                    class307 var15 = class57.field1002[var5];
                    if (var15 != null) {
                        ++class217.field3663;
                        class81.field1352 = 0;
                        class268.field4455 = 2;
                        class5.field132 = class298.field4870;
                        class216.field3650 = class32.field526;
                        class236.field3980.method640((byte) 97, 136);
                        class236.field3980.method1778(var5, arg0 ^ -2147469660);
                        class236.field3980.method1801(-124, !class157.field2581[82] ? 0 : 1);
                        class190.method1373(0, var15.method294((byte) -123), var15.method294((byte) -113), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                }
                if (var4 == 12) {
                    class216.field3650 = class32.field526;
                    ++class37.field589;
                    class5.field132 = class298.field4870;
                    class268.field4455 = 2;
                    class81.field1352 = 0;
                    class236.field3980.method640((byte) 97, 152);
                    class236.field3980.method1822(class26.field462 + var2, 554582280);
                    class236.field3980.method1778(var3 - -class78.field1313, -13989);
                    class236.field3980.method1782(class157.field2581[82] ? 1 : 0, -1);
                    class236.field3980.method1771((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 30);
                    class79.method554(false, var6, var3, var2);
                }
                if (~var4 == -1011) {
                    class207 var16 = class222.method1574(120, var3);
                    if (var16 != null && var16.field3354[var2] >= 100000) {
                        class42.method248((byte) -100, var16.field3354[var2] + " x " + class13.method75(false, var5).field1209);
                    } else {
                        class236.field3980.method640((byte) 97, 104);
                        class236.field3980.method1790(var5, -117);
                        ++class23.field422;
                    }
                    class134.field2211 = 0;
                    class104.field1692 = class222.method1574(108, var3);
                    class273.field4576 = var2;
                }
                if (var4 == 40) {
                    ++class123.field2066;
                    class236.field3980.method640((byte) 97, 131);
                    class236.field3980.method1811(var3, (byte) 51);
                    class207 var17 = class222.method1574(109, var3);
                    if (var17.field3493 != null && var17.field3493[0][0] == 5) {
                        int var18 = var17.field3493[0][1];
                        class12.field230[var18] = -class12.field230[var18] + 1;
                        class279.method1950(var18, false);
                    }
                }
                if (var4 == 45) {
                    ++class78.field1318;
                    class268.field4455 = 2;
                    class5.field132 = class298.field4870;
                    class81.field1352 = 0;
                    class216.field3650 = class32.field526;
                    class236.field3980.method640((byte) 97, 117);
                    class236.field3980.method1798(class170.field2751, 13);
                    class236.field3980.method1790(class100.field1591, -124);
                    class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, -1);
                    class236.field3980.method1790(var2 - -class26.field462, 97);
                    class236.field3980.method1771(class10.field189, (byte) 30);
                    class236.field3980.method1771(var3 - -class78.field1313, (byte) 30);
                    class236.field3980.method1790(Integer.MAX_VALUE & (int) (var6 >>> 32), -128);
                    class79.method554(false, var6, var3, var2);
                }
                if (var4 == 57) {
                    class5.field132 = class298.field4870;
                    ++class54.field912;
                    class268.field4455 = 2;
                    class81.field1352 = 0;
                    class216.field3650 = class32.field526;
                    class236.field3980.method640((byte) 97, 221);
                    class236.field3980.method1778(class78.field1313 + var3, -13989);
                    class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
                    class236.field3980.method1822(var2 - -class26.field462, 554582280);
                    class236.field3980.method1822(var5, 554582280);
                    class190.method1373(0, 0, 0, true, arg0 ^ 2147457443, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                }
                if (var4 == 23) {
                    class123 var19 = class15.field300[var5];
                    if (var19 != null) {
                        ++class269.field4466;
                        class268.field4455 = 2;
                        class81.field1352 = 0;
                        class216.field3650 = class32.field526;
                        class5.field132 = class298.field4870;
                        class236.field3980.method640((byte) 97, 207);
                        class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, arg0 + Integer.MIN_VALUE);
                        class236.field3980.method1778(var5, -13989);
                        class190.method1373(0, var19.method294((byte) -108), var19.method294((byte) -120), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                }
                if (var4 == 42) {
                    class207 var20 = class107.method798(var3, var2, (byte) -71);
                    if (var20 != null) {
                        class118.method895(98);
                        class20 var21 = client.method732(var20);
                        class161.method1196(var20.field3447, var2, var21.method126((byte) -128), var20.field3458, arg0 ^ 2, var21.field360, var3);
                        class272.field4554 = 0;
                        class238.field4011 = class264.method1867(var20, 3998);
                        if (class238.field4011 == null) {
                            class238.field4011 = "Null";
                        }
                        if (var20.field3446) {
                            class93.field1517 = var20.field3399 + "<col=ffffff>";
                            return;
                        }
                        class93.field1517 = "<col=00ff00>" + var20.field3430 + "<col=ffffff>";
                    }
                } else if (var4 == 60) {
                    class118.method895(96);
                    class207 var22 = class222.method1574(arg0 ^ 2147483536, var3);
                    class10.field189 = var2;
                    class272.field4554 = 1;
                    class170.field2751 = var3;
                    class100.field1591 = var5;
                    class206.method1441(arg0 + -2147483647, var22);
                    class46.field813 = "<col=ff9040>" + class13.method75(false, var5).field1209 + "<col=ffffff>";
                    if (class46.field813 == null) {
                        class46.field813 = "null";
                    }
                } else {
                    if (~var4 == -15) {
                        if (var5 == 0) {
                            class217.field3672 = 1;
                            class175.method1292(class182.field2898, var2, var3);
                        } else if (~var5 == -2) {
                            class236.field3980.method640((byte) 97, 7);
                            ++class182.field2903;
                            class236.field3980.method1771(class26.field462 - -var2, (byte) 30);
                            class236.field3980.method1798(class173.field2785, 34);
                            class236.field3980.method1822(class78.field1313 - -var3, 554582280);
                            class236.field3980.method1822(class42.field646, 554582280);
                        }
                    }
                    if (~var4 == -4) {
                        class123 var23 = class15.field300[var5];
                        if (var23 != null) {
                            class5.field132 = class298.field4870;
                            class268.field4455 = 2;
                            class216.field3650 = class32.field526;
                            class81.field1352 = 0;
                            ++class205.field3306;
                            class236.field3980.method640((byte) 97, 156);
                            class236.field3980.method1798(class170.field2751, -95);
                            class236.field3980.method1778(var5, -13989);
                            class236.field3980.method1778(class100.field1591, arg0 + 2147469660);
                            class236.field3980.method1778(class10.field189, arg0 ^ -2147469660);
                            class236.field3980.method1782(class157.field2581[82] ? 1 : 0, -1);
                            class190.method1373(0, var23.method294((byte) -105), var23.method294((byte) -107), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (var4 == 43 && class6.field133 == null) {
                        class222.method1577(var3, var2, (byte) -128);
                        class6.field133 = class107.method798(var3, var2, (byte) -71);
                        class206.method1441(0, class6.field133);
                    }
                    if (var4 == 18) {
                        if (var5 != 0) {
                            if (~class233.field3942 < -1 && class157.field2581[82] && class157.field2581[81]) {
                                class306.method2073(class182.field2898, class26.field462 + var2, (byte) 9, class78.field1313 + var3);
                            } else {
                                ++class67.field1127;
                                class236.field3980.method640((byte) 97, 47);
                                class236.field3980.method1822(class26.field462 + var2, 554582280);
                                class236.field3980.method1790(class78.field1313 + var3, arg0 + 2147483521);
                            }
                        } else {
                            class121.field2028 = 1;
                            class175.method1292(class182.field2898, var2, var3);
                        }
                    }
                    if (var4 == 1002 || ~var4 == -1008 || var4 == 1012 || ~var4 == -1012 || ~var4 == -1005) {
                        class307.method2077(var2, var5, var4, 98);
                    }
                    if (var4 == 31) {
                        class236.field3980.method640((byte) 97, 75);
                        ++class238.field4014;
                        class236.field3980.method1822(var5, 554582280);
                        class236.field3980.method1778(var2, -13989);
                        class236.field3980.method1811(var3, (byte) 51);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(112, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -9) {
                        ++class145.field2387;
                        class216.field3650 = class32.field526;
                        class81.field1352 = 0;
                        class268.field4455 = 2;
                        class5.field132 = class298.field4870;
                        class236.field3980.method640((byte) 97, 150);
                        class236.field3980.method1778(class26.field462 + var2, arg0 + 2147469660);
                        class236.field3980.method1801(-127, class157.field2581[82] ? 1 : 0);
                        class236.field3980.method1790(var5, -125);
                        class236.field3980.method1790(class78.field1313 + var3, arg0 + 2147483527);
                        class190.method1373(0, 0, 0, true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                    if (~var4 == -31) {
                        class307 var24 = class57.field1002[var5];
                        if (var24 != null) {
                            class5.field132 = class298.field4870;
                            ++class241.field4070;
                            class81.field1352 = 0;
                            class268.field4455 = 2;
                            class216.field3650 = class32.field526;
                            class236.field3980.method640((byte) 97, 63);
                            class236.field3980.method1790(var5, -127);
                            class236.field3980.method1813(arg0 + 2147481955, class157.field2581[82] ? 1 : 0);
                            class190.method1373(0, var24.method294((byte) -115), var24.method294((byte) -127), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (~var4 == -1010) {
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        class5.field132 = class298.field4870;
                        ++field2040;
                        class81.field1352 = 0;
                        class236.field3980.method640((byte) 97, 103);
                        class236.field3980.method1771(class78.field1313 + var3, (byte) 30);
                        class236.field3980.method1778(class26.field462 + var2, -13989);
                        class236.field3980.method1822((int) (var6 >>> 32) & Integer.MAX_VALUE, 554582280);
                        class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
                        class79.method554(false, var6, var3, var2);
                    }
                    if (var4 == 15) {
                        class236.field3980.method640((byte) 97, 73);
                        ++class22.field403;
                        class236.field3980.method1822(var2, 554582280);
                        class236.field3980.method1811(var3, (byte) 51);
                        class236.field3980.method1771(var5, (byte) 30);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(110, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -47) {
                        class236.field3980.method640((byte) 97, 124);
                        class236.field3980.method1771(var2, (byte) 30);
                        class236.field3980.method1822(var5, 554582280);
                        ++class32.field522;
                        class236.field3980.method1798(var3, arg0 ^ 2147483633);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(arg0 ^ 2147483520, var3);
                        class273.field4576 = var2;
                    }
                    if (var4 == 24) {
                        ++class267.field4446;
                        class236.field3980.method640((byte) 97, 82);
                        class236.field3980.method1778(var5, -13989);
                        class236.field3980.method1817(126, var3);
                        class236.field3980.method1790(var2, -126);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(112, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -36) {
                        class236.field3980.method640((byte) 97, 131);
                        class236.field3980.method1811(var3, (byte) 51);
                        ++class123.field2066;
                        class207 var25 = class222.method1574(arg0 ^ 2147483533, var3);
                        if (var25.field3493 != null && ~var25.field3493[0][0] == -6) {
                            int var26 = var25.field3493[0][1];
                            if (class12.field230[var26] != var25.field3377[0]) {
                                class12.field230[var26] = var25.field3377[0];
                                class279.method1950(var26, false);
                            }
                        }
                    }
                    if (~var4 == -51) {
                        class207 var27 = class222.method1574(121, var3);
                        boolean var28 = true;
                        if (var27.field3495 > 0) {
                            var28 = class283.method1969(205, var27);
                        }
                        if (var28) {
                            ++class123.field2066;
                            class236.field3980.method640((byte) 97, 131);
                            class236.field3980.method1811(var3, (byte) 51);
                        }
                    }
                    if (var4 == 26) {
                        class123 var29 = class15.field300[var5];
                        if (var29 != null) {
                            class81.field1352 = 0;
                            class268.field4455 = 2;
                            ++class72.field1253;
                            class5.field132 = class298.field4870;
                            class216.field3650 = class32.field526;
                            class236.field3980.method640((byte) 97, 68);
                            class236.field3980.method1778(var5, -13989);
                            class236.field3980.method1780(!class157.field2581[82] ? 0 : 1, 76);
                            class190.method1373(0, var29.method294((byte) -121), var29.method294((byte) -110), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (var4 == 1008) {
                        class216.field3650 = class32.field526;
                        class5.field132 = class298.field4870;
                        class81.field1352 = 0;
                        class268.field4455 = 2;
                        class307 var30 = class57.field1002[var5];
                        if (var30 != null) {
                            class54 var31 = var30.field4960;
                            if (var31.field904 != null) {
                                var31 = var31.method343(-1);
                            }
                            if (var31 != null) {
                                class236.field3980.method640((byte) 97, 198);
                                ++class286.field4736;
                                class236.field3980.method1822(var31.field923, 554582280);
                            }
                        }
                    }
                    if (~var4 == -39) {
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        ++class256.field4321;
                        class5.field132 = class298.field4870;
                        class81.field1352 = 0;
                        class236.field3980.method640((byte) 97, 162);
                        class236.field3980.method1778(Integer.MAX_VALUE & (int) (var6 >>> 32), -13989);
                        class236.field3980.method1780(class157.field2581[82] ? 1 : 0, 63);
                        class236.field3980.method1822(var2 - -class26.field462, 554582280);
                        class236.field3980.method1822(class78.field1313 + var3, 554582280);
                        class79.method554(false, var6, var3, var2);
                    }
                    if (var4 == 13) {
                        class123 var32 = class15.field300[var5];
                        if (var32 != null) {
                            class81.field1352 = 0;
                            class216.field3650 = class32.field526;
                            class5.field132 = class298.field4870;
                            ++class127.field2114;
                            class268.field4455 = 2;
                            class236.field3980.method640((byte) 97, 169);
                            class236.field3980.method1790(class42.field646, arg0 + -2147483568);
                            class236.field3980.method1811(class173.field2785, (byte) 51);
                            class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
                            class236.field3980.method1771(var5, (byte) 30);
                            class190.method1373(0, var32.method294((byte) -119), var32.method294((byte) -126), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (var4 == 1005) {
                        class81.field1352 = 0;
                        class268.field4455 = 2;
                        ++class23.field422;
                        class5.field132 = class298.field4870;
                        class216.field3650 = class32.field526;
                        class236.field3980.method640((byte) 97, 104);
                        class236.field3980.method1790(var5, -119);
                    }
                    if (var4 == 47) {
                        class5.field132 = class298.field4870;
                        class216.field3650 = class32.field526;
                        ++class162.field2634;
                        class268.field4455 = 2;
                        class81.field1352 = 0;
                        class236.field3980.method640((byte) 97, 183);
                        class236.field3980.method1780(!class157.field2581[82] ? 0 : 1, 50);
                        class236.field3980.method1790(class26.field462 + var2, -126);
                        class236.field3980.method1778(var5, arg0 ^ -2147469660);
                        class236.field3980.method1790(class78.field1313 + var3, -121);
                        class190.method1373(0, 0, 0, true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                    if (~var4 == -26 || var4 == 1003) {
                        class4.method36(var5, var3, class184.field2932[arg1], var2, 9);
                    }
                    if (~var4 == -17) {
                        ++class3.field108;
                        class216.field3650 = class32.field526;
                        class81.field1352 = 0;
                        class5.field132 = class298.field4870;
                        class268.field4455 = 2;
                        class236.field3980.method640((byte) 97, 154);
                        class236.field3980.method1822(var5, 554582280);
                        class236.field3980.method1785((byte) -128, class173.field2785);
                        class236.field3980.method1822(class42.field646, 554582280);
                        class236.field3980.method1822(var2 - -class26.field462, 554582280);
                        class236.field3980.method1778(class78.field1313 + var3, arg0 ^ -2147469660);
                        class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
                        class190.method1373(0, 0, 0, true, arg0 ^ 2147457443, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                    if (var4 == 1) {
                        ++class161.field2622;
                        class236.field3980.method640((byte) 97, 144);
                        class236.field3980.method1785((byte) -101, var3);
                        class236.field3980.method1778(class42.field646, arg0 ^ -2147469660);
                        class236.field3980.method1790(var2, -121);
                        class236.field3980.method1785((byte) -50, class173.field2785);
                        class236.field3980.method1771(var5, (byte) 30);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(125, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -35) {
                        class81.field1352 = 0;
                        class5.field132 = class298.field4870;
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        ++class280.field4650;
                        class236.field3980.method640((byte) 97, 218);
                        class236.field3980.method1771(class26.field462 + var2, (byte) 30);
                        class236.field3980.method1801(29, class157.field2581[82] ? 1 : 0);
                        class236.field3980.method1771(class78.field1313 + var3, (byte) 30);
                        class236.field3980.method1778((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 2147469660);
                        class79.method554(false, var6, var3, var2);
                    }
                    if (var4 == 19) {
                        class236.field3980.method640((byte) 97, 201);
                        ++class158.field2582;
                        class236.field3980.method1817(125, var3);
                        class236.field3980.method1771(var2, (byte) 30);
                        class236.field3980.method1790(var5, arg0 ^ -2147483526);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(106, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -29) {
                        class236.field3980.method640((byte) 97, 4);
                        class236.field3980.method1811(class170.field2751, (byte) 51);
                        class236.field3980.method1811(var3, (byte) 51);
                        class236.field3980.method1771(var2, (byte) 30);
                        class236.field3980.method1778(class100.field1591, -13989);
                        class236.field3980.method1771(class10.field189, (byte) 30);
                        class236.field3980.method1822(var5, 554582280);
                        ++class1.field3;
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(127, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -42) {
                        ++class214.field3613;
                        class236.field3980.method640((byte) 97, 89);
                        class236.field3980.method1771(var2, (byte) 30);
                        class236.field3980.method1785((byte) -125, var3);
                        class236.field3980.method1778(var5, arg0 + 2147469660);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(107, var3);
                        class273.field4576 = var2;
                    }
                    if (var4 == 51) {
                        ++class185.field2960;
                        class236.field3980.method640((byte) 97, 181);
                        class236.field3980.method1771(var5, (byte) 30);
                        class236.field3980.method1778(var2, -13989);
                        class236.field3980.method1817(arg0 ^ 2147483534, var3);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(110, var3);
                        class273.field4576 = var2;
                    }
                    if (~var4 == -22) {
                        class81.field1352 = 0;
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        ++class244.field4086;
                        class5.field132 = class298.field4870;
                        class236.field3980.method640((byte) 97, 187);
                        class236.field3980.method1778(class26.field462 + var2, -13989);
                        class236.field3980.method1801(arg0 + -2147483618, class157.field2581[82] ? 1 : 0);
                        class236.field3980.method1822(var5, 554582280);
                        class236.field3980.method1778(class78.field1313 + var3, -13989);
                        class190.method1373(0, 0, 0, true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                    if (var4 == 36) {
                        ++class34.field548;
                        class5.field132 = class298.field4870;
                        class81.field1352 = 0;
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        class236.field3980.method640((byte) 97, 46);
                        class236.field3980.method1822(var5, arg0 ^ 1592901367);
                        class236.field3980.method1771(var2 - -class26.field462, (byte) 30);
                        class236.field3980.method1782(!class157.field2581[82] ? 0 : 1, arg0 + Integer.MIN_VALUE);
                        class236.field3980.method1822(var3 - -class78.field1313, 554582280);
                        class190.method1373(0, 0, 0, true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                    }
                    if (var4 == 37) {
                        ++class274.field4583;
                        class236.field3980.method640((byte) 97, 182);
                        class236.field3980.method1778(var2, -13989);
                        class236.field3980.method1822(var5, arg0 + -1592901367);
                        class236.field3980.method1798(var3, -128);
                        class134.field2211 = 0;
                        class104.field1692 = class222.method1574(arg0 ^ 2147483541, var3);
                        class273.field4576 = var2;
                    }
                    if (var4 == 10) {
                        class5.field132 = class298.field4870;
                        ++class171.field2774;
                        class81.field1352 = 0;
                        class216.field3650 = class32.field526;
                        class268.field4455 = 2;
                        class236.field3980.method640((byte) 97, 148);
                        class236.field3980.method1771((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 30);
                        class236.field3980.method1813(arg0 + 2147481955, class157.field2581[82] ? 1 : 0);
                        class236.field3980.method1771(class78.field1313 + var3, (byte) 30);
                        class236.field3980.method1822(var2 - -class26.field462, 554582280);
                        class79.method554(false, var6, var3, var2);
                    }
                    if (~var4 == -30) {
                        class123 var33 = class15.field300[var5];
                        if (var33 != null) {
                            ++class144.field2362;
                            class268.field4455 = 2;
                            class5.field132 = class298.field4870;
                            class81.field1352 = 0;
                            class216.field3650 = class32.field526;
                            class236.field3980.method640((byte) 97, 115);
                            class236.field3980.method1782(class157.field2581[82] ? 1 : 0, arg0 + Integer.MIN_VALUE);
                            class236.field3980.method1790(var5, arg0 + -2147483540);
                            class190.method1373(0, var33.method294((byte) -118), var33.method294((byte) -112), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (~var4 == -12) {
                        class307 var34 = class57.field1002[var5];
                        if (var34 != null) {
                            class268.field4455 = 2;
                            class216.field3650 = class32.field526;
                            class5.field132 = class298.field4870;
                            class81.field1352 = 0;
                            ++class115.field1946;
                            class236.field3980.method640((byte) 97, 232);
                            class236.field3980.method1801(-128, !class157.field2581[82] ? 0 : 1);
                            class236.field3980.method1822(var5, 554582280);
                            class190.method1373(0, var34.method294((byte) -127), var34.method294((byte) -128), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (var4 == 49) {
                        class123 var35 = class15.field300[var5];
                        if (var35 != null) {
                            ++class76.field1295;
                            class81.field1352 = 0;
                            class216.field3650 = class32.field526;
                            class5.field132 = class298.field4870;
                            class268.field4455 = 2;
                            class236.field3980.method640((byte) 97, 229);
                            class236.field3980.method1822(var5, 554582280);
                            class236.field3980.method1780(class157.field2581[82] ? 1 : 0, 95);
                            class190.method1373(0, var35.method294((byte) -104), var35.method294((byte) -114), true, arg0 + -2147457443, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (var4 == 44) {
                        class307 var36 = class57.field1002[var5];
                        if (var36 != null) {
                            ++class248.field4137;
                            class268.field4455 = 2;
                            class216.field3650 = class32.field526;
                            class81.field1352 = 0;
                            class5.field132 = class298.field4870;
                            class236.field3980.method640((byte) 97, 123);
                            class236.field3980.method1801(-127, !class157.field2581[82] ? 0 : 1);
                            class236.field3980.method1771(var5, (byte) 30);
                            class236.field3980.method1822(class42.field646, 554582280);
                            class236.field3980.method1785((byte) -89, class173.field2785);
                            class190.method1373(0, var36.method294((byte) -117), var36.method294((byte) -110), true, 26204, var3, var2, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                        }
                    }
                    if (~class272.field4554 != -1) {
                        class272.field4554 = 0;
                        class206.method1441(0, class222.method1574(116, class170.field2751));
                    }
                    if (class302.field4918) {
                        class118.method895(arg0 + -2147483611);
                    }
                    if (class104.field1692 != null && class134.field2211 == 0) {
                        class206.method1441(0, class104.field1692);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIZ)V")
    public static final void method916(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class21.field379 = arg1;
        class28.field479 = arg2;
        class6.field139 = arg3;
        class215.field3637 = new class174[arg0][class21.field379][class28.field479];
        class207.field3401 = new int[arg0][class21.field379 + 1][class28.field479 + 1];
        if (arg4) {
            class184.field2943 = new class174[1][class21.field379][class28.field479];
            class86.field1429 = new int[class21.field379][class28.field479];
            class183.field2929 = new int[1][class21.field379 + 1][class28.field479 + 1];
        } else {
            class184.field2943 = null;
            class86.field1429 = null;
            class183.field2929 = null;
        }
        class65.method446(false);
        class241.field4063 = new class41[500];
        class216.field3653 = 0;
        class107.field1752 = new class41[500];
        class287.field4745 = 0;
        class313.field5031 = new int[arg0][class21.field379 + 1][class28.field479 + 1];
        class140.field2310 = new class73[5000];
        class118.field1990 = 0;
        class125.field2103 = new class73[100];
        class36.field584 = new boolean[class6.field139 + class6.field139 + 1][class6.field139 + class6.field139 + 1];
        class108.field1781 = new boolean[class6.field139 + class6.field139 + 2][class6.field139 + class6.field139 + 2];
        class12.field255 = new byte[arg0][class21.field379][class28.field479];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; arg5 >= var6; ++var6) {
            class134.method996(0, arg1, arg0, arg2, class41.field630[var6]);
        }
        ++field2036;
        if (arg4 != -19325) {
            field2044 = -38;
        }
    }
}
