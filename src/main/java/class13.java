import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Lrg;")
    public static class217 field261 = new class217();

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Leb;")
    public static class230 field263 = class68.method589(0, "Stufe: ");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "J")
    private long field249;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "J")
    private long field256;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Lkk;")
    public static class223 field265;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Z")
    public boolean field244;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[I")
    private int[] field258;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "[I")
    public static int[] field262;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "[[Z")
    public static boolean[][] field255;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
    public final int method134(int arg0) {
        field250++;
        int var2 = -52 / ((arg0 - 60) / 57);
        return this.field253 == -1 ? (this.field258[11] << 5) + (this.field258[8] << 10) + (this.field260[0] << 25) + (this.field258[0] << 15) + (this.field260[4] << 20) + this.field258[1] : class232.method1640(-125, this.field253).field1751 + 305419896;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILsa;III)Lrk;")
    public final class257 method135(int arg0, class249 arg1, int arg2, int arg3, int arg4) {
        field251++;
        long var6 = (long) (arg3 << 16) | (long) arg0 << 32 | (long) arg0;
        class257 var8 = (class257) class1.field1.method1125(var6, true);
        if (var8 == null) {
            class250[] var9 = new class250[2];
            int var10 = 0;
            if (!class247.method1725((byte) -120, arg0).method308((byte) 108) || !class247.method1725((byte) -97, arg3).method308((byte) 107)) {
                return null;
            }
            class250 var11 = class247.method1725((byte) -124, arg0).method303((byte) 17);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class250 var12 = class247.method1725((byte) -83, arg3).method303((byte) 76);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class250 var13 = new class250(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class131.field2344[var14].length > this.field260[var14]) {
                    var13.method1750(class269.field4770[var14], class131.field2344[var14][this.field260[var14]]);
                }
                if (class59.field1126[var14].length > this.field260[var14]) {
                    var13.method1750(class218.field3754[var14], class59.field1126[var14][this.field260[var14]]);
                }
            }
            var8 = var13.method1746(64, 768, -50, -10, -50);
            class1.field1.method1129(var6, true, var8);
        }
        if (arg2 != 0) {
            this.field256 = 33L;
        }
        if (arg1 != null) {
            var8 = arg1.method1739(arg4, 65535, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lna;")
    public static final class31 method136(byte arg0, int arg1) {
        if (arg0 < 21) {
            field255 = null;
        }
        field248++;
        class31 var2 = (class31) class269.field4766.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class114.field2037.method1546(arg1 & 0x7FFF, (byte) -100, 1);
        } else {
            var3 = class89.field1559.method1546(arg1, (byte) -100, 1);
        }
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method283(new class14(var3), -75);
        }
        if (arg1 >= 32768) {
            var4.method287(-24979);
        }
        class269.field4766.method276(var4, (long) arg1, -67);
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILsa;BLsa;)Lrk;")
    public final class257 method137(int arg0, int arg1, class249 arg2, byte arg3, class249 arg4) {
        field252++;
        if (this.field253 != -1) {
            return class232.method1640(-107, this.field253).method829(arg0, arg4, arg1, 64, arg2);
        }
        long var6 = this.field256;
        int[] var8 = this.field258;
        if (arg2 != null && (arg2.field4418 >= 0 || arg2.field4440 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field258[var9];
            }
            if (arg2.field4418 >= 0) {
                if (arg2.field4418 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class177.method1290(arg2.field4418, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg2.field4440 >= 0) {
                if (arg2.field4440 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class177.method1290(1073741824, arg2.field4440);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class257 var10 = (class257) class146.field2634.method1125(var6, true);
        if (arg3 > -12) {
            field265 = null;
        }
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class247.method1725((byte) -125, var30 & 0x3FFFFFFF).method305(-23419)) {
                        var11 = true;
                    }
                } else if (!class214.method1484(var30 & 0x3FFFFFFF, -1).method125((byte) -23, this.field244)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field249 != -1L) {
                    var10 = (class257) class146.field2634.method1125(this.field249, true);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class250[] var13 = new class250[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class250 var29 = class214.method1484(var27 & 0x3FFFFFFF, -1).method117(this.field244, (byte) 101);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class250 var28 = class247.method1725((byte) -109, var27 & 0x3FFFFFFF).method306((byte) -20);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class12 var17 = class214.method1484(var16 & 0x3FFFFFFF, -1);
                    if (var17.field208 != null) {
                        for (int var18 = 0; var18 < var17.field208.length; var18++) {
                            if (var17.field208[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field208[var18][1];
                                int var20 = var17.field208[var18][0];
                                int var21 = var17.field208[var18][2];
                                int var22 = var17.field208[var18][3];
                                int var23 = var17.field208[var18][5];
                                int var24 = var17.field208[var18][4];
                                var13[var18 + 1].method1747(var20, var19, var21);
                                var13[var18 + 1].method1768(var22, var24, var23);
                            }
                        }
                    }
                }
                class250 var25 = new class250(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field260[var26] < class131.field2344[var26].length) {
                        var25.method1750(class269.field4770[var26], class131.field2344[var26][this.field260[var26]]);
                    }
                    if (this.field260[var26] < class59.field1126[var26].length) {
                        var25.method1750(class218.field3754[var26], class59.field1126[var26][this.field260[var26]]);
                    }
                }
                var10 = var25.method1746(64, 850, -30, -50, -30);
                class146.field2634.method1129(var6, true, var10);
                this.field249 = var6;
            }
        }
        if (arg2 == null && arg4 == null) {
            return var10;
        }
        class257 var31;
        if (arg2 != null && arg4 != null) {
            var31 = arg2.method1731(-106, var10, arg4, arg1, arg0);
        } else if (arg2 == null) {
            var31 = arg4.method1738(119, var10, arg0);
        } else {
            var31 = arg2.method1738(123, var10, arg1);
        }
        return var31;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lth;I)I")
    public static final int method138(class109 arg0, int arg1) {
        class97 var2 = arg0.field1956;
        field243++;
        if (var2.field1787 != null) {
            var2 = var2.method825((byte) 108);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != -3217) {
            field263 = null;
        }
        int var3 = var2.field1798;
        if (arg0.field2305 == arg0.field2282) {
            var3 = var2.field1744;
        } else if (arg0.field2282 == arg0.field2250) {
            var3 = var2.field1785;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method139(boolean arg0) {
        field265 = null;
        field262 = null;
        field263 = null;
        if (!arg0) {
            field255 = null;
            field261 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([I[IIZB)V")
    public final void method140(int[] arg0, int[] arg1, int arg2, boolean arg3, byte arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class163.field2898; var7++) {
                    class33 var8 = class247.method1725((byte) -93, var7);
                    if (var8 != null && !var8.field602 && var8.field610 == var6 + (arg3 ? 7 : 0)) {
                        arg0[class225.field3894[var6]] = class177.method1290(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field260 = arg1;
        field242++;
        this.field258 = arg0;
        if (arg4 != 29) {
            field261 = null;
        }
        this.field244 = arg3;
        this.field253 = arg2;
        this.method141(-6);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    private final void method141(int arg0) {
        field254++;
        long[] var2 = class105.field1907;
        long var3 = this.field256;
        this.field256 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field256 = var2[(int) ((this.field256 ^ (long) (this.field258[var5] >> 24)) & 0xFFL)] ^ this.field256 >>> 8;
            this.field256 = this.field256 >>> 8 ^ var2[(int) ((this.field256 ^ (long) (this.field258[var5] >> 16)) & 0xFFL)];
            this.field256 = this.field256 >>> 8 ^ var2[(int) ((this.field256 ^ (long) (this.field258[var5] >> 8)) & 0xFFL)];
            this.field256 = this.field256 >>> 8 ^ var2[(int) ((this.field256 ^ (long) this.field258[var5]) & 0xFFL)];
        }
        if (arg0 != -6) {
            this.field258 = null;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field256 = var2[(int) (((long) this.field260[var6] ^ this.field256) & 0xFFL)] ^ this.field256 >>> 8;
        }
        this.field256 = this.field256 >>> 8 ^ var2[(int) ((this.field256 ^ (long) (this.field244 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field256 != var3) {
            class146.field2634.method1128((byte) -48, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public final void method142(int arg0, int arg1, int arg2) {
        field246++;
        if (arg0 <= 24) {
            this.field244 = false;
        }
        int var4 = class225.field3894[arg2];
        if (this.field258[var4] != 0 && class247.method1725((byte) -89, arg1) != null) {
            this.field258[var4] = class177.method1290(arg1, Integer.MIN_VALUE);
            this.method141(-6);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
    public final void method143(boolean arg0, int arg1) {
        this.field244 = arg0;
        field247++;
        if (arg1 != 31264) {
            field265 = null;
        }
        this.method141(arg1 - 31270);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
    public final void method144(int arg0, int arg1, int arg2) {
        field259++;
        this.field260[arg2] = arg1;
        if (arg0 != 0) {
            this.method135(10, (class249) null, 35, -1, -122);
        }
        this.method141(-6);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lsa;II)Lrk;")
    public final class257 method145(class249 arg0, int arg1, int arg2) {
        field245++;
        if (this.field253 != -1) {
            return class232.method1640(-117, this.field253).method831(-31, arg1, arg0);
        }
        if (arg2 >= -86) {
            method136((byte) -35, 69);
        }
        class257 var4 = (class257) class1.field1.method1125(this.field256, true);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field258[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class247.method1725((byte) -119, var15 & 0x3FFFFFFF).method308((byte) 119)) {
                        var5 = true;
                    }
                } else if (!class214.method1484(var15 & 0x3FFFFFFF, -1).method126((byte) -104, this.field244)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class250[] var7 = new class250[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field258[var9];
                if ((var12 & 0x40000000) != 0) {
                    class250 var14 = class214.method1484(var12 & 0x3FFFFFFF, -1).method132(3669, this.field244);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class250 var13 = class247.method1725((byte) -100, var12 & 0x3FFFFFFF).method303((byte) 81);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class250 var10 = new class250(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class131.field2344[var11].length > this.field260[var11]) {
                    var10.method1750(class269.field4770[var11], class131.field2344[var11][this.field260[var11]]);
                }
                if (class59.field1126[var11].length > this.field260[var11]) {
                    var10.method1750(class218.field3754[var11], class59.field1126[var11][this.field260[var11]]);
                }
            }
            var4 = var10.method1746(64, 768, -50, -10, -50);
            class1.field1.method1129(this.field256, true, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1739(arg1, 65535, var4);
        }
        return var4;
    }
}
