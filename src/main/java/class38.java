import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class38 extends class14 {

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    private int field609 = -1;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    private int field607 = -1;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "Ljb;")
    public static class499 field603 = null;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "Lpg;")
    public static class492 field610 = new class492(47, 6);

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "[I")
    public static int[] field613 = new int[100];

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "[I")
    public static int[] field608;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "[I")
    public static int[] field612;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V", line = 8)
    public static final void method271(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6261 != null) {
                var3.field6261 = null;
            }
            if (var3.field6271 != null) {
                var3.field6271 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lbv;IIII[BI)V", line = 21)
    public class38(class282 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field611 = arg3;
        this.field600 = arg2;
        this.field599 = arg4;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field240, 0, super.field223, this.field600, this.field611, this.field599, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V", line = 40)
    public static final void method272(int arg0, byte arg1) {
        ++field602;
        if (arg1 == 77) {
            if (class463.field6779 != arg0) {
                class96.field1403 = class485.field7122 = class412.field6195[arg0];
                class519.method3088((byte) -15);
                class504.field7531 = new int[class96.field1403][class485.field7122];
                class35.field541 = new int[class96.field1403][class485.field7122];
                class501.field7483 = new int[4][class96.field1403 >> 3][class485.field7122 >> 3];
                for (int var2 = 0; var2 < 4; ++var2) {
                    class444.field6605[var2] = class452.method2722(class41.method323(arg1, 77), class96.field1403, class485.field7122);
                }
                class307.field4504 = new byte[4][class96.field1403][class485.field7122];
                class88.method577(class485.field7122, 4, class96.field1403, (byte) -24);
                class452.method2721(class337.field5242, class485.field7122 >> 3, 1, class96.field1403 >> 3);
                class463.field6779 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lbv;IIII)V", line = 73)
    public class38(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field599 = arg4;
        this.field611 = arg3;
        this.field600 = arg2;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glTexImage3Dub(super.field240, 0, super.field223, this.field600, this.field611, this.field599, 0, class501.method2996(super.field223, (byte) 116), 5121, (byte[]) null, 0);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V", line = 87)
    public final void method127(boolean arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field609, this.field607, super.field240, 0, 0, 0);
        ++field601;
        if (arg0) {
            field613 = null;
        }
        this.field607 = -1;
        this.field609 = -1;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 100)
    public static void method273(byte arg0) {
        field610 = null;
        field603 = null;
        field612 = null;
        field613 = null;
        field608 = null;
        int var1 = -101 % ((arg0 - 37) / 32);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 115)
    public static final void method274(String arg0, int arg1) {
        ++field605;
        if (!arg0.equals("")) {
            ++class329.field5066;
            class179.method1287(false, class61.field871);
            class75.field1006.method625(class142.method951(arg1 ^ -5146, arg0), false);
            if (arg1 != 5121) {
                method274((String) null, -40);
            }
            class75.field1006.method603(63, arg0);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIII)V", line = 136)
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field606;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glCopyTexSubImage3D(super.field240, arg7, arg2, arg3, arg4, arg5, arg6, arg0, arg1);
        OpenGL.glFlush();
    }
}
