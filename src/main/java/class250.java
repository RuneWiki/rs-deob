import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class250 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Luf;")
    public static class310 field3475 = new class310(17, -2);

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Ltk;")
    public static class228 field3480 = new class228(1, 2, 2, 0);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
    public static int[] field3482 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lfg;")
    public static class83 field3481 = new class83("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    public final void method1471(int arg0, int arg1) {
        field3474++;
        OpenGL.glNewList(this.field3476 + arg1, 4864);
        if (arg0 != 2) {
            this.method1475(124);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)Lid;")
    public static final class413 method1472(byte arg0, int arg1, int arg2) {
        field3477++;
        class413 var3 = new class413();
        if (arg0 > -2) {
            field3483 = 51;
        }
        var3.field6051 = arg1 + 6;
        var3.field6064 = arg2 + 1 + 5;
        var3.field6053 = -1;
        var3.field6063 = -1;
        var3.field6067 = new int[var3.field6064][var3.field6051];
        var3.method2467((byte) 69);
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lht;I)V")
    public class250(class410 arg0, int arg1) {
        this.field3476 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IC)V")
    public final void method1473(int arg0, char arg1) {
        field3478++;
        if (arg0 != -2) {
            this.field3476 = -127;
        }
        OpenGL.glCallList(this.field3476 + arg1);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3481 = null;
        field3480 = null;
        if (arg0 == 6) {
            field3482 = null;
            field3475 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
    public final void method1475(int arg0) {
        OpenGL.glEndList();
        if (arg0 != 17) {
            this.method1475(14);
        }
        field3479++;
    }
}
