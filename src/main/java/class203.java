import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class203 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field3252 = new int[5];

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lqh;")
    public static class201 field3251;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lqh;")
    public static class201 field3254;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1394(int arg0, int arg1) {
        if (arg0 != -1608752296) {
            field3252 = null;
        }
        field3255++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF760D) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I")
    public static final int method1395(boolean arg0) {
        if (arg0) {
            method1394(-62, 22);
        }
        field3256++;
        return 15;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        if (class28.field437 != null) {
            class210.method1450(-3591, class28.field437);
            class28.field437 = null;
        }
        field3253++;
        if (arg0 != 255) {
            field3257 = 108;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
    public static void method1397(boolean arg0) {
        field3254 = null;
        if (arg0) {
            method1397(true);
        }
        field3252 = null;
        field3251 = null;
    }
}
