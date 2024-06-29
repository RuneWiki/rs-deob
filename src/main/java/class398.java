import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class398 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    private int field5233;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    private int field5247;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    private int field5238;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    private int field5240;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    private int field5235;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    private int field5246;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    private int field5239;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lvj;")
    public static class373 field5231 = new class373(0, 3);

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Z")
    public static boolean field5242 = false;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Lvj;")
    public static class373 field5245 = new class373(1, -1);

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Z")
    public static boolean field5249 = false;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method2282(int arg0, int arg1, int arg2, boolean arg3) {
        field5236++;
        if (this.field5235 > arg2 || this.field5246 < arg2) {
            return false;
        }
        if (!arg3) {
            this.field5237 = 117;
        }
        if (arg1 < this.field5240 || arg1 > this.field5237) {
            return false;
        } else if (arg0 >= this.field5232 && arg0 <= this.field5239) {
            int var5 = arg2 - this.field5233;
            int var6 = arg0 - this.field5238;
            return var5 * var5 + var6 * var6 < this.field5247;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLqa;)V")
    public static final void method2283(byte arg0, class206 arg1) {
        if (arg0 >= -43) {
            field5245 = null;
        }
        field5241++;
        if (!(class199.field2397 >= 2 || class449.field6225) || class289.field3757 != null) {
            return;
        }
        String var2;
        if (class449.field6225 && class199.field2397 < 2) {
            var2 = class208.field2503 + class300.field3852.method987(class31.field247, 22) + class472.field6608 + " ->";
        } else if (class236.field2894 && class443.field6109.method185(53, 81) && class199.field2397 > 2) {
            var2 = class348.method1941((class99) class89.field1096.field2331.field7965.field7965, -89);
        } else {
            class99 var3 = (class99) class89.field1096.field2331.field7965;
            var2 = class348.method1941(var3, -63);
            int[] var4 = null;
            if (class240.method1361(0, var3.field1227)) {
                var4 = class449.field6217.method2026((byte) -59, (int) var3.field1235).field8766;
            } else if (var3.field1232 != -1) {
                var4 = class449.field6217.method2026((byte) -103, var3.field1232).field8766;
            } else if (class564.method3292(var3.field1227, -26)) {
                class415 var5 = (class415) class309.field3938.method2645((long) ((int) var3.field1235), (byte) -85);
                if (var5 != null) {
                    class459 var6 = var5.field5390;
                    class74 var7 = var6.field6334;
                    if (var7.field800 != null) {
                        var7 = var7.method420(class281.field3700, 90);
                    }
                    if (var7 != null) {
                        var4 = var7.field812;
                    }
                }
            } else if (class364.method2039((byte) 126, var3.field1227)) {
                Object var8 = null;
                class437 var9;
                if (var3.field1227 == 1010) {
                    var9 = class16.field126.method1759(false, (int) var3.field1235);
                } else {
                    var9 = class16.field126.method1759(false, (int) (var3.field1235 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field6004 != null) {
                    var9 = var9.method2545(-1, class281.field3700);
                }
                if (var9 != null) {
                    var4 = var9.field5967;
                }
            }
            if (var4 != null) {
                var2 = var2 + class404.method2305(0, var4);
            }
        }
        if (class199.field2397 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class199.field2397 - 2) + class590.field8556.method987(class31.field247, 22);
        }
        if (class561.field8249 != null) {
            class90 var10 = class561.field8249.method2932(arg1, 126);
            if (var10 == null) {
                var10 = class459.field6320;
            }
            var10.method547(class469.field6563, var2, class561.field8249.field7188, (byte) 11, class271.field3524, class580.field8461, class415.field5393, class450.field6228, class561.field8249.field7085, class561.field8249.field7068, class561.field8249.field7153, class561.field8249.field7059, class7.field59, class614.field8898, class561.field8249.field7094);
            class450.method2636(class415.field5393[3], class415.field5393[1], class415.field5393[2], 0, class415.field5393[0]);
        } else if (class260.field3358 != null && class486.field6795 == class341.field4399) {
            int var11 = class459.field6320.method544(class580.field8461, 0, class7.field59, var2, class612.field8881 + 4, 88, class614.field8898, class129.field1591 + 16, class271.field3524, 16777215);
            class450.method2636(16, class129.field1591, var11 + class410.field5340.method1241(var2, (byte) 0), 0, class612.field8881 + 4);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2284(byte arg0, String arg1) {
        if (arg0 < 6) {
            method2284((byte) 31, null);
        }
        field5234++;
        return class39.method207(arg1, (byte) -10, true, 10);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static final void method2285(int arg0) {
        if (arg0 != 1) {
            method2285(24);
        }
        field5230++;
        class627 var1 = null;
        try {
            class506 var2 = class74.field873.method912("3", arg0 - 4589, false);
            while (var2.field7031 == 0) {
                class462.method2688(1L, (byte) 110);
            }
            if (var2.field7031 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class627) var2.field7030;
            byte[] var3 = new byte[(int) var1.method3594(-1)];
            if (var3.length == 0) {
                class369.field4870 = "";
                class315.field4025 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3597(false, var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class374 var6 = new class374(var3);
                int var7 = var6.method2129(-122);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field4966 = var7 + 1;
                if (!var6.method2145(-10531)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field4966 = 1;
                int var8 = var6.method2129(arg0 - 77);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class315.field4025 = var6.method2125(arg0 - 12890);
                class369.field4870 = var6.method2125(-12889);
                if (var8 < 1) {
                    class62.field607 = class95.field1177;
                } else {
                    class62.field607 = var6.method2136(false);
                }
            }
        } catch (Exception var10) {
            class369.field4870 = "";
            class315.field4025 = "";
        }
        try {
            if (var1 != null) {
                var1.method3596((byte) -95);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static void method2286(int arg0) {
        field5231 = null;
        int var1 = 27 % ((arg0 + 20) / 63);
        field5245 = null;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5233 = arg0;
        this.field5247 = arg3 * arg3;
        this.field5243 = arg1;
        this.field5238 = arg2;
        this.field5232 = this.field5238 + arg8;
        this.field5240 = this.field5243 + arg6;
        this.field5235 = this.field5233 + arg4;
        this.field5246 = this.field5233 + arg5;
        this.field5237 = this.field5243 + arg7;
        this.field5239 = this.field5238 + arg9;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIIBIII)V")
    public final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        this.field5243 = arg0;
        this.field5233 = arg4;
        if (arg7 != 19) {
            this.field5246 = 38;
        }
        this.field5238 = arg6;
        this.field5247 = arg8 * arg8;
        field5244++;
        this.field5235 = this.field5233 + arg2;
        this.field5232 = this.field5238 + arg1;
        this.field5246 = this.field5233 + arg3;
        this.field5240 = this.field5243 + arg5;
        this.field5239 = this.field5238 + arg9;
        this.field5237 = this.field5243 + arg10;
    }
}
