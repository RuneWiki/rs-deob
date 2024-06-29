import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class271 extends class206 {

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field4687 = -1;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "J")
    public long field4682;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lbh;")
    public static class258 field4688;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lma;")
    public class271 field4683;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lma;")
    public class271 field4689;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[[[Ltf;")
    public static class242[][][] field4681;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ldc;I)V", line = 22)
    public static final void method1936(class101 arg0, int arg1) {
        int var2 = class244.field4111;
        int var3 = var2 * 956 / 503;
        class171.field2877.method1340((class188.field3141 - var3) / 2, 0, var3, var2);
        class7.field104.method351(class188.field3141 / 2 - (class7.field104.field4007 / 2), 18);
        if (arg1 < 118) {
            field4681 = (class242[][][]) ((class242[][][]) null);
        }
        field4680++;
        arg0.method774(class161.field2732, class188.field3141 / 2, class244.field4111 / 2 - 26, 16777215, -1);
        int var4 = class244.field4111 / 2 - 18;
        class222.method1640(class188.field3141 / 2 - 152, var4, 304, 34, 9179409);
        class222.method1640(class188.field3141 / 2 - 151, var4 - -1, 302, 32, 0);
        class222.method1632(class188.field3141 / 2 - 150, var4 - -2, class90.field1487 * 3, 30, 9179409);
        class222.method1632(class90.field1487 * 3 + class188.field3141 / 2 - 150, var4 + 2, 300 - (class90.field1487 * 3), 30, 0);
        arg0.method774(class74.field1234, class188.field3141 / 2, class244.field4111 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V", line = 57)
    public final void method1937(int arg0) {
        field4686++;
        if (this.field4689 == null) {
            return;
        }
        this.field4689.field4683 = this.field4683;
        this.field4683.field4689 = this.field4689;
        if (arg0 < 29) {
            this.field4689 = (class271) null;
        }
        this.field4689 = null;
        this.field4683 = null;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V", line = 86)
    public static void method1938(int arg0) {
        field4681 = (class242[][][]) null;
        field4688 = null;
        int var1 = 50 / ((64 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)I", line = 99)
    public static final int method1939(byte arg0, int arg1) {
        field4684++;
        return arg0 == 99 ? arg1 >>> 8 : 59;
    }
}
