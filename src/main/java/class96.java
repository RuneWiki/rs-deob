import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class96 extends class114 {

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field1451 = 0;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "[Ljj;")
    public static class141[] field1448 = new class141[4];

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1437 = 127;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    public static int field1454 = 0;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[I")
    public static int[] field1442 = new int[14];

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Z")
    public static boolean field1457 = false;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "[I")
    public static int[] field1440;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZIIIII)I")
    public static final int method653(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((1 & arg3) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        ++field1445;
        int var8 = arg2 & 3;
        if (arg1) {
            return -4;
        } else if (~var8 == -1) {
            return arg4;
        } else if (var8 == 1) {
            return 1 - arg6 + 7 + -arg5;
        } else {
            return var8 == 2 ? -arg0 + 1 + 7 + -arg4 : arg5;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1436 = arg5;
        this.field1452 = arg4;
        this.field1447 = arg7;
        this.field1459 = arg2;
        this.field1438 = arg6;
        this.field1450 = arg0;
        this.field1441 = arg1;
        this.field1449 = arg3;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(III)V")
    public static final void method654(int arg0, int arg1, int arg2) {
        ++field1444;
        class270 var3 = class245.method1746(true, arg0);
        int var4 = var3.field4398;
        if (arg2 != 23924) {
            method659((byte) 50, (class73) null, 76);
        }
        int var5 = var3.field4400;
        int var6 = var3.field4399;
        int var7 = class198.field3141[-var5 + var6];
        if (~arg1 > -1 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class290.method1975(arg2 ^ 23811, var4, arg1 << var5 & var8 | ~var8 & class299.field4770[var4]);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(III)V")
    public static final void method655(int arg0, int arg1, int arg2) {
        ++field1456;
        class181 var3 = class95.method652(7, (byte) 34, arg2);
        if (arg0 == -2033032820) {
            var3.method1285((byte) 64);
            var3.field2847 = arg1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static final void method656(int arg0) {
        if (arg0 > -117) {
            method654(-128, 97, -38);
        }
        ++field1453;
        ++class295.field4720;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
    public static final int method657(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)I")
    public static final int method658(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -83 % ((49 - arg2) / 47);
        int var6 = -class221.field3465[arg1 * 1024 / arg4] + 65536 >> 1;
        ++field1455;
        return ((65536 - var6) * arg0 >> 16) + (arg3 * var6 >> 16);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        int var4 = this.field1450 * arg0 >> 12;
        ++field1443;
        int var5 = this.field1459 * arg0 >> 12;
        int var6 = this.field1441 * arg1 >> 12;
        int var7 = this.field1449 * arg1 >> 12;
        if (arg2 != -29715) {
            method654(-61, 61, 56);
        }
        int var8 = this.field1452 * arg0 >> 12;
        int var9 = this.field1436 * arg1 >> 12;
        int var10 = this.field1438 * arg0 >> 12;
        int var11 = this.field1447 * arg1 >> 12;
        class196.method1370(var7, var9, var5, var4, arg2 + 10996, super.field1661, var11, var6, var10, var8);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLvl;I)Lff;")
    public static final class48 method659(byte arg0, class73 arg1, int arg2) {
        int var3 = 126 % ((arg0 - 71) / 47);
        ++field1446;
        return !class75.method521(arg2, arg1, (byte) -106) ? null : class92.method624((byte) 70);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        ++field1439;
        if (arg1 != -8132) {
            this.field1459 = -20;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        ++field1458;
        if (arg0 != 32768) {
            this.method103(111, -27, 9);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
    public static void method660(byte arg0) {
        field1442 = null;
        field1440 = null;
        field1448 = null;
        if (arg0 <= 95) {
            field1440 = null;
        }
    }
}
