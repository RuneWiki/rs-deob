import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class66 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field974 = new int[250];

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[I")
    public static int[] field987 = new int[5];

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "[Z")
    public static boolean[] field990 = new boolean[200];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lqe;")
    public static class275 field986;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 4)
    public static final Class method507(int arg0, String arg1) throws ClassNotFoundException {
        field984++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != 0) {
                method511((byte) 44);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILkh;)Lbp;", line = 45)
    public static final class217 method508(int arg0, class11 arg1) {
        if (arg0 != -1) {
            field986 = null;
        }
        field981++;
        return new class217(arg1.method207(7124), arg1.method207(7124), arg1.method207(arg0 + 7125), arg1.method207(7124), arg1.method208(27308), arg1.method208(27308), arg1.method172((byte) 52));
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZZ)V", line = 59)
    public static final void method509(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class200.field2772 = arg1;
        class264.field3687 = arg2;
        class305.field4213 = arg3;
        class276.field3836 = new class125[arg0][class200.field2772][class264.field3687];
        class418.field5939 = new class242[arg0];
        if (arg4) {
            class311.field4255 = new class125[1][class200.field2772][class264.field3687];
            class126.field1782 = new int[class200.field2772][class264.field3687];
            class214.field2979 = new class242[1];
        } else {
            class311.field4255 = null;
            class126.field1782 = null;
            class214.field2979 = null;
        }
        if (arg5) {
            class54.field754 = new int[arg0][arg1][arg2];
            class14.field280 = new class404[255];
            class54.field745 = new boolean[255];
            class231.field3344 = 0;
        } else {
            class54.field754 = null;
            class14.field280 = null;
            class54.field745 = null;
            class231.field3344 = 0;
        }
        class445.method2777(false);
        class362.field5029 = new class59[500];
        class269.field3749 = 0;
        class131.field1865 = new class59[500];
        class146.field2081 = 0;
        class14.field279 = new int[arg0][class200.field2772 + 1][class264.field3687 + 1];
        class21.field384 = new class447[5000];
        class52.field730 = 0;
        class194.field2654 = new boolean[class305.field4213 + class305.field4213 + 1][class305.field4213 + class305.field4213 + 1];
        class34.field528 = new boolean[class305.field4213 + class305.field4213 + 2][class305.field4213 + class305.field4213 + 2];
        class326.field4453 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field978++;
        int var6 = arg0;
        if (arg2 != 11091) {
            field987 = null;
        }
        while (arg0 + arg1 > var6) {
            for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && var9 < class211.field2954 && var6 >= 0 && class290.field4061 > var6) {
                    class57.field783[arg3][var9][var6] = arg3 <= 0 ? 0 : class57.field783[arg3 - 1][var9][var6] - 240;
                }
            }
            var6++;
        }
        if (arg4 > 0 && class211.field2954 > arg4) {
            for (int var7 = arg0 + 1; var7 < (arg0 + arg1); var7++) {
                if (var7 >= 0 && class290.field4061 > var7) {
                    class57.field783[arg3][arg4][var7] = class57.field783[arg3][arg4 - 1][var7];
                }
            }
        }
        if (arg0 > 0 && class290.field4061 > arg0) {
            for (int var8 = arg4 + 1; var8 < (arg4 + arg5); var8++) {
                if (var8 >= 0 && var8 < class211.field2954) {
                    class57.field783[arg3][var8][arg0] = class57.field783[arg3][var8][arg0 - 1];
                }
            }
        }
        if (arg4 < 0 || arg0 < 0 || class211.field2954 <= arg4 || arg0 >= class290.field4061) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 > 0 && class57.field783[arg3][arg4 - 1][arg0] != 0) {
                class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4 - 1][arg0];
                return;
            }
            if (arg0 <= 0 || class57.field783[arg3][arg4][arg0 - 1] == 0) {
                if (arg4 > 0 && arg0 > 0 && class57.field783[arg3][arg4 - 1][arg0 - 1] != 0) {
                    class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4][arg0 - 1];
        } else if (arg4 <= 0 || class57.field783[arg3 - 1][arg4 - 1][arg0] == class57.field783[arg3][arg4 - 1][arg0]) {
            if (arg0 > 0 && class57.field783[arg3 - 1][arg4][arg0 - 1] != class57.field783[arg3][arg4][arg0 - 1]) {
                class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && class57.field783[arg3][arg4 - 1][arg0 - 1] != class57.field783[arg3 - 1][arg4 - 1][arg0 - 1]) {
                class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4 - 1][arg0 - 1];
                return;
            }
        } else {
            class57.field783[arg3][arg4][arg0] = class57.field783[arg3][arg4 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 208)
    public static final void method511(byte arg0) {
        if (arg0 >= -27) {
            method509(124, -51, -16, 104, false, true);
        }
        field989++;
        class131 var1 = class304.field4200;
        synchronized (class304.field4200) {
            class304.field4200.method905((byte) 111);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 221)
    public static final int method512(byte arg0, String arg1) {
        field977++;
        return arg0 == 118 ? class205.method1332(10, arg1, (byte) -10, true) : -81;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 237)
    public static final boolean method513(int arg0, String arg1) {
        field983++;
        if (arg0 != 10) {
            field990 = null;
        }
        return class370.method2375(true, 10, arg1, 97);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILjava/lang/String;BIJLjava/lang/String;)V", line = 249)
    public static final void method514(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5, long arg6, String arg7) {
        field976++;
        if (class271.field3762 || class90.field1260 >= 500) {
            return;
        }
        int var9 = arg5 == -1 ? class267.field3695 : arg5;
        class87 var10 = new class87(arg7, arg3, var9, arg2, arg6, arg1, arg0);
        class121.field1699.method643(var10, -123);
        if (arg4 != -16) {
            field987 = null;
        }
        class90.field1260++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V", line = 282)
    public static void method515(byte arg0) {
        field987 = null;
        if (arg0 != -92) {
            method511((byte) 69);
        }
        field990 = null;
        field974 = null;
        field986 = null;
    }
}
