import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class265 extends class280 {

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4297 = "green:";

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lcc;")
    public static class216 field4292 = new class216(30);

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "[I")
    public static int[] field4300 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Llc;")
    public static class86 field4299;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1849(int arg0, int arg1, int arg2, long arg3) {
        class286 var5 = class220.field3525[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4526 != null && var5.field4526.field1464 == arg3) {
            return true;
        } else if (var5.field4532 != null && var5.field4532.field2565 == arg3) {
            return true;
        } else if (var5.field4518 != null && var5.field4518.field2600 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4541; var6++) {
                if (var5.field4530[var6].field2683 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method1850(int arg0, boolean arg1) {
        if (arg1) {
            field4298 = 57;
        }
        field4294++;
        class240 var2 = (class240) class230.field3706.method310(-24190, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class145.method1041(var4, (byte) 123, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class240(var3);
            class230.field3706.method312((long) arg0, var2, (byte) 109);
        }
        return var2.field3836;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method1851(int arg0) {
        if (arg0 != -11355) {
            method1850(122, true);
        }
        field4299 = null;
        field4300 = null;
        field4292 = null;
        field4297 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(II)V")
    public class265(int arg0, int arg1) {
        this.field4293 = arg1;
        this.field4296 = arg0;
    }
}
