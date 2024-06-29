import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class485 {

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lvu;")
    private class677 field7001 = new class677();

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lvu;")
    private class677 field7007 = new class677();

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Lvu;")
    private class677 field7011 = new class677();

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Lvu;")
    private class677 field7014 = new class677();

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Lofa;")
    private class301 field7015 = new class301(4);

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public volatile int field7022 = 0;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public volatile int field7021 = 0;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "B")
    private byte field7019 = 0;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "Lofa;")
    private class301 field7020 = new class301(8);

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
    public static boolean field7010 = false;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lcb;")
    public static class631 field7003 = new class631(13, 7);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    private int field7017;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "J")
    private long field7018;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "Lwha;")
    private class340 field7016;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "Lvea;")
    private class648 field7023;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZIIBI)Lvea;", line = 5)
    public final class648 method2933(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6997++;
        long var6 = (long) ((arg4 << 16) + arg1);
        class648 var8 = new class648();
        var8.field6953 = arg0;
        var8.field3444 = var6;
        var8.field9215 = arg3;
        if (arg0) {
            if (this.method2940((byte) -69) >= 20) {
                throw new RuntimeException();
            }
            this.field7001.method3779(-14068, var8);
        } else if (this.method2947((byte) -80) < 20) {
            this.field7011.method3779(-14068, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg2 != -513) {
            this.method2935(-70);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 48)
    public static void method2934(int arg0) {
        if (arg0 != 30806) {
            method2943(null, -13);
        }
        field7003 = null;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Z", line = 58)
    public final boolean method2935(int arg0) {
        if (arg0 == -27554) {
            field7002++;
            return this.method2947((byte) 0) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZILwha;)V", line = 72)
    public final void method2936(boolean arg0, int arg1, class340 arg2) {
        field7008++;
        if (arg1 != 8) {
            method2934(-82);
        }
        if (this.field7016 != null) {
            try {
                this.field7016.method2165(false);
            } catch (Exception var8) {
            }
            this.field7016 = null;
        }
        this.field7016 = arg2;
        this.method2939(-51);
        this.method2944((byte) 122, arg0);
        this.field7020.field4534 = 0;
        this.field7023 = null;
        while (true) {
            class648 var4 = (class648) this.field7007.method3775(30);
            if (var4 == null) {
                while (true) {
                    class648 var5 = (class648) this.field7014.method3775(30);
                    if (var5 == null) {
                        if (this.field7019 != 0) {
                            try {
                                this.field7015.field4534 = 0;
                                this.field7015.method1926(4, 65280);
                                this.field7015.method1926(this.field7019, arg1 + 65272);
                                this.field7015.method1939(0, 1134947720);
                                this.field7016.method2171(0, this.field7015.field4543, 1, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field7016.method2165(false);
                                } catch (Exception var6) {
                                }
                                this.field7016 = null;
                                this.field7022++;
                                this.field7021 = -2;
                            }
                        }
                        this.field7017 = 0;
                        this.field7018 = class18.method109(-11121);
                        return;
                    }
                    this.field7011.method3779(arg1 ^ 0xFFFFC904, var5);
                }
            }
            this.field7001.method3779(-14068, var4);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z", line = 145)
    public final boolean method2937(byte arg0) {
        field6995++;
        if (arg0 != 56) {
            this.method2945(-53);
        }
        return this.method2940((byte) -69) >= 20;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 156)
    public final void method2938(byte arg0) {
        field7000++;
        if (arg0 > -3) {
            this.method2936(true, -21, null);
        }
        if (this.field7016 != null) {
            this.field7016.method2169(-125);
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V", line = 172)
    private final void method2939(int arg0) {
        field7013++;
        if (this.field7016 == null) {
            return;
        }
        int var2 = 24 % ((77 - arg0) / 47);
        try {
            this.field7015.field4534 = 0;
            this.field7015.method1926(6, 65280);
            this.field7015.method1950(3, 6387);
            this.field7016.method2171(0, this.field7015.field4543, 1, 4);
        } catch (IOException var4) {
            try {
                this.field7016.method2165(false);
            } catch (Exception var3) {
            }
            this.field7021 = -2;
            this.field7022++;
            this.field7016 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I", line = 202)
    public final int method2940(byte arg0) {
        if (arg0 != -69) {
            this.field7014 = null;
        }
        field7004++;
        return this.field7001.method3781(arg0 ^ 0xFFFFFFBB) + this.field7007.method3781(0);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 213)
    public final void method2941(boolean arg0) {
        field7005++;
        try {
            this.field7016.method2165(arg0);
            if (arg0) {
                this.field7015 = null;
            }
        } catch (Exception var2) {
        }
        this.field7016 = null;
        this.field7021 = -1;
        this.field7022++;
        this.field7019 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V", line = 232)
    public final void method2942(int arg0) {
        if (this.field7016 != null) {
            this.field7016.method2165(false);
        }
        if (arg0 == -513) {
            field6996++;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lofa;I)Leba;", line = 246)
    public static final class662 method2943(class301 arg0, int arg1) {
        field7009++;
        class662 var2 = new class662();
        var2.field9421 = arg0.method1989((byte) -63);
        var2.field9420 = class536.field7684.method1493(arg1, var2.field9421);
        return var2;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZ)V", line = 259)
    public final void method2944(byte arg0, boolean arg1) {
        field7006++;
        if (arg0 < 76) {
            this.method2941(true);
        }
        if (this.field7016 == null) {
            return;
        }
        try {
            this.field7015.field4534 = 0;
            this.field7015.method1926(arg1 ? 2 : 3, 65280);
            this.field7015.method1950(0, 6387);
            this.field7016.method2171(0, this.field7015.field4543, 1, 4);
        } catch (IOException var4) {
            try {
                this.field7016.method2165(false);
            } catch (Exception var3) {
            }
            this.field7016 = null;
            this.field7021 = -2;
            this.field7022++;
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z", line = 289)
    public final boolean method2945(int arg0) {
        if (this.field7016 != null) {
            long var2 = class18.method109(arg0 - 11119);
            int var4 = (int) (var2 - this.field7018);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field7018 = var2;
            this.field7017 += var4;
            if (this.field7017 > 30000) {
                try {
                    this.field7016.method2165(false);
                } catch (Exception var27) {
                }
                this.field7016 = null;
            }
        }
        field6998++;
        if (this.field7016 == null) {
            return this.method2940((byte) -69) == 0 && this.method2947((byte) 127) == 0;
        }
        try {
            this.field7016.method2174((byte) 27);
            for (class648 var5 = (class648) this.field7001.method3772(true); var5 != null; var5 = (class648) this.field7001.method3780(23774)) {
                this.field7015.field4534 = 0;
                this.field7015.method1926(1, 65280);
                this.field7015.method1950((int) var5.field3444, 6387);
                this.field7016.method2171(0, this.field7015.field4543, 1, 4);
                this.field7007.method3779(-14068, var5);
            }
            for (class648 var6 = (class648) this.field7011.method3772(true); var6 != null; var6 = (class648) this.field7011.method3780(23774)) {
                this.field7015.field4534 = 0;
                this.field7015.method1926(0, 65280);
                this.field7015.method1950((int) var6.field3444, arg0 + 6389);
                this.field7016.method2171(0, this.field7015.field4543, ~arg0, 4);
                this.field7014.method3779(-14068, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field7016.method2173(114);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field7017 = 0;
                byte var9 = 0;
                if (this.field7023 == null) {
                    var9 = 8;
                } else if (this.field7023.field9217 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field7023.field9216.field4543.length - this.field7023.field9215;
                    int var11 = 512 - this.field7023.field9217;
                    if (var11 > var10 - this.field7023.field9216.field4534) {
                        var11 = var10 - this.field7023.field9216.field4534;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field7016.method2166(-1, var11, this.field7023.field9216.field4534, this.field7023.field9216.field4543);
                    if (this.field7019 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field7023.field9216.field4543[this.field7023.field9216.field4534 + var12] = (byte) class584.method3367(this.field7023.field9216.field4543[this.field7023.field9216.field4534 + var12], this.field7019);
                        }
                    }
                    this.field7023.field9217 += var11;
                    this.field7023.field9216.field4534 += var11;
                    if (this.field7023.field9216.field4534 == var10) {
                        this.field7023.method1507(1);
                        this.field7023.field6952 = false;
                        this.field7023 = null;
                    } else if (this.field7023.field9217 == 512) {
                        this.field7023.field9217 = 0;
                    }
                } else {
                    int var13 = var9 - this.field7020.field4534;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field7016.method2166(-1, var13, this.field7020.field4534, this.field7020.field4543);
                    if (this.field7019 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field7020.field4543[this.field7020.field4534 + var14] = (byte) class584.method3367(this.field7020.field4543[this.field7020.field4534 + var14], this.field7019);
                        }
                    }
                    this.field7020.field4534 += var13;
                    if (this.field7020.field4534 >= var9) {
                        if (this.field7023 == null) {
                            this.field7020.field4534 = 0;
                            int var15 = this.field7020.method1987(-37);
                            int var16 = this.field7020.method1989((byte) -95);
                            int var17 = this.field7020.method1987(-9);
                            int var18 = this.field7020.method1934(arg0);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class648 var24;
                            if (var20) {
                                for (var24 = (class648) this.field7014.method3772(true); var24 != null && var24.field3444 != var21; var24 = (class648) this.field7014.method3780(arg0 ^ 0xFFFFA320)) {
                                }
                            } else {
                                for (var24 = (class648) this.field7007.method3772(true); var24 != null && var24.field3444 != var21; var24 = (class648) this.field7007.method3780(23774)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field7023 = var24;
                            this.field7023.field9216 = new class301(var18 - (-var25 - this.field7023.field9215));
                            this.field7023.field9216.method1926(var19, 65280);
                            this.field7023.field9216.method1970((byte) 29, var18);
                            this.field7020.field4534 = 0;
                            this.field7023.field9217 = 8;
                        } else if (this.field7023.field9217 != 0) {
                            throw new IOException();
                        } else if (this.field7020.field4543[0] == -1) {
                            this.field7020.field4534 = 0;
                            this.field7023.field9217 = 1;
                        } else {
                            this.field7023 = null;
                        }
                    }
                }
            }
            if (arg0 != -2) {
                this.method2937((byte) 81);
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field7016.method2165(false);
            } catch (Exception var26) {
            }
            this.field7021 = -2;
            this.field7016 = null;
            this.field7022++;
            return this.method2940((byte) -69) == 0 && this.method2947((byte) -124) == 0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V", line = 568)
    public final void method2946(byte arg0) {
        field6999++;
        if (this.field7016 == null) {
            return;
        }
        try {
            this.field7015.field4534 = 0;
            this.field7015.method1926(7, 65280);
            if (arg0 != 36) {
                method2934(-88);
            }
            this.field7015.method1950(0, 6387);
            this.field7016.method2171(0, this.field7015.field4543, 1, 4);
        } catch (IOException var3) {
            try {
                this.field7016.method2165(false);
            } catch (Exception var2) {
            }
            this.field7016 = null;
            this.field7022++;
            this.field7021 = -2;
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)I", line = 607)
    private final int method2947(byte arg0) {
        field7012++;
        int var2 = 73 / ((arg0 - 46) / 37);
        return this.field7011.method3781(0) + this.field7014.method3781(0);
    }
}
