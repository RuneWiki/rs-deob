import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class134 {

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
    private int[] field2276;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[B")
    private byte[] field2282;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
    private int[] field2275;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lqd;")
    private static class40 field2267 = class147.method1106("glow2:", (byte) -49);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lqd;")
    public static class40 field2266 = class147.method1106("headicons_pk", (byte) -101);

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lqd;")
    public static class40 field2270 = class147.method1106(")1", (byte) -102);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lqd;")
    public static class40 field2268 = field2267;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lqd;")
    public static class40 field2274 = class147.method1106("::noclip", (byte) -124);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lqd;")
    public static class40 field2283 = field2267;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "S")
    public static short field2269 = 32767;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    public static int[] field2280 = new int[2000];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lkg;")
    public static class70 field2265;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 10)
    public static void method989(int arg0) {
        field2266 = null;
        field2267 = null;
        field2283 = null;
        field2274 = null;
        field2265 = null;
        field2270 = null;
        field2280 = null;
        field2268 = null;
        if (arg0 != 22683) {
            field2280 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Ldf;", line = 28)
    public static final class157 method990(byte arg0, int arg1) {
        field2285++;
        class157 var2 = (class157) class289.field4838.method984(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -24) {
            return (class157) null;
        } else {
            byte[] var3 = class81.field1420.method1651(26, arg1, -1);
            class157 var4 = new class157();
            if (var3 != null) {
                var4.method1214(0, new class26(var3));
            }
            class289.field4838.method982(var4, (long) arg1, (byte) 79);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V", line = 51)
    public static final void method991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -1) {
            field2274 = (class40) null;
        }
        for (int var9 = 0; var9 < class160.field2670.field5275; var9++) {
            int var10 = class160.field2670.field5272[var9] - class91.field1662;
            int var11 = class268.field4462 - (class160.field2670.field5292[var9] + 1 - class272.field4524);
            int var12 = (var11 - arg7) * (arg3 - arg0) / (arg2 - arg7) + arg0;
            int var13 = (arg4 - arg5) * (var10 - arg8) / (arg6 - arg8) + arg5;
            int var14 = class160.field2670.method2163((byte) -57, var9);
            int var15 = 16777215;
            class75 var16 = null;
            if (var14 == 0) {
                if ((double) class101.field1786 == 3.0D) {
                    var16 = class209.field3347;
                }
                if ((double) class101.field1786 == 4.0D) {
                    var16 = class23.field419;
                }
                if ((double) class101.field1786 == 6.0D) {
                    var16 = class29.field626;
                }
                if ((double) class101.field1786 == 8.0D) {
                    var16 = class304.field5087;
                }
            }
            if (var14 == 1) {
                if ((double) class101.field1786 == 3.0D) {
                    var16 = class29.field626;
                }
                if ((double) class101.field1786 == 4.0D) {
                    var16 = class304.field5087;
                }
                if ((double) class101.field1786 == 6.0D) {
                    var16 = class306.field5132;
                }
                if ((double) class101.field1786 == 8.0D) {
                    var16 = class299.field4996;
                }
            }
            if (var14 == 2) {
                if ((double) class101.field1786 == 3.0D) {
                    var16 = class306.field5132;
                }
                if ((double) class101.field1786 == 4.0D) {
                    var16 = class299.field4996;
                }
                if ((double) class101.field1786 == 6.0D) {
                    var16 = class158.field2639;
                }
                if ((double) class101.field1786 == 8.0D) {
                    var16 = class309.field5186;
                }
                var15 = 16755200;
            }
            if (class160.field2670.field5295[var9] != -1) {
                var15 = class160.field2670.field5295[var9];
            }
            if (var16 != null) {
                class40[] var17 = new class40[class160.field2670.field5291[var9].method373(60, -111) + 1];
                class49.field945.method1832(class160.field2670.field5291[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var12 - (var18 - 1) * var16.method554() / 2;
                int var20 = var19 + var16.method551() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class40 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method333(0, arg1 ^ 0xFFFFFFCD, var17[var21].method350(true) - 4);
                    var16.method553(var22, var13, var20, var15, true);
                    var20 += var16.method554();
                }
            }
        }
        field2279++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 180)
    public static final void method992(int arg0) {
        field2277++;
        try {
            if (class52.field1017 == arg0) {
                int var1 = class202.field3206.method622(false);
                if (var1 > 0 && class202.field3206.method594(false)) {
                    int var2 = var1 - class95.field1718;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class202.field3206.method627(var2, (byte) -60);
                    return;
                }
                class202.field3206.method597((byte) -117);
                class202.field3206.method601((byte) -123);
                if (class109.field1913 == null) {
                    class52.field1017 = 0;
                } else {
                    class52.field1017 = 2;
                }
                class20.field339 = null;
                class282.field4755 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class202.field3206.method597((byte) -90);
            class109.field1913 = null;
            class20.field339 = null;
            class52.field1017 = 0;
            class282.field4755 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B[BIII)I", line = 239)
    public final int method993(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2284++;
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg0 << 3;
        if (arg5 != 21589) {
            return -67;
        }
        while (arg4 < var7) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field2275[var10];
            byte var12 = this.field2282[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class11.method71(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg4++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z", line = 314)
    public static final boolean method994(byte arg0) {
        field2273++;
        if (class52.field1017 == 0) {
            if (arg0 > -90) {
                field2268 = (class40) null;
            }
            return class202.field3206.method594(false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V", line = 338)
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 8) {
            field2274 = (class40) null;
        }
        class192.field3094[0].method587(arg4, arg3);
        class192.field3094[1].method587(arg4, arg3 + arg0 - 16);
        field2271++;
        int var6 = (arg0 - 32) * arg0 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg1 / (arg2 - arg0);
        if (!class21.field350) {
            class115.method880(arg4, arg3 + 16, 16, arg0 - 32, class158.field2648);
            class115.method880(arg4, arg3 + var7 + 16, 16, var6, class126.field2173);
            class115.method882(arg4, var7 + arg3 + 16, var6, class93.field1689);
            class115.method882(arg4 + 1, arg3 - -16 + var7, var6, class93.field1689);
            class115.method877(arg4, arg3 + var7 + 16, 16, class93.field1689);
            class115.method877(arg4, arg3 + var7 + 17, 16, class93.field1689);
            class115.method882(arg4 + 15, arg3 - -16 - -var7, var6, class246.field4081);
            class115.method882(arg4 + 14, arg3 - (-var7 + -17), var6 - 1, class246.field4081);
            class115.method877(arg4, arg3 + var7 + var6 + 15, 16, class246.field4081);
            class115.method877(arg4 + 1, arg3 + 14 + var7 + var6, 15, class246.field4081);
            return;
        }
        class111.method846(arg4, arg3 + 16, 16, arg0 - 32, class158.field2648);
        class111.method846(arg4, arg3 + var7 + 16, 16, var6, class126.field2173);
        class111.method836(arg4, var7 + arg3 + 16, var6, class93.field1689);
        class111.method836(arg4 + 1, arg3 + 16 - -var7, var6, class93.field1689);
        class111.method841(arg4, arg3 + var7 + 16, 16, class93.field1689);
        class111.method841(arg4, var7 + arg3 + 17, 16, class93.field1689);
        class111.method836(arg4 + 15, arg3 + var7 - -16, var6, class246.field4081);
        class111.method836(arg4 + 14, arg3 - (-17 - var7), var6 - 1, class246.field4081);
        class111.method841(arg4, arg3 + var6 - (-var7 + -15), 16, class246.field4081);
        class111.method841(arg4 + 1, arg3 - -14 + var6 + var7, 15, class246.field4081);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BII[B)I", line = 402)
    public final int method996(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field2272++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = -20 / ((arg1 - 19) / 59);
        int var9 = 0;
        int var10 = arg4;
        while (true) {
            byte var11 = arg2[var10];
            if (var11 >= 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var12;
            if ((var12 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var13;
            if ((var13 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var14;
            if ((var14 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var15;
            if ((var15 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var16;
            if ((var16 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var17;
            if ((var17 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var18;
            if ((var18 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field2276[var9];
            }
            int var19;
            if ((var19 = this.field2276[var9]) < 0) {
                arg5[arg3++] = (byte) (~var19);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 - (arg4 - 1);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V", line = 546)
    public class134(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field2276 = new int[8];
        int var4 = 0;
        this.field2282 = arg0;
        this.field2275 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2275[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class11.method71(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2276[var14] == 0) {
                            this.field2276[var14] = var4;
                        }
                        var14 = this.field2276[var14];
                    }
                    if (this.field2276.length <= var14) {
                        int[] var17 = new int[this.field2276.length * 2];
                        for (int var18 = 0; var18 < this.field2276.length; var18++) {
                            var17[var18] = this.field2276[var18];
                        }
                        this.field2276 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field2276[var14] = ~var5;
            }
        }
    }
}
