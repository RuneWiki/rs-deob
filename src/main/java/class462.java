import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class462 extends class375 implements class317 {

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    private int field6653 = -1;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    private int field6657 = -1;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "Lok;")
    private class228 field6648;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    private int field6661;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
    public int field6655;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
    private int field6651;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
    public int field6658;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "Ltf;")
    public static class264 field6647 = new class264(2, 4);

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "Lpu;")
    public static class522 field6660;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "[I")
    public static int[] field6663;

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "[S")
    public static short[] field6664;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(B)V")
    public static void method2724(byte arg0) {
        field6664 = null;
        if (arg0 != -64) {
            method2725((byte) -46, null, null, null, null);
        }
        field6647 = null;
        field6660 = null;
        field6663 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6654++;
        this.method2727((byte) -120);
        super.finalize();
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public final void method226(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6657, this.field6653, 36161, 0);
        field6652++;
        this.field6653 = -1;
        this.field6657 = arg0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLpu;Lpu;Lpu;Lbh;)Z")
    public static final boolean method2725(byte arg0, class522 arg1, class522 arg2, class522 arg3, class34 arg4) {
        class286.field4266 = arg2;
        field6659++;
        class563.field7922 = arg3;
        class495.field7032 = arg1;
        class323.field4762 = arg4;
        if (arg0 != -106) {
            method2726(29, '/');
        }
        return true;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IC)Z")
    public static final boolean method2726(int arg0, char arg1) {
        field6649++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (~arg1 <= arg0 && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(B)V")
    public final void method2727(byte arg0) {
        int var2 = 115 % ((-arg0 - 50) / 48);
        if (this.field6651 > 0) {
            this.field6648.method1525(this.field6651, (byte) -122, this.field6658);
            this.field6651 = 0;
        }
        field6662++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
    public final void method2728(int arg0, int arg1, int arg2) {
        field6656++;
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field6651);
        if (arg0 == 376) {
            this.field6653 = arg1;
            this.field6657 = arg2;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lok;III)V")
    public class462(class228 arg0, int arg1, int arg2, int arg3) {
        this.field6648 = arg0;
        this.field6661 = arg1;
        this.field6655 = arg2;
        this.field6650 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class17.field189, 0);
        this.field6651 = class17.field189[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6651);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6661, this.field6655, this.field6650);
        this.field6658 = this.field6655 * this.field6650 * this.field6648.method1514(this.field6661, -29);
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lok;IIII)V")
    public class462(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6655 = arg2;
        this.field6661 = arg1;
        this.field6650 = arg3;
        this.field6648 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class17.field189, 0);
        this.field6651 = class17.field189[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6651);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6661, this.field6655, this.field6650);
        this.field6658 = this.field6655 * this.field6650 * this.field6648.method1514(this.field6661, -97);
    }
}
