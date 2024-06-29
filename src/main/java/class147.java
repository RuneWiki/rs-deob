import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class147 implements class245 {

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private int field1875 = -1;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private int field1893 = 0;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Log;")
    public class673 field1887;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
    private boolean field1883;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public static int[] field1871 = new int[4096];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    public static int[] field1888 = new int[8];

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[F")
    public static float[] field1891 = new float[2];

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lke;")
    public static class622 field1889 = new class622(24, -1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1879;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILjaclib/memory/Source;)Z")
    public final boolean method1010(int arg0, int arg1, Source arg2) {
        field1881++;
        int var4 = 100 % ((-arg0 - 67) / 51);
        if (this.field1874 < arg1) {
            this.method1017((byte) -128);
            if (this.field1875 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1877, this.field1875);
            OpenGL.glBufferDataARBa(this.field1877, arg1, arg2.getAddress(), this.field1883 ? 35040 : 35044);
            this.field1887.field2108 += arg1 - this.field1870;
            this.field1874 = arg1;
        } else if (this.field1875 > 0) {
            OpenGL.glBindBufferARB(this.field1877, this.field1875);
            OpenGL.glBufferSubDataARBa(this.field1877, 0, this.field1870, arg2.getAddress());
            this.field1887.field2108 += arg1 - this.field1870;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field1870 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLjaggl/MapBuffer;)Z")
    public final boolean method1011(boolean arg0, MapBuffer arg1) {
        field1869++;
        if (arg0) {
            this.method1016((byte) 72);
        }
        boolean var3 = true;
        if (this.field1893 != 0) {
            if (this.field1875 > 0) {
                OpenGL.glBindBufferARB(this.field1877, this.field1875);
                if (this.field1893 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field1877, 0, this.field1874, this.field1887.field2105.getAddress());
                } else {
                    var3 = arg1.method3716();
                }
            }
            this.field1893 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljaggl/MapBuffer;ZB)Ljaclib/memory/Buffer;")
    public final Buffer method1012(MapBuffer arg0, boolean arg1, byte arg2) {
        field1894++;
        if (arg2 >= -34) {
            field1889 = null;
        }
        if (this.field1893 == 0) {
            this.method1017((byte) -122);
            if (this.field1875 <= 0) {
                this.field1893 = 2;
                return this.field1879;
            }
            OpenGL.glBindBufferARB(this.field1877, this.field1875);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field1877, this.field1874, null, 0, this.field1883 ? 35040 : 35044);
                if (this.field1887.field2105.field9874 >= this.field1870) {
                    this.field1893 = 1;
                    return this.field1887.field2105;
                }
            }
            if (!arg0.method3717() && arg0.method3718(this.field1877, this.field1870, 35001)) {
                this.field1893 = 2;
                return arg0;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BB)Lmha;")
    public static final class433 method1013(byte[] arg0, byte arg1) {
        field1885++;
        class433 var2 = new class433();
        class120 var3 = new class120(arg0);
        var3.field1521 = var3.field1556.length - 2;
        int var4 = var3.method898((byte) -94);
        int var5 = var3.field1556.length - var4 - 16 - 2;
        var3.field1521 = var5;
        int var6 = var3.method871(arg1 + 24104);
        var2.field6167 = var3.method898((byte) -118);
        var2.field6171 = var3.method898((byte) -85);
        var2.field6169 = var3.method898((byte) -92);
        var2.field6156 = var3.method898((byte) -88);
        var2.field6164 = var3.method898((byte) -101);
        var2.field6157 = var3.method898((byte) -111);
        int var7 = var3.method842(2384);
        if (var7 > 0) {
            var2.field6158 = new class64[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method898((byte) -101);
                class64 var10 = new class64(class89.method631((byte) 75, var9));
                var2.field6158[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method871(23995);
                    int var12 = var3.method871(23995);
                    var10.method384((long) var11, new class633(var12), false);
                }
            }
        }
        var3.field1521 = 0;
        var2.field6160 = var3.method891(18540);
        var2.field6168 = new int[var6];
        int var13 = 0;
        if (arg1 != -109) {
            return null;
        }
        while (var5 > var3.field1521) {
            int var14 = var3.method898((byte) -79);
            if (var14 == 3) {
                if (var2.field6162 == null) {
                    var2.field6162 = new String[var6];
                }
                var2.field6162[var13] = var3.method861(true).intern();
            } else if (var14 == 54) {
                if (var2.field6166 == null) {
                    var2.field6166 = new long[var6];
                }
                var2.field6166[var13] = var3.method834(-8616);
            } else {
                if (var2.field6165 == null) {
                    var2.field6165 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field6165[var13] = var3.method842(2384);
                } else {
                    var2.field6165[var13] = var3.method871(23995);
                }
            }
            var2.field6168[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        field1882++;
        for (int var1 = 0; var1 < class526.field7491; var1++) {
            int var2 = class468.method2759(class526.field7491, var1 + class37.field556, 0) * class606.field8522;
            for (int var3 = 0; var3 < class606.field8522; var3++) {
                int var4 = class468.method2759(class606.field8522, var3 + class596.field8414, 0) + var2;
                if (class148.field1898[var4] == class502.field7191) {
                    class519.field7409[var4].method3618(0, 0, class692.field9768, class637.field8968, class692.field9768 * var3, class637.field8968 * var1, true, true);
                }
            }
        }
        if (arg0 != -23232) {
            method1015(64, -86, false, null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I")
    public int method51(byte arg0) {
        if (arg0 == -105) {
            field1878++;
            return this.field1870;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
    public void method50(boolean arg0, int arg1) {
        if (arg0) {
            field1891 = null;
        }
        if (arg1 > this.field1874) {
            this.method1017((byte) 25);
            if (this.field1875 <= 0) {
                this.field1879 = this.field1887.method1109(1, false, arg1);
            } else {
                OpenGL.glBindBufferARB(this.field1877, this.field1875);
                OpenGL.glBufferDataARBub(this.field1877, arg1, null, 0, this.field1883 ? 35040 : 35044);
                this.field1887.field2108 += arg1 - this.field1874;
            }
            this.field1874 = arg1;
        }
        field1876++;
        this.field1870 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLjava/lang/String;)V")
    public static final void method1015(int arg0, int arg1, boolean arg2, String arg3) {
        field1886++;
        class483.method2830(6169);
        if (arg0 == 0) {
            class638.field8979 = class685.method3869(0, class689.field9756, class359.field5219, class413.field5837, class145.field1852.field8991.method1399((byte) -66) * 2, 95);
            if (arg3 != null) {
                class638.field8979.method417(0);
                class263 var4 = class7.method45(0, 18925, class7.field79, class190.field2838);
                class67 var5 = class638.field8979.method403(var4, class625.method3579(class491.field6972, class190.field2838, 0), true);
                class127.method926(arg1 ^ 0x1);
                class54.method348(var4, false, var5, class638.field8979, true, arg3);
            }
        } else {
            class66 var6 = null;
            if (arg3 != null) {
                var6 = class685.method3869(0, class689.field9756, class359.field5219, class413.field5837, 0, 95);
                var6.method417(0);
                class263 var7 = class7.method45(0, 18925, class7.field79, class190.field2838);
                class67 var8 = var6.method403(var7, class625.method3579(class491.field6972, class190.field2838, 0), true);
                class127.method926(-1);
                class54.method348(var7, false, var8, var6, true, arg3);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class638.field8979 = class685.method3869(arg0, class689.field9756, class359.field5219, class413.field5837, class145.field1852.field8991.method1399((byte) -40) * 2, 92);
                    if (arg3 != null) {
                        var6.method417(0);
                        class263 var9 = class7.method45(0, arg1 + 18927, class7.field79, class190.field2838);
                        class67 var10 = var6.method403(var9, class625.method3579(class491.field6972, class190.field2838, 0), true);
                        class127.method926(arg1 + 1);
                        class54.method348(var9, false, var10, var6, true, arg3);
                    }
                    if (class638.field8979.method434()) {
                        boolean var11 = true;
                        try {
                            var11 = class357.field5197.field1506 > 256;
                        } catch (Throwable var28) {
                        }
                        class432 var12;
                        if (var11) {
                            var12 = class638.field8979.method508(146800640);
                        } else {
                            var12 = class638.field8979.method508(104857600);
                        }
                        class638.field8979.method439(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class145.field1852.field9002.method2258((byte) -88);
                    if (var13 == 2) {
                        class162.field2385 = true;
                    }
                    class145.field1852.method3632(class145.field1852.field9002, true, 0);
                    method1015(var13, -2, arg2, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method450(arg1 + 3);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method450(arg1 + 3);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method450(arg1 + 3);
                } catch (Throwable var27) {
                }
            }
        }
        if (arg1 != -2) {
            method1018(28);
        }
        class145.field1852.field9002.method2262((byte) -60, !arg2);
        class145.field1852.method3632(class145.field1852.field9002, true, arg0);
        class600.method3470((byte) 124);
        class638.field8979.method495(10000);
        class638.field8979.method459(32);
        class13.field256 = class638.field8979.method462();
        class235.field3402 = class638.field8979.method462();
        class17.method145((byte) 126);
        class638.field8979.method393(class145.field1852.field8992.method1925((byte) -48) == 1);
        if (class638.field8979.method497()) {
            class694.method3915(class145.field1852.field8981.method3235((byte) -48) == 1, (byte) -91);
        }
        class340.method2179(class109.field1314 >> 3, (byte) -47, class760.field10479 >> 3, class638.field8979);
        class696.method3921((byte) -21);
        class654.field9234 = true;
        class631.field8916 = null;
        class399.field5669 = false;
        class190.method1401((byte) 125);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)J")
    public final long method1016(byte arg0) {
        if (arg0 != -89) {
            this.field1887 = null;
        }
        field1880++;
        return this.field1875 == 0 ? this.field1879.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public void method47(byte arg0) {
        field1884++;
        if (this.field1875 > 0) {
            this.field1887.method3818((byte) -98, this.field1875, this.field1870);
            this.field1875 = -1;
        }
        if (arg0 > -18) {
            this.field1877 = 95;
        }
    }

    @OriginalMember(owner = "client!cg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method47((byte) -51);
        field1890++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V")
    private final void method1017(byte arg0) {
        field1892++;
        if (this.field1875 >= 0) {
            return;
        }
        int var2 = 75 % ((-arg0 - 70) / 43);
        if (this.field1887.field9540) {
            OpenGL.glGenBuffersARB(1, class452.field6504, 0);
            this.field1875 = class452.field6504[0];
            OpenGL.glBindBufferARB(this.field1877, this.field1875);
        } else {
            this.field1875 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field1871 = null;
        field1891 = null;
        if (arg0 == 16235) {
            field1889 = null;
            field1888 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    public final void method1019(int arg0) {
        if (arg0 != 0) {
            field1871 = null;
        }
        if (this.field1887.field9540) {
            OpenGL.glBindBufferARB(this.field1877, this.field1875);
        }
        field1872++;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Log;IZ)V")
    public class147(class673 arg0, int arg1, boolean arg2) {
        this.field1887 = arg0;
        this.field1883 = arg2;
        this.field1877 = arg1;
    }
}
