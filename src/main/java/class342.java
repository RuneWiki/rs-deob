import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class342 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4763 = -1;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "[I")
    public static int[] field4772 = new int[4];

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "B")
    public byte field4771;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "Ljava/lang/String;")
    public String field4762;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Ljava/lang/String;")
    public String field4767;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Ljava/lang/String;")
    public String field4769;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Ljava/lang/String;")
    public String field4770;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Z")
    public static boolean field4764;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "[I")
    public static int[] field4768;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 8)
    public static void method2165(byte arg0) {
        field4768 = null;
        field4772 = null;
        if (arg0 != 16) {
            method2165((byte) 90);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZII)I", line = 22)
    public static final int method2166(int arg0, boolean arg1, int arg2, int arg3) {
        field4765++;
        class787 var4 = class447.method2666(arg2, Integer.MIN_VALUE, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 <= arg3 && arg3 < var4.field10805.length) {
            return var4.field10805[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/awt/Component;Z)Len;", line = 45)
    public static final class337 method2167(Component arg0, boolean arg1) {
        field4766++;
        return arg1 ? new class359(arg0) : null;
    }
}
