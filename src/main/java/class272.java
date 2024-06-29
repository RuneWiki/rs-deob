import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class272 {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[[B")
    public static byte[][] field4367 = new byte[50][];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lrc;")
    public static class9 field4362 = new class9(100);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lpb;")
    public static class167[] field4369 = new class167[14];

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4371 = "Connected to update server";

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "[I")
    public static int[] field4373 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4372 = "";

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static volatile int field4374 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLdl;)V")
    public static final void method1783(byte arg0, class46 arg1) {
        field4368++;
        int var2 = arg1.field777;
        if (var2 == 324) {
            if (class66.field1112 == -1) {
                class66.field1112 = arg1.field672;
                class291.field4649 = arg1.field789;
            }
            if (class57.field987.field352) {
                arg1.field672 = class66.field1112;
            } else {
                arg1.field672 = class291.field4649;
            }
        } else if (var2 == 325) {
            if (class66.field1112 == -1) {
                class291.field4649 = arg1.field789;
                class66.field1112 = arg1.field672;
            }
            if (class57.field987.field352) {
                arg1.field672 = class291.field4649;
            } else {
                arg1.field672 = class66.field1112;
            }
        } else if (var2 == 327) {
            arg1.field741 = 150;
            arg1.field816 = (int) (Math.sin((double) class266.field4301 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field748 = 5;
            arg1.field653 = -1;
        } else if (var2 == 328) {
            if (class273.field4378.field4601 == null) {
                arg1.field653 = 0;
            } else {
                arg1.field741 = 150;
                arg1.field816 = (int) (Math.sin((double) class266.field4301 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field748 = 5;
                arg1.field653 = ((int) class103.method702(true, class273.field4378.field4601) << 11) + 2047;
                arg1.field802 = 0;
                arg1.field643 = class273.field4378.field1387;
                arg1.field708 = class273.field4378.field1421;
                arg1.field760 = class273.field4378.field1474;
            }
        } else if (arg0 > -8) {
            field4371 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method1784(int arg0) {
        field4364++;
        class177.field2918.method777(true);
        class194.field3132.method1497((byte) 52);
        class105.field1860.method1497((byte) 34);
        if (arg0 >= -124) {
            method1783((byte) 72, (class46) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1785(byte[] arg0, int arg1) {
        int var2 = 19 / ((12 - arg1) / 42);
        class101 var3 = new class101(arg0);
        field4363++;
        int var4 = var3.method669((byte) 36);
        int var5 = var3.method655((byte) 57);
        if (var5 < 0 || !(class122.field2156 == 0 || class122.field2156 >= var5)) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var8 = new byte[var5];
            var3.method647(-13749, 0, var8, var5);
            return var8;
        } else {
            int var6 = var3.method655((byte) 97);
            if (var6 < 0 || class122.field2156 != 0 && class122.field2156 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class260.method1731(var7, var6, arg0, var5, 9);
            } else {
                class76.field1237.method336(var3, (byte) 112, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B[B)Lsa;")
    public static final class244 method1786(byte arg0, byte[] arg1) {
        field4366++;
        if (arg1 == null) {
            return null;
        } else {
            class64 var2 = new class64(arg1, class112.field2028, class213.field3588, class110.field1983, class12.field168, class199.field3226);
            class253.method1679((byte) -88);
            return arg0 >= -7 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static void method1787(int arg0) {
        field4369 = null;
        field4371 = null;
        field4362 = null;
        if (arg0 == -16182) {
            field4372 = null;
            field4367 = null;
            field4373 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z")
    public static final boolean method1788(String arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 != 127) {
            field4369 = null;
        }
        field4361++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILeh;)V")
    public static final void method1789(int arg0, class101 arg1) {
        byte[] var2 = new byte[24];
        field4365++;
        if (class126.field2213 != null) {
            try {
                class126.field2213.method1285(0L, 0);
                int var3 = 0;
                class126.field2213.method1287(7436, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 == -22452) {
            arg1.method678((byte) 0, var2, 24, 0);
        }
    }
}
