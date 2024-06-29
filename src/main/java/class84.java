import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class84 {

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "B")
    private byte field1348;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    public static boolean field1338 = true;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[I")
    public static int[] field1340 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field1337 = -1;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "F")
    public static float field1336 = 0.0F;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[S")
    public static short[] field1339 = new short[500];

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIIILrf;I)V")
    public static final void method550(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class289 arg6, int arg7) {
        if (class43.field693) {
            class162.field2481 = 32;
        } else {
            class162.field2481 = 0;
        }
        field1351++;
        class43.field693 = arg0;
        if (class267.field4025 != 0) {
            if (arg1 <= arg7 && arg7 < (arg1 + 16) && arg3 <= arg5 && arg3 + 16 > arg5) {
                arg6.field4460 -= 4;
                class295.method1980(arg6, 0);
            } else if (arg1 <= arg7 && (arg1 + 16) > arg7 && (arg2 + arg3 - 16) <= arg5 && arg5 < arg3 + arg2) {
                arg6.field4460 += 4;
                class295.method1980(arg6, 0);
            } else if (arg7 >= (arg1 - class162.field2481) && arg7 < class162.field2481 + arg1 + 16 && (arg3 + 16) <= arg5 && arg3 + arg2 - 16 > arg5) {
                int var8 = (arg2 - 32) * arg2 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - (var8 / 2 + arg3) - 16;
                int var10 = arg2 - var8 - 32;
                arg6.field4460 = (arg4 - arg2) * var9 / var10;
                class295.method1980(arg6, 0);
                class43.field693 = true;
            }
        }
        if (class21.field246 == 0) {
            return;
        }
        int var11 = arg6.field4478;
        if (arg7 >= arg1 - var11 && arg3 <= arg5 && arg7 < arg1 + 16 && arg5 <= arg2 + arg3) {
            arg6.field4460 += class21.field246 * 45;
            class295.method1980(arg6, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I")
    public final int method551(int arg0) {
        field1341++;
        if (arg0 != -15317) {
            field1338 = false;
        }
        return (this.field1348 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method552(String arg0, int arg1) {
        field1347++;
        if (arg1 != 8) {
            return;
        }
        int var2 = class183.method1138(-128, arg0);
        if (var2 != -1) {
            int[] var3 = class39.field524.method1082(121, class293.field4610.field2739[var2] & 0x3FFF, class293.field4610.field2739[var2] >> 14 & 0x3FFF, class293.field4610.field2739[var2] >> 28 & 0x3);
            class198.method1238(var3[1], var3[2], -1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1339 = null;
        int var1 = 36 % ((arg0 + 2) / 58);
        field1340 = null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)I")
    public final int method554(int arg0) {
        if (arg0 != 7) {
            method553(-100);
        }
        field1343++;
        return this.field1348 & 0x7;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lfl;)V")
    public class84(class248 arg0) {
        this.field1348 = arg0.method1604(4);
        this.field1344 = arg0.method1575(false);
        this.field1342 = arg0.method1576(-17672);
        this.field1350 = arg0.method1576(-17672);
        this.field1335 = arg0.method1576(-17672);
        this.field1345 = arg0.method1576(-17672);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[[I)V")
    public static final void method555(int arg0, int[][] arg1) {
        class23.field284 = arg1;
        field1349++;
        if (arg0 != 134) {
            field1336 = 0.13482077F;
        }
    }
}
