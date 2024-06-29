import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class505 extends RuntimeException {

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field6886;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "Ljava/lang/String;")
    public String field6885;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "Lfja;")
    public static class783 field6881 = new class783(101, -2);

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "Lvl;")
    public static class15 field6884 = new class15(62, -1);

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "Lim;")
    public static class598 field6887 = new class598("runescape", 0);

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "[J")
    public static long[] field6888 = new long[32];

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "[I")
    public static int[] field6890;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2883(boolean arg0) {
        if (!arg0) {
            method2883(false);
        }
        field6887 = null;
        field6890 = null;
        field6884 = null;
        field6888 = null;
        field6881 = null;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lwk;Lwk;I)V", line = 24)
    public static final void method2884(class154 arg0, class154 arg1, int arg2) {
        field6882++;
        if (arg0.field2527 != null) {
            arg0.method1207(110);
        }
        arg0.field2524 = arg1;
        arg0.field2527 = arg1.field2527;
        arg0.field2527.field2524 = arg0;
        if (arg2 <= 93) {
            field6887 = null;
        }
        arg0.field2524.field2527 = arg0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIBIIII)V", line = 44)
    public static final void method2885(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field6883++;
        int var8 = class748.method4155(class223.field3260, 16, arg5, class706.field9700);
        if (arg3 >= -25) {
            field6884 = null;
        }
        int var9 = class748.method4155(class223.field3260, 16, arg2, class706.field9700);
        int var10 = class748.method4155(class268.field3766, 16, arg6, class236.field3392);
        int var11 = class748.method4155(class268.field3766, 16, arg7, class236.field3392);
        int var12 = class748.method4155(class223.field3260, 16, arg4 + arg5, class706.field9700);
        int var13 = class748.method4155(class223.field3260, 16, arg2 - arg4, class706.field9700);
        for (int var14 = var8; var14 < var12; var14++) {
            class679.method3826(class298.field4105[var14], var11, 11, var10, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class679.method3826(class298.field4105[var15], var11, 11, var10, arg0);
        }
        int var16 = class748.method4155(class268.field3766, 16, arg4 + arg6, class236.field3392);
        int var17 = class748.method4155(class268.field3766, 16, arg7 - arg4, class236.field3392);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class298.field4105[var18];
            class679.method3826(var19, var16, 11, var10, arg0);
            class679.method3826(var19, var17, 11, var16, arg1);
            class679.method3826(var19, var11, 11, var17, arg0);
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 101)
    public class505(Throwable arg0, String arg1) {
        this.field6886 = arg0;
        this.field6885 = arg1;
    }
}
