import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class591 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ldm;")
    private class46 field8436;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field8435 = 100;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[I")
    public static int[] field8439 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field8442 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "J")
    public static long field8434;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lik;")
    private class176 field8437;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Lef;")
    public static class414 field8440;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[FIFFIIIIII)V")
    public static final void method3461(int arg0, float[] arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 != -26545) {
            return;
        }
        int var11 = arg0 - arg6;
        int var12 = arg7 - arg9;
        int var13 = arg2 - arg8;
        field8441++;
        float var14 = arg1[2] * (float) var11 + arg1[1] * (float) var13 + arg1[0] * (float) var12;
        float var15 = arg1[5] * (float) var11 + arg1[3] * (float) var12 + arg1[4] * (float) var13;
        float var16 = arg1[8] * (float) var11 + arg1[6] * (float) var12 + arg1[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg3 != 1.0F) {
            var17 = arg3 * var17;
        }
        float var18 = var15 + arg4 + 0.5F;
        if (arg10 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg10 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class154.field2311 = var18;
        class472.field6628 = var17;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static final void method3462(int arg0) {
        if (arg0 != 3) {
            method3462(-113);
        }
        field8445++;
        class517.field7255.method3246(false);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLdm;)V")
    public final void method3463(byte arg0, class46 arg1) {
        if (arg0 == -97) {
            this.field8436 = arg1;
            field8438++;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Lik;")
    public final class176 method3464(int arg0) {
        field8443++;
        int var2 = 21 % ((59 - arg0) / 43);
        class176 var3 = this.field8436.field892.field2516;
        if (this.field8436.field892 == var3) {
            this.field8437 = null;
            return null;
        } else {
            this.field8437 = var3.field2516;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
    public static void method3465(int arg0) {
        if (arg0 <= 13) {
            method3465(-71);
        }
        field8440 = null;
        field8439 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lik;")
    public final class176 method3466(byte arg0) {
        field8444++;
        if (arg0 != 53) {
            this.field8436 = null;
        }
        class176 var2 = this.field8437;
        if (this.field8436.field892 == var2) {
            this.field8437 = null;
            return null;
        } else {
            this.field8437 = var2.field2516;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class591() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ldm;)V")
    public class591(class46 arg0) {
        this.field8436 = arg0;
    }
}
