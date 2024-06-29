import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class168 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    private int[] field2761;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    public static int[] field2758 = new int[128];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 13)
    public static void method1252(byte arg0) {
        if (arg0 != -8) {
            method1252((byte) 13);
        }
        field2758 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 24)
    public static final void method1253(int arg0, int arg1, int arg2) {
        field2762++;
        if (class255.method1799(arg2, false)) {
            class207.method1465(class44.field845[arg2], arg0 ^ 0xFFFFE466, arg1);
            if (arg0 != -11892) {
                field2760 = 35;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lva;", line = 38)
    public static final class140 method1254(Throwable arg0, String arg1) {
        field2756++;
        class140 var2;
        if ((arg0 instanceof class140)) {
            var2 = (class140) arg0;
            var2.field2363 = var2.field2363 + ' ' + arg1;
        } else {
            var2 = new class140(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V", line = 61)
    public static final void method1255(byte arg0, int arg1) {
        field2759++;
        if (arg0 > -108) {
            field2758 = (int[]) null;
        }
        class177 var2 = class177.method1310(120, 6, arg1);
        var2.method1303((byte) 58);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I", line = 77)
    public final int method1256(int arg0, int arg1) {
        field2755++;
        int var3 = (this.field2761.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 != 26398) {
            method1257(-121, -25, 102, -127, -35);
        }
        while (true) {
            int var5 = this.field2761[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2761[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 113)
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class220.field3664 <= arg2 && arg2 <= class72.field1275) {
            int var5 = class110.method827((byte) -63, arg4, class48.field941, class125.field2164);
            int var6 = class110.method827((byte) 126, arg1, class48.field941, class125.field2164);
            class85.method653(var6, arg3 ^ 0xFFFF8C7E, arg2, var5, arg0);
        }
        field2757++;
        if (arg3 != 29685) {
            field2760 = 50;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([I)V", line = 129)
    public class168(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2761 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2761[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2761[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2761[var5 + var5] = arg0[var4];
            this.field2761[var5 + var5 + 1] = var4++;
        }
    }
}
