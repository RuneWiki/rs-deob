import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class154 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public int[] field2225;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field2229;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[B")
    public byte[] field2236;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public int[] field2228;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "F")
    public static float field2232 = 0.0F;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Z")
    public static boolean field2226 = false;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field2233 = 50;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2235 = "wave:";

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public final int method1006(int arg0, int arg1) {
        field2224++;
        if (arg0 >= -30) {
            method1013((class56) null, -16);
        }
        return this.field2236[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Z")
    public final boolean method1007(int arg0, int arg1) {
        field2223++;
        int var3 = -69 % ((35 - arg1) / 45);
        return (this.field2236[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBZLjava/lang/String;)I")
    public static final int method1008(int arg0, byte arg1, boolean arg2, String arg3) {
        field2230++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg3.length();
        boolean var7 = false;
        if (arg1 <= 64) {
            field2232 = -1.6680232F;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var7 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var7) {
                var11 = -var11;
            }
            int var10 = arg0 * var5 + var11;
            if ((var10 / arg0) != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var10;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Z")
    public final boolean method1009(int arg0, int arg1) {
        field2237++;
        if (arg1 == 13578) {
            return (this.field2236[arg0] & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ltl;B)V")
    public static final void method1010(class240 arg0, byte arg1) {
        field2231++;
        class116 var2 = (class116) class60.field715.method1895(class60.method370((byte) -8, arg0.field3466), -113);
        if (var2 != null) {
            if (var2.field1610 != null) {
                class14.field178.method189(var2.field1610);
                var2.field1610 = null;
            }
            var2.method1935(122);
        }
        int var3 = 102 / ((arg1 - 77) / 41);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)Z")
    public final boolean method1011(boolean arg0, int arg1) {
        field2234++;
        if (arg0) {
            this.method1011(false, 14);
        }
        return (this.field2236[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        if (arg0 != -18659) {
            method1013((class56) null, 96);
        }
        field2235 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V")
    public class154(int arg0) {
        this.field2238 = arg0;
        this.field2225 = new int[this.field2238];
        this.field2229 = new String[this.field2238];
        this.field2236 = new byte[this.field2238];
        this.field2228 = new int[this.field2238];
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsi;I)V")
    public static final void method1013(class56 arg0, int arg1) {
        class264 var2 = null;
        class204.field2906 = 3;
        field2239++;
        class131.method861((byte) -63, true);
        class149.field2169 = true;
        class168.field2424 = 0;
        class137.field1993 = 0;
        class99.field1347 = 2;
        class137.field1989 = 255;
        class254.field3663 = 127;
        class3.field39 = true;
        class94.field1258 = true;
        class164.field2353 = true;
        class165.field2370 = true;
        class54.field624 = 0;
        class234.field3375 = true;
        class91.field1241 = true;
        class284.field4342 = true;
        class287.field4461 = true;
        class115.field1590 = 0;
        class193.field2772 = true;
        class95.field1277 = 127;
        if (arg1 != 15590) {
            field2227 = 6;
        }
        class14.field174 = true;
        if (class224.field3163 >= 96) {
            class162.method1069(2);
        } else {
            class162.method1069(0);
        }
        class115.field1597 = 0;
        class188.field2698 = 0;
        class118.field1666 = 0;
        class247.field3590 = false;
        class172.field2461 = true;
        class254.field3666 = false;
        class258.field3756 = false;
        try {
            class81 var3 = arg0.method343((byte) -34, "runescape");
            while (var3.field960 == 0) {
                class247.method1595(1L, (byte) -83);
            }
            if (var3.field960 == 1) {
                var2 = (class264) var3.field958;
                byte[] var4 = new byte[(int) var2.method1691((byte) 124)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1689(var5, var4, var4.length - var5, -1);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class200.method1289(new class216(var4), -2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1688(-3327);
            }
        } catch (Exception var7) {
        }
    }
}
