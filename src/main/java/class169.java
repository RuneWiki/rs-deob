import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class169 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
    private int[] field3013;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[B")
    private byte[] field3016;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
    private int[] field3018;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Llc;")
    public static class143 field3011 = class66.method374("::", -1);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Llc;")
    public static class143 field3014 = class66.method374("<col=ffb000>", -1);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Llc;")
    public static class143 field3020 = class66.method374("M-Bmoire attribu-Be", -1);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lvh;")
    public static class43 field3017;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBI)I")
    public static final int method1107(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -90 % ((arg2 - 33) / 44);
        field3010++;
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return 7 - arg0;
        } else if (var5 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[BI[B)I")
    public final int method1108(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg0 + arg4;
        if (arg1 != 4562) {
            return -43;
        }
        field3012++;
        int var8 = arg2 << 3;
        int var9 = 0;
        while (arg0 < var7) {
            int var10 = arg3[arg0] & 0xFF;
            byte var11 = this.field3016[var10];
            int var12 = this.field3018[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = (var14 + var11 - 1 >> 3) + var13;
            var8 += var11;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var9 = class119.method729(var16, var12 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var9 = var12 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var9 = var12 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3019++;
        if (arg3 != 32017) {
            method1111(false);
        }
        if (arg0 == arg9 && arg4 == arg6 && arg5 == arg8 && arg2 == arg7) {
            class231.method1571(arg4, arg1, arg2, arg0, 27677, arg5);
            return;
        }
        int var10 = arg0;
        int var11 = arg0 * 3;
        int var12 = arg4;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg6 * 3;
        int var16 = arg8 * 3;
        int var17 = arg7 * 3;
        int var18 = arg5 - (var16 + arg0 - var14);
        int var19 = var11 + var16 - var14 - var14;
        int var20 = var13 + var17 - var15 - var15;
        int var21 = arg2 + var15 - var17 - arg4;
        int var22 = var14 - var11;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var26;
            int var28 = var18 * var26;
            int var29 = var20 * var25;
            int var30 = var19 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg0 + (var28 + var30 + var31 >> 12);
            int var34 = (var27 + var29 + var32 >> 12) + arg4;
            class231.method1571(var12, arg1, var34, var10, 27677, var33);
            var10 = var33;
            var12 = var34;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BBII[BI)I")
    public final int method1110(byte[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3015++;
        if (arg2 == 0) {
            return 0;
        } else if (arg1 == -2) {
            int var7 = arg2 + arg5;
            int var8 = 0;
            int var9 = arg3;
            while (true) {
                byte var10 = arg4[var9];
                if (var10 < 0) {
                    var8 = this.field3013[var8];
                } else {
                    var8++;
                }
                int var11;
                if ((var11 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var11);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var12;
                if ((var12 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var12);
                    if (arg5 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var13;
                if ((var13 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var13);
                    if (arg5 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var14;
                if ((var14 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var14);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var15;
                if ((var15 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var15);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var16;
                if ((var16 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var16);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var17;
                if ((var17 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var17);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field3013[var8];
                }
                int var18;
                if ((var18 = this.field3013[var8]) < 0) {
                    arg0[arg5++] = (byte) (~var18);
                    if (var7 <= arg5) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg3;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static final void method1111(boolean arg0) {
        if (arg0) {
            class7.field122 = class42.field710;
            class192.field3535 = class83.field1503;
        } else {
            class7.field122 = class190.field3491;
            class192.field3535 = class273.field4861;
        }
        class176.field3159 = class7.field122.length;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1112(byte arg0) {
        field3017 = null;
        field3011 = null;
        field3020 = null;
        if (arg0 >= -42) {
            method1109(71, -110, -107, -82, -35, -19, 112, 124, 124, 89);
        }
        field3014 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B)V")
    public class169(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field3013 = new int[8];
        int var4 = 0;
        this.field3016 = arg0;
        this.field3018 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3018[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class119.method729(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3013[var14] == 0) {
                            this.field3013[var14] = var4;
                        }
                        var14 = this.field3013[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3013.length <= var14) {
                        int[] var18 = new int[this.field3013.length * 2];
                        for (int var19 = 0; var19 < this.field3013.length; var19++) {
                            var18[var19] = this.field3013[var19];
                        }
                        this.field3013 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3013[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static final void method1113(boolean arg0) {
        field3021++;
        boolean var1 = true;
        class261.method1741((byte) 51, false);
        class13.field250 = 0;
        for (int var2 = 0; var2 < class240.field4330.length; var2++) {
            if (class239.field4324[var2] != -1 && class240.field4330[var2] == null) {
                class240.field4330[var2] = class57.field1110.method41(-18328, class239.field4324[var2], 0);
                if (class240.field4330[var2] == null) {
                    var1 = false;
                    class13.field250++;
                }
            }
            if (class111.field1959[var2] != -1 && class40.field687[var2] == null) {
                class40.field687[var2] = class57.field1110.method59(class111.field1959[var2], -3512, 0, class36.field622[var2]);
                if (class40.field687[var2] == null) {
                    var1 = false;
                    class13.field250++;
                }
            }
            if (class231.field4220 != null && class82.field1493[var2] == null && class231.field4220[var2] != -1) {
                class82.field1493[var2] = class57.field1110.method59(class231.field4220[var2], -3512, 0, class36.field622[var2]);
                if (class82.field1493[var2] == null) {
                    class13.field250++;
                    var1 = false;
                }
            }
        }
        if (class242.field4350 == null) {
            if (class47.field929 == null || !class227.field4099.method29(false, class25.method179(0, new class143[] { class47.field929.field1453, class55.field1059 }))) {
                class242.field4350 = new class135(0);
            } else if (class227.field4099.method56(true, class25.method179(0, new class143[] { class47.field929.field1453, class55.field1059 }))) {
                class242.field4350 = class89.method508(class227.field4099, 0, class25.method179(0, new class143[] { class47.field929.field1453, class55.field1059 }));
            } else {
                var1 = false;
                class13.field250++;
            }
        }
        if (!var1) {
            class232.field4244 = 1;
            return;
        }
        boolean var3 = true;
        class75.field1399 = 0;
        for (int var4 = 0; var4 < class240.field4330.length; var4++) {
            byte[] var20 = class40.field687[var4];
            if (var20 != null) {
                int var21 = (class6.field88[var4] >> 8) * 64 - class148.field2733;
                int var22 = (class6.field88[var4] & 0xFF) * 64 - class141.field2466;
                if (class43.field807) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class130.method787(var21, 63, var22, var20);
            }
        }
        if (!var3) {
            class232.field4244 = 2;
            return;
        }
        if (class232.field4244 != 0) {
            class236.method1593(16777215, true, class25.method179(0, new class143[] { class243.field4365, class25.field428 }));
        }
        class224.method1543((byte) -56);
        class30.method202(256);
        boolean var5 = false;
        class277.method1828(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class171.field3052[var6].method644((byte) -69);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class231.field4225[var7][var18][var19] = 0;
                }
            }
        }
        class128.method776((byte) -45, false);
        class224.method1543((byte) -56);
        System.gc();
        class261.method1741((byte) 51, true);
        class72.method416(false, -1);
        if (!class43.field807) {
            class137.method822(128, false);
            class261.method1741((byte) 51, true);
            class12.method97(false, (byte) -109);
            if (class82.field1493 != null) {
                class20.method145(0);
            }
        }
        if (class43.field807) {
            class118.method726((byte) 111, false);
            class261.method1741((byte) 51, true);
            class148.method963(false, (byte) 64);
        }
        class30.method202(256);
        class261.method1741((byte) 51, true);
        class264.method1765(class171.field3052, false, (byte) 56);
        class261.method1741((byte) 51, arg0);
        int var8 = class287.field5041;
        if (class170.field3044 < var8) {
            var8 = class170.field3044;
        }
        if (var8 < class170.field3044 - 1) {
            int var9 = class170.field3044 - 1;
        }
        if (class21.method149((byte) -57)) {
            class99.method584(0);
        } else {
            class99.method584(class287.field5041);
        }
        class70.method407(25493);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class48.method295(var10, var17, 128);
            }
        }
        class114.method689((byte) -30);
        class224.method1543((byte) -56);
        class21.method151((byte) 26);
        class30.method202(256);
        if (class8.field155 != null && class17.field298 != null && class147.field2652 == 25) {
            class285.field5010.method799(103, 201);
            class285.field5010.method1280(-116, 1057001181);
            class62.field1166++;
        }
        if (!class43.field807) {
            int var11 = (class66.field1233 - 6) / 8;
            int var12 = (class66.field1233 + 6) / 8;
            int var13 = (class272.field4854 - 6) / 8;
            int var14 = (class272.field4854 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class57.field1110.method47(26206, class25.method179(0, new class143[] { class22.field363, class274.method1806(var15, true), class133.field2329, class274.method1806(var16, true) }));
                        class57.field1110.method47(26206, class25.method179(0, new class143[] { class114.field2010, class274.method1806(var15, arg0), class133.field2329, class274.method1806(var16, true) }));
                    }
                }
            }
        }
        if (class147.field2652 == 28) {
            class43.method271(10, -47);
        } else {
            class43.method271(30, -94);
            if (class17.field298 != null) {
                class285.field5010.method799(103, 57);
            }
        }
        class232.method1574((byte) 85);
        class224.method1543((byte) -56);
        class110.method661(-32769);
    }
}
