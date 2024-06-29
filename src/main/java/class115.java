import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class115 extends class24 {

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "Z")
    public boolean field2699 = false;

    @OriginalMember(owner = "client!sc", name = "sb", descriptor = "I")
    private int field2703 = 0;

    @OriginalMember(owner = "client!sc", name = "Jb", descriptor = "I")
    private int field2720 = 0;

    @OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
    private int field2704;

    @OriginalMember(owner = "client!sc", name = "yb", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!sc", name = "Ab", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!sc", name = "Ib", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!sc", name = "Kb", descriptor = "Ls;")
    private class112 field2721;

    @OriginalMember(owner = "client!sc", name = "zb", descriptor = "Lkc;")
    private static class67 field2710 = class19.method144("Please wait )2 attempting to reestablish", 103);

    @OriginalMember(owner = "client!sc", name = "ub", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!sc", name = "Fb", descriptor = "I")
    public static int field2716 = -1;

    @OriginalMember(owner = "client!sc", name = "Hb", descriptor = "Lkc;")
    public static class67 field2718 = class19.method144("@cr1@", 94);

    @OriginalMember(owner = "client!sc", name = "Eb", descriptor = "[Lje;")
    public static class63[] field2715 = new class63[256];

    @OriginalMember(owner = "client!sc", name = "Mb", descriptor = "Lkc;")
    public static class67 field2723 = field2710;

    @OriginalMember(owner = "client!sc", name = "Gb", descriptor = "I")
    public static volatile int field2717 = 0;

    @OriginalMember(owner = "client!sc", name = "wb", descriptor = "Lkc;")
    private static class67 field2707 = class19.method144("Choose Option", 100);

    @OriginalMember(owner = "client!sc", name = "Lb", descriptor = "Lkc;")
    public static class67 field2722 = field2707;

    @OriginalMember(owner = "client!sc", name = "Nb", descriptor = "Lkc;")
    public static class67 field2724 = class19.method144("Verbindung mit Update)2Server)3)3)3", 107);

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!sc", name = "vb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!sc", name = "xb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!sc", name = "Bb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!sc", name = "Db", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILhd;I)V", line = 14)
    public static final void method919(int arg0, class50 arg1, int arg2) {
        if (arg1.field1260 < 128 || arg1.field1190 < 128 || arg1.field1260 >= 13184 || arg1.field1190 >= 13184) {
            arg1.field1210 = 0;
            arg1.field1216 = -1;
            arg1.field1240 = 0;
            arg1.field1260 = arg1.field1198[0] * 128 + arg1.field1208 * 64;
            arg1.field1194 = -1;
            arg1.field1190 = arg1.field1263[0] * 128 + arg1.field1208 * 64;
            arg1.method419(true);
        }
        if (arg2 <= 42) {
            method921(-88);
        }
        field2708++;
        if (class69.field1640 == arg1 && (arg1.field1260 < 1536 || arg1.field1190 < 1536 || arg1.field1260 >= 11776 || arg1.field1190 >= 11776)) {
            arg1.field1190 = arg1.field1263[0] * 128 + arg1.field1208 * 64;
            arg1.field1194 = -1;
            arg1.field1240 = 0;
            arg1.field1260 = arg1.field1198[0] * 128 + arg1.field1208 * 64;
            arg1.field1216 = -1;
            arg1.field1210 = 0;
            arg1.method419(true);
        }
        if (arg1.field1210 > class135.field3243) {
            class112.method843(arg1, true);
        } else if (class135.field3243 > arg1.field1240) {
            class74.method606(true, arg1);
        } else {
            class34.method290(arg1, (byte) -116);
        }
        class21.method158(arg1, (byte) -89);
        class82.method645(-119, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V", line = 65)
    public static void method920(byte arg0) {
        field2710 = null;
        field2715 = null;
        field2707 = null;
        int var1 = -35 % ((34 - arg0) / 45);
        field2722 = null;
        field2718 = null;
        field2724 = null;
        field2723 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lfd;", line = 80)
    public final class39 method190(byte arg0) {
        field2706++;
        if (arg0 != -93) {
            this.method922(-120, (byte) 95);
        }
        class81 var2 = class119.method942(this.field2704, (byte) 67);
        class39 var3;
        if (this.field2699) {
            var3 = var2.method638(-1, -30);
        } else {
            var3 = var2.method638(this.field2703, -30);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIII)V", line = 233)
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2704 = arg0;
        this.field2709 = arg3;
        this.field2713 = arg1;
        this.field2700 = arg5 + arg6;
        this.field2711 = arg4;
        this.field2719 = arg2;
        int var8 = class119.method942(this.field2704, (byte) 79).field1928;
        if (var8 == -1) {
            this.field2699 = true;
        } else {
            this.field2699 = false;
            this.field2721 = class70.method576(12, var8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)V", line = 110)
    public static final void method921(int arg0) {
        field2702++;
        int var1 = class94.field2155;
        int var2 = class114.field2681;
        int var3 = class76.field1815;
        int var4 = field2701;
        int var5 = 6116423;
        class68.method569(var3, var1, var2, var4, var5);
        class68.method569(var3 - arg0, var1 + 1, var2 - 2, 16, 0);
        class68.method561(var3 + 1, var1 - -18, var2 - 2, var4 + -19, 0);
        class117.field2789.method229(field2722, var3 + 3, var1 - -14, var5);
        int var6 = class80.field1889;
        int var7 = class138.field3298;
        if (class31.field663 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class31.field663 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class31.field663 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class55.field1323; var8++) {
            int var9 = var1 + (class55.field1323 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var7 > var3 && var2 + var3 > var7 && var6 > var9 - 13 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class117.field2789.method248(class109.field2471[var8], var3 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V", line = 200)
    public final void method922(int arg0, byte arg1) {
        field2712++;
        if (this.field2699 || arg1 < 125) {
            return;
        }
        this.field2720 += arg0;
        while (this.field2720 > this.field2721.field2584[this.field2703]) {
            this.field2720 -= this.field2721.field2584[this.field2703];
            this.field2703++;
            if (this.field2721.field2570.length <= this.field2703) {
                this.field2699 = true;
                return;
            }
        }
    }
}
