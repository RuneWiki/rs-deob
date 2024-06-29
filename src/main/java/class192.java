import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class192 extends class424 {

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "[Lku;")
    public class192[] field2456;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Z")
    public boolean field2449;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "Lmw;")
    public class429 field2467;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "Ltm;")
    public class555 field2448;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2461;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 4)
    public static void method1250(byte arg0) {
        int var1 = -78 % ((-arg0 - 12) / 48);
        field2461 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)[I", line = 20)
    public int[] method118(int arg0, byte arg1) {
        field2452++;
        if (arg1 > -123) {
            this.method1255(99);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIB)[[I", line = 33)
    public final int[][] method1251(int arg0, int arg1, byte arg2) {
        int var4 = 48 / ((15 - arg2) / 47);
        field2455++;
        if (this.field2456[arg0].field2449) {
            int[] var5 = this.field2456[arg0].method118(arg1, (byte) -124);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field2456[arg0].method107(arg1, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLdg;)V", line = 66)
    public static final void method1252(byte arg0, class193 arg1) {
        int var2 = 33 / ((arg0 + 14) / 51);
        field2466++;
        class118 var3 = (class118) class145.field1891.method39((long) arg1.field2960, 31750);
        if (var3 == null) {
            return;
        }
        if (var3.field1530 != null) {
            class690.field9426.method2236(var3.field1530);
            var3.field1530 = null;
        }
        var3.method2438((byte) 7);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)[I", line = 95)
    public final int[] method1253(int arg0, int arg1, int arg2) {
        field2457++;
        if (arg0 == 0) {
            return this.field2456[arg2].field2449 ? this.field2456[arg2].method118(arg1, (byte) -124) : this.field2456[arg2].method107(arg1, (byte) 108)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)V", line = 118)
    public void method1254(int arg0, byte arg1, int arg2) {
        if (arg1 < 51) {
            this.field2449 = true;
        }
        field2459++;
        int var4 = this.field2454 == 255 ? arg0 : this.field2454;
        if (this.field2449) {
            this.field2448 = new class555(var4, arg0, arg2);
        } else {
            this.field2467 = new class429(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 141)
    public void method1255(int arg0) {
        field2450++;
        if (this.field2449) {
            this.field2448.method2975((byte) -14);
            this.field2448 = null;
        } else {
            this.field2467.method2467(false);
            this.field2467 = null;
        }
        int var2 = 2 % ((11 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)V", line = 165)
    public void method618(byte arg0) {
        field2453++;
        if (arg0 != 63) {
            this.field2449 = true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IIB)Z", line = 175)
    public static final boolean method1256(int arg0, int arg1, byte arg2) {
        if (arg2 >= -13) {
            return false;
        } else {
            field2465++;
            return class688.method3756(arg0, arg1, -107) & class125.method919(arg0, (byte) -125, arg1);
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)I", line = 186)
    public int method1257(byte arg0) {
        field2458++;
        int var2 = 11 % ((-arg0 - 30) / 58);
        return -1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)I", line = 196)
    public static final int method1258(boolean arg0, int arg1) {
        field2451++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0) {
                method1258(true, -108);
            }
            return class608.method3305(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I", line = 210)
    public int method1259(boolean arg0) {
        field2447++;
        if (arg0) {
            this.method1255(-65);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 224)
    public static final void method1260(int arg0) {
        field2460++;
        if (class424.field5505 == -1 || class660.field9205 == -1) {
            return;
        }
        int var1 = ((class50.field705 - class564.field7366) * class171.field2121 >> 16) + class564.field7366;
        class171.field2121 += var1;
        if (class171.field2121 < 65535) {
            class424.field5502 = false;
            class622.field8430 = false;
        } else {
            class171.field2121 = 65535;
            if (class622.field8430) {
                class424.field5502 = false;
            } else {
                class424.field5502 = true;
            }
            class622.field8430 = true;
        }
        float var2 = (float) class171.field2121 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class191.field2442 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class593.field8022[class424.field5505][var4][var5] * 3;
            int var22 = class593.field8022[class424.field5505][var4 + 1][var5] * 3;
            int var23 = (class593.field8022[class424.field5505][var4 + 2][var5] - (class593.field8022[class424.field5505][var4 + 3][var5] - class593.field8022[class424.field5505][var4 + 2][var5])) * 3;
            int var24 = class593.field8022[class424.field5505][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class593.field8022[class424.field5505][var4 + 2][var5] - var24 - (-var22 + var23);
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class655.field9120 = (int) var3[1] * -1;
        class499.field6555 = (int) var3[0] - class100.field1326 * 512;
        class549.field7132 = (int) var3[2] - class186.field2376 * 512;
        float[] var6 = new float[3];
        int var7 = class487.field6475 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class593.field8022[class660.field9205][var7][var8] * 3;
            int var15 = class593.field8022[class660.field9205][var7 + 1][var8] * 3;
            int var16 = (class593.field8022[class660.field9205][var7 + 2][var8] + class593.field8022[class660.field9205][var7 + 2][var8] - class593.field8022[class660.field9205][var7 + 3][var8]) * 3;
            int var17 = class593.field8022[class660.field9205][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class593.field8022[class660.field9205][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class299.field3911 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class358.field4639 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class470.field6146 = ((class593.field8022[class424.field5505][var4 + 2][arg0] - class593.field8022[class424.field5505][var4][3]) * class171.field2121 >> 16) + class593.field8022[class424.field5505][var4][3];
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IB)[[I", line = 331)
    public int[][] method107(int arg0, byte arg1) {
        int var3 = -85 / ((arg1 + 14) / 34);
        field2462++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILfd;I)V", line = 342)
    public void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 != -12160) {
            method1252((byte) 21, null);
        }
        field2464++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBFIFIIF)[F", line = 353)
    public static final float[] method1261(int arg0, byte arg1, float arg2, int arg3, float arg4, int arg5, int arg6, float arg7) {
        field2463++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[2] = var11;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        if (arg1 != -8) {
            field2461 = null;
        }
        var8[0] = var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + (arg5 * arg5)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg0 / var19;
            }
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var13[3] = -var15 * var17;
            var13[4] = var16;
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[2] *= arg7;
        var9[0] *= arg7;
        var9[8] *= arg2;
        var9[5] *= arg4;
        var9[4] *= arg4;
        var9[7] *= arg2;
        var9[6] *= arg2;
        var9[3] *= arg4;
        var9[1] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IZ)V", line = 437)
    public class192(int arg0, boolean arg1) {
        this.field2456 = new class192[arg0];
        this.field2449 = arg1;
    }
}
