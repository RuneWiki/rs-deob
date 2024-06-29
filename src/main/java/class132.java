import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class132 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Loh;")
    public static class258 field2301 = class153.method1046("underlay", 87);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Loh;")
    public static class258 field2303 = class153.method1046(")4p=", 118);

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Loh;")
    public static class258 field2307 = class153.method1046("rect_debug=", 97);

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "B")
    public static byte field2308;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[[B")
    public static byte[][] field2302;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Loh;B)V", line = 8)
    public static final void method943(class258 arg0, byte arg1) {
        class45.method375((byte) -128);
        if (arg1 != -37) {
            method946(89, -105, -104);
        }
        class297.method2103(arg0, -14986);
        field2306++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 56)
    public static void method944(int arg0) {
        int var1 = 58 / ((arg0 + 10) / 62);
        field2307 = null;
        field2303 = null;
        field2302 = (byte[][]) null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lgb;Z)V", line = 67)
    public static final void method945(class213 arg0, boolean arg1) {
        class114.field1968 = arg0;
        if (arg1) {
            field2308 = 127;
        }
        field2304++;
        class106.field1902 = class114.field1968.method1435((byte) -21, 4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V", line = 94)
    public static final void method946(int arg0, int arg1, int arg2) {
        field2305++;
        if (arg2 > -4) {
            field2307 = (class258) null;
        }
        class286 var3 = class48.method389(arg1, 7, 10738);
        var3.method2017(-120);
        var3.field4932 = arg0;
    }
}
