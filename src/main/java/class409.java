import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class409 {

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public int field6095;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public int field6091;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public int field6098;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "Liba;")
    public static class211 field6096 = new class211(39, 2);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "Z")
    public static boolean field6094;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "Z")
    public static boolean field6099;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BBI[BIIIII)V", line = 5)
    public static final void method2507(byte[] arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6092++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        int var11 = -arg6;
        if (arg1 != 88) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg0[var10001] += arg3[arg4++];
                int var14 = arg2++;
                arg0[var14] += arg3[arg4++];
                int var15 = arg2++;
                arg0[var15] += arg3[arg4++];
                int var16 = arg2++;
                arg0[var16] += arg3[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg0[var10001] += arg3[arg4++];
            }
            arg2 += arg7;
            arg4 += arg8;
            var11++;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIZIII)V", line = 51)
    public static final void method2508(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class546.field8063 = arg4;
        class229.field3040 = arg2;
        class457.field6593 = arg0;
        field6097++;
        class346.field5107 = arg5;
        class50.field785 = arg1;
        if (arg3 && class457.field6593 >= 100) {
            class306.field4529 = class229.field3040 * 512 + 256;
            class603.field8702 = class346.field5107 * 512 + 256;
            class533.field7839 = class504.method2870((byte) -122, class603.field8702, class306.field4529, class49.field779) - class50.field785;
        }
        if (arg6 == 512) {
            class150.field2120 = -1;
            class250.field3280 = -1;
            class684.field9659 = 2;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V", line = 79)
    public static final void method2509(int arg0, int arg1) {
        if (arg0 != 512) {
            field6094 = true;
        }
        field6090++;
        class408.method2501(class279.field3637.method1654(arg0 ^ 0xFFFFFD80, class262.field3401), (byte) 110, arg1);
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(III)Z", line = 97)
    public static final boolean method2510(int arg0, int arg1, int arg2) {
        field6100++;
        int var3 = 113 / ((38 - arg0) / 38);
        return class364.method2234(arg2, arg1, (byte) 112) | (arg1 & 0x800) != 0 || class264.method1587((byte) 95, arg2, arg1);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 109)
    public static void method2511(byte arg0) {
        if (arg0 != -24) {
            field6094 = false;
        }
        field6096 = null;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(III)V", line = 122)
    public class409(int arg0, int arg1, int arg2) {
        this.field6095 = arg0;
        this.field6091 = arg1;
        this.field6098 = arg2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lgk;Z)Lru;", line = 132)
    public static final class231 method2512(class540 arg0, boolean arg1) {
        field6093++;
        int var2 = arg0.method3169(26488);
        if (arg1) {
            return null;
        }
        class545 var3 = class9.method64((byte) -125)[arg0.method3115(29871)];
        class305 var4 = class62.method384(!arg1)[arg0.method3115(29871)];
        int var5 = arg0.method3129(69);
        int var6 = arg0.method3129(99);
        return new class231(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
    public abstract void method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(III)V")
    public abstract void method210(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(III)V")
    public abstract void method205(int arg0, int arg1, int arg2);
}
