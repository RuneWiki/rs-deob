import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class65 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    public static int[] field1147 = new int[200];

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1161 = "Loaded fonts";

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
    public static int[] field1158 = new int[128];

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "S")
    public static short field1151 = 256;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "F")
    public static float field1154;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lhn;")
    public static class196 field1152;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 11)
    public static void method557(boolean arg0) {
        field1147 = null;
        field1152 = null;
        field1158 = null;
        field1161 = null;
        if (arg0) {
            method563(-119, -14);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILqm;)V", line = 29)
    public final void method558(int arg0, int arg1, class227 arg2) {
        while (true) {
            int var4 = arg2.method1720((byte) -122);
            if (var4 == 0) {
                int var5 = -66 % ((-arg1 - 43) / 51);
                field1166++;
                return;
            }
            this.method559(arg2, arg0, var4, 116);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqm;III)V", line = 49)
    private final void method559(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1163 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field1150 = arg0.method1720((byte) -35);
            this.field1149 = arg0.method1720((byte) -30);
        }
        if (arg3 < 108) {
            method563(-43, -62);
        }
        field1160++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I", line = 72)
    public static final int method560(byte arg0) {
        field1148++;
        return arg0 <= 63 ? 51 : class125.field2129;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIILhd;IJZ)Z", line = 86)
    public static final boolean method561(int arg0, int arg1, int arg2, int arg3, int arg4, class161 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class130.method993(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Lsi;", line = 127)
    public final class351 method562(byte arg0) {
        class351 var2 = (class351) class261.field4394.method2329((byte) 107, (long) this.field1163);
        field1155++;
        if (var2 != null) {
            return var2;
        } else if (arg0 < 14) {
            return (class351) null;
        } else {
            class351 var3 = class344.method2427(0, (byte) 94, class205.field3244, this.field1163);
            if (var3 != null) {
                class261.field4394.method2333((long) this.field1163, 0, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 149)
    public static final void method563(int arg0, int arg1) {
        field1165++;
        if (class278.method2058(arg0, (byte) 4)) {
            if (arg1 != 128) {
                method564(-17, -46);
            }
            class13.method76(class163.field2587[arg0], -1, (byte) 19);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)V", line = 170)
    public static final void method564(int arg0, int arg1) {
        class321 var2 = class46.method370(14, (byte) -106, arg0);
        field1153++;
        if (arg1 == -13017) {
            var2.method2261(-129);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)I", line = 186)
    public static final int method565(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class153.field2444[class62.method537(arg0, arg2)];
        if (arg1 > 0) {
            int var5 = class153.field2439.method775(arg1 & 0xFFFF, -92);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class153.field2439.method773(false, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var12 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var10 >> 8) + ((var12 << 8 & 0xFF0093) + (var11 & 0xFF00));
            }
        }
        field1164++;
        if (arg3 != 0) {
            field1161 = (String) null;
        }
        return var4;
    }
}
