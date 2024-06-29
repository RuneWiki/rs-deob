import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class755 extends class354 {

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "[I")
    public static int[] field10532 = new int[2];

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public static int field10539 = -1;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "[Z")
    public static boolean[] field10530 = new boolean[100];

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V", line = 4)
    public static void method4195(byte arg0) {
        int var1 = 14 / ((arg0 - 24) / 63);
        field10532 = null;
        field10530 = null;
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)I", line = 16)
    public final int method4196(byte arg0) {
        ++field10531;
        int var2 = -111 / ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(ILwo;)V", line = 29)
    public class755(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)Z", line = 38)
    public static final boolean method4197(byte arg0) {
        if (arg0 != -64) {
            method4198(81, 101, -1.1127812F, -38, 57, -28, -0.5455485F, (byte) 59, -3, (float[]) null, 3, 0.006461794F, -102, (float[]) null);
        }
        ++field10535;
        if (class760.field10602) {
            try {
                if ((Boolean) class568.method3263("showingVideoAd", class64.field900, false)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 59)
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field10539 = -79;
        }
        ++field10534;
        if (super.field4545 != 1 && super.field4545 != 0) {
            super.field4545 = this.method393((byte) -78);
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lwo;)V", line = 83)
    public class755(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)I", line = 86)
    public final int method393(byte arg0) {
        int var2 = -98 / ((37 - arg0) / 63);
        ++field10538;
        return 1;
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)V", line = 99)
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method391(-17, 72);
        }
        ++field10533;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIFIIIFBI[FIFI[F)V", line = 110)
    public static final void method4198(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, byte arg7, int arg8, float[] arg9, int arg10, float arg11, int arg12, float[] arg13) {
        int var14 = arg5 - arg0;
        int var15 = arg4 - arg8;
        int var16 = arg10 - arg1;
        ++field10537;
        float var17 = arg9[2] * (float) var15 + arg9[0] * (float) var14 + arg9[1] * (float) var16;
        float var18 = arg9[5] * (float) var15 + arg9[4] * (float) var16 + arg9[3] * (float) var14;
        float var19 = arg9[8] * (float) var15 + arg9[7] * (float) var16 + arg9[6] * (float) var14;
        float var20;
        float var21;
        if (arg12 != 0) {
            if (arg12 == 1) {
                var20 = arg11 + var19 + 0.5F;
                var21 = arg2 + var17 + 0.5F;
            } else if (arg12 == 2) {
                var20 = -var18 + arg6 + 0.5F;
                var21 = -var17 + arg2 + 0.5F;
            } else if (arg12 != 3) {
                if (arg12 != 4) {
                    var21 = -var19 + arg11 + 0.5F;
                    var20 = -var18 + arg6 + 0.5F;
                } else {
                    var21 = arg11 + var19 + 0.5F;
                    var20 = -var18 + arg6 + 0.5F;
                }
            } else {
                var21 = arg2 + var17 + 0.5F;
                var20 = -var18 + arg6 + 0.5F;
            }
        } else {
            var21 = arg2 + var17 + 0.5F;
            var20 = -var19 + arg11 + 0.5F;
        }
        if (arg3 != 1) {
            if (arg3 == 2) {
                var21 = -var21;
                var20 = -var20;
            } else if (arg3 == 3) {
                float var22 = var21;
                var21 = var20;
                var20 = -var22;
            }
        } else {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        }
        int var24 = -97 / ((arg7 - 18) / 34);
        arg13[0] = var21;
        arg13[1] = var20;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(II)I", line = 197)
    public final int method391(int arg0, int arg1) {
        if (arg0 != 3) {
            return -79;
        } else {
            ++field10540;
            return 1;
        }
    }
}
