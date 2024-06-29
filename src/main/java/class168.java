import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class168 extends class240 {

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2602 = -1;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
    public static boolean field2603 = false;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2606 = "wave:";

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2613 = "glow3:";

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "S")
    public static short field2608 = 32767;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lob;")
    public static class292 field2612 = null;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Z")
    public static boolean field2616 = false;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lja;")
    public static class64 field2611;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[[[B")
    public static byte[][][] field2607;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 5)
    public static void method1229(byte arg0) {
        field2612 = null;
        if (arg0 >= 62) {
            field2606 = null;
            field2611 = null;
            field2613 = null;
            field2607 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)Z", line = 22)
    public final boolean method1230(int arg0, int arg1, int arg2) {
        if (arg2 != -13323) {
            field2602 = 7;
        }
        field2605++;
        return arg1 >= this.field2610 && this.field2615 >= arg1 && arg0 >= this.field2609 && this.field2604 >= arg0;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIII)V", line = 80)
    public class168(int arg0, int arg1, int arg2, int arg3) {
        this.field2609 = arg1;
        this.field2615 = arg2;
        this.field2610 = arg0;
        this.field2604 = arg3;
    }
}
