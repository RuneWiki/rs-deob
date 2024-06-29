import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class729 extends class609 {

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Lha;")
    public static class60 field10214;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIZ)V")
    public final void method881(int arg0, int arg1, int arg2, boolean arg3) {
        super.field8614 = arg2;
        ++field10220;
        super.field8615 = arg1;
        super.field8611 = arg0;
        if (!arg3) {
            field10216 = 27;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lrg;I)Llca;")
    public static final class647 method4115(class645 arg0, int arg1) {
        ++field10219;
        if (arg1 != 99) {
            return null;
        } else {
            String var2 = arg0.method3752(-2);
            class651 var3 = class43.method300(false)[arg0.method3745(-6314)];
            class713 var4 = class478.method2882(-105)[arg0.method3745(-6314)];
            int var5 = arg0.method3756(65536);
            int var6 = arg0.method3756(65536);
            int var7 = arg0.method3745(-6314);
            int var8 = arg0.method3745(-6314);
            int var9 = arg0.method3745(-6314);
            int var10 = arg0.method3712((byte) -104);
            int var11 = arg0.method3712((byte) 25);
            int var12 = arg0.method3720(-19541);
            int var13 = arg0.method3720(arg1 ^ -19512);
            int var14 = arg0.method3720(-19541);
            return new class647(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lbs;I)V")
    public static final void method4116(class689 arg0, int arg1) {
        if (arg1 <= 5) {
            field10216 = 26;
        }
        ++field10215;
        class449 var2 = (class449) class87.field1236.method2287((long) arg0.field6118, (byte) -117);
        if (var2 != null) {
            var2.method2767(112);
        } else {
            class447.method2762(arg0, arg0.field6133[0], arg0.field6139[0], 0, (class282) null, arg0.field8429, (class211) null, 1);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(FI)V")
    public final void method879(float arg0, int arg1) {
        int var3 = 6 / ((-47 - arg1) / 39);
        super.field8617 = arg0;
        ++field10218;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ICI)C")
    public static final char method4117(int arg0, char arg1, int arg2) {
        if (arg2 < 2) {
            field10216 = -116;
        }
        ++field10217;
        if (arg1 >= 192 && arg1 <= 255) {
            if (~arg1 <= -193 && arg1 <= 198) {
                return 'A';
            }
            if (~arg1 == -200) {
                return 'C';
            }
            if (~arg1 <= -201 && ~arg1 >= -204) {
                return 'E';
            }
            if (arg1 >= 204 && arg1 <= 207) {
                return 'I';
            }
            if (~arg1 <= -211 && ~arg1 >= -215) {
                return 'O';
            }
            if (~arg1 <= -218 && ~arg1 >= -221) {
                return 'U';
            }
            if (arg1 == 221) {
                return 'Y';
            }
            if (arg1 == 223) {
                return 's';
            }
            if (~arg1 <= -225 && ~arg1 >= -231) {
                return 'a';
            }
            if (arg1 == 231) {
                return 'c';
            }
            if (~arg1 <= -233 && arg1 <= 235) {
                return 'e';
            }
            if (~arg1 <= -237 && arg1 <= 239) {
                return 'i';
            }
            if (arg1 >= 242 && ~arg1 >= -247) {
                return 'o';
            }
            if (arg1 >= 249 && arg1 <= 252) {
                return 'u';
            }
            if (~arg1 == -254 || arg1 == 255) {
                return 'y';
            }
        }
        if (~arg1 == -339) {
            return 'O';
        } else if (~arg1 == -340) {
            return 'o';
        } else if (arg1 == 376) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(IIIIIF)V")
    public class729(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "(B)V")
    public static void method4118(byte arg0) {
        if (arg0 >= -113) {
            method4118((byte) -104);
        }
        field10214 = null;
    }
}
