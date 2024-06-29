import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class259 {

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3833 = 0;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[Lor;")
    public static class383[] field3830 = new class383[50];

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Lfn;")
    public static class73 field3834;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BJ)V")
    public static final void method1790(byte arg0, long arg1) {
        field3829++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class384.method2442(-128, arg1 - 1L);
            class384.method2442(-99, 1L);
        } else {
            class384.method2442(-66, arg1);
        }
        if (arg0 >= -69) {
            method1792(45, 65, 20);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field3834 = null;
        if (arg0 != -17947) {
            field3830 = null;
        }
        field3830 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
    public static final void method1792(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        if (var3 != null && var3.field969 != null) {
            var3.field969 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1793(byte arg0, String arg1) throws ClassNotFoundException {
        field3831++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg0 != 27) {
            return null;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBIII)V")
    public static final void method1794(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3832++;
        class276 var5 = class264.method1816((byte) -113, arg4, 10);
        var5.method1876((byte) -127);
        var5.field3986 = arg2;
        int var6 = 9 % ((arg1 - 36) / 40);
        var5.field3984 = arg3;
        var5.field3985 = arg0;
    }

    static {
        new class349("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field3834 = new class73();
    }
}
