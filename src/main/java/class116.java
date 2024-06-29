import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class118 {

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public int field3027 = -1;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public int field3047 = 99;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public int field3041 = -1;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public int field3028 = 2;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
    public int field3054 = -1;

    @OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
    public int field3059 = -1;

    @OriginalMember(owner = "client!qe", name = "vb", descriptor = "Z")
    public boolean field3061 = false;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public int field3051 = -1;

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "I")
    public int field3056 = 5;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lfc;")
    public static class39 field3042 = class90.method774("Der Anmelde)2Server ist offline)3", -119);

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "Z")
    public static boolean field3055 = false;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lfc;")
    public static class39 field3048 = class90.method774("Lade Benutzeroberfl-=che )2 ", -98);

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lfc;")
    private static class39 field3053 = class90.method774("Trade)4compete", -128);

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "Lfc;")
    public static class39 field3031 = field3053;

    @OriginalMember(owner = "client!qe", name = "xb", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lp;")
    public static class104 field3034 = new class104(64);

    @OriginalMember(owner = "client!qe", name = "Ab", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!qe", name = "yb", descriptor = "Lfc;")
    public static class39 field3064 = class90.method774("titlebox", -104);

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!qe", name = "sb", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!qe", name = "ub", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!qe", name = "zb", descriptor = "Llf;")
    public static class82 field3065;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "[I")
    public int[] field3035;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "[I")
    private int[] field3044;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "[I")
    private int[] field3046;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "[I")
    public int[] field3052;

    @OriginalMember(owner = "client!qe", name = "rb", descriptor = "[I")
    public int[] field3057;

    @OriginalMember(owner = "client!qe", name = "wb", descriptor = "[I")
    public static int[] field3062;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V", line = 5)
    public final void method1004(byte arg0) {
        field3060++;
        if (arg0 < 71) {
            this.method1011(55, null, -70);
        }
        if (this.field3059 == -1) {
            if (this.field3046 == null) {
                this.field3059 = 0;
            } else {
                this.field3059 = 2;
            }
        }
        if (this.field3051 != -1) {
            return;
        }
        if (this.field3046 == null) {
            this.field3051 = 0;
        } else {
            this.field3051 = 2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V", line = 36)
    public static final void method1005(byte arg0) {
        class88.field2056.method927(false);
        field3049++;
        if (arg0 != -102) {
            method1016(5L, 11);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 49)
    public static final Class method1006(String arg0, int arg1) throws ClassNotFoundException {
        field3038++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg1 < 43) {
            return null;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lda;Lqe;III)Lda;", line = 91)
    public final class23 method1007(class23 arg0, class116 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3057[arg4];
        class60 var7 = class17.method206(var6 >> 16, (byte) 83);
        field3032++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1010(arg3, 492911504, arg0);
        }
        int var9 = arg1.field3057[arg3];
        class60 var10 = class17.method206(var9 >> 16, (byte) 83);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class23 var12 = arg0.method275(!var7.method599(32, var8));
            var12.method257(var7, var8);
            return var12;
        }
        if (arg2 >= -15) {
            this.field3052 = null;
        }
        class23 var13 = arg0.method275(!var7.method599(32, var8) & !var10.method599(32, var11));
        var13.method254(var7, var8, var10, var11, this.field3046);
        return var13;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 151)
    public static void method1008(boolean arg0) {
        field3064 = null;
        field3048 = null;
        field3065 = null;
        field3062 = null;
        field3031 = null;
        field3034 = null;
        field3042 = null;
        field3053 = null;
        if (arg0) {
            field3053 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLdc;)V", line = 172)
    private final void method1009(int arg0, byte arg1, class25 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method301(-4853);
            this.field3035 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3035[var5] = arg2.method301(-4853);
            }
            this.field3057 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3057[var6] = arg2.method301(-4853);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3057[var7] += arg2.method301(-4853) << 16;
            }
        } else if (arg0 == 2) {
            this.field3041 = arg2.method301(-4853);
        } else if (arg0 == 3) {
            int var8 = arg2.method322((byte) -50);
            this.field3046 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3046[var9] = arg2.method322((byte) -50);
            }
            this.field3046[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field3061 = true;
        } else if (arg0 == 5) {
            this.field3056 = arg2.method322((byte) -50);
        } else if (arg0 == 6) {
            this.field3054 = arg2.method301(-4853);
        } else if (arg0 == 7) {
            this.field3027 = arg2.method301(-4853);
        } else if (arg0 == 8) {
            this.field3047 = arg2.method322((byte) -50);
        } else if (arg0 == 9) {
            this.field3051 = arg2.method322((byte) -50);
        } else if (arg0 == 10) {
            this.field3059 = arg2.method322((byte) -50);
        } else if (arg0 == 11) {
            this.field3028 = arg2.method322((byte) -50);
        } else if (arg0 == 12) {
            int var10 = arg2.method322((byte) -50);
            this.field3044 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3044[var11] = arg2.method301(-4853);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3044[var12] = (arg2.method301(-4853) << 16) + this.field3044[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method322((byte) -50);
            this.field3052 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3052[var14] = arg2.method310(true);
            }
        }
        field3036++;
        if (arg1 >= -97) {
            this.field3044 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILda;)Lda;", line = 303)
    public final class23 method1010(int arg0, int arg1, class23 arg2) {
        if (arg1 != 492911504) {
            return null;
        }
        int var4 = this.field3057[arg0];
        field3050++;
        class60 var5 = class17.method206(var4 >> 16, (byte) 83);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method275(true);
        } else {
            class23 var7 = arg2.method275(!var5.method599(32, var6));
            var7.method257(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILda;I)Lda;", line = 331)
    public final class23 method1011(int arg0, class23 arg1, int arg2) {
        field3039++;
        int var4 = this.field3057[arg2];
        class60 var5 = class17.method206(var4 >> 16, (byte) 83);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method275(true);
        }
        class60 var7 = null;
        int var8 = 0;
        if (this.field3044 != null && this.field3044.length > arg2) {
            int var9 = this.field3044[arg2];
            var7 = class17.method206(var9 >> 16, (byte) 83);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class23 var11 = arg1.method275(!var5.method599(32, var6));
            var11.method257(var5, var6);
            return var11;
        }
        class23 var10 = arg1.method275(!var5.method599(32, var6) & !var7.method599(32, var8));
        var10.method257(var5, var6);
        var10.method257(var7, var8);
        if (arg0 < 15) {
            this.field3059 = 84;
        }
        return var10;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V", line = 394)
    public static final void method1012(int arg0, byte arg1) {
        field3030++;
        if (arg1 >= 58) {
            class68.method642(true, arg0);
            class53.method558(arg0, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldc;B)V", line = 418)
    public final void method1013(class25 arg0, byte arg1) {
        field3040++;
        if (arg1 < 84) {
            return;
        }
        while (true) {
            int var3 = arg0.method322((byte) -50);
            if (var3 == 0) {
                return;
            }
            this.method1009(var3, (byte) -104, arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBILda;)Lda;", line = 453)
    public final class23 method1014(int arg0, byte arg1, int arg2, class23 arg3) {
        int var5 = this.field3057[arg2];
        field3058++;
        if (arg1 != -53) {
            this.field3057 = null;
        }
        class60 var6 = class17.method206(var5 >> 16, (byte) 83);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method275(true);
        }
        int var8 = arg0 & 0x3;
        class23 var9 = arg3.method275(!var6.method599(32, var7));
        if (var8 == 1) {
            var9.method259();
        } else if (var8 == 2) {
            var9.method274();
        } else if (var8 == 3) {
            var9.method260();
        }
        var9.method257(var6, var7);
        if (var8 == 1) {
            var9.method260();
        } else if (var8 == 2) {
            var9.method274();
        } else if (var8 == 3) {
            var9.method259();
        }
        return var9;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLda;)Lda;", line = 498)
    public final class23 method1015(int arg0, byte arg1, class23 arg2) {
        int var4 = this.field3057[arg0];
        field3043++;
        class60 var5 = class17.method206(var4 >> 16, (byte) 83);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method256(true);
        }
        if (arg1 > -6) {
            this.method1010(98, 65, null);
        }
        class23 var7 = arg2.method256(!var5.method599(32, var6));
        var7.method257(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(JI)V", line = 539)
    public static final void method1016(long arg0, int arg1) {
        field3033++;
        if (arg0 == 0L) {
            return;
        }
        if (class92.field2165 >= 100 && class127.field3213 != 1 || class92.field2165 >= 200) {
            class28.method346(0, (byte) 117, class2.field49, class107.field2693);
            return;
        }
        class39 var3 = class27.method345((byte) -54, arg0).method447(-98);
        for (int var4 = 0; var4 < class92.field2165; var4++) {
            if (class153.field3766[var4] == arg0) {
                class28.method346(0, (byte) 89, class137.method1111(new class39[] { var3, class147.field3670 }, (byte) -105), class107.field2693);
                return;
            }
        }
        for (int var5 = 0; var5 < class57.field1414; var5++) {
            if (class79.field1795[var5] == arg0) {
                class28.method346(0, (byte) 119, class137.method1111(new class39[] { class108.field2730, var3, class44.field1194 }, (byte) 105), class107.field2693);
                return;
            }
        }
        if (var3.method462(-119, class94.field2197.field3575)) {
            return;
        }
        class107.field2697++;
        class139.field3482[class92.field2165] = var3;
        class153.field3766[class92.field2165] = arg0;
        class55.field1390[class92.field2165] = 0;
        if (arg1 != -1) {
            return;
        }
        class3.field70[class92.field2165] = 0;
        class104.field2638 = true;
        class72.field1687 = class70.field1654 + 1;
        class92.field2165++;
        class79.field1794.method393((byte) -14, 149);
        class79.field1794.method290(arg0, (byte) -43);
    }
}
