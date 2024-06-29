import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class250 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/lang/String;")
    private String field3209 = "null";

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public static int[] field3219 = new int[1000];

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lpd;")
    public static class241 field3224 = new class241();

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Ldr;")
    public static class675 field3227 = new class675(14, 3);

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Lls;")
    public static class129 field3229 = new class129("LIVE", 0);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "C")
    public char field3213;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "C")
    public char field3225;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "F")
    public static float field3232;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field3218;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lhd;")
    public class694 field3211;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lhd;")
    private class694 field3217;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLji;)V")
    public final void method1498(boolean arg0, class572 arg1) {
        field3228++;
        if (arg0) {
            this.field3225 = (char) 65439;
        }
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method1508(var3, 6, arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)I")
    public final int method1499(int arg0, boolean arg1) {
        field3212++;
        if (this.field3211 == null) {
            return this.field3218;
        }
        class319 var3 = (class319) this.field3211.method3828((long) arg0, (byte) -91);
        if (!arg1) {
            this.field3218 = 24;
        }
        return var3 == null ? this.field3218 : var3.field3990;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method1500(int arg0) {
        field3214++;
        if (class431.field5437) {
            return;
        }
        class594.method3287(class126.field1539, (byte) -123);
        if (class19.field205 != null) {
            class594.method3287(class19.field205, (byte) -98);
        }
        class431.field5437 = true;
        if (arg0 != 1) {
            method1509(76, false, -67, -12, -30);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1501(String arg0, byte arg1) {
        field3222++;
        if (this.field3211 == null) {
            return false;
        }
        int var3 = -69 / ((arg1 - 93) / 32);
        if (this.field3217 == null) {
            this.method1504(false);
        }
        for (class281 var4 = (class281) this.field3217.method3828(class60.method506(-1166517115, arg0), (byte) -91); var4 != null; var4 = (class281) this.field3217.method3829((byte) 43)) {
            if (var4.field3582.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1502(int arg0, int arg1) {
        field3226++;
        if (this.field3211 == null) {
            return this.field3209;
        }
        class654 var3 = (class654) this.field3211.method3828((long) arg1, (byte) -91);
        if (var3 == null) {
            return this.field3209;
        } else {
            if (arg0 != 18932) {
                field3224 = null;
            }
            return var3.field8913;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(CB)Z")
    public static final boolean method1503(char arg0, byte arg1) {
        field3216++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class274.method1634(arg0, arg1 - 30704)) {
            return true;
        } else {
            if (arg1 != 27) {
                field3219 = null;
            }
            char[] var2 = class327.field4075;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class545.field6854;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    private final void method1504(boolean arg0) {
        this.field3217 = new class694(this.field3211.method3840((byte) -23));
        field3208++;
        for (class654 var2 = (class654) this.field3211.method3830((byte) -36); var2 != null; var2 = (class654) this.field3211.method3838((byte) -92)) {
            class281 var3 = new class281(var2.field8913, (int) var2.field3321);
            this.field3217.method3832(var3, class60.method506(-1166517115, var2.field8913), 122);
        }
        if (arg0) {
            this.field3225 = '+';
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Z")
    public final boolean method1505(boolean arg0, int arg1) {
        field3220++;
        if (this.field3211 == null) {
            return false;
        }
        if (this.field3217 == null) {
            this.method1507(-5);
        }
        class319 var3 = (class319) this.field3217.method3828((long) arg1, (byte) -91);
        if (arg0) {
            this.method1504(true);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)Z")
    public static final boolean method1506(byte arg0, int arg1, int arg2) {
        if (arg0 != 101) {
            field3227 = null;
        }
        field3221++;
        return (arg2 & 0x70000) != 0 | class45.method276(arg2, arg0 ^ 0x702, arg1) || class632.method3547((byte) 104, arg2, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    private final void method1507(int arg0) {
        field3223++;
        this.field3217 = new class694(this.field3211.method3840((byte) -23));
        if (arg0 != -5) {
            method1500(-50);
        }
        for (class319 var2 = (class319) this.field3211.method3830((byte) -128); var2 != null; var2 = (class319) this.field3211.method3838((byte) -92)) {
            class319 var3 = new class319((int) var2.field3321);
            this.field3217.method3832(var3, (long) var2.field3990, 31);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILji;)V")
    private final void method1508(int arg0, int arg1, class572 arg2) {
        if (arg1 != 6) {
            return;
        }
        field3210++;
        if (arg0 == 1) {
            this.field3213 = class171.method1030(arg2.method3083(255), true);
        } else if (arg0 == 2) {
            this.field3225 = class171.method1030(arg2.method3083(255), true);
        } else if (arg0 == 3) {
            this.field3209 = arg2.method3072(255);
        } else if (arg0 == 4) {
            this.field3218 = arg2.method3064(arg1 ^ 0x86F000FE);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method3031(-1);
            this.field3211 = new class694(class560.method2979(var4, (byte) 33));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3064(-2031091464);
                class263 var7;
                if (arg0 == 5) {
                    var7 = new class654(arg2.method3072(255));
                } else {
                    var7 = new class319(arg2.method3064(-2031091464));
                }
                this.field3211.method3832(var7, (long) var6, arg1 ^ 0x5C);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIII)V")
    public static final void method1509(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3215++;
        if (!arg1 && class563.field7027 == arg4 && class677.field9229 == arg3 && class675.field9219 == class518.field6552 || class611.field8310.method2744(class628.field8526, 4)) {
            return;
        }
        class563.field7027 = arg4;
        class518.field6552 = class675.field9219;
        class677.field9229 = arg3;
        if (class611.field8310.method2744(class628.field8526, 4)) {
            class518.field6552 = 0;
        }
        class78.method609(10503, arg2);
        class340.method1951(class671.field9126.method3726((byte) 39, class71.field912), class321.field3994, -119, class616.field8348, class309.field3898, true);
        int var5 = class227.field2938;
        int var6 = class522.field6612;
        class227.field2938 = (class563.field7027 - (class85.field1090 >> 4)) * 8;
        class522.field6612 = (class677.field9229 - (class656.field8932 >> 4)) * 8;
        class496.field6205 = class604.method3338(class563.field7027 * 8, class677.field9229 * 8);
        class469.field5796 = null;
        int var7 = class227.field2938 - var5;
        int var8 = class522.field6612 - var6;
        if (arg2 == 11) {
            for (int var17 = 0; var17 < class215.field2516; var17++) {
                class704 var30 = class140.field1687[var17];
                if (var30 != null) {
                    class506 var31 = var30.field9854;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field508[var32] -= var7;
                        var31.field511[var32] -= var8;
                    }
                    var31.field8011 -= var8 * 512;
                    var31.field8018 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class99.field1276 = 0;
            int var10 = class85.field1090 * 512 - 512;
            int var11 = (class656.field8932 - 1) * 512;
            for (int var12 = 0; var12 < class215.field2516; var12++) {
                class704 var13 = class140.field1687[var12];
                if (var13 != null) {
                    class506 var14 = var13.field9854;
                    var14.field8018 -= var7 * 512;
                    var14.field8011 -= var8 * 512;
                    if (var14.field8018 >= 0 && var10 >= var14.field8018 && var14.field8011 >= 0 && var14.field8011 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field508[var16] -= var7;
                            var14.field511[var16] -= var8;
                            if (var14.field508[var16] < 0 || var14.field508[var16] >= class85.field1090 || var14.field511[var16] < 0 || var14.field511[var16] >= class656.field8932) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class352.field4562[class99.field1276++] = var14.field495;
                        } else {
                            var14.method2759(0, null);
                            var13.method1566(-105);
                            var9 = true;
                        }
                    } else {
                        var14.method2759(0, null);
                        var13.method1566(-117);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class215.field2516 = class168.field1973.method3833(0);
                class168.field1973.method3836(class140.field1687, (byte) 62);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class365 var28 = class132.field1601[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field508[var29] -= var7;
                    var28.field511[var29] -= var8;
                }
                var28.field8018 -= var7 * 512;
                var28.field8011 -= var8 * 512;
            }
        }
        class26[] var19 = class565.field7071;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class26 var27 = var19[var20];
            if (var27 != null) {
                var27.field305 -= var7 * 512;
                var27.field304 -= var8 * 512;
            }
        }
        for (class589 var21 = (class589) class26.field303.method1909(true); var21 != null; var21 = (class589) class26.field303.method1916((byte) 80)) {
            var21.field7910 -= var8;
            var21.field7904 -= var7;
            if (class442.field5572 != 4 && (var21.field7904 < 0 || var21.field7910 < 0 || var21.field7904 >= class85.field1090 || var21.field7910 >= class656.field8932)) {
                var21.method1566(-80);
            }
        }
        if (class442.field5572 != 4) {
            for (class62 var22 = (class62) class370.field4774.method3830((byte) -47); var22 != null; var22 = (class62) class370.field4774.method3838((byte) -92)) {
                int var23 = (int) (var22.field3321 & 0x3FFFL);
                int var24 = var23 - class227.field2938;
                int var25 = (int) (var22.field3321 >> 14 & 0x3FFFL);
                int var26 = var25 - class522.field6612;
                if (var24 < 0 || var26 < 0 || var24 >= class85.field1090 || class656.field8932 <= var26) {
                    var22.method1566(-68);
                }
            }
        }
        if (arg0 != 9840) {
            method1506((byte) -77, -23, 106);
        }
        if (class295.field3763 != 0) {
            class295.field3763 -= var7;
            class536.field6752 -= var8;
        }
        class689.method3806(0);
        if (arg2 != 11) {
            class92.field1186 -= var7;
            class710.field9924 -= var8 * 512;
            class633.field8590 -= var8;
            class27.field314 -= var7;
            class102.field1309 -= var8;
            class238.field3071 -= var7 * 512;
            if (Math.abs(var7) > class85.field1090 || Math.abs(var8) > class656.field8932) {
                class532.method2871(true);
            }
        } else if (class385.field4946 == 4) {
            class576.field7580 -= var8 * 512;
            class415.field5323 -= var7 * 512;
            class305.field3862 -= var8 * 512;
            class702.field9824 -= var7 * 512;
        } else {
            class385.field4946 = 1;
        }
        class644.method3605((byte) -123);
        class580.method3209(-82);
        class301.field3832.method1913((byte) 52);
        class659.field8945.method1913((byte) 93);
        class67.field803.method1716(3);
        class474.method2574(-88);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3227 = null;
        field3224 = null;
        if (arg0 == -10435) {
            field3219 = null;
            field3229 = null;
        }
    }
}
