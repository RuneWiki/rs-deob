import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class55 {

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[Lib;")
    public static class180[] field1180 = new class180[2048];

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
    public static int[] field1182 = new int[200];

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lia;")
    public static class257 field1185 = class28.method234(-107, "Hierhin gehen");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "J")
    public static long field1178;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lsc;")
    public static class56 field1174;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[[B")
    public static byte[][] field1184;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field1174 = null;
        field1182 = null;
        field1185 = null;
        if (arg0 > -14) {
            method422(-82, -18, 45, (byte[]) null);
        }
        field1180 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method418(byte arg0, String arg1) throws ClassNotFoundException {
        field1176++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 <= 71) {
                method419((byte) 3, 97);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
    public static final void method419(byte arg0, int arg1) {
        if (arg1 == 37) {
            class32.field628 = 3.0D;
        } else if (arg1 == 50) {
            class32.field628 = 4.0D;
        } else if (arg1 == 75) {
            class32.field628 = 6.0D;
        } else {
            class32.field628 = 8.0D;
        }
        class143.field2516 = -1;
        class143.field2516 = -1;
        field1175++;
        if (arg0 != -67) {
            method420(-25, 79, -97, (byte) 16, -96, 50, -112, 111);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method420(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1172++;
        if (arg1 < 128 || arg5 < 128 || arg1 > 13056 || arg5 > 13056) {
            class74.field1441 = -1;
            class250.field4317 = -1;
            return;
        }
        int var8 = class109.method803(class189.field3261, arg5, (byte) -36, arg1) - arg6;
        int var9 = var8 - field1171;
        int var10 = class101.field1872[class173.field2956];
        int var11 = arg1 - class255.field4366;
        int var12 = arg5 - class231.field3885;
        int var13 = class101.field1871[class173.field2956];
        if (arg3 > -31) {
            return;
        }
        int var14 = class101.field1871[class248.field4276];
        int var15 = class101.field1872[class248.field4276];
        int var16 = var11 * var14 + var12 * var15 >> 16;
        int var17 = var12 * var14 - (var11 * var15) >> 16;
        int var19 = var9 * var13 - (var10 * var17) >> 16;
        int var20 = var9 * var10 + var13 * var17 >> 16;
        if (var20 >= 50) {
            class74.field1441 = (var16 << 9) / var20 + arg0;
            class250.field4317 = (var19 << 9) / var20 + arg2;
        } else {
            class74.field1441 = -1;
            class250.field4317 = -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            return;
        }
        if (arg5 >= 0 && arg7 >= 0 && arg5 < 103 && arg7 < 103) {
            if (arg1 == 0) {
                class8 var8 = class243.method1595(arg6, arg5, arg7);
                if (var8 != null) {
                    int var9 = (int) (var8.field170 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 == 2) {
                        var8.field172 = new class62(var9, 2, arg0 + 4, arg6, arg5, arg7, arg3, false, var8.field172);
                        var8.field169 = new class62(var9, 2, arg0 + 1 & 0x3, arg6, arg5, arg7, arg3, false, var8.field169);
                    } else {
                        var8.field172 = new class62(var9, arg2, arg0, arg6, arg5, arg7, arg3, false, var8.field172);
                    }
                }
            }
            if (arg1 == 1) {
                class7 var10 = class178.method1217(arg6, arg5, arg7);
                if (var10 != null) {
                    int var11 = (int) (var10.field154 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 == 4 || arg2 == 5) {
                        var10.field147 = new class62(var11, 4, arg0, arg6, arg5, arg7, arg3, false, var10.field147);
                    } else if (arg2 == 6) {
                        var10.field147 = new class62(var11, 4, arg0 + 4, arg6, arg5, arg7, arg3, false, var10.field147);
                    } else if (arg2 == 7) {
                        var10.field147 = new class62(var11, 4, (arg0 + 2 & 0x3) + 4, arg6, arg5, arg7, arg3, false, var10.field147);
                    } else if (arg2 == 8) {
                        var10.field147 = new class62(var11, 4, arg0 + 4, arg6, arg5, arg7, arg3, false, var10.field147);
                        var10.field156 = new class62(var11, 4, (arg0 + 2 & 0x3) + 4, arg6, arg5, arg7, arg3, false, var10.field156);
                    }
                }
            }
            if (arg1 == 2) {
                class154 var12 = class242.method1590(arg6, arg5, arg7);
                if (arg2 == 11) {
                    arg2 = 10;
                }
                if (var12 != null) {
                    var12.field2698 = new class62(Integer.MAX_VALUE & (int) (var12.field2702 >>> 32), arg2, arg0, arg6, arg5, arg7, arg3, false, var12.field2698);
                }
            }
            if (arg1 == 3) {
                class115 var13 = class75.method552(arg6, arg5, arg7);
                if (var13 != null) {
                    var13.field2075 = new class62((int) (var13.field2079 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg6, arg5, arg7, arg3, false, var13.field2075);
                }
            }
        }
        field1168++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)Lia;")
    public static final class257 method422(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -29067) {
            return null;
        }
        class257 var4 = new class257();
        var4.field4447 = 0;
        var4.field4407 = new byte[arg1];
        field1183++;
        for (int var5 = arg2; var5 < arg2 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field4407[var4.field4447++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    public static final int method423(int arg0, int arg1) {
        field1177++;
        if (arg0 != -9688) {
            method420(-40, -64, -87, (byte) -76, 25, 120, -30, 127);
        }
        return arg1 & 0xFF;
    }
}
