import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "i", descriptor = "Z")
    private boolean field708 = false;

    @OriginalMember(owner = "mb", name = "j", descriptor = "Z")
    private boolean field709 = false;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    private int field710 = 4192;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    private int field711 = -44203;

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    private boolean field712 = false;

    @OriginalMember(owner = "mb", name = "z", descriptor = "[C")
    private char[] field725 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mb", name = "n", descriptor = "[B")
    public byte[] field713;

    @OriginalMember(owner = "mb", name = "o", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "mb", name = "q", descriptor = "[I")
    private static int[] field716 = new int[256];

    @OriginalMember(owner = "mb", name = "r", descriptor = "[I")
    private static final int[] field717;

    @OriginalMember(owner = "mb", name = "w", descriptor = "Lpb;")
    private static LinkList field722;

    @OriginalMember(owner = "mb", name = "x", descriptor = "Lpb;")
    private static LinkList field723;

    @OriginalMember(owner = "mb", name = "y", descriptor = "Lpb;")
    private static LinkList field724;

    @OriginalMember(owner = "mb", name = "p", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "mb", name = "t", descriptor = "I")
    private static int field719;

    @OriginalMember(owner = "mb", name = "u", descriptor = "I")
    private static int field720;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    private static int field721;

    @OriginalMember(owner = "mb", name = "s", descriptor = "Lxb;")
    public Isaac field718;

    @OriginalMember(owner = "mb", name = "A", descriptor = "Z")
    public static boolean field726;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)Lmb;")
    public static Packet method216(int arg0, int arg1) {
        int var2 = 48 / arg0;
        LinkList var3 = field723;
        synchronized (field723) {
            Packet var4 = null;
            if (arg1 == 0 && field719 > 0) {
                field719--;
                var4 = (Packet) field722.method246();
            } else if (arg1 == 1 && field720 > 0) {
                field720--;
                var4 = (Packet) field723.method246();
            } else if (arg1 == 2 && field721 > 0) {
                field721--;
                var4 = (Packet) field724.method246();
            }
            if (var4 != null) {
                var4.field714 = 0;
                return var4;
            }
        }
        Packet var6 = new Packet(374);
        var6.field714 = 0;
        if (arg1 == 0) {
            var6.field713 = new byte[100];
        } else if (arg1 == 1) {
            var6.field713 = new byte[5000];
        } else {
            var6.field713 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "([BZ)V")
    public Packet(byte[] arg0, boolean arg1) {
        this.field713 = arg0;
        this.field714 = 0;
        if (!arg1) {
            this.field711 = -83;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IB)V")
    public void method217(int arg0, byte arg1) {
        this.field713[this.field714++] = (byte) (arg0 + this.field718.method294());
        if (arg1 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field713[this.field714++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field713[this.field714++] = (byte) (arg0 >> 8);
        this.field713[this.field714++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method220(int arg0, int arg1) {
        this.field713[this.field714++] = (byte) arg1;
        while (arg0 >= 0) {
            this.field712 = !this.field712;
        }
        this.field713[this.field714++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method221(int arg0) {
        this.field713[this.field714++] = (byte) (arg0 >> 16);
        this.field713[this.field714++] = (byte) (arg0 >> 8);
        this.field713[this.field714++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field713[this.field714++] = (byte) (arg0 >> 24);
        this.field713[this.field714++] = (byte) (arg0 >> 16);
        this.field713[this.field714++] = (byte) (arg0 >> 8);
        this.field713[this.field714++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(IB)V")
    public void method223(int arg0, byte arg1) {
        this.field713[this.field714++] = (byte) arg0;
        this.field713[this.field714++] = (byte) (arg0 >> 8);
        this.field713[this.field714++] = (byte) (arg0 >> 16);
        this.field713[this.field714++] = (byte) (arg0 >> 24);
        if (arg1 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(JI)V")
    public void method224(long arg0, int arg1) {
        this.field713[this.field714++] = (byte) (arg0 >> 56);
        this.field713[this.field714++] = (byte) (arg0 >> 48);
        this.field713[this.field714++] = (byte) (arg0 >> 40);
        this.field713[this.field714++] = (byte) (arg0 >> 32);
        this.field713[this.field714++] = (byte) (arg0 >> 24);
        if (arg1 != -25114) {
            return;
        }
        this.field713[this.field714++] = (byte) (arg0 >> 16);
        this.field713[this.field714++] = (byte) (arg0 >> 8);
        this.field713[this.field714++] = (byte) arg0;
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method225(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field713, this.field714);
        this.field714 += arg0.length();
        this.field713[this.field714++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II[BI)V")
    public void method226(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 3) {
            this.field711 = -215;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            this.field713[this.field714++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(BI)V")
    public void method227(byte arg0, int arg1) {
        if (arg0 != 39) {
            this.field711 = -273;
        }
        this.field713[this.field714 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method228() {
        return this.field713[this.field714++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method229() {
        return this.field713[this.field714++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method230() {
        this.field714 += 2;
        return ((this.field713[this.field714 - 2] & 0xFF) << 8) + (this.field713[this.field714 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method231() {
        this.field714 += 2;
        int var1 = ((this.field713[this.field714 - 2] & 0xFF) << 8) + (this.field713[this.field714 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method232() {
        this.field714 += 3;
        return (this.field713[this.field714 - 1] & 0xFF) + ((this.field713[this.field714 - 3] & 0xFF) << 16) + ((this.field713[this.field714 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method233() {
        this.field714 += 4;
        return (this.field713[this.field714 - 1] & 0xFF) + ((this.field713[this.field714 - 2] & 0xFF) << 8) + ((this.field713[this.field714 - 4] & 0xFF) << 24) + ((this.field713[this.field714 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)J")
    public long method234(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method233() & 0xFFFFFFFFL;
        long var4 = (long) this.method233() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method235() {
        int var1 = this.field714;
        while (this.field713[this.field714++] != 10) {
        }
        return new String(this.field713, var1, this.field714 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)[B")
    public byte[] method236(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        }
        int var2 = this.field714;
        while (this.field713[this.field714++] != 10) {
        }
        byte[] var3 = new byte[this.field714 - var2 - 1];
        for (int var4 = var2; var4 < this.field714 - 1; var4++) {
            var3[var4 - var2] = this.field713[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IZI[B)V")
    public void method237(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (!arg1) {
            this.field712 = !this.field712;
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field713[this.field714++];
        }
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)V")
    public void method238(int arg0) {
        this.field715 = this.field714 * 8;
        if (arg0 >= 0) {
            this.field712 = !this.field712;
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(II)I")
    public int method239(int arg0, int arg1) {
        int var3 = this.field715 >> 3;
        int var4 = 8 - (this.field715 & 0x7);
        int var5 = 0;
        if (arg1 >= 0) {
            return this.field710;
        }
        this.field715 += arg0;
        while (arg0 > var4) {
            var5 += (this.field713[var3++] & field717[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field713[var3] & field717[var4]) + var5;
        } else {
            var6 = (this.field713[var3] >> var4 - arg0 & field717[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Z)V")
    public void method240(boolean arg0) {
        if (!arg0) {
            this.field714 = (this.field715 + 7) / 8;
        }
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method241() {
        int var1 = this.field713[this.field714] & 0xFF;
        return var1 < 128 ? this.method228() - 64 : this.method230() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method242() {
        int var1 = this.field713[this.field714] & 0xFF;
        return var1 < 128 ? this.method228() : this.method230() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method243(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field714;
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field714 = 0;
        byte[] var6 = new byte[var4];
        this.method237(var4, true, 0, var6);
        BigInteger var7 = new BigInteger(var6);
        BigInteger var8 = var7.modPow(arg2, arg0);
        byte[] var9 = var8.toByteArray();
        this.field714 = 0;
        this.method218(var9.length);
        this.method226(3, 0, var9, var9.length);
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
            field716[var0] = var1;
        }
        field717 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field722 = new LinkList((byte) 9);
        field723 = new LinkList((byte) 9);
        field724 = new LinkList((byte) 9);
    }
}
