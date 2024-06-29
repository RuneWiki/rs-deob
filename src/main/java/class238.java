import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class238 extends class540 {

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field3430;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Ljo;")
    public static class351 field3428 = new class351(49, 2);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lrh;")
    public static class275 field3429 = new class275(12, 0, 1, 0);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "B")
    public static byte field3436 = -6;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "J")
    public static long field3433;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[Lvfa;")
    public static class698[] field3437;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 12)
    public final void method1630(OggPacket arg0, int arg1) {
        if (arg1 != 73) {
            this.method2(50, null);
        }
        this.method2(0, arg0);
        field3435++;
        this.field3438++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 30)
    public static void method1631(byte arg0) {
        field3429 = null;
        field3428 = null;
        field3437 = null;
        if (arg0 != 126) {
            method1631((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 52)
    public static final void method1632(int arg0) {
        if (arg0 != 22961) {
            field3436 = 57;
        }
        field3439++;
        if (!class367.field5288) {
            class452.field6508 = true;
            class318.field4733 += (24.0F - class318.field4733) / 2.0F;
            class367.field5288 = true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 67)
    public class238(OggStreamState arg0) {
        this.field3430 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(CIB)C", line = 75)
    public static final char method1633(char arg0, int arg1, byte arg2) {
        if (arg2 != -16) {
            return (char) 65497;
        }
        field3431++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public abstract void method10(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public abstract void method2(int arg0, OggPacket arg1);
}
