import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class344 {

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "J")
    public static long field4711 = 0L;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Lmq;")
    public static class104 field4712;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Luq;")
    public static class115 field4707;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Z")
    public static boolean field4708;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
    public abstract int method826(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Lpo;")
    public abstract class126 method837(byte arg0);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)V")
    public abstract void method836(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static final void method2057(int arg0) {
        field4709++;
        class103 var1 = (class103) class230.field3244.method1544(-123);
        int var2 = 48 % ((-arg0 - 37) / 62);
        while (var1 != null) {
            if (var1.field1466 > 0) {
                var1.field1466--;
            }
            if (var1.field1466 != 0) {
                if (var1.field1459 > 0) {
                    var1.field1459--;
                }
                if (var1.field1459 == 0 && var1.field1465 >= 1 && var1.field1470 >= 1 && var1.field1465 <= (class200.field2875 - 2) && (class422.field5811 - 2) >= var1.field1470 && (var1.field1468 < 0 || class254.method1576(var1.field1468, var1.field1476, -12))) {
                    class347.method2070(var1.field1465, var1.field1472, var1.field1476, var1.field1468, var1.field1460, (byte) 91, var1.field1470, -1, var1.field1471);
                    var1.field1459 = -1;
                    if (var1.field1468 == var1.field1463 && var1.field1463 == -1) {
                        var1.method1182(28818);
                    } else if (var1.field1468 == var1.field1463 && var1.field1475 == var1.field1460 && var1.field1476 == var1.field1474) {
                        var1.method1182(28818);
                    }
                }
            } else if (var1.field1463 < 0 || class254.method1576(var1.field1463, var1.field1474, -12)) {
                class347.method2070(var1.field1465, var1.field1472, var1.field1474, var1.field1463, var1.field1475, (byte) 96, var1.field1470, -1, var1.field1471);
                var1.method1182(28818);
            }
            var1 = (class103) class230.field3244.method1546((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V")
    public static void method2058(byte arg0) {
        int var1 = 96 / ((65 - arg0) / 56);
        field4712 = null;
        field4707 = null;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)[B")
    public abstract byte[] method832(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)I")
    public static final int method2059(int arg0) {
        if (arg0 != -22511) {
            method2059(-106);
        }
        field4710++;
        return class478.field6757;
    }

    static {
        new class112("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field4712 = new class104(4);
    }
}
