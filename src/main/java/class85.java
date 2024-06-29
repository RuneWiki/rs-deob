import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class85 extends class209 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Z")
    public volatile boolean field1264 = true;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field1274 = 255;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field1270 = -1;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field1268 = -1;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Ljava/awt/Font;")
    public static Font field1263;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "Z")
    public boolean field1266;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "Z")
    public boolean field1273;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLub;)Lej;")
    public static final class51 method648(int arg0, byte arg1, class92 arg2) {
        field1267++;
        if (client.method1155(arg0, arg1 + 88, arg2)) {
            return arg1 == -79 ? class266.method1784((byte) -62) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BZ)Lfa;")
    public static final class267 method649(byte[] arg0, boolean arg1) {
        if (arg1) {
            field1268 = 100;
        }
        field1271++;
        if (arg0 == null) {
            return null;
        } else {
            class12 var2 = new class12(arg0, class196.field3069, class125.field1877, class104.field1621, class170.field2583, class301.field4847);
            class30.method254(2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1272++;
        long var8 = class254.method1722(arg2, arg6 + arg7, arg1 + arg4);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = ((int) var8 & 0x7C134) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class295 var13 = class166.method1209(-123, var12);
            if (var13.field4624 == -1) {
                int var14 = arg5;
                if (var8 > 0L) {
                    var14 = arg0;
                }
                int var15 = (52736 - arg1 * 512) * 4 + arg6 * 4 + 24624;
                int[] var16 = class66.field1032;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 515] = var14;
                        var16[var15 + 1024 + 3] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 1027] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1 + 1536] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
            } else if (!class160.method1162(arg1, arg3 - 826, arg6, arg7, arg4, var13, var10)) {
                return false;
            }
        }
        long var17 = class104.method793(arg2, arg6 + arg7, arg1 + arg4);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = ((int) var17 & 0x7DC74) >> 14;
            class295 var22 = class166.method1209(arg3 - 22880, var20);
            if (var22.field4624 == -1) {
                if (var21 == 9) {
                    int[] var23 = class66.field1032;
                    int var24 = 15658734;
                    int var25 = arg6 * 4 + (((52736 - arg1 * 512) * 4) + 24624);
                    if (var17 > 0L) {
                        var24 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var25 + 1536] = var24;
                        var23[var25 + 1025] = var24;
                        var23[var25 + 512 + 2] = var24;
                        var23[var25 + 3] = var24;
                    } else {
                        var23[var25] = var24;
                        var23[var25 + 1 + 512] = var24;
                        var23[var25 + 1026] = var24;
                        var23[var25 + 1539] = var24;
                    }
                }
            } else if (!class160.method1162(arg1, arg3 - 826, arg6, arg7, arg4, var22, var19)) {
                return false;
            }
        }
        if (arg3 != 23000) {
            field1268 = -122;
        }
        long var26 = class183.method1310(arg2, arg6 + arg7, arg1 + arg4);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = ((int) var26 & 0x370878) >> 20;
            class295 var30 = class166.method1209(arg3 ^ 0x59AE, var28);
            if (var30.field4624 != -1 && !class160.method1162(arg1, arg3 ^ 0xF46, arg6, arg7, arg4, var30, var29)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)Lde;")
    public static final class113 method651(byte arg0) {
        field1275++;
        try {
            return new class65();
        } catch (Throwable var3) {
            int var1 = 54 / ((arg0 - 20) / 59);
            try {
                return (class113) Class.forName("cf").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class10();
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)[B")
    public abstract byte[] method249(int arg0);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
    public static void method652(int arg0) {
        field1263 = null;
        if (arg0 != -1) {
            field1265 = -76;
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)I")
    public abstract int method253(int arg0);
}
