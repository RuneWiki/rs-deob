import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class221 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[Lvd;")
    private class305[] field3502;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lbm;")
    public static class307 field3508;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[Loj;")
    public static class283[] field3507;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1470(int arg0) {
        if (arg0 != -1) {
            method1474(-51);
        }
        field3504++;
        for (class160 var1 = (class160) class136.field2276.method424(arg0 ^ 0x7D); var1 != null; var1 = (class160) class136.field2276.method425(-32547)) {
            class301 var2 = var1.field2609;
            if (class289.field4438 != var2.field4566 || var2.field4549) {
                var1.method278((byte) -105);
            } else if (var2.field4560 <= class25.field494) {
                var2.method2002(53, class176.field2836);
                if (var2.field4549) {
                    var1.method278((byte) -105);
                } else {
                    class50.method380(var2.field4566, var2.field4563, var2.field4567, var2.field4561, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1471(int arg0) {
        field3509++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class48.field999 - 1); var2++) {
                if (class120.field2088[var2] < 1000 && class120.field2088[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class296.field4515[var2];
                    class296.field4515[var2] = class296.field4515[var2 + 1];
                    class296.field4515[var2 + 1] = var3;
                    String var4 = class256.field3998[var2];
                    class256.field3998[var2] = class256.field3998[var2 + 1];
                    class256.field3998[var2 + 1] = var4;
                    int var5 = class153.field2502[var2];
                    class153.field2502[var2] = class153.field2502[var2 + 1];
                    class153.field2502[var2 + 1] = var5;
                    int var6 = class255.field3988[var2];
                    class255.field3988[var2] = class255.field3988[var2 + 1];
                    class255.field3988[var2 + 1] = var6;
                    int var7 = class169.field2715[var2];
                    class169.field2715[var2] = class169.field2715[var2 + 1];
                    class169.field2715[var2 + 1] = var7;
                    short var8 = class120.field2088[var2];
                    class120.field2088[var2] = class120.field2088[var2 + 1];
                    class120.field2088[var2 + 1] = var8;
                    long var9 = class11.field226[var2];
                    class11.field226[var2] = class11.field226[var2 + 1];
                    class11.field226[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != -30393) {
            field3510 = -123;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lhm;I)V", line = 103)
    public static final void method1472(class109 arg0, int arg1) {
        field3501++;
        if (arg0.field1859 == 0) {
            return;
        }
        class322 var2 = arg0.method698(arg1 ^ 0x69);
        if (arg0.field1878 != -1 && arg0.field1878 < 32768) {
            class255 var3 = class8.field179[arg0.field1878];
            if (var3 != null) {
                int var4 = arg0.field1869 - var3.field1869;
                int var5 = arg0.field1872 - var3.field1872;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1886 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 != 1) {
            method1472((class109) null, 7);
        }
        if (arg0.field1878 >= 32768) {
            int var6 = arg0.field1878 - 32768;
            if (class100.field1758 == var6) {
                var6 = 2047;
            }
            class278 var7 = class97.field1715[var6];
            if (var7 != null) {
                int var8 = arg0.field1872 - var7.field1872;
                int var9 = arg0.field1869 - var7.field1869;
                if (var9 != 0 || var8 != 0) {
                    arg0.field1886 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1900 != 0 || arg0.field1887 != 0) && (arg0.field1877 == 0 || arg0.field1930 > 0)) {
            int var10 = arg0.field1869 - ((arg0.field1900 - class246.field3818 - class246.field3818) * 64);
            int var11 = arg0.field1872 - ((arg0.field1887 - class101.field1769 - class101.field1769) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field1886 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field1887 = 0;
            arg0.field1900 = 0;
        }
        int var12 = arg0.field1886 - arg0.field1927 & 0x7FF;
        if (var12 == 0) {
            arg0.field1944 = 0;
            arg0.field1939 = 0;
        } else if (var2.field4932 == 0) {
            arg0.field1944++;
            if (var12 <= 1024) {
                arg0.field1927 += arg0.field1859;
                boolean var20 = true;
                if (arg0.field1859 > var12 || (2048 - arg0.field1859) < var12) {
                    var20 = false;
                    arg0.field1927 = arg0.field1886;
                }
                if (arg0.field1944 > 25 || var20) {
                    arg0.field1893 = var2.field4901;
                    if (arg0.field1877 > 0) {
                        if (arg0.field1879[arg0.field1877 - 1] == 2) {
                            if (var2.field4930 != -1) {
                                arg0.field1893 = var2.field4930;
                            } else if (var2.field4936 != -1) {
                                arg0.field1893 = var2.field4936;
                            }
                        } else if (arg0.field1879[arg0.field1877 - 1] == 0) {
                            if (var2.field4924 != -1) {
                                arg0.field1893 = var2.field4924;
                            } else if (var2.field4910 != -1) {
                                arg0.field1893 = var2.field4910;
                            }
                        } else if (var2.field4900 != -1) {
                            arg0.field1893 = var2.field4900;
                        }
                    } else if (var2.field4919 != -1) {
                        arg0.field1893 = var2.field4919;
                    }
                }
            } else {
                arg0.field1927 -= arg0.field1859;
                boolean var21 = true;
                if (var12 < arg0.field1859 || var12 > (2048 - arg0.field1859)) {
                    arg0.field1927 = arg0.field1886;
                    var21 = false;
                }
                if (arg0.field1944 > 25 || var21) {
                    arg0.field1893 = var2.field4901;
                    if (arg0.field1877 > 0) {
                        if (arg0.field1879[arg0.field1877 - 1] == 2) {
                            if (var2.field4925 != -1) {
                                arg0.field1893 = var2.field4925;
                            } else if (var2.field4936 != -1) {
                                arg0.field1893 = var2.field4936;
                            }
                        } else if (arg0.field1879[arg0.field1877 - 1] == 0) {
                            if (var2.field4926 != -1) {
                                arg0.field1893 = var2.field4926;
                            } else if (var2.field4910 != -1) {
                                arg0.field1893 = var2.field4910;
                            }
                        } else if (var2.field4937 != -1) {
                            arg0.field1893 = var2.field4937;
                        }
                    } else if (var2.field4929 != -1) {
                        arg0.field1893 = var2.field4929;
                    }
                }
            }
            arg0.field1927 &= 0x7FF;
        } else {
            arg0.field1893 = -1;
            int var13 = arg0.field1886 << 5;
            if (arg0.field1936 != var13) {
                arg0.field1936 = var13;
                int var14 = var13 - arg0.field1955 & 0xFFFF;
                arg0.field1889 = 0;
                int var15 = arg0.field1939 * arg0.field1939 / (var2.field4932 * 2);
                if (arg0.field1939 > 0 && var14 >= var15 && (var14 - var15) < 32768) {
                    arg0.field1906 = true;
                    arg0.field1914 = var14 / 2;
                    int var16 = var2.field4927 * var2.field4927 / (var2.field4932 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg0.field1914 > var16) {
                        arg0.field1914 = var14 - var16;
                    }
                } else if (arg0.field1939 < 0 && var15 <= 65536 - var14 && 65536 - (var14 + var15) < 32768) {
                    arg0.field1906 = true;
                    arg0.field1914 = (65536 - var14) / 2;
                    int var17 = var2.field4927 * var2.field4927 / (var2.field4932 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (var17 < arg0.field1914) {
                        arg0.field1914 = 65536 - var14 - var17;
                    }
                } else {
                    arg0.field1906 = false;
                }
            }
            if (arg0.field1939 == 0) {
                int var18 = arg0.field1936 - arg0.field1955 & 0xFFFF;
                if (var2.field4932 <= var18) {
                    int var19 = var2.field4927 * var2.field4927 / (var2.field4932 * 2);
                    arg0.field1906 = true;
                    arg0.field1889 = 0;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field1914 = var18 / 2;
                        if (arg0.field1914 > var19) {
                            arg0.field1914 = var18 - var19;
                        }
                        arg0.field1939 = var2.field4932;
                    } else {
                        arg0.field1939 = -var2.field4932;
                        arg0.field1914 = (65536 - var18) / 2;
                        if (var19 < arg0.field1914) {
                            arg0.field1914 = 65536 - var19 - var18;
                        }
                    }
                } else {
                    arg0.field1955 = arg0.field1936;
                }
            } else if (arg0.field1939 > 0) {
                if (arg0.field1914 <= arg0.field1889) {
                    arg0.field1906 = false;
                }
                if (!arg0.field1906) {
                    arg0.field1939 -= var2.field4932;
                    if (arg0.field1939 < 0) {
                        arg0.field1939 = 0;
                    }
                } else if (arg0.field1939 < var2.field4927) {
                    arg0.field1939 += var2.field4932;
                }
            } else {
                if (arg0.field1889 >= arg0.field1914) {
                    arg0.field1906 = false;
                }
                if (!arg0.field1906) {
                    arg0.field1939 += var2.field4932;
                    if (arg0.field1939 > 0) {
                        arg0.field1939 = 0;
                    }
                } else if (arg0.field1939 > -var2.field4927) {
                    arg0.field1939 -= var2.field4932;
                }
            }
            arg0.field1955 += arg0.field1939;
            arg0.field1955 &= 0xFFFF;
            arg0.field1927 = arg0.field1955 >> 5;
            if (arg0.field1939 <= 0) {
                arg0.field1889 -= arg0.field1939;
            } else {
                arg0.field1889 += arg0.field1939;
            }
            if (arg0.field1939 >= 0) {
                if (arg0.field1877 > 0) {
                    if (arg0.field1879[arg0.field1877 - 1] == 2) {
                        if (var2.field4930 != -1) {
                            arg0.field1893 = var2.field4930;
                        } else if (var2.field4936 != -1) {
                            arg0.field1893 = var2.field4936;
                        }
                    } else if (arg0.field1879[arg0.field1877 - 1] == 0) {
                        if (var2.field4924 != -1) {
                            arg0.field1893 = var2.field4924;
                        } else if (var2.field4910 != -1) {
                            arg0.field1893 = var2.field4910;
                        }
                    }
                }
                if (arg0.field1893 == -1) {
                    if (var2.field4900 != -1) {
                        arg0.field1893 = var2.field4900;
                    } else if (var2.field4919 != -1) {
                        arg0.field1893 = var2.field4919;
                    }
                }
            } else {
                if (arg0.field1877 > 0) {
                    if (arg0.field1879[arg0.field1877 - 1] == 2) {
                        if (var2.field4925 != -1) {
                            arg0.field1893 = var2.field4925;
                        } else if (var2.field4936 != -1) {
                            arg0.field1893 = var2.field4936;
                        }
                    } else if (arg0.field1879[arg0.field1877 - 1] == 0) {
                        if (var2.field4926 != -1) {
                            arg0.field1893 = var2.field4926;
                        } else if (var2.field4910 != -1) {
                            arg0.field1893 = var2.field4910;
                        }
                    }
                }
                if (arg0.field1893 == -1) {
                    if (var2.field4937 != -1) {
                        arg0.field1893 = var2.field4937;
                    } else if (var2.field4929 != -1) {
                        arg0.field1893 = var2.field4929;
                    }
                }
            }
            if (arg0.field1893 == -1) {
                arg0.field1893 = var2.field4901;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 538)
    public static final void method1473(boolean arg0) {
        class185.method1182((byte) 68, class259.field4028);
        field3505++;
        int var1 = (class38.field742 >> 10) + (class246.field3818 >> 3);
        int var2 = (class283.field4381 >> 10) + (class101.field1769 >> 3);
        byte var3 = 8;
        byte var4 = 8;
        byte var5 = 0;
        byte var6 = 18;
        class334.field5125 = new int[var6];
        class18.field334 = new int[var6];
        class85.field1602 = new int[var6];
        class218.field3458 = new byte[var6][];
        client.field905 = new byte[var6][];
        class164.field2654 = new byte[var6][];
        class45.field934 = new int[var6][4];
        class95.field1708 = new int[var6];
        class292.field4474 = new byte[var6][];
        class131.field2228 = new int[var6];
        class31.field626 = new int[var6];
        class72.field1502 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class95.field1708[var7] = var10;
                class334.field5125[var7] = class138.field2304.method2052("m" + var8 + "_" + var9, true);
                class85.field1602[var7] = class138.field2304.method2052("l" + var8 + "_" + var9, true);
                class31.field626[var7] = class138.field2304.method2052("n" + var8 + "_" + var9, true);
                class18.field334[var7] = class138.field2304.method2052("um" + var8 + "_" + var9, true);
                class131.field2228[var7] = class138.field2304.method2052("ul" + var8 + "_" + var9, true);
                if (class31.field626[var7] == -1) {
                    class334.field5125[var7] = -1;
                    class85.field1602[var7] = -1;
                    class18.field334[var7] = -1;
                    class131.field2228[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class31.field626.length; var11++) {
            class31.field626[var11] = -1;
            class334.field5125[var11] = -1;
            class85.field1602[var11] = -1;
            class18.field334[var11] = -1;
            class131.field2228[var11] = -1;
        }
        class33.method262(var1, var3, var2, -1, false, var5, var4, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 627)
    public static void method1474(int arg0) {
        field3507 = null;
        if (arg0 == -1) {
            field3508 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I", line = 642)
    public static final int method1475(int arg0, int arg1, int arg2) {
        field3506++;
        class281 var3 = (class281) class21.field449.method303((long) arg0, (byte) 116);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field4324.length) {
            if (arg1 < 72) {
                method1470(-21);
            }
            return var3.field4324[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 665)
    public class221(int arg0) {
        this.field3502 = new class305[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class305 var3 = this.field3502[var2] = new class305();
            var3.field4611 = var3;
            var3.field4614 = var3;
        }
    }
}
