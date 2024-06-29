import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class67 extends class271 {

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
    public static int[] field984 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lbo;")
    public static class453 field982 = new class453(32);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method571(byte arg0) {
        field986++;
        if (arg0 != -6) {
            field984 = null;
        }
        int var1 = class422.method2654((byte) 79);
        if (var1 == 0) {
            class158.field1996 = null;
            class283.method1938(0, -5);
        } else if (var1 == 1) {
            class264.method1772((byte) 0, (byte) -127);
            class283.method1938(512, arg0 + 1);
            if (class406.field5912 != null) {
                class239.method1552(512);
            }
        } else {
            class264.method1772((byte) (class394.field5731 - 4 & 0xFF), (byte) -121);
            class283.method1938(2, -5);
        }
        class244.field3419 = class268.field3973;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method572(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field985++;
        System.exit(1);
        if (arg0 != 6270) {
            field982 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method573(int arg0) {
        if (arg0 != 32) {
            method571((byte) -22);
        }
        field984 = null;
        field982 = null;
    }
}
