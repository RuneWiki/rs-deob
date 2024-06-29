import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class196 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lfc;")
    private class262 field2343 = new class262(64);

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lfc;")
    private class262 field2347 = new class262(100);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lni;")
    private class522 field2337;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1085(boolean arg0) {
        class262 var2 = this.field2343;
        synchronized (this.field2343) {
            this.field2343.method1563(109);
        }
        field2336++;
        class262 var3 = this.field2347;
        synchronized (this.field2347) {
            if (!arg0) {
                this.method1091(-55, 58);
            }
            this.field2347.method1563(86);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 21)
    public final void method1086(int arg0) {
        class262 var2 = this.field2343;
        synchronized (this.field2343) {
            this.field2343.method1575((byte) 18);
        }
        field2345++;
        class262 var3 = this.field2347;
        synchronized (this.field2347) {
            this.field2347.method1575((byte) 109);
            if (arg0 != -2118) {
                this.field2347 = null;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1087(int arg0) {
        field2340++;
        if (class409.field5778 == -1 || class695.field9715 == -1) {
            return;
        }
        int var1 = ((class96.field1248 - class166.field2077) * class52.field548 >> 16) + class166.field2077;
        class52.field548 += var1;
        if (class52.field548 >= 65535) {
            if (class619.field8674) {
                class631.field8782 = false;
            } else {
                class631.field8782 = true;
            }
            class52.field548 = 65535;
            class619.field8674 = true;
        } else {
            class631.field8782 = false;
            class619.field8674 = false;
        }
        float var2 = (float) class52.field548 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class346.field4615 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class523.field7048[class409.field5778][var4][var5] * 3;
            int var22 = class523.field7048[class409.field5778][var4 + 1][var5] * 3;
            int var23 = (class523.field7048[class409.field5778][var4 + 2][var5] - (class523.field7048[class409.field5778][var4 + 3][var5] - class523.field7048[class409.field5778][var4 + 2][var5])) * 3;
            int var24 = class523.field7048[class409.field5778][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class523.field7048[class409.field5778][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class262.field3429 = (int) var3[1] * -1;
        class684.field9518 = (int) var3[2] - class133.field1704 * 512;
        class294.field3956 = (int) var3[0] - (class99.field1313 * 512);
        float[] var6 = new float[3];
        int var7 = class60.field652 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class523.field7048[class695.field9715][var7][var8] * 3;
            int var15 = class523.field7048[class695.field9715][var7 + 1][var8] * 3;
            int var16 = (class523.field7048[class695.field9715][var7 + 2][var8] - (class523.field7048[class695.field9715][var7 + 3][var8] - class523.field7048[class695.field9715][var7 + 2][var8])) * 3;
            int var17 = class523.field7048[class695.field9715][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class523.field7048[class695.field9715][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[arg0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class74.field801 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class710.field9907 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class659.field9198 = class523.field7048[class409.field5778][var4][3] + ((class523.field7048[class409.field5778][var4 + 2][3] - class523.field7048[class409.field5778][var4][3]) * class52.field548 >> 16);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 139)
    public final void method1088(int arg0, int arg1) {
        field2344++;
        class262 var3 = this.field2343;
        synchronized (this.field2343) {
            this.field2343.method1569((byte) 62, arg0);
        }
        if (arg1 == 3) {
            class262 var4 = this.field2347;
            synchronized (this.field2347) {
                this.field2347.method1569((byte) 62, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BBI)[B", line = 157)
    public static final byte[] method1089(byte[] arg0, byte arg1, int arg2) {
        field2346++;
        byte[] var3 = new byte[arg2];
        class373.method2194(arg0, 0, var3, 0, arg2);
        if (arg1 > -100) {
            method1089(null, (byte) 61, 124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Lgaa;", line = 172)
    public final class300 method1090(int arg0, int arg1) {
        field2338++;
        class262 var3 = this.field2343;
        class300 var4;
        synchronized (this.field2343) {
            var4 = (class300) this.field2343.method1571(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2337;
        byte[] var6;
        synchronized (this.field2337) {
            var6 = this.field2337.method2885(class96.method659(arg0, 127), class425.method2436(arg0, arg1 ^ 0x2DEA8938), false);
        }
        class300 var7 = new class300();
        if (arg1 != 16383) {
            return null;
        }
        var7.field4050 = this;
        var7.field4052 = arg0;
        if (var6 != null) {
            var7.method1799(new class611(var6), -125);
        }
        var7.method1804(arg1 - 16508);
        class262 var8 = this.field2343;
        synchronized (this.field2343) {
            this.field2343.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)Ljea;", line = 211)
    public final class452 method1091(int arg0, int arg1) {
        field2341++;
        if (arg0 != 2) {
            this.method1090(20, 104);
        }
        class262 var3 = this.field2347;
        synchronized (this.field2347) {
            class452 var4 = (class452) this.field2347.method1571(-120, (long) arg1);
            if (var4 == null) {
                var4 = new class452(arg1);
                this.field2347.method1574((long) arg1, var4, (byte) -80);
            }
            return var4.method2524((byte) 66) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V", line = 238)
    public static final void method1092(boolean arg0, int arg1) {
        if (arg0) {
            method1087(104);
        }
        field2342++;
        class252 var2 = class150.method916(arg1, -105, 4);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lrga;ILni;Lni;Lni;)V", line = 260)
    public class196(class242 arg0, int arg1, class522 arg2, class522 arg3, class522 arg4) {
        this.field2337 = arg2;
        if (this.field2337 != null) {
            int var6 = this.field2337.method2892((byte) -11) - 1;
            this.field2337.method2901(0, var6);
        }
        class33.method156((byte) 33, arg4, 2, arg3);
    }
}
