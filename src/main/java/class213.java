import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class213 extends class318 {

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "[I")
    public static int[] field2804 = new int[32];

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Laq;")
    public static class312 field2800;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLha;ZILuq;II)V")
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        if (arg0 >= -8) {
            field2800 = null;
        }
        ++field2796;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIII)V")
    public class213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field4418 = arg2;
        super.field4408 = (byte) arg3;
        super.field4419 = (byte) arg4;
        super.field4413 = arg1;
        super.field4410 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Lha;B)Z")
    public final boolean method627(class548 arg0, byte arg1) {
        ++field2797;
        class638 var3 = class65.method527(super.field4408, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241);
        if (arg1 < 80) {
            this.method641(44);
        }
        return var3 != null && var3.field8567.field5675 ? class685.method3858(var3.field8567.method790(-11692) - -this.method790(-11692), super.field4418 >> class371.field5241, super.field4410 >> class371.field5241, super.field4408, 1) : class409.method2565(super.field4418 >> class371.field5241, super.field4408, super.field4410 >> class371.field5241, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIZFFFFF)F")
    public static final float method1262(float arg0, int arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        if (!arg2) {
            method1262(0.25294062F, -60, false, -0.9944233F, -1.1794345F, 1.6728365F, -0.68655485F, 1.2012372F);
        }
        ++field2801;
        float var8 = 0.0F;
        float var9 = arg3 - arg4;
        float var10 = arg7 - arg6;
        float var11 = -arg5 + arg0;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg4;
            float var16 = var8 * var10 + arg6;
            float var17 = var8 * var11 + arg5;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (~var18 < -1 && var19 > 0 && var18 < class277.field4036 && ~class667.field9202 < ~var19) {
                int var20 = class388.field5601.field4408;
                if (var20 < 3 && ~(class692.field9623[1][var18][var19] & 2) != -1) {
                    ++var20;
                }
                int var21 = class550.field7649[var20].method2172((int) var15, -1, (int) var17);
                if ((float) var21 < var16) {
                    if (~arg1 > -3) {
                        return var8;
                    }
                    return var8 - 0.1F + 0.1F * method1262(var17, arg1 + -1, true, var15, var12, var14, var13, var16);
                }
            }
            var8 += 0.1F;
            var12 = var15;
            var13 = var16;
            var14 = var17;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
    public final void method641(int arg0) {
        if (arg0 <= 91) {
            this.method626((class687[]) null, (byte) 3);
        }
        ++field2798;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ltj;B)I")
    public final int method626(class687[] arg0, byte arg1) {
        ++field2803;
        if (arg1 != -80) {
            this.method642((byte) 121);
        }
        return this.method2059((byte) -111, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field2800 = null;
        if (arg0 != -1) {
            method1262(0.8234477F, 20, true, 0.16423099F, 0.93765825F, 0.12736659F, -0.4016241F, -0.4500584F);
        }
        field2804 = null;
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        ++field2799;
        if (arg0 <= 95) {
            field2804 = null;
        }
        return class417.field5900[(super.field4410 >> class371.field5241) + class218.field2854 - class103.field1410][(super.field4418 >> class371.field5241) + -class307.field4314 + class218.field2854];
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
    public final boolean method642(byte arg0) {
        ++field2802;
        if (arg0 != 2) {
            this.method628(77);
        }
        return false;
    }
}
