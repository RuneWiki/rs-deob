import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class614 extends class488 {

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "J")
    public static long field8711 = 0L;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Liu;")
    public static class517 field8709 = new class517(20, 10);

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Z")
    public static boolean field8712 = false;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 8)
    public static void method3489(boolean arg0) {
        field8709 = null;
        if (arg0) {
            field8709 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III[II)V", line = 20)
    public static final void method3490(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field8708++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
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
            arg1 = var12 + 1;
            arg3[arg1] = arg0;
        }
        while (var13 > arg1) {
            arg1++;
            arg3[arg1] = arg0;
        }
        if (arg2 > -82) {
            method3491(90, false, null);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZLco;)V", line = 48)
    public static final void method3491(int arg0, boolean arg1, class268 arg2) {
        if (class374.field5490 != null) {
            try {
                class374.field5490.method2375(0L, (byte) 59);
                class374.field5490.method2368(arg0, arg2.field3952, 63, 24);
            } catch (Exception var3) {
            }
        }
        field8710++;
        if (!arg1) {
            method3491(-67, true, null);
        }
    }
}
