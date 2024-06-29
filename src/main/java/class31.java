import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class31 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lja;")
    public static class62 field751 = class30.method243(43, "Stufe)2");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public static int[] field753 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field756 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lja;")
    public static class62 field754 = class30.method243(43, "nav");

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lja;")
    public static class62 field759 = class30.method243(43, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lja;")
    private static class62 field755 = class30.method243(43, "Unable to find ");

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lja;")
    public static class62 field760 = field755;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lc;")
    public static class18 field757 = new class18(128);

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lja;")
    public static class62 field763 = class30.method243(43, "(U1");

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lpd;")
    public static class108 field752;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lea;")
    public static class29 field761;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method247(byte arg0) {
        field751 = null;
        field755 = null;
        field760 = null;
        field759 = null;
        field753 = null;
        field761 = null;
        int var1 = 80 / ((-arg0 - 67) / 44);
        field757 = null;
        field752 = null;
        field763 = null;
        field754 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BLu;II)V")
    public static final void method248(byte[] arg0, class141 arg1, int arg2, int arg3) {
        class144 var4 = new class144();
        var4.field3369 = arg1;
        var4.field3367 = arg0;
        int var5 = 54 / ((44 - arg2) / 41);
        var4.field3357 = 0;
        field762++;
        var4.field3493 = arg3;
        class105 var6 = class36.field863;
        synchronized (class36.field863) {
            class36.field863.method847(var4, (byte) 124);
        }
        class18.method125(0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)Lja;")
    public static final class62 method249(boolean arg0, int arg1) {
        if (arg0) {
            field758++;
            return class43.method317(arg1, false, 10, (byte) -68);
        } else {
            return null;
        }
    }
}
