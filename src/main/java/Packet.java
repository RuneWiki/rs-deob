import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "h", descriptor = "B")
    private byte field701 = -126;

    @OriginalMember(owner = "mb", name = "i", descriptor = "Z")
    private boolean field702 = true;

    @OriginalMember(owner = "mb", name = "j", descriptor = "Z")
    private boolean field703 = false;

    @OriginalMember(owner = "mb", name = "k", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    private int field705 = 15991;

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    private int field707 = 37435;

    @OriginalMember(owner = "mb", name = "o", descriptor = "I")
    private int field708 = 1;

    @OriginalMember(owner = "mb", name = "B", descriptor = "[C")
    private char[] field721 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mb", name = "p", descriptor = "[B")
    public byte[] field709;

    @OriginalMember(owner = "mb", name = "q", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "mb", name = "s", descriptor = "[I")
    private static int[] field712 = new int[256];

    @OriginalMember(owner = "mb", name = "t", descriptor = "[I")
    private static final int[] field713;

    @OriginalMember(owner = "mb", name = "y", descriptor = "Lpb;")
    private static LinkList field718;

    @OriginalMember(owner = "mb", name = "z", descriptor = "Lpb;")
    private static LinkList field719;

    @OriginalMember(owner = "mb", name = "A", descriptor = "Lpb;")
    private static LinkList field720;

    @OriginalMember(owner = "mb", name = "r", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    private static int field715;

    @OriginalMember(owner = "mb", name = "w", descriptor = "I")
    private static int field716;

    @OriginalMember(owner = "mb", name = "x", descriptor = "I")
    private static int field717;

    @OriginalMember(owner = "mb", name = "C", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "mb", name = "u", descriptor = "Lxb;")
    public Isaac field714;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IZ)Lmb;")
    public static Packet method226(int arg0, boolean arg1) {
        LinkList var2 = field719;
        synchronized (field719) {
            Packet var3 = null;
            if (arg0 == 0 && field715 > 0) {
                field715--;
                var3 = (Packet) field718.method257();
            } else if (arg0 == 1 && field716 > 0) {
                field716--;
                var3 = (Packet) field719.method257();
            } else if (arg0 == 2 && field717 > 0) {
                field717--;
                var3 = (Packet) field720.method257();
            }
            if (var3 != null) {
                var3.field710 = 0;
                return var3;
            }
        }
        if (arg1) {
            throw new NullPointerException();
        }
        Packet var5 = new Packet(true);
        var5.field710 = 0;
        if (arg0 == 0) {
            var5.field709 = new byte[100];
        } else if (arg0 == 1) {
            var5.field709 = new byte[5000];
        } else {
            var5.field709 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(B)V")
    public void method227(byte arg0) {
        LinkList var2 = field719;
        synchronized (field719) {
            this.field710 = 0;
            if (this.field709.length == 100 && field715 < 1000) {
                field718.method255(this);
                field715++;
                return;
            }
            if (this.field709.length == 5000 && field716 < 250) {
                field719.method255(this);
                field716++;
                return;
            }
            if (this.field709.length == 30000 && field717 < 50) {
                field720.method255(this);
                field717++;
                return;
            }
        }
        if (arg0 != -12) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (!arg0) {
            this.field704 = !this.field704;
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field709 = arg0;
        int var3 = 17 / arg1;
        this.field710 = 0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(BI)V")
    public void method228(byte arg0, int arg1) {
        this.field709[this.field710++] = (byte) (arg1 + this.field714.method305());
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            this.field704 = !this.field704;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method230(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(BI)V")
    public void method231(byte arg0, int arg1) {
        this.field709[this.field710++] = (byte) arg1;
        this.field709[this.field710++] = (byte) (arg1 >> 8);
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method233(int arg0) {
        this.field709[this.field710++] = (byte) (arg0 >> 24);
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)V")
    public void method234(int arg0, int arg1) {
        this.field709[this.field710++] = (byte) arg0;
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 24);
        while (arg1 >= 0) {
            this.field706 = !this.field706;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(JI)V")
    public void method235(long arg0, int arg1) {
        this.field709[this.field710++] = (byte) (arg0 >> 56);
        this.field709[this.field710++] = (byte) (arg0 >> 48);
        this.field709[this.field710++] = (byte) (arg0 >> 40);
        this.field709[this.field710++] = (byte) (arg0 >> 32);
        this.field709[this.field710++] = (byte) (arg0 >> 24);
        if (arg1 != 0) {
            return;
        }
        this.field709[this.field710++] = (byte) (arg0 >> 16);
        this.field709[this.field710++] = (byte) (arg0 >> 8);
        this.field709[this.field710++] = (byte) arg0;
        if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method236(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field709, this.field710);
        this.field710 += arg0.length();
        this.field709[this.field710++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI[BI)V")
    public void method237(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0) {
            for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
                this.field709[this.field710++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method238(int arg0, int arg1) {
        this.field709[this.field710 - arg0 - 1] = (byte) arg0;
        if (arg1 == -18284) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method239() {
        return this.field709[this.field710++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method240() {
        return this.field709[this.field710++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method241() {
        this.field710 += 2;
        return ((this.field709[this.field710 - 2] & 0xFF) << 8) + (this.field709[this.field710 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method242() {
        this.field710 += 2;
        int var1 = ((this.field709[this.field710 - 2] & 0xFF) << 8) + (this.field709[this.field710 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method243() {
        this.field710 += 3;
        return (this.field709[this.field710 - 1] & 0xFF) + ((this.field709[this.field710 - 3] & 0xFF) << 16) + ((this.field709[this.field710 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method244() {
        this.field710 += 4;
        return (this.field709[this.field710 - 1] & 0xFF) + ((this.field709[this.field710 - 2] & 0xFF) << 8) + ((this.field709[this.field710 - 4] & 0xFF) << 24) + ((this.field709[this.field710 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(B)J")
    public long method245(byte arg0) {
        if (arg0 != -25) {
            this.field704 = !this.field704;
        }
        long var2 = (long) this.method244() & 0xFFFFFFFFL;
        long var4 = (long) this.method244() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method246() {
        int var1 = this.field710;
        while (this.field709[this.field710++] != 10) {
        }
        return new String(this.field709, var1, this.field710 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)[B")
    public byte[] method247(int arg0) {
        int var2 = this.field710;
        while (this.field709[this.field710++] != 10) {
        }
        byte[] var3 = new byte[this.field710 - var2 - 1];
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        for (int var4 = var2; var4 < this.field710 - 1; var4++) {
            var3[var4 - var2] = this.field709[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(III[B)V")
    public void method248(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 == 0) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                arg3[var5] = this.field709[this.field710++];
            }
        }
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)V")
    public void method249(int arg0) {
        this.field711 = this.field710 * 8;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(II)I")
    public int method250(int arg0, int arg1) {
        if (arg1 != 0) {
            return this.field708;
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

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)V")
    public void method251(int arg0) {
        this.field710 = (this.field711 + 7) / 8;
        if (arg0 != 30037) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method252() {
        int var1 = this.field709[this.field710] & 0xFF;
        return var1 < 128 ? this.method239() - 64 : this.method241() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method253() {
        int var1 = this.field709[this.field710] & 0xFF;
        return var1 < 128 ? this.method239() : this.method241() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method254(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field710;
        this.field710 = 0;
        byte[] var5 = new byte[var4];
        if (arg1 != -40736) {
            return;
        }
        this.method248(0, var4, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field710 = 0;
        this.method229(var8.length);
        this.method237(true, var8.length, var8, 0);
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
        field718 = new LinkList(-767);
        field719 = new LinkList(-767);
        field720 = new LinkList(-767);
    }
}
