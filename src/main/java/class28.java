import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class28 {

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
    public int[] field508 = new int[16];

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public int[] field509 = new int[6];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[[I")
    public int[][] field502 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[[B")
    public byte[][] field499 = new byte[6][258];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[B")
    public byte[] field516 = new byte[18002];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[I")
    public int[] field514 = new int[256];

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public int field525 = 0;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[B")
    public byte[] field531 = new byte[18002];

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[[I")
    public int[][] field535 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[Z")
    public boolean[] field511 = new boolean[16];

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[B")
    public byte[] field520 = new byte[4096];

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[B")
    public byte[] field532 = new byte[256];

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public int field529 = 0;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "[[I")
    public int[][] field539 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "[I")
    public int[] field533 = new int[257];

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "[Z")
    public boolean[] field536 = new boolean[256];

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static volatile int field517 = 0;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field513 = 2;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lsg;")
    private static class30 field501 = class167.method1221((byte) 33, "Close");

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lsg;")
    public static class30 field521 = field501;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lsg;")
    private static class30 field504 = class167.method1221((byte) 33, "Connection lost)3");

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Lsg;")
    public static class30 field538 = field504;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lsg;")
    public static class30 field541 = class167.method1221((byte) 33, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "B")
    public byte field505;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[B")
    public byte[] field530;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "[B")
    public byte[] field534;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        if (arg0 != 258) {
            return;
        }
        field538 = null;
        field504 = null;
        field501 = null;
        field521 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lgi;")
    public static final class179 method237(int arg0, int arg1, int arg2) {
        field510++;
        class179 var3 = (class179) class204.field3659.method478(0);
        if (arg0 != 258) {
            method238((class8) null, -23, true);
        }
        while (var3 != null) {
            if (var3.field3324 && var3.method1306(arg2, arg1, 1341)) {
                return var3;
            }
            var3 = (class179) class204.field3659.method476((byte) 13);
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Laa;IZ)Lsg;")
    public static final class30 method238(class8 arg0, int arg1, boolean arg2) {
        field506++;
        try {
            class30 var3 = new class30();
            var3.field576 = arg0.method45(!arg2);
            if (!arg2) {
                field541 = null;
            }
            if (var3.field576 > arg1) {
                var3.field576 = arg1;
            }
            var3.field618 = new byte[var3.field576];
            arg0.field146 += class146.field2807.method906(var3.field576, arg0.field146, var3.field618, 17596, 0, arg0.field124);
            return var3;
        } catch (Exception var4) {
            return class201.field3583;
        }
    }
}
