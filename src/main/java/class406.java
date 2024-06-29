import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class406 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljp;")
    private class236 field5580 = new class236(16);

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Lpc;")
    private class473 field5585;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lra;")
    public static class70 field5583 = new class70(10, 2, 2, 0);

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "[Lmd;")
    public static class379[] field5589 = new class379[2048];

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "Z")
    public static boolean field5591 = false;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Lpc;")
    public static class473 field5586;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lae;", line = 3)
    public final class163 method2359(int arg0, int arg1) {
        field5584++;
        class236 var3 = this.field5580;
        class163 var4;
        synchronized (this.field5580) {
            var4 = (class163) this.field5580.method1456((long) arg0, 127);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5585.method2708(arg1, arg0, (byte) 54);
        class163 var6 = new class163();
        if (var5 != null) {
            var6.method1103(new class379(var5), 76);
        }
        class236 var7 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method1462(var6, (long) arg0, arg1 ^ 0xFFFFFF90);
            return var6;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 31)
    public static final void method2360(int arg0) {
        field5588++;
        if (class450.field6127 == -1 || class520.field7699 == -1) {
            return;
        }
        int var1 = ((class494.field6865 - class31.field521) * class354.field4782 >> 16) + class31.field521;
        class354.field4782 += var1;
        if (class354.field4782 >= 65535) {
            if (class56.field882) {
                class457.field6296 = false;
            } else {
                class457.field6296 = true;
            }
            class354.field4782 = 65535;
            class56.field882 = true;
        } else {
            class457.field6296 = false;
            class56.field882 = false;
        }
        float var2 = (float) class354.field4782 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class515.field7632 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class147.field2083[class450.field6127][var4][var5] * 3;
            int var22 = class147.field2083[class450.field6127][var4 + 1][var5] * 3;
            int var23 = (class147.field2083[class450.field6127][var4 + 2][var5] + class147.field2083[class450.field6127][var4 - -2][var5] - class147.field2083[class450.field6127][var4 + 3][var5]) * 3;
            int var24 = class147.field2083[class450.field6127][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class147.field2083[class450.field6127][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class430.field5888 = (int) var3[0] - (class401.field5382 * 128);
        class168.field2438 = (int) var3[2] - class421.field5762 * 128;
        class365.field4937 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class211.field2877 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class147.field2083[class520.field7699][var7][var8] * 3;
            int var15 = class147.field2083[class520.field7699][var7 + 1][var8] * 3;
            int var16 = (class147.field2083[class520.field7699][var7 + 2][var8] + class147.field2083[class520.field7699][var7 - -2][var8] - class147.field2083[class520.field7699][var7 + 3][var8]) * 3;
            int var17 = class147.field2083[class520.field7699][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class147.field2083[class520.field7699][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class168.field2439 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class207.field2854 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class47.field699 = ((class147.field2083[class450.field6127][var4 - arg0][3] - class147.field2083[class450.field6127][var4][3]) * class354.field4782 >> 16) + class147.field2083[class450.field6127][var4][3];
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 136)
    public static final void method2361(int arg0) {
        field5582++;
        if (arg0 != -31302) {
            field5586 = null;
        }
        if (class487.field6768 != null) {
            class487.field6768.method2471(-63);
        }
        if (class322.field4216 != null) {
            class322.field4216.method2471(-50);
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 156)
    public final void method2362(int arg0) {
        class236 var2 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method1458((byte) -119);
        }
        if (arg0 != 3) {
            this.method2365(false);
        }
        field5587++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 169)
    public static void method2363(boolean arg0) {
        field5583 = null;
        field5586 = null;
        field5589 = null;
        if (!arg0) {
            field5583 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V", line = 182)
    public static final void method2364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5581++;
        class193.field2708.field5173 = 0;
        int var5 = -10 % ((arg1 + 22) / 61);
        class193.field2708.method2200(7, class514.field7579.field1514);
        class193.field2708.method2200(7, arg0);
        class193.field2708.method2200(7, arg3);
        class193.field2708.method2246(arg2, (byte) -52);
        class193.field2708.method2246(arg4, (byte) -60);
        class225.field3043 = -3;
        class146.field2069 = 0;
        class4.field110 = 0;
        class314.field4116 = 1;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lrb;ILpc;)V", line = 243)
    public class406(class234 arg0, int arg1, class473 arg2) {
        this.field5585 = arg2;
        this.field5585.method2710(30, (byte) -104);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V", line = 215)
    public final void method2365(boolean arg0) {
        field5579++;
        if (arg0) {
            class236 var2 = this.field5580;
            synchronized (this.field5580) {
                this.field5580.method1459(19088);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V", line = 231)
    public final void method2366(int arg0, int arg1) {
        field5590++;
        class236 var3 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method1461(-5, arg1);
        }
        if (arg0 != 3) {
            this.field5580 = null;
        }
    }
}
