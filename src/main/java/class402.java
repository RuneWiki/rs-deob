import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class class402 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5588 = 2;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Ljm;")
    public static class485 field5591 = new class485(7, 6);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
    public static final boolean method2330(int arg0, int arg1, int arg2) {
        field5589++;
        int var3 = -25 % ((arg2 + 44) / 46);
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
    public abstract int method1680(int arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1678(int arg0, Component arg1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1679(Component arg0, int arg1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IC)Z")
    public static final boolean method2331(int arg0, char arg1) {
        field5590++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != -31738) {
            method2330(32, 12, -78);
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method2332(boolean arg0) {
        field5591 = null;
        if (arg0) {
            field5588 = 5;
        }
    }
}
