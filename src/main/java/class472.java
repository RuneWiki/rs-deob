import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class472 extends class130 {

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Lua;")
    public static class455 field6928 = new class455(8);

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Lpn;")
    public static class49 field6931 = new class49(60, 8);

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Ljp;")
    public static class55 field6935 = new class55(16, 17);

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[J")
    public static long[] field6936 = new long[256];

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "J")
    public long field6926;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lgk;")
    public class472 field6921;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lgk;")
    public class472 field6924;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lum;")
    public static class83 field6932;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public final void method2859(int arg0) {
        field6934++;
        if (arg0 < -96 && this.field6921 != null) {
            this.field6921.field6924 = this.field6924;
            this.field6924.field6921 = this.field6921;
            this.field6924 = null;
            this.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)Z")
    public final boolean method2860(int arg0) {
        field6925++;
        if (this.field6921 == null) {
            return false;
        } else {
            return arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method2861(int arg0, byte arg1, String arg2) {
        field6922++;
        class81.field1326++;
        class110.method857(4095, class87.field1427);
        class312.field4752.method1381(class447.method2755(arg2, (byte) 116) + 1, (byte) 100);
        class312.field4752.method1343(arg2, (byte) -14);
        class312.field4752.method1381(arg0, (byte) 107);
        if (arg1 > -66) {
            field6932 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Luu;IZ)Z")
    public static final boolean method2862(class428 arg0, int arg1, boolean arg2) {
        field6929++;
        int var3 = arg0.method2671(-123, 2);
        if (var3 == 0) {
            if (arg0.method2671(-120, 1) != 0) {
                method2862(arg0, arg1, arg2);
            }
            int var4 = arg0.method2671(-126, 6);
            int var5 = arg0.method2671(-119, 6);
            boolean var6 = arg0.method2671(-122, 1) == 1;
            if (var6) {
                class132.field1944[class342.field5111++] = arg1;
            }
            if (class530.field7747[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class463 var7 = class434.field6453[arg1];
            class511 var8 = class530.field7747[arg1] = new class511();
            var8.field7562 = arg1;
            if (class447.field6645[arg1] != null) {
                var8.method3040(class447.field6645[arg1], true);
            }
            var8.method3100(0, var7.field6855, true);
            var8.field7624 = var7.field6853;
            int var9 = var7.field6862;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field7448 = var7.field6856;
            var8.field7649[0] = class438.field6537[arg1];
            var8.field1274 = (byte) var10;
            var8.method3048((var11 << 6) + var4 - class422.field6201, (var12 << 6) + var5 + -class23.field273, true);
            var8.field7479 = false;
            class434.field6453[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method2671(-114, 2);
            int var14 = class434.field6453[arg1].field6862;
            class434.field6453[arg1].field6862 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method2671(-122, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class434.field6453[arg1].field6862;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD0DD) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class434.field6453[arg1].field6862 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method2671(-120, 18);
            if (!arg2) {
                field6931 = null;
            }
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class434.field6453[arg1].field6862;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class434.field6453[arg1].field6862 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)V")
    public static final void method2863(int arg0, int arg1, boolean arg2) {
        field6923++;
        if (arg1 == 0) {
            class376.field5542 = class299.method1995(class130.field1930, arg0 ^ 0xFFFF833C, class342.field5114, class40.field667.field4212 * 2, class122.field1844, arg1);
        } else {
            if (arg2) {
                class376.field5542 = class299.method1995(class130.field1930, 106, class342.field5114, 0, class122.field1844, 0);
                class376.field5542.method567(0);
                class29 var3 = class367.method2334(-121, 0, class380.field5596, class312.field4754);
                class310 var4 = class376.field5542.method542(var3, class309.method2045(class510.field7431, class380.field5596, 0), true);
                class51.method334(var4, class185.field2838.method1265(class345.field5141, -83), 6, true);
                class376.field5542.method530();
                class27.method163((byte) 93);
                class376.field5542.method1988((byte) -48);
            }
            try {
                class376.field5542 = class299.method1995(class130.field1930, 87, class342.field5114, class40.field667.field4212 * 2, class122.field1844, arg1);
                if (class376.field5542.method528()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class393 var6;
                    if (var5) {
                        var6 = class376.field5542.method605(146800640);
                    } else {
                        var6 = class376.field5542.method605(104857600);
                    }
                    class376.field5542.method535(var6);
                }
            } catch (Throwable var8) {
                class376.field5542 = class299.method1995(class130.field1930, 90, class342.field5114, 0, class122.field1844, 0);
                arg1 = 0;
            }
        }
        class108.field1631 = arg1;
        class344.method2213(true);
        if (!class376.field5542.method560()) {
            class81.field1331 = 1;
        }
        class376.field5542.method504(class81.field1331);
        class376.field5542.method549(0);
        class376.field5542.method500(8);
        class517.field7515 = class376.field5542.method496();
        class510.field7421 = class376.field5542.method496();
        class129.method944(0);
        class376.field5542.method591(!class40.field667.field4220);
        if (class376.field5542.method515()) {
            class223.method1544((byte) 124, class40.field667.field4202);
        }
        class114.method873((byte) 96, class338.field5076 >> 3, class376.field5542, class250.field4077 >> 3);
        if (arg0 == -31876) {
            class483.method2912((byte) -50);
            class129.field1923 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method2864(byte arg0) {
        field6931 = null;
        field6928 = null;
        field6932 = null;
        field6935 = null;
        if (arg0 != 15) {
            field6935 = null;
        }
        field6936 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6936[var0] = var1;
        }
    }
}
