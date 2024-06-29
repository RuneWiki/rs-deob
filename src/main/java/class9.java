import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 extends class247 {

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lla;")
    public class131 field145;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lwb;")
    public class145 field120;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Lig;")
    public class167 field139;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Lqe;")
    public class176 field136;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static final void method50(int arg0) {
        field144++;
        if (class128.field1832 > 0) {
            class222.method1573((byte) -81);
            return;
        }
        class167.field2572 = class270.field4405;
        class270.field4405 = null;
        if (arg0 == -105) {
            class95.method651(40, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIIII)V")
    public static final void method51(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field143++;
        for (int var6 = arg2; var6 <= (arg2 + arg0); var6++) {
            for (int var11 = arg3; var11 <= (arg3 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class41.field503[arg4][var11][var6] = 127;
                }
            }
        }
        if (arg1) {
            return;
        }
        for (int var7 = arg2; var7 < (arg0 + arg2); var7++) {
            for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class8.field114[arg4][var10][var7] = arg4 > 0 ? class8.field114[arg4 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg2 + 1; var8 < arg0 + arg2; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class8.field114[arg4][arg3][var8] = class8.field114[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class8.field114[arg4][var9][arg2] = class8.field114[arg4][var9][arg2 - 1];
                }
            }
        }
        if (arg3 < 0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg4 != 0) {
            if (arg3 > 0 && class8.field114[arg4 - 1][arg3 - 1][arg2] != class8.field114[arg4][arg3 - 1][arg2]) {
                class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3 - 1][arg2];
                return;
            }
            if (arg2 > 0 && class8.field114[arg4][arg3][arg2 - 1] != class8.field114[arg4 - 1][arg3][arg2 - 1]) {
                class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3][arg2 - 1];
                return;
            }
            if (arg3 > 0 && arg2 > 0 && class8.field114[arg4 - 1][arg3 - 1][arg2 - 1] != class8.field114[arg4][arg3 - 1][arg2 - 1]) {
                class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3 - 1][arg2 - 1];
                return;
            }
            return;
        }
        if (arg3 > 0 && class8.field114[arg4][arg3 - 1][arg2] != 0) {
            class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3 - 1][arg2];
            return;
        }
        if (arg2 > 0 && class8.field114[arg4][arg3][arg2 - 1] != 0) {
            class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3][arg2 - 1];
            return;
        }
        if (arg3 > 0 && arg2 > 0 && class8.field114[arg4][arg3 - 1][arg2 - 1] != 0) {
            class8.field114[arg4][arg3][arg2] = class8.field114[arg4][arg3 - 1][arg2 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.field136 = null;
        if (arg0 <= 19) {
            this.field137 = 75;
        }
        this.field145 = null;
        field131++;
        this.field120 = null;
        this.field139 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method53(String arg0, int arg1, int arg2) {
        field124++;
        class181 var3 = class95.method652(2, (byte) 34, arg2);
        if (arg1 == -1) {
            var3.method1285((byte) 64);
            var3.field2850 = arg0;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lvl;B)V")
    public static final void method54(class73 arg0, byte arg1) {
        if (arg1 == 8) {
            field129++;
            class144.field2154 = arg0;
            class29.field358 = class144.field2154.method481(arg1 ^ 0xA88, 16);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILsc;IJ)Z")
    public static final boolean method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class248 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class59.method377(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
