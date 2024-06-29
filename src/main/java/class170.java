import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class170 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lrf;")
    public static class163 field3448 = class53.method392(-128, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[[I")
    public static int[][] field3447 = new int[5][5000];

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lrf;")
    private static class163 field3454 = class53.method392(-108, "Username: ");

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lrf;")
    private static class163 field3458 = class53.method392(-83, "Select a world");

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lrf;")
    public static class163 field3451 = class53.method392(120, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lrf;")
    public static class163 field3455 = class53.method392(127, "null");

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lrf;")
    public static class163 field3453 = field3454;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lrf;")
    public static class163 field3452 = class53.method392(99, " <col=00ff80>");

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lrf;")
    public static class163 field3461 = field3458;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[I")
    public static int[] field3459 = new int[32768];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method530(byte arg0, Component arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
    public abstract int method532(byte arg0);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method531(int arg0, Component arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Le;")
    public static final class41 method1146(int arg0, int arg1) {
        field3449++;
        if (arg1 >= -89) {
            return null;
        }
        class41 var2 = (class41) class135.field2781.method401((long) arg0, (byte) -76);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field752.method1235(arg0, (byte) -64, 8);
        class41 var4 = new class41();
        if (var3 != null) {
            var4.method258(new class52(var3), -26520);
        }
        class135.field2781.method398(var4, (long) arg0, (byte) 92);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field3455 = null;
        field3447 = null;
        field3453 = null;
        field3461 = null;
        if (arg0 != -125) {
            return;
        }
        field3459 = null;
        field3454 = null;
        field3458 = null;
        field3452 = null;
        field3448 = null;
        field3451 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)Luf;")
    public static final class190 method1148(boolean arg0) {
        field3450++;
        if (!arg0) {
            return null;
        }
        try {
            return (class190) Class.forName("dd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class81();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILjava/util/Random;)I")
    public static final int method1149(boolean arg0, int arg1, Random arg2) {
        field3446++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class175.method1189(arg1, (byte) -66)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else if (arg0) {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class130.method861(var4, arg1, 26);
        } else {
            return 115;
        }
    }
}
