import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class482 extends class189 {

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lpq;")
    private class132 field6710;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lgk;")
    private class336 field6714;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lrv;")
    public static class73 field6709 = new class73(0);

    @OriginalMember(owner = "client!t", name = "r", descriptor = "[I")
    public static int[] field6712 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        this.field6714.method2006('\u0001', -14591);
        if (arg0) {
            ++field6711;
            super.field2702.method2940(1, (byte) 108);
            super.field2702.method2968((class478) null, -55);
            super.field2702.method2940(0, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static final void method2776(byte arg0) {
        class134.field1759.method299(((float) class4.field81.field1453 * 0.1F + 0.7F) * 1.1523438F);
        ++field6707;
        class134.field1759.method361(class184.field2662, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class134.field1759.method318(class332.field4832, -1, 256);
        class134.field1759.method311(class478.field6660);
        if (arg0 < 61) {
            method2777(-30, 28, -50, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
    public final void method47(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.method51((class478) null, 56, (byte) 62);
        }
        ++field6706;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)V")
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field6715;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg2 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = ~(arg2 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (128 & arg2) != 0;
        super.field2702.method2940(1, (byte) 121);
        if (var7) {
            class325.field4747[1] = 0.0F;
            class325.field4747[2] = 0.0F;
            class325.field4747[0] = var6;
            class325.field4747[3] = 0.0F;
        } else {
            class325.field4747[2] = var6;
            class325.field4747[0] = 0.0F;
            class325.field4747[1] = 0.0F;
            class325.field4747[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class325.field4747, 0);
        class325.field4747[2] = 0.0F;
        class325.field4747[1] = var6;
        class325.field4747[3] = (float) super.field2702.field7313 * var4 % 1.0F;
        class325.field4747[0] = 0.0F;
        if (arg0 != 117) {
            this.method51((class478) null, 62, (byte) -97);
        }
        OpenGL.glTexGenfv(8193, 9474, class325.field4747, 0);
        if (!this.field6710.field1736) {
            int var8 = (int) ((float) super.field2702.field7313 * var5 * 16.0F);
            super.field2702.method2968(this.field6710.field1740[var8 % 16], -46);
        } else {
            class325.field4747[1] = 0.0F;
            class325.field4747[0] = 0.0F;
            class325.field4747[3] = (float) super.field2702.field7313 * var5 % 1.0F;
            class325.field4747[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class325.field4747, 0);
        }
        super.field2702.method2940(0, (byte) 118);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIB)I")
    public static final int method2777(int arg0, int arg1, int arg2, byte arg3) {
        ++field6719;
        if (class433.field6100 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class245.field3574 + arg0;
            int var7 = arg1 - class245.field3586;
            int var8 = 41 / ((27 - arg3) / 60);
            for (class216 var9 = (class216) class245.field3560.method2655(15152); var9 != null; var9 = (class216) class245.field3560.method2660((byte) 67)) {
                if (~var9.field3126 == ~arg2) {
                    int var10 = var9.field3122;
                    int var11 = var9.field3121;
                    int var12 = class245.field3586 + var11 | class245.field3574 + var10 << 14;
                    int var13 = (var6 - var10) * (-var10 + var6) + (var7 - var11) * (-var11 + var7);
                    if (~var4 > -1 || ~var13 > ~var5) {
                        var5 = var13;
                        var4 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lsv;IB)V")
    public final void method51(class478 arg0, int arg1, byte arg2) {
        ++field6721;
        if (arg2 != -58) {
            field6709 = null;
        }
        super.field2702.method2968(arg0, arg2 + -42);
        super.field2702.method2999(arg1, 93);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        int var2 = -100 / ((-58 - arg0) / 43);
        ++field6717;
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method2778(int arg0) {
        class54.method458((byte) -59, class4.field81.field1435);
        ++field6708;
        int var1 = (class478.field6654 >> 10) + (class441.field6171 >> 3);
        int var2 = (class515.field7596 >> 10) + (class367.field5241 >> 3);
        class320.field4627 = class246.field3587.field1904 = 0;
        class246.field3587.method138(8, arg0, (byte) -105);
        byte var3 = 18;
        class45.field519 = new int[var3];
        class85.field1066 = new int[var3];
        class518.field7630 = new byte[var3][];
        class104.field1371 = new byte[var3][];
        class502.field7100 = new byte[var3][];
        class326.field4755 = new int[var3][4];
        class196.field2778 = new byte[var3][];
        class422.field5944 = new int[var3];
        class236.field3434 = new int[var3];
        class414.field5848 = new int[var3];
        class498.field7054 = new byte[var3][];
        class332.field4827 = new int[var3];
        int var4 = 0;
        for (int var5 = (-(class43.field494 >> 4) + var1) / 8; var5 <= ((class43.field494 >> 4) + var1) / 8; ++var5) {
            for (int var8 = (var2 - (class500.field7068 >> 4)) / 8; ~var8 >= ~((var2 - -(class500.field7068 >> 4)) / 8); ++var8) {
                int var9 = (var5 << 8) + var8;
                class332.field4827[var4] = var9;
                class422.field5944[var4] = class189.field2710.method429("m" + var5 + "_" + var8, -1);
                class45.field519[var4] = class189.field2710.method429("l" + var5 + "_" + var8, -1);
                class85.field1066[var4] = class189.field2710.method429("n" + var5 + "_" + var8, arg0 + -9);
                class414.field5848[var4] = class189.field2710.method429("um" + var5 + "_" + var8, -1);
                class236.field3434[var4] = class189.field2710.method429("ul" + var5 + "_" + var8, -1);
                if (~class85.field1066[var4] == 0) {
                    class422.field5944[var4] = -1;
                    class45.field519[var4] = -1;
                    class414.field5848[var4] = -1;
                    class236.field3434[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; class85.field1066.length > var6; ++var6) {
            class85.field1066[var6] = -1;
            class422.field5944[var6] = -1;
            class45.field519[var6] = -1;
            class414.field5848[var6] = -1;
            class236.field3434[var6] = -1;
        }
        byte var7;
        if (class488.field6832 != 1 && class488.field6832 != 2) {
            var7 = 7;
        } else {
            var7 = 3;
        }
        class335.method2003(var7, -11, var1, false, var2);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lih;Lpq;)V")
    public class482(class503 arg0, class132 arg1) {
        super(arg0);
        this.field6710 = arg1;
        this.field6714 = new class336(arg0, 2);
        this.field6714.method2012(4864, 0);
        super.field2702.method2940(1, (byte) 126);
        if (this.field6710.field1736) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2702.method2940(0, (byte) 84);
        this.field6714.method2013(4864);
        this.field6714.method2012(4864, 1);
        super.field2702.method2940(1, (byte) 85);
        if (this.field6710.field1736) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2702.method2940(0, (byte) 104);
        this.field6714.method2013(4864);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2779(int arg0, String arg1) {
        if (arg0 != 466841861) {
            field6722 = -64;
        }
        ++field6720;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (var3 << 5) + (-var3 - -((long) arg1.charAt(var5)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhm;B)V")
    public static final void method2780(class150 arg0, byte arg1) {
        ++field6705;
        class150 var2 = class146.method904(arg0, 119);
        int var3 = 91 % ((arg1 - -27) / 56);
        int var4;
        int var5;
        if (var2 != null) {
            var4 = var2.field2033;
            var5 = var2.field2113;
        } else {
            var5 = class147.field1956;
            var4 = class273.field4048;
        }
        class523.method3088((byte) 114, arg0, var5, false, var4);
        class213.method1338(191, arg0, var5, var4);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method2781(int arg0) {
        if (arg0 != 0) {
            field6709 = null;
        }
        field6712 = null;
        field6709 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(ZI)V")
    public final void method55(boolean arg0, int arg1) {
        ++field6713;
        this.field6714.method2006('\u0000', -14591);
        int var3 = -83 / ((arg1 - 36) / 46);
        if (this.field6710.field1736) {
            super.field2702.method2940(1, (byte) 112);
            super.field2702.method2968(this.field6710.field1732, -87);
            super.field2702.method2940(0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLwm;)Llq;")
    public static final class393 method2782(byte arg0, class403 arg1) {
        if (arg0 != 82) {
            method2782((byte) 14, (class403) null);
        }
        ++field6716;
        class393 var2 = new class393();
        var2.field5519 = arg1.method2338(arg0 ^ 82);
        var2.field5523 = class186.field2679.method526(var2.field5519, 5364);
        return var2;
    }

    static {
        new class530("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new class530("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field6722 = 1;
    }
}
