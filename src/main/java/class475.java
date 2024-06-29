import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class475 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III[II)V", line = 15)
    public static final void method2668(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        field6337++;
        int var6 = arg1 - 1;
        int var5 = var6 - arg2;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        while (var6 > arg4) {
            arg4++;
            arg3[arg4] = arg0;
        }
    }
}
