import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Laf;")
    private static class7 field23 = class48.method406(40, " seconds)3");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Laf;")
    private static class7 field28 = class48.method406(40, "Select");

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Laf;")
    public static class7 field32 = class48.method406(40, "Benutzername: ");

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Laf;")
    public static class7 field31 = field28;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Laf;")
    public static class7 field25 = class48.method406(40, "<col=ffb000>");

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Laf;")
    public static class7 field24 = class48.method406(40, "leuchten1:");

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Laf;")
    public static class7 field34 = field23;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Laf;")
    public static class7 field30 = class48.method406(40, "http:)4)4");

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lgd;")
    public static class46 field35 = new class46(30);

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Laf;")
    private static class7 field36 = class48.method406(40, "No response from server)3");

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
    public static int[] field40 = new int[128];

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Laf;")
    public static class7 field37 = field36;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lkd;")
    public static class73 field22;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[Lfd;")
    public static class40[] field38;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[BII[Lmd;IIIILrf;)V")
    public static final void method18(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class87[] arg5, int arg6, int arg7, int arg8, int arg9, class124 arg10) {
        if (arg6 != -8) {
            field39 = -4;
        }
        class122 var11 = new class122(arg2);
        field27++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method934(arg6 ^ 0x57);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method934(-93);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var11.method931((byte) 124);
                int var19 = var18 >> 2;
                int var20 = var14 >> 6 & 0x3F;
                int var21 = var18 & 0x3;
                if (arg1 == var17 && var20 >= arg0 && arg0 + 8 > var20 && var16 >= arg3 && var16 < arg3 + 8) {
                    class82 var22 = class155.method1214((byte) -121, var12);
                    int var23 = arg4 + client.method209(var22.field1914, var22.field1917, var20 & 0x7, (byte) 125, var16 & 0x7, var21, arg7);
                    int var24 = arg8 + class7.method68(var16 & 0x7, var22.field1914, arg7, 119, var22.field1917, var21, var20 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg9;
                        class87 var26 = null;
                        if ((class25.field670[1][var23][var24] & 0x2) == 2) {
                            var25 = arg9 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg5[var25];
                        }
                        class126.method1047(arg10, arg7 + var21 & 0x3, arg9, var24, var23, var26, var12, var19, -96);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method19(int arg0) {
        field35 = null;
        if (arg0 < 84) {
            field22 = null;
        }
        field31 = null;
        field28 = null;
        field38 = null;
        field32 = null;
        field22 = null;
        field37 = null;
        field25 = null;
        field23 = null;
        field40 = null;
        field36 = null;
        field34 = null;
        field30 = null;
        field24 = null;
    }
}
