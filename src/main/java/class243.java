import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public abstract class class243 {

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public int field3607;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "Lst;")
    public static class335 field3611 = new class335(72, 4);

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "[C")
    private static char[] field3613 = new char[64];

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "F")
    public static float field3616;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Lih;")
    public static class744 field3618;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3613[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3613[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3613[var2] = (char) (var2 + 48 - 52);
        }
        field3613[63] = '/';
        field3613[62] = '+';
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZIIIIII)V", line = 5)
    public static final void method1632(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3608++;
        if (arg2 > -23) {
            field3616 = 1.1105859F;
        }
        class395.field5684 = arg6;
        class518.field7232 = arg4;
        class490.field6891 = arg5;
        class610.field8214 = arg1;
        class671.field9272 = arg3;
        if (arg0 && class490.field6891 >= 100) {
            class123.field1680 = class518.field7232 * 512 + 256;
            class671.field9282 = class395.field5684 * 512 + 256;
            class206.field2702 = class737.method4102((byte) 19, class671.field9282, class123.field1680, class96.field1331) - class671.field9272;
        }
        class720.field10023 = 2;
        class221.field2987 = -1;
        class388.field5597 = -1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBI)V", line = 46)
    public static final void method1633(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3612++;
        int var5 = -80 / ((arg3 - 23) / 36);
        float var6 = (float) class461.field6413 / (float) class461.field6404;
        int var7 = arg2;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = arg1 - (arg4 - var8) / 2;
        int var10 = arg0 - (arg2 - var7) / 2;
        class329.field4660 = -1;
        class718.field10001 = class461.field6413 - class461.field6413 * var9 / var8;
        class609.field8207 = -1;
        class513.field7087 = class461.field6404 * var10 / var7;
        class558.method3284(-1);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 73)
    public static void method1634(byte arg0) {
        field3611 = null;
        if (arg0 <= -100) {
            field3618 = null;
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 85)
    public static final boolean method1635(byte arg0, String arg1) {
        if (arg0 >= -93) {
            return false;
        } else {
            field3609++;
            return class380.field5454.containsKey(arg1);
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(III)V", line = 98)
    public class243(int arg0, int arg1, int arg2) {
        this.field3614 = arg0;
        this.field3607 = arg2;
        this.field3610 = arg1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
    public abstract void method87(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
    public abstract void method90(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(III)V")
    public abstract void method92(int arg0, int arg1, int arg2);
}
