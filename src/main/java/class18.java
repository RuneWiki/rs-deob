import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class18 extends class137 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Ltl;")
    public static class59 field232 = class85.method639(":clan:", 9588);

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "Ltl;")
    public static class59 field234 = class85.method639("weiss:", 9588);

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lpd;")
    public static class253 field236 = new class253(5000);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lme;")
    public static class295 field241;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "[I")
    public int[] field243;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[Ltl;")
    private class59[] field229;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "[[I")
    private int[][] field240;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILs;)Ltl;", line = 13)
    public final class59 method110(int arg0, class170 arg1) {
        field224++;
        if (arg0 != -5377) {
            this.method120(30);
        }
        class59 var3 = class90.method670(0, 80);
        if (this.field242 != null) {
            for (int var4 = 0; var4 < this.field242.length; var4++) {
                var3.method462(this.field229[var4], -60);
                var3.method462(class67.method550(this.field242[var4], this.field240[var4], (byte) -109, arg1.method1224(255, class295.field5031[this.field242[var4]])), 122);
            }
        }
        var3.method462(this.field229[this.field229.length - 1], 121);
        return var3.method490(arg0 ^ 0xFFFFEAFF);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLs;)V", line = 52)
    public final void method111(byte arg0, class170 arg1) {
        while (true) {
            int var3 = arg1.method1221(85);
            if (var3 == 0) {
                field230++;
                if (arg0 <= 4) {
                    field241 = (class295) null;
                }
                return;
            }
            this.method119(arg1, var3, -35);
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V", line = 73)
    public static final void method112(int arg0) {
        if (arg0 != -9603) {
            return;
        }
        for (int var1 = -1; var1 < class29.field385; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class243.field4060[var1];
            }
            class102 var3 = class211.field3438[var2];
            if (var3 != null && var3.field1784 > 0) {
                var3.field1784--;
                if (var3.field1784 == 0) {
                    var3.field1762 = null;
                }
            }
        }
        field228++;
        for (int var4 = 0; var4 < class185.field3107; var4++) {
            int var5 = class232.field3816[var4];
            class23 var6 = class23.field311[var5];
            if (var6 != null && var6.field1784 > 0) {
                var6.field1784--;
                if (var6.field1784 == 0) {
                    var6.field1762 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([IILs;)V", line = 129)
    public final void method113(int[] arg0, int arg1, class170 arg2) {
        field235++;
        if (this.field242 == null) {
            return;
        }
        for (int var4 = arg1; this.field242.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class22.field291[this.method116(var4, -1)];
            if (var5 > 0) {
                arg2.method1199((long) arg0[var4], var5, false);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 165)
    public static final int method114(int arg0, int arg1) {
        field237++;
        return arg0 == arg1 ? -1 : class145.method1052(16416, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 177)
    public static void method115(byte arg0) {
        field232 = null;
        field236 = null;
        field234 = null;
        field241 = null;
        if (arg0 < 90) {
            field234 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I", line = 190)
    public final int method116(int arg0, int arg1) {
        field233++;
        if (arg1 != -1) {
            this.method110(4, (class170) null);
        }
        return this.field242 == null || arg0 < 0 || this.field242.length < arg0 ? -1 : this.field242[arg0];
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V", line = 209)
    public final void method117(int arg0) {
        int var2 = 45 % ((-arg0 - 50) / 41);
        if (this.field243 != null) {
            for (int var3 = 0; var3 < this.field243.length; var3++) {
                this.field243[var3] = class239.method1677(this.field243[var3], 32768);
            }
        }
        field239++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I", line = 231)
    public final int method118(int arg0, int arg1, int arg2) {
        field226++;
        if (this.field242 == null || arg0 < 0 || arg0 > this.field242.length) {
            return -1;
        } else {
            if (arg2 != 60) {
                this.method110(-33, (class170) null);
            }
            return this.field240[arg0] == null || arg1 < 0 || this.field240[arg0].length < arg1 ? -1 : this.field240[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ls;II)V", line = 251)
    private final void method119(class170 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field229 = arg0.method1250(false).method494(60, false);
        } else if (arg1 == 2) {
            int var4 = arg0.method1221(87);
            this.field243 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field243[var5] = arg0.method1214(-18254);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1221(92);
            this.field242 = new int[var6];
            this.field240 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1214(-18254);
                this.field242[var7] = var8;
                this.field240[var7] = new int[class119.field1966[var8]];
                for (int var9 = 0; var9 < class119.field1966[var8]; var9++) {
                    this.field240[var7][var9] = arg0.method1214(-18254);
                }
            }
        }
        field244++;
        if (arg2 > -13) {
            this.field240 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)I", line = 312)
    public final int method120(int arg0) {
        if (arg0 == 2043) {
            field238++;
            return this.field242 == null ? 0 : this.field242.length;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)Ltl;", line = 330)
    public final class59 method121(int arg0) {
        if (arg0 != -2325) {
            this.field242 = (int[]) null;
        }
        field231++;
        class59 var2 = class90.method670(0, 80);
        if (this.field229 == null) {
            return class11.field153;
        }
        var2.method462(this.field229[0], 127);
        for (int var3 = 1; var3 < this.field229.length; var3++) {
            var2.method462(class81.field1282, -52);
            var2.method462(this.field229[var3], 124);
        }
        return var2.method490(0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 358)
    public static final byte[] method122(boolean arg0, Object arg1, boolean arg2) {
        if (arg2) {
            field236 = (class253) null;
        }
        field223++;
        if (arg1 == null) {
            return null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg0 ? class97.method742((byte) -125, var4) : var4;
        } else if (arg1 instanceof class238) {
            class238 var3 = (class238) arg1;
            return var3.method671((byte) 89);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
