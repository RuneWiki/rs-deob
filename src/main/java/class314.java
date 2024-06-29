import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class314 {

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ldga;")
    private class231 field4353;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4358;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4343;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lms;")
    private class44 field4350;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lew;")
    private class226 field4355;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Leda;")
    public static class116 field4348 = new class116(106, -2);

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lmo;")
    public static class482 field4359 = new class482(64);

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "[I")
    public static int[] field4362 = new int[1];

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[Lql;")
    public static class173[] field4361 = null;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lf;")
    public static class257 field4360;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lek;")
    private class465 field4345;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[Lo;")
    private class183[] field4344;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        field4359 = null;
        field4361 = null;
        field4362 = null;
        field4360 = null;
        field4348 = null;
        int var1 = -64 / ((arg0 - 53) / 47);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[SZ[Ljava/lang/String;I)V")
    public static final void method1896(int arg0, short[] arg1, boolean arg2, String[] arg3, int arg4) {
        field4354++;
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method1896(var6 - 1, arg1, arg2, arg3, arg4);
            method1896(arg0, arg1, false, arg3, var6 + 1);
        }
        if (arg2) {
            field4348 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z")
    public final boolean method1897(int arg0) {
        field4351++;
        if (this.field4345 != null) {
            return true;
        }
        if (this.field4355 == null) {
            if (this.field4353.method1525((byte) 107)) {
                return false;
            }
            this.field4355 = this.field4353.method1511(255, (byte) 0, 255, true, -756730288);
        }
        if (this.field4355.field3107) {
            return false;
        }
        class465 var2 = new class465(this.field4355.method1400(32));
        var2.field6710 = 5;
        int var3 = var2.method2705(-82);
        var2.field6710 += var3 * 72;
        byte[] var4 = new byte[var2.field6719.length - var2.field6710];
        var2.method2750(var4, -121, var4.length, 0);
        byte[] var7;
        if (this.field4343 == null || this.field4358 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4343, this.field4358);
            var7 = var6.toByteArray();
        }
        int var8 = 70 % ((arg0 + 34) / 50);
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var9 = class77.method607(var2.field6710 - var4.length - 5, 12, var2.field6719, 5);
        for (int var10 = 0; var10 < 64; var10++) {
            if (var7[var10 + 1] != var9[var10]) {
                throw new RuntimeException();
            }
        }
        this.field4345 = var2;
        this.field4344 = new class183[var3];
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lr;ILfa;)V")
    public static final void method1898(class98 arg0, int arg1, class615 arg2) {
        field4346++;
        if (class161.field2607 == null) {
            return;
        }
        if (class238.field3515 < 10) {
            if (!class161.field2608.method2072(class161.field2607.field5111, -6257)) {
                class238.field3515 = class72.field1152.method2084(false, class161.field2607.field5111) / 10;
                return;
            }
            class260.method1648(arg1 ^ 0x36);
            class238.field3515 = 10;
        }
        if (class238.field3515 == 10) {
            class161.field2628 = class161.field2607.field5106 >> 6 << 6;
            class161.field2636 = class161.field2607.field5116 >> 6 << 6;
            class161.field2640 = (class161.field2607.field5105 >> 6 << 6) + 64 - class161.field2628;
            class161.field2631 = (class161.field2607.field5119 >> 6 << 6) + 64 - class161.field2636;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class161.field2607.method2208((class103.field1708.field3154 >> 9) + class63.field917, class103.field1708.field3158, (class103.field1708.field3155 >> 9) + class143.field2474, true, var3)) {
                var4 = var3[1] - class161.field2628;
                var5 = var3[2] - class161.field2636;
            }
            if (!class102.field1670 && var4 >= 0 && class161.field2640 > var4 && var5 >= 0 && var5 < class161.field2631) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class404.field5808 = var6;
                class438.field6298 = var7;
            } else if (class433.field6237 == -1 || class31.field455 == -1) {
                class161.field2607.method2209((class161.field2607.field5107 & 0xFFFEAEC) >> 14, var3, -86, class161.field2607.field5107 & 0x3FFF);
                class438.field6298 = var3[2] - class161.field2636;
                class404.field5808 = var3[1] - class161.field2628;
            } else {
                class161.field2607.method2209(class433.field6237, var3, -100, class31.field455);
                class31.field455 = -1;
                class433.field6237 = -1;
                class102.field1670 = false;
                if (var3 != null) {
                    class438.field6298 = var3[2] - class161.field2636;
                    class404.field5808 = var3[1] - class161.field2628;
                }
            }
            if (class161.field2607.field5103 == 37) {
                class161.field2616 = 3.0F;
                class161.field2614 = 3.0F;
            } else if (class161.field2607.field5103 == 50) {
                class161.field2616 = 4.0F;
                class161.field2614 = 4.0F;
            } else if (class161.field2607.field5103 == 75) {
                class161.field2616 = 6.0F;
                class161.field2614 = 6.0F;
            } else if (class161.field2607.field5103 == 100) {
                class161.field2616 = 8.0F;
                class161.field2614 = 8.0F;
            } else if (class161.field2607.field5103 == 200) {
                class161.field2616 = 16.0F;
                class161.field2614 = 16.0F;
            } else {
                class161.field2616 = 8.0F;
                class161.field2614 = 8.0F;
            }
            class161.field2617 = (int) class161.field2616 >> 1;
            class161.field2613 = class322.method1925(2, class161.field2617);
            class105.method881((byte) 127);
            class161.method1207();
            class521.field7684 = new class692();
            class161.field2620 += (int) (Math.random() * 5.0D) - 2;
            if (class161.field2620 < -8) {
                class161.field2620 = -8;
            }
            class161.field2619 += (int) (Math.random() * 5.0D) - 2;
            if (class161.field2620 > 8) {
                class161.field2620 = 8;
            }
            if (class161.field2619 < -16) {
                class161.field2619 = -16;
            }
            if (class161.field2619 > 16) {
                class161.field2619 = 16;
            }
            class161.method1206(arg2, class161.field2620 >> 2 << 10, class161.field2619 >> 1);
            class161.field2609.method2840((byte) 86, 256, 1024);
            class161.field2604.method1496(256, (byte) 0, 256);
            class161.field2603.method2830(arg1 ^ 0xFFFFFFA0, 4096);
            class56.field781.method3297(256, 63);
            class238.field3515 = 20;
        } else if (class238.field3515 == 20) {
            class448.method2610(false, true);
            class161.method1219(arg0, class161.field2620, class161.field2619);
            class238.field3515 = 60;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 60) {
            if (class161.field2608.method2087((byte) 115, class161.field2607.field5111 + "_staticelements")) {
                if (!class161.field2608.method2072(class161.field2607.field5111 + "_staticelements", -6257)) {
                    return;
                }
                class161.field2612 = class512.method3047(class161.field2607.field5111 + "_staticelements", class206.field3186, class161.field2608, (byte) 39);
            } else {
                class161.field2612 = new class149(0);
            }
            class161.method1216();
            class238.field3515 = 70;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 70) {
            class121.field1980 = new class292(arg0, 11, true, class126.field2061);
            class238.field3515 = 73;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 73) {
            class127.field2084 = new class292(arg0, 12, true, class126.field2061);
            class238.field3515 = 76;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 76) {
            class666.field9367 = new class292(arg0, 14, true, class126.field2061);
            class238.field3515 = 79;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 79) {
            class565.field8274 = new class292(arg0, 17, true, class126.field2061);
            class238.field3515 = 82;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 82) {
            class334.field4667 = new class292(arg0, 19, true, class126.field2061);
            class238.field3515 = 85;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else if (class238.field3515 == 85) {
            class423.field6039 = new class292(arg0, 22, true, class126.field2061);
            class238.field3515 = 88;
            class448.method2610(false, true);
            class692.method3892(arg1 ^ 0xFFFFE100);
        } else if (class238.field3515 == arg1) {
            class520.field7676 = new class292(arg0, 26, true, class126.field2061);
            class238.field3515 = 91;
            class448.method2610(false, true);
            class692.method3892(-7848);
        } else {
            class222.field3324 = new class292(arg0, 30, true, class126.field2061);
            class238.field3515 = 100;
            class448.method2610(false, true);
            class692.method3892(-7848);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public final void method1899(int arg0) {
        field4352++;
        if (this.field4344 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4344.length; var2++) {
            if (this.field4344[var2] != null) {
                this.field4344[var2].method1317(0);
            }
        }
        if (arg0 != -17895) {
            this.method1897(-101);
        }
        for (int var3 = 0; var3 < this.field4344.length; var3++) {
            if (this.field4344[var3] != null) {
                this.field4344[var3].method1316((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILvm;Lvm;)Lo;")
    public final class183 method1900(int arg0, int arg1, class195 arg2, class195 arg3) {
        field4347++;
        return arg1 == 106 ? this.method1902(true, arg3, arg2, arg0, (byte) 102) : null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLek;)Lbca;")
    public static final class452 method1901(byte arg0, class465 arg1) {
        if (arg0 != 124) {
            method1898(null, -70, null);
        }
        field4357++;
        return new class452(arg1.method2744(-1), arg1.method2744(arg0 - 125), arg1.method2744(-1), arg1.method2744(-1), arg1.method2714(true), arg1.method2714(true), arg1.method2705(-78));
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLvm;Lvm;IB)Lo;")
    private final class183 method1902(boolean arg0, class195 arg1, class195 arg2, int arg3, byte arg4) {
        field4349++;
        if (this.field4345 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || this.field4344.length <= arg3) {
            throw new RuntimeException();
        } else if (this.field4344[arg3] == null) {
            this.field4345.field6710 = arg3 * 72 + 6;
            int var6 = this.field4345.method2691((byte) -67);
            int var7 = this.field4345.method2691((byte) -67);
            byte[] var8 = new byte[64];
            this.field4345.method2750(var8, arg4 ^ 0xFFFFFFEB, 64, 0);
            class183 var9 = new class183(arg3, arg2, arg1, this.field4353, this.field4350, var6, var8, var7, arg0);
            if (arg4 == 102) {
                this.field4344[arg3] = var9;
                return var9;
            } else {
                return null;
            }
        } else {
            return this.field4344[arg3];
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ldga;Lms;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class314(class231 arg0, class44 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4353 = arg0;
        this.field4358 = arg3;
        this.field4343 = arg2;
        this.field4350 = arg1;
        if (!this.field4353.method1525((byte) -83)) {
            this.field4355 = this.field4353.method1511(255, (byte) 0, 255, true, -756730288);
        }
    }
}
