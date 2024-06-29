import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class171 extends class86 {

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lbe;")
    public static class283 field2883 = class153.method941(126, "; Max)2Age=");

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "Lbe;")
    public static class283 field2886 = class153.method941(125, "::fullscreen");

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "Lbe;")
    public static class283 field2888 = class153.method941(-34, ")4");

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Lfe;", line = 8)
    public static final class229 method1084(boolean arg0) {
        field2882++;
        class229 var1 = new class229(24);
        var1.method1499(arg0, 3);
        var1.method1499(true, class155.field2552);
        var1.method1499(arg0, class269.field4547 ? 1 : 0);
        var1.method1499(true, class228.field3839 ? 1 : 0);
        var1.method1499(true, class55.field769 ? 1 : 0);
        var1.method1499(true, class149.field2432 ? 1 : 0);
        var1.method1499(true, class178.field3068 ? 1 : 0);
        var1.method1499(true, class96.field1612 ? 1 : 0);
        var1.method1499(arg0, class83.field1408 ? 1 : 0);
        var1.method1499(true, class91.field1541 ? 1 : 0);
        var1.method1499(true, class23.field345);
        var1.method1499(true, class44.field601 ? 1 : 0);
        var1.method1499(arg0, class2.field26 ? 1 : 0);
        var1.method1499(true, class47.field650 ? 1 : 0);
        var1.method1499(true, class119.field2007);
        var1.method1499(arg0, class33.field501 ? 1 : 0);
        var1.method1499(true, class255.field4301);
        var1.method1499(true, class118.field1990);
        var1.method1499(true, class33.field500);
        var1.method1510((byte) 47, class104.field1784);
        var1.method1510((byte) 27, class297.field5039);
        var1.method1499(true, class71.field1230 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)[Lnh;", line = 47)
    public static final class107[] method1085(boolean arg0) {
        field2887++;
        class107[] var1 = new class107[class160.field2613];
        if (arg0) {
            field2883 = (class283) null;
        }
        for (int var2 = 0; var2 < class160.field2613; var2++) {
            int var3 = class202.field3451[var2] * class201.field3440[var2];
            byte[] var4 = class256.field4329[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class296.field5018[class178.method1174(var4[var6], 255)];
            }
            var1[var2] = new class266(class197.field3372, class193.field3301, class247.field4226[var2], class232.field3933[var2], class202.field3451[var2], class201.field3440[var2], var5);
        }
        class88.method571(-4);
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 91)
    public static final void method1086(int arg0) {
        if (arg0 == 22704) {
            field2881++;
            class59.method392();
            class59.method387();
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 106)
    public static void method1087(int arg0) {
        field2886 = null;
        field2883 = null;
        field2888 = null;
        if (arg0 != 0) {
            field2888 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V", line = 122)
    public static final void method1088(int arg0) {
        field2879++;
        if (class134.field2246 > 0) {
            class284.method1953(true);
            return;
        }
        class67.field933 = class263.field4484;
        class263.field4484 = null;
        if (arg0 == 3796) {
            class77.method506(40, -30354);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 142)
    public static final void method1089(int arg0, int arg1) {
        field2880++;
        class72 var2 = class25.method174(arg1, (byte) -40, 3);
        int var3 = 25 % ((-arg0 - 37) / 32);
        var2.method479(123);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(II)V", line = 165)
    public class171(int arg0, int arg1) {
        this.field2884 = arg0;
        this.field2885 = arg1;
    }
}
