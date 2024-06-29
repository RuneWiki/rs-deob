import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class279 extends class665 {

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
    public boolean field4212;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Z")
    public boolean field4214;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Ljava/lang/String;")
    public String field4210;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Ljava/lang/String;")
    public String field4207;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "J")
    public long field4208;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4215 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "Lnea;")
    public static class664 field4211 = new class664(57, 0);

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "[I")
    public static int[] field4216;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)I", line = 10)
    public static final int method1818(int arg0, byte arg1) {
        if (arg1 > -10) {
            return 57;
        } else {
            field4209++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 21)
    public static void method1819(int arg0) {
        if (arg0 == 4) {
            field4216 = null;
            field4215 = null;
            field4211 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lr;Ltca;I)I", line = 45)
    public static final int method1820(class166 arg0, class156 arg1, int arg2) {
        field4222++;
        if (arg1.field2248 != arg2) {
            return arg1.field2248;
        }
        if (arg1.field2244 != -1) {
            class159 var3 = arg0.field2384.method1386(arg1.field2244, arg2 ^ 0x1971);
            if (!var3.field2305) {
                return var3.field2283;
            }
        }
        return arg1.field2241;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 68)
    public class279(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4218 = arg7;
        this.field4212 = arg9;
        this.field4214 = arg8;
        this.field4210 = arg0;
        this.field4207 = arg1;
        this.field4220 = arg2;
        this.field4213 = arg3;
        this.field4221 = arg4;
        this.field4219 = arg6;
        this.field4208 = arg5;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 89)
    public static final void method1821(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class682.field9618 = arg0;
        class179.field2550 = arg1;
        class520.field7337 = class179.field2550 > 1 && class682.field9618.method109();
        class310.field4593 = arg2;
        class437.field6392 = 0x1 << class310.field4593;
        class683.field9623 = class437.field6392 >> 1;
        Math.sqrt((double) (class683.field9623 * class683.field9623 + class683.field9623 * class683.field9623));
        class41.field685 = arg3;
        class302.field4492 = arg4;
        class8.field82 = arg5;
        class196.field2802 = arg6;
        class568.field7988 = class88.method762(-114);
        class230.method1586((byte) 126);
        class448.field6480 = new class40[arg3][class302.field4492][class8.field82];
        class420.field6108 = new class37[arg3];
        if (arg7) {
            class161.field2313 = new int[class302.field4492][class8.field82];
            class252.field3889 = new byte[class302.field4492][class8.field82];
            class386.field5441 = new short[class302.field4492][class8.field82];
            class634.field8979 = new class40[1][class302.field4492][class8.field82];
            class499.field7071 = new class37[1];
        } else {
            class161.field2313 = null;
            class252.field3889 = null;
            class386.field5441 = null;
            class634.field8979 = null;
            class499.field7071 = null;
        }
        if (arg8) {
            class477.field6789 = new long[arg3][arg4][arg5];
            class580.field8172 = new class506[65535];
            class60.field1141 = new boolean[65535];
            class258.field3938 = 0;
        } else {
            class477.field6789 = null;
            class580.field8172 = null;
            class60.field1141 = null;
            class258.field3938 = 0;
        }
        class668.method3700(false);
        class496.field7034 = new class215[2][];
        class496.field7034[0] = new class215[class70.field1250[0]];
        class496.field7034[1] = new class215[class70.field1250[1]];
        class313.field4626 = new int[2];
        class232.field3618 = new class215[2][];
        class232.field3618[0] = new class215[class162.field2322[0]];
        class232.field3618[1] = new class215[class162.field2322[1]];
        class59.field1130 = new int[2];
        class471.field6741 = new class215[2][];
        class471.field6741[0] = new class215[class200.field2828[0]];
        class471.field6741[1] = new class215[class200.field2828[1]];
        class127.field1896 = new int[2];
        class286.field4268 = new class215[10000];
        class224.field3157 = 0;
        class527.field7418 = new class215[5000];
        class460.field6580 = 0;
        class518.field7307 = new class454[5000];
        class282.field4237 = 0;
        class260.field3949 = new boolean[class196.field2802 + class196.field2802 + 1][class196.field2802 + class196.field2802 + 1];
        class535.field7505 = new boolean[class196.field2802 + class196.field2802 + 2][class196.field2802 + class196.field2802 + 2];
        if (class520.field7337) {
            class691.field9724 = new boolean[arg3][class196.field2802 + class196.field2802 + 1][class196.field2802 + class196.field2802 + 1];
            class639.field9024 = new boolean[arg3][][];
            if (class513.field7248 != null) {
                class228.method1524();
            }
            class513.field7248 = new class538[class179.field2550];
            class682.field9618.method113(class513.field7248.length + 1);
            class682.field9618.method135(0);
            for (int var9 = 0; var9 < class513.field7248.length; var9++) {
                class513.field7248[var9] = new class538(var9 + 1, class682.field9618);
                (new Thread(class513.field7248[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class179.field2550 == 2) {
                var10 = 4;
                class519.field7319 = 2;
            } else if (class179.field2550 == 3) {
                var10 = 6;
                class519.field7319 = 3;
            } else {
                var10 = 8;
                class519.field7319 = 4;
            }
            class295.field4329 = new class562[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class295.field4329[var11] = new class562(class535.field7507[class179.field2550 - 2][var11]);
            }
        } else {
            class519.field7319 = 1;
        }
        class665.field9385 = new int[class519.field7319 - 1];
        field4216 = new int[class519.field7319 - 1];
    }
}
