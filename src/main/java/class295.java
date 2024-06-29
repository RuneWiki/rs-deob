import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class295 {

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "Lmn;")
    private class368 field4132 = new class368();

    @OriginalMember(owner = "client!tha", name = "t", descriptor = "Lmn;")
    private class368 field4139 = new class368();

    @OriginalMember(owner = "client!tha", name = "u", descriptor = "Lmn;")
    private class368 field4140 = new class368();

    @OriginalMember(owner = "client!tha", name = "v", descriptor = "Lmn;")
    private class368 field4141 = new class368();

    @OriginalMember(owner = "client!tha", name = "x", descriptor = "Lcea;")
    private class215 field4143 = new class215(4);

    @OriginalMember(owner = "client!tha", name = "B", descriptor = "B")
    private byte field4147 = 0;

    @OriginalMember(owner = "client!tha", name = "C", descriptor = "I")
    public volatile int field4148 = 0;

    @OriginalMember(owner = "client!tha", name = "D", descriptor = "I")
    public volatile int field4149 = 0;

    @OriginalMember(owner = "client!tha", name = "A", descriptor = "Lcea;")
    private class215 field4146 = new class215(8);

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "Lsia;")
    public static class732 field4131 = new class732();

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "I")
    public static int field4138 = -1;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!tha", name = "w", descriptor = "J")
    private long field4142;

    @OriginalMember(owner = "client!tha", name = "E", descriptor = "Lmba;")
    private class421 field4150;

    @OriginalMember(owner = "client!tha", name = "y", descriptor = "Lre;")
    private class601 field4144;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method1926(int arg0, boolean arg1) {
        field4129++;
        if (this.field4144 == null) {
            return;
        }
        try {
            this.field4143.field3109 = 0;
            this.field4143.method1526(false, arg1 ? 2 : 3);
            this.field4143.method1488(-9912, 0);
            if (arg0 < -66) {
                this.field4144.method3419(this.field4143.field3066, 4, 0, -1);
            }
        } catch (IOException var4) {
            try {
                this.field4144.method3425((byte) -121);
            } catch (Exception var3) {
            }
            this.field4148++;
            this.field4144 = null;
            this.field4149 = -2;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)Z", line = 33)
    public final boolean method1927(byte arg0) {
        if (this.field4144 != null) {
            long var2 = class554.method3190(-106);
            int var4 = (int) (var2 - this.field4142);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4142 = var2;
            this.field4145 += var4;
            if (this.field4145 > 30000) {
                try {
                    this.field4144.method3425((byte) -121);
                } catch (Exception var27) {
                }
                this.field4144 = null;
            }
        }
        field4125++;
        if (this.field4144 == null) {
            return this.method1936(4) == 0 && this.method1928(4350) == 0;
        }
        try {
            this.field4144.method3421(true);
            for (class421 var5 = (class421) this.field4132.method2344(-30); var5 != null; var5 = (class421) this.field4132.method2336((byte) 65)) {
                this.field4143.field3109 = 0;
                this.field4143.method1526(false, 1);
                this.field4143.method1488(-9912, (int) var5.field235);
                this.field4144.method3419(this.field4143.field3066, 4, 0, -1);
                this.field4139.method2338(true, var5);
            }
            class421 var6 = (class421) this.field4140.method2344(-75);
            if (arg0 <= 72) {
                return false;
            }
            while (var6 != null) {
                this.field4143.field3109 = 0;
                this.field4143.method1526(false, 0);
                this.field4143.method1488(-9912, (int) var6.field235);
                this.field4144.method3419(this.field4143.field3066, 4, 0, -1);
                this.field4141.method2338(true, var6);
                var6 = (class421) this.field4140.method2336((byte) 102);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4144.method3416((byte) 83);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4145 = 0;
                byte var9 = 0;
                if (this.field4150 == null) {
                    var9 = 8;
                } else if (this.field4150.field6084 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4150.field6081.field3066.length - this.field4150.field6077;
                    int var11 = 512 - this.field4150.field6084;
                    if ((var10 - this.field4150.field6081.field3109) < var11) {
                        var11 = var10 - this.field4150.field6081.field3109;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4144.method3423(this.field4150.field6081.field3066, this.field4150.field6081.field3109, (byte) -72, var11);
                    if (this.field4147 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4150.field6081.field3066[this.field4150.field6081.field3109 + var12] = (byte) class710.method3948(this.field4150.field6081.field3066[this.field4150.field6081.field3109 + var12], this.field4147);
                        }
                    }
                    this.field4150.field6084 += var11;
                    this.field4150.field6081.field3109 += var11;
                    if (this.field4150.field6081.field3109 == var10) {
                        this.field4150.method115(true);
                        this.field4150.field2808 = false;
                        this.field4150 = null;
                    } else if (this.field4150.field6084 == 512) {
                        this.field4150.field6084 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4146.field3109;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field4144.method3423(this.field4146.field3066, this.field4146.field3109, (byte) -72, var13);
                    if (this.field4147 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4146.field3066[this.field4146.field3109 + var14] = (byte) class710.method3948(this.field4146.field3066[this.field4146.field3109 + var14], this.field4147);
                        }
                    }
                    this.field4146.field3109 += var13;
                    if (this.field4146.field3109 >= var9) {
                        if (this.field4150 == null) {
                            this.field4146.field3109 = 0;
                            int var15 = this.field4146.method1535(255);
                            int var16 = this.field4146.method1478(842397944);
                            int var17 = this.field4146.method1535(255);
                            int var18 = this.field4146.method1533((byte) -126);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class421 var24;
                            if (var20) {
                                for (var24 = (class421) this.field4141.method2344(-89); var24 != null && var24.field235 != var21; var24 = (class421) this.field4141.method2336((byte) 98)) {
                                }
                            } else {
                                for (var24 = (class421) this.field4139.method2344(-108); var24 != null && var24.field235 != var21; var24 = (class421) this.field4139.method2336((byte) 90)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4150 = var24;
                            this.field4150.field6081 = new class215(this.field4150.field6077 + var25 + var18);
                            this.field4150.field6081.method1526(false, var19);
                            this.field4150.field6081.method1539((byte) 97, var18);
                            this.field4146.field3109 = 0;
                            this.field4150.field6084 = 8;
                        } else if (this.field4150.field6084 != 0) {
                            throw new IOException();
                        } else if (this.field4146.field3066[0] == -1) {
                            this.field4150.field6084 = 1;
                            this.field4146.field3109 = 0;
                        } else {
                            this.field4150 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4144.method3425((byte) -122);
            } catch (Exception var26) {
            }
            this.field4149 = -2;
            this.field4148++;
            this.field4144 = null;
            return this.method1936(4) == 0 && this.method1928(4350) == 0;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)I", line = 310)
    private final int method1928(int arg0) {
        field4134++;
        return arg0 == 4350 ? this.field4140.method2335(0) + this.field4141.method2335(0) : 29;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I[BIIII[BIB)V", line = 323)
    public static final void method1929(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, byte arg8) {
        field4133++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg8 != 121) {
            field4131 = null;
        }
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg1[var10001] = (byte) (arg1[var10001] - arg6[arg0++]);
                int var14 = arg3++;
                arg1[var14] = (byte) (arg1[var14] - arg6[arg0++]);
                int var15 = arg3++;
                arg1[var15] = (byte) (arg1[var15] - arg6[arg0++]);
                int var16 = arg3++;
                arg1[var16] = (byte) (arg1[var16] - arg6[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg1[var10001] = (byte) (arg1[var10001] - arg6[arg0++]);
            }
            arg3 += arg4;
            arg0 += arg5;
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V", line = 367)
    private final void method1930(int arg0) {
        if (arg0 > -58) {
            return;
        }
        field4126++;
        if (this.field4144 == null) {
            return;
        }
        try {
            this.field4143.field3109 = 0;
            this.field4143.method1526(false, 6);
            this.field4143.method1488(-9912, 3);
            this.field4144.method3419(this.field4143.field3066, 4, 0, -1);
        } catch (IOException var3) {
            try {
                this.field4144.method3425((byte) -123);
            } catch (Exception var2) {
            }
            this.field4149 = -2;
            this.field4144 = null;
            this.field4148++;
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)V", line = 395)
    public static void method1931(byte arg0) {
        if (arg0 == 119) {
            field4131 = null;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)V", line = 406)
    public final void method1932(boolean arg0) {
        if (this.field4144 != null) {
            this.field4144.method3417(72);
        }
        if (!arg0) {
            this.method1938(99);
        }
        field4120++;
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)Z", line = 419)
    public final boolean method1933(int arg0) {
        if (arg0 > -91) {
            this.field4149 = -39;
        }
        field4121++;
        return this.method1928(4350) >= 20;
    }

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)Z", line = 435)
    public final boolean method1934(int arg0) {
        int var2 = -51 % ((41 - arg0) / 47);
        field4130++;
        return this.method1936(4) >= 20;
    }

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "(I)V", line = 447)
    public final void method1935(int arg0) {
        if (arg0 > -27) {
            this.method1935(21);
        }
        if (this.field4144 != null) {
            this.field4144.method3425((byte) -122);
        }
        field4135++;
    }

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "(I)I", line = 460)
    public final int method1936(int arg0) {
        field4127++;
        if (arg0 != 4) {
            this.field4148 = 18;
        }
        return this.field4132.method2335(0) + this.field4139.method2335(0);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZZLre;)V", line = 472)
    public final void method1937(boolean arg0, boolean arg1, class601 arg2) {
        if (this.field4144 != null) {
            try {
                this.field4144.method3425((byte) -124);
            } catch (Exception var8) {
            }
            this.field4144 = null;
        }
        field4128++;
        this.field4144 = arg2;
        this.method1930(-92);
        this.method1926(-92, arg1);
        this.field4146.field3109 = 0;
        this.field4150 = null;
        if (arg0) {
            this.field4142 = -35L;
        }
        while (true) {
            class421 var4 = (class421) this.field4139.method2341(20);
            if (var4 == null) {
                while (true) {
                    class421 var5 = (class421) this.field4141.method2341(20);
                    if (var5 == null) {
                        if (this.field4147 != 0) {
                            try {
                                this.field4143.field3109 = 0;
                                this.field4143.method1526(arg0, 4);
                                this.field4143.method1526(arg0, this.field4147);
                                this.field4143.method1485((byte) 107, 0);
                                this.field4144.method3419(this.field4143.field3066, 4, 0, -1);
                            } catch (IOException var7) {
                                try {
                                    this.field4144.method3425((byte) -126);
                                } catch (Exception var6) {
                                }
                                this.field4149 = -2;
                                this.field4148++;
                                this.field4144 = null;
                            }
                        }
                        this.field4145 = 0;
                        this.field4142 = class554.method3190(-105);
                        return;
                    }
                    this.field4140.method2338(!arg0, var5);
                }
            }
            this.field4132.method2338(true, var4);
        }
    }

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "(I)V", line = 548)
    public final void method1938(int arg0) {
        try {
            this.field4144.method3425((byte) -123);
        } catch (Exception var2) {
        }
        field4124++;
        this.field4144 = null;
        this.field4148++;
        this.field4147 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4149 = arg0;
    }

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "(I)V", line = 563)
    public final void method1939(int arg0) {
        field4123++;
        if (this.field4144 == null) {
            return;
        }
        try {
            this.field4143.field3109 = arg0;
            this.field4143.method1526(false, 7);
            this.field4143.method1488(-9912, 0);
            this.field4144.method3419(this.field4143.field3066, 4, 0, ~arg0);
        } catch (IOException var3) {
            try {
                this.field4144.method3425((byte) -125);
            } catch (Exception var2) {
            }
            this.field4149 = -2;
            this.field4148++;
            this.field4144 = null;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BBZII)Lmba;", line = 591)
    public final class421 method1940(byte arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field4122++;
        int var6 = -118 % ((arg0 + 15) / 61);
        long var7 = (long) ((arg4 << 16) + arg3);
        class421 var9 = new class421();
        var9.field2807 = arg2;
        var9.field235 = var7;
        var9.field6077 = arg1;
        if (arg2) {
            if (this.method1936(4) >= 20) {
                throw new RuntimeException();
            }
            this.field4132.method2338(true, var9);
        } else if (this.method1928(4350) < 20) {
            this.field4140.method2338(true, var9);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }
}
