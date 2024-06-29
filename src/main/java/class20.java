import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class20 {

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    private int field282 = 128;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    private int field281 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    private int field277 = 0;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    private int field293 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
    public boolean field283 = false;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Z")
    public boolean field299 = false;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public int field302 = -1;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    private int field303 = 128;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lrm;")
    public static class260 field301 = new class260(0, 0);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lkb;")
    public static class39 field295;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[I")
    public static int[] field304;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[S")
    private short[] field288;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[S")
    private short[] field291;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[S")
    private short[] field294;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[S")
    private short[] field298;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[S")
    public static short[] field305;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lkb;I)V", line = 5)
    public static final void method127(class39 arg0, int arg1) {
        client.field4229 = class87.method630(arg0, arg1 - 28306, class127.field1900);
        field278++;
        class121.field1845 = new int[256];
        for (int var2 = arg1; var2 < 3; var2++) {
            float var3 = (float) ((class339.field5254[var2] & 0xFF00) >> 8);
            float var4 = (float) ((class339.field5254[var2] & 0xFF0000) >> 16);
            int var5 = class339.field5254[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class339.field5254[var2 + 1] >> 8 & 0xFF;
            int var8 = class339.field5254[var2 + 1] & 0xFF;
            float var9 = (float) (class339.field5254[var2] & 0xFF);
            float var10 = ((float) var8 - var9) / 64.0F;
            float var11 = ((float) var7 - var3) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class121.field1845[var2 * 64 + var12] = class24.method149((int) var9, class24.method149((int) var4 << 16, (int) var3 << 8));
                var4 += var6;
                var9 += var10;
                var3 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class121.field1845[var13] = class339.field5254[3];
        }
        class339.field5258 = new int[32768];
        class198.field3254 = new int[32768];
        class292.method2045((class123) null, 0);
        class237.field3749 = new int[32768];
        class163.field2655 = new int[32768];
        class89.field1365 = new class298(128, 254);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IJ)V", line = 65)
    public static final void method128(int arg0, long arg1) {
        field300++;
        if ((long) arg0 >= arg1) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class292.method2044(arg1 - 1L, 19641);
            class292.method2044(1L, 19641);
        } else {
            class292.method2044(arg1, 19641);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 87)
    public static final void method129(int arg0, Object[] arg1, long[] arg2) {
        if (arg0 >= 122) {
            class196.method1440(arg2, arg1, arg2.length - 1, (byte) -74, 0);
            field279++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[Lok;ZI)V", line = 103)
    public static final void method130(int arg0, int arg1, int arg2, class160[] arg3, boolean arg4, int arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class160 var7 = arg3[var6];
            if (var7 != null && var7.field2544 == arg1) {
                class50.method347(arg2, arg4, var7, arg5, 23739);
                class293.method2048(arg5, var7, -11766, arg2);
                if (var7.field2472 > (var7.field2495 - var7.field2590)) {
                    var7.field2472 = var7.field2495 - var7.field2590;
                }
                if (var7.field2472 < 0) {
                    var7.field2472 = 0;
                }
                if ((var7.field2496 - var7.field2458) < var7.field2466) {
                    var7.field2466 = var7.field2496 - var7.field2458;
                }
                if (var7.field2466 < 0) {
                    var7.field2466 = 0;
                }
                if (var7.field2608 == 0) {
                    class326.method2267(arg4, var7, 0);
                }
            }
        }
        field285++;
        int var8 = -22 % ((arg0 + 70) / 52);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JZZ)V", line = 149)
    public static final void method131(long arg0, boolean arg1, boolean arg2) {
        field292++;
        if (arg0 == 0L) {
            return;
        }
        if (class271.field4291 >= 100) {
            class245.method1740((byte) -110, 0, "", class290.field4577);
            return;
        }
        if (!arg2) {
            method130(-110, -13, -44, (class160[]) null, true, -93);
        }
        String var4 = class331.method2290((byte) 120, arg0);
        for (int var5 = 0; var5 < class271.field4291; var5++) {
            if (class157.field2424[var5] == arg0) {
                class245.method1740((byte) -119, 0, "", var4 + class18.field238);
                return;
            }
        }
        for (int var6 = 0; var6 < class198.field3247; var6++) {
            if (class87.field1314[var6] == arg0) {
                class245.method1740((byte) -120, 0, "", class79.field1191 + var4 + class107.field1612);
                return;
            }
        }
        if (var4.equals(class13.field159.field5003)) {
            class245.method1740((byte) 66, 0, "", class193.field3170);
            return;
        }
        class337.field5219++;
        class157.field2424[class271.field4291] = arg0;
        class100.field1525[class271.field4291] = class343.method2363(arg0, 116);
        class45.field620[class271.field4291++] = arg1;
        class93.field1444 = class297.field4655;
        class21.field313.method1541(27, 148);
        class21.field313.method1375(arg0, 119);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILim;B)V", line = 217)
    private final void method132(int arg0, class192 arg1, byte arg2) {
        if (arg2 > -94) {
            field289 = -78;
        }
        if (arg0 == 1) {
            this.field296 = arg1.method1396(-73);
        } else if (arg0 == 2) {
            this.field302 = arg1.method1396(-96);
        } else if (arg0 == 4) {
            this.field303 = arg1.method1396(-72);
        } else if (arg0 == 5) {
            this.field282 = arg1.method1396(-35);
        } else if (arg0 == 6) {
            this.field281 = arg1.method1396(-55);
        } else if (arg0 == 7) {
            this.field277 = arg1.method1399(-1172389784);
        } else if (arg0 == 8) {
            this.field293 = arg1.method1399(-1172389784);
        } else if (arg0 == 9) {
            this.field283 = true;
        } else if (arg0 == 10) {
            this.field299 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1399(-1172389784);
            this.field288 = new short[var6];
            this.field294 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field288[var7] = (short) arg1.method1396(-40);
                this.field294[var7] = (short) arg1.method1396(-118);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1399(-1172389784);
            this.field291 = new short[var4];
            this.field298 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field298[var5] = (short) arg1.method1396(-80);
                this.field291[var5] = (short) arg1.method1396(-63);
            }
        }
        field297++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 305)
    public static final void method133(byte arg0) {
        field287++;
        int var1 = class81.field1240.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class81.field1240[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class56.field741; var4++) {
                    if (class327.field5096[var2] == class281.field4424[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class281.field4424[class56.field741] = class327.field5096[var2];
                    var3 = class56.field741++;
                }
                int var5 = 0;
                class192 var6 = new class192(class81.field1240[var2]);
                while (var6.field3129 < class81.field1240[var2].length && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1396(-92);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class327.field5096[var2] >> 8) * 64 - (class181.field2925 - var10);
                    int var13 = (class327.field5096[var2] & 0xFF) * 64 - (class24.field351 - var11);
                    class118 var14 = class281.method1993(var6.method1396(-48), -3);
                    if (class297.field4657[var7] == null && (var14.field1811 & 0x1) > 0 && class146.field2190 == var9 && var12 >= 0 && var12 + var14.field1808 < 104 && var13 >= 0 && var13 + var14.field1808 < 104) {
                        class297.field4657[var7] = new class196();
                        class196 var15 = class297.field4657[var7];
                        class128.field1906[class176.field2875++] = var7;
                        var15.field2008 = class48.field648;
                        var15.method1439((byte) 21, var14);
                        var15.method906(var15.field3210.field1808, -128);
                        var15.field1973 = var15.field2037 = class168.field2700[var15.field3210.field1821];
                        var15.field1989 = var15.field3210.field1803;
                        var15.field1956 = var15.field3210.field1806;
                        if (var15.field1956 == 0) {
                            var15.field2037 = 0;
                        }
                        var15.method902(true, var15.method910(-1), false, var13, var12);
                    }
                }
            }
        }
        int var16 = -27 / ((34 - arg0) / 43);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lim;Z)V", line = 396)
    public final void method134(class192 arg0, boolean arg1) {
        field284++;
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                if (!arg1) {
                    method131(103L, true, true);
                }
                return;
            }
            this.method132(var3, arg0, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 431)
    public static void method135(byte arg0) {
        if (arg0 >= 124) {
            field305 = null;
            field304 = null;
            field295 = null;
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBII)Llf;", line = 444)
    public final class134 method136(int arg0, byte arg1, int arg2, int arg3) {
        field280++;
        if (arg1 != 80) {
            method133((byte) 95);
        }
        class134 var5 = (class134) class3.field21.method1619((long) this.field286, 78);
        if (var5 == null) {
            class259 var6 = class259.method1835(class225.field3582, this.field296, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field288 != null) {
                for (int var7 = 0; var7 < this.field288.length; var7++) {
                    var6.method1860(this.field288[var7], this.field294[var7]);
                }
            }
            if (this.field298 != null) {
                for (int var8 = 0; var8 < this.field298.length; var8++) {
                    var6.method1832(this.field298[var8], this.field291[var8]);
                }
            }
            var5 = var6.method1855(this.field277 + 64, this.field293 + 850, -30, -50, -30);
            class3.field21.method1621((long) this.field286, 87, var5);
        }
        class134 var9;
        if (this.field302 == -1 || arg3 == -1) {
            var9 = var5.method507(true, true, true);
        } else {
            var9 = class37.method236(this.field302, 20254).method585(arg2, arg3, arg0, var5, (byte) 57);
        }
        if (this.field303 != 128 || this.field282 != 128) {
            var9.method531(this.field303, this.field282, this.field303);
        }
        if (this.field281 != 0) {
            if (this.field281 == 90) {
                var9.method503();
            }
            if (this.field281 == 180) {
                var9.method533();
            }
            if (this.field281 == 270) {
                var9.method524();
            }
        }
        return var9;
    }
}
