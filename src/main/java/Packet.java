import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "i", descriptor = "I")
    private int field701 = 26;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field702 = 257;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field703 = -5783;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field704 = -398;

    @OriginalMember(owner = "lb", name = "m", descriptor = "I")
    private int field705 = -473;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field706 = -720;

    @OriginalMember(owner = "lb", name = "o", descriptor = "Z")
    private boolean field707 = true;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field708 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field709 = false;

    @OriginalMember(owner = "lb", name = "r", descriptor = "[B")
    public byte[] field710;

    @OriginalMember(owner = "lb", name = "s", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "lb", name = "u", descriptor = "[I")
    private static int[] field713 = new int[256];

    @OriginalMember(owner = "lb", name = "v", descriptor = "[I")
    private static final int[] field714;

    @OriginalMember(owner = "lb", name = "A", descriptor = "Lob;")
    private static LinkList field719;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field720;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field721;

    @OriginalMember(owner = "lb", name = "D", descriptor = "[C")
    private static char[] field722;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    private static int field716;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field717;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field718;

    @OriginalMember(owner = "lb", name = "E", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "lb", name = "w", descriptor = "Lwb;")
    public Isaac field715;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method217(int arg0, int arg1) {
        LinkList var2 = field720;
        synchronized (field720) {
            Packet var3 = null;
            if (arg0 == 0 && field716 > 0) {
                field716--;
                var3 = (Packet) field719.method247();
            } else if (arg0 == 1 && field717 > 0) {
                field717--;
                var3 = (Packet) field720.method247();
            } else if (arg0 == 2 && field718 > 0) {
                field718--;
                var3 = (Packet) field721.method247();
            }
            if (var3 != null) {
                var3.field711 = 0;
                return var3;
            }
        }
        if (arg1 != -14406) {
            throw new NullPointerException();
        }
        Packet var5 = new Packet(626);
        var5.field711 = 0;
        if (arg0 == 0) {
            var5.field710 = new byte[100];
        } else if (arg0 == 1) {
            var5.field710 = new byte[5000];
        } else {
            var5.field710 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field710 = arg0;
        if (arg1 <= 0) {
            this.field706 = -466;
        }
        this.field711 = 0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method218(int arg0, int arg1) {
        this.field710[this.field711++] = (byte) (arg1 + this.field715.method295());
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field710[this.field711++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field710[this.field711++] = (byte) (arg0 >> 8);
        this.field710[this.field711++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method221(int arg0, int arg1) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field710[this.field711++] = (byte) arg1;
        this.field710[this.field711++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field710[this.field711++] = (byte) (arg0 >> 16);
        this.field710[this.field711++] = (byte) (arg0 >> 8);
        this.field710[this.field711++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field710[this.field711++] = (byte) (arg0 >> 24);
        this.field710[this.field711++] = (byte) (arg0 >> 16);
        this.field710[this.field711++] = (byte) (arg0 >> 8);
        this.field710[this.field711++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(II)V")
    public void method224(int arg0, int arg1) {
        this.field710[this.field711++] = (byte) arg0;
        if (arg1 == -2704) {
            this.field710[this.field711++] = (byte) (arg0 >> 8);
            this.field710[this.field711++] = (byte) (arg0 >> 16);
            this.field710[this.field711++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JI)V")
    public void method225(long arg0, int arg1) {
        this.field710[this.field711++] = (byte) (arg0 >> 56);
        this.field710[this.field711++] = (byte) (arg0 >> 48);
        this.field710[this.field711++] = (byte) (arg0 >> 40);
        this.field710[this.field711++] = (byte) (arg0 >> 32);
        this.field710[this.field711++] = (byte) (arg0 >> 24);
        this.field710[this.field711++] = (byte) (arg0 >> 16);
        this.field710[this.field711++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            this.field710[this.field711++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field710, this.field711);
        this.field711 += arg0.length();
        this.field710[this.field711++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II[BZ)V")
    public void method227(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (!arg3) {
            this.field702 = -144;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            this.field710[this.field711++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        this.field710[this.field711 - arg1 - 1] = (byte) arg1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field710[this.field711++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field710[this.field711++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field711 += 2;
        return ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field711 += 2;
        int var1 = ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field711 += 3;
        return (this.field710[this.field711 - 1] & 0xFF) + ((this.field710[this.field711 - 3] & 0xFF) << 16) + ((this.field710[this.field711 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field711 += 4;
        return (this.field710[this.field711 - 1] & 0xFF) + ((this.field710[this.field711 - 2] & 0xFF) << 8) + ((this.field710[this.field711 - 4] & 0xFF) << 24) + ((this.field710[this.field711 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)J")
    public long method235(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method234() & 0xFFFFFFFFL;
        long var4 = (long) this.method234() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field711;
        while (this.field710[this.field711++] != 10) {
        }
        return new String(this.field710, var1, this.field711 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)[B")
    public byte[] method237(int arg0) {
        int var2 = this.field711;
        if (arg0 != 0) {
            this.field702 = 454;
        }
        while (this.field710[this.field711++] != 10) {
        }
        byte[] var3 = new byte[this.field711 - var2 - 1];
        for (int var4 = var2; var4 < this.field711 - 1; var4++) {
            var3[var4 - var2] = this.field710[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II[BZ)V")
    public void method238(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                arg2[var5] = this.field710[this.field711++];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)V")
    public void method239(boolean arg0) {
        if (arg0) {
            this.field707 = !this.field707;
        }
        this.field712 = this.field711 * 8;
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(II)I")
    public int method240(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field709 = !this.field709;
        }
        int var3 = this.field712 >> 3;
        int var4 = 8 - (this.field712 & 0x7);
        int var5 = 0;
        this.field712 += arg1;
        while (arg1 > var4) {
            var5 += (this.field710[var3++] & field714[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field710[var3] & field714[var4]) + var5;
        } else {
            var6 = (this.field710[var3] >> var4 - arg1 & field714[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "(I)V")
    public void method241(int arg0) {
        this.field711 = (this.field712 + 7) / 8;
        if (arg0 < 7 || arg0 > 7) {
            this.field704 = 495;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field710[this.field711] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field710[this.field711] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method244(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field711;
        this.field711 = 0;
        while (arg1 >= 0) {
            this.field707 = !this.field707;
        }
        byte[] var5 = new byte[var4];
        this.method238(0, var4, var5, false);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        byte[] var8 = var7.toByteArray();
        this.field711 = 0;
        this.method219(var8.length);
        this.method227(var8.length, 0, var8, true);
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
            field713[var0] = var1;
        }
        field714 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field719 = new LinkList(0);
        field720 = new LinkList(0);
        field721 = new LinkList(0);
        field722 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
