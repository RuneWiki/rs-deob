import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class66 extends class285 {

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    private int field951 = 32768;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "Ljava/lang/String;")
    public static String field950 = null;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Ljava/lang/String;")
    public static String field954 = "K";

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Lcd;")
    public static class69 field952 = new class69(16);

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "[[[Lkb;")
    public static class204[][][] field958;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I", line = 13)
    public final int[] method60(boolean arg0, int arg1) {
        field957++;
        if (!arg0) {
            field958 = (class204[][][]) ((class204[][][]) null);
        }
        int[] var3 = this.field4573.method1116(120, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(1, (byte) 123, arg1);
            int[] var5 = this.method2048(2, (byte) 124, arg1);
            for (int var6 = 0; var6 < class287.field4599; var6++) {
                int var7 = var5[var6] * this.field951 >> 12;
                int var8 = var4[var6] >> 4 & 0xFF;
                int var9 = class51.field731[var8] * var7 >> 12;
                int var10 = class175.field2898[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class112.field1717;
                int var12 = class32.field432 & (var10 >> 12) + arg1;
                int[] var13 = this.method2048(0, (byte) 125, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V", line = 64)
    public static void method441(byte arg0) {
        field952 = null;
        if (arg0 != -119) {
            method445(false, -75, -90, 100);
        }
        field958 = (class204[][][]) null;
        field950 = null;
        field954 = null;
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V", line = 83)
    public final void method361(int arg0) {
        field955++;
        class208.method1511((byte) -128);
        int var2 = -79 / ((arg0 - 42) / 36);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 92)
    public class66() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[[I", line = 102)
    public final int[][] method62(byte arg0, int arg1) {
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = this.method2048(1, (byte) 122, arg1);
            int[] var5 = this.method2048(2, (byte) 122, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class287.field4599; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF885) >> 12;
                int var11 = var5[var9] * this.field951 >> 12;
                int var12 = class175.field2898[var10] * var11 >> 12;
                int var13 = class32.field432 & (var12 >> 12) + arg1;
                int var14 = class51.field731[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + var9 & class112.field1717;
                int[][] var16 = this.method2053((byte) 113, 0, var13);
                var6[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        field956++;
        return arg0 < 121 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z", line = 160)
    public static final boolean method442(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class64.field926; var3++) {
            class20 var4 = class81.field1135[var3];
            if (var4.field295 == 1) {
                int var5 = var4.field272 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field282 * var5 >> 8) + var4.field274;
                    int var7 = (var4.field298 * var5 >> 8) + var4.field294;
                    int var8 = (var4.field281 * var5 >> 8) + var4.field290;
                    int var9 = (var4.field293 * var5 >> 8) + var4.field275;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field295 == 2) {
                int var10 = arg0 - var4.field272;
                if (var10 > 0) {
                    int var11 = (var4.field282 * var10 >> 8) + var4.field274;
                    int var12 = (var4.field298 * var10 >> 8) + var4.field294;
                    int var13 = (var4.field281 * var10 >> 8) + var4.field290;
                    int var14 = (var4.field293 * var10 >> 8) + var4.field275;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field295 == 3) {
                int var15 = var4.field274 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field288 * var15 >> 8) + var4.field272;
                    int var17 = (var4.field283 * var15 >> 8) + var4.field285;
                    int var18 = (var4.field281 * var15 >> 8) + var4.field290;
                    int var19 = (var4.field293 * var15 >> 8) + var4.field275;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field295 == 4) {
                int var20 = arg2 - var4.field274;
                if (var20 > 0) {
                    int var21 = (var4.field288 * var20 >> 8) + var4.field272;
                    int var22 = (var4.field283 * var20 >> 8) + var4.field285;
                    int var23 = (var4.field281 * var20 >> 8) + var4.field290;
                    int var24 = (var4.field293 * var20 >> 8) + var4.field275;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field295 == 5) {
                int var25 = arg1 - var4.field290;
                if (var25 > 0) {
                    int var26 = (var4.field288 * var25 >> 8) + var4.field272;
                    int var27 = (var4.field283 * var25 >> 8) + var4.field285;
                    int var28 = (var4.field282 * var25 >> 8) + var4.field274;
                    int var29 = (var4.field298 * var25 >> 8) + var4.field294;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILpl;)V", line = 286)
    public static final void method443(int arg0, class327 arg1) {
        long var2 = 0L;
        if (arg1.field5058 == 0) {
            var2 = class156.method1119(arg1.field5051, arg1.field5060, arg1.field5046);
        }
        field947++;
        if (arg1.field5058 == 1) {
            var2 = class192.method1424(arg1.field5051, arg1.field5060, arg1.field5046);
        }
        int var4 = -1;
        if (arg1.field5058 == 2) {
            var2 = class129.method933(arg1.field5051, arg1.field5060, arg1.field5046);
        }
        if (arg1.field5058 == 3) {
            var2 = class297.method2117(arg1.field5051, arg1.field5060, arg1.field5046);
        }
        int var5 = 0;
        int var6 = 0;
        if ((long) arg0 != var2) {
            var5 = ((int) var2 & 0x7C97D) >> 14;
            var6 = ((int) var2 & 0x3B4610) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg1.field5052 = var4;
        arg1.field5059 = var6;
        arg1.field5065 = var5;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;)I", line = 326)
    public static final int method444(int arg0, String arg1) {
        field949++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class61.field875; var2++) {
            if (arg1.equalsIgnoreCase(class61.field858[var2])) {
                return var2;
            }
        }
        if (arg0 != -1) {
            field954 = (String) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLjj;I)V", line = 361)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field948++;
        if (arg2 == 0) {
            this.field951 = arg1.method271(21081) << 4;
        } else if (arg2 == 1) {
            this.field4572 = arg1.method286((byte) -108) == 1;
        }
        if (!arg0) {
            this.method361(99);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIII)I", line = 401)
    public static final int method445(boolean arg0, int arg1, int arg2, int arg3) {
        field953++;
        class111 var4 = (class111) class76.field1064.method451((long) arg2, (byte) 100);
        if (var4 == null) {
            return 0;
        }
        if (arg3 != 12706) {
            method441((byte) -89);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1644.length; var6++) {
            if (var4.field1644[var6] >= 0 && var4.field1644[var6] < class200.field3258) {
                class330 var7 = class285.method2054(var4.field1644[var6], 0);
                if (var7.field5127 != null) {
                    class174 var8 = (class174) var7.field5127.method451((long) arg1, (byte) 100);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1643[var6] * var8.field2881;
                        } else {
                            var5 += var8.field2881;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
