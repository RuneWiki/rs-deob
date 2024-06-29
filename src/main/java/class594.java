import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class594 implements class515 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lgj;")
    private class662 field8347;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lbp;")
    private class408 field8341;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[[Ljava/lang/String;")
    public static String[][] field8336 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lwg;")
    public static class450 field8345 = new class450(10, 2, 2, 0);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lnf;")
    private class604 field8337;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient;")
    public static client field8348;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field8343;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method1102(boolean arg0, int arg1) {
        field8338++;
        if (arg1 != 1164 || !arg0) {
            return;
        }
        int var3 = class374.field5075 < class732.field10098 ? class732.field10098 : class374.field5075;
        int var4 = class108.field1697 > class412.field5635 ? class108.field1697 : class412.field5635;
        int var5 = this.field8337.method224();
        int var6 = this.field8337.method218();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var9 = var4;
            var10 = 0;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field8337.method3424(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 48)
    public final void method1790(int arg0) {
        this.field8337 = class265.method1731(this.field8341.field5597, 65485, this.field8347);
        field8346++;
        if (arg0 != 6187) {
            this.field8337 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JZ)V", line = 62)
    public static final void method3391(long arg0, boolean arg1) {
        field8344++;
        int var3 = class492.field6736;
        int var4 = class229.field3347;
        if (class97.field1557 != var3) {
            int var5 = var3 - class97.field1557;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class97.field1557 += var6;
        }
        class53.field763 += (float) arg0 * class58.field809 / 40.0F * 8.0F;
        class43.field682 += (float) arg0 * class663.field9212 / 40.0F * 8.0F;
        if (class488.field6593 != var4) {
            int var7 = var4 - class488.field6593;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class488.field6593 += var8;
        }
        if (!arg1) {
            method3393(-55, (byte) -9, -110, false, null, null, -70);
        }
        class559.method3245((byte) 122);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z", line = 147)
    public final boolean method1789(byte arg0) {
        if (arg0 != 29) {
            this.method1790(-32);
        }
        field8339++;
        return this.field8347.method3737(this.field8341.field5597, false);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 158)
    public static void method3392(int arg0) {
        if (arg0 == -1) {
            field8348 = null;
            field8343 = null;
            field8336 = null;
            field8345 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIZLgj;Lpt;I)V", line = 173)
    public static final void method3393(int arg0, byte arg1, int arg2, boolean arg3, class662 arg4, class558 arg5, int arg6) {
        class374.method2270(arg2, arg6, arg4, 0, arg0, arg3);
        field8340++;
        int var7 = -18 % ((-arg1 - 59) / 58);
        class676.field9431 = arg5;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lgj;Lbp;)V", line = 184)
    public class594(class662 arg0, class408 arg1) {
        this.field8347 = arg0;
        this.field8341 = arg1;
    }
}
