import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class310 {

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "[Lhc;")
    public static class163[] field5292 = new class163[4];

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lve;")
    public static class255 field5294 = class87.method607(39, "Lade Liste der Welten");

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lwl;")
    public static class81 field5288 = new class81(64);

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field5296 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "J")
    private long field5284;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "J")
    private long field5295;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
    public boolean field5277;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    private int[] field5278;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    private int[] field5280;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[IIZ[I)V", line = 15)
    public final void method2148(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
        field5290++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class181.field2939; var7++) {
                    class96 var8 = class294.method2074(0, var7);
                    if (var8 != null && !var8.field1645 && (arg3 ? 7 : 0) + var6 == var8.field1665) {
                        arg1[class262.field4443[var6]] = class264.method1836(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        if (arg0 != 12) {
            return;
        }
        this.field5277 = arg3;
        this.field5282 = arg2;
        this.field5278 = arg4;
        this.field5280 = arg1;
        this.method2158(arg0 ^ 0xFFFFEBFF);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5286++;
        int var5 = arg3;
        int var6 = 0;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class198.method1425(class30.field473, false, arg0 + arg3, class125.field2082);
        int var10 = class198.method1425(class30.field473, false, arg0 - arg3, class125.field2082);
        class30.method170(var9, class250.field4213[arg2], var10, arg4, arg1 - 1073772133);
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg2 - var5;
                int var12 = arg2 + var5;
                if (var12 >= class261.field4427 && class11.field156 >= var11) {
                    int var13 = class198.method1425(class30.field473, false, arg0 + var6, class125.field2082);
                    int var14 = class198.method1425(class30.field473, false, arg0 - var6, class125.field2082);
                    if (class11.field156 >= var12) {
                        class30.method170(var13, class250.field4213[var12], var14, arg4, -30310);
                    }
                    if (var11 >= class261.field4427) {
                        class30.method170(var13, class250.field4213[var11], var14, arg4, -30310);
                    }
                }
            }
            var6++;
            int var15 = arg2 + var6;
            int var16 = arg2 - var6;
            if (class261.field4427 <= var15 && class11.field156 >= var16) {
                int var17 = class198.method1425(class30.field473, false, arg0 + var5, class125.field2082);
                int var18 = class198.method1425(class30.field473, false, arg0 - var5, class125.field2082);
                if (var15 <= class11.field156) {
                    class30.method170(var17, class250.field4213[var15], var18, arg4, -30310);
                }
                if (class261.field4427 <= var16) {
                    class30.method170(var17, class250.field4213[var16], var18, arg4, -30310);
                }
            }
        }
        if (arg1 != 1073741823) {
            field5292 = (class163[]) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 148)
    public static void method2150(int arg0) {
        field5294 = null;
        field5288 = null;
        field5292 = null;
        if (arg0 != -4748) {
            field5294 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)V", line = 160)
    public final void method2151(byte arg0, int arg1, int arg2) {
        this.field5278[arg2] = arg1;
        if (arg0 == 86) {
            this.method2158(arg0 - 5219);
            field5283++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLn;)Lof;", line = 175)
    public final class227 method2152(int arg0, byte arg1, class271 arg2) {
        field5293++;
        if (this.field5282 != -1) {
            return class143.method1068(-86, this.field5282).method1631(arg2, 18592, arg0);
        }
        class227 var4 = (class227) class225.field3766.method558(this.field5295, true);
        if (arg1 > -101) {
            this.field5277 = true;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field5280[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class294.method2074(0, var7 & 0x3FFFFFFF).method759(-5)) {
                        var5 = true;
                    }
                } else if (!class132.method990((byte) -119, var7 & 0x3FFFFFFF).method1320(this.field5277, false)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class200[] var8 = new class200[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field5280[var10];
                if ((var11 & 0x40000000) != 0) {
                    class200 var12 = class132.method990((byte) -119, var11 & 0x3FFFFFFF).method1325((byte) -98, this.field5277);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class200 var13 = class294.method2074(0, var11 & 0x3FFFFFFF).method752((byte) -127);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class200 var14 = new class200(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field5278[var15] < class125.field2078[var15].length) {
                    var14.method1438(class107.field1789[var15], class125.field2078[var15][this.field5278[var15]]);
                }
                if (this.field5278[var15] < class154.field2631[var15].length) {
                    var14.method1438(class30.field492[var15], class154.field2631[var15][this.field5278[var15]]);
                }
            }
            var4 = var14.method1440(64, 768, -50, -10, -50);
            class225.field3766.method555(var4, this.field5295, 0);
        }
        if (arg2 != null) {
            var4 = arg2.method1882(-120, var4, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 292)
    public final void method2153(int arg0, int arg1, int arg2) {
        if (arg0 >= -69) {
            this.field5277 = false;
        }
        field5275++;
        int var4 = class262.field4443[arg2];
        if (this.field5280[var4] != 0 && class294.method2074(0, arg1) != null) {
            this.field5280[var4] = class264.method1836(Integer.MIN_VALUE, arg1);
            this.method2158(-5133);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I", line = 315)
    public final int method2154(int arg0) {
        field5279++;
        if (arg0 >= -75) {
            this.method2155(61, -127, (class271) null, (class271) null, 120);
        }
        return this.field5282 == -1 ? (this.field5278[0] << 25) + (this.field5280[11] << 5) + (this.field5280[8] << 10) + (this.field5278[4] << 20) + (this.field5280[0] << 15) + this.field5280[1] : 305419896 - -class143.method1068(-94, this.field5282).field3891;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILn;Ln;I)Lof;", line = 330)
    public final class227 method2155(int arg0, int arg1, class271 arg2, class271 arg3, int arg4) {
        field5287++;
        if (this.field5282 != -1) {
            return class143.method1068(-68, this.field5282).method1634((byte) 58, arg2, arg1, arg3, arg4);
        }
        long var6 = this.field5295;
        int[] var8 = this.field5280;
        if (arg3 != null && (arg3.field4665 >= 0 || arg3.field4669 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field5280[var9];
            }
            if (arg3.field4665 >= 0) {
                if (arg3.field4665 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class264.method1836(arg3.field4665, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field4669 >= 0) {
                if (arg3.field4669 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class264.method1836(arg3.field4669, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class227 var10 = (class227) class80.field1292.method558(var6, true);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((var13 & Integer.MIN_VALUE) != 0 && !class294.method2074(arg0 - 12, var13 & 0x3FFFFFFF).method757(5)) {
                        var11 = true;
                    }
                } else if (!class132.method990((byte) -119, var13 & 0x3FFFFFFF).method1323(this.field5277, 0)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field5284 != -1L) {
                    var10 = (class227) class80.field1292.method558(this.field5284, true);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class200[] var14 = new class200[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class200 var19 = class132.method990((byte) -119, var17 & 0x3FFFFFFF).method1326(this.field5277, false);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class200 var18 = class294.method2074(0, var17 & 0x3FFFFFFF).method762(arg0 ^ 0xFFFFFFAD);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class192 var21 = class132.method990((byte) -119, var20 & 0x3FFFFFFF);
                    if (var21.field3058 != null) {
                        for (int var22 = 0; var22 < var21.field3058.length; var22++) {
                            if (var21.field3058[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field3058[var22][0];
                                int var24 = var21.field3058[var22][1];
                                int var25 = var21.field3058[var22][3];
                                int var26 = var21.field3058[var22][2];
                                int var27 = var21.field3058[var22][4];
                                int var28 = var21.field3058[var22][5];
                                var14[var22 + 1].method1433(var23, var24, var26);
                                var14[var22 + 1].method1460(var25, var27, var28);
                            }
                        }
                    }
                }
                class200 var29 = new class200(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field5278[var30] < class125.field2078[var30].length) {
                        var29.method1438(class107.field1789[var30], class125.field2078[var30][this.field5278[var30]]);
                    }
                    if (this.field5278[var30] < class154.field2631[var30].length) {
                        var29.method1438(class30.field492[var30], class154.field2631[var30][this.field5278[var30]]);
                    }
                }
                var10 = var29.method1440(64, 850, -30, -50, -30);
                if (class281.field4827) {
                    ((class193) var10).method1382(false, false, true, true, false, false, true);
                }
                class80.field1292.method555(var10, var6, arg0 - 12);
                this.field5284 = var6;
            }
        }
        if (arg0 != 12) {
            this.method2158(4);
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class227 var31;
        if (arg3 != null && arg2 != null) {
            var31 = arg3.method1892(arg2, arg4, var10, arg1, arg0 ^ 0xD);
        } else if (arg3 == null) {
            var31 = arg2.method1881(var10, (byte) -116, arg4);
        } else {
            var31 = arg3.method1881(var10, (byte) -93, arg1);
        }
        return var31;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V", line = 552)
    public final void method2156(int arg0, boolean arg1) {
        if (arg0 != -10409) {
            this.field5282 = 24;
        }
        this.field5277 = arg1;
        field5291++;
        this.method2158(-5133);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILn;III)Lof;", line = 572)
    public final class227 method2157(int arg0, class271 arg1, int arg2, int arg3, int arg4) {
        field5285++;
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg4 << 16);
        class227 var8 = (class227) class225.field3766.method558(var6, true);
        if (var8 == null) {
            class200[] var9 = new class200[2];
            int var10 = 0;
            if (!class294.method2074(0, arg0).method759(-5) || !class294.method2074(0, arg4).method759(-5)) {
                return null;
            }
            class200 var11 = class294.method2074(arg2 ^ 0x0, arg0).method752((byte) -110);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class200 var12 = class294.method2074(0, arg4).method752((byte) -122);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class200 var13 = new class200(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class125.field2078[var14].length > this.field5278[var14]) {
                    var13.method1438(class107.field1789[var14], class125.field2078[var14][this.field5278[var14]]);
                }
                if (class154.field2631[var14].length > this.field5278[var14]) {
                    var13.method1438(class30.field492[var14], class154.field2631[var14][this.field5278[var14]]);
                }
            }
            var8 = var13.method1440(64, 768, -50, -10, -50);
            class225.field3766.method555(var8, var6, arg2);
        }
        if (arg1 != null) {
            var8 = arg1.method1882(-52, var8, arg3);
        }
        return arg2 == 0 ? var8 : (class227) null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 637)
    private final void method2158(int arg0) {
        field5276++;
        if (arg0 != -5133) {
            this.method2157(-57, (class271) null, -18, -1, 114);
        }
        long[] var2 = class241.field4018;
        long var3 = this.field5295;
        this.field5295 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field5295 = var2[(int) ((this.field5295 ^ (long) (this.field5280[var5] >> 24)) & 0xFFL)] ^ this.field5295 >>> 8;
            this.field5295 = var2[(int) (((long) (this.field5280[var5] >> 16) ^ this.field5295) & 0xFFL)] ^ this.field5295 >>> 8;
            this.field5295 = var2[(int) (((long) (this.field5280[var5] >> 8) ^ this.field5295) & 0xFFL)] ^ this.field5295 >>> 8;
            this.field5295 = this.field5295 >>> 8 ^ var2[(int) (((long) this.field5280[var5] ^ this.field5295) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field5295 = var2[(int) ((this.field5295 ^ (long) this.field5278[var6]) & 0xFFL)] ^ this.field5295 >>> 8;
        }
        this.field5295 = this.field5295 >>> 8 ^ var2[(int) ((this.field5295 ^ (long) (this.field5277 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field5295 != var3) {
            class80.field1292.method559(var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 676)
    public static final void method2159(byte arg0) {
        field5281++;
        int var1 = -64 % ((arg0 - 2) / 48);
        if (class40.field620.toLowerCase().indexOf("microsoft") != -1) {
            class155.field2647[223] = 28;
            class155.field2647[186] = 57;
            class155.field2647[222] = 59;
            class155.field2647[190] = 72;
            class155.field2647[221] = 43;
            class155.field2647[187] = 27;
            class155.field2647[188] = 71;
            class155.field2647[192] = 58;
            class155.field2647[220] = 74;
            class155.field2647[189] = 26;
            class155.field2647[191] = 73;
            class155.field2647[219] = 42;
            return;
        }
        class155.field2647[92] = 74;
        class155.field2647[47] = 73;
        class155.field2647[91] = 42;
        class155.field2647[61] = 27;
        class155.field2647[46] = 72;
        class155.field2647[45] = 26;
        if (class40.field634 == null) {
            class155.field2647[222] = 59;
            class155.field2647[192] = 58;
        } else {
            class155.field2647[520] = 59;
            class155.field2647[222] = 58;
            class155.field2647[192] = 28;
        }
        class155.field2647[59] = 57;
        class155.field2647[44] = 71;
        class155.field2647[93] = 43;
    }
}
