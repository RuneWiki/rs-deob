import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class121 {

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field1463 = 8;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1465 = 16777215;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
    public static boolean field1457 = false;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public static int[] field1453 = new int[25];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "S")
    public static short field1458 = 256;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Z")
    public boolean field1452;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILtn;)V")
    public final void method794(int arg0, class179 arg1) {
        int var3 = -81 / ((arg0 + 1) / 59);
        while (true) {
            int var4 = arg1.method1094(255);
            if (var4 == 0) {
                field1464++;
                return;
            }
            this.method797(-64, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method795(byte arg0) {
        int var1 = 26 % ((arg0 - 50) / 57);
        field1453 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILha;IIIII)V")
    public static final void method796(int arg0, class454 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class688.field9783 == null || class497.field7033 == null || class440.field6182 == null) && class645.field8897.method3827(class414.field5847, (byte) 66) && class645.field8897.method3827(class16.field224, (byte) 93) && class645.field8897.method3827(class516.field7274, (byte) 85)) {
            class196 var7 = class196.method1231(class645.field8897, class16.field224, 0);
            class497.field7033 = arg1.method60(var7, true);
            var7.method1226();
            class105.field1287 = arg1.method60(var7, true);
            class688.field9783 = arg1.method60(class196.method1231(class645.field8897, class414.field5847, 0), true);
            class196 var8 = class196.method1231(class645.field8897, class516.field7274, 0);
            class440.field6182 = arg1.method60(var8, true);
            var8.method1226();
            class618.field8656 = arg1.method60(var8, true);
        }
        field1462++;
        if (class688.field9783 != null && class497.field7033 != null && class440.field6182 != null) {
            int var9 = (arg5 - (class440.field6182.method1895() * 2)) / class688.field9783.method1895();
            for (int var10 = 0; var10 < var9; var10++) {
                class688.field9783.method3929(arg4 + class440.field6182.method1895() + class688.field9783.method1895() * var10, arg2 + (arg0 - class688.field9783.method1893()));
            }
            int var11 = ((arg2 - arg6) - class440.field6182.method1893()) / class497.field7033.method1893();
            for (int var12 = 0; var12 < var11; var12++) {
                class497.field7033.method3929(arg4, arg0 + arg6 + (var12 * class497.field7033.method1893()));
                class105.field1287.method3929(arg4 + arg5 - class105.field1287.method1895(), class497.field7033.method1893() * var12 + arg0 + arg6);
            }
            class440.field6182.method3929(arg4, arg0 + arg2 - class440.field6182.method1893());
            class618.field8656.method3929(arg4 + (arg5 - class440.field6182.method1895()), -class440.field6182.method1893() + arg0 - -arg2);
        }
        if (arg3 != 8207) {
            field1453 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILtn;)V")
    private final void method797(int arg0, int arg1, class179 arg2) {
        int var4 = -47 / ((arg0 - 14) / 37);
        field1455++;
        if (arg1 == 1) {
            this.field1463 = arg2.method1107(false);
        } else if (arg1 == 2) {
            this.field1452 = true;
        } else if (arg1 == 3) {
            this.field1454 = arg2.method1137((byte) -121);
            this.field1461 = arg2.method1137((byte) -95);
            this.field1456 = arg2.method1137((byte) -63);
        } else if (arg1 == 4) {
            this.field1466 = arg2.method1094(255);
            return;
        } else if (arg1 == 5) {
            this.field1460 = arg2.method1107(false);
            return;
        } else if (arg1 == 6) {
            this.field1465 = arg2.method1114(97);
            return;
        }
    }
}
