import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class645 extends class471 {

    @OriginalMember(owner = "client!jia", name = "X", descriptor = "I")
    public int field9246 = -1;

    @OriginalMember(owner = "client!jia", name = "J", descriptor = "I")
    public int field9239 = -1;

    @OriginalMember(owner = "client!jia", name = "db", descriptor = "Z")
    private boolean field9256 = false;

    @OriginalMember(owner = "client!jia", name = "P", descriptor = "I")
    public int field9254 = 0;

    @OriginalMember(owner = "client!jia", name = "fb", descriptor = "I")
    private int field9260 = 0;

    @OriginalMember(owner = "client!jia", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field9261 = new String[] { method4675(method4674("~\\\u0007\u0017%U\u001d")), method4675(method4674("~\\\u0007\u0017(<")), method4675(method4674("~\\\u0007\u0017\"U\u001d")), method4675(method4674("z@\nU")), method4675(method4674("o\u001bH\u0017\u001b")), method4675(method4674("~\\\u0007\u0017!<")), method4675(method4674("~\\\u0007\u0017%<")), method4675(method4674("vV\u0007")), method4675(method4674("~\\\u0007\u0017!U\u001d")), method4675(method4674("~\\\u0007\u0017#U\u001d")), method4675(method4674("~\\\u0007\u0017'U\u001d")), method4675(method4674("~\\\u0007\u0017$U\u001d")), method4675(method4674("~\\\u0007\u0017 <")), method4675(method4674("~\\\u0007\u00170<")), method4675(method4674("~\\\u0007\u0017'<")), method4675(method4674("~\\\u0007\u00177<")), method4675(method4674("~\\\u0007\u0017.<")) };

    @OriginalMember(owner = "client!jia", name = "ab", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!jia", name = "N", descriptor = "I")
    public int field9240;

    @OriginalMember(owner = "client!jia", name = "Z", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!jia", name = "K", descriptor = "I")
    public int field9242;

    @OriginalMember(owner = "client!jia", name = "R", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!jia", name = "eb", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!jia", name = "gb", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!jia", name = "V", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!jia", name = "M", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!jia", name = "T", descriptor = "I")
    public int field9249;

    @OriginalMember(owner = "client!jia", name = "hb", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!jia", name = "bb", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!jia", name = "cb", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!jia", name = "Y", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!jia", name = "S", descriptor = "I")
    public int field9255;

    @OriginalMember(owner = "client!jia", name = "Q", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!jia", name = "W", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!jia", name = "O", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B[B)V", line = 4)
    public static final void method4669(byte arg0, byte[] arg1) {
        try {
            ++field9238;
            int var2 = -47 / ((arg0 - -82) / 39);
            class176 var3 = new class176(arg1);
            while (true) {
                while (true) {
                    while (true) {
                        int var4 = var3.method1645((byte) -81);
                        if (var4 == 0) {
                            return;
                        }
                        if (~var4 != -2) {
                            if (~var4 == -5) {
                                int var5 = var3.method1645((byte) -91);
                                class785.field11473 = new int[var5];
                                for (int var6 = 0; var5 > var6; ++var6) {
                                    class785.field11473[var6] = var3.method1687((byte) -66);
                                    if (~class785.field11473[var6] == -65536) {
                                        class785.field11473[var6] = -1;
                                    }
                                }
                            } else if (~var4 == -6) {
                                int var7 = var3.method1645((byte) -90);
                                class732.field10726 = new int[var7];
                                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                                    class732.field10726[var8] = var3.method1687((byte) -72);
                                    if (class732.field10726[var8] == 65535) {
                                        class732.field10726[var8] = -1;
                                    }
                                }
                            }
                        } else {
                            int[] var9 = class706.field10126 = new int[6];
                            var9[0] = var3.method1687((byte) -45);
                            var9[1] = var3.method1687((byte) -96);
                            var9[2] = var3.method1687((byte) -110);
                            var9[3] = var3.method1687((byte) -72);
                            var9[4] = var3.method1687((byte) -86);
                            var9[5] = var3.method1687((byte) -97);
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field9261[5] + arg0 + ',' + (arg1 != null ? field9261[4] : field9261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(IIIII)V", line = 79)
    public class645(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "(B)I", line = 85)
    public final int method54(byte arg0) {
        try {
            if (arg0 >= -112) {
                this.field9256 = false;
            }
            ++field9245;
            return this.field9260;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9261[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)I", line = 97)
    public final int method3375(boolean arg0) {
        try {
            ++field9247;
            if (arg0) {
                return -6;
            } else {
                class584 var2 = class229.field3563.method531(this.field9255, (byte) 77);
                int var3 = var2.field8474;
                if (~this.field9239 != 0) {
                    class584 var4 = class229.field3563.method531(this.field9239, (byte) 56);
                    if (~var4.field8474 < ~var3) {
                        var3 = var4.field8474;
                    }
                }
                if (~this.field9246 != 0) {
                    class584 var5 = class229.field3563.method531(this.field9246, (byte) 70);
                    if (~var3 > ~var5.field8474) {
                        var3 = var5.field8474;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9261[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "(I)I", line = 135)
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                return -87;
            } else {
                ++field9251;
                return -10;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9261[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lha;B)Lkv;", line = 156)
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field9248;
            class135 var3 = class51.method533(super.field9975, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
            class513 var4 = class605.method4422(super.field9975, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
            int var5 = 0;
            if (var3 != null && var3.field1911.field2938) {
                var5 = var3.field1911.method43(0);
            }
            if (var4 != null && -var5 < var4.field7592) {
                var5 = -var4.field7592;
            }
            if (this.field9254 != var5) {
                super.field9972 -= this.field9254;
                this.field9254 = var5;
                super.field9972 += var5;
            }
            if (arg1 != 122) {
                this.field9249 = -6;
            }
            class486 var6 = arg0.method251();
            var6.method2471();
            if (this.field9254 == 0) {
                boolean var7 = false;
                boolean var8 = false;
                boolean var9 = false;
                class293 var10 = class740.field10902[super.field9974];
                int var11 = this.field9260 << 1;
                int var13 = -var11 / 2;
                int var14 = -var11 / 2;
                int var15 = var10.method2497((byte) -78, super.field9985 + var13, super.field9983 + var14);
                int var16 = var11 / 2;
                int var17 = -var11 / 2;
                int var18 = var10.method2497((byte) -111, super.field9985 + var16, super.field9983 + var17);
                int var19 = -var11 / 2;
                int var20 = var11 / 2;
                int var21 = var10.method2497((byte) -122, super.field9985 + var19, super.field9983 + var20);
                int var22 = var11 / 2;
                int var23 = var11 / 2;
                int var24 = var10.method2497((byte) -99, super.field9985 + var22, super.field9983 + var23);
                int var25 = var18 > var15 ? var15 : var18;
                int var26 = var21 >= var24 ? var24 : var21;
                int var27 = var24 > var18 ? var18 : var24;
                if (var11 != 0) {
                    int var28 = 16383 & (int) (Math.atan2((double) (-var26 + var25), (double) var11) * 2607.5945876176133D);
                    if (~var28 != -1) {
                        var6.method2459(var28);
                    }
                }
                int var29 = var21 > var15 ? var15 : var21;
                int var30 = var15 + var24;
                if (~var11 != -1) {
                    int var31 = (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var29), (double) var11)) & 16383;
                    if (var31 != 0) {
                        var6.method2464(-var31);
                    }
                }
                if (~(var18 + var21) > ~var30) {
                    var30 = var18 - -var21;
                }
                int var32 = (var30 >> 1) + -super.field9972;
                if (~var32 != -1) {
                    var6.method2480(0, var32, 0);
                }
            }
            var6.method2480(super.field9985, super.field9972 + -10, super.field9983);
            class281 var33 = class349.method2910(true, 3, (byte) -119);
            this.field9260 = 0;
            this.field9256 = false;
            if (~this.field9246 != 0) {
                class499 var34 = class229.field3563.method531(this.field9246, (byte) 82).method4284((class124) null, (byte) -120, this.field9242, 0, arg0, 0, 2048, -1, (class210) null);
                if (var34 != null) {
                    if (class200.field3163) {
                        var34.method423(var6, var33.field4578[2], class547.field8042, 0);
                    } else {
                        var34.method426(var6, var33.field4578[2], 0);
                    }
                    this.field9256 |= var34.method407();
                    this.field9260 = var34.method390();
                }
            }
            if (this.field9239 != -1) {
                class499 var35 = class229.field3563.method531(this.field9239, (byte) 98).method4284((class124) null, (byte) -120, this.field9249, 0, arg0, 0, 2048, -1, (class210) null);
                if (var35 != null) {
                    if (class200.field3163) {
                        var35.method423(var6, var33.field4578[1], class547.field8042, 0);
                    } else {
                        var35.method426(var6, var33.field4578[1], 0);
                    }
                    this.field9256 |= var35.method407();
                    if (~var35.method390() < ~this.field9260) {
                        this.field9260 = var35.method390();
                    }
                }
            }
            class499 var36 = class229.field3563.method531(this.field9255, (byte) 96).method4284((class124) null, (byte) -120, this.field9240, 0, arg0, 0, 2048, -1, (class210) null);
            if (var36 != null) {
                if (class200.field3163) {
                    var36.method423(var6, var33.field4578[0], class547.field8042, 0);
                } else {
                    var36.method426(var6, var33.field4578[0], 0);
                }
                this.field9256 |= var36.method407();
                if (~var36.method390() < ~this.field9260) {
                    this.field9260 = var36.method390();
                }
            }
            return var33;
        } catch (RuntimeException var38) {
            throw class590.method4333(var38, field9261[9] + (arg0 != null ? field9261[4] : field9261[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V", line = 329)
    public static final void method4670(byte arg0) {
        try {
            class608.field8762 = 0;
            class397.field6289 = 0;
            class507.field7569 = 0;
            class2.field36 = 0;
            class141.field2011 = 0;
            ++field9257;
            class586.field8499 = 0;
            for (int var1 = 0; ~class262.field4273.length < ~var1; ++var1) {
                class262.field4273[var1] = null;
            }
            class148.method1351(-52);
            for (int var2 = 0; var2 < 2048; ++var2) {
                class33.field395[var2] = null;
            }
            class632.field9088 = 0;
            class176.field2797.method730(true);
            if (arg0 == -96) {
                class421.field6647 = 0;
                class96.field1407.method730(true);
                class161.method1513((byte) 50);
                class765.field11213 = 0;
                class398.field6315.method2830(91);
                class72.field1004 = 0L;
                class318.field5184 = null;
                class201.field3181 = null;
                class239.field3682 = null;
                class570.field8258 = null;
                class617.field8917 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9261[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIILha;)Z", line = 373)
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field9250;
            class486 var5 = arg3.method251();
            var5.method2465(super.field9985, super.field9972 - 10, super.field9983);
            class584 var6 = class229.field3563.method531(this.field9255, (byte) 31);
            class499 var7 = var6.method4284((class124) null, (byte) -120, this.field9240, 0, arg3, 0, arg0, -1, (class210) null);
            if (var7 != null && (class200.field3163 ? var7.method429(arg2, arg1, var5, true, var6.field8474, class547.field8042) : var7.method425(arg2, arg1, var5, true, var6.field8474))) {
                return true;
            } else {
                if (~this.field9239 != 0) {
                    class584 var8 = class229.field3563.method531(this.field9239, (byte) 56);
                    class499 var9 = var8.method4284((class124) null, (byte) -120, this.field9249, 0, arg3, 0, 131072, -1, (class210) null);
                    if (var9 != null && (class200.field3163 ? var9.method429(arg2, arg1, var5, true, var8.field8474, class547.field8042) : var9.method425(arg2, arg1, var5, true, var8.field8474))) {
                        return true;
                    }
                }
                if (this.field9246 != -1) {
                    class584 var10 = class229.field3563.method531(this.field9246, (byte) 122);
                    class499 var11 = var10.method4284((class124) null, (byte) -120, this.field9242, 0, arg3, 0, 131072, -1, (class210) null);
                    if (var11 != null && (class200.field3163 ? var11.method429(arg2, arg1, var5, true, var10.field8474, class547.field8042) : var11.method425(arg2, arg1, var5, true, var10.field8474))) {
                        return true;
                    }
                }
                return false;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field9261[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9261[4] : field9261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "(I)Z", line = 414)
    public final boolean method45(int arg0) {
        try {
            ++field9259;
            return arg0 != -32768 ? true : this.field9256;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9261[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "(I)V", line = 426)
    public static final void method4671(int arg0) {
        try {
            if (arg0 != -12312) {
                method4671(-25);
            }
            ++field9253;
            class452.field6991.method861(-109);
            class295.field4813.method5243(arg0 + -942);
            class6.field55.method958(arg0 + 12313);
            class370.field5999.method3998(true);
            class395.field6267.method3135(-1);
            class229.field3563.method524((byte) 108);
            class397.field6293.method2055((byte) 77);
            class779.field11366.method1858((byte) 117);
            class581.field8375.method720((byte) -119);
            class531.field7801.method2072(true);
            class519.field7687.method3206((byte) -103);
            class46.field518.method3008((byte) 30);
            class78.field1216.method3180(90);
            class179.field2874.method3726(false);
            class362.field5915.method2322(11824);
            class161.field2548.method4540((byte) -125);
            class289.field4655.method96((byte) 19);
            class716.field10360.method4315(16199);
            class653.field9349.method1287(30);
            class199.field3154.method5687(arg0 ^ -12403);
            class100.field1465.method1846(256);
            class539.field7911.method1356(26);
            class723.field10619.method875(-115);
            class774.method5576(126);
            class755.method5466((byte) -52);
            class642.method4650(1);
            class350.method2914((byte) -73);
            class615.method4473(14989);
            class82.field1252.method298(5);
            class738.field10844.method298(5);
            class320.field5210.method298(arg0 ^ -12307);
            class607.field8753.method298(5);
            class598.field8667.method298(arg0 + 12317);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9261[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(Lha;B)Lrga;", line = 470)
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            ++field9258;
            if (arg1 != -118) {
                this.method43(35);
            }
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9261[2] + (arg0 != null ? field9261[4] : field9261[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "(B)Z", line = 489)
    public final boolean method41(byte arg0) {
        try {
            if (arg0 < 54) {
                this.field9240 = 27;
            }
            ++field9252;
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9261[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "(I)V", line = 505)
    public static final void method4672(int arg0) {
        try {
            if (class382.field6139 != null) {
                for (int var1 = 0; class245.field3793 > var1; ++var1) {
                    class382.field6139[var1] = null;
                }
                class382.field6139 = null;
            }
            ++field9244;
            if (class31.field367 != null) {
                for (int var2 = 0; ~class599.field8686 < ~var2; ++var2) {
                    class31.field367[var2] = null;
                }
                class31.field367 = null;
            }
            if (class134.field1903 != null) {
                for (int var3 = 0; ~class772.field11311 < ~var3; ++var3) {
                    class134.field1903[var3] = null;
                }
                class134.field1903 = null;
            }
            class438.field6842 = -1;
            class115.field1680 = -1;
            if (arg0 == 0) {
                class319.field5200 = null;
                class430.field6766 = null;
                class568.field8254 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9261[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLha;)V", line = 559)
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field9243;
            if (arg0 != -108) {
                method4672(-96);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9261[11] + arg0 + ',' + (arg1 != null ? field9261[4] : field9261[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILjava/lang/String;I)Lhha;", line = 572)
    public static final class547 method4673(int arg0, String arg1, int arg2) {
        try {
            ++field9241;
            int var3 = 114 / ((arg2 - 30) / 41);
            class547 var4;
            try {
                var4 = (class547) Class.forName(field9261[7]).newInstance();
            } catch (Throwable var6) {
                var4 = new class724();
            }
            var4.field8038 = arg0;
            var4.field8039 = arg1;
            return var4;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9261[6] + arg0 + ',' + (arg1 != null ? field9261[4] : field9261[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4674(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4675(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
