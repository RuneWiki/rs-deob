import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class625 extends class48 implements class493 {

    @OriginalMember(owner = "client!lha", name = "B", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!lha", name = "D", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!lha", name = "E", descriptor = "Lnt;")
    public static class224 field8301;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "(Z)V", line = 5)
    public static void method3435(boolean arg0) {
        field8301 = null;
        if (!arg0) {
            field8301 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Llaa;IZ[[I)V", line = 15)
    public class625(class122 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class315.field4498, class408.field5668, arg1 * arg1 * 6, arg2);
        super.field602.method823(this, -8423);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method342(true), arg1, arg1, 0, class711.method3993(super.field626, true), super.field602.field2046, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method348(arg3[var6], var6 + 34069, arg1, false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 55)
    public static final void method3436(String arg0, String arg1, int arg2, int arg3) {
        if (arg2 <= 101) {
            method3436((String) null, (String) null, -6, 32);
        }
        class758.field10539 = arg3;
        ++field8299;
        class120.field1919 = 2;
        class121.method976(false, arg1, (byte) 16, arg0);
    }
}
