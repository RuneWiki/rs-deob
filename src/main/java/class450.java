import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class450 extends class331 {

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "Lhp;")
    public class178 field6448;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "[I")
    public static int[] field6449 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "Lrr;")
    public static class202 field6450;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "Ltq;")
    public static class376 field6445;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I")
    public static final int method2787(int arg0, int arg1, int arg2, int arg3) {
        field6444++;
        int var4 = arg3 & 0x3;
        if (arg2 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public static final void method2788(byte arg0) {
        field6447++;
        if (arg0 < 117) {
            field6449 = null;
        }
        class55.field665 = null;
        class268.method1784(-1, class105.field1259, class330.field4671, 0, class248.field3548, 0, 0, (byte) 103, 0);
        if (class55.field665 != null) {
            class355.method2267(-1412584499, class285.field4004, (byte) 94, class55.field665, class276.field3921.field2542, class330.field4671, 0, class268.field3808, 0, class105.field1259);
            class55.field665 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    public static final void method2789(int arg0) {
        class237 var1 = class334.field4723;
        synchronized (class334.field4723) {
            class334.field4723.method1626((byte) 106);
        }
        if (arg0 == -10941) {
            field6451++;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lhp;)V")
    public class450(class178 arg0) {
        this.field6448 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BC)C")
    public static final char method2790(byte arg0, char arg1) {
        if (arg0 != 80) {
            method2789(127);
        }
        field6446++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public static void method2791(int arg0) {
        if (arg0 != -26279) {
            method2789(-105);
        }
        field6449 = null;
        field6450 = null;
        field6445 = null;
    }

    static {
        new class362("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
