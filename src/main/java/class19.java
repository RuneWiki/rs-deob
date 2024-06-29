import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class19 extends class114 {

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Z")
    public static boolean field399 = true;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[Lia;")
    public static class257[] field397 = new class257[500];

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Lia;")
    public static class257 field407 = class28.method234(78, "l");

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "Lia;")
    public static class257 field403 = class28.method234(77, "headicons_pk");

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "Lmb;")
    public static class178 field409;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "Lte;")
    public static class184 field411;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Lia;")
    public class257 field401;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "Z")
    public static boolean field405;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "[I")
    public int[] field395;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "[I")
    public int[] field398;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "[Lia;")
    public class257[] field410;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "[Lsc;")
    public class56[] field413;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field403 = null;
        if (!arg0) {
            method173(-126, 78);
        }
        field407 = null;
        field409 = null;
        field411 = null;
        field397 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZIII[Lq;IIII[B)V")
    public static final void method172(int arg0, boolean arg1, int arg2, int arg3, int arg4, class238[] arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg9 < 4) {
            field405 = false;
        }
        class152 var11 = new class152(arg10);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1053(32767);
            if (var13 == 0) {
                field402++;
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method1055(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFE3) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method1051((byte) -128);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg7 == var18 && var17 >= arg3 && (arg3 + 8) > var17 && arg6 <= var16 && arg6 + 8 > var16) {
                    class233 var22 = class5.method96(var12, false);
                    int var23 = arg2 + class259.method1725(var16 & 0x7, (byte) -107, var20, arg8, var17 & 0x7, var22.field3950, var22.field3986);
                    int var24 = arg0 + class259.method1726(true, var22.field3950, var20, var22.field3986, var16 & 0x7, arg8, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class238 var25 = null;
                        if (!arg1) {
                            int var26 = arg4;
                            if ((class233.field4007[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class24.method213(var25, arg8 + var20 & 0x3, !arg1, arg4, (byte) -114, var23, var24, arg4, var21, var12, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)I")
    public static final int method173(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
    public static final int method174(boolean arg0) {
        if (!arg0) {
            field407 = null;
        }
        field400++;
        return ((class2.field45 ? 1 : 0) << 19) + (class238.field4089 & 0x3 << 17) + ((class179.field3093 ? 1 : 0) << 15) + (class25.field488 & 0x3 << 11) + ((field399 ? 1 : 0) << 10) + ((class152.field2649 ? 1 : 0) << 9) + ((class169.field2918 ? 1 : 0) << 8) + ((class204.field3503 ? 1 : 0) << 7) + ((class133.field2387 ? 1 : 0) << 5) + ((class72.field1409 ? 1 : 0) << 4) + (class30.field566 & 0x7) + ((class215.field3651 ? 1 : 0) << 3) - (-((class2.field62 ? 1 : 0) << 6) + (-((class209.field3573 ? 1 : 0) << 13) - (((class81.field1574 ? 1 : 0) << 16) - -((class38.field747 == 0 ? 0 : 1) << 20))) - (((class26.field513 == 0 ? 0 : 1) << 21) + ((class99.field1830 == 0 ? 0 : 1) << 22)));
    }
}
