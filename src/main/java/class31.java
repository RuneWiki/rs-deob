import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class31 extends class283 {

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "Lna;")
    private static class26 field518 = class69.method505("Loaded config", (byte) -123);

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "Lna;")
    public static class26 field520 = field518;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field526 = new CRC32();

    @OriginalMember(owner = "client!fn", name = "Z", descriptor = "Lna;")
    public static class26 field528 = class69.method505(")1 ", (byte) -127);

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!fn", name = "Y", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIII)V", line = 5)
    public static final void method245(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field522++;
        if (arg4 == arg7) {
            class285.method2010(arg1, arg3, (byte) -113, arg6, arg7, arg2, arg5);
            return;
        }
        if (!arg0) {
            method248(87, 8);
        }
        if ((arg2 - arg7) >= class225.field3572 && arg2 + arg7 <= class27.field454 && class80.field1259 <= (arg3 - arg4) && class117.field1840 >= arg3 + arg4) {
            class154.method1045(arg6, arg2, arg3, arg5, arg7, 95, arg4, arg1);
        } else {
            class126.method860(arg7, arg6, arg5, arg1, (byte) -54, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 31)
    public class31() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIIII)V", line = 41)
    public static final void method246(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field525++;
        class86.field1412[0].method113(arg3, arg4);
        class86.field1412[1].method113(arg3, arg4 + arg5 - 16);
        int var6 = 44 % ((arg0 - 38) / 57);
        int var7 = (arg5 - 32) * arg5 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - var7 - 32) * arg1 / (arg2 - arg5);
        if (!class255.field4184) {
            class34.method286(arg3, arg4 + 16, 16, arg5 - 32, class323.field5547);
            class34.method286(arg3, arg4 + var8 + 16, 16, var7, class39.field641);
            class34.method281(arg3, arg4 + var8 + 16, var7, class194.field3026);
            class34.method281(arg3 + 1, var8 + 16 + arg4, var7, class194.field3026);
            class34.method280(arg3, var8 + arg4 + 16, 16, class194.field3026);
            class34.method280(arg3, arg4 + var8 + 17, 16, class194.field3026);
            class34.method281(arg3 + 15, arg4 + 16 + var8, var7, class55.field899);
            class34.method281(arg3 + 14, arg4 - -17 - -var8, var7 - 1, class55.field899);
            class34.method280(arg3, arg4 + var8 + var7 + 15, 16, class55.field899);
            class34.method280(arg3 + 1, arg4 + var7 - (-var8 + -14), 15, class55.field899);
            return;
        }
        class326.method2278(arg3, arg4 + 16, 16, arg5 - 32, class323.field5547);
        class326.method2278(arg3, arg4 + var8 + 16, 16, var7, class39.field641);
        class326.method2268(arg3, arg4 + var8 + 16, var7, class194.field3026);
        class326.method2268(arg3 + 1, arg4 + 16 + var8, var7, class194.field3026);
        class326.method2266(arg3, var8 + arg4 + 16, 16, class194.field3026);
        class326.method2266(arg3, arg4 + var8 + 17, 16, class194.field3026);
        class326.method2268(arg3 + 15, 16 - -var8 + arg4, var7, class55.field899);
        class326.method2268(arg3 + 14, arg4 - -var8 + 17, var7 - 1, class55.field899);
        class326.method2266(arg3, arg4 + var8 + var7 + 15, 16, class55.field899);
        class326.method2266(arg3 + 1, arg4 + 14 - -var8 + var7, 15, class55.field899);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILbe;)V", line = 86)
    public static final void method247(int arg0, class297 arg1) {
        field521++;
        class297 var2 = class89.method697(arg1, 123);
        if (arg0 != 14) {
            method249(true);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class141.field2153;
            var4 = class38.field622;
        } else {
            var3 = var2.field4996;
            var4 = var2.field4967;
        }
        class277.method1957(var3, 13987, var4, arg1, false);
        class212.method1416(arg1, arg0 + 23716, var3, var4);
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V", line = 117)
    public static final void method248(int arg0, int arg1) {
        field523++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 <= 27) {
            method250((class266) null, (class266) null, true);
        }
        if (!class71.method509(arg0, 104)) {
            return;
        }
        class297[] var2 = class86.field1416[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class297 var4 = var2[var3];
            if (var4.field4958 != null) {
                class263 var5 = new class263();
                var5.field4306 = var4.field4958;
                var5.field4307 = var4;
                class217.method1454((byte) -86, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 156)
    public static void method249(boolean arg0) {
        field520 = null;
        field528 = null;
        field526 = null;
        if (!arg0) {
            field520 = (class26) null;
        }
        field518 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)[I", line = 176)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -42 / ((30 - arg1) / 36);
        field524++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[][] var5 = this.method1994(arg0, 0, (byte) -126);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            for (int var9 = 0; var9 < class101.field1632; var9++) {
                var4[var9] = (var6[var9] + var7[var9] + var8[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lve;Lve;Z)I", line = 214)
    public static final int method250(class266 arg0, class266 arg1, boolean arg2) {
        field519++;
        int var3 = 0;
        if (arg0.method1900(0, class145.field2204)) {
            var3++;
        }
        if (arg0.method1900(0, class36.field590)) {
            var3++;
        }
        if (arg0.method1900(0, class46.field724)) {
            var3++;
        }
        if (arg1.method1900(0, class145.field2204)) {
            var3++;
        }
        if (arg2) {
            field520 = (class26) null;
        }
        if (arg1.method1900(0, class36.field590)) {
            var3++;
        }
        if (arg1.method1900(0, class46.field724)) {
            var3++;
        }
        return var3;
    }
}
