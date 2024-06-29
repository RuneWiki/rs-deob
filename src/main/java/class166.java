import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class166 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lvm;")
    public static class202 field2704 = new class202(260);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
    public static int[] field2709 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public static int[] field2708 = new int[2048];

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
    public static int[] field2711 = new int[2500];

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lvm;")
    public static class202 field2713 = new class202(64);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljd;")
    public class260 field2714;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
    public int[] field2712;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method1216(int arg0, boolean arg1) {
        int var2 = -72 / ((2 - arg0) / 33);
        field2705++;
        byte var3;
        byte[][] var4;
        if (class99.field1675 && arg1) {
            var3 = 1;
            var4 = class277.field4608;
        } else {
            var3 = 4;
            var4 = class178.field2932;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class53.method364(14874);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class276.field4598[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = (var8 & 0x37A8E2C) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var8 & 0x3FFC) >> 3;
                            int var12 = var8 >> 14 & 0x3FF;
                            int var13 = (var8 & 0x7) >> 1;
                            int var14 = (var12 / 8 << 8) + var11 / 8;
                            for (int var15 = 0; var15 < class287.field4723.length; var15++) {
                                if (class287.field4723[var15] == var14 && var4[var15] != null) {
                                    class316.method2142((var11 & 0x7) * 8, var5, var7 * 8, class160.field2592, var10, arg1, var6 * 8, var4[var15], -89, (var12 & 0x7) * 8, var13);
                                    var9 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class44.method330((byte) -100, var5, var6 * 8, var7 * 8, 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIB)I", line = 116)
    public static final int method1217(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2707++;
        if (arg4 <= 68) {
            field2713 = (class202) null;
        }
        int var5 = 65536 - class310.field5197[arg1 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 133)
    public static void method1218(byte arg0) {
        field2711 = null;
        field2704 = null;
        field2709 = null;
        if (arg0 <= 9) {
            method1219((byte) 83);
        }
        field2708 = null;
        field2713 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 155)
    public static final void method1219(byte arg0) {
        while (true) {
            if (class88.field1497.method36(class187.field3052, 8) >= 11) {
                int var1 = class88.field1497.method34(-117, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class114.field1931[var1] == null) {
                        class114.field1931[var1] = new class209();
                        var2 = true;
                        if (class72.field1232[var1] != null) {
                            class114.field1931[var1].method1455((byte) 115, class72.field1232[var1]);
                        }
                    }
                    field2708[class139.field2248++] = var1;
                    class209 var3 = class114.field1931[var1];
                    var3.field5162 = class319.field5393;
                    int var4 = class88.field1497.method34(23, 1);
                    if (var4 == 1) {
                        class105.field1782[class313.field5278++] = var1;
                    }
                    int var5 = class88.field1497.method34(110, 5);
                    int var6 = class88.field1497.method34(117, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class88.field1497.method34(111, 1);
                    int var8 = class299.field4858[class88.field1497.method34(125, 3)];
                    if (var2) {
                        var3.field5163 = var3.field5122 = var8;
                    }
                    var3.method1454(class230.field3820.field5104[0] + var5, (byte) -30, var7 == 1, class230.field3820.field5159[0] + var6);
                    continue;
                }
            }
            int var9 = -110 % ((arg0 - 32) / 32);
            field2706++;
            class88.field1497.method35((byte) 65);
            return;
        }
    }
}
