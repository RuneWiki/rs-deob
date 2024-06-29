import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class73 extends class452 {

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "Ldv;")
    public class471 field1031;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "Lhf;")
    public class273 field1042;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "[F")
    public static float[] field1040 = new float[16];

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "[Ltp;")
    public static class374[] field1038 = new class374[4];

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "Z")
    public static boolean field1045 = false;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "Lul;")
    public static class406 field1043;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(III)I")
    public static final int method633(int arg0, int arg1, int arg2) {
        field1029++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 >= -80) {
            field1040 = null;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
    public static final int method634(int arg0) {
        field1030++;
        if (arg0 >= -45) {
            method633(82, -66, -14);
        }
        class13 var1 = class425.field6331;
        synchronized (class425.field6331) {
            return class425.field6331.method85(11049);
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(III)I")
    public static final int method635(int arg0, int arg1, int arg2) {
        field1036++;
        if (arg1 == 1 || arg1 == 3) {
            return class422.field6286[arg0 & 0x3];
        } else {
            if (arg2 != 29722) {
                method638(1, 120);
            }
            return class13.field185[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIBII[F)V")
    public static final void method636(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, float[] arg6) {
        field1039++;
        if (arg0 > 0 && !class474.method2851(arg0, (byte) -52)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class474.method2851(arg1, (byte) 112)) {
            if (arg3 != -29) {
                field1038 = null;
            }
            int var7 = client.method1373(arg2, (byte) -33);
            int var8 = 0;
            int var9 = arg0 < arg1 ? arg0 : arg1;
            int var10 = arg0 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg6;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg0, arg1, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg1 = var11;
                var12 = var15;
                arg0 = var10;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "(I)V")
    public static void method637(int arg0) {
        field1038 = null;
        if (arg0 != 4) {
            method635(-69, 40, 60);
        }
        field1040 = null;
        field1043 = null;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ldv;Lmq;)V")
    public class73(class471 arg0, class354 arg1) {
        this.field1031 = arg0;
        this.field1042 = this.field1031.method2839(51);
        this.method639(35);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
    public static final void method638(int arg0, int arg1) {
        class138 var2 = client.field3311[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class138 var4 = client.field3311[var3][arg0][arg1] = client.field3311[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2099--;
                for (class327 var5 = var4.field2118; var5 != null; var5 = var5.field4922) {
                    class389 var6 = var5.field4921;
                    if (var6.field5836 == arg0 && var6.field5830 == arg1) {
                        var6.field5826--;
                    }
                }
            }
        }
        if (client.field3311[0][arg0][arg1] == null) {
            client.field3311[0][arg0][arg1] = new class138(0, arg0, arg1);
            client.field3311[0][arg0][arg1].field2119 = 1;
        }
        client.field3311[0][arg0][arg1].field2101 = var2;
        client.field3311[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)V")
    public final void method639(int arg0) {
        field1035++;
        this.field1041 = this.field1031.field6806;
        this.field1044 = this.field1031.field6803;
        this.field1034 = this.field1031.field6805;
        if (this.field1031.field6809 != null) {
            this.field1031.field6809.method217(this.field1042.field4177, this.field1042.field4172, this.field1042.field4179, class285.field4325);
        }
        this.field1032 = class285.field4325[0];
        if (arg0 < 15) {
            method638(47, -39);
        }
        this.field1037 = class285.field4325[2];
    }
}
