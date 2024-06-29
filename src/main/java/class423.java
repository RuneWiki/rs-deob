import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class423 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "[I")
    public static int[] field5738 = new int[1];

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "J")
    public static long field5736 = 0L;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method2491(int arg0) {
        if (arg0 != -7902) {
            method2491(-109);
        }
        field5738 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lrg;")
    public static final class563 method2492(int arg0, int arg1, int arg2) {
        if (class199.field2605[arg0][arg1][arg2] == null) {
            boolean var3 = class199.field2605[0][arg1][arg2] != null && class199.field2605[0][arg1][arg2].field7893 != null;
            if (var3 && arg0 >= class183.field2341 - 1) {
                return null;
            }
            class590.method3402(arg0, arg1, arg2);
        }
        return class199.field2605[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ID)V")
    public static final void method2493(int arg0, double arg1) {
        if (class35.field530 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class558.field7818[var3] = var4 > 255 ? 255 : var4;
            }
            class35.field530 = arg1;
        }
        if (arg0 != 255) {
            field5738 = null;
        }
        field5737++;
    }
}
