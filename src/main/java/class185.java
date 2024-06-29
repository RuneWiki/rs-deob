import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class185 extends class8 {

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Lsf;")
    public class129 field3064;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field3065 = 0;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
    public static boolean field3067 = false;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3066 = "Loading sprites - ";

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lak;")
    public static class172 field3073;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 4)
    public static void method1387(int arg0) {
        if (arg0 == 20) {
            field3066 = null;
            field3073 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lsf;)V", line = 19)
    public class185(class129 arg0) {
        this.field3064 = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1388(int arg0, int arg1) {
        field3063++;
        if (arg0 != -3 || arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class76.method517(-20869);
        } else if (arg1 == 2) {
            class246.method1758(2586);
        } else if (arg1 == 3) {
            class123.method887(-1428574521);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class194.field3175.field586 = 0;
        class194.field3175.method257(arg2 ^ 0xFFFFFFFE, 20);
        field3071++;
        class194.field3175.method257(-2, arg4);
        class194.field3175.method257(-2, arg1);
        class194.field3175.method287(0, arg3);
        class194.field3175.method287(arg2, arg0);
        class25.field342 = 0;
        class31.field416 = -3;
        class149.field2318 = 1;
        class215.field3507 = 0;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V", line = 83)
    public static final void method1390(byte arg0) {
        int var1 = -23 / ((arg0 + 50) / 63);
        field3068++;
        class74.field1039.method707(0);
    }
}
