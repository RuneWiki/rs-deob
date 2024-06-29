import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class119 extends class171 {

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public int field1951 = -1;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public int field1958 = -1;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Ldv;")
    public static class566 field1955 = new class566(28, 18);

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "[J")
    public static long[] field1962;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field1957;
        class163 var3 = arg1.method1344();
        var3.method1054(super.field2473, super.field2470, super.field2469);
        class254 var4 = class110.method772(1, 3);
        if (~this.field1951 != 0) {
            class157 var5 = class181.field2574.method866(this.field1951, (byte) 79).method3626(2048, 0, this.field1947, -1, (class78) null, arg1, (byte) 106, 0, (class101) null);
            if (var5 != null) {
                var5.method154(var3, var4.field3525[2], 0);
            }
        }
        if (!arg0) {
            return null;
        } else {
            if (~this.field1958 != 0) {
                class157 var6 = class181.field2574.method866(this.field1958, (byte) 79).method3626(2048, 0, this.field1950, -1, (class78) null, arg1, (byte) 106, 0, (class101) null);
                if (var6 != null) {
                    var6.method154(var3, var4.field3525[1], 0);
                }
            }
            class157 var7 = class181.field2574.method866(this.field1960, (byte) 79).method3626(2048, 0, this.field1949, -1, (class78) null, arg1, (byte) 106, 0, (class101) null);
            if (var7 != null) {
                var7.method154(var3, var4.field3525[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
    public static final void method832(int arg0, int arg1, int arg2) {
        if (arg2 != 10084) {
            field1962 = null;
        }
        if (class413.field5820 < class413.field5812) {
            class413.field5820 = (float) ((double) class413.field5820 / 30.0D + (double) class413.field5820);
            if (class413.field5812 < class413.field5820) {
                class413.field5820 = class413.field5812;
            }
            class399.method2386((byte) -123);
            class413.field5814 = (int) class413.field5820 >> 1;
            class413.field5816 = class5.method36((byte) 122, class413.field5814);
        } else if (class413.field5812 < class413.field5820) {
            class413.field5820 = (float) ((double) class413.field5820 - (double) class413.field5820 / 30.0D);
            if (class413.field5812 > class413.field5820) {
                class413.field5820 = class413.field5812;
            }
            class399.method2386((byte) -102);
            class413.field5814 = (int) class413.field5820 >> 1;
            class413.field5816 = class5.method36((byte) 93, class413.field5814);
        }
        ++field1946;
        if (~class300.field4096 != 0 && ~class315.field4241 != 0) {
            int var3 = -class285.field3931 + class300.field4096;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = class315.field4241 - class627.field9160;
            class285.field3931 += var3;
            if (var4 < 2 || ~var4 < -3) {
                var4 /= 8;
            }
            class627.field9160 += var4;
            if (~var3 == -1 && ~var4 == -1) {
                class315.field4241 = -1;
                class300.field4096 = -1;
            }
            class399.method2386((byte) -121);
        }
        if (~class592.field8498 < -1) {
            --class314.field4237;
            if (~class314.field4237 == -1) {
                class314.field4237 = 100;
                --class592.field8498;
            }
        } else {
            class365.field4961 = -1;
            class640.field9317 = -1;
        }
        if (class473.field6661 && class317.field4305 != null) {
            for (class542 var5 = (class542) class317.field4305.method456((byte) -45); var5 != null; var5 = (class542) class317.field4305.method460((byte) -98)) {
                class463 var6 = class413.field5809.method2136(-94, var5.field7540.field4088);
                if (!var5.method3106((byte) -125, arg0, arg1)) {
                    if (var5.field7540.field4091) {
                        var5.field7540.field4091 = false;
                        class123.method854(class80.field1302, var5.field7540.field4088, var6.field6499);
                    }
                } else {
                    if (var6.field6543 != null) {
                        if (var6.field6543[4] != null) {
                            class404.method2410(var6.field6541, 0, (byte) -120, var6.field6499, 1004, -1, true, (long) var5.field7540.field4088, var6.field6543[4], -1, false);
                        }
                        if (var6.field6543[3] != null) {
                            class404.method2410(var6.field6541, 0, (byte) -120, var6.field6499, 1006, -1, true, (long) var5.field7540.field4088, var6.field6543[3], -1, false);
                        }
                        if (var6.field6543[2] != null) {
                            class404.method2410(var6.field6541, 0, (byte) -120, var6.field6499, 1001, -1, true, (long) var5.field7540.field4088, var6.field6543[2], -1, false);
                        }
                        if (var6.field6543[1] != null) {
                            class404.method2410(var6.field6541, 0, (byte) -120, var6.field6499, 1012, -1, true, (long) var5.field7540.field4088, var6.field6543[1], -1, false);
                        }
                        if (var6.field6543[0] != null) {
                            class404.method2410(var6.field6541, 0, (byte) -120, var6.field6499, 1003, -1, true, (long) var5.field7540.field4088, var6.field6543[0], -1, false);
                        }
                    }
                    if (!var5.field7540.field4091) {
                        var5.field7540.field4091 = true;
                        class123.method854(class272.field3778, var5.field7540.field4088, var6.field6499);
                    }
                    if (var5.field7540.field4091) {
                        class123.method854(class470.field6608, var5.field7540.field4088, var6.field6499);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public static void method833(int arg0) {
        field1955 = null;
        field1962 = null;
        if (arg0 != -30064) {
            method837((String[]) null, 48, 74, -27);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        if (arg1 != 21) {
            this.field1951 = 43;
        }
        ++field1954;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Z")
    public static final boolean method834(byte arg0) throws IOException {
        ++field1961;
        if (class143.field2203 == null) {
            return false;
        } else {
            if (class368.field5005 == null) {
                if (class576.field7934) {
                    if (!class143.field2203.method1000((byte) 105, 1)) {
                        return false;
                    }
                    class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                    class576.field7934 = false;
                    class407.field5779 = 0;
                    ++class258.field3602;
                }
                class343.field4627.field165 = 0;
                if (class343.field4627.method1234(-126)) {
                    if (!class143.field2203.method1000((byte) -75, 1)) {
                        return false;
                    }
                    class143.field2203.method1002(class343.field4627.field138, -26195, 1, 1);
                    class407.field5779 = 0;
                    ++class258.field3602;
                }
                class576.field7934 = true;
                class471[] var1 = class15.method177(127);
                int var2 = class343.field4627.method1232((byte) 46);
                if (~var2 > -1 || ~var1.length >= ~var2) {
                    throw new IOException("invo:" + var2 + " ip:" + class343.field4627.field165);
                }
                class368.field5005 = var1[var2];
                class403.field5730 = class368.field5005.field6619;
            }
            if (class403.field5730 == -1) {
                if (!class143.field2203.method1000((byte) 107, 1)) {
                    return false;
                }
                class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                ++class258.field3602;
                class407.field5779 = 0;
                class403.field5730 = class343.field4627.field138[0] & 255;
            }
            if (class403.field5730 == -2) {
                if (!class143.field2203.method1000((byte) 98, 2)) {
                    return false;
                }
                class143.field2203.method1002(class343.field4627.field138, -26195, 2, 0);
                class343.field4627.field165 = 0;
                class403.field5730 = class343.field4627.method93((byte) 115);
                class407.field5779 = 0;
                class258.field3602 += 2;
            }
            if (~class403.field5730 < -1) {
                if (!class143.field2203.method1000((byte) 115, class403.field5730)) {
                    return false;
                }
                class343.field4627.field165 = 0;
                class143.field2203.method1002(class343.field4627.field138, -26195, class403.field5730, 0);
                class258.field3602 += class403.field5730;
                class407.field5779 = 0;
            }
            class625.field9111 = class434.field6185;
            if (arg0 > -48) {
                return true;
            } else {
                class434.field6185 = class367.field4996;
                class367.field4996 = class368.field5005;
                if (class368.field5005 == class191.field2701) {
                    int var3 = class343.field4627.method98(25356);
                    int var4 = class343.field4627.method120((byte) -127);
                    int var5 = class343.field4627.method92(1);
                    int var6 = class343.field4627.method92(1);
                    if (class520.method3004(var3, 504757583)) {
                        class223.method1425(32, (var5 << 16) + var6, var4);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class439.field6239 == class368.field5005) {
                    int var7 = class343.field4627.method93((byte) 111);
                    int var8 = class343.field4627.method104(-81);
                    int var9 = class343.field4627.method119(-118);
                    if (class520.method3004(var8, 504757583)) {
                        class546.method3117(var9, -1, var7);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class431.field6128 == class368.field5005) {
                    int var10 = class343.field4627.method120((byte) 116);
                    int var11 = class343.field4627.method93((byte) 127);
                    if (class520.method3004(var11, 504757583)) {
                        class300.method1905(3, 4, -1, -1, var10);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class51.field974 == class368.field5005) {
                    class547.method3120(-123);
                    class368.field5005 = null;
                    return false;
                } else if (class487.field6833 == class368.field5005) {
                    int var12 = class343.field4627.method104(-63);
                    int var13 = class343.field4627.method119(-62);
                    class189.field2681.method2679(var13, 67, var12);
                    class368.field5005 = null;
                    return true;
                } else if (class524.field7367 == class368.field5005) {
                    int var14 = class343.field4627.method93((byte) 114);
                    int var15 = class343.field4627.method119(-45);
                    if (class520.method3004(var14, 504757583)) {
                        class128 var16 = (class128) class211.field2971.method1242(0, (long) var15);
                        if (var16 != null) {
                            class299.method1902(true, var16, (byte) 78, false);
                        }
                        if (class615.field8838 != null) {
                            class403.method2407(class615.field8838, -9130);
                            class615.field8838 = null;
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class202.field2831) {
                    class634.field9270 = class343.field4627.method110((byte) 55);
                    class368.field5005 = null;
                    return true;
                } else if (class39.field795 == class368.field5005) {
                    boolean var17 = ~class343.field4627.method110((byte) 121) == -2;
                    String var18 = class343.field4627.method100((byte) 87);
                    String var19 = var18;
                    if (var17) {
                        var19 = class343.field4627.method100((byte) 61);
                    }
                    int var20 = class343.field4627.method110((byte) 54);
                    int var21 = class343.field4627.method93((byte) 78);
                    boolean var22 = false;
                    if (var20 <= 1 && class541.method3103(var19, (byte) 79)) {
                        var22 = true;
                    }
                    if (!var22 && ~class353.field4780 == -1) {
                        String var23 = class451.field6374.method2202(var21, 124).method2631(true, class343.field4627);
                        if (~var20 == -3) {
                            class395.method2365(0, "<img=1>" + var18, var21, 25, (String) null, var23, -1, "<img=1>" + var19);
                        } else if (var20 == 1) {
                            class395.method2365(0, "<img=0>" + var18, var21, 25, (String) null, var23, -1, "<img=0>" + var19);
                        } else {
                            class395.method2365(0, var18, var21, 25, (String) null, var23, -1, var19);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class212.field2993) {
                    if (~class56.field1005 != 0) {
                        class625.method3650(0, class56.field1005, false);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class258.field3592) {
                    int var24 = class343.field4627.method93((byte) 77);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    int var25 = class343.field4627.method110((byte) 40);
                    int var26 = class343.field4627.method93((byte) 115);
                    int var27 = class343.field4627.method110((byte) 125);
                    class425.method2532(var26, var24, var27, 0, var25);
                    class368.field5005 = null;
                    return true;
                } else if (class470.field6613 == class368.field5005) {
                    int var28 = class343.field4627.method78(-8388608);
                    int var29 = class343.field4627.method93((byte) 84);
                    int var30 = class343.field4627.method120((byte) -96);
                    if (class520.method3004(var29, 504757583)) {
                        class40.method412(var30, (byte) -89, var28);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class549.field7601 == class368.field5005) {
                    boolean var31 = class343.field4627.method110((byte) 70) == 1;
                    String var32 = class343.field4627.method100((byte) 61);
                    String var33 = var32;
                    if (var31) {
                        var33 = class343.field4627.method100((byte) 72);
                    }
                    long var34 = class343.field4627.method85(-101);
                    long var36 = (long) class343.field4627.method93((byte) 89);
                    long var38 = (long) class343.field4627.method89((byte) -101);
                    int var40 = class343.field4627.method110((byte) 53);
                    long var41 = (var36 << 32) + var38;
                    boolean var43 = false;
                    int var44 = 0;
                    while (true) {
                        if (var44 >= 100) {
                            if (var40 <= 1) {
                                if ((!class480.field6767 || class600.field8654) && !class154.field2314) {
                                    if (class541.method3103(var33, (byte) 126)) {
                                        var43 = true;
                                    }
                                } else {
                                    var43 = true;
                                }
                            }
                            break;
                        }
                        if (~class606.field8729[var44] == ~var41) {
                            var43 = true;
                            break;
                        }
                        ++var44;
                    }
                    if (!var43 && ~class353.field4780 == -1) {
                        class606.field8729[class644.field9352] = var41;
                        class644.field9352 = (class644.field9352 - -1) % 100;
                        String var45 = class645.method3719((byte) 103, class621.method3620(-117, class343.field4627));
                        if (~var40 != -3 && ~var40 != -4) {
                            if (~var40 != -2) {
                                class395.method2365(0, var32, -1, 9, class380.method2245(var34, 21629), var45, -1, var33);
                            } else {
                                class395.method2365(0, "<img=0>" + var32, -1, 9, class380.method2245(var34, 21629), var45, -1, "<img=0>" + var33);
                            }
                        } else {
                            class395.method2365(0, "<img=1>" + var32, -1, 9, class380.method2245(var34, 21629), var45, -1, "<img=1>" + var33);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class10.field112) {
                    int var46 = class343.field4627.method98(25356);
                    if (var46 == 65535) {
                        var46 = -1;
                    }
                    int var47 = class343.field4627.method71((byte) -49);
                    int var48 = var47 >> 2;
                    int var49 = var47 & 3;
                    int var50 = class147.field2269[var48];
                    int var51 = class343.field4627.method107(255);
                    int var52 = (900979119 & var51) >> 28;
                    int var53 = 16383 & var51 >> 14;
                    int var54 = var51 & 16383;
                    int var55 = var53 - class519.field7304;
                    int var56 = var54 - class6.field80;
                    class586.method3438(var48, var52, var49, var55, var56, var46, 75, var50);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class253.field3515) {
                    int var57 = class343.field4627.method93((byte) 79);
                    int var58 = class343.field4627.method104(-75);
                    int var59 = class343.field4627.method120((byte) -40);
                    if (class520.method3004(var58, 504757583)) {
                        class614.method3588(var59, var57, (byte) 97);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class300.field4115) {
                    int var60 = class343.field4627.method120((byte) 113);
                    int var61 = class343.field4627.method104(107);
                    int var62 = class343.field4627.method104(88);
                    int var63 = class343.field4627.method104(56);
                    int var64 = class343.field4627.method93((byte) 102);
                    if (class520.method3004(var62, 504757583)) {
                        class300.method1905(7, 4, var61 << 16 | var63, var64, var60);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class569.field7856 == class368.field5005) {
                    class184.method1148(client.field3473, false);
                    class368.field5005 = null;
                    return true;
                } else if (class425.field6046 == class368.field5005) {
                    int var65 = class343.field4627.method119(-85);
                    int var66 = class343.field4627.method92(1);
                    class189.field2681.method2678((byte) -105, var66, var65);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class285.field3915) {
                    class184.method1148(class189.field2684, false);
                    class368.field5005 = null;
                    return true;
                } else if (class565.field7817 == class368.field5005) {
                    int var67 = class343.field4627.method93((byte) 115);
                    if (var67 == 65535) {
                        var67 = -1;
                    }
                    int var68 = class343.field4627.method110((byte) 47);
                    int var69 = class343.field4627.method93((byte) 117);
                    int var70 = class343.field4627.method110((byte) 96);
                    class487.method2832(var68, 0, var69, var67, var70);
                    class368.field5005 = null;
                    return true;
                } else if (class630.field9208 == class368.field5005) {
                    int var71 = class343.field4627.method93((byte) 75);
                    if (class520.method3004(var71, 504757583)) {
                        class607.method3565(0);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class503.field7003 == class368.field5005) {
                    int var72 = class343.field4627.method119(-74);
                    int var73 = class343.field4627.method93((byte) 84);
                    int var74 = class343.field4627.method93((byte) 96);
                    if (class520.method3004(var74, 504757583)) {
                        class437.method2585(var72, var73, true);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class489.field6852 == class368.field5005) {
                    int var75 = class343.field4627.method104(-122);
                    int var76 = class343.field4627.method93((byte) 98);
                    int var77 = class343.field4627.method92(1);
                    if (class520.method3004(var76, 504757583)) {
                        class48.method472((byte) -102, var75, var77, 0);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class480.field6763 == class368.field5005) {
                    class184.method1148(class175.field2509, false);
                    class368.field5005 = null;
                    return true;
                } else if (class86.field1374 == class368.field5005) {
                    class99.method706((byte) -121, true);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class314.field4233) {
                    int var78 = class343.field4627.method92(1);
                    int var79 = class343.field4627.method110((byte) 34);
                    boolean var80 = (var79 & 1) == 1;
                    class412.method2453(var78, false, var80);
                    class184.field2595[class589.method3454(class224.field3216++, 31)] = var78;
                    class368.field5005 = null;
                    return true;
                } else if (class623.field8991 == class368.field5005) {
                    int var81 = class343.field4627.method93((byte) 119);
                    int var82 = class343.field4627.method110((byte) 116);
                    boolean var83 = ~(1 & var82) == -2;
                    while (class403.field5730 > class343.field4627.field165) {
                        int var84 = class343.field4627.method112(-8838);
                        int var85 = class343.field4627.method93((byte) 92);
                        int var86 = 0;
                        if (~var85 != -1) {
                            var86 = class343.field4627.method110((byte) 25);
                            if (var86 == 255) {
                                var86 = class343.field4627.method119(-61);
                            }
                        }
                        class619.method3603(var85 + -1, false, var84, var81, var83, var86);
                    }
                    class184.field2595[class589.method3454(31, class224.field3216++)] = var81;
                    class368.field5005 = null;
                    return true;
                } else if (class57.field1013 == class368.field5005) {
                    class184.method1148(class205.field2879, false);
                    class368.field5005 = null;
                    return true;
                } else if (class498.field6953 == class368.field5005) {
                    int var87 = class343.field4627.method120((byte) -52);
                    int var88 = class343.field4627.method104(-65);
                    int var89 = class343.field4627.method121((byte) -111);
                    int var90 = class343.field4627.method111(-125);
                    if (class520.method3004(var88, 504757583)) {
                        class457.method2675(var87, -49, var90, var89);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class358.field4819) {
                    boolean var91 = class343.field4627.method110((byte) 35) == 1;
                    String var92 = class343.field4627.method100((byte) 55);
                    String var93 = var92;
                    if (var91) {
                        var93 = class343.field4627.method100((byte) 118);
                    }
                    long var94 = (long) class343.field4627.method93((byte) 85);
                    long var96 = (long) class343.field4627.method89((byte) -17);
                    int var98 = class343.field4627.method110((byte) 37);
                    long var99 = (var94 << 32) + var96;
                    boolean var101 = false;
                    int var102 = 0;
                    while (true) {
                        if (~var102 <= -101) {
                            if (var98 <= 1) {
                                if ((!class480.field6767 || class600.field8654) && !class154.field2314) {
                                    if (class541.method3103(var93, (byte) 117)) {
                                        var101 = true;
                                    }
                                } else {
                                    var101 = true;
                                }
                            }
                            break;
                        }
                        if (~class606.field8729[var102] == ~var99) {
                            var101 = true;
                            break;
                        }
                        ++var102;
                    }
                    if (!var101 && class353.field4780 == 0) {
                        class606.field8729[class644.field9352] = var99;
                        class644.field9352 = (class644.field9352 + 1) % 100;
                        String var103 = class645.method3719((byte) 113, class621.method3620(-120, class343.field4627));
                        if (~var98 != -3) {
                            if (var98 != 1) {
                                class395.method2365(0, var92, -1, 3, (String) null, var103, -1, var93);
                            } else {
                                class395.method2365(0, "<img=0>" + var92, -1, 7, (String) null, var103, -1, "<img=0>" + var93);
                            }
                        } else {
                            class395.method2365(0, "<img=1>" + var92, -1, 7, (String) null, var103, -1, "<img=1>" + var93);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class297.field4074) {
                    int var104 = class343.field4627.method93((byte) 86);
                    int var105 = class343.field4627.method104(-92);
                    int var106 = class343.field4627.method104(120);
                    int var107 = class343.field4627.method96(false);
                    int var108 = class343.field4627.method80(true);
                    boolean var109 = ~(var107 & 128) != -1;
                    if (~(var108 >> 30) != -1) {
                        int var110 = (var108 & 1059295276) >> 28;
                        int var111 = ((var108 & 268423201) >> 14) + -class519.field7304;
                        int var112 = (var108 & 16383) + -class6.field80;
                        if (var111 >= 0 && var112 >= 0 && class32.field513 > var111 && class611.field8786 > var112) {
                            int var113 = var111 * 128 - -64;
                            int var114 = var112 * 128 + 64;
                            int var115 = var110;
                            if (~var110 > -4 && class414.method2493(var112, false, var111)) {
                                var115 = var110 + 1;
                            }
                            class51 var116 = new class51(var104, 0, class405.field5763, var110, var115, var113, class183.method1144(77, var113, var114, var110) - var106, var114, var111, var111, var112, var112, var107);
                            class625.field9107.method463(new class304(var116), -105);
                        }
                    } else if (~(var108 >> 29) != -1) {
                        int var117 = var108 & 65535;
                        class576 var118 = (class576) class278.field3837.method1242(0, (long) var117);
                        if (var118 != null) {
                            if (~var104 == -65536) {
                                var104 = -1;
                            }
                            class109 var119 = var118.field7929;
                            boolean var120 = true;
                            int var121 = !var109 ? var119.field556 : var119.field523;
                            if (var104 != -1 && ~var121 != 0) {
                                if (~var104 != ~var121) {
                                    class258 var122 = class78.field1263.method1564(var104, 5);
                                    class258 var123 = class78.field1263.method1564(var121, 5);
                                    if (~var122.field3583 != 0 && ~var123.field3583 != 0) {
                                        class78 var124 = class331.field4418.method195(var122.field3583, (byte) 13);
                                        class78 var125 = class331.field4418.method195(var123.field3583, (byte) 13);
                                        if (var125.field1276 > var124.field1276) {
                                            var120 = false;
                                        }
                                    }
                                } else {
                                    class258 var126 = class78.field1263.method1564(var104, 5);
                                    if (var126.field3590 && var126.field3583 != -1) {
                                        class78 var127 = class331.field4418.method195(var126.field3583, (byte) 13);
                                        int var128 = var127.field1282;
                                        if (var128 != 0 && var128 != 2) {
                                            if (~var128 == -2) {
                                                var120 = true;
                                            }
                                        } else {
                                            var120 = false;
                                        }
                                    }
                                }
                            }
                            if (var120) {
                                if (!var109) {
                                    var119.field527 = 0;
                                    var119.field600 = 1;
                                    var119.field576 = class405.field5763 - -var105;
                                    var119.field590 = var106;
                                    var119.field556 = var104;
                                    var119.field542 = 0;
                                    var119.field605 = 7 & var107;
                                    if (class405.field5763 < var119.field576) {
                                        var119.field542 = -1;
                                    }
                                    if (var119.field556 != -1 && ~class405.field5763 == ~var119.field576) {
                                        int var129 = class78.field1263.method1564(var119.field556, 5).field3583;
                                        if (~var129 != 0) {
                                            class78 var130 = class331.field4418.method195(var129, (byte) 13);
                                            if (var130 != null && var130.field1261 != null) {
                                                class170.method1085(var119.field6029, var119.field6035, false, (byte) 70, 0, var130, var119.field6037);
                                            }
                                        }
                                    }
                                } else {
                                    var119.field531 = 1;
                                    var119.field537 = 0;
                                    var119.field591 = var106;
                                    var119.field533 = var107 & 7;
                                    var119.field589 = 0;
                                    var119.field523 = var104;
                                    var119.field528 = class405.field5763 + var105;
                                    if (~class405.field5763 > ~var119.field528) {
                                        var119.field537 = -1;
                                    }
                                    if (var119.field523 != -1 && class405.field5763 == var119.field528) {
                                        int var131 = class78.field1263.method1564(var119.field523, 5).field3583;
                                        if (var131 != -1) {
                                            class78 var132 = class331.field4418.method195(var131, (byte) 13);
                                            if (var132 != null && var132.field1261 != null) {
                                                class170.method1085(var119.field6029, var119.field6035, false, (byte) -121, 0, var132, var119.field6037);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var108 >> 28 != 0) {
                        int var133 = 65535 & var108;
                        class188 var134;
                        if (class97.field1472 != var133) {
                            var134 = class349.field4696[var133];
                        } else {
                            var134 = class645.field9372;
                        }
                        if (var134 != null) {
                            if (~var104 == -65536) {
                                var104 = -1;
                            }
                            boolean var135 = true;
                            int var136 = var109 ? var134.field523 : var134.field556;
                            if (~var104 != 0 && ~var136 != 0) {
                                if (var104 == var136) {
                                    class258 var137 = class78.field1263.method1564(var104, 5);
                                    if (var137.field3590 && ~var137.field3583 != 0) {
                                        class78 var138 = class331.field4418.method195(var137.field3583, (byte) 13);
                                        int var139 = var138.field1282;
                                        if (var139 != 0 && ~var139 != -3) {
                                            if (~var139 == -2) {
                                                var135 = true;
                                            }
                                        } else {
                                            var135 = false;
                                        }
                                    }
                                } else {
                                    class258 var140 = class78.field1263.method1564(var104, 5);
                                    class258 var141 = class78.field1263.method1564(var136, 5);
                                    if (~var140.field3583 != 0 && var141.field3583 != -1) {
                                        class78 var142 = class331.field4418.method195(var140.field3583, (byte) 13);
                                        class78 var143 = class331.field4418.method195(var141.field3583, (byte) 13);
                                        if (var143.field1276 > var142.field1276) {
                                            var135 = false;
                                        }
                                    }
                                }
                            }
                            if (var135) {
                                if (var109) {
                                    var134.field591 = var106;
                                    var134.field589 = 0;
                                    var134.field537 = 0;
                                    var134.field531 = 1;
                                    var134.field523 = var104;
                                    var134.field528 = class405.field5763 + var105;
                                    var134.field533 = 7 & var107;
                                    if (~class405.field5763 > ~var134.field528) {
                                        var134.field537 = -1;
                                    }
                                    if (~var134.field523 == -65536) {
                                        var134.field523 = -1;
                                    }
                                    if (var134.field523 != -1 && class405.field5763 == var134.field528) {
                                        int var144 = class78.field1263.method1564(var134.field523, 5).field3583;
                                        if (~var144 != 0) {
                                            class78 var145 = class331.field4418.method195(var144, (byte) 13);
                                            if (var145 != null && var145.field1261 != null) {
                                                class170.method1085(var134.field6029, var134.field6035, class645.field9372 == var134, (byte) 24, 0, var145, var134.field6037);
                                            }
                                        }
                                    }
                                } else {
                                    var134.field542 = 0;
                                    var134.field605 = var107 & 7;
                                    var134.field527 = 0;
                                    var134.field590 = var106;
                                    var134.field576 = class405.field5763 - -var105;
                                    var134.field556 = var104;
                                    var134.field600 = 1;
                                    if (~var134.field576 < ~class405.field5763) {
                                        var134.field542 = -1;
                                    }
                                    if (var134.field556 == 65535) {
                                        var134.field556 = -1;
                                    }
                                    if (var134.field556 != -1 && class405.field5763 == var134.field576) {
                                        int var146 = class78.field1263.method1564(var134.field556, 5).field3583;
                                        if (var146 != -1) {
                                            class78 var147 = class331.field4418.method195(var146, (byte) 13);
                                            if (var147 != null && var147.field1261 != null) {
                                                class170.method1085(var134.field6029, var134.field6035, class645.field9372 == var134, (byte) 107, 0, var147, var134.field6037);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class252.field3490) {
                    class368.field5005 = null;
                    return false;
                } else if (class368.field5005 == class283.field3914) {
                    class343.field4627.field165 += 28;
                    if (class343.field4627.method105(-49)) {
                        class533.method3064(-94, class343.field4627.field165 + -28, class343.field4627);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class210.field2959) {
                    class184.method1148(class298.field4078, false);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class324.field4369) {
                    int var148 = class343.field4627.method93((byte) 95);
                    if (~var148 == -65536) {
                        var148 = -1;
                    }
                    int var149 = class343.field4627.method78(-8388608);
                    int var150 = class343.field4627.method96(false);
                    class80.method622(var149, var150, var148, (byte) 123);
                    class368.field5005 = null;
                    return true;
                } else if (class394.field5556 == class368.field5005) {
                    int var151 = class343.field4627.method106(false);
                    int var152 = class343.field4627.method110((byte) 37);
                    int var153 = class343.field4627.method93((byte) 106);
                    if (~var153 == -65536) {
                        var153 = -1;
                    }
                    class80.method611(var153, 104, var152, var151);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class236.field3306) {
                    int var154 = class343.field4627.method93((byte) 119);
                    int var155 = class343.field4627.method110((byte) 40);
                    if (class520.method3004(var154, 504757583)) {
                        class407.field5780 = var155;
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class75.field1195 == class368.field5005) {
                    class236.field3312 = class81.field1324;
                    if (~class403.field5730 == -1) {
                        class587.field8394 = null;
                        class594.field8603 = 0;
                        class572.field7886 = null;
                        class368.field5005 = null;
                        class113.field1745 = null;
                        return true;
                    } else {
                        class113.field1745 = class343.field4627.method100((byte) 92);
                        boolean var156 = class343.field4627.method110((byte) 23) == 1;
                        if (var156) {
                            class343.field4627.method100((byte) 49);
                        }
                        long var157 = class343.field4627.method85(-116);
                        class572.field7886 = class612.method3585(92, var157);
                        class213.field3023 = class343.field4627.method67(65280);
                        int var159 = class343.field4627.method110((byte) 84);
                        if (~var159 == -256) {
                            class368.field5005 = null;
                            return true;
                        } else {
                            class594.field8603 = var159;
                            class88[] var160 = new class88[100];
                            for (int var161 = 0; ~var161 > ~class594.field8603; ++var161) {
                                var160[var161] = new class88();
                                var160[var161].field1393 = class343.field4627.method100((byte) 121);
                                boolean var167 = ~class343.field4627.method110((byte) 115) == -2;
                                if (var167) {
                                    var160[var161].field1389 = class343.field4627.method100((byte) 79);
                                } else {
                                    var160[var161].field1389 = var160[var161].field1393;
                                }
                                var160[var161].field1385 = class366.method2198(var160[var161].field1389, -128);
                                var160[var161].field1387 = class343.field4627.method93((byte) 81);
                                var160[var161].field1394 = class343.field4627.method67(65280);
                                var160[var161].field1392 = class343.field4627.method100((byte) 111);
                                if (var160[var161].field1389.equals(class645.field9372.field2630)) {
                                    class204.field2866 = var160[var161].field1394;
                                }
                            }
                            boolean var162 = false;
                            int var163 = class594.field8603;
                            while (var163 > 0) {
                                boolean var164 = true;
                                --var163;
                                for (int var165 = 0; var165 < var163; ++var165) {
                                    if (var160[var165].field1385.compareTo(var160[var165 + 1].field1385) > 0) {
                                        class88 var166 = var160[var165];
                                        var160[var165] = var160[var165 - -1];
                                        var164 = false;
                                        var160[var165 + 1] = var166;
                                    }
                                }
                                if (var164) {
                                    break;
                                }
                            }
                            class368.field5005 = null;
                            class587.field8394 = var160;
                            return true;
                        }
                    }
                } else if (class368.field5005 == class312.field4197) {
                    int var168 = class343.field4627.method93((byte) 104);
                    int var169 = class343.field4627.method110((byte) 127);
                    int var170 = class343.field4627.method110((byte) 34);
                    int var171 = class343.field4627.method93((byte) 95) << 0;
                    int var172 = class343.field4627.method110((byte) 111);
                    int var173 = class343.field4627.method110((byte) 69);
                    if (class520.method3004(var168, 504757583)) {
                        class440.method2614(var172, var170, var173, var169, var171, (byte) -51);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class1.field18) {
                    class184.method1148(class315.field4240, false);
                    class368.field5005 = null;
                    return true;
                } else if (class526.field7396 == class368.field5005) {
                    int var174 = class343.field4627.method93((byte) 106);
                    if (class520.method3004(var174, 504757583)) {
                        class77.method591(2048);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class19.field230) {
                    class608.field8764 = 1;
                    class368.field5005 = null;
                    class633.field9257 = class81.field1324;
                    return true;
                } else if (class541.field7535 == class368.field5005) {
                    int var175 = class343.field4627.method112(-8838);
                    int var176 = class343.field4627.method119(-46);
                    int var177 = class343.field4627.method110((byte) 118);
                    String var178 = "";
                    String var179 = var178;
                    if ((var177 & 1) != 0) {
                        var178 = class343.field4627.method100((byte) 112);
                        if (~(2 & var177) != -1) {
                            var179 = class343.field4627.method100((byte) 57);
                        } else {
                            var179 = var178;
                        }
                    }
                    String var180 = class343.field4627.method100((byte) 89);
                    if (~var175 != -100) {
                        if (!var179.equals("") && class541.method3103(var179, (byte) 120)) {
                            class368.field5005 = null;
                            return true;
                        }
                        class56.method513(var179, (byte) -122, var175, var176, var178, var180);
                    } else {
                        class77.method597(-1986155574, var180);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class214.field3047) {
                    class184.method1148(class206.field2903, false);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class193.field2732) {
                    int var181 = class343.field4627.method107(255);
                    int var182 = class343.field4627.method98(25356);
                    if (var182 == 65535) {
                        var182 = -1;
                    }
                    int var183 = class343.field4627.method98(25356);
                    if (class520.method3004(var183, 504757583)) {
                        class300.method1905(1, 4, var182, -1, var181);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class412.field5793 == class368.field5005) {
                    int var184 = class343.field4627.method93((byte) 104);
                    int var185 = class343.field4627.method71((byte) -41);
                    int var186 = class343.field4627.method98(25356);
                    if (class520.method3004(var186, 504757583)) {
                        if (~var185 == -3) {
                            class567.method3224((byte) 39);
                        }
                        class56.field1005 = var184;
                        class501.method2901(var184, 6);
                        class443.method2621(false, false);
                        class123.method849(class56.field1005);
                        for (int var187 = 0; ~var187 > -101; ++var187) {
                            class48.field940[var187] = true;
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class124.field2027) {
                    int var188 = class343.field4627.method93((byte) 120);
                    int var189 = class343.field4627.method119(-40);
                    int var190 = class343.field4627.method104(109);
                    if (~var190 == -65536) {
                        var190 = -1;
                    }
                    int var191 = class343.field4627.method120((byte) 123);
                    if (class520.method3004(var188, 504757583)) {
                        class549.method3128(var189, var190, var191, 1);
                        class621 var192 = class181.field2574.method866(var190, (byte) 79);
                        class182.method1141(var192.field8925, var192.field8952, (byte) 112, var189, var192.field8889);
                        class121.method841(var192.field8962, var192.field8943, 22050, var192.field8961, var189);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (client.field3456 == class368.field5005) {
                    client.field3471 = class343.field4627.method103((byte) -58) << 3;
                    class378.field5079 = class343.field4627.method78(-8388608);
                    class25.field455 = class343.field4627.method103((byte) -53) << 3;
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class274.field3796) {
                    int var193 = class343.field4627.method92(1);
                    byte var194 = class343.field4627.method116((byte) -124);
                    class189.field2681.method2679(var194, -121, var193);
                    class368.field5005 = null;
                    return true;
                } else if (class443.field6312 == class368.field5005) {
                    class184.method1148(class174.field2507, false);
                    class368.field5005 = null;
                    return true;
                } else if (class426.field6049 == class368.field5005) {
                    boolean var195 = class343.field4627.method110((byte) 24) == 1;
                    String var196 = class343.field4627.method100((byte) 123);
                    String var197 = var196;
                    if (var195) {
                        var197 = class343.field4627.method100((byte) 76);
                    }
                    int var198 = class343.field4627.method110((byte) 112);
                    boolean var199 = false;
                    if (var198 <= 1) {
                        if ((!class480.field6767 || class600.field8654) && !class154.field2314) {
                            if (~var198 >= -2 && class541.method3103(var197, (byte) 101)) {
                                var199 = true;
                            }
                        } else {
                            var199 = true;
                        }
                    }
                    if (!var199 && ~class353.field4780 == -1) {
                        String var200 = class645.method3719((byte) -115, class621.method3620(-126, class343.field4627));
                        if (~var198 != -3) {
                            if (~var198 == -2) {
                                class395.method2365(0, "<img=0>" + var196, -1, 24, (String) null, var200, -1, "<img=0>" + var197);
                            } else {
                                class395.method2365(0, var196, -1, 24, (String) null, var200, -1, var197);
                            }
                        } else {
                            class395.method2365(0, "<img=1>" + var196, -1, 24, (String) null, var200, -1, "<img=1>" + var197);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class130.field2080) {
                    int var201 = class343.field4627.method110((byte) 72);
                    boolean var202 = ~(var201 & 1) == -2;
                    String var203 = class343.field4627.method100((byte) 121);
                    String var204 = class343.field4627.method100((byte) 105);
                    if (var204.equals("")) {
                        var204 = var203;
                    }
                    String var205 = class343.field4627.method100((byte) 62);
                    String var206 = class343.field4627.method100((byte) 107);
                    if (var206.equals("")) {
                        var206 = var205;
                    }
                    if (var202) {
                        for (int var207 = 0; class536.field7488 > var207; ++var207) {
                            if (class471.field6623[var207].equals(var206)) {
                                class645.field9370[var207] = var203;
                                class471.field6623[var207] = var204;
                                class634.field9272[var207] = var205;
                                class507.field7088[var207] = var206;
                                break;
                            }
                        }
                    } else {
                        class645.field9370[class536.field7488] = var203;
                        class471.field6623[class536.field7488] = var204;
                        class634.field9272[class536.field7488] = var205;
                        class507.field7088[class536.field7488] = var206;
                        class207.field2915[class536.field7488] = ~class589.method3454(2, var201) == -3;
                        ++class536.field7488;
                    }
                    class633.field9257 = class81.field1324;
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class207.field2911) {
                    int var208 = class343.field4627.method93((byte) 108);
                    int var209 = class343.field4627.method110((byte) 29);
                    int var210 = class343.field4627.method110((byte) 73);
                    int var211 = class343.field4627.method93((byte) 92) << 0;
                    int var212 = class343.field4627.method110((byte) 115);
                    int var213 = class343.field4627.method110((byte) 91);
                    if (class520.method3004(var208, 504757583)) {
                        class61.method531(var213, var212, var210, 28405, var211, true, var209);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class562.field7786 == class368.field5005) {
                    class536.field7488 = class343.field4627.method110((byte) 36);
                    for (int var214 = 0; ~class536.field7488 < ~var214; ++var214) {
                        class645.field9370[var214] = class343.field4627.method100((byte) 68);
                        class471.field6623[var214] = class343.field4627.method100((byte) 57);
                        if (class471.field6623[var214].equals("")) {
                            class471.field6623[var214] = class645.field9370[var214];
                        }
                        class634.field9272[var214] = class343.field4627.method100((byte) 50);
                        class507.field7088[var214] = class343.field4627.method100((byte) 60);
                        if (class507.field7088[var214].equals("")) {
                            class507.field7088[var214] = class634.field9272[var214];
                        }
                        class207.field2915[var214] = false;
                    }
                    class633.field9257 = class81.field1324;
                    class368.field5005 = null;
                    return true;
                } else if (class478.field6751 == class368.field5005) {
                    int var215 = class343.field4627.method93((byte) 88);
                    int var216 = class343.field4627.method96(false);
                    int var217 = class343.field4627.method104(103);
                    class576 var218 = (class576) class278.field3837.method1242(0, (long) var215);
                    if (var218 != null) {
                        class182.method1140(var218.field7929, 3698, var217, var216);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class122.field1985) {
                    class49.method479(class403.field5730, class500.field6968, (byte) -98, class343.field4627);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class220.field3150) {
                    class259.field3607 = class343.field4627.method110((byte) 88);
                    class105.field1586 = class81.field1324;
                    class368.field5005 = null;
                    return true;
                } else if (class85.field1369 == class368.field5005) {
                    class632.field9247 = class343.field4627.method110((byte) 51);
                    class21.field316 = class343.field4627.method78(-8388608);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class253.field3517) {
                    int var219 = class343.field4627.method96(false);
                    int var220 = class343.field4627.method78(-8388608);
                    int var221 = class343.field4627.method107(255);
                    class98.field1506[var219] = var221;
                    class297.field4077[var219] = var220;
                    class278.field3854[var219] = 1;
                    int var222 = class254.field3520[var219] + -1;
                    for (int var223 = 0; ~var222 < ~var223; ++var223) {
                        if (var221 >= class148.field2272[var223]) {
                            class278.field3854[var219] = var223 + 2;
                        }
                    }
                    class517.field7257[class589.method3454(31, class96.field1460++)] = var219;
                    class368.field5005 = null;
                    return true;
                } else if (class456.field6426 == class368.field5005) {
                    String var224 = class343.field4627.method100((byte) 83);
                    int var225 = class343.field4627.method93((byte) 98);
                    String var226 = class451.field6374.method2202(var225, 114).method2631(true, class343.field4627);
                    class395.method2365(0, var224, var225, 19, (String) null, var226, -1, var224);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class126.field2046) {
                    boolean var227 = ~class343.field4627.method110((byte) 61) == -2;
                    String var228 = class343.field4627.method100((byte) 78);
                    String var229 = var228;
                    if (var227) {
                        var229 = class343.field4627.method100((byte) 52);
                    }
                    long var230 = class343.field4627.method85(-103);
                    long var232 = (long) class343.field4627.method93((byte) 120);
                    long var234 = (long) class343.field4627.method89((byte) -118);
                    int var236 = class343.field4627.method110((byte) 29);
                    int var237 = class343.field4627.method93((byte) 96);
                    long var238 = (var232 << 32) - -var234;
                    boolean var240 = false;
                    int var241 = 0;
                    while (true) {
                        if (var241 >= 100) {
                            if (var236 <= 1 && class541.method3103(var229, (byte) 106)) {
                                var240 = true;
                            }
                            break;
                        }
                        if (~class606.field8729[var241] == ~var238) {
                            var240 = true;
                            break;
                        }
                        ++var241;
                    }
                    if (!var240 && ~class353.field4780 == -1) {
                        class606.field8729[class644.field9352] = var238;
                        class644.field9352 = (class644.field9352 + 1) % 100;
                        String var242 = class451.field6374.method2202(var237, 125).method2631(true, class343.field4627);
                        if (~var236 == -3) {
                            class395.method2365(0, "<img=1>" + var228, var237, 20, class380.method2245(var230, 21629), var242, -1, "<img=1>" + var229);
                        } else if (~var236 == -2) {
                            class395.method2365(0, "<img=0>" + var228, var237, 20, class380.method2245(var230, 21629), var242, -1, "<img=0>" + var229);
                        } else {
                            class395.method2365(0, var228, var237, 20, class380.method2245(var230, 21629), var242, -1, var229);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class346.field4654) {
                    class86.method648(Integer.MIN_VALUE);
                    class368.field5005 = null;
                    return true;
                } else if (class451.field6373 == class368.field5005) {
                    int var243 = class343.field4627.method92(1);
                    int var244 = class343.field4627.method93((byte) 108);
                    int var245 = class343.field4627.method104(118);
                    int var246 = class343.field4627.method80(true);
                    int var247 = class343.field4627.method98(25356);
                    if (class520.method3004(var243, 504757583)) {
                        class182.method1141(var245, var244, (byte) 112, var246, var247);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class319.field4324) {
                    int var248 = class343.field4627.method110((byte) 38);
                    int var249 = class343.field4627.method78(-8388608);
                    if (~var249 == -256) {
                        var248 = -1;
                        var249 = -1;
                    }
                    class349.method2101(var249, false, var248);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class266.field3716) {
                    int var250 = class343.field4627.method110((byte) 60);
                    int var251 = var250 >> 5;
                    int var252 = var250 & 31;
                    if (~var252 == -1) {
                        class132.field2113[var251] = null;
                        class368.field5005 = null;
                        return true;
                    } else {
                        class201 var253 = new class201();
                        var253.field2819 = var252;
                        var253.field2824 = class343.field4627.method110((byte) 53);
                        if (var253.field2824 >= 0 && class60.field1064.length > var253.field2824) {
                            if (~var253.field2819 != -2 && ~var253.field2819 != -11) {
                                if (var253.field2819 >= 2 && var253.field2819 <= 6) {
                                    if (var253.field2819 == 2) {
                                        var253.field2826 = 64;
                                        var253.field2822 = 64;
                                    }
                                    if (~var253.field2819 == -4) {
                                        var253.field2826 = 64;
                                        var253.field2822 = 0;
                                    }
                                    if (var253.field2819 == 4) {
                                        var253.field2826 = 64;
                                        var253.field2822 = 128;
                                    }
                                    if (var253.field2819 == 5) {
                                        var253.field2826 = 0;
                                        var253.field2822 = 64;
                                    }
                                    if (~var253.field2819 == -7) {
                                        var253.field2822 = 64;
                                        var253.field2826 = 128;
                                    }
                                    var253.field2819 = 2;
                                    var253.field2821 = class343.field4627.method110((byte) 98);
                                    var253.field2822 += class343.field4627.method93((byte) 109) - class519.field7304 << 7;
                                    var253.field2826 += class343.field4627.method93((byte) 96) + -class6.field80 << 7;
                                    var253.field2827 = class343.field4627.method110((byte) 125) << 0;
                                    var253.field2820 = class343.field4627.method93((byte) 91);
                                }
                            } else {
                                var253.field2817 = class343.field4627.method93((byte) 81);
                                class343.field4627.field165 += 6;
                            }
                            var253.field2825 = class343.field4627.method93((byte) 96);
                            if (var253.field2825 == 65535) {
                                var253.field2825 = -1;
                            }
                            class132.field2113[var251] = var253;
                        }
                        class368.field5005 = null;
                        return true;
                    }
                } else if (class368.field5005 == class35.field745) {
                    int var254 = class343.field4627.method104(63);
                    byte var255 = class343.field4627.method62((byte) -59);
                    int var256 = class343.field4627.method92(1);
                    if (class520.method3004(var254, 504757583)) {
                        class437.method2585(var255, var256, true);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class340.field4578) {
                    class507.method2935(-419201343);
                    class368.field5005 = null;
                    return false;
                } else if (class368.field5005 == class164.field2367) {
                    int var257 = class343.field4627.method107(255);
                    int var258 = class343.field4627.method104(60);
                    int var259 = class343.field4627.method119(-104);
                    if (class520.method3004(var258, 504757583)) {
                        class128 var260 = (class128) class211.field2971.method1242(0, (long) var257);
                        class128 var261 = (class128) class211.field2971.method1242(0, (long) var259);
                        if (var261 != null) {
                            class299.method1902(var260 == null || var260.field2065 != var261.field2065, var261, (byte) 78, false);
                        }
                        if (var260 != null) {
                            var260.method1117(0);
                            class211.field2971.method1241(var260, (long) var259, -115);
                        }
                        class114 var262 = class612.method3584(var257, 0);
                        if (var262 != null) {
                            class403.method2407(var262, -9130);
                        }
                        class114 var263 = class612.method3584(var259, 0);
                        if (var263 != null) {
                            class403.method2407(var263, -9130);
                            class274.method1772((byte) -122, var263, true);
                        }
                        if (class56.field1005 != -1) {
                            class625.method3650(1, class56.field1005, false);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class268.field3752) {
                    class184.method1148(class302.field4122, false);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class202.field2829) {
                    int var264 = class343.field4627.method92(1);
                    int var265 = class343.field4627.method104(103);
                    int var266 = class343.field4627.method119(-67);
                    int var267 = class343.field4627.method120((byte) 97);
                    if (class520.method3004(var264, 504757583)) {
                        class300.method1905(5, 4, var265, var267, var266);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class387.field5193 == class368.field5005) {
                    class231.method1464((byte) -40, class343.field4627.method100((byte) 124));
                    class368.field5005 = null;
                    return true;
                } else if (class459.field6462 == class368.field5005) {
                    String var268 = class343.field4627.method100((byte) 113);
                    int var269 = class343.field4627.method93((byte) 102);
                    int var270 = class343.field4627.method93((byte) 124);
                    if (class520.method3004(var270, 504757583)) {
                        class206.method1258(var268, var269, 26965);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class312.field4211) {
                    int var271 = class343.field4627.method119(-124);
                    class366.field4988 = class500.field6968.method1849(var271, false);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class160.field2346) {
                    for (int var272 = 0; ~class349.field4696.length < ~var272; ++var272) {
                        if (class349.field4696[var272] != null) {
                            class349.field4696[var272].field535 = -1;
                        }
                    }
                    for (int var273 = 0; ~var273 > ~class204.field2859; ++var273) {
                        class342.field4610[var273].field7929.field535 = -1;
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class393.field5549 == class368.field5005) {
                    class580.field7981 = class343.field4627.method60(-2097152);
                    class480.field6767 = class343.field4627.method110((byte) 68) == 1;
                    class368.field5005 = null;
                    return true;
                } else if (class593.field8591 == class368.field5005) {
                    class378.field5079 = class343.field4627.method96(false);
                    class25.field455 = class343.field4627.method103((byte) -102) << 3;
                    client.field3471 = class343.field4627.method62((byte) -95) << 3;
                    while (class403.field5730 > class343.field4627.field165) {
                        class325 var274 = class399.method2388(-1)[class343.field4627.method110((byte) 33)];
                        class184.method1148(var274, false);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class414.field5845 == class368.field5005) {
                    class184.method1148(class132.field2111, false);
                    class368.field5005 = null;
                    return true;
                } else if (class451.field6371 == class368.field5005) {
                    class510.field7143 = class403.field5730 <= 2 ? class519.field7305.method739(class173.field2491, -70) : class343.field4627.method100((byte) 56);
                    class153.field2308 = class403.field5730 > 0 ? class343.field4627.method93((byte) 120) : -1;
                    if (~class153.field2308 == -65536) {
                        class153.field2308 = -1;
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class404.field5745 == class368.field5005) {
                    int var275 = class343.field4627.method93((byte) 74);
                    int var276 = class343.field4627.method110((byte) 100);
                    boolean var277 = ~(var276 & 1) == -2;
                    class561.method3202(var275, 125, var277);
                    int var278 = class343.field4627.method93((byte) 87);
                    for (int var279 = 0; ~var279 > ~var278; ++var279) {
                        int var280 = class343.field4627.method92(1);
                        int var281 = class343.field4627.method96(false);
                        if (~var281 == -256) {
                            var281 = class343.field4627.method119(-80);
                        }
                        class619.method3603(var280 + -1, false, var279, var275, var277, var281);
                    }
                    class184.field2595[class589.method3454(31, class224.field3216++)] = var275;
                    class368.field5005 = null;
                    return true;
                } else if (class533.field7463 == class368.field5005) {
                    String var282 = class343.field4627.method100((byte) 119);
                    boolean var283 = ~class343.field4627.method110((byte) 48) == -2;
                    String var284;
                    if (!var283) {
                        var284 = var282;
                    } else {
                        var284 = class343.field4627.method100((byte) 97);
                    }
                    int var285 = class343.field4627.method93((byte) 72);
                    byte var286 = class343.field4627.method67(65280);
                    boolean var287 = false;
                    if (var286 == -128) {
                        var287 = true;
                    }
                    if (var287) {
                        if (~class594.field8603 == -1) {
                            class368.field5005 = null;
                            return true;
                        }
                        boolean var288 = false;
                        int var289;
                        for (var289 = 0; ~class594.field8603 < ~var289 && (!class587.field8394[var289].field1389.equals(var284) || class587.field8394[var289].field1387 != var285); ++var289) {
                        }
                        if (var289 < class594.field8603) {
                            while (class594.field8603 - 1 > var289) {
                                class587.field8394[var289] = class587.field8394[var289 - -1];
                                ++var289;
                            }
                            --class594.field8603;
                            class587.field8394[class594.field8603] = null;
                        }
                    } else {
                        String var290 = class343.field4627.method100((byte) 86);
                        class88 var291 = new class88();
                        var291.field1393 = var282;
                        var291.field1389 = var284;
                        var291.field1385 = class366.method2198(var291.field1389, -128);
                        var291.field1394 = var286;
                        var291.field1387 = var285;
                        var291.field1392 = var290;
                        int var292;
                        for (var292 = class594.field8603 + -1; var292 >= 0; --var292) {
                            int var293 = class587.field8394[var292].field1385.compareTo(var291.field1385);
                            if (~var293 == -1) {
                                class587.field8394[var292].field1387 = var285;
                                class587.field8394[var292].field1394 = var286;
                                class587.field8394[var292].field1392 = var290;
                                if (var284.equals(class645.field9372.field2630)) {
                                    class204.field2866 = var286;
                                }
                                class368.field5005 = null;
                                class236.field3312 = class81.field1324;
                                return true;
                            }
                            if (var293 < 0) {
                                break;
                            }
                        }
                        if (class587.field8394.length <= class594.field8603) {
                            class368.field5005 = null;
                            return true;
                        }
                        for (int var294 = class594.field8603 + -1; ~var294 < ~var292; --var294) {
                            class587.field8394[var294 + 1] = class587.field8394[var294];
                        }
                        if (class594.field8603 == 0) {
                            class587.field8394 = new class88[100];
                        }
                        class587.field8394[var292 + 1] = var291;
                        ++class594.field8603;
                        if (var284.equals(class645.field9372.field2630)) {
                            class204.field2866 = var286;
                        }
                    }
                    class368.field5005 = null;
                    class236.field3312 = class81.field1324;
                    return true;
                } else if (class368.field5005 == class304.field4146) {
                    int var295 = class343.field4627.method98(25356);
                    int var296 = class343.field4627.method92(1);
                    int var297 = class343.field4627.method119(-37);
                    int var298 = class343.field4627.method71((byte) -49);
                    if (class520.method3004(var295, 504757583)) {
                        class128 var299 = (class128) class211.field2971.method1242(0, (long) var297);
                        if (var299 != null) {
                            class299.method1902(var299.field2065 != var296, var299, (byte) 78, false);
                        }
                        class506.method2931(var296, -16962, var297, var298, false);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class353.field4772) {
                    int var300 = class343.field4627.method98(25356);
                    if (var300 == 65535) {
                        var300 = -1;
                    }
                    int var301 = class343.field4627.method92(1);
                    int var302 = class343.field4627.method107(255);
                    if (class520.method3004(var301, 504757583)) {
                        class401.method2402(102, var300, var302);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class226.field3235) {
                    String var303 = class343.field4627.method100((byte) 51);
                    int var304 = class343.field4627.method110((byte) 55);
                    int var305 = class343.field4627.method71((byte) -64);
                    int var306 = class343.field4627.method98(25356);
                    if (~var306 == -65536) {
                        var306 = -1;
                    }
                    if (~var304 <= -2 && var304 <= 8) {
                        if (var303.equalsIgnoreCase("null")) {
                            var303 = null;
                        }
                        class151.field2289[var304 - 1] = var303;
                        class630.field9231[var304 + -1] = var306;
                        class258.field3600[var304 + -1] = ~var305 == -1;
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class63.field1087 == class368.field5005) {
                    boolean var307 = class343.field4627.method110((byte) 80) == 1;
                    String var308 = class343.field4627.method100((byte) 92);
                    String var309 = var308;
                    if (var307) {
                        var309 = class343.field4627.method100((byte) 61);
                    }
                    long var310 = (long) class343.field4627.method93((byte) 88);
                    long var312 = (long) class343.field4627.method89((byte) -127);
                    int var314 = class343.field4627.method110((byte) 92);
                    int var315 = class343.field4627.method93((byte) 119);
                    long var316 = (var310 << 32) + var312;
                    boolean var318 = false;
                    int var319 = 0;
                    while (true) {
                        if (~var319 <= -101) {
                            if (~var314 >= -2 && class541.method3103(var309, (byte) 102)) {
                                var318 = true;
                            }
                            break;
                        }
                        if (~class606.field8729[var319] == ~var316) {
                            var318 = true;
                            break;
                        }
                        ++var319;
                    }
                    if (!var318 && ~class353.field4780 == -1) {
                        class606.field8729[class644.field9352] = var316;
                        class644.field9352 = (class644.field9352 - -1) % 100;
                        String var320 = class451.field6374.method2202(var315, 118).method2631(true, class343.field4627);
                        if (var314 == 2) {
                            class395.method2365(0, "<img=1>" + var308, var315, 18, (String) null, var320, -1, "<img=1>" + var309);
                        } else if (~var314 != -2) {
                            class395.method2365(0, var308, var315, 18, (String) null, var320, -1, var309);
                        } else {
                            class395.method2365(0, "<img=0>" + var308, var315, 18, (String) null, var320, -1, "<img=0>" + var309);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class393.field5543 == class368.field5005) {
                    class184.method1148(class349.field4698, false);
                    class368.field5005 = null;
                    return true;
                } else if (class426.field6052 == class368.field5005) {
                    class99.method706((byte) -125, false);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class10.field108) {
                    int var321 = class343.field4627.method111(-127);
                    int var322 = class343.field4627.method92(1);
                    int var323 = class343.field4627.method80(true);
                    if (class520.method3004(var322, 504757583)) {
                        class67.method552(var323, var321, -1);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class286.field3933) {
                    class378.field5079 = class343.field4627.method110((byte) 67);
                    class25.field455 = class343.field4627.method103((byte) -119) << 3;
                    client.field3471 = class343.field4627.method103((byte) -81) << 3;
                    for (class93 var324 = (class93) class220.field3147.method1248(-1); var324 != null; var324 = (class93) class220.field3147.method1245((byte) 95)) {
                        int var326 = (int) (var324.field2524 >> 28 & 3L);
                        int var327 = (int) (16383L & var324.field2524);
                        int var328 = -class519.field7304 + var327;
                        int var329 = (int) (16383L & var324.field2524 >> 14);
                        int var330 = -class6.field80 + var329;
                        if (~class378.field5079 == ~var326 && var328 >= client.field3471 && var328 < client.field3471 + 8 && ~var330 <= ~class25.field455 && class25.field455 + 8 > var330) {
                            var324.method1117(0);
                            if (~var328 <= -1 && ~var330 <= -1 && var328 < class32.field513 && class611.field8786 > var330) {
                                class344.method2081(class378.field5079, false, var328, var330);
                            }
                        }
                    }
                    for (class438 var325 = (class438) class311.field4187.method456((byte) -81); var325 != null; var325 = (class438) class311.field4187.method460((byte) 57)) {
                        if (~var325.field6220 <= ~client.field3471 && client.field3471 + 8 > var325.field6220 && class25.field455 <= var325.field6213 && ~(class25.field455 + 8) < ~var325.field6213 && ~class378.field5079 == ~var325.field6224) {
                            var325.field6214 = 0;
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class644.field9359 == class368.field5005) {
                    String var331 = class343.field4627.method100((byte) 53);
                    int var332 = class343.field4627.method104(61);
                    int var333 = class343.field4627.method98(25356);
                    if (class520.method3004(var333, 504757583)) {
                        class206.method1258(var331, var332, 26965);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class632.field9246 == class368.field5005) {
                    int var334 = class343.field4627.method107(255);
                    int var335 = class343.field4627.method104(41);
                    if (var335 == 65535) {
                        var335 = -1;
                    }
                    int var336 = class343.field4627.method93((byte) 82);
                    if (class520.method3004(var336, 504757583)) {
                        class300.method1905(2, 4, var335, -1, var334);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class374.field5038 == class368.field5005) {
                    class184.method1148(class646.field9388, false);
                    class368.field5005 = null;
                    return true;
                } else if (class434.field6184 == class368.field5005) {
                    if (!class604.method3558(3, class440.field6254)) {
                        class331.field4422 = class343.field4627.method93((byte) 110) * 30;
                    } else {
                        class331.field4422 = (int) ((float) class343.field4627.method93((byte) 113) * 2.5F);
                    }
                    class368.field5005 = null;
                    class105.field1586 = class81.field1324;
                    return true;
                } else if (class368.field5005 == class311.field4188) {
                    int var337 = class343.field4627.method93((byte) 100);
                    String var338 = class343.field4627.method100((byte) 88);
                    Object[] var339 = new Object[1 + var338.length()];
                    for (int var340 = var338.length() - 1; ~var340 <= -1; --var340) {
                        if (~var338.charAt(var340) == -116) {
                            var339[var340 + 1] = class343.field4627.method100((byte) 56);
                        } else {
                            var339[var340 + 1] = new Integer(class343.field4627.method119(-88));
                        }
                    }
                    var339[0] = new Integer(class343.field4627.method119(-83));
                    if (class520.method3004(var337, 504757583)) {
                        class224 var341 = new class224();
                        var341.field3207 = var339;
                        class123.method862(var341);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class77.field1234 == class368.field5005) {
                    int var342 = class343.field4627.method107(255);
                    int var343 = class343.field4627.method80(true);
                    int var344 = class343.field4627.method93((byte) 72);
                    if (~var344 == -65536) {
                        var344 = -1;
                    }
                    int var345 = class343.field4627.method104(94);
                    if (var345 == 65535) {
                        var345 = -1;
                    }
                    int var346 = class343.field4627.method104(-98);
                    if (class520.method3004(var346, 504757583)) {
                        for (int var347 = var344; var345 >= var347; ++var347) {
                            long var348 = ((long) var342 << 32) - -((long) var347);
                            class500 var350 = (class500) class259.field3603.method1242(0, var348);
                            class500 var351;
                            if (var350 != null) {
                                var351 = new class500(var343, var350.field6969);
                                var350.method1117(0);
                            } else if (~var347 == 0) {
                                var351 = new class500(var343, class612.method3584(var342, 0).field1753.field6969);
                            } else {
                                var351 = new class500(var343, -1);
                            }
                            class259.field3603.method1241(var351, var348, -128);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class58.field1055 == class368.field5005) {
                    class368.method2208(false, false);
                    class368.field5005 = null;
                    return false;
                } else if (class368.field5005 == class336.field4489) {
                    class184.method1148(class333.field4457, false);
                    class368.field5005 = null;
                    return true;
                } else if (class71.field1179 == class368.field5005) {
                    int var352 = class343.field4627.method92(1);
                    int var353 = class343.field4627.method104(-58);
                    int var354 = class343.field4627.method120((byte) -113);
                    int var355 = class343.field4627.method98(25356);
                    if (var355 == 65535) {
                        var355 = -1;
                    }
                    int var356 = class343.field4627.method98(25356);
                    if (~var356 == -65536) {
                        var356 = -1;
                    }
                    if (class520.method3004(var352, 504757583)) {
                        for (int var357 = var356; ~var355 <= ~var357; ++var357) {
                            long var358 = ((long) var354 << 32) + (long) var357;
                            class500 var360 = (class500) class259.field3603.method1242(0, var358);
                            class500 var361;
                            if (var360 == null) {
                                if (~var357 == 0) {
                                    var361 = new class500(class612.method3584(var354, 0).field1753.field6963, var353);
                                } else {
                                    var361 = new class500(0, var353);
                                }
                            } else {
                                var361 = new class500(var360.field6963, var353);
                                var360.method1117(0);
                            }
                            class259.field3603.method1241(var361, var358, -106);
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class99.field1513 == class368.field5005) {
                    while (class343.field4627.field165 < class403.field5730) {
                        boolean var372 = class343.field4627.method110((byte) 52) == 1;
                        String var373 = class343.field4627.method100((byte) 109);
                        String var374 = class343.field4627.method100((byte) 73);
                        int var375 = class343.field4627.method93((byte) 99);
                        int var376 = class343.field4627.method110((byte) 115);
                        String var377 = "";
                        boolean var378 = false;
                        if (~var375 < -1) {
                            var377 = class343.field4627.method100((byte) 77);
                            var378 = class343.field4627.method110((byte) 86) == 1;
                        }
                        for (int var379 = 0; class367.field4989 > var379; ++var379) {
                            if (var372) {
                                if (var374.equals(class474.field6677[var379])) {
                                    class474.field6677[var379] = var373;
                                    class326.field4381[var379] = var374;
                                    var373 = null;
                                    break;
                                }
                            } else if (var373.equals(class474.field6677[var379])) {
                                if (~class345.field4645[var379] != ~var375) {
                                    boolean var380 = true;
                                    for (class447 var381 = (class447) class347.field4657.method3150(16); var381 != null; var381 = (class447) class347.field4657.method3147(16)) {
                                        if (var381.field6347.equals(var373)) {
                                            if (~var375 != -1 && var381.field6344 == 0) {
                                                var381.method939(109);
                                                var380 = false;
                                            } else if (var375 == 0 && ~var381.field6344 != -1) {
                                                var380 = false;
                                                var381.method939(60);
                                            }
                                        }
                                    }
                                    if (var380) {
                                        class347.field4657.method3145(new class447(var373, var375), Integer.MAX_VALUE);
                                    }
                                    class345.field4645[var379] = var375;
                                }
                                class326.field4381[var379] = var374;
                                class165.field2376[var379] = var377;
                                class210.field2963[var379] = var376;
                                class254.field3519[var379] = var378;
                                var373 = null;
                                break;
                            }
                        }
                        if (var373 != null && class367.field4989 < 200) {
                            class474.field6677[class367.field4989] = var373;
                            class326.field4381[class367.field4989] = var374;
                            class345.field4645[class367.field4989] = var375;
                            class165.field2376[class367.field4989] = var377;
                            class210.field2963[class367.field4989] = var376;
                            class254.field3519[class367.field4989] = var378;
                            ++class367.field4989;
                        }
                    }
                    class633.field9257 = class81.field1324;
                    class608.field8764 = 2;
                    boolean var362 = false;
                    int var363 = class367.field4989;
                    while (~var363 < -1) {
                        --var363;
                        boolean var364 = true;
                        for (int var365 = 0; ~var365 > ~var363; ++var365) {
                            if (~class345.field4645[var365] != ~class336.field4477.field2680 && ~class345.field4645[var365 - -1] == ~class336.field4477.field2680 || class345.field4645[var365] == 0 && class345.field4645[var365 - -1] != 0) {
                                int var366 = class345.field4645[var365];
                                class345.field4645[var365] = class345.field4645[var365 + 1];
                                class345.field4645[var365 - -1] = var366;
                                String var367 = class165.field2376[var365];
                                class165.field2376[var365] = class165.field2376[var365 + 1];
                                class165.field2376[var365 + 1] = var367;
                                String var368 = class474.field6677[var365];
                                class474.field6677[var365] = class474.field6677[var365 - -1];
                                class474.field6677[var365 + 1] = var368;
                                String var369 = class326.field4381[var365];
                                class326.field4381[var365] = class326.field4381[var365 - -1];
                                class326.field4381[var365 + 1] = var369;
                                int var370 = class210.field2963[var365];
                                class210.field2963[var365] = class210.field2963[var365 + 1];
                                class210.field2963[var365 + 1] = var370;
                                boolean var371 = class254.field3519[var365];
                                class254.field3519[var365] = class254.field3519[var365 - -1];
                                var364 = false;
                                class254.field3519[var365 + 1] = var371;
                            }
                        }
                        if (var364) {
                            break;
                        }
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class405.field5754 == class368.field5005) {
                    int var382 = class343.field4627.method110((byte) 111);
                    if (class343.field4627.method110((byte) 60) == 0) {
                        class311.field4183[var382] = new class601();
                    } else {
                        --class343.field4627.field165;
                        class311.field4183[var382] = new class601(class343.field4627);
                    }
                    class97.field1473 = class81.field1324;
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class227.field3249) {
                    int var383 = class343.field4627.method93((byte) 114);
                    int var384 = class343.field4627.method120((byte) 108);
                    if (class520.method3004(var383, 504757583)) {
                        class300.method1905(5, 4, class97.field1472, 0, var384);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class246.field3420) {
                    class184.method1148(class646.field9389, false);
                    class368.field5005 = null;
                    return true;
                } else if (class622.field8978 == class368.field5005) {
                    boolean var385 = ~class343.field4627.method110((byte) 122) == -2;
                    byte[] var386 = new byte[class403.field5730 + -1];
                    class343.field4627.method75(0, class403.field5730 + -1, (byte) 106, var386);
                    class276.method1778(var386, var385, 105);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class345.field4640) {
                    if (class87.field1383 != null) {
                        class512.method2963(class491.field6875.field3359, false, -1, -4, -1);
                    }
                    byte[] var387 = new byte[class403.field5730];
                    class343.field4627.method1238(var387, 0, class403.field5730, 25768);
                    String var388 = class231.method1465(0, 55, class403.field5730, var387);
                    class148.method981(~class103.field1570 == -2, 2, class500.field6968, true, var388);
                    class368.field5005 = null;
                    return true;
                } else if (class621.field8957 == class368.field5005) {
                    int var389 = class343.field4627.method120((byte) -65);
                    int var390 = class343.field4627.method104(-70);
                    String var391 = class343.field4627.method100((byte) 81);
                    if (class520.method3004(var390, 504757583)) {
                        class528.method3033(var389, -10670, var391);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class552.field7620 == class368.field5005) {
                    int var392 = class343.field4627.method107(255);
                    int var393 = class343.field4627.method98(25356);
                    int var394 = class343.field4627.method92(1);
                    if (class520.method3004(var394, 504757583)) {
                        class329.method2025(102, var393, var392);
                    }
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 == class306.field4162) {
                    class492.method2859(class343.field4627, class403.field5730, 10);
                    class368.field5005 = null;
                    return true;
                } else if (class368.field5005 != class139.field2174) {
                    if (class64.field1098 == class368.field5005) {
                        class439.field6250 = class343.field4627.method111(-121);
                        class368.field5005 = null;
                        class105.field1586 = class81.field1324;
                        return true;
                    } else if (class368.field5005 == class140.field2180) {
                        class368.method2208(false, class150.field2283);
                        class368.field5005 = null;
                        return false;
                    } else if (class368.field5005 == class185.field2598) {
                        int var401 = class343.field4627.method93((byte) 83);
                        int var402 = class343.field4627.method110((byte) 32);
                        int var403 = class343.field4627.method110((byte) 110);
                        int var404 = class343.field4627.method110((byte) 69);
                        int var405 = class343.field4627.method110((byte) 50);
                        int var406 = class343.field4627.method93((byte) 120);
                        if (class520.method3004(var401, 504757583)) {
                            class84.field1367[var402] = true;
                            class108.field1665[var402] = var403;
                            class495.field6927[var402] = var404;
                            class148.field2275[var402] = var405;
                            class476.field6709[var402] = var406;
                        }
                        class368.field5005 = null;
                        return true;
                    } else if (class368.field5005 == class215.field3069) {
                        class193.field2730 = class107.method756(class343.field4627.method110((byte) 115), -111);
                        class368.field5005 = null;
                        return true;
                    } else if (class368.field5005 == class267.field3742) {
                        class189.field2681.method2683((byte) -112);
                        class293.field4035 += 32;
                        class368.field5005 = null;
                        return true;
                    } else if (class63.field1091 == class368.field5005) {
                        int var407 = class343.field4627.method78(-8388608);
                        int var408 = class343.field4627.method93((byte) 98);
                        class189.field2681.method2678((byte) -103, var408, var407);
                        class368.field5005 = null;
                        return true;
                    } else if (class453.field6405 == class368.field5005) {
                        class184.method1148(class278.field3849, false);
                        class368.field5005 = null;
                        return true;
                    } else if (class368.field5005 == class326.field4378) {
                        String var409 = class343.field4627.method100((byte) 95);
                        String var410 = class645.method3719((byte) -71, class621.method3620(-108, class343.field4627));
                        class56.method513(var409, (byte) -126, 6, 0, var409, var410);
                        class368.field5005 = null;
                        return true;
                    } else {
                        class235.method1474((Throwable) null, "T1 - " + (class368.field5005 == null ? -1 : class368.field5005.method2742(-126)) + "," + (class434.field6185 == null ? -1 : class434.field6185.method2742(-118)) + "," + (class625.field9111 == null ? -1 : class625.field9111.method2742(-114)) + " - " + class403.field5730, (byte) 115);
                        class368.method2208(false, false);
                        return true;
                    }
                } else {
                    int var395 = class343.field4627.method93((byte) 109);
                    int var396 = class343.field4627.method93((byte) 77);
                    int var397 = class343.field4627.method93((byte) 114);
                    int var398 = class343.field4627.method93((byte) 111);
                    if (class520.method3004(var395, 504757583) && class618.field8850[var396] != null) {
                        for (int var399 = var397; ~var399 > ~var398; ++var399) {
                            int var400 = class343.field4627.method89((byte) -31);
                            if (var399 < class618.field8850[var396].length && class618.field8850[var396][var399] != null) {
                                class618.field8850[var396][var399].field1835 = var400;
                            }
                        }
                    }
                    class368.field5005 = null;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public static final void method835(int arg0) {
        ++field1948;
        for (class374 var1 = (class374) class526.field7389.method3141(29291); var1 != null; var1 = (class374) class526.field7389.method3141(29291)) {
            class454.method2664(var1, 128);
        }
        if (arg0 <= 48) {
            method835(94);
        }
        int var2;
        int var3;
        if (!class491.field6875.method2608(class103.field1570, (byte) -99)) {
            var2 = class67.field1116;
            var3 = class67.field1116;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method1551();
        for (int var4 = var3; ~var4 >= ~var2; ++var4) {
            client.method1544();
            client.method1538(var4);
            client.method1539(var4);
        }
        client.method1541();
        client.method1556();
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            return null;
        } else {
            ++field1953;
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.method490(true, (class207) null);
        }
        ++field1956;
        class163 var5 = arg0.method1344();
        var5.method1054(super.field2473, super.field2470, super.field2469);
        class157 var6 = class181.field2574.method866(this.field1960, (byte) 79).method3626(131072, 0, this.field1949, -1, (class78) null, arg0, (byte) 106, 0, (class101) null);
        if (var6 != null && var6.method143(arg1, arg2, var5, true)) {
            return true;
        } else {
            if (this.field1958 != -1) {
                class157 var7 = class181.field2574.method866(this.field1958, (byte) 79).method3626(131072, 0, this.field1950, -1, (class78) null, arg0, (byte) 106, 0, (class101) null);
                if (var7 != null && var7.method143(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            if (~this.field1951 != 0) {
                class157 var8 = class181.field2574.method866(this.field1951, (byte) 79).method3626(131072, 0, this.field1947, -1, (class78) null, arg0, (byte) 106, 0, (class101) null);
                if (var8 != null && var8.method143(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method836(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1952;
        boolean var6 = true;
        class11 var7 = new class11(arg0);
        if (arg4 <= 89) {
            method833(-30);
        }
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method82(-109);
            if (~var9 == -1) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class364 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method112(-8838);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method110((byte) 70);
                                    }
                                    int var12 = var7.method112(-8838);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 + -1;
                                    int var13 = 63 & var10;
                                    int var14 = (4050 & var10) >> 6;
                                    var15 = var7.method110((byte) 71) >> 2;
                                    var16 = var14 - -arg3;
                                    var17 = arg5 + var13;
                                } while (var16 <= 0);
                            } while (~var17 >= -1);
                        } while (~(arg2 + -1) >= ~var16);
                    } while (arg1 + -1 <= var17);
                    var18 = class18.field227.method1201((byte) -111, var8);
                } while (var15 == 22 && !class491.field6875.field3367 && ~var18.field4881 == -1 && var18.field4893 != 1 && !var18.field4902);
                if (!var18.method2181(0)) {
                    var6 = false;
                    ++class553.field7629;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method837(String[] arg0, int arg1, int arg2, int arg3) {
        ++field1959;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == arg2) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 - -arg3;
            int var6 = 0;
            for (int var7 = arg3; var5 > var7; ++var7) {
                String var11 = arg0[var7];
                if (var11 != null) {
                    var6 += var11.length();
                } else {
                    var6 += 4;
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; ~var5 < ~var9; ++var9) {
                String var10 = arg0[var9];
                if (var10 != null) {
                    var8.append(var10);
                } else {
                    var8.append("null");
                }
            }
            return var8.toString();
        }
    }
}
