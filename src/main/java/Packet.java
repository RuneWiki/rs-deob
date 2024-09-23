import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "j", descriptor = "B")
    private byte field699 = 95;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field700 = -731;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field701 = 1623;

    @OriginalMember(owner = "lb", name = "m", descriptor = "I")
    private int field702 = 772;

    @OriginalMember(owner = "lb", name = "n", descriptor = "Z")
    private boolean field703 = false;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field704 = -139;

    @OriginalMember(owner = "lb", name = "p", descriptor = "I")
    private int field705 = 1;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Z")
    private boolean field707 = false;

    @OriginalMember(owner = "lb", name = "t", descriptor = "[B")
    public byte[] field709;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "lb", name = "s", descriptor = "I")
    private static int field708 = 8;

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static int[] field712 = new int[256];

    @OriginalMember(owner = "lb", name = "x", descriptor = "[I")
    private static final int[] field713;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field718;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field719;

    @OriginalMember(owner = "lb", name = "E", descriptor = "Lob;")
    private static LinkList field720;

    @OriginalMember(owner = "lb", name = "F", descriptor = "[C")
    private static char[] field721;

    @OriginalMember(owner = "lb", name = "i", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "lb", name = "v", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field715;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field716;

    @OriginalMember(owner = "lb", name = "B", descriptor = "I")
    private static int field717;

    @OriginalMember(owner = "lb", name = "G", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "lb", name = "y", descriptor = "Lwb;")
    public Isaac field714;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method215(int arg0, int arg1) {
        LinkList var2 = field719;
        synchronized (field719) {
            Packet var3 = null;
            if (arg1 == 0 && field715 > 0) {
                field715--;
                var3 = (Packet) field718.method245();
            } else if (arg1 == 1 && field716 > 0) {
                field716--;
                var3 = (Packet) field719.method245();
            } else if (arg1 == 2 && field717 > 0) {
                field717--;
                var3 = (Packet) field720.method245();
            }
            if (var3 != null) {
                var3.field710 = 0;
                return var3;
            }
        }
        if (arg0 >= 0) {
            field708 = -400;
        }
        Packet var5 = new Packet((byte) 8);
        var5.field710 = 0;
        if (arg1 == 0) {
            var5.field709 = new byte[100];
        } else if (arg1 == 1) {
            var5.field709 = new byte[5000];
        } else {
            var5.field709 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field704 = 133;
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field709 = arg0;
        if (arg1 != 15787) {
            throw new NullPointerException();
        }
        this.field710 = 0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method216(int arg0, int arg1) {
        this.field709[this.field710++] = (byte) (arg1 + this.field714.method293());
        if (arg0 == -34003) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method217(int arg0) {
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ)V")
    public void method219(int arg0, boolean arg1) {
        this.field709[this.field710++] = (byte) arg0;
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method221(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 24);
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method222(int arg0, int arg1) {
        this.field709[this.field710++] = (byte) arg1;
        this.field709[this.field710++] = (byte) (arg1 >> 8);
        if (arg0 == 26965) {
            this.field709[this.field710++] = (byte) (arg1 >> 16);
            this.field709[this.field710++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JZ)V")
    public void method223(long arg0, boolean arg1) {
        this.field709[this.field710++] = (byte) (arg0 >> 56);
        this.field709[this.field710++] = (byte) (arg0 >> 48);
        this.field709[this.field710++] = (byte) (arg0 >> 40);
        this.field709[this.field710++] = (byte) (arg0 >> 32);
        this.field709[this.field710++] = (byte) (arg0 >> 24);
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        if (arg1) {
            this.field709[this.field710++] = (byte) (arg0 >> 8);
            this.field709[this.field710++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method224(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field709, this.field710);
        this.field710 += arg0.length();
        this.field709[this.field710++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIZ)V")
    public void method225(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field704 = 371;
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            this.field709[this.field710++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(II)V")
    public void method226(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field709[this.field710 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method227() {
        return this.field709[this.field710++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method228() {
        return this.field709[this.field710++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method229() {
        this.field710 += 2;
        return ((this.field709[this.field710 - 2] & 0xFF) << 8) + (this.field709[this.field710 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method230() {
        this.field710 += 2;
        int var1 = ((this.field709[this.field710 - 2] & 0xFF) << 8) + (this.field709[this.field710 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method231() {
        this.field710 += 3;
        return (this.field709[this.field710 - 1] & 0xFF) + ((this.field709[this.field710 - 3] & 0xFF) << 16) + ((this.field709[this.field710 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method232() {
        this.field710 += 4;
        return (this.field709[this.field710 - 1] & 0xFF) + ((this.field709[this.field710 - 2] & 0xFF) << 8) + ((this.field709[this.field710 - 4] & 0xFF) << 24) + ((this.field709[this.field710 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)J")
    public long method233(boolean arg0) {
        if (!arg0) {
            this.field698 = 183;
        }
        long var2 = (long) this.method232() & 0xFFFFFFFFL;
        long var4 = (long) this.method232() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method234() {
        int var1 = this.field710;
        while (this.field709[this.field710++] != 10) {
        }
        return new String(this.field709, var1, this.field710 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)[B")
    public byte[] method235(int arg0) {
        if (arg0 != 44692) {
            field708 = 448;
        }
        int var2 = this.field710;
        while (this.field709[this.field710++] != 10) {
        }
        byte[] var3 = new byte[this.field710 - var2 - 1];
        for (int var4 = var2; var4 < this.field710 - 1; var4++) {
            var3[var4 - var2] = this.field709[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B[BII)V")
    public void method236(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (this.field699 != arg0) {
            this.field705 = -447;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg1[var5] = this.field709[this.field710++];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)V")
    public void method237(byte arg0) {
        if (arg0 != -51) {
            this.field707 = !this.field707;
        }
        this.field711 = this.field710 * 8;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IZ)I")
    public int method238(int arg0, boolean arg1) {
        if (arg1) {
            this.field707 = !this.field707;
        }
        int var3 = this.field711 >> 3;
        int var4 = 8 - (this.field711 & 0x7);
        int var5 = 0;
        this.field711 += arg0;
        while (arg0 > var4) {
            var5 += (this.field709[var3++] & field713[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field709[var3] & field713[var4]) + var5;
        } else {
            var6 = (this.field709[var3] >> var4 - arg0 & field713[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(B)V")
    public void method239(byte arg0) {
        this.field710 = (this.field711 + 7) / 8;
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method240() {
        int var1 = this.field709[this.field710] & 0xFF;
        return var1 < 128 ? this.method227() - 64 : this.method229() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method241() {
        int var1 = this.field709[this.field710] & 0xFF;
        return var1 < 128 ? this.method227() : this.method229() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method242(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field710;
        this.field710 = 0;
        byte[] var5 = new byte[var4];
        this.method236((byte) 95, var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field710 = 0;
        this.method217(var8.length);
        this.method225(var8, var8.length, 0, true);
        if (arg2 < 0 || arg2 > 0) {
            ;
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
            field712[var0] = var1;
        }
        field713 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field718 = new LinkList(-199);
        field719 = new LinkList(-199);
        field720 = new LinkList(-199);
        field721 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
