import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    private int field2101 = 32;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
    private long field2090 = class68.method516(false);

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field2107 = 0;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "J")
    private long field2110 = 0L;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[Lm;")
    private class83[] field2108 = new class83[8];

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "J")
    private long field2112 = 0L;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    private int field2106 = 0;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field2114 = 0;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
    private boolean field2115 = true;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "[Lm;")
    private class83[] field2117 = new class83[8];

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[Lhb;")
    public static class51[] field2104 = new class51[32768];

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "[J")
    public static long[] field2105 = new long[100];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lia;")
    public static class57 field2088;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ljd;")
    public static class66 field2083;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lae;")
    public static class6 field2080;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lm;")
    private class83 field2093;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public int[] field2078;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BLfa;BI)V")
    public static final void method713(byte[] arg0, class37 arg1, byte arg2, int arg3) {
        field2103++;
        class102 var4 = new class102();
        var4.field2323 = 0;
        var4.field365 = arg3;
        var4.field2321 = arg1;
        var4.field2330 = arg0;
        if (arg2 != -64) {
            return;
        }
        class121 var5 = class131.field3026;
        synchronized (class131.field3026) {
            class131.field3026.method926(5569, var4);
        }
        class117.method899(-76);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
        field2086++;
        if (!arg0) {
            this.field2115 = true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public final synchronized void method715(byte arg0) {
        field2094++;
        if (this.field2078 == null) {
            return;
        }
        long var2 = class68.method516(false);
        try {
            if (this.field2112 != 0L) {
                if (var2 < this.field2112) {
                    return;
                }
                this.method280(this.field2113);
                this.field2112 = 0L;
                this.field2115 = true;
            }
            int var4 = this.method284();
            if (this.field2114 < this.field2109 - var4) {
                this.field2114 = this.field2109 - var4;
            }
            int var5 = this.field2116 + this.field2111;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2113 < var5 + 256) {
                this.field2113 += 1024;
                if (this.field2113 > 16384) {
                    this.field2113 = 16384;
                }
                var4 = 0;
                this.method285();
                this.method280(this.field2113);
                this.field2115 = true;
                if (var5 + 256 > this.field2113) {
                    var5 = this.field2113 - 256;
                    this.field2111 = var5 - this.field2116;
                }
            }
            while (var4 < var5) {
                this.method721(this.field2078, 256);
                this.method281();
                var4 += 256;
            }
            if (this.field2110 < var2) {
                if (this.field2115) {
                    this.field2115 = false;
                } else if (this.field2114 == 0 && this.field2106 == 0) {
                    this.method285();
                    this.field2112 = var2 + 2000L;
                    return;
                } else {
                    this.field2111 = Math.min(this.field2106, this.field2114);
                    this.field2106 = this.field2114;
                }
                this.field2110 = var2 + 2000L;
                this.field2114 = 0;
            }
            this.field2109 = var4;
        } catch (Exception var8) {
            this.method285();
            this.field2112 = var2 + 2000L;
        }
        int var6 = -97 / ((7 - arg0) / 39);
        try {
            if (this.field2090 + 500000L < var2) {
                var2 = this.field2090;
            }
            while (this.field2090 + 5000L < var2) {
                this.method717(0, 256);
                this.field2090 += 256000 / class49.field920;
            }
        } catch (Exception var7) {
            this.field2090 = var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
    public int method284() throws Exception {
        field2081++;
        return this.field2113;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
    public static final boolean method716(byte arg0) {
        field2085++;
        try {
            int var1 = -35 / ((arg0 + 7) / 61);
            if (class27.field530 == 2) {
                if (class86.field1961 == null) {
                    class86.field1961 = class145.method1172(class20.field381, class126.field2851, class30.field606);
                    if (class86.field1961 == null) {
                        return false;
                    }
                }
                if (class113.field2542 == null) {
                    class113.field2542 = new class104(class37.field717, class43.field815);
                }
                if (class46.field861.method382(22050, class86.field1961, class5.field59, class113.field2542, 58)) {
                    class46.field861.method349(16);
                    class46.field861.method363(false, class49.field882);
                    class46.field861.method383((byte) -93, class86.field1961, class5.field55);
                    class113.field2542 = null;
                    class86.field1961 = null;
                    class27.field530 = 0;
                    class20.field381 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class46.field861.method384((byte) -122);
            class20.field381 = null;
            class86.field1961 = null;
            class27.field530 = 0;
            class113.field2542 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method283(Component arg0) throws Exception {
        field2079++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    private final void method717(int arg0, int arg1) {
        field2084++;
        this.field2107 -= arg1;
        if (this.field2107 < 0) {
            this.field2107 = 0;
        }
        if (this.field2093 != null) {
            this.field2093.method360(arg1);
        }
        if (arg0 != 0) {
            this.method720(null, 65, -74);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method718(int arg0) {
        field2080 = null;
        field2105 = null;
        field2104 = null;
        field2083 = null;
        if (arg0 != 50) {
            field2105 = null;
        }
        field2088 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
    public void method281() throws Exception {
        field2095++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    public final synchronized void method719(boolean arg0) {
        if (!arg0) {
            this.method715((byte) 33);
        }
        if (class84.field1873 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class84.field1873.field501[var3] == this) {
                    class84.field1873.field501[var3] = null;
                }
                if (class84.field1873.field501[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class84.field1873.field489 = true;
                while (class84.field1873.field502) {
                    class18.method164(false, 50L);
                }
                class84.field1873 = null;
            }
        }
        this.method285();
        this.field2078 = null;
        field2087++;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
    public void method286() throws Exception {
        field2096++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public void method280(int arg0) throws Exception {
        field2091++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
    public void method285() {
        field2089++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lm;II)V")
    private final void method720(class83 arg0, int arg1, int arg2) {
        if (arg1 != 256) {
            this.field2090 = -87L;
        }
        field2097++;
        int var4 = arg2 >> 5;
        class83 var5 = this.field2108[var4];
        if (var5 == null) {
            this.field2117[var4] = arg0;
        } else {
            var5.field1850 = arg0;
        }
        this.field2108[var4] = arg0;
        arg0.field1847 = arg2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([II)V")
    private final void method721(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class73.field1624) {
            var3 = arg1 << 1;
        }
        class101.method767(arg0, 0, var3);
        this.field2107 -= arg1;
        if (this.field2093 != null && this.field2107 <= 0) {
            this.field2107 += class49.field920 >> 4;
            class75.method557(this.field2093, 2047);
            this.method720(this.field2093, 256, this.field2093.method609());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class83 var10 = null;
                        class83 var11 = this.field2117[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class81 var12 = var11.field1849;
                                if (var12 == null || var12.field1810 <= var8) {
                                    var11.field1848 = true;
                                    int var13 = var11.method357();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1810 += var13;
                                    }
                                    if (var4 >= this.field2101) {
                                        break label107;
                                    }
                                    class83 var14 = var11.method353();
                                    if (var14 != null) {
                                        int var15 = var11.field1847;
                                        while (var14 != null) {
                                            this.method720(var14, 256, var15 * var14.method609() >> 8);
                                            var14 = var11.method377();
                                        }
                                    }
                                    class83 var16 = var11.field1850;
                                    var11.field1850 = null;
                                    if (var10 == null) {
                                        this.field2117[var7] = var16;
                                    } else {
                                        var10.field1850 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2108[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1850;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class83 var18 = this.field2117[var17];
                this.field2117[var17] = this.field2108[var17] = null;
                while (var18 != null) {
                    class83 var19 = var18.field1850;
                    var18.field1850 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2107 < 0) {
            this.field2107 = 0;
        }
        if (this.field2093 != null) {
            this.field2093.method372(arg0, 0, arg1);
        }
        this.field2090 = class68.method516(false);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final synchronized void method722(int arg0) {
        this.field2115 = true;
        field2100++;
        try {
            int var2 = 62 % ((arg0 + 78) / 45);
            this.method286();
        } catch (Exception var3) {
            this.method285();
            this.field2112 = class68.method516(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILm;)V")
    public final synchronized void method723(int arg0, class83 arg1) {
        this.field2093 = arg1;
        if (arg0 != -27293) {
            method716((byte) -46);
        }
        field2099++;
    }
}
