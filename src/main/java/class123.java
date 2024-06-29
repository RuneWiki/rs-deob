import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class123 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2047 = 20;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lbe;")
    public static class283 field2051 = class153.method941(-62, ":");

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lbe;")
    private static class283 field2046 = class153.method941(-78, "Hidden");

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lbe;")
    public static class283 field2054 = field2046;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lbe;")
    public static class283 field2053 = class153.method941(126, "Versteckt");

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lbe;")
    public static class283 field2043 = class153.method941(125, " <col=ffffff>");

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lbe;")
    public static class283 field2052 = class153.method941(-63, "Cabbage");

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "F")
    public static float field2044;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 14)
    public static final void method775(int arg0, int arg1, int arg2) {
        if (class118.field1990 != 0 && arg2 != -1) {
            class228.method1492(arg2, false, class118.field1990, class210.field3580, (byte) 113, 0);
            class306.field5263 = true;
        }
        field2048++;
        if (arg1 != -19954) {
            field2045 = -21;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I", line = 40)
    public static final int method776(int arg0) {
        if (arg0 != -20253) {
            field2047 = -15;
        }
        field2050++;
        if (class269.field4541) {
            return 0;
        } else if (class96.method622((byte) 0)) {
            return class228.field3839 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)I", line = 58)
    public static final int method777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2049++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg0;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg1 : arg3);
        if (arg4 != 4692) {
            method775(-66, 41, 92);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 79)
    public static void method778(byte arg0) {
        field2054 = null;
        field2053 = null;
        field2052 = null;
        field2043 = null;
        field2046 = null;
        field2051 = null;
        int var1 = -107 % ((-arg0 - 52) / 51);
    }
}
