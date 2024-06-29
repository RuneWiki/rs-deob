import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class75 extends class433 {

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1355;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "Lgha;")
    private class347 field1353;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "Lrha;")
    private class223 field1356;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field1351 = -1;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "Z")
    public static boolean field1359 = true;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
    public static final void method702(int arg0) {
        if (arg0 != 26469) {
            method705(20, 93, 118, 24, (byte) -1, null);
        }
        class346.field4850.method2365(true);
        field1348++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III[B)V")
    public final void method703(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1352++;
        this.field1356.method1580((byte) 5, arg2, arg0, arg3);
        if (arg1 < 89) {
            method705(-99, 31, -13, 83, (byte) 112, null);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public final void method704(int arg0) {
        field1347++;
        this.field1353.method2185(0);
        int var2 = 29 / ((-arg0 - 25) / 38);
        this.field1356.method1579(-21179);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIBLhf;)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3, byte arg4, class397 arg5) {
        field1349++;
        if (arg5.field5819 == -1 && arg5.field5831 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg5.field5811 * class693.field9368.field4431.method820(-32350) >> 8;
        if (arg5.field5832 < arg1) {
            var6 += arg1 - arg5.field5832;
        } else if (arg1 < arg5.field5812) {
            var6 += arg5.field5812 - arg1;
        }
        if (arg5.field5821 < arg3) {
            var6 += arg3 - arg5.field5821;
        } else if (arg5.field5823 > arg3) {
            var6 += arg5.field5823 - arg3;
        }
        if (arg5.field5828 == 0 || arg5.field5828 < (var6 - 256) || class693.field9368.field4431.method820(-32350) == 0 || arg5.field5827 != arg2) {
            if (arg5.field5810 != null) {
                class326.field4510.method1321(arg5.field5810);
                arg5.field5820 = null;
                arg5.field5810 = null;
                arg5.field5822 = null;
            }
            if (arg5.field5807 != null) {
                class326.field4510.method1321(arg5.field5807);
                arg5.field5807 = null;
                arg5.field5817 = null;
                arg5.field5826 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field5828 - var6) * var7 / arg5.field5828;
        class58.field1147.method2457((byte) 100);
        if (arg4 != -78) {
            return;
        }
        int var9 = 8192;
        int var10 = (arg5.field5832 + arg5.field5812) / 2 - arg1;
        int var11 = (arg5.field5821 + arg5.field5823) / 2 - arg3;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class600.field8231 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 < 4096) {
                var13 = var6 * 8192 / 4096 + 8192;
            } else {
                var13 = 16384;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg5.field5810 != null) {
            arg5.field5810.method3257(var8);
            arg5.field5810.method3251(var9);
        } else if (arg5.field5819 >= 0) {
            int var14 = arg5.field5815 == 256 && arg5.field5830 == 256 ? 256 : class3.method10(arg5.field5815, arg5.field5830, (byte) -120);
            if (arg5.field5808) {
                if (arg5.field5822 == null) {
                    arg5.field5822 = class329.method2096(class107.field1877, arg5.field5819);
                }
                if (arg5.field5822 != null) {
                    if (arg5.field5820 == null) {
                        arg5.field5820 = arg5.field5822.method2094(new int[] { 22050 });
                    }
                    if (arg5.field5820 != null) {
                        class563 var18 = class563.method3253(arg5.field5820, var14, var8 << 6, var9);
                        var18.method3259(-1);
                        class326.field4510.method1324(var18);
                        arg5.field5810 = var18;
                    }
                }
            } else {
                class642 var15 = class642.method3643(class417.field6035, arg5.field5819, 0);
                if (var15 != null) {
                    class735 var16 = var15.method3640().method4052(class335.field4728);
                    class563 var17 = class563.method3253(var16, var14, var8 << 6, var9);
                    var17.method3259(-1);
                    class326.field4510.method1324(var17);
                    arg5.field5810 = var17;
                }
            }
        }
        if (arg5.field5807 != null) {
            arg5.field5807.method3257(var8);
            arg5.field5807.method3251(var9);
            if (arg5.field5807.method2311((byte) 4)) {
                return;
            }
            arg5.field5817 = null;
            arg5.field5826 = null;
            arg5.field5807 = null;
        } else if (arg5.field5831 != null && (arg5.field5804 -= arg0) <= 0) {
            int var19 = arg5.field5815 == 256 && arg5.field5830 == 256 ? 256 : arg5.field5830 + (int) (Math.random() * (double) (arg5.field5815 - arg5.field5830));
            if (arg5.field5833) {
                if (arg5.field5817 == null) {
                    int var20 = (int) ((double) arg5.field5831.length * Math.random());
                    arg5.field5817 = class329.method2096(class107.field1877, arg5.field5831[var20]);
                }
                if (arg5.field5817 != null) {
                    if (arg5.field5826 == null) {
                        arg5.field5826 = arg5.field5817.method2094(new int[] { 22050 });
                    }
                    if (arg5.field5826 != null) {
                        class563 var21 = class563.method3253(arg5.field5826, var19, var8 << 6, var9);
                        var21.method3259(0);
                        class326.field4510.method1324(var21);
                        arg5.field5807 = var21;
                        arg5.field5804 = (int) ((double) (arg5.field5802 - arg5.field5814) * Math.random()) + arg5.field5814;
                        return;
                    }
                }
                return;
            }
            int var22 = (int) (Math.random() * (double) arg5.field5831.length);
            class642 var23 = class642.method3643(class417.field6035, arg5.field5831[var22], 0);
            if (var23 != null) {
                class735 var24 = var23.method3640().method4052(class335.field4728);
                class563 var25 = class563.method3253(var24, var19, var8 << 6, var9);
                var25.method3259(0);
                class326.field4510.method1324(var25);
                arg5.field5804 = (int) ((double) (arg5.field5802 - arg5.field5814) * Math.random()) + arg5.field5814;
                arg5.field5807 = var25;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
    public final void method706(byte arg0) {
        field1358++;
        try {
            this.field1355.close();
        } catch (IOException var2) {
        }
        this.field1353.method2182(15984);
        if (arg0 == 36) {
            this.field1356.method1578((byte) -99);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB[B)I")
    public final int method707(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        int var5 = 84 / ((-arg2 - 56) / 47);
        field1350++;
        return this.field1353.method2184(arg0, arg1, 0, arg3);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Z")
    public final boolean method708(int arg0, int arg1) throws IOException {
        if (arg1 <= 91) {
            this.field1353 = null;
        }
        field1357++;
        return this.field1353.method2186(arg0, false);
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class75(Socket arg0, int arg1) throws IOException {
        this.field1355 = arg0;
        this.field1355.setSoTimeout(30000);
        this.field1355.setTcpNoDelay(true);
        this.field1353 = new class347(this.field1355.getInputStream(), arg1);
        this.field1356 = new class223(this.field1355.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!gea", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1354++;
        this.method706((byte) 36);
    }
}
