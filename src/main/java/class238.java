import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class238 extends class512 {

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "F")
    private float field3301 = 0.0F;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Ljo;")
    private class20 field3304;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "F")
    public static float field3307 = 1.0F;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "Lfha;")
    public static class522 field3313 = new class522();

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "[I")
    public static int[] field3314 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
    public static boolean field3315 = true;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 4)
    public final void method1515(int arg0) {
        if (arg0 != 9370) {
            this.method35(-64);
        }
        if (~super.field7153.method2950(true) == -1) {
            class173 var2 = super.field7153.method2897((byte) -51);
            super.field7153.method2949(1, arg0 ^ 14818);
            class173 var3 = super.field7153.method2872((byte) -122);
            var3.method864(var2);
            var3.method1086(1.0F, true, 0.125F, 0.125F);
            var3.method1093(0.0F, this.field3301, (byte) -46, 0.0F);
            super.field7153.method2925(class144.field1997, (byte) 114);
            super.field7153.method2949(0, 7544);
        }
        ++field3309;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)Z", line = 34)
    public final boolean method35(int arg0) {
        ++field3308;
        int var2 = 120 / ((-72 - arg0) / 37);
        return this.field3304.method96(-109);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IC)Z", line = 46)
    public static final boolean method1516(int arg0, char arg1) {
        ++field3310;
        if (~arg1 <= -33 && arg1 <= '~') {
            return true;
        } else if (~arg1 <= -161 && ~arg1 >= -256) {
            return true;
        } else {
            if (arg0 != 4000) {
                method1517(-103);
            }
            return ~arg1 == -8365 || ~arg1 == -339 || arg1 == 8212 || arg1 == 339 || ~arg1 == -377;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lpga;Ljo;)V", line = 128)
    public class238(class492 arg0, class20 arg1) {
        super(arg0);
        this.field3304 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZZ)V", line = 74)
    public final void method33(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method40(-68, 3, (class117) null);
        }
        ++field3312;
        super.field7153.method2878(class253.field3501, 28768, class369.field4717);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 85)
    public final void method39(int arg0) {
        ++field3302;
        super.field7153.method2949(1, 7544);
        super.field7153.method2878(class369.field4717, 28768, class369.field4717);
        super.field7153.method2946(0, class186.field2725, (byte) 127);
        super.field7153.method2923(-120, 0, class186.field2725);
        super.field7153.method630((byte) 101, 1);
        super.field7153.method2933((byte) 118, (class117) null);
        super.field7153.method2949(0, 7544);
        if (arg0 == 6) {
            super.field7153.method2923(arg0 + -119, 0, class186.field2725);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILlo;)V", line = 106)
    public final void method40(int arg0, int arg1, class117 arg2) {
        ++field3303;
        if (arg1 == -37) {
            super.field7153.method2933((byte) -58, arg2);
        }
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V", line = 117)
    public static void method1517(int arg0) {
        field3313 = null;
        field3314 = null;
        if (arg0 < 50) {
            method1517(26);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V", line = 144)
    public final void method36(int arg0, boolean arg1) {
        super.field7153.method2949(1, 7544);
        if (arg0 > -62) {
            field3313 = null;
        }
        ++field3311;
        super.field7153.method2878(class253.field3501, 28768, class35.field498);
        super.field7153.method582(0, (byte) -126, true, class186.field2725, false);
        super.field7153.method2923(-125, 0, class214.field3017);
        super.field7153.method630((byte) 112, 0);
        super.field7153.method2949(0, 7544);
        super.field7153.method2912((byte) 9, -16777216);
        super.field7153.method2923(-108, 0, class123.field1675);
        this.method1515(9370);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)V", line = 168)
    public final void method38(int arg0, int arg1, boolean arg2) {
        super.field7153.method2949(1, 7544);
        ++field3305;
        if ((128 & arg0) != 0) {
            super.field7153.method2933((byte) -79, (class117) null);
        } else if ((1 & arg1) == 1) {
            if (this.field3304.field247) {
                this.field3301 = (float) (super.field7153.field6811 % 4000) / 4000.0F;
                super.field7153.method2933((byte) -72, this.field3304.field244);
            } else {
                int var4 = super.field7153.field6811 % 4000 * 16 / 4000;
                super.field7153.method2933((byte) 124, this.field3304.field242[var4]);
            }
        } else if (!this.field3304.field247) {
            super.field7153.method2933((byte) 88, this.field3304.field242[0]);
        } else {
            super.field7153.method2933((byte) 78, this.field3304.field244);
        }
        super.field7153.method2949(0, 7544);
        if (arg2) {
            this.method39(121);
        }
    }
}
