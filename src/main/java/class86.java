import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class86 extends class43 {

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "Lq;")
    public static class174 field1496 = new class174(4);

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "Lmb;")
    public static class132 field1498 = class166.method1092(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 125);

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "Lkg;")
    public static class115 field1497 = new class115(64);

    @OriginalMember(owner = "client!hi", name = "gb", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "Lq;")
    public static class174 field1501 = new class174(500);

    @OriginalMember(owner = "client!hi", name = "ib", descriptor = "Lmb;")
    private static class132 field1504 = class166.method1092("Loaded config", 119);

    @OriginalMember(owner = "client!hi", name = "jb", descriptor = "[[I")
    public static int[][] field1505 = new int[104][104];

    @OriginalMember(owner = "client!hi", name = "kb", descriptor = "Lmb;")
    public static class132 field1506 = field1504;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "[I")
    public static int[] field1500;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "[Lvi;")
    public static class233[] field1499;

    @OriginalMember(owner = "client!hi", name = "hb", descriptor = "[Lhh;")
    public static class85[] field1503;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)V")
    public static void method535(int arg0) {
        field1497 = null;
        field1503 = null;
        if (arg0 != 13789) {
            field1506 = null;
        }
        field1504 = null;
        field1501 = null;
        field1498 = null;
        field1499 = null;
        field1500 = null;
        field1496 = null;
        field1505 = null;
        field1506 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lff;")
    public static final class62 method536(Throwable arg0, String arg1) {
        ++field1492;
        class62 var2;
        if (!(arg0 instanceof class62)) {
            var2 = new class62(arg0, arg1);
        } else {
            var2 = (class62) arg0;
            var2.field1039 = var2.field1039 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)Lbc;")
    public static final class15 method537(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 != null && var3.field3100 != null ? var3.field3100 : null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILpb;ZI)V")
    public static final void method538(int arg0, int arg1, int arg2, class165 arg3, boolean arg4, int arg5) {
        if (arg2 > -24) {
            field1498 = null;
        }
        class65.field1065 = 10000;
        class55.field940 = arg5;
        class52.field881 = arg1;
        class45.field785 = arg4;
        class88.field1545 = arg0;
        class39.field633 = 1;
        ++field1490;
        class25.field405 = arg3;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
    public static final void method539(int arg0, byte arg1) {
        ++field1494;
        class153.field2789 += arg0 * 128;
        if (~class153.field2789 < ~class63.field1047.length) {
            class153.field2789 -= class63.field1047.length;
            int var2 = (int) (Math.random() * 12.0D);
            class2.method11(class65.field1071[var2], true);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var3 - arg0) * 128;
        for (int var7 = 0; var7 < var6; ++var7) {
            int var28 = class93.field1633[var4 - -var5] + -(class63.field1047[class153.field2789 + var4 & class63.field1047.length - 1] * arg0 / 6);
            if (~var28 > -1) {
                var28 = 0;
            }
            class93.field1633[var4++] = var28;
        }
        int var8 = -47 % ((-47 - arg1) / 50);
        for (int var9 = -arg0 + var3; var9 < var3; ++var9) {
            int var25 = var9 * 128;
            for (int var26 = 0; ~var26 > -129; ++var26) {
                int var27 = (int) (Math.random() * 100.0D);
                if (var27 < 50 && var26 > 10 && ~var26 > -119) {
                    class93.field1633[var25 + var26] = 255;
                } else {
                    class93.field1633[var25 + var26] = 0;
                }
            }
        }
        if (class22.field319 > 0) {
            class22.field319 -= arg0 * 4;
        }
        if (class241.field4326 > 0) {
            class241.field4326 -= arg0 * 4;
        }
        if (~class22.field319 == -1 && class241.field4326 == 0) {
            int var10 = (int) (Math.random() * (double) (2000 / arg0));
            if (~var10 == -1) {
                class22.field319 = 1024;
            }
            if (~var10 == -2) {
                class241.field4326 = 1024;
            }
        }
        for (int var11 = 0; ~var11 > ~(-arg0 + var3); ++var11) {
            class9.field99[var11] = class9.field99[var11 - -arg0];
        }
        for (int var12 = var3 - arg0; ~var12 > ~var3; ++var12) {
            class9.field99[var12] = (int) (Math.sin((double) class194.field3605 / 14.0D) * 16.0D + Math.sin((double) class194.field3605 / 15.0D) * 14.0D + Math.sin((double) class194.field3605 / 16.0D) * 12.0D);
            ++class194.field3605;
        }
        class64.field1062 += arg0;
        int var13 = ((1 & class30.field460) + arg0) / 2;
        if (~var13 < -1) {
            for (int var14 = 0; class64.field1062 * 100 > var14; ++var14) {
                int var23 = (int) (Math.random() * 124.0D) + 2;
                int var24 = 128 + (int) (Math.random() * 128.0D);
                class93.field1633[(var24 << 7) + var23] = 192;
            }
            class64.field1062 = 0;
            for (int var15 = 0; ~var3 < ~var15; ++var15) {
                int var20 = 0;
                int var21 = var15 * 128;
                for (int var22 = -var13; ~var22 > -129; ++var22) {
                    if (var22 - -var13 < 128) {
                        var20 += class93.field1633[var13 + var22 + var21];
                    }
                    if (-var13 + -1 + var22 >= 0) {
                        var20 -= class93.field1633[var21 - (var13 + 1) + var22];
                    }
                    if (var22 >= 0) {
                        class59.field994[var21 + var22] = var20 / (var13 * 2 + 1);
                    }
                }
            }
            for (int var16 = 0; ~var16 > -129; ++var16) {
                int var17 = 0;
                for (int var18 = -var13; ~var18 > ~var3; ++var18) {
                    int var19 = var18 * 128;
                    if (var13 + var18 < var3) {
                        var17 += class59.field994[var13 * 128 + var16 + var19];
                    }
                    if (~(var18 - (var13 + 1)) <= -1) {
                        var17 -= class59.field994[var16 + -128 + var19 + -(var13 * 128)];
                    }
                    if (~var18 <= -1) {
                        class93.field1633[var16 + var19] = var17 / (var13 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1491;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int[][] var4 = this.method301(arg0, (byte) 86, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class131.field2427 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILhf;ILkd;)V")
    public static final void method540(int arg0, class83 arg1, int arg2, class112 arg3) {
        ++field1493;
        class10 var4 = new class10();
        var4.field118 = arg3.method716(-1308);
        var4.field110 = arg3.method759(arg0 ^ 45);
        if (arg0 != 1) {
            field1499 = null;
        }
        var4.field112 = new byte[var4.field118][][];
        var4.field104 = new int[var4.field118];
        var4.field108 = new int[var4.field118];
        var4.field115 = new class120[var4.field118];
        var4.field105 = new int[var4.field118];
        var4.field114 = new class120[var4.field118];
        for (int var5 = 0; var4.field118 > var5; ++var5) {
            try {
                int var6 = arg3.method716(arg0 ^ -1307);
                if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = new String(arg3.method720((byte) 94).method869(-22828));
                        String var8 = new String(arg3.method720((byte) 52).method869(-22828));
                        int var9 = arg3.method716(-1308);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var9 < ~var11; ++var11) {
                            var10[var11] = new String(arg3.method720((byte) 123).method869(-22828));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; ~var13 > ~var9; ++var13) {
                                int var14 = arg3.method759(37);
                                var12[var13] = new byte[var14];
                                arg3.method723(var12[var13], arg0 + -1, var14, 0);
                            }
                        }
                        var4.field105[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; ~var9 < ~var16; ++var16) {
                            var15[var16] = class103.method638(var10[var16], (byte) -45);
                        }
                        var4.field114[var5] = arg1.method510(var8, var15, class103.method638(var7, (byte) -82), (byte) -113);
                        var4.field112[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg3.method720((byte) 59).method869(-22828));
                    String var18 = new String(arg3.method720((byte) 104).method869(-22828));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method759(arg0 ^ 34);
                    }
                    var4.field105[var5] = var6;
                    var4.field104[var5] = var19;
                    var4.field115[var5] = arg1.method509(class103.method638(var17, (byte) -112), (byte) -62, var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field108[var5] = -1;
            } catch (SecurityException var21) {
                var4.field108[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field108[var5] = -3;
            } catch (Exception var23) {
                var4.field108[var5] = -4;
            } catch (Throwable var24) {
                var4.field108[var5] = -5;
            }
        }
        class211.field3872.method120(0, var4);
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V")
    public static final void method541(int arg0) {
        ++field1489;
        class89.field1564.method778((byte) 99);
        if (arg0 != -1) {
            method541(116);
        }
        field1501.method1137(6902);
        class41.field666.method1137(6902);
        class30.field466.method1137(6902);
    }
}
