import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class220 extends class15 {

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "Z")
    public boolean field3706 = true;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "[Z")
    public static boolean[] field3698 = new boolean[100];

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "[Lce;")
    public static class126[] field3701 = new class126[1000];

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "[I")
    public static int[] field3705 = new int[1000];

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "Lce;")
    public static class126 field3712 = class206.method1445(-7923, "0");

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "Lcc;")
    public static class313 field3709;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "[I")
    private int[] field3695;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "[I")
    public int[] field3703;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "[Lce;")
    private class126[] field3700;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "[[I")
    private int[][] field3708;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[ILbb;)V", line = 24)
    public final void method1504(int arg0, int[] arg1, class134 arg2) {
        field3704++;
        if (this.field3695 == null) {
            return;
        }
        int var4 = -117 / ((arg0 - 13) / 41);
        for (int var5 = 0; this.field3695.length > var5 && arg1.length > var5; var5++) {
            int var6 = class260.field4371[this.method1510(var5, false)];
            if (var6 > 0) {
                arg2.method981(var6, 107, (long) arg1[var5]);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)I", line = 50)
    public final int method1505(boolean arg0) {
        field3710++;
        if (!arg0) {
            this.field3708 = (int[][]) ((int[][]) null);
        }
        return this.field3695 == null ? 0 : this.field3695.length;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V", line = 66)
    public static void method1506(byte arg0) {
        field3712 = null;
        field3709 = null;
        field3698 = null;
        int var1 = 2 % ((-arg0 - 19) / 36);
        field3701 = null;
        field3705 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lbb;II)V", line = 80)
    private final void method1507(class134 arg0, int arg1, int arg2) {
        field3693++;
        if (arg1 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field3700 = arg0.method970(arg1 ^ 0x1).method856(60, arg1 ^ 0xFFFFFFA3);
        } else if (arg2 == 2) {
            int var8 = arg0.method948(-128);
            this.field3703 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3703[var9] = arg0.method942(true);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method948(-123);
            this.field3695 = new int[var4];
            this.field3708 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method942(true);
                this.field3695[var5] = var6;
                this.field3708[var5] = new int[class54.field825[var6]];
                for (int var7 = 0; var7 < class54.field825[var6]; var7++) {
                    this.field3708[var5][var7] = arg0.method942(true);
                }
            }
        } else if (arg2 == 4) {
            this.field3706 = false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILbb;)V", line = 164)
    public final void method1508(int arg0, class134 arg1) {
        while (true) {
            int var3 = arg1.method948(-124);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field3696++;
                return;
            }
            this.method1507(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)I", line = 183)
    public final int method1509(int arg0, int arg1, int arg2) {
        field3711++;
        if (this.field3695 == null || arg0 < 0 || arg0 > this.field3695.length) {
            return -1;
        } else {
            int var4 = -58 % ((-arg2 - 79) / 38);
            return this.field3708[arg0] == null || arg1 < 0 || arg1 > this.field3708[arg0].length ? -1 : this.field3708[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)I", line = 203)
    public final int method1510(int arg0, boolean arg1) {
        field3699++;
        if (arg1) {
            return -101;
        } else if (this.field3695 == null || arg0 < 0 || arg0 > this.field3695.length) {
            return -1;
        } else {
            return this.field3695[arg0];
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Lce;", line = 219)
    public final class126 method1511(int arg0) {
        field3707++;
        class126 var2 = class161.method1191(80, (byte) -118);
        if (this.field3700 == null) {
            return class206.field3531;
        }
        var2.method835(this.field3700[arg0], (byte) -10);
        for (int var3 = 1; var3 < this.field3700.length; var3++) {
            var2.method835(class105.field1658, (byte) -10);
            var2.method835(this.field3700[var3], (byte) -10);
        }
        return var2.method850(false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lbb;I)Lce;", line = 245)
    public final class126 method1512(class134 arg0, int arg1) {
        class126 var3 = class161.method1191(80, (byte) 93);
        field3694++;
        if (this.field3695 != null) {
            for (int var4 = 0; var4 < this.field3695.length; var4++) {
                var3.method835(this.field3700[var4], (byte) -10);
                var3.method835(class206.method1446(this.field3695[var4], 1, arg0.method922(class158.field2853[this.field3695[var4]], 383172192), this.field3708[var4]), (byte) -10);
            }
        }
        if (arg1 != 21622) {
            this.method1504(40, (int[]) null, (class134) null);
        }
        var3.method835(this.field3700[this.field3700.length - 1], (byte) -10);
        return var3.method850(false);
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 287)
    public final void method1513(int arg0) {
        if (arg0 >= -85) {
            return;
        }
        if (this.field3703 != null) {
            for (int var2 = 0; var2 < this.field3703.length; var2++) {
                this.field3703[var2] = class221.method1516(this.field3703[var2], 32768);
            }
        }
        field3697++;
    }
}
