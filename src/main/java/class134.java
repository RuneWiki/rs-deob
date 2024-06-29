import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class134 extends class72 {

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    private int field3276 = 0;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    private int field3282 = 128;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    private int field3281 = 0;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "[I")
    private int[] field3286 = new int[6];

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public int field3275 = -1;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    private int field3277 = 0;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "[I")
    private int[] field3290 = new int[6];

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    private int field3289 = 128;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "Lae;")
    public static class6 field3264 = class64.method474(109, " (X");

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lae;")
    public static class6 field3274 = class64.method474(111, "backvmid1");

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "Lae;")
    public static class6 field3271 = class64.method474(126, "::errortest");

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "Lae;")
    public static class6 field3283 = class64.method474(109, "(U");

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lae;")
    public static class6 field3278 = class64.method474(121, "Weiter");

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lae;")
    public static class6 field3280 = class64.method474(121, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "Lae;")
    public static class6 field3284 = class64.method474(119, "Benutzen");

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "Lae;")
    public static class6 field3288 = class64.method474(127, "::clientdrop");

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    private int field3270;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "Lsd;")
    public static class114 field3279;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1096(byte arg0) {
        class73 var1 = class136.field3309;
        synchronized (class136.field3309) {
            int var2 = 16 % ((arg0 + 56) / 38);
            class54.field1198 = class32.field785;
            class117.field2771 = class41.field947;
            class57.field1244 = class18.field360;
            class89.field2140 = class37.field847;
            class52.field1170 = class73.field1673;
            class116.field2728 = class70.field1576;
            class126.field3078 = class5.field69;
            class37.field847 = 0;
        }
        field3285++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lm;II)V", line = 64)
    private final void method1097(class77 arg0, int arg1, int arg2) {
        field3272++;
        if (arg1 == 1) {
            this.field3270 = arg0.method636(96);
        } else if (arg1 == 2) {
            this.field3275 = arg0.method636(105);
        } else if (arg1 == 4) {
            this.field3282 = arg0.method636(121);
        } else if (arg1 == 5) {
            this.field3289 = arg0.method636(111);
        } else if (arg1 == 6) {
            this.field3277 = arg0.method636(119);
        } else if (arg1 == 7) {
            this.field3276 = arg0.method620((byte) -8);
        } else if (arg1 == 8) {
            this.field3281 = arg0.method620((byte) -8);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field3290[arg1 - 40] = arg0.method636(3);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field3286[arg1 - 50] = arg0.method636(-15);
        }
        int var4 = 43 / ((arg2 + 61) / 47);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lv;", line = 113)
    public final class131 method1098(int arg0, int arg1) {
        field3268++;
        class131 var3 = (class131) class118.field2794.method128((byte) -29, (long) this.field3287);
        if (var3 == null) {
            var3 = class131.method1061(class50.field1118, this.field3270, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field3290[0] != 0) {
                    var3.method1083(this.field3290[var4], this.field3286[var4]);
                }
            }
            var3.method1073();
            var3.method1068(this.field3276 + 64, this.field3281 + 850, -30, -50, -30, true);
            class118.field2794.method130(var3, (long) this.field3287, (byte) -119);
        }
        if (arg0 != 180) {
            return null;
        }
        class131 var5;
        if (this.field3275 == -1 || arg1 == -1) {
            var5 = var3.method1067(true);
        } else {
            var5 = class35.method314(this.field3275, (byte) 54).method728(var3, arg1, arg0 ^ 0xFFFFFF3B);
        }
        if (this.field3282 != 128 || this.field3289 != 128) {
            var5.method1079(this.field3282, this.field3289, this.field3282);
        }
        if (this.field3277 != 0) {
            if (this.field3277 == 90) {
                var5.method1075();
            }
            if (this.field3277 == 180) {
                var5.method1075();
                var5.method1075();
            }
            if (this.field3277 == 270) {
                var5.method1075();
                var5.method1075();
                var5.method1075();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILm;)V", line = 189)
    public final void method1099(int arg0, class77 arg1) {
        if (arg0 != 180) {
            field3284 = null;
        }
        field3291++;
        while (true) {
            int var3 = arg1.method620((byte) -8);
            if (var3 == 0) {
                return;
            }
            this.method1097(arg1, var3, 86);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)V", line = 243)
    public static void method1100(boolean arg0) {
        field3288 = null;
        field3278 = null;
        field3271 = null;
        field3284 = null;
        field3280 = null;
        field3264 = null;
        field3283 = null;
        field3274 = null;
        if (!arg0) {
            field3269 = -93;
        }
        field3279 = null;
    }
}
