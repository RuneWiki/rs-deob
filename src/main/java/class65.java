import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class65 extends class83 {

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "Ljava/lang/String;")
    public static String field677 = "K";

    @OriginalMember(owner = "client!pn", name = "W", descriptor = "Z")
    public static boolean field682 = false;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!pn", name = "T", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!pn", name = "U", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!pn", name = "X", descriptor = "I")
    public static int field683;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pn", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field684;

    @OriginalMember(owner = "client!pn", name = "V", descriptor = "[[B")
    public static byte[][] field681;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
    public static final void method366(byte arg0, int arg1) {
        ++field680;
        class114 var2 = class200.field2684;
        synchronized (class200.field2684) {
            class200.field2684.method614(-128, arg1);
        }
        class114 var3 = class77.field869;
        synchronized (class77.field869) {
            class77.field869.method614(arg0 + -2, arg1);
        }
        class114 var4 = class12.field111;
        synchronized (class12.field111) {
            class12.field111.method614(-127, arg1);
        }
        class114 var5 = class291.field3956;
        synchronized (class291.field3956) {
            if (arg0 != -126) {
                field682 = true;
            }
            class291.field3956.method614(arg0 + 8, arg1);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field671;
        int[] var3 = super.field916.method1813(arg1, (byte) 116);
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 87, arg1);
            int[] var5 = this.method451(1, 114, arg1);
            int[] var6 = this.method451(2, 114, arg1);
            for (int var7 = 0; class420.field6139 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg0 != 2) {
            this.method35(-40, (byte) 110, (class250) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field683;
        if (~arg0 == -1) {
            super.field924 = ~arg2.method1350(31351) == -2;
        }
        int var4 = -107 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
    public static final void method367(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 <= ~class335.field4462 && ~arg2 >= ~class6.field42) {
            int var5 = class104.method556(class322.field4306, arg1 + 2048, arg0, class310.field4183);
            int var6 = class104.method556(class322.field4306, arg1 ^ 2048, arg3, class310.field4183);
            class72.method415(var5, arg2, var6, arg4, (byte) -4);
        }
        if (arg1 == 0) {
            ++field672;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class65() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(II)Lnq;")
    public static final class123 method368(int arg0, int arg1) {
        ++field676;
        class114 var2 = class330.field4399;
        class123 var3;
        synchronized (class330.field4399) {
            var3 = (class123) class330.field4399.method616(-122, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class339.field4513.method1687(class345.method2013(255, arg0), class164.method877((byte) -65, arg0), 255);
            if (arg1 >= -111) {
                field682 = true;
            }
            class123 var5 = new class123();
            var5.field1572 = arg0;
            if (var4 != null) {
                var5.method652(new class250(var4), false);
            }
            var5.method666(13196);
            if (~var5.field1529 != 0) {
                var5.method668(method368(var5.field1525, -112), 118, method368(var5.field1529, -113));
            }
            if (~var5.field1531 != 0) {
                var5.method661(method368(var5.field1531, -123), method368(var5.field1523, -118), -99);
            }
            if (!class12.field118 && var5.field1522) {
                var5.field1543 = null;
                var5.field1551 = class324.field4322;
                var5.field1574 = class14.field136;
                var5.field1519 = class38.field399;
                var5.field1583 = false;
                var5.field1582 = 0;
            }
            class114 var6 = class330.field4399;
            synchronized (class330.field4399) {
                class330.field4399.method615((byte) -121, (long) arg0, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvm;IBIILqs;II)V")
    public static final void method369(class322 arg0, int arg1, byte arg2, int arg3, int arg4, class438 arg5, int arg6, int arg7) {
        ++field679;
        if (arg2 < 16) {
            field682 = true;
        }
        class285 var8 = null;
        if (~arg4 == -1) {
            var8 = (class285) class173.method906(arg7, arg3, arg6);
        }
        if (arg4 == 1) {
            var8 = (class285) class316.method1828(arg7, arg3, arg6);
        }
        if (~arg4 == -3) {
            var8 = (class285) class165.method878(arg7, arg3, arg6, field684 != null ? field684 : (field684 = method375("io")));
        }
        if (~arg4 == -4) {
            var8 = (class285) class275.method1514(arg7, arg3, arg6);
        }
        if (var8 != null) {
            int var9 = var8.method339(-115);
            int var10 = var8.method351((byte) 103);
            class225 var11 = class281.method1655((byte) -28, var8.method356(10397));
            if (var11.method1206(32427)) {
                class220.method1191(var11, arg6, false, arg3, arg7);
            }
            if (var8.method358((byte) 24)) {
                var8.method357(false, arg0);
            }
            if (arg4 != 0) {
                if (arg4 == 1) {
                    class61.method332(arg7, arg3, arg6);
                    return;
                }
                if (arg4 != 2) {
                    if (arg4 == 3) {
                        class274.method1511(arg7, arg3, arg6);
                        if (var11.field3057 == 1) {
                            arg5.method2722(arg3, 2, arg6);
                            return;
                        }
                    }
                    return;
                }
                client.method1425(arg7, arg3, arg6, field684 != null ? field684 : (field684 = method375("io")));
                if (~var11.field3057 != -1 && ~class315.field4214 < ~(var11.field2995 + arg3) && ~(var11.field2995 + arg6) > ~class340.field4549 && ~(var11.field3019 + arg3) > ~class315.field4214 && ~class340.field4549 < ~(var11.field3019 + arg6)) {
                    arg5.method2710(arg6, var11.field2995, 113, var10, arg3, var11.field3019, var11.field2993, !var11.field3037);
                    return;
                }
                return;
            }
            class353.method2163(arg7, arg3, arg6);
            if (~var11.field3057 != -1) {
                arg5.method2711(var9, var11.field2993, arg3, arg6, !var11.field3037, (byte) 111, var10);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(II)Lqf;")
    public static final class389 method370(int arg0, int arg1) {
        ++field670;
        class114 var2 = class424.field6221;
        class389 var3;
        synchronized (class424.field6221) {
            var3 = (class389) class424.field6221.method616(-70, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class337.field4500.method1687(arg0, 3, 255);
            class389 var5 = new class389();
            if (var4 != null) {
                var5.method2417(new class250(var4), (byte) -61);
            }
            class114 var6 = class424.field6221;
            synchronized (class424.field6221) {
                if (arg1 != 4096) {
                    field682 = true;
                }
                class424.field6221.method615((byte) -106, (long) arg0, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
    public static final void method371(int arg0) {
        ++field674;
        class114 var1 = class333.field4426;
        synchronized (class333.field4426) {
            class333.field4426.method606((byte) 87);
        }
        if (arg0 != 250) {
            method367(-93, -114, 88, -75, -14);
        }
        class114 var2 = class131.field1689;
        synchronized (class131.field1689) {
            class131.field1689.method606((byte) 71);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V")
    public static final void method372(boolean arg0, boolean arg1) {
        ++field675;
        if (arg1) {
            method367(10, 58, 113, -120, -50);
        }
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = field681;
        } else {
            var3 = class295.field4011;
            var2 = 4;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; ++var5) {
            class449.method2771(-32);
            for (int var6 = 0; var6 < class315.field4214 >> 3; ++var6) {
                for (int var7 = 0; ~(class340.field4549 >> 3) < ~var7; ++var7) {
                    boolean var8 = false;
                    int var9 = class94.field1085[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = 3 & var9 >> 24;
                        if (!arg0 || ~var10 == -1) {
                            int var11 = (7 & var9) >> 1;
                            int var12 = (16767435 & var9) >> 14;
                            int var13 = (16383 & var9) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class138.field1777.length; ++var15) {
                                if (class138.field1777[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class416.method2581(var12, arg0, var13, (byte) -113, var7 * 8, var6 * 8, var10, var11, class88.field1003, class36.field352, var3[var15], var5);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class179.method940(var7 * 8, 8, var6 * 8, -118, 8, var5);
                    }
                }
            }
        }
        if (var4 != null) {
            class318.field4233 = class357.method2177(var4[1], var4[0], 4550, var4[2], var4[3]);
            class138.field1773 = var4[4];
        } else {
            class318.field4233 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field673;
        int[][] var3 = super.field927.method1774((byte) -119, arg1);
        if (!arg0) {
            this.method35(57, (byte) -1, (class250) null);
        }
        if (super.field927.field4104) {
            int[] var4 = this.method451(2, 77, arg1);
            int[][] var5 = this.method449(0, true, arg1);
            int[][] var6 = this.method449(1, arg0, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class420.field6139 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)V")
    public static void method373(int arg0) {
        field681 = null;
        field677 = null;
        if (arg0 != 600502892) {
            field677 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method374(boolean arg0, String arg1, int arg2) {
        class211.field2866.field3910 = 1;
        ++field678;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; class7.field65 > var6; ++var6) {
            class123 var9 = method368(var6, -121);
            if ((!arg0 || var9.field1583) && ~var9.field1529 == 0 && var9.field1531 == -1 && var9.field1534 == 0 && var9.field1519.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class359.field5063 = -1;
                    class19.field184 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class359.field5063 = var5;
        class370.field5171 = 0;
        class19.field184 = var4;
        String[] var7 = new String[class359.field5063];
        for (int var8 = arg2; class359.field5063 > var8; ++var8) {
            var7[var8] = method368(var4[var8], -127).field1519;
        }
        class151.method801(var7, class19.field184, (byte) 91);
        class211.field2866.method1684((byte) -69);
        class211.field2866.field3910 = 2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method375(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
