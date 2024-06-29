import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class85 extends class623 {

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "Ldh;")
    public static class320 field888 = new class320(71, 4);

    @OriginalMember(owner = "client!vga", name = "K", descriptor = "Z")
    public static boolean field900 = false;

    @OriginalMember(owner = "client!vga", name = "O", descriptor = "Z")
    public static boolean field903 = false;

    @OriginalMember(owner = "client!vga", name = "P", descriptor = "I")
    public static int field904 = -1;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!vga", name = "y", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!vga", name = "B", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!vga", name = "E", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!vga", name = "H", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!vga", name = "J", descriptor = "Ljt;")
    public class104 field899;

    @OriginalMember(owner = "client!vga", name = "M", descriptor = "Ljava/lang/String;")
    public String field901;

    @OriginalMember(owner = "client!vga", name = "C", descriptor = "[I")
    public int[] field894;

    @OriginalMember(owner = "client!vga", name = "I", descriptor = "[I")
    public int[] field898;

    @OriginalMember(owner = "client!vga", name = "G", descriptor = "[Lpfa;")
    public class295[] field896;

    @OriginalMember(owner = "client!vga", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field902;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V", line = 7)
    public static void method596(byte arg0) {
        if (arg0 < 4) {
            field897 = -37;
        }
        field888 = null;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)I", line = 28)
    public static final int method597(int arg0, int arg1) {
        if (arg1 != 255) {
            field897 = -8;
        }
        field892++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)V", line = 44)
    public static final void method598(int arg0, int arg1, int arg2) {
        field893++;
        if (class574.field8144 == null) {
            return;
        }
        int var3 = class712.field10031;
        int var4 = class486.field6971;
        class661.method3765(arg2, (byte) -98, arg0);
        if (~class3.field27 == arg1) {
            class688.field9708 = null;
            class688.field9708 = class574.field8144.method423(class574.field8144.method425(class233.field2723, class2.field9), class574.field8144.method337(class233.field2723, class2.field9));
        } else if (class3.field27 == 1 && (class151.field1667 == null || class712.field10031 != var3 || class486.field6971 != var4)) {
            class151.field1667 = new class118[class712.field10031 * class486.field6971];
            for (int var5 = 0; var5 < class151.field1667.length; var5++) {
                class151.field1667[var5] = class574.field8144.method423(class574.field8144.method425(class125.field1313, class541.field7787), class574.field8144.method337(class125.field1313, class541.field7787));
            }
            class11.field87 = new int[class712.field10031 * class486.field6971];
            class660.field9427 = 1;
        }
        class568.field8076 = true;
    }
}
