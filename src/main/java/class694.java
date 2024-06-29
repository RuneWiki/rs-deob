import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class694 {

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    private int field9623 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field9613;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[Lkd;")
    public class263[] field9619;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[B")
    public static byte[] field9607 = new byte[520];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field9612 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[Lca;")
    public static class285[] field9611 = new class285[5];

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "J")
    private long field9621;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lkd;")
    private class263 field9605;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lkd;")
    private class263 field9627;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lkaa;")
    public static class44 field9625;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[I")
    public static int[] field9628;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[S")
    public static short[] field9629;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JB)Lkd;")
    public final class263 method3828(long arg0, byte arg1) {
        this.field9621 = arg0;
        field9606++;
        class263 var4 = this.field9619[(int) ((long) (this.field9613 - 1) & arg0)];
        this.field9605 = var4.field3320;
        if (arg1 != -91) {
            field9629 = null;
        }
        while (this.field9605 != var4) {
            if (this.field9605.field3321 == arg0) {
                class263 var5 = this.field9605;
                this.field9605 = this.field9605.field3320;
                return var5;
            }
            this.field9605 = this.field9605.field3320;
        }
        this.field9605 = null;
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lkd;")
    public final class263 method3829(byte arg0) {
        field9616++;
        if (this.field9605 == null) {
            return null;
        }
        class263 var2 = this.field9619[(int) (this.field9621 & (long) (this.field9613 - 1))];
        while (this.field9605 != var2) {
            if (this.field9605.field3321 == this.field9621) {
                class263 var3 = this.field9605;
                this.field9605 = this.field9605.field3320;
                return var3;
            }
            this.field9605 = this.field9605.field3320;
        }
        this.field9605 = null;
        return arg0 < 34 ? null : null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lkd;")
    public final class263 method3830(byte arg0) {
        field9610++;
        int var2 = -42 / ((arg0 - 35) / 37);
        this.field9623 = 0;
        return this.method3838((byte) -92);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIZB)V")
    public static final void method3831(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field9617++;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg0);
        class36 var8 = (class36) class117.field1453.method3828(var6, (byte) -91);
        if (var8 == null) {
            var8 = new class36();
            class117.field1453.method3832(var8, var6, 17);
        }
        if (arg5 > -86) {
            return;
        }
        if (arg1 >= var8.field541.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field541.length; var11++) {
                var9[var11] = var8.field541[var11];
                var10[var11] = var8.field536[var11];
            }
            for (int var12 = var8.field541.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field536 = var10;
            var8.field541 = var9;
        }
        var8.field541[arg1] = arg2;
        var8.field536[arg1] = arg3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lkd;JI)V")
    public final void method3832(class263 arg0, long arg1, int arg2) {
        if (arg0.field3319 != null) {
            arg0.method1566(-92);
        }
        field9622++;
        class263 var5 = this.field9619[(int) (arg1 & (long) (this.field9613 - 1))];
        arg0.field3319 = var5.field3319;
        arg0.field3320 = var5;
        if (arg2 <= 7) {
            this.method3838((byte) -20);
        }
        arg0.field3319.field3320 = arg0;
        arg0.field3320.field3319 = arg0;
        arg0.field3321 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method3833(int arg0) {
        field9614++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field9613; var3++) {
            class263 var4 = this.field9619[var3];
            for (class263 var5 = var4.field3320; var5 != var4; var5 = var5.field3320) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static final void method3834(byte arg0) {
        field9618++;
        class673.field9191++;
        class124 var1 = class336.method1924(class422.field5353, class636.field8620, (byte) -17);
        var1.field1516.method3090(class207.method1211(3), 3);
        var1.field1516.method3080((byte) -51, class309.field3890);
        var1.field1516.method3080((byte) -72, class491.field6129);
        int var2 = -3 / ((arg0 - 2) / 49);
        var1.field1516.method3090(class611.field8310.field8721, 3);
        class197.method1156((byte) 82, var1);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(JB)V")
    public static final void method3835(long arg0, byte arg1) {
        field9608++;
        int var3 = class702.field9824;
        if (arg1 != 105) {
            return;
        }
        if (class415.field5323 != var3) {
            int var4 = var3 - class415.field5323;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class415.field5323 += var5;
        }
        int var6 = class576.field7580;
        if (!class611.field8310.field8695) {
            class23.field266 += (float) arg0 * class441.field5547 / 40.0F * 8.0F;
            class689.field9561 += (float) arg0 * class350.field4524 / 40.0F * 8.0F;
        }
        if (class305.field3862 != var6) {
            int var7 = var6 - class305.field3862;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class305.field3862 += var8;
        }
        class305.method1819((byte) -94);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lkd;B)I")
    public final int method3836(class263[] arg0, byte arg1) {
        field9609++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field9613; var4++) {
            class263 var6 = this.field9619[var4];
            for (class263 var7 = var6.field3320; var7 != var6; var7 = var7.field3320) {
                arg0[var3++] = var7;
            }
        }
        int var5 = -29 / ((arg1 + 32) / 40);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method3837(int arg0) {
        field9612 = null;
        field9611 = null;
        field9628 = null;
        field9629 = null;
        field9625 = null;
        if (arg0 != 21125) {
            field9611 = null;
        }
        field9607 = null;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)Lkd;")
    public final class263 method3838(byte arg0) {
        if (arg0 != -92) {
            return null;
        }
        field9626++;
        if (this.field9623 > 0 && this.field9619[this.field9623 - 1] != this.field9627) {
            class263 var2 = this.field9627;
            this.field9627 = var2.field3320;
            return var2;
        }
        while (this.field9613 > this.field9623) {
            class263 var3 = this.field9619[this.field9623++].field3320;
            if (this.field9619[this.field9623 - 1] != var3) {
                this.field9627 = var3.field3320;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
    public final void method3839(byte arg0) {
        for (int var2 = 0; var2 < this.field9613; var2++) {
            class263 var3 = this.field9619[var2];
            while (true) {
                class263 var4 = var3.field3320;
                if (var3 == var4) {
                    break;
                }
                var4.method1566(-58);
            }
        }
        if (arg0 >= -91) {
            this.field9605 = null;
        }
        field9615++;
        this.field9627 = null;
        this.field9605 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
    public class694(int arg0) {
        this.field9613 = arg0;
        this.field9619 = new class263[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class263 var3 = this.field9619[var2] = new class263();
            var3.field3320 = var3;
            var3.field3319 = var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)I")
    public final int method3840(byte arg0) {
        if (arg0 == -23) {
            field9624++;
            return this.field9613;
        } else {
            return -79;
        }
    }

    static {
        for (int var0 = 0; var0 < field9611.length; var0++) {
            field9611[var0] = new class285();
        }
    }
}
