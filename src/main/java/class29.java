import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class29 {

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    private int field586 = 0;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[Lkh;")
    private class97[] field580;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field571 = -2;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "J")
    private long field576;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lkh;")
    private class97 field575;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lkh;")
    private class97 field587;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Lkh;")
    public final class97 method177(int arg0) {
        field578++;
        int var2 = 12 / ((77 - arg0) / 41);
        this.field586 = 0;
        return this.method185((byte) 61);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
    public static final int method178(int arg0, int arg1, int arg2) {
        class105 var3 = (class105) class19.field410.method183((byte) 81, (long) arg0);
        if (arg2 != -1) {
            return -86;
        }
        field573++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2340.length; var5++) {
                if (var3.field2348[var5] == arg1) {
                    var4 += var3.field2340[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lkh;)I")
    public final int method179(int arg0, class97[] arg1) {
        field577++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field584; var4++) {
            class97 var5 = this.field580[var4];
            for (class97 var6 = var5.field2168; var6 != var5; var6 = var6.field2168) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
    public final int method180(int arg0) {
        field579++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field584; var3++) {
            class97 var4 = this.field580[var3];
            class97 var5 = var4.field2168;
            while (var4 != var5) {
                var5 = var5.field2168;
                var2++;
            }
        }
        if (arg0 <= 75) {
            method182(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Lkh;")
    public final class97 method181(int arg0) {
        field582++;
        if (this.field575 == null) {
            return null;
        }
        if (arg0 != -9410) {
            this.field580 = null;
        }
        class97 var2 = this.field580[(int) (this.field576 & (long) (this.field584 - 1))];
        while (this.field575 != var2) {
            if (this.field575.field2172 == this.field576) {
                class97 var3 = this.field575;
                this.field575 = this.field575.field2168;
                return var3;
            }
            this.field575 = this.field575.field2168;
        }
        this.field575 = null;
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method182(boolean arg0) {
        if (!arg0) {
            method178(-9, 2, -49);
        }
        field581 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)Lkh;")
    public final class97 method183(byte arg0, long arg1) {
        field572++;
        this.field576 = arg1;
        class97 var4 = this.field580[(int) (arg1 & (long) (this.field584 - 1))];
        if (arg0 <= 27) {
            return null;
        }
        for (this.field575 = var4.field2168; this.field575 != var4; this.field575 = this.field575.field2168) {
            if (this.field575.field2172 == arg1) {
                class97 var5 = this.field575;
                this.field575 = this.field575.field2168;
                return var5;
            }
        }
        this.field575 = null;
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkh;ZJ)V")
    public final void method184(class97 arg0, boolean arg1, long arg2) {
        if (arg0.field2175 != null) {
            arg0.method805(arg1);
        }
        field574++;
        class97 var5 = this.field580[(int) (arg2 & (long) (this.field584 - 1))];
        arg0.field2175 = var5.field2175;
        arg0.field2172 = arg2;
        if (!arg1) {
            arg0.field2168 = var5;
            arg0.field2175.field2168 = arg0;
            arg0.field2168.field2175 = arg0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lkh;")
    public final class97 method185(byte arg0) {
        if (arg0 <= 0) {
            this.field584 = 46;
        }
        field583++;
        if (this.field586 > 0 && this.field580[this.field586 - 1] != this.field587) {
            class97 var2 = this.field587;
            this.field587 = var2.field2168;
            return var2;
        }
        while (this.field586 < this.field584) {
            class97 var3 = this.field580[this.field586++].field2168;
            if (this.field580[this.field586 - 1] != var3) {
                this.field587 = var3.field2168;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field584 = arg0;
        this.field580 = new class97[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class97 var3 = this.field580[var2] = new class97();
            var3.field2168 = var3;
            var3.field2175 = var3;
        }
    }
}
