import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class273 {

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lju;")
    private class83 field4143 = new class83();

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lju;")
    private class83 field4144 = new class83();

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lju;")
    private class83 field4145 = new class83();

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lju;")
    private class83 field4146 = new class83();

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "Lnn;")
    private class289 field4151 = new class289(4);

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public volatile int field4153 = 0;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "B")
    private byte field4154 = 0;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public volatile int field4156 = 0;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "Lnn;")
    private class289 field4155 = new class289(8);

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4131 = -1;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[[Z")
    public static boolean[][] field4141 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lbj;")
    public static class162 field4132 = new class162(3, 8);

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lbj;")
    public static class162 field4147 = new class162(52, -1);

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field4149 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "J")
    private long field4148;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lrd;")
    private class224 field4157;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lur;")
    private class378 field4152;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method1724(int arg0) {
        field4127++;
        if (arg0 != 20) {
            this.field4153 = 35;
        }
        return this.method1730(31) >= 20;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z", line = 24)
    public final boolean method1725(byte arg0) {
        if (this.field4152 != null) {
            long var2 = class423.method2578(-19698);
            int var4 = (int) (var2 - this.field4148);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4148 = var2;
            this.field4150 += var4;
            if (this.field4150 > 30000) {
                try {
                    this.field4152.method2319((byte) 104);
                } catch (Exception var27) {
                }
                this.field4152 = null;
            }
        }
        field4129++;
        if (this.field4152 == null) {
            return this.method1730(-85) == 0 && this.method1735(true) == 0;
        }
        try {
            this.field4152.method2327(true);
            for (class224 var5 = (class224) this.field4143.method779(1); var5 != null; var5 = (class224) this.field4143.method780((byte) 100)) {
                this.field4151.field4399 = 0;
                this.field4151.method1814(1, true);
                this.field4151.method1860(arg0 ^ 0xFFFFFFB1, (int) var5.field3034);
                this.field4152.method2329(0, 4, 3, this.field4151.field4408);
                this.field4144.method776(0, var5);
            }
            if (arg0 != 50) {
                this.method1730(-95);
            }
            for (class224 var6 = (class224) this.field4145.method779(1); var6 != null; var6 = (class224) this.field4145.method780((byte) 125)) {
                this.field4151.field4399 = 0;
                this.field4151.method1814(0, true);
                this.field4151.method1860(-110, (int) var6.field3034);
                this.field4152.method2329(0, 4, 3, this.field4151.field4408);
                this.field4146.method776(0, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4152.method2321(arg0 - 50);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4150 = 0;
                byte var9 = 0;
                if (this.field4157 == null) {
                    var9 = 8;
                } else if (this.field4157.field3509 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4157.field3506.field4408.length - this.field4157.field3504;
                    int var11 = 512 - this.field4157.field3509;
                    if (var11 > (var10 - this.field4157.field3506.field4399)) {
                        var11 = var10 - this.field4157.field3506.field4399;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field4152.method2322(this.field4157.field3506.field4399, var11, (byte) 114, this.field4157.field3506.field4408);
                    if (this.field4154 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4157.field3506.field4408[this.field4157.field3506.field4399 + var12] = (byte) class509.method3048(this.field4157.field3506.field4408[this.field4157.field3506.field4399 + var12], this.field4154);
                        }
                    }
                    this.field4157.field3506.field4399 += var11;
                    this.field4157.field3509 += var11;
                    if (this.field4157.field3506.field4399 == var10) {
                        this.field4157.method1289((byte) -82);
                        this.field4157.field582 = false;
                        this.field4157 = null;
                    } else if (this.field4157.field3509 == 512) {
                        this.field4157.field3509 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4155.field4399;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4152.method2322(this.field4155.field4399, var13, (byte) 114, this.field4155.field4408);
                    if (this.field4154 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4155.field4408[this.field4155.field4399 + var14] = (byte) class509.method3048(this.field4155.field4408[this.field4155.field4399 + var14], this.field4154);
                        }
                    }
                    this.field4155.field4399 += var13;
                    if (var9 <= this.field4155.field4399) {
                        if (this.field4157 == null) {
                            this.field4155.field4399 = 0;
                            int var15 = this.field4155.method1858(-3256);
                            int var16 = this.field4155.method1841((byte) -118);
                            int var17 = this.field4155.method1858(-3256);
                            int var18 = this.field4155.method1815((byte) -98);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class224 var24;
                            if (var20) {
                                for (var24 = (class224) this.field4146.method779(arg0 ^ 0x33); var24 != null && var24.field3034 != var21; var24 = (class224) this.field4146.method780((byte) 100)) {
                                }
                            } else {
                                for (var24 = (class224) this.field4144.method779(1); var24 != null && var24.field3034 != var21; var24 = (class224) this.field4144.method780((byte) 122)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4157 = var24;
                            this.field4157.field3506 = new class289(this.field4157.field3504 + var25 + var18);
                            this.field4157.field3506.method1814(var19, true);
                            this.field4157.field3506.method1862((byte) -115, var18);
                            this.field4155.field4399 = 0;
                            this.field4157.field3509 = 8;
                        } else if (this.field4157.field3509 != 0) {
                            throw new IOException();
                        } else if (this.field4155.field4408[0] == -1) {
                            this.field4157.field3509 = 1;
                            this.field4155.field4399 = 0;
                        } else {
                            this.field4157 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4152.method2319((byte) 112);
            } catch (Exception var26) {
            }
            this.field4152 = null;
            this.field4156 = -2;
            this.field4153++;
            return this.method1730(30) == 0 && this.method1735(true) == 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 302)
    private final void method1726(int arg0) {
        field4128++;
        if (this.field4152 == null) {
            return;
        }
        try {
            this.field4151.field4399 = 0;
            this.field4151.method1814(6, true);
            if (arg0 != -2) {
                this.method1729(-59);
            }
            this.field4151.method1860(-101, 3);
            this.field4152.method2329(0, 4, 3, this.field4151.field4408);
        } catch (IOException var3) {
            try {
                this.field4152.method2319((byte) 104);
            } catch (Exception var2) {
            }
            this.field4153++;
            this.field4152 = null;
            this.field4156 = -2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIZB)Lrd;", line = 329)
    public final class224 method1727(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field4142++;
        long var6 = (long) ((arg1 << 16) + arg2);
        class224 var8 = new class224();
        if (!arg0) {
            this.method1732((byte) -95, true, null);
        }
        var8.field581 = arg3;
        var8.field3034 = var6;
        var8.field3504 = arg4;
        if (arg3) {
            if (this.method1730(99) >= 20) {
                throw new RuntimeException();
            }
            this.field4143.method776(0, var8);
        } else if (this.method1735(true) < 20) {
            this.field4145.method776(0, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z", line = 377)
    public final boolean method1728(byte arg0) {
        if (arg0 == 72) {
            field4133++;
            return this.method1735(true) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 390)
    public final void method1729(int arg0) {
        field4136++;
        if (this.field4152 == null) {
            return;
        }
        try {
            if (arg0 == -14769) {
                this.field4151.field4399 = 0;
                this.field4151.method1814(7, true);
                this.field4151.method1860(-123, 0);
                this.field4152.method2329(0, 4, 3, this.field4151.field4408);
            }
        } catch (IOException var3) {
            try {
                this.field4152.method2319((byte) 113);
            } catch (Exception var2) {
            }
            this.field4152 = null;
            this.field4156 = -2;
            this.field4153++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)I", line = 419)
    public final int method1730(int arg0) {
        int var2 = 98 % ((arg0 + 11) / 37);
        field4140++;
        return this.field4143.method781(false) + this.field4144.method781(false);
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V", line = 429)
    public final void method1731(int arg0) {
        if (this.field4152 != null) {
            this.field4152.method2323((byte) 6);
        }
        if (arg0 < -57) {
            field4138++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZLur;)V", line = 450)
    public final void method1732(byte arg0, boolean arg1, class378 arg2) {
        int var4 = -62 / ((-arg0 - 12) / 53);
        if (this.field4152 != null) {
            try {
                this.field4152.method2319((byte) 125);
            } catch (Exception var9) {
            }
            this.field4152 = null;
        }
        field4135++;
        this.field4152 = arg2;
        this.method1726(-2);
        this.method1734(arg1, (byte) 96);
        this.field4155.field4399 = 0;
        this.field4157 = null;
        while (true) {
            class224 var5 = (class224) this.field4144.method777((byte) -18);
            if (var5 == null) {
                while (true) {
                    class224 var6 = (class224) this.field4146.method777((byte) -18);
                    if (var6 == null) {
                        if (this.field4154 != 0) {
                            try {
                                this.field4151.field4399 = 0;
                                this.field4151.method1814(4, true);
                                this.field4151.method1814(this.field4154, true);
                                this.field4151.method1865(0, 812856296);
                                this.field4152.method2329(0, 4, 3, this.field4151.field4408);
                            } catch (IOException var8) {
                                try {
                                    this.field4152.method2319((byte) 114);
                                } catch (Exception var7) {
                                }
                                this.field4152 = null;
                                this.field4156 = -2;
                                this.field4153++;
                            }
                        }
                        this.field4150 = 0;
                        this.field4148 = class423.method2578(-19698);
                        return;
                    }
                    this.field4145.method776(0, var6);
                }
            }
            this.field4143.method776(0, var5);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 518)
    public static void method1733(byte arg0) {
        field4132 = null;
        int var1 = 76 / ((24 - arg0) / 53);
        field4147 = null;
        field4141 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZB)V", line = 529)
    public final void method1734(boolean arg0, byte arg1) {
        field4137++;
        if (this.field4152 == null) {
            return;
        }
        if (arg1 < 4) {
            this.method1731(-1);
        }
        try {
            this.field4151.field4399 = 0;
            this.field4151.method1814(arg0 ? 2 : 3, true);
            this.field4151.method1860(-100, 0);
            this.field4152.method2329(0, 4, 3, this.field4151.field4408);
        } catch (IOException var4) {
            try {
                this.field4152.method2319((byte) 120);
            } catch (Exception var3) {
            }
            this.field4152 = null;
            this.field4156 = -2;
            this.field4153++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I", line = 560)
    private final int method1735(boolean arg0) {
        if (!arg0) {
            this.field4150 = 54;
        }
        field4130++;
        return this.field4145.method781(false) + this.field4146.method781(!arg0);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V", line = 572)
    public final void method1736(int arg0) {
        field4139++;
        try {
            this.field4152.method2319((byte) 112);
        } catch (Exception var2) {
        }
        this.field4154 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4153++;
        this.field4156 = -1;
        this.field4152 = null;
        if (arg0 != 0) {
            this.method1730(123);
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V", line = 590)
    public final void method1737(byte arg0) {
        field4134++;
        if (arg0 != 95) {
            this.method1726(63);
        }
        if (this.field4152 != null) {
            this.field4152.method2319((byte) 123);
        }
    }
}
