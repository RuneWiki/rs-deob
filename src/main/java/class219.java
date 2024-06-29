import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class219 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
    public static int[] field3378 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3382;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class219() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIB)I")
    public static final int method1469(int arg0, int arg1, byte arg2) {
        field3380++;
        class53 var3 = (class53) class291.field4590.method285((long) arg0, 13821);
        int var4 = -63 % ((76 - arg2) / 46);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field800.length > arg1) {
            return var3.field800[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
    public static final int method1470(int arg0, int arg1, int arg2, int arg3) {
        field3379++;
        if (arg2 != -1) {
            method1470(78, -104, -123, 111);
        }
        if (arg1 < arg0) {
            return arg0;
        } else if (arg3 >= arg1) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIZI)V")
    public static final void method1471(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3381++;
        class211.method1418(arg4, arg2, arg1 + arg4, arg0 + arg2);
        class211.method1424(arg4, arg2, arg1, arg0, 0);
        if (class275.field4386 < 100) {
            return;
        }
        if (class19.field286 == null || class19.field286.field2874 != arg1 || class19.field286.field2871 != arg0) {
            class276 var5 = new class276(arg1, arg0);
            class211.method1433(var5.field4393, arg1, arg0);
            client.method1049(0, class85.field1431, 0, class191.field2970, 0, false, 0, arg1, arg0);
            class19.field286 = var5;
            class249.field4023.method176((byte) 64);
        }
        if (arg3) {
            return;
        }
        class19.field286.method850(arg4, arg2);
        int var6 = arg2 + (class110.field1806 * arg0 / class191.field2970);
        int var7 = class82.field1386 * arg0 / class191.field2970;
        int var8 = class24.field329 * arg1 / class85.field1431 + arg4;
        int var9 = class25.field338 * arg1 / class85.field1431;
        int var10 = 16711680;
        if (class167.field2613 == 1) {
            var10 = 16777215;
        }
        class211.method1423(var8, var6, var9, var7, var10, 128);
        class211.method1411(var8, var6, var9, var7, var10);
        if (class71.field1140 <= 0) {
            return;
        }
        int var11;
        if (class6.field135 > 10) {
            var11 = 500 - (class6.field135 * 25);
        } else {
            var11 = class6.field135 * 25;
        }
        for (class297 var12 = (class297) class263.field4181.method1221(123); var12 != null; var12 = (class297) class263.field4181.method1227(-10626)) {
            if (class19.field280 == var12.field4698) {
                int var13 = var12.field4694 * arg1 / class85.field1431 + arg4;
                int var14 = var12.field4696 * arg0 / class191.field2970 + arg2;
                class211.method1423(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field3378 = null;
        if (arg0 != -4) {
            method1472(-80);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILai;[B)V")
    public final void method1473(int arg0, class88 arg1, byte[] arg2) {
        field3383++;
        if (arg1.field1471[arg1.field1535] != 31 || arg1.field1471[arg1.field1535 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3382 == null) {
            this.field3382 = new Inflater(true);
        }
        try {
            this.field3382.setInput(arg1.field1471, arg1.field1535 + 10, arg1.field1471.length - 8 - (arg1.field1535 - -10));
            this.field3382.inflate(arg2);
        } catch (Exception var4) {
            this.field3382.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3382.reset();
        if (arg0 != 31445) {
            this.method1473(-84, (class88) null, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
    private class219(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILji;IJIIII)Z")
    public static final boolean method1474(int arg0, int arg1, int arg2, int arg3, class43 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class60.method454(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
