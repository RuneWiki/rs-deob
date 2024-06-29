import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class48 extends RuntimeException {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field889;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljava/lang/String;")
    public String field890;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Z")
    public static boolean field891 = false;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field887 = 0;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lsd;")
    public static class166 field892 = class135.method935(":assist:", 0);

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field896 = 0;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    public static int[] field894 = new int[5];

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lsd;")
    private static class166 field895 = class135.method935("Click to switch", 0);

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field897 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lsd;")
    public static class166 field899 = field895;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIII)Z")
    public static final boolean method372(byte arg0, int arg1, int arg2, int arg3) {
        field898++;
        int var4 = arg3 >> 14 & 0x7FFF;
        int var5 = class131.field2556.method576(class165.field3130, arg1, arg2, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class145 var8 = class170.method1185((byte) 58, var4);
            int var9 = var8.field2854;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field2825;
                var10 = var8.field2832;
            } else {
                var10 = var8.field2825;
                var11 = var8.field2832;
            }
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            class6.method39(class41.field728.field3521[0], 0, var10, var11, (byte) 29, arg2, true, arg1, var9, 2, class41.field728.field3554[0], 0);
        } else {
            class6.method39(class41.field728.field3521[0], var6 + 1, 0, 0, (byte) 79, arg2, true, arg1, 0, 2, class41.field728.field3554[0], var7);
        }
        if (arg0 <= 7) {
            method372((byte) -69, 9, 37, 10);
        }
        class86.field1716 = 0;
        class194.field3849 = class69.field1409;
        class194.field3842 = 2;
        class184.field3544 = class57.field1174;
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        field894 = null;
        field895 = null;
        field899 = null;
        field892 = null;
        if (arg0 != 0) {
            method374(97, 32);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lsd;")
    public static final class166 method374(int arg0, int arg1) {
        if (arg0 > -100) {
            return null;
        } else {
            field893++;
            return class22.method148(new class166[] { class174.method1192(false, arg1 >> 24 & 0xFF), class129.field2534, class174.method1192(false, arg1 >> 16 & 0xFF), class129.field2534, class174.method1192(false, arg1 >> 8 & 0xFF), class129.field2534, class174.method1192(false, arg1 & 0xFF) }, 0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class48(Throwable arg0, String arg1) {
        this.field889 = arg0;
        this.field890 = arg1;
    }
}
