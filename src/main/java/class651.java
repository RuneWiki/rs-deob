import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class651 extends class315 implements class342 {

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "[I")
    public static int[] field9061 = new int[2048];

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lia;IZ[[I)V")
    public class651(class27 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class135.field1774, class6.field48, arg1 * arg1 * 6, arg2);
        super.field4091.method3091(true, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1838((byte) 83), arg1, arg1, 0, class386.method2201((byte) 126, super.field4100), super.field4091.field423, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method1836(var6 + 34069, arg1, arg3[var6], true, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3578(byte arg0) {
        field9061 = null;
        if (arg0 <= 9) {
            field9061 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3579(String arg0, int arg1) {
        System.exit(1);
        int var2 = 28 / ((arg1 - 87) / 32);
        ++field9063;
    }
}
