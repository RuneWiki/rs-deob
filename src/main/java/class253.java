import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class253 extends class179 {

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
    public static int[] field3656 = new int[4096];

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "[[[I")
    public static int[][][] field3659 = new int[2][][];

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Ljj;")
    private class156 field3662;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "[I")
    public static int[] field3665;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field3656 = null;
        if (arg0 == -3702) {
            field3659 = null;
            field3665 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1827(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class164 var7 = (class164) class61.field981.method2496(71); var7 != null; var7 = (class164) class61.field981.method2487(0)) {
            if (class267.field4002 >= var7.field2472) {
                var7.method2731((byte) 109);
            } else {
                class102.method837(var7.field2471 * 2, arg5, arg1 + 16, (var7.field2461 << 7) + 64, (var7.field2468 << 7) + 64, arg3, arg0 >> 1, arg6 >> 1);
                class250.field3620.method1670(var7.field2464 | 0xFF000000, class435.field6340[0] + arg4, var7.field2465, arg1 ^ 0x7D4C, 0, arg2 + class435.field6340[1]);
            }
        }
        if (arg1 != -69) {
            method1826(117);
        }
        field3655++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
    public final String method1828(String arg0, boolean arg1, int arg2) {
        if (arg1) {
            return null;
        }
        field3664++;
        if (this.field3662 == null) {
            return arg0;
        } else {
            class450 var4 = (class450) this.field3662.method1219((long) arg2, -93);
            return var4 == null ? arg0 : var4.field6531;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)V")
    public static final void method1829(int arg0, byte arg1, int arg2) {
        if (arg1 != -115) {
            field3656 = null;
        }
        field3660++;
        class74 var3 = class220.method1679((byte) -15, arg0);
        int var4 = var3.field1276;
        int var5 = var3.field1281;
        int var6 = var3.field1275;
        int var7 = class263.field3962[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class276.method1969(~var8 & class351.field4988[var4] | arg2 << var5 & var8, var4, 0);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)I")
    public final int method1830(int arg0, int arg1, int arg2) {
        field3663++;
        int var4 = -117 / ((-arg2 - 5) / 63);
        if (this.field3662 == null) {
            return arg0;
        } else {
            class9 var5 = (class9) this.field3662.method1219((long) arg1, -108);
            return var5 == null ? arg0 : var5.field117;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZILec;)V")
    private final void method1831(boolean arg0, int arg1, class37 arg2) {
        if (!arg0) {
            method1826(17);
        }
        if (arg1 == 249) {
            int var4 = arg2.method271((byte) 127);
            if (this.field3662 == null) {
                int var5 = class202.method1526(var4, -2092404400);
                this.field3662 = new class156(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method271((byte) 121) == 1;
                int var8 = arg2.method295(arg0);
                class35 var9;
                if (var7) {
                    var9 = new class450(arg2.method322((byte) -34));
                } else {
                    var9 = new class9(arg2.method278(-7));
                }
                this.field3662.method1217(1, (long) var8, var9);
            }
        }
        field3658++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILec;)V")
    public final void method1832(int arg0, class37 arg1) {
        field3661++;
        if (arg0 < 46) {
            method1833(64, -126, -117);
        }
        while (true) {
            int var3 = arg1.method271((byte) 106);
            if (var3 == 0) {
                return;
            }
            this.method1831(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(III)V")
    public static final void method1833(int arg0, int arg1, int arg2) {
        boolean var3 = class443.field6447[0][arg1][arg2] != null && class443.field6447[0][arg1][arg2].field2498 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class443.field6447[var4][arg1][arg2] == null) {
                class168 var5 = class443.field6447[var4][arg1][arg2] = new class168(var4, arg1, arg2);
                if (var3) {
                    var5.field2504++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZII)V")
    public static final void method1834(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field3665 = null;
        }
        for (int var5 = 0; var5 < class32.field449; var5++) {
            Rectangle var6 = class256.field3698[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < arg3 + arg0 && var6.y + var6.height > arg4 && var6.y < arg1 + arg4) {
                class254.field3685[var5] = true;
            }
        }
        field3657++;
    }
}
