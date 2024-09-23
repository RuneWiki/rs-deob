import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "i", descriptor = "B")
    private byte field702 = 3;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field703 = 227;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field704 = 9;

    @OriginalMember(owner = "lb", name = "l", descriptor = "Z")
    private boolean field705 = true;

    @OriginalMember(owner = "lb", name = "m", descriptor = "I")
    private int field706 = 981;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field708 = -15367;

    @OriginalMember(owner = "lb", name = "p", descriptor = "I")
    private int field709 = 1;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field710 = false;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "lb", name = "s", descriptor = "[B")
    public byte[] field712;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "lb", name = "v", descriptor = "[I")
    private static int[] field715 = new int[256];

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static final int[] field716;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field721;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field722;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field723;

    @OriginalMember(owner = "lb", name = "E", descriptor = "[C")
    private static char[] field724;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field718;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field719;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field720;

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "lb", name = "x", descriptor = "Lwb;")
    public Isaac field717;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method217(int arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        LinkList var2 = field722;
        synchronized (field722) {
            Packet var3 = null;
            if (arg0 == 0 && field718 > 0) {
                field718--;
                var3 = (Packet) field721.method247();
            } else if (arg0 == 1 && field719 > 0) {
                field719--;
                var3 = (Packet) field722.method247();
            } else if (arg0 == 2 && field720 > 0) {
                field720--;
                var3 = (Packet) field723.method247();
            }
            if (var3 != null) {
                var3.field713 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(1);
        var5.field713 = 0;
        if (arg0 == 0) {
            var5.field712 = new byte[100];
        } else if (arg0 == 1) {
            var5.field712 = new byte[5000];
        } else {
            var5.field712 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BB)V")
    public Packet(byte[] arg0, byte arg1) {
        this.field712 = arg0;
        if (arg1 != -93) {
            this.field707 = 350;
        }
        this.field713 = 0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method218(int arg0, int arg1) {
        this.field712[this.field713++] = (byte) (arg1 + this.field717.method295());
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method221(int arg0, int arg1) {
        this.field712[this.field713++] = (byte) arg0;
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        if (arg1 < 9 || arg1 > 9) {
            this.field710 = !this.field710;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 24);
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(II)V")
    public void method224(int arg0, int arg1) {
        if (arg0 == 0) {
            this.field712[this.field713++] = (byte) arg1;
            this.field712[this.field713++] = (byte) (arg1 >> 8);
            this.field712[this.field713++] = (byte) (arg1 >> 16);
            this.field712[this.field713++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JB)V")
    public void method225(long arg0, byte arg1) {
        this.field712[this.field713++] = (byte) (arg0 >> 56);
        if (this.field702 != arg1) {
            return;
        }
        boolean var4 = false;
        this.field712[this.field713++] = (byte) (arg0 >> 48);
        this.field712[this.field713++] = (byte) (arg0 >> 40);
        this.field712[this.field713++] = (byte) (arg0 >> 32);
        this.field712[this.field713++] = (byte) (arg0 >> 24);
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field712, this.field713);
        this.field713 += arg0.length();
        this.field712[this.field713++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZI[BI)V")
    public void method227(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0) {
            this.field710 = !this.field710;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            this.field712[this.field713++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ)V")
    public void method228(int arg0, boolean arg1) {
        if (arg1) {
            this.field712[this.field713 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field712[this.field713++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field712[this.field713++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field713 += 2;
        return ((this.field712[this.field713 - 2] & 0xFF) << 8) + (this.field712[this.field713 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field713 += 2;
        int var1 = ((this.field712[this.field713 - 2] & 0xFF) << 8) + (this.field712[this.field713 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field713 += 3;
        return (this.field712[this.field713 - 1] & 0xFF) + ((this.field712[this.field713 - 3] & 0xFF) << 16) + ((this.field712[this.field713 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field713 += 4;
        return (this.field712[this.field713 - 1] & 0xFF) + ((this.field712[this.field713 - 2] & 0xFF) << 8) + ((this.field712[this.field713 - 4] & 0xFF) << 24) + ((this.field712[this.field713 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)J")
    public long method235(byte arg0) {
        long var2 = (long) this.method234() & 0xFFFFFFFFL;
        long var4 = (long) this.method234() & 0xFFFFFFFFL;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field713;
        while (this.field712[this.field713++] != 10) {
        }
        return new String(this.field712, var1, this.field713 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(B)[B")
    public byte[] method237(byte arg0) {
        if (arg0 != -14) {
            throw new NullPointerException();
        }
        int var2 = this.field713;
        while (this.field712[this.field713++] != 10) {
        }
        byte[] var3 = new byte[this.field713 - var2 - 1];
        for (int var4 = var2; var4 < this.field713 - 1; var4++) {
            var3[var4 - var2] = this.field712[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BII)V")
    public void method238(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.field710 = !this.field710;
        }
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            arg1[var5] = this.field712[this.field713++];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)V")
    public void method239(boolean arg0) {
        if (!arg0) {
            this.field707 = -396;
        }
        this.field714 = this.field713 * 8;
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(II)I")
    public int method240(int arg0, int arg1) {
        if (arg0 != 0) {
            return 3;
        }
        int var3 = this.field714 >> 3;
        int var4 = 8 - (this.field714 & 0x7);
        int var5 = 0;
        this.field714 += arg1;
        while (arg1 > var4) {
            var5 += (this.field712[var3++] & field716[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field712[var3] & field716[var4]) + var5;
        } else {
            var6 = (this.field712[var3] >> var4 - arg1 & field716[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 <= 0) {
            this.field703 = -123;
        }
        this.field713 = (this.field714 + 7) / 8;
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field712[this.field713] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field712[this.field713] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method244(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field713;
        if (arg2 != 0) {
            return;
        }
        this.field713 = 0;
        byte[] var5 = new byte[var4];
        this.method238(0, var5, var4, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field713 = 0;
        this.method219(var8.length);
        this.method227(false, 0, var8, var8.length);
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
            field715[var0] = var1;
        }
        field716 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field721 = new LinkList(-16188);
        field722 = new LinkList(-16188);
        field723 = new LinkList(-16188);
        field724 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
