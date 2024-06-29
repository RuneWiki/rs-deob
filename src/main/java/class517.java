import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class517 extends class218 {

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "B")
    public byte field7612 = 5;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "[[B")
    public static byte[][] field7608 = new byte[1000][];

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field7605;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public int field7606;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field7607;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field7610;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public int field7615;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public int field7616;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "Lvb;")
    public static class134 field7609;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Z")
    public boolean field7611;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "Z")
    public static boolean field7613;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public static void method3067(int arg0) {
        field7608 = null;
        field7609 = null;
        if (arg0 <= 79) {
            field7609 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)S")
    public static final short method3068(byte arg0, int arg1) {
        field7614++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x383) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg0 != -4) {
            field7609 = null;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }
}
