import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class25 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lda;")
    public static class275 field412 = class255.method1672(105, "mapscene");

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
    public static int[] field408 = new int[200];

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[Lkc;")
    public static class2[] field414 = new class2[50];

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field418 = 1;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lda;")
    private static class275 field417 = class255.method1672(92, "cyan:");

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lda;")
    public static class275 field419 = field417;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lda;")
    public static class275 field416 = field417;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lma;")
    public static class105 field410;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field420;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfd;III)V")
    public static final void method159(class229 arg0, int arg1, int arg2, int arg3) {
        field409++;
        if (class262.field4558 != null || class63.field1051 || arg0 == null || class265.method1752(arg0, 0) == null) {
            return;
        }
        class262.field4558 = arg0;
        if (arg1 != -26764) {
            field414 = null;
        }
        class200.field3421 = class265.method1752(arg0, 0);
        class67.field1105 = 0;
        class31.field467 = arg2;
        class152.field2668 = false;
        class55.field932 = arg3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
    public static final void method160(int arg0, boolean arg1) {
        field411++;
        if (arg1) {
            method161(-106);
        }
        class184 var2 = class147.method1044(12, (byte) 70, arg0);
        var2.method1230(1000);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method161(int arg0) {
        field419 = null;
        field416 = null;
        field410 = null;
        field420 = null;
        field417 = null;
        field408 = null;
        field414 = null;
        field412 = null;
        if (arg0 != 1) {
            method160(-122, true);
        }
    }
}
