import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class67 extends class38 {

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field1282 = -32768;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lkh;")
    private static class117 field1289 = class224.method1450((byte) -109, "button near the top of that page)3");

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Lkh;")
    public static class117 field1291 = field1289;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Lkh;")
    private static class117 field1293 = class224.method1450((byte) -39, "wave:");

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lah;")
    public static class9 field1290 = null;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lkh;")
    public static class117 field1283 = field1293;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field1292 = 0;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lkh;")
    public static class117 field1297 = class224.method1450((byte) -107, "http:)4)4");

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lkh;")
    public static class117 field1298 = field1293;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Leh;")
    public static class53 field1281 = new class53(50);

    @OriginalMember(owner = "client!g", name = "N", descriptor = "La;")
    public static class1 field1299 = new class1();

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Z")
    public static boolean field1294;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
    public final int method134() {
        field1296++;
        return this.field1282;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1288++;
        class29 var11 = class214.method1408((byte) 102, this.field1286).method1097(this.field1295, -86, 0, null);
        if (var11 != null) {
            var11.method158(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1282 = var11.method134();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILah;II)V")
    public static final void method475(int arg0, int arg1, class9 arg2, int arg3, int arg4) {
        field1287++;
        if (~class201.field3645 <= arg3) {
            class83.method587(arg0, arg1, 0, arg2.field292, arg2.field280);
        } else {
            ((class144) class143.field2582).method981(arg0, arg1, arg2.field256, arg2.field207, class143.field2582.field731 / 2, class143.field2582.field733 / 2, client.field776, 256, arg2.field292, arg2.field280);
        }
        class51.field1058[arg4] = true;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method476(int arg0) {
        field1298 = null;
        field1297 = null;
        field1281 = null;
        field1299 = null;
        if (arg0 != 16157) {
            method475(-89, -55, null, -17, 100);
        }
        field1289 = null;
        field1291 = null;
        field1283 = null;
        field1290 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILai;I)Lo;")
    public static final class153 method477(int arg0, int arg1, class10 arg2, int arg3) {
        field1284++;
        if (class96.method654(arg1, -2158, arg3, arg2)) {
            if (arg0 >= -25) {
                method477(-113, 92, null, 119);
            }
            return class53.method409(false);
        } else {
            return null;
        }
    }
}
