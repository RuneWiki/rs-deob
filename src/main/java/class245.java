import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class245 extends class345 {

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Laa;")
    public static class76 field3387 = new class76(35, -1);

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Ldp;")
    public static class347 field3394 = new class347("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "Ljo;")
    public static class382 field3396 = new class382(64);

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "S")
    public static short field3397 = 256;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "Luv;")
    public static class2 field3398 = new class2(98, 16);

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Lkh;")
    public class400 field3392;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Lqn;")
    public static class436 field3399;

    static {
        new class347("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 3)
    public static void method1488(int arg0) {
        field3398 = null;
        field3387 = null;
        field3394 = null;
        field3399 = null;
        if (arg0 == 64) {
            field3396 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Llh;", line = 22)
    public static final class100 method1489(boolean arg0) {
        field3391++;
        try {
            if (arg0) {
                field3397 = 93;
            }
            return (class100) Class.forName("uq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)C", line = 40)
    public static final char method1490(byte arg0, int arg1) {
        field3390++;
        int var2 = arg0 & 0xFF;
        if (~var2 == arg1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class269.field4005[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
