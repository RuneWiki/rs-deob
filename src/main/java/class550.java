import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class550 implements class432 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/String;")
    private String field7584;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Luq;")
    private class172 field7587;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field7591 = -1;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "F")
    public static float field7588;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "[I")
    public static int[] field7592;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIJILaa;Lofa;II)V", line = 5)
    public static final void method3159(int arg0, boolean arg1, int arg2, long arg3, int arg4, class512 arg5, class347 arg6, int arg7, int arg8) {
        field7583++;
        int var10 = arg0 * arg0 + arg4 * arg4;
        if ((long) var10 > arg3) {
            return;
        }
        int var11 = Math.min(arg6.field4986 / 2, arg6.field4940 / 2);
        if (!arg1) {
            method3159(85, true, 24, 47L, -52, null, null, -66, -39);
        }
        if (var11 * var11 >= var10) {
            class673.method3714(arg0, arg4, arg7, arg2, false, arg6, arg5, class704.field9635[arg8]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class697.field9252 == 4) {
            var12 = (int) class514.field7144 & 0x3FFF;
        } else {
            var12 = (int) class514.field7144 + class551.field7614 & 0x3FFF;
        }
        int var13 = class110.field1524[var12];
        int var14 = class110.field1523[var12];
        if (class697.field9252 != 4) {
            var13 = var13 * 256 / (class767.field10544 + 256);
            var14 = var14 * 256 / (class767.field10544 + 256);
        }
        int var15 = arg0 * var13 + arg4 * var14 >> 14;
        int var16 = arg0 * var14 - (arg4 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class124.field1716[arg8].method973((float) arg6.field4986 / 2.0F + (float) arg7 + (float) var19, (float) arg6.field4940 / 2.0F + (float) arg2 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z", line = 58)
    public static final boolean method3160(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field7589++;
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Luq;Ljava/lang/String;)V", line = 73)
    public class550(class172 arg0, String arg1) {
        this.field7584 = arg1;
        this.field7587 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)I", line = 83)
    public final int method1777(boolean arg0) {
        if (arg0) {
            field7582++;
            return this.field7587.method1186(-1, this.field7584) ? 100 : 0;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 97)
    public static void method3161(int arg0) {
        field7592 = null;
        if (arg0 != 2) {
            method3159(29, true, 24, -109L, 8, null, null, 98, 21);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 109)
    public static final void method3162(int arg0, int arg1) {
        field7585++;
        class761.field10451 = arg1;
        class338.field4739.method3103(-11294);
        if (arg0 != 4096) {
            method3160(-91, -109, 68);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I", line = 121)
    public static final int method3163(int arg0) {
        field7590++;
        if (arg0 != 16383) {
            method3159(-36, true, 35, 111L, -34, null, null, 94, -87);
        }
        return class206.field2664 == 1 ? class90.field1281 : 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Lkt;", line = 137)
    public final class168 method1775(int arg0) {
        field7593++;
        if (arg0 <= 85) {
            method3163(-54);
        }
        return class168.field2210;
    }
}
