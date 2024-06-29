import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    private int[] field1592;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lbf;")
    private class200 field1582;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lbf;")
    private class200 field1584;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[Lbf;")
    private class200[] field1579;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lnc;")
    public static class85 field1580 = new class85(16);

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lid;")
    private static class149 field1587 = class60.method382(" is already on your friend list)3", (byte) 24);

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[J")
    public static long[] field1589 = new long[200];

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lid;")
    public static class149 field1586 = field1587;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpc;BLal;)Z")
    public final boolean method644(class21 arg0, byte arg1, class230 arg2) {
        field1581++;
        if (class177.field3231 <= 0) {
            for (int var4 = 0; var4 < this.field1592.length; var4++) {
                if (!arg2.method1556(this.field1592[var4], true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1592.length; var5++) {
                if (!arg2.method1541(true, class177.field3231, this.field1592[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1577.length; var6++) {
            if (!arg0.method121(this.field1577[var6], (byte) -95)) {
                return false;
            }
        }
        if (arg1 != 115) {
            field1587 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method645(int arg0) {
        field1586 = null;
        if (arg0 != -2955) {
            field1580 = null;
        }
        field1587 = null;
        field1589 = null;
        field1580 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILid;Lid;IILid;)V")
    public static final void method646(int arg0, class149 arg1, class149 arg2, int arg3, int arg4, class149 arg5) {
        if (arg4 != -1) {
            return;
        }
        field1578++;
        for (int var6 = 99; var6 > 0; var6--) {
            class109.field1886[var6] = class109.field1886[var6 - 1];
            class116.field1992[var6] = class116.field1992[var6 - 1];
            class227.field3973[var6] = class227.field3973[var6 - 1];
            class188.field3372[var6] = class188.field3372[var6 - 1];
            class168.field3126[var6] = class168.field3126[var6 - 1];
        }
        class116.field1992[0] = arg5;
        class189.field3389++;
        class109.field1886[0] = arg3;
        class168.field3126[0] = arg0;
        class223.field3927 = class90.field1606;
        class227.field3973[0] = arg1;
        class188.field3372[0] = arg2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public static final int method647(int arg0, int arg1) {
        if (arg1 <= 10) {
            method645(-6);
        }
        field1588++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public static final void method648(boolean arg0, int arg1) {
        class19 var2 = (class19) class10.field135.method639((byte) -33, (long) arg1);
        field1591++;
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0) {
            method648(true, 29);
        }
        while (var3 < var2.field290.length) {
            var2.field290[var3] = -1;
            var2.field286[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpc;Lal;IZIZDI)[I")
    public final int[] method649(class21 arg0, class230 arg1, int arg2, boolean arg3, int arg4, boolean arg5, double arg6, int arg7) {
        field1590++;
        class66.method410(0, arg6);
        class233.field4097 = arg0;
        class64.field1152 = arg1;
        class35.method197(119, arg4, arg7);
        for (int var10 = 0; var10 < this.field1579.length; var10++) {
            this.field1579[var10].method1367((byte) -117, arg4, arg7);
        }
        int[] var11 = new int[arg4 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var13 = -1;
            var12 = -1;
            var14 = arg4 - 1;
        } else {
            var12 = 1;
            var13 = arg4;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1582.field3641) {
                int[] var22 = this.field1582.method26(var16, (byte) 55);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field1582.method24(true, var16);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var20[var23] >> 4;
                int var27 = class136.field2493[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class136.field2493[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class136.field2493[var26];
                var11[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg3) {
                    var15 += arg4 - 1;
                }
            }
        }
        if (arg2 < 58) {
            method647(-46, -64);
        }
        for (int var17 = 0; var17 < this.field1579.length; var17++) {
            this.field1579[var17].method88((byte) 107);
        }
        return var11;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfb;)V")
    public static final void method650(int arg0, class29 arg1) {
        class140.field2573 = 3;
        field1583++;
        class127.method884((byte) -87, true);
        int var2 = 37 % ((arg0 + 37) / 35);
        class80.field1489 = true;
        class38.field571 = true;
        class214.field3792 = 0;
        class180.field3242 = 0;
        class278.field4958 = true;
        class126.field2209 = true;
        class116.field1989 = true;
        class57.field1005 = 127;
        class86.field1573 = true;
        class281.field4997 = 2;
        class83.field1512 = true;
        class257.field4489 = 0;
        class51 var3 = null;
        class44.field667 = 255;
        class211.field3762 = true;
        class211.field3761 = true;
        class133.field2432 = 127;
        class111.field1921 = true;
        class136.field2496 = 0;
        class283.field5003 = true;
        if (class77.field1447 < 96) {
            class88.method651(0);
        } else {
            class88.method651(2);
        }
        class211.field3755 = false;
        class169.field3137 = 0;
        class99.field1758 = 0;
        class26.field398 = true;
        class228.field3987 = false;
        class15.field219 = false;
        class165.field3073 = 0;
        try {
            class187 var4 = arg1.method167("runescape", true);
            while (var4.field3358 == 0) {
                class151.method1074(-126, 1L);
            }
            if (var4.field3358 == 1) {
                var3 = (class51) var4.field3357;
                byte[] var5 = new byte[(int) var3.method339(0)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method335(var5.length - var6, var5, var6, -1);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class59.method375(new class74(var5), 93);
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method336(-1);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class87() {
        this.field1577 = new int[0];
        this.field1592 = new int[0];
        this.field1582 = new class66();
        this.field1582.field3640 = 1;
        this.field1584 = new class66();
        this.field1579 = new class200[] { this.field1582, this.field1584 };
        this.field1584.field3640 = 1;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lgd;)V")
    public class87(class74 arg0) {
        int var2 = 0;
        int var3 = arg0.method489((byte) 93);
        int[][] var4 = new int[var3][];
        int var5 = 0;
        this.field1579 = new class200[var3];
        for (int var6 = 0; var6 < var3; var6++) {
            class200 var16 = class206.method1404(arg0, 2790);
            if (var16.method700((byte) -116) >= 0) {
                var2++;
            }
            if (var16.method89(-1) >= 0) {
                var5++;
            }
            int var17 = var16.field3629.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method489((byte) -69);
            }
            this.field1579[var6] = var16;
        }
        this.field1577 = new int[var5];
        this.field1592 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class200 var11 = this.field1579[var9];
            int var12 = var11.field3629.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3629[var13] = this.field1579[var4[var9][var13]];
            }
            int var14 = var11.method700((byte) -98);
            int var15 = var11.method89(-1);
            if (var14 > 0) {
                this.field1592[var8++] = var14;
            }
            if (var15 > 0) {
                this.field1577[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field1582 = this.field1579[arg0.method489((byte) -92)];
        this.field1584 = this.field1579[arg0.method489((byte) 92)];
        Object var10 = null;
    }
}
