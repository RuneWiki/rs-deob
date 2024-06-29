import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class52 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljd;")
    public static class85 field897 = class221.method1499("huffman", (byte) -123);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Z")
    public static boolean field902 = false;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lve;")
    public static class184 field903 = new class184(64);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
    public static final void method343(int arg0, int arg1, int arg2, int arg3) {
        class208 var4 = class99.field1780[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class267 var5 = var4.field3641;
        if (var5 != null) {
            var5.field4756 = var5.field4756 * arg3 / 16;
            var5.field4750 = var5.field4750 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method344(boolean arg0) {
        field903 = null;
        field897 = null;
        if (arg0) {
            method343(88, 52, -102, 123);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method345(byte arg0) {
        field900++;
        if (arg0 > -74) {
            field898 = -2;
        }
        class124.field2191.method1262(17244);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
    public static final void method346(int arg0, int arg1, boolean arg2) {
        field899++;
        if (class115.field2058 < 2 && class70.field1303 == 0 && !class12.field193) {
            return;
        }
        class85 var3;
        if (class70.field1303 == 1 && class115.field2058 < 2) {
            var3 = class172.method1150(new class85[] { class77.field1425, class148.field2518, class144.field2472, class34.field526 }, 0);
        } else if (class12.field193 && class115.field2058 < 2) {
            var3 = class172.method1150(new class85[] { class150.field2542, class148.field2518, class30.field452, class34.field526 }, 0);
        } else {
            var3 = class154.method1012(-125, class115.field2058 - 1);
        }
        if (class115.field2058 > 2) {
            var3 = class172.method1150(new class85[] { var3, class105.field1848, class68.method451(class115.field2058 - 2, -12572), class74.field1383 }, 0);
        }
        int var4 = class180.field3092.method81(var3, arg1 + 4, arg0 + 15, 16777215, 0, class268.field4777, class233.field4031);
        if (!arg2) {
            field898 = -4;
        }
        class252.method1745(arg0, arg1 + 4, (byte) 124, class180.field3092.method75(var3) + var4, 15);
    }
}
