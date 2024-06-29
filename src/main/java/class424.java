import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class424 {

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Lwd;")
    private class179 field5885 = new class179();

    @OriginalMember(owner = "client!du", name = "v", descriptor = "Lwd;")
    private class179 field5900 = new class179();

    @OriginalMember(owner = "client!du", name = "w", descriptor = "Lwd;")
    private class179 field5901 = new class179();

    @OriginalMember(owner = "client!du", name = "x", descriptor = "Lwd;")
    private class179 field5902 = new class179();

    @OriginalMember(owner = "client!du", name = "z", descriptor = "Lgga;")
    private class511 field5904 = new class511(4);

    @OriginalMember(owner = "client!du", name = "E", descriptor = "I")
    public volatile int field5909 = 0;

    @OriginalMember(owner = "client!du", name = "D", descriptor = "I")
    public volatile int field5908 = 0;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "B")
    private byte field5910 = 0;

    @OriginalMember(owner = "client!du", name = "C", descriptor = "Lgga;")
    private class511 field5907 = new class511(8);

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field5895 = 100;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field5898 = -1;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field5890 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!du", name = "A", descriptor = "I")
    private int field5905;

    @OriginalMember(owner = "client!du", name = "B", descriptor = "J")
    private long field5906;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "Lqu;")
    private class313 field5903;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "Lrha;")
    private class454 field5911;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2547(boolean arg0) {
        field5884++;
        if (this.field5903 != null) {
            this.field5903.method2012(0);
        }
        if (arg0) {
            this.method2558(84);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method2548(int arg0) {
        field5899++;
        if (arg0 != 20) {
            this.field5910 = 9;
        }
        return this.method2558(0) >= 20;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 34)
    private final void method2549(int arg0) {
        field5893++;
        if (this.field5903 == null) {
            return;
        }
        try {
            this.field5904.field6962 = 0;
            this.field5904.method3005(255, 6);
            this.field5904.method3026(3, (byte) -102);
            this.field5903.method2015(0, 4, this.field5904.field6979, 1);
        } catch (IOException var3) {
            try {
                this.field5903.method2011((byte) 56);
            } catch (Exception var2) {
            }
            this.field5903 = null;
            this.field5908 = -2;
            this.field5909++;
        }
        if (arg0 <= 34) {
            this.method2559(88);
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)V", line = 62)
    public final void method2550(boolean arg0) {
        field5889++;
        if (this.field5903 == null) {
            return;
        }
        try {
            this.field5904.field6962 = 0;
            this.field5904.method3005(255, 7);
            this.field5904.method3026(0, (byte) -64);
            this.field5903.method2015(0, 4, this.field5904.field6979, 1);
        } catch (IOException var3) {
            try {
                this.field5903.method2011((byte) 56);
            } catch (Exception var2) {
            }
            this.field5909++;
            this.field5908 = -2;
            this.field5903 = null;
        }
        if (arg0) {
            this.method2562(123);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 96)
    public final void method2551(byte arg0) {
        if (this.field5903 != null) {
            this.field5903.method2011((byte) 56);
        }
        int var2 = 63 % ((arg0 + 22) / 40);
        field5882++;
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)I", line = 109)
    public static final int method2552(int arg0) {
        if (arg0 != -2) {
            field5890 = 84;
        }
        field5886++;
        return class380.field5450;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)V", line = 120)
    public final void method2553(boolean arg0, int arg1) {
        field5892++;
        if (this.field5903 == null) {
            return;
        }
        try {
            this.field5904.field6962 = 0;
            this.field5904.method3005(arg1 + 257, arg0 ? 2 : 3);
            this.field5904.method3026(0, (byte) -88);
            if (arg1 == -2) {
                this.field5903.method2015(0, 4, this.field5904.field6979, 1);
            }
        } catch (IOException var4) {
            try {
                this.field5903.method2011((byte) 56);
            } catch (Exception var3) {
            }
            this.field5908 = -2;
            this.field5909++;
            this.field5903 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z", line = 148)
    public static final boolean method2554(int arg0, int arg1) {
        field5897++;
        if (arg0 > -92) {
            method2554(-85, -7);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZBIII)Lrha;", line = 160)
    public final class454 method2555(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5888++;
        if (arg3 != 4) {
            return null;
        }
        long var6 = (long) ((arg4 << 16) + arg2);
        class454 var8 = new class454();
        var8.field8954 = arg0;
        var8.field581 = var6;
        var8.field6319 = arg1;
        if (arg0) {
            if (this.method2559(arg3 - 2) >= 20) {
                throw new RuntimeException();
            }
            this.field5885.method1139((byte) -84, var8);
        } else if (this.method2558(0) < 20) {
            this.field5901.method1139((byte) -84, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZLqu;)V", line = 205)
    public final void method2556(int arg0, boolean arg1, class313 arg2) {
        if (this.field5903 != null) {
            try {
                this.field5903.method2011((byte) 56);
            } catch (Exception var8) {
            }
            this.field5903 = null;
        }
        field5896++;
        this.field5903 = arg2;
        this.method2549(63);
        this.method2553(arg1, -2);
        this.field5907.field6962 = 0;
        this.field5911 = null;
        while (true) {
            class454 var4 = (class454) this.field5900.method1137((byte) 120);
            if (var4 == null) {
                while (true) {
                    class454 var5 = (class454) this.field5902.method1137((byte) 17);
                    if (var5 == null) {
                        if (this.field5910 != 0) {
                            try {
                                this.field5904.field6962 = 0;
                                this.field5904.method3005(255, 4);
                                this.field5904.method3005(255, this.field5910);
                                this.field5904.method2986(0, 105);
                                this.field5903.method2015(0, 4, this.field5904.field6979, 1);
                            } catch (IOException var7) {
                                try {
                                    this.field5903.method2011((byte) 56);
                                } catch (Exception var6) {
                                }
                                this.field5909++;
                                this.field5903 = null;
                                this.field5908 = -2;
                            }
                        }
                        this.field5905 = 0;
                        if (arg0 > -31) {
                            return;
                        } else {
                            this.field5906 = class683.method3903((byte) 4);
                            return;
                        }
                    }
                    this.field5901.method1139((byte) -84, var5);
                }
            }
            this.field5885.method1139((byte) -84, var4);
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Z", line = 274)
    public final boolean method2557(int arg0) {
        field5891++;
        if (this.field5903 != null) {
            long var2 = class683.method3903((byte) 4);
            int var4 = (int) (var2 - this.field5906);
            this.field5906 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5905 += var4;
            if (this.field5905 > 30000) {
                try {
                    this.field5903.method2011((byte) 56);
                } catch (Exception var27) {
                }
                this.field5903 = null;
            }
        }
        if (this.field5903 == null) {
            return this.method2559(arg0 + 24843) == 0 && this.method2558(0) == 0;
        }
        try {
            this.field5903.method2008(5000);
            for (class454 var5 = (class454) this.field5885.method1140(arg0 ^ 0x6170); var5 != null; var5 = (class454) this.field5885.method1138(116)) {
                this.field5904.field6962 = 0;
                this.field5904.method3005(255, 1);
                this.field5904.method3026((int) var5.field581, (byte) -87);
                this.field5903.method2015(0, 4, this.field5904.field6979, 1);
                this.field5900.method1139((byte) -84, var5);
            }
            for (class454 var6 = (class454) this.field5901.method1140(-96); var6 != null; var6 = (class454) this.field5901.method1138(arg0 ^ 0xFFFF9E8F)) {
                this.field5904.field6962 = 0;
                this.field5904.method3005(255, 0);
                this.field5904.method3026((int) var6.field581, (byte) -66);
                this.field5903.method2015(0, 4, this.field5904.field6979, 1);
                this.field5902.method1139((byte) -84, var6);
            }
            if (arg0 != -24841) {
                this.method2556(116, true, null);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5903.method2013((byte) 106);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5905 = 0;
                byte var9 = 0;
                if (this.field5911 == null) {
                    var9 = 8;
                } else if (this.field5911.field6323 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5907.field6962;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5903.method2017(-95, var10, this.field5907.field6979, this.field5907.field6962);
                    if (this.field5910 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5907.field6979[this.field5907.field6962 + var11] = (byte) class475.method2835(this.field5907.field6979[this.field5907.field6962 + var11], this.field5910);
                        }
                    }
                    this.field5907.field6962 += var10;
                    if (this.field5907.field6962 >= var9) {
                        if (this.field5911 == null) {
                            this.field5907.field6962 = 0;
                            int var12 = this.field5907.method3013(-112);
                            int var13 = this.field5907.method3002(-1);
                            int var14 = this.field5907.method3013(35);
                            int var15 = this.field5907.method3008(64);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class454 var21;
                            if (var17) {
                                for (var21 = (class454) this.field5902.method1140(-98); var21 != null && var21.field581 != var18; var21 = (class454) this.field5902.method1138(117)) {
                                }
                            } else {
                                for (var21 = (class454) this.field5900.method1140(-103); var21 != null && var21.field581 != var18; var21 = (class454) this.field5900.method1138(122)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field5911 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5911.field6324 = new class511(var15 + var22 + this.field5911.field6319);
                            this.field5911.field6324.method3005(255, var16);
                            this.field5911.field6324.method3003(var15, -23061);
                            this.field5907.field6962 = 0;
                            this.field5911.field6323 = 8;
                        } else if (this.field5911.field6323 != 0) {
                            throw new IOException();
                        } else if (this.field5907.field6979[0] == -1) {
                            this.field5907.field6962 = 0;
                            this.field5911.field6323 = 1;
                        } else {
                            this.field5911 = null;
                        }
                    }
                } else {
                    int var23 = this.field5911.field6324.field6979.length - this.field5911.field6319;
                    int var24 = 512 - this.field5911.field6323;
                    if (var24 > var23 - this.field5911.field6324.field6962) {
                        var24 = var23 - this.field5911.field6324.field6962;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5903.method2017(98, var24, this.field5911.field6324.field6979, this.field5911.field6324.field6962);
                    if (this.field5910 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5911.field6324.field6979[this.field5911.field6324.field6962 + var25] = (byte) class475.method2835(this.field5911.field6324.field6979[this.field5911.field6324.field6962 + var25], this.field5910);
                        }
                    }
                    this.field5911.field6324.field6962 += var24;
                    this.field5911.field6323 += var24;
                    if (this.field5911.field6324.field6962 == var23) {
                        this.field5911.method416(9867);
                        this.field5911.field8952 = false;
                        this.field5911 = null;
                    } else if (this.field5911.field6323 == 512) {
                        this.field5911.field6323 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5903.method2011((byte) 56);
            } catch (Exception var26) {
            }
            this.field5909++;
            this.field5908 = -2;
            this.field5903 = null;
            return this.method2559(2) == 0 && this.method2558(0) == 0;
        }
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)I", line = 550)
    private final int method2558(int arg0) {
        field5881++;
        return arg0 == 0 ? this.field5901.method1141((byte) 78) + this.field5902.method1141((byte) 67) : 37;
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(I)I", line = 562)
    public final int method2559(int arg0) {
        field5880++;
        return arg0 == 2 ? this.field5885.method1141((byte) 60) + this.field5900.method1141((byte) -61) : 121;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB[I[I)V", line = 582)
    public static final void method2560(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4) {
        if (arg2 <= 11) {
            method2554(-111, -8);
        }
        field5894++;
        if (arg1 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if ((var10 & var9) + var7 > arg3[var10]) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                int var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg3[arg0] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg0] = arg4[var6];
        arg4[var6] = var8;
        method2560(var6 - 1, arg1, (byte) 41, arg3, arg4);
        method2560(arg0, var6 + 1, (byte) 45, arg3, arg4);
    }

    @OriginalMember(owner = "client!du", name = "g", descriptor = "(I)V", line = 642)
    public final void method2561(int arg0) {
        try {
            this.field5903.method2011((byte) 56);
        } catch (Exception var2) {
        }
        field5879++;
        this.field5909++;
        this.field5910 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        this.field5903 = null;
        this.field5908 = -1;
    }

    @OriginalMember(owner = "client!du", name = "h", descriptor = "(I)Z", line = 657)
    public final boolean method2562(int arg0) {
        if (arg0 != 20) {
            this.field5905 = -51;
        }
        field5887++;
        return this.method2559(2) >= 20;
    }
}
