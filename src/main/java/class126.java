import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class126 extends class253 {

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public int field2060 = (int) (class112.method1033(-11752) / 1000L);

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
    public String field2061;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "S")
    public short field2065;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lws;")
    public static class328 field2058 = new class328(0, 5);

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Z")
    public static boolean field2066 = false;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Lri;")
    public static class97 field2069;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLie;I)Ljava/lang/String;")
    public static final String method1105(byte arg0, class6 arg1, int arg2) {
        field2059++;
        try {
            int var3 = arg1.method88((byte) 90);
            int var4 = 105 % ((arg0 + 49) / 59);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var5 = new byte[var3];
            arg1.field57 += class360.field5701.method3829(var3, 0, (byte) -123, arg1.field96, var5, arg1.field57);
            return class267.method1897(var3, 0, var5, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method1106(int arg0, int arg1, int arg2) {
        field2063++;
        if (class484.field7102 == -1) {
            return 1;
        }
        if (class497.field7259 != arg1) {
            class490.method3002(false, class122.field1985.method1091(class135.field2206, 1), arg1);
            if (class497.field7259 != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class271.field4377.getSize();
            class420.method2683(class573.field8183, -31593, class122.field1985.method1091(class135.field2206, 1), class627.field8857, class125.field2057, true);
            class534 var4 = class243.method1736(class484.field7102, 0, 6392, class547.field7970);
            long var5 = class112.method1033(-11752);
            class627.field8857.method281();
            class183.field3093.method503(0, class459.field6867, 0);
            class627.field8857.method346(class183.field3093);
            class627.field8857.method318(var3.width / 2, var3.height / 2, 512, 512);
            class627.field8857.method342(1.0F);
            class627.field8857.method296(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class55 var7 = class627.field8857.method287(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class627.field8857.method121(0);
                class627.field8857.method136();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class240.field3805.method503((int) (((float) var11 - (float) var10 / 2.0F) * (float) class134.field2203), 0, (var10 + 1) * class134.field2203);
                        var8++;
                        var7.method606(class240.field3805, null, 0);
                        if (class112.method1033(-11752) - var5 >= (long) arg2) {
                            break label45;
                        }
                    }
                }
            }
            class627.field8857.method170();
            if (arg0 != -2066990686) {
                field2066 = false;
            }
            long var12 = (long) (var8 * 1000) / (class112.method1033(-11752) - var5);
            class627.field8857.method121(0);
            class627.field8857.method136();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public static final void method1107(int arg0, int arg1) {
        field2067++;
        int var2 = class562.field8084 - class183.field3068;
        if (var2 >= 100) {
            class81.field1005 = -1;
            class664.field9243 = -1;
            field2062 = 1;
            return;
        }
        int var3 = (int) class162.field2746;
        if (var3 < class677.field9529 >> 8) {
            var3 = class677.field9529 >> 8;
        }
        if (class631.field8880[4] && (class683.field9585[4] + 128) > var3) {
            var3 = class683.field9585[4] + 128;
        }
        int var4 = (int) class37.field514 + class373.field5837 & 0x3FFF;
        class402.method2584(((var3 >> 3) * 3) + 600 << 2, class473.field7001, class686.field9621, var4, class202.method1568(class567.field8141.field9696, class423.field6439, class567.field8141.field9705, 2) - 200, arg1, var3, (byte) 89);
        if (arg0 != 16185) {
            return;
        }
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class607.field8638 = (int) ((float) (class607.field8638 - class273.field4408) * var5 + (float) class273.field4408);
        class13.field197 = (int) ((float) (class13.field197 - class140.field2365) * var5 + (float) class140.field2365);
        class675.field9521 = (int) ((float) (class675.field9521 - class2.field15) * var5 + (float) class2.field15);
        class412.field6318 = (int) ((float) (class412.field6318 - class668.field9441) * var5 + (float) class668.field9441);
        int var6 = class523.field7598 - class192.field3182;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class523.field7598 = (int) ((float) var6 * var5 + (float) class192.field3182);
        class523.field7598 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public static void method1108(boolean arg0) {
        field2069 = null;
        field2058 = null;
        if (!arg0) {
            method1109(null, 31, 48, -69, -114, -61, 4, -75);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([IIIIIIII)V")
    public static final void method1109(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2064++;
        if (arg2 > 0 && !class416.method2649(arg2, true)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class416.method2649(arg4, true)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == 32993) {
            int var8 = 0;
            int var9 = arg2 < arg4 ? arg2 : arg4;
            int var10 = arg2 >> 1;
            if (arg5 != -12421) {
                field2066 = true;
            }
            int var11 = arg4 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg6, var8, arg3, arg2, arg4, 0, arg1, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = (var20 & 0xFF1692) >> 16;
                        int var25 = var20 & 0xFF;
                        int var26 = var12[var16++];
                        int var27 = var20 >> 8 & 0xFF;
                        int var28 = (var22 >> 16 & 0xFF) + var24;
                        int var29 = ((var22 & 0xFF14) >> 8) + var27;
                        int var30 = (var22 & 0xFF) + var25;
                        int var31 = (var22 >> 24 & 0xFF) + var23;
                        int var32 = ((var21 & 0xFF2C) >> 8) + var29;
                        int var33 = (var21 >> 24 & 0xFF) + var31;
                        int var34 = (var21 & 0xFF) + var30;
                        int var35 = (var21 >> 16 & 0xFF) + var28;
                        int var36 = ((var26 & 0xFFD0) >> 8) + var32;
                        int var37 = (var26 & 0xFF) + var34;
                        int var38 = (var26 >> 24 & 0xFF) + var33;
                        int var39 = ((var26 & 0xFF4FF5) >> 16) + var35;
                        var13[var14++] = class81.method769(class453.method2846(var37 >> 2, 255), class81.method769(class453.method2846(65280, var36 << 6), class81.method769(class453.method2846(var39 << 14, 16711680), class453.method2846(var38, 1020) << 22)));
                    }
                    var16 += arg2;
                    var15 += arg2;
                }
                int[] var18 = var13;
                var13 = var12;
                arg4 = var11;
                arg2 = var10;
                var12 = var18;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class126(String arg0, int arg1) {
        this.field2061 = arg0;
        this.field2065 = (short) arg1;
    }
}
