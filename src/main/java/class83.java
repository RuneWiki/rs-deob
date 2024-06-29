import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class83 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lcga;")
    public static class449 field1065 = new class449(77, 7);

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lrr;")
    public static class337 field1066 = null;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static final void method632(int arg0) {
        class536.field6745++;
        field1064++;
        class124 var1 = class336.method1924(class549.field6890, class636.field8620, (byte) -116);
        var1.field1516.method3090(0, 3);
        int var2 = -113 % ((-arg0 - 2) / 59);
        class197.method1156((byte) 98, var1);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvo;")
    public static final class39 method633(Throwable arg0, String arg1) {
        field1062++;
        class39 var2;
        if (arg0 instanceof class39) {
            var2 = (class39) arg0;
            var2.field574 = var2.field574 + ' ' + arg1;
        } else {
            var2 = new class39(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZZII)I")
    public static final int method634(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1063++;
        class36 var5 = class354.method2029(arg4, Integer.MIN_VALUE, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field541.length; var7++) {
            if (var5.field541[var7] >= 0 && var5.field541[var7] < class504.field6287.field3445) {
                class68 var8 = class504.field6287.method1628(var5.field541[var7], (byte) -114);
                int var9 = var8.method534(class46.field617.method1403(arg0, arg3 ^ 0x47).field4635, arg3 + 12638, arg0);
                if (arg1) {
                    var6 += var5.field536[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg3 != 7) {
            method632(-17);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1066 = null;
        if (arg0 != 7) {
            method632(-83);
        }
        field1065 = null;
    }
}
