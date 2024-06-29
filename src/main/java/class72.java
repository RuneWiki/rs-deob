import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 extends class50 {

    @OriginalMember(owner = "client!m", name = "Kc", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!m", name = "Hc", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!m", name = "Ic", descriptor = "Llc;")
    public static class69 field1598 = class69.method470((byte) -118, "glow2:");

    @OriginalMember(owner = "client!m", name = "Nc", descriptor = "[I")
    public static int[] field1603 = new int[100];

    @OriginalMember(owner = "client!m", name = "Jc", descriptor = "I")
    public static int field1599 = 1;

    @OriginalMember(owner = "client!m", name = "Sc", descriptor = "Llc;")
    public static class69 field1608 = class69.method470((byte) -123, ":duelreq:");

    @OriginalMember(owner = "client!m", name = "Pc", descriptor = "[Lda;")
    public static class20[] field1605 = new class20[1000];

    @OriginalMember(owner = "client!m", name = "Mc", descriptor = "Z")
    public static boolean field1602 = false;

    @OriginalMember(owner = "client!m", name = "cd", descriptor = "Llc;")
    public static class69 field1618 = class69.method470((byte) -119, "headicons_pk");

    @OriginalMember(owner = "client!m", name = "bd", descriptor = "[I")
    public static int[] field1617 = new int[50];

    @OriginalMember(owner = "client!m", name = "Zc", descriptor = "Llc;")
    public static class69 field1615 = class69.method470((byte) -106, "Walk here @whi@");

    @OriginalMember(owner = "client!m", name = "Oc", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!m", name = "Rc", descriptor = "Llc;")
    public static class69 field1607 = class69.method470((byte) -97, ")3)3)3");

    @OriginalMember(owner = "client!m", name = "Lc", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!m", name = "Qc", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!m", name = "Uc", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!m", name = "Vc", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!m", name = "Wc", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!m", name = "Xc", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!m", name = "Yc", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!m", name = "dd", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!m", name = "ed", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!m", name = "fd", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!m", name = "gd", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!m", name = "Tc", descriptor = "J")
    public static long field1609;

    @OriginalMember(owner = "client!m", name = "ad", descriptor = "Llb;")
    public class68 field1616;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(Z)Z")
    public final boolean method327(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1622;
            return this.field1616 != null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BIIIZ)V")
    public static final void method508(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != -1202723376) {
            method510(25, -14);
        }
        ++field1611;
        if (~class98.field2158 <= -1) {
            arg1 -= 20;
            if (arg1 < 1) {
                arg1 = 1;
            }
            class70.field1565 = arg1;
            if (class98.field2158 == 0) {
                class102.field2218 = 0;
            } else {
                int var5 = class121.method890(class98.field2158, (byte) 35);
                int var6 = var5 - class3.field61;
                class102.field2218 = (var6 - 1 + 3600 + class102.field2218) / class102.field2218;
            }
            class56.field1178 = arg3;
            class98.field2141 = arg0;
            class125.field2701 = arg4;
        } else if (class70.field1565 == 0) {
            class40.method241(arg4, arg0, 12416, arg3);
        } else {
            class98.field2141 = arg0;
            class125.field2701 = arg4;
            class56.field1178 = arg3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpd;ZLqd;I)V")
    public static final void method509(class94 arg0, boolean arg1, class99 arg2, int arg3) {
        ++field1606;
        if (!class123.field2672) {
            class40 var4 = new class40();
            var4.field777 = arg0.method703((byte) -74);
            if (!arg1) {
                method513(-8);
            }
            var4.field783 = arg0.method667(5811);
            var4.field784 = new int[var4.field777];
            var4.field796 = new class116[var4.field777];
            var4.field795 = new int[var4.field777];
            var4.field778 = new int[var4.field777];
            var4.field785 = new byte[var4.field777][][];
            var4.field788 = new class116[var4.field777];
            for (int var5 = 0; var4.field777 > var5; ++var5) {
                try {
                    int var6 = arg0.method703((byte) 106);
                    if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                        if (var6 == 3 || var6 == 4) {
                            String var10 = new String(arg0.method708(-23522).method481((byte) -95));
                            String var11 = new String(arg0.method708(-23522).method481((byte) -95));
                            int var12 = arg0.method703((byte) 73);
                            String[] var13 = new String[var12];
                            for (int var14 = 0; var14 < var12; ++var14) {
                                var13[var14] = new String(arg0.method708(-23522).method481((byte) -95));
                            }
                            byte[][] var15 = new byte[var12][];
                            if (~var6 == -4) {
                                for (int var16 = 0; var12 > var16; ++var16) {
                                    int var17 = arg0.method667(5811);
                                    var15[var16] = new byte[var17];
                                    arg0.method673((byte) -127, var15[var16], 0, var17);
                                }
                            }
                            var4.field778[var5] = var6;
                            Class[] var18 = new Class[var12];
                            for (int var19 = 0; var19 < var12; ++var19) {
                                var18[var19] = class122.method900(var13[var19], true);
                            }
                            var4.field796[var5] = arg2.method759(var11, (byte) -118, var18, class122.method900(var10, arg1));
                            var4.field785[var5] = var15;
                        }
                    } else {
                        String var7 = new String(arg0.method708(-23522).method481((byte) -95));
                        String var8 = new String(arg0.method708(-23522).method481((byte) -95));
                        int var9 = 0;
                        if (~var6 == -2) {
                            var9 = arg0.method667(5811);
                        }
                        var4.field778[var5] = var6;
                        var4.field795[var5] = var9;
                        var4.field788[var5] = arg2.method752(-3, var8, class122.method900(var7, arg1));
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field784[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field784[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field784[var5] = -3;
                } catch (Exception var23) {
                    var4.field784[var5] = -4;
                } catch (Throwable var24) {
                    var4.field784[var5] = -5;
                }
            }
            class36.field712.method577(var4, -30);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    public static final void method510(int arg0, int arg1) {
        ++field1620;
        if (~arg1 <= -1) {
            int var2 = class77.field1740[arg1];
            int var3 = class68.field1474[arg1];
            int var4 = class77.field1748[arg1];
            int var5 = class76.field1700[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (class62.field1277 != arg0 && ~var5 != -1002) {
                class35.field709 = true;
                class62.field1277 = 0;
            }
            if (~var5 == -42) {
                class72 var6 = class112.field2434[var4];
                if (var6 != null) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var6.field1097[0], 2, var6.field1041[0]);
                    class83.field1871 = class127.field2733;
                    ++class13.field244;
                    class23.field489 = 2;
                    class55.field1170 = class19.field417;
                    class17.field321 = 0;
                    class26.field557.method178(-5, 185);
                    class26.field557.method689(arg0 + -128, var4);
                }
            }
            if (~var5 == -12) {
                class69 var7 = class101.field2197[arg1];
                int var8 = var7.method473(class4.field80, 0);
                if (var8 != -1) {
                    if (~class53.field1144 != 0) {
                        class87.method619(class101.field2202, true, 0, class49.field992);
                    } else {
                        class96.method731(~arg0);
                        if (class71.field1578 != -1) {
                            class49.field1013 = var7.method486(var8 - -5, (byte) -102).method484(false);
                            class119.field2553 = class53.field1144 = class71.field1578;
                            class91.field1974 = false;
                        }
                    }
                }
            }
            if (var5 == 8) {
                class26.field557.method178(-5, 66);
                ++class92.field2012;
                class26.field557.method696(var3, false);
                class26.field557.method706(var2, arg0 + -1091967272);
                class26.field557.method686(arg0 ^ 16711680, var4);
                class26.field557.method704(class74.field1655, (byte) 124);
                class49.field1019 = var3;
                class79.field1792 = var2;
                class93.field2039 = 2;
                if (var2 >> 16 == class53.field1144) {
                    class93.field2039 = 1;
                }
                if (~(var2 >> 16) == ~class60.field1244) {
                    class93.field2039 = 3;
                }
                class115.field2502 = 0;
            }
            if (~var5 == -56) {
                class26.field557.method178(-5, 199);
                ++class63.field1288;
                class26.field557.method686(16711680, var3);
                class26.field557.method704(var2, (byte) 127);
                class26.field557.method686(16711680, var4);
                class49.field1019 = var3;
                class79.field1792 = var2;
                class93.field2039 = 2;
                if (var2 >> 16 == class53.field1144) {
                    class93.field2039 = 1;
                }
                if (var2 >> 16 == class60.field1244) {
                    class93.field2039 = 3;
                }
                class115.field2502 = 0;
            }
            if (var5 == 12) {
                ++class10.field213;
                boolean var9 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                if (!var9) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                }
                class83.field1871 = class127.field2733;
                class17.field321 = 0;
                class55.field1170 = class19.field417;
                class23.field489 = 2;
                class26.field557.method178(-5, 211);
                class26.field557.method696(class35.field703, false);
                class26.field557.method676(arg0 + 34, class92.field2011);
                class26.field557.method676(arg0 + -106, class33.field648 + var3);
                class26.field557.method686(16711680, var2 - -class60.field1234);
                class26.field557.method668(class114.field2467, (byte) 121);
                class26.field557.method686(arg0 ^ 16711680, var4);
            }
            if (~var5 == -21) {
                ++class108.field2345;
                class108.method801(var4, var3, 70, var2);
                class26.field557.method178(-5, 139);
                class26.field557.method676(arg0 + 55, class60.field1234 + var2);
                class26.field557.method689(-128, class33.field648 + var3);
                class26.field557.method696((536867873 & var4) >> 14, false);
            }
            if (var5 == 53) {
                class108.method801(var4, var3, 40, var2);
                class26.field557.method178(arg0 + -5, 165);
                ++field1613;
                class26.field557.method689(-128, class60.field1234 + var2);
                class26.field557.method696(class33.field648 + var3, false);
                class26.field557.method676(arg0 + -57, var4 >> 14 & 32767);
            }
            if (var5 == 56) {
                class49.method323((byte) 6, class46.field968);
                class46.field968 = -1;
                class35.field709 = true;
            }
            if (var5 == 23) {
                boolean var11 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                if (!var11) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                }
                class55.field1170 = class19.field417;
                class83.field1871 = class127.field2733;
                class23.field489 = 2;
                class17.field321 = 0;
                ++class125.field2693;
                class26.field557.method178(arg0 ^ -5, 219);
                class26.field557.method676(70, var3 - -class33.field648);
                class26.field557.method676(74, var4);
                class26.field557.method676(120, class60.field1234 + var2);
            }
            if (~var5 == -32) {
                ++class115.field2493;
                boolean var13 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                if (!var13) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                }
                class17.field321 = 0;
                class23.field489 = 2;
                class83.field1871 = class127.field2733;
                class55.field1170 = class19.field417;
                class26.field557.method178(-5, 131);
                class26.field557.method686(16711680, class60.field1234 + var2);
                class26.field557.method696(var4, false);
                class26.field557.method686(arg0 ^ 16711680, class33.field648 + var3);
            }
            if (var5 == 34) {
                class72 var15 = class112.field2434[var4];
                if (var15 != null) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var15.field1097[0], 2, var15.field1041[0]);
                    class17.field321 = 0;
                    class23.field489 = 2;
                    ++class82.field1846;
                    class83.field1871 = class127.field2733;
                    class55.field1170 = class19.field417;
                    class26.field557.method178(arg0 ^ -5, 101);
                    class26.field557.method704(class74.field1655, (byte) 116);
                    class26.field557.method689(-128, var4);
                }
            }
            if (var5 == 16) {
                if (!class127.field2738) {
                    class120.field2562.method961(class127.field2733 + -4, class19.field417 + -4);
                } else {
                    class120.field2562.method961(var3 + -4, var2 + -4);
                }
            }
            if (~var5 == -2) {
                ++class102.field2216;
                boolean var16 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                if (!var16) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                }
                class83.field1871 = class127.field2733;
                class17.field321 = 0;
                class55.field1170 = class19.field417;
                class23.field489 = 2;
                class26.field557.method178(-5, 156);
                class26.field557.method696(var4, false);
                class26.field557.method686(16711680, class33.field648 + var3);
                class26.field557.method696(var2 - -class60.field1234, false);
            }
            if (var5 == 51) {
                class26.field557.method178(-5, 228);
                ++class83.field1882;
                class26.field557.method680((byte) 101, var2);
                class26.field557.method689(-128, var3);
                class26.field557.method686(16711680, var4);
                class49.field1019 = var3;
                class93.field2039 = 2;
                class115.field2502 = 0;
                if (var2 >> 16 == class53.field1144) {
                    class93.field2039 = 1;
                }
                class79.field1792 = var2;
                if (~(var2 >> 16) == ~class60.field1244) {
                    class93.field2039 = 3;
                }
            }
            if (var5 == 13) {
                class72 var18 = class112.field2434[var4];
                if (var18 != null) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var18.field1097[0], 2, var18.field1041[0]);
                    class55.field1170 = class19.field417;
                    class17.field321 = 0;
                    class23.field489 = 2;
                    class83.field1871 = class127.field2733;
                    ++class112.field2445;
                    class26.field557.method178(-5, 164);
                    class26.field557.method676(-115, var4);
                }
            }
            if (~var5 == -36) {
                ++class98.field2148;
                class26.field557.method178(-5, 184);
                class26.field557.method704(var2, (byte) 123);
                class9 var19 = class9.method56(true, var2);
                if (var19.field138 != null && ~var19.field138[0][0] == -6) {
                    int var20 = var19.field138[0][1];
                    if (~class10.field204[var20] != ~var19.field158[0]) {
                        class10.field204[var20] = var19.field158[0];
                        class11.method66(var20, (byte) -128);
                        class110.field2418 = true;
                    }
                }
            }
            if (var5 == 7 && !class73.field1639) {
                ++class67.field1412;
                class26.field557.method178(-5, 11);
                class73.field1639 = true;
            }
            if (var5 == 54) {
                class69 var21 = class101.field2197[arg1];
                int var22 = var21.method473(class4.field80, arg0);
                if (~var22 != 0) {
                    long var23 = var21.method486(var22 - -5, (byte) -102).method484(false).method465(1);
                    int var25 = -1;
                    for (int var26 = 0; var26 < class43.field852; ++var26) {
                        if (class56.field1186[var26] == var23) {
                            var25 = var26;
                            break;
                        }
                    }
                    if (~var25 != 0 && class51.field1122[var25] > 0) {
                        class49.field1015 = class49.field992;
                        class57.field1194 = 3;
                        class2.field9 = true;
                        class35.field709 = true;
                        class62.field1277 = 0;
                        class51.field1128 = class56.field1186[var25];
                        class49.field1007 = class46.method305(arg0 ^ 20025, new class69[] { class127.field2745, class64.field1356[var25] });
                    }
                }
            }
            if (~var5 == -49) {
                class60 var27 = class123.field2682[var4];
                if (var27 != null) {
                    ++class83.field1868;
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var27.field1097[0], 2, var27.field1041[0]);
                    class55.field1170 = class19.field417;
                    class23.field489 = 2;
                    class17.field321 = 0;
                    class83.field1871 = class127.field2733;
                    class26.field557.method178(arg0 + -5, 36);
                    class26.field557.method689(arg0 ^ -128, var4);
                }
            }
            if (~var5 == -45) {
                class9 var28 = class9.method56(true, var2);
                boolean var29 = true;
                if (~var28.field186 < -1) {
                    var29 = class43.method255(var28, (byte) -123);
                }
                if (var29) {
                    ++class98.field2148;
                    class26.field557.method178(-5, 184);
                    class26.field557.method704(var2, (byte) 123);
                }
            }
            if (var5 == 19) {
                class26.field557.method178(arg0 + -5, 193);
                ++class98.field2162;
                class26.field557.method680((byte) 96, var2);
                class26.field557.method676(-98, var3);
                class26.field557.method696(var4, false);
                class79.field1792 = var2;
                class115.field2502 = 0;
                class49.field1019 = var3;
                class93.field2039 = 2;
                if (~(var2 >> 16) == ~class53.field1144) {
                    class93.field2039 = 1;
                }
                if (~(var2 >> 16) == ~class60.field1244) {
                    class93.field2039 = 3;
                }
            }
            if (var5 == 17) {
                class60 var30 = class123.field2682[var4];
                if (var30 != null) {
                    class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var30.field1097[0], 2, var30.field1041[0]);
                    ++class49.field993;
                    class23.field489 = 2;
                    class83.field1871 = class127.field2733;
                    class55.field1170 = class19.field417;
                    class17.field321 = 0;
                    class26.field557.method178(-5, 190);
                    class26.field557.method689(-128, var4);
                }
            }
            if (var5 == 2 || var5 == 25) {
                class69 var31 = class101.field2197[arg1];
                int var32 = var31.method473(class4.field80, arg0);
                if (var32 != -1) {
                    class69 var33 = var31.method486(var32 + 5, (byte) -102).method484(false);
                    class69 var34 = var33.method476(true).method460(false);
                    boolean var35 = false;
                    for (int var36 = 0; ~class27.field585 < ~var36; ++var36) {
                        class60 var37 = class123.field2682[class92.field2013[var36]];
                        if (var37 != null && var37.field1222 != null && var37.field1222.method474(false, var34)) {
                            var35 = true;
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var37.field1097[0], 2, var37.field1041[0]);
                            if (var5 == 2) {
                                class26.field557.method178(-5, 235);
                                class26.field557.method696(class92.field2013[var36], false);
                                ++class17.field338;
                            }
                            if (var5 == 25) {
                                class26.field557.method178(arg0 + -5, 7);
                                class26.field557.method689(arg0 ^ -128, class92.field2013[var36]);
                                ++class128.field2753;
                            }
                            break;
                        }
                    }
                    if (!var35) {
                        class87.method619(class46.method305(arg0 + 20025, new class69[] { class123.field2673, var34 }), true, 0, class49.field992);
                    }
                }
            }
            if (~var5 == -53) {
                class9 var38 = class9.method56(true, var2);
                class69 var39 = var38.field182;
                class110.field2418 = true;
                class60.field1248 = 1;
                class74.field1655 = var2;
                class76.field1696 = 0;
                class127.field2743 = var38.field127;
                if (var39.method473(class43.field860, arg0) != -1) {
                    var39 = var39.method477(63, var39.method473(class43.field860, 0), 0);
                }
                class69 var40 = var38.field182;
                if (var40.method473(class43.field860, 0) != -1) {
                    var40 = var40.method486(var40.method473(class43.field860, 0) - -1, (byte) -102);
                }
                class101.field2186 = class46.method305(20025, new class69[] { var39, class43.field860, var38.field190, class43.field860, var40 });
                if (class127.field2743 == 16) {
                    class110.field2418 = true;
                    class71.field1596 = true;
                    class40.field792 = 3;
                }
            } else {
                if (~var5 == -27) {
                    class60 var41 = class123.field2682[var4];
                    if (var41 != null) {
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var41.field1097[0], 2, var41.field1041[0]);
                        class17.field321 = 0;
                        class23.field489 = 2;
                        ++class82.field1856;
                        class55.field1170 = class19.field417;
                        class83.field1871 = class127.field2733;
                        class26.field557.method178(-5, 147);
                        class26.field557.method706(class74.field1655, -1091967272);
                        class26.field557.method686(arg0 ^ 16711680, var4);
                    }
                }
                if (var5 == 14) {
                    class26.field557.method178(-5, 184);
                    class26.field557.method704(var2, (byte) 124);
                    ++class98.field2148;
                    class9 var42 = class9.method56(true, var2);
                    if (var42.field138 != null && ~var42.field138[0][0] == -6) {
                        int var43 = var42.field138[0][1];
                        class10.field204[var43] = -class10.field204[var43] + 1;
                        class11.method66(var43, (byte) -100);
                        class110.field2418 = true;
                    }
                }
                if (var5 == 22) {
                    ++class90.field1963;
                    class26.field557.method178(arg0 + -5, 79);
                    class26.field557.method706(var2, -1091967272);
                    class26.field557.method689(arg0 ^ -128, var4);
                    class26.field557.method686(16711680, var3);
                    class115.field2502 = 0;
                    class79.field1792 = var2;
                    class93.field2039 = 2;
                    if (var2 >> 16 == class53.field1144) {
                        class93.field2039 = 1;
                    }
                    class49.field1019 = var3;
                    if (~(var2 >> 16) == ~class60.field1244) {
                        class93.field2039 = 3;
                    }
                }
                if (~var5 == -39 && class108.method801(var4, var3, arg0 ^ 75, var2)) {
                    class26.field557.method178(-5, 44);
                    class26.field557.method689(-128, class92.field2011);
                    class26.field557.method676(101, (var4 & 536861007) >> 14);
                    ++class101.field2192;
                    class26.field557.method686(16711680, class35.field703);
                    class26.field557.method686(16711680, class60.field1234 + var2);
                    class26.field557.method680((byte) 117, class114.field2467);
                    class26.field557.method689(-128, class33.field648 + var3);
                }
                if (~var5 == -10 || ~var5 == -11 || ~var5 == -7 || var5 == 4) {
                    class69 var44 = class101.field2197[arg1];
                    int var45 = var44.method473(class4.field80, arg0);
                    if (var45 != -1) {
                        long var46 = var44.method486(var45 + 5, (byte) -102).method484(false).method465(1);
                        if (var5 == 9) {
                            class75.method531(var46, 0);
                        }
                        if (var5 == 10) {
                            class51.method337(0, var46);
                        }
                        if (var5 == 6) {
                            method514(1, var46);
                        }
                        if (var5 == 4) {
                            class87.method623(0, var46);
                        }
                    }
                }
                if (~var5 == -40) {
                    class60 var48 = class123.field2682[var4];
                    if (var48 != null) {
                        ++class36.field713;
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], arg0 ^ 130, var48.field1097[0], 2, var48.field1041[0]);
                        class55.field1170 = class19.field417;
                        class23.field489 = 2;
                        class83.field1871 = class127.field2733;
                        class17.field321 = 0;
                        class26.field557.method178(arg0 + -5, 214);
                        class26.field557.method689(-128, class92.field2011);
                        class26.field557.method680((byte) 122, class114.field2467);
                        class26.field557.method686(16711680, class35.field703);
                        class26.field557.method676(arg0 ^ -98, var4);
                    }
                }
                if (var5 == 27) {
                    class60 var49 = class123.field2682[var4];
                    if (var49 != null) {
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var49.field1097[0], 2, var49.field1041[0]);
                        class83.field1871 = class127.field2733;
                        class55.field1170 = class19.field417;
                        ++class17.field338;
                        class17.field321 = 0;
                        class23.field489 = 2;
                        class26.field557.method178(arg0 ^ -5, 235);
                        class26.field557.method696(var4, false);
                    }
                }
                if (~var5 == -51) {
                    boolean var50 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                    if (!var50) {
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], arg0 + 130, var2, 2, var3);
                    }
                    class17.field321 = 0;
                    class55.field1170 = class19.field417;
                    ++class94.field2092;
                    class83.field1871 = class127.field2733;
                    class23.field489 = 2;
                    class26.field557.method178(-5, 200);
                    class26.field557.method686(16711680, class60.field1234 + var2);
                    class26.field557.method686(arg0 ^ 16711680, class33.field648 + var3);
                    class26.field557.method676(arg0 ^ -52, var4);
                }
                if (var5 == 15) {
                    class26.field557.method178(-5, 192);
                    class26.field557.method668(var2, (byte) 120);
                    ++class76.field1704;
                    class26.field557.method696(var3, false);
                    class26.field557.method689(-128, var4);
                    class79.field1792 = var2;
                    class115.field2502 = 0;
                    class49.field1019 = var3;
                    class93.field2039 = 2;
                    if (var2 >> 16 == class53.field1144) {
                        class93.field2039 = 1;
                    }
                    if (var2 >> 16 == class60.field1244) {
                        class93.field2039 = 3;
                    }
                }
                if (var5 == 21) {
                    class26.field557.method178(arg0 ^ -5, 135);
                    ++class35.field700;
                    class26.field557.method689(-128, var4);
                    class26.field557.method706(var2, -1091967272);
                    class26.field557.method696(var3, false);
                    class93.field2039 = 2;
                    class79.field1792 = var2;
                    if (var2 >> 16 == class53.field1144) {
                        class93.field2039 = 1;
                    }
                    class49.field1019 = var3;
                    if (var2 >> 16 == class60.field1244) {
                        class93.field2039 = 3;
                    }
                    class115.field2502 = 0;
                }
                if (var5 == 18) {
                    class26.field557.method178(-5, 194);
                    class26.field557.method686(arg0 + 16711680, var4);
                    ++class6.field106;
                    class26.field557.method706(var2, arg0 ^ -1091967272);
                    class26.field557.method689(-128, var3);
                    class79.field1792 = var2;
                    class115.field2502 = 0;
                    class49.field1019 = var3;
                    class93.field2039 = 2;
                    if (var2 >> 16 == class53.field1144) {
                        class93.field2039 = 1;
                    }
                    if (var2 >> 16 == class60.field1244) {
                        class93.field2039 = 3;
                    }
                }
                if (~var5 == -1007) {
                    int var52 = 32767 & var4 >> 14;
                    class121 var53 = class110.method821(var52, 724);
                    class69 var54;
                    if (var53.field2580 != null) {
                        var54 = var53.field2580;
                    } else {
                        var54 = class46.method305(20025, new class69[] { class53.field1142, var53.field2623, class98.field2150 });
                    }
                    class87.method619(var54, true, 0, class49.field992);
                }
                if (var5 == 47) {
                    ++class19.field422;
                    boolean var55 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                    if (!var55) {
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], arg0 + 130, var2, 2, var3);
                    }
                    class23.field489 = 2;
                    class17.field321 = 0;
                    class83.field1871 = class127.field2733;
                    class55.field1170 = class19.field417;
                    class26.field557.method178(-5, 202);
                    class26.field557.method686(16711680, class60.field1234 + var2);
                    class26.field557.method696(var4, false);
                    class26.field557.method689(arg0 + -128, class33.field648 + var3);
                }
                if (var5 == 49) {
                    class96.method731(-1);
                }
                if (var5 == 40) {
                    ++class101.field2189;
                    boolean var57 = class85.method609(0, 0, false, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                    if (!var57) {
                        class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var2, 2, var3);
                    }
                    class23.field489 = 2;
                    class55.field1170 = class19.field417;
                    class83.field1871 = class127.field2733;
                    class17.field321 = 0;
                    class26.field557.method178(-5, 108);
                    class26.field557.method689(-128, class33.field648 + var3);
                    class26.field557.method706(class74.field1655, -1091967272);
                    class26.field557.method686(16711680, var4);
                    class26.field557.method676(-101, class60.field1234 + var2);
                }
                if (var5 == 32) {
                    ++class25.field525;
                    class26.field557.method178(-5, 142);
                    class26.field557.method696(var3, false);
                    class26.field557.method696(class92.field2011, false);
                    class26.field557.method696(var4, false);
                    class26.field557.method689(-128, class35.field703);
                    class26.field557.method680((byte) 85, var2);
                    class26.field557.method680((byte) 106, class114.field2467);
                    class79.field1792 = var2;
                    class49.field1019 = var3;
                    class115.field2502 = 0;
                    class93.field2039 = 2;
                    if (var2 >> 16 == class53.field1144) {
                        class93.field2039 = 1;
                    }
                    if (~(var2 >> 16) == ~class60.field1244) {
                        class93.field2039 = 3;
                    }
                }
                if (~var5 == -34) {
                    class92.field2011 = var4;
                    class76.field1696 = 1;
                    class114.field2467 = var2;
                    class35.field703 = var3;
                    class50.field1083 = class9.method47(64, var4).field2397;
                    class60.field1248 = 0;
                    if (class50.field1083 == null) {
                        class50.field1083 = class128.field2747;
                    }
                    class110.field2418 = true;
                } else {
                    if (var5 == 37) {
                        class72 var59 = class112.field2434[var4];
                        if (var59 != null) {
                            ++client.field389;
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var59.field1097[0], 2, var59.field1041[0]);
                            class55.field1170 = class19.field417;
                            class23.field489 = 2;
                            class83.field1871 = class127.field2733;
                            class17.field321 = 0;
                            class26.field557.method178(-5, 4);
                            class26.field557.method686(16711680, var4);
                            class26.field557.method686(arg0 ^ 16711680, class35.field703);
                            class26.field557.method704(class114.field2467, (byte) 116);
                            class26.field557.method676(-54, class92.field2011);
                        }
                    }
                    if (var5 == 28 && class108.method801(var4, var3, 113, var2)) {
                        ++class64.field1359;
                        class26.field557.method178(-5, 116);
                        class26.field557.method686(16711680, class60.field1234 + var2);
                        class26.field557.method676(arg0 ^ -102, class33.field648 + var3);
                        class26.field557.method676(100, (536858492 & var4) >> 14);
                        class26.field557.method706(class74.field1655, -1091967272);
                    }
                    if (~var5 == -43) {
                        class108.method801(var4, var3, 98, var2);
                        ++class67.field1400;
                        class26.field557.method178(arg0 + -5, 3);
                        class26.field557.method686(16711680, class33.field648 + var3);
                        class26.field557.method689(-128, class60.field1234 + var2);
                        class26.field557.method676(arg0 ^ -112, 32767 & var4 >> 14);
                    }
                    if (~var5 == -1006) {
                        class108 var60 = class9.method47(64, var4);
                        class9 var61 = class9.method56(true, var2);
                        class69 var62;
                        if (var61 != null && ~var61.field165[var3] <= -100001) {
                            var62 = class46.method305(20025, new class69[] { class106.method791(var61.field165[var3], (byte) -106), class68.field1486, var60.field2397 });
                        } else if (var60.field2369 == null) {
                            var62 = class46.method305(arg0 ^ 20025, new class69[] { class53.field1142, var60.field2397, class98.field2150 });
                        } else {
                            var62 = var60.field2369;
                        }
                        class87.method619(var62, true, 0, class49.field992);
                    }
                    if (var5 == 3) {
                        class60 var63 = class123.field2682[var4];
                        if (var63 != null) {
                            ++class128.field2753;
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var63.field1097[0], 2, var63.field1041[0]);
                            class23.field489 = 2;
                            class17.field321 = 0;
                            class55.field1170 = class19.field417;
                            class83.field1871 = class127.field2733;
                            class26.field557.method178(arg0 + -5, 7);
                            class26.field557.method689(-128, var4);
                        }
                    }
                    if (var5 == 45) {
                        class72 var64 = class112.field2434[var4];
                        if (var64 != null) {
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var64.field1097[0], 2, var64.field1041[0]);
                            class23.field489 = 2;
                            ++class114.field2471;
                            class83.field1871 = class127.field2733;
                            class55.field1170 = class19.field417;
                            class17.field321 = 0;
                            class26.field557.method178(-5, 133);
                            class26.field557.method696(var4, false);
                        }
                    }
                    if (var5 == 1002) {
                        class108.method801(var4, var3, 42, var2);
                        ++class96.field2130;
                        class26.field557.method178(-5, 33);
                        class26.field557.method689(arg0 + -128, class60.field1234 + var2);
                        class26.field557.method696(var3 - -class33.field648, false);
                        class26.field557.method696(32767 & var4 >> 14, false);
                    }
                    if (~var5 == -47) {
                        class72 var65 = class112.field2434[var4];
                        if (var65 != null) {
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], arg0 + 130, var65.field1097[0], 2, var65.field1041[0]);
                            class17.field321 = 0;
                            class83.field1871 = class127.field2733;
                            class55.field1170 = class19.field417;
                            ++class57.field1190;
                            class23.field489 = 2;
                            class26.field557.method178(-5, 212);
                            class26.field557.method696(var4, false);
                        }
                    }
                    if (var5 == 36) {
                        class26.field557.method178(-5, 220);
                        class26.field557.method676(116, var4);
                        class26.field557.method686(16711680, var3);
                        class26.field557.method706(var2, -1091967272);
                        class93.field2039 = 2;
                        if (var2 >> 16 == class53.field1144) {
                            class93.field2039 = 1;
                        }
                        class115.field2502 = 0;
                        class49.field1019 = var3;
                        ++class42.field832;
                        class79.field1792 = var2;
                        if (~(var2 >> 16) == ~class60.field1244) {
                            class93.field2039 = 3;
                        }
                    }
                    if (~var5 == -31) {
                        class72 var66 = class112.field2434[var4];
                        if (var66 != null) {
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var66.field1097[0], 2, var66.field1041[0]);
                            class55.field1170 = class19.field417;
                            class23.field489 = 2;
                            class83.field1871 = class127.field2733;
                            ++class60.field1227;
                            class17.field321 = 0;
                            class26.field557.method178(-5, 110);
                            class26.field557.method696(var4, false);
                        }
                    }
                    if (~var5 == -30) {
                        class26.field557.method178(-5, 29);
                        ++class104.field2251;
                        class26.field557.method676(-126, var3);
                        class26.field557.method686(16711680, var4);
                        class26.field557.method668(var2, (byte) -16);
                        class93.field2039 = 2;
                        class79.field1792 = var2;
                        if (var2 >> 16 == class53.field1144) {
                            class93.field2039 = 1;
                        }
                        if (var2 >> 16 == class60.field1244) {
                            class93.field2039 = 3;
                        }
                        class115.field2502 = 0;
                        class49.field1019 = var3;
                    }
                    if (var5 == 5) {
                        ++field1614;
                        class26.field557.method178(-5, 64);
                        class26.field557.method704(var2, (byte) 123);
                        class26.field557.method689(-128, var3);
                        class26.field557.method689(-128, var4);
                        class49.field1019 = var3;
                        class79.field1792 = var2;
                        class93.field2039 = 2;
                        if (var2 >> 16 == class53.field1144) {
                            class93.field2039 = 1;
                        }
                        class115.field2502 = 0;
                        if (var2 >> 16 == class60.field1244) {
                            class93.field2039 = 3;
                        }
                    }
                    if (~var5 == -1005) {
                        class108 var67 = class9.method47(arg0 + 64, var4);
                        class69 var68;
                        if (var67.field2369 != null) {
                            var68 = var67.field2369;
                        } else {
                            var68 = class46.method305(20025, new class69[] { class53.field1142, var67.field2397, class98.field2150 });
                        }
                        class87.method619(var68, true, 0, class49.field992);
                    }
                    if (~var5 == -25) {
                        class60 var69 = class123.field2682[var4];
                        if (var69 != null) {
                            class85.method609(0, 0, false, 0, 1, 1, class46.field974.field1097[0], class46.field974.field1041[0], 130, var69.field1097[0], 2, var69.field1041[0]);
                            class83.field1871 = class127.field2733;
                            ++class121.field2597;
                            class55.field1170 = class19.field417;
                            class23.field489 = 2;
                            class17.field321 = 0;
                            class26.field557.method178(-5, 58);
                            class26.field557.method696(var4, false);
                        }
                    }
                    if (var5 == 43) {
                        class108.method801(var4, var3, 93, var2);
                        ++class4.field85;
                        class26.field557.method178(arg0 ^ -5, 222);
                        class26.field557.method676(104, class60.field1234 + var2);
                        class26.field557.method689(-128, 32767 & var4 >> 14);
                        class26.field557.method696(class33.field648 + var3, false);
                    }
                    if (var5 == 1003) {
                        class72 var70 = class112.field2434[var4];
                        if (var70 != null) {
                            class68 var71 = var70.field1616;
                            if (var71.field1462 != null) {
                                var71 = var71.method453(arg0 + 123);
                            }
                            if (var71 != null) {
                                class69 var72;
                                if (var71.field1439 == null) {
                                    var72 = class46.method305(20025, new class69[] { class53.field1142, var71.field1468, class98.field2150 });
                                } else {
                                    var72 = var71.field1439;
                                }
                                class87.method619(var72, true, 0, class49.field992);
                            }
                        }
                    }
                    if (class76.field1696 != 0) {
                        class110.field2418 = true;
                        class76.field1696 = 0;
                    }
                    if (~class60.field1248 != -1) {
                        class110.field2418 = true;
                        class60.field1248 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLlc;)Z")
    public static final boolean method511(boolean arg0, class69 arg1) {
        ++field1612;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0) {
                field1618 = null;
            }
            for (int var2 = 0; var2 < class43.field852; ++var2) {
                if (arg1.method474(false, class64.field1356[var2])) {
                    return true;
                }
            }
            return arg1.method474(false, class46.field974.field1222);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLlc;Llc;Z)V")
    public static final void method512(boolean arg0, class69 arg1, class69 arg2, boolean arg3) {
        if (class62.field1285) {
            class62.field1285 = false;
            class18.method105(class24.field509, 101);
            class35.method215(class24.field509, (byte) 97);
            class3.method14(205, class24.field509);
            class77.method552((byte) 105, class24.field509);
            class103.method778(class17.field323, true, class110.field2421, class24.field509, class119.field2552, class92.field2005);
            class120.method879(class51.field1110, -1, class40.field792, true, class67.field1396 == -1, class24.field509);
            class106.field2307 = true;
            class89.field1940 = true;
            class101.field2194 = true;
        }
        class76.method535(false);
        ++field1621;
        short var4 = 151;
        int var6 = var4 - 3;
        class119.field2552.method299(arg1, 257, var6, 0);
        class119.field2552.method299(arg1, 256, var6 + -1, 16777215);
        if (!arg3) {
            field1605 = null;
        }
        if (arg2 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = 4 + class119.field2552.method298(arg2);
                class95.method728(-(var5 / 2) + 257, var6 + -11, var5, 11, 0);
            }
            class119.field2552.method299(arg2, 257, var6, 0);
            class119.field2552.method299(arg2, 256, var6 + -1, 16777215);
        }
        class102.method775(class24.field509, 14990);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)Lhb;")
    public final class44 method144(boolean arg0) {
        ++field1610;
        if (this.field1616 == null) {
            return null;
        } else {
            class74 var2 = ~super.field1070 != 0 && super.field1032 == 0 ? class67.method435(69, super.field1070) : null;
            class74 var3 = super.field1034 == -1 || super.field1060 == super.field1034 && var2 != null ? null : class67.method435(103, super.field1034);
            class44 var4 = this.field1616.method455(super.field1033, 71, var3, var2, super.field1057);
            if (var4 == null) {
                return null;
            } else {
                var4.method283();
                super.field1086 = var4.field563;
                if (super.field1043 != -1 && ~super.field1028 != 0) {
                    class44 var5 = class89.method631(25, super.field1043).method834(super.field1028, (byte) -127);
                    if (var5 != null) {
                        var5.method285(0, -super.field1091, 0);
                        class44[] var6 = new class44[] { var4, var5 };
                        var4 = new class44(var6, 2, true);
                    }
                }
                if (!arg0) {
                    return null;
                } else {
                    if (this.field1616.field1471 == 1) {
                        var4.field897 = true;
                    }
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
    public static void method513(int arg0) {
        field1605 = null;
        int var1 = -59 / ((arg0 - -29) / 59);
        field1617 = null;
        field1603 = null;
        field1615 = null;
        field1598 = null;
        field1607 = null;
        field1618 = null;
        field1608 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)V")
    public static final void method514(int arg0, long arg1) {
        ++field1619;
        if (arg1 != 0L) {
            int var3 = 0;
            if (arg0 == 1) {
                while (class43.field852 > var3) {
                    if (~class56.field1186[var3] == ~arg1) {
                        ++class64.field1357;
                        --class43.field852;
                        class110.field2418 = true;
                        for (int var4 = var3; ~var4 > ~class43.field852; ++var4) {
                            class64.field1356[var4] = class64.field1356[var4 + 1];
                            class51.field1122[var4] = class51.field1122[var4 + 1];
                            class56.field1186[var4] = class56.field1186[var4 + 1];
                        }
                        class26.field557.method178(-5, 30);
                        class26.field557.method664(arg1, arg0 + 74);
                        return;
                    }
                    ++var3;
                }
            }
        }
    }
}
