import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class230 extends class212 {

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Lqe;")
    public static class168 field3912 = class66.method448("Clientscript error in: ", -111);

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field3908 = -1;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "Lqe;")
    public static class168 field3919 = class66.method448("http:)4)4", 48);

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Lqe;")
    public static class168 field3904 = class66.method448("Lade)3)3)3", -127);

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "[I")
    public static int[] field3921 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "[Z")
    public static boolean[] field3910 = new boolean[100];

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "Lqe;")
    public static class168 field3917 = class66.method448("Fps:", -127);

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "[I")
    private int[] field3920;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "[I")
    public int[] field3925;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "[Lqe;")
    private class168[] field3911;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "[[I")
    private int[][] field3909;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLnh;)Lqe;")
    public final class168 method1481(byte arg0, class112 arg1) {
        class168 var3 = class168.method1105(17283, 80);
        if (this.field3920 != null) {
            for (int var4 = 0; var4 < this.field3920.length; var4++) {
                var3.method1090(this.field3911[var4], 40);
                var3.method1090(class90.method595(this.field3909[var4], (byte) 83, arg1.method737(255, class209.field3629[this.field3920[var4]]), this.field3920[var4]), 40);
            }
        }
        field3926++;
        if (arg0 >= -87) {
            return null;
        } else {
            var3.method1090(this.field3911[this.field3911.length - 1], 40);
            return var3.method1070(-14668);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BLnh;)V")
    public final void method1482(byte arg0, class112 arg1) {
        if (arg0 != -82) {
            this.method1487(16);
        }
        field3918++;
        while (true) {
            int var3 = arg1.method758(true);
            if (var3 == 0) {
                return;
            }
            this.method1486(var3, (byte) -18, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Lqe;")
    public final class168 method1483(int arg0) {
        field3903++;
        class168 var2 = class168.method1105(arg0 + 16515, 80);
        if (this.field3911 == null) {
            return class257.field4494;
        }
        var2.method1090(this.field3911[0], arg0 - 728);
        if (arg0 != 768) {
            this.method1490(-126, 67, -112);
        }
        for (int var3 = 1; var3 < this.field3911.length; var3++) {
            var2.method1090(class192.field3349, 40);
            var2.method1090(this.field3911[var3], 40);
        }
        return var2.method1070(arg0 - 15436);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILgg;Lkb;ILhh;IBI)V")
    public static final void method1484(int arg0, class222 arg1, class70 arg2, int arg3, class121 arg4, int arg5, byte arg6, int arg7) {
        field3906++;
        class185 var8 = new class185();
        var8.field3257 = arg0 * 128;
        var8.field3254 = arg5 * 128;
        var8.field3247 = arg3;
        if (arg2 != null) {
            var8.field3244 = arg2;
            var8.field3267 = arg2.field1057 * 128;
            var8.field3253 = arg2.field1014;
            var8.field3264 = arg2.field1061;
            var8.field3256 = arg2.field1021;
            var8.field3263 = arg2.field1058;
            int var10 = arg2.field1048;
            int var11 = arg2.field1059;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg2.field1048;
                var10 = arg2.field1059;
            }
            var8.field3248 = (arg0 + var11) * 128;
            var8.field3268 = (arg5 + var10) * 128;
            if (arg2.field1069 != null) {
                var8.field3258 = true;
                var8.method1210(-93);
            }
            if (var8.field3253 != null) {
                var8.field3259 = (int) (Math.random() * (double) (var8.field3264 - var8.field3263)) + var8.field3263;
            }
            class165.field2811.method311((byte) 16, var8);
        } else if (arg1 != null) {
            var8.field3246 = arg1;
            class180 var9 = arg1.field3814;
            if (var9.field3206 != null) {
                var8.field3258 = true;
                var9 = var9.method1192(-1);
            }
            if (var9 != null) {
                var8.field3268 = (var9.field3189 + arg5) * 128;
                var8.field3248 = (arg0 + var9.field3189) * 128;
                var8.field3256 = class100.method657(4768, arg1);
                var8.field3267 = var9.field3208 * 128;
            }
            class185.field3252.method311((byte) 16, var8);
        } else if (arg4 != null) {
            var8.field3265 = arg4;
            var8.field3248 = (arg4.field171 + arg0) * 128;
            var8.field3268 = (arg4.field171 + arg5) * 128;
            var8.field3256 = class192.method1244(arg4, -1);
            var8.field3267 = arg4.field1996 * 128;
            class85.field1303.method1533(arg4.field2000.method1084(32383), 75, var8);
        }
        if (arg6 <= 43) {
            field3919 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
    public final int method1485(byte arg0, int arg1) {
        field3924++;
        if (arg0 <= 57) {
            return 78;
        } else if (this.field3920 == null || arg1 < 0 || arg1 > this.field3920.length) {
            return -1;
        } else {
            return this.field3920[arg1];
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLnh;)V")
    private final void method1486(int arg0, byte arg1, class112 arg2) {
        field3913++;
        if (arg0 == 1) {
            this.field3911 = arg2.method751((byte) -70).method1091(-59, 60);
        } else if (arg0 == 2) {
            int var8 = arg2.method758(true);
            this.field3925 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3925[var9] = arg2.method731(false);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method758(true);
            this.field3909 = new int[var4][];
            this.field3920 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method731(false);
                this.field3920[var5] = var6;
                this.field3909[var5] = new int[class190.field3312[var6]];
                for (int var7 = 0; var7 < class190.field3312[var6]; var7++) {
                    this.field3909[var5][var7] = arg2.method731(false);
                }
            }
        }
        if (arg1 != -18) {
            field3917 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    public final void method1487(int arg0) {
        if (arg0 != 11560) {
            this.method1485((byte) -38, -59);
        }
        if (this.field3925 != null) {
            for (int var2 = 0; var2 < this.field3925.length; var2++) {
                this.field3925[var2] = class102.method675(this.field3925[var2], 32768);
            }
        }
        field3905++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static void method1488(byte arg0) {
        field3917 = null;
        field3904 = null;
        if (arg0 >= -22) {
            field3907 = 72;
        }
        field3921 = null;
        field3919 = null;
        field3910 = null;
        field3912 = null;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    public static final void method1489(int arg0) {
        field3914++;
        if (arg0 != 128) {
            field3912 = null;
        }
        if (class182.field3239 > 0) {
            class52.method364(1);
        } else {
            class84.method555(5, 40);
            class185.field3273 = class169.field2953;
            class169.field2953 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I")
    public final int method1490(int arg0, int arg1, int arg2) {
        if (arg2 >= -2) {
            method1489(-73);
        }
        field3922++;
        if (this.field3920 == null || arg0 < 0 || this.field3920.length < arg0) {
            return -1;
        } else if (this.field3909[arg0] == null || arg1 < 0 || arg1 > this.field3909[arg0].length) {
            return -1;
        } else {
            return this.field3909[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(I)I")
    public final int method1491(int arg0) {
        field3915++;
        if (this.field3920 == null) {
            return 0;
        } else if (arg0 == 128) {
            return this.field3920.length;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lnh;[II)V")
    public final void method1492(class112 arg0, int[] arg1, int arg2) {
        field3927++;
        if (arg2 != 128 || this.field3920 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field3920.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class139.field2457[this.method1485((byte) 107, var4)];
            if (var5 > 0) {
                arg0.method722((long) arg1[var4], var5, (byte) 99);
            }
        }
    }
}
