import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class16 {

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Lje;")
    private static class67 field1613 = class85.method592(255, "Cancel");

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Lje;")
    public static class67 field1616 = class85.method592(255, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "Z")
    public static boolean field1620 = false;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static volatile int field1623 = 0;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "Lje;")
    public static class67 field1626 = field1613;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "[I")
    public static int[] field1625 = new int[100];

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lua;")
    public static class140 field1615;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lfd;")
    public static class40 field1627;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lge;")
    public class47 field1610;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Lnd;")
    public class94 field1603;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "Lnd;")
    public class94 field1619;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "Ljava/awt/Font;")
    public static Font field1617;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "[I")
    public int[] field1611;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static void method536(int arg0) {
        field1626 = null;
        if (arg0 >= -86) {
            field1623 = 67;
        }
        field1615 = null;
        field1616 = null;
        field1627 = null;
        field1625 = null;
        field1617 = null;
        field1613 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method537(Component arg0, int arg1) {
        arg0.removeKeyListener(class64.field1263);
        if (arg1 == 0) {
            arg0.removeFocusListener(class64.field1263);
            class83.field1838 = -1;
            field1599++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lmc;")
    public static final class86 method538(int arg0, int arg1) {
        field1607++;
        class86 var2 = (class86) class41.field771.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        }
        class86 var3 = class79.method557(arg0, false, class95.field2141, class135.field3063, -6926);
        if (arg1 == 21600) {
            if (var3 != null) {
                class41.field771.method765((long) arg0, var3, (byte) -82);
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final void method539(int arg0) {
        field1600++;
        int var2 = 111 % ((53 - arg0) / 42);
        int var3 = this.field1621;
        class47 var4 = this.field1610.method305(false);
        if (var4 == null) {
            this.field1624 = 0;
            this.field1622 = 0;
            this.field1611 = null;
            this.field1621 = -1;
            this.field1609 = 0;
        } else {
            this.field1609 = var4.field927;
            this.field1611 = var4.field928;
            this.field1621 = var4.field888;
            this.field1622 = var4.field916;
            this.field1624 = var4.field935 * 128;
        }
        if (this.field1621 != var3 && this.field1619 != null) {
            class95.field2132.method553(this.field1619);
            this.field1619 = null;
        }
    }
}
