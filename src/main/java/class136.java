import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class136 {

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    public static int[] field2206 = new int[2];

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2207 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lph;")
    public static class229 field2201 = class266.method1858(" <col=00ff80>", 0);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "J")
    private long field2211;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "J")
    private long field2221;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Z")
    public boolean field2203;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
    private int[] field2204;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
    private int[] field2219;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lwa;II)Lv;", line = 4)
    public final class286 method960(class312 arg0, int arg1, int arg2) {
        if (arg2 != 64) {
            this.method966(-105, (int[]) null, (int[]) null, true, -27);
        }
        field2210++;
        if (this.field2208 != -1) {
            return class25.method155(this.field2208, -66).method2122(arg1, arg0, (byte) 59);
        }
        class286 var4 = (class286) class195.field3251.method1413(this.field2211, true);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field2219[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class308.method2079(var7 & 0x3FFFFFFF, 3).method1109(114)) {
                        var5 = true;
                    }
                } else if (!class124.method920(arg2 - 148, var7 & 0x3FFFFFFF).method1333(-29488, this.field2203)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class28[] var8 = new class28[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field2219[var10];
                if ((var11 & 0x40000000) != 0) {
                    class28 var12 = class124.method920(-84, var11 & 0x3FFFFFFF).method1346((byte) 100, this.field2203);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class28 var13 = class308.method2079(var11 & 0x3FFFFFFF, 3).method1111(arg2 ^ 0x28);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class28 var14 = new class28(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field2204[var15] < class102.field1746[var15].length) {
                    var14.method195(class220.field3618[var15], class102.field1746[var15][this.field2204[var15]]);
                }
                if (class240.field3971[var15].length > this.field2204[var15]) {
                    var14.method195(class244.field4027[var15], class240.field3971[var15][this.field2204[var15]]);
                }
            }
            var4 = var14.method193(64, 768, -50, -10, -50);
            class195.field3251.method1419(this.field2211, 5216, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method2111(arg1, (byte) -21, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIILwa;)Lv;", line = 120)
    public final class286 method961(byte arg0, int arg1, int arg2, int arg3, class312 arg4) {
        if (arg0 != -123) {
            this.method960((class312) null, -46, -36);
        }
        field2215++;
        long var6 = (long) arg1 | (long) (arg2 << 16) | (long) arg1 << 32;
        class286 var8 = (class286) class195.field3251.method1413(var6, true);
        if (var8 == null) {
            class28[] var9 = new class28[2];
            int var10 = 0;
            if (!class308.method2079(arg1, 3).method1109(114) || !class308.method2079(arg2, 3).method1109(114)) {
                return null;
            }
            class28 var11 = class308.method2079(arg1, 3).method1111(96);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class28 var12 = class308.method2079(arg2, 3).method1111(arg0 ^ 0xFFFFFFD1);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class28 var13 = new class28(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class102.field1746[var14].length > this.field2204[var14]) {
                    var13.method195(class220.field3618[var14], class102.field1746[var14][this.field2204[var14]]);
                }
                if (this.field2204[var14] < class240.field3971[var14].length) {
                    var13.method195(class244.field4027[var14], class240.field3971[var14][this.field2204[var14]]);
                }
            }
            var8 = var13.method193(64, 768, -50, -10, -50);
            class195.field3251.method1419(var6, 5216, var8);
        }
        if (arg4 != null) {
            var8 = arg4.method2111(arg3, (byte) -128, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 185)
    public static void method962(int arg0) {
        field2201 = null;
        field2206 = null;
        if (arg0 != 1501) {
            field2207 = -27;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V", line = 207)
    public static final void method963(int arg0, byte arg1, int arg2) {
        class156 var3 = class6.method38(-31037, arg0);
        int var4 = var3.field2533;
        int var5 = var3.field2531;
        int var6 = 127 % ((-arg1 - 10) / 59);
        int var7 = var3.field2543;
        field2220++;
        int var8 = class15.field176[var7 - var5];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var5;
        class208.method1448(32, arg2 << var5 & var9 | class85.field1454[var4] & ~var9, var4);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)V", line = 235)
    public final void method964(byte arg0, int arg1, int arg2) {
        field2209++;
        int var4 = class206.field3395[arg2];
        if (this.field2219[var4] == 0 || class308.method2079(arg1, 3) == null) {
            return;
        }
        this.field2219[var4] = class201.method1410(Integer.MIN_VALUE, arg1);
        if (arg0 != 53) {
            this.method970((byte) 124);
        }
        this.method973((byte) 104);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIIILwa;Lwa;)Lv;", line = 254)
    public final class286 method965(boolean arg0, int arg1, int arg2, int arg3, class312 arg4, class312 arg5) {
        field2216++;
        if (this.field2208 != -1) {
            return class25.method155(this.field2208, -81).method2119(arg4, arg5, arg1, arg2, (byte) -23);
        }
        long var7 = this.field2211;
        int[] var9 = this.field2219;
        if (arg4 != null && (arg4.field5230 >= 0 || arg4.field5242 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field2219[var10];
            }
            if (arg4.field5230 >= 0) {
                if (arg4.field5230 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class201.method1410(arg4.field5230, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg4.field5242 >= 0) {
                if (arg4.field5242 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class201.method1410(1073741824, arg4.field5242);
                    var7 ^= (long) var9[3];
                }
            }
        }
        if (arg3 != 16711680) {
            this.method973((byte) 29);
        }
        class286 var11 = (class286) class166.field2704.method1413(var7, true);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = var9[var13];
                if ((var14 & 0x40000000) == 0) {
                    if ((var14 & Integer.MIN_VALUE) != 0 && !class308.method2079(var14 & 0x3FFFFFFF, arg3 ^ 0xFF0003).method1108(14425)) {
                        var12 = true;
                    }
                } else if (!class124.method920(-84, var14 & 0x3FFFFFFF).method1343(arg3 - 16700667, this.field2203)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field2221 != -1L) {
                    var11 = (class286) class166.field2704.method1413(this.field2221, true);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class28[] var15 = new class28[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; var17++) {
                    int var18 = var9[var17];
                    if ((var18 & 0x40000000) != 0) {
                        class28 var20 = class124.method920(-84, var18 & 0x3FFFFFFF).method1338(false, this.field2203);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class28 var19 = class308.method2079(var18 & 0x3FFFFFFF, 3).method1110(0);
                        if (var19 != null) {
                            var15[var16++] = var19;
                        }
                    }
                }
                int var21 = var9[0];
                if ((var21 & 0x40000000) != 0) {
                    class191 var22 = class124.method920(-84, var21 & 0x3FFFFFFF);
                    if (var22.field3102 != null) {
                        for (int var23 = 0; var23 < var22.field3102.length; var23++) {
                            if (var22.field3102[var23] != null && var15[var23 + 1] != null) {
                                int var24 = var22.field3102[var23][1];
                                int var25 = var22.field3102[var23][0];
                                int var26 = var22.field3102[var23][2];
                                int var27 = var22.field3102[var23][3];
                                int var28 = var22.field3102[var23][5];
                                int var29 = var22.field3102[var23][4];
                                var15[var23 + 1].method197(var25, var24, var26);
                                var15[var23 + 1].method223(var27, var29, var28);
                            }
                        }
                    }
                }
                class28 var30 = new class28(var15, var16);
                for (int var31 = 0; var31 < 5; var31++) {
                    if (class102.field1746[var31].length > this.field2204[var31]) {
                        var30.method195(class220.field3618[var31], class102.field1746[var31][this.field2204[var31]]);
                    }
                    if (class240.field3971[var31].length > this.field2204[var31]) {
                        var30.method195(class244.field4027[var31], class240.field3971[var31][this.field2204[var31]]);
                    }
                }
                var11 = var30.method193(64, 850, -30, -50, -30);
                if (class99.field1675) {
                    ((class322) var11).method2180(false, false, true, true, false, false, true);
                }
                if (arg0) {
                    class166.field2704.method1419(var7, 5216, var11);
                    this.field2221 = var7;
                }
            }
        }
        if (arg4 == null && arg5 == null) {
            return var11;
        }
        class286 var32;
        if (arg4 != null && arg5 != null) {
            var32 = arg4.method2108(arg5, var11, arg2, arg1, (byte) -128);
        } else if (arg4 == null) {
            var32 = arg5.method2114(arg2, var11, (byte) -2);
        } else {
            var32 = arg4.method2114(arg1, var11, (byte) -2);
        }
        return var32;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[I[IZI)V", line = 484)
    public final void method966(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        field2205++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class22.field279; var7++) {
                    class153 var8 = class308.method2079(var7, 3);
                    if (var8 != null && !var8.field2497 && var8.field2490 == (var6 + (arg3 ? 7 : 0))) {
                        arg1[class206.field3395[var6]] = class201.method1410(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        int var9 = -106 / ((arg4 - 36) / 46);
        this.field2208 = arg0;
        this.field2204 = arg2;
        this.field2203 = arg3;
        this.field2219 = arg1;
        this.method973((byte) 88);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 529)
    public static final void method967(int arg0, Component arg1) {
        arg1.removeKeyListener(class251.field4208);
        if (arg0 != 5324) {
            field2206 = (int[]) null;
        }
        field2213++;
        arg1.removeFocusListener(class251.field4208);
        class94.field1596 = -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V", line = 542)
    public final void method968(byte arg0, boolean arg1) {
        field2202++;
        this.field2203 = arg1;
        this.method973((byte) 117);
        if (arg0 != 88) {
            method962(-23);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 554)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class98 var20 = new class98(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class225.field3705[var21][arg1][arg2] == null) {
                    class225.field3705[var21][arg1][arg2] = new class72(var21, arg1, arg2);
                }
            }
            class225.field3705[arg0][arg1][arg2].field1212 = var20;
        } else if (arg3 == 1) {
            class98 var22 = new class98(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class225.field3705[var23][arg1][arg2] == null) {
                    class225.field3705[var23][arg1][arg2] = new class72(var23, arg1, arg2);
                }
            }
            class225.field3705[arg0][arg1][arg2].field1212 = var22;
        } else {
            class158 var24 = new class158(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class225.field3705[var25][arg1][arg2] == null) {
                    class225.field3705[var25][arg1][arg2] = new class72(var25, arg1, arg2);
                }
            }
            class225.field3705[arg0][arg1][arg2].field1229 = var24;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I", line = 614)
    public final int method970(byte arg0) {
        field2218++;
        if (arg0 != -18) {
            method969(-74, 120, -119, 62, -4, 102, 97, -88, -128, -39, -84, -13, 8, -74, -119, -73, -128, 25, -82, 76);
        }
        return this.field2208 == -1 ? (this.field2204[0] << 25) + (this.field2219[11] << 5) + (this.field2219[8] << 10) + (this.field2219[0] << 15) + (this.field2204[4] << 20) + this.field2219[1] : class25.method155(this.field2208, arg0 ^ 0x78).field5272 + 305419896;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V", line = 639)
    public final void method971(int arg0, int arg1, int arg2) {
        field2212++;
        this.field2204[arg1] = arg2;
        this.method973((byte) 38);
        if (arg0 != 3) {
            this.field2203 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLsi;)I", line = 651)
    public static final int method972(byte arg0, class66 arg1) {
        field2217++;
        int var2 = 0;
        if (arg1.method494(class177.field2920, false)) {
            var2++;
        }
        if (arg1.method494(class255.field4255, false)) {
            var2++;
        }
        if (arg1.method494(class131.field2131, false)) {
            var2++;
        }
        if (arg1.method494(class37.field601, false)) {
            var2++;
        }
        if (arg1.method494(class271.field4545, false)) {
            var2++;
        }
        if (arg1.method494(class154.field2512, false)) {
            var2++;
        }
        if (arg0 > -28) {
            method963(46, (byte) 120, 97);
        }
        if (arg1.method494(class6.field81, false)) {
            var2++;
        }
        if (arg1.method494(class266.field4483, false)) {
            var2++;
        }
        if (arg1.method494(class234.field3863, false)) {
            var2++;
        }
        if (arg1.method494(class216.field3552, false)) {
            var2++;
        }
        if (arg1.method494(class192.field3173, false)) {
            var2++;
        }
        if (arg1.method494(class268.field4495, false)) {
            var2++;
        }
        if (arg1.method494(class298.field4850, false)) {
            var2++;
        }
        if (arg1.method494(class273.field4563, false)) {
            var2++;
        }
        if (arg1.method494(class29.field479, false)) {
            var2++;
        }
        if (arg1.method494(class59.field837, false)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 721)
    private final void method973(byte arg0) {
        field2222++;
        long[] var2 = class67.field1078;
        if (arg0 < 35) {
            this.method968((byte) -18, false);
        }
        long var3 = this.field2211;
        this.field2211 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2211 = this.field2211 >>> 8 ^ var2[(int) ((this.field2211 ^ (long) (this.field2219[var5] >> 24)) & 0xFFL)];
            this.field2211 = var2[(int) ((this.field2211 ^ (long) (this.field2219[var5] >> 16)) & 0xFFL)] ^ this.field2211 >>> 8;
            this.field2211 = var2[(int) (((long) (this.field2219[var5] >> 8) ^ this.field2211) & 0xFFL)] ^ this.field2211 >>> 8;
            this.field2211 = this.field2211 >>> 8 ^ var2[(int) ((this.field2211 ^ (long) this.field2219[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2211 = var2[(int) (((long) this.field2204[var6] ^ this.field2211) & 0xFFL)] ^ this.field2211 >>> 8;
        }
        this.field2211 = var2[(int) (((long) (this.field2203 ? 1 : 0) ^ this.field2211) & 0xFFL)] ^ this.field2211 >>> 8;
        if (var3 != 0L && this.field2211 != var3) {
            class166.field2704.method1416(var3, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BII)V", line = 769)
    public static final void method974(byte arg0, int arg1, int arg2) {
        int var3 = -61 % ((arg0 - 80) / 38);
        int var4 = 0;
        if (class84.field1446 > 0) {
            class171.method1243((byte) 83, class84.field1446);
            class84.field1446 = 0;
        }
        field2214++;
        short var5 = 256;
        int var6 = class210.field3480 * arg2;
        int var7 = 0;
        for (int var8 = 1; var8 < (var5 - 1); var8++) {
            int var9 = (var5 - var8) * class243.field4003[var8] / var5;
            if (var9 < 0) {
                var9 = 0;
            }
            var4 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var11 = class208.field3432[var4++];
                int var12 = class210.field3485[arg1 + (var6++)];
                if (var11 == 0) {
                    class120.field2027.field5579[var7++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var11 - 18;
                    int var15 = class75.field1259[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class120.field2027.field5579[var7++] = class243.method1696(16711680, class243.method1696(var15, 65280) * var13 + (class243.method1696(var12, 65280) * var14)) + class243.method1696(-16711936, var14 * class243.method1696(16711935, var12) + class243.method1696(16711935, var15) * var13) >> 8;
                }
            }
            for (int var16 = 0; var16 < var9; var16++) {
                class120.field2027.field5579[var7++] = class210.field3485[var6++ + arg1];
            }
            var6 += class210.field3480 - 128;
        }
        class120.field2027.method647(arg1, arg2);
    }
}
