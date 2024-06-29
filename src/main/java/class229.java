import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class229 extends class285 {

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Lve;")
    public static class255 field3786 = class87.method607(96, "<)4col>");

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3793 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Z")
    public static boolean field3788 = true;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Lve;")
    public static class255 field3797 = class87.method607(109, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "[I")
    public int[] field3794;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[I")
    private int[] field3796;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[Lve;")
    private class255[] field3792;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "[[I")
    private int[][] field3790;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[[I")
    public static int[][] field3799;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLdd;ZLdd;ZII)I", line = 4)
    public static final int method1584(byte arg0, class238 arg1, boolean arg2, class238 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != -10) {
            method1586((class273[]) null, (class273[]) null, (class273[]) null, (class273[]) null, (byte) 120, (class88) null, (class83[]) null);
        }
        field3785++;
        int var7 = class181.method1273(arg6, 73, arg3, arg1, arg2);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class181.method1273(arg5, arg0 ^ 0xFFFFFFA5, arg3, arg1, arg4);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)I", line = 36)
    public final int method1585(int arg0) {
        field3791++;
        if (this.field3796 == null) {
            return 0;
        } else {
            if (arg0 >= -34) {
                this.field3790 = (int[][]) ((int[][]) null);
            }
            return this.field3796.length;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Ldm;[Ldm;[Ldm;[Ldm;BLrg;[Lpc;)V", line = 51)
    public static final void method1586(class273[] arg0, class273[] arg1, class273[] arg2, class273[] arg3, byte arg4, class88 arg5, class83[] arg6) {
        class132.field2206 = arg2;
        int var7 = 81 % ((24 - arg4) / 47);
        class129.field2126 = arg3;
        class167.field2813 = arg6;
        class20.field335 = arg1;
        class17.field247 = arg5;
        field3789++;
        class149.field2525 = arg0;
        class284.field4884.method1474(true);
        int var8 = class17.field247.method619(class96.field1652, 20053);
        int[] var9 = class17.field247.method613(0, var8);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class284.field4884.method1472(true, class32.method184(new class70(class17.field247.method636(var8, (byte) 68, var9[var10])), (byte) -68));
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 84)
    public static void method1587(byte arg0) {
        if (arg0 >= 18) {
            field3786 = null;
            field3797 = null;
            field3799 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I", line = 101)
    public final int method1588(int arg0, int arg1) {
        field3781++;
        if (this.field3796 == null || arg1 < 0 || this.field3796.length < arg1) {
            return -1;
        } else {
            if (arg0 > -10) {
                this.field3796 = (int[]) null;
            }
            return this.field3796[arg1];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 117)
    public final int method1589(int arg0, int arg1, int arg2) {
        field3787++;
        if (arg1 != 0) {
            this.field3792 = (class255[]) null;
        }
        if (this.field3796 == null || arg2 < 0 || this.field3796.length < arg2) {
            return -1;
        } else if (this.field3790[arg2] == null || arg0 < 0 || arg0 > this.field3790[arg2].length) {
            return -1;
        } else {
            return this.field3790[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Lve;", line = 143)
    public final class255 method1590(int arg0) {
        class255 var2 = class285.method2025(80, (byte) -38);
        field3798++;
        if (this.field3792 == null) {
            return class236.field3935;
        }
        var2.method1765(this.field3792[arg0], arg0 ^ 0x37);
        for (int var3 = 1; var3 < this.field3792.length; var3++) {
            var2.method1765(class222.field3743, arg0 ^ 0x37);
            var2.method1765(this.field3792[var3], 55);
        }
        return var2.method1778(true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpb;[II)V", line = 169)
    public final void method1591(class70 arg0, int[] arg1, int arg2) {
        field3782++;
        if (this.field3796 == null) {
            return;
        }
        int var4 = 76 / ((58 - arg2) / 58);
        for (int var5 = 0; this.field3796.length > var5 && arg1.length > var5; var5++) {
            int var6 = class187.field3016[this.method1588(-35, var5)];
            if (var6 > 0) {
                arg0.method429((long) arg1[var5], var6, 8);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V", line = 202)
    public static final void method1592(int arg0, int arg1) {
        field3784++;
        if (arg0 == arg1 || !class225.method1570((byte) -96, arg1)) {
            return;
        }
        class197[] var2 = class297.field5087[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class197 var4 = var2[var3];
            if (var4.field3316 != null) {
                class26 var5 = new class26();
                var5.field424 = var4;
                var5.field414 = var4.field3316;
                class247.method1701(arg0 ^ 0x6A, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BILpb;)V", line = 238)
    private final void method1593(byte arg0, int arg1, class70 arg2) {
        field3783++;
        if (arg1 == 1) {
            this.field3792 = arg2.method479(-1).method1760((byte) 122, 60);
        } else if (arg1 == 2) {
            int var8 = arg2.method481(0);
            this.field3794 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3794[var9] = arg2.method423(255);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method481(0);
            this.field3790 = new int[var4][];
            this.field3796 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method423(255);
                this.field3796[var5] = var6;
                this.field3790[var5] = new int[class82.field1328[var6]];
                for (int var7 = 0; var7 < class82.field1328[var6]; var7++) {
                    this.field3790[var5][var7] = arg2.method423(255);
                }
            }
        }
        if (arg0 <= 21) {
            this.method1595((class70) null, -30);
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V", line = 301)
    public final void method1594(int arg0) {
        field3800++;
        if (arg0 != 0) {
            method1587((byte) 108);
        }
        if (this.field3794 != null) {
            for (int var2 = 0; var2 < this.field3794.length; var2++) {
                this.field3794[var2] = class264.method1836(this.field3794[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpb;I)Lve;", line = 341)
    public final class255 method1595(class70 arg0, int arg1) {
        field3801++;
        class255 var3 = class285.method2025(80, (byte) -109);
        if (this.field3796 != null) {
            for (int var4 = 0; var4 < this.field3796.length; var4++) {
                var3.method1765(this.field3792[var4], 55);
                var3.method1765(class231.method1602(~arg1, arg0.method422(class222.field3738[this.field3796[var4]], (byte) 125), this.field3790[var4], this.field3796[var4]), 55);
            }
        }
        var3.method1765(this.field3792[this.field3792.length + arg1], arg1 + 56);
        return var3.method1778(true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpb;Z)V", line = 369)
    public final void method1596(class70 arg0, boolean arg1) {
        if (!arg1) {
            field3797 = (class255) null;
        }
        field3795++;
        while (true) {
            int var3 = arg0.method481(0);
            if (var3 == 0) {
                return;
            }
            this.method1593((byte) 34, var3, arg0);
        }
    }
}
