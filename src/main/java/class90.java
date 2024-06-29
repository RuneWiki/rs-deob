import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class class90 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Lem;")
    public static class206 field1291 = new class206(27, 6);

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "[J")
    public static long[] field1292 = new long[32];

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "F")
    public static float field1295;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)Z")
    public abstract boolean method34(int arg0, int arg1);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public abstract void method37(int arg0);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public abstract void method46(byte arg0);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method656(int[] arg0, byte arg1) {
        field1294++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class130.field1864;
        int var4 = 0;
        if (arg1 != -101) {
            field1291 = null;
        }
        while (arg0.length > var4) {
            class430 var5 = class202.field2859.method78(arg0[var4], 35);
            if (var5.field6003 != -1) {
                class702 var6 = (class702) class260.field3537.method3747((byte) -66, (long) var5.field6003);
                if (var6 == null) {
                    class168 var7 = class168.method1193(class508.field6961, var5.field6003, 0);
                    if (var7 != null) {
                        var6 = class334.field4506.method146(var7, true);
                        class260.field3537.method3748((long) var5.field6003, var6, 12537);
                    }
                }
                if (var6 != null) {
                    class66.field862[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method657(boolean arg0) {
        if (!arg0) {
            method656(null, (byte) -5);
        }
        field1292 = null;
        field1291 = null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)Ljo;")
    public abstract class305 method44(byte arg0);

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V")
    public static final void method658(int arg0, int arg1) {
        field1290++;
        int var2 = class186.field2697 - class124.field1786;
        if (var2 >= 100) {
            class560.field7547 = -1;
            class199.field2832 = -1;
            class203.field2863 = 1;
            return;
        }
        int var3 = (int) class228.field3168;
        if ((class604.field8405 >> 8) > var3) {
            var3 = class604.field8405 >> 8;
        }
        if (class524.field7115[4] && (class100.field1406[4] + 128) > var3) {
            var3 = class100.field1406[4] + 128;
        }
        int var4 = (int) class705.field9964 + class568.field8077 & 0x3FFF;
        class111.method805(78, (var3 >> 3) * 3 + 600 << 2, var4, class249.method1533(class367.field4944, class143.field2063.field4047, class143.field2063.field4042, 61) - 200, class10.field93, arg1, var3, class476.field6552);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class666.field9335 = (int) ((float) (class666.field9335 - class91.field1311) * var5 + (float) class91.field1311);
        class11.field114 = (int) ((float) (class11.field114 - class622.field8636) * var5 + (float) class622.field8636);
        class441.field6102 = (int) ((float) (class441.field6102 - class444.field6145) * var5 + (float) class444.field6145);
        class685.field9771 = (int) ((float) (class685.field9771 - class59.field665) * var5 + (float) class59.field665);
        int var6 = class41.field475 - class567.field7998;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        if (arg0 != 16384) {
            field1293 = 46;
        }
        class41.field475 = (int) ((float) var6 * var5 + (float) class567.field7998);
        class41.field475 &= 0x3FFF;
    }
}
