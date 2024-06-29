import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class277 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method1857(int arg0, int arg1) {
        field4409++;
        class79.field1136.method1425(arg1, -115);
        if (arg0 != -1) {
            method1860(73);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public static final void method1858(int arg0, int arg1, int arg2) {
        class78.field1109 = true;
        class66.field928 = arg0;
        class135.field1964 = arg1;
        class5.field74 = arg2;
        class139.field2050 = -1;
        client.field2314 = -1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public static final int method1859(int arg0) {
        if (arg0 >= -79) {
            method1857(-84, 90);
        }
        field4407++;
        return 0;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method1860(int arg0) {
        class142.field2085.method1420(-1);
        if (arg0 == 0) {
            field4406++;
        }
    }
}
