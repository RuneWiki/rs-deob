import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class150 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lbi;")
    public static class104 field2012 = new class104(34, -1);

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "[J")
    public static long[] field2013;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Z")
    public static boolean field2014;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method916(byte arg0) {
        field2012 = null;
        if (arg0 < 46) {
            method917(119, -13, 84, 31);
        }
        field2013 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)I")
    public static final int method917(int arg0, int arg1, int arg2, int arg3) {
        field2015++;
        if ((class416.field6309[arg3][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class416.field6309[1][arg0][arg1] & 0x2) == 0) {
            int var4 = -38 % ((arg2 + 12) / 52);
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    static {
        new class213("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field2013 = new long[256];
        field2014 = false;
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2013[var0] = var1;
        }
    }
}
