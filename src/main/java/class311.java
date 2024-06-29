import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class311 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lgd;")
    public static class325 field4915 = new class325(4);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[S")
    public static short[] field4916 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4917 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZIIZ)V", line = 6)
    public static final void method2196(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field4913++;
        if (arg4 > arg1) {
            int var7 = arg1;
            int var8 = (arg1 + arg4) / 2;
            class44 var9 = class175.field2802[var8];
            class175.field2802[var8] = class175.field2802[arg4];
            class175.field2802[arg4] = var9;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (class31.method281(arg6, var9, class175.field2802[var10], (byte) -124, arg3, arg0, arg5) <= 0) {
                    class44 var11 = class175.field2802[var10];
                    class175.field2802[var10] = class175.field2802[var7];
                    class175.field2802[var7++] = var11;
                }
            }
            class175.field2802[arg4] = class175.field2802[var7];
            class175.field2802[var7] = var9;
            method2196(arg0, arg1, -89, arg3, var7 - 1, arg5, arg6);
            method2196(arg0, var7 + 1, -47, arg3, arg4, arg5, arg6);
        }
        if (arg2 > -28) {
            field4915 = (class325) null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 66)
    public static void method2197(int arg0) {
        field4916 = null;
        if (arg0 == 0) {
            field4915 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)V")
    public abstract void method2195(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)[B")
    public abstract byte[] method2198(byte arg0);
}
