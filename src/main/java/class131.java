import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class131 extends class112 {

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    private int field1993 = 4096;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "Lwm;")
    public static class152 field1996 = class157.method1048(" ", 113);

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "[[Lwk;")
    public static class174[][] field1994 = new class174[13][13];

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "Lwm;")
    public static class152 field2000 = class157.method1048("(Y", 105);

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "[I")
    public static int[] field1992;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)[I", line = 8)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            method829(91, (byte) 8, -74, (int[]) null, -46, (class1) null, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), false, 38, (float[][]) ((float[][]) null), -52, (int[][]) ((int[][]) null), -95, (boolean[]) null, 121, 98, 17, (float[][]) ((float[][]) null), true, false, false);
        }
        field1998++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 116);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1 - 1 & class275.field4712, (byte) 99, 0);
            int[] var5 = this.method751(arg1, (byte) 100, 0);
            int[] var6 = this.method751(class275.field4712 & arg1 + 1, (byte) 122, 0);
            for (int var7 = 0; var7 < class58.field889; var7++) {
                int var8 = (var5[var7 + 1 & class251.field4304] - var5[class251.field4304 & var7 - 1]) * this.field1993;
                int var9 = (var6[var7] - var4[var7]) * this.field1993;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI[IILaj;[[I[[FZI[[FI[[II[ZIII[[FZZZ)V", line = 68)
    public static final void method829(int arg0, byte arg1, int arg2, int[] arg3, int arg4, class1 arg5, int[][] arg6, float[][] arg7, boolean arg8, int arg9, float[][] arg10, int arg11, int[][] arg12, int arg13, boolean[] arg14, int arg15, int arg16, int arg17, float[][] arg18, boolean arg19, boolean arg20, boolean arg21) {
        field1999++;
        int var22 = (arg20 ? 255 : 0) + (arg13 << 8);
        int var23 = (arg21 ? 255 : 0) + (arg11 << 8);
        if (arg0 != 255) {
            return;
        }
        int var24 = (arg19 ? 255 : 0) + (arg4 << 8);
        int var25 = (arg17 << 8) + (arg8 ? 255 : 0);
        int[] var26 = new int[arg3.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg3[var27 + var27];
            int var29 = arg3[var27 + var27 + 1];
            int[][] var30 = arg12 == null || arg14 == null || !arg14[var27] ? arg6 : arg12;
            var26[var27] = class167.method1104(var23, var30, arg1, false, arg12, arg5, arg15, (byte) 4, var25, arg10, arg7, arg2, var24, arg18, var22, var29, var28, (float) arg16);
        }
        arg5.method7(arg9, arg15, arg2, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 104)
    public class131() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILhi;)V", line = 130)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 == 31164) {
            if (arg1 == 0) {
                this.field1993 = arg2.method2021((byte) 74);
            }
            field1989++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIII)V", line = 146)
    public static final void method830(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class303 var5 = class90.method589(false, arg1, 10);
        var5.method2117((byte) 91);
        if (arg0 == 83) {
            var5.field5219 = arg3;
            var5.field5223 = arg4;
            field2001++;
            var5.field5208 = arg2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V", line = 163)
    public static void method831(byte arg0) {
        field1996 = null;
        field1994 = (class174[][]) null;
        field1992 = null;
        if (arg0 > -68) {
            field1996 = (class152) null;
        }
        field2000 = null;
    }
}
