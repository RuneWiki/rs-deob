import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class54 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Ldg;")
    public static class276 field1112 = new class276(4);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field1121 = -1;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "[[I")
    public static int[][] field1120 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[[B")
    public static byte[][] field1116;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Lvf;")
    public static final class265 method417(byte arg0, int arg1) {
        field1117++;
        if (arg0 != -15) {
            field1116 = null;
        }
        return class148.method1022(10, new class265[] { class241.method1609(true, arg1 >> 24 & 0xFF), class126.field2256, class241.method1609(true, arg1 >> 16 & 0xFF), class126.field2256, class241.method1609(true, (arg1 & 0xFF91) >> 8), class126.field2256, class241.method1609(true, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lhk;")
    public static final class261 method418(int arg0, int arg1) {
        class261 var2 = (class261) class89.field1597.method1887(122, (long) arg0);
        field1115++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class277.field4903.method1332(true, class104.method696(255, arg0), class100.method666(arg0, arg1 + 2000));
        class261 var4 = new class261();
        var4.field4519 = arg0;
        if (var3 != null) {
            var4.method1736((byte) -13, new class135(var3));
        }
        var4.method1746(0);
        if (~var4.field4505 != arg1) {
            var4.method1741(method418(var4.field4505, 0), (byte) 52, method418(var4.field4568, 0));
        }
        if (var4.field4518 != -1) {
            var4.method1752(method418(var4.field4509, 0), method418(var4.field4518, 0), 0);
        }
        if (!class281.field4956 && var4.field4533) {
            var4.field4548 = class135.field2429;
            var4.field4546 = 0;
            var4.field4551 = null;
            var4.field4563 = false;
            var4.field4496 = null;
        }
        class89.field1597.method1892(var4, (long) arg0, (byte) 41);
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lne;")
    public static final class200 method419(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class200 var4 = var3.field2510;
            var3.field2510 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public static final void method420(int arg0, int arg1) {
        class178 var2 = class188.method1282(arg0, arg1, 261360480);
        field1114++;
        var2.method1160(127);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method421(int arg0) {
        field1112 = null;
        int var1 = -69 / ((arg0 + 18) / 39);
        field1120 = null;
        field1116 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)I")
    public static final int method422(int arg0, byte arg1, int arg2) {
        int var3 = 71 % ((arg1 + 50) / 50);
        int var4 = class233.method1570(arg2 - 1, (byte) 78, arg0 - 1) + class233.method1570(arg2 - 1, (byte) 50, arg0 + 1) + (class233.method1570(arg2 + 1, (byte) 58, arg0 + -1) - -class233.method1570(arg2 + 1, (byte) 77, arg0 - -1));
        field1113++;
        int var5 = class233.method1570(arg2, (byte) 89, arg0 - 1) + class233.method1570(arg2, (byte) 112, arg0 + 1) - (-class233.method1570(arg2 + -1, (byte) 94, arg0) + -class233.method1570(arg2 + 1, (byte) 53, arg0));
        int var6 = class233.method1570(arg2, (byte) 54, arg0);
        return var4 / 16 + (var5 / 8) + (var6 / 4);
    }
}
