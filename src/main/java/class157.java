import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class157 extends class27 {

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    private int field2258 = 4096;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    private int field2260 = 4096;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    private int field2263 = 4096;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Z")
    public static boolean field2261 = false;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2266;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsb;I)V", line = 6)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            this.field2263 = -30;
        }
        if (arg2 == 0) {
            this.field2258 = arg1.method1317((byte) 112);
        } else if (arg2 == 1) {
            this.field2260 = arg1.method1317((byte) 126);
        } else if (arg2 == 2) {
            this.field2263 = arg1.method1317((byte) 6);
        }
        field2269++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZI)I", line = 51)
    public static final int method1132(int arg0, int arg1, boolean arg2, int arg3) {
        field2259++;
        int var4 = arg1 / arg3;
        int var5 = arg1 & arg3 - 1;
        int var6 = arg0 & arg3 - 1;
        int var7 = arg0 / arg3;
        int var8 = class111.method846(var7, var4, (byte) 92);
        int var9 = class111.method846(var7, var4 + 1, (byte) -98);
        if (!arg2) {
            field2261 = true;
        }
        int var10 = class111.method846(var7 + 1, var4, (byte) 118);
        int var11 = class111.method846(var7 + 1, var4 + 1, (byte) -69);
        int var12 = class200.method1456(var5, arg3, var9, (byte) 5, var8);
        int var13 = class200.method1456(var5, arg3, var11, (byte) 5, var10);
        return class200.method1456(var6, arg3, var13, (byte) 5, var12);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 403)
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)Z", line = 86)
    public static final boolean method1133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class351.field5413 * arg3 + class170.field2454 * arg0 >> 16;
        int var6 = class170.field2454 * arg3 - class351.field5413 * arg0 >> 16;
        int var7 = class273.field4151 * var6 + class232.field3505 * arg1 >> 16;
        int var8 = class273.field4151 * arg1 - class232.field3505 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class273.field4151 * var6 + class232.field3505 * arg2 >> 16;
        int var12 = class273.field4151 * arg2 - class232.field3505 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class16.field277 && var13 < class16.field277) {
            return false;
        } else if (var9 > class320.field4815 && var13 > class320.field4815) {
            return false;
        } else if (var10 < class92.field1289 && var14 < class92.field1289) {
            return false;
        } else {
            return var10 <= class279.field4240 || var14 <= class279.field4240;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 133)
    public static final void method1134(boolean arg0) {
        class57.field845.method462(24);
        class292.field4423.method462(24);
        field2267++;
        if (arg0) {
            field2266 = (String) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(CIB)C", line = 146)
    public static final char method1135(char arg0, int arg1, byte arg2) {
        field2270++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else {
            if (arg2 != -117) {
                field2265 = 63;
            }
            if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V", line = 240)
    public static void method1136(byte arg0) {
        if (arg0 > -47) {
            method1133(106, 126, 55, -65, 89);
        }
        field2266 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I", line = 257)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            field2268 = 69;
        }
        field2262++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, arg0 ^ 0xFFFF8E86, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2258 * var12 >> 12;
                    var9[var11] = this.field2260 * var13 >> 12;
                    var10[var11] = this.field2263 * var14 >> 12;
                } else {
                    var8[var11] = this.field2258;
                    var9[var11] = this.field2260;
                    var10[var11] = this.field2263;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZLjava/lang/String;)I", line = 320)
    public static final int method1137(int arg0, int arg1, boolean arg2, String arg3) {
        field2264++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var9 >= '0' && var9 <= '9') {
                var12 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var12 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var12 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var12) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var10 = arg0 * var4 + var12;
            if (var10 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var6 = true;
            var4 = var10;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        int var11 = -17 / ((arg1 + 25) / 62);
        return var4;
    }
}
