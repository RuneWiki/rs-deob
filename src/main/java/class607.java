import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class607 {

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    private int field8573;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field8569 = -1;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Lln;")
    public static class472 field8568 = new class472(14, 0, 4, 1);

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Ljava/lang/String;")
    public static String field8575;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BC)V")
    public final void method3477(byte arg0, char arg1) {
        OpenGL.glCallList(this.field8573 + arg1);
        field8571++;
        if (arg0 <= 16) {
            method3478((byte) 37);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public static void method3478(byte arg0) {
        field8568 = null;
        field8575 = null;
        if (arg0 > -113) {
            method3480(null, -42);
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
    public final void method3479(byte arg0) {
        int var2 = 16 % ((30 - arg0) / 51);
        field8570++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lrs;I)V")
    public class607(class166 arg0, int arg1) {
        this.field8573 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3480(String arg0, int arg1) {
        field8574++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class468.field6818; var2++) {
            if (arg0.equalsIgnoreCase(class562.field7961[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)V")
    public final void method3481(int arg0, int arg1) {
        field8572++;
        OpenGL.glNewList(this.field8573 + arg1, 4864);
        int var3 = -15 % ((arg0 + 73) / 53);
    }
}
