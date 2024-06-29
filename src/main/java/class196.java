import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class196 {

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    private int field2847 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[Lmg;")
    public class117[] field2846;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "J")
    private long field2840;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lmg;")
    private class117 field2834;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lmg;")
    private class117 field2848;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JILmg;)V", line = 11)
    public final void method1400(long arg0, int arg1, class117 arg2) {
        if (arg1 <= 104) {
            this.field2846 = (class117[]) null;
        }
        if (arg2.field1657 != null) {
            arg2.method876(8);
        }
        field2837++;
        class117 var5 = this.field2846[(int) ((long) (this.field2845 - 1) & arg0)];
        arg2.field1657 = var5.field1657;
        arg2.field1659 = var5;
        arg2.field1656 = arg0;
        arg2.field1657.field1659 = arg2;
        arg2.field1659.field1657 = arg2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V", line = 36)
    public static final void method1401(int arg0, boolean arg1) {
        class154.field2201 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class229.field3469 = new int[104];
        class19.field304 = new int[104];
        class126.field1826 = new byte[var2][104][104];
        class228.field3462 = new int[var2][arg0][105];
        class230.field3476 = new int[104];
        class352.field5424 = new int[104];
        field2842++;
        class261.field3913 = new byte[var2][104][104];
        class343.field5299 = new int[5];
        class215.field3169 = 99;
        class132.field1933 = new byte[var2][104][104];
        class300.field4492 = new byte[var2][104][104];
        class102.field1454 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILph;)Z", line = 62)
    public static final boolean method1402(int arg0, class361 arg1) {
        if (arg0 == 4) {
            field2838++;
            return arg1.method2514((byte) 71, class292.field4428);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[Lmg;)I", line = 78)
    public final int method1403(boolean arg0, class117[] arg1) {
        int var3 = 0;
        if (!arg0) {
            method1412(-57, 70, (byte) 118, -81, -117);
        }
        for (int var4 = 0; var4 < this.field2845; var4++) {
            class117 var5 = this.field2846[var4];
            for (class117 var6 = var5.field1659; var6 != var5; var6 = var6.field1659) {
                arg1[var3++] = var6;
            }
        }
        field2828++;
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lmg;", line = 110)
    public final class117 method1404(int arg0) {
        field2832++;
        if (arg0 > -50) {
            this.field2840 = -8L;
        }
        if (this.field2847 > 0 && this.field2846[this.field2847 - 1] != this.field2848) {
            class117 var2 = this.field2848;
            this.field2848 = var2.field1659;
            return var2;
        }
        class117 var3;
        do {
            if (this.field2847 >= this.field2845) {
                return null;
            }
            var3 = this.field2846[this.field2847++].field1659;
        } while (this.field2846[this.field2847 - 1] == var3);
        this.field2848 = var3.field1659;
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JZ)Lmg;", line = 144)
    public final class117 method1405(long arg0, boolean arg1) {
        field2829++;
        this.field2840 = arg0;
        class117 var4 = this.field2846[(int) (arg0 & (long) (this.field2845 - 1))];
        this.field2834 = var4.field1659;
        if (arg1) {
            this.field2847 = 45;
        }
        while (this.field2834 != var4) {
            if (this.field2834.field1656 == arg0) {
                class117 var5 = this.field2834;
                this.field2834 = this.field2834.field1659;
                return var5;
            }
            this.field2834 = this.field2834.field1659;
        }
        this.field2834 = null;
        return null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lmg;", line = 174)
    public final class117 method1406(int arg0) {
        field2841++;
        this.field2847 = arg0;
        return this.method1404(-57);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lmg;", line = 184)
    public final class117 method1407(byte arg0) {
        field2833++;
        if (this.field2834 == null) {
            return null;
        }
        class117 var2 = this.field2846[(int) (this.field2840 & (long) (this.field2845 - 1))];
        while (this.field2834 != var2) {
            if (this.field2834.field1656 == this.field2840) {
                class117 var3 = this.field2834;
                this.field2834 = this.field2834.field1659;
                return var3;
            }
            this.field2834 = this.field2834.field1659;
        }
        this.field2834 = null;
        int var4 = -93 / ((arg0 - 22) / 51);
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 213)
    public static final void method1408(int arg0, int arg1) {
        if (arg1 <= -87) {
            field2830++;
            class95 var2 = class227.method1699(4, -1855723168, arg0);
            var2.method743(0);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I", line = 230)
    public final int method1409(int arg0) {
        field2844++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field2845; var3++) {
            class117 var4 = this.field2846[var3];
            for (class117 var5 = var4.field1659; var5 != var4; var5 = var5.field1659) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 260)
    public final void method1410(int arg0) {
        int var2 = 0;
        if (arg0 > -115) {
            return;
        }
        while (this.field2845 > var2) {
            class117 var3 = this.field2846[var2];
            while (true) {
                class117 var4 = var3.field1659;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method876(8);
            }
        }
        this.field2834 = null;
        field2836++;
        this.field2848 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lph;B)V", line = 291)
    public static final void method1411(class361 arg0, byte arg1) {
        class11.field180 = arg0;
        if (arg1 > 36) {
            field2839++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBII)V", line = 303)
    public static final void method1412(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class141.field2031) {
            class205.method1503(arg0, arg1, arg0 + arg4, arg1 - -arg3);
            class205.method1499(arg0, arg1, arg4, arg3, 0);
        } else {
            class44.method326(arg0, arg1, arg0 + arg4, arg1 + arg3);
            class44.method317(arg0, arg1, arg4, arg3, 0);
        }
        field2835++;
        if (class96.field1364 < 100) {
            return;
        }
        float var5 = (float) class105.field1503 / (float) class105.field1499;
        int var6 = arg4;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = (arg4 - var6) / 2 + arg0;
        if (class250.field3714 == null || class250.field3714.field2536 != arg4 || class250.field3714.field2553 != arg3) {
            class118 var9 = new class118(arg4, arg3);
            class44.method325(var9.field1665, arg4, arg3);
            if (class105.field1500.field4268 != -1) {
                class44.method317(0, 0, arg4, arg3, class105.field1500.field4268);
            }
            class105.method809(0, 0, class105.field1499, class105.field1503, 0, 0, var6, var7);
            class105.method811();
            if (class141.field2031) {
                class250.field3714 = new class325(var9);
            } else {
                class250.field3714 = var9;
            }
            if (class141.field2031) {
                class44.field624 = null;
            } else {
                class356.field5460.method973(-27272);
            }
        }
        int var10 = (arg3 - var7) / 2 + arg1;
        class250.field3714.method640(var8, var10);
        int var11 = class306.field4586 * var6 / class105.field1499;
        int var12 = class116.field1653 * var6 / class105.field1499 + var8;
        int var13 = var10 + (class197.field2864 * var7 / class105.field1503);
        int var14 = class133.field1943 * var7 / class105.field1503;
        if (arg2 >= -122) {
            method1411((class361) null, (byte) 90);
        }
        int var15 = 16711680;
        if (class164.field2335 == 1) {
            var15 = 16777215;
        }
        if (class141.field2031) {
            class205.method1500(var12, var13, var11, var14, var15, 128);
            class205.method1487(var12, var13, var11, var14, var15);
        } else {
            class44.method315(var12, var13, var11, var14, var15, 128);
            class44.method316(var12, var13, var11, var14, var15);
        }
        if (class107.field1528 <= 0) {
            return;
        }
        int var16;
        if (class68.field994 <= 50) {
            var16 = class68.field994 * 5;
        } else {
            var16 = (100 - class68.field994) * 5;
        }
        for (class287 var17 = (class287) class105.field1505.method2386((byte) -108); var17 != null; var17 = (class287) class105.field1505.method2388((byte) -92)) {
            class200 var18 = class349.method2447(var17.field4350, (byte) -9);
            if (class276.method2017(-6, var18)) {
                if (class41.field596 == var17.field4350) {
                    int var19 = var17.field4342 * var6 / class105.field1499 + var8;
                    int var20 = var17.field4338 * var7 / class105.field1503 + var10;
                    if (class141.field2031) {
                        class205.method1500(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    } else {
                        class44.method315(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    }
                } else if (class209.field3047 != -1 && class209.field3047 == var18.field2915) {
                    int var21 = var8 + (var17.field4342 * var6 / class105.field1499);
                    int var22 = var17.field4338 * var7 / class105.field1503 + var10;
                    if (class141.field2031) {
                        class205.method1500(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    } else {
                        class44.method315(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I", line = 441)
    public final int method1413(byte arg0) {
        field2831++;
        return arg0 == -125 ? this.field2845 : -16;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IC)Z", line = 454)
    public static final boolean method1414(int arg0, char arg1) {
        if (arg0 < 29) {
            method1411((class361) null, (byte) 54);
        }
        field2843++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V", line = 464)
    public class196(int arg0) {
        this.field2846 = new class117[arg0];
        this.field2845 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class117 var3 = this.field2846[var2] = new class117();
            var3.field1657 = var3;
            var3.field1659 = var3;
        }
    }
}
