import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class205 extends class353 {

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Lgb;")
    private class465 field2800;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Lkd;")
    private class700 field2804;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "Ltb;")
    private class451 field2793;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2788 = "";

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field2796 = new String[200];

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "Liba;")
    public static class211 field2798 = new class211(47, 15);

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2805 = null;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Lpaa;")
    public static class580 field2797;

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lkd;Lmv;Lgb;)V")
    public class205(class700 arg0, class295 arg1, class465 arg2) {
        super(arg0);
        this.field2800 = arg2;
        this.field2804 = arg0;
        if (arg1 != null && this.field2800.method2693(true) && this.field2804.field9946) {
            this.field2793 = class361.method2218(34336, 0, this.field2804, arg1.method1817(6, "gl", "transparent_water"));
        } else {
            this.field2793 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILqda;I)V")
    public final void method484(int arg0, class689 arg1, int arg2) {
        ++field2791;
        if (arg0 != 8056) {
            field2789 = 4;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
    public final void method491(int arg0, boolean arg1) {
        ++field2795;
        OpenGL.glBindProgramARB(34336, this.field2793.field6511);
        OpenGL.glEnable(34336);
        if (arg0 >= -121) {
            field2789 = -65;
        }
        super.field5242.method3025(class11.field273, -1, 0);
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        if (arg0 > -20) {
            return false;
        } else {
            ++field2792;
            return this.field2793 != null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    public final void method490(int arg0) {
        ++field2790;
        super.field5242.method3025(class283.field3777, -1, 0);
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 != -2144900407) {
            this.method490(41);
        }
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(IZ)V")
    public final void method485(int arg0, boolean arg1) {
        if (arg0 >= 1) {
            super.field5242.method3013(class519.field7276, 109, class65.field1041);
            ++field2794;
        }
    }

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field2788 = null;
        field2805 = null;
        field2796 = null;
        field2797 = null;
        if (arg0 == 34336) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)V")
    public static final void method1320(int arg0) {
        ++field2799;
        class211.field2855.method3890(-1);
        class475.field6813.method3890(-1);
        class634.field9147.method3890(-1);
        if (arg0 != 0) {
            method1321(true, (byte) 37);
        }
        class549.field8078.method3890(~arg0);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)V")
    public final void method486(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2804 = null;
        }
        ++field2801;
        if (!this.field2800.field6706) {
            int var4 = super.field5242.field7753 % 4000 * 16 / 4000;
            super.field5242.method3011(-128, this.field2800.field6705[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field5242.field7753 % 4000) / 4000.0F;
            super.field5242.method3011(-128, this.field2800.field6707);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZB)V")
    public static final void method1321(boolean arg0, byte arg1) {
        ++class600.field8686;
        ++field2802;
        if (arg1 != -44) {
            method1320(53);
        }
        class654 var2 = class631.method3628(class48.field755, (byte) -51, class357.field5280);
        class444.method2623(arg1 ^ -83, var2);
        for (class200 var3 = (class200) class318.field4623.method1993(-80); var3 != null; var3 = (class200) class318.field4623.method1997(arg1 ^ -9805)) {
            if (!var3.method2359(1578141260)) {
                var3 = (class200) class318.field4623.method1993(-117);
                if (var3 == null) {
                    break;
                }
            }
            if (~var3.field2721 == -1) {
                class522.method2950(-3223, arg0, var3, true);
            }
        }
        if (class246.field3254 != null) {
            class284.method1679(class246.field3254, -66);
            class246.field3254 = null;
        }
    }
}
