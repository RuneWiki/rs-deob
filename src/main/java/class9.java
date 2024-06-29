import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lrd;")
    private static class114 field124 = class84.method656("Please close the interface you have open before using (Wreport abuse(W", (byte) 116);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lrd;")
    private static class114 field126 = class84.method656("Error loading your profile)3", (byte) 125);

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lrd;")
    private static class114 field130 = class84.method656(" is already on your friend list", (byte) 124);

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lrd;")
    private static class114 field134 = class84.method656("yellow:", (byte) 122);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lrd;")
    public static class114 field136 = field134;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lrd;")
    public static class114 field133 = field124;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lrd;")
    public static class114 field137 = field130;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lrd;")
    public static class114 field127 = field126;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lrd;")
    public static class114 field139 = class84.method656("mapdots", (byte) 121);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[I")
    public static int[] field141 = new int[50];

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lrd;")
    public static class114 field140 = class84.method656("Spiel)2Engine wird gestartet)3)3)3", (byte) 117);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Loa;")
    public static class93 field131;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
    public static boolean field135;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[Lrd;")
    public static class114[] field138;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lua;[Lnc;I[BII)V")
    public static final void method70(class129 arg0, class89[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field132++;
        class60 var6 = new class60(arg3);
        int var7 = -1;
        while (true) {
            int var8 = var6.method469((byte) -100);
            if (var8 == 0) {
                if (arg4 != 63) {
                    field139 = null;
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method469((byte) -124);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var6.method462((byte) 116);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = var11 + arg2;
                int var18 = arg5 + var12;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var14;
                    class89 var20 = null;
                    if ((class22.field430[1][var17][var18] & 0x2) == 2) {
                        var19 = var14 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg1[var19];
                    }
                    class16.method123(var18, var15, var14, arg0, var20, var16, var7, var17, (byte) -55);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIZZ)Lke;")
    public static final class73 method71(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class22 var5 = null;
        if (class8.field106 != null) {
            var5 = new class22(arg1, class8.field106, class25.field505[arg1], 1000000);
        }
        int var6 = 27 % ((arg2 + 53) / 52);
        field125++;
        return new class73(var5, class69.field1514, arg1, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method72(byte arg0) {
        if (class43.field881.toLowerCase().indexOf("microsoft") == -1) {
            class107.field2480[92] = 74;
            class107.field2480[93] = 43;
            class107.field2480[45] = 26;
            class107.field2480[47] = 73;
            class107.field2480[61] = 27;
            class107.field2480[59] = 57;
            class107.field2480[44] = 71;
            if (class43.field896 == null) {
                class107.field2480[222] = 59;
                class107.field2480[192] = 58;
            } else {
                class107.field2480[192] = 28;
                class107.field2480[520] = 59;
                class107.field2480[222] = 58;
            }
            class107.field2480[46] = 72;
            class107.field2480[91] = 42;
        } else {
            class107.field2480[219] = 42;
            class107.field2480[221] = 43;
            class107.field2480[220] = 74;
            class107.field2480[192] = 58;
            class107.field2480[186] = 57;
            class107.field2480[187] = 27;
            class107.field2480[189] = 26;
            class107.field2480[188] = 71;
            class107.field2480[191] = 73;
            class107.field2480[190] = 72;
            class107.field2480[223] = 28;
            class107.field2480[222] = 59;
        }
        if (arg0 != 123) {
            method70(null, null, -76, null, 50, 67);
        }
        field128++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field139 = null;
        field127 = null;
        field138 = null;
        field130 = null;
        field141 = null;
        field124 = null;
        if (arg0 <= 112) {
            method71(true, -93, 17, true, false);
        }
        field131 = null;
        field137 = null;
        field126 = null;
        field134 = null;
        field133 = null;
        field140 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3) {
        field142++;
        if (arg2 < 102) {
            field124 = null;
        }
        class90 var4 = class92.method719((byte) -115, arg3, arg1);
        if (var4 != null && var4.field2064 != null) {
            class80.method636(var4.field2064, 0, 0, 0, 107, null, var4);
        }
        class77.field1758 = arg1;
        class125.field2975 = true;
        class22.field427 = arg0;
        class137.field3305 = arg3;
    }
}
