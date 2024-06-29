import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class649 extends class192 implements class584 {

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    public static int field9150 = -1;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lno;IZ[[I)V", line = 7)
    public class649(class704 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class752.field10511, class256.field3677, arg1 * 6 * arg1, arg2);
        super.field2896.method2294(this, -2);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1330((byte) -37), arg1, arg1, 0, class489.method2929(super.field2904, 6407), super.field2896.field9922, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method1338(arg3[var6], arg1, arg1, var6 + 34069, (byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILvd;II)Lhia;", line = 44)
    public static final class66 method3771(int arg0, class39 arg1, int arg2, int arg3) {
        ++field9147;
        if (arg3 != 6) {
            method3771(-85, (class39) null, -14, -19);
        }
        byte[] var4 = arg1.method211(true, arg2, arg0);
        return var4 == null ? null : new class66(var4);
    }
}
