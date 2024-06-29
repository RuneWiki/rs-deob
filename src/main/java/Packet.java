import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "[C")
    private char[] field86 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "[B")
    public byte[] field76;

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "[I")
    private static int[] field78 = new int[256];

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "[I")
    private static final int[] field79;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    private static int field80;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "I")
    private static int field81;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "I")
    private static int field82;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Lk;")
    private static HashTable field83;

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lk;")
    private static HashTable field84;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "Lk;")
    private static HashTable field85;

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "Z")
    public static boolean field87;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "()I")
    public int method44() {
        this.field77 += 4;
        return (this.field76[this.field77 - 1] & 0xFF) + ((this.field76[this.field77 - 2] & 0xFF) << 8) + ((this.field76[this.field77 - 4] & 0xFF) << 24) + ((this.field76[this.field77 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "()I")
    public int method45() {
        return this.field76[this.field77++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "()B")
    public byte method46() {
        return this.field76[this.field77++];
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "()I")
    public int method47() {
        this.field77 += 2;
        return ((this.field76[this.field77 - 2] & 0xFF) << 8) + (this.field76[this.field77 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "()Ljava/lang/String;")
    public String method48() {
        int var1 = this.field77;
        while (this.field76[this.field77++] != 10) {
        }
        return new String(this.field76, var1, this.field77 - var1 - 1);
    }

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "()I")
    public int method49() {
        this.field77 += 3;
        return (this.field76[this.field77 - 1] & 0xFF) + ((this.field76[this.field77 - 3] & 0xFF) << 16) + ((this.field76[this.field77 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "()V")
    private Packet() {
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([B)V")
    public Packet(byte[] arg0) {
        this.field76 = arg0;
        this.field77 = 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field78[var0] = var1;
        }
        field79 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field80 = 0;
        field81 = 0;
        field82 = 0;
        field83 = new HashTable();
        field84 = new HashTable();
        field85 = new HashTable();
    }
}
