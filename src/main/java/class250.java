import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class250 extends class96 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public int field4084 = 0;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Lna;")
    public static class26 field4092 = class69.method505("Shift)2click disabled)3", (byte) -128);

    @OriginalMember(owner = "client!md", name = "V", descriptor = "[[S")
    public static short[][] field4094 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lna;")
    public static class26 field4088 = class69.method505("Fermer", (byte) -125);

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field4095 = -1;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lna;")
    public static class26 field4083 = class69.method505("D-Bmarrage de la librairie 3D", (byte) -124);

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lna;")
    public static class26 field4087 = class69.method505("Fichiers config charg-Bs", (byte) -124);

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Lna;")
    public static class26 field4089 = class69.method505("::mm", (byte) -123);

    @OriginalMember(owner = "client!md", name = "X", descriptor = "Lna;")
    public static class26 field4096 = class69.method505("Impossible de trouver ", (byte) -121);

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4085;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lbe;I)Z", line = 25)
    public static final boolean method1716(class297 arg0, int arg1) {
        field4093++;
        if (arg0.field5084 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 <= 20) {
            field4089 = (class26) null;
        }
        while (var2 < arg0.field5084.length) {
            int var3 = class51.method374((byte) 119, var2, arg0);
            int var4 = arg0.field5119[var2];
            if (arg0.field5084[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field5084[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field5084[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lwa;I)V", line = 87)
    public final void method1717(class82 arg0, int arg1) {
        if (arg1 != 0) {
            field4087 = (class26) null;
        }
        while (true) {
            int var3 = arg0.method642((byte) -97);
            if (var3 == 0) {
                field4086++;
                return;
            }
            this.method1721(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILna;Lna;BLna;)V", line = 108)
    public static final void method1718(int arg0, int arg1, class26 arg2, class26 arg3, byte arg4, class26 arg5) {
        field4097++;
        if (arg4 != 50) {
            field4094 = (short[][]) ((short[][]) null);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class98.field1602[var6] = class98.field1602[var6 - 1];
            class181.field2823[var6] = class181.field2823[var6 - 1];
            class56.field904[var6] = class56.field904[var6 - 1];
            class59.field959[var6] = class59.field959[var6 - 1];
            class86.field1418[var6] = class86.field1418[var6 - 1];
        }
        class245.field4027++;
        class98.field1602[0] = arg1;
        class181.field2823[0] = arg5;
        class284.field4761 = class74.field1144;
        class86.field1418[0] = arg0;
        class56.field904[0] = arg2;
        class59.field959[0] = arg3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JB)Lna;", line = 138)
    public static final class26 method1719(long arg0, byte arg1) {
        if (arg1 <= 85) {
            return (class26) null;
        } else {
            field4090++;
            return class158.method1077(10, false, 116, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 158)
    public static void method1720(int arg0) {
        field4083 = null;
        field4096 = null;
        field4085 = null;
        field4087 = null;
        field4092 = null;
        field4094 = (short[][]) null;
        if (arg0 > 22) {
            field4089 = null;
            field4088 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lwa;IZ)V", line = 192)
    private final void method1721(class82 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1717((class82) null, -89);
        }
        if (arg1 == 2) {
            this.field4084 = arg0.method576(1);
        }
        field4082++;
    }
}
