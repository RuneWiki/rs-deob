import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class235 extends class217 {

    @OriginalMember(owner = "client!ag", name = "Nb", descriptor = "Lij;")
    public static class50 field3934 = class78.method578(123, "; Max)2Age=");

    @OriginalMember(owner = "client!ag", name = "Gb", descriptor = "Z")
    public static boolean field3927 = false;

    @OriginalMember(owner = "client!ag", name = "Ib", descriptor = "Lpe;")
    public static class100 field3929 = new class100(64);

    @OriginalMember(owner = "client!ag", name = "Jb", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ag", name = "Kb", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ag", name = "Lb", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ag", name = "Mb", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!ag", name = "Ob", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ag", name = "Pb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ag", name = "Qb", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ag", name = "Rb", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ag", name = "Sb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ag", name = "Ub", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ag", name = "Vb", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ag", name = "Wb", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ag", name = "Xb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ag", name = "Yb", descriptor = "Lsj;")
    private class189 field3945;

    @OriginalMember(owner = "client!ag", name = "Hb", descriptor = "Lda;")
    public static class22 field3928;

    @OriginalMember(owner = "client!ag", name = "Tb", descriptor = "[I")
    public static int[] field3940;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1588(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class124.field2168;
        class85.field1645 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class203.field3368; var12 < class261.field4553; ++var12) {
            class65[][] var38 = class59.field1089[var12];
            for (int var39 = class250.field4331; var39 < class42.field780; ++var39) {
                for (int var40 = class63.field1200; var40 < class54.field981; ++var40) {
                    class65 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field1243 <= class20.field424 && class210.field3497[var39 - class65.field1229 + class80.field1461][var40 - class136.field2363 + class80.field1461] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1245 = true;
                            var41.field1257 = true;
                            if (var41.field1244 > 0) {
                                var41.field1242 = true;
                            } else {
                                var41.field1242 = false;
                            }
                            ++class85.field1645;
                        } else {
                            var41.field1245 = false;
                            var41.field1257 = false;
                            var41.field1253 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1233 != null) {
                                    class55 var42 = var41.field1233;
                                    var42.field993.method121(var42.field986, var42.field990, var42.field990, -101, var42.field986);
                                    if (var42.field984 != null) {
                                        var42.field984.method121(var42.field986, var42.field990, var42.field990, -87, var42.field986);
                                    }
                                }
                                if (var41.field1235 != null) {
                                    class139 var43 = var41.field1235;
                                    var43.field2415.method121(var43.field2420, var43.field2427, var43.field2427, -113, var43.field2420);
                                    if (var43.field2424 != null) {
                                        var43.field2424.method121(var43.field2420, var43.field2427, var43.field2427, -30, var43.field2420);
                                    }
                                }
                                if (var41.field1251 != null) {
                                    class102 var44 = var41.field1251;
                                    var44.field1870.method121(var44.field1878, var44.field1876, var44.field1876, -61, var44.field1878);
                                }
                                if (var41.field1236 != null) {
                                    for (int var45 = 0; var45 < var41.field1244; ++var45) {
                                        class106 var46 = var41.field1236[var45];
                                        var46.field1901.method121(var46.field1907, var46.field1919, var46.field1906, -56, var46.field1913);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class245.field4257 == class100.field1854;
        for (int var14 = class203.field3368; var14 < class261.field4553; ++var14) {
            class65[][] var27 = class59.field1089[var14];
            for (int var28 = -class80.field1461; var28 <= 0; ++var28) {
                int var29 = class65.field1229 + var28;
                int var30 = class65.field1229 - var28;
                if (var29 >= class250.field4331 || var30 < class42.field780) {
                    for (int var31 = -class80.field1461; var31 <= 0; ++var31) {
                        int var32 = class136.field2363 + var31;
                        int var33 = class136.field2363 - var31;
                        if (var29 >= class250.field4331) {
                            if (var32 >= class63.field1200) {
                                class65 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1245) {
                                    class15.method115(var34, true);
                                }
                            }
                            if (var33 < class54.field981) {
                                class65 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1245) {
                                    class15.method115(var35, true);
                                }
                            }
                        }
                        if (var30 < class42.field780) {
                            if (var32 >= class63.field1200) {
                                class65 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1245) {
                                    class15.method115(var36, true);
                                }
                            }
                            if (var33 < class54.field981) {
                                class65 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1245) {
                                    class15.method115(var37, true);
                                }
                            }
                        }
                        if (class85.field1645 == 0) {
                            if (!var13) {
                                class1.field6 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class203.field3368; var15 < class261.field4553; ++var15) {
            class65[][] var16 = class59.field1089[var15];
            for (int var17 = -class80.field1461; var17 <= 0; ++var17) {
                int var18 = class65.field1229 + var17;
                int var19 = class65.field1229 - var17;
                if (var18 >= class250.field4331 || var19 < class42.field780) {
                    for (int var20 = -class80.field1461; var20 <= 0; ++var20) {
                        int var21 = class136.field2363 + var20;
                        int var22 = class136.field2363 - var20;
                        if (var18 >= class250.field4331) {
                            if (var21 >= class63.field1200) {
                                class65 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1245) {
                                    class15.method115(var23, false);
                                }
                            }
                            if (var22 < class54.field981) {
                                class65 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1245) {
                                    class15.method115(var24, false);
                                }
                            }
                        }
                        if (var19 < class42.field780) {
                            if (var21 >= class63.field1200) {
                                class65 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1245) {
                                    class15.method115(var25, false);
                                }
                            }
                            if (var22 < class54.field981) {
                                class65 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1245) {
                                    class15.method115(var26, false);
                                }
                            }
                        }
                        if (class85.field1645 == 0) {
                            if (!var13) {
                                class1.field6 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class1.field6 = false;
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field3934 = null;
        int var1 = 89 / ((arg0 - -79) / 46);
        field3929 = null;
        field3928 = null;
        field3940 = null;
    }

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "(I)V")
    public static final void method1590(int arg0) {
        ++field3937;
        if (~class167.field2834 != -1) {
            try {
                if (++class224.field3765 > 2000) {
                    if (class148.field2547 != null) {
                        class148.field2547.method630(arg0 ^ 2);
                        class148.field2547 = null;
                    }
                    if (class162.field2769 >= 1) {
                        class167.field2834 = 0;
                        class233.field3915 = -5;
                        return;
                    }
                    class167.field2834 = 1;
                    ++class162.field2769;
                    if (~class82.field1479 == ~class15.field344) {
                        class15.field344 = class249.field4319;
                    } else {
                        class15.field344 = class82.field1479;
                    }
                    class224.field3765 = 0;
                }
                if (arg0 != 0) {
                    method1589((byte) -47);
                }
                if (class167.field2834 == 1) {
                    class163.field2797 = class186.field3058.method966((byte) 51, class176.field2950, class15.field344);
                    class167.field2834 = 2;
                }
                if (~class167.field2834 == -3) {
                    if (class163.field2797.field133 == 2) {
                        throw new IOException();
                    }
                    if (~class163.field2797.field133 != -2) {
                        return;
                    }
                    class148.field2547 = new class83((Socket) class163.field2797.field132, class186.field3058);
                    class163.field2797 = null;
                    class148.field2547.method632(0, class190.field3141.field3633, class190.field3141.field3581, true);
                    if (class219.field3664 != null) {
                        class219.field3664.method596((byte) 55);
                    }
                    if (class133.field2330 != null) {
                        class133.field2330.method596((byte) 72);
                    }
                    int var1 = class148.field2547.method627((byte) 48);
                    if (class219.field3664 != null) {
                        class219.field3664.method596((byte) -120);
                    }
                    if (class133.field2330 != null) {
                        class133.field2330.method596((byte) 82);
                    }
                    if (var1 != 21) {
                        class167.field2834 = 0;
                        class233.field3915 = var1;
                        class148.field2547.method630(2);
                        class148.field2547 = null;
                        return;
                    }
                    class167.field2834 = 3;
                }
                if (~class167.field2834 == -4) {
                    if (~class148.field2547.method631((byte) -55) > -2) {
                        return;
                    }
                    class91.field1722 = new class50[class148.field2547.method627((byte) 48)];
                    class167.field2834 = 4;
                }
                if (~class167.field2834 == -5) {
                    if (class148.field2547.method631((byte) -35) >= class91.field1722.length * 8) {
                        class119.field2109.field3581 = 0;
                        class148.field2547.method633(false, class119.field2109.field3633, 0, class91.field1722.length * 8);
                        for (int var2 = 0; var2 < class91.field1722.length; ++var2) {
                            class91.field1722[var2] = class223.method1533((byte) -30, class119.field2109.method1443(-92));
                        }
                        class167.field2834 = 0;
                        class233.field3915 = 21;
                        class148.field2547.method630(2);
                        class148.field2547 = null;
                    }
                }
            } catch (IOException var3) {
                if (class148.field2547 != null) {
                    class148.field2547.method630(2);
                    class148.field2547 = null;
                }
                if (class162.field2769 < 1) {
                    ++class162.field2769;
                    if (class82.field1479 != class15.field344) {
                        class15.field344 = class82.field1479;
                    } else {
                        class15.field344 = class249.field4319;
                    }
                    class224.field3765 = 0;
                    class167.field2834 = 1;
                } else {
                    class167.field2834 = 0;
                    class233.field3915 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 111) {
            method1589((byte) -57);
        }
        class141[] var7 = class36.field707;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class141 var9 = var7[var8];
            if (var9 != null && ~var9.field2474 == -3) {
                class74.method553(arg4, (-class254.field4394 + var9.field2473 << 7) - -var9.field2479, arg6 >> 1, arg1 >> 1, arg0, (byte) -120, (-class61.field1124 + var9.field2463 << 7) - -var9.field2464, var9.field2469 * 2);
                if (class33.field660 > -1 && ~(class244.field4245 % 20) > -11) {
                    class119.field2112[var9.field2465].method673(class33.field660 + arg5 + -12, class131.field2299 + arg2 + -28);
                }
            }
        }
        ++field3931;
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(B)V")
    public final void method1592(byte arg0) {
        ++field3939;
        int var2 = 60 / ((arg0 - -51) / 47);
        super.field3581 = (this.field3933 - -7) / 8;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Lge;")
    public static final class200 method1593(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class200 var4 = var3.field1237;
            var3.field1237 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[I)V")
    public final void method1594(byte arg0, int[] arg1) {
        int var3 = -47 % ((-5 - arg0) / 41);
        ++field3942;
        this.field3945 = new class189(arg1);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I[BII)V")
    public final void method1595(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = 0; arg0 > var5; ++var5) {
            arg1[var5 - -arg3] = (byte) (super.field3633[super.field3581++] + -this.field3945.method1275(0));
        }
        if (arg2 > -48) {
            this.method1596(81);
        }
        ++field3935;
    }

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)V")
    public final void method1596(int arg0) {
        ++field3938;
        this.field3933 = super.field3581 * 8;
        if (arg0 > -57) {
            field3927 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class235(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(II)I")
    public final int method1597(int arg0, int arg1) {
        if (arg0 != 8) {
            return -25;
        } else {
            ++field3944;
            return arg1 * 8 + -this.field3933;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)V")
    public final void method1598(byte arg0, int arg1) {
        if (arg0 >= -86) {
            field3927 = true;
        }
        super.field3633[super.field3581++] = (byte) (this.field3945.method1275(0) + arg1);
        ++field3943;
    }

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)I")
    public final int method1599(int arg0) {
        ++field3932;
        if (arg0 >= -108) {
            field3940 = null;
        }
        return super.field3633[super.field3581++] + -this.field3945.method1275(0) & 255;
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(II)I")
    public final int method1600(int arg0, int arg1) {
        ++field3936;
        int var3 = this.field3933 >> 3;
        if (arg0 != 2) {
            field3928 = null;
        }
        int var4 = 0;
        int var5 = -(this.field3933 & 7) + 8;
        this.field3933 += arg1;
        while (var5 < arg1) {
            var4 += (super.field3633[var3++] & class41.field754[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (class41.field754[var5] & super.field3633[var3]) + var4;
        } else {
            var6 = (super.field3633[var3] >> var5 - arg1 & class41.field754[arg1]) + var4;
        }
        return var6;
    }
}
