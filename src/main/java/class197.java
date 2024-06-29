import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class197 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lfc;")
    private class174 field2800 = new class174(16);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Loi;")
    private class53 field2799;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lqi;")
    public static class406 field2802 = new class406(16);

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Ldk;", line = 5)
    private final class360 method1240(int arg0, int arg1) {
        field2805++;
        class174 var3 = this.field2800;
        class360 var4;
        synchronized (this.field2800) {
            var4 = (class360) this.field2800.method1088((long) arg0, (byte) 36);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field2799;
        byte[] var6;
        synchronized (this.field2799) {
            var6 = this.field2799.method426(29, (byte) 9, arg0);
        }
        class360 var7 = new class360();
        if (var6 != null) {
            var7.method2127(new class403(var6), (byte) -88);
        }
        class174 var8 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method1097(arg1 ^ 0x4CAB, var7, (long) arg0);
            if (arg1 != 0) {
                this.field2800 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILja;II)Lpf;", line = 38)
    public final class419 method1241(int arg0, int arg1, int arg2, class186 arg3, int arg4, int arg5) {
        field2804++;
        class420[] var7 = null;
        class360 var8 = this.method1240(arg5, arg0 ^ arg0);
        if (var8.field5153 != null) {
            var7 = new class420[var8.field5153.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class57 var10 = arg3.method1182(var8.field5153[var9], 30);
                var7[var9] = new class420(var10.field719, var10.field717, var10.field718, var10.field725, var10.field713, var10.field724, var10.field721, var10.field720);
            }
        }
        return new class419(var8.field5145, var7, var8.field5151, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 68)
    public static void method1242(int arg0) {
        field2802 = null;
        if (arg0 != 16774) {
            field2809 = -102;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 78)
    public final void method1243(int arg0, byte arg1) {
        field2807++;
        class174 var3 = this.field2800;
        synchronized (this.field2800) {
            if (arg1 != -37) {
                field2802 = null;
            }
            this.field2800.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)I", line = 91)
    public static final int method1244(int arg0, byte arg1) {
        if (arg1 < 125) {
            field2802 = null;
        }
        field2801++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[I[IILih;I)Leo;", line = 106)
    public static final class198 method1245(byte arg0, int[] arg1, int[] arg2, int arg3, class503 arg4, int arg5) {
        field2803++;
        byte[] var6 = new byte[arg3 * arg5];
        if (arg0 > -33) {
            method1244(-34, (byte) -92);
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class198(arg4, arg5, arg3, var6);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 139)
    public final void method1246(int arg0) {
        class174 var2 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method1095(0);
        }
        if (arg0 > 23) {
            field2798++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 152)
    public final void method1247(boolean arg0) {
        class174 var2 = this.field2800;
        synchronized (this.field2800) {
            if (arg0) {
                method1244(108, (byte) 47);
            }
            this.field2800.method1096((byte) 127);
        }
        field2806++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 166)
    public static final void method1248(byte arg0) {
        field2796++;
        if (class131.field1729 == -1 || class101.field1343 == -1) {
            return;
        }
        int var1 = ((class207.field3004 - class155.field2239) * class216.field3123 >> 16) + class155.field2239;
        class216.field3123 += var1;
        if (class216.field3123 < 65535) {
            class217.field3151 = false;
            class1.field40 = false;
        } else {
            if (class217.field3151) {
                class1.field40 = false;
            } else {
                class1.field40 = true;
            }
            class216.field3123 = 65535;
            class217.field3151 = true;
        }
        float var2 = (float) class216.field3123 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class383.field5388 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class355.field5087[class131.field1729][var4][var5] * 3;
            int var22 = class355.field5087[class131.field1729][var4 + 1][var5] * 3;
            int var23 = (class355.field5087[class131.field1729][var4 + 2][var5] + class355.field5087[class131.field1729][var4 + 2][var5] - class355.field5087[class131.field1729][var4 + 3][var5]) * 3;
            int var24 = class355.field5087[class131.field1729][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class355.field5087[class131.field1729][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class515.field7596 = (int) var3[2] - (class367.field5241 * 128);
        class478.field6654 = (int) var3[0] - class441.field6171 * 128;
        class51.field619 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class53.field675 * 2;
        if (arg0 != -124) {
            return;
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class355.field5087[class101.field1343][var7][var8] * 3;
            int var15 = class355.field5087[class101.field1343][var7 + 1][var8] * 3;
            int var16 = (-class355.field5087[class101.field1343][var7 + 3][var8] - (-class355.field5087[class101.field1343][var7 + 2][var8] - class355.field5087[class101.field1343][var7 + 2][var8])) * 3;
            int var17 = class355.field5087[class101.field1343][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class355.field5087[class101.field1343][var7 - -2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class41.field450 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class8.field122 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class194.field2743 = ((class355.field5087[class131.field1729][var4 + 2][3] - class355.field5087[class131.field1729][var4][3]) * class216.field3123 >> 16) + class355.field5087[class131.field1729][var4][3];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILir;)V", line = 272)
    public static final void method1249(int arg0, int arg1, int arg2, class22 arg3) {
        int var4 = 15 / ((arg1 + 61) / 63);
        if (arg3.field3320 == arg0 && arg0 != -1) {
            class449 var5 = class62.field784.method2566(arg0, -19);
            int var6 = var5.field6286;
            if (var6 == 1) {
                arg3.field3361 = arg2;
                arg3.field3277 = 0;
                arg3.field3288 = 0;
                arg3.field3284 = 1;
                arg3.field3312 = 0;
                class190.method1213(arg3.field3312, arg3.field1896, (byte) 108, var5, arg3.field1904, class246.field3587 == arg3, arg3.field1899);
            }
            if (var6 == 2) {
                arg3.field3288 = 0;
            }
        } else if (arg0 == -1 || arg3.field3320 == -1 || class62.field784.method2566(arg0, -19).field6274 >= class62.field784.method2566(arg3.field3320, -19).field6274) {
            arg3.field3361 = arg2;
            arg3.field3376 = arg3.field3369;
            arg3.field3312 = 0;
            arg3.field3320 = arg0;
            arg3.field3288 = 0;
            arg3.field3284 = 1;
            arg3.field3277 = 0;
            if (arg3.field3320 != -1) {
                class190.method1213(arg3.field3312, arg3.field1896, (byte) -120, class62.field784.method2566(arg3.field3320, -19), arg3.field1904, class246.field3587 == arg3, arg3.field1899);
            }
        }
        field2797++;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 328)
    public class197(class205 arg0, int arg1, class53 arg2) {
        this.field2799 = arg2;
        this.field2799.method435(29, 0);
    }
}
