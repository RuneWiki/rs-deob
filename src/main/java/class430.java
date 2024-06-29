import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class430 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    public static boolean field6257 = false;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Z")
    public static boolean field6261 = true;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field6259 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Liba;")
    public static class211 field6258 = new class211(68, 16);

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Ldc;")
    public static class302 field6262 = new class302();

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lbda;")
    public static class197 field6256;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class7.field215; var5++) {
            Rectangle var6 = class696.field9811[var5];
            if (arg2 < var6.x + var6.width && var6.x < arg2 + arg3 && arg4 < var6.y + var6.height && arg0 + arg4 > var6.y) {
                class394.field5969[var5] = true;
            }
        }
        field6260++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method2570(int arg0) {
        field6262 = null;
        if (arg0 != 16) {
            field6258 = null;
        }
        field6256 = null;
        field6258 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lwda;")
    public abstract class439 method1614(int arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public abstract void method1611(byte arg0);

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public abstract void method1613(int arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Z")
    public abstract boolean method1609(int arg0, int arg1);
}
