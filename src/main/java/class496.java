import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class496 {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Ljb;")
    public static class519 field6973 = new class519(67, 7);

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "[I")
    public static int[] field6974 = new int[256];

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field6975 = 1;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
    public static final void method2912(int arg0, int arg1, int arg2) {
        field6977++;
        class778 var3 = class389.method2406(-124, (long) arg0, 13);
        var3.method4274(104);
        if (arg2 != 7) {
            field6974 = null;
        }
        var3.field10690 = arg1;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IZZ)V")
    public static final void method2913(int arg0, boolean arg1, boolean arg2) {
        field6976++;
        class551 var3 = arg1 ? class747.field10081 : class182.field2393;
        if (var3 == null || arg0 < 0 || var3.field7599 <= arg0) {
            return;
        }
        class85 var4 = var3.field7598[arg0];
        if (var4.field1209 != -1) {
            return;
        }
        String var5 = var4.field1206;
        class43 var6 = class492.method2903(class651.field8780, 0, class73.field983);
        var6.field457.method1725(class525.method3045(-122, var5) + 3, 53);
        var6.field457.method1725(arg1 ? 1 : 0, 82);
        var6.field457.method1733(arg0, -32466);
        var6.field457.method1678(var5, (byte) 124);
        if (!arg2) {
            class409.method2457((byte) -100, var6);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static void method2914(int arg0) {
        field6974 = null;
        field6973 = null;
        int var1 = 88 % ((arg0 - 54) / 58);
    }
}
