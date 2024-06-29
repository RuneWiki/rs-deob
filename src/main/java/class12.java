import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class12 extends class513 {

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 14)
    public static final void method65(int arg0, int arg1) {
        field175++;
        class192 var2 = (class192) class63.field842.method1381(true, (long) arg1);
        if (arg0 == 471 && var2 != null) {
            var2.field2788 = !var2.field2788;
            var2.field2791.method3858(124, var2.field2788);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIZI)V", line = 35)
    public static final void method66(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field176++;
        long var6 = (long) (arg5 | (arg4 ? Integer.MIN_VALUE : 0));
        class344 var8 = (class344) class592.field8538.method1381(true, var6);
        if (var8 == null) {
            var8 = new class344();
            class592.field8538.method1387(var8, var6, (byte) -106);
        }
        if (arg2 >= var8.field4392.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field4392.length; var11++) {
                var9[var11] = var8.field4392[var11];
                var10[var11] = var8.field4391[var11];
            }
            for (int var12 = var8.field4392.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field4392 = var9;
            var8.field4391 = var10;
        }
        var8.field4392[arg2] = arg0;
        var8.field4391[arg2] = arg1;
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
    public abstract int method62(byte arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public abstract int method63(int arg0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public abstract int method64(int arg0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
    public abstract int method67(byte arg0);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)J")
    public abstract long method68(byte arg0);
}
