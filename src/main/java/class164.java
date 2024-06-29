import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class164 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
    public static int[] field2269 = new int[2];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "J")
    public static long field2268 = 0L;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lsg;")
    public static class226 field2267;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lnq;")
    public static class268 field2265;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lnh;")
    public static class448 field2266;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        if (arg0 != 2) {
            field2268 = 6L;
        }
        field2265 = null;
        field2267 = null;
        field2269 = null;
        field2266 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Luo;Lrr;III)V")
    public static final void method1081(class345 arg0, class203 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class200.field2772) {
            class125 var5 = class328.field4549[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field1739 != null && var5.field1739.method683((byte) 101)) {
                arg1.method679(0, (byte) -126, 0, 128, var5.field1739, arg0, true);
            }
        }
        if (arg4 < class200.field2772) {
            class125 var6 = class328.field4549[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field1739 != null && var6.field1739.method683((byte) -125)) {
                arg1.method679(128, (byte) -126, 0, 0, var6.field1739, arg0, true);
            }
        }
        if (arg3 < class200.field2772 && arg4 < class264.field3687) {
            class125 var7 = class328.field4549[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field1739 != null && var7.field1739.method683((byte) -43)) {
                arg1.method679(128, (byte) -126, 0, 128, var7.field1739, arg0, true);
            }
        }
        if (arg3 < class200.field2772 && arg4 > 0) {
            class125 var8 = class328.field4549[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field1739 != null && var8.field1739.method683((byte) 109)) {
                arg1.method679(-128, (byte) -126, 0, 128, var8.field1739, arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1082(int arg0, int arg1, int arg2) {
        field2270++;
        class129 var3 = new class129(16);
        for (class107 var4 = (class107) class367.field5182.method885(-88); var4 != null; var4 = (class107) class367.field5182.method881((byte) -68)) {
            var4.method2467((byte) 110);
            int var6 = (int) (var4.field5600 >> 28);
            int var7 = (int) (var4.field5600 >> 14 & 0x3FFFL) - arg0;
            int var8 = (int) (var4.field5600 & 0x3FFFL) - arg2;
            if (var8 >= 0 && var7 >= 0 && var8 < class211.field2954 && class290.field4061 > var7) {
                var3.method883((byte) -54, (long) (var8 | var7 << 14 | var6 << 28), var4);
            }
        }
        int var5 = -6 % ((arg1 - 14) / 61);
        class367.field5182 = var3;
    }
}
