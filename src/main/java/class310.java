import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class310 {

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[I")
    public static int[] field4419 = new int[2048];

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Lsl;")
    public static class318 field4418 = new class318(6, 8);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "[[[I")
    public static int[][][] field4420;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class284.field4129 = arg3;
        class462.field6791 = arg5;
        class193.field2810 = arg0;
        field4417++;
        class346.field4805 = arg2;
        int var6 = -27 / ((arg4 + 62) / 39);
        class172.field2447 = arg1;
        if (class193.field2810 >= 100) {
            int var7 = class462.field6791 * 128 + 64;
            int var8 = class346.field4805 * 128 + 64;
            int var9 = class66.method643(var7, -105, class525.field7714, var8) - class172.field2447;
            int var10 = var7 - class161.field2268;
            int var11 = var9 - class487.field7162;
            int var12 = var8 - class486.field7138;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class321.field4529 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class316.field4503 = (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D) & 0x3FFF;
            if (class321.field4529 < 1024) {
                class321.field4529 = 1024;
            }
            class170.field2418 = 0;
            if (class321.field4529 > 3072) {
                class321.field4529 = 3072;
            }
        }
        class462.field6802 = 2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
    public static final void method1932(byte arg0, int arg1) {
        if (arg0 != 9) {
            field4422 = 59;
        }
        field4416++;
        class215 var2 = class171.method1208(arg1, (byte) 120, 12);
        var2.method1469((byte) -49);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static void method1933(byte arg0) {
        int var1 = -113 / ((arg0 - 63) / 54);
        field4419 = null;
        field4420 = null;
        field4418 = null;
    }

    static {
        new class331(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }
}
