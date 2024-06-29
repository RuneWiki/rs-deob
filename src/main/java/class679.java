import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class679 extends class665 {

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[C")
    public static char[] field9568 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field9564 = 0;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field9578 = 0;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field9579 = 0;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lsu;")
    public static class192 field9570 = new class192();

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public int field9566;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field9573;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public int field9574;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Ljava/lang/String;")
    public String field9565;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method3745(int arg0) {
        field9570 = null;
        if (arg0 <= 59) {
            method3745(-8);
        }
        field9568 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method3746(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            field9578 = 50;
        }
        ++field9567;
        for (class250 var7 = (class250) class179.field2655.method3676((byte) 116); var7 != null; var7 = (class250) class179.field2655.method3682(-18176)) {
            if (~class239.field3440 <= ~var7.field3532) {
                var7.method118(-30545);
            } else {
                class285.method1713(arg1, (var7.field3521 << 9) + 256, -91, arg2 >> 1, var7.field3533, var7.field3524 * 2, arg4, arg3 >> 1, (var7.field3522 << 9) + 256);
                class548.field7419.method1305(-16777216 | var7.field3527, class399.field5548[1] + arg6, var7.field3530, true, class399.field5548[0] + arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
    public final int method3747(int arg0) {
        ++field9577;
        if (arg0 != 210) {
            method3746(-26, 83, 24, 98, -31, true, -102);
        }
        return (int) (255L & super.field7311 >>> 32);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
    public final void method3748(boolean arg0) {
        if (arg0) {
            ++field9571;
            super.field9371 |= Long.MIN_VALUE;
            if (~this.method3750((byte) -120) == -1L) {
                class190.field2803.method3615(-31531, this);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public final void method3749(int arg0) {
        super.field9371 = super.field9371 & Long.MIN_VALUE | 500L + class680.method3756(-17);
        if (arg0 > -4) {
            this.method3749(11);
        }
        ++field9580;
        class412.field5837.method3615(-31531, this);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)J")
    public final long method3750(byte arg0) {
        ++field9575;
        if (arg0 != -120) {
            this.method3749(-39);
        }
        return Long.MAX_VALUE & super.field9371;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
    public class679(int arg0, int arg1) {
        super.field7311 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I")
    public final int method3751(byte arg0) {
        if (arg0 != 42) {
            return -119;
        } else {
            ++field9569;
            return (int) super.field7311;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIBI)V")
    public static final void method3752(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        class438.field6179 = 0L;
        if (arg3 >= -99) {
            field9579 = -40;
        }
        ++field9572;
        int var5 = class402.method2292(true);
        if (arg0 == 3 || ~var5 == -4) {
            arg1 = true;
        }
        if (!class630.field8790.method447()) {
            arg1 = true;
        }
        class525.method2917(arg4, var5, -1, arg1, arg2, arg0);
    }
}
