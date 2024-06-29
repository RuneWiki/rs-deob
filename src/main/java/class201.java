import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class201 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[Z")
    public static boolean[] field3565 = new boolean[5];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
    public static boolean field3562 = false;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ls;")
    public static class227 field3561 = new class227(64);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lec;")
    public static class178 field3568;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILic;)V")
    public static final void method1353(int arg0, int arg1, int arg2, class134 arg3) {
        field3563++;
        if ((arg2 & 0x40) != 0) {
            int var4 = class229.field4077.method336((byte) 88);
            int var5 = class229.field4077.method309((byte) 64);
            arg3.method856(var5, class171.field2879, 73, var4);
            arg3.field2110 = class171.field2879 + 300;
            arg3.field2099 = class229.field4077.method336((byte) -33);
        }
        if ((arg2 & 0x400) != 0) {
            int var6 = class229.field4077.method309((byte) 107);
            int var7 = class229.field4077.method309((byte) 124);
            arg3.method856(var7, class171.field2879, 82, var6);
        }
        if ((arg2 & 0x1) != 0) {
            int var8 = class229.field4077.method343((byte) 96);
            byte[] var9 = new byte[var8];
            class56 var10 = new class56(var9);
            class229.field4077.method308(0, var9, var8, -128);
            class198.field3522[arg1] = var10;
            arg3.method810(-4888, var10);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field2113 = class229.field4077.method318(true);
            int var11 = class229.field4077.method311(0);
            arg3.field2053 = var11 >> 16;
            arg3.field2072 = class171.field2879 + (var11 & 0xFFFF);
            if (arg3.field2113 == 65535) {
                arg3.field2113 = -1;
            }
            arg3.field2059 = 0;
            if (class171.field2879 < arg3.field2072) {
                arg3.field2059 = -1;
            }
            arg3.field2090 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field2092 = class229.field4077.method367(1);
            arg3.field2067 = class229.field4077.method336((byte) -38);
            arg3.field2047 = class229.field4077.method336((byte) -86);
            arg3.field2066 = class229.field4077.method336((byte) 126);
            arg3.field2089 = class229.field4077.method318(true) + class171.field2879;
            arg3.field2060 = class229.field4077.method318(true) + class171.field2879;
            arg3.field2112 = class229.field4077.method336((byte) -123);
            arg3.field2071 = 1;
            arg3.field2104 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field2111 = class229.field4077.method305(true);
            arg3.field2050 = class229.field4077.method318(true);
        }
        if ((arg2 & 0x80) != 0) {
            int var12 = class229.field4077.method315(88);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class229.field4077.method343((byte) -105);
            class33.method172(arg3, var12, 0, var13);
        }
        if (arg0 <= 90) {
            field3565 = null;
        }
        if ((arg2 & 0x4) != 0) {
            arg3.field2075 = class229.field4077.method305(true);
            if (arg3.field2075 == 65535) {
                arg3.field2075 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            arg3.field2051 = class229.field4077.method326(true);
            if (arg3.field2051.method1335(0, (byte) 33) == 126) {
                arg3.field2051 = arg3.field2051.method1296(1, -1);
                class236.method1586(arg3.field2051, 106, 2, arg3.field1924);
            } else if (class102.field1477 == arg3) {
                class236.method1586(arg3.field2051, 113, 2, arg3.field1924);
            }
            arg3.field2068 = 0;
            arg3.field2095 = 150;
            arg3.field2087 = 0;
        }
        if ((arg2 & 0x10) == 0) {
            return;
        }
        int var14 = class229.field4077.method315(101);
        int var15 = class229.field4077.method309((byte) 91);
        int var16 = class229.field4077.method336((byte) -23);
        int var17 = class229.field4077.field699;
        boolean var18 = (var14 & 0x8000) != 0;
        if (arg3.field1924 != null && arg3.field1916 != null) {
            long var19 = arg3.field1924.method1330(0);
            boolean var21 = false;
            if (var15 <= 1) {
                if (!var18 && (class33.field402 == 1 || class213.field3818 == 1)) {
                    var21 = true;
                } else {
                    for (int var22 = 0; var22 < class211.field3796; var22++) {
                        if (class116.field1680[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
            }
            if (!var21 && class1.field8 == 0) {
                class13.field144.field699 = 0;
                int var23 = -1;
                class229.field4077.method358(0, -128, class13.field144.field693, var16);
                class13.field144.field699 = 0;
                class196 var25;
                if (var18) {
                    var14 &= 0x7FFF;
                    class35 var24 = class138.method863(class13.field144, (byte) -21);
                    var23 = var24.field418;
                    var25 = var24.field419.method125(-28431, class13.field144);
                } else {
                    var25 = class190.method1254(class136.method839(68, class13.field144).method1308(0));
                }
                arg3.field2051 = var25.method1304(-97);
                arg3.field2087 = var14 >> 8;
                arg3.field2068 = var14 & 0xFF;
                arg3.field2095 = 150;
                if (var15 == 2) {
                    class3.method10(null, class93.method572(-87, new class196[] { class78.field1139, arg3.field1924 }), var23, var25, 99, var18 ? 17 : 1);
                } else if (var15 == 1) {
                    class3.method10(null, class93.method572(-121, new class196[] { class224.field4019, arg3.field1924 }), var23, var25, 99, var18 ? 17 : 1);
                } else {
                    class3.method10(null, arg3.field1924, var23, var25, 99, var18 ? 17 : 2);
                }
            }
        }
        class229.field4077.field699 = var16 + var17;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        class234 var10 = null;
        field3567++;
        for (class234 var11 = (class234) class144.field2222.method1651((byte) -99); var11 != null; var11 = (class234) class144.field2222.method1656(-79)) {
            if (var11.field4155 == arg9 && var11.field4153 == arg0 && var11.field4152 == arg2 && var11.field4157 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class234();
            var10.field4153 = arg0;
            var10.field4155 = arg9;
            var10.field4157 = arg6;
            var10.field4152 = arg2;
            class231.method1546(var10, 105);
            class144.field2222.method1652(26532, var10);
        }
        var10.field4159 = arg4;
        var10.field4160 = arg7;
        if (!arg8) {
            field3562 = false;
        }
        var10.field4164 = arg1;
        var10.field4161 = arg5;
        var10.field4162 = arg3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1355(int arg0) {
        field3561 = null;
        field3565 = null;
        if (arg0 == 65535) {
            field3568 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lec;")
    public static final class178 method1356(int arg0, byte arg1) {
        int var2 = -62 % ((arg1 - 28) / 40);
        int var3 = arg0 >> 16;
        field3560++;
        int var4 = arg0 & 0xFFFF;
        if (class91.field1335[var3] == null || class91.field1335[var3][var4] == null) {
            boolean var5 = class35.method182(var3, (byte) -116);
            if (!var5) {
                return null;
            }
        }
        return class91.field1335[var3][var4];
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILic;)I")
    public static final int method1357(int arg0, class134 arg1) {
        int var2 = arg1.field1907;
        if (arg0 > -42) {
            return 39;
        }
        if (arg1.field2091 == arg1.field2063) {
            var2 = arg1.field1925;
        } else if (arg1.field2065 == arg1.field2063) {
            var2 = arg1.field1927;
        }
        field3564++;
        return var2;
    }
}
