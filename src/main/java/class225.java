import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class225 extends class224 {

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    private int field3637 = 3072;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    private int field3640 = 2048;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    private int field3642 = 1024;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Luf;")
    public static class168 field3641 = class148.method1019(-1720, "<col=80ff00>");

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "[Lgk;")
    public static class265[] field3635;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)I", line = 4)
    public static final int method1544(byte arg0, int arg1) {
        field3634++;
        if (class164.field2634 == 1) {
            return 7;
        } else if (class164.field2634 == 2) {
            return 20;
        } else {
            if (arg0 > -99) {
                method1545((byte) 107);
            }
            if (arg1 == 15) {
                return 13;
            } else if (arg1 == 16) {
                return 3;
            } else if (arg1 == 22) {
                return 8;
            } else if (arg1 == 31) {
                return 14;
            } else if (arg1 == 38) {
                return 2;
            } else if (arg1 == 43) {
                return 15;
            } else if (arg1 == 48) {
                return 17;
            } else if (arg1 == 58) {
                return 11;
            } else if (arg1 == 69) {
                return 6;
            } else if (arg1 == 74) {
                return 20;
            } else if (arg1 == 77) {
                return 1;
            } else if (arg1 == 101) {
                return 12;
            } else if (arg1 == 103) {
                return 19;
            } else if (arg1 == 152) {
                return 16;
            } else if (arg1 == 161) {
                return 4;
            } else if (arg1 == 162) {
                return 9;
            } else if (arg1 == 166) {
                return 10;
            } else if (arg1 == 179) {
                return 18;
            } else if (arg1 == 191) {
                return 5;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 174)
    public final void method80(boolean arg0) {
        this.field3640 = this.field3637 - this.field3642;
        if (arg0) {
            this.method19(48, false, (class153) null);
        }
        field3638++;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 185)
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 195)
    public static void method1545(byte arg0) {
        field3635 = null;
        if (arg0 >= -53) {
            field3641 = (class168) null;
        }
        field3641 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLj;)V", line = 209)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            this.method19(56, true, (class153) null);
        }
        if (arg0 == 0) {
            this.field3642 = arg2.method1069(89);
        } else if (arg0 == 1) {
            this.field3637 = arg2.method1069(110);
        } else if (arg0 == 2) {
            this.field3610 = arg2.method1042((byte) -114) == 1;
        }
        field3633++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[I", line = 257)
    public final int[] method18(byte arg0, int arg1) {
        field3632++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 82 / ((20 - arg0) / 51);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                var3[var6] = (var5[var6] * this.field3640 >> 12) + this.field3642;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[[I", line = 289)
    public final int[][] method17(int arg0, byte arg1) {
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        field3639++;
        if (arg1 != -77) {
            method1546((class127) null, false);
        }
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, arg1 + 80, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                var10[var11] = this.field3642 + (var5[var11] * this.field3640 >> 12);
                var9[var11] = (var8[var11] * this.field3640 >> 12) + this.field3642;
                var7[var11] = this.field3642 + (var6[var11] * this.field3640 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lsb;Z)V", line = 337)
    public static final void method1546(class127 arg0, boolean arg1) {
        class20.field236.method451(-91453648, arg0);
        while (true) {
            class127 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class127[][] var7;
            class127 var79;
            do {
                class127 var78;
                do {
                    class127 var77;
                    do {
                        class127 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class127) class20.field236.method447(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1964);
                                            var3 = var2.field1961;
                                            var4 = var2.field1967;
                                            var5 = var2.field1980;
                                            var6 = var2.field1985;
                                            var7 = class92.field1424[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class227.field3686 == class118.field1835) {
                                                int var9 = class271.field4565[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class244.field4156 != var10) {
                                                    class244.field4156 = var10;
                                                    class76.method445(var10, 112);
                                                    class34.method171(class289.method1985(true));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class111.field1736 != var11) {
                                                    class111.field1736 = var11;
                                                    class190.method1342(var11, 3);
                                                }
                                                int var12 = class172.field2804[0][var3 + 1][var4] + class172.field2804[0][var3][var4] + class172.field2804[0][var3][var4 + 1] + class172.field2804[0][var3 + 1][var4 + 1] >> 2;
                                                class284.method1960(-var12, 3, 15);
                                                var13 = 201.5F;
                                                class90.method622(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class90.method622(var13);
                                            }
                                            if (!var2.field1975) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class127 var14 = class92.field1424[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field1964) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class125.field1937 && var3 > class145.field2245) {
                                                    class127 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field1964 && (var15.field1975 || (var2.field1987 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class125.field1937 && var3 < class85.field1292 - 1) {
                                                    class127 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field1964 && (var16.field1975 || (var2.field1987 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class55.field706 && var4 > class297.field5020) {
                                                    class127 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field1964 && (var17.field1975 || (var2.field1987 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class55.field706 && var4 < class27.field343 - 1) {
                                                    class127 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field1964 && (var18.field1975 || (var2.field1987 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1975 = false;
                                            if (var2.field1982 != null) {
                                                class127 var19 = var2.field1982;
                                                class90.method622(201.5F - (float) (var19.field1985 + 1) * 50.0F);
                                                if (var19.field1973 == null) {
                                                    if (var19.field1963 != null) {
                                                        if (class18.method84(0, var3, var4)) {
                                                            class12.method44(var19.field1963, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, true);
                                                        } else {
                                                            class12.method44(var19.field1963, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class18.method84(0, var3, var4)) {
                                                    class287.method1979(var19.field1973, 0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, true);
                                                } else {
                                                    class287.method1979(var19.field1973, 0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, false);
                                                }
                                                class28 var20 = var19.field1981;
                                                if (var20 != null) {
                                                    if ((var20.field364 & var2.field1965) == 0) {
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    } else {
                                                        class257.method1762(var20.field364, class187.field2968, class140.field2153, class205.field3375, var6, var3, var4);
                                                    }
                                                    var20.field358.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var20.field354 - class187.field2968, var20.field350 - class140.field2153, var20.field362 - class205.field3375, var20.field363);
                                                }
                                                for (int var21 = 0; var21 < var19.field1970; var21++) {
                                                    class91 var22 = var19.field1971[var21];
                                                    if (var22 != null) {
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                        var22.field1408.method112(var22.field1398, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var22.field1394 - class187.field2968, var22.field1397 - class140.field2153, var22.field1404 - class205.field3375, var22.field1407);
                                                    }
                                                }
                                                class90.method622(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field1973 == null) {
                                                if (var2.field1963 != null) {
                                                    if (class18.method84(var6, var3, var4)) {
                                                        class12.method44(var2.field1963, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class12.method44(var2.field1963, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, false);
                                                    }
                                                }
                                            } else if (class18.method84(var6, var3, var4)) {
                                                class287.method1979(var2.field1973, var6, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field1973.field4463 != 12345678 || class72.field965 && var5 <= class142.field2197) {
                                                    class287.method1979(var2.field1973, var6, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class292 var24 = var2.field1969;
                                                if (var24 != null && (var24.field4926 & 0x80000000L) != 0L) {
                                                    if (var24.field4924) {
                                                        class90.method622(var13 + 50.0F - 1.5F);
                                                    }
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    var24.field4919.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var24.field4925 - class187.field2968, var24.field4922 - class140.field2153, var24.field4923 - class205.field3375, var24.field4926);
                                                    if (var24.field4924) {
                                                        class90.method622(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class28 var27 = var2.field1981;
                                            class40 var28 = var2.field1979;
                                            if (var27 != null || var28 != null) {
                                                if (class125.field1937 == var3) {
                                                    var25++;
                                                } else if (class125.field1937 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class55.field706 == var4) {
                                                    var25 += 3;
                                                } else if (class55.field706 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class39.field488[var25];
                                                var2.field1965 = class159.field2505[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field364 & class164.field2633[var25]) == 0) {
                                                    var2.field1988 = 0;
                                                } else if (var27.field364 == 16) {
                                                    var2.field1988 = 3;
                                                    var2.field1983 = class70.field941[var25];
                                                    var2.field1972 = 3 - var2.field1983;
                                                } else if (var27.field364 == 32) {
                                                    var2.field1988 = 6;
                                                    var2.field1983 = class118.field1844[var25];
                                                    var2.field1972 = 6 - var2.field1983;
                                                } else if (var27.field364 == 64) {
                                                    var2.field1988 = 12;
                                                    var2.field1983 = class69.field918[var25];
                                                    var2.field1972 = 12 - var2.field1983;
                                                } else {
                                                    var2.field1988 = 9;
                                                    var2.field1983 = class297.field5013[var25];
                                                    var2.field1972 = 9 - var2.field1983;
                                                }
                                                if ((var27.field364 & var26) != 0 && !class21.method108(var6, var3, var4, var27.field364)) {
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    var27.field358.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var27.field354 - class187.field2968, var27.field350 - class140.field2153, var27.field362 - class205.field3375, var27.field363);
                                                }
                                                if ((var27.field349 & var26) != 0 && !class21.method108(var6, var3, var4, var27.field349)) {
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    var27.field361.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var27.field354 - class187.field2968, var27.field350 - class140.field2153, var27.field362 - class205.field3375, var27.field363);
                                                }
                                            }
                                            if (var28 != null && !class25.method126(var6, var3, var4, var28.field494.method116())) {
                                                class90.method622(var13 - 0.5F);
                                                if ((var28.field507 & var26) != 0) {
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    var28.field494.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var28.field508 + var28.field496 - class187.field2968, var28.field498 - class140.field2153, var28.field509 + var28.field505 - class205.field3375, var28.field497);
                                                } else if (var28.field507 == 256) {
                                                    int var29 = var28.field508 - class187.field2968;
                                                    int var30 = var28.field498 - class140.field2153;
                                                    int var31 = var28.field509 - class205.field3375;
                                                    int var32 = var28.field502;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                        var28.field494.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var28.field496 + var29, var30, var28.field505 + var31, var28.field497);
                                                    } else if (var28.field499 != null) {
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                        var28.field499.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var29, var30, var31, var28.field497);
                                                    }
                                                }
                                                class90.method622(var13);
                                            }
                                            if (var23) {
                                                class292 var35 = var2.field1969;
                                                if (var35 != null && (var35.field4926 & 0x80000000L) == 0L) {
                                                    if (var35.field4924) {
                                                        class90.method622(var13 + 50.0F - 1.5F);
                                                    }
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    var35.field4919.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var35.field4925 - class187.field2968, var35.field4922 - class140.field2153, var35.field4923 - class205.field3375, var35.field4926);
                                                    if (var35.field4924) {
                                                        class90.method622(var13);
                                                    }
                                                }
                                                class130 var36 = var2.field1986;
                                                if (var36 != null && var36.field2026 == 0) {
                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    if (var36.field2014 != null) {
                                                        var36.field2014.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var36.field2017 - class187.field2968, var36.field2012 - class140.field2153, var36.field2013 - class205.field3375, var36.field2021);
                                                    }
                                                    if (var36.field2016 != null) {
                                                        var36.field2016.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var36.field2017 - class187.field2968, var36.field2012 - class140.field2153, var36.field2013 - class205.field3375, var36.field2021);
                                                    }
                                                    if (var36.field2018 != null) {
                                                        var36.field2018.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var36.field2017 - class187.field2968, var36.field2012 - class140.field2153, var36.field2013 - class205.field3375, var36.field2021);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field1987;
                                            if (var37 != 0) {
                                                if (var3 < class125.field1937 && (var37 & 0x4) != 0) {
                                                    class127 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field1964) {
                                                        class20.field236.method451(-91453648, var38);
                                                    }
                                                }
                                                if (var4 < class55.field706 && (var37 & 0x2) != 0) {
                                                    class127 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field1964) {
                                                        class20.field236.method451(-91453648, var39);
                                                    }
                                                }
                                                if (var3 > class125.field1937 && (var37 & 0x1) != 0) {
                                                    class127 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field1964) {
                                                        class20.field236.method451(-91453648, var40);
                                                    }
                                                }
                                                if (var4 > class55.field706 && (var37 & 0x8) != 0) {
                                                    class127 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field1964) {
                                                        class20.field236.method451(-91453648, var41);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1988 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field1970; var43++) {
                                                if (class238.field3842 != var2.field1971[var43].field1403 && (var2.field1977[var43] & var2.field1988) == var2.field1983) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class28 var44 = var2.field1981;
                                                if (!class21.method108(var6, var3, var4, var44.field364)) {
                                                    label593: {
                                                        if ((var44.field363 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field354 - class187.field2968;
                                                            int var46 = var44.field362 - class205.field3375;
                                                            int var47 = (int) (var44.field363 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class244.field4160 - 1) {
                                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class117.field1821 - 1 && var4 < class244.field4160 - 1) {
                                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class117.field1821 - 1 && var4 > 0) {
                                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                    }
                                                    var44.field358.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var44.field354 - class187.field2968, var44.field350 - class140.field2153, var44.field362 - class205.field3375, var44.field363);
                                                }
                                                var2.field1988 = 0;
                                            }
                                        }
                                        if (!var2.field1962) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field1970;
                                            var2.field1962 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class91 var51 = var2.field1971[var50];
                                                if (class238.field3842 != var51.field1403) {
                                                    for (int var52 = var51.field1410; var52 <= var51.field1406; var52++) {
                                                        for (int var53 = var51.field1412; var53 <= var51.field1400; var53++) {
                                                            class127 var54 = var7[var52][var53];
                                                            if (var54.field1975) {
                                                                var2.field1962 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field1988 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field1410) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field1406) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field1412) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field1400) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field1988) == var2.field1972) {
                                                                    var2.field1962 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class216.field3524[var49++] = var51;
                                                    int var56 = class125.field1937 - var51.field1410;
                                                    int var57 = var51.field1406 - class125.field1937;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class55.field706 - var51.field1412;
                                                    int var59 = var51.field1400 - class55.field706;
                                                    if (var59 > var58) {
                                                        var51.field1399 = var56 + var59;
                                                    } else {
                                                        var51.field1399 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class91 var63 = class216.field3524[var62];
                                                    if (class238.field3842 != var63.field1403) {
                                                        if (var63.field1399 > var60) {
                                                            var60 = var63.field1399;
                                                            var61 = var62;
                                                        } else if (var63.field1399 == var60) {
                                                            int var64 = var63.field1394 - class187.field2968;
                                                            int var65 = var63.field1404 - class205.field3375;
                                                            int var66 = class216.field3524[var61].field1394 - class187.field2968;
                                                            int var67 = class216.field3524[var61].field1404 - class205.field3375;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class91 var68 = class216.field3524[var61];
                                                var68.field1403 = class238.field3842;
                                                if (!class193.method1365(var6, var68.field1410, var68.field1406, var68.field1412, var68.field1400, var68.field1408.method116())) {
                                                    if ((var68.field1407 & 0xFC000L) == 147456L) {
                                                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                                                        int var69 = var68.field1394 - class187.field2968;
                                                        int var70 = var68.field1404 - class205.field3375;
                                                        int var71 = (int) (var68.field1407 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class257.method1766(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class257.method1766(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class257.method1766(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class257.method1766(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class257.method1765(class187.field2968, class140.field2153, class205.field3375, var5, var68.field1410, var68.field1412, var68.field1406, var68.field1400);
                                                    }
                                                    var68.field1408.method112(var68.field1398, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var68.field1394 - class187.field2968, var68.field1397 - class140.field2153, var68.field1404 - class205.field3375, var68.field1407);
                                                }
                                                for (int var72 = var68.field1410; var72 <= var68.field1406; var72++) {
                                                    for (int var73 = var68.field1412; var73 <= var68.field1400; var73++) {
                                                        class127 var74 = var7[var72][var73];
                                                        if (var74.field1988 != 0) {
                                                            class20.field236.method451(-91453648, var74);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field1964) {
                                                            class20.field236.method451(-91453648, var74);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1962) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field1962 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1964);
                            } while (var2.field1988 != 0);
                            if (var3 > class125.field1937 || var3 <= class145.field2245) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field1964);
                        if (var3 < class125.field1937 || var3 >= class85.field1292 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field1964);
                    if (var4 > class55.field706 || var4 <= class297.field5020) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field1964);
                if (var4 < class55.field706 || var4 >= class27.field343 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field1964);
            var2.field1964 = false;
            class28.field365--;
            class130 var80 = var2.field1986;
            if (var80 != null && var80.field2026 != 0) {
                class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                if (var80.field2014 != null) {
                    var80.field2014.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var80.field2017 - class187.field2968, var80.field2012 - class140.field2153 - var80.field2026, var80.field2013 - class205.field3375, var80.field2021);
                }
                if (var80.field2016 != null) {
                    var80.field2016.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var80.field2017 - class187.field2968, var80.field2012 - class140.field2153 - var80.field2026, var80.field2013 - class205.field3375, var80.field2021);
                }
                if (var80.field2018 != null) {
                    var80.field2018.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var80.field2017 - class187.field2968, var80.field2012 - class140.field2153 - var80.field2026, var80.field2013 - class205.field3375, var80.field2021);
                }
            }
            if (var2.field1965 != 0) {
                class40 var81 = var2.field1979;
                if (var81 != null && !class25.method126(var6, var3, var4, var81.field494.method116())) {
                    if ((var81.field507 & var2.field1965) != 0) {
                        class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                        var81.field494.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var81.field508 + var81.field496 - class187.field2968, var81.field498 - class140.field2153, var81.field509 + var81.field505 - class205.field3375, var81.field497);
                    } else if (var81.field507 == 256) {
                        int var82 = var81.field508 - class187.field2968;
                        int var83 = var81.field498 - class140.field2153;
                        int var84 = var81.field509 - class205.field3375;
                        int var85 = var81.field502;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                            var81.field494.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var81.field496 + var82, var83, var81.field505 + var84, var81.field497);
                        } else if (var81.field499 != null) {
                            class257.method1763(class187.field2968, class140.field2153, class205.field3375, var5, var3, var4);
                            var81.field499.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var82, var83, var84, var81.field497);
                        }
                    }
                }
                class28 var88 = var2.field1981;
                if (var88 != null) {
                    if ((var88.field349 & var2.field1965) != 0 && !class21.method108(var6, var3, var4, var88.field349)) {
                        class257.method1762(var88.field349, class187.field2968, class140.field2153, class205.field3375, var6, var3, var4);
                        var88.field361.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var88.field354 - class187.field2968, var88.field350 - class140.field2153, var88.field362 - class205.field3375, var88.field363);
                    }
                    if ((var88.field364 & var2.field1965) != 0 && !class21.method108(var6, var3, var4, var88.field364)) {
                        class257.method1762(var88.field364, class187.field2968, class140.field2153, class205.field3375, var6, var3, var4);
                        var88.field358.method112(0, class293.field4951, class217.field3545, class127.field1956, class82.field1186, var88.field354 - class187.field2968, var88.field350 - class140.field2153, var88.field362 - class205.field3375, var88.field363);
                    }
                }
            }
            if (var5 < class300.field5087 - 1) {
                class127 var89 = class92.field1424[var5 + 1][var3][var4];
                if (var89 != null && var89.field1964) {
                    class20.field236.method451(-91453648, var89);
                }
            }
            if (var3 < class125.field1937) {
                class127 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field1964) {
                    class20.field236.method451(-91453648, var90);
                }
            }
            if (var4 < class55.field706) {
                class127 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field1964) {
                    class20.field236.method451(-91453648, var91);
                }
            }
            if (var3 > class125.field1937) {
                class127 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field1964) {
                    class20.field236.method451(-91453648, var92);
                }
            }
            if (var4 > class55.field706) {
                class127 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field1964) {
                    class20.field236.method451(-91453648, var93);
                }
            }
        }
    }
}
