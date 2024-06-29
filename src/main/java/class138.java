import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class138 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lhq;")
    public static class365 field1573 = new class365(64);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1578 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lts;")
    public static class33 field1577;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method889(byte arg0) {
        if (arg0 < -14) {
            field1573 = null;
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILbg;)V")
    public final void method890(byte arg0, int arg1, class242 arg2) {
        field1572++;
        while (true) {
            int var4 = arg2.method1563(-128);
            if (var4 == 0) {
                if (arg0 == 90) {
                    return;
                } else {
                    this.method890((byte) -121, -39, (class242) null);
                    return;
                }
            }
            this.method891(arg2, var4, arg1, arg0 ^ 0x5B);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbg;III)V")
    private final void method891(class242 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == arg3) {
            this.field1570 = arg0.method1587((byte) -102);
        } else if (arg1 == 2) {
            this.field1576 = arg0.method1563(-128);
            this.field1575 = arg0.method1563(-128);
        }
        field1571++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Liq;")
    public final class132 method892(int arg0) {
        field1569++;
        if (arg0 != -15825) {
            method889((byte) 3);
        }
        class132 var2 = (class132) class325.field4342.method2295((long) this.field1570, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        class132 var3 = class132.method849(class310.field4196, this.field1570, 0);
        if (var3 != null) {
            class325.field4342.method2294(var3, (byte) 125, (long) this.field1570);
        }
        return var3;
    }
}
