import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class64 extends class179 {

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private int field1111 = 8;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    private int field1123 = 81;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    private int field1117 = 1024;

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "I")
    private int field1133 = 1024;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    private int field1116 = 409;

    @OriginalMember(owner = "client!jh", name = "sb", descriptor = "I")
    private int field1139 = 4;

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "I")
    private int field1136 = 204;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    private int field1127 = 0;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lke;")
    public static class256 field1120 = class316.method2202(" <col=00ff80>", 27626);

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "Lke;")
    private static class256 field1129 = class316.method2202("rating: ", 27626);

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "Lke;")
    public static class256 field1124 = field1129;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "Lke;")
    private static class256 field1131 = class316.method2202("Choose Option", 27626);

    @OriginalMember(owner = "client!jh", name = "tb", descriptor = "Lke;")
    public static class256 field1140 = class316.method2202(")2", 27626);

    @OriginalMember(owner = "client!jh", name = "vb", descriptor = "Lke;")
    public static class256 field1142 = field1131;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jh", name = "ub", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!jh", name = "wb", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!jh", name = "xb", descriptor = "Z")
    public static boolean field1144;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "[I")
    private int[] field1114;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "[[I")
    private int[][] field1115;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "[[I")
    private int[][] field1132;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 4)
    public final void method418(byte arg0) {
        if (arg0 != -110) {
            method497(-51, (class256) null, 33);
        }
        this.method493(76);
        field1125++;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 300)
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "(I)V", line = 36)
    private final void method493(int arg0) {
        field1126++;
        Random var2 = new Random((long) this.field1111);
        this.field1115 = new int[this.field1111][this.field1139];
        this.field1114 = new int[this.field1111 + 1];
        this.field1132 = new int[this.field1111][this.field1139 + 1];
        this.field1119 = 4096 / this.field1111;
        this.field1114[0] = 0;
        int var3 = this.field1119 / 2;
        if (arg0 < 68) {
            this.method41(121, -28);
        }
        this.field1112 = 4096 / this.field1139;
        int var4 = this.field1112 / 2;
        this.field1143 = this.field1123 / 2;
        for (int var5 = 0; var5 < this.field1111; var5++) {
            if (var5 > 0) {
                int var6 = this.field1119;
                int var7 = (method494(4096, 0, var2) - 2048) * this.field1136 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1114[var5] = this.field1114[var5 - 1] + var8;
            }
            this.field1132[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1139; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1112;
                    int var11 = (method494(4096, 0, var2) - 2048) * this.field1116 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1132[var5][var9] = this.field1132[var5][var9 - 1] + var12;
                }
                this.field1115[var5][var9] = this.field1117 <= 0 ? 4096 : 4096 - method494(this.field1117, 0, var2);
            }
            this.field1132[var5][this.field1139] = 4096;
        }
        this.field1114[this.field1111] = 4096;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILjava/util/Random;)I", line = 99)
    public static final int method494(int arg0, int arg1, Random arg2) {
        field1138++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class267.method1857(arg1 + arg1, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class196.method1421(var4, arg0, 123);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V", line = 131)
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1122++;
        if (arg2 != 4096) {
            field1131 = (class256) null;
        }
        if (arg4 - arg5 >= class244.field4161 && (arg4 + arg5) <= class175.field3106 && (arg1 - arg5) >= class105.field1887 && arg1 + arg5 <= class274.field4748) {
            class237.method1591(arg4, arg1, false, arg5, arg3, arg6, arg0);
        } else {
            class192.method1392(119, arg5, arg3, arg6, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 149)
    public static void method496(byte arg0) {
        field1140 = null;
        field1129 = null;
        field1124 = null;
        field1131 = null;
        field1120 = null;
        if (arg0 <= 78) {
            method500((class188) null, (byte) 70);
        }
        field1142 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILke;I)V", line = 179)
    public static final void method497(int arg0, class256 arg1, int arg2) {
        field1130++;
        class77 var3 = class156.method1158(arg2, false, arg0);
        var3.method584(22992);
        var3.field1462 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I", line = 195)
    public final int[] method41(int arg0, int arg1) {
        field1141++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(-47, arg0);
        if (this.field3157.field3081) {
            int var4 = 0;
            int var5;
            for (var5 = class292.field5049[arg0] + this.field1127; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field1111 && var5 >= this.field1114[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field1114[var4];
            int var9 = this.field1114[var4 - 1];
            if (var5 > this.field1143 + var9 && var5 < var8 - this.field1143) {
                for (int var10 = 0; var10 < class161.field2858; var10++) {
                    int var11 = var7 ? this.field1133 : -this.field1133;
                    int var12;
                    for (var12 = (this.field1112 * var11 >> 12) + class290.field5017[var10]; var12 < 0; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; var13 < this.field1139 && this.field1132[var6][var13] <= var12; var13++) {
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field1132[var6][var13];
                    int var16 = this.field1132[var6][var14];
                    if (var12 > (var16 + this.field1143) && var12 < var15 - this.field1143) {
                        var3[var10] = this.field1115[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class299.method2088(var3, 0, class161.field2858, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(ILke;I)V", line = 312)
    public static final void method498(int arg0, class256 arg1, int arg2) {
        field1113++;
        class77 var3 = class156.method1158(3, false, arg0);
        var3.method584(arg2 ^ 0xFFFFA62A);
        if (arg2 == -6) {
            var3.field1462 = arg1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V", line = 326)
    public static final void method499(byte arg0) {
        class308.field5322.method1599(61, (byte) -99);
        if (arg0 >= -98) {
            field1142 = (class256) null;
        }
        for (class316 var1 = (class316) class62.field1098.method1743(true); var1 != null; var1 = (class316) class62.field1098.method1742((byte) 58)) {
            if (var1.field5456 == 0) {
                class287.method2006(var1, true, 30656);
            }
        }
        if (class278.field4815 != null) {
            method500(class278.field4815, (byte) -117);
            class278.field4815 = null;
        }
        field1137++;
        class73.field1339++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lla;B)V", line = 355)
    public static final void method500(class188 arg0, byte arg1) {
        if (arg1 == -117) {
            field1121++;
            if (class216.field3853 == arg0.field3312) {
                class53.field974[arg0.field3462] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILra;I)V", line = 380)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field1134++;
        if (arg0 <= 108) {
            method494(37, 9, (Random) null);
        }
        if (arg2 == 0) {
            this.field1139 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field1111 = arg1.method357(false);
        } else if (arg2 == 2) {
            this.field1116 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field1136 = arg1.method346(-16);
        } else if (arg2 == 4) {
            this.field1133 = arg1.method346(-16);
        } else if (arg2 == 5) {
            this.field1127 = arg1.method346(-16);
        } else if (arg2 == 6) {
            this.field1123 = arg1.method346(-16);
        } else if (arg2 == 7) {
            this.field1117 = arg1.method346(-16);
        }
    }
}
