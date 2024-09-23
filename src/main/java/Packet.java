import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "i", descriptor = "Z")
    private boolean field697 = true;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field698 = 9;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field699 = -442;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field700 = -41441;

    @OriginalMember(owner = "lb", name = "m", descriptor = "Z")
    private boolean field701 = true;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field702 = 368;

    @OriginalMember(owner = "lb", name = "o", descriptor = "Z")
    private boolean field703 = true;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field705 = false;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "lb", name = "s", descriptor = "I")
    private int field707 = -186;

    @OriginalMember(owner = "lb", name = "F", descriptor = "[C")
    private char[] field720 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "lb", name = "t", descriptor = "[B")
    public byte[] field708;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static int[] field711 = new int[256];

    @OriginalMember(owner = "lb", name = "x", descriptor = "[I")
    private static final int[] field712;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field717;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field718;

    @OriginalMember(owner = "lb", name = "E", descriptor = "Lob;")
    private static LinkList field719;

    @OriginalMember(owner = "lb", name = "v", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field715;

    @OriginalMember(owner = "lb", name = "B", descriptor = "I")
    private static int field716;

    @OriginalMember(owner = "lb", name = "G", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "lb", name = "y", descriptor = "Lwb;")
    public Isaac field713;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method212(int arg0, int arg1) {
        LinkList var2 = field718;
        synchronized (field718) {
            Packet var3 = null;
            if (arg1 == 0 && field714 > 0) {
                field714--;
                var3 = (Packet) field717.method242();
            } else if (arg1 == 1 && field715 > 0) {
                field715--;
                var3 = (Packet) field718.method242();
            } else if (arg1 == 2 && field716 > 0) {
                field716--;
                var3 = (Packet) field719.method242();
            }
            if (var3 != null) {
                var3.field709 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet((byte) 3);
        if (arg0 != -7939) {
            throw new NullPointerException();
        }
        var5.field709 = 0;
        if (arg1 == 0) {
            var5.field708 = new byte[100];
        } else if (arg1 == 1) {
            var5.field708 = new byte[5000];
        } else {
            var5.field708 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BB)V")
    public Packet(byte[] arg0, byte arg1) {
        this.field708 = arg0;
        this.field709 = 0;
        if (arg1 != 1) {
            this.field707 = 309;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BI)V")
    public void method213(byte arg0, int arg1) {
        this.field708[this.field709++] = (byte) (arg1 + this.field713.method290());
        if (arg0 == 117) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method214(int arg0) {
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method215(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZI)V")
    public void method216(boolean arg0, int arg1) {
        this.field708[this.field709++] = (byte) arg1;
        this.field708[this.field709++] = (byte) (arg1 >> 8);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method217(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 24);
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(ZI)V")
    public void method219(boolean arg0, int arg1) {
        this.field708[this.field709++] = (byte) arg1;
        this.field708[this.field709++] = (byte) (arg1 >> 8);
        this.field708[this.field709++] = (byte) (arg1 >> 16);
        if (arg0) {
            this.field708[this.field709++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JI)V")
    public void method220(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field702 = 452;
        }
        this.field708[this.field709++] = (byte) (arg0 >> 56);
        this.field708[this.field709++] = (byte) (arg0 >> 48);
        this.field708[this.field709++] = (byte) (arg0 >> 40);
        this.field708[this.field709++] = (byte) (arg0 >> 32);
        this.field708[this.field709++] = (byte) (arg0 >> 24);
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method221(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field708, this.field709);
        this.field709 += arg0.length();
        this.field708[this.field709++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BZII)V")
    public void method222(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field705 = !this.field705;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            this.field708[this.field709++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method223(int arg0, int arg1) {
        if (arg1 == 0) {
            this.field708[this.field709 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method224() {
        return this.field708[this.field709++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method225() {
        return this.field708[this.field709++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method226() {
        this.field709 += 2;
        return ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method227() {
        this.field709 += 2;
        int var1 = ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method228() {
        this.field709 += 3;
        return (this.field708[this.field709 - 1] & 0xFF) + ((this.field708[this.field709 - 3] & 0xFF) << 16) + ((this.field708[this.field709 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method229() {
        this.field709 += 4;
        return (this.field708[this.field709 - 1] & 0xFF) + ((this.field708[this.field709 - 2] & 0xFF) << 8) + ((this.field708[this.field709 - 4] & 0xFF) << 24) + ((this.field708[this.field709 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)J")
    public long method230(int arg0) {
        long var2 = (long) this.method229() & 0xFFFFFFFFL;
        long var4 = (long) this.method229() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method231() {
        int var1 = this.field709;
        while (this.field708[this.field709++] != 10) {
        }
        return new String(this.field708, var1, this.field709 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)[B")
    public byte[] method232(int arg0) {
        int var2 = this.field709;
        while (this.field708[this.field709++] != 10) {
        }
        byte[] var3 = new byte[this.field709 - var2 - 1];
        if (arg0 != -32952) {
            this.field698 = 127;
        }
        for (int var4 = var2; var4 < this.field709 - 1; var4++) {
            var3[var4 - var2] = this.field708[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BII)V")
    public void method233(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
            arg1[var6] = this.field708[this.field709++];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)V")
    public void method234(byte arg0) {
        if (arg0 == 4) {
            this.field710 = this.field709 * 8;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IB)I")
    public int method235(int arg0, byte arg1) {
        int var3 = this.field710 >> 3;
        int var4 = 8 - (this.field710 & 0x7);
        int var5 = 0;
        this.field710 += arg0;
        if (arg1 != -96) {
            this.field707 = 0;
        }
        while (arg0 > var4) {
            var5 += (this.field708[var3++] & field712[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field708[var3] & field712[var4]) + var5;
        } else {
            var6 = (this.field708[var3] >> var4 - arg0 & field712[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "(I)V")
    public void method236(int arg0) {
        this.field709 = (this.field710 + 7) / 8;
        int var2 = 88 / arg0;
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method237() {
        int var1 = this.field708[this.field709] & 0xFF;
        return var1 < 128 ? this.method224() - 64 : this.method226() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method238() {
        int var1 = this.field708[this.field709] & 0xFF;
        return var1 < 128 ? this.method224() : this.method226() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method239(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field709;
        this.field709 = 0;
        byte[] var5 = new byte[var4];
        this.method233(var4, var5, 0, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field709 = 0;
        this.method214(var8.length);
        if (arg2 < 4 || arg2 > 4) {
            this.field698 = 380;
        }
        this.method222(var8, false, 0, var8.length);
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
            field711[var0] = var1;
        }
        field712 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field717 = new LinkList(-822);
        field718 = new LinkList(-822);
        field719 = new LinkList(-822);
    }
}
