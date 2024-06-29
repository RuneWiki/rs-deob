import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class653 {

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lca;")
    private class119 field9077 = new class119();

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lca;")
    private class119 field9084 = new class119();

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Lca;")
    private class119 field9091 = new class119();

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "Lca;")
    private class119 field9093 = new class119();

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lfd;")
    private class418 field9095 = new class418(4);

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "B")
    private byte field9098 = 0;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public volatile int field9101 = 0;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public volatile int field9099 = 0;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "Lfd;")
    private class418 field9100 = new class418(8);

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Z")
    public static boolean field9086 = false;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[I")
    public static int[] field9080 = new int[6];

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    private int field9096;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "J")
    private long field9097;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "Ltf;")
    private class220 field9102;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "Ltg;")
    private class336 field9094;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZIIB)Ltf;", line = 8)
    public final class220 method3586(byte arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field9092++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class220 var8 = new class220();
        var8.field19 = arg1;
        var8.field437 = var6;
        if (arg0 != -10) {
            this.method3595(12);
        }
        var8.field2888 = arg4;
        if (arg1) {
            if (this.method3596((byte) 117) >= 20) {
                throw new RuntimeException();
            }
            this.field9077.method890((byte) -74, var8);
        } else if (this.method3597(-13051) < 20) {
            this.field9091.method890((byte) -39, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 50)
    public final void method3587(byte arg0) {
        if (this.field9094 != null) {
            this.field9094.method1926(-6983);
        }
        int var2 = -59 / ((16 - arg0) / 62);
        field9083++;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Z", line = 63)
    public final boolean method3588(byte arg0) {
        field9076++;
        if (arg0 != -11) {
            this.field9097 = -33L;
        }
        return this.method3597(-13051) >= 20;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)Z", line = 74)
    public final boolean method3589(byte arg0) {
        if (this.field9094 != null) {
            long var2 = class584.method3191(1);
            int var4 = (int) (var2 - this.field9097);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field9097 = var2;
            this.field9096 += var4;
            if (this.field9096 > 30000) {
                try {
                    this.field9094.method1923((byte) 124);
                } catch (Exception var28) {
                }
                this.field9094 = null;
            }
        }
        field9085++;
        if (this.field9094 == null) {
            return this.method3596((byte) 41) == 0 && this.method3597(-13051) == 0;
        }
        try {
            this.field9094.method1931(false);
            for (class220 var5 = (class220) this.field9077.method887(-105); var5 != null; var5 = (class220) this.field9077.method892(true)) {
                this.field9095.field5367 = 0;
                this.field9095.method2352(true, 1);
                this.field9095.method2367((byte) -75, (int) var5.field437);
                this.field9094.method1928(0, 4, this.field9095.field5393, 3);
                this.field9084.method890((byte) -60, var5);
            }
            for (class220 var6 = (class220) this.field9091.method887(-61); var6 != null; var6 = (class220) this.field9091.method892(true)) {
                this.field9095.field5367 = 0;
                this.field9095.method2352(true, 0);
                this.field9095.method2367((byte) -75, (int) var6.field437);
                this.field9094.method1928(0, 4, this.field9095.field5393, 3);
                this.field9093.method890((byte) -52, var6);
            }
            int var7 = -61 / ((-arg0 - 65) / 35);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field9094.method1925((byte) 96);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field9096 = 0;
                byte var10 = 0;
                if (this.field9102 == null) {
                    var10 = 8;
                } else if (this.field9102.field2885 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field9100.field5367;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field9094.method1929(var11, this.field9100.field5393, this.field9100.field5367, (byte) -128);
                    if (this.field9098 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field9100.field5393[this.field9100.field5367 + var12] = (byte) class392.method2234(this.field9100.field5393[this.field9100.field5367 + var12], this.field9098);
                        }
                    }
                    this.field9100.field5367 += var11;
                    if (this.field9100.field5367 >= var10) {
                        if (this.field9102 == null) {
                            this.field9100.field5367 = 0;
                            int var13 = this.field9100.method2396(-25);
                            int var14 = this.field9100.method2393(-30727);
                            int var15 = this.field9100.method2396(17);
                            int var16 = this.field9100.method2355(100);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class220 var22;
                            if (var18) {
                                for (var22 = (class220) this.field9093.method887(-83); var22 != null && var22.field437 != var19; var22 = (class220) this.field9093.method892(true)) {
                                }
                            } else {
                                for (var22 = (class220) this.field9084.method887(-97); var22 != null && var22.field437 != var19; var22 = (class220) this.field9084.method892(true)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field9102 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field9102.field2883 = new class418(var16 + var23 + this.field9102.field2888);
                            this.field9102.field2883.method2352(true, var17);
                            this.field9102.field2883.method2353(var16, (byte) -127);
                            this.field9102.field2885 = 8;
                            this.field9100.field5367 = 0;
                        } else if (this.field9102.field2885 != 0) {
                            throw new IOException();
                        } else if (this.field9100.field5393[0] == -1) {
                            this.field9102.field2885 = 1;
                            this.field9100.field5367 = 0;
                        } else {
                            this.field9102 = null;
                        }
                    }
                } else {
                    int var24 = this.field9102.field2883.field5393.length - this.field9102.field2888;
                    int var25 = 512 - this.field9102.field2885;
                    if (var25 > (var24 - this.field9102.field2883.field5367)) {
                        var25 = var24 - this.field9102.field2883.field5367;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field9094.method1929(var25, this.field9102.field2883.field5393, this.field9102.field2883.field5367, (byte) -125);
                    if (this.field9098 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field9102.field2883.field5393[this.field9102.field2883.field5367 + var26] = (byte) class392.method2234(this.field9102.field2883.field5393[this.field9102.field2883.field5367 + var26], this.field9098);
                        }
                    }
                    this.field9102.field2885 += var25;
                    this.field9102.field2883.field5367 += var25;
                    if (this.field9102.field2883.field5367 == var24) {
                        this.field9102.method237((byte) -121);
                        this.field9102.field20 = false;
                        this.field9102 = null;
                    } else if (this.field9102.field2885 == 512) {
                        this.field9102.field2885 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field9094.method1923((byte) 118);
            } catch (Exception var27) {
            }
            this.field9099 = -2;
            this.field9101++;
            this.field9094 = null;
            return this.method3596((byte) -71) == 0 && this.method3597(-13051) == 0;
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V", line = 357)
    public final void method3590(byte arg0) {
        field9079++;
        if (arg0 != -112) {
            this.method3592(true, true, null);
        }
        try {
            this.field9094.method1923((byte) 118);
        } catch (Exception var2) {
        }
        this.field9094 = null;
        this.field9098 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field9099 = -1;
        this.field9101++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V", line = 377)
    public final void method3591(boolean arg0, int arg1) {
        field9082++;
        if (this.field9094 == null) {
            return;
        }
        try {
            this.field9095.field5367 = 0;
            if (arg1 > 91) {
                this.field9095.method2352(true, arg0 ? 2 : 3);
                this.field9095.method2367((byte) -75, 0);
                this.field9094.method1928(0, 4, this.field9095.field5393, 3);
            }
        } catch (IOException var4) {
            try {
                this.field9094.method1923((byte) -87);
            } catch (Exception var3) {
            }
            this.field9099 = -2;
            this.field9094 = null;
            this.field9101++;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZZLtg;)V", line = 405)
    public final void method3592(boolean arg0, boolean arg1, class336 arg2) {
        if (this.field9094 != null) {
            try {
                this.field9094.method1923((byte) -7);
            } catch (Exception var8) {
            }
            this.field9094 = null;
        }
        field9088++;
        this.field9094 = arg2;
        this.method3599(18551);
        if (arg1) {
            return;
        }
        this.method3591(arg0, 93);
        this.field9100.field5367 = 0;
        this.field9102 = null;
        while (true) {
            class220 var4 = (class220) this.field9084.method893((byte) 105);
            if (var4 == null) {
                while (true) {
                    class220 var5 = (class220) this.field9093.method893((byte) 117);
                    if (var5 == null) {
                        if (this.field9098 != 0) {
                            try {
                                this.field9095.field5367 = 0;
                                this.field9095.method2352(!arg1, 4);
                                this.field9095.method2352(true, this.field9098);
                                this.field9095.method2386(0, 1103587288);
                                this.field9094.method1928(0, 4, this.field9095.field5393, 3);
                            } catch (IOException var7) {
                                try {
                                    this.field9094.method1923((byte) -19);
                                } catch (Exception var6) {
                                }
                                this.field9094 = null;
                                this.field9099 = -2;
                                this.field9101++;
                            }
                        }
                        this.field9096 = 0;
                        this.field9097 = class584.method3191(1);
                        return;
                    }
                    this.field9091.method890((byte) -50, var5);
                }
            }
            this.field9077.method890((byte) -9, var4);
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(B)V", line = 477)
    public final void method3593(byte arg0) {
        field9089++;
        if (arg0 > -50 || this.field9094 == null) {
            return;
        }
        try {
            this.field9095.field5367 = 0;
            this.field9095.method2352(true, 7);
            this.field9095.method2367((byte) -75, 0);
            this.field9094.method1928(0, 4, this.field9095.field5393, 3);
        } catch (IOException var3) {
            try {
                this.field9094.method1923((byte) 127);
            } catch (Exception var2) {
            }
            this.field9094 = null;
            this.field9101++;
            this.field9099 = -2;
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(B)V", line = 505)
    public static void method3594(byte arg0) {
        int var1 = 15 / ((arg0 - 81) / 35);
        field9080 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Z", line = 514)
    public final boolean method3595(int arg0) {
        field9075++;
        if (arg0 != 10230) {
            this.field9096 = -122;
        }
        return this.method3596((byte) -123) >= 20;
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(B)I", line = 529)
    public final int method3596(byte arg0) {
        int var2 = 124 / ((-arg0 - 2) / 39);
        field9087++;
        return this.field9077.method895(0) + this.field9084.method895(0);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I", line = 539)
    private final int method3597(int arg0) {
        field9081++;
        return arg0 == -13051 ? this.field9091.method895(arg0 ^ 0xFFFFCD05) + this.field9093.method895(0) : 56;
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(B)V", line = 552)
    public final void method3598(byte arg0) {
        if (arg0 > -19) {
            this.field9096 = 11;
        }
        if (this.field9094 != null) {
            this.field9094.method1923((byte) 123);
        }
        field9090++;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V", line = 575)
    private final void method3599(int arg0) {
        field9078++;
        if (this.field9094 == null) {
            return;
        }
        try {
            this.field9095.field5367 = 0;
            this.field9095.method2352(true, 6);
            if (arg0 != 18551) {
                this.method3591(true, -34);
            }
            this.field9095.method2367((byte) -75, 3);
            this.field9094.method1928(0, 4, this.field9095.field5393, 3);
        } catch (IOException var3) {
            try {
                this.field9094.method1923((byte) 123);
            } catch (Exception var2) {
            }
            this.field9099 = -2;
            this.field9094 = null;
            this.field9101++;
        }
    }
}
