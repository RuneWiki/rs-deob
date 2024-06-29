import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "[C")
    private char[] field96 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "[B")
    public byte[] field86;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "[I")
    private static int[] field88 = new int[256];

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "[I")
    private static final int[] field89;

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "I")
    private static int field90;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "I")
    private static int field91;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "I")
    private static int field92;

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "Ll;")
    private static HashTable field93;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "Ll;")
    private static HashTable field94;

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Ll;")
    private static HashTable field95;

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "Z")
    public static boolean field97;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "()I")
    public int method54() {
        this.field87 += 4;
        return (this.field86[this.field87 - 1] & 0xFF) + ((this.field86[this.field87 - 2] & 0xFF) << 8) + ((this.field86[this.field87 - 4] & 0xFF) << 24) + ((this.field86[this.field87 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "()I")
    public int method55() {
        return this.field86[this.field87++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "()B")
    public byte method56() {
        return this.field86[this.field87++];
    }

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "()I")
    public int method57() {
        this.field87 += 2;
        return ((this.field86[this.field87 - 2] & 0xFF) << 8) + (this.field86[this.field87 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V")
    public void method58(int arg0) {
        this.field86[this.field87++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "()Ljava/lang/String;")
    public String method59() {
        int var1 = this.field87;
        while (this.field86[this.field87++] != 10) {
        }
        return new String(this.field86, var1, this.field87 - var1 - 1);
    }

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "()I")
    public int method60() {
        this.field87 += 3;
        return (this.field86[this.field87 - 1] & 0xFF) + ((this.field86[this.field87 - 3] & 0xFF) << 16) + ((this.field86[this.field87 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)Lk;")
    public static Packet method61(int arg0) {
        HashTable var1 = field94;
        synchronized (field94) {
            Packet var2 = null;
            if (arg0 == 0 && field90 > 0) {
                field90 += -1;
                var2 = (Packet) field93.method63();
            } else if (arg0 == 1 && field91 > 0) {
                field91 += -1;
                var2 = (Packet) field94.method63();
            } else if (arg0 == 2 && field92 > 0) {
                field92 += -1;
                var2 = (Packet) field95.method63();
            }
            if (var2 != null) {
                var2.field87 = 0;
                return var2;
            }
        }
        Packet var4 = new Packet();
        var4.field87 = 0;
        if (arg0 == 0) {
            var4.field86 = new byte[100];
        } else if (arg0 == 1) {
            var4.field86 = new byte[5000];
        } else {
            var4.field86 = new byte[30000];
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "()V")
    private Packet() {
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([B)V")
    public Packet(byte[] arg0) {
        this.field86 = arg0;
        this.field87 = 0;
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
            field88[var0] = var1;
        }
        field89 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field90 = 0;
        field91 = 0;
        field92 = 0;
        field93 = new HashTable();
        field94 = new HashTable();
        field95 = new HashTable();
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)V")
    public void method62(int arg0) {
        this.field86[this.field87++] = (byte) (arg0 >> 16);
        this.field86[this.field87++] = (byte) (arg0 >> 8);
        this.field86[this.field87++] = (byte) arg0;
    }
}
