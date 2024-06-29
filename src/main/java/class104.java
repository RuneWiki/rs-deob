import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class104 {

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "Llja;")
    public static class744 field1334 = new class744(35, 2);

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "Z")
    public static boolean field1336 = false;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V", line = 4)
    public static void method855(byte arg0) {
        if (arg0 > 28) {
            field1334 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IC)V", line = 27)
    public final void method856(int arg0, char arg1) {
        field1337++;
        if (arg0 >= -43) {
            this.method858(-55, (byte) -105);
        }
        OpenGL.glCallList(this.field1335 + arg1);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 41)
    public final void method857(int arg0) {
        if (arg0 != 0) {
            this.method856(29, '\u000e');
        }
        field1333++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)V", line = 53)
    public final void method858(int arg0, byte arg1) {
        if (arg1 >= -18) {
            this.method857(57);
        }
        OpenGL.glNewList(this.field1335 + arg0, 4864);
        field1338++;
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lpc;I)V", line = 64)
    public class104(class700 arg0, int arg1) {
        this.field1335 = OpenGL.glGenLists(arg1);
    }
}
