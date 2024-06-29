import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class302 {

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4508 = new CRC32();

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "Lom;")
    public static class344 field4506;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "[Z")
    public static boolean[] field4501;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([II[I)V")
    public static final void method1991(int[] arg0, int arg1, int[] arg2) {
        field4505++;
        if (arg2 == null || arg0 == null) {
            class339.field5056 = null;
            class264.field3868 = null;
            class398.field5797 = null;
            return;
        }
        class264.field3868 = arg2;
        class398.field5797 = new int[arg2.length];
        class339.field5056 = new byte[arg2.length][][];
        for (int var3 = 0; var3 < class264.field3868.length; var3++) {
            class339.field5056[var3] = new byte[arg0[var3]][];
        }
        int var4 = -87 % ((-arg1 - 30) / 50);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIBI)V")
    public static final void method1992(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4502++;
        float var5 = (float) class407.field5882 / (float) class407.field5892;
        int var6 = arg4;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg1 - var7) / 2;
        int var9 = arg2 - (arg4 - var6) / 2;
        if (arg3 < 93) {
            return;
        }
        class453.field6461 = -1;
        class459.field6560 = -1;
        class243.field3674 = class407.field5892 * var9 / var6;
        class254.field3763 = class407.field5882 - (class407.field5882 * var8 / var7);
        class628.method3597((byte) -126);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        field4508 = null;
        if (arg0 == 512) {
            field4506 = null;
            field4501 = null;
        }
    }
}
