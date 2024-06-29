import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class196 extends class5 {

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "Z")
    public static boolean field3566 = false;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "Lhj;")
    public static class69 field3575 = class181.method1318("<)4col> x", (byte) -127);

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Lhj;")
    public static class69 field3570 = class181.method1318("scrollbar", (byte) -119);

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Lhj;")
    public static class69 field3579 = class181.method1318("::rebuild", (byte) -113);

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "[I")
    public int[] field3564;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[I")
    private int[] field3572;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "[Lhj;")
    private class69[] field3571;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "[[I")
    private int[][] field3565;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lfh;B)Lhj;")
    public final class69 method1430(class128 arg0, byte arg1) {
        field3581++;
        class69 var3 = class103.method758(80, true);
        if (this.field3572 != null) {
            for (int var4 = 0; var4 < this.field3572.length; var4++) {
                var3.method462(8914, this.field3571[var4]);
                var3.method462(8914, class157.method1184(this.field3572[var4], arg0.method915((byte) -112, class91.field1725[this.field3572[var4]]), (byte) -100, this.field3565[var4]));
            }
        }
        var3.method462(8914, this.field3571[this.field3571.length - 1]);
        return arg1 == 35 ? var3.method448(1) : null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)I")
    public final int method1431(int arg0) {
        if (arg0 != -29251) {
            this.method1433(9, (class128) null, true);
        }
        field3574++;
        return this.field3572 == null ? 0 : this.field3572.length;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
    public final int method1432(int arg0, int arg1, int arg2) {
        field3568++;
        if (arg0 != -1) {
            this.field3564 = null;
        }
        if (this.field3572 == null || arg1 < 0 || arg1 > this.field3572.length) {
            return -1;
        } else if (this.field3565[arg1] == null || arg2 < 0 || this.field3565[arg1].length < arg2) {
            return -1;
        } else {
            return this.field3565[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILfh;Z)V")
    private final void method1433(int arg0, class128 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field3571 = arg1.method963(!arg2).method491(60, 1);
        } else if (arg0 == 2) {
            int var8 = arg1.method937(!arg2);
            this.field3564 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3564[var9] = arg1.method912(48);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method937(false);
            this.field3565 = new int[var4][];
            this.field3572 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method912(-82);
                this.field3572[var5] = var6;
                this.field3565[var5] = new int[class76.field1493[var6]];
                for (int var7 = 0; var7 < class76.field1493[var6]; var7++) {
                    this.field3565[var5][var7] = arg1.method912(-108);
                }
            }
        }
        field3561++;
        if (!arg2) {
            this.field3571 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Lpi;")
    public static final class135 method1434(int arg0) {
        if (arg0 != 0) {
            field3566 = false;
        }
        field3577++;
        class135 var1 = (class135) class224.field4075.method1639(true);
        if (var1 != null) {
            var1.method632(-8296);
            var1.method24(true);
            return var1;
        }
        class135 var2;
        do {
            var2 = (class135) class39.field550.method1639(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method1009(98) > class223.method1584(-25392)) {
                return null;
            }
            var2.method632(arg0 - 8296);
            var2.method24(true);
        } while ((var2.field44 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILfh;[I)V")
    public final void method1435(int arg0, class128 arg1, int[] arg2) {
        field3576++;
        if (this.field3572 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 22 % ((34 - arg0) / 44);
        while (this.field3572.length > var4) {
            if (arg2.length <= var4) {
                return;
            }
            int var6 = class70.field1382[this.method1438(1, var4)];
            if (var6 > 0) {
                arg1.method932(var6, (long) arg2[var4], (byte) 31);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLfh;)V")
    public final void method1436(boolean arg0, class128 arg1) {
        while (true) {
            int var3 = arg1.method937(!arg0);
            if (var3 == 0) {
                field3563++;
                if (!arg0) {
                    this.method1430((class128) null, (byte) -119);
                    return;
                }
                return;
            }
            this.method1433(var3, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3570 = null;
        if (arg0 != 7489) {
            method1437(-40);
        }
        field3575 = null;
        field3579 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
    public final int method1438(int arg0, int arg1) {
        field3580++;
        if (arg0 != 1) {
            field3570 = null;
        }
        return this.field3572 == null || arg1 < 0 || arg1 > this.field3572.length ? -1 : this.field3572[arg1];
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)Lhj;")
    public final class69 method1439(int arg0) {
        field3562++;
        class69 var2 = class103.method758(80, true);
        if (this.field3571 == null) {
            return class243.field4468;
        }
        var2.method462(8914, this.field3571[0]);
        if (arg0 != -25779) {
            field3575 = null;
        }
        for (int var3 = 1; var3 < this.field3571.length; var3++) {
            var2.method462(8914, class12.field114);
            var2.method462(8914, this.field3571[var3]);
        }
        return var2.method448(arg0 + 25780);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
    public static final void method1440(int arg0, int arg1) {
        class135 var2 = class8.method38((byte) 109, arg0, arg1);
        var2.method1012((byte) -112);
        field3569++;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public final void method1441(byte arg0) {
        field3578++;
        if (arg0 != 105) {
            this.method1431(-55);
        }
        if (this.field3564 != null) {
            for (int var2 = 0; var2 < this.field3564.length; var2++) {
                this.field3564[var2] = class230.method1644(this.field3564[var2], 32768);
            }
        }
    }
}
