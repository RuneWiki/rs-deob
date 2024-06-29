import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class405 extends class739 {

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field5772 = -1;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lfba;")
    public static class348 field5767 = new class348(8);

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field5774 = -1;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field5766;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            this.method445(false, 47);
        }
        if (super.field10317.field2170) {
            int[][] var4 = this.method4124(arg1, 0, !arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class399.field5703; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILhga;Ljava/awt/Component;BI)Lmda;")
    public static final class349 method2460(int arg0, class300 arg1, Component arg2, byte arg3, int arg4) {
        if (arg3 <= 38) {
            method2463((byte) -28, 12);
        }
        ++field5773;
        if (~class132.field1821 == -1) {
            throw new IllegalStateException();
        } else if (~arg0 <= -1 && arg0 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class349 var5 = (class349) Class.forName("sp").newInstance();
                var5.field5159 = new int[256 * (class147.field2155 ? 2 : 1)];
                var5.field5190 = arg4;
                var5.method2232(arg2);
                var5.field5179 = (arg4 & -1024) - -1024;
                if (~var5.field5179 < -16385) {
                    var5.field5179 = 16384;
                }
                var5.method2222(var5.field5179);
                if (class685.field9730 > 0 && class579.field8295 == null) {
                    class579.field8295 = new class383();
                    class579.field8295.field5543 = arg1;
                    arg1.method1872(class685.field9730, false, class579.field8295);
                }
                if (class579.field8295 != null) {
                    if (class579.field8295.field5539[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class579.field8295.field5539[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class570 var6 = new class570(arg1, arg0);
                    var6.field5159 = new int[256 * (!class147.field2155 ? 1 : 2)];
                    var6.field5190 = arg4;
                    var6.method2232(arg2);
                    var6.field5179 = 16384;
                    var6.method2222(var6.field5179);
                    if (~class685.field9730 < -1 && class579.field8295 == null) {
                        class579.field8295 = new class383();
                        class579.field8295.field5543 = arg1;
                        arg1.method1872(class685.field9730, false, class579.field8295);
                    }
                    if (class579.field8295 != null) {
                        if (class579.field8295.field5539[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class579.field8295.field5539[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class349();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class405() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2461(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 13511) {
            method2462(116, (byte[]) null);
        }
        ++field5769;
        byte[] var3 = new byte[arg0];
        class85.method683(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B)V")
    public static final void method2462(int arg0, byte[] arg1) {
        int var2 = -52 / ((arg0 - -59) / 58);
        ++field5771;
        class479 var3 = new class479(arg1);
        while (true) {
            int var4;
            label45: do {
                while (true) {
                    while (true) {
                        var4 = var3.method2886(true);
                        if (~var4 == -1) {
                            return;
                        }
                        if (var4 != 1) {
                            if (~var4 != -5) {
                                continue label45;
                            }
                            int var7 = var3.method2886(true);
                            class39.field675 = new int[var7];
                            for (int var8 = 0; var8 < var7; ++var8) {
                                class39.field675[var8] = var3.method2882(-1);
                                if (class39.field675[var8] == 65535) {
                                    class39.field675[var8] = -1;
                                }
                            }
                        } else {
                            int[] var9 = class468.field6657 = new int[6];
                            var9[0] = var3.method2882(-1);
                            var9[1] = var3.method2882(-1);
                            var9[2] = var3.method2882(-1);
                            var9[3] = var3.method2882(-1);
                            var9[4] = var3.method2882(-1);
                            var9[5] = var3.method2882(-1);
                        }
                    }
                }
            } while (~var4 != -6);
            int var5 = var3.method2886(true);
            class332.field4514 = new int[var5];
            for (int var6 = 0; var6 < var5; ++var6) {
                class332.field4514[var6] = var3.method2882(-1);
                if (class332.field4514[var6] == 65535) {
                    class332.field4514[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
    public static final void method2463(byte arg0, int arg1) {
        if (arg0 >= -104) {
            field5774 = 16;
        }
        ++field5768;
        class394 var2 = (class394) class186.field2611.method4020((long) arg1, (byte) -86);
        if (var2 != null) {
            var2.field5658.method3993((byte) -88);
            class264.method1745(var2.field5659, true, var2.field5661);
            var2.method2656((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static void method2464(int arg0) {
        if (arg0 >= -92) {
            field5767 = null;
        }
        field5767 = null;
    }
}
