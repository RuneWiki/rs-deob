import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class91 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "F")
    public static float field1315;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lil;")
    public static class4 field1311;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[[I")
    public static int[][] field1317;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method599(boolean arg0, int arg1) {
        field1318++;
        if (arg1 != -13678) {
            method603(51, -84);
        }
        boolean var2 = class309.method2158();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class309.method2164();
        } else if (!class309.method2161() || !class309.method2159() || !class309.method2156()) {
            arg0 = false;
        }
        class201.field3094 = arg0;
        class292.method2064(true, class96.field1382);
        if (var2 == arg0) {
            return false;
        } else {
            ((class55) class272.field4467).method396(-65537);
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIII)V", line = 42)
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= class341.field5494 && arg6 <= class196.field3001 && class341.field5494 <= arg7 && class196.field3001 >= arg7 && arg4 >= class341.field5494 && class196.field3001 >= arg4 && class341.field5494 <= arg2 && arg2 <= class196.field3001 && class33.field505 <= arg8 && arg8 <= class278.field4586 && class33.field505 <= arg1 && arg1 <= class278.field4586 && class33.field505 <= arg9 && arg9 <= class278.field4586 && class33.field505 <= arg3 && arg3 <= class278.field4586) {
            class121.method790(arg1, arg3, arg6, arg0, (byte) 127, arg2, arg9, arg4, arg7, arg8);
        } else {
            class346.method2440(arg9, arg3, arg8, 1, arg7, arg1, arg4, arg6, arg0, arg2);
        }
        if (arg5 != 20954) {
            method601(-7, false, false, (byte) 110, true);
        }
        field1312++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZZBZ)Lnm;", line = 60)
    public static final class221 method601(int arg0, boolean arg1, boolean arg2, byte arg3, boolean arg4) {
        field1310++;
        class218 var5 = null;
        if (class286.field4689 != null) {
            var5 = new class218(arg0, class286.field4689, client.field2063[arg0], 1000000);
        }
        class291.field4830[arg0] = class113.field1658.method1998(class120.field1791, arg0, var5, 4793);
        int var6 = -65 % ((43 - arg3) / 48);
        if (arg2) {
            class291.field4830[arg0].method1441((byte) 0);
        }
        return new class221(class291.field4830[arg0], arg4, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 85)
    public static void method602(int arg0) {
        if (arg0 != -3901) {
            field1311 = (class4) null;
        }
        field1311 = null;
        field1317 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I", line = 109)
    public static final int method603(int arg0, int arg1) {
        field1316++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != -1) {
                field1317 = (int[][]) ((int[][]) null);
            }
            return class5.method44(arg1, 255);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 123)
    public static final void method604(int arg0, int arg1, int arg2) {
        if (class33.field501 > 0) {
            class153.method1105(class33.field501, 128);
            class33.field501 = 0;
        }
        field1314++;
        if (arg0 != -129) {
            field1311 = (class4) null;
        }
        int var3 = class317.field5231 * arg2;
        int var4 = 0;
        int var5 = 0;
        short var6 = 256;
        for (int var7 = 1; var7 < (var6 - 1); var7++) {
            int var8 = (var6 - var7) * class37.field551[var7] / var6;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class21.field253[var4++];
                int var11 = class317.field5228[var3++ + arg1];
                if (var10 == 0) {
                    class220.field3374.field2172[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 238 - var10;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class248.field3938[var10];
                    class220.field3374.field2172[var5++] = class235.method1623(class235.method1623(var11, 65280) * var13 + var12 * class235.method1623(var14, 65280), 16711680) + class235.method1623(-16711936, class235.method1623(var14, 16711935) * var12 + (var13 * class235.method1623(16711935, var11))) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class220.field3374.field2172[var5++] = class317.field5228[var3++ + arg1];
            }
            var3 += class317.field5231 - 128;
        }
        if (class245.field3886) {
            class335.method2373(class220.field3374.field2172, arg1, arg2, class220.field3374.field4802, class220.field3374.field4811);
        } else {
            class220.field3374.method966(arg1, arg2);
        }
    }
}
