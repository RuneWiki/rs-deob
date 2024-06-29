import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class104 extends class84 {

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1508 = new String[200];

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "[[Z")
    public static boolean[][] field1516;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public static final void method776(int arg0) {
        ++field1513;
        class67.field991 = new class144(32);
        if (arg0 != -20481) {
            method779(29L, 47);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
    private class104(int arg0) {
        super(0, false);
        this.method777(arg0, 29957);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    private final void method777(int arg0, int arg1) {
        this.field1515 = (65280 & arg0) >> 4;
        this.field1506 = (255 & arg0) << 4;
        this.field1507 = (16711680 & arg0) >> 12;
        ++field1509;
        if (arg1 != 29957) {
            this.field1515 = 62;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != -18) {
            field1512 = 27;
        }
        ++field1511;
        int[][] var3 = super.field1211.method193((byte) -126, arg0);
        if (super.field1211.field321) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class20.field221; ++var7) {
                var4[var7] = this.field1507;
                var6[var7] = this.field1515;
                var5[var7] = this.field1506;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 < 87) {
            this.field1506 = 116;
        }
        if (arg2 == 0) {
            this.method777(arg0.method1128((byte) -102), 29957);
        }
        ++field1514;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILbe;II)V")
    public static final void method778(int arg0, class29 arg1, int arg2, int arg3) {
        ++field1510;
        if (~(32 & arg0) != -1) {
            int var4 = class50.field732.method1113(19226);
            int var5 = class50.field732.method1111(255);
            int var6 = class50.field732.method1096((byte) -104);
            boolean var7 = ~(32768 & var4) != -1;
            int var8 = class50.field732.field2511;
            if (arg1.field344 != null && arg1.field346 != null) {
                long var9 = class193.method1431(arg1.field344, false);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var7 && (class81.field1174 && !class145.field2352 || class135.field2212)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class180.field2895; ++var12) {
                            if (~class81.field1177[var12] == ~var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class78.field1136 == 0) {
                    class125.field1838.field2511 = 0;
                    class50.field732.method1093(class125.field1838.field2523, (byte) 49, var6, 0);
                    int var13 = -1;
                    class125.field1838.field2511 = 0;
                    String var14;
                    if (!var7) {
                        var14 = class170.method1251(class217.method1561(-22880, class120.method875(100, class125.field1838)));
                    } else {
                        var4 &= 32767;
                        class75 var15 = class196.method1450(class125.field1838, (byte) 116);
                        var13 = var15.field1086;
                        var14 = var15.field1084.method1329(-6359, class125.field1838);
                    }
                    arg1.field1872 = var14.trim();
                    arg1.field1912 = 255 & var4;
                    arg1.field1961 = 150;
                    arg1.field1955 = var4 >> 8;
                    if (~var5 == -3) {
                        class245.method1756(-1635, var14, var13, "<img=1>" + arg1.method208(30657), var7 ? 17 : 1, (String) null);
                    } else if (~var5 != -2) {
                        class245.method1756(arg2 + -1636, var14, var13, arg1.method208(arg2 ^ 30656), var7 ? 17 : 2, (String) null);
                    } else {
                        class245.method1756(-1635, var14, var13, "<img=0>" + arg1.method208(30657), !var7 ? 1 : 17, (String) null);
                    }
                }
            }
            class50.field732.field2511 = var6 + var8;
        }
        if ((arg0 & arg2) != 0) {
            int var16 = class50.field732.method1103(3);
            int var17 = class50.field732.method1111(arg2 ^ 254);
            arg1.method922(67, class264.field4290, var16, var17);
            arg1.field1919 = class264.field4290 + 300;
            arg1.field1972 = class50.field732.method1116((byte) 110);
        }
        if (~(arg0 & 128) != -1) {
            arg1.field1894 = class50.field732.method1071((byte) 40);
            if (~arg1.field1894 == -65536) {
                arg1.field1894 = -1;
            }
        }
        if ((arg0 & 16) != 0) {
            arg1.field1872 = class50.field732.method1078(-1);
            if (arg1.field1872.charAt(0) != '~') {
                if (class186.field2993 == arg1) {
                    class172.method1276(2, arg1.method208(30657), (byte) 40, arg1.field1872);
                }
            } else {
                arg1.field1872 = arg1.field1872.substring(1);
                class172.method1276(2, arg1.method208(arg2 + 30656), (byte) 40, arg1.field1872);
            }
            arg1.field1961 = 150;
            arg1.field1955 = 0;
            arg1.field1912 = 0;
        }
        if ((arg0 & 512) != 0) {
            arg1.field1901 = class50.field732.method1085(-106);
            arg1.field1952 = class50.field732.method1096((byte) -47);
            arg1.field1874 = class50.field732.method1096((byte) -115);
            arg1.field1904 = class50.field732.method1096((byte) -118);
            arg1.field1913 = class50.field732.method1071((byte) 46) + class264.field4290;
            arg1.field1902 = class50.field732.method1113(19226) + class264.field4290;
            arg1.field1890 = class50.field732.method1085(-82);
            arg1.field1933 = 1;
            arg1.field1920 = 0;
        }
        if (~(64 & arg0) != -1) {
            arg1.field1975 = class50.field732.method1126(false);
            arg1.field1885 = class50.field732.method1072(-121);
        }
        if ((256 & arg0) != 0) {
            int var18 = class50.field732.method1116((byte) 93);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; ~var18 < ~var22; ++var22) {
                int var23 = class50.field732.method1071((byte) 114);
                if (~var23 == -65536) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var21[var22] = class50.field732.method1111(255);
                var20[var22] = class50.field732.method1072(111);
            }
            class33.method246(var20, arg1, var21, 127, var19);
        }
        if (~(arg0 & 8) != -1) {
            int var24 = class50.field732.method1072(89);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class50.field732.method1085(-103);
            class149.method1058(arg1, 127, var25, var24);
        }
        if ((arg0 & 2) != 0) {
            int var26 = class50.field732.method1096((byte) -63);
            byte[] var27 = new byte[var26];
            class152 var28 = new class152(var27);
            class50.field732.method1106(var26, var27, 0, (byte) 2);
            class239.field3812[arg3] = var28;
            arg1.method203(var28, (byte) -128);
        }
        if ((arg0 & 1024) != 0) {
            int var29 = class50.field732.method1126(false);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = class50.field732.method1132(-15432);
            boolean var31 = true;
            if (var29 != -1 && arg1.field1934 != -1 && class285.method1939(class187.method1387((byte) 123, var29).field794, 112).field2278 < class285.method1939(class187.method1387((byte) 95, arg1.field1934).field794, 112).field2278) {
                var31 = false;
            }
            if (var31) {
                arg1.field1934 = var29;
                arg1.field1878 = class264.field4290 - -(var30 & 65535);
                arg1.field1944 = var30 >> 16;
                arg1.field1891 = 0;
                arg1.field1948 = 0;
                if (class264.field4290 < arg1.field1878) {
                    arg1.field1948 = -1;
                }
                arg1.field1923 = 1;
                if (~arg1.field1934 != 0 && class264.field4290 == arg1.field1878) {
                    int var32 = class187.method1387((byte) 35, arg1.field1934).field794;
                    if (~var32 != 0) {
                        class141 var33 = class285.method1939(var32, 112);
                        if (var33 != null && var33.field2252 != null) {
                            class263.method1845(0, arg1.field1910, class186.field2993 == arg1, arg1.field1979, (byte) -44, var33);
                        }
                    }
                }
            }
        }
        if (~(arg0 & 2048) != -1) {
            int var34 = class50.field732.method1103(3);
            int var35 = class50.field732.method1116((byte) 104);
            arg1.method922(63, class264.field4290, var34, var35);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method779(long arg0, int arg1) {
        int var3 = 68 / ((72 - arg1) / 35);
        ++field1505;
        return class2.method7(0, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static void method780(byte arg0) {
        field1508 = null;
        field1516 = null;
        if (arg0 > -13) {
            method779(97L, 114);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class104() {
        this(0);
    }
}
