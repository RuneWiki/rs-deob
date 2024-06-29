import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class255 extends class109 {

    @OriginalMember(owner = "client!rg", name = "Ac", descriptor = "[I")
    public static int[] field3988 = new int[500];

    @OriginalMember(owner = "client!rg", name = "wc", descriptor = "Z")
    public static boolean field3984 = false;

    @OriginalMember(owner = "client!rg", name = "nc", descriptor = "[I")
    public static int[] field3975 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!rg", name = "jc", descriptor = "Lab;")
    public static class279 field3971 = new class279(16);

    @OriginalMember(owner = "client!rg", name = "kc", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!rg", name = "lc", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!rg", name = "mc", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!rg", name = "oc", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!rg", name = "pc", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!rg", name = "qc", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!rg", name = "rc", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!rg", name = "sc", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!rg", name = "tc", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!rg", name = "uc", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!rg", name = "vc", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!rg", name = "yc", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!rg", name = "zc", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!rg", name = "Bc", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!rg", name = "Cc", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!rg", name = "Ec", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!rg", name = "Dc", descriptor = "Lec;")
    public class44 field3991;

    @OriginalMember(owner = "client!rg", name = "Fc", descriptor = "Z")
    public static boolean field3993;

    @OriginalMember(owner = "client!rg", name = "Gc", descriptor = "[I")
    public static int[] field3994;

    @OriginalMember(owner = "client!rg", name = "xc", descriptor = "[[Z")
    public static boolean[][] field3985;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "(I)I", line = 4)
    public static final int method1704(int arg0) {
        field3973++;
        if (arg0 != 6) {
            field3988 = (int[]) null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Z", line = 20)
    public final boolean method701(int arg0) {
        field3992++;
        if (this.field3991 == null) {
            return false;
        } else {
            return arg0 == -7080;
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)I", line = 42)
    public final int method704(int arg0) {
        field3987++;
        if (class324.field4954 != 0 && this.field3991.field888 != null) {
            class44 var2 = this.field3991.method338(17911);
            if (var2 != null && var2.field889 != -1) {
                return var2.field889;
            }
        }
        if (arg0 < 120) {
            field3988 = (int[]) null;
        }
        return this.field1902;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBLdn;IZ)V", line = 62)
    public static final void method1705(int arg0, int arg1, byte arg2, class260 arg3, int arg4, boolean arg5) {
        field3972++;
        if (class48.field986 >= 50 || arg3 == null || arg3.field4070 == null || arg4 >= arg3.field4070.length || arg3.field4070[arg4] == null) {
            return;
        }
        int var6 = arg3.field4070[arg4][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        int var9 = var6 & 0x1F;
        if (arg3.field4070[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field4070[arg4].length);
            if (var10 > 0) {
                var7 = arg3.field4070[arg4][var10];
            }
        }
        if (var9 == 0) {
            if (arg5) {
                class104.method675(255, var8, var7, (byte) -68, 0);
            }
        } else if (class80.field1573 != 0) {
            class135.field2266[class48.field986] = var7;
            class202.field3283[class48.field986] = var8;
            class328.field5034[class48.field986] = 0;
            int var11 = (arg1 - 64) / 128;
            class278.field4262[class48.field986] = null;
            int var12 = (arg0 - 64) / 128;
            if (arg2 < -40) {
                class72.field1500[class48.field986] = 255;
                class2.field35[class48.field986] = (var11 << 16) + (var12 << 8) + var9;
                class48.field986++;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V", line = 120)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3977++;
        if (this.field3991 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)I", line = 136)
    public static final int method1706(int arg0, int arg1) {
        int var2 = 57 / ((arg0 + 5) / 56);
        field3978++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 146)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        field3990++;
        if (this.field3991 == null) {
            return;
        }
        class260 var13 = this.field1897 != -1 && this.field1921 == 0 ? class279.method1882(25397, this.field1897) : null;
        class260 var14 = this.field1893 == -1 || this.field1893 == this.method698(38).field4907 && var13 != null ? null : class279.method1882(25397, this.field1893);
        class309 var15 = this.field3991.method330(this.field1945, this.field1882, this.field1903, this.field1908, var14, var13, this.field1935, this.field1901, -79, this.field1920);
        if (var15 == null) {
            return;
        }
        this.field1883 = var15.method39();
        class44 var16 = this.field3991;
        if (var16.field888 != null) {
            var16 = var16.method338(17911);
        }
        if (class259.field4030 && var16.field877) {
            class309 var17 = class67.method514(var14 == null ? var13 : var14, this.field3991.field832, this.field3991.field882, var14 == null ? this.field1908 : this.field1903, this.field3991.field831, this.field1872, this.field3991.field865, this.field3991.field858, arg0, this.field1891, this.field1869, this.field1898, -73, var15);
            if (class249.field3893) {
                float var18 = class249.method1675();
                float var19 = class249.method1671();
                class249.method1650();
                class249.method1688(var18, var19 - 150.0F);
                var17.method26(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1861);
                class249.method1659();
                class249.method1688(var18, var19);
            } else {
                var17.method26(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1861);
            }
        }
        this.method700((byte) 92, var15);
        class309 var20 = null;
        this.method707(var15, (byte) -97, arg0);
        if (this.field1856 != -1 && this.field1884 != -1) {
            class8 var21 = class87.method609(this.field1856, (byte) 37);
            var20 = var21.method72(true, this.field1875, this.field1952, this.field1884);
            if (var20 != null) {
                var20.method163(0, -this.field1919, 0);
                if (var21.field185) {
                    if (class106.field1838 != 0) {
                        var20.method145(class106.field1838);
                    }
                    if (class236.field3716 != 0) {
                        var20.method136(class236.field3716);
                    }
                    if (class281.field4326 != 0) {
                        var20.method163(0, class281.field4326, 0);
                    }
                }
            }
        }
        if (!class249.field3893) {
            if (var20 != null) {
                var15 = ((class20) var15).method148(var20);
            }
            if (this.field3991.field882 == 1) {
                var15.field4704 = true;
            }
            var15.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
            return;
        }
        if (this.field3991.field882 == 1) {
            var15.field4704 = true;
        }
        var15.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
        if (var20 != null) {
            if (this.field3991.field882 == 1) {
                var20.field4704 = true;
            }
            var20.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
        }
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 262)
    protected final void finalize() {
        field3980++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIIIIII)V", line = 277)
    public static final void method1707(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3979++;
        class339[] var7 = class342.field5313;
        int var8 = 0;
        if (arg0 != -116) {
            field3975 = (int[]) null;
        }
        while (var8 < var7.length) {
            class339 var9 = var7[var8];
            if (var9 != null && var9.field5260 == 2) {
                class239.method1587(arg3, -10452, (var9.field5254 - class246.field3818 << 7) + var9.field5257, (-class101.field1769 + var9.field5250 << 7) - -var9.field5255, var9.field5256 * 2, arg5 >> 1, arg6 >> 1, arg1);
                if (class132.field2233 > -1 && class25.field494 % 20 < 10) {
                    class158.field2593[var9.field5249].method901(class132.field2233 + arg2 - 12, arg4 - -class24.field476 + -28);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 308)
    public static final void method1708(Object[] arg0, byte arg1, int[] arg2) {
        if (arg1 != -30) {
            method1710((byte) -53);
        }
        field3986++;
        class345.method2387(0, arg2, -24834, arg2.length - 1, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 319)
    public static void method1709(byte arg0) {
        field3975 = null;
        field3988 = null;
        field3994 = null;
        if (arg0 != 105) {
            field3994 = (int[]) null;
        }
        field3985 = (boolean[][]) null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 333)
    public static final void method1710(byte arg0) {
        class207.method1402();
        if (arg0 != 24) {
            method1705(77, -61, (byte) 97, (class260) null, -73, true);
        }
        field3982++;
        class141.field2335 = new class323[9];
        class141.field2335[1] = new class167();
        class141.field2335[2] = new class22();
        class141.field2335[3] = new class316();
        class141.field2335[4] = new class139();
        class141.field2335[5] = new class245();
        class141.field2335[6] = new class217();
        class141.field2335[7] = new class212();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z[BIIII[Lu;I)[I", line = 354)
    public static final int[] method1711(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class25[] arg6, int arg7) {
        field3989++;
        if (!arg0) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg3 + var9 > 0 && (arg3 + var9) < 103 && arg7 + var10 > 0 && arg7 + var10 < 103) {
                            arg6[var8].field501[arg3 + var9][arg7 + var10] = class61.method475(arg6[var8].field501[arg3 + var9][arg7 + var10], -2097153);
                        }
                    }
                }
            }
        }
        class202 var11 = new class202(arg1);
        byte var12;
        if (arg0) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = arg2 + arg3;
        int var14 = arg4 + arg7;
        for (int var15 = 0; var15 < var12; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class267.method1773(var15, var13 + var16, var14 + var17, arg3 + var16, 0, arg7 + var17, false, (byte) 102, arg0, var11);
                }
            }
        }
        int var18 = 13 % ((arg5 + 8) / 40);
        boolean var19 = false;
        boolean var20 = false;
        while (var11.field3249 < var11.field3273.length) {
            int var21 = var11.method1317((byte) -106);
            if (var21 == 128) {
                var19 = true;
                class134.field2253[0] = var11.method1315(14289);
                class134.field2253[1] = var11.method1356(false);
                class134.field2253[2] = var11.method1356(false);
                class134.field2253[3] = var11.method1356(false);
                class134.field2253[4] = var11.method1315(14289);
            } else {
                if (var21 != 129) {
                    var11.field3249--;
                    break;
                }
                for (int var22 = 0; var22 < 4; var22++) {
                    byte var23 = var11.method1333(-125);
                    if (var23 == 0) {
                        int var33 = arg3;
                        int var34 = arg3 + 64;
                        if (arg3 < 0) {
                            var33 = 0;
                        } else if (arg3 >= 104) {
                            var33 = 104;
                        }
                        int var35 = arg7;
                        if (arg7 < 0) {
                            var35 = 0;
                        } else if (arg7 >= 104) {
                            var35 = 104;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        int var36 = arg7 + 64;
                        if (var36 < 0) {
                            var36 = 0;
                        } else if (var36 >= 104) {
                            var36 = 104;
                        }
                        while (var34 > var33) {
                            while (var36 > var35) {
                                class44.field855[var22][var33][var35] = 0;
                                var35++;
                            }
                            var33++;
                        }
                    } else if (var23 == 1) {
                        for (int var24 = 0; var24 < 64; var24 += 4) {
                            for (int var25 = 0; var25 < 64; var25 += 4) {
                                byte var26 = var11.method1333(-125);
                                for (int var27 = arg3 + var24; var27 < var24 + arg3 + 4; var27++) {
                                    for (int var28 = arg7 + var25; var28 < var25 + arg7 + 4; var28++) {
                                        if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                            class44.field855[var22][var27][var28] = var26;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var23 == 2 && var22 > 0) {
                        int var29 = arg7;
                        int var30 = arg3 + 64;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg3;
                        if (arg3 < 0) {
                            var31 = 0;
                        } else if (arg3 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg7 + 64;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        if (arg7 < 0) {
                            var29 = 0;
                        } else if (arg7 >= 104) {
                            var29 = 104;
                        }
                        while (var30 > var31) {
                            while (var32 > var29) {
                                class44.field855[var22][var31][var29] = class44.field855[var22 - 1][var31][var29];
                                var29++;
                            }
                            var31++;
                        }
                    }
                }
                var20 = true;
            }
        }
        if (class249.field3893 && !arg0) {
            class336 var37 = null;
            while (true) {
                while (var11.field3273.length > var11.field3249) {
                    int var38 = var11.method1317((byte) -126);
                    if (var38 == 0) {
                        var37 = new class336(var11);
                    } else if (var38 == 1) {
                        int var39 = var11.method1317((byte) -71);
                        if (var39 > 0) {
                            for (int var40 = 0; var40 < var39; var40++) {
                                class1 var41 = new class1(var11);
                                if (var41.field21 == 31) {
                                    class220 var42 = class234.method1552(7, var11.method1315(14289));
                                    var41.method5(var42.field3500, var42.field3489, var42.field3498, (byte) 88, var42.field3493);
                                }
                                var41.field11 += arg7 << 7;
                                int var43 = var41.field11 >> 7;
                                var41.field5 += arg3 << 7;
                                int var44 = var41.field5 >> 7;
                                if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104) {
                                    var41.field15 = (class99.field1749[1][var44][var43] & 0x2) != 0;
                                    var41.field29 = class45.field923[var41.field28][var44][var43] - var41.field29;
                                    class310.method2084(var41);
                                }
                            }
                        }
                    } else if (var38 == 2) {
                        if (var37 == null) {
                            var37 = new class336();
                        }
                        var37.method2320(0, var11);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var37 == null) {
                    var37 = new class336();
                }
                for (int var45 = 0; var45 < 8; var45++) {
                    for (int var46 = 0; var46 < 8; var46++) {
                        int var47 = (arg3 >> 3) + var45;
                        int var48 = (arg7 >> 3) + var46;
                        if (var47 >= 0 && var47 < 13 && var48 >= 0 && var48 < 13) {
                            class210.field3387[var47][var48] = var37;
                        }
                    }
                }
                break;
            }
        }
        if (!var20) {
            for (int var49 = 0; var49 < 4; var49++) {
                for (int var50 = 0; var50 < 16; var50++) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        int var52 = (arg3 >> 2) + var50;
                        int var53 = (arg7 >> 2) + var51;
                        if (var52 >= 0 && var52 < 26 && var53 >= 0 && var53 < 26) {
                            class44.field855[var49][var52][var53] = 0;
                        }
                    }
                }
            }
        }
        return var19 ? class134.field2253 : null;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)[F", line = 773)
    public static final float[] method1712(int arg0, int arg1) {
        field3983++;
        float var2 = class65.method503() + class65.method500();
        int var3 = class65.method498();
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        float var6 = (float) ((var3 & 0xFFBC) >> 8) / 255.0F;
        int var7 = -77 / ((arg0 + 67) / 59);
        class301.field4558[3] = 1.0F;
        class301.field4558[2] = var2 * var5 * (float) class61.method475(255, arg1) / 255.0F * var4;
        float var8 = (float) ((var3 & 0xFFC4E3) >> 16) / 255.0F;
        class301.field4558[1] = var2 * var5 * var6 * ((float) class61.method475(255, arg1 >> 8) / 255.0F);
        class301.field4558[0] = var5 * var8 * ((float) class61.method475(255, arg1 >> 16) / 255.0F) * var2;
        return class301.field4558;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLec;)V", line = 804)
    public final void method1713(byte arg0, class44 arg1) {
        this.field3991 = arg1;
        if (arg0 != -77) {
            field3988 = (int[]) null;
        }
        field3976++;
        if (this.field1861 != null) {
            this.field1861.method1844();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()I", line = 831)
    public final int method39() {
        field3974++;
        return this.field1883;
    }
}
