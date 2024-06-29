import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class202 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3120 = null;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3119 = null;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lub;")
    public static class92 field3122;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public static int[] field3125;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method1425(boolean arg0, Object arg1, boolean arg2) {
        if (arg0) {
            field3123 = 7;
        }
        field3121++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class151.method1096((byte) 37, var3) : var3;
        } else if (arg1 instanceof class101) {
            class101 var4 = (class101) arg1;
            return var4.method768(-66);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILnh;JLnh;Lnh;)V")
    public static final void method1426(int arg0, int arg1, int arg2, int arg3, class55 arg4, long arg5, class55 arg6, class55 arg7) {
        class153 var9 = new class153();
        var9.field2263 = arg4;
        var9.field2264 = arg1 * 128 + 64;
        var9.field2260 = arg2 * 128 + 64;
        var9.field2265 = arg3;
        var9.field2267 = arg5;
        var9.field2255 = arg6;
        var9.field2269 = arg7;
        int var10 = 0;
        class22 var11 = class149.field2210[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field371; var12++) {
                class19 var13 = var11.field355[var12];
                if ((var13.field267 & 0x400000L) == 4194304L) {
                    int var14 = var13.field266.method82();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2268 = -var10;
        if (class149.field2210[arg0][arg1][arg2] == null) {
            class149.field2210[arg0][arg1][arg2] = new class22(arg0, arg1, arg2);
        }
        class149.field2210[arg0][arg1][arg2].field361 = var9;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1427(byte arg0) {
        field3120 = null;
        field3125 = null;
        field3119 = null;
        field3122 = null;
        int var1 = -1 % ((arg0 - 7) / 43);
    }
}
