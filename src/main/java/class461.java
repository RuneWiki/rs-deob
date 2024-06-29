import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class461 extends class38 {

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field6795 = 0;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field6798 = 0;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
    public static int[] field6801 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "D")
    public static double field6794;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "J")
    public static long field6803;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
    public static int[] field6799;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)Z")
    public static final boolean method2810(byte arg0, int arg1, int arg2) {
        field6804++;
        if (arg0 == 34) {
            return class724.method4085((byte) 68, arg2, arg1) | (arg1 & 0x70000) != 0 || class530.method3102(arg2, arg1, arg0 ^ 0xFFFFFFF9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class461() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;II)Lmda;")
    public static final class266 method2811(String arg0, int arg1, int arg2) {
        field6797++;
        class266 var3;
        try {
            if (arg1 > -4) {
                field6798 = 35;
            }
            var3 = (class266) Class.forName("oq").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class318();
        }
        var3.field3800 = arg2;
        var3.field3801 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method2812(int arg0) {
        if (arg0 != 0) {
            method2812(-6);
        }
        field6799 = null;
        field6801 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static final void method2813(boolean arg0) {
        field6800++;
        if (class466.field6830 == null) {
            return;
        }
        try {
            if (!arg0) {
                field6803 = 23L;
            }
            String var1 = class466.field6830.getParameter("cookiehost");
            int var2 = (int) (class524.method3075(18) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class121.method876("document.cookie=\"" + var3 + "\"", 74, class466.field6830);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    public static final void method2814(int arg0, int arg1) {
        int var2 = 88 / ((arg1 + 14) / 46);
        field6796++;
        class439.field6501 = 100;
        class601.field8510 = arg0;
        class627.field8776 = -1;
        class712.field10051 = 3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZIIIIIII)Z")
    public static final boolean method2815(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6793++;
        int var9 = class130.field1749.field6133[0];
        int var10 = class130.field1749.field6139[0];
        if (var9 < 0 || var9 >= class194.field2946 || var10 < 0 || class255.field3656 <= var10) {
            return false;
        } else if (arg6 >= 0 && arg6 < class194.field2946 && arg4 >= 0 && arg4 < class255.field3656) {
            if (arg7 < 114) {
                field6801 = null;
            }
            int var11 = class64.method570(var10, var9, arg6, arg8, arg1, false, arg3, arg5, arg2, class595.field8437, class326.field4655[class130.field1749.field8429], arg4, arg0, class130.field1749.method2579(false), class35.field361);
            if (var11 < 1) {
                return false;
            }
            class344.field4987 = class595.field8437[var11 - 1];
            class445.field6615 = class35.field361[var11 - 1];
            class72.field1010 = false;
            class557.method3248((byte) -23);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        field6802++;
        if (arg0 > -43) {
            field6794 = 0.41492238137940207D;
        }
        return class255.field3666;
    }
}
