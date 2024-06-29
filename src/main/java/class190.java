import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class190 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field3060 = 2;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field3059 = 5;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field3074 = -1;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
    private boolean field3073 = false;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field3072 = -1;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public int field3093 = -1;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Z")
    public boolean field3078 = false;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field3083 = 99;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public int field3095 = -1;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public int field3082 = -1;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Luf;")
    public static class168 field3069 = class148.method1019(-1720, "<col=c0ff00>");

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Luf;")
    public static class168 field3076 = class148.method1019(-1720, " weitere Optionen");

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3085 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Luf;")
    public static class168 field3068 = class148.method1019(-1720, "<col=ffffff>");

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[Lkg;")
    public static class22[] field3065 = new class22[32768];

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[Z")
    public static boolean[] field3071 = new boolean[112];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
    public int[] field3063;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[I")
    public int[] field3075;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "[I")
    private int[] field3080;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "[I")
    private int[] field3094;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "[[I")
    public int[][] field3091;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfc;III)Lfc;", line = 6)
    public final class152 method1336(class152 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3063[arg1];
        class102 var6 = class15.method59(10294, var5 >> 16);
        if (arg2 >= -70) {
            this.method1350((class153) null, -93, -89);
        }
        int var7 = var5 & 0xFFFF;
        field3088++;
        if (var6 == null) {
            return arg0.method699(true, true);
        }
        int var8 = arg3 & 0x3;
        class152 var9 = arg0.method699(!var6.method766(var7, 186), !this.field3073);
        if (var8 == 1) {
            var9.method691();
        } else if (var8 == 2) {
            var9.method658();
        } else if (var8 == 3) {
            var9.method663();
        }
        var9.method662(var6, var7, this.field3073);
        if (var8 == 1) {
            var9.method663();
        } else if (var8 == 2) {
            var9.method658();
        } else if (var8 == 3) {
            var9.method691();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfc;BI)Lfc;", line = 51)
    public final class152 method1337(class152 arg0, byte arg1, int arg2) {
        int var4 = this.field3063[arg2];
        field3058++;
        if (arg1 != 69) {
            return (class152) null;
        }
        class102 var5 = class15.method59(arg1 + 10225, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method699(true, true);
        } else {
            class152 var7 = arg0.method699(!var5.method766(var6, 186), !this.field3073);
            var7.method662(var5, var6, this.field3073);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 72)
    public static final void method1338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 9143) {
            method1349((byte) -36, (class168) null);
        }
        if (class60.field785 == 1) {
            class135.field2113[class264.field4467 / 100].method151(class296.field5010 - 8, class288.field4854 + -8);
        }
        field3089++;
        if (class60.field785 == 2) {
            class135.field2113[class264.field4467 / 100 + 4].method151(class296.field5010 - 8, class288.field4854 + -8);
        }
        class86.method591(arg3 - 9015);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfc;II)Lfc;", line = 102)
    public final class152 method1339(class152 arg0, int arg1, int arg2) {
        field3077++;
        int var4 = this.field3063[arg1];
        class102 var5 = class15.method59(10294, var4 >> 16);
        if (arg2 != 1978883312) {
            return (class152) null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method699(true, true);
        }
        int var7 = 0;
        class102 var8 = null;
        if (this.field3094 != null && this.field3094.length > arg1) {
            int var9 = this.field3094[arg1];
            var8 = class15.method59(10294, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class152 var11 = arg0.method699(!var5.method766(var6, 186), !this.field3073);
            var11.method662(var5, var6, this.field3073);
            return var11;
        } else {
            class152 var10 = arg0.method699(!var5.method766(var6, arg2 - 1978883126) & !var8.method766(var7, 186), !this.field3073);
            var10.method662(var5, var6, this.field3073);
            var10.method662(var8, var7, this.field3073);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILg;I)Luf;", line = 148)
    public static final class168 method1340(int arg0, class242 arg1, int arg2) {
        field3066++;
        if (arg0 != -11697) {
            return (class168) null;
        } else if (!class136.method947(arg2, (byte) -105, client.method2015(arg1)) && arg1.field4102 == null) {
            return null;
        } else if (arg1.field4061 == null || arg1.field4061.length <= arg2 || arg1.field4061[arg2] == null || arg1.field4061[arg2].method1195(false).method1167(false) == 0) {
            return class245.field4165 ? class134.method938((byte) -126, new class168[] { class110.field1729, class169.method1228(arg2, 0) }) : null;
        } else {
            return arg1.field4061[arg2];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 176)
    public static final void method1341(int arg0) {
        class58.field761.method1429((byte) 120);
        if (arg0 != 3) {
            method1342(-4, -23);
        }
        field3079++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 193)
    public static final void method1342(int arg0, int arg1) {
        class254.field4349 = arg0;
        class157.method1115(arg1, (byte) -59);
        field3081++;
        class157.method1115(4, (byte) -59);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 219)
    public final void method1343(byte arg0) {
        if (arg0 != 121) {
            this.field3091 = (int[][]) ((int[][]) null);
        }
        if (this.field3072 == -1) {
            if (this.field3080 == null) {
                this.field3072 = 0;
            } else {
                this.field3072 = 2;
            }
        }
        field3087++;
        if (this.field3095 != -1) {
            return;
        }
        if (this.field3080 == null) {
            this.field3095 = 0;
        } else {
            this.field3095 = 2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Luf;", line = 252)
    public static final class168 method1344(int arg0) {
        if (arg0 != -2917) {
            return (class168) null;
        }
        class168 var1 = class20.field243;
        if (class217.field3542 != 0) {
            var1 = class56.field734;
        }
        field3084++;
        return class134.method938((byte) -124, new class168[] { class206.field3386, var1, class293.field4962, class169.method1228(class164.field2634, 0), class149.field2298, class169.method1228(class26.field329, 0), class197.field3258 });
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfc;ILug;IB)Lfc;", line = 273)
    public final class152 method1345(class152 arg0, int arg1, class190 arg2, int arg3, byte arg4) {
        field3064++;
        int var6 = this.field3063[arg3];
        if (arg4 >= -23) {
            return (class152) null;
        }
        class102 var7 = class15.method59(10294, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1337(arg0, (byte) 69, arg1);
        }
        int var9 = arg2.field3063[arg1];
        class102 var10 = class15.method59(10294, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class152 var13 = arg0.method699(!var7.method766(var8, 186), !this.field3073);
            var13.method662(var7, var8, this.field3073);
            return var13;
        } else {
            class152 var12 = arg0.method699(!var7.method766(var8, 186) & !var10.method766(var11, 186), !this.field3073 & !arg2.field3073);
            var12.method680(var7, var8, var10, var11, this.field3080, this.field3073 | arg2.field3073);
            return var12;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 306)
    public static void method1346(boolean arg0) {
        if (!arg0) {
            method1351(1, -50, 41);
        }
        field3076 = null;
        field3069 = null;
        field3065 = null;
        field3068 = null;
        field3071 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILfc;Z)Lfc;", line = 326)
    public final class152 method1347(int arg0, class152 arg1, boolean arg2) {
        int var4 = this.field3063[arg0];
        class102 var5 = class15.method59(10294, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field3070++;
        if (!arg2) {
            return (class152) null;
        } else if (var5 == null) {
            return arg1.method671(true, true);
        } else {
            class152 var7 = arg1.method671(!var5.method766(var6, 186), !this.field3073);
            var7.method662(var5, var6, this.field3073);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILj;)V", line = 364)
    public final void method1348(int arg0, class153 arg1) {
        while (true) {
            int var3 = arg1.method1042((byte) -20);
            if (var3 == 0) {
                if (arg0 < 102) {
                    return;
                }
                field3067++;
                return;
            }
            this.method1350(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLuf;)Z", line = 382)
    public static final boolean method1349(byte arg0, class168 arg1) {
        field3092++;
        if (arg0 >= -57) {
            field3061 = -13;
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class149.field2302; var2++) {
            if (arg1.method1194(class87.field1341[var2], -26023)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lj;II)V", line = 433)
    private final void method1350(class153 arg0, int arg1, int arg2) {
        field3062++;
        if (arg1 == arg2) {
            int var4 = arg0.method1069(arg1 ^ 0x6E);
            this.field3075 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3075[var5] = arg0.method1069(45);
            }
            this.field3063 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3063[var6] = arg0.method1069(113);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3063[var7] += arg0.method1069(75) << 16;
            }
        } else if (arg2 == 2) {
            this.field3074 = arg0.method1069(30);
        } else if (arg2 == 3) {
            int var15 = arg0.method1042((byte) 113);
            this.field3080 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3080[var16] = arg0.method1042((byte) 89);
            }
            this.field3080[var15] = 9999999;
        } else if (arg2 == 4) {
            this.field3078 = true;
        } else if (arg2 == 5) {
            this.field3059 = arg0.method1042((byte) 115);
        } else if (arg2 == 6) {
            this.field3093 = arg0.method1069(105);
        } else if (arg2 == 7) {
            this.field3082 = arg0.method1069(121);
        } else if (arg2 == 8) {
            this.field3083 = arg0.method1042((byte) -126);
        } else if (arg2 == 9) {
            this.field3095 = arg0.method1042((byte) 92);
        } else if (arg2 == 10) {
            this.field3072 = arg0.method1042((byte) -120);
        } else if (arg2 == 11) {
            this.field3060 = arg0.method1042((byte) 104);
        } else if (arg2 == 12) {
            int var8 = arg0.method1042((byte) -90);
            this.field3094 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3094[var9] = arg0.method1069(93);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3094[var10] += arg0.method1069(67) << 16;
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method1069(57);
            this.field3091 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1042((byte) 120);
                if (var13 > 0) {
                    this.field3091[var12] = new int[var13];
                    this.field3091[var12][0] = arg0.method1088(class289.method1988(arg1, -30918));
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3091[var12][var14] = arg0.method1069(class289.method1988(arg1, 28));
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3073 = true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I", line = 581)
    public static final int method1351(int arg0, int arg1, int arg2) {
        if (arg0 <= 55) {
            field3076 = (class168) null;
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        field3086++;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }
}
