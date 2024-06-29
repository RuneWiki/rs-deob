import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class196 extends class586 {

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "F")
    public float field3063;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Z")
    public boolean field3064;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "F")
    public float field3060;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Leda;")
    public static class116 field3065 = new class116(103, 19);

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "Z")
    public static boolean field3066 = false;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Lwea;")
    public static class90 field3068 = new class90();

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[F")
    public static float[] field3070 = new float[4];

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "[I")
    public static int[] field3071 = new int[5];

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lrca;Lr;Lfu;I)V", line = 4)
    public static final void method1382(class30 arg0, class98 arg1, class66 arg2, int arg3) {
        ++field3069;
        class257 var4 = arg0.method280(131072, arg1);
        if (var4 != null) {
            int var5 = var4.method12();
            if (~var5 > ~var4.method17()) {
                var5 = var4.method17();
            }
            byte var6 = 10;
            int var7 = arg2.field945;
            int var8 = arg2.field946;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field432 != null) {
                var9 = class180.field2847.method2864((class257[]) null, class629.field8943, (int[]) null, arg0.field432, arg3 ^ 32767);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class629.field8943[var12];
                    if (var9 + -1 > var12) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class666.field9367.method1783(var13);
                    if (~var10 > ~var14) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class666.field9367.method1784() + class666.field9367.method1787() / 2;
            }
            int var15 = var5 / 2 + arg2.field945;
            if (~(class161.field2637 + var5) < ~var7) {
                var7 = class161.field2637;
                var15 = var10 / 2 + var5 / 2 + var6 + class161.field2637 + 5;
            } else if (~(-var5 + class161.field2626) > ~var7) {
                var15 = -(var5 / 2) + -var6 + class161.field2626 + -5 + -(var10 / 2);
                var7 = -var5 + class161.field2626;
            }
            int var16 = arg2.field946;
            if (class161.field2622 - -var5 > var8) {
                var16 = var5 / 2 + (class161.field2622 - -var6);
                var8 = class161.field2622;
            } else if (var8 > class161.field2642 - var5) {
                var8 = -var5 + class161.field2642;
                var16 = -var6 + class161.field2642 + -var11 + -(var5 / 2);
            }
            int var17 = (int) (Math.atan2((double) (-arg2.field945 + var7), (double) (var8 - arg2.field946)) / 3.141592653589793D * (double) arg3) & 65535;
            var4.method1637((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg0.field432 != null) {
                var19 = var16;
                var18 = var15 + -5 + -(var10 / 2);
                var21 = 3 + var16 + var9 * class666.field9367.method1784();
                var20 = var18 + 10 + var10;
                if (~arg0.field451 != -1) {
                    arg1.method792(-var16 + var21, (byte) -88, -var18 + var20, var16, arg0.field451, var18);
                }
                if (arg0.field435 != 0) {
                    arg1.method762(var16, -var18 + var20, arg0.field435, var21 - var16, var18, (byte) -109);
                }
                for (int var22 = 0; var22 < var9; ++var22) {
                    String var23 = class629.field8943[var22];
                    if (var9 + -1 > var22) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class666.field9367.method1785(arg1, var23, var15, var16, arg0.field427, true);
                    var16 += class666.field9367.method1784();
                }
            }
            if (~arg0.field415 != 0 || arg0.field432 != null) {
                class436 var24 = new class436(arg2);
                int var25 = var5 >> 1;
                var24.field6269 = var7 + var25;
                var24.field6283 = -var25 + var8;
                var24.field6273 = -var25 + var7;
                var24.field6270 = var18;
                var24.field6276 = var19;
                var24.field6275 = var20;
                var24.field6274 = var8 + var25;
                var24.field6272 = var21;
                class521.field7684.method3904(var24, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIII[I)V", line = 152)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3056 = arg1;
        this.field3058 = arg2;
        this.method3377(arg2, 0, 0, 0, true, arg1, 72, 0, arg5);
        this.field3063 = (float) arg2 / (float) arg4;
        this.field3064 = false;
        this.field3060 = (float) arg1 / (float) arg3;
        this.method3379((byte) 102, false, false);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIII[BI)V", line = 166)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3056 = arg2;
        this.field3058 = arg3;
        this.method3384(arg2, true, arg6, 0, 0, 0, 0, arg3, 0, arg7);
        this.field3064 = false;
        this.field3063 = (float) arg3 / (float) arg5;
        this.field3060 = (float) arg2 / (float) arg4;
        this.method3379((byte) 102, false, false);
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 180)
    public static final void method1383(int arg0) {
        if (class661.field9300 != null) {
            try {
                class661.field9300.close();
            } catch (IOException var1) {
            }
        }
        ++field3059;
        class661.field9300 = null;
        if (arg0 < 23) {
            field3067 = -124;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIII)V", line = 205)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3063 = (float) arg3 / (float) arg5;
        this.field3064 = false;
        this.field3060 = (float) arg2 / (float) arg4;
        this.field3056 = arg2;
        this.field3058 = arg3;
        this.method3379((byte) 102, false, false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V", line = 218)
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class548.field8039 = arg0;
        class193.field2988 = arg4;
        class349.field4923 = arg3;
        class561.field8182 = arg2;
        if (arg1 <= 55) {
            field3068 = null;
        }
        ++field3061;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIIIZ)V", line = 234)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field4684 == -34038) {
            this.field3063 = (float) arg5;
            this.field3064 = false;
            this.field3060 = (float) arg4;
        } else {
            this.field3060 = this.field3063 = 1.0F;
            this.field3064 = true;
        }
        this.field3056 = arg4;
        this.field3058 = arg5;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIZ[III)V", line = 255)
    public class196(class382 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3058 = arg3;
        if (~super.field4684 == -34038) {
            this.field3064 = false;
            this.field3063 = (float) arg3;
            this.field3060 = (float) arg2;
        } else {
            this.field3064 = true;
            this.field3060 = this.field3063 = 1.0F;
        }
        this.field3056 = arg2;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIII)V", line = 278)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field4684 == -34038) {
            this.field3060 = (float) arg3;
            this.field3063 = (float) arg4;
            this.field3064 = false;
        } else {
            this.field3064 = true;
            this.field3060 = this.field3063 = 1.0F;
        }
        this.field3056 = arg3;
        this.field3058 = arg4;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V", line = 299)
    public static void method1385(int arg0) {
        field3068 = null;
        if (arg0 != -30643) {
            method1385(-85);
        }
        field3071 = null;
        field3070 = null;
        field3065 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIIIIZ)V", line = 312)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3064 = false;
        this.field3060 = (float) arg3 / (float) arg5;
        this.field3056 = arg3;
        this.field3058 = arg4;
        this.field3063 = (float) arg4 / (float) arg6;
        this.method3379((byte) 102, false, false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V", line = 328)
    public static final void method1386(byte arg0, int arg1) {
        if (arg0 != -105) {
            field3070 = null;
        }
        class273.field3906 = arg1;
        ++field3062;
        class351.field4936.method936(arg0 ^ 20);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkfa;IIIIZ[BI)V", line = 340)
    public class196(class382 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field4684 == -34038) {
            this.field3060 = (float) arg3;
            this.field3064 = false;
            this.field3063 = (float) arg4;
        } else {
            this.field3064 = true;
            this.field3060 = this.field3063 = 1.0F;
        }
        this.field3056 = arg3;
        this.field3058 = arg4;
    }
}
