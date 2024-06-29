import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class144 extends class110 {

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    private int field2180 = -1;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Z")
    public static boolean field2181 = true;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "[I")
    public int[] field2169;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "[[[B")
    public static byte[][][] field2178;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I[IZLqg;[I)V", line = 7)
    public static final void method1026(int[] arg0, int[] arg1, boolean arg2, class195 arg3, int[] arg4) {
        field2182++;
        if (arg2) {
            field2175 = 122;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var6 != 0 && arg3.field1485.length > var9) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg3.field1485[var9] = null;
                    } else {
                        class272 var10 = class72.method468(var8, 7);
                        int var11 = var10.field4177;
                        class122 var12 = arg3.field1485[var9];
                        if (var12 != null) {
                            if (var12.field1905 == var8) {
                                if (var11 == 0) {
                                    var12 = arg3.field1485[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1906 = var7;
                                    var12.field1903 = 1;
                                    var12.field1900 = 0;
                                    var12.field1908 = 0;
                                    var12.field1899 = 0;
                                    class167.method1170(arg3.field1505, var10, 0, -64, arg3.field1566, class114.field1750 == arg3);
                                } else if (var11 == 2) {
                                    var12.field1899 = 0;
                                }
                            } else if (var10.field4158 >= class72.method468(var12.field1905, -127).field4158) {
                                var12 = arg3.field1485[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class122 var13 = arg3.field1485[var9] = new class122();
                            var13.field1900 = 0;
                            var13.field1906 = var7;
                            var13.field1899 = 0;
                            var13.field1905 = var8;
                            var13.field1908 = 0;
                            var13.field1903 = 1;
                            class167.method1170(arg3.field1505, var10, 0, -64, arg3.field1566, class114.field1750 == arg3);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V", line = 103)
    public final void method768(int arg0) {
        super.method768(arg0);
        field2165++;
        this.field2169 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/lang/String;)V", line = 113)
    public static final void method1027(int arg0, int arg1, String arg2) {
        field2183++;
        class169 var3 = class101.method712(arg1, 2, 2089666400);
        var3.method1183(false);
        if (arg0 != 2623) {
            method1032(57, -40, (byte[]) null, 60);
        }
        var3.field2527 = arg2;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V", line = 129)
    public static void method1028(int arg0) {
        field2178 = (byte[][][]) null;
        if (arg0 < 58) {
            method1030(93, (byte) -55, 120);
        }
    }

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)Z", line = 139)
    public final boolean method1029(int arg0) {
        field2167++;
        if (this.field2169 != null) {
            return true;
        } else if (this.field2180 < 0) {
            if (arg0 != 22050) {
                field2174 = -124;
            }
            return false;
        } else {
            class127 var2 = class193.field2887 >= 0 ? class195.method1347(class193.field2887, (byte) -123, class190.field2830, this.field2180) : class315.method2161(this.field2180, class190.field2830, 0);
            var2.method940();
            this.field2173 = var2.field3537;
            this.field2169 = var2.field1983;
            this.field2171 = var2.field3533;
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)[[I", line = 169)
    public int[][] method445(int arg0, boolean arg1) {
        field2166++;
        int[][] var3 = this.field1701.method1477((byte) 40, arg0);
        if (this.field1701.field3255 && this.method1029(22050)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = this.field2171 * (class295.field4523 == this.field2173 ? arg0 : this.field2173 * arg0 / class295.field4523);
            if (class124.field1936 == this.field2171) {
                for (int var8 = 0; var8 < class124.field1936; var8++) {
                    int var9 = this.field2169[var7++];
                    var5[var8] = class124.method893(var9 << 4, 4080);
                    var4[var8] = class124.method893(var9 >> 4, 4080);
                    var6[var8] = class124.method893(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class124.field1936; var10++) {
                    int var11 = this.field2171 * var10 / class124.field1936;
                    int var12 = this.field2169[var7 + var11];
                    var5[var10] = class124.method893(var12 << 4, 4080);
                    var4[var10] = class124.method893(var12 >> 4, 4080);
                    var6[var10] = class124.method893(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1) {
            this.field2173 = 101;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IBI)V", line = 235)
    public static final void method1030(int arg0, byte arg1, int arg2) {
        field2179++;
        if (arg1 != -83) {
            method1030(43, (byte) -5, 104);
        }
        class169 var3 = class101.method712(arg2, 13, 2089666400);
        var3.method1183(false);
        var3.field2542 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)I", line = 249)
    public final int method766(int arg0) {
        field2168++;
        if (arg0 != 32224) {
            field2178 = (byte[][][]) ((byte[][][]) null);
        }
        return this.field2180;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLf;)Z", line = 261)
    public static final boolean method1031(byte arg0, class329 arg1) {
        field2172++;
        if (arg0 != -87) {
            field2175 = -126;
        }
        if (arg1.field5032 == 205) {
            class172.field2584 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[BI)I", line = 288)
    public static final int method1032(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        field2176++;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = class306.field4663[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 != -3) {
            method1030(-19, (byte) -85, -76);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "(I)V", line = 315)
    public static final void method1033(int arg0) {
        if (class225.field3426 != null) {
            class225.field3426.method1238(2);
        }
        if (class17.field211 != null) {
            class17.field211.method1238(2);
        }
        class63.method418(class178.field2630, 2, (byte) 110, 22050);
        field2177++;
        class225.field3426 = class140.method1010(arg0 ^ 0xFFFFFFFD, class274.field4200, class315.field4764, 22050, 0);
        class225.field3426.method1245(class206.field3112, arg0 - 6682);
        if (arg0 != -1) {
            method1027(-37, 103, (String) null);
        }
        class17.field211 = class140.method1010(2, class274.field4200, class315.field4764, 2048, 1);
        class17.field211.method1245(class72.field936, arg0 ^ 0x1A1A);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 338)
    public class144() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILre;I)V", line = 342)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            method1026((int[]) null, (int[]) null, true, (class195) null, (int[]) null);
        }
        if (arg0 == 0) {
            this.field2180 = arg1.method1830((byte) -77);
        }
        field2170++;
    }
}
