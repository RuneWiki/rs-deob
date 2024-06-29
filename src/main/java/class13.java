import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class13 extends class264 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Ljn;")
    public static class409 field221 = new class409("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field223 = 0;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Z")
    public static boolean field224 = true;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Ljn;")
    public static class409 field225;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Ldf;")
    public static class85 field215;

    static {
        new class167("", 76);
        field225 = new class409("red:", "rot:", "rouge:", "vermelho:");
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBI)Z", line = 7)
    public static final boolean method199(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field211++;
        int var6 = arg2;
        if (arg4 > -70) {
            return true;
        }
        while (var6 <= arg3) {
            for (int var7 = arg5; var7 <= arg1; var7++) {
                if (class387.field5661[var6][var7] == arg0 && class252.field3702[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Llk;", line = 40)
    public static final class125 method200(byte arg0) {
        field219++;
        if (arg0 <= 104) {
            return null;
        }
        class125 var1 = (class125) class154.field2078.method209(28);
        if (var1 != null) {
            var1.method1820(-25246);
            var1.method299((byte) -86);
            return var1;
        }
        class125 var2;
        do {
            var2 = (class125) class403.field5828.method209(28);
            if (var2 == null) {
                return null;
            }
            if (var2.method848(2) > class43.method364(-16756)) {
                return null;
            }
            var2.method1820(-25246);
            var2.method299((byte) -86);
        } while ((var2.field406 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLtd;Leg;Lfp;)V", line = 80)
    public static final void method201(byte arg0, class110 arg1, class376 arg2, class9 arg3) {
        field210++;
        class285 var4 = arg1.method784(arg3, (byte) -111);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1868();
        if (var5 < var4.method1862()) {
            var5 = var4.method1862();
        }
        byte var6 = 10;
        int var7 = arg2.field5488;
        int var8 = arg2.field5487;
        int var9 = 0;
        int var10 = 0;
        if (arg0 < 53) {
            field215 = null;
        }
        int var11 = 0;
        if (arg1.field1487 != null) {
            var9 = class119.field1603.method2330((class285[]) null, 0, (int[]) null, class419.field6078, arg1.field1487);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class419.field6078[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class47.field617.method1978(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class47.field617.method1975() * var9 + (class47.field617.method1979() / 2);
        }
        int var15 = var5 / 2 + arg2.field5488;
        if ((class66.field878 + var5) > var7) {
            var7 = class66.field878;
            var15 = var5 / 2 + class66.field878 + 5 - (-var6 - var10 / 2);
        } else if (var7 > class66.field874 - var5) {
            var7 = class66.field874 - var5;
            var15 = class66.field874 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        int var16 = arg2.field5487;
        if (var8 < (class66.field866 + var5)) {
            var16 = var5 / 2 + class66.field866 + var6;
            var8 = class66.field866;
        } else if ((class66.field869 - var5) < var8) {
            var16 = class66.field869 - (var5 / 2) - var6 - var11;
            var8 = class66.field869 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field5488), (double) (var8 - arg2.field5487)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1921((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field1487 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var18 + var10 + 10;
            var21 = class47.field617.method1975() * var9 + var16 + 3;
            if (arg1.field1516 != 0) {
                arg3.method150(-95, var16, var18, var21 - var16, arg1.field1516, var20 - var18);
            }
            if (arg1.field1519 != 0) {
                arg3.method88(var21 - var16, var18, arg1.field1519, var20 - var18, var16, -107);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class419.field6078[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class47.field617.method1974(arg3, var23, var15, var16, arg1.field1525, true);
                var16 += class47.field617.method1975();
            }
        }
        if (arg1.field1502 == -1 && arg1.field1487 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class132 var25 = new class132(arg2);
        var25.field1811 = var7 + var24;
        var25.field1808 = var7 - var24;
        var25.field1802 = var8 + var24;
        var25.field1810 = var21;
        var25.field1803 = var20;
        var25.field1797 = var8 - var24;
        var25.field1799 = var19;
        var25.field1796 = var18;
        class223.field3243.method2484(0, var25);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(CZ)Z", line = 228)
    public static final boolean method202(char arg0, boolean arg1) {
        field220++;
        if (!arg1) {
            method200((byte) -93);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 238)
    public class13() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V", line = 241)
    public class13(int arg0) {
        this.field214 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I", line = 249)
    public static final int method203(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field218++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        if (arg0 > -67) {
            return 122;
        } else {
            int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V", line = 266)
    public static final void method204(byte arg0) {
        field217++;
        if (!class322.field4759) {
            return;
        }
        class149.field2023 = null;
        class38.field533 = null;
        if (arg0 >= -99) {
            method200((byte) -51);
        }
        class322.field4759 = false;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 283)
    public static final void method205(int arg0) {
        field213++;
        if (class431.field6284 != null) {
            if (class431.field6284.field5134 == 1) {
                class431.field6284 = null;
                return;
            }
            if (class431.field6284.field5134 == 2) {
                class67.method500(true, class279.field4114, 2, class269.field3992);
                class431.field6284 = null;
                return;
            }
        }
        if (arg0 > -87) {
            field222 = 25;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 313)
    public static void method206(int arg0) {
        field225 = null;
        if (arg0 != -1288490189) {
            field221 = null;
        }
        field215 = null;
        field221 = null;
    }
}
