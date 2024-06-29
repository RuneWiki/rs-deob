import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class51 extends class72 {

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "[I")
    private int[] field1133 = new int[6];

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
    private int[] field1139 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "[I")
    private int[] field1132 = new int[6];

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Z")
    public boolean field1136 = false;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[[[I")
    public static int[][][] field1137 = new int[4][13][13];

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "Lae;")
    private static class6 field1147 = class64.method474(112, "Prepared sound engine");

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lae;")
    public static class6 field1130 = field1147;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lbd;")
    public static class12 field1148 = new class12(64);

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lae;")
    private static class6 field1149 = class64.method474(113, "New User");

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lae;")
    public static class6 field1152 = field1149;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lae;")
    private static class6 field1150 = class64.method474(104, " has logged in)3");

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "Lae;")
    public static class6 field1156 = field1150;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "Lbd;")
    public static class12 field1154 = new class12(30);

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lae;")
    public static class6 field1158 = class64.method474(119, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
    public static int field1160 = 1;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "Lae;")
    public static class6 field1157 = class64.method474(113, "weiss:");

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "Lae;")
    public static class6 field1161 = class64.method474(124, "Fps:");

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
    public static int field1162 = 7759444;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "[B")
    public static byte[] field1155;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "[I")
    private int[] field1140;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Lv;", line = 6)
    public final class131 method404(int arg0) {
        field1134++;
        class131[] var2 = new class131[5];
        if (arg0 != -1) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1139[var4] != -1) {
                var2[var3++] = class131.method1061(class96.field2278, this.field1139[var4], 0);
            }
        }
        class131 var5 = new class131(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1132[var6] != 0; var6++) {
            var5.method1083(this.field1132[var6], this.field1133[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Z", line = 48)
    public final boolean method405(int arg0) {
        field1138++;
        if (this.field1140 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1140.length; var3++) {
            if (!class96.field2278.method150(0, this.field1140[var3], (byte) 98)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V", line = 87)
    public static void method406(boolean arg0) {
        field1147 = null;
        field1154 = null;
        field1156 = null;
        field1137 = null;
        field1157 = null;
        field1161 = null;
        field1148 = null;
        field1130 = null;
        field1150 = null;
        field1152 = null;
        if (!arg0) {
            field1149 = null;
            field1155 = null;
            field1158 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)Lae;", line = 110)
    public static final class6 method407(int arg0, int arg1, boolean arg2) {
        int var3 = arg0 - arg1;
        field1146++;
        if (var3 < -9) {
            return class96.field2274;
        } else if (var3 < -6) {
            return class92.field2195;
        } else if (var3 < -3) {
            return class49.field1103;
        } else if (var3 < 0) {
            return class27.field680;
        } else if (var3 > 9) {
            return class70.field1575;
        } else {
            if (arg2) {
                method407(-47, 8, false);
            }
            if (var3 > 6) {
                return class41.field944;
            } else if (var3 > 3) {
                return class73.field1676;
            } else if (var3 > 0) {
                return class5.field53;
            } else {
                return class30.field728;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)Lv;", line = 162)
    public final class131 method408(int arg0) {
        field1131++;
        if (this.field1140 == null) {
            return null;
        }
        class131[] var2 = new class131[this.field1140.length];
        if (arg0 <= 89) {
            this.method404(-38);
        }
        for (int var3 = 0; var3 < this.field1140.length; var3++) {
            var2[var3] = class131.method1061(class96.field2278, this.field1140[var3], 0);
        }
        class131 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class131(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1132[var5] != 0; var5++) {
            var4.method1083(this.field1132[var5], this.field1133[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z", line = 234)
    public final boolean method409(byte arg0) {
        field1145++;
        if (arg0 != -21) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1139[var3] != -1 && !class96.field2278.method150(0, this.field1139[var3], (byte) 45)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLm;)V", line = 258)
    public final void method410(byte arg0, class77 arg1) {
        while (true) {
            int var3 = arg1.method620((byte) -8);
            if (var3 == 0) {
                field1135++;
                if (arg0 != -9) {
                    field1137 = null;
                    return;
                }
                return;
            }
            this.method411(arg0 ^ 0x2930, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILm;)V", line = 279)
    private final void method411(int arg0, int arg1, class77 arg2) {
        if (arg1 == 1) {
            this.field1141 = arg2.method620((byte) -8);
        } else if (arg1 == 2) {
            int var4 = arg2.method620((byte) -8);
            this.field1140 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1140[var5] = arg2.method636(arg0 + 10677);
            }
        } else if (arg1 == 3) {
            this.field1136 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field1132[arg1 - 40] = arg2.method636(arg0 + 10648);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field1133[arg1 - 50] = arg2.method636(-26);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1139[arg1 - 60] = arg2.method636(arg0 + 10675);
        }
        if (arg0 != -10553) {
            this.method409((byte) 15);
        }
        field1153++;
    }
}
