import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field42 = -1;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lid;")
    public static class60 field40 = class11.method72("_", (byte) 121);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lid;")
    public static class60 field41 = class11.method72("Null", (byte) 124);

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lid;")
    public static class60 field52 = class11.method72("swe", (byte) 106);

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lid;")
    public static class60 field50 = class11.method72("cross", (byte) -29);

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lid;")
    public static class60 field44 = class11.method72("http:)4)4", (byte) -120);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lv;")
    public class146 field53;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
    public int[] field39;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[Lid;")
    public class60[] field47;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z[BII[Lpb;IIIIILl;)V")
    public static final void method5(boolean arg0, byte[] arg1, int arg2, int arg3, class106[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10) {
        field45++;
        class103 var11 = new class103(arg1);
        int var12 = -1;
        if (arg0) {
            return;
        }
        while (true) {
            int var13 = var11.method835(-24298);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method835(-24298);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var11.method829((byte) 32);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg5 == var17 && arg9 <= var16 && arg9 + 8 > var16 && var18 >= arg2 && arg2 + 8 > var18) {
                    class148 var22 = class31.method238(-29628, var12);
                    int var23 = class16.method127((byte) -29, var22.field3306, var18 & 0x7, var16 & 0x7, arg7, var22.field3330, var21) + arg8;
                    int var24 = arg3 + class153.method1163(var18 & 0x7, var16 & 0x7, var22.field3306, var22.field3330, arg7, var21, (byte) -66);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class106 var25 = null;
                        int var26 = arg6;
                        if ((class124.field2869[1][var23][var24] & 0x2) == 2) {
                            var26 = arg6 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg4[var26];
                        }
                        class139.method1083(var12, arg10, var24, true, var20, arg6, arg7 + var21 & 0x3, var23, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLid;Lid;Lid;I)V")
    public static final void method6(byte arg0, class60 arg1, class60 arg2, class60 arg3, int arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class43.field1150[var5] = class43.field1150[var5 - 1];
            class33.field768[var5] = class33.field768[var5 - 1];
            class72.field1729[var5] = class72.field1729[var5 - 1];
            class56.field1403[var5] = class56.field1403[var5 - 1];
        }
        field49++;
        class33.field768[0] = arg3;
        if (arg0 > 67) {
            class115.field2719 = class78.field1921;
            class43.field1150[0] = arg4;
            class72.field1729[0] = arg2;
            class56.field1403[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        if (arg0 != 7) {
            return;
        }
        field50 = null;
        field41 = null;
        field44 = null;
        field52 = null;
        field40 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        class148.field3343.method920((byte) 14);
        field48++;
        class12.field204.method920((byte) 14);
        class16.field380.method920((byte) 14);
        int var1 = 38 % ((arg0 + 20) / 36);
        class139.field3172.method920((byte) 14);
    }
}
