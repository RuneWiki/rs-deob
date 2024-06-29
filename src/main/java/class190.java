import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class190 extends class171 {

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Lok;")
    public class146 field3142;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3141 = -1;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "[I")
    public static int[] field3140 = new int[1000];

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "[I")
    public static int[] field3139 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Lok;")
    public static class146 field3143 = class235.method1724(-12908, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lok;")
    public static class146 field3145 = class235.method1724(-12908, "Utiliser");

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
    public static int[] field3150;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "[Lan;")
    public static class315[] field3149;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 8)
    public static void method1466(int arg0) {
        field3150 = null;
        field3139 = null;
        field3143 = null;
        field3140 = null;
        if (arg0 != 137) {
            field3150 = (int[]) null;
        }
        field3149 = null;
        field3145 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIILqf;I)V", line = 23)
    public static final void method1467(int arg0, int arg1, int arg2, int arg3, int arg4, class144 arg5, int arg6) {
        field3147++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg6 == 0) {
            var7 = class296.method2106(arg3, arg4, arg2);
        } else if (arg6 == 1) {
            var7 = class311.method2186(arg3, arg4, arg2);
        } else if (arg6 == 2) {
            var7 = class248.method1820(arg3, arg4, arg2);
        } else if (arg6 == 3) {
            var7 = class259.method1881(arg3, arg4, arg2);
        }
        boolean var10 = false;
        boolean var11 = false;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        if (arg1 != 10) {
            field3149 = (class315[]) null;
        }
        int var13 = ((int) var7 & 0x3BDE5C) >> 20;
        int var14 = ((int) var7 & 0x7FD6E) >> 14;
        class5 var15 = class112.method756((byte) 34, var12);
        if (var15.method25(0)) {
            class31.method224(var15, arg3, arg4, (byte) -84, arg2);
        }
        if (var7 == 0L) {
            return;
        }
        class322 var16 = null;
        class322 var17 = null;
        if (arg6 == 0) {
            class278 var21 = class281.method2038(arg3, arg4, arg2);
            if (var21 != null) {
                var16 = var21.field4774;
                var17 = var21.field4779;
            }
            if (var15.field125 != 0) {
                arg5.method1063(var15.field111, (byte) 67, arg2, arg4, var14, var13);
            }
        } else if (arg6 == 1) {
            class19 var18 = class87.method607(arg3, arg4, arg2);
            if (var18 != null) {
                var16 = var18.field373;
                var17 = var18.field371;
            }
        } else if (arg6 == 2) {
            class311 var20 = class55.method446(arg3, arg4, arg2);
            if (var20 != null) {
                var17 = var20.field5300;
            }
            if (var15.field125 != 0 && (var15.field66 + arg4) < 104 && (var15.field66 + arg2) < 104 && var15.field62 + arg4 < 104 && (arg2 + var15.field62) < 104) {
                arg5.method1071(arg2, var15.field111, (byte) 78, arg4, var15.field62, var15.field66, var13);
            }
        } else if (arg6 == 3) {
            class164 var19 = class210.method1577(arg3, arg4, arg2);
            if (var19 != null) {
                var17 = var19.field2785;
            }
            if (var15.field125 == 1) {
                arg5.method1057(-262145, arg4, arg2);
            }
        }
        if (!class271.field4640 || !var15.field128) {
            return;
        }
        if (var14 == 2) {
            if ((var17 instanceof class161)) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, 0, var13 + 4, var14, 91, arg4, 0, arg2);
            }
            if ((var16 instanceof class161)) {
                ((class161) var16).method1266(true);
            } else {
                class33.method243(var15, arg0, 0, var13 + 1 & 0x3, var14, -112, arg4, 0, arg2);
            }
        } else if (var14 == 5) {
            if (var17 instanceof class161) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, class259.field4314[var13] * 8, var13, 4, arg1 + 63, arg4, class222.field3701[var13] * 8, arg2);
            }
        } else if (var14 == 6) {
            if ((var17 instanceof class161)) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, class25.field444[var13] * 8, var13 + 4, 4, arg1 ^ 0x36, arg4, client.field4078[var13] * 8, arg2);
            }
        } else if (var14 == 7) {
            if (var17 instanceof class161) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, 0, (var13 + 2 & 0x3) + 4, 4, arg1 ^ 0xFFFFFFA4, arg4, 0, arg2);
            }
        } else if (var14 == 8) {
            if (var17 instanceof class161) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, class25.field444[var13] * 8, var13 + 4, 4, 102, arg4, client.field4078[var13] * 8, arg2);
            }
            if ((var16 instanceof class161)) {
                ((class161) var16).method1266(true);
            } else {
                class33.method243(var15, arg0, class25.field444[var13] * 8, (var13 + 2 & 0x3) + 4, 4, 87, arg4, client.field4078[var13] * 8, arg2);
            }
        } else if (var14 == 11) {
            if ((var17 instanceof class161)) {
                ((class161) var17).method1266(true);
            } else {
                class33.method243(var15, arg0, 0, var13 + 4, 10, 58, arg4, 0, arg2);
            }
        } else if (var17 instanceof class161) {
            ((class161) var17).method1266(true);
        } else {
            class33.method243(var15, arg0, 0, var13, var14, 124, arg4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILr;IIILje;)V", line = 223)
    public static final void method1468(int arg0, int arg1, class264 arg2, int arg3, int arg4, int arg5, class70 arg6) {
        field3144++;
        if (arg6 == null) {
            return;
        }
        int var7 = arg4 * arg4 + (arg1 * arg1);
        int var8 = class87.field1378 + class158.field2668 & 0x7FF;
        int var9 = Math.max(arg2.field4393 / 2, arg2.field4381 / 2) + 10;
        if (arg5 != 0) {
            method1466(59);
        }
        if (var7 > (var9 * var9)) {
            return;
        }
        int var10 = class109.field1757[var8];
        int var11 = var10 * 256 / (class238.field3976 + 256);
        int var12 = class109.field1750[var8];
        int var13 = var12 * 256 / (class238.field3976 + 256);
        int var14 = arg1 * var13 + arg4 * var11 >> 16;
        int var15 = arg1 * var11 - (arg4 * var13) >> 16;
        if (class271.field4640) {
            ((class8) arg6).method60(arg2.field4393 / 2 + arg3 + var14 - (arg6.field1144 / 2), arg2.field4381 / 2 + -(arg6.field1140 / 2) + -var15 + arg0, (class8) arg2.method1910(true, false));
        } else {
            ((class307) arg6).method2171(arg3 + var14 - (arg6.field1144 / 2 - (arg2.field4393 / 2)), arg0 - var15 + arg2.field4381 / 2 + -(arg6.field1140 / 2), arg2.field4451, arg2.field4429);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 271)
    public class190() {
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lok;I)V", line = 294)
    public class190(class146 arg0, int arg1) {
        this.field3142 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBI)Z", line = 310)
    public static final boolean method1469(int arg0, byte arg1, int arg2) {
        if (arg1 != -70) {
            return false;
        }
        class5 var3 = class112.method756((byte) -128, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        field3148++;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method30(28, arg0);
    }
}
