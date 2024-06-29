import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class39 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field913 = 2;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Ljd;")
    public static class86 field911 = class122.method868("::", true);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field909 = -1;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)V")
    public static final void method324(int arg0, int arg1, byte arg2, int arg3) {
        field914++;
        class161 var4 = class204.method1456(true, 11, arg1);
        int var5 = 102 % ((arg2 + 37) / 35);
        var4.method1174(0);
        var4.field3027 = arg0;
        var4.field3016 = arg3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method325(Component arg0, int arg1) {
        int var2 = 25 % ((23 - arg1) / 55);
        arg0.addMouseListener(class75.field1502);
        arg0.addMouseMotionListener(class75.field1502);
        arg0.addFocusListener(class75.field1502);
        field916++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method327(byte arg0) {
        if (arg0 != 86) {
            field913 = -128;
        }
        field911 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class39() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lok;)V")
    public class39(class39 arg0) {
        this.field908 = arg0.field908;
        this.field907 = arg0.field907;
        this.field912 = arg0.field912;
        this.field915 = arg0.field915;
    }
}
