import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class692 {

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Ltv;")
    public class435 field9799 = new class435();

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9797 = class122.method983(1600, -257);

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Lvh;")
    public static class125 field9811 = new class125(12, -1);

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Leda;")
    public static class116 field9815 = new class116(29, 5);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Ltv;")
    private class435 field9814;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I", line = 6)
    public final int method3890(int arg0) {
        field9813++;
        int var2 = arg0;
        for (class435 var3 = this.field9799.field6259; var3 != this.field9799; var3 = var3.field6259) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILau;)V", line = 31)
    public final void method3891(int arg0, class692 arg1) {
        if (arg0 != -24608) {
            field9797 = -20;
        }
        this.method3893(arg1, (byte) 17, this.field9799.field6259);
        field9798++;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 42)
    public static final void method3892(int arg0) {
        class418.field5949.method900(true);
        field9807++;
        if (arg0 != -7848) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class508.field7567[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class202.field3119[var2] = 0L;
        }
        class453.field6527 = 0;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lau;BLtv;)V", line = 73)
    private final void method3893(class692 arg0, byte arg1, class435 arg2) {
        field9808++;
        class435 var4 = this.field9799.field6258;
        this.field9799.field6258 = arg2.field6258;
        arg2.field6258.field6259 = this.field9799;
        if (this.field9799 != arg2) {
            arg2.field6258 = arg0.field9799.field6258;
            arg2.field6258.field6259 = arg2;
            arg0.field9799.field6258 = var4;
            var4.field6259 = arg0.field9799;
        }
        if (arg1 != 17) {
            this.field9814 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 96)
    public static final long method3894(String arg0, int arg1) {
        field9806++;
        int var2 = arg0.length();
        if (arg1 != -2) {
            field9797 = -21;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)Ltv;", line = 119)
    public final class435 method3895(boolean arg0) {
        field9795++;
        class435 var2 = this.field9799.field6258;
        if (this.field9799 == var2) {
            this.field9814 = null;
            return null;
        } else if (arg0) {
            this.field9814 = var2.field6258;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 145)
    public final void method3896(int arg0) {
        while (true) {
            class435 var2 = this.field9799.field6259;
            if (this.field9799 == var2) {
                field9805++;
                this.field9814 = null;
                if (arg0 != 3) {
                    field9815 = null;
                    return;
                }
                return;
            }
            var2.method2549((byte) 42);
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V", line = 168)
    public static final void method3897(boolean arg0) {
        if (class637.field9048.method757()) {
            class637.field9048.method803(class126.field2061);
            class265.method1684(6);
            class637.field9048.method800(class126.field2061);
            class637.field9048.method758(class126.field2061);
        } else {
            class251.method1604(96, class76.field1182);
        }
        field9803++;
        class498.method2983(10);
        if (!arg0) {
            field9797 = 100;
        }
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V", line = 189)
    public static final void method3898(int arg0) {
        field9812++;
        if (class656.field9268 == -1 || class638.field9054 == -1) {
            return;
        }
        int var1 = ((class37.field492 - class487.field6959) * class256.field3693 >> 16) + class487.field6959;
        class256.field3693 += var1;
        if (class256.field3693 < 65535) {
            class540.field7937 = false;
            class28.field402 = false;
        } else {
            class256.field3693 = 65535;
            if (class28.field402) {
                class540.field7937 = false;
            } else {
                class540.field7937 = true;
            }
            class28.field402 = true;
        }
        float var2 = (float) class256.field3693 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class83.field1266 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class115.field1833[class656.field9268][var4][var5] * 3;
            int var22 = class115.field1833[class656.field9268][var4 + 1][var5] * 3;
            int var23 = (class115.field1833[class656.field9268][var4 + 2][var5] + class115.field1833[class656.field9268][var4 + 2][var5] - class115.field1833[class656.field9268][var4 + 3][var5]) * 3;
            int var24 = class115.field1833[class656.field9268][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class115.field1833[class656.field9268][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class322.field4478 = (int) var3[2] - (class63.field917 * 512);
        class277.field3933 = (int) var3[arg0] * -1;
        class551.field8078 = (int) var3[0] - (class143.field2474 * 512);
        float[] var6 = new float[3];
        int var7 = class173.field2788 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class115.field1833[class638.field9054][var7][var8] * 3;
            int var15 = class115.field1833[class638.field9054][var7 + 1][var8] * 3;
            int var16 = (class115.field1833[class638.field9054][var7 + 2][var8] + class115.field1833[class638.field9054][var7 + 2][var8] - class115.field1833[class638.field9054][var7 + 3][var8]) * 3;
            int var17 = class115.field1833[class638.field9054][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class115.field1833[class638.field9054][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class666.field9366 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class432.field6220 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class694.field9854 = class115.field1833[class656.field9268][var4][3] + ((class115.field1833[class656.field9268][var4 + 2][3] - class115.field1833[class656.field9268][var4][3]) * class256.field3693 >> 16);
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)Ltv;", line = 293)
    public final class435 method3899(int arg0) {
        field9804++;
        class435 var2 = this.field9814;
        if (this.field9799 == var2) {
            this.field9814 = null;
            return null;
        }
        if (arg0 != 0) {
            this.field9814 = null;
        }
        this.field9814 = var2.field6259;
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(Z)V", line = 313)
    public static void method3900(boolean arg0) {
        field9811 = null;
        field9815 = null;
        if (!arg0) {
            method3892(61);
        }
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)Ltv;", line = 331)
    public final class435 method3901(int arg0) {
        field9809++;
        class435 var2 = this.field9814;
        if (this.field9799 == var2) {
            this.field9814 = null;
            return null;
        } else {
            this.field9814 = var2.field6258;
            return arg0 == 1 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 407)
    public class692() {
        this.field9799.field6259 = this.field9799;
        this.field9799.field6258 = this.field9799;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ltv;I)V", line = 356)
    public final void method3902(class435 arg0, int arg1) {
        field9802++;
        if (arg0.field6258 != null) {
            arg0.method2549((byte) 113);
        }
        arg0.field6259 = this.field9799.field6259;
        if (arg1 != 0) {
            this.field9814 = null;
        }
        arg0.field6258 = this.field9799;
        arg0.field6258.field6259 = arg0;
        arg0.field6259.field6258 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "(I)Z", line = 376)
    public final boolean method3903(int arg0) {
        field9800++;
        if (arg0 != 2) {
            this.method3901(-48);
        }
        return this.field9799.field6259 == this.field9799;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Ltv;I)V", line = 391)
    public final void method3904(class435 arg0, int arg1) {
        if (arg0.field6258 != null) {
            arg0.method2549((byte) 101);
        }
        field9801++;
        arg0.field6258 = this.field9799.field6258;
        arg0.field6259 = this.field9799;
        arg0.field6258.field6259 = arg0;
        arg0.field6259.field6258 = arg0;
        if (arg1 != 0) {
            field9797 = 23;
        }
    }

    @OriginalMember(owner = "client!au", name = "h", descriptor = "(I)Ltv;", line = 417)
    public final class435 method3905(int arg0) {
        field9796++;
        class435 var2 = this.field9799.field6259;
        if (arg0 > -104) {
            this.field9814 = null;
        }
        if (this.field9799 == var2) {
            this.field9814 = null;
            return null;
        } else {
            this.field9814 = var2.field6259;
            return var2;
        }
    }

    @OriginalMember(owner = "client!au", name = "i", descriptor = "(I)Ltv;", line = 441)
    public final class435 method3906(int arg0) {
        field9810++;
        class435 var2 = this.field9799.field6259;
        if (this.field9799 == var2) {
            return null;
        }
        var2.method2549((byte) 104);
        if (arg0 != 0) {
            this.method3901(-23);
        }
        return var2;
    }
}
