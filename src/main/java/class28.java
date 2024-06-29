import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 {

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field213 = 128;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field208 = 128;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[I")
    public static int[] field221;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method106(int arg0) {
        field214++;
        if (class695.method3923(arg0 ^ 0xFFFFF7FF, class713.field9949) || class719.method4041(-6410, class713.field9949)) {
            class150.method918(class684.field9518 >> 12, -108, class294.field3956 >> 12, 5000);
        } else {
            int var1 = class653.field9086.field898[0] >> 3;
            int var2 = class653.field9086.field899[0] >> 3;
            if (var1 >= 0 && class272.field3589 >> 3 > var1 && var2 >= 0 && var2 < (class3.field26 >> 3)) {
                class150.method918(var2, arg0 - 111, var1, 5000);
            } else {
                class150.method918(class3.field26 >> 4, arg0 - 118, class272.field3589 >> 4, 0);
            }
        }
        class194.method1079(arg0 - 113);
        if (arg0 != -1) {
            field210 = 71;
        }
        class339.method2001((byte) -74);
        class407.method2349(-19004);
        class123.method795((byte) -42);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Luc;I)V")
    public final void method107(class28 arg0, int arg1) {
        this.field218 = arg0.field218;
        this.field213 = arg0.field213;
        field217++;
        this.field215 = arg0.field215;
        this.field208 = arg0.field208;
        this.field207 = arg0.field207;
        int var3 = 81 % ((-arg1 - 39) / 37);
        this.field222 = arg0.field222;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Luc;")
    public final class28 method108(int arg0) {
        field219++;
        if (arg0 != 28889) {
            this.field207 = -34;
        }
        return new class28(this.field218, this.field208, this.field213, this.field207, this.field222, this.field215);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
    public static final int method109(byte arg0, int arg1) {
        field216++;
        if (arg0 <= 113) {
            method106(51);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method110(byte arg0) {
        field221 = null;
        if (arg0 != 21) {
            method110((byte) 51);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method111(byte arg0, String arg1) {
        field220++;
        class103 var2 = class756.method4206(false);
        var2.field1379.method3393(class696.field9732.field2395, -110);
        var2.field1379.method3423(0, 1571862888);
        int var3 = var2.field1379.field8520;
        var2.field1379.method3423(637, 1571862888);
        int[] var4 = class132.method833(12206, var2);
        int var5 = var2.field1379.field8520;
        var2.field1379.method3387(arg1, (byte) 113);
        var2.field1379.method3393(class723.field10095, 84);
        int var6 = -65 % ((-arg0 - 73) / 33);
        var2.field1379.field8520 += 7;
        var2.field1379.method3434(true, var4, var5, var2.field1379.field8520);
        var2.field1379.method3406((byte) 90, var2.field1379.field8520 - var3);
        class27.method104(false, var2);
        class48.field487 = 0;
        class698.field9828 = -3;
        class284.field3753 = 1;
        class397.field5635 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        this.field218 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIII)V")
    private class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field213 = arg2;
        this.field218 = arg0;
        this.field215 = arg5;
        this.field207 = arg3;
        this.field208 = arg1;
        this.field222 = arg4;
    }
}
