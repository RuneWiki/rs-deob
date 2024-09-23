import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field695 = 6;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field696 = 986;

    @OriginalMember(owner = "lb", name = "m", descriptor = "Z")
    private boolean field697 = false;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field698 = 2;

    @OriginalMember(owner = "lb", name = "o", descriptor = "B")
    private byte field699 = 17;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field700 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "B")
    private byte field701 = -57;

    @OriginalMember(owner = "lb", name = "r", descriptor = "I")
    private int field702 = -241;

    @OriginalMember(owner = "lb", name = "s", descriptor = "Z")
    private boolean field703 = true;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    private int field704 = -790;

    @OriginalMember(owner = "lb", name = "u", descriptor = "Z")
    private boolean field705 = false;

    @OriginalMember(owner = "lb", name = "v", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "lb", name = "w", descriptor = "[B")
    public byte[] field707;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "lb", name = "z", descriptor = "[I")
    private static int[] field710 = new int[256];

    @OriginalMember(owner = "lb", name = "A", descriptor = "[I")
    private static final int[] field711;

    @OriginalMember(owner = "lb", name = "F", descriptor = "Lob;")
    private static LinkList field716;

    @OriginalMember(owner = "lb", name = "G", descriptor = "Lob;")
    private static LinkList field717;

    @OriginalMember(owner = "lb", name = "H", descriptor = "Lob;")
    private static LinkList field718;

    @OriginalMember(owner = "lb", name = "I", descriptor = "[C")
    private static char[] field719;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "lb", name = "C", descriptor = "I")
    private static int field713;

    @OriginalMember(owner = "lb", name = "D", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "lb", name = "E", descriptor = "I")
    private static int field715;

    @OriginalMember(owner = "lb", name = "J", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lwb;")
    public Isaac field712;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method213(int arg0, int arg1) {
        LinkList var2 = field717;
        synchronized (field717) {
            Packet var3 = null;
            if (arg1 == 0 && field713 > 0) {
                field713--;
                var3 = (Packet) field716.method243();
            } else if (arg1 == 1 && field714 > 0) {
                field714--;
                var3 = (Packet) field717.method243();
            } else if (arg1 == 2 && field715 > 0) {
                field715--;
                var3 = (Packet) field718.method243();
            }
            if (var3 != null) {
                var3.field708 = 0;
                return var3;
            }
        }
        if (arg0 < 1 || arg0 > 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Packet var6 = new Packet(-149);
        var6.field708 = 0;
        if (arg1 == 0) {
            var6.field707 = new byte[100];
        } else if (arg1 == 1) {
            var6.field707 = new byte[5000];
        } else {
            var6.field707 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        while (arg0 >= 0) {
            this.field706 = !this.field706;
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field707 = arg0;
        this.field708 = 0;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method214(int arg0, int arg1) {
        this.field707[this.field708++] = (byte) (arg0 + this.field712.method291());
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method215(int arg0) {
        this.field707[this.field708++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method216(int arg0) {
        this.field707[this.field708++] = (byte) (arg0 >> 8);
        this.field707[this.field708++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method217(int arg0, int arg1) {
        this.field707[this.field708++] = (byte) arg0;
        if (arg1 != 0) {
            this.field705 = !this.field705;
        }
        this.field707[this.field708++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field707[this.field708++] = (byte) (arg0 >> 16);
        this.field707[this.field708++] = (byte) (arg0 >> 8);
        this.field707[this.field708++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field707[this.field708++] = (byte) (arg0 >> 24);
        this.field707[this.field708++] = (byte) (arg0 >> 16);
        this.field707[this.field708++] = (byte) (arg0 >> 8);
        this.field707[this.field708++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(II)V")
    public void method220(int arg0, int arg1) {
        this.field707[this.field708++] = (byte) arg1;
        this.field707[this.field708++] = (byte) (arg1 >> 8);
        this.field707[this.field708++] = (byte) (arg1 >> 16);
        if (arg0 == 4) {
            this.field707[this.field708++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IJ)V")
    public void method221(int arg0, long arg1) {
        this.field707[this.field708++] = (byte) (arg1 >> 56);
        this.field707[this.field708++] = (byte) (arg1 >> 48);
        this.field707[this.field708++] = (byte) (arg1 >> 40);
        this.field707[this.field708++] = (byte) (arg1 >> 32);
        if (arg0 != 9) {
            this.field704 = 104;
        }
        this.field707[this.field708++] = (byte) (arg1 >> 24);
        this.field707[this.field708++] = (byte) (arg1 >> 16);
        this.field707[this.field708++] = (byte) (arg1 >> 8);
        this.field707[this.field708++] = (byte) arg1;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method222(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field707, this.field708);
        this.field708 += arg0.length();
        this.field707[this.field708++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIII)V")
    public void method223(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            this.field694 = 431;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            this.field707[this.field708++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ)V")
    public void method224(int arg0, boolean arg1) {
        if (!arg1) {
            this.field707[this.field708 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method225() {
        return this.field707[this.field708++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method226() {
        return this.field707[this.field708++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method227() {
        this.field708 += 2;
        return ((this.field707[this.field708 - 2] & 0xFF) << 8) + (this.field707[this.field708 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method228() {
        this.field708 += 2;
        int var1 = ((this.field707[this.field708 - 2] & 0xFF) << 8) + (this.field707[this.field708 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method229() {
        this.field708 += 3;
        return (this.field707[this.field708 - 1] & 0xFF) + ((this.field707[this.field708 - 3] & 0xFF) << 16) + ((this.field707[this.field708 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method230() {
        this.field708 += 4;
        return (this.field707[this.field708 - 1] & 0xFF) + ((this.field707[this.field708 - 2] & 0xFF) << 8) + ((this.field707[this.field708 - 4] & 0xFF) << 24) + ((this.field707[this.field708 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)J")
    public long method231(boolean arg0) {
        long var2 = (long) this.method230() & 0xFFFFFFFFL;
        long var4 = (long) this.method230() & 0xFFFFFFFFL;
        if (arg0) {
            this.field703 = !this.field703;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method232() {
        int var1 = this.field708;
        while (this.field707[this.field708++] != 10) {
        }
        return new String(this.field707, var1, this.field708 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)[B")
    public byte[] method233(int arg0) {
        int var2 = this.field708;
        if (arg0 <= 0) {
            this.field694 = 73;
        }
        while (this.field707[this.field708++] != 10) {
        }
        byte[] var3 = new byte[this.field708 - var2 - 1];
        for (int var4 = var2; var4 < this.field708 - 1; var4++) {
            var3[var4 - var2] = this.field707[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(III[B)V")
    public void method234(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 0) {
            this.field705 = !this.field705;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field707[this.field708++];
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(Z)V")
    public void method235(boolean arg0) {
        if (!arg0) {
            this.field709 = this.field708 * 8;
        }
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(II)I")
    public int method236(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field704 = -472;
        }
        int var3 = this.field709 >> 3;
        int var4 = 8 - (this.field709 & 0x7);
        int var5 = 0;
        this.field709 += arg1;
        while (arg1 > var4) {
            var5 += (this.field707[var3++] & field711[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field707[var3] & field711[var4]) + var5;
        } else {
            var6 = (this.field707[var3] >> var4 - arg1 & field711[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)V")
    public void method237(int arg0) {
        if (arg0 < 0) {
            this.field708 = (this.field709 + 7) / 8;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method238() {
        int var1 = this.field707[this.field708] & 0xFF;
        return var1 < 128 ? this.method225() - 64 : this.method227() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method239() {
        int var1 = this.field707[this.field708] & 0xFF;
        return var1 < 128 ? this.method225() : this.method227() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method240(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field708;
        if (arg2 != 0) {
            this.field697 = !this.field697;
        }
        this.field708 = 0;
        byte[] var5 = new byte[var4];
        this.method234(0, 0, var4, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field708 = 0;
        this.method215(var8.length);
        this.method223(var8, 699, 0, var8.length);
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
            field710[var0] = var1;
        }
        field711 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field716 = new LinkList(false);
        field717 = new LinkList(false);
        field718 = new LinkList(false);
        field719 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
