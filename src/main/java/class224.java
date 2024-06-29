import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class224 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
    private int[] field2616 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Z")
    public static boolean field2615 = false;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "Lhj;")
    public static class596 field2624 = new class596(90, 4);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Lnp;")
    public class517 field2618;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "[I")
    private int[] field2628;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "[S")
    private short[] field2620;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "[S")
    private short[] field2622;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "[S")
    private short[] field2626;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "[S")
    private short[] field2630;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IBZII)V")
    public static final void method1375(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field2617++;
        if (!arg2 && class226.field2638 == arg3 && class518.field7310 == arg4 && class581.field7921 == class500.field7013 || class118.field1503.field10632.method3881(0) == 1) {
            return;
        }
        class518.field7310 = arg4;
        class500.field7013 = class581.field7921;
        class226.field2638 = arg3;
        if (class118.field1503.field10632.method3881(0) == 1) {
            class500.field7013 = 0;
        }
        class48.method454(arg0, -1);
        class671.method3764(-113, class637.field8687.method3584(class770.field10592, true), class466.field6523, class363.field4526, true, class708.field9946);
        int var5 = class632.field8626;
        class632.field8626 = (class226.field2638 - (class596.field8090 >> 4)) * 8;
        int var6 = class620.field8435;
        class620.field8435 = (class518.field7310 - (class107.field1350 >> 4)) * 8;
        class289.field3494 = class9.method167(class226.field2638 * 8, class518.field7310 * 8);
        class418.field5453 = null;
        int var7 = class632.field8626 - var5;
        int var8 = class620.field8435 - var6;
        if (arg0 == 11) {
            for (int var9 = 0; var9 < class370.field4599; var9++) {
                class273 var10 = class616.field8293[var9];
                if (var10 != null) {
                    class388 var11 = var10.field3210;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field3453[var12] -= var7;
                        var11.field3455[var12] -= var8;
                    }
                    var11.field823 -= var7 * 512;
                    var11.field813 -= var8 * 512;
                }
            }
        } else {
            class3.field42 = 0;
            boolean var13 = false;
            int var14 = class596.field8090 * 512 - 512;
            int var15 = (class107.field1350 - 1) * 512;
            for (int var16 = 0; var16 < class370.field4599; var16++) {
                class273 var30 = class616.field8293[var16];
                if (var30 != null) {
                    class388 var31 = var30.field3210;
                    var31.field823 -= var7 * 512;
                    var31.field813 -= var8 * 512;
                    if (var31.field823 >= 0 && var14 >= var31.field823 && var31.field813 >= 0 && var15 >= var31.field813) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field3453[var33] -= var7;
                            var31.field3455[var33] -= var8;
                            if (var31.field3453[var33] < 0 || class596.field8090 <= var31.field3453[var33] || var31.field3455[var33] < 0 || class107.field1350 <= var31.field3455[var33]) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class2.field29[class3.field42++] = var31.field3393;
                        } else {
                            var31.method2275(null, (byte) -83);
                            var30.method2219(13630);
                            var13 = true;
                        }
                    } else {
                        var31.method2275(null, (byte) -117);
                        var13 = true;
                        var30.method2219(13630);
                    }
                }
            }
            if (var13) {
                class370.field4599 = class30.field444.method2117(true);
                class30.field444.method2113(class616.field8293, -108);
            }
        }
        int var17 = 0;
        if (arg1 < 25) {
            field2615 = false;
        }
        while (var17 < 2048) {
            class521 var28 = class61.field825[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3453[var29] -= var7;
                    var28.field3455[var29] -= var8;
                }
                var28.field813 -= var8 * 512;
                var28.field823 -= var7 * 512;
            }
            var17++;
        }
        class615[] var18 = class56.field756;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class615 var27 = var18[var19];
            if (var27 != null) {
                var27.field8261 -= var7 * 512;
                var27.field8268 -= var8 * 512;
            }
        }
        for (class88 var20 = (class88) class83.field1126.method2725(37); var20 != null; var20 = (class88) class83.field1126.method2726(-117)) {
            var20.field1179 -= var8;
            var20.field1176 -= var7;
            if (class118.field1502 != 4 && (var20.field1176 < 0 || var20.field1179 < 0 || class596.field8090 <= var20.field1176 || class107.field1350 <= var20.field1179)) {
                var20.method2219(13630);
            }
        }
        for (class88 var21 = (class88) class651.field8995.method2725(37); var21 != null; var21 = (class88) class651.field8995.method2726(-120)) {
            var21.field1176 -= var7;
            var21.field1179 -= var8;
            if (class118.field1502 != 4 && (var21.field1176 < 0 || var21.field1179 < 0 || var21.field1176 >= class596.field8090 || var21.field1179 >= class107.field1350)) {
                var21.method2219(13630);
            }
        }
        if (class118.field1502 != 4) {
            for (class667 var22 = (class667) class673.field9230.method2119(-36); var22 != null; var22 = (class667) class673.field9230.method2111((byte) -127)) {
                int var23 = (int) (var22.field4809 & 0x3FFFL);
                int var24 = var23 - class632.field8626;
                int var25 = (int) (var22.field4809 >> 14 & 0x3FFFL);
                int var26 = var25 - class620.field8435;
                if (var24 < 0 || var26 < 0 || var24 >= class596.field8090 || var26 >= class107.field1350) {
                    var22.method2219(13630);
                }
            }
        }
        if (class754.field10460 != 0) {
            class754.field10460 -= var7;
            class687.field9376 -= var8;
        }
        class670.method3757(16680);
        if (arg0 != 11) {
            class599.field8107 -= var7 * 512;
            class486.field6791 -= var8;
            class540.field7598 -= var8;
            class308.field3822 -= var7;
            class350.field4366 -= var8 * 512;
            class99.field1298 -= var7;
            if (Math.abs(var7) > class596.field8090 || Math.abs(var8) > class107.field1350) {
                class185.method1233(-24497);
            }
        } else if (class7.field100 == 4) {
            class467.field6528 -= var7 * 512;
            class93.field1229 -= var8 * 512;
            class713.field10000 -= var7 * 512;
            class353.field4390 -= var8 * 512;
        } else {
            class7.field100 = 1;
            class719.field10094 = -1;
            class131.field1617 = -1;
        }
        class123.method958(true);
        class149.method1075((byte) -35);
        class153.field1909.method2729(-48);
        class105.field1346.method2729(-48);
        class196.field2343.method2442((byte) -51);
        class303.method1759((byte) 121);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lso;")
    public final class496 method1376(int arg0) {
        field2623++;
        if (this.field2628 == null) {
            return null;
        }
        class496[] var2 = new class496[this.field2628.length];
        class48 var3 = this.field2618.field7280;
        synchronized (this.field2618.field7280) {
            int var4 = 0;
            while (true) {
                if (this.field2628.length <= var4) {
                    break;
                }
                var2[var4] = class748.method4177(this.field2628[var4], 0, this.field2618.field7280, 4);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field2628.length; var5++) {
            if (var2[var5].field6919 < 13) {
                var2[var5].method2934(120, 2);
            }
        }
        class496 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class496(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2626 != null) {
            for (int var7 = 0; var7 < this.field2626.length; var7++) {
                var6.method2923(this.field2626[var7], this.field2630[var7], true);
            }
        }
        if (this.field2620 != null) {
            for (int var8 = 0; var8 < this.field2620.length; var8++) {
                var6.method2929(this.field2622[var8], this.field2620[var8], arg0 ^ 0x52);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
    public static void method1377(int arg0) {
        if (arg0 != 8) {
            method1377(20);
        }
        field2624 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Les;II)V")
    private final void method1378(class403 arg0, int arg1, int arg2) {
        field2625++;
        if (arg2 == 1) {
            arg0.method2396((byte) -91);
        } else if (arg2 == 2) {
            int var8 = arg0.method2396((byte) 59);
            this.field2628 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2628[var9] = arg0.method2390((byte) -98);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method2396((byte) 56);
                this.field2630 = new short[var4];
                this.field2626 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2626[var5] = (short) arg0.method2390((byte) -125);
                    this.field2630[var5] = (short) arg0.method2390((byte) 59);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method2396((byte) -106);
                this.field2620 = new short[var6];
                this.field2622 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2620[var7] = (short) arg0.method2390((byte) -99);
                    this.field2622[var7] = (short) arg0.method2390((byte) -106);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field2616[arg2 - 60] = arg0.method2390((byte) 99);
            }
        }
        if (arg1 != 0) {
            this.field2626 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILes;)V")
    public final void method1379(int arg0, class403 arg1) {
        while (true) {
            int var3 = arg1.method2396((byte) -88);
            if (var3 == 0) {
                if (arg0 <= 18) {
                    this.method1379(124, null);
                }
                field2621++;
                return;
            }
            this.method1378(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)Z")
    public final boolean method1380(int arg0) {
        field2614++;
        if (this.field2628 == null) {
            return true;
        }
        boolean var2 = true;
        class48 var3 = this.field2618.field7280;
        synchronized (this.field2618.field7280) {
            if (arg0 != -3) {
                this.method1381((byte) -18);
            }
            for (int var4 = 0; var4 < this.field2628.length; var4++) {
                if (!this.field2618.field7280.method443(0, this.field2628[var4], true)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Z")
    public final boolean method1381(byte arg0) {
        field2629++;
        boolean var2 = true;
        class48 var3 = this.field2618.field7280;
        synchronized (this.field2618.field7280) {
            if (arg0 >= -30) {
                this.method1378(null, -64, -88);
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2616[var4] != -1 && !this.field2618.field7280.method443(0, this.field2616[var4], true)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        field2627++;
        if (class345.field4331 == null) {
            return;
        }
        try {
            String var1 = class345.field4331.getParameter("cookiehost");
            int var2 = (int) (class349.method2069(true) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class745.method4172(class345.field4331, "document.cookie=\"" + var3 + "\"", (byte) -35);
        } catch (Throwable var4) {
        }
        if (arg0 != -3476) {
            method1377(-93);
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Lso;")
    public final class496 method1383(int arg0) {
        field2619++;
        class496[] var2 = new class496[5];
        int var3 = 0;
        class48 var4 = this.field2618.field7280;
        synchronized (this.field2618.field7280) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2616[var5] != -1) {
                    var2[var3++] = class748.method4177(this.field2616[var5], 0, this.field2618.field7280, 4);
                }
                var5++;
            }
        }
        int var6 = 77 / ((arg0 - 22) / 62);
        for (int var7 = 0; var7 < 5; var7++) {
            if (var2[var7] != null && var2[var7].field6919 < 13) {
                var2[var7].method2934(59, 2);
            }
        }
        class496 var8 = new class496(var2, var3);
        if (this.field2626 != null) {
            for (int var9 = 0; var9 < this.field2626.length; var9++) {
                var8.method2923(this.field2626[var9], this.field2630[var9], true);
            }
        }
        if (this.field2620 != null) {
            for (int var10 = 0; var10 < this.field2620.length; var10++) {
                var8.method2929(this.field2622[var10], this.field2620[var10], 104);
            }
        }
        return var8;
    }
}
