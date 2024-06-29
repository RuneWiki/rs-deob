import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class class87 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field1383;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)Z")
    public abstract boolean method264(int arg0);

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
    public static void method651(int arg0) {
        if (arg0 != -16559) {
            method651(93);
        }
        field1383 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lqa;B)V")
    public abstract void method487(class207 arg0, byte arg1);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public abstract void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static final void method652(byte arg0) {
        if (class331.field4422 > 1) {
            class105.field1586 = class81.field1324;
            class331.field4422--;
        }
        field1382++;
        if (class143.field2204) {
            class143.field2204 = false;
            class5.method35(-61);
            return;
        }
        if (!class483.field6820) {
            class449.method2648((byte) -70);
        }
        for (int var1 = 0; var1 < 100 && class492.method2864(4015); var1++) {
        }
        if (class440.field6254 != 9) {
            return;
        }
        class81.method623(true, class479.field6754, class374.field5035.method3222((byte) -80));
        if (class77.field1257 == null) {
            if (class591.field8434 <= class488.method2835(30160)) {
                class77.field1257 = class314.field4235.method3599(class336.field4477.field2686, 49);
            }
        } else if (class77.field1257.field3448 != -1) {
            class351.method2108(class377.field5068, -10511);
            class479.field6754.method84(class77.field1257.field3448, (byte) -125);
            class77.field1257 = null;
            class591.field8434 = class488.method2835(30160) + 30000L;
        }
        class32 var2 = (class32) class623.field8998.method456((byte) -102);
        if (var2 != null || class16.field213 < (class488.method2835(30160) - 2000L)) {
            boolean var3 = false;
            int var4 = class479.field6754.field165;
            for (class32 var5 = (class32) class91.field1421.method456((byte) -35); var5 != null && class479.field6754.field165 - var4 < 240; var5 = (class32) class91.field1421.method460((byte) -100)) {
                var5.method1117(0);
                int var6 = var5.method324(-5);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method328((byte) -102);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class472.field6636 != var7 || class127.field2049 != var6) {
                    if (!var3) {
                        class365.field4966++;
                        class351.method2108(class269.field3758, -10511);
                        class479.field6754.method108((byte) -128, 0);
                        var4 = class479.field6754.field165;
                        var3 = true;
                    }
                    int var8 = var7 - class472.field6636;
                    class472.field6636 = var7;
                    int var9 = var6 - class127.field2049;
                    class127.field2049 = var6;
                    int var10 = (int) ((var5.method329(120) - class16.field213) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class479.field6754.method84((var10 << 12) + (var8 << 6) + var9, (byte) -107);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        class479.field6754.method108((byte) -128, var10 + 128);
                        var8 += 128;
                        class479.field6754.method84((var8 << 8) + var9, (byte) -113);
                    } else if (var10 >= 32) {
                        class479.field6754.method84(var10 + 57344, (byte) -97);
                        if (var7 == 1 || var6 == -1) {
                            class479.field6754.method117(-121, Integer.MIN_VALUE);
                        } else {
                            class479.field6754.method117(93, var6 << 16 | var7);
                        }
                    } else {
                        class479.field6754.method108((byte) -128, var10 + 192);
                        if (var7 == 1 || var6 == -1) {
                            class479.field6754.method117(arg0 ^ 0x68, Integer.MIN_VALUE);
                        } else {
                            class479.field6754.method117(92, var6 << 16 | var7);
                        }
                    }
                    class16.field213 = var5.method329(120);
                }
            }
            if (var3) {
                class479.field6754.method66(class479.field6754.field165 - var4, false);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method329(120) - class586.field8367) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class586.field8367 = var2.method329(120);
            int var13 = var2.method324(-5);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method328((byte) -107);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method323(false) == 2) {
                var15 = 1;
            }
            class424.field6000++;
            int var16 = (int) var11;
            class351.method2108(class478.field6731, -10511);
            class479.field6754.method117(91, var14 | var13 << 16);
            class479.field6754.method84(var16 | var15 << 15, (byte) -112);
        }
        if (class591.field8442 > 0) {
            class351.method2108(class386.field5187, -10511);
            class274.field3799++;
            class479.field6754.method108((byte) -128, class591.field8442 * 3);
            for (int var17 = 0; var17 < class591.field8442; var17++) {
                class620 var18 = class476.field6697[var17];
                long var19 = (var18.method3197(-20944) - class512.field7215) / 50L;
                class512.field7215 = var18.method3197(arg0 - 20883);
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class479.field6754.method108((byte) -128, var18.method3200((byte) 115));
                class479.field6754.method84((int) var19, (byte) -113);
            }
        }
        if (class606.field8733 > 0) {
            class606.field8733--;
        }
        if (arg0 != -61) {
            return;
        }
        if (class494.field6921 && class606.field8733 <= 0) {
            class494.field6921 = false;
            class191.field2704++;
            class606.field8733 = 20;
            class351.method2108(class58.field1035, arg0 - 10450);
            class479.field6754.method109((int) class1.field13 >> 3, 255);
            class479.field6754.method91((byte) 88, (int) class18.field224 >> 3);
        }
        if (class408.field5783 && !class80.field1310) {
            class217.field3095++;
            class80.field1310 = true;
            class351.method2108(class113.field1737, -10511);
            class479.field6754.method108((byte) -128, 1);
        }
        if (!class408.field5783 && class80.field1310) {
            class217.field3095++;
            class80.field1310 = false;
            class351.method2108(class113.field1737, -10511);
            class479.field6754.method108((byte) -128, 0);
        }
        if (!class293.field4032) {
            class351.method2108(class140.field2181, -10511);
            class370.field5016++;
            class479.field6754.method108((byte) -128, 0);
            int var21 = class479.field6754.field165;
            class11 var22 = new class11(class43.method418(64));
            class491.field6875.method1503(true, var22);
            class479.field6754.method87(var22.field138, 0, var22.field165, arg0 ^ 0xFFFFB8A5);
            class479.field6754.method66(class479.field6754.field165 - var21, false);
            class293.field4032 = true;
        }
        if (class356.field4807 != null) {
            if (class107.field1653 == 2) {
                class65.method545((byte) 83);
            } else if (class107.field1653 == 3) {
                class5.method37(122);
            }
        }
        if (class465.field6552) {
            class465.field6552 = false;
        } else {
            class309.field4169 /= 2.0F;
        }
        if (class310.field4181) {
            class310.field4181 = false;
        } else {
            class301.field4121 /= 2.0F;
        }
        class462.method2694(arg0 ^ 0xFFFFFF95);
        if (class440.field6254 != 9) {
            return;
        }
        class286.method1827((byte) 123);
        class318.method1984(-1);
        class20.method201((byte) 92);
        class350.method2102(true);
        class407.field5779++;
        if (class407.field5779 > 750) {
            class5.method35(123);
            return;
        }
        class313.method1955(arg0 + 145);
        class355.method2130(arg0 + 61);
        class457.method2674(0);
        for (int var23 = class189.field2681.method2681((byte) -120, true); var23 != -1; var23 = class189.field2681.method2681((byte) -127, false)) {
            class304.method1929((byte) 127, var23);
            class572.field7887[class589.method3454(31, class293.field4035++)] = var23;
        }
        for (class314 var24 = class529.method3035(-95); var24 != null; var24 = class529.method3035(123)) {
            int var25 = var24.method1960(-3657);
            int var26 = var24.method1961(-89);
            if (var25 == 1) {
                class77.field1259[var26] = var24.field4227;
                class173.field2495 |= class552.field7627[var26];
                class58.field1056[class589.method3454(class554.field7641++, 31)] = var26;
            } else if (var25 == 2) {
                class344.field4633[var26] = var24.field4228;
                class192.field2721[class589.method3454(class130.field2093++, 31)] = var26;
            } else if (var25 == 3) {
                class114 var48 = class612.method3584(var26, arg0 ^ 0xFFFFFFC3);
                if (!var24.field4228.equals(var48.field1898)) {
                    var48.field1898 = var24.field4228;
                    class403.method2407(var48, -9130);
                }
            } else if (var25 == 4) {
                class114 var27 = class612.method3584(var26, arg0 + 61);
                int var28 = var24.field4227;
                int var29 = var24.field4230;
                int var30 = var24.field4223;
                if (var27.field1780 != var28 || var27.field1820 != var29 || var27.field1859 != var30) {
                    var27.field1820 = var29;
                    var27.field1780 = var28;
                    var27.field1859 = var30;
                    class403.method2407(var27, arg0 - 9069);
                }
            } else if (var25 == 5) {
                class114 var47 = class612.method3584(var26, 0);
                if (var24.field4227 != var47.field1754 || var24.field4227 == -1) {
                    var47.field1891 = 1;
                    var47.field1754 = var24.field4227;
                    var47.field1804 = 0;
                    var47.field1838 = 0;
                    class403.method2407(var47, -9130);
                }
            } else if (var25 == 6) {
                int var41 = var24.field4227;
                int var42 = (var41 & 0x7C7B) >> 10;
                int var43 = var41 >> 5 & 0x1F;
                int var44 = var41 & 0x1F;
                int var45 = (var42 << 19) + (var43 << 11) + (var44 << 3);
                class114 var46 = class612.method3584(var26, 0);
                if (var46.field1757 != var45) {
                    var46.field1757 = var45;
                    class403.method2407(var46, -9130);
                }
            } else if (var25 == 7) {
                class114 var31 = class612.method3584(var26, arg0 + 61);
                boolean var32 = var24.field4227 == 1;
                if (var31.field1825 != var32) {
                    var31.field1825 = var32;
                    class403.method2407(var31, arg0 - 9069);
                }
            } else if (var25 == 8) {
                class114 var33 = class612.method3584(var26, 0);
                if (var24.field4227 != var33.field1823 || var24.field4230 != var33.field1797 || var24.field4223 != var33.field1890) {
                    var33.field1823 = var24.field4227;
                    var33.field1797 = var24.field4230;
                    var33.field1890 = var24.field4223;
                    if (var33.field1787 != -1) {
                        if (var33.field1779 > 0) {
                            var33.field1890 = var33.field1890 * 32 / var33.field1779;
                        } else if (var33.field1840 > 0) {
                            var33.field1890 = var33.field1890 * 32 / var33.field1840;
                        }
                    }
                    class403.method2407(var33, arg0 - 9069);
                }
            } else if (var25 == 9) {
                class114 var34 = class612.method3584(var26, 0);
                if (var24.field4227 != var34.field1787 || var24.field4230 != var34.field1867) {
                    var34.field1867 = var24.field4230;
                    var34.field1787 = var24.field4227;
                    class403.method2407(var34, -9130);
                }
            } else if (var25 == 10) {
                class114 var40 = class612.method3584(var26, arg0 + 61);
                if (var24.field4227 != var40.field1841 || var24.field4230 != var40.field1786 || var24.field4223 != var40.field1876) {
                    var40.field1841 = var24.field4227;
                    var40.field1876 = var24.field4223;
                    var40.field1786 = var24.field4230;
                    class403.method2407(var40, -9130);
                }
            } else if (var25 == 11) {
                class114 var39 = class612.method3584(var26, 0);
                var39.field1813 = 0;
                var39.field1814 = var39.field1845 = var24.field4230;
                var39.field1767 = var39.field1798 = var24.field4227;
                var39.field1765 = 0;
                class403.method2407(var39, -9130);
            } else if (var25 == 12) {
                class114 var35 = class612.method3584(var26, 0);
                int var36 = var24.field4227;
                if (var35 != null && var35.field1880 == 0) {
                    if ((var35.field1802 - var35.field1769) < var36) {
                        var36 = var35.field1802 - var35.field1769;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field1904 != var36) {
                        var35.field1904 = var36;
                        class403.method2407(var35, -9130);
                    }
                }
            } else if (var25 == 14) {
                class114 var38 = class612.method3584(var26, 0);
                var38.field1903 = var24.field4227;
            } else if (var25 == 15) {
                class118.field1943 = var24.field4230;
                class76.field1205 = true;
                class145.field2248 = var24.field4227;
            } else if (var25 == 16) {
                class114 var37 = class612.method3584(var26, 0);
                var37.field1910 = var24.field4227;
            }
        }
        class64.field1097++;
        if (class341.field4590 != 0) {
            class342.field4608 += 20;
            if (class342.field4608 >= 400) {
                class341.field4590 = 0;
            }
        }
        if (class40.field804 != null) {
            class331.field4423++;
            if (class331.field4423 >= 15) {
                class403.method2407(class40.field804, arg0 - 9069);
                class40.field804 = null;
            }
        }
        class480.field6766 = false;
        class604.field8712 = false;
        class319.field4326 = null;
        class63.field1092 = null;
        class296.method1891((byte) -128, -1, -1, null);
        class440.method2599((byte) -9, null, -1, -1);
        if (!class493.field6904) {
            class575.field7926 = -1;
        }
        class470.method2741(arg0 - 16666);
        class81.field1324++;
        if (class626.field9130) {
            class291.field4009++;
            class351.method2108(class229.field3266, -10511);
            class479.field6754.method118((byte) 74, class316.field4249 | class494.field6923 << 28 | class35.field699 << 14);
            class626.field9130 = false;
        }
        while (true) {
            class224 var49;
            class114 var50;
            class114 var51;
            do {
                var49 = (class224) class472.field6633.method459(3553);
                if (var49 == null) {
                    while (true) {
                        class224 var52;
                        class114 var53;
                        class114 var54;
                        do {
                            var52 = (class224) class93.field1433.method459(3553);
                            if (var52 == null) {
                                while (true) {
                                    class224 var55;
                                    class114 var56;
                                    class114 var57;
                                    do {
                                        var55 = (class224) class596.field8616.method459(3553);
                                        if (var55 == null) {
                                            if (class319.field4326 == null) {
                                                class557.field7711 = 0;
                                            }
                                            if (class137.field2159 != null) {
                                                class602.method3552((byte) 78);
                                            }
                                            if (class258.field3599 > 0 && class316.field4245.method2691(82, 19521) && class316.field4245.method2691(81, 19521) && class231.field3283 != 0) {
                                                int var58 = class645.field9372.field6035 - class231.field3283;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class166.method1064(class645.field9372.field616[0] + class519.field7304, -1601088218, class645.field9372.field618[0] + class6.field80, var58);
                                            }
                                            class175.method1112(arg0 ^ 0x3C);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class476.field6709[var59]++;
                                            }
                                            if (class173.field2495 && (class488.method2835(30160) - 60000L) > class621.field8932) {
                                                class333.method2035(true);
                                            }
                                            for (class447 var60 = (class447) class347.field4657.method3150(16); var60 != null; var60 = (class447) class347.field4657.method3147(arg0 + 77)) {
                                                if ((class488.method2835(arg0 ^ -30189) / 1000L - 5L) > ((long) var60.field6348)) {
                                                    if (var60.field6344 > 0) {
                                                        class56.method513("", (byte) 94, 5, 0, "", var60.field6347 + class56.field1004.method739(class173.field2491, -95));
                                                    }
                                                    if (var60.field6344 == 0) {
                                                        class56.method513("", (byte) 8, 5, 0, "", var60.field6347 + class559.field7746.method739(class173.field2491, 99));
                                                    }
                                                    var60.method939(107);
                                                }
                                            }
                                            class1.field14++;
                                            if (class1.field14 > 500) {
                                                class1.field14 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x4) == 4) {
                                                    class254.field3521 += class607.field8751;
                                                }
                                                if ((var61 & 0x1) == 1) {
                                                    class390.field5522 += class613.field8815;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class171.field2475 += class576.field7935;
                                                }
                                            }
                                            if (class390.field5522 < -50) {
                                                class613.field8815 = 2;
                                            }
                                            if (class390.field5522 > 50) {
                                                class613.field8815 = -2;
                                            }
                                            if (class171.field2475 < -55) {
                                                class576.field7935 = 2;
                                            }
                                            if (class254.field3521 < -40) {
                                                class607.field8751 = 1;
                                            }
                                            if (class171.field2475 > 55) {
                                                class576.field7935 = -2;
                                            }
                                            if (class254.field3521 > 40) {
                                                class607.field8751 = -1;
                                            }
                                            class504.field7019++;
                                            if (class504.field7019 > 500) {
                                                class504.field7019 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x2) == 2) {
                                                    class353.field4779 += class444.field6326;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class2.field27 += class53.field990;
                                                }
                                            }
                                            if (class2.field27 < -60) {
                                                class53.field990 = 2;
                                            }
                                            if (class353.field4779 < -20) {
                                                class444.field6326 = 1;
                                            }
                                            if (class2.field27 > 60) {
                                                class53.field990 = -2;
                                            }
                                            if (class353.field4779 > 10) {
                                                class444.field6326 = -1;
                                            }
                                            class531.field7442++;
                                            if (class531.field7442 > 50) {
                                                class23.field333++;
                                                class351.method2108(class122.field1986, -10511);
                                            }
                                            if (class219.field3143) {
                                                class19.method199((byte) -91);
                                                class219.field3143 = false;
                                            }
                                            try {
                                                if (class143.field2203 != null && class479.field6754.field165 > 0) {
                                                    class436.field6200 += class479.field6754.field165;
                                                    class143.field2203.method998(arg0 + 34127, class479.field6754.field138, 0, class479.field6754.field165);
                                                    class479.field6754.field165 = 0;
                                                    class531.field7442 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var63) {
                                                class5.method35(arg0 ^ 0xFFFFFFA0);
                                                return;
                                            }
                                        }
                                        var56 = var55.field3210;
                                        if (var56.field1749 < 0) {
                                            break;
                                        }
                                        var57 = class612.method3584(var56.field1897, 0);
                                    } while (var57 == null || var57.field1886 == null || var57.field1886.length <= var56.field1749 || var57.field1886[var56.field1749] != var56);
                                    class123.method862(var55);
                                }
                            }
                            var53 = var52.field3210;
                            if (var53.field1749 < 0) {
                                break;
                            }
                            var54 = class612.method3584(var53.field1897, 0);
                        } while (var54 == null || var54.field1886 == null || var53.field1749 >= var54.field1886.length || var54.field1886[var53.field1749] != var53);
                        class123.method862(var52);
                    }
                }
                var50 = var49.field3210;
                if (var50.field1749 < 0) {
                    break;
                }
                var51 = class612.method3584(var50.field1897, arg0 + 61);
            } while (var51 == null || var51.field1886 == null || var51.field1886.length <= var50.field1749 || var51.field1886[var50.field1749] != var50);
            class123.method862(var49);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZLqa;)Lnk;")
    public abstract class611 method490(boolean arg0, class207 arg1);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lqa;III)Z")
    public abstract boolean method488(class207 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(ZLqa;)Lvw;")
    public abstract class254 method483(boolean arg0, class207 arg1);

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
    public abstract void method262(int arg0);
}
