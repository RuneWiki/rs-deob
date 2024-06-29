import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class78 {

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Lwm;")
    private class399 field1564 = new class399(64);

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lph;")
    private class459 field1567;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Lph;")
    private class459 field1569;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lur;")
    public static class378 field1560;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Ljd;")
    public final class155 method697(int arg0, int arg1) {
        field1561++;
        class155 var3 = (class155) this.field1564.method2478(arg1 + 4, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field1569.method2757(0, arg0, (byte) -118);
        } else {
            var4 = this.field1567.method2757(0, arg0 & 0x7FFF, (byte) -127);
        }
        if (arg1 != -3) {
            return null;
        }
        class155 var5 = new class155();
        if (var4 != null) {
            var5.method1124((byte) -36, new class289(var4));
        }
        if (arg0 >= 32768) {
            var5.method1122(-110);
        }
        this.field1564.method2472(-73, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(JILgh;IILta;III)V")
    public static final void method698(long arg0, int arg1, class388 arg2, int arg3, int arg4, class144 arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 256) {
            return;
        }
        field1568++;
        int var10 = arg7 * arg7 + arg8 * arg8;
        if (((long) var10) > arg0) {
            return;
        }
        int var11 = Math.min(arg2.field5745 / 2, arg2.field5712 / 2);
        if (var10 <= var11 * var11) {
            class358.method2206(arg2, arg6, arg1, (byte) -54, arg8, arg7, class133.field2239[arg4], arg5);
            return;
        }
        var11 -= 10;
        int var12;
        if (class510.field7435 == 4) {
            var12 = (int) class525.field7631 & 0x3FFF;
        } else {
            var12 = (int) class525.field7631 + class1.field49 & 0x3FFF;
        }
        int var13 = class407.field6169[var12];
        int var14 = class407.field6168[var12];
        if (class510.field7435 != 4) {
            var14 = var14 * 256 / (class60.field1242 + 256);
            var13 = var13 * 256 / (class60.field1242 + 256);
        }
        int var15 = arg7 * var14 + arg8 * var13 >> 15;
        int var16 = arg8 * var14 - (arg7 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class256.field3927[arg4].method164((float) arg2.field5745 / 2.0F + (float) arg1 + (float) var19, (float) arg2.field5712 / 2.0F + (float) arg6 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static final void method699(int arg0) {
        field1562++;
        if (class507.field7396 == -1 || class449.field6677 == -1) {
            return;
        }
        int var1 = ((class320.field4888 - class110.field2009) * class170.field2763 >> 16) + class110.field2009;
        class170.field2763 += var1;
        if (~class170.field2763 <= arg0) {
            if (class238.field3677) {
                class366.field5365 = false;
            } else {
                class366.field5365 = true;
            }
            class170.field2763 = 65535;
            class238.field3677 = true;
        } else {
            class366.field5365 = false;
            class238.field3677 = false;
        }
        float var2 = (float) class170.field2763 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class466.field6928 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class141.field2343[class507.field7396][var4][var5] * 3;
            int var22 = class141.field2343[class507.field7396][var4 + 1][var5] * 3;
            int var23 = (class141.field2343[class507.field7396][var4 + 2][var5] + class141.field2343[class507.field7396][var4 + 2][var5] - class141.field2343[class507.field7396][var4 + 3][var5]) * 3;
            int var24 = class141.field2343[class507.field7396][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class141.field2343[class507.field7396][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class428.field6406 = (int) var3[1] * -1;
        class509.field7427 = (int) var3[0] - class496.field7292 * 128;
        class432.field6435 = (int) var3[2] - (class212.field3378 * 128);
        float[] var6 = new float[3];
        int var7 = class75.field1532 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class141.field2343[class449.field6677][var7][var8] * 3;
            int var15 = class141.field2343[class449.field6677][var7 + 1][var8] * 3;
            int var16 = (class141.field2343[class449.field6677][var7 + 2][var8] - (class141.field2343[class449.field6677][var7 + 3][var8] - class141.field2343[class449.field6677][var7 + 2][var8])) * 3;
            int var17 = class141.field2343[class449.field6677][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class141.field2343[class449.field6677][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class41.field577 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class139.field2325 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class311.field4707 = ((class141.field2343[class507.field7396][var4 + 2][3] - class141.field2343[class507.field7396][var4][3]) * class170.field2763 >> 16) + class141.field2343[class507.field7396][var4][3];
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lh;[[BI)V")
    public static final void method700(class474 arg0, byte[][] arg1, int arg2) {
        field1563++;
        int var3 = class533.field7730.length;
        int var4 = 0;
        if (arg2 != 255) {
            field1560 = null;
        }
        while (var4 < var3) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class58.field1227[var4] >> 8) * 64 - class496.field7292;
                int var7 = (class58.field1227[var4] & 0xFF) * 64 - class212.field3378;
                class42.method255(81);
                arg0.method2836(var5, class262.field4006, (byte) 117, class67.field1367, var7, var6);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 3) {
            field1560 = null;
        }
        field1565++;
        int var6 = class73.method640(class216.field3415, (byte) -86, class372.field5455, arg0);
        int var7 = class73.method640(class216.field3415, (byte) -67, class372.field5455, arg2);
        int var8 = class73.method640(class43.field600, (byte) -64, class467.field6940, arg5);
        int var9 = class73.method640(class43.field600, (byte) -99, class467.field6940, arg3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class503.method3027(var8, (byte) 127, var9, arg4, class316.field4797[var10]);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILta;Lfj;IIIIBLgh;ILla;Ljava/lang/String;)V")
    public static final void method702(int arg0, class144 arg1, class470 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, class388 arg8, int arg9, class317 arg10, String arg11) {
        field1566++;
        int var12;
        if (class510.field7435 == 4) {
            var12 = (int) class525.field7631 & 0x3FFF;
        } else {
            var12 = (int) class525.field7631 + class1.field49 & 0x3FFF;
        }
        int var13 = Math.max(arg8.field5745 / 2, arg8.field5712 / 2) + 10;
        int var14 = arg4 * arg4 + (arg0 * arg0);
        if (var13 * var13 < var14) {
            return;
        }
        if (arg7 != -37) {
            method703(false);
        }
        int var15 = class407.field6169[var12];
        int var16 = class407.field6168[var12];
        if (class510.field7435 != 4) {
            var15 = var15 * 256 / (class60.field1242 + 256);
            var16 = var16 * 256 / (class60.field1242 + 256);
        }
        int var17 = arg0 * var15 + (arg4 * var16) >> 15;
        int var18 = arg0 * var16 - (arg4 * var15) >> 15;
        int var19 = arg2.method2813(null, 100, true, arg11);
        int var20 = var17 - var19 / 2;
        int var21 = arg2.method2805(100, arg11, 0, (byte) -87, null);
        if ((-arg8.field5745) <= var20 && var20 <= arg8.field5745 && var18 >= -arg8.field5712 && var18 <= arg8.field5712) {
            arg10.method2012((byte) 118, arg5, 0, arg3 + arg8.field5712 / 2 - var21 - var18 - arg6, arg3, arg8.field5745 / 2 + arg5 + var20, arg11, 1, 50, 0, 0, null, var19, arg9, arg1, null);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method703(boolean arg0) {
        field1560 = null;
        if (!arg0) {
            field1560 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILph;Lph;)V")
    public class78(int arg0, class459 arg1, class459 arg2) {
        this.field1567 = arg2;
        this.field1569 = arg1;
        if (this.field1569 != null) {
            this.field1569.method2763(0, -3);
        }
        if (this.field1567 != null) {
            this.field1567.method2763(0, -3);
        }
    }
}
