import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field693 = 1000;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field694 = -327;

    @OriginalMember(owner = "lb", name = "l", descriptor = "B")
    private byte field695 = -49;

    @OriginalMember(owner = "lb", name = "m", descriptor = "B")
    private byte field696 = -91;

    @OriginalMember(owner = "lb", name = "n", descriptor = "B")
    private byte field697 = -91;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field698 = 2;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field699 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "I")
    private int field700 = 18931;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Z")
    private boolean field701 = false;

    @OriginalMember(owner = "lb", name = "s", descriptor = "[B")
    public byte[] field702;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "lb", name = "v", descriptor = "[I")
    private static int[] field705 = new int[256];

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static final int[] field706;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field711;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field712;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field713;

    @OriginalMember(owner = "lb", name = "E", descriptor = "[C")
    private static char[] field714;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field708;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field709;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field710;

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "lb", name = "x", descriptor = "Lwb;")
    public Isaac field707;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZI)Llb;")
    public static Packet method217(boolean arg0, int arg1) {
        LinkList var2 = field712;
        synchronized (field712) {
            Packet var3 = null;
            if (arg1 == 0 && field708 > 0) {
                field708--;
                var3 = (Packet) field711.method247();
            } else if (arg1 == 1 && field709 > 0) {
                field709--;
                var3 = (Packet) field712.method247();
            } else if (arg1 == 2 && field710 > 0) {
                field710--;
                var3 = (Packet) field713.method247();
            }
            if (var3 != null) {
                var3.field703 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet((byte) 1);
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        var5.field703 = 0;
        if (arg1 == 0) {
            var5.field702 = new byte[100];
        } else if (arg1 == 1) {
            var5.field702 = new byte[5000];
        } else {
            var5.field702 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field702 = arg1;
        if (arg0 <= 0) {
            this.field701 = !this.field701;
        }
        this.field703 = 0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BI)V")
    public void method218(byte arg0, int arg1) {
        this.field702[this.field703++] = (byte) (arg1 + this.field707.method295());
        if (arg0 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field702[this.field703++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        this.field702[this.field703++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)V")
    public void method221(int arg0, int arg1) {
        this.field702[this.field703++] = (byte) arg0;
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field702[this.field703++] = (byte) (arg0 >> 16);
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        this.field702[this.field703++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field702[this.field703++] = (byte) (arg0 >> 24);
        this.field702[this.field703++] = (byte) (arg0 >> 16);
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        this.field702[this.field703++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method224(int arg0, int arg1) {
        this.field702[this.field703++] = (byte) arg0;
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        this.field702[this.field703++] = (byte) (arg0 >> 16);
        if (arg1 < 9 || arg1 > 9) {
            this.field694 = 430;
        }
        this.field702[this.field703++] = (byte) (arg0 >> 24);
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JZ)V")
    public void method225(long arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.field702[this.field703++] = (byte) (arg0 >> 56);
        this.field702[this.field703++] = (byte) (arg0 >> 48);
        this.field702[this.field703++] = (byte) (arg0 >> 40);
        this.field702[this.field703++] = (byte) (arg0 >> 32);
        this.field702[this.field703++] = (byte) (arg0 >> 24);
        this.field702[this.field703++] = (byte) (arg0 >> 16);
        this.field702[this.field703++] = (byte) (arg0 >> 8);
        this.field702[this.field703++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field702, this.field703);
        this.field703 += arg0.length();
        this.field702[this.field703++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIBI)V")
    public void method227(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -49) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                this.field702[this.field703++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        if (arg0 == 9) {
            this.field702[this.field703 - arg1 - 1] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field702[this.field703++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field702[this.field703++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field703 += 2;
        return ((this.field702[this.field703 - 2] & 0xFF) << 8) + (this.field702[this.field703 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field703 += 2;
        int var1 = ((this.field702[this.field703 - 2] & 0xFF) << 8) + (this.field702[this.field703 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field703 += 3;
        return (this.field702[this.field703 - 1] & 0xFF) + ((this.field702[this.field703 - 3] & 0xFF) << 16) + ((this.field702[this.field703 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field703 += 4;
        return (this.field702[this.field703 - 1] & 0xFF) + ((this.field702[this.field703 - 2] & 0xFF) << 8) + ((this.field702[this.field703 - 4] & 0xFF) << 24) + ((this.field702[this.field703 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)J")
    public long method235(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method234() & 0xFFFFFFFFL;
        long var4 = (long) this.method234() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field703;
        while (this.field702[this.field703++] != 10) {
        }
        return new String(this.field702, var1, this.field703 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)[B")
    public byte[] method237(byte arg0) {
        if (arg0 != 31) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field703;
        while (this.field702[this.field703++] != 10) {
        }
        byte[] var4 = new byte[this.field703 - var3 - 1];
        for (int var5 = var3; var5 < this.field703 - 1; var5++) {
            var4[var5 - var3] = this.field702[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ[BI)V")
    public void method238(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                arg2[var5] = this.field702[this.field703++];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)V")
    public void method239(int arg0) {
        this.field704 = this.field703 * 8;
        if (arg0 == 496) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(II)I")
    public int method240(int arg0, int arg1) {
        int var3 = this.field704 >> 3;
        int var4 = 8 - (this.field704 & 0x7);
        int var5 = 0;
        if (arg0 >= 0) {
            return this.field700;
        }
        this.field704 += arg1;
        while (arg1 > var4) {
            var5 += (this.field702[var3++] & field706[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field702[var3] & field706[var4]) + var5;
        } else {
            var6 = (this.field702[var3] >> var4 - arg1 & field706[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 == -29885) {
            this.field703 = (this.field704 + 7) / 8;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field702[this.field703] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field702[this.field703] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method244(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field703;
        if (arg2) {
            this.field700 = -367;
        }
        this.field703 = 0;
        byte[] var5 = new byte[var4];
        this.method238(0, false, var5, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field703 = 0;
        this.method219(var8.length);
        this.method227(var8, 0, this.field695, var8.length);
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
            field705[var0] = var1;
        }
        field706 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field711 = new LinkList(18783);
        field712 = new LinkList(18783);
        field713 = new LinkList(18783);
        field714 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
