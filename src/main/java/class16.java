import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("be")
public class class16 {

    @OriginalMember(owner = "be", name = "u", descriptor = "Llf;")
    public static class109 field311 = class35.method275("Lade)3)3)3", 2);

    @OriginalMember(owner = "be", name = "s", descriptor = "Llf;")
    public static class109 field309 = class35.method275("Art", 2);

    @OriginalMember(owner = "be", name = "a", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "be", name = "b", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "be", name = "d", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "be", name = "e", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "be", name = "h", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "be", name = "j", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "be", name = "k", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "be", name = "m", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "be", name = "n", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "be", name = "o", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "be", name = "p", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "be", name = "t", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "be", name = "v", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "be", name = "w", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "be", name = "g", descriptor = "J")
    private long field297;

    @OriginalMember(owner = "be", name = "i", descriptor = "J")
    private long field299;

    @OriginalMember(owner = "be", name = "l", descriptor = "Lbg;")
    public static class18 field302;

    @OriginalMember(owner = "be", name = "q", descriptor = "Lwb;")
    public static class204 field307;

    @OriginalMember(owner = "be", name = "r", descriptor = "Z")
    public boolean field308;

    @OriginalMember(owner = "be", name = "c", descriptor = "[I")
    private int[] field293;

    @OriginalMember(owner = "be", name = "f", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "be", name = "a", descriptor = "(IILbi;Lbi;B)Lue;")
    public final class189 method102(int arg0, int arg1, class20 arg2, class20 arg3, byte arg4) {
        field306++;
        if (this.field298 != -1) {
            return class192.method1290((byte) -99, this.field298).method1147(arg4 ^ 0xFFFFFFA5, arg2, arg0, arg1, arg3);
        }
        int[] var6 = this.field293;
        long var7 = this.field297;
        if (arg2 != null && (arg2.field435 >= 0 || arg2.field456 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field293[var9];
            }
            if (arg2.field435 >= 0) {
                if (arg2.field435 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class31.method262(1073741824, arg2.field435);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg2.field456 >= 0) {
                if (arg2.field456 == 65535) {
                    var6[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var6[3] = class31.method262(arg2.field456, 1073741824);
                    var7 ^= var6[3];
                }
            }
        }
        class189 var10 = (class189) class193.field3691.method1086(var7, arg4 - 146);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class7.method35((byte) 58, var21 & 0x3FFFFFFF).method487(false)) {
                        var11 = true;
                    }
                } else if (!class128.method926(var21 & 0x3FFFFFFF, -4).method520(this.field308, 0)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field299 != -1L) {
                    var10 = (class189) class193.field3691.method1086(this.field299, arg4 ^ 0xFFFFFFA6);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class135[] var14 = new class135[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class135 var20 = class128.method926(var18 & 0x3FFFFFFF, arg4 - 52).method531((byte) -94, this.field308);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class135 var19 = class7.method35((byte) -110, var18 & 0x3FFFFFFF).method485(0);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                }
                class135 var16 = new class135(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field296[var17] < class81.field1604[var17].length) {
                        var16.method965(class164.field3085[var17], class81.field1604[var17][this.field296[var17]]);
                    }
                    if (this.field296[var17] < class40.field856[var17].length) {
                        var16.method965(class84.field1704[var17], class40.field856[var17][this.field296[var17]]);
                    }
                }
                var10 = var16.method967(64, 850, -30, -50, -30, true, true);
                class193.field3691.method1082(var7, -111, var10);
                this.field299 = var7;
            }
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class189 var22;
        if (arg2 != null && arg3 != null) {
            var22 = arg2.method185(arg3, 26, arg1, var10, arg0);
        } else if (arg2 == null) {
            var22 = arg3.method193(arg0, var10, (byte) -58);
        } else {
            var22 = arg2.method193(arg1, var10, (byte) -58);
        }
        return arg4 == 48 ? var22 : null;
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(IIZ)V")
    public final void method103(int arg0, int arg1, boolean arg2) {
        field292++;
        if (arg0 == 1 && this.field308) {
            return;
        }
        int var4 = this.field293[class31.field734[arg0]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        if (arg1 <= 109) {
            field307 = null;
        }
        class77 var6;
        do {
            if (arg2) {
                var5++;
                if (class75.field1441 <= var5) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class75.field1441 - 1;
                }
            }
            var6 = class7.method35((byte) 83, var5);
        } while (var6 == null || var6.field1482 || arg0 + (this.field308 ? 7 : 0) != var6.field1480);
        this.field293[class31.field734[arg0]] = class31.method262(var5, Integer.MIN_VALUE);
        this.method105(758424712);
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(III)V")
    public final void method104(int arg0, int arg1, int arg2) {
        this.field296[arg0] = arg1;
        this.method105(758424712);
        field310++;
        if (arg2 != 12) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(I)V")
    private final void method105(int arg0) {
        field304++;
        long var2 = this.field297;
        this.field297 = -1L;
        long[] var4 = class128.field2486;
        if (arg0 != 758424712) {
            return;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field297 = this.field297 >>> 8 ^ var4[(int) ((this.field297 ^ (long) (this.field293[var5] >> 24)) & 0xFFL)];
            this.field297 = var4[(int) ((this.field297 ^ (long) (this.field293[var5] >> 16)) & 0xFFL)] ^ this.field297 >>> 8;
            this.field297 = var4[(int) (((long) (this.field293[var5] >> 8) ^ this.field297) & 0xFFL)] ^ this.field297 >>> 8;
            this.field297 = this.field297 >>> 8 ^ var4[(int) ((this.field297 ^ (long) this.field293[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field297 = this.field297 >>> 8 ^ var4[(int) ((this.field297 ^ (long) this.field296[var6]) & 0xFFL)];
        }
        this.field297 = this.field297 >>> 8 ^ var4[(int) (((long) (this.field308 ? 1 : 0) ^ this.field297) & 0xFFL)];
        if (var2 != 0L && this.field297 != var2) {
            class193.field3691.method1083(var2, (byte) 40);
        }
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(IZ[IB[I)V")
    public final void method106(int arg0, boolean arg1, int[] arg2, byte arg3, int[] arg4) {
        field294++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class75.field1441; var7++) {
                    class77 var8 = class7.method35((byte) 121, var7);
                    if (var8 != null && !var8.field1482 && var6 + (arg1 ? 7 : 0) == var8.field1480) {
                        arg2[class31.field734[var6]] = class31.method262(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field298 = arg0;
        this.field308 = arg1;
        this.field296 = arg4;
        this.field293 = arg2;
        this.method105(758424712);
        if (arg3 < 12) {
            this.field297 = 109L;
        }
    }

    @OriginalMember(owner = "be", name = "b", descriptor = "(III)V")
    public final void method107(int arg0, int arg1, int arg2) {
        if (arg0 != -8621) {
            return;
        }
        field305++;
        int var4 = class31.field734[arg2];
        if (this.field293[var4] != 0 && class7.method35((byte) 94, arg1) != null) {
            this.field293[var4] = class31.method262(Integer.MIN_VALUE, arg1);
            this.method105(758424712);
        }
    }

    @OriginalMember(owner = "be", name = "b", descriptor = "(I)V")
    public static void method108(int arg0) {
        field302 = null;
        field307 = null;
        if (arg0 != 1073741823) {
            method111(-19, 104, -63, -93, true, null);
        }
        field309 = null;
        field311 = null;
    }

    @OriginalMember(owner = "be", name = "b", descriptor = "(IIZ)V")
    public final void method109(int arg0, int arg1, boolean arg2) {
        field291++;
        if (arg0 > -94) {
            this.method113((byte) -15);
        }
        int var4 = this.field296[arg1];
        if (arg2) {
            var4++;
            if (class81.field1604[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class81.field1604[arg1].length - 1;
            }
        }
        this.field296[arg1] = var4;
        this.method105(758424712);
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(ILja;)V")
    public final void method110(int arg0, class86 arg1) {
        arg1.method568(-13488, this.field308 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field293[class31.field734[var3]];
            if ((Integer.MIN_VALUE & var5) == 0) {
                arg1.method557(9698, 65535);
            } else {
                arg1.method557(9698, var5 & 0x3FFFFFFF);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method568(-13488, this.field296[var4]);
        }
        field300++;
        if (arg0 >= -93) {
            this.method114(41, true);
        }
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(IIIIZLbg;)V")
    public static final void method111(int arg0, int arg1, int arg2, int arg3, boolean arg4, class18 arg5) {
        if (arg1 > -103) {
            method108(-23);
        }
        class84.field1711 = 1;
        field303++;
        class8.field109 = arg2;
        class145.field2803 = arg0;
        class88.field1839 = arg4;
        class72.field1404 = 10000;
        field302 = arg5;
        class72.field1394 = arg3;
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(ILbi;I)Lue;")
    public final class189 method112(int arg0, class20 arg1, int arg2) {
        field295++;
        if (this.field298 != -1) {
            return class192.method1290((byte) -99, this.field298).method1139((byte) 90, arg2, arg1);
        }
        class189 var4 = (class189) class7.field103.method1086(this.field297, arg0 - 1073741920);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field293[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class7.method35((byte) -117, var15 & 0x3FFFFFFF).method489(-1)) {
                        var5 = true;
                    }
                } else if (!class128.method926(var15 & 0x3FFFFFFF, -4).method522(arg0 - 1073741781, this.field308)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class135[] var7 = new class135[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field293[var9];
                if ((var12 & 0x40000000) != 0) {
                    class135 var13 = class128.method926(var12 & 0x3FFFFFFF, -4).method532(this.field308, arg0 - 1073741823);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class135 var14 = class7.method35((byte) -126, var12 & 0x3FFFFFFF).method484((byte) -62);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class135 var10 = new class135(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field296[var11] < class81.field1604[var11].length) {
                    var10.method965(class164.field3085[var11], class81.field1604[var11][this.field296[var11]]);
                }
                if (this.field296[var11] < class40.field856[var11].length) {
                    var10.method965(class84.field1704[var11], class40.field856[var11][this.field296[var11]]);
                }
            }
            var4 = var10.method967(64, 768, -50, -10, -50, true, true);
            class7.field103.method1082(this.field297, arg0 ^ 0xC000006A, var4);
        }
        if (arg0 != 1073741823) {
            this.field293 = null;
        }
        if (arg1 != null) {
            var4 = arg1.method187(var4, arg2, arg0 ^ 0x21341E4F);
        }
        return var4;
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(B)I")
    public final int method113(byte arg0) {
        field313++;
        if (arg0 >= -77) {
            this.method109(80, -24, true);
        }
        return this.field298 == -1 ? (this.field296[4] << 20) + (this.field296[0] << 25) + (this.field293[0] << 15) + (this.field293[11] << 5) + this.field293[1] + (this.field293[8] << 10) : class192.method1290((byte) -99, this.field298).field3193 + 305419896;
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(IZ)V")
    public final void method114(int arg0, boolean arg1) {
        field312++;
        this.field308 = arg1;
        int var3 = 84 % ((arg0 - 60) / 52);
        this.method105(758424712);
    }

    @OriginalMember(owner = "be", name = "a", descriptor = "(ZB)V")
    public final void method115(boolean arg0, byte arg1) {
        field301++;
        if (this.field308 != arg0) {
            int var3 = -1 / ((-arg1 - 39) / 39);
            this.method106(-1, arg0, null, (byte) 47, this.field296);
        }
    }
}
