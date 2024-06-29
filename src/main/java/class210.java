import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class210 {

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "S")
    public static short field3598 = 256;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lsb;")
    private static class98 field3602 = class47.method368("Use", 0);

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lsb;")
    public static class98 field3603 = field3602;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Ltg;")
    public static class75 field3597;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLtg;)V")
    public static final void method1411(byte arg0, class75 arg1) {
        field3599++;
        class189.field3268 = arg1;
        int var2 = 50 % ((2 - arg0) / 55);
        class158.field2881 = class189.field3268.method550(-1757152080, 4);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3602 = null;
        if (arg0 != 0) {
            field3601 = -43;
        }
        field3603 = null;
        field3597 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method1413(int arg0, int arg1) {
        class71 var2 = class31.field553[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class71 var4 = class31.field553[var3][arg0][arg1] = class31.field553[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1151--;
                for (int var5 = 0; var5 < var4.field1149; var5++) {
                    class14 var6 = var4.field1140[var5];
                    if ((var6.field260 >> 29 & 0x3L) == 2L && var6.field268 == arg0 && var6.field256 == arg1) {
                        var6.field254--;
                    }
                }
            }
        }
        if (class31.field553[0][arg0][arg1] == null) {
            class31.field553[0][arg0][arg1] = new class71(0, arg0, arg1);
        }
        class31.field553[0][arg0][arg1].field1161 = var2;
        class31.field553[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Lak;")
    public static final class120 method1414(int arg0, byte arg1) {
        field3600++;
        class120 var2 = (class120) class207.field3546.method1564((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 111) {
            method1412(-25);
        }
        byte[] var3 = class220.field3801.method571(class173.method1220(arg0, (byte) -96), class119.method884(arg0, (byte) -74), -125);
        class120 var4 = new class120();
        var4.field2151 = arg0;
        if (var3 != null) {
            var4.method901(new class216(var3), (byte) 110);
        }
        var4.method897(113);
        class207.field3546.method1563((long) arg0, 21771, var4);
        return var4;
    }
}
