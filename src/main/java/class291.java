import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class291 {

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lpf;")
    private class30 field4253 = new class30();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lpf;")
    private class30 field4259 = new class30();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lpf;")
    private class30 field4260 = new class30();

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lpf;")
    private class30 field4261 = new class30();

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lol;")
    private class431 field4265 = new class431(4);

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public volatile int field4268 = 0;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public volatile int field4266 = 0;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "B")
    private byte field4269 = 0;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lol;")
    private class431 field4267 = new class431(8);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Z")
    public static volatile boolean field4243 = true;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    private int field4262;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "J")
    private long field4263;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Led;")
    private class626 field4264;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lfu;")
    private class80 field4270;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lmq;")
    public static class85 field4252;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1834(byte arg0) {
        field4252 = null;
        int var1 = 11 % ((arg0 + 30) / 49);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    private final void method1835(int arg0) {
        field4255++;
        if (this.field4264 == null) {
            return;
        }
        try {
            this.field4265.field5983 = 0;
            this.field4265.method2524(false, 6);
            this.field4265.method2535((byte) 117, 3);
            this.field4264.method3583(true, 4, 0, this.field4265.field6002);
            if (arg0 != -1) {
                this.field4268 = -7;
            }
        } catch (IOException var3) {
            try {
                this.field4264.method3581(-121);
            } catch (Exception var2) {
            }
            this.field4268++;
            this.field4264 = null;
            this.field4266 = -2;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method1836(int arg0) {
        field4257++;
        if (this.field4264 == null) {
            return;
        }
        try {
            this.field4265.field5983 = 0;
            this.field4265.method2524(false, 7);
            this.field4265.method2535((byte) 122, 0);
            if (arg0 != -6630) {
                this.method1847((byte) 8);
            }
            this.field4264.method3583(true, 4, 0, this.field4265.field6002);
        } catch (IOException var3) {
            try {
                this.field4264.method3581(126);
            } catch (Exception var2) {
            }
            this.field4264 = null;
            this.field4266 = -2;
            this.field4268++;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method1837(int arg0) {
        field4246++;
        try {
            this.field4264.method3581(arg0 ^ 0xFFFFFF88);
        } catch (Exception var2) {
        }
        this.field4264 = null;
        this.field4266 = -1;
        this.field4268++;
        this.field4269 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)I")
    private final int method1838(int arg0) {
        if (arg0 != -21) {
            this.method1840(-17);
        }
        field4249++;
        return this.field4260.method252(false) + this.field4261.method252(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIZ)Lfu;")
    public final class80 method1839(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4244++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class80 var8 = new class80();
        var8.field6209 = var6;
        var8.field1190 = arg0;
        if (arg3 < 100) {
            return null;
        }
        var8.field10170 = arg4;
        if (arg4) {
            if (this.method1840(83) >= 20) {
                throw new RuntimeException();
            }
            this.field4253.method248((byte) 43, var8);
        } else if (this.method1838(-21) < 20) {
            this.field4260.method248((byte) 123, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)I")
    public final int method1840(int arg0) {
        field4256++;
        return arg0 < 63 ? 8 : this.field4253.method252(false) + this.field4259.method252(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLed;Z)V")
    public final void method1841(byte arg0, class626 arg1, boolean arg2) {
        field4250++;
        if (this.field4264 != null) {
            try {
                this.field4264.method3581(arg0 ^ 0x77);
            } catch (Exception var8) {
            }
            this.field4264 = null;
        }
        this.field4264 = arg1;
        this.method1835(-1);
        this.method1842(arg0 ^ 0x8, arg2);
        this.field4270 = null;
        if (arg0 != -10) {
            this.field4260 = null;
        }
        this.field4267.field5983 = 0;
        while (true) {
            class80 var4 = (class80) this.field4259.method247(-32331);
            if (var4 == null) {
                while (true) {
                    class80 var5 = (class80) this.field4261.method247(-32331);
                    if (var5 == null) {
                        if (this.field4269 != 0) {
                            try {
                                this.field4265.field5983 = 0;
                                this.field4265.method2524(false, 4);
                                this.field4265.method2524(false, this.field4269);
                                this.field4265.method2546(true, 0);
                                this.field4264.method3583(true, 4, 0, this.field4265.field6002);
                            } catch (IOException var7) {
                                try {
                                    this.field4264.method3581(arg0 ^ 0xFFFFFF99);
                                } catch (Exception var6) {
                                }
                                this.field4264 = null;
                                this.field4266 = -2;
                                this.field4268++;
                            }
                        }
                        this.field4262 = 0;
                        this.field4263 = class337.method2062(false);
                        return;
                    }
                    this.field4260.method248((byte) 77, var5);
                }
            }
            this.field4253.method248((byte) 96, var4);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    public final void method1842(int arg0, boolean arg1) {
        if (arg0 != -2) {
            this.method1848(72);
        }
        field4251++;
        if (this.field4264 == null) {
            return;
        }
        try {
            this.field4265.field5983 = 0;
            this.field4265.method2524(false, arg1 ? 2 : 3);
            this.field4265.method2535((byte) 125, 0);
            this.field4264.method3583(true, 4, 0, this.field4265.field6002);
        } catch (IOException var4) {
            try {
                this.field4264.method3581(-123);
            } catch (Exception var3) {
            }
            this.field4264 = null;
            this.field4266 = -2;
            this.field4268++;
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Z")
    public final boolean method1843(int arg0) {
        if (arg0 == -21) {
            field4242++;
            return this.method1838(-21) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Z")
    public final boolean method1844(byte arg0) {
        if (arg0 != 22) {
            this.field4262 = -117;
        }
        if (this.field4264 != null) {
            long var2 = class337.method2062(false);
            int var4 = (int) (var2 - this.field4263);
            this.field4263 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4262 += var4;
            if (this.field4262 > 30000) {
                try {
                    this.field4264.method3581(-122);
                } catch (Exception var27) {
                }
                this.field4264 = null;
            }
        }
        field4247++;
        if (this.field4264 == null) {
            return this.method1840(125) == 0 && this.method1838(arg0 - 43) == 0;
        }
        try {
            this.field4264.method3584((byte) -32);
            for (class80 var5 = (class80) this.field4253.method249(arg0 + 18349); var5 != null; var5 = (class80) this.field4253.method254((byte) -64)) {
                this.field4265.field5983 = 0;
                this.field4265.method2524(false, 1);
                this.field4265.method2535((byte) 119, (int) var5.field6209);
                this.field4264.method3583(true, 4, 0, this.field4265.field6002);
                this.field4259.method248((byte) 100, var5);
            }
            for (class80 var6 = (class80) this.field4260.method249(arg0 ^ 0x47D5); var6 != null; var6 = (class80) this.field4260.method254((byte) -64)) {
                this.field4265.field5983 = 0;
                this.field4265.method2524(false, 0);
                this.field4265.method2535((byte) 122, (int) var6.field6209);
                this.field4264.method3583(true, 4, 0, this.field4265.field6002);
                this.field4261.method248((byte) 115, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4264.method3586(true);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4262 = 0;
                byte var9 = 0;
                if (this.field4270 == null) {
                    var9 = 8;
                } else if (this.field4270.field1192 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4267.field5983;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field4264.method3579(var10, this.field4267.field6002, 0, this.field4267.field5983);
                    if (this.field4269 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4267.field6002[this.field4267.field5983 + var11] = (byte) class172.method1269(this.field4267.field6002[this.field4267.field5983 + var11], this.field4269);
                        }
                    }
                    this.field4267.field5983 += var10;
                    if (this.field4267.field5983 >= var9) {
                        if (this.field4270 == null) {
                            this.field4267.field5983 = 0;
                            int var12 = this.field4267.method2557(14929);
                            int var13 = this.field4267.method2565((byte) -121);
                            int var14 = this.field4267.method2557(14929);
                            int var15 = this.field4267.method2526(arg0 - 5);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class80 var21;
                            if (var17) {
                                for (var21 = (class80) this.field4261.method249(18371); var21 != null && var21.field6209 != var18; var21 = (class80) this.field4261.method254((byte) -64)) {
                                }
                            } else {
                                for (var21 = (class80) this.field4259.method249(18371); var21 != null && var21.field6209 != var18; var21 = (class80) this.field4259.method254((byte) -64)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field4270 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field4270.field1193 = new class431(this.field4270.field1190 + var22 + var15);
                            this.field4270.field1193.method2524(false, var16);
                            this.field4270.field1193.method2548(var15, (byte) -100);
                            this.field4270.field1192 = 8;
                            this.field4267.field5983 = 0;
                        } else if (this.field4270.field1192 != 0) {
                            throw new IOException();
                        } else if (this.field4267.field6002[0] == -1) {
                            this.field4267.field5983 = 0;
                            this.field4270.field1192 = 1;
                        } else {
                            this.field4270 = null;
                        }
                    }
                } else {
                    int var23 = this.field4270.field1193.field6002.length - this.field4270.field1190;
                    int var24 = 512 - this.field4270.field1192;
                    if (var23 - this.field4270.field1193.field5983 < var24) {
                        var24 = var23 - this.field4270.field1193.field5983;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field4264.method3579(var24, this.field4270.field1193.field6002, 0, this.field4270.field1193.field5983);
                    if (this.field4269 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field4270.field1193.field6002[this.field4270.field1193.field5983 + var25] = (byte) class172.method1269(this.field4270.field1193.field6002[this.field4270.field1193.field5983 + var25], this.field4269);
                        }
                    }
                    this.field4270.field1193.field5983 += var24;
                    this.field4270.field1192 += var24;
                    if (this.field4270.field1193.field5983 == var23) {
                        this.field4270.method2665(24902);
                        this.field4270.field10169 = false;
                        this.field4270 = null;
                    } else if (this.field4270.field1192 == 512) {
                        this.field4270.field1192 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4264.method3581(-118);
            } catch (Exception var26) {
            }
            this.field4266 = -2;
            this.field4264 = null;
            this.field4268++;
            return this.method1840(66) == 0 && this.method1838(-21) == 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBII)Z")
    public static final boolean method1845(int arg0, byte arg1, int arg2, int arg3) {
        field4258++;
        if (!class83.field1263 || !class317.field4537) {
            return false;
        } else if (class414.field5685 < 100) {
            return false;
        } else {
            int var4 = class695.field9788[arg3][arg2][arg0];
            if (-class94.field1352 == var4) {
                return false;
            } else if (class94.field1352 == var4) {
                return true;
            } else if (class678.field9594 == class454.field6207) {
                return false;
            } else {
                if (arg1 != -53) {
                    field4243 = true;
                }
                int var5 = arg2 << class679.field9600;
                int var6 = arg0 << class679.field9600;
                if (class486.method2855(class253.field3624 + var6 - 1, class678.field9594[arg3].method2476(arg0, arg2, -1), var5 + 1, class678.field9594[arg3].method2476(arg0 + 1, arg2, arg1 + 52), var5 + 1, class253.field3624 + var6 + -1, var6 + 1, false, class678.field9594[arg3].method2476(arg0 + 1, arg2 + 1, arg1 ^ 0x34), class253.field3624 + var5 - 1) && class486.method2855(var6 + 1, class678.field9594[arg3].method2476(arg0, arg2, -1), var5 + class253.field3624 - 1, class678.field9594[arg3].method2476(arg0 + 1, arg2 + 1, -1), var5 + 1, var6 - -class253.field3624 + -1, var6 + 1, false, class678.field9594[arg3].method2476(arg0, arg2 + 1, -1), var5 + class253.field3624 - 1)) {
                    class107.field1535++;
                    class695.field9788[arg3][arg2][arg0] = class94.field1352;
                    return true;
                } else {
                    class695.field9788[arg3][arg2][arg0] = -class94.field1352;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public final void method1846(byte arg0) {
        if (this.field4264 != null) {
            this.field4264.method3581(-108);
        }
        field4245++;
        int var2 = 38 / ((arg0 - 74) / 51);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)Z")
    public final boolean method1847(byte arg0) {
        field4248++;
        if (arg0 >= -86) {
            return false;
        } else {
            return this.method1840(65) >= 20;
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method1848(int arg0) {
        field4254++;
        if (this.field4264 != null) {
            this.field4264.method3587(-1263);
        }
        if (arg0 != 1379) {
            field4252 = null;
        }
    }
}
