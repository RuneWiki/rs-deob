import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class409 {

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "Lin;")
    public static class380 field5611 = new class380(19, -2);

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "Lm;")
    public static class554 field5612;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ICI)I", line = 10)
    public static final int method2410(int arg0, char arg1, int arg2) {
        field5609++;
        int var3 = 112 % ((-arg2 - 83) / 37);
        int var4 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var5 = Character.toLowerCase(arg1);
            var4 = (var5 << 4) + 1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 28)
    public static void method2411(int arg0) {
        if (arg0 != -1) {
            method2410(124, 'I', 28);
        }
        field5612 = null;
        field5611 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBILjava/awt/Canvas;)Lag;", line = 40)
    public static final class460 method2412(int arg0, byte arg1, int arg2, Canvas arg3) {
        field5607++;
        try {
            if (arg1 != -1) {
                field5611 = null;
            }
            Class var4 = Class.forName("f");
            class460 var5 = (class460) var4.getDeclaredConstructor().newInstance();
            var5.method636(arg2, arg0, arg3, (byte) -121);
            return var5;
        } catch (Throwable var7) {
            class63 var6 = new class63();
            var6.method636(arg2, arg0, arg3, (byte) -124);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)Ldw;", line = 68)
    public static final class589 method2413(int arg0) {
        field5610++;
        return arg0 == 849519460 ? class435.method2598((byte) -118, 1) : null;
    }
}
