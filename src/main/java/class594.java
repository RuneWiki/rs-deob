import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class594 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "[[B")
    public byte[][] field8424 = new byte[6][258];

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public int field8430 = 0;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public int field8427 = 0;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "[[I")
    public int[][] field8428 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[[I")
    public int[][] field8434 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "[B")
    public byte[] field8445 = new byte[18002];

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "[I")
    public int[] field8429 = new int[6];

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[B")
    public byte[] field8440 = new byte[256];

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "[[I")
    public int[][] field8423 = new int[6][258];

    @OriginalMember(owner = "client!sba", name = "E", descriptor = "[I")
    public int[] field8453 = new int[16];

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[B")
    public byte[] field8432 = new byte[18002];

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "[B")
    public byte[] field8442 = new byte[4096];

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "[Z")
    public boolean[] field8431 = new boolean[16];

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "[I")
    public int[] field8446 = new int[257];

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "[I")
    public int[] field8443 = new int[256];

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "[Z")
    public boolean[] field8455 = new boolean[256];

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "B")
    public byte field8435;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public int field8425;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public int field8433;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public int field8438;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public int field8439;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public int field8441;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public int field8448;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "I")
    public int field8449;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public int field8451;

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "I")
    public int field8454;

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
    public int field8457;

    @OriginalMember(owner = "client!sba", name = "J", descriptor = "I")
    public int field8458;

    @OriginalMember(owner = "client!sba", name = "K", descriptor = "I")
    public int field8459;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "Lpb;")
    public static class366 field8437;

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "[B")
    public byte[] field8444;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "[B")
    public byte[] field8447;

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "[I")
    public static int[] field8452;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static final void method3392(int arg0) {
        field8456++;
        for (int var1 = 0; var1 < class584.field8319.length; var1++) {
            for (int var2 = 0; var2 < class584.field8319[var1].length; var2++) {
                class584.field8319[var1][var2] = class32.field438;
            }
        }
        if (arg0 != 6) {
            method3395(19, (char) 65425);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
    public static void method3393(byte arg0) {
        field8452 = null;
        field8437 = null;
        if (arg0 != 38) {
            field8437 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIC)I")
    public static final int method3394(byte arg0, int arg1, char arg2) {
        field8426++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg0 < 28) {
            field8437 = null;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IC)Z")
    public static final boolean method3395(int arg0, char arg1) {
        field8436++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            int var2 = -74 / ((31 - arg0) / 45);
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }
}
