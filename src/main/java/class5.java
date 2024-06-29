import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BI[BII)V", line = 6)
    public static final void method47(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var23 = arg4 - 1;
                int var5 = arg1 + var23;
                int var6 = arg3 + var23;
                int var7 = var5 - var23;
                int var24 = var7 + 7;
                while (var5 >= var24) {
                    int var8 = var6 - 1;
                    int var9 = var5 - 1;
                    arg2[var6] = arg0[var5];
                    int var10 = var8 - 1;
                    int var11 = var9 - 1;
                    arg2[var8] = arg0[var9];
                    int var12 = var10 - 1;
                    int var13 = var11 - 1;
                    arg2[var10] = arg0[var11];
                    int var14 = var12 - 1;
                    int var15 = var13 - 1;
                    arg2[var12] = arg0[var13];
                    int var16 = var14 - 1;
                    int var17 = var15 - 1;
                    arg2[var14] = arg0[var15];
                    int var18 = var16 - 1;
                    int var19 = var17 - 1;
                    arg2[var16] = arg0[var17];
                    int var20 = var18 - 1;
                    int var21 = var19 - 1;
                    arg2[var18] = arg0[var19];
                    var6 = var20 - 1;
                    var5 = var21 - 1;
                    arg2[var20] = arg0[var21];
                }
                var7 = var24 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var22 = arg1 + arg4;
        int var39 = var22 - 7;
        while (arg1 < var39) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var22 = var39 + 7;
        while (arg1 < var22) {
            arg2[arg3++] = arg0[arg1++];
        }
    }
}
