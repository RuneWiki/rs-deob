import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class66 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "J")
    public static long field921 = 0L;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lqj;")
    public static class196 field928 = class80.method502("", -48);

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lqj;")
    public static class196 field942 = class80.method502("<col=c0ff00>", -48);

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lah;")
    public static class22 field933 = new class22(32);

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lqj;")
    private static class196 field943 = class80.method502("glow3:", -48);

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lqj;")
    public static class196 field944 = field943;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lqj;")
    public static class196 field945 = class80.method502("", -48);

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lqj;")
    public static class196 field947 = field943;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "J")
    private long field925;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "J")
    private long field929;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Z")
    public boolean field931;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    private int[] field930;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[Lqj;")
    public static class196[] field946;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lm;IB)Loc;")
    public final class119 method415(class149 arg0, int arg1, byte arg2) {
        field941++;
        if (this.field936 != -1) {
            return class126.method777((byte) -87, this.field936).method665(arg1, arg0, (byte) -125);
        }
        class119 var4 = (class119) class218.field3903.method132(this.field929, 111);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field930[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class127.method783(var15 & 0x3FFFFFFF, -12816).method1380(23373)) {
                        var5 = true;
                    }
                } else if (!class178.method1154(false, var15 & 0x3FFFFFFF).method1367(this.field931, true)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class208[] var8 = new class208[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field930[var9];
                if ((var12 & 0x40000000) != 0) {
                    class208 var13 = class178.method1154(false, var12 & 0x3FFFFFFF).method1374(32767, this.field931);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class208 var14 = class127.method783(var12 & 0x3FFFFFFF, -12816).method1378(-123);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                }
            }
            class208 var10 = new class208(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field939[var11] < class242.field4308[var11].length) {
                    var10.method1414(class34.field413[var11], class242.field4308[var11][this.field939[var11]]);
                }
                if (class146.field2294[var11].length > this.field939[var11]) {
                    var10.method1414(class199.field3533[var11], class146.field2294[var11][this.field939[var11]]);
                }
            }
            var4 = var10.method1432(64, 768, -50, -10, -50);
            class218.field3903.method129(30972, this.field929, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method934(arg1, var4, (byte) -56);
        }
        if (arg2 < 86) {
            method418(93);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    private final void method416(byte arg0) {
        field923++;
        long[] var2 = class164.field2643;
        long var3 = this.field929;
        if (arg0 != 19) {
            return;
        }
        this.field929 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field929 = this.field929 >>> 8 ^ var2[(int) ((this.field929 ^ (long) (this.field930[var5] >> 24)) & 0xFFL)];
            this.field929 = this.field929 >>> 8 ^ var2[(int) (((long) (this.field930[var5] >> 16) ^ this.field929) & 0xFFL)];
            this.field929 = var2[(int) ((this.field929 ^ (long) (this.field930[var5] >> 8)) & 0xFFL)] ^ this.field929 >>> 8;
            this.field929 = var2[(int) (((long) this.field930[var5] ^ this.field929) & 0xFFL)] ^ this.field929 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field929 = var2[(int) ((this.field929 ^ (long) this.field939[var6]) & 0xFFL)] ^ this.field929 >>> 8;
        }
        this.field929 = var2[(int) ((this.field929 ^ (long) (this.field931 ? 1 : 0)) & 0xFFL)] ^ this.field929 >>> 8;
        if (var3 != 0L && this.field929 != var3) {
            class247.field4393.method133(var3, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public final void method417(int arg0, int arg1, int arg2) {
        field940++;
        int var4 = class64.field883[arg2];
        if (this.field930[var4] != 0 && class127.method783(arg1, -12816) != null) {
            this.field930[var4] = class1.method6(arg1, arg0);
            this.method416((byte) 19);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method418(int arg0) {
        field945 = null;
        if (arg0 <= 64) {
            method425(null, 22);
        }
        field947 = null;
        field933 = null;
        field946 = null;
        field944 = null;
        field928 = null;
        field942 = null;
        field943 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIZI)V")
    public final void method419(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class155.field2507; var7++) {
                    class203 var8 = class127.method783(var7, -12816);
                    if (var8 != null && !var8.field3655 && var6 + (arg3 ? 7 : 0) == var8.field3663) {
                        arg1[class64.field883[var6]] = class1.method6(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field936 = arg4;
        this.field931 = arg3;
        this.field939 = arg0;
        field932++;
        this.field930 = arg1;
        if (arg2 >= 2) {
            this.method416((byte) 19);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
    public final void method420(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method426(null, -4);
        }
        this.field939[arg2] = arg1;
        field927++;
        this.method416((byte) 19);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
    public final void method421(int arg0, boolean arg1) {
        this.field931 = arg1;
        int var3 = 33 / ((arg0 - 6) / 55);
        this.method416((byte) 19);
        field920++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lm;IIIB)Loc;")
    public final class119 method422(class149 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field934++;
        if (arg4 != 72) {
            return null;
        }
        long var6 = (long) (arg2 << 16) | (long) arg3 << 32 | (long) arg3;
        class119 var8 = (class119) class218.field3903.method132(var6, 127);
        if (var8 == null) {
            class208[] var9 = new class208[2];
            int var10 = 0;
            if (!class127.method783(arg3, -12816).method1380(23373) || !class127.method783(arg2, arg4 - 12888).method1380(23373)) {
                return null;
            }
            class208 var11 = class127.method783(arg3, -12816).method1378(-91);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class208 var12 = class127.method783(arg2, arg4 - 12888).method1378(arg4 - 180);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class208 var13 = new class208(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field939[var14] < class242.field4308[var14].length) {
                    var13.method1414(class34.field413[var14], class242.field4308[var14][this.field939[var14]]);
                }
                if (this.field939[var14] < class146.field2294[var14].length) {
                    var13.method1414(class199.field3533[var14], class146.field2294[var14][this.field939[var14]]);
                }
            }
            var8 = var13.method1432(64, 768, -50, -10, -50);
            class218.field3903.method129(30972, var6, var8);
        }
        if (arg0 != null) {
            var8 = arg0.method934(arg1, var8, (byte) -90);
        }
        return var8;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
    public final int method423(int arg0) {
        if (arg0 == -1126) {
            field924++;
            return this.field936 == -1 ? (this.field930[0] << 15) + (this.field930[11] << 5) + this.field930[1] + (this.field930[8] << 10) + (this.field939[4] << 20) + (this.field939[0] << 25) : 305419896 - -class126.method777((byte) -101, this.field936).field1631;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V")
    public static final void method424(byte arg0, int arg1) {
        field938++;
        if (arg1 == 37) {
            class25.field315 = 3.0D;
        } else if (arg1 == 50) {
            class25.field315 = 4.0D;
        } else if (arg1 == 75) {
            class25.field315 = 6.0D;
        } else {
            class25.field315 = 8.0D;
        }
        class120.field1737 = -1;
        if (arg0 != 18) {
            field933 = null;
        }
        class120.field1737 = -1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method425(Component arg0, int arg1) {
        arg0.removeKeyListener(class105.field1522);
        arg0.removeFocusListener(class105.field1522);
        class116.field1672 = -1;
        if (arg1 == -3408) {
            field922++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lqj;I)Luf;")
    public static final class10 method426(class196 arg0, int arg1) {
        field926++;
        if (arg0.method1299(37) == 0) {
            return null;
        }
        for (class10 var2 = (class10) class258.field4508.method1651((byte) -94); var2 != null; var2 = (class10) class258.field4508.method1656(-77)) {
            if (var2.field113.method1302((byte) 104, arg0)) {
                return var2;
            }
        }
        return arg1 == 12 ? null : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lm;IILm;I)Loc;")
    public final class119 method427(class149 arg0, int arg1, int arg2, class149 arg3, int arg4) {
        field937++;
        if (this.field936 != -1) {
            return class126.method777((byte) -100, this.field936).method663(arg4, arg3, arg0, arg2, 117);
        }
        long var6 = this.field929;
        int[] var8 = this.field930;
        if (arg3 != null && (arg3.field2364 >= 0 || arg3.field2373 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field930[var9];
            }
            if (arg3.field2364 >= 0) {
                if (arg3.field2364 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class1.method6(1073741824, arg3.field2364);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field2373 >= 0) {
                if (arg3.field2373 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class1.method6(1073741824, arg3.field2373);
                    var6 ^= var8[3];
                }
            }
        }
        class119 var10 = (class119) class247.field4393.method132(var6, 116);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class127.method783(var30 & 0x3FFFFFFF, arg1 ^ 0xC000320F).method1383(0)) {
                        var11 = true;
                    }
                } else if (!class178.method1154(false, var30 & 0x3FFFFFFF).method1371((byte) -15, this.field931)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field925 != -1L) {
                    var10 = (class119) class247.field4393.method132(this.field925, 117);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class208[] var13 = new class208[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class208 var29 = class178.method1154(false, var27 & 0x3FFFFFFF).method1375(this.field931, 124);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class208 var28 = class127.method783(var27 & 0x3FFFFFFF, arg1 - 1073754639).method1382(arg1 - 1073741825);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class202 var17 = class178.method1154(false, var16 & 0x3FFFFFFF);
                    if (var17.field3602 != null) {
                        for (int var18 = 0; var18 < var17.field3602.length; var18++) {
                            if (var17.field3602[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field3602[var18][2];
                                int var20 = var17.field3602[var18][0];
                                int var21 = var17.field3602[var18][3];
                                int var22 = var17.field3602[var18][4];
                                int var23 = var17.field3602[var18][1];
                                int var24 = var17.field3602[var18][5];
                                var13[var18 + 1].method1427(var20, var23, var19);
                                var13[var18 + 1].method1424(var21, var22, var24);
                            }
                        }
                    }
                }
                class208 var25 = new class208(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class242.field4308[var26].length > this.field939[var26]) {
                        var25.method1414(class34.field413[var26], class242.field4308[var26][this.field939[var26]]);
                    }
                    if (class146.field2294[var26].length > this.field939[var26]) {
                        var25.method1414(class199.field3533[var26], class146.field2294[var26][this.field939[var26]]);
                    }
                }
                var10 = var25.method1432(64, 850, -30, -50, -30);
                class247.field4393.method129(30972, var6, var10);
                this.field925 = var6;
            }
        }
        if (arg1 != 1073741823) {
            field942 = null;
        }
        if (arg3 == null && arg0 == null) {
            return var10;
        }
        class119 var31;
        if (arg3 != null && arg0 != null) {
            var31 = arg3.method940(arg4, var10, 65535, arg0, arg2);
        } else if (arg3 == null) {
            var31 = arg0.method942(arg2, var10, 2);
        } else {
            var31 = arg3.method942(arg4, var10, 2);
        }
        return var31;
    }
}
