import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class240 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lca;")
    public static class98 field4177 = null;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lhe;")
    public static class94 field4185 = new class94(64);

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Lsf;")
    public static class108 field4194 = class140.method973(255, ")1");

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lsf;")
    public static class108 field4195 = class140.method973(255, " ");

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "J")
    private long field4188;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "J")
    private long field4191;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
    public boolean field4178;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[I")
    private int[] field4173;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[I")
    public static int[] field4180;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
    private int[] field4183;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[IZ[I)V", line = 5)
    public final void method1659(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        if (arg0 != Integer.MIN_VALUE) {
            this.method1667(104, -43, -71);
        }
        field4182++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class137.field2423; var7++) {
                    class280 var8 = class136.method939(-1, var7);
                    if (var8 != null && !var8.field4907 && var8.field4906 == var6 + (arg3 ? 7 : 0)) {
                        arg2[class151.field2733[var6]] = class242.method1674(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field4183 = arg4;
        this.field4173 = arg2;
        this.field4178 = arg3;
        this.field4181 = arg1;
        this.method1664((byte) 43);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I", line = 50)
    public final int method1660(int arg0) {
        field4175++;
        int var2 = -29 % ((64 - arg0) / 45);
        return this.field4181 == -1 ? (this.field4183[4] << 20) + ((this.field4183[0] << 25) + (this.field4173[0] << 15) + (this.field4173[8] << 10)) + (this.field4173[11] << 5) + this.field4173[1] : class57.method397(0, this.field4181).field2364 + 305419896;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIILjh;)Lke;", line = 72)
    public final class113 method1661(int arg0, byte arg1, int arg2, int arg3, class272 arg4) {
        if (arg1 != 32) {
            method1669(-3);
        }
        field4179++;
        long var6 = (long) (arg3 << 16) | (long) arg2 << 32 | (long) arg2;
        class113 var8 = (class113) class177.field3226.method642(var6, (byte) -118);
        if (var8 == null) {
            class230[] var9 = new class230[2];
            int var10 = 0;
            if (!class136.method939(-1, arg2).method2015(110) || !class136.method939(-1, arg3).method2015(arg1 + 22)) {
                return null;
            }
            class230 var11 = class136.method939(-1, arg2).method2014(4);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class230 var12 = class136.method939(arg1 - 33, arg3).method2014(4);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class230 var13 = new class230(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class215.field3819[var14].length > this.field4183[var14]) {
                    var13.method1553(class195.field3527[var14], class215.field3819[var14][this.field4183[var14]]);
                }
                if (this.field4183[var14] < class191.field3474[var14].length) {
                    var13.method1553(class233.field4124[var14], class191.field3474[var14][this.field4183[var14]]);
                }
            }
            var8 = var13.method1555(64, 768, -50, -10, -50);
            class177.field3226.method643((byte) -49, var6, var8);
        }
        if (arg4 != null) {
            var8 = arg4.method1965(var8, -14500, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V", line = 133)
    public final void method1662(int arg0, boolean arg1) {
        this.field4178 = arg1;
        if (arg0 != 305419896) {
            method1663(10);
        }
        field4189++;
        this.method1664((byte) 43);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 145)
    public static final void method1663(int arg0) {
        field4192++;
        if (arg0 > -85) {
            method1670(-67);
        }
        class327.field5579.method644((byte) 65);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 159)
    private final void method1664(byte arg0) {
        field4184++;
        long var2 = this.field4188;
        long[] var4 = class185.field3399;
        this.field4188 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4188 = this.field4188 >>> 8 ^ var4[(int) (((long) (this.field4173[var5] >> 24) ^ this.field4188) & 0xFFL)];
            this.field4188 = this.field4188 >>> 8 ^ var4[(int) (((long) (this.field4173[var5] >> 16) ^ this.field4188) & 0xFFL)];
            this.field4188 = var4[(int) (((long) (this.field4173[var5] >> 8) ^ this.field4188) & 0xFFL)] ^ this.field4188 >>> 8;
            this.field4188 = var4[(int) ((this.field4188 ^ (long) this.field4173[var5]) & 0xFFL)] ^ this.field4188 >>> 8;
        }
        int var6 = 0;
        if (arg0 != 43) {
            method1669(11);
        }
        while (var6 < 5) {
            this.field4188 = var4[(int) ((this.field4188 ^ (long) this.field4183[var6]) & 0xFFL)] ^ this.field4188 >>> 8;
            var6++;
        }
        this.field4188 = this.field4188 >>> 8 ^ var4[(int) (((long) (this.field4178 ? 1 : 0) ^ this.field4188) & 0xFFL)];
        if (var2 != 0L && this.field4188 != var2) {
            class10.field127.method640(arg0 + 6768, var2);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)V", line = 202)
    public final void method1665(byte arg0, int arg1, int arg2) {
        field4193++;
        if (arg0 < 41) {
            field4174 = -100;
        }
        this.field4183[arg1] = arg2;
        this.method1664((byte) 43);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljh;IIZILjh;)Lke;", line = 214)
    public final class113 method1666(class272 arg0, int arg1, int arg2, boolean arg3, int arg4, class272 arg5) {
        field4186++;
        if (this.field4181 != arg2) {
            return class57.method397(0, this.field4181).method928(arg1, (byte) 91, arg5, arg4, arg0);
        }
        long var7 = this.field4188;
        int[] var9 = this.field4173;
        if (arg5 != null && (arg5.field4767 >= 0 || arg5.field4754 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field4173[var10];
            }
            if (arg5.field4767 >= 0) {
                if (arg5.field4767 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class242.method1674(1073741824, arg5.field4767);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg5.field4754 >= 0) {
                if (arg5.field4754 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class242.method1674(arg5.field4754, 1073741824);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class113 var11 = (class113) class10.field127.method642(var7, (byte) -61);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = var9[var13];
                if ((var14 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var14) != 0 && !class136.method939(-1, var14 & 0x3FFFFFFF).method2013(0)) {
                        var12 = true;
                    }
                } else if (!class144.method994(true, var14 & 0x3FFFFFFF).method1003(arg2 ^ 0x5E2E, this.field4178)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field4191 != -1L) {
                    var11 = (class113) class10.field127.method642(this.field4191, (byte) -117);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var15 = 0;
                class230[] var16 = new class230[12];
                for (int var17 = 0; var17 < 12; var17++) {
                    int var18 = var9[var17];
                    if ((var18 & 0x40000000) != 0) {
                        class230 var20 = class144.method994(true, var18 & 0x3FFFFFFF).method1002(this.field4178, true);
                        if (var20 != null) {
                            var16[var15++] = var20;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class230 var19 = class136.method939(-1, var18 & 0x3FFFFFFF).method2012((byte) 8);
                        if (var19 != null) {
                            var16[var15++] = var19;
                        }
                    }
                }
                int var21 = var9[0];
                if ((var21 & 0x40000000) != 0) {
                    class145 var22 = class144.method994(true, var21 & 0x3FFFFFFF);
                    if (var22.field2597 != null) {
                        for (int var23 = 0; var23 < var22.field2597.length; var23++) {
                            if (var22.field2597[var23] != null && var16[var23 + 1] != null) {
                                int var24 = var22.field2597[var23][0];
                                int var25 = var22.field2597[var23][1];
                                int var26 = var22.field2597[var23][2];
                                int var27 = var22.field2597[var23][3];
                                int var28 = var22.field2597[var23][4];
                                int var29 = var22.field2597[var23][5];
                                var16[var23 + 1].method1549(var24, var25, var26);
                                var16[var23 + 1].method1562(var27, var28, var29);
                            }
                        }
                    }
                }
                class230 var30 = new class230(var16, var15);
                for (int var31 = 0; var31 < 5; var31++) {
                    if (this.field4183[var31] < class215.field3819[var31].length) {
                        var30.method1553(class195.field3527[var31], class215.field3819[var31][this.field4183[var31]]);
                    }
                    if (class191.field3474[var31].length > this.field4183[var31]) {
                        var30.method1553(class233.field4124[var31], class191.field3474[var31][this.field4183[var31]]);
                    }
                }
                var11 = var30.method1555(64, 850, -30, -50, -30);
                if (class231.field4051) {
                    ((class148) var11).method1040(false, false, true, true, false, false, true);
                }
                if (arg3) {
                    class10.field127.method643((byte) -49, var7, var11);
                    this.field4191 = var7;
                }
            }
        }
        if (arg5 == null && arg0 == null) {
            return var11;
        }
        class113 var32;
        if (arg5 != null && arg0 != null) {
            var32 = arg5.method1969(arg1, true, arg0, arg4, var11);
        } else if (arg5 == null) {
            var32 = arg0.method1968(var11, false, arg4);
        } else {
            var32 = arg5.method1968(var11, false, arg1);
        }
        return var32;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V", line = 442)
    public final void method1667(int arg0, int arg1, int arg2) {
        field4187++;
        int var4 = class151.field2733[arg0];
        if (arg1 != 27183) {
            method1663(107);
        }
        if (this.field4173[var4] != 0 && class136.method939(-1, arg2) != null) {
            this.field4173[var4] = class242.method1674(Integer.MIN_VALUE, arg2);
            this.method1664((byte) 43);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjh;I)Lke;", line = 464)
    public final class113 method1668(int arg0, class272 arg1, int arg2) {
        field4176++;
        if (this.field4181 != -1) {
            return class57.method397(0, this.field4181).method937(arg0, 20369, arg1);
        }
        int var4 = 76 / ((arg2 + 2) / 53);
        class113 var5 = (class113) class177.field3226.method642(this.field4188, (byte) -75);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < 12; var7++) {
                int var8 = this.field4173[var7];
                if ((var8 & 0x40000000) == 0) {
                    if ((var8 & Integer.MIN_VALUE) != 0 && !class136.method939(-1, var8 & 0x3FFFFFFF).method2015(79)) {
                        var6 = true;
                    }
                } else if (!class144.method994(true, var8 & 0x3FFFFFFF).method1013(0, this.field4178)) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            int var9 = 0;
            class230[] var10 = new class230[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = this.field4173[var11];
                if ((var12 & 0x40000000) != 0) {
                    class230 var13 = class144.method994(true, var12 & 0x3FFFFFFF).method1007(this.field4178, false);
                    if (var13 != null) {
                        var10[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class230 var14 = class136.method939(-1, var12 & 0x3FFFFFFF).method2014(4);
                    if (var14 != null) {
                        var10[var9++] = var14;
                    }
                }
            }
            class230 var15 = new class230(var10, var9);
            for (int var16 = 0; var16 < 5; var16++) {
                if (this.field4183[var16] < class215.field3819[var16].length) {
                    var15.method1553(class195.field3527[var16], class215.field3819[var16][this.field4183[var16]]);
                }
                if (this.field4183[var16] < class191.field3474[var16].length) {
                    var15.method1553(class233.field4124[var16], class191.field3474[var16][this.field4183[var16]]);
                }
            }
            var5 = var15.method1555(64, 768, -50, -10, -50);
            class177.field3226.method643((byte) -49, this.field4188, var5);
        }
        if (arg1 != null) {
            var5 = arg1.method1965(var5, -14500, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 586)
    public static void method1669(int arg0) {
        field4195 = null;
        field4194 = null;
        if (arg0 != 12) {
            method1669(-105);
        }
        field4177 = null;
        field4185 = null;
        field4180 = null;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)I", line = 605)
    public static final int method1670(int arg0) {
        field4190++;
        if (class42.field559 == null) {
            return -1;
        }
        while (class305.field5313 < class42.field559.field5053) {
            if (class42.field559.method2066(-27963, class305.field5313)) {
                return class305.field5313++;
            }
            class305.field5313++;
        }
        if (arg0 != -10) {
            method1663(-35);
        }
        return -1;
    }
}
