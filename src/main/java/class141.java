import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class141 extends class2 {

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
    public boolean field2245 = false;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Z")
    private boolean field2246 = false;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    private int field2240 = 0;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field2241 = -32768;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    private int field2259 = -1;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    private int field2261 = 0;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Llc;")
    private class307 field2247;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "[B")
    public static byte[] field2244 = new byte[520];

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2254 = "Please remove ";

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "J")
    public static volatile long field2260 = 0L;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Lic;")
    private class171 field2256;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(CZ)Z")
    public static final boolean method990(char arg0, boolean arg1) {
        field2262++;
        if (arg1) {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public final void method991(int arg0, int arg1) {
        field2242++;
        int var3 = 88 % ((74 - arg0) / 42);
        if (this.field2245) {
            return;
        }
        this.field2261 += arg1;
        while (this.field2261 > this.field2247.field4891[this.field2240]) {
            this.field2261 -= this.field2247.field4891[this.field2240];
            this.field2240++;
            if (this.field2240 >= this.field2247.field4895.length) {
                this.field2245 = true;
                break;
            }
        }
        if (!this.field2245) {
            class274.method1838(this.field2265, false, this.field2247, this.field2240, (byte) -122, this.field2243);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)[Lhg;")
    public static final class220[] method992(int arg0) {
        field2263++;
        class220[] var1 = new class220[class183.field3014];
        for (int var2 = 0; var2 < class183.field3014; var2++) {
            var1[var2] = new class260(class255.field4128, class111.field1749, class273.field4380[var2], class314.field5058[var2], class246.field3916[var2], class60.field976[var2], class70.field1192[var2], class243.field3870);
        }
        int var3 = -13 % ((arg0 + 36) / 56);
        class28.method156(-27424);
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILk;)V")
    private final void method993(int arg0, class37 arg1) {
        class31 var3 = (class31) arg1;
        if ((this.field2256 == null || this.field2256.field2775) && (var3.field397 != null || var3.field393 != null)) {
            this.field2256 = new class171(class29.field360, 1, 1);
        }
        if (this.field2256 != null) {
            this.field2256.method1248(var3.field397, var3.field393, false, var3.field390, var3.field377, var3.field408);
        }
        this.field2246 = true;
        if (arg0 > 18) {
            field2252++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILag;B)I")
    public static final int method994(int arg0, class211 arg1, byte arg2) {
        field2264++;
        if (arg1.field3365 == null || arg1.field3365.length <= arg0) {
            return -2;
        }
        if (arg2 != 32) {
            method990('&', true);
        }
        try {
            int[] var3 = arg1.field3365[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var9 = class228.field3670[var3[var4++]];
                }
                if (var7 == 2) {
                    var9 = class230.field3729[var3[var4++]];
                }
                if (var7 == 3) {
                    var9 = class88.field1442[var3[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class211 var12 = class17.method87(var11, -20055);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class81.method562(var13, -20358).field1854 || class249.field3950)) {
                        for (int var14 = 0; var14 < var12.field3361.length; var14++) {
                            if ((var13 + 1) == var12.field3361[var14]) {
                                var9 += var12.field3500[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 5) {
                    var9 = class195.field3160[var3[var4++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 6) {
                    var9 = client.field4853[class230.field3729[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class195.field3160[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class239.field3829.field4790;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class249.field3947[var15]) {
                            var9 += class230.field3729[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class211 var18 = class17.method87(var17, -20055);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class81.method562(var19, -20358).field1854 || class249.field3950)) {
                        for (int var20 = 0; var20 < var18.field3361.length; var20++) {
                            if (var19 + 1 == var18.field3361[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class107.field1692;
                }
                if (var7 == 12) {
                    var9 = class308.field4930;
                }
                if (var7 == 13) {
                    int var21 = class195.field3160[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class295.method1960(255, var23);
                }
                if (var7 == 18) {
                    var9 = (class239.field3829.field637 >> 7) + class276.field4438;
                }
                if (var7 == 19) {
                    var9 = (class239.field3829.field710 >> 7) + class108.field1732;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var9;
                    }
                    if (var6 == 1) {
                        var5 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var6 == 3) {
                        var5 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        field2255++;
        class37 var13 = this.method996(-78);
        if (var13 != null) {
            this.method993(69, var13);
            var13.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2256);
            this.field2241 = var13.method15();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)V")
    public static final void method995(int arg0, byte arg1) {
        if (arg1 > -100) {
            field2244 = null;
        }
        field2253++;
        if (!class67.method473(arg0, (byte) -97)) {
            return;
        }
        class211[] var2 = class34.field519[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class211 var4 = var2[var3];
            if (var4 != null) {
                var4.field3401 = 0;
                var4.field3464 = 1;
                var4.field3376 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public final int method15() {
        field2250++;
        return this.field2241;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lk;")
    private final class37 method996(int arg0) {
        if (arg0 >= -66) {
            this.field2243 = 44;
        }
        class55 var2 = class137.method958(this.field2248, (byte) 35);
        class37 var3;
        if (this.field2245) {
            var3 = var2.method379(0, -18882, -1, -1);
        } else {
            var3 = var2.method379(this.field2261, -18882, this.field2240, this.field2259);
        }
        field2251++;
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2239++;
        if (!this.field2246) {
            class37 var6 = this.method996(-79);
            if (var6 == null) {
                return;
            }
            this.method993(126, var6);
        }
        if (this.field2256 != null) {
            this.field2256.method1250(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method997(byte arg0) {
        field2244 = null;
        field2254 = null;
        if (arg0 > -30) {
            method992(88);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIII)V")
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2265 = arg3;
        this.field2243 = arg2;
        this.field2257 = arg1;
        this.field2249 = arg5 + arg6;
        this.field2248 = arg0;
        this.field2258 = arg4;
        int var8 = class137.method958(this.field2248, (byte) -127).field908;
        if (var8 == -1) {
            this.field2245 = true;
        } else {
            this.field2245 = false;
            this.field2247 = class22.method121(var8, true);
        }
        if (this.field2249 == arg6) {
            class274.method1838(this.field2265, false, this.field2247, this.field2240, (byte) -115, this.field2243);
        }
    }
}
