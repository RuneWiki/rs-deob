import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class15 extends class273 {

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field234 = 1024;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    private int field239 = 2048;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    private int field241 = 3072;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[I")
    public static int[] field231 = new int[500];

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "[I")
    public static int[] field240 = new int[] { 8, 0, 0, 0, 10, 0, 12, 15, 0, 1, 12, 6, 0, 0, 0, 0, -2, 8, 4, 3, 0, 0, 0, 0, 7, 0, 0, 0, 8, 14, -1, -2, 0, 0, 7, 0, 0, 0, 5, 0, 0, 0, -1, 0, -2, 0, 3, 7, -2, 0, 0, 0, 2, 4, 5, 0, 0, 15, 0, 6, 0, 12, 0, 0, -2, 8, -1, 0, 0, 0, 6, 6, 2, 0, 0, 0, 0, 0, 9, 0, 0, 0, 2, 0, 3, 0, 6, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 11, 0, 17, 0, 0, 0, 0, 8, 0, 3, 0, 0, 8, 4, 2, 0, 0, 0, 10, 0, 0, -2, 28, 0, 1, -1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 5, 6, -2, 0, -1, 0, 0, 6, -1, 0, 0, 0, 3, 0, 0, 0, -2, 0, 0, 6, 0, 0, -2, 2, 0, 0, 0, 20, 0, 3, 0, 3, 0, -1, 0, -2, 1, 0, -1, 0, 0, 0, -1, -1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 6, 8, 0, 0, 0, 0, 0, 1, 0, 12, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 7, 0, 2, 3, 0, 0, 0, 14, 0, 10, 10, 0, -2, -2, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "[Lfl;")
    public static class80[] field235;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public static final void method102(int arg0, int arg1, int arg2) {
        client.field4564 = -class285.field4524 + arg1;
        class80.field1326 = -arg0 + class253.field4030 + class31.field524 + -1;
        if (arg2 <= 48) {
            method107((int[]) null, 47, 59, (byte) 81, (int[]) null);
        }
        ++field227;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static final void method103(byte arg0) {
        ++field230;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class42.field776 + -1; ++var2) {
                if (~class94.field1468[var2] > -1001 && class94.field1468[var2 - -1] > 1000) {
                    var1 = false;
                    String var3 = class217.field3488[var2];
                    class217.field3488[var2] = class217.field3488[var2 + 1];
                    class217.field3488[var2 - -1] = var3;
                    String var4 = class47.field840[var2];
                    class47.field840[var2] = class47.field840[var2 - -1];
                    class47.field840[var2 - -1] = var4;
                    int var5 = class223.field3559[var2];
                    class223.field3559[var2] = class223.field3559[var2 + 1];
                    class223.field3559[var2 - -1] = var5;
                    int var6 = field231[var2];
                    field231[var2] = field231[var2 + 1];
                    field231[var2 + 1] = var6;
                    int var7 = class251.field3993[var2];
                    class251.field3993[var2] = class251.field3993[var2 - -1];
                    class251.field3993[var2 + 1] = var7;
                    short var8 = class94.field1468[var2];
                    class94.field1468[var2] = class94.field1468[var2 + 1];
                    class94.field1468[var2 + 1] = var8;
                    long var9 = class110.field1703[var2];
                    class110.field1703[var2] = class110.field1703[var2 - -1];
                    class110.field1703[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != -116) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field229;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (arg0 < 122) {
            field240 = null;
        }
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class26.field458 > var11; ++var11) {
                var7[var11] = this.field234 - -(var5[var11] * this.field239 >> 12);
                var9[var11] = (var6[var11] * this.field239 >> 12) + this.field234;
                var10[var11] = (var8[var11] * this.field239 >> 12) + this.field234;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            this.field234 = 20;
        }
        ++field233;
        int[] var3 = super.field4359.method387((byte) -39, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) 112);
            for (int var5 = 0; ~class26.field458 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field239 >> 12) + this.field234;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public static final void method104(int arg0) {
        class204.method1377(false, arg0 ^ -106);
        class12.field164 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class216.field3474.length; ++var2) {
            if (~class106.field1624[var2] != 0 && class216.field3474[var2] == null) {
                class216.field3474[var2] = class91.field1431.method900(class106.field1624[var2], 0, false);
                if (class216.field3474[var2] == null) {
                    ++class12.field164;
                    var1 = false;
                }
            }
            if (~class250.field3988[var2] != 0 && class178.field2967[var2] == null) {
                class178.field2967[var2] = class91.field1431.method890(-4470616, class209.field3352[var2], class250.field3988[var2], 0);
                if (class178.field2967[var2] == null) {
                    ++class12.field164;
                    var1 = false;
                }
            }
            if (class92.field1460 != null && class266.field4245[var2] == null && class92.field1460[var2] != -1) {
                class266.field4245[var2] = class91.field1431.method890(-4470616, class209.field3352[var2], class92.field1460[var2], 0);
                if (class266.field4245[var2] == null) {
                    var1 = false;
                    ++class12.field164;
                }
            }
        }
        ++field238;
        if (class13.field172 == null) {
            if (class266.field4256 != null && class184.field3035.method901(class266.field4256.field2015 + "_labels", (byte) 6)) {
                if (!class184.field3035.method902(class266.field4256.field2015 + "_labels", (byte) 43)) {
                    ++class12.field164;
                    var1 = false;
                } else {
                    class13.field172 = class87.method685(0, class266.field4256.field2015 + "_labels", class184.field3035);
                }
            } else {
                class13.field172 = new class254(0);
            }
        }
        if (!var1) {
            class36.field619 = 1;
        } else {
            boolean var3 = true;
            class161.field2631 = 0;
            for (int var4 = 0; var4 < class216.field3474.length; ++var4) {
                byte[] var20 = class178.field2967[var4];
                if (var20 != null) {
                    int var21 = (class268.field4291[var4] >> 8) * 64 + -class256.field4082;
                    int var22 = (class268.field4291[var4] & 255) * 64 + -class170.field2787;
                    if (class76.field1239) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class127.method929(var22, (byte) 27, var20, var21);
                }
            }
            if (!var3) {
                class36.field619 = 2;
            } else {
                if (class36.field619 != arg0) {
                    class72.method554(true, class35.field591 + "<br>(100%)", (byte) -59);
                }
                class260.method1738(true);
                boolean var5 = false;
                class270.method1840((byte) -115);
                class236.method1567(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; ++var6) {
                    class141.field2352[var6].method84(-83);
                }
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    for (int var18 = 0; ~var18 > -105; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class43.field790[var7][var18][var19] = 0;
                        }
                    }
                }
                class11.method77(false, -115);
                class260.method1738(true);
                System.gc();
                class204.method1377(true, -78);
                class213.method1413(20769, false);
                if (!class76.field1239) {
                    class126.method924(false, -90);
                    class204.method1377(true, -29);
                    class44.method379(-115, false);
                    if (class266.field4245 != null) {
                        class196.method1339(arg0 + 424115814);
                    }
                }
                if (class76.field1239) {
                    class201.method1358(false, 7);
                    class204.method1377(true, arg0 + -111);
                    class77.method616(true, false);
                }
                class270.method1840((byte) -115);
                class204.method1377(true, -76);
                class92.method703(false, class141.field2352, (byte) 86, !class76.field1239 ? null : class72.field1196);
                class204.method1377(true, -37);
                int var8 = class111.field1710;
                if (~var8 < ~class92.field1448) {
                    var8 = class92.field1448;
                }
                if (class92.field1448 + -1 > var8) {
                    int var9 = class92.field1448 + -1;
                }
                if (class9.method50(false)) {
                    class101.method754(0);
                } else {
                    class101.method754(class111.field1710);
                }
                class136.method982(527378696);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        class269.method1833(var10, 25049, var17);
                    }
                }
                class114.method836((byte) -118);
                class260.method1738(true);
                class134.method958((byte) 28);
                class270.method1840((byte) -115);
                if (class207.field3327 != null && class23.field360 != null && ~class146.field2401 == -26) {
                    class87.field1405.method607(218, (byte) 96);
                    ++class167.field2754;
                    class87.field1405.method1029(1057001181, 15430);
                }
                if (!class76.field1239) {
                    int var11 = (class33.field551 + 6) / 8;
                    int var12 = (class111.field1716 + -6) / 8;
                    int var13 = (class33.field551 + -6) / 8;
                    int var14 = (class111.field1716 + 6) / 8;
                    for (int var15 = var13 - 1; ~var15 >= ~(var11 + 1); ++var15) {
                        for (int var16 = var12 + -1; ~(var14 + 1) <= ~var16; ++var16) {
                            if (~var15 > ~var13 || var15 > var11 || ~var12 < ~var16 || var16 > var14) {
                                class91.field1431.method904(arg0 + -30963, "m" + var15 + "_" + var16);
                                class91.field1431.method904(-30963, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (class146.field2401 == 28) {
                    class274.method1856(10, 5);
                } else {
                    class274.method1856(30, 5);
                    if (class23.field360 != null) {
                        class87.field1405.method607(181, (byte) 115);
                    }
                }
                class222.method1495(arg0);
                class260.method1738(true);
                class151.method1099(112);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method105(int arg0) {
        field240 = null;
        if (arg0 != 1057001181) {
            method106(36, true);
        }
        field231 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)I")
    public static final int method106(int arg0, boolean arg1) {
        ++field232;
        if (!arg1) {
            method104(100);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            field235 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4358 = arg0.method1012(arg2 ^ 1) == 1;
                }
            } else {
                this.field241 = arg0.method996(arg2 + 65275);
            }
        } else {
            this.field234 = arg0.method996(arg2 ^ 65285);
        }
        ++field236;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIIB[I)V")
    public static final void method107(int[] arg0, int arg1, int arg2, byte arg3, int[] arg4) {
        if (arg1 > arg2) {
            int var5 = arg2;
            int var6 = (arg1 + arg2) / 2;
            int var7 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; arg1 > var9; ++var9) {
                if ((var9 & 1) + var7 < arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg0[arg1] = arg0[var5];
            arg0[var5] = var7;
            arg4[arg1] = arg4[var5];
            arg4[var5] = var8;
            method107(arg0, var5 + -1, arg2, (byte) -126, arg4);
            method107(arg0, arg1, var5 + 1, (byte) -116, arg4);
        }
        ++field228;
        if (arg3 > -111) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field237;
        this.field239 = -this.field234 + this.field241;
        if (arg0 >= -94) {
            method104(62);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class15() {
        super(1, false);
    }
}
