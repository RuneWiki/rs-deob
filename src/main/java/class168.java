import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class168 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2878 = 2;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2885 = 0;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljf;")
    public static class229 field2883 = class212.method1457((byte) 90, "::rect_debug");

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2879 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
    public static boolean field2880;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[I")
    public static int[] field2877;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Z", line = 9)
    public static final boolean method1141(boolean arg0) {
        field2875++;
        if (class74.field1404) {
            try {
                return !(Boolean) class217.field3723.method1634((byte) -2, class215.field3689.field3461);
            } catch (Throwable var2) {
            }
        }
        if (!arg0) {
            method1144((byte) -39);
        }
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 52)
    public static final void method1142(boolean arg0) {
        field2881++;
        if (class269.method1903(-24433) != 2) {
            return;
        }
        byte var1 = (byte) (class295.field5049 - 4 & 0xFF);
        int var2 = class295.field5049 % 104;
        if (arg0) {
            field2877 = (int[]) null;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class288.field4933[var3][var2][var4] = var1;
            }
        }
        if (class16.field254 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class90.field1644[var5] = -1000000;
            class186.field3255[var5] = 1000000;
            class303.field5145[var5] = 0;
            class223.field3810[var5] = 1000000;
            class81.field1483[var5] = 0;
        }
        if (class74.field1405 != 1) {
            int var6 = class282.method1984((byte) -86, class243.field4301, class97.field1721, class16.field254);
            if ((var6 - class107.field1881) < 800 && (class142.field2464[class16.field254][class97.field1721 >> 7][class243.field4301 >> 7] & 0x4) != 0) {
                class281.method1970(false, class312.field5246, 1, class97.field1721 >> 7, -4376, class243.field4301 >> 7);
            }
            return;
        }
        if ((class142.field2464[class16.field254][class301.field5124.field1983 >> 7][class301.field5124.field2028 >> 7] & 0x4) != 0) {
            class281.method1970(false, class312.field5246, 0, class301.field5124.field1983 >> 7, -4376, class301.field5124.field2028 >> 7);
        }
        if (class203.field3550 >= 310) {
            return;
        }
        int var7 = class97.field1721 >> 7;
        int var8 = class243.field4301 >> 7;
        int var9 = class301.field5124.field1983 >> 7;
        int var10 = class301.field5124.field2028 >> 7;
        int var11;
        if (var10 > var8) {
            var11 = var10 - var8;
        } else {
            var11 = var8 - var10;
        }
        int var12;
        if (var9 <= var7) {
            var12 = var7 - var9;
        } else {
            var12 = var9 - var7;
        }
        if (var12 > var11) {
            int var15 = var11 * 65536 / var12;
            int var16 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class142.field2464[class16.field254][var7][var8] & 0x4) != 0) {
                    class281.method1970(false, class312.field5246, 1, var7, -4376, var8);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class142.field2464[class16.field254][var7][var8] & 0x4) != 0) {
                        class281.method1970(false, class312.field5246, 1, var7, -4376, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class142.field2464[class16.field254][var7][var8] & 0x4) != 0) {
                class281.method1970(false, class312.field5246, 1, var7, -4376, var8);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class142.field2464[class16.field254][var7][var8] & 0x4) != 0) {
                    class281.method1970(false, class312.field5246, 1, var7, -4376, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 246)
    public static final void method1143(int arg0) {
        class23.field423 = new class67[class318.field5378.method1286(false)][];
        field2882++;
        if (arg0 != 2) {
            method1145((byte) -124);
        }
        class146.field2544 = new boolean[class318.field5378.method1286(false)];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 259)
    public static void method1144(byte arg0) {
        field2877 = null;
        if (arg0 < -119) {
            field2883 = null;
            field2879 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 271)
    public static final void method1145(byte arg0) {
        class278.field4772 = new class268(32);
        field2884++;
        if (arg0 < 110) {
            field2883 = (class229) null;
        }
    }
}
