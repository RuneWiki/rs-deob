import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
    public static int[] field386;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field390;

    static {
        new class335("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field386 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field385++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 24)
    public static void method213(byte arg0) {
        int var1 = -24 % ((-arg0 - 51) / 61);
        field386 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)I", line = 34)
    public static final int method214(byte arg0, int arg1, int arg2) {
        if (arg0 != -110) {
            return 67;
        }
        field383++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIII)V", line = 58)
    public class27(int arg0, int arg1, int arg2, int arg3) {
        this.field389 = arg0;
        this.field387 = arg1;
        this.field382 = arg2;
        this.field388 = arg3;
    }
}
