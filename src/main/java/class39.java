import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class39 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Loc;")
    public static class151 field796 = class137.method873(2, "scape main");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Loa;")
    public static class149 field793;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field798;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lwd;")
    public static class232[] field794;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method286(Component arg0, byte arg1) {
        Method var2 = class35.field710;
        field799++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1 >= -57) {
            field798 = null;
        }
        arg0.addKeyListener(class139.field2545);
        arg0.addFocusListener(class139.field2545);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I")
    public static final int method287(int arg0, int arg1, int arg2, int arg3) {
        field795++;
        int var4 = arg0 & 0x3;
        if (arg3 != -17905) {
            field794 = null;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method288(int arg0) {
        field794 = null;
        if (arg0 != 7) {
            field796 = null;
        }
        field796 = null;
        field793 = null;
        field798 = null;
    }
}
