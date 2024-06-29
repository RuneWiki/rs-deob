import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class184 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
    public boolean field2965 = false;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "F")
    public static float field2962;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "J")
    public long field2972;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lhd;")
    public class161 field2968;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    public static int[] field2964;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
    public static int[] field2967;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1451(int arg0, int arg1) {
        field2970++;
        class167.method1305(class167.field2661, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class167.method1297(-50.0F, -60.0F, -50.0F);
        class167.method1299(class167.field2657, arg1, false);
        class167.method1304();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)Z", line = 24)
    public static final boolean method1452(int arg0, byte[] arg1) {
        field2969++;
        class227 var2 = new class227(arg1);
        int var3 = var2.method1720((byte) -58);
        if (var3 != 1) {
            return false;
        } else if (arg0 >= -106) {
            return true;
        } else {
            boolean var4 = var2.method1720((byte) -40) == 1;
            if (var4) {
                class86.method685(126, var2);
            }
            class241.method1838(-2, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 63)
    public static void method1453(int arg0) {
        field2967 = null;
        if (arg0 != 1) {
            field2962 = 1.6803694F;
        }
        field2964 = null;
    }
}
