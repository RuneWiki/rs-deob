import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class481 extends class682 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field7086;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method2968(int arg0) {
        field7084++;
        int[] var1 = new int[class91.field1083.field6809];
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -32484) {
            return;
        }
        while (var3 < class91.field1083.field6809) {
            class117 var5 = class91.field1083.method2859(var3, (byte) 122);
            if (var5.field1885 >= 0 || var5.field1841 >= 0) {
                var1[var2++] = var3;
            }
            var3++;
        }
        class350.field5587 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class350.field5587[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Leu;")
    public final class444 method1247(int arg0) {
        if (arg0 != 3848) {
            this.field7086 = 122;
        }
        field7082++;
        return class524.field7646;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        int var8 = arg1 & 0x3;
        field7085++;
        if (var8 == 0) {
            return arg4;
        }
        int var9 = 91 % ((arg2 - 33) / 46);
        if (var8 == 1) {
            return 7 - (arg3 + arg6 - 1);
        } else if (var8 == 2) {
            return 7 - arg4 - (arg0 + -1);
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILja;Lmea;III)V")
    public class481(int arg0, class254 arg1, class395 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7086 = arg5;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FIIIIF[FIIFZII)V")
    public static final void method2970(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, int arg8, float arg9, boolean arg10, int arg11, int arg12) {
        int var13 = arg7 - arg2;
        int var14 = arg4 - arg11;
        int var15 = arg12 - arg3;
        field7083++;
        float var16 = arg6[2] * (float) var13 + arg6[0] * (float) var15 + arg6[1] * (float) var14;
        float var17 = arg6[5] * (float) var13 + arg6[4] * (float) var14 + arg6[3] * (float) var15;
        float var18 = arg6[8] * (float) var13 + arg6[7] * (float) var14 + arg6[6] * (float) var15;
        float var19;
        float var20;
        if (arg1 == 0) {
            var19 = arg9 + 0.5F - var18;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg1 == 1) {
            var19 = arg9 + var18 + 0.5F;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg1 == 2) {
            var19 = arg0 + 0.5F - var17;
            var20 = arg5 + 0.5F - var16;
        } else if (arg1 == 3) {
            var20 = arg5 + var16 + 0.5F;
            var19 = arg0 + 0.5F - var17;
        } else if (arg1 == 4) {
            var19 = arg0 + 0.5F - var17;
            var20 = arg9 + var18 + 0.5F;
        } else {
            var20 = arg9 + 0.5F - var18;
            var19 = arg0 + 0.5F - var17;
        }
        if (arg8 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg8 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class450.field6770 = var20;
        if (arg10) {
            class539.field7867 = var19;
        }
    }
}
