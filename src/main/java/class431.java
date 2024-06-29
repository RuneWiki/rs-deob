import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class431 extends class424 {

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    private int field6045 = -1;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Lla;")
    public static class146 field6035 = new class146(100);

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "S")
    public static short field6048 = 32767;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "Ldh;")
    public static class192 field6047;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tj", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field6049;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
    public int[] field6037;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public final void method1940(byte arg0) {
        ++field6041;
        super.method1940((byte) 59);
        if (arg0 > 25) {
            this.field6037 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static final void method2654(int arg0) {
        if (~class76.field1085 != -3) {
            try {
                Method var1 = (field6049 != null ? field6049 : (field6049 = method2663("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class409.field5703 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        } else {
            class409.field5703 = 96;
        }
        if (arg0 == 12661) {
            ++field6032;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)I")
    public static int method2655(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BZ)Lmc;")
    public static final class318 method2656(byte[] arg0, boolean arg1) {
        ++field6043;
        class318 var2 = new class318();
        class366 var3 = new class366(arg0);
        var3.field5048 = var3.field5076.length - 2;
        if (arg1) {
            method2658(-43, -63);
        }
        int var4 = var3.method2297(13352);
        int var5 = -var4 + -2 + var3.field5076.length + -12;
        var3.field5048 = var5;
        int var6 = var3.method2258(1177515464);
        var2.field4332 = var3.method2297(13352);
        var2.field4331 = var3.method2297(13352);
        var2.field4335 = var3.method2297(13352);
        var2.field4330 = var3.method2297(13352);
        int var7 = var3.method2306((byte) 127);
        if (var7 > 0) {
            var2.field4326 = new class109[var7];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                int var9 = var3.method2297(13352);
                class109 var10 = new class109(class177.method1249((byte) -124, var9));
                var2.field4326[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method2258(1177515464);
                    int var12 = var3.method2258(1177515464);
                    var10.method835(4, new class166(var12), (long) var11);
                }
            }
        }
        var3.field5048 = 0;
        var2.field4329 = var3.method2305(-15041);
        var2.field4325 = new int[var6];
        var2.field4337 = new int[var6];
        var2.field4333 = new String[var6];
        int var13 = 0;
        while (~var5 < ~var3.field5048) {
            int var14 = var3.method2297(13352);
            if (~var14 == -4) {
                var2.field4333[var13] = var3.method2255(-32226).intern();
            } else if (~var14 > -101 && var14 != 21 && ~var14 != -39 && var14 != 39) {
                var2.field4337[var13] = var3.method2258(1177515464);
            } else {
                var2.field4337[var13] = var3.method2306((byte) 112);
            }
            var2.field4325[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Li;IIZII)V")
    public static final void method2657(class83 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 == -63) {
            ++field6038;
            if (class182.field2561 < 50) {
                if (arg0 != null && arg0.field1159 != null && ~arg4 > ~arg0.field1159.length && arg0.field1159[arg4] != null) {
                    int var6 = arg0.field1159[arg4][0];
                    int var7 = var6 >> 8;
                    int var8 = (var6 & 246) >> 5;
                    if (arg0.field1159[arg4].length > 1) {
                        int var9 = (int) (Math.random() * (double) arg0.field1159[arg4].length);
                        if (var9 > 0) {
                            var7 = arg0.field1159[arg4][var9];
                        }
                    }
                    int var10 = var6 & 31;
                    if (~var10 == -1) {
                        if (arg3) {
                            class346.method2098(0, var8, var7, 255, (byte) -126);
                        }
                    } else if (~class336.field4540 != -1) {
                        class129.field1948[class182.field2561] = var7;
                        class284.field3867[class182.field2561] = var8;
                        class260.field3596[class182.field2561] = 0;
                        class15.field206[class182.field2561] = null;
                        class116.field1766[class182.field2561] = 255;
                        int var11 = (arg2 + -64) / 128;
                        int var12 = (arg5 - 64) / 128;
                        class124.field1875[class182.field2561] = (var11 << 16) - -(var12 << 8) + var10;
                        ++class182.field2561;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[[I")
    public int[][] method21(int arg0, boolean arg1) {
        ++field6039;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228 && this.method2660(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class423.field5866 != ~this.field6046 ? this.field6046 * arg0 / class423.field5866 : arg0) * this.field6033;
            if (~class303.field4135 != ~this.field6033) {
                for (int var8 = 0; class303.field4135 > var8; ++var8) {
                    int var9 = this.field6033 * var8 / class303.field4135;
                    int var10 = this.field6037[var7 + var9];
                    var6[var8] = class187.method1301(var10 << 4, 4080);
                    var5[var8] = class187.method1301(65280, var10) >> 4;
                    var4[var8] = class187.method1301(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class303.field4135; ++var11) {
                    int var12 = this.field6037[var7++];
                    var6[var11] = class187.method1301(255, var12) << 4;
                    var5[var11] = class187.method1301(4080, var12 >> 4);
                    var4[var11] = class187.method1301(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)I")
    public static final int method2658(int arg0, int arg1) {
        return class124.field1876 != null ? class124.field1876[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)I")
    public final int method2622(int arg0) {
        if (arg0 != -8793) {
            method2657((class83) null, -43, 1, true, 110, -28);
        }
        ++field6042;
        return this.field6045;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)I")
    public static final int method2659(int arg0, int arg1, byte arg2) {
        if (arg2 != -110) {
            field6044 = 83;
        }
        ++field6036;
        return arg0 != 1 && arg0 != 3 ? class349.field4707[arg1 & 3] : class5.field53[arg1 & 3];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field6045 = arg0.method2297(13352);
        }
        ++field6040;
        if (arg1 != -48) {
            field6044 = 98;
        }
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Z")
    public final boolean method2660(int arg0) {
        ++field6031;
        if (this.field6037 != null) {
            return true;
        } else if (~this.field6045 <= -1) {
            class96 var2 = class446.field6257 < 0 ? class96.method744(class81.field1127, this.field6045) : class96.method739(class81.field1127, class446.field6257, this.field6045);
            var2.method742();
            this.field6037 = var2.method751();
            this.field6033 = var2.field1327;
            this.field6046 = var2.field1326;
            return true;
        } else {
            if (arg0 != 0) {
                field6048 = 71;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)I")
    public static final int method2661(byte arg0, int arg1) {
        if (arg0 != -77) {
            method2658(72, -58);
        }
        ++field6034;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class431() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "(I)V")
    public static void method2662(int arg0) {
        field6035 = null;
        if (arg0 != 2040) {
            method2658(21, 74);
        }
        field6047 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2663(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
