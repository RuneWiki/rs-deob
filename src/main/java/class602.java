import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class602 extends class1 {

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    private int field8364;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    private int field8357;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    private int field8359;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    private int field8354;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "Lql;")
    public static class674 field8356 = new class674(7500);

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public static int field8365 = 0;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Lc;")
    public static class169 field8358;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static void method3335(int arg0) {
        field8358 = null;
        if (arg0 >= 124) {
            field8356 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V")
    public final void method8(int arg0, int arg1, boolean arg2) {
        ++field8361;
        int var4 = this.field8357 * arg1 >> 12;
        int var5 = this.field8354 * arg1 >> 12;
        int var6 = this.field8364 * arg0 >> 12;
        if (arg2) {
            method3339(-13, -110, 4);
        }
        int var7 = this.field8359 * arg0 >> 12;
        class162.method1126(super.field4, (byte) 120, var5, var4, var7, var6);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)I")
    public static int method3336(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V")
    public final void method2(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field8362;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIII)V")
    public class602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8364 = arg1;
        this.field8357 = arg0;
        this.field8359 = arg3;
        this.field8354 = arg2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3337(String arg0, String arg1, String arg2, int arg3) {
        int var4 = -71 / ((arg3 - 21) / 59);
        ++field8363;
        for (int var5 = arg2.indexOf(arg0); var5 != -1; var5 = arg2.indexOf(arg0, arg1.length() + var5)) {
            arg2 = arg2.substring(0, var5) + arg1 + arg2.substring(arg0.length() + var5);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIIZB)Lpj;")
    public static final class132 method3338(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 != 121) {
            return null;
        } else {
            ++field8355;
            class476 var5 = null;
            if (class140.field2094 != null) {
                var5 = new class476(arg1, class140.field2094, class435.field6148[arg1], 1000000);
            }
            class202.field2969[arg1] = class375.field5313.method2356(var5, false, arg1, class87.field1192);
            if (arg0) {
                class202.field2969[arg1].method3707(true);
            }
            return new class132(class202.field2969[arg1], arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z")
    public static final boolean method3339(int arg0, int arg1, int arg2) {
        if (arg1 != 55) {
            return false;
        } else {
            ++field8360;
            return ~(2048 & arg2) != -1 && ~(55 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)V")
    public final void method6(int arg0, int arg1, int arg2) {
        if (arg0 < -96) {
            ++field8353;
        }
    }
}
