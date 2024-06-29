import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class196 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lvv;")
    private class531 field2862 = new class531();

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lvv;")
    private class531 field2872 = new class531();

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lvv;")
    private class531 field2878 = new class531();

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lvv;")
    private class531 field2880 = new class531();

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lsv;")
    private class319 field2881 = new class319(4);

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public volatile int field2887 = 0;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "B")
    private byte field2885 = 0;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public volatile int field2888 = 0;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lsv;")
    private class319 field2886 = new class319(8);

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lsn;")
    public static class205 field2875;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lrb;")
    public static class283 field2879;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "J")
    private long field2883;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lan;")
    public static class184 field2877;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lml;")
    private class27 field2884;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Lop;")
    private class296 field2889;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
    public static int[] field2873;

    static {
        new class157(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field2876 = 0;
        field2875 = new class205(4, 14);
        field2879 = new class283(55, 3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILdk;)V", line = 4)
    public static final void method1279(int arg0, class421 arg1) {
        if (arg0 != -1) {
            field2876 = -108;
        }
        field2867++;
        class383.field5501 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z", line = 18)
    public final boolean method1280(byte arg0) {
        if (arg0 != 123) {
            field2876 = 92;
        }
        field2861++;
        return this.method1289(121) >= 20;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 30)
    public final void method1281(byte arg0) {
        field2863++;
        if (this.field2884 == null) {
            return;
        }
        try {
            if (arg0 >= 49) {
                this.field2881.field4360 = 0;
                this.field2881.method1891(false, 7);
                this.field2881.method1855((byte) -34, 0);
                this.field2884.method180(0, 4, 18170, this.field2881.field4336);
            }
        } catch (IOException var3) {
            try {
                this.field2884.method172(12292);
            } catch (Exception var2) {
            }
            this.field2884 = null;
            this.field2887++;
            this.field2888 = -2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 60)
    public final void method1282(int arg0) {
        field2869++;
        if (arg0 >= 72 && this.field2884 != null) {
            this.field2884.method172(12292);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Z", line = 73)
    public final boolean method1283(int arg0) {
        if (this.field2884 != null) {
            long var2 = class254.method1522((byte) -51);
            int var4 = (int) (var2 - this.field2883);
            this.field2883 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2882 += var4;
            if (this.field2882 > 30000) {
                try {
                    this.field2884.method172(12292);
                } catch (Exception var28) {
                }
                this.field2884 = null;
            }
        }
        field2858++;
        int var5 = 54 / ((-arg0 - 10) / 44);
        if (this.field2884 == null) {
            return this.method1288(true) == 0 && this.method1289(-30) == 0;
        }
        try {
            this.field2884.method176(4);
            for (class296 var6 = (class296) this.field2862.method3152(false); var6 != null; var6 = (class296) this.field2862.method3153((byte) -57)) {
                this.field2881.field4360 = 0;
                this.field2881.method1891(false, 1);
                this.field2881.method1855((byte) 112, (int) var6.field3883);
                this.field2884.method180(0, 4, 18170, this.field2881.field4336);
                this.field2872.method3150(16711680, var6);
            }
            for (class296 var7 = (class296) this.field2878.method3152(false); var7 != null; var7 = (class296) this.field2878.method3153((byte) 68)) {
                this.field2881.field4360 = 0;
                this.field2881.method1891(false, 0);
                this.field2881.method1855((byte) -58, (int) var7.field3883);
                this.field2884.method180(0, 4, 18170, this.field2881.field4336);
                this.field2880.method3150(16711680, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field2884.method181(-1);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2882 = 0;
                byte var10 = 0;
                if (this.field2889 == null) {
                    var10 = 8;
                } else if (this.field2889.field3999 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field2889.field3995.field4336.length - this.field2889.field4002;
                    int var12 = 512 - this.field2889.field3999;
                    if (var12 > (var11 - this.field2889.field3995.field4360)) {
                        var12 = var11 - this.field2889.field3995.field4360;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field2884.method177(var12, this.field2889.field3995.field4336, this.field2889.field3995.field4360, 108);
                    if (this.field2885 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field2889.field3995.field4336[this.field2889.field3995.field4360 + var13] = (byte) class373.method2233(this.field2889.field3995.field4336[this.field2889.field3995.field4360 + var13], this.field2885);
                        }
                    }
                    this.field2889.field3995.field4360 += var12;
                    this.field2889.field3999 += var12;
                    if (this.field2889.field3995.field4360 == var11) {
                        this.field2889.method1645(-107);
                        this.field2889.field4123 = false;
                        this.field2889 = null;
                    } else if (this.field2889.field3999 == 512) {
                        this.field2889.field3999 = 0;
                    }
                } else {
                    int var14 = var10 - this.field2886.field4360;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field2884.method177(var14, this.field2886.field4336, this.field2886.field4360, 122);
                    if (this.field2885 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field2886.field4336[this.field2886.field4360 + var15] = (byte) class373.method2233(this.field2886.field4336[this.field2886.field4360 + var15], this.field2885);
                        }
                    }
                    this.field2886.field4360 += var14;
                    if (var10 <= this.field2886.field4360) {
                        if (this.field2889 == null) {
                            this.field2886.field4360 = 0;
                            int var16 = this.field2886.method1869(-101);
                            int var17 = this.field2886.method1844(-109);
                            int var18 = this.field2886.method1869(-94);
                            int var19 = this.field2886.method1863(-1);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class296 var25;
                            if (var21) {
                                for (var25 = (class296) this.field2880.method3152(false); var25 != null && var25.field3883 != var22; var25 = (class296) this.field2880.method3153((byte) 91)) {
                                }
                            } else {
                                for (var25 = (class296) this.field2872.method3152(false); var25 != null && var25.field3883 != var22; var25 = (class296) this.field2872.method3153((byte) -49)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field2889 = var25;
                            this.field2889.field3995 = new class319(var26 + this.field2889.field4002 + var19);
                            this.field2889.field3995.method1891(false, var20);
                            this.field2889.field3995.method1858(var19, (byte) -20);
                            this.field2889.field3999 = 8;
                            this.field2886.field4360 = 0;
                        } else if (this.field2889.field3999 != 0) {
                            throw new IOException();
                        } else if (this.field2886.field4336[0] == -1) {
                            this.field2889.field3999 = 1;
                            this.field2886.field4360 = 0;
                        } else {
                            this.field2889 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field2884.method172(12292);
            } catch (Exception var27) {
            }
            this.field2887++;
            this.field2884 = null;
            this.field2888 = -2;
            return this.method1288(true) == 0 && this.method1289(102) == 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 348)
    public final void method1284(int arg0) {
        field2857++;
        if (arg0 == 0 && this.field2884 != null) {
            this.field2884.method174(-1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILml;Z)V", line = 364)
    public final void method1285(int arg0, class27 arg1, boolean arg2) {
        if (this.field2884 != null) {
            try {
                this.field2884.method172(12292);
            } catch (Exception var8) {
            }
            this.field2884 = null;
        }
        field2874++;
        this.field2884 = arg1;
        this.method1293(true);
        this.method1295(arg2, (byte) 113);
        this.field2886.field4360 = arg0;
        this.field2889 = null;
        while (true) {
            class296 var4 = (class296) this.field2872.method3148(true);
            if (var4 == null) {
                while (true) {
                    class296 var5 = (class296) this.field2880.method3148(true);
                    if (var5 == null) {
                        if (this.field2885 != 0) {
                            try {
                                this.field2881.field4360 = 0;
                                this.field2881.method1891(false, 4);
                                this.field2881.method1891(false, this.field2885);
                                this.field2881.method1857(561746448, 0);
                                this.field2884.method180(0, 4, 18170, this.field2881.field4336);
                            } catch (IOException var7) {
                                try {
                                    this.field2884.method172(12292);
                                } catch (Exception var6) {
                                }
                                this.field2888 = -2;
                                this.field2887++;
                                this.field2884 = null;
                            }
                        }
                        this.field2882 = 0;
                        this.field2883 = class254.method1522((byte) -51);
                        return;
                    }
                    this.field2878.method3150(16711680, var5);
                }
            }
            this.field2862.method3150(16711680, var4);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljp;IZBIII)V", line = 433)
    public static final void method1286(class55 arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2865++;
        if (class40.field602 >= 50 || arg0 == null || arg0.field812 == null || arg0.field812.length <= arg6 || arg0.field812[arg6] == null) {
            return;
        }
        int var7 = arg0.field812[arg6][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg0.field812[arg6].length > 1) {
            int var11 = (int) (Math.random() * (double) arg0.field812[arg6].length);
            if (var11 > 0) {
                var8 = arg0.field812[arg6][var11];
            }
        }
        if (var10 == 0) {
            if (arg2) {
                class431.method2558(255, 0, -1, var8, var9);
            }
        } else if (class76.field1075.field3682 != 0) {
            int var12 = arg5 - 64 >> 7;
            int var13 = arg1 - 64 >> 7;
            class320.field4411[class40.field602++] = new class441(arg3, var8, var9, 0, 255, (var13 << 8) + ((arg4 << 24) + (var12 << 16)) + var10);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 485)
    public static void method1287(byte arg0) {
        if (arg0 >= -2) {
            method1279(-41, null);
        }
        field2873 = null;
        field2879 = null;
        field2875 = null;
        field2877 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)I", line = 499)
    public final int method1288(boolean arg0) {
        field2864++;
        if (!arg0) {
            this.field2883 = -75L;
        }
        return this.field2862.method3147(false) + this.field2872.method3147(false);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I", line = 510)
    private final int method1289(int arg0) {
        int var2 = -91 % ((44 - arg0) / 42);
        field2856++;
        return this.field2878.method3147(false) + this.field2880.method3147(false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Frame;Lor;)V", line = 520)
    public static final void method1290(int arg0, Frame arg1, class173 arg2) {
        field2866++;
        while (true) {
            class464 var3 = arg2.method1194(arg1, arg0 ^ 0xFFFFC773);
            while (var3.field6699 == 0) {
                class334.method2047(10L, arg0 + 14477);
            }
            if (var3.field6699 == 1) {
                if (arg0 != -14477) {
                    method1279(-16, null);
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class334.method2047(100L, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIZI)Lop;", line = 549)
    public final class296 method1291(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2870++;
        long var6 = (long) ((arg1 << 16) + arg2);
        class296 var8 = new class296();
        var8.field4125 = arg3;
        int var9 = 108 % ((arg4 + 15) / 53);
        var8.field3883 = var6;
        var8.field4002 = arg0;
        if (arg3) {
            if (this.method1288(true) >= 20) {
                throw new RuntimeException();
            }
            this.field2862.method3150(16711680, var8);
        } else if (this.method1289(99) < 20) {
            this.field2878.method3150(16711680, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Z", line = 590)
    public final boolean method1292(boolean arg0) {
        if (!arg0) {
            this.field2862 = null;
        }
        field2860++;
        return this.method1288(true) >= 20;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V", line = 601)
    private final void method1293(boolean arg0) {
        field2868++;
        if (this.field2884 == null) {
            return;
        }
        try {
            this.field2881.field4360 = 0;
            this.field2881.method1891(false, 6);
            if (!arg0) {
                this.method1293(false);
            }
            this.field2881.method1855((byte) -109, 3);
            this.field2884.method180(0, 4, 18170, this.field2881.field4336);
        } catch (IOException var3) {
            try {
                this.field2884.method172(12292);
            } catch (Exception var2) {
            }
            this.field2884 = null;
            this.field2888 = -2;
            this.field2887++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 631)
    public final void method1294(int arg0) {
        field2871++;
        try {
            this.field2884.method172(12292);
        } catch (Exception var2) {
        }
        this.field2884 = null;
        this.field2888 = -1;
        this.field2885 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
        this.field2887++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZB)V", line = 658)
    public final void method1295(boolean arg0, byte arg1) {
        field2859++;
        if (this.field2884 == null) {
            return;
        }
        try {
            this.field2881.field4360 = 0;
            if (arg1 >= 89) {
                this.field2881.method1891(false, arg0 ? 2 : 3);
                this.field2881.method1855((byte) 127, 0);
                this.field2884.method180(0, 4, 18170, this.field2881.field4336);
            }
        } catch (IOException var4) {
            try {
                this.field2884.method172(12292);
            } catch (Exception var3) {
            }
            this.field2888 = -2;
            this.field2884 = null;
            this.field2887++;
        }
    }
}
