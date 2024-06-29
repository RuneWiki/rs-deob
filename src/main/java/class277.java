import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class277 extends class176 {

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "F")
    public float field4131;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "F")
    public float field4127;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "Z")
    public boolean field4130;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "Lsc;")
    public static class236 field4128 = new class236();

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4129 = new String[100];

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field4136 = 765;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "S")
    public static short field4133 = 32767;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "Lqt;")
    public static class459 field4134 = new class459(1, -1);

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "Leu;")
    public static class341 field4138;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "Lrv;")
    public static class73 field4139;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "[[[Lmm;")
    public static class188[][][] field4137;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIIZ[I)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4135 = arg3;
        if (~super.field1881 == -34038) {
            this.field4131 = (float) arg2;
            this.field4127 = (float) arg3;
            this.field4130 = false;
        } else {
            this.field4130 = true;
            this.field4131 = this.field4127 = 1.0F;
        }
        this.field4125 = arg2;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIIIIIZ)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4131 = (float) arg3 / (float) arg5;
        this.field4130 = false;
        this.field4135 = arg4;
        this.field4127 = (float) arg4 / (float) arg6;
        this.field4125 = arg3;
        this.method1226(false, false, (byte) -85);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static final void method1781(int arg0) {
        ++field4126;
        if (~class188.field2765 != 0) {
            int var1 = class49.field909.method639((byte) 21);
            int var2 = class49.field909.method644(101);
            class191 var3 = (class191) class425.field6027.method863(-1);
            if (var3 != null) {
                var1 = var3.method1301((byte) 39);
                var2 = var3.method1302(-6);
            }
            int var4 = -11 / ((arg0 - 64) / 55);
            class121.method890(0, 0, class188.field2765, 0, var1, 1, var2, 0, class76.field1247, class50.field927);
            if (class80.field1302 != null) {
                class342.method2164(var2, 1, var1);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static final void method1782(int arg0) {
        ++field4132;
        if (class470.field6825 == null) {
            class470.field6825 = new int[65536];
            if (arg0 != 1) {
                field4139 = null;
            }
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var3 = 0;
            for (int var4 = 0; var4 < 512; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; var7 < 128; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (~var14 != -1) {
                        if (var14 != 1) {
                            if (~var14 == -3) {
                                var10 = var8;
                                var11 = var18;
                                var9 = var16;
                            } else if (~var14 != -4) {
                                if (var14 == 4) {
                                    var9 = var18;
                                    var11 = var8;
                                    var10 = var16;
                                } else if (~var14 == -6) {
                                    var10 = var16;
                                    var9 = var8;
                                    var11 = var17;
                                }
                            } else {
                                var11 = var8;
                                var9 = var16;
                                var10 = var17;
                            }
                        } else {
                            var10 = var8;
                            var9 = var17;
                            var11 = var16;
                        }
                    } else {
                        var10 = var18;
                        var9 = var8;
                        var11 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) + -16777216 + (var23 << 8) + var24;
                    class470.field6825[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4129 = null;
        field4138 = null;
        field4139 = null;
        field4128 = null;
        field4137 = null;
        if (arg0 != 0) {
            method1783(55);
        }
        field4134 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIIII[BI)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4135 = arg3;
        this.field4125 = arg2;
        this.method1232(-8733, 0, arg2, arg7, 0, 0, 0, true, arg3, arg6);
        this.field4130 = false;
        this.field4131 = (float) arg2 / (float) arg4;
        this.field4127 = (float) arg3 / (float) arg5;
        this.method1226(false, false, (byte) -61);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIIIIZ)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field1881 != 34037) {
            this.field4131 = this.field4127 = 1.0F;
            this.field4130 = true;
        } else {
            this.field4130 = false;
            this.field4131 = (float) arg4;
            this.field4127 = (float) arg5;
        }
        this.field4135 = arg5;
        this.field4125 = arg4;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIIIZ[BI)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field1881 != 34037) {
            this.field4131 = this.field4127 = 1.0F;
            this.field4130 = true;
        } else {
            this.field4127 = (float) arg4;
            this.field4130 = false;
            this.field4131 = (float) arg3;
        }
        this.field4135 = arg4;
        this.field4125 = arg3;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lbt;IIII[I)V")
    public class277(class33 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4125 = arg1;
        this.field4135 = arg2;
        this.method1227(0, true, 0, 0, 0, arg2, 0, arg5, arg1);
        this.field4131 = (float) arg1 / (float) arg3;
        this.field4130 = false;
        this.field4127 = (float) arg2 / (float) arg4;
        this.method1226(false, false, (byte) -66);
    }
}
