import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class358 extends class220 {

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
    public int field5098;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "[Ldf;")
    public static class400[] field5092 = new class400[6];

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Z")
    public static boolean field5099 = false;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIZI)V")
    public static final void method2297(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5097++;
        float var5 = (float) class678.field9300 / (float) class678.field9285;
        int var6 = arg0;
        if (arg3) {
            field5092 = null;
        }
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg2 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg1 - var7) / 2;
        class193.field2580 = class678.field9300 - (class678.field9300 * var9 / var7);
        class206.field2719 = -1;
        class299.field4217 = class678.field9285 * var8 / var6;
        class625.field8690 = -1;
        class82.method633((byte) 56);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILhaa;ILha;ILek;Lafa;I)V")
    public static final void method2298(int arg0, int arg1, class80 arg2, int arg3, class58 arg4, int arg5, class507 arg6, class344 arg7, int arg8) {
        field5095++;
        int var9 = arg1 - (arg0 / 2) - 5;
        int var10 = arg8 + 2;
        if (arg7.field4829 != 0) {
            arg4.method417(arg7.field4829, var9, var10, (byte) 112, (arg8 - (-(arg3 * arg2.method627()) - 1)) - var10, arg0 + 10);
        }
        if (arg7.field4824 != 0) {
            arg4.method393(var10, arg7.field4824, arg2.method627() * arg3 + (arg8 - var10) + 1, arg0 + 10, 102, var9);
        }
        int var11 = 119 / ((arg5 + 25) / 54);
        int var12 = arg7.field4846;
        if (arg6.field7254 && arg7.field4844 != -1) {
            var12 = arg7.field4844;
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            String var14 = class227.field3058[var13];
            if (var13 < (arg3 - 1)) {
                var14 = var14.substring(0, var14.length() - 4);
            }
            arg2.method630(arg4, var14, arg1, arg8, var12, true);
            arg8 += arg2.method627();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Lg;")
    public class153 method769(boolean arg0) {
        field5094++;
        if (arg0) {
            this.field5091 = -126;
        }
        return class522.field7399;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method2299(int arg0) {
        if (arg0 <= 6) {
            field5092 = null;
        }
        field5092 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ldp;Lfv;IIIIIIIIIIIII)V")
    public class358(class3 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5091 = arg14;
        this.field5090 = arg13;
        this.field5089 = arg10;
        this.field5096 = arg9;
        this.field5098 = arg12;
        this.field5093 = arg11;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([[B[B[III[[BI[I)I")
    public static final int method2300(byte[][] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, byte[][] arg5, int arg6, int[] arg7) {
        field5100++;
        int var8 = arg2[arg4];
        int var9 = arg7[arg4] + var8;
        int var10 = arg2[arg6];
        int var11 = arg7[arg6] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg1[arg4] & 0xFF;
        if ((arg3 & arg1[arg6]) < var14) {
            var14 = arg1[arg6] & 0xFF;
        }
        byte[] var15 = arg5[arg4];
        byte[] var16 = arg0[arg6];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
