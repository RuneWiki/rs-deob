import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field689 = 4;

    @OriginalMember(owner = "lb", name = "k", descriptor = "Z")
    private boolean field690 = true;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field691 = 4;

    @OriginalMember(owner = "lb", name = "m", descriptor = "Z")
    private boolean field692 = false;

    @OriginalMember(owner = "lb", name = "n", descriptor = "B")
    private byte field693 = -27;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field694 = -883;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field695 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "B")
    private byte field696 = 5;

    @OriginalMember(owner = "lb", name = "r", descriptor = "I")
    private int field697 = -36;

    @OriginalMember(owner = "lb", name = "s", descriptor = "I")
    private int field698 = 4;

    @OriginalMember(owner = "lb", name = "u", descriptor = "Z")
    private boolean field700 = true;

    @OriginalMember(owner = "lb", name = "H", descriptor = "[C")
    private char[] field713 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "lb", name = "v", descriptor = "[B")
    public byte[] field701;

    @OriginalMember(owner = "lb", name = "i", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "lb", name = "w", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "lb", name = "y", descriptor = "[I")
    private static int[] field704 = new int[256];

    @OriginalMember(owner = "lb", name = "z", descriptor = "[I")
    private static final int[] field705;

    @OriginalMember(owner = "lb", name = "E", descriptor = "Lob;")
    private static LinkList field710;

    @OriginalMember(owner = "lb", name = "F", descriptor = "Lob;")
    private static LinkList field711;

    @OriginalMember(owner = "lb", name = "G", descriptor = "Lob;")
    private static LinkList field712;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "lb", name = "B", descriptor = "I")
    private static int field707;

    @OriginalMember(owner = "lb", name = "C", descriptor = "I")
    private static int field708;

    @OriginalMember(owner = "lb", name = "D", descriptor = "I")
    private static int field709;

    @OriginalMember(owner = "lb", name = "I", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "lb", name = "A", descriptor = "Lwb;")
    public Isaac field706;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IB)Llb;")
    public static Packet method212(int arg0, byte arg1) {
        LinkList var2 = field711;
        synchronized (field711) {
            Packet var3 = null;
            if (arg0 == 0 && field707 > 0) {
                field707--;
                var3 = (Packet) field710.method242();
            } else if (arg0 == 1 && field708 > 0) {
                field708--;
                var3 = (Packet) field711.method242();
            } else if (arg0 == 2 && field709 > 0) {
                field709--;
                var3 = (Packet) field712.method242();
            }
            if (var3 != null) {
                var3.field702 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(-12346);
        var5.field702 = 0;
        if (arg1 != 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 == 0) {
            var5.field701 = new byte[100];
        } else if (arg0 == 1) {
            var5.field701 = new byte[5000];
        } else {
            var5.field701 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != -12346) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(B[B)V")
    public Packet(byte arg0, byte[] arg1) {
        this.field701 = arg1;
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field688 = 146;
        }
        this.field702 = 0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IB)V")
    public void method213(int arg0, byte arg1) {
        this.field701[this.field702++] = (byte) (arg0 + this.field706.method290());
        if (arg1 != 48) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method214(int arg0) {
        this.field701[this.field702++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method215(int arg0) {
        this.field701[this.field702++] = (byte) (arg0 >> 8);
        this.field701[this.field702++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)V")
    public void method216(int arg0, int arg1) {
        this.field701[this.field702++] = (byte) arg1;
        this.field701[this.field702++] = (byte) (arg1 >> 8);
        if (arg0 == 39096) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method217(int arg0) {
        this.field701[this.field702++] = (byte) (arg0 >> 16);
        this.field701[this.field702++] = (byte) (arg0 >> 8);
        this.field701[this.field702++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field701[this.field702++] = (byte) (arg0 >> 24);
        this.field701[this.field702++] = (byte) (arg0 >> 16);
        this.field701[this.field702++] = (byte) (arg0 >> 8);
        this.field701[this.field702++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(IB)V")
    public void method219(int arg0, byte arg1) {
        this.field701[this.field702++] = (byte) arg0;
        this.field701[this.field702++] = (byte) (arg0 >> 8);
        this.field701[this.field702++] = (byte) (arg0 >> 16);
        if (arg1 != 117) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field701[this.field702++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JZ)V")
    public void method220(long arg0, boolean arg1) {
        this.field701[this.field702++] = (byte) (arg0 >> 56);
        this.field701[this.field702++] = (byte) (arg0 >> 48);
        this.field701[this.field702++] = (byte) (arg0 >> 40);
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field701[this.field702++] = (byte) (arg0 >> 32);
        this.field701[this.field702++] = (byte) (arg0 >> 24);
        this.field701[this.field702++] = (byte) (arg0 >> 16);
        this.field701[this.field702++] = (byte) (arg0 >> 8);
        this.field701[this.field702++] = (byte) arg0;
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method221(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field701, this.field702);
        this.field702 += arg0.length();
        this.field701[this.field702++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BII)V")
    public void method222(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            this.field700 = !this.field700;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            this.field701[this.field702++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method223(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field688 = 290;
        }
        this.field701[this.field702 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method224() {
        return this.field701[this.field702++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method225() {
        return this.field701[this.field702++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method226() {
        this.field702 += 2;
        return ((this.field701[this.field702 - 2] & 0xFF) << 8) + (this.field701[this.field702 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method227() {
        this.field702 += 2;
        int var1 = ((this.field701[this.field702 - 2] & 0xFF) << 8) + (this.field701[this.field702 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method228() {
        this.field702 += 3;
        return (this.field701[this.field702 - 1] & 0xFF) + ((this.field701[this.field702 - 3] & 0xFF) << 16) + ((this.field701[this.field702 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method229() {
        this.field702 += 4;
        return (this.field701[this.field702 - 1] & 0xFF) + ((this.field701[this.field702 - 2] & 0xFF) << 8) + ((this.field701[this.field702 - 4] & 0xFF) << 24) + ((this.field701[this.field702 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)J")
    public long method230(int arg0) {
        long var2 = (long) this.method229() & 0xFFFFFFFFL;
        if (arg0 <= 0) {
            this.field698 = 359;
        }
        long var4 = (long) this.method229() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method231() {
        int var1 = this.field702;
        while (this.field701[this.field702++] != 10) {
        }
        return new String(this.field701, var1, this.field702 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)[B")
    public byte[] method232(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var2 = this.field702;
        while (this.field701[this.field702++] != 10) {
        }
        byte[] var3 = new byte[this.field702 - var2 - 1];
        for (int var4 = var2; var4 < this.field702 - 1; var4++) {
            var3[var4 - var2] = this.field701[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(III[B)V")
    public void method233(int arg0, int arg1, int arg2, byte[] arg3) {
        if (this.field689 != arg0) {
            this.field698 = 23;
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            arg3[var5] = this.field701[this.field702++];
        }
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "(I)V")
    public void method234(int arg0) {
        this.field703 = this.field702 * 8;
        if (arg0 <= 0) {
            this.field699 = -81;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)I")
    public int method235(int arg0, int arg1) {
        int var3 = this.field703 >> 3;
        int var4 = 8 - (this.field703 & 0x7);
        int var5 = 0;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field703 += arg1;
        while (arg1 > var4) {
            var5 += (this.field701[var3++] & field705[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field701[var3] & field705[var4]) + var5;
        } else {
            var7 = (this.field701[var3] >> var4 - arg1 & field705[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "(I)V")
    public void method236(int arg0) {
        if (arg0 < 0) {
            this.field702 = (this.field703 + 7) / 8;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method237() {
        int var1 = this.field701[this.field702] & 0xFF;
        return var1 < 128 ? this.method224() - 64 : this.method226() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method238() {
        int var1 = this.field701[this.field702] & 0xFF;
        return var1 < 128 ? this.method224() : this.method226() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method239(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field702;
        this.field702 = 0;
        byte[] var5 = new byte[var4];
        this.method233(4, var4, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        if (this.field691 == arg0) {
            this.field702 = 0;
            this.method214(var8.length);
            this.method222(8, var8, 0, var8.length);
        }
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
            field704[var0] = var1;
        }
        field705 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field710 = new LinkList((byte) 5);
        field711 = new LinkList((byte) 5);
        field712 = new LinkList((byte) 5);
    }
}
