import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class27 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lwb;")
    public static class27 field458 = new class27();

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lnh;")
    public class55 field466;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lub;")
    public static class92 field460;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lub;")
    public static class92 field462;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[[I")
    public static int[][] field464;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method220(byte arg0) {
        class231.field3665.method1169(true);
        field461++;
        if (arg0 != 63) {
            method220((byte) 19);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Z")
    public static final boolean method221(byte arg0, int arg1) {
        if (arg0 <= 122) {
            method220((byte) -55);
        }
        field463++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class86.field1282[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method222(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class240.field3813);
        arg1.removeMouseMotionListener(class240.field3813);
        field459++;
        arg1.removeFocusListener(class240.field3813);
        class7.field126 = 0;
        if (!arg0) {
            field458 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
    public static final int method223(boolean arg0) {
        class168.field2527 = 0;
        field467++;
        if (arg0) {
            field458 = null;
        }
        return class142.method1037(123);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public static void method224(boolean arg0) {
        field462 = null;
        field464 = null;
        field460 = null;
        field458 = null;
        if (arg0) {
            method224(false);
        }
    }
}
