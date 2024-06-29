import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class351 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5418 = "Close";

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[S")
    public static short[] field5420 = new short[] { 2, 40, 59, 16, 11, 18, 4, 14 };

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field5426 = 0;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lmo;")
    public static class447 field5427;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 6)
    public static void method2290(int arg0) {
        field5420 = null;
        field5418 = null;
        if (arg0 >= -69) {
            method2294(-87);
        }
        field5427 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 19)
    public static final void method2291(int arg0) {
        field5424++;
        if (arg0 != 10981 || class213.field3412.length() == 0) {
            return;
        }
        class394.method2489((byte) 15, "--> " + class213.field3412);
        class223.method1603(false, (byte) 66, class213.field3412);
        class213.field3412 = "";
        class128.field2028 = 0;
        class199.field3211 = 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BJII)V", line = 37)
    public static final void method2292(byte arg0, long arg1, int arg2, int arg3) {
        field5419++;
        if (arg0 != 61) {
            return;
        }
        int var5 = ((int) arg1 & 0x7EF0B) >> 14;
        int var6 = ((int) arg1 & 0x391C88) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class231.method1643(var5, 0, arg2, 0, true, var6, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], 0, arg3);
            return;
        }
        class127 var8 = class137.method1003(var7, -30796);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field2014;
            var9 = var8.field1944;
        } else {
            var9 = var8.field2014;
            var10 = var8.field1944;
        }
        int var11 = var8.field1962;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class231.method1643(0, var10, arg2, var11, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var9, arg3);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIIIIIIII)V", line = 89)
    public static final void method2293(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 44) {
            return;
        }
        field5423++;
        if (arg3 == arg6 && arg0 == arg9 && arg2 == arg7 && arg4 == arg8) {
            class57.method379(arg4, (byte) 15, arg2, arg5, arg0, arg3);
            return;
        }
        int var10 = arg3;
        int var11 = arg0;
        int var12 = arg3 * 3;
        int var13 = arg0 * 3;
        int var14 = arg6 * 3;
        int var15 = arg9 * 3;
        int var16 = arg7 * 3;
        int var17 = arg8 * 3;
        int var18 = arg2 + var14 - var16 - arg3;
        int var19 = var15 + arg4 - arg0 - var17;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - (var15 + var15);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg3;
            int var34 = (var30 + var32 + var28 >> 12) + arg0;
            class57.method379(var34, (byte) 15, var33, arg5, var11, var10);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V", line = 166)
    public static final void method2294(int arg0) {
        field5429++;
        if (class305.field4844 == -1 || class254.field4125 == -1) {
            return;
        }
        int var1 = ((class56.field700 - class239.field3980) * class417.field6173 >> 16) + class239.field3980;
        class417.field6173 += var1;
        if (class417.field6173 < 65535) {
            class77.field962 = false;
            class277.field4420 = false;
        } else {
            if (class77.field962) {
                class277.field4420 = false;
            } else {
                class277.field4420 = true;
            }
            class417.field6173 = 65535;
            class77.field962 = true;
        }
        if (arg0 != -1451675060) {
            method2293(-72, (byte) 36, 12, -39, -77, 25, -25, -48, 49, 51);
        }
        float var2 = (float) class417.field6173 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class239.field3979 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class271.field4348[class305.field4844][var4][var5] * 3;
            int var22 = class271.field4348[class305.field4844][var4 + 1][var5] * 3;
            int var23 = (class271.field4348[class305.field4844][var4 + 2][var5] + class271.field4348[class305.field4844][var4 + 2][var5] - class271.field4348[class305.field4844][var4 + 3][var5]) * 3;
            int var24 = class271.field4348[class305.field4844][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class271.field4348[class305.field4844][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class290.field4631 = (int) var3[2] - (class444.field6481 * 128);
        class379.field5733 = (int) var3[1] * -1;
        class427.field6301 = (int) var3[0] - (class409.field6048 * 128);
        float[] var6 = new float[3];
        int var7 = class196.field3185 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class271.field4348[class254.field4125][var7][var8] * 3;
            int var15 = class271.field4348[class254.field4125][var7 + 1][var8] * 3;
            int var16 = (class271.field4348[class254.field4125][var7 + 2][var8] + class271.field4348[class254.field4125][var7 + 2][var8] - class271.field4348[class254.field4125][var7 + 3][var8]) * 3;
            int var17 = class271.field4348[class254.field4125][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = var15 + class271.field4348[class254.field4125][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class396.field5928 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class108.field1516 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class264.field4261 = class271.field4348[class305.field4844][var4][3] + ((class271.field4348[class305.field4844][var4 + 2][3] - class271.field4348[class305.field4844][var4][3]) * class417.field6173 >> 16);
    }
}
