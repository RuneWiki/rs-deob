import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class21 extends class292 {

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Ljava/lang/String;")
    private String field312 = "null";

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Z")
    public static boolean field320 = true;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "S")
    public static short field325 = 32767;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "C")
    public char field309;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "C")
    public char field315;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Lll;")
    private class211 field310;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Lll;")
    public class211 field314;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIIII)V")
    public static final void method176(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field306++;
        int var5 = 111 % ((arg0 - 48) / 49);
        for (class144 var6 = (class144) class286.field4493.method1010(124); var6 != null; var6 = (class144) class286.field4493.method1008((byte) 88)) {
            class69.method538(1424, var6, arg4, arg3, arg1, arg2);
        }
        for (class144 var7 = (class144) class203.field3164.method1010(122); var7 != null; var7 = (class144) class203.field3164.method1008((byte) 88)) {
            class8 var12 = var7.field2249.method1801((byte) 123);
            byte var13 = 1;
            if (var7.field2249.field4148 == var12.field142) {
                var13 = 0;
            } else if (var7.field2249.field4148 == var12.field167 || var7.field2249.field4148 == var12.field144 || var7.field2249.field4148 == var12.field155 || var7.field2249.field4148 == var12.field164) {
                var13 = 2;
            } else if (var7.field2249.field4148 == var12.field148 || var7.field2249.field4148 == var12.field159 || var7.field2249.field4148 == var12.field166 || var7.field2249.field4148 == var12.field153) {
                var13 = 3;
            }
            if (var7.field2238 != var13) {
                int var14 = class7.method85(-1, var7.field2249);
                if (var7.field2243 != var14) {
                    if (var7.field2233 != null) {
                        class39.field661.method718(var7.field2233);
                        var7.field2233 = null;
                    }
                    var7.field2243 = var14;
                }
                var7.field2238 = var13;
            }
            var7.field2242 = var7.field2249.field4176;
            var7.field2248 = var7.field2249.field4176 + var7.field2249.method226((byte) -97) * 64;
            var7.field2241 = var7.field2249.field4123;
            var7.field2245 = var7.field2249.field4123 + (var7.field2249.method226((byte) -97) * 64);
            class69.method538(1424, var7, arg4, arg3, arg1, arg2);
        }
        for (class144 var8 = (class144) class61.field981.method1410(-104); var8 != null; var8 = (class144) class61.field981.method1413(-1)) {
            class8 var9 = var8.field2240.method1801((byte) 114);
            byte var10 = 1;
            if (var8.field2240.field4148 == var9.field142) {
                var10 = 0;
            } else if (var8.field2240.field4148 == var9.field167 || var8.field2240.field4148 == var9.field144 || var8.field2240.field4148 == var9.field155 || var8.field2240.field4148 == var9.field164) {
                var10 = 2;
            } else if (var8.field2240.field4148 == var9.field148 || var8.field2240.field4148 == var9.field159 || var8.field2240.field4148 == var9.field166 || var8.field2240.field4148 == var9.field153) {
                var10 = 3;
            }
            if (var8.field2238 != var10) {
                int var11 = class237.method1594((byte) 88, var8.field2240);
                if (var8.field2243 != var11) {
                    if (var8.field2233 != null) {
                        class39.field661.method718(var8.field2233);
                        var8.field2233 = null;
                    }
                    var8.field2243 = var11;
                }
                var8.field2238 = var10;
            }
            var8.field2242 = var8.field2240.field4176;
            var8.field2248 = var8.field2240.field4176 + var8.field2240.method226((byte) -97) * 64;
            var8.field2241 = var8.field2240.field4123;
            var8.field2245 = var8.field2240.field4123 + var8.field2240.method226((byte) -97) * 64;
            class69.method538(1424, var8, arg4, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    private final void method177(int arg0) {
        this.field310 = new class211(this.field314.method1416((byte) -24));
        if (arg0 > -91) {
            field318 = -42;
        }
        field313++;
        for (class145 var2 = (class145) this.field314.method1410(-122); var2 != null; var2 = (class145) this.field314.method1413(-1)) {
            class167 var3 = new class167(var2.field2257, (int) var2.field1408);
            this.field310.method1409(class251.method1680(var2.field2257, (byte) -80), 1, var3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method178(byte arg0, String arg1) {
        if (arg0 != -112) {
            field318 = 63;
        }
        field307++;
        if (this.field314 == null) {
            return false;
        }
        if (this.field310 == null) {
            this.method177(-117);
        }
        for (class167 var3 = (class167) this.field310.method1414(true, class251.method1680(arg1, (byte) -97)); var3 != null; var3 = (class167) this.field310.method1415(arg0 + 112)) {
            if (var3.field2524.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lf;II)V")
    private final void method179(class37 arg0, int arg1, int arg2) {
        field321++;
        if (arg1 == 1) {
            this.field309 = class11.method121(63, arg0.method322((byte) 10));
        } else if (arg1 == 2) {
            this.field315 = class11.method121(63, arg0.method322((byte) 59));
        } else if (arg1 == 3) {
            this.field312 = arg0.method331(16312);
        } else if (arg1 == 4) {
            this.field322 = arg0.method307(-103);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method293(115);
            this.field314 = new class211(class208.method1388((byte) 114, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var7 = arg0.method307(-67);
                class86 var8;
                if (arg1 == 5) {
                    var8 = new class145(arg0.method331(16312));
                } else {
                    var8 = new class229(arg0.method307(-119));
                }
                this.field314.method1409((long) var7, 1, var8);
            }
        }
        int var6 = -3 % ((16 - arg2) / 53);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILf;)V")
    public final void method180(int arg0, class37 arg1) {
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                field308++;
                if (arg0 != 0) {
                    this.field314 = null;
                    return;
                }
                return;
            }
            this.method179(arg1, var3, 90);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BJ)V")
    public static final void method181(byte arg0, long arg1) {
        field311++;
        if (arg0 >= -106) {
            method186((byte) -21, (String) null);
        }
        int var3 = class5.field76 + class261.field4058.field4176;
        if (!class195.field3070) {
            class276.field4334 += (float) arg1 * class53.field821 / 40.0F;
            class161.field2460 += (float) arg1 * class26.field400 / 40.0F;
        }
        int var4 = class93.field1506 + class261.field4058.field4123;
        if (class136.field2117 - var3 < -500 || (class136.field2117 - var3) > 500 || (class262.field4095 - var4) < -500 || (class262.field4095 - var4) > 500) {
            class262.field4095 = var4;
            class136.field2117 = var3;
        }
        if (class136.field2117 != var3) {
            int var5 = var3 - class136.field2117;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class136.field2117 += var6;
        }
        if (class262.field4095 != var4) {
            int var7 = var4 - class262.field4095;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class262.field4095 += var8;
        }
        class191.method1289((byte) 120);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z")
    public final boolean method182(int arg0, byte arg1) {
        field305++;
        int var3 = -125 / ((arg1 + 8) / 55);
        if (this.field314 == null) {
            return false;
        }
        if (this.field310 == null) {
            this.method185(-19649);
        }
        class229 var4 = (class229) this.field310.method1414(true, (long) arg0);
        return var4 != null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III[Lng;I[BIIZII)V")
    public static final void method183(int arg0, int arg1, int arg2, class77[] arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field326++;
        class37 var11 = new class37(arg5);
        int var12 = -1;
        while (true) {
            int var13 = var11.method317(-120);
            if (var13 == 0) {
                if (arg4 != 0) {
                    field318 = -98;
                    return;
                }
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method285((byte) 35);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var11.method333((byte) -59);
                int var18 = (var14 & 0xFD7) >> 6;
                int var19 = var14 >> 12;
                int var20 = var17 >> 2;
                int var21 = var17 & 0x3;
                if (arg6 == var19 && arg9 <= var18 && var18 < arg9 + 8 && arg2 <= var16 && arg2 + 8 > var16) {
                    class73 var22 = class85.method690(2276, var12);
                    int var23 = class143.method983(var21, var16 & 0x7, var18 & 0x7, -2115, var22.field1227, var22.field1232, arg1) + arg0;
                    int var24 = arg10 + class112.method832(var18 & 0x7, arg4, var21, arg1, var22.field1227, var22.field1232, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class77 var25 = null;
                        if (!arg8) {
                            int var26 = arg7;
                            if ((class191.field3041[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class7.method83(arg8, var12, arg1 + var21 & 0x3, arg7, var24, arg7, var20, var23, -83, !arg8, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
    public final int method184(byte arg0, int arg1) {
        field324++;
        if (arg0 < 54) {
            return 113;
        } else if (this.field314 == null) {
            return this.field322;
        } else {
            class229 var3 = (class229) this.field314.method1414(true, (long) arg1);
            return var3 == null ? this.field322 : var3.field3580;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    private final void method185(int arg0) {
        field317++;
        this.field310 = new class211(this.field314.method1416((byte) -24));
        if (arg0 != -19649) {
            this.field314 = null;
        }
        for (class229 var2 = (class229) this.field314.method1410(-86); var2 != null; var2 = (class229) this.field314.method1413(-1)) {
            class229 var3 = new class229((int) var2.field1408);
            this.field310.method1409((long) var2.field3580, 1, var3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(BLjava/lang/String;)V")
    public static final void method186(byte arg0, String arg1) {
        field316++;
        int var2 = class71.method554(arg1, -102);
        if (var2 == -1) {
            return;
        }
        if (arg0 < 98) {
            field318 = 105;
        }
        int[] var3 = class87.field1422.method1991(class293.field4615.field4543[var2] >> 14 & 0x3FFF, class293.field4615.field4543[var2] & 0x3FFF, 0, (class293.field4615.field4543[var2] & 0x3BB0ED86) >> 28);
        class129.method911(var3[2], var3[1], 70);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method187(int arg0, int arg1) {
        field323++;
        if (this.field314 == null) {
            return this.field312;
        }
        if (arg1 != 15424) {
            this.method177(89);
        }
        class145 var3 = (class145) this.field314.method1414(true, (long) arg0);
        return var3 == null ? this.field312 : var3.field2257;
    }
}
