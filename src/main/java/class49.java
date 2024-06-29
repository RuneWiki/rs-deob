import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class49 {

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "B")
    private byte field768;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lck;")
    public static class119 field740 = class298.method1987((byte) 126, "<col=ffff00>");

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lck;")
    private static class119 field756 = class298.method1987((byte) 125, "Unable to find ");

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lck;")
    public static class119 field753 = field756;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lck;")
    public static class119 field747 = class298.method1987((byte) 81, ":");

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lck;")
    public static class119 field762 = class298.method1987((byte) 88, "runes");

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Z")
    public static boolean field751 = false;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field741 = -1;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Z")
    public static volatile boolean field754 = true;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Lck;")
    public static class119 field759 = class298.method1987((byte) 114, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lck;")
    public static class119 field766 = class298.method1987((byte) 20, ":duelfriend:");

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lck;")
    public static class119 field757 = class298.method1987((byte) 92, "www)2wtrc");

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Ltb;")
    public static class290 field765;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lae;")
    public static class39 field767;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[[B")
    public static byte[][] field748;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 4)
    public static void method367(int arg0) {
        field756 = null;
        field759 = null;
        field757 = null;
        field753 = null;
        field747 = null;
        field766 = null;
        field740 = null;
        field765 = null;
        if (arg0 == -193) {
            field748 = (byte[][]) null;
            field762 = null;
            field767 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I", line = 35)
    public final int method368(int arg0) {
        if (arg0 == -8149) {
            field744++;
            return this.field768 & 0x7;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lck;Z)Lwa;", line = 67)
    public static final class154 method369(class119 arg0, boolean arg1) {
        if (arg1) {
            field751 = true;
        }
        field752++;
        if (arg0.method776((byte) -85) == 0) {
            return null;
        }
        for (class154 var2 = (class154) class111.field1686.method995(1836596936); var2 != null; var2 = (class154) class111.field1686.method996(0)) {
            if (var2.field2458.method765((byte) 76, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIBI)V", line = 97)
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field742++;
        int var10 = -35 / ((48 - arg8) / 55);
        class129 var11 = null;
        for (class129 var12 = (class129) class87.field1318.method995(1836596936); var12 != null; var12 = (class129) class87.field1318.method996(0)) {
            if (var12.field1981 == arg5 && var12.field1975 == arg1 && var12.field1988 == arg6 && var12.field1971 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class129();
            var11.field1971 = arg0;
            var11.field1975 = arg1;
            var11.field1981 = arg5;
            var11.field1988 = arg6;
            class140.method922(var11, 105);
            class87.field1318.method999(var11, (byte) -108);
        }
        var11.field1987 = arg3;
        var11.field1973 = arg7;
        var11.field1983 = arg9;
        var11.field1969 = arg2;
        var11.field1982 = arg4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIB)I", line = 152)
    public static final int method371(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field743++;
        if (arg3 != -117) {
            method367(-65);
        }
        return (arg2 >> 1) + (arg0 >> 2 << 10) + (arg1 >> 5 << 7);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I", line = 179)
    public final int method372(int arg0) {
        field749++;
        if (arg0 != 18750) {
            this.method372(124);
        }
        return (this.field768 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 238)
    public class49() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lfj;)V", line = 240)
    public class49(class3 arg0) {
        this.field768 = arg0.method24(false);
        this.field763 = arg0.method63((byte) 1);
        this.field745 = arg0.method71(-668527048);
        this.field746 = arg0.method71(-668527048);
        this.field758 = arg0.method71(-668527048);
        this.field750 = arg0.method71(-668527048);
    }
}
