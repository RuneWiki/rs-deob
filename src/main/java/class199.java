import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class199 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lhi;")
    public static class82 field3397 = class95.method664((byte) -31, "Fermer");

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3405 = 2301979;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
    public static boolean field3403 = false;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lhi;")
    public static class82 field3398 = class95.method664((byte) -113, "");

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "Lhi;")
    public static class82 field3423 = class95.method664((byte) -39, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
    private long field3402;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "J")
    private long field3420;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field3413;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public boolean field3401;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
    private int[] field3409;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[I")
    private int[] field3411;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "[I")
    public static int[] field3424;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 5)
    public static final void method1387(Component arg0, int arg1) {
        field3408++;
        if (arg1 != -17706) {
            method1400(-49, -88, 23);
        }
        arg0.addMouseListener(class254.field4368);
        arg0.addMouseMotionListener(class254.field4368);
        arg0.addFocusListener(class254.field4368);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 20)
    private final void method1388(int arg0) {
        long[] var2 = class14.field110;
        field3412++;
        long var3 = this.field3420;
        if (arg0 != 5) {
            field3414 = 13;
        }
        this.field3420 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3420 = var2[(int) ((this.field3420 ^ (long) (this.field3409[var5] >> 24)) & 0xFFL)] ^ this.field3420 >>> 8;
            this.field3420 = var2[(int) (((long) (this.field3409[var5] >> 16) ^ this.field3420) & 0xFFL)] ^ this.field3420 >>> 8;
            this.field3420 = var2[(int) (((long) (this.field3409[var5] >> 8) ^ this.field3420) & 0xFFL)] ^ this.field3420 >>> 8;
            this.field3420 = var2[(int) (((long) this.field3409[var5] ^ this.field3420) & 0xFFL)] ^ this.field3420 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3420 = this.field3420 >>> 8 ^ var2[(int) ((this.field3420 ^ (long) this.field3411[var6]) & 0xFFL)];
        }
        this.field3420 = this.field3420 >>> 8 ^ var2[(int) ((this.field3420 ^ (long) (this.field3401 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field3420 != var3) {
            class138.field2365.method2174(var3, -15);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V", line = 59)
    public final void method1389(boolean arg0, byte arg1) {
        int var3 = -111 / ((-arg1 - 85) / 40);
        this.field3401 = arg0;
        field3400++;
        this.method1388(5);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)V", line = 70)
    public final void method1390(int arg0, int arg1, byte arg2) {
        int var4 = class312.field5382[arg1];
        field3399++;
        if (this.field3409[var4] == 0) {
            return;
        }
        if (arg2 >= -25) {
            this.field3418 = 110;
        }
        if (class288.method1995(false, arg0) != null) {
            this.field3409[var4] = class98.method674(arg0, Integer.MIN_VALUE);
            this.method1388(5);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIB)V", line = 91)
    public final void method1391(int arg0, int arg1, byte arg2) {
        this.field3411[arg1] = arg0;
        int var4 = -64 / ((-arg2 - 8) / 58);
        this.method1388(5);
        field3417++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lq;", line = 104)
    public static final class182 method1392(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null ? null : var3.field172;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)I", line = 112)
    public final int method1393(int arg0) {
        if (arg0 != -1651847158) {
            this.method1391(-43, 121, (byte) 7);
        }
        field3415++;
        return this.field3418 == -1 ? (this.field3409[11] << 5) + (this.field3411[4] << 20) + ((this.field3411[0] << 25) - (-(this.field3409[0] << 15) + -(this.field3409[8] << 10)) - -this.field3409[1]) : class222.method1574(true, this.field3418).field4076 + 305419896;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z[I[III)V", line = 133)
    public final void method1394(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field3407++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class179.field3062; var7++) {
                    class260 var8 = class288.method1995(false, var7);
                    if (var8 != null && !var8.field4444 && ((arg0 ? 7 : 0) + var6) == var8.field4448) {
                        arg2[class312.field5382[var6]] = class98.method674(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3401 = arg0;
        this.field3411 = arg1;
        this.field3418 = arg4;
        this.field3409 = arg2;
        if (arg3 != 12694) {
            this.field3411 = (int[]) null;
        }
        this.method1388(arg3 - 12689);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lkl;IIII)Lpa;", line = 193)
    public final class155 method1395(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3404++;
        int var6 = 99 / ((arg3 + 23) / 40);
        long var7 = (long) (arg4 << 16) | (long) arg2 << 32 | (long) arg2;
        class155 var9 = (class155) class285.field4796.method2175(var7, 3008);
        if (var9 == null) {
            class174[] var10 = new class174[2];
            int var11 = 0;
            if (!class288.method1995(false, arg2).method1853(false) || !class288.method1995(false, arg4).method1853(false)) {
                return null;
            }
            class174 var12 = class288.method1995(false, arg2).method1852((byte) -118);
            if (var12 != null) {
                var10[var11++] = var12;
            }
            class174 var13 = class288.method1995(false, arg4).method1852((byte) -111);
            if (var13 != null) {
                var10[var11++] = var13;
            }
            class174 var14 = new class174(var10, var11);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class42.field742[var15].length > this.field3411[var15]) {
                    var14.method1229(class34.field535[var15], class42.field742[var15][this.field3411[var15]]);
                }
                if (this.field3411[var15] < class29.field392[var15].length) {
                    var14.method1229(class67.field1045[var15], class29.field392[var15][this.field3411[var15]]);
                }
            }
            var9 = var14.method1242(64, 768, -50, -10, -50);
            class285.field4796.method2169(var9, var7, (byte) 94);
        }
        if (arg0 != null) {
            var9 = arg0.method269(var9, 65535, arg1);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Z", line = 264)
    public static final boolean method1396(int arg0) {
        field3406++;
        if (arg0 != 0) {
            method1398(true);
        }
        try {
            if (class77.field1324 == 2) {
                if (class244.field4233 == null) {
                    class244.field4233 = class268.method1889(class315.field5422, class136.field2348, class243.field4227);
                    if (class244.field4233 == null) {
                        return false;
                    }
                }
                if (class232.field4007 == null) {
                    class232.field4007 = new class247(class165.field2881, class135.field2334);
                }
                if (class86.field1537.method1427(class232.field4007, class244.field4233, 22050, class53.field847, (byte) -36)) {
                    class86.field1537.method1429(-9546);
                    class86.field1537.method1423(116, class28.field380);
                    class86.field1537.method1449(arg0 + 16, class293.field4918, class244.field4233);
                    class244.field4233 = null;
                    class315.field5422 = null;
                    class77.field1324 = 0;
                    class232.field4007 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class86.field1537.method1431(-2);
            class232.field4007 = null;
            class315.field5422 = null;
            class244.field4233 = null;
            class77.field1324 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILkl;ILkl;I)Lpa;", line = 315)
    public final class155 method1397(int arg0, class35 arg1, int arg2, class35 arg3, int arg4) {
        field3425++;
        if (this.field3418 != -1) {
            return class222.method1574(true, this.field3418).method1662(arg1, (byte) -14, arg2, arg3, arg0);
        }
        if (arg4 != 25584) {
            field3403 = false;
        }
        long var6 = this.field3420;
        int[] var8 = this.field3409;
        if (arg3 != null && (arg3.field553 >= 0 || arg3.field542 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3409[var9];
            }
            if (arg3.field553 >= 0) {
                if (arg3.field553 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class98.method674(1073741824, arg3.field553);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field542 >= 0) {
                if (arg3.field542 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class98.method674(arg3.field542, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class155 var10 = (class155) class138.field2365.method2175(var6, 3008);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class288.method1995(false, var13 & 0x3FFFFFFF).method1851(arg4 ^ 0x63B6)) {
                        var11 = true;
                    }
                } else if (!class273.method1912(var13 & 0x3FFFFFFF, -74).method2146(arg4 ^ 0xFFFF9E59, this.field3401)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3402 != -1L) {
                    var10 = (class155) class138.field2365.method2175(this.field3402, 3008);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class174[] var14 = new class174[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class174 var19 = class273.method1912(var17 & 0x3FFFFFFF, -53).method2152(this.field3401, true);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class174 var18 = class288.method1995(false, var17 & 0x3FFFFFFF).method1859(-83);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class312 var21 = class273.method1912(var20 & 0x3FFFFFFF, arg4 - 25685);
                    if (var21.field5331 != null) {
                        for (int var22 = 0; var22 < var21.field5331.length; var22++) {
                            if (var21.field5331[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field5331[var22][0];
                                int var24 = var21.field5331[var22][1];
                                int var25 = var21.field5331[var22][3];
                                int var26 = var21.field5331[var22][5];
                                int var27 = var21.field5331[var22][2];
                                int var28 = var21.field5331[var22][4];
                                var14[var22 + 1].method1249(var23, var24, var27);
                                var14[var22 + 1].method1224(var25, var28, var26);
                            }
                        }
                    }
                }
                class174 var29 = new class174(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field3411[var30] < class42.field742[var30].length) {
                        var29.method1229(class34.field535[var30], class42.field742[var30][this.field3411[var30]]);
                    }
                    if (class29.field392[var30].length > this.field3411[var30]) {
                        var29.method1229(class67.field1045[var30], class29.field392[var30][this.field3411[var30]]);
                    }
                }
                var10 = var29.method1242(64, 850, -30, -50, -30);
                if (class147.field2485) {
                    ((class30) var10).method213(false, false, true, true, false, false, true);
                }
                class138.field2365.method2169(var10, var6, (byte) 94);
                this.field3402 = var6;
            }
        }
        if (arg3 == null && arg1 == null) {
            return var10;
        }
        class155 var31;
        if (arg3 != null && arg1 != null) {
            var31 = arg3.method276(var10, arg0, arg1, arg4 ^ 0xFFFF9C18, arg2);
        } else if (arg3 == null) {
            var31 = arg1.method271(var10, -124, arg0);
        } else {
            var31 = arg3.method271(var10, arg4 ^ 0xFFFF9C7C, arg2);
        }
        return var31;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 543)
    public static void method1398(boolean arg0) {
        field3397 = null;
        if (!arg0) {
            field3413 = null;
            field3398 = null;
            field3423 = null;
            field3424 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILkl;I)Lpa;", line = 579)
    public final class155 method1399(int arg0, class35 arg1, int arg2) {
        field3416++;
        if (this.field3418 != -1) {
            return class222.method1574(true, this.field3418).method1661(arg1, arg2, arg0 ^ 0x5320);
        }
        class155 var4 = (class155) class285.field4796.method2175(this.field3420, 3008);
        if (arg0 != 21280) {
            field3422 = 122;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field3409[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class288.method1995(false, var7 & 0x3FFFFFFF).method1853(false)) {
                        var5 = true;
                    }
                } else if (!class273.method1912(var7 & 0x3FFFFFFF, -50).method2143(-8212, this.field3401)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class174[] var8 = new class174[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field3409[var10];
                if ((var11 & 0x40000000) != 0) {
                    class174 var12 = class273.method1912(var11 & 0x3FFFFFFF, arg0 - 21339).method2144(this.field3401, arg0 ^ 0x5320);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class174 var13 = class288.method1995(false, var11 & 0x3FFFFFFF).method1852((byte) -118);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class174 var14 = new class174(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field3411[var15] < class42.field742[var15].length) {
                    var14.method1229(class34.field535[var15], class42.field742[var15][this.field3411[var15]]);
                }
                if (class29.field392[var15].length > this.field3411[var15]) {
                    var14.method1229(class67.field1045[var15], class29.field392[var15][this.field3411[var15]]);
                }
            }
            var4 = var14.method1242(64, 768, -50, -10, -50);
            class285.field4796.method2169(var4, this.field3420, (byte) 94);
        }
        if (arg1 != null) {
            var4 = arg1.method269(var4, arg0 ^ 0xACDF, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)Lc;", line = 694)
    public static final class72 method1400(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class72 var4 = var3.field164;
            var3.field164 = null;
            return var4;
        }
    }
}
