import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class69 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lqu;")
    public static class364 field782 = new class364(18, 2);

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Z")
    public static boolean field785 = false;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field784 = 1338;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lqp;")
    public static class586 field786 = new class586(13, 8);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "[[I")
    public static int[][] field787;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[IIBI)V")
    public static final void method418(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        arg4--;
        if (arg3 != 117) {
            method418(79, null, -111, (byte) 81, -26);
        }
        field783++;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg4 = var13 + 1;
            arg1[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg1[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method419(byte arg0) {
        if (arg0 > -64) {
            field785 = false;
        }
        field787 = null;
        field786 = null;
        field782 = null;
    }
}
