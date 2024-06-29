import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lrh;")
    public static class46 field254 = new class46();

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field255 = 7759444;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
    public static boolean field256 = true;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ldl;")
    public static class123 field259;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method149(int arg0) {
        field259 = null;
        field254 = null;
        if (arg0 > -6) {
            method149(120);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method150(int arg0, int arg1) {
        field257++;
        if (class189.field2985 == arg0) {
            class135.field1965.method1151(arg1, (byte) 113);
        } else {
            class249.field3996 = arg1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
    public static final int method151(byte arg0) {
        if (arg0 <= 36) {
            return 57;
        } else {
            field253++;
            return class2.field16;
        }
    }
}
